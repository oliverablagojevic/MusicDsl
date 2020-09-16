/**
 */
package musicMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link musicMetamodel.Note#getName <em>Name</em>}</li>
 *   <li>{@link musicMetamodel.Note#getType <em>Type</em>}</li>
 *   <li>{@link musicMetamodel.Note#getDuration <em>Duration</em>}</li>
 *   <li>{@link musicMetamodel.Note#getOctave <em>Octave</em>}</li>
 *   <li>{@link musicMetamodel.Note#getVoice <em>Voice</em>}</li>
 *   <li>{@link musicMetamodel.Note#getDynamic <em>Dynamic</em>}</li>
 *   <li>{@link musicMetamodel.Note#isFermata <em>Fermata</em>}</li>
 *   <li>{@link musicMetamodel.Note#isDot <em>Dot</em>}</li>
 *   <li>{@link musicMetamodel.Note#getAccidental <em>Accidental</em>}</li>
 *   <li>{@link musicMetamodel.Note#getNotation <em>Notation</em>}</li>
 *   <li>{@link musicMetamodel.Note#getLyrics <em>Lyrics</em>}</li>
 *   <li>{@link musicMetamodel.Note#isChord <em>Chord</em>}</li>
 * </ul>
 *
 * @see musicMetamodel.MusicMetamodelPackage#getNote()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OctaveLessThan VoiceNumber fermataTrueImpliesDotFalse dotTrueImpliesFermataFalse'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot OctaveLessThan='self.octave &lt;= 8' VoiceNumber='self.voice = 1 or self.voice = 2' fermataTrueImpliesDotFalse='self.fermata = true implies self.dot = false' dotTrueImpliesFermataFalse='self.dot = true implies self.fermata = false'"
 * @generated
 */
public interface Note extends StaffElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link musicMetamodel.NoteName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see musicMetamodel.NoteName
	 * @see #setName(NoteName)
	 * @see musicMetamodel.MusicMetamodelPackage#getNote_Name()
	 * @model
	 * @generated
	 */
	NoteName getName();

	/**
	 * Sets the value of the '{@link musicMetamodel.Note#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see musicMetamodel.NoteName
	 * @see #getName()
	 * @generated
	 */
	void setName(NoteName value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link musicMetamodel.NoteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see musicMetamodel.NoteType
	 * @see #setType(NoteType)
	 * @see musicMetamodel.MusicMetamodelPackage#getNote_Type()
	 * @model
	 * @generated
	 */
	NoteType getType();

	/**
	 * Sets the value of the '{@link musicMetamodel.Note#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see musicMetamodel.NoteType
	 * @see #getType()
	 * @generated
	 */
	void setType(NoteType value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see musicMetamodel.MusicMetamodelPackage#getNote_Duration()
	 * @model required="true"
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link musicMetamodel.Note#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Octave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Octave</em>' attribute.
	 * @see #setOctave(int)
	 * @see musicMetamodel.MusicMetamodelPackage#getNote_Octave()
	 * @model required="true"
	 * @generated
	 */
	int getOctave();

	/**
	 * Sets the value of the '{@link musicMetamodel.Note#getOctave <em>Octave</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Octave</em>' attribute.
	 * @see #getOctave()
	 * @generated
	 */
	void setOctave(int value);

	/**
	 * Returns the value of the '<em><b>Voice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voice</em>' attribute.
	 * @see #setVoice(int)
	 * @see musicMetamodel.MusicMetamodelPackage#getNote_Voice()
	 * @model required="true"
	 * @generated
	 */
	int getVoice();

	/**
	 * Sets the value of the '{@link musicMetamodel.Note#getVoice <em>Voice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voice</em>' attribute.
	 * @see #getVoice()
	 * @generated
	 */
	void setVoice(int value);

	/**
	 * Returns the value of the '<em><b>Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic</em>' attribute.
	 * @see #setDynamic(String)
	 * @see musicMetamodel.MusicMetamodelPackage#getNote_Dynamic()
	 * @model
	 * @generated
	 */
	String getDynamic();

	/**
	 * Sets the value of the '{@link musicMetamodel.Note#getDynamic <em>Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic</em>' attribute.
	 * @see #getDynamic()
	 * @generated
	 */
	void setDynamic(String value);

	/**
	 * Returns the value of the '<em><b>Fermata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fermata</em>' attribute.
	 * @see #setFermata(boolean)
	 * @see musicMetamodel.MusicMetamodelPackage#getNote_Fermata()
	 * @model required="true"
	 * @generated
	 */
	boolean isFermata();

	/**
	 * Sets the value of the '{@link musicMetamodel.Note#isFermata <em>Fermata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fermata</em>' attribute.
	 * @see #isFermata()
	 * @generated
	 */
	void setFermata(boolean value);

	/**
	 * Returns the value of the '<em><b>Dot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dot</em>' attribute.
	 * @see #setDot(boolean)
	 * @see musicMetamodel.MusicMetamodelPackage#getNote_Dot()
	 * @model required="true"
	 * @generated
	 */
	boolean isDot();

	/**
	 * Sets the value of the '{@link musicMetamodel.Note#isDot <em>Dot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dot</em>' attribute.
	 * @see #isDot()
	 * @generated
	 */
	void setDot(boolean value);

	/**
	 * Returns the value of the '<em><b>Accidental</b></em>' attribute.
	 * The literals are from the enumeration {@link musicMetamodel.AccidentalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accidental</em>' attribute.
	 * @see musicMetamodel.AccidentalType
	 * @see #setAccidental(AccidentalType)
	 * @see musicMetamodel.MusicMetamodelPackage#getNote_Accidental()
	 * @model
	 * @generated
	 */
	AccidentalType getAccidental();

	/**
	 * Sets the value of the '{@link musicMetamodel.Note#getAccidental <em>Accidental</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accidental</em>' attribute.
	 * @see musicMetamodel.AccidentalType
	 * @see #getAccidental()
	 * @generated
	 */
	void setAccidental(AccidentalType value);

	/**
	 * Returns the value of the '<em><b>Notation</b></em>' containment reference list.
	 * The list contents are of type {@link musicMetamodel.Notation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notation</em>' containment reference list.
	 * @see musicMetamodel.MusicMetamodelPackage#getNote_Notation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Notation> getNotation();

	/**
	 * Returns the value of the '<em><b>Lyrics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lyrics</em>' attribute.
	 * @see #setLyrics(String)
	 * @see musicMetamodel.MusicMetamodelPackage#getNote_Lyrics()
	 * @model
	 * @generated
	 */
	String getLyrics();

	/**
	 * Sets the value of the '{@link musicMetamodel.Note#getLyrics <em>Lyrics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lyrics</em>' attribute.
	 * @see #getLyrics()
	 * @generated
	 */
	void setLyrics(String value);

	/**
	 * Returns the value of the '<em><b>Chord</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chord</em>' attribute.
	 * @see #setChord(boolean)
	 * @see musicMetamodel.MusicMetamodelPackage#getNote_Chord()
	 * @model
	 * @generated
	 */
	boolean isChord();

	/**
	 * Sets the value of the '{@link musicMetamodel.Note#isChord <em>Chord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chord</em>' attribute.
	 * @see #isChord()
	 * @generated
	 */
	void setChord(boolean value);

} // Note
