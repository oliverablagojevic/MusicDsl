/**
 */
package musicMetamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see musicMetamodel.MusicMetamodelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface MusicMetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "musicMetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/musicMetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "musicMetamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MusicMetamodelPackage eINSTANCE = musicMetamodel.impl.MusicMetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link musicMetamodel.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicMetamodel.impl.CompositionImpl
	 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__AUTHOR = 1;

	/**
	 * The feature id for the '<em><b>Instrument</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__INSTRUMENT = 2;

	/**
	 * The feature id for the '<em><b>Tonality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__TONALITY = 3;

	/**
	 * The feature id for the '<em><b>Sound Tempo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__SOUND_TEMPO = 4;

	/**
	 * The feature id for the '<em><b>Staff</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__STAFF = 5;

	/**
	 * The number of structural features of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link musicMetamodel.impl.StaffImpl <em>Staff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicMetamodel.impl.StaffImpl
	 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getStaff()
	 * @generated
	 */
	int STAFF = 1;

	/**
	 * The feature id for the '<em><b>Staff Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__STAFF_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Clef</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__CLEF = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__TIME = 2;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__ELEMENTS = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__KEY = 4;

	/**
	 * The number of structural features of the '<em>Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link musicMetamodel.impl.ClefImpl <em>Clef</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicMetamodel.impl.ClefImpl
	 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getClef()
	 * @generated
	 */
	int CLEF = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEF__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Clef</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Clef</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link musicMetamodel.impl.TimeSignatureImpl <em>Time Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicMetamodel.impl.TimeSignatureImpl
	 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getTimeSignature()
	 * @generated
	 */
	int TIME_SIGNATURE = 3;

	/**
	 * The feature id for the '<em><b>Beat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SIGNATURE__BEAT = 0;

	/**
	 * The feature id for the '<em><b>Beat Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SIGNATURE__BEAT_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Time Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SIGNATURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Time Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SIGNATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link musicMetamodel.impl.StaffElementImpl <em>Staff Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicMetamodel.impl.StaffElementImpl
	 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getStaffElement()
	 * @generated
	 */
	int STAFF_ELEMENT = 4;

	/**
	 * The number of structural features of the '<em>Staff Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Staff Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link musicMetamodel.impl.MeasureImpl <em>Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicMetamodel.impl.MeasureImpl
	 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getMeasure()
	 * @generated
	 */
	int MEASURE = 5;

	/**
	 * The feature id for the '<em><b>Measure Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__MEASURE_NUMBER = STAFF_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repetition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__REPETITION = STAFF_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__NOTE = STAFF_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rest</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__REST = STAFF_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FEATURE_COUNT = STAFF_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_OPERATION_COUNT = STAFF_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link musicMetamodel.impl.RestImpl <em>Rest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicMetamodel.impl.RestImpl
	 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getRest()
	 * @generated
	 */
	int REST = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST__TYPE = STAFF_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_FEATURE_COUNT = STAFF_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_OPERATION_COUNT = STAFF_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link musicMetamodel.impl.RepetitionImpl <em>Repetition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicMetamodel.impl.RepetitionImpl
	 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getRepetition()
	 * @generated
	 */
	int REPETITION = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION__TYPE = STAFF_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Repetition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION_FEATURE_COUNT = STAFF_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Repetition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION_OPERATION_COUNT = STAFF_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link musicMetamodel.impl.NoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicMetamodel.impl.NoteImpl
	 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getNote()
	 * @generated
	 */
	int NOTE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__NAME = STAFF_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__TYPE = STAFF_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__DURATION = STAFF_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Octave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__OCTAVE = STAFF_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Voice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__VOICE = STAFF_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__DYNAMIC = STAFF_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fermata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__FERMATA = STAFF_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Dot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__DOT = STAFF_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Accidental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__ACCIDENTAL = STAFF_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Notation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__NOTATION = STAFF_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Lyrics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__LYRICS = STAFF_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Chord</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__CHORD = STAFF_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_FEATURE_COUNT = STAFF_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OPERATION_COUNT = STAFF_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link musicMetamodel.impl.NotationImpl <em>Notation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicMetamodel.impl.NotationImpl
	 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getNotation()
	 * @generated
	 */
	int NOTATION = 9;

	/**
	 * The feature id for the '<em><b>Articulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION__ARTICULATION = 0;

	/**
	 * The feature id for the '<em><b>Ornament</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION__ORNAMENT = 1;

	/**
	 * The feature id for the '<em><b>Slur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION__SLUR = 2;

	/**
	 * The number of structural features of the '<em>Notation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Notation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link musicMetamodel.impl.KeyImpl <em>Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicMetamodel.impl.KeyImpl
	 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getKey()
	 * @generated
	 */
	int KEY = 10;

	/**
	 * The feature id for the '<em><b>Fifths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__FIFTHS = 0;

	/**
	 * The number of structural features of the '<em>Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link musicMetamodel.RestType <em>Rest Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicMetamodel.RestType
	 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getRestType()
	 * @generated
	 */
	int REST_TYPE = 11;

	/**
	 * The meta object id for the '{@link musicMetamodel.RepetitionType <em>Repetition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicMetamodel.RepetitionType
	 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getRepetitionType()
	 * @generated
	 */
	int REPETITION_TYPE = 12;

	/**
	 * The meta object id for the '{@link musicMetamodel.AccidentalType <em>Accidental Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicMetamodel.AccidentalType
	 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getAccidentalType()
	 * @generated
	 */
	int ACCIDENTAL_TYPE = 13;

	/**
	 * The meta object id for the '{@link musicMetamodel.OrnamentType <em>Ornament Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicMetamodel.OrnamentType
	 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getOrnamentType()
	 * @generated
	 */
	int ORNAMENT_TYPE = 14;

	/**
	 * The meta object id for the '{@link musicMetamodel.NoteType <em>Note Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicMetamodel.NoteType
	 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getNoteType()
	 * @generated
	 */
	int NOTE_TYPE = 15;

	/**
	 * The meta object id for the '{@link musicMetamodel.NoteName <em>Note Name</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicMetamodel.NoteName
	 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getNoteName()
	 * @generated
	 */
	int NOTE_NAME = 16;

	/**
	 * The meta object id for the '{@link musicMetamodel.ArticulationType <em>Articulation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicMetamodel.ArticulationType
	 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getArticulationType()
	 * @generated
	 */
	int ARTICULATION_TYPE = 17;

	/**
	 * The meta object id for the '{@link musicMetamodel.ClefType <em>Clef Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicMetamodel.ClefType
	 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getClefType()
	 * @generated
	 */
	int CLEF_TYPE = 18;

	/**
	 * The meta object id for the '{@link musicMetamodel.SlurType <em>Slur Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicMetamodel.SlurType
	 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getSlurType()
	 * @generated
	 */
	int SLUR_TYPE = 19;

	/**
	 * Returns the meta object for class '{@link musicMetamodel.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see musicMetamodel.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for the attribute '{@link musicMetamodel.Composition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see musicMetamodel.Composition#getName()
	 * @see #getComposition()
	 * @generated
	 */
	EAttribute getComposition_Name();

	/**
	 * Returns the meta object for the attribute '{@link musicMetamodel.Composition#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see musicMetamodel.Composition#getAuthor()
	 * @see #getComposition()
	 * @generated
	 */
	EAttribute getComposition_Author();

	/**
	 * Returns the meta object for the attribute '{@link musicMetamodel.Composition#getInstrument <em>Instrument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instrument</em>'.
	 * @see musicMetamodel.Composition#getInstrument()
	 * @see #getComposition()
	 * @generated
	 */
	EAttribute getComposition_Instrument();

	/**
	 * Returns the meta object for the attribute '{@link musicMetamodel.Composition#getTonality <em>Tonality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tonality</em>'.
	 * @see musicMetamodel.Composition#getTonality()
	 * @see #getComposition()
	 * @generated
	 */
	EAttribute getComposition_Tonality();

	/**
	 * Returns the meta object for the attribute '{@link musicMetamodel.Composition#getSoundTempo <em>Sound Tempo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sound Tempo</em>'.
	 * @see musicMetamodel.Composition#getSoundTempo()
	 * @see #getComposition()
	 * @generated
	 */
	EAttribute getComposition_SoundTempo();

	/**
	 * Returns the meta object for the containment reference list '{@link musicMetamodel.Composition#getStaff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Staff</em>'.
	 * @see musicMetamodel.Composition#getStaff()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Staff();

	/**
	 * Returns the meta object for class '{@link musicMetamodel.Staff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff</em>'.
	 * @see musicMetamodel.Staff
	 * @generated
	 */
	EClass getStaff();

	/**
	 * Returns the meta object for the attribute '{@link musicMetamodel.Staff#getStaffNumber <em>Staff Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Staff Number</em>'.
	 * @see musicMetamodel.Staff#getStaffNumber()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_StaffNumber();

	/**
	 * Returns the meta object for the containment reference '{@link musicMetamodel.Staff#getClef <em>Clef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clef</em>'.
	 * @see musicMetamodel.Staff#getClef()
	 * @see #getStaff()
	 * @generated
	 */
	EReference getStaff_Clef();

	/**
	 * Returns the meta object for the containment reference '{@link musicMetamodel.Staff#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see musicMetamodel.Staff#getTime()
	 * @see #getStaff()
	 * @generated
	 */
	EReference getStaff_Time();

	/**
	 * Returns the meta object for the containment reference list '{@link musicMetamodel.Staff#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see musicMetamodel.Staff#getElements()
	 * @see #getStaff()
	 * @generated
	 */
	EReference getStaff_Elements();

	/**
	 * Returns the meta object for the containment reference '{@link musicMetamodel.Staff#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see musicMetamodel.Staff#getKey()
	 * @see #getStaff()
	 * @generated
	 */
	EReference getStaff_Key();

	/**
	 * Returns the meta object for class '{@link musicMetamodel.Clef <em>Clef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clef</em>'.
	 * @see musicMetamodel.Clef
	 * @generated
	 */
	EClass getClef();

	/**
	 * Returns the meta object for the attribute '{@link musicMetamodel.Clef#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see musicMetamodel.Clef#getType()
	 * @see #getClef()
	 * @generated
	 */
	EAttribute getClef_Type();

	/**
	 * Returns the meta object for class '{@link musicMetamodel.TimeSignature <em>Time Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Signature</em>'.
	 * @see musicMetamodel.TimeSignature
	 * @generated
	 */
	EClass getTimeSignature();

	/**
	 * Returns the meta object for the attribute '{@link musicMetamodel.TimeSignature#getBeat <em>Beat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beat</em>'.
	 * @see musicMetamodel.TimeSignature#getBeat()
	 * @see #getTimeSignature()
	 * @generated
	 */
	EAttribute getTimeSignature_Beat();

	/**
	 * Returns the meta object for the attribute '{@link musicMetamodel.TimeSignature#getBeatType <em>Beat Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beat Type</em>'.
	 * @see musicMetamodel.TimeSignature#getBeatType()
	 * @see #getTimeSignature()
	 * @generated
	 */
	EAttribute getTimeSignature_BeatType();

	/**
	 * Returns the meta object for class '{@link musicMetamodel.StaffElement <em>Staff Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff Element</em>'.
	 * @see musicMetamodel.StaffElement
	 * @generated
	 */
	EClass getStaffElement();

	/**
	 * Returns the meta object for class '{@link musicMetamodel.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure</em>'.
	 * @see musicMetamodel.Measure
	 * @generated
	 */
	EClass getMeasure();

	/**
	 * Returns the meta object for the attribute '{@link musicMetamodel.Measure#getMeasureNumber <em>Measure Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measure Number</em>'.
	 * @see musicMetamodel.Measure#getMeasureNumber()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_MeasureNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link musicMetamodel.Measure#getRepetition <em>Repetition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repetition</em>'.
	 * @see musicMetamodel.Measure#getRepetition()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_Repetition();

	/**
	 * Returns the meta object for the containment reference list '{@link musicMetamodel.Measure#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Note</em>'.
	 * @see musicMetamodel.Measure#getNote()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_Note();

	/**
	 * Returns the meta object for the containment reference list '{@link musicMetamodel.Measure#getRest <em>Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rest</em>'.
	 * @see musicMetamodel.Measure#getRest()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_Rest();

	/**
	 * Returns the meta object for class '{@link musicMetamodel.Rest <em>Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rest</em>'.
	 * @see musicMetamodel.Rest
	 * @generated
	 */
	EClass getRest();

	/**
	 * Returns the meta object for the attribute '{@link musicMetamodel.Rest#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see musicMetamodel.Rest#getType()
	 * @see #getRest()
	 * @generated
	 */
	EAttribute getRest_Type();

	/**
	 * Returns the meta object for class '{@link musicMetamodel.Repetition <em>Repetition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repetition</em>'.
	 * @see musicMetamodel.Repetition
	 * @generated
	 */
	EClass getRepetition();

	/**
	 * Returns the meta object for the attribute '{@link musicMetamodel.Repetition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see musicMetamodel.Repetition#getType()
	 * @see #getRepetition()
	 * @generated
	 */
	EAttribute getRepetition_Type();

	/**
	 * Returns the meta object for class '{@link musicMetamodel.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see musicMetamodel.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for the attribute '{@link musicMetamodel.Note#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see musicMetamodel.Note#getName()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Name();

	/**
	 * Returns the meta object for the attribute '{@link musicMetamodel.Note#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see musicMetamodel.Note#getType()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Type();

	/**
	 * Returns the meta object for the attribute '{@link musicMetamodel.Note#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see musicMetamodel.Note#getDuration()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Duration();

	/**
	 * Returns the meta object for the attribute '{@link musicMetamodel.Note#getOctave <em>Octave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Octave</em>'.
	 * @see musicMetamodel.Note#getOctave()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Octave();

	/**
	 * Returns the meta object for the attribute '{@link musicMetamodel.Note#getVoice <em>Voice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voice</em>'.
	 * @see musicMetamodel.Note#getVoice()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Voice();

	/**
	 * Returns the meta object for the attribute '{@link musicMetamodel.Note#getDynamic <em>Dynamic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamic</em>'.
	 * @see musicMetamodel.Note#getDynamic()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Dynamic();

	/**
	 * Returns the meta object for the attribute '{@link musicMetamodel.Note#isFermata <em>Fermata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fermata</em>'.
	 * @see musicMetamodel.Note#isFermata()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Fermata();

	/**
	 * Returns the meta object for the attribute '{@link musicMetamodel.Note#isDot <em>Dot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dot</em>'.
	 * @see musicMetamodel.Note#isDot()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Dot();

	/**
	 * Returns the meta object for the attribute '{@link musicMetamodel.Note#getAccidental <em>Accidental</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accidental</em>'.
	 * @see musicMetamodel.Note#getAccidental()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Accidental();

	/**
	 * Returns the meta object for the containment reference list '{@link musicMetamodel.Note#getNotation <em>Notation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notation</em>'.
	 * @see musicMetamodel.Note#getNotation()
	 * @see #getNote()
	 * @generated
	 */
	EReference getNote_Notation();

	/**
	 * Returns the meta object for the attribute '{@link musicMetamodel.Note#getLyrics <em>Lyrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lyrics</em>'.
	 * @see musicMetamodel.Note#getLyrics()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Lyrics();

	/**
	 * Returns the meta object for the attribute '{@link musicMetamodel.Note#isChord <em>Chord</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chord</em>'.
	 * @see musicMetamodel.Note#isChord()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Chord();

	/**
	 * Returns the meta object for class '{@link musicMetamodel.Notation <em>Notation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notation</em>'.
	 * @see musicMetamodel.Notation
	 * @generated
	 */
	EClass getNotation();

	/**
	 * Returns the meta object for the attribute '{@link musicMetamodel.Notation#getArticulation <em>Articulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Articulation</em>'.
	 * @see musicMetamodel.Notation#getArticulation()
	 * @see #getNotation()
	 * @generated
	 */
	EAttribute getNotation_Articulation();

	/**
	 * Returns the meta object for the attribute '{@link musicMetamodel.Notation#getOrnament <em>Ornament</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ornament</em>'.
	 * @see musicMetamodel.Notation#getOrnament()
	 * @see #getNotation()
	 * @generated
	 */
	EAttribute getNotation_Ornament();

	/**
	 * Returns the meta object for the attribute '{@link musicMetamodel.Notation#getSlur <em>Slur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slur</em>'.
	 * @see musicMetamodel.Notation#getSlur()
	 * @see #getNotation()
	 * @generated
	 */
	EAttribute getNotation_Slur();

	/**
	 * Returns the meta object for class '{@link musicMetamodel.Key <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key</em>'.
	 * @see musicMetamodel.Key
	 * @generated
	 */
	EClass getKey();

	/**
	 * Returns the meta object for the attribute '{@link musicMetamodel.Key#getFifths <em>Fifths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fifths</em>'.
	 * @see musicMetamodel.Key#getFifths()
	 * @see #getKey()
	 * @generated
	 */
	EAttribute getKey_Fifths();

	/**
	 * Returns the meta object for enum '{@link musicMetamodel.RestType <em>Rest Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rest Type</em>'.
	 * @see musicMetamodel.RestType
	 * @generated
	 */
	EEnum getRestType();

	/**
	 * Returns the meta object for enum '{@link musicMetamodel.RepetitionType <em>Repetition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Repetition Type</em>'.
	 * @see musicMetamodel.RepetitionType
	 * @generated
	 */
	EEnum getRepetitionType();

	/**
	 * Returns the meta object for enum '{@link musicMetamodel.AccidentalType <em>Accidental Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Accidental Type</em>'.
	 * @see musicMetamodel.AccidentalType
	 * @generated
	 */
	EEnum getAccidentalType();

	/**
	 * Returns the meta object for enum '{@link musicMetamodel.OrnamentType <em>Ornament Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ornament Type</em>'.
	 * @see musicMetamodel.OrnamentType
	 * @generated
	 */
	EEnum getOrnamentType();

	/**
	 * Returns the meta object for enum '{@link musicMetamodel.NoteType <em>Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Note Type</em>'.
	 * @see musicMetamodel.NoteType
	 * @generated
	 */
	EEnum getNoteType();

	/**
	 * Returns the meta object for enum '{@link musicMetamodel.NoteName <em>Note Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Note Name</em>'.
	 * @see musicMetamodel.NoteName
	 * @generated
	 */
	EEnum getNoteName();

	/**
	 * Returns the meta object for enum '{@link musicMetamodel.ArticulationType <em>Articulation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Articulation Type</em>'.
	 * @see musicMetamodel.ArticulationType
	 * @generated
	 */
	EEnum getArticulationType();

	/**
	 * Returns the meta object for enum '{@link musicMetamodel.ClefType <em>Clef Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Clef Type</em>'.
	 * @see musicMetamodel.ClefType
	 * @generated
	 */
	EEnum getClefType();

	/**
	 * Returns the meta object for enum '{@link musicMetamodel.SlurType <em>Slur Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Slur Type</em>'.
	 * @see musicMetamodel.SlurType
	 * @generated
	 */
	EEnum getSlurType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MusicMetamodelFactory getMusicMetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link musicMetamodel.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicMetamodel.impl.CompositionImpl
		 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getComposition()
		 * @generated
		 */
		EClass COMPOSITION = eINSTANCE.getComposition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITION__NAME = eINSTANCE.getComposition_Name();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITION__AUTHOR = eINSTANCE.getComposition_Author();

		/**
		 * The meta object literal for the '<em><b>Instrument</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITION__INSTRUMENT = eINSTANCE.getComposition_Instrument();

		/**
		 * The meta object literal for the '<em><b>Tonality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITION__TONALITY = eINSTANCE.getComposition_Tonality();

		/**
		 * The meta object literal for the '<em><b>Sound Tempo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITION__SOUND_TEMPO = eINSTANCE.getComposition_SoundTempo();

		/**
		 * The meta object literal for the '<em><b>Staff</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION__STAFF = eINSTANCE.getComposition_Staff();

		/**
		 * The meta object literal for the '{@link musicMetamodel.impl.StaffImpl <em>Staff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicMetamodel.impl.StaffImpl
		 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getStaff()
		 * @generated
		 */
		EClass STAFF = eINSTANCE.getStaff();

		/**
		 * The meta object literal for the '<em><b>Staff Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__STAFF_NUMBER = eINSTANCE.getStaff_StaffNumber();

		/**
		 * The meta object literal for the '<em><b>Clef</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF__CLEF = eINSTANCE.getStaff_Clef();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF__TIME = eINSTANCE.getStaff_Time();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF__ELEMENTS = eINSTANCE.getStaff_Elements();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF__KEY = eINSTANCE.getStaff_Key();

		/**
		 * The meta object literal for the '{@link musicMetamodel.impl.ClefImpl <em>Clef</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicMetamodel.impl.ClefImpl
		 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getClef()
		 * @generated
		 */
		EClass CLEF = eINSTANCE.getClef();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLEF__TYPE = eINSTANCE.getClef_Type();

		/**
		 * The meta object literal for the '{@link musicMetamodel.impl.TimeSignatureImpl <em>Time Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicMetamodel.impl.TimeSignatureImpl
		 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getTimeSignature()
		 * @generated
		 */
		EClass TIME_SIGNATURE = eINSTANCE.getTimeSignature();

		/**
		 * The meta object literal for the '<em><b>Beat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SIGNATURE__BEAT = eINSTANCE.getTimeSignature_Beat();

		/**
		 * The meta object literal for the '<em><b>Beat Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SIGNATURE__BEAT_TYPE = eINSTANCE.getTimeSignature_BeatType();

		/**
		 * The meta object literal for the '{@link musicMetamodel.impl.StaffElementImpl <em>Staff Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicMetamodel.impl.StaffElementImpl
		 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getStaffElement()
		 * @generated
		 */
		EClass STAFF_ELEMENT = eINSTANCE.getStaffElement();

		/**
		 * The meta object literal for the '{@link musicMetamodel.impl.MeasureImpl <em>Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicMetamodel.impl.MeasureImpl
		 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getMeasure()
		 * @generated
		 */
		EClass MEASURE = eINSTANCE.getMeasure();

		/**
		 * The meta object literal for the '<em><b>Measure Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__MEASURE_NUMBER = eINSTANCE.getMeasure_MeasureNumber();

		/**
		 * The meta object literal for the '<em><b>Repetition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__REPETITION = eINSTANCE.getMeasure_Repetition();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__NOTE = eINSTANCE.getMeasure_Note();

		/**
		 * The meta object literal for the '<em><b>Rest</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__REST = eINSTANCE.getMeasure_Rest();

		/**
		 * The meta object literal for the '{@link musicMetamodel.impl.RestImpl <em>Rest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicMetamodel.impl.RestImpl
		 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getRest()
		 * @generated
		 */
		EClass REST = eINSTANCE.getRest();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST__TYPE = eINSTANCE.getRest_Type();

		/**
		 * The meta object literal for the '{@link musicMetamodel.impl.RepetitionImpl <em>Repetition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicMetamodel.impl.RepetitionImpl
		 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getRepetition()
		 * @generated
		 */
		EClass REPETITION = eINSTANCE.getRepetition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPETITION__TYPE = eINSTANCE.getRepetition_Type();

		/**
		 * The meta object literal for the '{@link musicMetamodel.impl.NoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicMetamodel.impl.NoteImpl
		 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getNote()
		 * @generated
		 */
		EClass NOTE = eINSTANCE.getNote();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__NAME = eINSTANCE.getNote_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__TYPE = eINSTANCE.getNote_Type();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__DURATION = eINSTANCE.getNote_Duration();

		/**
		 * The meta object literal for the '<em><b>Octave</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__OCTAVE = eINSTANCE.getNote_Octave();

		/**
		 * The meta object literal for the '<em><b>Voice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__VOICE = eINSTANCE.getNote_Voice();

		/**
		 * The meta object literal for the '<em><b>Dynamic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__DYNAMIC = eINSTANCE.getNote_Dynamic();

		/**
		 * The meta object literal for the '<em><b>Fermata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__FERMATA = eINSTANCE.getNote_Fermata();

		/**
		 * The meta object literal for the '<em><b>Dot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__DOT = eINSTANCE.getNote_Dot();

		/**
		 * The meta object literal for the '<em><b>Accidental</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__ACCIDENTAL = eINSTANCE.getNote_Accidental();

		/**
		 * The meta object literal for the '<em><b>Notation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTE__NOTATION = eINSTANCE.getNote_Notation();

		/**
		 * The meta object literal for the '<em><b>Lyrics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__LYRICS = eINSTANCE.getNote_Lyrics();

		/**
		 * The meta object literal for the '<em><b>Chord</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__CHORD = eINSTANCE.getNote_Chord();

		/**
		 * The meta object literal for the '{@link musicMetamodel.impl.NotationImpl <em>Notation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicMetamodel.impl.NotationImpl
		 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getNotation()
		 * @generated
		 */
		EClass NOTATION = eINSTANCE.getNotation();

		/**
		 * The meta object literal for the '<em><b>Articulation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTATION__ARTICULATION = eINSTANCE.getNotation_Articulation();

		/**
		 * The meta object literal for the '<em><b>Ornament</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTATION__ORNAMENT = eINSTANCE.getNotation_Ornament();

		/**
		 * The meta object literal for the '<em><b>Slur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTATION__SLUR = eINSTANCE.getNotation_Slur();

		/**
		 * The meta object literal for the '{@link musicMetamodel.impl.KeyImpl <em>Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicMetamodel.impl.KeyImpl
		 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getKey()
		 * @generated
		 */
		EClass KEY = eINSTANCE.getKey();

		/**
		 * The meta object literal for the '<em><b>Fifths</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY__FIFTHS = eINSTANCE.getKey_Fifths();

		/**
		 * The meta object literal for the '{@link musicMetamodel.RestType <em>Rest Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicMetamodel.RestType
		 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getRestType()
		 * @generated
		 */
		EEnum REST_TYPE = eINSTANCE.getRestType();

		/**
		 * The meta object literal for the '{@link musicMetamodel.RepetitionType <em>Repetition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicMetamodel.RepetitionType
		 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getRepetitionType()
		 * @generated
		 */
		EEnum REPETITION_TYPE = eINSTANCE.getRepetitionType();

		/**
		 * The meta object literal for the '{@link musicMetamodel.AccidentalType <em>Accidental Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicMetamodel.AccidentalType
		 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getAccidentalType()
		 * @generated
		 */
		EEnum ACCIDENTAL_TYPE = eINSTANCE.getAccidentalType();

		/**
		 * The meta object literal for the '{@link musicMetamodel.OrnamentType <em>Ornament Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicMetamodel.OrnamentType
		 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getOrnamentType()
		 * @generated
		 */
		EEnum ORNAMENT_TYPE = eINSTANCE.getOrnamentType();

		/**
		 * The meta object literal for the '{@link musicMetamodel.NoteType <em>Note Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicMetamodel.NoteType
		 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getNoteType()
		 * @generated
		 */
		EEnum NOTE_TYPE = eINSTANCE.getNoteType();

		/**
		 * The meta object literal for the '{@link musicMetamodel.NoteName <em>Note Name</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicMetamodel.NoteName
		 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getNoteName()
		 * @generated
		 */
		EEnum NOTE_NAME = eINSTANCE.getNoteName();

		/**
		 * The meta object literal for the '{@link musicMetamodel.ArticulationType <em>Articulation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicMetamodel.ArticulationType
		 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getArticulationType()
		 * @generated
		 */
		EEnum ARTICULATION_TYPE = eINSTANCE.getArticulationType();

		/**
		 * The meta object literal for the '{@link musicMetamodel.ClefType <em>Clef Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicMetamodel.ClefType
		 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getClefType()
		 * @generated
		 */
		EEnum CLEF_TYPE = eINSTANCE.getClefType();

		/**
		 * The meta object literal for the '{@link musicMetamodel.SlurType <em>Slur Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicMetamodel.SlurType
		 * @see musicMetamodel.impl.MusicMetamodelPackageImpl#getSlurType()
		 * @generated
		 */
		EEnum SLUR_TYPE = eINSTANCE.getSlurType();

	}

} //MusicMetamodelPackage
