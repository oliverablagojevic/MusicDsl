/**
 */
package musicMetamodel.util;

import java.util.Map;

import musicMetamodel.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see musicMetamodel.MusicMetamodelPackage
 * @generated
 */
public class MusicMetamodelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MusicMetamodelValidator INSTANCE = new MusicMetamodelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "musicMetamodel";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MusicMetamodelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return MusicMetamodelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case MusicMetamodelPackage.COMPOSITION:
			return validateComposition((Composition) value, diagnostics, context);
		case MusicMetamodelPackage.STAFF:
			return validateStaff((Staff) value, diagnostics, context);
		case MusicMetamodelPackage.CLEF:
			return validateClef((Clef) value, diagnostics, context);
		case MusicMetamodelPackage.TIME_SIGNATURE:
			return validateTimeSignature((TimeSignature) value, diagnostics, context);
		case MusicMetamodelPackage.STAFF_ELEMENT:
			return validateStaffElement((StaffElement) value, diagnostics, context);
		case MusicMetamodelPackage.MEASURE:
			return validateMeasure((Measure) value, diagnostics, context);
		case MusicMetamodelPackage.REST:
			return validateRest((Rest) value, diagnostics, context);
		case MusicMetamodelPackage.REPETITION:
			return validateRepetition((Repetition) value, diagnostics, context);
		case MusicMetamodelPackage.NOTE:
			return validateNote((Note) value, diagnostics, context);
		case MusicMetamodelPackage.NOTATION:
			return validateNotation((Notation) value, diagnostics, context);
		case MusicMetamodelPackage.KEY:
			return validateKey((Key) value, diagnostics, context);
		case MusicMetamodelPackage.REST_TYPE:
			return validateRestType((RestType) value, diagnostics, context);
		case MusicMetamodelPackage.REPETITION_TYPE:
			return validateRepetitionType((RepetitionType) value, diagnostics, context);
		case MusicMetamodelPackage.ACCIDENTAL_TYPE:
			return validateAccidentalType((AccidentalType) value, diagnostics, context);
		case MusicMetamodelPackage.ORNAMENT_TYPE:
			return validateOrnamentType((OrnamentType) value, diagnostics, context);
		case MusicMetamodelPackage.NOTE_TYPE:
			return validateNoteType((NoteType) value, diagnostics, context);
		case MusicMetamodelPackage.NOTE_NAME:
			return validateNoteName((NoteName) value, diagnostics, context);
		case MusicMetamodelPackage.ARTICULATION_TYPE:
			return validateArticulationType((ArticulationType) value, diagnostics, context);
		case MusicMetamodelPackage.CLEF_TYPE:
			return validateClefType((ClefType) value, diagnostics, context);
		case MusicMetamodelPackage.SLUR_TYPE:
			return validateSlurType((SlurType) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComposition(Composition composition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(composition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaff(Staff staff, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(staff, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(staff, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(staff, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(staff, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(staff, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(staff, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(staff, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(staff, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(staff, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateStaff_StaffNumber(staff, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the StaffNumber constraint of '<em>Staff</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STAFF__STAFF_NUMBER__EEXPRESSION = "self.staffNumber = 1 or self.staffNumber = 2";

	/**
	 * Validates the StaffNumber constraint of '<em>Staff</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaff_StaffNumber(Staff staff, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(MusicMetamodelPackage.Literals.STAFF, staff, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "StaffNumber", STAFF__STAFF_NUMBER__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClef(Clef clef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSignature(TimeSignature timeSignature, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeSignature, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(timeSignature, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(timeSignature, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(timeSignature, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(timeSignature, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(timeSignature, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(timeSignature, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(timeSignature, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(timeSignature, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTimeSignature_LessThanTwelve(timeSignature, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTimeSignature_LessThanEight(timeSignature, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the LessThanTwelve constraint of '<em>Time Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TIME_SIGNATURE__LESS_THAN_TWELVE__EEXPRESSION = "self.beat < 12";

	/**
	 * Validates the LessThanTwelve constraint of '<em>Time Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSignature_LessThanTwelve(TimeSignature timeSignature, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(MusicMetamodelPackage.Literals.TIME_SIGNATURE, timeSignature, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "LessThanTwelve",
				TIME_SIGNATURE__LESS_THAN_TWELVE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the LessThanEight constraint of '<em>Time Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TIME_SIGNATURE__LESS_THAN_EIGHT__EEXPRESSION = "self.beatType < 8";

	/**
	 * Validates the LessThanEight constraint of '<em>Time Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSignature_LessThanEight(TimeSignature timeSignature, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(MusicMetamodelPackage.Literals.TIME_SIGNATURE, timeSignature, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "LessThanEight",
				TIME_SIGNATURE__LESS_THAN_EIGHT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaffElement(StaffElement staffElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staffElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasure(Measure measure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(measure, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(measure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(measure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(measure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(measure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(measure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(measure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(measure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(measure, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMeasure_BiggerThanZero(measure, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the BiggerThanZero constraint of '<em>Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MEASURE__BIGGER_THAN_ZERO__EEXPRESSION = "self.measureNumber > 0";

	/**
	 * Validates the BiggerThanZero constraint of '<em>Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasure_BiggerThanZero(Measure measure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(MusicMetamodelPackage.Literals.MEASURE, measure, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "BiggerThanZero",
				MEASURE__BIGGER_THAN_ZERO__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRest(Rest rest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepetition(Repetition repetition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(repetition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNote(Note note, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(note, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(note, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(note, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(note, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(note, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(note, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(note, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(note, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(note, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNote_OctaveLessThan(note, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNote_VoiceNumber(note, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNote_fermataTrueImpliesDotFalse(note, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNote_dotTrueImpliesFermataFalse(note, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OctaveLessThan constraint of '<em>Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NOTE__OCTAVE_LESS_THAN__EEXPRESSION = "self.octave <= 8";

	/**
	 * Validates the OctaveLessThan constraint of '<em>Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNote_OctaveLessThan(Note note, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(MusicMetamodelPackage.Literals.NOTE, note, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "OctaveLessThan",
				NOTE__OCTAVE_LESS_THAN__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the VoiceNumber constraint of '<em>Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NOTE__VOICE_NUMBER__EEXPRESSION = "self.voice = 1 or self.voice = 2";

	/**
	 * Validates the VoiceNumber constraint of '<em>Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNote_VoiceNumber(Note note, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(MusicMetamodelPackage.Literals.NOTE, note, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "VoiceNumber", NOTE__VOICE_NUMBER__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the fermataTrueImpliesDotFalse constraint of '<em>Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NOTE__FERMATA_TRUE_IMPLIES_DOT_FALSE__EEXPRESSION = "self.fermata = true implies self.dot = false";

	/**
	 * Validates the fermataTrueImpliesDotFalse constraint of '<em>Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNote_fermataTrueImpliesDotFalse(Note note, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(MusicMetamodelPackage.Literals.NOTE, note, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "fermataTrueImpliesDotFalse",
				NOTE__FERMATA_TRUE_IMPLIES_DOT_FALSE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the dotTrueImpliesFermataFalse constraint of '<em>Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NOTE__DOT_TRUE_IMPLIES_FERMATA_FALSE__EEXPRESSION = "self.dot = true implies self.fermata = false";

	/**
	 * Validates the dotTrueImpliesFermataFalse constraint of '<em>Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNote_dotTrueImpliesFermataFalse(Note note, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(MusicMetamodelPackage.Literals.NOTE, note, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "dotTrueImpliesFermataFalse",
				NOTE__DOT_TRUE_IMPLIES_FERMATA_FALSE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotation(Notation notation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(notation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKey(Key key, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(key, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(key, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(key, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(key, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(key, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(key, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(key, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(key, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(key, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateKey_KeyLessThan(key, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateKey_KeyBiggerThan(key, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the KeyLessThan constraint of '<em>Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String KEY__KEY_LESS_THAN__EEXPRESSION = "self.fifths <= 7";

	/**
	 * Validates the KeyLessThan constraint of '<em>Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKey_KeyLessThan(Key key, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(MusicMetamodelPackage.Literals.KEY, key, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "KeyLessThan", KEY__KEY_LESS_THAN__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the KeyBiggerThan constraint of '<em>Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String KEY__KEY_BIGGER_THAN__EEXPRESSION = "self.fifths >= -7";

	/**
	 * Validates the KeyBiggerThan constraint of '<em>Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKey_KeyBiggerThan(Key key, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(MusicMetamodelPackage.Literals.KEY, key, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "KeyBiggerThan", KEY__KEY_BIGGER_THAN__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestType(RestType restType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepetitionType(RepetitionType repetitionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccidentalType(AccidentalType accidentalType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrnamentType(OrnamentType ornamentType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteType(NoteType noteType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteName(NoteName noteName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArticulationType(ArticulationType articulationType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClefType(ClefType clefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlurType(SlurType slurType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //MusicMetamodelValidator
