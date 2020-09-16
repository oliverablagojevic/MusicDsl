/**
 */
package musicMetamodel.impl;

import musicMetamodel.AccidentalType;
import musicMetamodel.ArticulationType;
import musicMetamodel.Clef;
import musicMetamodel.ClefType;
import musicMetamodel.Composition;
import musicMetamodel.Key;
import musicMetamodel.Measure;
import musicMetamodel.MusicMetamodelFactory;
import musicMetamodel.MusicMetamodelPackage;
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
import musicMetamodel.StaffElement;
import musicMetamodel.TimeSignature;

import musicMetamodel.util.MusicMetamodelValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MusicMetamodelPackageImpl extends EPackageImpl implements MusicMetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repetitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum restTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum repetitionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accidentalTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ornamentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum noteTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum noteNameEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum articulationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clefTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum slurTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see musicMetamodel.MusicMetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MusicMetamodelPackageImpl() {
		super(eNS_URI, MusicMetamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MusicMetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MusicMetamodelPackage init() {
		if (isInited)
			return (MusicMetamodelPackage) EPackage.Registry.INSTANCE.getEPackage(MusicMetamodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMusicMetamodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MusicMetamodelPackageImpl theMusicMetamodelPackage = registeredMusicMetamodelPackage instanceof MusicMetamodelPackageImpl
				? (MusicMetamodelPackageImpl) registeredMusicMetamodelPackage
				: new MusicMetamodelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMusicMetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theMusicMetamodelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theMusicMetamodelPackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return MusicMetamodelValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theMusicMetamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MusicMetamodelPackage.eNS_URI, theMusicMetamodelPackage);
		return theMusicMetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComposition() {
		return compositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComposition_Name() {
		return (EAttribute) compositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComposition_Author() {
		return (EAttribute) compositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComposition_Instrument() {
		return (EAttribute) compositionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComposition_Tonality() {
		return (EAttribute) compositionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComposition_SoundTempo() {
		return (EAttribute) compositionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComposition_Staff() {
		return (EReference) compositionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStaff() {
		return staffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStaff_StaffNumber() {
		return (EAttribute) staffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStaff_Clef() {
		return (EReference) staffEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStaff_Time() {
		return (EReference) staffEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStaff_Elements() {
		return (EReference) staffEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStaff_Key() {
		return (EReference) staffEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClef() {
		return clefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClef_Type() {
		return (EAttribute) clefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeSignature() {
		return timeSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeSignature_Beat() {
		return (EAttribute) timeSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeSignature_BeatType() {
		return (EAttribute) timeSignatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStaffElement() {
		return staffElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeasure() {
		return measureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasure_MeasureNumber() {
		return (EAttribute) measureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeasure_Repetition() {
		return (EReference) measureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeasure_Note() {
		return (EReference) measureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeasure_Rest() {
		return (EReference) measureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRest() {
		return restEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRest_Type() {
		return (EAttribute) restEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRepetition() {
		return repetitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRepetition_Type() {
		return (EAttribute) repetitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNote() {
		return noteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_Name() {
		return (EAttribute) noteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_Type() {
		return (EAttribute) noteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_Duration() {
		return (EAttribute) noteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_Octave() {
		return (EAttribute) noteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_Voice() {
		return (EAttribute) noteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_Dynamic() {
		return (EAttribute) noteEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_Fermata() {
		return (EAttribute) noteEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_Dot() {
		return (EAttribute) noteEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_Accidental() {
		return (EAttribute) noteEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNote_Notation() {
		return (EReference) noteEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_Lyrics() {
		return (EAttribute) noteEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_Chord() {
		return (EAttribute) noteEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNotation() {
		return notationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotation_Articulation() {
		return (EAttribute) notationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotation_Ornament() {
		return (EAttribute) notationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotation_Slur() {
		return (EAttribute) notationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKey() {
		return keyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKey_Fifths() {
		return (EAttribute) keyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRestType() {
		return restTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRepetitionType() {
		return repetitionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAccidentalType() {
		return accidentalTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOrnamentType() {
		return ornamentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNoteType() {
		return noteTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNoteName() {
		return noteNameEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getArticulationType() {
		return articulationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getClefType() {
		return clefTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSlurType() {
		return slurTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MusicMetamodelFactory getMusicMetamodelFactory() {
		return (MusicMetamodelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		compositionEClass = createEClass(COMPOSITION);
		createEAttribute(compositionEClass, COMPOSITION__NAME);
		createEAttribute(compositionEClass, COMPOSITION__AUTHOR);
		createEAttribute(compositionEClass, COMPOSITION__INSTRUMENT);
		createEAttribute(compositionEClass, COMPOSITION__TONALITY);
		createEAttribute(compositionEClass, COMPOSITION__SOUND_TEMPO);
		createEReference(compositionEClass, COMPOSITION__STAFF);

		staffEClass = createEClass(STAFF);
		createEAttribute(staffEClass, STAFF__STAFF_NUMBER);
		createEReference(staffEClass, STAFF__CLEF);
		createEReference(staffEClass, STAFF__TIME);
		createEReference(staffEClass, STAFF__ELEMENTS);
		createEReference(staffEClass, STAFF__KEY);

		clefEClass = createEClass(CLEF);
		createEAttribute(clefEClass, CLEF__TYPE);

		timeSignatureEClass = createEClass(TIME_SIGNATURE);
		createEAttribute(timeSignatureEClass, TIME_SIGNATURE__BEAT);
		createEAttribute(timeSignatureEClass, TIME_SIGNATURE__BEAT_TYPE);

		staffElementEClass = createEClass(STAFF_ELEMENT);

		measureEClass = createEClass(MEASURE);
		createEAttribute(measureEClass, MEASURE__MEASURE_NUMBER);
		createEReference(measureEClass, MEASURE__REPETITION);
		createEReference(measureEClass, MEASURE__NOTE);
		createEReference(measureEClass, MEASURE__REST);

		restEClass = createEClass(REST);
		createEAttribute(restEClass, REST__TYPE);

		repetitionEClass = createEClass(REPETITION);
		createEAttribute(repetitionEClass, REPETITION__TYPE);

		noteEClass = createEClass(NOTE);
		createEAttribute(noteEClass, NOTE__NAME);
		createEAttribute(noteEClass, NOTE__TYPE);
		createEAttribute(noteEClass, NOTE__DURATION);
		createEAttribute(noteEClass, NOTE__OCTAVE);
		createEAttribute(noteEClass, NOTE__VOICE);
		createEAttribute(noteEClass, NOTE__DYNAMIC);
		createEAttribute(noteEClass, NOTE__FERMATA);
		createEAttribute(noteEClass, NOTE__DOT);
		createEAttribute(noteEClass, NOTE__ACCIDENTAL);
		createEReference(noteEClass, NOTE__NOTATION);
		createEAttribute(noteEClass, NOTE__LYRICS);
		createEAttribute(noteEClass, NOTE__CHORD);

		notationEClass = createEClass(NOTATION);
		createEAttribute(notationEClass, NOTATION__ARTICULATION);
		createEAttribute(notationEClass, NOTATION__ORNAMENT);
		createEAttribute(notationEClass, NOTATION__SLUR);

		keyEClass = createEClass(KEY);
		createEAttribute(keyEClass, KEY__FIFTHS);

		// Create enums
		restTypeEEnum = createEEnum(REST_TYPE);
		repetitionTypeEEnum = createEEnum(REPETITION_TYPE);
		accidentalTypeEEnum = createEEnum(ACCIDENTAL_TYPE);
		ornamentTypeEEnum = createEEnum(ORNAMENT_TYPE);
		noteTypeEEnum = createEEnum(NOTE_TYPE);
		noteNameEEnum = createEEnum(NOTE_NAME);
		articulationTypeEEnum = createEEnum(ARTICULATION_TYPE);
		clefTypeEEnum = createEEnum(CLEF_TYPE);
		slurTypeEEnum = createEEnum(SLUR_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		measureEClass.getESuperTypes().add(this.getStaffElement());
		restEClass.getESuperTypes().add(this.getStaffElement());
		repetitionEClass.getESuperTypes().add(this.getStaffElement());
		noteEClass.getESuperTypes().add(this.getStaffElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(compositionEClass, Composition.class, "Composition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComposition_Name(), ecorePackage.getEString(), "name", null, 0, 1, Composition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComposition_Author(), ecorePackage.getEString(), "author", null, 0, 1, Composition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComposition_Instrument(), ecorePackage.getEString(), "instrument", null, 0, 1,
				Composition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getComposition_Tonality(), ecorePackage.getEString(), "tonality", null, 0, 1, Composition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComposition_SoundTempo(), ecorePackage.getEInt(), "soundTempo", null, 1, 1, Composition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposition_Staff(), this.getStaff(), null, "staff", null, 1, 2, Composition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staffEClass, Staff.class, "Staff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaff_StaffNumber(), ecorePackage.getEInt(), "staffNumber", null, 1, 1, Staff.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStaff_Clef(), this.getClef(), null, "clef", null, 1, 1, Staff.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getStaff_Time(), this.getTimeSignature(), null, "time", null, 1, 1, Staff.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getStaff_Elements(), this.getStaffElement(), null, "elements", null, 0, -1, Staff.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStaff_Key(), this.getKey(), null, "key", null, 0, 1, Staff.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clefEClass, Clef.class, "Clef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClef_Type(), this.getClefType(), "type", null, 0, 1, Clef.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeSignatureEClass, TimeSignature.class, "TimeSignature", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeSignature_Beat(), ecorePackage.getEInt(), "beat", null, 1, 1, TimeSignature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeSignature_BeatType(), ecorePackage.getEInt(), "beatType", null, 1, 1, TimeSignature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staffElementEClass, StaffElement.class, "StaffElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(measureEClass, Measure.class, "Measure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasure_MeasureNumber(), ecorePackage.getEInt(), "measureNumber", null, 1, 1, Measure.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_Repetition(), this.getRepetition(), null, "repetition", null, 0, -1, Measure.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_Note(), this.getNote(), null, "note", null, 0, -1, Measure.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMeasure_Rest(), this.getRest(), null, "rest", null, 0, -1, Measure.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(restEClass, Rest.class, "Rest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRest_Type(), this.getRestType(), "type", null, 0, 1, Rest.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repetitionEClass, Repetition.class, "Repetition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepetition_Type(), this.getRepetitionType(), "type", null, 0, 1, Repetition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noteEClass, Note.class, "Note", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNote_Name(), this.getNoteName(), "name", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Type(), this.getNoteType(), "type", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Duration(), ecorePackage.getEInt(), "duration", null, 1, 1, Note.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Octave(), ecorePackage.getEInt(), "octave", null, 1, 1, Note.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Voice(), ecorePackage.getEInt(), "voice", null, 1, 1, Note.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Dynamic(), ecorePackage.getEString(), "dynamic", null, 0, 1, Note.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Fermata(), ecorePackage.getEBoolean(), "fermata", null, 1, 1, Note.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Dot(), ecorePackage.getEBoolean(), "dot", null, 1, 1, Note.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Accidental(), this.getAccidentalType(), "accidental", null, 0, 1, Note.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNote_Notation(), this.getNotation(), null, "notation", null, 0, -1, Note.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getNote_Lyrics(), ecorePackage.getEString(), "lyrics", null, 0, 1, Note.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Chord(), ecorePackage.getEBoolean(), "chord", null, 0, 1, Note.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notationEClass, Notation.class, "Notation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotation_Articulation(), this.getArticulationType(), "articulation", null, 0, 1,
				Notation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotation_Ornament(), this.getOrnamentType(), "ornament", null, 0, 1, Notation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotation_Slur(), this.getSlurType(), "slur", null, 0, 1, Notation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyEClass, Key.class, "Key", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKey_Fifths(), ecorePackage.getEInt(), "fifths", null, 1, 1, Key.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(restTypeEEnum, RestType.class, "RestType");
		addEEnumLiteral(restTypeEEnum, RestType.WHOLE);
		addEEnumLiteral(restTypeEEnum, RestType.HALF);
		addEEnumLiteral(restTypeEEnum, RestType.QUARTER);
		addEEnumLiteral(restTypeEEnum, RestType.EIGHTH);
		addEEnumLiteral(restTypeEEnum, RestType.SIXTEENTH);
		addEEnumLiteral(restTypeEEnum, RestType.THIRTYSECOND);
		addEEnumLiteral(restTypeEEnum, RestType.SIXTYFOURTH);

		initEEnum(repetitionTypeEEnum, RepetitionType.class, "RepetitionType");
		addEEnumLiteral(repetitionTypeEEnum, RepetitionType.LEFT);
		addEEnumLiteral(repetitionTypeEEnum, RepetitionType.RIGHT);

		initEEnum(accidentalTypeEEnum, AccidentalType.class, "AccidentalType");
		addEEnumLiteral(accidentalTypeEEnum, AccidentalType.SHARP);
		addEEnumLiteral(accidentalTypeEEnum, AccidentalType.FLAT);
		addEEnumLiteral(accidentalTypeEEnum, AccidentalType.NATURAL);

		initEEnum(ornamentTypeEEnum, OrnamentType.class, "OrnamentType");
		addEEnumLiteral(ornamentTypeEEnum, OrnamentType.SLIDE);
		addEEnumLiteral(ornamentTypeEEnum, OrnamentType.GLISSANDO);
		addEEnumLiteral(ornamentTypeEEnum, OrnamentType.ACIACCATURA);
		addEEnumLiteral(ornamentTypeEEnum, OrnamentType.APPOGGIATURA);
		addEEnumLiteral(ornamentTypeEEnum, OrnamentType.TURN);
		addEEnumLiteral(ornamentTypeEEnum, OrnamentType.MORDENT);
		addEEnumLiteral(ornamentTypeEEnum, OrnamentType.TRILL);

		initEEnum(noteTypeEEnum, NoteType.class, "NoteType");
		addEEnumLiteral(noteTypeEEnum, NoteType.WHOLE);
		addEEnumLiteral(noteTypeEEnum, NoteType.HALF);
		addEEnumLiteral(noteTypeEEnum, NoteType.QUARTER);
		addEEnumLiteral(noteTypeEEnum, NoteType.EIGHTH);
		addEEnumLiteral(noteTypeEEnum, NoteType.SIXTEENTH);
		addEEnumLiteral(noteTypeEEnum, NoteType.THIRTYSECOND);
		addEEnumLiteral(noteTypeEEnum, NoteType.SIXTYFOURTH);

		initEEnum(noteNameEEnum, NoteName.class, "NoteName");
		addEEnumLiteral(noteNameEEnum, NoteName.C);
		addEEnumLiteral(noteNameEEnum, NoteName.D);
		addEEnumLiteral(noteNameEEnum, NoteName.E);
		addEEnumLiteral(noteNameEEnum, NoteName.F);
		addEEnumLiteral(noteNameEEnum, NoteName.G);
		addEEnumLiteral(noteNameEEnum, NoteName.A);
		addEEnumLiteral(noteNameEEnum, NoteName.B);

		initEEnum(articulationTypeEEnum, ArticulationType.class, "ArticulationType");
		addEEnumLiteral(articulationTypeEEnum, ArticulationType.DETACHED);
		addEEnumLiteral(articulationTypeEEnum, ArticulationType.LEGATO);
		addEEnumLiteral(articulationTypeEEnum, ArticulationType.STACCATO);
		addEEnumLiteral(articulationTypeEEnum, ArticulationType.PORTATO);
		addEEnumLiteral(articulationTypeEEnum, ArticulationType.TENUTO);
		addEEnumLiteral(articulationTypeEEnum, ArticulationType.MARCATO);

		initEEnum(clefTypeEEnum, ClefType.class, "ClefType");
		addEEnumLiteral(clefTypeEEnum, ClefType.VIOLIN);
		addEEnumLiteral(clefTypeEEnum, ClefType.BASS);

		initEEnum(slurTypeEEnum, SlurType.class, "SlurType");
		addEEnumLiteral(slurTypeEEnum, SlurType.START);
		addEEnumLiteral(slurTypeEEnum, SlurType.STOP);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation(this, source, new String[] { "ecore", "http://www.eclipse.org/emf/2002/Ecore" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
						"settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validationDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" });
		addAnnotation(staffEClass, source, new String[] { "constraints", "StaffNumber" });
		addAnnotation(timeSignatureEClass, source, new String[] { "constraints", "LessThanTwelve LessThanEight" });
		addAnnotation(measureEClass, source, new String[] { "constraints", "BiggerThanZero" });
		addAnnotation(noteEClass, source, new String[] { "constraints",
				"OctaveLessThan VoiceNumber fermataTrueImpliesDotFalse dotTrueImpliesFermataFalse" });
		addAnnotation(keyEClass, source, new String[] { "constraints", "KeyLessThan KeyBiggerThan" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(staffEClass, source,
				new String[] { "StaffNumber", "self.staffNumber = 1 or self.staffNumber = 2" });
		addAnnotation(timeSignatureEClass, source,
				new String[] { "LessThanTwelve", "self.beat < 12", "LessThanEight", "self.beatType < 8" });
		addAnnotation(measureEClass, source, new String[] { "BiggerThanZero", "self.measureNumber > 0" });
		addAnnotation(noteEClass, source,
				new String[] { "OctaveLessThan", "self.octave <= 8", "VoiceNumber", "self.voice = 1 or self.voice = 2",
						"fermataTrueImpliesDotFalse", "self.fermata = true implies self.dot = false",
						"dotTrueImpliesFermataFalse", "self.dot = true implies self.fermata = false" });
		addAnnotation(keyEClass, source,
				new String[] { "KeyLessThan", "self.fifths <= 7", "KeyBiggerThan", "self.fifths >= -7" });
	}

} //MusicMetamodelPackageImpl
