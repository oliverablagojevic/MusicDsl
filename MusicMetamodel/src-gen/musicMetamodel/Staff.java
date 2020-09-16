/**
 */
package musicMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link musicMetamodel.Staff#getStaffNumber <em>Staff Number</em>}</li>
 *   <li>{@link musicMetamodel.Staff#getClef <em>Clef</em>}</li>
 *   <li>{@link musicMetamodel.Staff#getTime <em>Time</em>}</li>
 *   <li>{@link musicMetamodel.Staff#getElements <em>Elements</em>}</li>
 *   <li>{@link musicMetamodel.Staff#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see musicMetamodel.MusicMetamodelPackage#getStaff()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='StaffNumber'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot StaffNumber='self.staffNumber = 1 or self.staffNumber = 2'"
 * @generated
 */
public interface Staff extends EObject {
	/**
	 * Returns the value of the '<em><b>Staff Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff Number</em>' attribute.
	 * @see #setStaffNumber(int)
	 * @see musicMetamodel.MusicMetamodelPackage#getStaff_StaffNumber()
	 * @model required="true"
	 * @generated
	 */
	int getStaffNumber();

	/**
	 * Sets the value of the '{@link musicMetamodel.Staff#getStaffNumber <em>Staff Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staff Number</em>' attribute.
	 * @see #getStaffNumber()
	 * @generated
	 */
	void setStaffNumber(int value);

	/**
	 * Returns the value of the '<em><b>Clef</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clef</em>' containment reference.
	 * @see #setClef(Clef)
	 * @see musicMetamodel.MusicMetamodelPackage#getStaff_Clef()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Clef getClef();

	/**
	 * Sets the value of the '{@link musicMetamodel.Staff#getClef <em>Clef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clef</em>' containment reference.
	 * @see #getClef()
	 * @generated
	 */
	void setClef(Clef value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' containment reference.
	 * @see #setTime(TimeSignature)
	 * @see musicMetamodel.MusicMetamodelPackage#getStaff_Time()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeSignature getTime();

	/**
	 * Sets the value of the '{@link musicMetamodel.Staff#getTime <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' containment reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(TimeSignature value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link musicMetamodel.StaffElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see musicMetamodel.MusicMetamodelPackage#getStaff_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<StaffElement> getElements();

	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' containment reference.
	 * @see #setKey(Key)
	 * @see musicMetamodel.MusicMetamodelPackage#getStaff_Key()
	 * @model containment="true"
	 * @generated
	 */
	Key getKey();

	/**
	 * Sets the value of the '{@link musicMetamodel.Staff#getKey <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' containment reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(Key value);

} // Staff
