package org.xtext.example.mydsl.generator

import musicMetamodel.Composition
import musicMetamodel.Measure
import musicMetamodel.Note
import musicMetamodel.NoteName

class MsczxGenerator {
	Composition composition;
	int minMeasureCount;
	
	new(Composition composition){
		this.composition = composition;
	}
	
	def generateMsczx() '''
<?xml version="1.0" encoding="UTF-8"?>
<museScore version="3.01">
  <programVersion>3.5.0</programVersion>
  <programRevision>43c5553</programRevision>
  <Score>
    <LayerTag id="0" tag="default"></LayerTag>
    <currentLayer>0</currentLayer>
    <Division>480</Division>
    <Style>
      <pageWidth>8.27</pageWidth>
      <pageHeight>11.69</pageHeight>
      <pagePrintableWidth>7.4826</pagePrintableWidth>
      <Spatium>1.76389</Spatium>
      </Style>
    <showInvisible>1</showInvisible>
    <showUnprintable>1</showUnprintable>
    <showFrames>1</showFrames>
    <showMargins>0</showMargins>
    <metaTag name="arranger"></metaTag>
    <metaTag name="composer">«composition.author»</metaTag>
    <metaTag name="copyright"></metaTag>
    <metaTag name="creationDate">2020-09-14</metaTag>
    <metaTag name="lyricist"></metaTag>
    <metaTag name="movementNumber"></metaTag>
    <metaTag name="movementTitle"></metaTag>
    <metaTag name="platform">Microsoft Windows</metaTag>
    <metaTag name="poet"></metaTag>
    <metaTag name="source"></metaTag>
    <metaTag name="translator"></metaTag>
    <metaTag name="workNumber"></metaTag>
    <metaTag name="workTitle">«composition.name»</metaTag>
    <Part>
      <Staff id="1">
        <StaffType group="pitched">
          <name>stdNormal</name>
          </StaffType>
        <bracket type="1" span="2" col="0"/>
        <barLineSpan>1</barLineSpan>
        </Staff>
      <Staff id="2">
        <StaffType group="pitched">
          <name>stdNormal</name>
          </StaffType>
        <defaultClef>F</defaultClef>
        </Staff>
      <trackName>«composition.instrument»</trackName>
      <Instrument>
        <longName>«composition.instrument»</longName>
        <shortName>Pno.</shortName>
        <trackName>«composition.instrument»</trackName>
        <minPitchP>21</minPitchP>
        <maxPitchP>108</maxPitchP>
        <minPitchA>21</minPitchA>
        <maxPitchA>108</maxPitchA>
        <instrumentId>keyboard.«composition.instrument.toLowerCase»</instrumentId>
        <clef staff="2">F</clef>
        <Articulation>
          <velocity>100</velocity>
          <gateTime>95</gateTime>
          </Articulation>
        <Articulation name="staccatissimo">
          <velocity>100</velocity>
          <gateTime>33</gateTime>
          </Articulation>
        <Articulation name="staccato">
          <velocity>100</velocity>
          <gateTime>50</gateTime>
          </Articulation>
        <Articulation name="portato">
          <velocity>100</velocity>
          <gateTime>67</gateTime>
          </Articulation>
        <Articulation name="tenuto">
          <velocity>100</velocity>
          <gateTime>100</gateTime>
          </Articulation>
        <Articulation name="marcato">
          <velocity>120</velocity>
          <gateTime>67</gateTime>
          </Articulation>
        <Articulation name="sforzato">
          <velocity>150</velocity>
          <gateTime>100</gateTime>
          </Articulation>
        <Articulation name="sforzatoStaccato">
          <velocity>150</velocity>
          <gateTime>50</gateTime>
          </Articulation>
        <Articulation name="marcatoStaccato">
          <velocity>120</velocity>
          <gateTime>50</gateTime>
          </Articulation>
        <Articulation name="marcatoTenuto">
          <velocity>120</velocity>
          <gateTime>100</gateTime>
          </Articulation>
        <Channel>
          <program value="0"/>
          <synti>Fluid</synti>
          </Channel>
        </Instrument>
      </Part>
    «FOR s: composition.staff»
    <Staff id="«s.getStaffNumber()»">
      <VBox>
        <height>10</height>
        <Text>
          <style>Title</style>
          <text>«composition.name»</text>
          </Text>
        </VBox>
      «FOR n: s.elements.filter(Measure)»
       «IF n.measureNumber == 1»
      <Measure>
        <voice>
          <KeySig>
            <accidental>«composition.staff.get(0).key.getFifths()»</accidental>
            </KeySig>
          <TimeSig>
            <sigN>«composition.staff.get(0).time.getBeat()»</sigN>
            <sigD>«composition.staff.get(0).time.getBeatType()»</sigD>
            </TimeSig>
          <Tempo>
            <tempo>1.33333</tempo>
            <followText>1</followText>
            <text><sym>metNoteQuarterUp</sym> = «composition.soundTempo»</text>
            </Tempo>
          «generateNote()»
        </voice>
        </Measure>
        «ELSE»
        <Measure>
        <voice>
          «generateNote()»
         </voice>  
         </Measure>     
        «ENDIF»
        «ENDFOR»
      </Staff>
   «ENDFOR»
    </Score>
  </museScore>
'''
    private def generateNote() '''
    «FOR s: composition.staff»
    «FOR n: s.elements.filter(Measure)»
    «FOR note: n.note»      
          <Chord>
           <durationType>«note.type»</durationType>
            <Lyrics>
              <text>«note.lyrics»</text>
            </Lyrics>
          <Note>
               «IF note.octave == 1 && note.name == NoteName.A»
           <pitch>33</pitch>
               «ELSEIF note.octave == 2 && note.name == NoteName.A»
           <pitch>45</pitch>
               «ELSEIF note.octave == 3 && note.name == NoteName.A»
           <pitch>57</pitch>
               «ELSEIF note.octave == 4 && note.name == NoteName.A»
           <pitch>69</pitch>
               «ELSEIF note.octave == 5 && note.name == NoteName.A»
           <pitch>81</pitch>
               «ELSEIF note.octave == 6 && note.name == NoteName.A»
           <pitch>93/pitch>
               «ELSEIF note.octave == 7 && note.name == NoteName.A»
           <pitch>105</pitch>
               «ELSEIF note.octave == 8 && note.name == NoteName.A»
           <pitch>117</pitch>
               «ENDIF» 
               «IF note.octave == 1 && note.name == NoteName.B»
           <pitch>35</pitch>
               «ELSEIF note.octave == 2 && note.name == NoteName.B»
           <pitch>47</pitch>
               «ELSEIF note.octave == 3 && note.name == NoteName.B»
           <pitch>59</pitch>
               «ELSEIF note.octave == 4 && note.name == NoteName.B»
           <pitch>71</pitch>
               «ELSEIF note.octave == 5 && note.name == NoteName.B»
           <pitch>83</pitch>
               «ELSEIF note.octave == 6 && note.name == NoteName.B»
           <pitch>95/pitch>
               «ELSEIF note.octave == 7 && note.name == NoteName.B»
           <pitch>107</pitch>
               «ELSEIF note.octave == 8 && note.name == NoteName.B»
           <pitch>119</pitch>
               «ENDIF»
               «IF note.octave == 1 && note.name == NoteName.C»
           <pitch>24</pitch>
               «ELSEIF note.octave == 2 && note.name == NoteName.C»
           <pitch>36</pitch>
               «ELSEIF note.octave == 3 && note.name == NoteName.C»
           <pitch>48</pitch>
               «ELSEIF note.octave == 4 && note.name == NoteName.C»
           <pitch>60</pitch>
               «ELSEIF note.octave == 5 && note.name == NoteName.C»
           <pitch>72</pitch>
               «ELSEIF note.octave == 6 && note.name == NoteName.C»
           <pitch>84/pitch>
               «ELSEIF note.octave == 7 && note.name == NoteName.C»
           <pitch>96</pitch>
               «ELSEIF note.octave == 8 && note.name == NoteName.C»
           <pitch>108</pitch>
               «ENDIF»
               «IF note.octave == 1 && note.name == NoteName.D»
           <pitch>26</pitch>
               «ELSEIF note.octave == 2 && note.name == NoteName.D»
           <pitch>38</pitch>
               «ELSEIF note.octave == 3 && note.name == NoteName.D»
           <pitch>50</pitch>
               «ELSEIF note.octave == 4 && note.name == NoteName.D»
           <pitch>62</pitch>
               «ELSEIF note.octave == 5 && note.name == NoteName.D»
           <pitch>74</pitch>
               «ELSEIF note.octave == 6 && note.name == NoteName.D»
           <pitch>86/pitch>
               «ELSEIF note.octave == 7 && note.name == NoteName.D»
           <pitch>98</pitch>
               «ELSEIF note.octave == 8 && note.name == NoteName.D»
           <pitch>110</pitch>
               «ENDIF»
               «IF note.octave == 1 && note.name == NoteName.E»
           <pitch>28</pitch>
               «ELSEIF note.octave == 2 && note.name == NoteName.E»
           <pitch>40</pitch>
               «ELSEIF note.octave == 3 && note.name == NoteName.E»
           <pitch>52</pitch>
               «ELSEIF note.octave == 4 && note.name == NoteName.E»
           <pitch>64</pitch>
               «ELSEIF note.octave == 5 && note.name == NoteName.E»
           <pitch>76</pitch>
               «ELSEIF note.octave == 6 && note.name == NoteName.E»
           <pitch>88</pitch>
               «ELSEIF note.octave == 7 && note.name == NoteName.E»
           <pitch>100</pitch>
               «ELSEIF note.octave == 8 && note.name == NoteName.E»
           <pitch>112</pitch>
               «ENDIF»
               «IF note.octave == 1 && note.name == NoteName.F»
           <pitch>29</pitch>
               «ELSEIF note.octave == 2 && note.name == NoteName.F»
           <pitch>41</pitch>
               «ELSEIF note.octave == 3 && note.name == NoteName.F»
           <pitch>53</pitch>
               «ELSEIF note.octave == 4 && note.name == NoteName.F»
           <pitch>65</pitch>
               «ELSEIF note.octave == 5 && note.name == NoteName.F»
           <pitch>77</pitch>
               «ELSEIF note.octave == 6 && note.name == NoteName.F»
           <pitch>89/pitch>
               «ELSEIF note.octave == 7 && note.name == NoteName.F»
           <pitch>101</pitch>
               «ELSEIF note.octave == 8 && note.name == NoteName.F»
           <pitch>113</pitch>
               «ENDIF»
               «IF note.octave == 1 && note.name == NoteName.G»
           <pitch>31</pitch>
               «ELSEIF note.octave == 2 && note.name == NoteName.G»
           <pitch>43</pitch>
               «ELSEIF note.octave == 3 && note.name == NoteName.G»
           <pitch>55</pitch>
               «ELSEIF note.octave == 4 && note.name == NoteName.G»
           <pitch>67</pitch>
               «ELSEIF note.octave == 5 && note.name == NoteName.G»
           <pitch>79</pitch>
               «ELSEIF note.octave == 6 && note.name == NoteName.G»
           <pitch>91/pitch>
               «ELSEIF note.octave == 7 && note.name == NoteName.G»
           <pitch>103</pitch>
               «ELSEIF note.octave == 8 && note.name == NoteName.G»
           <pitch>115</pitch>
               «ENDIF» 
               «IF note.name == NoteName.A»
           <tpc>13</tpc>
               «ELSEIF note.name == NoteName.B»
           <tpc>14</tpc>
               «ELSEIF note.name == NoteName.C»
           <tpc>15</tpc>
               «ELSEIF note.name == NoteName.D»
           <tpc>16</tpc>
               «ELSEIF note.name == NoteName.E»
           <tpc>17</tpc>
               «ELSEIF note.name == NoteName.F»
           <tpc>18</tpc>
               «ELSEIF note.name == NoteName.G»
           <tpc>19</tpc>
               «ENDIF»                                                                                                                                 
           </Note>
          </Chord>
    «ENDFOR»
    «ENDFOR»
    «ENDFOR»
'''	
	}