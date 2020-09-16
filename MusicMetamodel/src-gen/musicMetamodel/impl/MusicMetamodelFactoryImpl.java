/**
 */
package musicMetamodel.impl;

import musicMetamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MusicMetamodelFactoryImpl extends EFactoryImpl implements MusicMetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MusicMetamodelFactory init() {
		try {
			MusicMetamodelFactory theMusicMetamodelFactory = (MusicMetamodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(MusicMetamodelPackage.eNS_URI);
			if (theMusicMetamodelFactory != null) {
				return theMusicMetamodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MusicMetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MusicMetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MusicMetamodelPackage.COMPOSITION:
			return createComposition();
		case MusicMetamodelPackage.STAFF:
			return createStaff();
		case MusicMetamodelPackage.CLEF:
			return createClef();
		case MusicMetamodelPackage.TIME_SIGNATURE:
			return createTimeSignature();
		case MusicMetamodelPackage.MEASURE:
			return createMeasure();
		case MusicMetamodelPackage.REST:
			return createRest();
		case MusicMetamodelPackage.REPETITION:
			return createRepetition();
		case MusicMetamodelPackage.NOTE:
			return createNote();
		case MusicMetamodelPackage.NOTATION:
			return createNotation();
		case MusicMetamodelPackage.KEY:
			return createKey();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case MusicMetamodelPackage.REST_TYPE:
			return createRestTypeFromString(eDataType, initialValue);
		case MusicMetamodelPackage.REPETITION_TYPE:
			return createRepetitionTypeFromString(eDataType, initialValue);
		case MusicMetamodelPackage.ACCIDENTAL_TYPE:
			return createAccidentalTypeFromString(eDataType, initialValue);
		case MusicMetamodelPackage.ORNAMENT_TYPE:
			return createOrnamentTypeFromString(eDataType, initialValue);
		case MusicMetamodelPackage.NOTE_TYPE:
			return createNoteTypeFromString(eDataType, initialValue);
		case MusicMetamodelPackage.NOTE_NAME:
			return createNoteNameFromString(eDataType, initialValue);
		case MusicMetamodelPackage.ARTICULATION_TYPE:
			return createArticulationTypeFromString(eDataType, initialValue);
		case MusicMetamodelPackage.CLEF_TYPE:
			return createClefTypeFromString(eDataType, initialValue);
		case MusicMetamodelPackage.SLUR_TYPE:
			return createSlurTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case MusicMetamodelPackage.REST_TYPE:
			return convertRestTypeToString(eDataType, instanceValue);
		case MusicMetamodelPackage.REPETITION_TYPE:
			return convertRepetitionTypeToString(eDataType, instanceValue);
		case MusicMetamodelPackage.ACCIDENTAL_TYPE:
			return convertAccidentalTypeToString(eDataType, instanceValue);
		case MusicMetamodelPackage.ORNAMENT_TYPE:
			return convertOrnamentTypeToString(eDataType, instanceValue);
		case MusicMetamodelPackage.NOTE_TYPE:
			return convertNoteTypeToString(eDataType, instanceValue);
		case MusicMetamodelPackage.NOTE_NAME:
			return convertNoteNameToString(eDataType, instanceValue);
		case MusicMetamodelPackage.ARTICULATION_TYPE:
			return convertArticulationTypeToString(eDataType, instanceValue);
		case MusicMetamodelPackage.CLEF_TYPE:
			return convertClefTypeToString(eDataType, instanceValue);
		case MusicMetamodelPackage.SLUR_TYPE:
			return convertSlurTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Composition createComposition() {
		CompositionImpl composition = new CompositionImpl();
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Staff createStaff() {
		StaffImpl staff = new StaffImpl();
		return staff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Clef createClef() {
		ClefImpl clef = new ClefImpl();
		return clef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeSignature createTimeSignature() {
		TimeSignatureImpl timeSignature = new TimeSignatureImpl();
		return timeSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Measure createMeasure() {
		MeasureImpl measure = new MeasureImpl();
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rest createRest() {
		RestImpl rest = new RestImpl();
		return rest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Repetition createRepetition() {
		RepetitionImpl repetition = new RepetitionImpl();
		return repetition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Note createNote() {
		NoteImpl note = new NoteImpl();
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Notation createNotation() {
		NotationImpl notation = new NotationImpl();
		return notation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Key createKey() {
		KeyImpl key = new KeyImpl();
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestType createRestTypeFromString(EDataType eDataType, String initialValue) {
		RestType result = RestType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepetitionType createRepetitionTypeFromString(EDataType eDataType, String initialValue) {
		RepetitionType result = RepetitionType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRepetitionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccidentalType createAccidentalTypeFromString(EDataType eDataType, String initialValue) {
		AccidentalType result = AccidentalType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccidentalTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrnamentType createOrnamentTypeFromString(EDataType eDataType, String initialValue) {
		OrnamentType result = OrnamentType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrnamentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteType createNoteTypeFromString(EDataType eDataType, String initialValue) {
		NoteType result = NoteType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNoteTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteName createNoteNameFromString(EDataType eDataType, String initialValue) {
		NoteName result = NoteName.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNoteNameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArticulationType createArticulationTypeFromString(EDataType eDataType, String initialValue) {
		ArticulationType result = ArticulationType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArticulationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClefType createClefTypeFromString(EDataType eDataType, String initialValue) {
		ClefType result = ClefType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClefTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlurType createSlurTypeFromString(EDataType eDataType, String initialValue) {
		SlurType result = SlurType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSlurTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MusicMetamodelPackage getMusicMetamodelPackage() {
		return (MusicMetamodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MusicMetamodelPackage getPackage() {
		return MusicMetamodelPackage.eINSTANCE;
	}

} //MusicMetamodelFactoryImpl
