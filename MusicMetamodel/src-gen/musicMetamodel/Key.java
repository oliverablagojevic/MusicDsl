/**
 */
package musicMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link musicMetamodel.Key#getFifths <em>Fifths</em>}</li>
 * </ul>
 *
 * @see musicMetamodel.MusicMetamodelPackage#getKey()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='KeyLessThan KeyBiggerThan'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot KeyLessThan='self.fifths &lt;= 7' KeyBiggerThan='self.fifths &gt;= -7'"
 * @generated
 */
public interface Key extends EObject {
	/**
	 * Returns the value of the '<em><b>Fifths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fifths</em>' attribute.
	 * @see #setFifths(int)
	 * @see musicMetamodel.MusicMetamodelPackage#getKey_Fifths()
	 * @model required="true"
	 * @generated
	 */
	int getFifths();

	/**
	 * Sets the value of the '{@link musicMetamodel.Key#getFifths <em>Fifths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fifths</em>' attribute.
	 * @see #getFifths()
	 * @generated
	 */
	void setFifths(int value);

} // Key
