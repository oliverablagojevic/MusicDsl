/**
 */
package musicMetamodel.impl;

import java.util.Collection;

import musicMetamodel.Measure;
import musicMetamodel.MusicMetamodelPackage;
import musicMetamodel.Note;
import musicMetamodel.Repetition;
import musicMetamodel.Rest;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link musicMetamodel.impl.MeasureImpl#getMeasureNumber <em>Measure Number</em>}</li>
 *   <li>{@link musicMetamodel.impl.MeasureImpl#getRepetition <em>Repetition</em>}</li>
 *   <li>{@link musicMetamodel.impl.MeasureImpl#getNote <em>Note</em>}</li>
 *   <li>{@link musicMetamodel.impl.MeasureImpl#getRest <em>Rest</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureImpl extends StaffElementImpl implements Measure {
	/**
	 * The default value of the '{@link #getMeasureNumber() <em>Measure Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int MEASURE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMeasureNumber() <em>Measure Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureNumber()
	 * @generated
	 * @ordered
	 */
	protected int measureNumber = MEASURE_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRepetition() <em>Repetition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepetition()
	 * @generated
	 * @ordered
	 */
	protected EList<Repetition> repetition;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Note> note;

	/**
	 * The cached value of the '{@link #getRest() <em>Rest</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRest()
	 * @generated
	 * @ordered
	 */
	protected EList<Rest> rest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MusicMetamodelPackage.Literals.MEASURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMeasureNumber() {
		return measureNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeasureNumber(int newMeasureNumber) {
		int oldMeasureNumber = measureNumber;
		measureNumber = newMeasureNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicMetamodelPackage.MEASURE__MEASURE_NUMBER,
					oldMeasureNumber, measureNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Repetition> getRepetition() {
		if (repetition == null) {
			repetition = new EObjectContainmentEList<Repetition>(Repetition.class, this,
					MusicMetamodelPackage.MEASURE__REPETITION);
		}
		return repetition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Note> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Note>(Note.class, this, MusicMetamodelPackage.MEASURE__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Rest> getRest() {
		if (rest == null) {
			rest = new EObjectContainmentEList<Rest>(Rest.class, this, MusicMetamodelPackage.MEASURE__REST);
		}
		return rest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MusicMetamodelPackage.MEASURE__REPETITION:
			return ((InternalEList<?>) getRepetition()).basicRemove(otherEnd, msgs);
		case MusicMetamodelPackage.MEASURE__NOTE:
			return ((InternalEList<?>) getNote()).basicRemove(otherEnd, msgs);
		case MusicMetamodelPackage.MEASURE__REST:
			return ((InternalEList<?>) getRest()).basicRemove(otherEnd, msgs);
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
		case MusicMetamodelPackage.MEASURE__MEASURE_NUMBER:
			return getMeasureNumber();
		case MusicMetamodelPackage.MEASURE__REPETITION:
			return getRepetition();
		case MusicMetamodelPackage.MEASURE__NOTE:
			return getNote();
		case MusicMetamodelPackage.MEASURE__REST:
			return getRest();
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
		case MusicMetamodelPackage.MEASURE__MEASURE_NUMBER:
			setMeasureNumber((Integer) newValue);
			return;
		case MusicMetamodelPackage.MEASURE__REPETITION:
			getRepetition().clear();
			getRepetition().addAll((Collection<? extends Repetition>) newValue);
			return;
		case MusicMetamodelPackage.MEASURE__NOTE:
			getNote().clear();
			getNote().addAll((Collection<? extends Note>) newValue);
			return;
		case MusicMetamodelPackage.MEASURE__REST:
			getRest().clear();
			getRest().addAll((Collection<? extends Rest>) newValue);
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
		case MusicMetamodelPackage.MEASURE__MEASURE_NUMBER:
			setMeasureNumber(MEASURE_NUMBER_EDEFAULT);
			return;
		case MusicMetamodelPackage.MEASURE__REPETITION:
			getRepetition().clear();
			return;
		case MusicMetamodelPackage.MEASURE__NOTE:
			getNote().clear();
			return;
		case MusicMetamodelPackage.MEASURE__REST:
			getRest().clear();
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
		case MusicMetamodelPackage.MEASURE__MEASURE_NUMBER:
			return measureNumber != MEASURE_NUMBER_EDEFAULT;
		case MusicMetamodelPackage.MEASURE__REPETITION:
			return repetition != null && !repetition.isEmpty();
		case MusicMetamodelPackage.MEASURE__NOTE:
			return note != null && !note.isEmpty();
		case MusicMetamodelPackage.MEASURE__REST:
			return rest != null && !rest.isEmpty();
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
		result.append(" (measureNumber: ");
		result.append(measureNumber);
		result.append(')');
		return result.toString();
	}

} //MeasureImpl
