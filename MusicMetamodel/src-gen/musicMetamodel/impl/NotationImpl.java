/**
 */
package musicMetamodel.impl;

import musicMetamodel.ArticulationType;
import musicMetamodel.MusicMetamodelPackage;
import musicMetamodel.Notation;
import musicMetamodel.OrnamentType;
import musicMetamodel.SlurType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link musicMetamodel.impl.NotationImpl#getArticulation <em>Articulation</em>}</li>
 *   <li>{@link musicMetamodel.impl.NotationImpl#getOrnament <em>Ornament</em>}</li>
 *   <li>{@link musicMetamodel.impl.NotationImpl#getSlur <em>Slur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotationImpl extends MinimalEObjectImpl.Container implements Notation {
	/**
	 * The default value of the '{@link #getArticulation() <em>Articulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArticulation()
	 * @generated
	 * @ordered
	 */
	protected static final ArticulationType ARTICULATION_EDEFAULT = ArticulationType.DETACHED;

	/**
	 * The cached value of the '{@link #getArticulation() <em>Articulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArticulation()
	 * @generated
	 * @ordered
	 */
	protected ArticulationType articulation = ARTICULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrnament() <em>Ornament</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrnament()
	 * @generated
	 * @ordered
	 */
	protected static final OrnamentType ORNAMENT_EDEFAULT = OrnamentType.SLIDE;

	/**
	 * The cached value of the '{@link #getOrnament() <em>Ornament</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrnament()
	 * @generated
	 * @ordered
	 */
	protected OrnamentType ornament = ORNAMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSlur() <em>Slur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlur()
	 * @generated
	 * @ordered
	 */
	protected static final SlurType SLUR_EDEFAULT = SlurType.START;

	/**
	 * The cached value of the '{@link #getSlur() <em>Slur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlur()
	 * @generated
	 * @ordered
	 */
	protected SlurType slur = SLUR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MusicMetamodelPackage.Literals.NOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArticulationType getArticulation() {
		return articulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArticulation(ArticulationType newArticulation) {
		ArticulationType oldArticulation = articulation;
		articulation = newArticulation == null ? ARTICULATION_EDEFAULT : newArticulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicMetamodelPackage.NOTATION__ARTICULATION,
					oldArticulation, articulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrnamentType getOrnament() {
		return ornament;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrnament(OrnamentType newOrnament) {
		OrnamentType oldOrnament = ornament;
		ornament = newOrnament == null ? ORNAMENT_EDEFAULT : newOrnament;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicMetamodelPackage.NOTATION__ORNAMENT, oldOrnament,
					ornament));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SlurType getSlur() {
		return slur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSlur(SlurType newSlur) {
		SlurType oldSlur = slur;
		slur = newSlur == null ? SLUR_EDEFAULT : newSlur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicMetamodelPackage.NOTATION__SLUR, oldSlur, slur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MusicMetamodelPackage.NOTATION__ARTICULATION:
			return getArticulation();
		case MusicMetamodelPackage.NOTATION__ORNAMENT:
			return getOrnament();
		case MusicMetamodelPackage.NOTATION__SLUR:
			return getSlur();
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
		case MusicMetamodelPackage.NOTATION__ARTICULATION:
			setArticulation((ArticulationType) newValue);
			return;
		case MusicMetamodelPackage.NOTATION__ORNAMENT:
			setOrnament((OrnamentType) newValue);
			return;
		case MusicMetamodelPackage.NOTATION__SLUR:
			setSlur((SlurType) newValue);
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
		case MusicMetamodelPackage.NOTATION__ARTICULATION:
			setArticulation(ARTICULATION_EDEFAULT);
			return;
		case MusicMetamodelPackage.NOTATION__ORNAMENT:
			setOrnament(ORNAMENT_EDEFAULT);
			return;
		case MusicMetamodelPackage.NOTATION__SLUR:
			setSlur(SLUR_EDEFAULT);
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
		case MusicMetamodelPackage.NOTATION__ARTICULATION:
			return articulation != ARTICULATION_EDEFAULT;
		case MusicMetamodelPackage.NOTATION__ORNAMENT:
			return ornament != ORNAMENT_EDEFAULT;
		case MusicMetamodelPackage.NOTATION__SLUR:
			return slur != SLUR_EDEFAULT;
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
		result.append(" (articulation: ");
		result.append(articulation);
		result.append(", ornament: ");
		result.append(ornament);
		result.append(", slur: ");
		result.append(slur);
		result.append(')');
		return result.toString();
	}

} //NotationImpl
