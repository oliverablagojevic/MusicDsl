package org.xtext.example.mydsl.generator
import musicMetamodel.Composition
import musicMetamodel.Measure
import musicMetamodel.Staff
import musicMetamodel.ClefType
import musicMetamodel.RestType
class XmlGenerator {
	Composition composition;
	int minMeasureCount;
	new(Composition composition){
		this.composition = composition;
		this.minMeasureCount = minMeasureCount(composition);
	}
	def generateXml()'''
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE score-partwise PUBLIC "-//Recordare//DTD MusicXML 2.0 Partwise//EN" "http://www.musicxml.org/dtds/partwise.dtd">
<score-partwise version="2.0">
  <work>
    <work-title>«composition.name»</work-title>
  </work>
  <identification>
    <creator type="composer"/>
    <creator type="lyricist"/>
    <rights/>
    <encoding>
      <software>Noteflight version 0.4</software>
      <supports attribute="new-system" element="print" type="no" value="no"/>
      <supports attribute="new-page" element="print" type="no" value="no"/>
    </encoding>
  </identification>
  <defaults>
    <scaling>
      <millimeters>2.1166666679999997</millimeters>
      <tenths>10</tenths>
    </scaling>
    <page-layout>
      <page-height>1320</page-height>
      <page-width>1020</page-width>
      <page-margins type="both">
        <left-margin>59.583333333333336</left-margin>
        <right-margin>56.66666666666667</right-margin>
        <top-margin>96.66666666666667</top-margin>
        <bottom-margin>80</bottom-margin>
        </page-margins>
        </page-layout>
        <system-layout>
          <system-margins>
            <left-margin>59.583333333333336</left-margin>
            <right-margin>26.666666666666668</right-margin>
            </system-margins>
            <system-distance>92.5</system-distance>
            <top-system-distance>145.83333333333334</top-system-distance>
            </system-layout>
            <staff-layout>
              <staff-distance>55</staff-distance>
              </staff-layout>
            </defaults>
            <credit page="1">
              <credit-type>title</credit-type>
              <credit-words font-size="24" default-x="510" default-y="1210" justify="right" valign="top">«composition.name»</credit-words>
            </credit>
            <credit page="1">
              <credit-type>subtitle</credit-type>
              <credit-words font-size="12" default-x="918" default-y="1210" justify="right" valign="top">«composition.author»</credit-words>
            </credit>
            <part-list>
              <score-part id="P1">
                <part-name>«composition.instrument»</part-name>
                <part-abbreviation>Pno.</part-abbreviation>
                <score-instrument id="P1I1">
                  <instrument-name>«composition.instrument»</instrument-name>
                  <instrument-sound>keyboard.«composition.instrument.toLowerCase»</instrument-sound>
                  </score-instrument>
                  <midi-instrument id="P1I1">
                    <midi-channel>1</midi-channel>
                    <midi-program>1</midi-program>
                    </midi-instrument>
                    </score-part>
                    </part-list>
                    «generatePart()»
                  	'''
                  	private def int minMeasureCount(Composition composition){
                  		var min = Integer.MAX_VALUE;
                  		for(staff: composition.staff){
                  			var measureCount = staff.elements.filter(Measure).size();
                  			if( min > measureCount ){
                  				min = measureCount;
                  			}
                  		}
                  		return min;
                  	}
                  	private def generatePart()'''
                  <part id="P1">
                    	«FOR measureCounter: 0..minMeasureCount - 1»
                    <measure number="«measureCounter + 1»">
                      	«IF measureCounter == 0»
                      <attributes>
                        <key>
                          <fifths>«composition.staff.get(0).key.getFifths()»</fifths>
                          <mode>major</mode>
                        </key>
                        <time print-object="yes">
                          <beats>«composition.staff.get(0).time.getBeat()»</beats>
                          <beat-type>«composition.staff.get(0).time.getBeatType()»</beat-type>
                        </time>
                        <staves>2</staves>
                        <clef number="1">
                          <sign>G</sign>
                          <line>2</line>
                        </clef>
                        <key>
                          <fifths>«composition.staff.get(0).key.getFifths()»</fifths>
                          <mode>major</mode>
                        </key>
                        <clef number="2">
                          <sign>F</sign>
                          <line>4</line>
                        </clef>
                      </attributes>
                        <sound/>
                        <sound tempo="80"/>
                            	«ENDIF»
                            	«FOR staff:composition.staff»
                        «generateNotesForStaffMeasure(measureCounter, staff)»
                        «generateRestsForStaffMeasure(measureCounter, staff)»
                        «generateRepetitionsForStaffMeasure(measureCounter, staff)»
                            	«IF composition.staff.indexOf(staff) != composition.staff.size - 1»
                          <backup>
                           <duration>256</duration>
                          </backup>
                          <attributes/>
                            	«ENDIF»
                            	«ENDFOR»
                    </measure>
                          	«ENDFOR»
                          	«FOR staff: composition.staff»
                          	«IF staff.elements.filter(Measure).size() > minMeasureCount»
                          	«FOR measureCounter: minMeasureCount..staff.elements.filter(Measure).size() - 1»
                          <measure number="«measureCounter + 1»">
                         «generateNotesForStaffMeasure(measureCounter, staff)»
                         «generateRestsForStaffMeasure(measureCounter, staff)»
                         «generateRepetitionsForStaffMeasure(measureCounter, staff)»
                            	«ENDFOR»
                            	«ENDIF»
                            	«ENDFOR»
                  </part>
                  </score-partwise>
                        	'''
                  	private def generateNotesForStaffMeasure(int index, Staff staff)'''
                        	«FOR note:staff.elements.filter(Measure).get(index).note»
                          <note>
                            <pitch>
                              <step>«note.name»</step>
                              <octave>«note.octave»</octave>
                            </pitch>
                            <duration>«note.duration»</duration>
                            <voice>«note.voice»</voice>
                            <type>«note.type»</type>
                          	«IF note.dot == true»
                            <dot/>
                          	«ENDIF»
                          	«IF note.fermata == true»
                            <fermata/>
                          	«ENDIF»
                            <staff>«composition.staff.indexOf(staff) + 1»</staff>
                          	«IF note.notation.size !== 0»
                            <notations>
                            	«FOR n: note.notation»
                            	«IF n.slur !== null»
                              <tied type="«n.slur»"/>
                            	«ELSEIF n.ornament !== null»
                              <ornaments>«n.ornament»</ornaments>
                            	«ELSEIF n.articulation !== null»
                              <articulation>«n.articulation»</articulation>
                            	«ENDIF»
                            	«ENDFOR»
                            </notations>
                          	«ENDIF»
                          	«IF note.lyrics !== null»
                            <lyric number="1" color="#000000">
                              <syllabic>single</syllabic>
                              <text>«note.lyrics»</text>
                            </lyric>
                          	«ENDIF»
                          </note>
                          	«ENDFOR»
                          	'''
                  	private def generateRestsForStaffMeasure(int index, Staff staff)'''
                          	«FOR rest:staff.elements.filter(Measure).get(index).rest»
                          <note>
                            «IF rest.type == RestType.WHOLE»
                            <rest/>
                            <duration>8</duration>
                            «ELSEIF rest.type == RestType.HALF»
                            <rest/>
                            <duration>4</duration>
                            «ELSEIF rest.type == RestType.QUARTER»
                            <rest/>
                            <duration>2</duration>
                            «ELSEIF rest.type == RestType.EIGHTH»
                            <rest/>
                            <duration>1</duration>
                            «ENDIF»
                            «IF composition.staff.indexOf(staff) + 1 == 1»
                            <voice>1</voice>
                            «ELSEIF composition.staff.indexOf(staff) + 1 == 2»
                            <voice>2</voice>
                            «ENDIF»
                            <type>«rest.type»</type>
                            <staff>«composition.staff.indexOf(staff) + 1»</staff>
                          </note>
                          	«ENDFOR»
                          	'''
                  	private def generateRepetitionsForStaffMeasure(int index, Staff staff)'''
                          	«FOR repetition:staff.elements.filter(Measure).get(index).repetition»
                          <barline location="right">
                            <bar-style>light-heavy</bar-style>
                            <repeat times="2" winged="none" direction="«repetition.type»"/>
                          </barline>
                          	«ENDFOR»
                          	'''
                          }
