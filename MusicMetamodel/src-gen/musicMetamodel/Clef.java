/**
 */
package musicMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clef</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link musicMetamodel.Clef#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see musicMetamodel.MusicMetamodelPackage#getClef()
 * @model
 * @generated
 */
public interface Clef extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link musicMetamodel.ClefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see musicMetamodel.ClefType
	 * @see #setType(ClefType)
	 * @see musicMetamodel.MusicMetamodelPackage#getClef_Type()
	 * @model
	 * @generated
	 */
	ClefType getType();

	/**
	 * Sets the value of the '{@link musicMetamodel.Clef#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see musicMetamodel.ClefType
	 * @see #getType()
	 * @generated
	 */
	void setType(ClefType value);

} // Clef
