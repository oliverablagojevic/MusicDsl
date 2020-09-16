/**
 */
package musicMetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Note Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see musicMetamodel.MusicMetamodelPackage#getNoteType()
 * @model
 * @generated
 */
public enum NoteType implements Enumerator {
	/**
	 * The '<em><b>Whole</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHOLE_VALUE
	 * @generated
	 * @ordered
	 */
	WHOLE(0, "whole", "whole"),

	/**
	 * The '<em><b>Half</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALF_VALUE
	 * @generated
	 * @ordered
	 */
	HALF(1, "half", "half"),

	/**
	 * The '<em><b>Quarter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUARTER_VALUE
	 * @generated
	 * @ordered
	 */
	QUARTER(2, "quarter", "quarter"),

	/**
	 * The '<em><b>Eighth</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EIGHTH_VALUE
	 * @generated
	 * @ordered
	 */
	EIGHTH(3, "eighth", "eighth"),

	/**
	 * The '<em><b>Sixteenth</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIXTEENTH_VALUE
	 * @generated
	 * @ordered
	 */
	SIXTEENTH(4, "sixteenth", "sixteenth"),

	/**
	 * The '<em><b>Thirtysecond</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRTYSECOND_VALUE
	 * @generated
	 * @ordered
	 */
	THIRTYSECOND(5, "thirtysecond", "thirtysecond"),

	/**
	 * The '<em><b>Sixtyfourth</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIXTYFOURTH_VALUE
	 * @generated
	 * @ordered
	 */
	SIXTYFOURTH(6, "sixtyfourth", "sixtyfourth");

	/**
	 * The '<em><b>Whole</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHOLE
	 * @model name="whole"
	 * @generated
	 * @ordered
	 */
	public static final int WHOLE_VALUE = 0;

	/**
	 * The '<em><b>Half</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALF
	 * @model name="half"
	 * @generated
	 * @ordered
	 */
	public static final int HALF_VALUE = 1;

	/**
	 * The '<em><b>Quarter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUARTER
	 * @model name="quarter"
	 * @generated
	 * @ordered
	 */
	public static final int QUARTER_VALUE = 2;

	/**
	 * The '<em><b>Eighth</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EIGHTH
	 * @model name="eighth"
	 * @generated
	 * @ordered
	 */
	public static final int EIGHTH_VALUE = 3;

	/**
	 * The '<em><b>Sixteenth</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIXTEENTH
	 * @model name="sixteenth"
	 * @generated
	 * @ordered
	 */
	public static final int SIXTEENTH_VALUE = 4;

	/**
	 * The '<em><b>Thirtysecond</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRTYSECOND
	 * @model name="thirtysecond"
	 * @generated
	 * @ordered
	 */
	public static final int THIRTYSECOND_VALUE = 5;

	/**
	 * The '<em><b>Sixtyfourth</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIXTYFOURTH
	 * @model name="sixtyfourth"
	 * @generated
	 * @ordered
	 */
	public static final int SIXTYFOURTH_VALUE = 6;

	/**
	 * An array of all the '<em><b>Note Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NoteType[] VALUES_ARRAY = new NoteType[] { WHOLE, HALF, QUARTER, EIGHTH, SIXTEENTH,
			THIRTYSECOND, SIXTYFOURTH, };

	/**
	 * A public read-only list of all the '<em><b>Note Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NoteType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Note Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NoteType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NoteType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Note Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NoteType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NoteType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Note Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NoteType get(int value) {
		switch (value) {
		case WHOLE_VALUE:
			return WHOLE;
		case HALF_VALUE:
			return HALF;
		case QUARTER_VALUE:
			return QUARTER;
		case EIGHTH_VALUE:
			return EIGHTH;
		case SIXTEENTH_VALUE:
			return SIXTEENTH;
		case THIRTYSECOND_VALUE:
			return THIRTYSECOND;
		case SIXTYFOURTH_VALUE:
			return SIXTYFOURTH;
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
	private NoteType(int value, String name, String literal) {
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

} //NoteType
