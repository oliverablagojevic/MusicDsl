/**
 */
package musicMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link musicMetamodel.Notation#getArticulation <em>Articulation</em>}</li>
 *   <li>{@link musicMetamodel.Notation#getOrnament <em>Ornament</em>}</li>
 *   <li>{@link musicMetamodel.Notation#getSlur <em>Slur</em>}</li>
 * </ul>
 *
 * @see musicMetamodel.MusicMetamodelPackage#getNotation()
 * @model
 * @generated
 */
public interface Notation extends EObject {
	/**
	 * Returns the value of the '<em><b>Articulation</b></em>' attribute.
	 * The literals are from the enumeration {@link musicMetamodel.ArticulationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Articulation</em>' attribute.
	 * @see musicMetamodel.ArticulationType
	 * @see #setArticulation(ArticulationType)
	 * @see musicMetamodel.MusicMetamodelPackage#getNotation_Articulation()
	 * @model
	 * @generated
	 */
	ArticulationType getArticulation();

	/**
	 * Sets the value of the '{@link musicMetamodel.Notation#getArticulation <em>Articulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Articulation</em>' attribute.
	 * @see musicMetamodel.ArticulationType
	 * @see #getArticulation()
	 * @generated
	 */
	void setArticulation(ArticulationType value);

	/**
	 * Returns the value of the '<em><b>Ornament</b></em>' attribute.
	 * The literals are from the enumeration {@link musicMetamodel.OrnamentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ornament</em>' attribute.
	 * @see musicMetamodel.OrnamentType
	 * @see #setOrnament(OrnamentType)
	 * @see musicMetamodel.MusicMetamodelPackage#getNotation_Ornament()
	 * @model
	 * @generated
	 */
	OrnamentType getOrnament();

	/**
	 * Sets the value of the '{@link musicMetamodel.Notation#getOrnament <em>Ornament</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ornament</em>' attribute.
	 * @see musicMetamodel.OrnamentType
	 * @see #getOrnament()
	 * @generated
	 */
	void setOrnament(OrnamentType value);

	/**
	 * Returns the value of the '<em><b>Slur</b></em>' attribute.
	 * The literals are from the enumeration {@link musicMetamodel.SlurType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slur</em>' attribute.
	 * @see musicMetamodel.SlurType
	 * @see #setSlur(SlurType)
	 * @see musicMetamodel.MusicMetamodelPackage#getNotation_Slur()
	 * @model
	 * @generated
	 */
	SlurType getSlur();

	/**
	 * Sets the value of the '{@link musicMetamodel.Notation#getSlur <em>Slur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slur</em>' attribute.
	 * @see musicMetamodel.SlurType
	 * @see #getSlur()
	 * @generated
	 */
	void setSlur(SlurType value);

} // Notation
