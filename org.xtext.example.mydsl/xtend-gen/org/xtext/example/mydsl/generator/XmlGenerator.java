package org.xtext.example.mydsl.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import musicMetamodel.ArticulationType;
import musicMetamodel.Composition;
import musicMetamodel.Measure;
import musicMetamodel.Notation;
import musicMetamodel.Note;
import musicMetamodel.NoteName;
import musicMetamodel.NoteType;
import musicMetamodel.OrnamentType;
import musicMetamodel.Repetition;
import musicMetamodel.RepetitionType;
import musicMetamodel.Rest;
import musicMetamodel.RestType;
import musicMetamodel.SlurType;
import musicMetamodel.Staff;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class XmlGenerator {
  private Composition composition;
  
  private int minMeasureCount;
  
  public XmlGenerator(final Composition composition) {
    this.composition = composition;
    this.minMeasureCount = this.minMeasureCount(composition);
  }
  
  public CharSequence generateXml() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<!DOCTYPE score-partwise PUBLIC \"-//Recordare//DTD MusicXML 2.0 Partwise//EN\" \"http://www.musicxml.org/dtds/partwise.dtd\">");
    _builder.newLine();
    _builder.append("<score-partwise version=\"2.0\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<work>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<work-title>");
    String _name = this.composition.getName();
    _builder.append(_name, "    ");
    _builder.append("</work-title>");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("</work>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<identification>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<creator type=\"composer\"/>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<creator type=\"lyricist\"/>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<rights/>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<encoding>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<software>Noteflight version 0.4</software>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<supports attribute=\"new-system\" element=\"print\" type=\"no\" value=\"no\"/>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<supports attribute=\"new-page\" element=\"print\" type=\"no\" value=\"no\"/>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</encoding>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</identification>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<defaults>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<scaling>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<millimeters>2.1166666679999997</millimeters>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<tenths>10</tenths>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</scaling>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<page-layout>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<page-height>1320</page-height>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<page-width>1020</page-width>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<page-margins type=\"both\">");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<left-margin>59.583333333333336</left-margin>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<right-margin>56.66666666666667</right-margin>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<top-margin>96.66666666666667</top-margin>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<bottom-margin>80</bottom-margin>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</page-margins>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</page-layout>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<system-layout>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<system-margins>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<left-margin>59.583333333333336</left-margin>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<right-margin>26.666666666666668</right-margin>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("</system-margins>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<system-distance>92.5</system-distance>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<top-system-distance>145.83333333333334</top-system-distance>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("</system-layout>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<staff-layout>");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("<staff-distance>55</staff-distance>");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("</staff-layout>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("</defaults>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<credit page=\"1\">");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("<credit-type>title</credit-type>");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("<credit-words font-size=\"24\" default-x=\"510\" default-y=\"1210\" justify=\"right\" valign=\"top\">");
    String _name_1 = this.composition.getName();
    _builder.append(_name_1, "              ");
    _builder.append("</credit-words>");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("</credit>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<credit page=\"1\">");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("<credit-type>subtitle</credit-type>");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("<credit-words font-size=\"12\" default-x=\"918\" default-y=\"1210\" justify=\"right\" valign=\"top\">");
    String _author = this.composition.getAuthor();
    _builder.append(_author, "              ");
    _builder.append("</credit-words>");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("</credit>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<part-list>");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("<score-part id=\"P1\">");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("<part-name>");
    String _instrument = this.composition.getInstrument();
    _builder.append(_instrument, "                ");
    _builder.append("</part-name>");
    _builder.newLineIfNotEmpty();
    _builder.append("                ");
    _builder.append("<part-abbreviation>Pno.</part-abbreviation>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("<score-instrument id=\"P1I1\">");
    _builder.newLine();
    _builder.append("                  ");
    _builder.append("<instrument-name>");
    String _instrument_1 = this.composition.getInstrument();
    _builder.append(_instrument_1, "                  ");
    _builder.append("</instrument-name>");
    _builder.newLineIfNotEmpty();
    _builder.append("                  ");
    _builder.append("<instrument-sound>keyboard.");
    String _lowerCase = this.composition.getInstrument().toLowerCase();
    _builder.append(_lowerCase, "                  ");
    _builder.append("</instrument-sound>");
    _builder.newLineIfNotEmpty();
    _builder.append("                  ");
    _builder.append("</score-instrument>");
    _builder.newLine();
    _builder.append("                  ");
    _builder.append("<midi-instrument id=\"P1I1\">");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("<midi-channel>1</midi-channel>");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("<midi-program>1</midi-program>");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("</midi-instrument>");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("</score-part>");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("</part-list>");
    _builder.newLine();
    _builder.append("                    ");
    CharSequence _generatePart = this.generatePart();
    _builder.append(_generatePart, "                    ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private int minMeasureCount(final Composition composition) {
    int min = Integer.MAX_VALUE;
    EList<Staff> _staff = composition.getStaff();
    for (final Staff staff : _staff) {
      {
        int measureCount = IterableExtensions.size(Iterables.<Measure>filter(staff.getElements(), Measure.class));
        if ((min > measureCount)) {
          min = measureCount;
        }
      }
    }
    return min;
  }
  
  private CharSequence generatePart() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<part id=\"P1\">");
    _builder.newLine();
    {
      IntegerRange _upTo = new IntegerRange(0, (this.minMeasureCount - 1));
      for(final Integer measureCounter : _upTo) {
        _builder.append("<measure number=\"");
        _builder.append(((measureCounter).intValue() + 1));
        _builder.append("\">");
        _builder.newLineIfNotEmpty();
        {
          if (((measureCounter).intValue() == 0)) {
            _builder.append("<attributes>");
            _builder.newLine();
            _builder.append("  ");
            _builder.append("<key>");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("<fifths>");
            int _fifths = this.composition.getStaff().get(0).getKey().getFifths();
            _builder.append(_fifths, "    ");
            _builder.append("</fifths>");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("<mode>major</mode>");
            _builder.newLine();
            _builder.append("  ");
            _builder.append("</key>");
            _builder.newLine();
            _builder.append("  ");
            _builder.append("<time print-object=\"yes\">");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("<beats>");
            int _beat = this.composition.getStaff().get(0).getTime().getBeat();
            _builder.append(_beat, "    ");
            _builder.append("</beats>");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("<beat-type>");
            int _beatType = this.composition.getStaff().get(0).getTime().getBeatType();
            _builder.append(_beatType, "    ");
            _builder.append("</beat-type>");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            _builder.append("</time>");
            _builder.newLine();
            _builder.append("  ");
            _builder.append("<staves>2</staves>");
            _builder.newLine();
            _builder.append("  ");
            _builder.append("<clef number=\"1\">");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("<sign>G</sign>");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("<line>2</line>");
            _builder.newLine();
            _builder.append("  ");
            _builder.append("</clef>");
            _builder.newLine();
            _builder.append("  ");
            _builder.append("<key>");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("<fifths>");
            int _fifths_1 = this.composition.getStaff().get(0).getKey().getFifths();
            _builder.append(_fifths_1, "    ");
            _builder.append("</fifths>");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("<mode>major</mode>");
            _builder.newLine();
            _builder.append("  ");
            _builder.append("</key>");
            _builder.newLine();
            _builder.append("  ");
            _builder.append("<clef number=\"2\">");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("<sign>F</sign>");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("<line>4</line>");
            _builder.newLine();
            _builder.append("  ");
            _builder.append("</clef>");
            _builder.newLine();
            _builder.append("</attributes>");
            _builder.newLine();
            _builder.append("  ");
            _builder.append("<sound/>");
            _builder.newLine();
            _builder.append("  ");
            _builder.append("<sound tempo=\"80\"/>");
            _builder.newLine();
          }
        }
        {
          EList<Staff> _staff = this.composition.getStaff();
          for(final Staff staff : _staff) {
            CharSequence _generateNotesForStaffMeasure = this.generateNotesForStaffMeasure((measureCounter).intValue(), staff);
            _builder.append(_generateNotesForStaffMeasure);
            _builder.newLineIfNotEmpty();
            CharSequence _generateRestsForStaffMeasure = this.generateRestsForStaffMeasure((measureCounter).intValue(), staff);
            _builder.append(_generateRestsForStaffMeasure);
            _builder.newLineIfNotEmpty();
            CharSequence _generateRepetitionsForStaffMeasure = this.generateRepetitionsForStaffMeasure((measureCounter).intValue(), staff);
            _builder.append(_generateRepetitionsForStaffMeasure);
            _builder.newLineIfNotEmpty();
            {
              int _indexOf = this.composition.getStaff().indexOf(staff);
              int _size = this.composition.getStaff().size();
              int _minus = (_size - 1);
              boolean _notEquals = (_indexOf != _minus);
              if (_notEquals) {
                _builder.append("<backup>");
                _builder.newLine();
                _builder.append(" ");
                _builder.append("<duration>256</duration>");
                _builder.newLine();
                _builder.append("</backup>");
                _builder.newLine();
                _builder.append("<attributes/>");
                _builder.newLine();
              }
            }
          }
        }
        _builder.append("</measure>");
        _builder.newLine();
      }
    }
    {
      EList<Staff> _staff_1 = this.composition.getStaff();
      for(final Staff staff_1 : _staff_1) {
        {
          int _size_1 = IterableExtensions.size(Iterables.<Measure>filter(staff_1.getElements(), Measure.class));
          boolean _greaterThan = (_size_1 > this.minMeasureCount);
          if (_greaterThan) {
            {
              int _size_2 = IterableExtensions.size(Iterables.<Measure>filter(staff_1.getElements(), Measure.class));
              int _minus_1 = (_size_2 - 1);
              IntegerRange _upTo_1 = new IntegerRange(this.minMeasureCount, _minus_1);
              for(final Integer measureCounter_1 : _upTo_1) {
                _builder.append(" ");
                _builder.append("<measure number=\"");
                _builder.append(((measureCounter_1).intValue() + 1), " ");
                _builder.append("\">");
                _builder.newLineIfNotEmpty();
                CharSequence _generateNotesForStaffMeasure_1 = this.generateNotesForStaffMeasure((measureCounter_1).intValue(), staff_1);
                _builder.append(_generateNotesForStaffMeasure_1);
                _builder.newLineIfNotEmpty();
                CharSequence _generateRestsForStaffMeasure_1 = this.generateRestsForStaffMeasure((measureCounter_1).intValue(), staff_1);
                _builder.append(_generateRestsForStaffMeasure_1);
                _builder.newLineIfNotEmpty();
                CharSequence _generateRepetitionsForStaffMeasure_1 = this.generateRepetitionsForStaffMeasure((measureCounter_1).intValue(), staff_1);
                _builder.append(_generateRepetitionsForStaffMeasure_1);
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.append("</part>");
    _builder.newLine();
    _builder.append("</score-partwise>");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence generateNotesForStaffMeasure(final int index, final Staff staff) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Note> _note = (((Measure[])Conversions.unwrapArray((Iterables.<Measure>filter(staff.getElements(), Measure.class)), Measure.class))[index]).getNote();
      for(final Note note : _note) {
        _builder.append("<note>");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("<pitch>");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("<step>");
        NoteName _name = note.getName();
        _builder.append(_name, "    ");
        _builder.append("</step>");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("<octave>");
        int _octave = note.getOctave();
        _builder.append(_octave, "    ");
        _builder.append("</octave>");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("</pitch>");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("<duration>");
        int _duration = note.getDuration();
        _builder.append(_duration, "  ");
        _builder.append("</duration>");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("<voice>");
        int _voice = note.getVoice();
        _builder.append(_voice, "  ");
        _builder.append("</voice>");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("<type>");
        NoteType _type = note.getType();
        _builder.append(_type, "  ");
        _builder.append("</type>");
        _builder.newLineIfNotEmpty();
        {
          boolean _isDot = note.isDot();
          boolean _equals = (_isDot == true);
          if (_equals) {
            _builder.append("<dot/>");
            _builder.newLine();
          }
        }
        {
          boolean _isFermata = note.isFermata();
          boolean _equals_1 = (_isFermata == true);
          if (_equals_1) {
            _builder.append("<fermata/>");
            _builder.newLine();
          }
        }
        _builder.append("  ");
        _builder.append("<staff>");
        int _indexOf = this.composition.getStaff().indexOf(staff);
        int _plus = (_indexOf + 1);
        _builder.append(_plus, "  ");
        _builder.append("</staff>");
        _builder.newLineIfNotEmpty();
        {
          int _size = note.getNotation().size();
          boolean _tripleNotEquals = (_size != 0);
          if (_tripleNotEquals) {
            _builder.append("<notations>");
            _builder.newLine();
            {
              EList<Notation> _notation = note.getNotation();
              for(final Notation n : _notation) {
                {
                  SlurType _slur = n.getSlur();
                  boolean _tripleNotEquals_1 = (_slur != null);
                  if (_tripleNotEquals_1) {
                    _builder.append("<tied type=\"");
                    SlurType _slur_1 = n.getSlur();
                    _builder.append(_slur_1);
                    _builder.append("\"/>");
                    _builder.newLineIfNotEmpty();
                  } else {
                    OrnamentType _ornament = n.getOrnament();
                    boolean _tripleNotEquals_2 = (_ornament != null);
                    if (_tripleNotEquals_2) {
                      _builder.append("<ornaments>");
                      OrnamentType _ornament_1 = n.getOrnament();
                      _builder.append(_ornament_1);
                      _builder.append("</ornaments>");
                      _builder.newLineIfNotEmpty();
                    } else {
                      ArticulationType _articulation = n.getArticulation();
                      boolean _tripleNotEquals_3 = (_articulation != null);
                      if (_tripleNotEquals_3) {
                        _builder.append("<articulation>");
                        ArticulationType _articulation_1 = n.getArticulation();
                        _builder.append(_articulation_1);
                        _builder.append("</articulation>");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  }
                }
              }
            }
            _builder.append("</notations>");
            _builder.newLine();
          }
        }
        {
          String _lyrics = note.getLyrics();
          boolean _tripleNotEquals_4 = (_lyrics != null);
          if (_tripleNotEquals_4) {
            _builder.append("<lyric number=\"1\" color=\"#000000\">");
            _builder.newLine();
            _builder.append("  ");
            _builder.append("<syllabic>single</syllabic>");
            _builder.newLine();
            _builder.append("  ");
            _builder.append("<text>");
            String _lyrics_1 = note.getLyrics();
            _builder.append(_lyrics_1, "  ");
            _builder.append("</text>");
            _builder.newLineIfNotEmpty();
            _builder.append("</lyric>");
            _builder.newLine();
          }
        }
        _builder.append("</note>");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  private CharSequence generateRestsForStaffMeasure(final int index, final Staff staff) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Rest> _rest = (((Measure[])Conversions.unwrapArray((Iterables.<Measure>filter(staff.getElements(), Measure.class)), Measure.class))[index]).getRest();
      for(final Rest rest : _rest) {
        _builder.append("<note>");
        _builder.newLine();
        {
          RestType _type = rest.getType();
          boolean _equals = Objects.equal(_type, RestType.WHOLE);
          if (_equals) {
            _builder.append("  ");
            _builder.append("<rest/>");
            _builder.newLine();
            _builder.append("  ");
            _builder.append("<duration>8</duration>");
            _builder.newLine();
          } else {
            RestType _type_1 = rest.getType();
            boolean _equals_1 = Objects.equal(_type_1, RestType.HALF);
            if (_equals_1) {
              _builder.append("  ");
              _builder.append("<rest/>");
              _builder.newLine();
              _builder.append("  ");
              _builder.append("<duration>4</duration>");
              _builder.newLine();
            } else {
              RestType _type_2 = rest.getType();
              boolean _equals_2 = Objects.equal(_type_2, RestType.QUARTER);
              if (_equals_2) {
                _builder.append("  ");
                _builder.append("<rest/>");
                _builder.newLine();
                _builder.append("  ");
                _builder.append("<duration>2</duration>");
                _builder.newLine();
              } else {
                RestType _type_3 = rest.getType();
                boolean _equals_3 = Objects.equal(_type_3, RestType.EIGHTH);
                if (_equals_3) {
                  _builder.append("  ");
                  _builder.append("<rest/>");
                  _builder.newLine();
                  _builder.append("  ");
                  _builder.append("<duration>1</duration>");
                  _builder.newLine();
                }
              }
            }
          }
        }
        {
          int _indexOf = this.composition.getStaff().indexOf(staff);
          int _plus = (_indexOf + 1);
          boolean _equals_4 = (_plus == 1);
          if (_equals_4) {
            _builder.append("  ");
            _builder.append("<voice>1</voice>");
            _builder.newLine();
          } else {
            int _indexOf_1 = this.composition.getStaff().indexOf(staff);
            int _plus_1 = (_indexOf_1 + 1);
            boolean _equals_5 = (_plus_1 == 2);
            if (_equals_5) {
              _builder.append("  ");
              _builder.append("<voice>2</voice>");
              _builder.newLine();
            }
          }
        }
        _builder.append("  ");
        _builder.append("<type>");
        RestType _type_4 = rest.getType();
        _builder.append(_type_4, "  ");
        _builder.append("</type>");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("<staff>");
        int _indexOf_2 = this.composition.getStaff().indexOf(staff);
        int _plus_2 = (_indexOf_2 + 1);
        _builder.append(_plus_2, "  ");
        _builder.append("</staff>");
        _builder.newLineIfNotEmpty();
        _builder.append("</note>");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  private CharSequence generateRepetitionsForStaffMeasure(final int index, final Staff staff) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Repetition> _repetition = (((Measure[])Conversions.unwrapArray((Iterables.<Measure>filter(staff.getElements(), Measure.class)), Measure.class))[index]).getRepetition();
      for(final Repetition repetition : _repetition) {
        _builder.append("<barline location=\"right\">");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("<bar-style>light-heavy</bar-style>");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("<repeat times=\"2\" winged=\"none\" direction=\"");
        RepetitionType _type = repetition.getType();
        _builder.append(_type, "  ");
        _builder.append("\"/>");
        _builder.newLineIfNotEmpty();
        _builder.append("</barline>");
        _builder.newLine();
      }
    }
    return _builder;
  }
}
