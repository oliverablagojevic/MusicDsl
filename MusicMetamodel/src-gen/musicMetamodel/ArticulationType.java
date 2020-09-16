/**
 */
package musicMetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Articulation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see musicMetamodel.MusicMetamodelPackage#getArticulationType()
 * @model
 * @generated
 */
public enum ArticulationType implements Enumerator {
	/**
	 * The '<em><b>Detached</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DETACHED_VALUE
	 * @generated
	 * @ordered
	 */
	DETACHED(0, "detached", "detached"),

	/**
	 * The '<em><b>Legato</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGATO_VALUE
	 * @generated
	 * @ordered
	 */
	LEGATO(1, "legato", "legato"),

	/**
	 * The '<em><b>Staccato</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STACCATO_VALUE
	 * @generated
	 * @ordered
	 */
	STACCATO(2, "staccato", "staccato"),

	/**
	 * The '<em><b>Portato</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORTATO_VALUE
	 * @generated
	 * @ordered
	 */
	PORTATO(3, "portato", "portato"),

	/**
	 * The '<em><b>Tenuto</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TENUTO_VALUE
	 * @generated
	 * @ordered
	 */
	TENUTO(4, "tenuto", "tenuto"),

	/**
	 * The '<em><b>Marcato</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARCATO_VALUE
	 * @generated
	 * @ordered
	 */
	MARCATO(5, "marcato", "marcato");

	/**
	 * The '<em><b>Detached</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DETACHED
	 * @model name="detached"
	 * @generated
	 * @ordered
	 */
	public static final int DETACHED_VALUE = 0;

	/**
	 * The '<em><b>Legato</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGATO
	 * @model name="legato"
	 * @generated
	 * @ordered
	 */
	public static final int LEGATO_VALUE = 1;

	/**
	 * The '<em><b>Staccato</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STACCATO
	 * @model name="staccato"
	 * @generated
	 * @ordered
	 */
	public static final int STACCATO_VALUE = 2;

	/**
	 * The '<em><b>Portato</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORTATO
	 * @model name="portato"
	 * @generated
	 * @ordered
	 */
	public static final int PORTATO_VALUE = 3;

	/**
	 * The '<em><b>Tenuto</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TENUTO
	 * @model name="tenuto"
	 * @generated
	 * @ordered
	 */
	public static final int TENUTO_VALUE = 4;

	/**
	 * The '<em><b>Marcato</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARCATO
	 * @model name="marcato"
	 * @generated
	 * @ordered
	 */
	public static final int MARCATO_VALUE = 5;

	/**
	 * An array of all the '<em><b>Articulation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ArticulationType[] VALUES_ARRAY = new ArticulationType[] { DETACHED, LEGATO, STACCATO, PORTATO,
			TENUTO, MARCATO, };

	/**
	 * A public read-only list of all the '<em><b>Articulation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ArticulationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Articulation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArticulationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArticulationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Articulation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArticulationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArticulationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Articulation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArticulationType get(int value) {
		switch (value) {
		case DETACHED_VALUE:
			return DETACHED;
		case LEGATO_VALUE:
			return LEGATO;
		case STACCATO_VALUE:
			return STACCATO;
		case PORTATO_VALUE:
			return PORTATO;
		case TENUTO_VALUE:
			return TENUTO;
		case MARCATO_VALUE:
			return MARCATO;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ArticulationType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //ArticulationType
