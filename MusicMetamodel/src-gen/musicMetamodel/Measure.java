/**
 */
package musicMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link musicMetamodel.Measure#getMeasureNumber <em>Measure Number</em>}</li>
 *   <li>{@link musicMetamodel.Measure#getRepetition <em>Repetition</em>}</li>
 *   <li>{@link musicMetamodel.Measure#getNote <em>Note</em>}</li>
 *   <li>{@link musicMetamodel.Measure#getRest <em>Rest</em>}</li>
 * </ul>
 *
 * @see musicMetamodel.MusicMetamodelPackage#getMeasure()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='BiggerThanZero'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot BiggerThanZero='self.measureNumber &gt; 0'"
 * @generated
 */
public interface Measure extends StaffElement {
	/**
	 * Returns the value of the '<em><b>Measure Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Number</em>' attribute.
	 * @see #setMeasureNumber(int)
	 * @see musicMetamodel.MusicMetamodelPackage#getMeasure_MeasureNumber()
	 * @model required="true"
	 * @generated
	 */
	int getMeasureNumber();

	/**
	 * Sets the value of the '{@link musicMetamodel.Measure#getMeasureNumber <em>Measure Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Number</em>' attribute.
	 * @see #getMeasureNumber()
	 * @generated
	 */
	void setMeasureNumber(int value);

	/**
	 * Returns the value of the '<em><b>Repetition</b></em>' containment reference list.
	 * The list contents are of type {@link musicMetamodel.Repetition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repetition</em>' containment reference list.
	 * @see musicMetamodel.MusicMetamodelPackage#getMeasure_Repetition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Repetition> getRepetition();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link musicMetamodel.Note}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see musicMetamodel.MusicMetamodelPackage#getMeasure_Note()
	 * @model containment="true"
	 * @generated
	 */
	EList<Note> getNote();

	/**
	 * Returns the value of the '<em><b>Rest</b></em>' containment reference list.
	 * The list contents are of type {@link musicMetamodel.Rest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest</em>' containment reference list.
	 * @see musicMetamodel.MusicMetamodelPackage#getMeasure_Rest()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rest> getRest();

} // Measure
