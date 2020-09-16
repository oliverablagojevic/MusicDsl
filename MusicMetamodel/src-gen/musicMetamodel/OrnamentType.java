/**
 */
package musicMetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ornament Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see musicMetamodel.MusicMetamodelPackage#getOrnamentType()
 * @model
 * @generated
 */
public enum OrnamentType implements Enumerator {
	/**
	 * The '<em><b>Slide</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLIDE_VALUE
	 * @generated
	 * @ordered
	 */
	SLIDE(0, "slide", "slide"),

	/**
	 * The '<em><b>Glissando</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLISSANDO_VALUE
	 * @generated
	 * @ordered
	 */
	GLISSANDO(1, "glissando", "glissando"),

	/**
	 * The '<em><b>Aciaccatura</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACIACCATURA_VALUE
	 * @generated
	 * @ordered
	 */
	ACIACCATURA(2, "aciaccatura", "aciaccatura"),

	/**
	 * The '<em><b>Appoggiatura</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPOGGIATURA_VALUE
	 * @generated
	 * @ordered
	 */
	APPOGGIATURA(3, "appoggiatura", "appoggiatura"),

	/**
	 * The '<em><b>Turn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TURN_VALUE
	 * @generated
	 * @ordered
	 */
	TURN(4, "turn", "turn"),

	/**
	 * The '<em><b>Mordent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MORDENT_VALUE
	 * @generated
	 * @ordered
	 */
	MORDENT(5, "mordent", "mordent"),

	/**
	 * The '<em><b>Trill</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRILL_VALUE
	 * @generated
	 * @ordered
	 */
	TRILL(6, "trill", "trill");

	/**
	 * The '<em><b>Slide</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLIDE
	 * @model name="slide"
	 * @generated
	 * @ordered
	 */
	public static final int SLIDE_VALUE = 0;

	/**
	 * The '<em><b>Glissando</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLISSANDO
	 * @model name="glissando"
	 * @generated
	 * @ordered
	 */
	public static final int GLISSANDO_VALUE = 1;

	/**
	 * The '<em><b>Aciaccatura</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACIACCATURA
	 * @model name="aciaccatura"
	 * @generated
	 * @ordered
	 */
	public static final int ACIACCATURA_VALUE = 2;

	/**
	 * The '<em><b>Appoggiatura</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPOGGIATURA
	 * @model name="appoggiatura"
	 * @generated
	 * @ordered
	 */
	public static final int APPOGGIATURA_VALUE = 3;

	/**
	 * The '<em><b>Turn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TURN
	 * @model name="turn"
	 * @generated
	 * @ordered
	 */
	public static final int TURN_VALUE = 4;

	/**
	 * The '<em><b>Mordent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MORDENT
	 * @model name="mordent"
	 * @generated
	 * @ordered
	 */
	public static final int MORDENT_VALUE = 5;

	/**
	 * The '<em><b>Trill</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRILL
	 * @model name="trill"
	 * @generated
	 * @ordered
	 */
	public static final int TRILL_VALUE = 6;

	/**
	 * An array of all the '<em><b>Ornament Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OrnamentType[] VALUES_ARRAY = new OrnamentType[] { SLIDE, GLISSANDO, ACIACCATURA, APPOGGIATURA,
			TURN, MORDENT, TRILL, };

	/**
	 * A public read-only list of all the '<em><b>Ornament Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OrnamentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ornament Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrnamentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrnamentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ornament Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrnamentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrnamentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ornament Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrnamentType get(int value) {
		switch (value) {
		case SLIDE_VALUE:
			return SLIDE;
		case GLISSANDO_VALUE:
			return GLISSANDO;
		case ACIACCATURA_VALUE:
			return ACIACCATURA;
		case APPOGGIATURA_VALUE:
			return APPOGGIATURA;
		case TURN_VALUE:
			return TURN;
		case MORDENT_VALUE:
			return MORDENT;
		case TRILL_VALUE:
			return TRILL;
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
	private OrnamentType(int value, String name, String literal) {
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

} //OrnamentType
