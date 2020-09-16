/**
 */
package musicMetamodel.impl;

import java.util.Collection;

import musicMetamodel.AccidentalType;
import musicMetamodel.MusicMetamodelPackage;
import musicMetamodel.Notation;
import musicMetamodel.Note;
import musicMetamodel.NoteName;
import musicMetamodel.NoteType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link musicMetamodel.impl.NoteImpl#getName <em>Name</em>}</li>
 *   <li>{@link musicMetamodel.impl.NoteImpl#getType <em>Type</em>}</li>
 *   <li>{@link musicMetamodel.impl.NoteImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link musicMetamodel.impl.NoteImpl#getOctave <em>Octave</em>}</li>
 *   <li>{@link musicMetamodel.impl.NoteImpl#getVoice <em>Voice</em>}</li>
 *   <li>{@link musicMetamodel.impl.NoteImpl#getDynamic <em>Dynamic</em>}</li>
 *   <li>{@link musicMetamodel.impl.NoteImpl#isFermata <em>Fermata</em>}</li>
 *   <li>{@link musicMetamodel.impl.NoteImpl#isDot <em>Dot</em>}</li>
 *   <li>{@link musicMetamodel.impl.NoteImpl#getAccidental <em>Accidental</em>}</li>
 *   <li>{@link musicMetamodel.impl.NoteImpl#getNotation <em>Notation</em>}</li>
 *   <li>{@link musicMetamodel.impl.NoteImpl#getLyrics <em>Lyrics</em>}</li>
 *   <li>{@link musicMetamodel.impl.NoteImpl#isChord <em>Chord</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NoteImpl extends StaffElementImpl implements Note {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final NoteName NAME_EDEFAULT = NoteName.C;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected NoteName name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final NoteType TYPE_EDEFAULT = NoteType.WHOLE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected NoteType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOctave() <em>Octave</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOctave()
	 * @generated
	 * @ordered
	 */
	protected static final int OCTAVE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOctave() <em>Octave</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOctave()
	 * @generated
	 * @ordered
	 */
	protected int octave = OCTAVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoice() <em>Voice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoice()
	 * @generated
	 * @ordered
	 */
	protected static final int VOICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVoice() <em>Voice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoice()
	 * @generated
	 * @ordered
	 */
	protected int voice = VOICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDynamic() <em>Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamic()
	 * @generated
	 * @ordered
	 */
	protected static final String DYNAMIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDynamic() <em>Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamic()
	 * @generated
	 * @ordered
	 */
	protected String dynamic = DYNAMIC_EDEFAULT;

	/**
	 * The default value of the '{@link #isFermata() <em>Fermata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFermata()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FERMATA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFermata() <em>Fermata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFermata()
	 * @generated
	 * @ordered
	 */
	protected boolean fermata = FERMATA_EDEFAULT;

	/**
	 * The default value of the '{@link #isDot() <em>Dot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDot() <em>Dot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDot()
	 * @generated
	 * @ordered
	 */
	protected boolean dot = DOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccidental() <em>Accidental</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccidental()
	 * @generated
	 * @ordered
	 */
	protected static final AccidentalType ACCIDENTAL_EDEFAULT = AccidentalType.SHARP;

	/**
	 * The cached value of the '{@link #getAccidental() <em>Accidental</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccidental()
	 * @generated
	 * @ordered
	 */
	protected AccidentalType accidental = ACCIDENTAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNotation() <em>Notation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotation()
	 * @generated
	 * @ordered
	 */
	protected EList<Notation> notation;

	/**
	 * The default value of the '{@link #getLyrics() <em>Lyrics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLyrics()
	 * @generated
	 * @ordered
	 */
	protected static final String LYRICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLyrics() <em>Lyrics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLyrics()
	 * @generated
	 * @ordered
	 */
	protected String lyrics = LYRICS_EDEFAULT;

	/**
	 * The default value of the '{@link #isChord() <em>Chord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChord()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHORD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isChord() <em>Chord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChord()
	 * @generated
	 * @ordered
	 */
	protected boolean chord = CHORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MusicMetamodelPackage.Literals.NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoteName getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(NoteName newName) {
		NoteName oldName = name;
		name = newName == null ? NAME_EDEFAULT : newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicMetamodelPackage.NOTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoteType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(NoteType newType) {
		NoteType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicMetamodelPackage.NOTE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicMetamodelPackage.NOTE__DURATION, oldDuration,
					duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOctave() {
		return octave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOctave(int newOctave) {
		int oldOctave = octave;
		octave = newOctave;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicMetamodelPackage.NOTE__OCTAVE, oldOctave,
					octave));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getVoice() {
		return voice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVoice(int newVoice) {
		int oldVoice = voice;
		voice = newVoice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicMetamodelPackage.NOTE__VOICE, oldVoice, voice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDynamic() {
		return dynamic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDynamic(String newDynamic) {
		String oldDynamic = dynamic;
		dynamic = newDynamic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicMetamodelPackage.NOTE__DYNAMIC, oldDynamic,
					dynamic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFermata() {
		return fermata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFermata(boolean newFermata) {
		boolean oldFermata = fermata;
		fermata = newFermata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicMetamodelPackage.NOTE__FERMATA, oldFermata,
					fermata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDot() {
		return dot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDot(boolean newDot) {
		boolean oldDot = dot;
		dot = newDot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicMetamodelPackage.NOTE__DOT, oldDot, dot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccidentalType getAccidental() {
		return accidental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccidental(AccidentalType newAccidental) {
		AccidentalType oldAccidental = accidental;
		accidental = newAccidental == null ? ACCIDENTAL_EDEFAULT : newAccidental;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicMetamodelPackage.NOTE__ACCIDENTAL, oldAccidental,
					accidental));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Notation> getNotation() {
		if (notation == null) {
			notation = new EObjectContainmentEList<Notation>(Notation.class, this,
					MusicMetamodelPackage.NOTE__NOTATION);
		}
		return notation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLyrics() {
		return lyrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLyrics(String newLyrics) {
		String oldLyrics = lyrics;
		lyrics = newLyrics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicMetamodelPackage.NOTE__LYRICS, oldLyrics,
					lyrics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isChord() {
		return chord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChord(boolean newChord) {
		boolean oldChord = chord;
		chord = newChord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicMetamodelPackage.NOTE__CHORD, oldChord, chord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MusicMetamodelPackage.NOTE__NOTATION:
			return ((InternalEList<?>) getNotation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MusicMetamodelPackage.NOTE__NAME:
			return getName();
		case MusicMetamodelPackage.NOTE__TYPE:
			return getType();
		case MusicMetamodelPackage.NOTE__DURATION:
			return getDuration();
		case MusicMetamodelPackage.NOTE__OCTAVE:
			return getOctave();
		case MusicMetamodelPackage.NOTE__VOICE:
			return getVoice();
		case MusicMetamodelPackage.NOTE__DYNAMIC:
			return getDynamic();
		case MusicMetamodelPackage.NOTE__FERMATA:
			return isFermata();
		case MusicMetamodelPackage.NOTE__DOT:
			return isDot();
		case MusicMetamodelPackage.NOTE__ACCIDENTAL:
			return getAccidental();
		case MusicMetamodelPackage.NOTE__NOTATION:
			return getNotation();
		case MusicMetamodelPackage.NOTE__LYRICS:
			return getLyrics();
		case MusicMetamodelPackage.NOTE__CHORD:
			return isChord();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MusicMetamodelPackage.NOTE__NAME:
			setName((NoteName) newValue);
			return;
		case MusicMetamodelPackage.NOTE__TYPE:
			setType((NoteType) newValue);
			return;
		case MusicMetamodelPackage.NOTE__DURATION:
			setDuration((Integer) newValue);
			return;
		case MusicMetamodelPackage.NOTE__OCTAVE:
			setOctave((Integer) newValue);
			return;
		case MusicMetamodelPackage.NOTE__VOICE:
			setVoice((Integer) newValue);
			return;
		case MusicMetamodelPackage.NOTE__DYNAMIC:
			setDynamic((String) newValue);
			return;
		case MusicMetamodelPackage.NOTE__FERMATA:
			setFermata((Boolean) newValue);
			return;
		case MusicMetamodelPackage.NOTE__DOT:
			setDot((Boolean) newValue);
			return;
		case MusicMetamodelPackage.NOTE__ACCIDENTAL:
			setAccidental((AccidentalType) newValue);
			return;
		case MusicMetamodelPackage.NOTE__NOTATION:
			getNotation().clear();
			getNotation().addAll((Collection<? extends Notation>) newValue);
			return;
		case MusicMetamodelPackage.NOTE__LYRICS:
			setLyrics((String) newValue);
			return;
		case MusicMetamodelPackage.NOTE__CHORD:
			setChord((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MusicMetamodelPackage.NOTE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MusicMetamodelPackage.NOTE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case MusicMetamodelPackage.NOTE__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case MusicMetamodelPackage.NOTE__OCTAVE:
			setOctave(OCTAVE_EDEFAULT);
			return;
		case MusicMetamodelPackage.NOTE__VOICE:
			setVoice(VOICE_EDEFAULT);
			return;
		case MusicMetamodelPackage.NOTE__DYNAMIC:
			setDynamic(DYNAMIC_EDEFAULT);
			return;
		case MusicMetamodelPackage.NOTE__FERMATA:
			setFermata(FERMATA_EDEFAULT);
			return;
		case MusicMetamodelPackage.NOTE__DOT:
			setDot(DOT_EDEFAULT);
			return;
		case MusicMetamodelPackage.NOTE__ACCIDENTAL:
			setAccidental(ACCIDENTAL_EDEFAULT);
			return;
		case MusicMetamodelPackage.NOTE__NOTATION:
			getNotation().clear();
			return;
		case MusicMetamodelPackage.NOTE__LYRICS:
			setLyrics(LYRICS_EDEFAULT);
			return;
		case MusicMetamodelPackage.NOTE__CHORD:
			setChord(CHORD_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MusicMetamodelPackage.NOTE__NAME:
			return name != NAME_EDEFAULT;
		case MusicMetamodelPackage.NOTE__TYPE:
			return type != TYPE_EDEFAULT;
		case MusicMetamodelPackage.NOTE__DURATION:
			return duration != DURATION_EDEFAULT;
		case MusicMetamodelPackage.NOTE__OCTAVE:
			return octave != OCTAVE_EDEFAULT;
		case MusicMetamodelPackage.NOTE__VOICE:
			return voice != VOICE_EDEFAULT;
		case MusicMetamodelPackage.NOTE__DYNAMIC:
			return DYNAMIC_EDEFAULT == null ? dynamic != null : !DYNAMIC_EDEFAULT.equals(dynamic);
		case MusicMetamodelPackage.NOTE__FERMATA:
			return fermata != FERMATA_EDEFAULT;
		case MusicMetamodelPackage.NOTE__DOT:
			return dot != DOT_EDEFAULT;
		case MusicMetamodelPackage.NOTE__ACCIDENTAL:
			return accidental != ACCIDENTAL_EDEFAULT;
		case MusicMetamodelPackage.NOTE__NOTATION:
			return notation != null && !notation.isEmpty();
		case MusicMetamodelPackage.NOTE__LYRICS:
			return LYRICS_EDEFAULT == null ? lyrics != null : !LYRICS_EDEFAULT.equals(lyrics);
		case MusicMetamodelPackage.NOTE__CHORD:
			return chord != CHORD_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", duration: ");
		result.append(duration);
		result.append(", octave: ");
		result.append(octave);
		result.append(", voice: ");
		result.append(voice);
		result.append(", dynamic: ");
		result.append(dynamic);
		result.append(", fermata: ");
		result.append(fermata);
		result.append(", dot: ");
		result.append(dot);
		result.append(", accidental: ");
		result.append(accidental);
		result.append(", lyrics: ");
		result.append(lyrics);
		result.append(", chord: ");
		result.append(chord);
		result.append(')');
		return result.toString();
	}

} //NoteImpl
