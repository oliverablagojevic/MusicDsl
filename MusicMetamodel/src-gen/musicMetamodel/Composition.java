/**
 */
package musicMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link musicMetamodel.Composition#getName <em>Name</em>}</li>
 *   <li>{@link musicMetamodel.Composition#getAuthor <em>Author</em>}</li>
 *   <li>{@link musicMetamodel.Composition#getInstrument <em>Instrument</em>}</li>
 *   <li>{@link musicMetamodel.Composition#getTonality <em>Tonality</em>}</li>
 *   <li>{@link musicMetamodel.Composition#getSoundTempo <em>Sound Tempo</em>}</li>
 *   <li>{@link musicMetamodel.Composition#getStaff <em>Staff</em>}</li>
 * </ul>
 *
 * @see musicMetamodel.MusicMetamodelPackage#getComposition()
 * @model
 * @generated
 */
public interface Composition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see musicMetamodel.MusicMetamodelPackage#getComposition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link musicMetamodel.Composition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see musicMetamodel.MusicMetamodelPackage#getComposition_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link musicMetamodel.Composition#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Instrument</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instrument</em>' attribute.
	 * @see #setInstrument(String)
	 * @see musicMetamodel.MusicMetamodelPackage#getComposition_Instrument()
	 * @model
	 * @generated
	 */
	String getInstrument();

	/**
	 * Sets the value of the '{@link musicMetamodel.Composition#getInstrument <em>Instrument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instrument</em>' attribute.
	 * @see #getInstrument()
	 * @generated
	 */
	void setInstrument(String value);

	/**
	 * Returns the value of the '<em><b>Tonality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tonality</em>' attribute.
	 * @see #setTonality(String)
	 * @see musicMetamodel.MusicMetamodelPackage#getComposition_Tonality()
	 * @model
	 * @generated
	 */
	String getTonality();

	/**
	 * Sets the value of the '{@link musicMetamodel.Composition#getTonality <em>Tonality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tonality</em>' attribute.
	 * @see #getTonality()
	 * @generated
	 */
	void setTonality(String value);

	/**
	 * Returns the value of the '<em><b>Sound Tempo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sound Tempo</em>' attribute.
	 * @see #setSoundTempo(int)
	 * @see musicMetamodel.MusicMetamodelPackage#getComposition_SoundTempo()
	 * @model required="true"
	 * @generated
	 */
	int getSoundTempo();

	/**
	 * Sets the value of the '{@link musicMetamodel.Composition#getSoundTempo <em>Sound Tempo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sound Tempo</em>' attribute.
	 * @see #getSoundTempo()
	 * @generated
	 */
	void setSoundTempo(int value);

	/**
	 * Returns the value of the '<em><b>Staff</b></em>' containment reference list.
	 * The list contents are of type {@link musicMetamodel.Staff}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff</em>' containment reference list.
	 * @see musicMetamodel.MusicMetamodelPackage#getComposition_Staff()
	 * @model containment="true" required="true" upper="2"
	 * @generated
	 */
	EList<Staff> getStaff();

} // Composition
