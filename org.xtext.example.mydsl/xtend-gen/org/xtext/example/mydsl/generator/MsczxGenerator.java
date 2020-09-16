package org.xtext.example.mydsl.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import musicMetamodel.Composition;
import musicMetamodel.Measure;
import musicMetamodel.Note;
import musicMetamodel.NoteName;
import musicMetamodel.NoteType;
import musicMetamodel.Staff;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class MsczxGenerator {
  private Composition composition;
  
  private int minMeasureCount;
  
  public MsczxGenerator(final Composition composition) {
    this.composition = composition;
  }
  
  public CharSequence generateMsczx() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<museScore version=\"3.01\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<programVersion>3.5.0</programVersion>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<programRevision>43c5553</programRevision>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<Score>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<LayerTag id=\"0\" tag=\"default\"></LayerTag>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<currentLayer>0</currentLayer>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<Division>480</Division>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<Style>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<pageWidth>8.27</pageWidth>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<pageHeight>11.69</pageHeight>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<pagePrintableWidth>7.4826</pagePrintableWidth>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<Spatium>1.76389</Spatium>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("</Style>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<showInvisible>1</showInvisible>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<showUnprintable>1</showUnprintable>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<showFrames>1</showFrames>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<showMargins>0</showMargins>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<metaTag name=\"arranger\"></metaTag>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<metaTag name=\"composer\">");
    String _author = this.composition.getAuthor();
    _builder.append(_author, "    ");
    _builder.append("</metaTag>");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<metaTag name=\"copyright\"></metaTag>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<metaTag name=\"creationDate\">2020-09-14</metaTag>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<metaTag name=\"lyricist\"></metaTag>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<metaTag name=\"movementNumber\"></metaTag>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<metaTag name=\"movementTitle\"></metaTag>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<metaTag name=\"platform\">Microsoft Windows</metaTag>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<metaTag name=\"poet\"></metaTag>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<metaTag name=\"source\"></metaTag>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<metaTag name=\"translator\"></metaTag>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<metaTag name=\"workNumber\"></metaTag>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<metaTag name=\"workTitle\">");
    String _name = this.composition.getName();
    _builder.append(_name, "    ");
    _builder.append("</metaTag>");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<Part>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<Staff id=\"1\">");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<StaffType group=\"pitched\">");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<name>stdNormal</name>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("</StaffType>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<bracket type=\"1\" span=\"2\" col=\"0\"/>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<barLineSpan>1</barLineSpan>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</Staff>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<Staff id=\"2\">");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<StaffType group=\"pitched\">");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<name>stdNormal</name>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("</StaffType>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<defaultClef>F</defaultClef>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</Staff>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<trackName>");
    String _instrument = this.composition.getInstrument();
    _builder.append(_instrument, "      ");
    _builder.append("</trackName>");
    _builder.newLineIfNotEmpty();
    _builder.append("      ");
    _builder.append("<Instrument>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<longName>");
    String _instrument_1 = this.composition.getInstrument();
    _builder.append(_instrument_1, "        ");
    _builder.append("</longName>");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("<shortName>Pno.</shortName>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<trackName>");
    String _instrument_2 = this.composition.getInstrument();
    _builder.append(_instrument_2, "        ");
    _builder.append("</trackName>");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("<minPitchP>21</minPitchP>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<maxPitchP>108</maxPitchP>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<minPitchA>21</minPitchA>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<maxPitchA>108</maxPitchA>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<instrumentId>keyboard.");
    String _lowerCase = this.composition.getInstrument().toLowerCase();
    _builder.append(_lowerCase, "        ");
    _builder.append("</instrumentId>");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("<clef staff=\"2\">F</clef>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<Articulation>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<velocity>100</velocity>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<gateTime>95</gateTime>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("</Articulation>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<Articulation name=\"staccatissimo\">");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<velocity>100</velocity>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<gateTime>33</gateTime>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("</Articulation>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<Articulation name=\"staccato\">");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<velocity>100</velocity>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<gateTime>50</gateTime>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("</Articulation>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<Articulation name=\"portato\">");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<velocity>100</velocity>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<gateTime>67</gateTime>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("</Articulation>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<Articulation name=\"tenuto\">");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<velocity>100</velocity>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<gateTime>100</gateTime>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("</Articulation>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<Articulation name=\"marcato\">");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<velocity>120</velocity>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<gateTime>67</gateTime>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("</Articulation>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<Articulation name=\"sforzato\">");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<velocity>150</velocity>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<gateTime>100</gateTime>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("</Articulation>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<Articulation name=\"sforzatoStaccato\">");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<velocity>150</velocity>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<gateTime>50</gateTime>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("</Articulation>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<Articulation name=\"marcatoStaccato\">");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<velocity>120</velocity>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<gateTime>50</gateTime>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("</Articulation>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<Articulation name=\"marcatoTenuto\">");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<velocity>120</velocity>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<gateTime>100</gateTime>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("</Articulation>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<Channel>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<program value=\"0\"/>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<synti>Fluid</synti>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("</Channel>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</Instrument>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("</Part>");
    _builder.newLine();
    {
      EList<Staff> _staff = this.composition.getStaff();
      for(final Staff s : _staff) {
        _builder.append("    ");
        _builder.append("<Staff id=\"");
        int _staffNumber = s.getStaffNumber();
        _builder.append(_staffNumber, "    ");
        _builder.append("\">");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("  ");
        _builder.append("<VBox>");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("<height>10</height>");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("<Text>");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("      ");
        _builder.append("<style>Title</style>");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("      ");
        _builder.append("<text>");
        String _name_1 = this.composition.getName();
        _builder.append(_name_1, "          ");
        _builder.append("</text>");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("      ");
        _builder.append("</Text>");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("</VBox>");
        _builder.newLine();
        {
          Iterable<Measure> _filter = Iterables.<Measure>filter(s.getElements(), Measure.class);
          for(final Measure n : _filter) {
            {
              int _measureNumber = n.getMeasureNumber();
              boolean _equals = (_measureNumber == 1);
              if (_equals) {
                _builder.append("<Measure>");
                _builder.newLine();
                _builder.append("  ");
                _builder.append("<voice>");
                _builder.newLine();
                _builder.append("    ");
                _builder.append("<KeySig>");
                _builder.newLine();
                _builder.append("      ");
                _builder.append("<accidental>");
                int _fifths = this.composition.getStaff().get(0).getKey().getFifths();
                _builder.append(_fifths, "      ");
                _builder.append("</accidental>");
                _builder.newLineIfNotEmpty();
                _builder.append("      ");
                _builder.append("</KeySig>");
                _builder.newLine();
                _builder.append("    ");
                _builder.append("<TimeSig>");
                _builder.newLine();
                _builder.append("      ");
                _builder.append("<sigN>");
                int _beat = this.composition.getStaff().get(0).getTime().getBeat();
                _builder.append(_beat, "      ");
                _builder.append("</sigN>");
                _builder.newLineIfNotEmpty();
                _builder.append("      ");
                _builder.append("<sigD>");
                int _beatType = this.composition.getStaff().get(0).getTime().getBeatType();
                _builder.append(_beatType, "      ");
                _builder.append("</sigD>");
                _builder.newLineIfNotEmpty();
                _builder.append("      ");
                _builder.append("</TimeSig>");
                _builder.newLine();
                _builder.append("    ");
                _builder.append("<Tempo>");
                _builder.newLine();
                _builder.append("      ");
                _builder.append("<tempo>1.33333</tempo>");
                _builder.newLine();
                _builder.append("      ");
                _builder.append("<followText>1</followText>");
                _builder.newLine();
                _builder.append("      ");
                _builder.append("<text><sym>metNoteQuarterUp</sym> = ");
                int _soundTempo = this.composition.getSoundTempo();
                _builder.append(_soundTempo, "      ");
                _builder.append("</text>");
                _builder.newLineIfNotEmpty();
                _builder.append("      ");
                _builder.append("</Tempo>");
                _builder.newLine();
                _builder.append("    ");
                CharSequence _generateNote = this.generateNote();
                _builder.append(_generateNote, "    ");
                _builder.newLineIfNotEmpty();
                _builder.append("  ");
                _builder.append("</voice>");
                _builder.newLine();
                _builder.append("  ");
                _builder.append("</Measure>");
                _builder.newLine();
              } else {
                _builder.append("    ");
                _builder.append("  ");
                _builder.append("<Measure>");
                _builder.newLine();
                _builder.append("    ");
                _builder.append("  ");
                _builder.append("<voice>");
                _builder.newLine();
                _builder.append("    ");
                _builder.append("  ");
                _builder.append("  ");
                CharSequence _generateNote_1 = this.generateNote();
                _builder.append(_generateNote_1, "        ");
                _builder.newLineIfNotEmpty();
                _builder.append("    ");
                _builder.append("  ");
                _builder.append(" ");
                _builder.append("</voice>  ");
                _builder.newLine();
                _builder.append("    ");
                _builder.append("  ");
                _builder.append(" ");
                _builder.append("</Measure>     ");
                _builder.newLine();
              }
            }
          }
        }
        _builder.append("    ");
        _builder.append("  ");
        _builder.append("</Staff>");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("</Score>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</museScore>");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence generateNote() {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Staff> _staff = this.composition.getStaff();
      for(final Staff s : _staff) {
        {
          Iterable<Measure> _filter = Iterables.<Measure>filter(s.getElements(), Measure.class);
          for(final Measure n : _filter) {
            {
              EList<Note> _note = n.getNote();
              for(final Note note : _note) {
                _builder.append("<Chord>");
                _builder.newLine();
                _builder.append(" ");
                _builder.append("<durationType>");
                NoteType _type = note.getType();
                _builder.append(_type, " ");
                _builder.append("</durationType>");
                _builder.newLineIfNotEmpty();
                _builder.append("  ");
                _builder.append("<Lyrics>");
                _builder.newLine();
                _builder.append("    ");
                _builder.append("<text>");
                String _lyrics = note.getLyrics();
                _builder.append(_lyrics, "    ");
                _builder.append("</text>");
                _builder.newLineIfNotEmpty();
                _builder.append("  ");
                _builder.append("</Lyrics>");
                _builder.newLine();
                _builder.append("<Note>");
                _builder.newLine();
                {
                  if (((note.getOctave() == 1) && Objects.equal(note.getName(), NoteName.A))) {
                    _builder.append("<pitch>33</pitch>");
                    _builder.newLine();
                  } else {
                    if (((note.getOctave() == 2) && Objects.equal(note.getName(), NoteName.A))) {
                      _builder.append("<pitch>45</pitch>");
                      _builder.newLine();
                    } else {
                      if (((note.getOctave() == 3) && Objects.equal(note.getName(), NoteName.A))) {
                        _builder.append("<pitch>57</pitch>");
                        _builder.newLine();
                      } else {
                        if (((note.getOctave() == 4) && Objects.equal(note.getName(), NoteName.A))) {
                          _builder.append("<pitch>69</pitch>");
                          _builder.newLine();
                        } else {
                          if (((note.getOctave() == 5) && Objects.equal(note.getName(), NoteName.A))) {
                            _builder.append("<pitch>81</pitch>");
                            _builder.newLine();
                          } else {
                            if (((note.getOctave() == 6) && Objects.equal(note.getName(), NoteName.A))) {
                              _builder.append("<pitch>93/pitch>");
                              _builder.newLine();
                            } else {
                              if (((note.getOctave() == 7) && Objects.equal(note.getName(), NoteName.A))) {
                                _builder.append("<pitch>105</pitch>");
                                _builder.newLine();
                              } else {
                                if (((note.getOctave() == 8) && Objects.equal(note.getName(), NoteName.A))) {
                                  _builder.append("<pitch>117</pitch>");
                                  _builder.newLine();
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                {
                  if (((note.getOctave() == 1) && Objects.equal(note.getName(), NoteName.B))) {
                    _builder.append("<pitch>35</pitch>");
                    _builder.newLine();
                  } else {
                    if (((note.getOctave() == 2) && Objects.equal(note.getName(), NoteName.B))) {
                      _builder.append("<pitch>47</pitch>");
                      _builder.newLine();
                    } else {
                      if (((note.getOctave() == 3) && Objects.equal(note.getName(), NoteName.B))) {
                        _builder.append("<pitch>59</pitch>");
                        _builder.newLine();
                      } else {
                        if (((note.getOctave() == 4) && Objects.equal(note.getName(), NoteName.B))) {
                          _builder.append("<pitch>71</pitch>");
                          _builder.newLine();
                        } else {
                          if (((note.getOctave() == 5) && Objects.equal(note.getName(), NoteName.B))) {
                            _builder.append("<pitch>83</pitch>");
                            _builder.newLine();
                          } else {
                            if (((note.getOctave() == 6) && Objects.equal(note.getName(), NoteName.B))) {
                              _builder.append("<pitch>95/pitch>");
                              _builder.newLine();
                            } else {
                              if (((note.getOctave() == 7) && Objects.equal(note.getName(), NoteName.B))) {
                                _builder.append("<pitch>107</pitch>");
                                _builder.newLine();
                              } else {
                                if (((note.getOctave() == 8) && Objects.equal(note.getName(), NoteName.B))) {
                                  _builder.append("<pitch>119</pitch>");
                                  _builder.newLine();
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                {
                  if (((note.getOctave() == 1) && Objects.equal(note.getName(), NoteName.C))) {
                    _builder.append("<pitch>24</pitch>");
                    _builder.newLine();
                  } else {
                    if (((note.getOctave() == 2) && Objects.equal(note.getName(), NoteName.C))) {
                      _builder.append("<pitch>36</pitch>");
                      _builder.newLine();
                    } else {
                      if (((note.getOctave() == 3) && Objects.equal(note.getName(), NoteName.C))) {
                        _builder.append("<pitch>48</pitch>");
                        _builder.newLine();
                      } else {
                        if (((note.getOctave() == 4) && Objects.equal(note.getName(), NoteName.C))) {
                          _builder.append("<pitch>60</pitch>");
                          _builder.newLine();
                        } else {
                          if (((note.getOctave() == 5) && Objects.equal(note.getName(), NoteName.C))) {
                            _builder.append("<pitch>72</pitch>");
                            _builder.newLine();
                          } else {
                            if (((note.getOctave() == 6) && Objects.equal(note.getName(), NoteName.C))) {
                              _builder.append("<pitch>84/pitch>");
                              _builder.newLine();
                            } else {
                              if (((note.getOctave() == 7) && Objects.equal(note.getName(), NoteName.C))) {
                                _builder.append("<pitch>96</pitch>");
                                _builder.newLine();
                              } else {
                                if (((note.getOctave() == 8) && Objects.equal(note.getName(), NoteName.C))) {
                                  _builder.append("<pitch>108</pitch>");
                                  _builder.newLine();
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                {
                  if (((note.getOctave() == 1) && Objects.equal(note.getName(), NoteName.D))) {
                    _builder.append("<pitch>26</pitch>");
                    _builder.newLine();
                  } else {
                    if (((note.getOctave() == 2) && Objects.equal(note.getName(), NoteName.D))) {
                      _builder.append("<pitch>38</pitch>");
                      _builder.newLine();
                    } else {
                      if (((note.getOctave() == 3) && Objects.equal(note.getName(), NoteName.D))) {
                        _builder.append("<pitch>50</pitch>");
                        _builder.newLine();
                      } else {
                        if (((note.getOctave() == 4) && Objects.equal(note.getName(), NoteName.D))) {
                          _builder.append("<pitch>62</pitch>");
                          _builder.newLine();
                        } else {
                          if (((note.getOctave() == 5) && Objects.equal(note.getName(), NoteName.D))) {
                            _builder.append("<pitch>74</pitch>");
                            _builder.newLine();
                          } else {
                            if (((note.getOctave() == 6) && Objects.equal(note.getName(), NoteName.D))) {
                              _builder.append("<pitch>86/pitch>");
                              _builder.newLine();
                            } else {
                              if (((note.getOctave() == 7) && Objects.equal(note.getName(), NoteName.D))) {
                                _builder.append("<pitch>98</pitch>");
                                _builder.newLine();
                              } else {
                                if (((note.getOctave() == 8) && Objects.equal(note.getName(), NoteName.D))) {
                                  _builder.append("<pitch>110</pitch>");
                                  _builder.newLine();
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                {
                  if (((note.getOctave() == 1) && Objects.equal(note.getName(), NoteName.E))) {
                    _builder.append("<pitch>28</pitch>");
                    _builder.newLine();
                  } else {
                    if (((note.getOctave() == 2) && Objects.equal(note.getName(), NoteName.E))) {
                      _builder.append("<pitch>40</pitch>");
                      _builder.newLine();
                    } else {
                      if (((note.getOctave() == 3) && Objects.equal(note.getName(), NoteName.E))) {
                        _builder.append("<pitch>52</pitch>");
                        _builder.newLine();
                      } else {
                        if (((note.getOctave() == 4) && Objects.equal(note.getName(), NoteName.E))) {
                          _builder.append("<pitch>64</pitch>");
                          _builder.newLine();
                        } else {
                          if (((note.getOctave() == 5) && Objects.equal(note.getName(), NoteName.E))) {
                            _builder.append("<pitch>76</pitch>");
                            _builder.newLine();
                          } else {
                            if (((note.getOctave() == 6) && Objects.equal(note.getName(), NoteName.E))) {
                              _builder.append("<pitch>88</pitch>");
                              _builder.newLine();
                            } else {
                              if (((note.getOctave() == 7) && Objects.equal(note.getName(), NoteName.E))) {
                                _builder.append("<pitch>100</pitch>");
                                _builder.newLine();
                              } else {
                                if (((note.getOctave() == 8) && Objects.equal(note.getName(), NoteName.E))) {
                                  _builder.append("<pitch>112</pitch>");
                                  _builder.newLine();
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                {
                  if (((note.getOctave() == 1) && Objects.equal(note.getName(), NoteName.F))) {
                    _builder.append("<pitch>29</pitch>");
                    _builder.newLine();
                  } else {
                    if (((note.getOctave() == 2) && Objects.equal(note.getName(), NoteName.F))) {
                      _builder.append("<pitch>41</pitch>");
                      _builder.newLine();
                    } else {
                      if (((note.getOctave() == 3) && Objects.equal(note.getName(), NoteName.F))) {
                        _builder.append("<pitch>53</pitch>");
                        _builder.newLine();
                      } else {
                        if (((note.getOctave() == 4) && Objects.equal(note.getName(), NoteName.F))) {
                          _builder.append("<pitch>65</pitch>");
                          _builder.newLine();
                        } else {
                          if (((note.getOctave() == 5) && Objects.equal(note.getName(), NoteName.F))) {
                            _builder.append("<pitch>77</pitch>");
                            _builder.newLine();
                          } else {
                            if (((note.getOctave() == 6) && Objects.equal(note.getName(), NoteName.F))) {
                              _builder.append("<pitch>89/pitch>");
                              _builder.newLine();
                            } else {
                              if (((note.getOctave() == 7) && Objects.equal(note.getName(), NoteName.F))) {
                                _builder.append("<pitch>101</pitch>");
                                _builder.newLine();
                              } else {
                                if (((note.getOctave() == 8) && Objects.equal(note.getName(), NoteName.F))) {
                                  _builder.append("<pitch>113</pitch>");
                                  _builder.newLine();
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                {
                  if (((note.getOctave() == 1) && Objects.equal(note.getName(), NoteName.G))) {
                    _builder.append("<pitch>31</pitch>");
                    _builder.newLine();
                  } else {
                    if (((note.getOctave() == 2) && Objects.equal(note.getName(), NoteName.G))) {
                      _builder.append("<pitch>43</pitch>");
                      _builder.newLine();
                    } else {
                      if (((note.getOctave() == 3) && Objects.equal(note.getName(), NoteName.G))) {
                        _builder.append("<pitch>55</pitch>");
                        _builder.newLine();
                      } else {
                        if (((note.getOctave() == 4) && Objects.equal(note.getName(), NoteName.G))) {
                          _builder.append("<pitch>67</pitch>");
                          _builder.newLine();
                        } else {
                          if (((note.getOctave() == 5) && Objects.equal(note.getName(), NoteName.G))) {
                            _builder.append("<pitch>79</pitch>");
                            _builder.newLine();
                          } else {
                            if (((note.getOctave() == 6) && Objects.equal(note.getName(), NoteName.G))) {
                              _builder.append("<pitch>91/pitch>");
                              _builder.newLine();
                            } else {
                              if (((note.getOctave() == 7) && Objects.equal(note.getName(), NoteName.G))) {
                                _builder.append("<pitch>103</pitch>");
                                _builder.newLine();
                              } else {
                                if (((note.getOctave() == 8) && Objects.equal(note.getName(), NoteName.G))) {
                                  _builder.append("<pitch>115</pitch>");
                                  _builder.newLine();
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                {
                  NoteName _name = note.getName();
                  boolean _equals = Objects.equal(_name, NoteName.A);
                  if (_equals) {
                    _builder.append("<tpc>13</tpc>");
                    _builder.newLine();
                  } else {
                    NoteName _name_1 = note.getName();
                    boolean _equals_1 = Objects.equal(_name_1, NoteName.B);
                    if (_equals_1) {
                      _builder.append("<tpc>14</tpc>");
                      _builder.newLine();
                    } else {
                      NoteName _name_2 = note.getName();
                      boolean _equals_2 = Objects.equal(_name_2, NoteName.C);
                      if (_equals_2) {
                        _builder.append("<tpc>15</tpc>");
                        _builder.newLine();
                      } else {
                        NoteName _name_3 = note.getName();
                        boolean _equals_3 = Objects.equal(_name_3, NoteName.D);
                        if (_equals_3) {
                          _builder.append("<tpc>16</tpc>");
                          _builder.newLine();
                        } else {
                          NoteName _name_4 = note.getName();
                          boolean _equals_4 = Objects.equal(_name_4, NoteName.E);
                          if (_equals_4) {
                            _builder.append("<tpc>17</tpc>");
                            _builder.newLine();
                          } else {
                            NoteName _name_5 = note.getName();
                            boolean _equals_5 = Objects.equal(_name_5, NoteName.F);
                            if (_equals_5) {
                              _builder.append("<tpc>18</tpc>");
                              _builder.newLine();
                            } else {
                              NoteName _name_6 = note.getName();
                              boolean _equals_6 = Objects.equal(_name_6, NoteName.G);
                              if (_equals_6) {
                                _builder.append("<tpc>19</tpc>");
                                _builder.newLine();
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                _builder.append(" ");
                _builder.append("</Note>");
                _builder.newLine();
                _builder.append("</Chord>");
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
}
