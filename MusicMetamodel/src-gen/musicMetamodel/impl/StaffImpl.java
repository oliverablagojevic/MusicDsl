/**
 */
package musicMetamodel.impl;

import java.util.Collection;

import musicMetamodel.Clef;
import musicMetamodel.Key;
import musicMetamodel.MusicMetamodelPackage;
import musicMetamodel.Staff;
import musicMetamodel.StaffElement;
import musicMetamodel.TimeSignature;

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
 * An implementation of the model object '<em><b>Staff</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link musicMetamodel.impl.StaffImpl#getStaffNumber <em>Staff Number</em>}</li>
 *   <li>{@link musicMetamodel.impl.StaffImpl#getClef <em>Clef</em>}</li>
 *   <li>{@link musicMetamodel.impl.StaffImpl#getTime <em>Time</em>}</li>
 *   <li>{@link musicMetamodel.impl.StaffImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link musicMetamodel.impl.StaffImpl#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaffImpl extends MinimalEObjectImpl.Container implements Staff {
	/**
	 * The default value of the '{@link #getStaffNumber() <em>Staff Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int STAFF_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStaffNumber() <em>Staff Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffNumber()
	 * @generated
	 * @ordered
	 */
	protected int staffNumber = STAFF_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClef() <em>Clef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClef()
	 * @generated
	 * @ordered
	 */
	protected Clef clef;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected TimeSignature time;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<StaffElement> elements;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected Key key;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaffImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MusicMetamodelPackage.Literals.STAFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStaffNumber() {
		return staffNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStaffNumber(int newStaffNumber) {
		int oldStaffNumber = staffNumber;
		staffNumber = newStaffNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicMetamodelPackage.STAFF__STAFF_NUMBER,
					oldStaffNumber, staffNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Clef getClef() {
		return clef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClef(Clef newClef, NotificationChain msgs) {
		Clef oldClef = clef;
		clef = newClef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MusicMetamodelPackage.STAFF__CLEF, oldClef, newClef);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClef(Clef newClef) {
		if (newClef != clef) {
			NotificationChain msgs = null;
			if (clef != null)
				msgs = ((InternalEObject) clef).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MusicMetamodelPackage.STAFF__CLEF, null, msgs);
			if (newClef != null)
				msgs = ((InternalEObject) newClef).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MusicMetamodelPackage.STAFF__CLEF, null, msgs);
			msgs = basicSetClef(newClef, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicMetamodelPackage.STAFF__CLEF, newClef, newClef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeSignature getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTime(TimeSignature newTime, NotificationChain msgs) {
		TimeSignature oldTime = time;
		time = newTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MusicMetamodelPackage.STAFF__TIME, oldTime, newTime);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTime(TimeSignature newTime) {
		if (newTime != time) {
			NotificationChain msgs = null;
			if (time != null)
				msgs = ((InternalEObject) time).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MusicMetamodelPackage.STAFF__TIME, null, msgs);
			if (newTime != null)
				msgs = ((InternalEObject) newTime).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MusicMetamodelPackage.STAFF__TIME, null, msgs);
			msgs = basicSetTime(newTime, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicMetamodelPackage.STAFF__TIME, newTime, newTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StaffElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<StaffElement>(StaffElement.class, this,
					MusicMetamodelPackage.STAFF__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Key getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKey(Key newKey, NotificationChain msgs) {
		Key oldKey = key;
		key = newKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MusicMetamodelPackage.STAFF__KEY, oldKey, newKey);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKey(Key newKey) {
		if (newKey != key) {
			NotificationChain msgs = null;
			if (key != null)
				msgs = ((InternalEObject) key).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MusicMetamodelPackage.STAFF__KEY, null, msgs);
			if (newKey != null)
				msgs = ((InternalEObject) newKey).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MusicMetamodelPackage.STAFF__KEY, null, msgs);
			msgs = basicSetKey(newKey, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicMetamodelPackage.STAFF__KEY, newKey, newKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MusicMetamodelPackage.STAFF__CLEF:
			return basicSetClef(null, msgs);
		case MusicMetamodelPackage.STAFF__TIME:
			return basicSetTime(null, msgs);
		case MusicMetamodelPackage.STAFF__ELEMENTS:
			return ((InternalEList<?>) getElements()).basicRemove(otherEnd, msgs);
		case MusicMetamodelPackage.STAFF__KEY:
			return basicSetKey(null, msgs);
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
		case MusicMetamodelPackage.STAFF__STAFF_NUMBER:
			return getStaffNumber();
		case MusicMetamodelPackage.STAFF__CLEF:
			return getClef();
		case MusicMetamodelPackage.STAFF__TIME:
			return getTime();
		case MusicMetamodelPackage.STAFF__ELEMENTS:
			return getElements();
		case MusicMetamodelPackage.STAFF__KEY:
			return getKey();
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
		case MusicMetamodelPackage.STAFF__STAFF_NUMBER:
			setStaffNumber((Integer) newValue);
			return;
		case MusicMetamodelPackage.STAFF__CLEF:
			setClef((Clef) newValue);
			return;
		case MusicMetamodelPackage.STAFF__TIME:
			setTime((TimeSignature) newValue);
			return;
		case MusicMetamodelPackage.STAFF__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends StaffElement>) newValue);
			return;
		case MusicMetamodelPackage.STAFF__KEY:
			setKey((Key) newValue);
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
		case MusicMetamodelPackage.STAFF__STAFF_NUMBER:
			setStaffNumber(STAFF_NUMBER_EDEFAULT);
			return;
		case MusicMetamodelPackage.STAFF__CLEF:
			setClef((Clef) null);
			return;
		case MusicMetamodelPackage.STAFF__TIME:
			setTime((TimeSignature) null);
			return;
		case MusicMetamodelPackage.STAFF__ELEMENTS:
			getElements().clear();
			return;
		case MusicMetamodelPackage.STAFF__KEY:
			setKey((Key) null);
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
		case MusicMetamodelPackage.STAFF__STAFF_NUMBER:
			return staffNumber != STAFF_NUMBER_EDEFAULT;
		case MusicMetamodelPackage.STAFF__CLEF:
			return clef != null;
		case MusicMetamodelPackage.STAFF__TIME:
			return time != null;
		case MusicMetamodelPackage.STAFF__ELEMENTS:
			return elements != null && !elements.isEmpty();
		case MusicMetamodelPackage.STAFF__KEY:
			return key != null;
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
		result.append(" (staffNumber: ");
		result.append(staffNumber);
		result.append(')');
		return result.toString();
	}

} //StaffImpl
