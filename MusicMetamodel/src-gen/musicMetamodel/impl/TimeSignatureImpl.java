/**
 */
package musicMetamodel.impl;

import musicMetamodel.MusicMetamodelPackage;
import musicMetamodel.TimeSignature;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link musicMetamodel.impl.TimeSignatureImpl#getBeat <em>Beat</em>}</li>
 *   <li>{@link musicMetamodel.impl.TimeSignatureImpl#getBeatType <em>Beat Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeSignatureImpl extends MinimalEObjectImpl.Container implements TimeSignature {
	/**
	 * The default value of the '{@link #getBeat() <em>Beat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeat()
	 * @generated
	 * @ordered
	 */
	protected static final int BEAT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBeat() <em>Beat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeat()
	 * @generated
	 * @ordered
	 */
	protected int beat = BEAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeatType() <em>Beat Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeatType()
	 * @generated
	 * @ordered
	 */
	protected static final int BEAT_TYPE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBeatType() <em>Beat Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeatType()
	 * @generated
	 * @ordered
	 */
	protected int beatType = BEAT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MusicMetamodelPackage.Literals.TIME_SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBeat() {
		return beat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeat(int newBeat) {
		int oldBeat = beat;
		beat = newBeat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicMetamodelPackage.TIME_SIGNATURE__BEAT, oldBeat,
					beat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBeatType() {
		return beatType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeatType(int newBeatType) {
		int oldBeatType = beatType;
		beatType = newBeatType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicMetamodelPackage.TIME_SIGNATURE__BEAT_TYPE,
					oldBeatType, beatType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MusicMetamodelPackage.TIME_SIGNATURE__BEAT:
			return getBeat();
		case MusicMetamodelPackage.TIME_SIGNATURE__BEAT_TYPE:
			return getBeatType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MusicMetamodelPackage.TIME_SIGNATURE__BEAT:
			setBeat((Integer) newValue);
			return;
		case MusicMetamodelPackage.TIME_SIGNATURE__BEAT_TYPE:
			setBeatType((Integer) newValue);
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
		case MusicMetamodelPackage.TIME_SIGNATURE__BEAT:
			setBeat(BEAT_EDEFAULT);
			return;
		case MusicMetamodelPackage.TIME_SIGNATURE__BEAT_TYPE:
			setBeatType(BEAT_TYPE_EDEFAULT);
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
		case MusicMetamodelPackage.TIME_SIGNATURE__BEAT:
			return beat != BEAT_EDEFAULT;
		case MusicMetamodelPackage.TIME_SIGNATURE__BEAT_TYPE:
			return beatType != BEAT_TYPE_EDEFAULT;
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
		result.append(" (beat: ");
		result.append(beat);
		result.append(", beatType: ");
		result.append(beatType);
		result.append(')');
		return result.toString();
	}

} //TimeSignatureImpl
