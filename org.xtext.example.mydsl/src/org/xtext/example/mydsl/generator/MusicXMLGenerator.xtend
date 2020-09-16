package org.xtext.example.mydsl.generator
import musicMetamodel.Composition
import musicMetamodel.Measure
import musicMetamodel.Staff
import musicMetamodel.ClefType
import musicMetamodel.RestType
class MusicXMLGenerator {
	Composition composition;
	int minMeasureCount;
	new(Composition composition){
		this.composition = composition;
		this.minMeasureCount = minMeasureCount(composition);
	}
	def generateMusicXml()'''
<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<!DOCTYPE score-partwise PUBLIC "-//Recordare//DTD MusicXML 3.1 Partwise//EN" "http://www.musicxml.org/dtds/partwise.dtd">
<score-partwise version="3.1">
    <identification>
    <encoding>
	  <rights>«composition.tonality»</rights>
      <software>Flat</software>
    </encoding>
  </identification>
  <defaults>
    <scaling>
      <millimeters>7</millimeters>
      <tenths>40</tenths>
    </scaling>
    <page-layout>
      <page-height>1697.142857142857</page-height>
      <page-width>1200</page-width>
      <page-margins type="both">
        <left-margin>98.28571428571429</left-margin>
        <right-margin>98.28571428571429</right-margin>
        <top-margin>98.28571428571429</top-margin>
        <bottom-margin>98.28571428571429</bottom-margin>
        </page-margins>
        </page-layout>
        <system-layout>
          <system-distance>115.2</system-distance>
          </system-layout>
          <staff-layout>
            <staff-distance>72.57142857142857</staff-distance>
            </staff-layout>
          </defaults>
          <credit>
            <credit-type>title</credit-type>
            <credit-words>«composition.name»</credit-words>
          </credit>
          <credit>
            <credit-type>subtitle</credit-type>
            <credit-words>«composition.author»</credit-words>
          </credit>
          <part-list>
            <score-part id="P1">
              <part-name>«composition.instrument»</part-name>
              <part-abbreviation>Pno.</part-abbreviation>
              <score-instrument id="P1-I1">
                <instrument-name>«composition.instrument»</instrument-name>
                </score-instrument>
                <midi-instrument id="P1-I1">
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
                        <divisions>2</divisions>
                        <key>
                          <fifths>«composition.staff.get(0).key.getFifths()»</fifths>
                        </key>
                        <time>
                          <beats>«composition.staff.get(0).time.getBeat()»</beats>
                          <beat-type>«composition.staff.get(0).time.getBeatType()»</beat-type>
                        </time>
                        <staves>2</staves>
                        <clef number="1">
                          <sign>G</sign>
                          <line>2</line>
                        </clef>
                        <clef number="2">
                          <sign>F</sign>
                          <line>4</line>
                        </clef>
                        <staff-details>
                          <staff-lines>5</staff-lines>
                          </staff-details>
                        </attributes>
                        <sound/>
                        <sound tempo="«composition.soundTempo»"/>
                        <direction placement="above">
                          <direction-type>
                            <metronome>
                              <beat-unit>quarter</beat-unit>
                              <per-minute>«composition.soundTempo»</per-minute>
                            </metronome>
                            </direction-type>
                            <staff>1</staff>
                          </direction>
                            	«ELSE»
                          <attributes/>
                            	«ENDIF»
                            	«FOR staff:composition.staff»
                        «generateNotesForStaffMeasure(measureCounter, staff)»
                        «generateRestsForStaffMeasure(measureCounter, staff)»
                        «generateRepetitionsForStaffMeasure(measureCounter, staff)»
                            	«IF composition.staff.indexOf(staff) != composition.staff.size - 1»
                          <backup>
                            <duration>8</duration>
                          </backup>
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
                              <slur type="«n.slur»" number="1"/>
                            	«ELSEIF n.ornament !== null»
                              <ornaments>«n.ornament»</ornaments>
                            	«ELSEIF n.articulation !== null»
                              <articulation>«n.articulation»</articulation>
                            	«ENDIF»
                            	«ENDFOR»
                            </notations>
                          	«ENDIF»
                          	«IF note.lyrics !== null»
                            <lyric number="1">
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
