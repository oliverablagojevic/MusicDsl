/**
 */
package musicMetamodel.impl;

import java.util.Collection;

import musicMetamodel.Composition;
import musicMetamodel.MusicMetamodelPackage;
import musicMetamodel.Staff;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link musicMetamodel.impl.CompositionImpl#getName <em>Name</em>}</li>
 *   <li>{@link musicMetamodel.impl.CompositionImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link musicMetamodel.impl.CompositionImpl#getInstrument <em>Instrument</em>}</li>
 *   <li>{@link musicMetamodel.impl.CompositionImpl#getTonality <em>Tonality</em>}</li>
 *   <li>{@link musicMetamodel.impl.CompositionImpl#getSoundTempo <em>Sound Tempo</em>}</li>
 *   <li>{@link musicMetamodel.impl.CompositionImpl#getStaff <em>Staff</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositionImpl extends MinimalEObjectImpl.Container implements Composition {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstrument() <em>Instrument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstrument()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTRUMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstrument() <em>Instrument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstrument()
	 * @generated
	 * @ordered
	 */
	protected String instrument = INSTRUMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTonality() <em>Tonality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTonality()
	 * @generated
	 * @ordered
	 */
	protected static final String TONALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTonality() <em>Tonality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTonality()
	 * @generated
	 * @ordered
	 */
	protected String tonality = TONALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoundTempo() <em>Sound Tempo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoundTempo()
	 * @generated
	 * @ordered
	 */
	protected static final int SOUND_TEMPO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSoundTempo() <em>Sound Tempo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoundTempo()
	 * @generated
	 * @ordered
	 */
	protected int soundTempo = SOUND_TEMPO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStaff() <em>Staff</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaff()
	 * @generated
	 * @ordered
	 */
	protected EList<Staff> staff;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MusicMetamodelPackage.Literals.COMPOSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicMetamodelPackage.COMPOSITION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicMetamodelPackage.COMPOSITION__AUTHOR, oldAuthor,
					author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstrument() {
		return instrument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstrument(String newInstrument) {
		String oldInstrument = instrument;
		instrument = newInstrument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicMetamodelPackage.COMPOSITION__INSTRUMENT,
					oldInstrument, instrument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTonality() {
		return tonality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTonality(String newTonality) {
		String oldTonality = tonality;
		tonality = newTonality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicMetamodelPackage.COMPOSITION__TONALITY,
					oldTonality, tonality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSoundTempo() {
		return soundTempo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoundTempo(int newSoundTempo) {
		int oldSoundTempo = soundTempo;
		soundTempo = newSoundTempo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicMetamodelPackage.COMPOSITION__SOUND_TEMPO,
					oldSoundTempo, soundTempo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Staff> getStaff() {
		if (staff == null) {
			staff = new EObjectContainmentEList<Staff>(Staff.class, this, MusicMetamodelPackage.COMPOSITION__STAFF);
		}
		return staff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MusicMetamodelPackage.COMPOSITION__STAFF:
			return ((InternalEList<?>) getStaff()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MusicMetamodelPackage.COMPOSITION__NAME:
			return getName();
		case MusicMetamodelPackage.COMPOSITION__AUTHOR:
			return getAuthor();
		case MusicMetamodelPackage.COMPOSITION__INSTRUMENT:
			return getInstrument();
		case MusicMetamodelPackage.COMPOSITION__TONALITY:
			return getTonality();
		case MusicMetamodelPackage.COMPOSITION__SOUND_TEMPO:
			return getSoundTempo();
		case MusicMetamodelPackage.COMPOSITION__STAFF:
			return getStaff();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MusicMetamodelPackage.COMPOSITION__NAME:
			setName((String) newValue);
			return;
		case MusicMetamodelPackage.COMPOSITION__AUTHOR:
			setAuthor((String) newValue);
			return;
		case MusicMetamodelPackage.COMPOSITION__INSTRUMENT:
			setInstrument((String) newValue);
			return;
		case MusicMetamodelPackage.COMPOSITION__TONALITY:
			setTonality((String) newValue);
			return;
		case MusicMetamodelPackage.COMPOSITION__SOUND_TEMPO:
			setSoundTempo((Integer) newValue);
			return;
		case MusicMetamodelPackage.COMPOSITION__STAFF:
			getStaff().clear();
			getStaff().addAll((Collection<? extends Staff>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MusicMetamodelPackage.COMPOSITION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MusicMetamodelPackage.COMPOSITION__AUTHOR:
			setAuthor(AUTHOR_EDEFAULT);
			return;
		case MusicMetamodelPackage.COMPOSITION__INSTRUMENT:
			setInstrument(INSTRUMENT_EDEFAULT);
			return;
		case MusicMetamodelPackage.COMPOSITION__TONALITY:
			setTonality(TONALITY_EDEFAULT);
			return;
		case MusicMetamodelPackage.COMPOSITION__SOUND_TEMPO:
			setSoundTempo(SOUND_TEMPO_EDEFAULT);
			return;
		case MusicMetamodelPackage.COMPOSITION__STAFF:
			getStaff().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MusicMetamodelPackage.COMPOSITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MusicMetamodelPackage.COMPOSITION__AUTHOR:
			return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
		case MusicMetamodelPackage.COMPOSITION__INSTRUMENT:
			return INSTRUMENT_EDEFAULT == null ? instrument != null : !INSTRUMENT_EDEFAULT.equals(instrument);
		case MusicMetamodelPackage.COMPOSITION__TONALITY:
			return TONALITY_EDEFAULT == null ? tonality != null : !TONALITY_EDEFAULT.equals(tonality);
		case MusicMetamodelPackage.COMPOSITION__SOUND_TEMPO:
			return soundTempo != SOUND_TEMPO_EDEFAULT;
		case MusicMetamodelPackage.COMPOSITION__STAFF:
			return staff != null && !staff.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", author: ");
		result.append(author);
		result.append(", instrument: ");
		result.append(instrument);
		result.append(", tonality: ");
		result.append(tonality);
		result.append(", soundTempo: ");
		result.append(soundTempo);
		result.append(')');
		return result.toString();
	}

} //CompositionImpl
