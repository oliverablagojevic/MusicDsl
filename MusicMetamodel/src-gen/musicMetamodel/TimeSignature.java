/**
 */
package musicMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link musicMetamodel.TimeSignature#getBeat <em>Beat</em>}</li>
 *   <li>{@link musicMetamodel.TimeSignature#getBeatType <em>Beat Type</em>}</li>
 * </ul>
 *
 * @see musicMetamodel.MusicMetamodelPackage#getTimeSignature()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='LessThanTwelve LessThanEight'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot LessThanTwelve='self.beat &lt; 12' LessThanEight='self.beatType &lt; 8'"
 * @generated
 */
public interface TimeSignature extends EObject {
	/**
	 * Returns the value of the '<em><b>Beat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beat</em>' attribute.
	 * @see #setBeat(int)
	 * @see musicMetamodel.MusicMetamodelPackage#getTimeSignature_Beat()
	 * @model required="true"
	 * @generated
	 */
	int getBeat();

	/**
	 * Sets the value of the '{@link musicMetamodel.TimeSignature#getBeat <em>Beat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beat</em>' attribute.
	 * @see #getBeat()
	 * @generated
	 */
	void setBeat(int value);

	/**
	 * Returns the value of the '<em><b>Beat Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beat Type</em>' attribute.
	 * @see #setBeatType(int)
	 * @see musicMetamodel.MusicMetamodelPackage#getTimeSignature_BeatType()
	 * @model required="true"
	 * @generated
	 */
	int getBeatType();

	/**
	 * Sets the value of the '{@link musicMetamodel.TimeSignature#getBeatType <em>Beat Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beat Type</em>' attribute.
	 * @see #getBeatType()
	 * @generated
	 */
	void setBeatType(int value);

} // TimeSignature
