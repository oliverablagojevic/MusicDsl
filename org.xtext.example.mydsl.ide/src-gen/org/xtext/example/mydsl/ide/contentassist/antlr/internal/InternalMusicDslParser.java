package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MusicDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMusicDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'violin'", "'bass'", "'whole'", "'half'", "'quarter'", "'eighth'", "'sixteenth'", "'thirtysecond'", "'sixtyfourth'", "'left'", "'right'", "'C'", "'D'", "'E'", "'F'", "'G'", "'A'", "'B'", "'sharp'", "'flat'", "'natural'", "'start'", "'stop'", "'detached'", "'legato'", "'staccato'", "'portato'", "'tenuto'", "'marcato'", "'slide'", "'glissando'", "'aciaccatura'", "'appoggiatura'", "'turn'", "'mordent'", "'trill'", "'Composition'", "'['", "']'", "'author:'", "'instrument:'", "'tonality:'", "'soundTempo:'", "','", "'-'", "'Staff'", "'clef:'", "'time:'", "'key:'", "'beat'", "'beatType'", "'Measure'", "'begin'", "'end'", "'rest'", "'repetition'", "'note'", "':'", "'type'", "'duration'", "'octave'", "'voice'", "'dynamic'", "'accidental'", "'lyrics'", "'notation:'", "'articulation'", "'ornament'", "'slur'", "'fermata'", "'dot'", "'chord'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMusicDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMusicDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMusicDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMusicDsl.g"; }


    	private MusicDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MusicDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleComposition"
    // InternalMusicDsl.g:53:1: entryRuleComposition : ruleComposition EOF ;
    public final void entryRuleComposition() throws RecognitionException {
        try {
            // InternalMusicDsl.g:54:1: ( ruleComposition EOF )
            // InternalMusicDsl.g:55:1: ruleComposition EOF
            {
             before(grammarAccess.getCompositionRule()); 
            pushFollow(FOLLOW_1);
            ruleComposition();

            state._fsp--;

             after(grammarAccess.getCompositionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComposition"


    // $ANTLR start "ruleComposition"
    // InternalMusicDsl.g:62:1: ruleComposition : ( ( rule__Composition__Group__0 ) ) ;
    public final void ruleComposition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:66:2: ( ( ( rule__Composition__Group__0 ) ) )
            // InternalMusicDsl.g:67:2: ( ( rule__Composition__Group__0 ) )
            {
            // InternalMusicDsl.g:67:2: ( ( rule__Composition__Group__0 ) )
            // InternalMusicDsl.g:68:3: ( rule__Composition__Group__0 )
            {
             before(grammarAccess.getCompositionAccess().getGroup()); 
            // InternalMusicDsl.g:69:3: ( rule__Composition__Group__0 )
            // InternalMusicDsl.g:69:4: rule__Composition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComposition"


    // $ANTLR start "entryRuleStaffElement"
    // InternalMusicDsl.g:78:1: entryRuleStaffElement : ruleStaffElement EOF ;
    public final void entryRuleStaffElement() throws RecognitionException {
        try {
            // InternalMusicDsl.g:79:1: ( ruleStaffElement EOF )
            // InternalMusicDsl.g:80:1: ruleStaffElement EOF
            {
             before(grammarAccess.getStaffElementRule()); 
            pushFollow(FOLLOW_1);
            ruleStaffElement();

            state._fsp--;

             after(grammarAccess.getStaffElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStaffElement"


    // $ANTLR start "ruleStaffElement"
    // InternalMusicDsl.g:87:1: ruleStaffElement : ( ( rule__StaffElement__Alternatives ) ) ;
    public final void ruleStaffElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:91:2: ( ( ( rule__StaffElement__Alternatives ) ) )
            // InternalMusicDsl.g:92:2: ( ( rule__StaffElement__Alternatives ) )
            {
            // InternalMusicDsl.g:92:2: ( ( rule__StaffElement__Alternatives ) )
            // InternalMusicDsl.g:93:3: ( rule__StaffElement__Alternatives )
            {
             before(grammarAccess.getStaffElementAccess().getAlternatives()); 
            // InternalMusicDsl.g:94:3: ( rule__StaffElement__Alternatives )
            // InternalMusicDsl.g:94:4: rule__StaffElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StaffElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStaffElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStaffElement"


    // $ANTLR start "entryRuleEString"
    // InternalMusicDsl.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMusicDsl.g:104:1: ( ruleEString EOF )
            // InternalMusicDsl.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMusicDsl.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMusicDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMusicDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalMusicDsl.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMusicDsl.g:119:3: ( rule__EString__Alternatives )
            // InternalMusicDsl.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalMusicDsl.g:128:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMusicDsl.g:129:1: ( ruleEInt EOF )
            // InternalMusicDsl.g:130:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMusicDsl.g:137:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:141:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMusicDsl.g:142:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMusicDsl.g:142:2: ( ( rule__EInt__Group__0 ) )
            // InternalMusicDsl.g:143:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMusicDsl.g:144:3: ( rule__EInt__Group__0 )
            // InternalMusicDsl.g:144:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleStaff"
    // InternalMusicDsl.g:153:1: entryRuleStaff : ruleStaff EOF ;
    public final void entryRuleStaff() throws RecognitionException {
        try {
            // InternalMusicDsl.g:154:1: ( ruleStaff EOF )
            // InternalMusicDsl.g:155:1: ruleStaff EOF
            {
             before(grammarAccess.getStaffRule()); 
            pushFollow(FOLLOW_1);
            ruleStaff();

            state._fsp--;

             after(grammarAccess.getStaffRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStaff"


    // $ANTLR start "ruleStaff"
    // InternalMusicDsl.g:162:1: ruleStaff : ( ( rule__Staff__Group__0 ) ) ;
    public final void ruleStaff() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:166:2: ( ( ( rule__Staff__Group__0 ) ) )
            // InternalMusicDsl.g:167:2: ( ( rule__Staff__Group__0 ) )
            {
            // InternalMusicDsl.g:167:2: ( ( rule__Staff__Group__0 ) )
            // InternalMusicDsl.g:168:3: ( rule__Staff__Group__0 )
            {
             before(grammarAccess.getStaffAccess().getGroup()); 
            // InternalMusicDsl.g:169:3: ( rule__Staff__Group__0 )
            // InternalMusicDsl.g:169:4: rule__Staff__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Staff__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStaffAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStaff"


    // $ANTLR start "entryRuleClef"
    // InternalMusicDsl.g:178:1: entryRuleClef : ruleClef EOF ;
    public final void entryRuleClef() throws RecognitionException {
        try {
            // InternalMusicDsl.g:179:1: ( ruleClef EOF )
            // InternalMusicDsl.g:180:1: ruleClef EOF
            {
             before(grammarAccess.getClefRule()); 
            pushFollow(FOLLOW_1);
            ruleClef();

            state._fsp--;

             after(grammarAccess.getClefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClef"


    // $ANTLR start "ruleClef"
    // InternalMusicDsl.g:187:1: ruleClef : ( ( rule__Clef__Group__0 ) ) ;
    public final void ruleClef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:191:2: ( ( ( rule__Clef__Group__0 ) ) )
            // InternalMusicDsl.g:192:2: ( ( rule__Clef__Group__0 ) )
            {
            // InternalMusicDsl.g:192:2: ( ( rule__Clef__Group__0 ) )
            // InternalMusicDsl.g:193:3: ( rule__Clef__Group__0 )
            {
             before(grammarAccess.getClefAccess().getGroup()); 
            // InternalMusicDsl.g:194:3: ( rule__Clef__Group__0 )
            // InternalMusicDsl.g:194:4: rule__Clef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Clef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClef"


    // $ANTLR start "entryRuleTimeSignature"
    // InternalMusicDsl.g:203:1: entryRuleTimeSignature : ruleTimeSignature EOF ;
    public final void entryRuleTimeSignature() throws RecognitionException {
        try {
            // InternalMusicDsl.g:204:1: ( ruleTimeSignature EOF )
            // InternalMusicDsl.g:205:1: ruleTimeSignature EOF
            {
             before(grammarAccess.getTimeSignatureRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeSignature();

            state._fsp--;

             after(grammarAccess.getTimeSignatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTimeSignature"


    // $ANTLR start "ruleTimeSignature"
    // InternalMusicDsl.g:212:1: ruleTimeSignature : ( ( rule__TimeSignature__Group__0 ) ) ;
    public final void ruleTimeSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:216:2: ( ( ( rule__TimeSignature__Group__0 ) ) )
            // InternalMusicDsl.g:217:2: ( ( rule__TimeSignature__Group__0 ) )
            {
            // InternalMusicDsl.g:217:2: ( ( rule__TimeSignature__Group__0 ) )
            // InternalMusicDsl.g:218:3: ( rule__TimeSignature__Group__0 )
            {
             before(grammarAccess.getTimeSignatureAccess().getGroup()); 
            // InternalMusicDsl.g:219:3: ( rule__TimeSignature__Group__0 )
            // InternalMusicDsl.g:219:4: rule__TimeSignature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TimeSignature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeSignatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeSignature"


    // $ANTLR start "entryRuleKey"
    // InternalMusicDsl.g:228:1: entryRuleKey : ruleKey EOF ;
    public final void entryRuleKey() throws RecognitionException {
        try {
            // InternalMusicDsl.g:229:1: ( ruleKey EOF )
            // InternalMusicDsl.g:230:1: ruleKey EOF
            {
             before(grammarAccess.getKeyRule()); 
            pushFollow(FOLLOW_1);
            ruleKey();

            state._fsp--;

             after(grammarAccess.getKeyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKey"


    // $ANTLR start "ruleKey"
    // InternalMusicDsl.g:237:1: ruleKey : ( ( rule__Key__FifthsAssignment ) ) ;
    public final void ruleKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:241:2: ( ( ( rule__Key__FifthsAssignment ) ) )
            // InternalMusicDsl.g:242:2: ( ( rule__Key__FifthsAssignment ) )
            {
            // InternalMusicDsl.g:242:2: ( ( rule__Key__FifthsAssignment ) )
            // InternalMusicDsl.g:243:3: ( rule__Key__FifthsAssignment )
            {
             before(grammarAccess.getKeyAccess().getFifthsAssignment()); 
            // InternalMusicDsl.g:244:3: ( rule__Key__FifthsAssignment )
            // InternalMusicDsl.g:244:4: rule__Key__FifthsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Key__FifthsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getKeyAccess().getFifthsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKey"


    // $ANTLR start "entryRuleMeasure"
    // InternalMusicDsl.g:253:1: entryRuleMeasure : ruleMeasure EOF ;
    public final void entryRuleMeasure() throws RecognitionException {
        try {
            // InternalMusicDsl.g:254:1: ( ruleMeasure EOF )
            // InternalMusicDsl.g:255:1: ruleMeasure EOF
            {
             before(grammarAccess.getMeasureRule()); 
            pushFollow(FOLLOW_1);
            ruleMeasure();

            state._fsp--;

             after(grammarAccess.getMeasureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMeasure"


    // $ANTLR start "ruleMeasure"
    // InternalMusicDsl.g:262:1: ruleMeasure : ( ( rule__Measure__Group__0 ) ) ;
    public final void ruleMeasure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:266:2: ( ( ( rule__Measure__Group__0 ) ) )
            // InternalMusicDsl.g:267:2: ( ( rule__Measure__Group__0 ) )
            {
            // InternalMusicDsl.g:267:2: ( ( rule__Measure__Group__0 ) )
            // InternalMusicDsl.g:268:3: ( rule__Measure__Group__0 )
            {
             before(grammarAccess.getMeasureAccess().getGroup()); 
            // InternalMusicDsl.g:269:3: ( rule__Measure__Group__0 )
            // InternalMusicDsl.g:269:4: rule__Measure__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Measure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMeasureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMeasure"


    // $ANTLR start "entryRuleRest"
    // InternalMusicDsl.g:278:1: entryRuleRest : ruleRest EOF ;
    public final void entryRuleRest() throws RecognitionException {
        try {
            // InternalMusicDsl.g:279:1: ( ruleRest EOF )
            // InternalMusicDsl.g:280:1: ruleRest EOF
            {
             before(grammarAccess.getRestRule()); 
            pushFollow(FOLLOW_1);
            ruleRest();

            state._fsp--;

             after(grammarAccess.getRestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRest"


    // $ANTLR start "ruleRest"
    // InternalMusicDsl.g:287:1: ruleRest : ( ( rule__Rest__Group__0 ) ) ;
    public final void ruleRest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:291:2: ( ( ( rule__Rest__Group__0 ) ) )
            // InternalMusicDsl.g:292:2: ( ( rule__Rest__Group__0 ) )
            {
            // InternalMusicDsl.g:292:2: ( ( rule__Rest__Group__0 ) )
            // InternalMusicDsl.g:293:3: ( rule__Rest__Group__0 )
            {
             before(grammarAccess.getRestAccess().getGroup()); 
            // InternalMusicDsl.g:294:3: ( rule__Rest__Group__0 )
            // InternalMusicDsl.g:294:4: rule__Rest__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRest"


    // $ANTLR start "entryRuleRepetition"
    // InternalMusicDsl.g:303:1: entryRuleRepetition : ruleRepetition EOF ;
    public final void entryRuleRepetition() throws RecognitionException {
        try {
            // InternalMusicDsl.g:304:1: ( ruleRepetition EOF )
            // InternalMusicDsl.g:305:1: ruleRepetition EOF
            {
             before(grammarAccess.getRepetitionRule()); 
            pushFollow(FOLLOW_1);
            ruleRepetition();

            state._fsp--;

             after(grammarAccess.getRepetitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRepetition"


    // $ANTLR start "ruleRepetition"
    // InternalMusicDsl.g:312:1: ruleRepetition : ( ( rule__Repetition__Group__0 ) ) ;
    public final void ruleRepetition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:316:2: ( ( ( rule__Repetition__Group__0 ) ) )
            // InternalMusicDsl.g:317:2: ( ( rule__Repetition__Group__0 ) )
            {
            // InternalMusicDsl.g:317:2: ( ( rule__Repetition__Group__0 ) )
            // InternalMusicDsl.g:318:3: ( rule__Repetition__Group__0 )
            {
             before(grammarAccess.getRepetitionAccess().getGroup()); 
            // InternalMusicDsl.g:319:3: ( rule__Repetition__Group__0 )
            // InternalMusicDsl.g:319:4: rule__Repetition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Repetition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRepetitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRepetition"


    // $ANTLR start "entryRuleNote"
    // InternalMusicDsl.g:328:1: entryRuleNote : ruleNote EOF ;
    public final void entryRuleNote() throws RecognitionException {
        try {
            // InternalMusicDsl.g:329:1: ( ruleNote EOF )
            // InternalMusicDsl.g:330:1: ruleNote EOF
            {
             before(grammarAccess.getNoteRule()); 
            pushFollow(FOLLOW_1);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getNoteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNote"


    // $ANTLR start "ruleNote"
    // InternalMusicDsl.g:337:1: ruleNote : ( ( rule__Note__Group__0 ) ) ;
    public final void ruleNote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:341:2: ( ( ( rule__Note__Group__0 ) ) )
            // InternalMusicDsl.g:342:2: ( ( rule__Note__Group__0 ) )
            {
            // InternalMusicDsl.g:342:2: ( ( rule__Note__Group__0 ) )
            // InternalMusicDsl.g:343:3: ( rule__Note__Group__0 )
            {
             before(grammarAccess.getNoteAccess().getGroup()); 
            // InternalMusicDsl.g:344:3: ( rule__Note__Group__0 )
            // InternalMusicDsl.g:344:4: rule__Note__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Note__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNote"


    // $ANTLR start "entryRuleNotation"
    // InternalMusicDsl.g:353:1: entryRuleNotation : ruleNotation EOF ;
    public final void entryRuleNotation() throws RecognitionException {
        try {
            // InternalMusicDsl.g:354:1: ( ruleNotation EOF )
            // InternalMusicDsl.g:355:1: ruleNotation EOF
            {
             before(grammarAccess.getNotationRule()); 
            pushFollow(FOLLOW_1);
            ruleNotation();

            state._fsp--;

             after(grammarAccess.getNotationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNotation"


    // $ANTLR start "ruleNotation"
    // InternalMusicDsl.g:362:1: ruleNotation : ( ( rule__Notation__Group__0 ) ) ;
    public final void ruleNotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:366:2: ( ( ( rule__Notation__Group__0 ) ) )
            // InternalMusicDsl.g:367:2: ( ( rule__Notation__Group__0 ) )
            {
            // InternalMusicDsl.g:367:2: ( ( rule__Notation__Group__0 ) )
            // InternalMusicDsl.g:368:3: ( rule__Notation__Group__0 )
            {
             before(grammarAccess.getNotationAccess().getGroup()); 
            // InternalMusicDsl.g:369:3: ( rule__Notation__Group__0 )
            // InternalMusicDsl.g:369:4: rule__Notation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Notation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNotationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotation"


    // $ANTLR start "ruleClefType"
    // InternalMusicDsl.g:378:1: ruleClefType : ( ( rule__ClefType__Alternatives ) ) ;
    public final void ruleClefType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:382:1: ( ( ( rule__ClefType__Alternatives ) ) )
            // InternalMusicDsl.g:383:2: ( ( rule__ClefType__Alternatives ) )
            {
            // InternalMusicDsl.g:383:2: ( ( rule__ClefType__Alternatives ) )
            // InternalMusicDsl.g:384:3: ( rule__ClefType__Alternatives )
            {
             before(grammarAccess.getClefTypeAccess().getAlternatives()); 
            // InternalMusicDsl.g:385:3: ( rule__ClefType__Alternatives )
            // InternalMusicDsl.g:385:4: rule__ClefType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ClefType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getClefTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClefType"


    // $ANTLR start "ruleRestType"
    // InternalMusicDsl.g:394:1: ruleRestType : ( ( rule__RestType__Alternatives ) ) ;
    public final void ruleRestType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:398:1: ( ( ( rule__RestType__Alternatives ) ) )
            // InternalMusicDsl.g:399:2: ( ( rule__RestType__Alternatives ) )
            {
            // InternalMusicDsl.g:399:2: ( ( rule__RestType__Alternatives ) )
            // InternalMusicDsl.g:400:3: ( rule__RestType__Alternatives )
            {
             before(grammarAccess.getRestTypeAccess().getAlternatives()); 
            // InternalMusicDsl.g:401:3: ( rule__RestType__Alternatives )
            // InternalMusicDsl.g:401:4: rule__RestType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RestType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRestTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRestType"


    // $ANTLR start "ruleRepetitionType"
    // InternalMusicDsl.g:410:1: ruleRepetitionType : ( ( rule__RepetitionType__Alternatives ) ) ;
    public final void ruleRepetitionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:414:1: ( ( ( rule__RepetitionType__Alternatives ) ) )
            // InternalMusicDsl.g:415:2: ( ( rule__RepetitionType__Alternatives ) )
            {
            // InternalMusicDsl.g:415:2: ( ( rule__RepetitionType__Alternatives ) )
            // InternalMusicDsl.g:416:3: ( rule__RepetitionType__Alternatives )
            {
             before(grammarAccess.getRepetitionTypeAccess().getAlternatives()); 
            // InternalMusicDsl.g:417:3: ( rule__RepetitionType__Alternatives )
            // InternalMusicDsl.g:417:4: rule__RepetitionType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RepetitionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRepetitionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRepetitionType"


    // $ANTLR start "ruleNoteName"
    // InternalMusicDsl.g:426:1: ruleNoteName : ( ( rule__NoteName__Alternatives ) ) ;
    public final void ruleNoteName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:430:1: ( ( ( rule__NoteName__Alternatives ) ) )
            // InternalMusicDsl.g:431:2: ( ( rule__NoteName__Alternatives ) )
            {
            // InternalMusicDsl.g:431:2: ( ( rule__NoteName__Alternatives ) )
            // InternalMusicDsl.g:432:3: ( rule__NoteName__Alternatives )
            {
             before(grammarAccess.getNoteNameAccess().getAlternatives()); 
            // InternalMusicDsl.g:433:3: ( rule__NoteName__Alternatives )
            // InternalMusicDsl.g:433:4: rule__NoteName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NoteName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNoteNameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoteName"


    // $ANTLR start "ruleNoteType"
    // InternalMusicDsl.g:442:1: ruleNoteType : ( ( rule__NoteType__Alternatives ) ) ;
    public final void ruleNoteType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:446:1: ( ( ( rule__NoteType__Alternatives ) ) )
            // InternalMusicDsl.g:447:2: ( ( rule__NoteType__Alternatives ) )
            {
            // InternalMusicDsl.g:447:2: ( ( rule__NoteType__Alternatives ) )
            // InternalMusicDsl.g:448:3: ( rule__NoteType__Alternatives )
            {
             before(grammarAccess.getNoteTypeAccess().getAlternatives()); 
            // InternalMusicDsl.g:449:3: ( rule__NoteType__Alternatives )
            // InternalMusicDsl.g:449:4: rule__NoteType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NoteType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNoteTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoteType"


    // $ANTLR start "ruleAccidentalType"
    // InternalMusicDsl.g:458:1: ruleAccidentalType : ( ( rule__AccidentalType__Alternatives ) ) ;
    public final void ruleAccidentalType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:462:1: ( ( ( rule__AccidentalType__Alternatives ) ) )
            // InternalMusicDsl.g:463:2: ( ( rule__AccidentalType__Alternatives ) )
            {
            // InternalMusicDsl.g:463:2: ( ( rule__AccidentalType__Alternatives ) )
            // InternalMusicDsl.g:464:3: ( rule__AccidentalType__Alternatives )
            {
             before(grammarAccess.getAccidentalTypeAccess().getAlternatives()); 
            // InternalMusicDsl.g:465:3: ( rule__AccidentalType__Alternatives )
            // InternalMusicDsl.g:465:4: rule__AccidentalType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AccidentalType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAccidentalTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccidentalType"


    // $ANTLR start "ruleSlurType"
    // InternalMusicDsl.g:474:1: ruleSlurType : ( ( rule__SlurType__Alternatives ) ) ;
    public final void ruleSlurType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:478:1: ( ( ( rule__SlurType__Alternatives ) ) )
            // InternalMusicDsl.g:479:2: ( ( rule__SlurType__Alternatives ) )
            {
            // InternalMusicDsl.g:479:2: ( ( rule__SlurType__Alternatives ) )
            // InternalMusicDsl.g:480:3: ( rule__SlurType__Alternatives )
            {
             before(grammarAccess.getSlurTypeAccess().getAlternatives()); 
            // InternalMusicDsl.g:481:3: ( rule__SlurType__Alternatives )
            // InternalMusicDsl.g:481:4: rule__SlurType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SlurType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSlurTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSlurType"


    // $ANTLR start "ruleArticulationType"
    // InternalMusicDsl.g:490:1: ruleArticulationType : ( ( rule__ArticulationType__Alternatives ) ) ;
    public final void ruleArticulationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:494:1: ( ( ( rule__ArticulationType__Alternatives ) ) )
            // InternalMusicDsl.g:495:2: ( ( rule__ArticulationType__Alternatives ) )
            {
            // InternalMusicDsl.g:495:2: ( ( rule__ArticulationType__Alternatives ) )
            // InternalMusicDsl.g:496:3: ( rule__ArticulationType__Alternatives )
            {
             before(grammarAccess.getArticulationTypeAccess().getAlternatives()); 
            // InternalMusicDsl.g:497:3: ( rule__ArticulationType__Alternatives )
            // InternalMusicDsl.g:497:4: rule__ArticulationType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ArticulationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArticulationTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArticulationType"


    // $ANTLR start "ruleOrnamentType"
    // InternalMusicDsl.g:506:1: ruleOrnamentType : ( ( rule__OrnamentType__Alternatives ) ) ;
    public final void ruleOrnamentType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:510:1: ( ( ( rule__OrnamentType__Alternatives ) ) )
            // InternalMusicDsl.g:511:2: ( ( rule__OrnamentType__Alternatives ) )
            {
            // InternalMusicDsl.g:511:2: ( ( rule__OrnamentType__Alternatives ) )
            // InternalMusicDsl.g:512:3: ( rule__OrnamentType__Alternatives )
            {
             before(grammarAccess.getOrnamentTypeAccess().getAlternatives()); 
            // InternalMusicDsl.g:513:3: ( rule__OrnamentType__Alternatives )
            // InternalMusicDsl.g:513:4: rule__OrnamentType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OrnamentType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOrnamentTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrnamentType"


    // $ANTLR start "rule__StaffElement__Alternatives"
    // InternalMusicDsl.g:521:1: rule__StaffElement__Alternatives : ( ( ruleMeasure ) | ( ruleRest ) | ( ruleRepetition ) | ( ruleNote ) );
    public final void rule__StaffElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:525:1: ( ( ruleMeasure ) | ( ruleRest ) | ( ruleRepetition ) | ( ruleNote ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt1=1;
                }
                break;
            case 65:
                {
                alt1=2;
                }
                break;
            case 66:
                {
                alt1=3;
                }
                break;
            case 67:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMusicDsl.g:526:2: ( ruleMeasure )
                    {
                    // InternalMusicDsl.g:526:2: ( ruleMeasure )
                    // InternalMusicDsl.g:527:3: ruleMeasure
                    {
                     before(grammarAccess.getStaffElementAccess().getMeasureParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMeasure();

                    state._fsp--;

                     after(grammarAccess.getStaffElementAccess().getMeasureParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMusicDsl.g:532:2: ( ruleRest )
                    {
                    // InternalMusicDsl.g:532:2: ( ruleRest )
                    // InternalMusicDsl.g:533:3: ruleRest
                    {
                     before(grammarAccess.getStaffElementAccess().getRestParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRest();

                    state._fsp--;

                     after(grammarAccess.getStaffElementAccess().getRestParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMusicDsl.g:538:2: ( ruleRepetition )
                    {
                    // InternalMusicDsl.g:538:2: ( ruleRepetition )
                    // InternalMusicDsl.g:539:3: ruleRepetition
                    {
                     before(grammarAccess.getStaffElementAccess().getRepetitionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRepetition();

                    state._fsp--;

                     after(grammarAccess.getStaffElementAccess().getRepetitionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMusicDsl.g:544:2: ( ruleNote )
                    {
                    // InternalMusicDsl.g:544:2: ( ruleNote )
                    // InternalMusicDsl.g:545:3: ruleNote
                    {
                     before(grammarAccess.getStaffElementAccess().getNoteParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleNote();

                    state._fsp--;

                     after(grammarAccess.getStaffElementAccess().getNoteParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaffElement__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMusicDsl.g:554:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:558:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMusicDsl.g:559:2: ( RULE_STRING )
                    {
                    // InternalMusicDsl.g:559:2: ( RULE_STRING )
                    // InternalMusicDsl.g:560:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMusicDsl.g:565:2: ( RULE_ID )
                    {
                    // InternalMusicDsl.g:565:2: ( RULE_ID )
                    // InternalMusicDsl.g:566:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__ClefType__Alternatives"
    // InternalMusicDsl.g:575:1: rule__ClefType__Alternatives : ( ( ( 'violin' ) ) | ( ( 'bass' ) ) );
    public final void rule__ClefType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:579:1: ( ( ( 'violin' ) ) | ( ( 'bass' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMusicDsl.g:580:2: ( ( 'violin' ) )
                    {
                    // InternalMusicDsl.g:580:2: ( ( 'violin' ) )
                    // InternalMusicDsl.g:581:3: ( 'violin' )
                    {
                     before(grammarAccess.getClefTypeAccess().getViolinEnumLiteralDeclaration_0()); 
                    // InternalMusicDsl.g:582:3: ( 'violin' )
                    // InternalMusicDsl.g:582:4: 'violin'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getClefTypeAccess().getViolinEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMusicDsl.g:586:2: ( ( 'bass' ) )
                    {
                    // InternalMusicDsl.g:586:2: ( ( 'bass' ) )
                    // InternalMusicDsl.g:587:3: ( 'bass' )
                    {
                     before(grammarAccess.getClefTypeAccess().getBassEnumLiteralDeclaration_1()); 
                    // InternalMusicDsl.g:588:3: ( 'bass' )
                    // InternalMusicDsl.g:588:4: 'bass'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getClefTypeAccess().getBassEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClefType__Alternatives"


    // $ANTLR start "rule__RestType__Alternatives"
    // InternalMusicDsl.g:596:1: rule__RestType__Alternatives : ( ( ( 'whole' ) ) | ( ( 'half' ) ) | ( ( 'quarter' ) ) | ( ( 'eighth' ) ) | ( ( 'sixteenth' ) ) | ( ( 'thirtysecond' ) ) | ( ( 'sixtyfourth' ) ) );
    public final void rule__RestType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:600:1: ( ( ( 'whole' ) ) | ( ( 'half' ) ) | ( ( 'quarter' ) ) | ( ( 'eighth' ) ) | ( ( 'sixteenth' ) ) | ( ( 'thirtysecond' ) ) | ( ( 'sixtyfourth' ) ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            case 17:
                {
                alt4=5;
                }
                break;
            case 18:
                {
                alt4=6;
                }
                break;
            case 19:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMusicDsl.g:601:2: ( ( 'whole' ) )
                    {
                    // InternalMusicDsl.g:601:2: ( ( 'whole' ) )
                    // InternalMusicDsl.g:602:3: ( 'whole' )
                    {
                     before(grammarAccess.getRestTypeAccess().getWholeEnumLiteralDeclaration_0()); 
                    // InternalMusicDsl.g:603:3: ( 'whole' )
                    // InternalMusicDsl.g:603:4: 'whole'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getRestTypeAccess().getWholeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMusicDsl.g:607:2: ( ( 'half' ) )
                    {
                    // InternalMusicDsl.g:607:2: ( ( 'half' ) )
                    // InternalMusicDsl.g:608:3: ( 'half' )
                    {
                     before(grammarAccess.getRestTypeAccess().getHalfEnumLiteralDeclaration_1()); 
                    // InternalMusicDsl.g:609:3: ( 'half' )
                    // InternalMusicDsl.g:609:4: 'half'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getRestTypeAccess().getHalfEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMusicDsl.g:613:2: ( ( 'quarter' ) )
                    {
                    // InternalMusicDsl.g:613:2: ( ( 'quarter' ) )
                    // InternalMusicDsl.g:614:3: ( 'quarter' )
                    {
                     before(grammarAccess.getRestTypeAccess().getQuarterEnumLiteralDeclaration_2()); 
                    // InternalMusicDsl.g:615:3: ( 'quarter' )
                    // InternalMusicDsl.g:615:4: 'quarter'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getRestTypeAccess().getQuarterEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMusicDsl.g:619:2: ( ( 'eighth' ) )
                    {
                    // InternalMusicDsl.g:619:2: ( ( 'eighth' ) )
                    // InternalMusicDsl.g:620:3: ( 'eighth' )
                    {
                     before(grammarAccess.getRestTypeAccess().getEighthEnumLiteralDeclaration_3()); 
                    // InternalMusicDsl.g:621:3: ( 'eighth' )
                    // InternalMusicDsl.g:621:4: 'eighth'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getRestTypeAccess().getEighthEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMusicDsl.g:625:2: ( ( 'sixteenth' ) )
                    {
                    // InternalMusicDsl.g:625:2: ( ( 'sixteenth' ) )
                    // InternalMusicDsl.g:626:3: ( 'sixteenth' )
                    {
                     before(grammarAccess.getRestTypeAccess().getSixteenthEnumLiteralDeclaration_4()); 
                    // InternalMusicDsl.g:627:3: ( 'sixteenth' )
                    // InternalMusicDsl.g:627:4: 'sixteenth'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getRestTypeAccess().getSixteenthEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMusicDsl.g:631:2: ( ( 'thirtysecond' ) )
                    {
                    // InternalMusicDsl.g:631:2: ( ( 'thirtysecond' ) )
                    // InternalMusicDsl.g:632:3: ( 'thirtysecond' )
                    {
                     before(grammarAccess.getRestTypeAccess().getThirtysecondEnumLiteralDeclaration_5()); 
                    // InternalMusicDsl.g:633:3: ( 'thirtysecond' )
                    // InternalMusicDsl.g:633:4: 'thirtysecond'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getRestTypeAccess().getThirtysecondEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMusicDsl.g:637:2: ( ( 'sixtyfourth' ) )
                    {
                    // InternalMusicDsl.g:637:2: ( ( 'sixtyfourth' ) )
                    // InternalMusicDsl.g:638:3: ( 'sixtyfourth' )
                    {
                     before(grammarAccess.getRestTypeAccess().getSixtyfourthEnumLiteralDeclaration_6()); 
                    // InternalMusicDsl.g:639:3: ( 'sixtyfourth' )
                    // InternalMusicDsl.g:639:4: 'sixtyfourth'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getRestTypeAccess().getSixtyfourthEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestType__Alternatives"


    // $ANTLR start "rule__RepetitionType__Alternatives"
    // InternalMusicDsl.g:647:1: rule__RepetitionType__Alternatives : ( ( ( 'left' ) ) | ( ( 'right' ) ) );
    public final void rule__RepetitionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:651:1: ( ( ( 'left' ) ) | ( ( 'right' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            else if ( (LA5_0==21) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMusicDsl.g:652:2: ( ( 'left' ) )
                    {
                    // InternalMusicDsl.g:652:2: ( ( 'left' ) )
                    // InternalMusicDsl.g:653:3: ( 'left' )
                    {
                     before(grammarAccess.getRepetitionTypeAccess().getLeftEnumLiteralDeclaration_0()); 
                    // InternalMusicDsl.g:654:3: ( 'left' )
                    // InternalMusicDsl.g:654:4: 'left'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getRepetitionTypeAccess().getLeftEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMusicDsl.g:658:2: ( ( 'right' ) )
                    {
                    // InternalMusicDsl.g:658:2: ( ( 'right' ) )
                    // InternalMusicDsl.g:659:3: ( 'right' )
                    {
                     before(grammarAccess.getRepetitionTypeAccess().getRightEnumLiteralDeclaration_1()); 
                    // InternalMusicDsl.g:660:3: ( 'right' )
                    // InternalMusicDsl.g:660:4: 'right'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getRepetitionTypeAccess().getRightEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepetitionType__Alternatives"


    // $ANTLR start "rule__NoteName__Alternatives"
    // InternalMusicDsl.g:668:1: rule__NoteName__Alternatives : ( ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'E' ) ) | ( ( 'F' ) ) | ( ( 'G' ) ) | ( ( 'A' ) ) | ( ( 'B' ) ) );
    public final void rule__NoteName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:672:1: ( ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'E' ) ) | ( ( 'F' ) ) | ( ( 'G' ) ) | ( ( 'A' ) ) | ( ( 'B' ) ) )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case 23:
                {
                alt6=2;
                }
                break;
            case 24:
                {
                alt6=3;
                }
                break;
            case 25:
                {
                alt6=4;
                }
                break;
            case 26:
                {
                alt6=5;
                }
                break;
            case 27:
                {
                alt6=6;
                }
                break;
            case 28:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMusicDsl.g:673:2: ( ( 'C' ) )
                    {
                    // InternalMusicDsl.g:673:2: ( ( 'C' ) )
                    // InternalMusicDsl.g:674:3: ( 'C' )
                    {
                     before(grammarAccess.getNoteNameAccess().getCEnumLiteralDeclaration_0()); 
                    // InternalMusicDsl.g:675:3: ( 'C' )
                    // InternalMusicDsl.g:675:4: 'C'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteNameAccess().getCEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMusicDsl.g:679:2: ( ( 'D' ) )
                    {
                    // InternalMusicDsl.g:679:2: ( ( 'D' ) )
                    // InternalMusicDsl.g:680:3: ( 'D' )
                    {
                     before(grammarAccess.getNoteNameAccess().getDEnumLiteralDeclaration_1()); 
                    // InternalMusicDsl.g:681:3: ( 'D' )
                    // InternalMusicDsl.g:681:4: 'D'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteNameAccess().getDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMusicDsl.g:685:2: ( ( 'E' ) )
                    {
                    // InternalMusicDsl.g:685:2: ( ( 'E' ) )
                    // InternalMusicDsl.g:686:3: ( 'E' )
                    {
                     before(grammarAccess.getNoteNameAccess().getEEnumLiteralDeclaration_2()); 
                    // InternalMusicDsl.g:687:3: ( 'E' )
                    // InternalMusicDsl.g:687:4: 'E'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteNameAccess().getEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMusicDsl.g:691:2: ( ( 'F' ) )
                    {
                    // InternalMusicDsl.g:691:2: ( ( 'F' ) )
                    // InternalMusicDsl.g:692:3: ( 'F' )
                    {
                     before(grammarAccess.getNoteNameAccess().getFEnumLiteralDeclaration_3()); 
                    // InternalMusicDsl.g:693:3: ( 'F' )
                    // InternalMusicDsl.g:693:4: 'F'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteNameAccess().getFEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMusicDsl.g:697:2: ( ( 'G' ) )
                    {
                    // InternalMusicDsl.g:697:2: ( ( 'G' ) )
                    // InternalMusicDsl.g:698:3: ( 'G' )
                    {
                     before(grammarAccess.getNoteNameAccess().getGEnumLiteralDeclaration_4()); 
                    // InternalMusicDsl.g:699:3: ( 'G' )
                    // InternalMusicDsl.g:699:4: 'G'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteNameAccess().getGEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMusicDsl.g:703:2: ( ( 'A' ) )
                    {
                    // InternalMusicDsl.g:703:2: ( ( 'A' ) )
                    // InternalMusicDsl.g:704:3: ( 'A' )
                    {
                     before(grammarAccess.getNoteNameAccess().getAEnumLiteralDeclaration_5()); 
                    // InternalMusicDsl.g:705:3: ( 'A' )
                    // InternalMusicDsl.g:705:4: 'A'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteNameAccess().getAEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMusicDsl.g:709:2: ( ( 'B' ) )
                    {
                    // InternalMusicDsl.g:709:2: ( ( 'B' ) )
                    // InternalMusicDsl.g:710:3: ( 'B' )
                    {
                     before(grammarAccess.getNoteNameAccess().getBEnumLiteralDeclaration_6()); 
                    // InternalMusicDsl.g:711:3: ( 'B' )
                    // InternalMusicDsl.g:711:4: 'B'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteNameAccess().getBEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteName__Alternatives"


    // $ANTLR start "rule__NoteType__Alternatives"
    // InternalMusicDsl.g:719:1: rule__NoteType__Alternatives : ( ( ( 'whole' ) ) | ( ( 'half' ) ) | ( ( 'quarter' ) ) | ( ( 'eighth' ) ) | ( ( 'sixteenth' ) ) | ( ( 'thirtysecond' ) ) | ( ( 'sixtyfourth' ) ) );
    public final void rule__NoteType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:723:1: ( ( ( 'whole' ) ) | ( ( 'half' ) ) | ( ( 'quarter' ) ) | ( ( 'eighth' ) ) | ( ( 'sixteenth' ) ) | ( ( 'thirtysecond' ) ) | ( ( 'sixtyfourth' ) ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt7=1;
                }
                break;
            case 14:
                {
                alt7=2;
                }
                break;
            case 15:
                {
                alt7=3;
                }
                break;
            case 16:
                {
                alt7=4;
                }
                break;
            case 17:
                {
                alt7=5;
                }
                break;
            case 18:
                {
                alt7=6;
                }
                break;
            case 19:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMusicDsl.g:724:2: ( ( 'whole' ) )
                    {
                    // InternalMusicDsl.g:724:2: ( ( 'whole' ) )
                    // InternalMusicDsl.g:725:3: ( 'whole' )
                    {
                     before(grammarAccess.getNoteTypeAccess().getWholeEnumLiteralDeclaration_0()); 
                    // InternalMusicDsl.g:726:3: ( 'whole' )
                    // InternalMusicDsl.g:726:4: 'whole'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteTypeAccess().getWholeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMusicDsl.g:730:2: ( ( 'half' ) )
                    {
                    // InternalMusicDsl.g:730:2: ( ( 'half' ) )
                    // InternalMusicDsl.g:731:3: ( 'half' )
                    {
                     before(grammarAccess.getNoteTypeAccess().getHalfEnumLiteralDeclaration_1()); 
                    // InternalMusicDsl.g:732:3: ( 'half' )
                    // InternalMusicDsl.g:732:4: 'half'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteTypeAccess().getHalfEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMusicDsl.g:736:2: ( ( 'quarter' ) )
                    {
                    // InternalMusicDsl.g:736:2: ( ( 'quarter' ) )
                    // InternalMusicDsl.g:737:3: ( 'quarter' )
                    {
                     before(grammarAccess.getNoteTypeAccess().getQuarterEnumLiteralDeclaration_2()); 
                    // InternalMusicDsl.g:738:3: ( 'quarter' )
                    // InternalMusicDsl.g:738:4: 'quarter'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteTypeAccess().getQuarterEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMusicDsl.g:742:2: ( ( 'eighth' ) )
                    {
                    // InternalMusicDsl.g:742:2: ( ( 'eighth' ) )
                    // InternalMusicDsl.g:743:3: ( 'eighth' )
                    {
                     before(grammarAccess.getNoteTypeAccess().getEighthEnumLiteralDeclaration_3()); 
                    // InternalMusicDsl.g:744:3: ( 'eighth' )
                    // InternalMusicDsl.g:744:4: 'eighth'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteTypeAccess().getEighthEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMusicDsl.g:748:2: ( ( 'sixteenth' ) )
                    {
                    // InternalMusicDsl.g:748:2: ( ( 'sixteenth' ) )
                    // InternalMusicDsl.g:749:3: ( 'sixteenth' )
                    {
                     before(grammarAccess.getNoteTypeAccess().getSixteenthEnumLiteralDeclaration_4()); 
                    // InternalMusicDsl.g:750:3: ( 'sixteenth' )
                    // InternalMusicDsl.g:750:4: 'sixteenth'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteTypeAccess().getSixteenthEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMusicDsl.g:754:2: ( ( 'thirtysecond' ) )
                    {
                    // InternalMusicDsl.g:754:2: ( ( 'thirtysecond' ) )
                    // InternalMusicDsl.g:755:3: ( 'thirtysecond' )
                    {
                     before(grammarAccess.getNoteTypeAccess().getThirtysecondEnumLiteralDeclaration_5()); 
                    // InternalMusicDsl.g:756:3: ( 'thirtysecond' )
                    // InternalMusicDsl.g:756:4: 'thirtysecond'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteTypeAccess().getThirtysecondEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMusicDsl.g:760:2: ( ( 'sixtyfourth' ) )
                    {
                    // InternalMusicDsl.g:760:2: ( ( 'sixtyfourth' ) )
                    // InternalMusicDsl.g:761:3: ( 'sixtyfourth' )
                    {
                     before(grammarAccess.getNoteTypeAccess().getSixtyfourthEnumLiteralDeclaration_6()); 
                    // InternalMusicDsl.g:762:3: ( 'sixtyfourth' )
                    // InternalMusicDsl.g:762:4: 'sixtyfourth'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteTypeAccess().getSixtyfourthEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteType__Alternatives"


    // $ANTLR start "rule__AccidentalType__Alternatives"
    // InternalMusicDsl.g:770:1: rule__AccidentalType__Alternatives : ( ( ( 'sharp' ) ) | ( ( 'flat' ) ) | ( ( 'natural' ) ) );
    public final void rule__AccidentalType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:774:1: ( ( ( 'sharp' ) ) | ( ( 'flat' ) ) | ( ( 'natural' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt8=1;
                }
                break;
            case 30:
                {
                alt8=2;
                }
                break;
            case 31:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMusicDsl.g:775:2: ( ( 'sharp' ) )
                    {
                    // InternalMusicDsl.g:775:2: ( ( 'sharp' ) )
                    // InternalMusicDsl.g:776:3: ( 'sharp' )
                    {
                     before(grammarAccess.getAccidentalTypeAccess().getSharpEnumLiteralDeclaration_0()); 
                    // InternalMusicDsl.g:777:3: ( 'sharp' )
                    // InternalMusicDsl.g:777:4: 'sharp'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getAccidentalTypeAccess().getSharpEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMusicDsl.g:781:2: ( ( 'flat' ) )
                    {
                    // InternalMusicDsl.g:781:2: ( ( 'flat' ) )
                    // InternalMusicDsl.g:782:3: ( 'flat' )
                    {
                     before(grammarAccess.getAccidentalTypeAccess().getFlatEnumLiteralDeclaration_1()); 
                    // InternalMusicDsl.g:783:3: ( 'flat' )
                    // InternalMusicDsl.g:783:4: 'flat'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getAccidentalTypeAccess().getFlatEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMusicDsl.g:787:2: ( ( 'natural' ) )
                    {
                    // InternalMusicDsl.g:787:2: ( ( 'natural' ) )
                    // InternalMusicDsl.g:788:3: ( 'natural' )
                    {
                     before(grammarAccess.getAccidentalTypeAccess().getNaturalEnumLiteralDeclaration_2()); 
                    // InternalMusicDsl.g:789:3: ( 'natural' )
                    // InternalMusicDsl.g:789:4: 'natural'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getAccidentalTypeAccess().getNaturalEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccidentalType__Alternatives"


    // $ANTLR start "rule__SlurType__Alternatives"
    // InternalMusicDsl.g:797:1: rule__SlurType__Alternatives : ( ( ( 'start' ) ) | ( ( 'stop' ) ) );
    public final void rule__SlurType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:801:1: ( ( ( 'start' ) ) | ( ( 'stop' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==32) ) {
                alt9=1;
            }
            else if ( (LA9_0==33) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMusicDsl.g:802:2: ( ( 'start' ) )
                    {
                    // InternalMusicDsl.g:802:2: ( ( 'start' ) )
                    // InternalMusicDsl.g:803:3: ( 'start' )
                    {
                     before(grammarAccess.getSlurTypeAccess().getStartEnumLiteralDeclaration_0()); 
                    // InternalMusicDsl.g:804:3: ( 'start' )
                    // InternalMusicDsl.g:804:4: 'start'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getSlurTypeAccess().getStartEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMusicDsl.g:808:2: ( ( 'stop' ) )
                    {
                    // InternalMusicDsl.g:808:2: ( ( 'stop' ) )
                    // InternalMusicDsl.g:809:3: ( 'stop' )
                    {
                     before(grammarAccess.getSlurTypeAccess().getStopEnumLiteralDeclaration_1()); 
                    // InternalMusicDsl.g:810:3: ( 'stop' )
                    // InternalMusicDsl.g:810:4: 'stop'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getSlurTypeAccess().getStopEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlurType__Alternatives"


    // $ANTLR start "rule__ArticulationType__Alternatives"
    // InternalMusicDsl.g:818:1: rule__ArticulationType__Alternatives : ( ( ( 'detached' ) ) | ( ( 'legato' ) ) | ( ( 'staccato' ) ) | ( ( 'portato' ) ) | ( ( 'tenuto' ) ) | ( ( 'marcato' ) ) );
    public final void rule__ArticulationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:822:1: ( ( ( 'detached' ) ) | ( ( 'legato' ) ) | ( ( 'staccato' ) ) | ( ( 'portato' ) ) | ( ( 'tenuto' ) ) | ( ( 'marcato' ) ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt10=1;
                }
                break;
            case 35:
                {
                alt10=2;
                }
                break;
            case 36:
                {
                alt10=3;
                }
                break;
            case 37:
                {
                alt10=4;
                }
                break;
            case 38:
                {
                alt10=5;
                }
                break;
            case 39:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMusicDsl.g:823:2: ( ( 'detached' ) )
                    {
                    // InternalMusicDsl.g:823:2: ( ( 'detached' ) )
                    // InternalMusicDsl.g:824:3: ( 'detached' )
                    {
                     before(grammarAccess.getArticulationTypeAccess().getDetachedEnumLiteralDeclaration_0()); 
                    // InternalMusicDsl.g:825:3: ( 'detached' )
                    // InternalMusicDsl.g:825:4: 'detached'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getArticulationTypeAccess().getDetachedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMusicDsl.g:829:2: ( ( 'legato' ) )
                    {
                    // InternalMusicDsl.g:829:2: ( ( 'legato' ) )
                    // InternalMusicDsl.g:830:3: ( 'legato' )
                    {
                     before(grammarAccess.getArticulationTypeAccess().getLegatoEnumLiteralDeclaration_1()); 
                    // InternalMusicDsl.g:831:3: ( 'legato' )
                    // InternalMusicDsl.g:831:4: 'legato'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getArticulationTypeAccess().getLegatoEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMusicDsl.g:835:2: ( ( 'staccato' ) )
                    {
                    // InternalMusicDsl.g:835:2: ( ( 'staccato' ) )
                    // InternalMusicDsl.g:836:3: ( 'staccato' )
                    {
                     before(grammarAccess.getArticulationTypeAccess().getStaccatoEnumLiteralDeclaration_2()); 
                    // InternalMusicDsl.g:837:3: ( 'staccato' )
                    // InternalMusicDsl.g:837:4: 'staccato'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getArticulationTypeAccess().getStaccatoEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMusicDsl.g:841:2: ( ( 'portato' ) )
                    {
                    // InternalMusicDsl.g:841:2: ( ( 'portato' ) )
                    // InternalMusicDsl.g:842:3: ( 'portato' )
                    {
                     before(grammarAccess.getArticulationTypeAccess().getPortatoEnumLiteralDeclaration_3()); 
                    // InternalMusicDsl.g:843:3: ( 'portato' )
                    // InternalMusicDsl.g:843:4: 'portato'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getArticulationTypeAccess().getPortatoEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMusicDsl.g:847:2: ( ( 'tenuto' ) )
                    {
                    // InternalMusicDsl.g:847:2: ( ( 'tenuto' ) )
                    // InternalMusicDsl.g:848:3: ( 'tenuto' )
                    {
                     before(grammarAccess.getArticulationTypeAccess().getTenutoEnumLiteralDeclaration_4()); 
                    // InternalMusicDsl.g:849:3: ( 'tenuto' )
                    // InternalMusicDsl.g:849:4: 'tenuto'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getArticulationTypeAccess().getTenutoEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMusicDsl.g:853:2: ( ( 'marcato' ) )
                    {
                    // InternalMusicDsl.g:853:2: ( ( 'marcato' ) )
                    // InternalMusicDsl.g:854:3: ( 'marcato' )
                    {
                     before(grammarAccess.getArticulationTypeAccess().getMarcatoEnumLiteralDeclaration_5()); 
                    // InternalMusicDsl.g:855:3: ( 'marcato' )
                    // InternalMusicDsl.g:855:4: 'marcato'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getArticulationTypeAccess().getMarcatoEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArticulationType__Alternatives"


    // $ANTLR start "rule__OrnamentType__Alternatives"
    // InternalMusicDsl.g:863:1: rule__OrnamentType__Alternatives : ( ( ( 'slide' ) ) | ( ( 'glissando' ) ) | ( ( 'aciaccatura' ) ) | ( ( 'appoggiatura' ) ) | ( ( 'turn' ) ) | ( ( 'mordent' ) ) | ( ( 'trill' ) ) );
    public final void rule__OrnamentType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:867:1: ( ( ( 'slide' ) ) | ( ( 'glissando' ) ) | ( ( 'aciaccatura' ) ) | ( ( 'appoggiatura' ) ) | ( ( 'turn' ) ) | ( ( 'mordent' ) ) | ( ( 'trill' ) ) )
            int alt11=7;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt11=1;
                }
                break;
            case 41:
                {
                alt11=2;
                }
                break;
            case 42:
                {
                alt11=3;
                }
                break;
            case 43:
                {
                alt11=4;
                }
                break;
            case 44:
                {
                alt11=5;
                }
                break;
            case 45:
                {
                alt11=6;
                }
                break;
            case 46:
                {
                alt11=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMusicDsl.g:868:2: ( ( 'slide' ) )
                    {
                    // InternalMusicDsl.g:868:2: ( ( 'slide' ) )
                    // InternalMusicDsl.g:869:3: ( 'slide' )
                    {
                     before(grammarAccess.getOrnamentTypeAccess().getSlideEnumLiteralDeclaration_0()); 
                    // InternalMusicDsl.g:870:3: ( 'slide' )
                    // InternalMusicDsl.g:870:4: 'slide'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrnamentTypeAccess().getSlideEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMusicDsl.g:874:2: ( ( 'glissando' ) )
                    {
                    // InternalMusicDsl.g:874:2: ( ( 'glissando' ) )
                    // InternalMusicDsl.g:875:3: ( 'glissando' )
                    {
                     before(grammarAccess.getOrnamentTypeAccess().getGlissandoEnumLiteralDeclaration_1()); 
                    // InternalMusicDsl.g:876:3: ( 'glissando' )
                    // InternalMusicDsl.g:876:4: 'glissando'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrnamentTypeAccess().getGlissandoEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMusicDsl.g:880:2: ( ( 'aciaccatura' ) )
                    {
                    // InternalMusicDsl.g:880:2: ( ( 'aciaccatura' ) )
                    // InternalMusicDsl.g:881:3: ( 'aciaccatura' )
                    {
                     before(grammarAccess.getOrnamentTypeAccess().getAciaccaturaEnumLiteralDeclaration_2()); 
                    // InternalMusicDsl.g:882:3: ( 'aciaccatura' )
                    // InternalMusicDsl.g:882:4: 'aciaccatura'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrnamentTypeAccess().getAciaccaturaEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMusicDsl.g:886:2: ( ( 'appoggiatura' ) )
                    {
                    // InternalMusicDsl.g:886:2: ( ( 'appoggiatura' ) )
                    // InternalMusicDsl.g:887:3: ( 'appoggiatura' )
                    {
                     before(grammarAccess.getOrnamentTypeAccess().getAppoggiaturaEnumLiteralDeclaration_3()); 
                    // InternalMusicDsl.g:888:3: ( 'appoggiatura' )
                    // InternalMusicDsl.g:888:4: 'appoggiatura'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrnamentTypeAccess().getAppoggiaturaEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMusicDsl.g:892:2: ( ( 'turn' ) )
                    {
                    // InternalMusicDsl.g:892:2: ( ( 'turn' ) )
                    // InternalMusicDsl.g:893:3: ( 'turn' )
                    {
                     before(grammarAccess.getOrnamentTypeAccess().getTurnEnumLiteralDeclaration_4()); 
                    // InternalMusicDsl.g:894:3: ( 'turn' )
                    // InternalMusicDsl.g:894:4: 'turn'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrnamentTypeAccess().getTurnEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMusicDsl.g:898:2: ( ( 'mordent' ) )
                    {
                    // InternalMusicDsl.g:898:2: ( ( 'mordent' ) )
                    // InternalMusicDsl.g:899:3: ( 'mordent' )
                    {
                     before(grammarAccess.getOrnamentTypeAccess().getMordentEnumLiteralDeclaration_5()); 
                    // InternalMusicDsl.g:900:3: ( 'mordent' )
                    // InternalMusicDsl.g:900:4: 'mordent'
                    {
                    match(input,45,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrnamentTypeAccess().getMordentEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMusicDsl.g:904:2: ( ( 'trill' ) )
                    {
                    // InternalMusicDsl.g:904:2: ( ( 'trill' ) )
                    // InternalMusicDsl.g:905:3: ( 'trill' )
                    {
                     before(grammarAccess.getOrnamentTypeAccess().getTrillEnumLiteralDeclaration_6()); 
                    // InternalMusicDsl.g:906:3: ( 'trill' )
                    // InternalMusicDsl.g:906:4: 'trill'
                    {
                    match(input,46,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrnamentTypeAccess().getTrillEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrnamentType__Alternatives"


    // $ANTLR start "rule__Composition__Group__0"
    // InternalMusicDsl.g:914:1: rule__Composition__Group__0 : rule__Composition__Group__0__Impl rule__Composition__Group__1 ;
    public final void rule__Composition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:918:1: ( rule__Composition__Group__0__Impl rule__Composition__Group__1 )
            // InternalMusicDsl.g:919:2: rule__Composition__Group__0__Impl rule__Composition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Composition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__0"


    // $ANTLR start "rule__Composition__Group__0__Impl"
    // InternalMusicDsl.g:926:1: rule__Composition__Group__0__Impl : ( () ) ;
    public final void rule__Composition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:930:1: ( ( () ) )
            // InternalMusicDsl.g:931:1: ( () )
            {
            // InternalMusicDsl.g:931:1: ( () )
            // InternalMusicDsl.g:932:2: ()
            {
             before(grammarAccess.getCompositionAccess().getCompositionAction_0()); 
            // InternalMusicDsl.g:933:2: ()
            // InternalMusicDsl.g:933:3: 
            {
            }

             after(grammarAccess.getCompositionAccess().getCompositionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__0__Impl"


    // $ANTLR start "rule__Composition__Group__1"
    // InternalMusicDsl.g:941:1: rule__Composition__Group__1 : rule__Composition__Group__1__Impl rule__Composition__Group__2 ;
    public final void rule__Composition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:945:1: ( rule__Composition__Group__1__Impl rule__Composition__Group__2 )
            // InternalMusicDsl.g:946:2: rule__Composition__Group__1__Impl rule__Composition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Composition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__1"


    // $ANTLR start "rule__Composition__Group__1__Impl"
    // InternalMusicDsl.g:953:1: rule__Composition__Group__1__Impl : ( 'Composition' ) ;
    public final void rule__Composition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:957:1: ( ( 'Composition' ) )
            // InternalMusicDsl.g:958:1: ( 'Composition' )
            {
            // InternalMusicDsl.g:958:1: ( 'Composition' )
            // InternalMusicDsl.g:959:2: 'Composition'
            {
             before(grammarAccess.getCompositionAccess().getCompositionKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getCompositionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__1__Impl"


    // $ANTLR start "rule__Composition__Group__2"
    // InternalMusicDsl.g:968:1: rule__Composition__Group__2 : rule__Composition__Group__2__Impl rule__Composition__Group__3 ;
    public final void rule__Composition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:972:1: ( rule__Composition__Group__2__Impl rule__Composition__Group__3 )
            // InternalMusicDsl.g:973:2: rule__Composition__Group__2__Impl rule__Composition__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Composition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__2"


    // $ANTLR start "rule__Composition__Group__2__Impl"
    // InternalMusicDsl.g:980:1: rule__Composition__Group__2__Impl : ( ( rule__Composition__NameAssignment_2 ) ) ;
    public final void rule__Composition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:984:1: ( ( ( rule__Composition__NameAssignment_2 ) ) )
            // InternalMusicDsl.g:985:1: ( ( rule__Composition__NameAssignment_2 ) )
            {
            // InternalMusicDsl.g:985:1: ( ( rule__Composition__NameAssignment_2 ) )
            // InternalMusicDsl.g:986:2: ( rule__Composition__NameAssignment_2 )
            {
             before(grammarAccess.getCompositionAccess().getNameAssignment_2()); 
            // InternalMusicDsl.g:987:2: ( rule__Composition__NameAssignment_2 )
            // InternalMusicDsl.g:987:3: rule__Composition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Composition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__2__Impl"


    // $ANTLR start "rule__Composition__Group__3"
    // InternalMusicDsl.g:995:1: rule__Composition__Group__3 : rule__Composition__Group__3__Impl rule__Composition__Group__4 ;
    public final void rule__Composition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:999:1: ( rule__Composition__Group__3__Impl rule__Composition__Group__4 )
            // InternalMusicDsl.g:1000:2: rule__Composition__Group__3__Impl rule__Composition__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Composition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__3"


    // $ANTLR start "rule__Composition__Group__3__Impl"
    // InternalMusicDsl.g:1007:1: rule__Composition__Group__3__Impl : ( '[' ) ;
    public final void rule__Composition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1011:1: ( ( '[' ) )
            // InternalMusicDsl.g:1012:1: ( '[' )
            {
            // InternalMusicDsl.g:1012:1: ( '[' )
            // InternalMusicDsl.g:1013:2: '['
            {
             before(grammarAccess.getCompositionAccess().getLeftSquareBracketKeyword_3()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__3__Impl"


    // $ANTLR start "rule__Composition__Group__4"
    // InternalMusicDsl.g:1022:1: rule__Composition__Group__4 : rule__Composition__Group__4__Impl rule__Composition__Group__5 ;
    public final void rule__Composition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1026:1: ( rule__Composition__Group__4__Impl rule__Composition__Group__5 )
            // InternalMusicDsl.g:1027:2: rule__Composition__Group__4__Impl rule__Composition__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Composition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__4"


    // $ANTLR start "rule__Composition__Group__4__Impl"
    // InternalMusicDsl.g:1034:1: rule__Composition__Group__4__Impl : ( ( rule__Composition__Group_4__0 )? ) ;
    public final void rule__Composition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1038:1: ( ( ( rule__Composition__Group_4__0 )? ) )
            // InternalMusicDsl.g:1039:1: ( ( rule__Composition__Group_4__0 )? )
            {
            // InternalMusicDsl.g:1039:1: ( ( rule__Composition__Group_4__0 )? )
            // InternalMusicDsl.g:1040:2: ( rule__Composition__Group_4__0 )?
            {
             before(grammarAccess.getCompositionAccess().getGroup_4()); 
            // InternalMusicDsl.g:1041:2: ( rule__Composition__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==50) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMusicDsl.g:1041:3: rule__Composition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Composition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__4__Impl"


    // $ANTLR start "rule__Composition__Group__5"
    // InternalMusicDsl.g:1049:1: rule__Composition__Group__5 : rule__Composition__Group__5__Impl rule__Composition__Group__6 ;
    public final void rule__Composition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1053:1: ( rule__Composition__Group__5__Impl rule__Composition__Group__6 )
            // InternalMusicDsl.g:1054:2: rule__Composition__Group__5__Impl rule__Composition__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Composition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__5"


    // $ANTLR start "rule__Composition__Group__5__Impl"
    // InternalMusicDsl.g:1061:1: rule__Composition__Group__5__Impl : ( ( rule__Composition__Group_5__0 )? ) ;
    public final void rule__Composition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1065:1: ( ( ( rule__Composition__Group_5__0 )? ) )
            // InternalMusicDsl.g:1066:1: ( ( rule__Composition__Group_5__0 )? )
            {
            // InternalMusicDsl.g:1066:1: ( ( rule__Composition__Group_5__0 )? )
            // InternalMusicDsl.g:1067:2: ( rule__Composition__Group_5__0 )?
            {
             before(grammarAccess.getCompositionAccess().getGroup_5()); 
            // InternalMusicDsl.g:1068:2: ( rule__Composition__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==51) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMusicDsl.g:1068:3: rule__Composition__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Composition__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__5__Impl"


    // $ANTLR start "rule__Composition__Group__6"
    // InternalMusicDsl.g:1076:1: rule__Composition__Group__6 : rule__Composition__Group__6__Impl rule__Composition__Group__7 ;
    public final void rule__Composition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1080:1: ( rule__Composition__Group__6__Impl rule__Composition__Group__7 )
            // InternalMusicDsl.g:1081:2: rule__Composition__Group__6__Impl rule__Composition__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Composition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__6"


    // $ANTLR start "rule__Composition__Group__6__Impl"
    // InternalMusicDsl.g:1088:1: rule__Composition__Group__6__Impl : ( ( rule__Composition__Group_6__0 )? ) ;
    public final void rule__Composition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1092:1: ( ( ( rule__Composition__Group_6__0 )? ) )
            // InternalMusicDsl.g:1093:1: ( ( rule__Composition__Group_6__0 )? )
            {
            // InternalMusicDsl.g:1093:1: ( ( rule__Composition__Group_6__0 )? )
            // InternalMusicDsl.g:1094:2: ( rule__Composition__Group_6__0 )?
            {
             before(grammarAccess.getCompositionAccess().getGroup_6()); 
            // InternalMusicDsl.g:1095:2: ( rule__Composition__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==52) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMusicDsl.g:1095:3: rule__Composition__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Composition__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__6__Impl"


    // $ANTLR start "rule__Composition__Group__7"
    // InternalMusicDsl.g:1103:1: rule__Composition__Group__7 : rule__Composition__Group__7__Impl rule__Composition__Group__8 ;
    public final void rule__Composition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1107:1: ( rule__Composition__Group__7__Impl rule__Composition__Group__8 )
            // InternalMusicDsl.g:1108:2: rule__Composition__Group__7__Impl rule__Composition__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Composition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__7"


    // $ANTLR start "rule__Composition__Group__7__Impl"
    // InternalMusicDsl.g:1115:1: rule__Composition__Group__7__Impl : ( ( rule__Composition__Group_7__0 )? ) ;
    public final void rule__Composition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1119:1: ( ( ( rule__Composition__Group_7__0 )? ) )
            // InternalMusicDsl.g:1120:1: ( ( rule__Composition__Group_7__0 )? )
            {
            // InternalMusicDsl.g:1120:1: ( ( rule__Composition__Group_7__0 )? )
            // InternalMusicDsl.g:1121:2: ( rule__Composition__Group_7__0 )?
            {
             before(grammarAccess.getCompositionAccess().getGroup_7()); 
            // InternalMusicDsl.g:1122:2: ( rule__Composition__Group_7__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==53) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMusicDsl.g:1122:3: rule__Composition__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Composition__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__7__Impl"


    // $ANTLR start "rule__Composition__Group__8"
    // InternalMusicDsl.g:1130:1: rule__Composition__Group__8 : rule__Composition__Group__8__Impl rule__Composition__Group__9 ;
    public final void rule__Composition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1134:1: ( rule__Composition__Group__8__Impl rule__Composition__Group__9 )
            // InternalMusicDsl.g:1135:2: rule__Composition__Group__8__Impl rule__Composition__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__Composition__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__8"


    // $ANTLR start "rule__Composition__Group__8__Impl"
    // InternalMusicDsl.g:1142:1: rule__Composition__Group__8__Impl : ( ( rule__Composition__StaffAssignment_8 ) ) ;
    public final void rule__Composition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1146:1: ( ( ( rule__Composition__StaffAssignment_8 ) ) )
            // InternalMusicDsl.g:1147:1: ( ( rule__Composition__StaffAssignment_8 ) )
            {
            // InternalMusicDsl.g:1147:1: ( ( rule__Composition__StaffAssignment_8 ) )
            // InternalMusicDsl.g:1148:2: ( rule__Composition__StaffAssignment_8 )
            {
             before(grammarAccess.getCompositionAccess().getStaffAssignment_8()); 
            // InternalMusicDsl.g:1149:2: ( rule__Composition__StaffAssignment_8 )
            // InternalMusicDsl.g:1149:3: rule__Composition__StaffAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Composition__StaffAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getStaffAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__8__Impl"


    // $ANTLR start "rule__Composition__Group__9"
    // InternalMusicDsl.g:1157:1: rule__Composition__Group__9 : rule__Composition__Group__9__Impl rule__Composition__Group__10 ;
    public final void rule__Composition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1161:1: ( rule__Composition__Group__9__Impl rule__Composition__Group__10 )
            // InternalMusicDsl.g:1162:2: rule__Composition__Group__9__Impl rule__Composition__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__Composition__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__9"


    // $ANTLR start "rule__Composition__Group__9__Impl"
    // InternalMusicDsl.g:1169:1: rule__Composition__Group__9__Impl : ( ( rule__Composition__Group_9__0 )* ) ;
    public final void rule__Composition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1173:1: ( ( ( rule__Composition__Group_9__0 )* ) )
            // InternalMusicDsl.g:1174:1: ( ( rule__Composition__Group_9__0 )* )
            {
            // InternalMusicDsl.g:1174:1: ( ( rule__Composition__Group_9__0 )* )
            // InternalMusicDsl.g:1175:2: ( rule__Composition__Group_9__0 )*
            {
             before(grammarAccess.getCompositionAccess().getGroup_9()); 
            // InternalMusicDsl.g:1176:2: ( rule__Composition__Group_9__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==54) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMusicDsl.g:1176:3: rule__Composition__Group_9__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Composition__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getCompositionAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__9__Impl"


    // $ANTLR start "rule__Composition__Group__10"
    // InternalMusicDsl.g:1184:1: rule__Composition__Group__10 : rule__Composition__Group__10__Impl ;
    public final void rule__Composition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1188:1: ( rule__Composition__Group__10__Impl )
            // InternalMusicDsl.g:1189:2: rule__Composition__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__10"


    // $ANTLR start "rule__Composition__Group__10__Impl"
    // InternalMusicDsl.g:1195:1: rule__Composition__Group__10__Impl : ( ']' ) ;
    public final void rule__Composition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1199:1: ( ( ']' ) )
            // InternalMusicDsl.g:1200:1: ( ']' )
            {
            // InternalMusicDsl.g:1200:1: ( ']' )
            // InternalMusicDsl.g:1201:2: ']'
            {
             before(grammarAccess.getCompositionAccess().getRightSquareBracketKeyword_10()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getRightSquareBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__10__Impl"


    // $ANTLR start "rule__Composition__Group_4__0"
    // InternalMusicDsl.g:1211:1: rule__Composition__Group_4__0 : rule__Composition__Group_4__0__Impl rule__Composition__Group_4__1 ;
    public final void rule__Composition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1215:1: ( rule__Composition__Group_4__0__Impl rule__Composition__Group_4__1 )
            // InternalMusicDsl.g:1216:2: rule__Composition__Group_4__0__Impl rule__Composition__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Composition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_4__0"


    // $ANTLR start "rule__Composition__Group_4__0__Impl"
    // InternalMusicDsl.g:1223:1: rule__Composition__Group_4__0__Impl : ( 'author:' ) ;
    public final void rule__Composition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1227:1: ( ( 'author:' ) )
            // InternalMusicDsl.g:1228:1: ( 'author:' )
            {
            // InternalMusicDsl.g:1228:1: ( 'author:' )
            // InternalMusicDsl.g:1229:2: 'author:'
            {
             before(grammarAccess.getCompositionAccess().getAuthorKeyword_4_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getAuthorKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_4__0__Impl"


    // $ANTLR start "rule__Composition__Group_4__1"
    // InternalMusicDsl.g:1238:1: rule__Composition__Group_4__1 : rule__Composition__Group_4__1__Impl ;
    public final void rule__Composition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1242:1: ( rule__Composition__Group_4__1__Impl )
            // InternalMusicDsl.g:1243:2: rule__Composition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_4__1"


    // $ANTLR start "rule__Composition__Group_4__1__Impl"
    // InternalMusicDsl.g:1249:1: rule__Composition__Group_4__1__Impl : ( ( rule__Composition__AuthorAssignment_4_1 ) ) ;
    public final void rule__Composition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1253:1: ( ( ( rule__Composition__AuthorAssignment_4_1 ) ) )
            // InternalMusicDsl.g:1254:1: ( ( rule__Composition__AuthorAssignment_4_1 ) )
            {
            // InternalMusicDsl.g:1254:1: ( ( rule__Composition__AuthorAssignment_4_1 ) )
            // InternalMusicDsl.g:1255:2: ( rule__Composition__AuthorAssignment_4_1 )
            {
             before(grammarAccess.getCompositionAccess().getAuthorAssignment_4_1()); 
            // InternalMusicDsl.g:1256:2: ( rule__Composition__AuthorAssignment_4_1 )
            // InternalMusicDsl.g:1256:3: rule__Composition__AuthorAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Composition__AuthorAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getAuthorAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_4__1__Impl"


    // $ANTLR start "rule__Composition__Group_5__0"
    // InternalMusicDsl.g:1265:1: rule__Composition__Group_5__0 : rule__Composition__Group_5__0__Impl rule__Composition__Group_5__1 ;
    public final void rule__Composition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1269:1: ( rule__Composition__Group_5__0__Impl rule__Composition__Group_5__1 )
            // InternalMusicDsl.g:1270:2: rule__Composition__Group_5__0__Impl rule__Composition__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Composition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_5__0"


    // $ANTLR start "rule__Composition__Group_5__0__Impl"
    // InternalMusicDsl.g:1277:1: rule__Composition__Group_5__0__Impl : ( 'instrument:' ) ;
    public final void rule__Composition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1281:1: ( ( 'instrument:' ) )
            // InternalMusicDsl.g:1282:1: ( 'instrument:' )
            {
            // InternalMusicDsl.g:1282:1: ( 'instrument:' )
            // InternalMusicDsl.g:1283:2: 'instrument:'
            {
             before(grammarAccess.getCompositionAccess().getInstrumentKeyword_5_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getInstrumentKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_5__0__Impl"


    // $ANTLR start "rule__Composition__Group_5__1"
    // InternalMusicDsl.g:1292:1: rule__Composition__Group_5__1 : rule__Composition__Group_5__1__Impl ;
    public final void rule__Composition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1296:1: ( rule__Composition__Group_5__1__Impl )
            // InternalMusicDsl.g:1297:2: rule__Composition__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_5__1"


    // $ANTLR start "rule__Composition__Group_5__1__Impl"
    // InternalMusicDsl.g:1303:1: rule__Composition__Group_5__1__Impl : ( ( rule__Composition__InstrumentAssignment_5_1 ) ) ;
    public final void rule__Composition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1307:1: ( ( ( rule__Composition__InstrumentAssignment_5_1 ) ) )
            // InternalMusicDsl.g:1308:1: ( ( rule__Composition__InstrumentAssignment_5_1 ) )
            {
            // InternalMusicDsl.g:1308:1: ( ( rule__Composition__InstrumentAssignment_5_1 ) )
            // InternalMusicDsl.g:1309:2: ( rule__Composition__InstrumentAssignment_5_1 )
            {
             before(grammarAccess.getCompositionAccess().getInstrumentAssignment_5_1()); 
            // InternalMusicDsl.g:1310:2: ( rule__Composition__InstrumentAssignment_5_1 )
            // InternalMusicDsl.g:1310:3: rule__Composition__InstrumentAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Composition__InstrumentAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getInstrumentAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_5__1__Impl"


    // $ANTLR start "rule__Composition__Group_6__0"
    // InternalMusicDsl.g:1319:1: rule__Composition__Group_6__0 : rule__Composition__Group_6__0__Impl rule__Composition__Group_6__1 ;
    public final void rule__Composition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1323:1: ( rule__Composition__Group_6__0__Impl rule__Composition__Group_6__1 )
            // InternalMusicDsl.g:1324:2: rule__Composition__Group_6__0__Impl rule__Composition__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Composition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_6__0"


    // $ANTLR start "rule__Composition__Group_6__0__Impl"
    // InternalMusicDsl.g:1331:1: rule__Composition__Group_6__0__Impl : ( 'tonality:' ) ;
    public final void rule__Composition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1335:1: ( ( 'tonality:' ) )
            // InternalMusicDsl.g:1336:1: ( 'tonality:' )
            {
            // InternalMusicDsl.g:1336:1: ( 'tonality:' )
            // InternalMusicDsl.g:1337:2: 'tonality:'
            {
             before(grammarAccess.getCompositionAccess().getTonalityKeyword_6_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getTonalityKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_6__0__Impl"


    // $ANTLR start "rule__Composition__Group_6__1"
    // InternalMusicDsl.g:1346:1: rule__Composition__Group_6__1 : rule__Composition__Group_6__1__Impl ;
    public final void rule__Composition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1350:1: ( rule__Composition__Group_6__1__Impl )
            // InternalMusicDsl.g:1351:2: rule__Composition__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_6__1"


    // $ANTLR start "rule__Composition__Group_6__1__Impl"
    // InternalMusicDsl.g:1357:1: rule__Composition__Group_6__1__Impl : ( ( rule__Composition__TonalityAssignment_6_1 ) ) ;
    public final void rule__Composition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1361:1: ( ( ( rule__Composition__TonalityAssignment_6_1 ) ) )
            // InternalMusicDsl.g:1362:1: ( ( rule__Composition__TonalityAssignment_6_1 ) )
            {
            // InternalMusicDsl.g:1362:1: ( ( rule__Composition__TonalityAssignment_6_1 ) )
            // InternalMusicDsl.g:1363:2: ( rule__Composition__TonalityAssignment_6_1 )
            {
             before(grammarAccess.getCompositionAccess().getTonalityAssignment_6_1()); 
            // InternalMusicDsl.g:1364:2: ( rule__Composition__TonalityAssignment_6_1 )
            // InternalMusicDsl.g:1364:3: rule__Composition__TonalityAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Composition__TonalityAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getTonalityAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_6__1__Impl"


    // $ANTLR start "rule__Composition__Group_7__0"
    // InternalMusicDsl.g:1373:1: rule__Composition__Group_7__0 : rule__Composition__Group_7__0__Impl rule__Composition__Group_7__1 ;
    public final void rule__Composition__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1377:1: ( rule__Composition__Group_7__0__Impl rule__Composition__Group_7__1 )
            // InternalMusicDsl.g:1378:2: rule__Composition__Group_7__0__Impl rule__Composition__Group_7__1
            {
            pushFollow(FOLLOW_9);
            rule__Composition__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_7__0"


    // $ANTLR start "rule__Composition__Group_7__0__Impl"
    // InternalMusicDsl.g:1385:1: rule__Composition__Group_7__0__Impl : ( 'soundTempo:' ) ;
    public final void rule__Composition__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1389:1: ( ( 'soundTempo:' ) )
            // InternalMusicDsl.g:1390:1: ( 'soundTempo:' )
            {
            // InternalMusicDsl.g:1390:1: ( 'soundTempo:' )
            // InternalMusicDsl.g:1391:2: 'soundTempo:'
            {
             before(grammarAccess.getCompositionAccess().getSoundTempoKeyword_7_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getSoundTempoKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_7__0__Impl"


    // $ANTLR start "rule__Composition__Group_7__1"
    // InternalMusicDsl.g:1400:1: rule__Composition__Group_7__1 : rule__Composition__Group_7__1__Impl ;
    public final void rule__Composition__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1404:1: ( rule__Composition__Group_7__1__Impl )
            // InternalMusicDsl.g:1405:2: rule__Composition__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_7__1"


    // $ANTLR start "rule__Composition__Group_7__1__Impl"
    // InternalMusicDsl.g:1411:1: rule__Composition__Group_7__1__Impl : ( ( rule__Composition__SoundTempoAssignment_7_1 ) ) ;
    public final void rule__Composition__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1415:1: ( ( ( rule__Composition__SoundTempoAssignment_7_1 ) ) )
            // InternalMusicDsl.g:1416:1: ( ( rule__Composition__SoundTempoAssignment_7_1 ) )
            {
            // InternalMusicDsl.g:1416:1: ( ( rule__Composition__SoundTempoAssignment_7_1 ) )
            // InternalMusicDsl.g:1417:2: ( rule__Composition__SoundTempoAssignment_7_1 )
            {
             before(grammarAccess.getCompositionAccess().getSoundTempoAssignment_7_1()); 
            // InternalMusicDsl.g:1418:2: ( rule__Composition__SoundTempoAssignment_7_1 )
            // InternalMusicDsl.g:1418:3: rule__Composition__SoundTempoAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Composition__SoundTempoAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getSoundTempoAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_7__1__Impl"


    // $ANTLR start "rule__Composition__Group_9__0"
    // InternalMusicDsl.g:1427:1: rule__Composition__Group_9__0 : rule__Composition__Group_9__0__Impl rule__Composition__Group_9__1 ;
    public final void rule__Composition__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1431:1: ( rule__Composition__Group_9__0__Impl rule__Composition__Group_9__1 )
            // InternalMusicDsl.g:1432:2: rule__Composition__Group_9__0__Impl rule__Composition__Group_9__1
            {
            pushFollow(FOLLOW_6);
            rule__Composition__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_9__0"


    // $ANTLR start "rule__Composition__Group_9__0__Impl"
    // InternalMusicDsl.g:1439:1: rule__Composition__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Composition__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1443:1: ( ( ',' ) )
            // InternalMusicDsl.g:1444:1: ( ',' )
            {
            // InternalMusicDsl.g:1444:1: ( ',' )
            // InternalMusicDsl.g:1445:2: ','
            {
             before(grammarAccess.getCompositionAccess().getCommaKeyword_9_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_9__0__Impl"


    // $ANTLR start "rule__Composition__Group_9__1"
    // InternalMusicDsl.g:1454:1: rule__Composition__Group_9__1 : rule__Composition__Group_9__1__Impl ;
    public final void rule__Composition__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1458:1: ( rule__Composition__Group_9__1__Impl )
            // InternalMusicDsl.g:1459:2: rule__Composition__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_9__1"


    // $ANTLR start "rule__Composition__Group_9__1__Impl"
    // InternalMusicDsl.g:1465:1: rule__Composition__Group_9__1__Impl : ( ( rule__Composition__StaffAssignment_9_1 ) ) ;
    public final void rule__Composition__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1469:1: ( ( ( rule__Composition__StaffAssignment_9_1 ) ) )
            // InternalMusicDsl.g:1470:1: ( ( rule__Composition__StaffAssignment_9_1 ) )
            {
            // InternalMusicDsl.g:1470:1: ( ( rule__Composition__StaffAssignment_9_1 ) )
            // InternalMusicDsl.g:1471:2: ( rule__Composition__StaffAssignment_9_1 )
            {
             before(grammarAccess.getCompositionAccess().getStaffAssignment_9_1()); 
            // InternalMusicDsl.g:1472:2: ( rule__Composition__StaffAssignment_9_1 )
            // InternalMusicDsl.g:1472:3: rule__Composition__StaffAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Composition__StaffAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getStaffAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_9__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMusicDsl.g:1481:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1485:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMusicDsl.g:1486:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalMusicDsl.g:1493:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1497:1: ( ( ( '-' )? ) )
            // InternalMusicDsl.g:1498:1: ( ( '-' )? )
            {
            // InternalMusicDsl.g:1498:1: ( ( '-' )? )
            // InternalMusicDsl.g:1499:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMusicDsl.g:1500:2: ( '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==55) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMusicDsl.g:1500:3: '-'
                    {
                    match(input,55,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalMusicDsl.g:1508:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1512:1: ( rule__EInt__Group__1__Impl )
            // InternalMusicDsl.g:1513:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalMusicDsl.g:1519:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1523:1: ( ( RULE_INT ) )
            // InternalMusicDsl.g:1524:1: ( RULE_INT )
            {
            // InternalMusicDsl.g:1524:1: ( RULE_INT )
            // InternalMusicDsl.g:1525:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Staff__Group__0"
    // InternalMusicDsl.g:1535:1: rule__Staff__Group__0 : rule__Staff__Group__0__Impl rule__Staff__Group__1 ;
    public final void rule__Staff__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1539:1: ( rule__Staff__Group__0__Impl rule__Staff__Group__1 )
            // InternalMusicDsl.g:1540:2: rule__Staff__Group__0__Impl rule__Staff__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Staff__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__0"


    // $ANTLR start "rule__Staff__Group__0__Impl"
    // InternalMusicDsl.g:1547:1: rule__Staff__Group__0__Impl : ( () ) ;
    public final void rule__Staff__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1551:1: ( ( () ) )
            // InternalMusicDsl.g:1552:1: ( () )
            {
            // InternalMusicDsl.g:1552:1: ( () )
            // InternalMusicDsl.g:1553:2: ()
            {
             before(grammarAccess.getStaffAccess().getStaffAction_0()); 
            // InternalMusicDsl.g:1554:2: ()
            // InternalMusicDsl.g:1554:3: 
            {
            }

             after(grammarAccess.getStaffAccess().getStaffAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__0__Impl"


    // $ANTLR start "rule__Staff__Group__1"
    // InternalMusicDsl.g:1562:1: rule__Staff__Group__1 : rule__Staff__Group__1__Impl rule__Staff__Group__2 ;
    public final void rule__Staff__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1566:1: ( rule__Staff__Group__1__Impl rule__Staff__Group__2 )
            // InternalMusicDsl.g:1567:2: rule__Staff__Group__1__Impl rule__Staff__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Staff__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__1"


    // $ANTLR start "rule__Staff__Group__1__Impl"
    // InternalMusicDsl.g:1574:1: rule__Staff__Group__1__Impl : ( 'Staff' ) ;
    public final void rule__Staff__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1578:1: ( ( 'Staff' ) )
            // InternalMusicDsl.g:1579:1: ( 'Staff' )
            {
            // InternalMusicDsl.g:1579:1: ( 'Staff' )
            // InternalMusicDsl.g:1580:2: 'Staff'
            {
             before(grammarAccess.getStaffAccess().getStaffKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getStaffAccess().getStaffKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__1__Impl"


    // $ANTLR start "rule__Staff__Group__2"
    // InternalMusicDsl.g:1589:1: rule__Staff__Group__2 : rule__Staff__Group__2__Impl rule__Staff__Group__3 ;
    public final void rule__Staff__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1593:1: ( rule__Staff__Group__2__Impl rule__Staff__Group__3 )
            // InternalMusicDsl.g:1594:2: rule__Staff__Group__2__Impl rule__Staff__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Staff__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__2"


    // $ANTLR start "rule__Staff__Group__2__Impl"
    // InternalMusicDsl.g:1601:1: rule__Staff__Group__2__Impl : ( ( rule__Staff__StaffNumberAssignment_2 ) ) ;
    public final void rule__Staff__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1605:1: ( ( ( rule__Staff__StaffNumberAssignment_2 ) ) )
            // InternalMusicDsl.g:1606:1: ( ( rule__Staff__StaffNumberAssignment_2 ) )
            {
            // InternalMusicDsl.g:1606:1: ( ( rule__Staff__StaffNumberAssignment_2 ) )
            // InternalMusicDsl.g:1607:2: ( rule__Staff__StaffNumberAssignment_2 )
            {
             before(grammarAccess.getStaffAccess().getStaffNumberAssignment_2()); 
            // InternalMusicDsl.g:1608:2: ( rule__Staff__StaffNumberAssignment_2 )
            // InternalMusicDsl.g:1608:3: rule__Staff__StaffNumberAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Staff__StaffNumberAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStaffAccess().getStaffNumberAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__2__Impl"


    // $ANTLR start "rule__Staff__Group__3"
    // InternalMusicDsl.g:1616:1: rule__Staff__Group__3 : rule__Staff__Group__3__Impl rule__Staff__Group__4 ;
    public final void rule__Staff__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1620:1: ( rule__Staff__Group__3__Impl rule__Staff__Group__4 )
            // InternalMusicDsl.g:1621:2: rule__Staff__Group__3__Impl rule__Staff__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Staff__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__3"


    // $ANTLR start "rule__Staff__Group__3__Impl"
    // InternalMusicDsl.g:1628:1: rule__Staff__Group__3__Impl : ( '[' ) ;
    public final void rule__Staff__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1632:1: ( ( '[' ) )
            // InternalMusicDsl.g:1633:1: ( '[' )
            {
            // InternalMusicDsl.g:1633:1: ( '[' )
            // InternalMusicDsl.g:1634:2: '['
            {
             before(grammarAccess.getStaffAccess().getLeftSquareBracketKeyword_3()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getStaffAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__3__Impl"


    // $ANTLR start "rule__Staff__Group__4"
    // InternalMusicDsl.g:1643:1: rule__Staff__Group__4 : rule__Staff__Group__4__Impl rule__Staff__Group__5 ;
    public final void rule__Staff__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1647:1: ( rule__Staff__Group__4__Impl rule__Staff__Group__5 )
            // InternalMusicDsl.g:1648:2: rule__Staff__Group__4__Impl rule__Staff__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Staff__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__4"


    // $ANTLR start "rule__Staff__Group__4__Impl"
    // InternalMusicDsl.g:1655:1: rule__Staff__Group__4__Impl : ( 'clef:' ) ;
    public final void rule__Staff__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1659:1: ( ( 'clef:' ) )
            // InternalMusicDsl.g:1660:1: ( 'clef:' )
            {
            // InternalMusicDsl.g:1660:1: ( 'clef:' )
            // InternalMusicDsl.g:1661:2: 'clef:'
            {
             before(grammarAccess.getStaffAccess().getClefKeyword_4()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getStaffAccess().getClefKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__4__Impl"


    // $ANTLR start "rule__Staff__Group__5"
    // InternalMusicDsl.g:1670:1: rule__Staff__Group__5 : rule__Staff__Group__5__Impl rule__Staff__Group__6 ;
    public final void rule__Staff__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1674:1: ( rule__Staff__Group__5__Impl rule__Staff__Group__6 )
            // InternalMusicDsl.g:1675:2: rule__Staff__Group__5__Impl rule__Staff__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Staff__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__5"


    // $ANTLR start "rule__Staff__Group__5__Impl"
    // InternalMusicDsl.g:1682:1: rule__Staff__Group__5__Impl : ( ( rule__Staff__ClefAssignment_5 ) ) ;
    public final void rule__Staff__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1686:1: ( ( ( rule__Staff__ClefAssignment_5 ) ) )
            // InternalMusicDsl.g:1687:1: ( ( rule__Staff__ClefAssignment_5 ) )
            {
            // InternalMusicDsl.g:1687:1: ( ( rule__Staff__ClefAssignment_5 ) )
            // InternalMusicDsl.g:1688:2: ( rule__Staff__ClefAssignment_5 )
            {
             before(grammarAccess.getStaffAccess().getClefAssignment_5()); 
            // InternalMusicDsl.g:1689:2: ( rule__Staff__ClefAssignment_5 )
            // InternalMusicDsl.g:1689:3: rule__Staff__ClefAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Staff__ClefAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getStaffAccess().getClefAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__5__Impl"


    // $ANTLR start "rule__Staff__Group__6"
    // InternalMusicDsl.g:1697:1: rule__Staff__Group__6 : rule__Staff__Group__6__Impl rule__Staff__Group__7 ;
    public final void rule__Staff__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1701:1: ( rule__Staff__Group__6__Impl rule__Staff__Group__7 )
            // InternalMusicDsl.g:1702:2: rule__Staff__Group__6__Impl rule__Staff__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Staff__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__6"


    // $ANTLR start "rule__Staff__Group__6__Impl"
    // InternalMusicDsl.g:1709:1: rule__Staff__Group__6__Impl : ( ( rule__Staff__Group_6__0 )? ) ;
    public final void rule__Staff__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1713:1: ( ( ( rule__Staff__Group_6__0 )? ) )
            // InternalMusicDsl.g:1714:1: ( ( rule__Staff__Group_6__0 )? )
            {
            // InternalMusicDsl.g:1714:1: ( ( rule__Staff__Group_6__0 )? )
            // InternalMusicDsl.g:1715:2: ( rule__Staff__Group_6__0 )?
            {
             before(grammarAccess.getStaffAccess().getGroup_6()); 
            // InternalMusicDsl.g:1716:2: ( rule__Staff__Group_6__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==59) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMusicDsl.g:1716:3: rule__Staff__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Staff__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStaffAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__6__Impl"


    // $ANTLR start "rule__Staff__Group__7"
    // InternalMusicDsl.g:1724:1: rule__Staff__Group__7 : rule__Staff__Group__7__Impl rule__Staff__Group__8 ;
    public final void rule__Staff__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1728:1: ( rule__Staff__Group__7__Impl rule__Staff__Group__8 )
            // InternalMusicDsl.g:1729:2: rule__Staff__Group__7__Impl rule__Staff__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__Staff__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__7"


    // $ANTLR start "rule__Staff__Group__7__Impl"
    // InternalMusicDsl.g:1736:1: rule__Staff__Group__7__Impl : ( 'time:' ) ;
    public final void rule__Staff__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1740:1: ( ( 'time:' ) )
            // InternalMusicDsl.g:1741:1: ( 'time:' )
            {
            // InternalMusicDsl.g:1741:1: ( 'time:' )
            // InternalMusicDsl.g:1742:2: 'time:'
            {
             before(grammarAccess.getStaffAccess().getTimeKeyword_7()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getStaffAccess().getTimeKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__7__Impl"


    // $ANTLR start "rule__Staff__Group__8"
    // InternalMusicDsl.g:1751:1: rule__Staff__Group__8 : rule__Staff__Group__8__Impl rule__Staff__Group__9 ;
    public final void rule__Staff__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1755:1: ( rule__Staff__Group__8__Impl rule__Staff__Group__9 )
            // InternalMusicDsl.g:1756:2: rule__Staff__Group__8__Impl rule__Staff__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__Staff__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__8"


    // $ANTLR start "rule__Staff__Group__8__Impl"
    // InternalMusicDsl.g:1763:1: rule__Staff__Group__8__Impl : ( ( rule__Staff__TimeAssignment_8 ) ) ;
    public final void rule__Staff__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1767:1: ( ( ( rule__Staff__TimeAssignment_8 ) ) )
            // InternalMusicDsl.g:1768:1: ( ( rule__Staff__TimeAssignment_8 ) )
            {
            // InternalMusicDsl.g:1768:1: ( ( rule__Staff__TimeAssignment_8 ) )
            // InternalMusicDsl.g:1769:2: ( rule__Staff__TimeAssignment_8 )
            {
             before(grammarAccess.getStaffAccess().getTimeAssignment_8()); 
            // InternalMusicDsl.g:1770:2: ( rule__Staff__TimeAssignment_8 )
            // InternalMusicDsl.g:1770:3: rule__Staff__TimeAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Staff__TimeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getStaffAccess().getTimeAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__8__Impl"


    // $ANTLR start "rule__Staff__Group__9"
    // InternalMusicDsl.g:1778:1: rule__Staff__Group__9 : rule__Staff__Group__9__Impl rule__Staff__Group__10 ;
    public final void rule__Staff__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1782:1: ( rule__Staff__Group__9__Impl rule__Staff__Group__10 )
            // InternalMusicDsl.g:1783:2: rule__Staff__Group__9__Impl rule__Staff__Group__10
            {
            pushFollow(FOLLOW_14);
            rule__Staff__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__9"


    // $ANTLR start "rule__Staff__Group__9__Impl"
    // InternalMusicDsl.g:1790:1: rule__Staff__Group__9__Impl : ( ( rule__Staff__Group_9__0 )? ) ;
    public final void rule__Staff__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1794:1: ( ( ( rule__Staff__Group_9__0 )? ) )
            // InternalMusicDsl.g:1795:1: ( ( rule__Staff__Group_9__0 )? )
            {
            // InternalMusicDsl.g:1795:1: ( ( rule__Staff__Group_9__0 )? )
            // InternalMusicDsl.g:1796:2: ( rule__Staff__Group_9__0 )?
            {
             before(grammarAccess.getStaffAccess().getGroup_9()); 
            // InternalMusicDsl.g:1797:2: ( rule__Staff__Group_9__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==62||(LA19_0>=65 && LA19_0<=67)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMusicDsl.g:1797:3: rule__Staff__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Staff__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStaffAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__9__Impl"


    // $ANTLR start "rule__Staff__Group__10"
    // InternalMusicDsl.g:1805:1: rule__Staff__Group__10 : rule__Staff__Group__10__Impl ;
    public final void rule__Staff__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1809:1: ( rule__Staff__Group__10__Impl )
            // InternalMusicDsl.g:1810:2: rule__Staff__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Staff__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__10"


    // $ANTLR start "rule__Staff__Group__10__Impl"
    // InternalMusicDsl.g:1816:1: rule__Staff__Group__10__Impl : ( ']' ) ;
    public final void rule__Staff__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1820:1: ( ( ']' ) )
            // InternalMusicDsl.g:1821:1: ( ']' )
            {
            // InternalMusicDsl.g:1821:1: ( ']' )
            // InternalMusicDsl.g:1822:2: ']'
            {
             before(grammarAccess.getStaffAccess().getRightSquareBracketKeyword_10()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getStaffAccess().getRightSquareBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__10__Impl"


    // $ANTLR start "rule__Staff__Group_6__0"
    // InternalMusicDsl.g:1832:1: rule__Staff__Group_6__0 : rule__Staff__Group_6__0__Impl rule__Staff__Group_6__1 ;
    public final void rule__Staff__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1836:1: ( rule__Staff__Group_6__0__Impl rule__Staff__Group_6__1 )
            // InternalMusicDsl.g:1837:2: rule__Staff__Group_6__0__Impl rule__Staff__Group_6__1
            {
            pushFollow(FOLLOW_9);
            rule__Staff__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group_6__0"


    // $ANTLR start "rule__Staff__Group_6__0__Impl"
    // InternalMusicDsl.g:1844:1: rule__Staff__Group_6__0__Impl : ( 'key:' ) ;
    public final void rule__Staff__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1848:1: ( ( 'key:' ) )
            // InternalMusicDsl.g:1849:1: ( 'key:' )
            {
            // InternalMusicDsl.g:1849:1: ( 'key:' )
            // InternalMusicDsl.g:1850:2: 'key:'
            {
             before(grammarAccess.getStaffAccess().getKeyKeyword_6_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getStaffAccess().getKeyKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group_6__0__Impl"


    // $ANTLR start "rule__Staff__Group_6__1"
    // InternalMusicDsl.g:1859:1: rule__Staff__Group_6__1 : rule__Staff__Group_6__1__Impl ;
    public final void rule__Staff__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1863:1: ( rule__Staff__Group_6__1__Impl )
            // InternalMusicDsl.g:1864:2: rule__Staff__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Staff__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group_6__1"


    // $ANTLR start "rule__Staff__Group_6__1__Impl"
    // InternalMusicDsl.g:1870:1: rule__Staff__Group_6__1__Impl : ( ( rule__Staff__KeyAssignment_6_1 ) ) ;
    public final void rule__Staff__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1874:1: ( ( ( rule__Staff__KeyAssignment_6_1 ) ) )
            // InternalMusicDsl.g:1875:1: ( ( rule__Staff__KeyAssignment_6_1 ) )
            {
            // InternalMusicDsl.g:1875:1: ( ( rule__Staff__KeyAssignment_6_1 ) )
            // InternalMusicDsl.g:1876:2: ( rule__Staff__KeyAssignment_6_1 )
            {
             before(grammarAccess.getStaffAccess().getKeyAssignment_6_1()); 
            // InternalMusicDsl.g:1877:2: ( rule__Staff__KeyAssignment_6_1 )
            // InternalMusicDsl.g:1877:3: rule__Staff__KeyAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Staff__KeyAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getStaffAccess().getKeyAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group_6__1__Impl"


    // $ANTLR start "rule__Staff__Group_9__0"
    // InternalMusicDsl.g:1886:1: rule__Staff__Group_9__0 : rule__Staff__Group_9__0__Impl rule__Staff__Group_9__1 ;
    public final void rule__Staff__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1890:1: ( rule__Staff__Group_9__0__Impl rule__Staff__Group_9__1 )
            // InternalMusicDsl.g:1891:2: rule__Staff__Group_9__0__Impl rule__Staff__Group_9__1
            {
            pushFollow(FOLLOW_15);
            rule__Staff__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group_9__0"


    // $ANTLR start "rule__Staff__Group_9__0__Impl"
    // InternalMusicDsl.g:1898:1: rule__Staff__Group_9__0__Impl : ( ( rule__Staff__ElementsAssignment_9_0 ) ) ;
    public final void rule__Staff__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1902:1: ( ( ( rule__Staff__ElementsAssignment_9_0 ) ) )
            // InternalMusicDsl.g:1903:1: ( ( rule__Staff__ElementsAssignment_9_0 ) )
            {
            // InternalMusicDsl.g:1903:1: ( ( rule__Staff__ElementsAssignment_9_0 ) )
            // InternalMusicDsl.g:1904:2: ( rule__Staff__ElementsAssignment_9_0 )
            {
             before(grammarAccess.getStaffAccess().getElementsAssignment_9_0()); 
            // InternalMusicDsl.g:1905:2: ( rule__Staff__ElementsAssignment_9_0 )
            // InternalMusicDsl.g:1905:3: rule__Staff__ElementsAssignment_9_0
            {
            pushFollow(FOLLOW_2);
            rule__Staff__ElementsAssignment_9_0();

            state._fsp--;


            }

             after(grammarAccess.getStaffAccess().getElementsAssignment_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group_9__0__Impl"


    // $ANTLR start "rule__Staff__Group_9__1"
    // InternalMusicDsl.g:1913:1: rule__Staff__Group_9__1 : rule__Staff__Group_9__1__Impl ;
    public final void rule__Staff__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1917:1: ( rule__Staff__Group_9__1__Impl )
            // InternalMusicDsl.g:1918:2: rule__Staff__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Staff__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group_9__1"


    // $ANTLR start "rule__Staff__Group_9__1__Impl"
    // InternalMusicDsl.g:1924:1: rule__Staff__Group_9__1__Impl : ( ( rule__Staff__Group_9_1__0 )* ) ;
    public final void rule__Staff__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1928:1: ( ( ( rule__Staff__Group_9_1__0 )* ) )
            // InternalMusicDsl.g:1929:1: ( ( rule__Staff__Group_9_1__0 )* )
            {
            // InternalMusicDsl.g:1929:1: ( ( rule__Staff__Group_9_1__0 )* )
            // InternalMusicDsl.g:1930:2: ( rule__Staff__Group_9_1__0 )*
            {
             before(grammarAccess.getStaffAccess().getGroup_9_1()); 
            // InternalMusicDsl.g:1931:2: ( rule__Staff__Group_9_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==54) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMusicDsl.g:1931:3: rule__Staff__Group_9_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Staff__Group_9_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getStaffAccess().getGroup_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group_9__1__Impl"


    // $ANTLR start "rule__Staff__Group_9_1__0"
    // InternalMusicDsl.g:1940:1: rule__Staff__Group_9_1__0 : rule__Staff__Group_9_1__0__Impl rule__Staff__Group_9_1__1 ;
    public final void rule__Staff__Group_9_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1944:1: ( rule__Staff__Group_9_1__0__Impl rule__Staff__Group_9_1__1 )
            // InternalMusicDsl.g:1945:2: rule__Staff__Group_9_1__0__Impl rule__Staff__Group_9_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Staff__Group_9_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group_9_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group_9_1__0"


    // $ANTLR start "rule__Staff__Group_9_1__0__Impl"
    // InternalMusicDsl.g:1952:1: rule__Staff__Group_9_1__0__Impl : ( ',' ) ;
    public final void rule__Staff__Group_9_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1956:1: ( ( ',' ) )
            // InternalMusicDsl.g:1957:1: ( ',' )
            {
            // InternalMusicDsl.g:1957:1: ( ',' )
            // InternalMusicDsl.g:1958:2: ','
            {
             before(grammarAccess.getStaffAccess().getCommaKeyword_9_1_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getStaffAccess().getCommaKeyword_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group_9_1__0__Impl"


    // $ANTLR start "rule__Staff__Group_9_1__1"
    // InternalMusicDsl.g:1967:1: rule__Staff__Group_9_1__1 : rule__Staff__Group_9_1__1__Impl ;
    public final void rule__Staff__Group_9_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1971:1: ( rule__Staff__Group_9_1__1__Impl )
            // InternalMusicDsl.g:1972:2: rule__Staff__Group_9_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Staff__Group_9_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group_9_1__1"


    // $ANTLR start "rule__Staff__Group_9_1__1__Impl"
    // InternalMusicDsl.g:1978:1: rule__Staff__Group_9_1__1__Impl : ( ( rule__Staff__ElementsAssignment_9_1_1 ) ) ;
    public final void rule__Staff__Group_9_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1982:1: ( ( ( rule__Staff__ElementsAssignment_9_1_1 ) ) )
            // InternalMusicDsl.g:1983:1: ( ( rule__Staff__ElementsAssignment_9_1_1 ) )
            {
            // InternalMusicDsl.g:1983:1: ( ( rule__Staff__ElementsAssignment_9_1_1 ) )
            // InternalMusicDsl.g:1984:2: ( rule__Staff__ElementsAssignment_9_1_1 )
            {
             before(grammarAccess.getStaffAccess().getElementsAssignment_9_1_1()); 
            // InternalMusicDsl.g:1985:2: ( rule__Staff__ElementsAssignment_9_1_1 )
            // InternalMusicDsl.g:1985:3: rule__Staff__ElementsAssignment_9_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Staff__ElementsAssignment_9_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStaffAccess().getElementsAssignment_9_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group_9_1__1__Impl"


    // $ANTLR start "rule__Clef__Group__0"
    // InternalMusicDsl.g:1994:1: rule__Clef__Group__0 : rule__Clef__Group__0__Impl rule__Clef__Group__1 ;
    public final void rule__Clef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:1998:1: ( rule__Clef__Group__0__Impl rule__Clef__Group__1 )
            // InternalMusicDsl.g:1999:2: rule__Clef__Group__0__Impl rule__Clef__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Clef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clef__Group__0"


    // $ANTLR start "rule__Clef__Group__0__Impl"
    // InternalMusicDsl.g:2006:1: rule__Clef__Group__0__Impl : ( () ) ;
    public final void rule__Clef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2010:1: ( ( () ) )
            // InternalMusicDsl.g:2011:1: ( () )
            {
            // InternalMusicDsl.g:2011:1: ( () )
            // InternalMusicDsl.g:2012:2: ()
            {
             before(grammarAccess.getClefAccess().getClefAction_0()); 
            // InternalMusicDsl.g:2013:2: ()
            // InternalMusicDsl.g:2013:3: 
            {
            }

             after(grammarAccess.getClefAccess().getClefAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clef__Group__0__Impl"


    // $ANTLR start "rule__Clef__Group__1"
    // InternalMusicDsl.g:2021:1: rule__Clef__Group__1 : rule__Clef__Group__1__Impl ;
    public final void rule__Clef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2025:1: ( rule__Clef__Group__1__Impl )
            // InternalMusicDsl.g:2026:2: rule__Clef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clef__Group__1"


    // $ANTLR start "rule__Clef__Group__1__Impl"
    // InternalMusicDsl.g:2032:1: rule__Clef__Group__1__Impl : ( ( rule__Clef__TypeAssignment_1 )? ) ;
    public final void rule__Clef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2036:1: ( ( ( rule__Clef__TypeAssignment_1 )? ) )
            // InternalMusicDsl.g:2037:1: ( ( rule__Clef__TypeAssignment_1 )? )
            {
            // InternalMusicDsl.g:2037:1: ( ( rule__Clef__TypeAssignment_1 )? )
            // InternalMusicDsl.g:2038:2: ( rule__Clef__TypeAssignment_1 )?
            {
             before(grammarAccess.getClefAccess().getTypeAssignment_1()); 
            // InternalMusicDsl.g:2039:2: ( rule__Clef__TypeAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=11 && LA21_0<=12)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMusicDsl.g:2039:3: rule__Clef__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Clef__TypeAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClefAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clef__Group__1__Impl"


    // $ANTLR start "rule__TimeSignature__Group__0"
    // InternalMusicDsl.g:2048:1: rule__TimeSignature__Group__0 : rule__TimeSignature__Group__0__Impl rule__TimeSignature__Group__1 ;
    public final void rule__TimeSignature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2052:1: ( rule__TimeSignature__Group__0__Impl rule__TimeSignature__Group__1 )
            // InternalMusicDsl.g:2053:2: rule__TimeSignature__Group__0__Impl rule__TimeSignature__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__TimeSignature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSignature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSignature__Group__0"


    // $ANTLR start "rule__TimeSignature__Group__0__Impl"
    // InternalMusicDsl.g:2060:1: rule__TimeSignature__Group__0__Impl : ( 'beat' ) ;
    public final void rule__TimeSignature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2064:1: ( ( 'beat' ) )
            // InternalMusicDsl.g:2065:1: ( 'beat' )
            {
            // InternalMusicDsl.g:2065:1: ( 'beat' )
            // InternalMusicDsl.g:2066:2: 'beat'
            {
             before(grammarAccess.getTimeSignatureAccess().getBeatKeyword_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getTimeSignatureAccess().getBeatKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSignature__Group__0__Impl"


    // $ANTLR start "rule__TimeSignature__Group__1"
    // InternalMusicDsl.g:2075:1: rule__TimeSignature__Group__1 : rule__TimeSignature__Group__1__Impl rule__TimeSignature__Group__2 ;
    public final void rule__TimeSignature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2079:1: ( rule__TimeSignature__Group__1__Impl rule__TimeSignature__Group__2 )
            // InternalMusicDsl.g:2080:2: rule__TimeSignature__Group__1__Impl rule__TimeSignature__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__TimeSignature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSignature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSignature__Group__1"


    // $ANTLR start "rule__TimeSignature__Group__1__Impl"
    // InternalMusicDsl.g:2087:1: rule__TimeSignature__Group__1__Impl : ( ( rule__TimeSignature__BeatAssignment_1 ) ) ;
    public final void rule__TimeSignature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2091:1: ( ( ( rule__TimeSignature__BeatAssignment_1 ) ) )
            // InternalMusicDsl.g:2092:1: ( ( rule__TimeSignature__BeatAssignment_1 ) )
            {
            // InternalMusicDsl.g:2092:1: ( ( rule__TimeSignature__BeatAssignment_1 ) )
            // InternalMusicDsl.g:2093:2: ( rule__TimeSignature__BeatAssignment_1 )
            {
             before(grammarAccess.getTimeSignatureAccess().getBeatAssignment_1()); 
            // InternalMusicDsl.g:2094:2: ( rule__TimeSignature__BeatAssignment_1 )
            // InternalMusicDsl.g:2094:3: rule__TimeSignature__BeatAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TimeSignature__BeatAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeSignatureAccess().getBeatAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSignature__Group__1__Impl"


    // $ANTLR start "rule__TimeSignature__Group__2"
    // InternalMusicDsl.g:2102:1: rule__TimeSignature__Group__2 : rule__TimeSignature__Group__2__Impl rule__TimeSignature__Group__3 ;
    public final void rule__TimeSignature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2106:1: ( rule__TimeSignature__Group__2__Impl rule__TimeSignature__Group__3 )
            // InternalMusicDsl.g:2107:2: rule__TimeSignature__Group__2__Impl rule__TimeSignature__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__TimeSignature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSignature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSignature__Group__2"


    // $ANTLR start "rule__TimeSignature__Group__2__Impl"
    // InternalMusicDsl.g:2114:1: rule__TimeSignature__Group__2__Impl : ( ',' ) ;
    public final void rule__TimeSignature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2118:1: ( ( ',' ) )
            // InternalMusicDsl.g:2119:1: ( ',' )
            {
            // InternalMusicDsl.g:2119:1: ( ',' )
            // InternalMusicDsl.g:2120:2: ','
            {
             before(grammarAccess.getTimeSignatureAccess().getCommaKeyword_2()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getTimeSignatureAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSignature__Group__2__Impl"


    // $ANTLR start "rule__TimeSignature__Group__3"
    // InternalMusicDsl.g:2129:1: rule__TimeSignature__Group__3 : rule__TimeSignature__Group__3__Impl rule__TimeSignature__Group__4 ;
    public final void rule__TimeSignature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2133:1: ( rule__TimeSignature__Group__3__Impl rule__TimeSignature__Group__4 )
            // InternalMusicDsl.g:2134:2: rule__TimeSignature__Group__3__Impl rule__TimeSignature__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__TimeSignature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSignature__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSignature__Group__3"


    // $ANTLR start "rule__TimeSignature__Group__3__Impl"
    // InternalMusicDsl.g:2141:1: rule__TimeSignature__Group__3__Impl : ( 'beatType' ) ;
    public final void rule__TimeSignature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2145:1: ( ( 'beatType' ) )
            // InternalMusicDsl.g:2146:1: ( 'beatType' )
            {
            // InternalMusicDsl.g:2146:1: ( 'beatType' )
            // InternalMusicDsl.g:2147:2: 'beatType'
            {
             before(grammarAccess.getTimeSignatureAccess().getBeatTypeKeyword_3()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getTimeSignatureAccess().getBeatTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSignature__Group__3__Impl"


    // $ANTLR start "rule__TimeSignature__Group__4"
    // InternalMusicDsl.g:2156:1: rule__TimeSignature__Group__4 : rule__TimeSignature__Group__4__Impl ;
    public final void rule__TimeSignature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2160:1: ( rule__TimeSignature__Group__4__Impl )
            // InternalMusicDsl.g:2161:2: rule__TimeSignature__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeSignature__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSignature__Group__4"


    // $ANTLR start "rule__TimeSignature__Group__4__Impl"
    // InternalMusicDsl.g:2167:1: rule__TimeSignature__Group__4__Impl : ( ( rule__TimeSignature__BeatTypeAssignment_4 ) ) ;
    public final void rule__TimeSignature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2171:1: ( ( ( rule__TimeSignature__BeatTypeAssignment_4 ) ) )
            // InternalMusicDsl.g:2172:1: ( ( rule__TimeSignature__BeatTypeAssignment_4 ) )
            {
            // InternalMusicDsl.g:2172:1: ( ( rule__TimeSignature__BeatTypeAssignment_4 ) )
            // InternalMusicDsl.g:2173:2: ( rule__TimeSignature__BeatTypeAssignment_4 )
            {
             before(grammarAccess.getTimeSignatureAccess().getBeatTypeAssignment_4()); 
            // InternalMusicDsl.g:2174:2: ( rule__TimeSignature__BeatTypeAssignment_4 )
            // InternalMusicDsl.g:2174:3: rule__TimeSignature__BeatTypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__TimeSignature__BeatTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTimeSignatureAccess().getBeatTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSignature__Group__4__Impl"


    // $ANTLR start "rule__Measure__Group__0"
    // InternalMusicDsl.g:2183:1: rule__Measure__Group__0 : rule__Measure__Group__0__Impl rule__Measure__Group__1 ;
    public final void rule__Measure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2187:1: ( rule__Measure__Group__0__Impl rule__Measure__Group__1 )
            // InternalMusicDsl.g:2188:2: rule__Measure__Group__0__Impl rule__Measure__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Measure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measure__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group__0"


    // $ANTLR start "rule__Measure__Group__0__Impl"
    // InternalMusicDsl.g:2195:1: rule__Measure__Group__0__Impl : ( () ) ;
    public final void rule__Measure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2199:1: ( ( () ) )
            // InternalMusicDsl.g:2200:1: ( () )
            {
            // InternalMusicDsl.g:2200:1: ( () )
            // InternalMusicDsl.g:2201:2: ()
            {
             before(grammarAccess.getMeasureAccess().getMeasureAction_0()); 
            // InternalMusicDsl.g:2202:2: ()
            // InternalMusicDsl.g:2202:3: 
            {
            }

             after(grammarAccess.getMeasureAccess().getMeasureAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group__0__Impl"


    // $ANTLR start "rule__Measure__Group__1"
    // InternalMusicDsl.g:2210:1: rule__Measure__Group__1 : rule__Measure__Group__1__Impl rule__Measure__Group__2 ;
    public final void rule__Measure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2214:1: ( rule__Measure__Group__1__Impl rule__Measure__Group__2 )
            // InternalMusicDsl.g:2215:2: rule__Measure__Group__1__Impl rule__Measure__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Measure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measure__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group__1"


    // $ANTLR start "rule__Measure__Group__1__Impl"
    // InternalMusicDsl.g:2222:1: rule__Measure__Group__1__Impl : ( 'Measure' ) ;
    public final void rule__Measure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2226:1: ( ( 'Measure' ) )
            // InternalMusicDsl.g:2227:1: ( 'Measure' )
            {
            // InternalMusicDsl.g:2227:1: ( 'Measure' )
            // InternalMusicDsl.g:2228:2: 'Measure'
            {
             before(grammarAccess.getMeasureAccess().getMeasureKeyword_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getMeasureAccess().getMeasureKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group__1__Impl"


    // $ANTLR start "rule__Measure__Group__2"
    // InternalMusicDsl.g:2237:1: rule__Measure__Group__2 : rule__Measure__Group__2__Impl rule__Measure__Group__3 ;
    public final void rule__Measure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2241:1: ( rule__Measure__Group__2__Impl rule__Measure__Group__3 )
            // InternalMusicDsl.g:2242:2: rule__Measure__Group__2__Impl rule__Measure__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Measure__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measure__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group__2"


    // $ANTLR start "rule__Measure__Group__2__Impl"
    // InternalMusicDsl.g:2249:1: rule__Measure__Group__2__Impl : ( ( rule__Measure__MeasureNumberAssignment_2 ) ) ;
    public final void rule__Measure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2253:1: ( ( ( rule__Measure__MeasureNumberAssignment_2 ) ) )
            // InternalMusicDsl.g:2254:1: ( ( rule__Measure__MeasureNumberAssignment_2 ) )
            {
            // InternalMusicDsl.g:2254:1: ( ( rule__Measure__MeasureNumberAssignment_2 ) )
            // InternalMusicDsl.g:2255:2: ( rule__Measure__MeasureNumberAssignment_2 )
            {
             before(grammarAccess.getMeasureAccess().getMeasureNumberAssignment_2()); 
            // InternalMusicDsl.g:2256:2: ( rule__Measure__MeasureNumberAssignment_2 )
            // InternalMusicDsl.g:2256:3: rule__Measure__MeasureNumberAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Measure__MeasureNumberAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMeasureAccess().getMeasureNumberAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group__2__Impl"


    // $ANTLR start "rule__Measure__Group__3"
    // InternalMusicDsl.g:2264:1: rule__Measure__Group__3 : rule__Measure__Group__3__Impl rule__Measure__Group__4 ;
    public final void rule__Measure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2268:1: ( rule__Measure__Group__3__Impl rule__Measure__Group__4 )
            // InternalMusicDsl.g:2269:2: rule__Measure__Group__3__Impl rule__Measure__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Measure__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measure__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group__3"


    // $ANTLR start "rule__Measure__Group__3__Impl"
    // InternalMusicDsl.g:2276:1: rule__Measure__Group__3__Impl : ( 'begin' ) ;
    public final void rule__Measure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2280:1: ( ( 'begin' ) )
            // InternalMusicDsl.g:2281:1: ( 'begin' )
            {
            // InternalMusicDsl.g:2281:1: ( 'begin' )
            // InternalMusicDsl.g:2282:2: 'begin'
            {
             before(grammarAccess.getMeasureAccess().getBeginKeyword_3()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getMeasureAccess().getBeginKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group__3__Impl"


    // $ANTLR start "rule__Measure__Group__4"
    // InternalMusicDsl.g:2291:1: rule__Measure__Group__4 : rule__Measure__Group__4__Impl rule__Measure__Group__5 ;
    public final void rule__Measure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2295:1: ( rule__Measure__Group__4__Impl rule__Measure__Group__5 )
            // InternalMusicDsl.g:2296:2: rule__Measure__Group__4__Impl rule__Measure__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Measure__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measure__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group__4"


    // $ANTLR start "rule__Measure__Group__4__Impl"
    // InternalMusicDsl.g:2303:1: rule__Measure__Group__4__Impl : ( ( rule__Measure__Group_4__0 )? ) ;
    public final void rule__Measure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2307:1: ( ( ( rule__Measure__Group_4__0 )? ) )
            // InternalMusicDsl.g:2308:1: ( ( rule__Measure__Group_4__0 )? )
            {
            // InternalMusicDsl.g:2308:1: ( ( rule__Measure__Group_4__0 )? )
            // InternalMusicDsl.g:2309:2: ( rule__Measure__Group_4__0 )?
            {
             before(grammarAccess.getMeasureAccess().getGroup_4()); 
            // InternalMusicDsl.g:2310:2: ( rule__Measure__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==66) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMusicDsl.g:2310:3: rule__Measure__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Measure__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeasureAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group__4__Impl"


    // $ANTLR start "rule__Measure__Group__5"
    // InternalMusicDsl.g:2318:1: rule__Measure__Group__5 : rule__Measure__Group__5__Impl rule__Measure__Group__6 ;
    public final void rule__Measure__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2322:1: ( rule__Measure__Group__5__Impl rule__Measure__Group__6 )
            // InternalMusicDsl.g:2323:2: rule__Measure__Group__5__Impl rule__Measure__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Measure__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measure__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group__5"


    // $ANTLR start "rule__Measure__Group__5__Impl"
    // InternalMusicDsl.g:2330:1: rule__Measure__Group__5__Impl : ( ( rule__Measure__Group_5__0 )? ) ;
    public final void rule__Measure__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2334:1: ( ( ( rule__Measure__Group_5__0 )? ) )
            // InternalMusicDsl.g:2335:1: ( ( rule__Measure__Group_5__0 )? )
            {
            // InternalMusicDsl.g:2335:1: ( ( rule__Measure__Group_5__0 )? )
            // InternalMusicDsl.g:2336:2: ( rule__Measure__Group_5__0 )?
            {
             before(grammarAccess.getMeasureAccess().getGroup_5()); 
            // InternalMusicDsl.g:2337:2: ( rule__Measure__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==65) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMusicDsl.g:2337:3: rule__Measure__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Measure__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeasureAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group__5__Impl"


    // $ANTLR start "rule__Measure__Group__6"
    // InternalMusicDsl.g:2345:1: rule__Measure__Group__6 : rule__Measure__Group__6__Impl rule__Measure__Group__7 ;
    public final void rule__Measure__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2349:1: ( rule__Measure__Group__6__Impl rule__Measure__Group__7 )
            // InternalMusicDsl.g:2350:2: rule__Measure__Group__6__Impl rule__Measure__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__Measure__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measure__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group__6"


    // $ANTLR start "rule__Measure__Group__6__Impl"
    // InternalMusicDsl.g:2357:1: rule__Measure__Group__6__Impl : ( ( rule__Measure__Group_6__0 )? ) ;
    public final void rule__Measure__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2361:1: ( ( ( rule__Measure__Group_6__0 )? ) )
            // InternalMusicDsl.g:2362:1: ( ( rule__Measure__Group_6__0 )? )
            {
            // InternalMusicDsl.g:2362:1: ( ( rule__Measure__Group_6__0 )? )
            // InternalMusicDsl.g:2363:2: ( rule__Measure__Group_6__0 )?
            {
             before(grammarAccess.getMeasureAccess().getGroup_6()); 
            // InternalMusicDsl.g:2364:2: ( rule__Measure__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==67) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMusicDsl.g:2364:3: rule__Measure__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Measure__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeasureAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group__6__Impl"


    // $ANTLR start "rule__Measure__Group__7"
    // InternalMusicDsl.g:2372:1: rule__Measure__Group__7 : rule__Measure__Group__7__Impl ;
    public final void rule__Measure__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2376:1: ( rule__Measure__Group__7__Impl )
            // InternalMusicDsl.g:2377:2: rule__Measure__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Measure__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group__7"


    // $ANTLR start "rule__Measure__Group__7__Impl"
    // InternalMusicDsl.g:2383:1: rule__Measure__Group__7__Impl : ( 'end' ) ;
    public final void rule__Measure__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2387:1: ( ( 'end' ) )
            // InternalMusicDsl.g:2388:1: ( 'end' )
            {
            // InternalMusicDsl.g:2388:1: ( 'end' )
            // InternalMusicDsl.g:2389:2: 'end'
            {
             before(grammarAccess.getMeasureAccess().getEndKeyword_7()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getMeasureAccess().getEndKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group__7__Impl"


    // $ANTLR start "rule__Measure__Group_4__0"
    // InternalMusicDsl.g:2399:1: rule__Measure__Group_4__0 : rule__Measure__Group_4__0__Impl rule__Measure__Group_4__1 ;
    public final void rule__Measure__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2403:1: ( rule__Measure__Group_4__0__Impl rule__Measure__Group_4__1 )
            // InternalMusicDsl.g:2404:2: rule__Measure__Group_4__0__Impl rule__Measure__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__Measure__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measure__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group_4__0"


    // $ANTLR start "rule__Measure__Group_4__0__Impl"
    // InternalMusicDsl.g:2411:1: rule__Measure__Group_4__0__Impl : ( ( rule__Measure__RepetitionAssignment_4_0 ) ) ;
    public final void rule__Measure__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2415:1: ( ( ( rule__Measure__RepetitionAssignment_4_0 ) ) )
            // InternalMusicDsl.g:2416:1: ( ( rule__Measure__RepetitionAssignment_4_0 ) )
            {
            // InternalMusicDsl.g:2416:1: ( ( rule__Measure__RepetitionAssignment_4_0 ) )
            // InternalMusicDsl.g:2417:2: ( rule__Measure__RepetitionAssignment_4_0 )
            {
             before(grammarAccess.getMeasureAccess().getRepetitionAssignment_4_0()); 
            // InternalMusicDsl.g:2418:2: ( rule__Measure__RepetitionAssignment_4_0 )
            // InternalMusicDsl.g:2418:3: rule__Measure__RepetitionAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Measure__RepetitionAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getMeasureAccess().getRepetitionAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group_4__0__Impl"


    // $ANTLR start "rule__Measure__Group_4__1"
    // InternalMusicDsl.g:2426:1: rule__Measure__Group_4__1 : rule__Measure__Group_4__1__Impl ;
    public final void rule__Measure__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2430:1: ( rule__Measure__Group_4__1__Impl )
            // InternalMusicDsl.g:2431:2: rule__Measure__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Measure__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group_4__1"


    // $ANTLR start "rule__Measure__Group_4__1__Impl"
    // InternalMusicDsl.g:2437:1: rule__Measure__Group_4__1__Impl : ( ( rule__Measure__Group_4_1__0 )* ) ;
    public final void rule__Measure__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2441:1: ( ( ( rule__Measure__Group_4_1__0 )* ) )
            // InternalMusicDsl.g:2442:1: ( ( rule__Measure__Group_4_1__0 )* )
            {
            // InternalMusicDsl.g:2442:1: ( ( rule__Measure__Group_4_1__0 )* )
            // InternalMusicDsl.g:2443:2: ( rule__Measure__Group_4_1__0 )*
            {
             before(grammarAccess.getMeasureAccess().getGroup_4_1()); 
            // InternalMusicDsl.g:2444:2: ( rule__Measure__Group_4_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==54) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMusicDsl.g:2444:3: rule__Measure__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Measure__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getMeasureAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group_4__1__Impl"


    // $ANTLR start "rule__Measure__Group_4_1__0"
    // InternalMusicDsl.g:2453:1: rule__Measure__Group_4_1__0 : rule__Measure__Group_4_1__0__Impl rule__Measure__Group_4_1__1 ;
    public final void rule__Measure__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2457:1: ( rule__Measure__Group_4_1__0__Impl rule__Measure__Group_4_1__1 )
            // InternalMusicDsl.g:2458:2: rule__Measure__Group_4_1__0__Impl rule__Measure__Group_4_1__1
            {
            pushFollow(FOLLOW_21);
            rule__Measure__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measure__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group_4_1__0"


    // $ANTLR start "rule__Measure__Group_4_1__0__Impl"
    // InternalMusicDsl.g:2465:1: rule__Measure__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Measure__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2469:1: ( ( ',' ) )
            // InternalMusicDsl.g:2470:1: ( ',' )
            {
            // InternalMusicDsl.g:2470:1: ( ',' )
            // InternalMusicDsl.g:2471:2: ','
            {
             before(grammarAccess.getMeasureAccess().getCommaKeyword_4_1_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getMeasureAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group_4_1__0__Impl"


    // $ANTLR start "rule__Measure__Group_4_1__1"
    // InternalMusicDsl.g:2480:1: rule__Measure__Group_4_1__1 : rule__Measure__Group_4_1__1__Impl ;
    public final void rule__Measure__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2484:1: ( rule__Measure__Group_4_1__1__Impl )
            // InternalMusicDsl.g:2485:2: rule__Measure__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Measure__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group_4_1__1"


    // $ANTLR start "rule__Measure__Group_4_1__1__Impl"
    // InternalMusicDsl.g:2491:1: rule__Measure__Group_4_1__1__Impl : ( ( rule__Measure__RepetitionAssignment_4_1_1 ) ) ;
    public final void rule__Measure__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2495:1: ( ( ( rule__Measure__RepetitionAssignment_4_1_1 ) ) )
            // InternalMusicDsl.g:2496:1: ( ( rule__Measure__RepetitionAssignment_4_1_1 ) )
            {
            // InternalMusicDsl.g:2496:1: ( ( rule__Measure__RepetitionAssignment_4_1_1 ) )
            // InternalMusicDsl.g:2497:2: ( rule__Measure__RepetitionAssignment_4_1_1 )
            {
             before(grammarAccess.getMeasureAccess().getRepetitionAssignment_4_1_1()); 
            // InternalMusicDsl.g:2498:2: ( rule__Measure__RepetitionAssignment_4_1_1 )
            // InternalMusicDsl.g:2498:3: rule__Measure__RepetitionAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Measure__RepetitionAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMeasureAccess().getRepetitionAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group_4_1__1__Impl"


    // $ANTLR start "rule__Measure__Group_5__0"
    // InternalMusicDsl.g:2507:1: rule__Measure__Group_5__0 : rule__Measure__Group_5__0__Impl rule__Measure__Group_5__1 ;
    public final void rule__Measure__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2511:1: ( rule__Measure__Group_5__0__Impl rule__Measure__Group_5__1 )
            // InternalMusicDsl.g:2512:2: rule__Measure__Group_5__0__Impl rule__Measure__Group_5__1
            {
            pushFollow(FOLLOW_15);
            rule__Measure__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measure__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group_5__0"


    // $ANTLR start "rule__Measure__Group_5__0__Impl"
    // InternalMusicDsl.g:2519:1: rule__Measure__Group_5__0__Impl : ( ( rule__Measure__RestAssignment_5_0 ) ) ;
    public final void rule__Measure__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2523:1: ( ( ( rule__Measure__RestAssignment_5_0 ) ) )
            // InternalMusicDsl.g:2524:1: ( ( rule__Measure__RestAssignment_5_0 ) )
            {
            // InternalMusicDsl.g:2524:1: ( ( rule__Measure__RestAssignment_5_0 ) )
            // InternalMusicDsl.g:2525:2: ( rule__Measure__RestAssignment_5_0 )
            {
             before(grammarAccess.getMeasureAccess().getRestAssignment_5_0()); 
            // InternalMusicDsl.g:2526:2: ( rule__Measure__RestAssignment_5_0 )
            // InternalMusicDsl.g:2526:3: rule__Measure__RestAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Measure__RestAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getMeasureAccess().getRestAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group_5__0__Impl"


    // $ANTLR start "rule__Measure__Group_5__1"
    // InternalMusicDsl.g:2534:1: rule__Measure__Group_5__1 : rule__Measure__Group_5__1__Impl ;
    public final void rule__Measure__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2538:1: ( rule__Measure__Group_5__1__Impl )
            // InternalMusicDsl.g:2539:2: rule__Measure__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Measure__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group_5__1"


    // $ANTLR start "rule__Measure__Group_5__1__Impl"
    // InternalMusicDsl.g:2545:1: rule__Measure__Group_5__1__Impl : ( ( rule__Measure__Group_5_1__0 )* ) ;
    public final void rule__Measure__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2549:1: ( ( ( rule__Measure__Group_5_1__0 )* ) )
            // InternalMusicDsl.g:2550:1: ( ( rule__Measure__Group_5_1__0 )* )
            {
            // InternalMusicDsl.g:2550:1: ( ( rule__Measure__Group_5_1__0 )* )
            // InternalMusicDsl.g:2551:2: ( rule__Measure__Group_5_1__0 )*
            {
             before(grammarAccess.getMeasureAccess().getGroup_5_1()); 
            // InternalMusicDsl.g:2552:2: ( rule__Measure__Group_5_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==54) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMusicDsl.g:2552:3: rule__Measure__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Measure__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getMeasureAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group_5__1__Impl"


    // $ANTLR start "rule__Measure__Group_5_1__0"
    // InternalMusicDsl.g:2561:1: rule__Measure__Group_5_1__0 : rule__Measure__Group_5_1__0__Impl rule__Measure__Group_5_1__1 ;
    public final void rule__Measure__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2565:1: ( rule__Measure__Group_5_1__0__Impl rule__Measure__Group_5_1__1 )
            // InternalMusicDsl.g:2566:2: rule__Measure__Group_5_1__0__Impl rule__Measure__Group_5_1__1
            {
            pushFollow(FOLLOW_22);
            rule__Measure__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measure__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group_5_1__0"


    // $ANTLR start "rule__Measure__Group_5_1__0__Impl"
    // InternalMusicDsl.g:2573:1: rule__Measure__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__Measure__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2577:1: ( ( ',' ) )
            // InternalMusicDsl.g:2578:1: ( ',' )
            {
            // InternalMusicDsl.g:2578:1: ( ',' )
            // InternalMusicDsl.g:2579:2: ','
            {
             before(grammarAccess.getMeasureAccess().getCommaKeyword_5_1_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getMeasureAccess().getCommaKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group_5_1__0__Impl"


    // $ANTLR start "rule__Measure__Group_5_1__1"
    // InternalMusicDsl.g:2588:1: rule__Measure__Group_5_1__1 : rule__Measure__Group_5_1__1__Impl ;
    public final void rule__Measure__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2592:1: ( rule__Measure__Group_5_1__1__Impl )
            // InternalMusicDsl.g:2593:2: rule__Measure__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Measure__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group_5_1__1"


    // $ANTLR start "rule__Measure__Group_5_1__1__Impl"
    // InternalMusicDsl.g:2599:1: rule__Measure__Group_5_1__1__Impl : ( ( rule__Measure__RestAssignment_5_1_1 ) ) ;
    public final void rule__Measure__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2603:1: ( ( ( rule__Measure__RestAssignment_5_1_1 ) ) )
            // InternalMusicDsl.g:2604:1: ( ( rule__Measure__RestAssignment_5_1_1 ) )
            {
            // InternalMusicDsl.g:2604:1: ( ( rule__Measure__RestAssignment_5_1_1 ) )
            // InternalMusicDsl.g:2605:2: ( rule__Measure__RestAssignment_5_1_1 )
            {
             before(grammarAccess.getMeasureAccess().getRestAssignment_5_1_1()); 
            // InternalMusicDsl.g:2606:2: ( rule__Measure__RestAssignment_5_1_1 )
            // InternalMusicDsl.g:2606:3: rule__Measure__RestAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Measure__RestAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMeasureAccess().getRestAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group_5_1__1__Impl"


    // $ANTLR start "rule__Measure__Group_6__0"
    // InternalMusicDsl.g:2615:1: rule__Measure__Group_6__0 : rule__Measure__Group_6__0__Impl rule__Measure__Group_6__1 ;
    public final void rule__Measure__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2619:1: ( rule__Measure__Group_6__0__Impl rule__Measure__Group_6__1 )
            // InternalMusicDsl.g:2620:2: rule__Measure__Group_6__0__Impl rule__Measure__Group_6__1
            {
            pushFollow(FOLLOW_15);
            rule__Measure__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measure__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group_6__0"


    // $ANTLR start "rule__Measure__Group_6__0__Impl"
    // InternalMusicDsl.g:2627:1: rule__Measure__Group_6__0__Impl : ( ( rule__Measure__NoteAssignment_6_0 ) ) ;
    public final void rule__Measure__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2631:1: ( ( ( rule__Measure__NoteAssignment_6_0 ) ) )
            // InternalMusicDsl.g:2632:1: ( ( rule__Measure__NoteAssignment_6_0 ) )
            {
            // InternalMusicDsl.g:2632:1: ( ( rule__Measure__NoteAssignment_6_0 ) )
            // InternalMusicDsl.g:2633:2: ( rule__Measure__NoteAssignment_6_0 )
            {
             before(grammarAccess.getMeasureAccess().getNoteAssignment_6_0()); 
            // InternalMusicDsl.g:2634:2: ( rule__Measure__NoteAssignment_6_0 )
            // InternalMusicDsl.g:2634:3: rule__Measure__NoteAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Measure__NoteAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getMeasureAccess().getNoteAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group_6__0__Impl"


    // $ANTLR start "rule__Measure__Group_6__1"
    // InternalMusicDsl.g:2642:1: rule__Measure__Group_6__1 : rule__Measure__Group_6__1__Impl ;
    public final void rule__Measure__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2646:1: ( rule__Measure__Group_6__1__Impl )
            // InternalMusicDsl.g:2647:2: rule__Measure__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Measure__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group_6__1"


    // $ANTLR start "rule__Measure__Group_6__1__Impl"
    // InternalMusicDsl.g:2653:1: rule__Measure__Group_6__1__Impl : ( ( rule__Measure__Group_6_1__0 )* ) ;
    public final void rule__Measure__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2657:1: ( ( ( rule__Measure__Group_6_1__0 )* ) )
            // InternalMusicDsl.g:2658:1: ( ( rule__Measure__Group_6_1__0 )* )
            {
            // InternalMusicDsl.g:2658:1: ( ( rule__Measure__Group_6_1__0 )* )
            // InternalMusicDsl.g:2659:2: ( rule__Measure__Group_6_1__0 )*
            {
             before(grammarAccess.getMeasureAccess().getGroup_6_1()); 
            // InternalMusicDsl.g:2660:2: ( rule__Measure__Group_6_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==54) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMusicDsl.g:2660:3: rule__Measure__Group_6_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Measure__Group_6_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getMeasureAccess().getGroup_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group_6__1__Impl"


    // $ANTLR start "rule__Measure__Group_6_1__0"
    // InternalMusicDsl.g:2669:1: rule__Measure__Group_6_1__0 : rule__Measure__Group_6_1__0__Impl rule__Measure__Group_6_1__1 ;
    public final void rule__Measure__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2673:1: ( rule__Measure__Group_6_1__0__Impl rule__Measure__Group_6_1__1 )
            // InternalMusicDsl.g:2674:2: rule__Measure__Group_6_1__0__Impl rule__Measure__Group_6_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Measure__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measure__Group_6_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group_6_1__0"


    // $ANTLR start "rule__Measure__Group_6_1__0__Impl"
    // InternalMusicDsl.g:2681:1: rule__Measure__Group_6_1__0__Impl : ( ',' ) ;
    public final void rule__Measure__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2685:1: ( ( ',' ) )
            // InternalMusicDsl.g:2686:1: ( ',' )
            {
            // InternalMusicDsl.g:2686:1: ( ',' )
            // InternalMusicDsl.g:2687:2: ','
            {
             before(grammarAccess.getMeasureAccess().getCommaKeyword_6_1_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getMeasureAccess().getCommaKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group_6_1__0__Impl"


    // $ANTLR start "rule__Measure__Group_6_1__1"
    // InternalMusicDsl.g:2696:1: rule__Measure__Group_6_1__1 : rule__Measure__Group_6_1__1__Impl ;
    public final void rule__Measure__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2700:1: ( rule__Measure__Group_6_1__1__Impl )
            // InternalMusicDsl.g:2701:2: rule__Measure__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Measure__Group_6_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group_6_1__1"


    // $ANTLR start "rule__Measure__Group_6_1__1__Impl"
    // InternalMusicDsl.g:2707:1: rule__Measure__Group_6_1__1__Impl : ( ( rule__Measure__NoteAssignment_6_1_1 ) ) ;
    public final void rule__Measure__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2711:1: ( ( ( rule__Measure__NoteAssignment_6_1_1 ) ) )
            // InternalMusicDsl.g:2712:1: ( ( rule__Measure__NoteAssignment_6_1_1 ) )
            {
            // InternalMusicDsl.g:2712:1: ( ( rule__Measure__NoteAssignment_6_1_1 ) )
            // InternalMusicDsl.g:2713:2: ( rule__Measure__NoteAssignment_6_1_1 )
            {
             before(grammarAccess.getMeasureAccess().getNoteAssignment_6_1_1()); 
            // InternalMusicDsl.g:2714:2: ( rule__Measure__NoteAssignment_6_1_1 )
            // InternalMusicDsl.g:2714:3: rule__Measure__NoteAssignment_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Measure__NoteAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMeasureAccess().getNoteAssignment_6_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group_6_1__1__Impl"


    // $ANTLR start "rule__Rest__Group__0"
    // InternalMusicDsl.g:2723:1: rule__Rest__Group__0 : rule__Rest__Group__0__Impl rule__Rest__Group__1 ;
    public final void rule__Rest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2727:1: ( rule__Rest__Group__0__Impl rule__Rest__Group__1 )
            // InternalMusicDsl.g:2728:2: rule__Rest__Group__0__Impl rule__Rest__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Rest__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rest__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rest__Group__0"


    // $ANTLR start "rule__Rest__Group__0__Impl"
    // InternalMusicDsl.g:2735:1: rule__Rest__Group__0__Impl : ( () ) ;
    public final void rule__Rest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2739:1: ( ( () ) )
            // InternalMusicDsl.g:2740:1: ( () )
            {
            // InternalMusicDsl.g:2740:1: ( () )
            // InternalMusicDsl.g:2741:2: ()
            {
             before(grammarAccess.getRestAccess().getRestAction_0()); 
            // InternalMusicDsl.g:2742:2: ()
            // InternalMusicDsl.g:2742:3: 
            {
            }

             after(grammarAccess.getRestAccess().getRestAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rest__Group__0__Impl"


    // $ANTLR start "rule__Rest__Group__1"
    // InternalMusicDsl.g:2750:1: rule__Rest__Group__1 : rule__Rest__Group__1__Impl rule__Rest__Group__2 ;
    public final void rule__Rest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2754:1: ( rule__Rest__Group__1__Impl rule__Rest__Group__2 )
            // InternalMusicDsl.g:2755:2: rule__Rest__Group__1__Impl rule__Rest__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Rest__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rest__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rest__Group__1"


    // $ANTLR start "rule__Rest__Group__1__Impl"
    // InternalMusicDsl.g:2762:1: rule__Rest__Group__1__Impl : ( 'rest' ) ;
    public final void rule__Rest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2766:1: ( ( 'rest' ) )
            // InternalMusicDsl.g:2767:1: ( 'rest' )
            {
            // InternalMusicDsl.g:2767:1: ( 'rest' )
            // InternalMusicDsl.g:2768:2: 'rest'
            {
             before(grammarAccess.getRestAccess().getRestKeyword_1()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getRestAccess().getRestKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rest__Group__1__Impl"


    // $ANTLR start "rule__Rest__Group__2"
    // InternalMusicDsl.g:2777:1: rule__Rest__Group__2 : rule__Rest__Group__2__Impl ;
    public final void rule__Rest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2781:1: ( rule__Rest__Group__2__Impl )
            // InternalMusicDsl.g:2782:2: rule__Rest__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rest__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rest__Group__2"


    // $ANTLR start "rule__Rest__Group__2__Impl"
    // InternalMusicDsl.g:2788:1: rule__Rest__Group__2__Impl : ( ( rule__Rest__TypeAssignment_2 )? ) ;
    public final void rule__Rest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2792:1: ( ( ( rule__Rest__TypeAssignment_2 )? ) )
            // InternalMusicDsl.g:2793:1: ( ( rule__Rest__TypeAssignment_2 )? )
            {
            // InternalMusicDsl.g:2793:1: ( ( rule__Rest__TypeAssignment_2 )? )
            // InternalMusicDsl.g:2794:2: ( rule__Rest__TypeAssignment_2 )?
            {
             before(grammarAccess.getRestAccess().getTypeAssignment_2()); 
            // InternalMusicDsl.g:2795:2: ( rule__Rest__TypeAssignment_2 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=13 && LA28_0<=19)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMusicDsl.g:2795:3: rule__Rest__TypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rest__TypeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRestAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rest__Group__2__Impl"


    // $ANTLR start "rule__Repetition__Group__0"
    // InternalMusicDsl.g:2804:1: rule__Repetition__Group__0 : rule__Repetition__Group__0__Impl rule__Repetition__Group__1 ;
    public final void rule__Repetition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2808:1: ( rule__Repetition__Group__0__Impl rule__Repetition__Group__1 )
            // InternalMusicDsl.g:2809:2: rule__Repetition__Group__0__Impl rule__Repetition__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Repetition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Repetition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repetition__Group__0"


    // $ANTLR start "rule__Repetition__Group__0__Impl"
    // InternalMusicDsl.g:2816:1: rule__Repetition__Group__0__Impl : ( () ) ;
    public final void rule__Repetition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2820:1: ( ( () ) )
            // InternalMusicDsl.g:2821:1: ( () )
            {
            // InternalMusicDsl.g:2821:1: ( () )
            // InternalMusicDsl.g:2822:2: ()
            {
             before(grammarAccess.getRepetitionAccess().getRepetitionAction_0()); 
            // InternalMusicDsl.g:2823:2: ()
            // InternalMusicDsl.g:2823:3: 
            {
            }

             after(grammarAccess.getRepetitionAccess().getRepetitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repetition__Group__0__Impl"


    // $ANTLR start "rule__Repetition__Group__1"
    // InternalMusicDsl.g:2831:1: rule__Repetition__Group__1 : rule__Repetition__Group__1__Impl rule__Repetition__Group__2 ;
    public final void rule__Repetition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2835:1: ( rule__Repetition__Group__1__Impl rule__Repetition__Group__2 )
            // InternalMusicDsl.g:2836:2: rule__Repetition__Group__1__Impl rule__Repetition__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Repetition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Repetition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repetition__Group__1"


    // $ANTLR start "rule__Repetition__Group__1__Impl"
    // InternalMusicDsl.g:2843:1: rule__Repetition__Group__1__Impl : ( 'repetition' ) ;
    public final void rule__Repetition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2847:1: ( ( 'repetition' ) )
            // InternalMusicDsl.g:2848:1: ( 'repetition' )
            {
            // InternalMusicDsl.g:2848:1: ( 'repetition' )
            // InternalMusicDsl.g:2849:2: 'repetition'
            {
             before(grammarAccess.getRepetitionAccess().getRepetitionKeyword_1()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getRepetitionAccess().getRepetitionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repetition__Group__1__Impl"


    // $ANTLR start "rule__Repetition__Group__2"
    // InternalMusicDsl.g:2858:1: rule__Repetition__Group__2 : rule__Repetition__Group__2__Impl ;
    public final void rule__Repetition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2862:1: ( rule__Repetition__Group__2__Impl )
            // InternalMusicDsl.g:2863:2: rule__Repetition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Repetition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repetition__Group__2"


    // $ANTLR start "rule__Repetition__Group__2__Impl"
    // InternalMusicDsl.g:2869:1: rule__Repetition__Group__2__Impl : ( ( rule__Repetition__TypeAssignment_2 )? ) ;
    public final void rule__Repetition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2873:1: ( ( ( rule__Repetition__TypeAssignment_2 )? ) )
            // InternalMusicDsl.g:2874:1: ( ( rule__Repetition__TypeAssignment_2 )? )
            {
            // InternalMusicDsl.g:2874:1: ( ( rule__Repetition__TypeAssignment_2 )? )
            // InternalMusicDsl.g:2875:2: ( rule__Repetition__TypeAssignment_2 )?
            {
             before(grammarAccess.getRepetitionAccess().getTypeAssignment_2()); 
            // InternalMusicDsl.g:2876:2: ( rule__Repetition__TypeAssignment_2 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=20 && LA29_0<=21)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMusicDsl.g:2876:3: rule__Repetition__TypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Repetition__TypeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRepetitionAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repetition__Group__2__Impl"


    // $ANTLR start "rule__Note__Group__0"
    // InternalMusicDsl.g:2885:1: rule__Note__Group__0 : rule__Note__Group__0__Impl rule__Note__Group__1 ;
    public final void rule__Note__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2889:1: ( rule__Note__Group__0__Impl rule__Note__Group__1 )
            // InternalMusicDsl.g:2890:2: rule__Note__Group__0__Impl rule__Note__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Note__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__0"


    // $ANTLR start "rule__Note__Group__0__Impl"
    // InternalMusicDsl.g:2897:1: rule__Note__Group__0__Impl : ( () ) ;
    public final void rule__Note__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2901:1: ( ( () ) )
            // InternalMusicDsl.g:2902:1: ( () )
            {
            // InternalMusicDsl.g:2902:1: ( () )
            // InternalMusicDsl.g:2903:2: ()
            {
             before(grammarAccess.getNoteAccess().getNoteAction_0()); 
            // InternalMusicDsl.g:2904:2: ()
            // InternalMusicDsl.g:2904:3: 
            {
            }

             after(grammarAccess.getNoteAccess().getNoteAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__0__Impl"


    // $ANTLR start "rule__Note__Group__1"
    // InternalMusicDsl.g:2912:1: rule__Note__Group__1 : rule__Note__Group__1__Impl rule__Note__Group__2 ;
    public final void rule__Note__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2916:1: ( rule__Note__Group__1__Impl rule__Note__Group__2 )
            // InternalMusicDsl.g:2917:2: rule__Note__Group__1__Impl rule__Note__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Note__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__1"


    // $ANTLR start "rule__Note__Group__1__Impl"
    // InternalMusicDsl.g:2924:1: rule__Note__Group__1__Impl : ( 'note' ) ;
    public final void rule__Note__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2928:1: ( ( 'note' ) )
            // InternalMusicDsl.g:2929:1: ( 'note' )
            {
            // InternalMusicDsl.g:2929:1: ( 'note' )
            // InternalMusicDsl.g:2930:2: 'note'
            {
             before(grammarAccess.getNoteAccess().getNoteKeyword_1()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getNoteAccess().getNoteKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__1__Impl"


    // $ANTLR start "rule__Note__Group__2"
    // InternalMusicDsl.g:2939:1: rule__Note__Group__2 : rule__Note__Group__2__Impl rule__Note__Group__3 ;
    public final void rule__Note__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2943:1: ( rule__Note__Group__2__Impl rule__Note__Group__3 )
            // InternalMusicDsl.g:2944:2: rule__Note__Group__2__Impl rule__Note__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Note__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__2"


    // $ANTLR start "rule__Note__Group__2__Impl"
    // InternalMusicDsl.g:2951:1: rule__Note__Group__2__Impl : ( ( rule__Note__NameAssignment_2 ) ) ;
    public final void rule__Note__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2955:1: ( ( ( rule__Note__NameAssignment_2 ) ) )
            // InternalMusicDsl.g:2956:1: ( ( rule__Note__NameAssignment_2 ) )
            {
            // InternalMusicDsl.g:2956:1: ( ( rule__Note__NameAssignment_2 ) )
            // InternalMusicDsl.g:2957:2: ( rule__Note__NameAssignment_2 )
            {
             before(grammarAccess.getNoteAccess().getNameAssignment_2()); 
            // InternalMusicDsl.g:2958:2: ( rule__Note__NameAssignment_2 )
            // InternalMusicDsl.g:2958:3: rule__Note__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Note__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__2__Impl"


    // $ANTLR start "rule__Note__Group__3"
    // InternalMusicDsl.g:2966:1: rule__Note__Group__3 : rule__Note__Group__3__Impl rule__Note__Group__4 ;
    public final void rule__Note__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2970:1: ( rule__Note__Group__3__Impl rule__Note__Group__4 )
            // InternalMusicDsl.g:2971:2: rule__Note__Group__3__Impl rule__Note__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__Note__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__3"


    // $ANTLR start "rule__Note__Group__3__Impl"
    // InternalMusicDsl.g:2978:1: rule__Note__Group__3__Impl : ( ':' ) ;
    public final void rule__Note__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2982:1: ( ( ':' ) )
            // InternalMusicDsl.g:2983:1: ( ':' )
            {
            // InternalMusicDsl.g:2983:1: ( ':' )
            // InternalMusicDsl.g:2984:2: ':'
            {
             before(grammarAccess.getNoteAccess().getColonKeyword_3()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getNoteAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__3__Impl"


    // $ANTLR start "rule__Note__Group__4"
    // InternalMusicDsl.g:2993:1: rule__Note__Group__4 : rule__Note__Group__4__Impl rule__Note__Group__5 ;
    public final void rule__Note__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:2997:1: ( rule__Note__Group__4__Impl rule__Note__Group__5 )
            // InternalMusicDsl.g:2998:2: rule__Note__Group__4__Impl rule__Note__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__Note__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__4"


    // $ANTLR start "rule__Note__Group__4__Impl"
    // InternalMusicDsl.g:3005:1: rule__Note__Group__4__Impl : ( ( rule__Note__Group_4__0 )? ) ;
    public final void rule__Note__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3009:1: ( ( ( rule__Note__Group_4__0 )? ) )
            // InternalMusicDsl.g:3010:1: ( ( rule__Note__Group_4__0 )? )
            {
            // InternalMusicDsl.g:3010:1: ( ( rule__Note__Group_4__0 )? )
            // InternalMusicDsl.g:3011:2: ( rule__Note__Group_4__0 )?
            {
             before(grammarAccess.getNoteAccess().getGroup_4()); 
            // InternalMusicDsl.g:3012:2: ( rule__Note__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==69) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMusicDsl.g:3012:3: rule__Note__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Note__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNoteAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__4__Impl"


    // $ANTLR start "rule__Note__Group__5"
    // InternalMusicDsl.g:3020:1: rule__Note__Group__5 : rule__Note__Group__5__Impl rule__Note__Group__6 ;
    public final void rule__Note__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3024:1: ( rule__Note__Group__5__Impl rule__Note__Group__6 )
            // InternalMusicDsl.g:3025:2: rule__Note__Group__5__Impl rule__Note__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__Note__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__5"


    // $ANTLR start "rule__Note__Group__5__Impl"
    // InternalMusicDsl.g:3032:1: rule__Note__Group__5__Impl : ( ( rule__Note__Group_5__0 )? ) ;
    public final void rule__Note__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3036:1: ( ( ( rule__Note__Group_5__0 )? ) )
            // InternalMusicDsl.g:3037:1: ( ( rule__Note__Group_5__0 )? )
            {
            // InternalMusicDsl.g:3037:1: ( ( rule__Note__Group_5__0 )? )
            // InternalMusicDsl.g:3038:2: ( rule__Note__Group_5__0 )?
            {
             before(grammarAccess.getNoteAccess().getGroup_5()); 
            // InternalMusicDsl.g:3039:2: ( rule__Note__Group_5__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==70) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMusicDsl.g:3039:3: rule__Note__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Note__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNoteAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__5__Impl"


    // $ANTLR start "rule__Note__Group__6"
    // InternalMusicDsl.g:3047:1: rule__Note__Group__6 : rule__Note__Group__6__Impl rule__Note__Group__7 ;
    public final void rule__Note__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3051:1: ( rule__Note__Group__6__Impl rule__Note__Group__7 )
            // InternalMusicDsl.g:3052:2: rule__Note__Group__6__Impl rule__Note__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__Note__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__6"


    // $ANTLR start "rule__Note__Group__6__Impl"
    // InternalMusicDsl.g:3059:1: rule__Note__Group__6__Impl : ( ( rule__Note__Group_6__0 )? ) ;
    public final void rule__Note__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3063:1: ( ( ( rule__Note__Group_6__0 )? ) )
            // InternalMusicDsl.g:3064:1: ( ( rule__Note__Group_6__0 )? )
            {
            // InternalMusicDsl.g:3064:1: ( ( rule__Note__Group_6__0 )? )
            // InternalMusicDsl.g:3065:2: ( rule__Note__Group_6__0 )?
            {
             before(grammarAccess.getNoteAccess().getGroup_6()); 
            // InternalMusicDsl.g:3066:2: ( rule__Note__Group_6__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==71) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMusicDsl.g:3066:3: rule__Note__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Note__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNoteAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__6__Impl"


    // $ANTLR start "rule__Note__Group__7"
    // InternalMusicDsl.g:3074:1: rule__Note__Group__7 : rule__Note__Group__7__Impl rule__Note__Group__8 ;
    public final void rule__Note__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3078:1: ( rule__Note__Group__7__Impl rule__Note__Group__8 )
            // InternalMusicDsl.g:3079:2: rule__Note__Group__7__Impl rule__Note__Group__8
            {
            pushFollow(FOLLOW_27);
            rule__Note__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__7"


    // $ANTLR start "rule__Note__Group__7__Impl"
    // InternalMusicDsl.g:3086:1: rule__Note__Group__7__Impl : ( ( rule__Note__Group_7__0 )? ) ;
    public final void rule__Note__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3090:1: ( ( ( rule__Note__Group_7__0 )? ) )
            // InternalMusicDsl.g:3091:1: ( ( rule__Note__Group_7__0 )? )
            {
            // InternalMusicDsl.g:3091:1: ( ( rule__Note__Group_7__0 )? )
            // InternalMusicDsl.g:3092:2: ( rule__Note__Group_7__0 )?
            {
             before(grammarAccess.getNoteAccess().getGroup_7()); 
            // InternalMusicDsl.g:3093:2: ( rule__Note__Group_7__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==72) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMusicDsl.g:3093:3: rule__Note__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Note__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNoteAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__7__Impl"


    // $ANTLR start "rule__Note__Group__8"
    // InternalMusicDsl.g:3101:1: rule__Note__Group__8 : rule__Note__Group__8__Impl rule__Note__Group__9 ;
    public final void rule__Note__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3105:1: ( rule__Note__Group__8__Impl rule__Note__Group__9 )
            // InternalMusicDsl.g:3106:2: rule__Note__Group__8__Impl rule__Note__Group__9
            {
            pushFollow(FOLLOW_27);
            rule__Note__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__8"


    // $ANTLR start "rule__Note__Group__8__Impl"
    // InternalMusicDsl.g:3113:1: rule__Note__Group__8__Impl : ( ( rule__Note__Group_8__0 )? ) ;
    public final void rule__Note__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3117:1: ( ( ( rule__Note__Group_8__0 )? ) )
            // InternalMusicDsl.g:3118:1: ( ( rule__Note__Group_8__0 )? )
            {
            // InternalMusicDsl.g:3118:1: ( ( rule__Note__Group_8__0 )? )
            // InternalMusicDsl.g:3119:2: ( rule__Note__Group_8__0 )?
            {
             before(grammarAccess.getNoteAccess().getGroup_8()); 
            // InternalMusicDsl.g:3120:2: ( rule__Note__Group_8__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==73) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMusicDsl.g:3120:3: rule__Note__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Note__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNoteAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__8__Impl"


    // $ANTLR start "rule__Note__Group__9"
    // InternalMusicDsl.g:3128:1: rule__Note__Group__9 : rule__Note__Group__9__Impl rule__Note__Group__10 ;
    public final void rule__Note__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3132:1: ( rule__Note__Group__9__Impl rule__Note__Group__10 )
            // InternalMusicDsl.g:3133:2: rule__Note__Group__9__Impl rule__Note__Group__10
            {
            pushFollow(FOLLOW_27);
            rule__Note__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__9"


    // $ANTLR start "rule__Note__Group__9__Impl"
    // InternalMusicDsl.g:3140:1: rule__Note__Group__9__Impl : ( ( rule__Note__Group_9__0 )? ) ;
    public final void rule__Note__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3144:1: ( ( ( rule__Note__Group_9__0 )? ) )
            // InternalMusicDsl.g:3145:1: ( ( rule__Note__Group_9__0 )? )
            {
            // InternalMusicDsl.g:3145:1: ( ( rule__Note__Group_9__0 )? )
            // InternalMusicDsl.g:3146:2: ( rule__Note__Group_9__0 )?
            {
             before(grammarAccess.getNoteAccess().getGroup_9()); 
            // InternalMusicDsl.g:3147:2: ( rule__Note__Group_9__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==74) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMusicDsl.g:3147:3: rule__Note__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Note__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNoteAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__9__Impl"


    // $ANTLR start "rule__Note__Group__10"
    // InternalMusicDsl.g:3155:1: rule__Note__Group__10 : rule__Note__Group__10__Impl rule__Note__Group__11 ;
    public final void rule__Note__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3159:1: ( rule__Note__Group__10__Impl rule__Note__Group__11 )
            // InternalMusicDsl.g:3160:2: rule__Note__Group__10__Impl rule__Note__Group__11
            {
            pushFollow(FOLLOW_27);
            rule__Note__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__10"


    // $ANTLR start "rule__Note__Group__10__Impl"
    // InternalMusicDsl.g:3167:1: rule__Note__Group__10__Impl : ( ( rule__Note__Group_10__0 )? ) ;
    public final void rule__Note__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3171:1: ( ( ( rule__Note__Group_10__0 )? ) )
            // InternalMusicDsl.g:3172:1: ( ( rule__Note__Group_10__0 )? )
            {
            // InternalMusicDsl.g:3172:1: ( ( rule__Note__Group_10__0 )? )
            // InternalMusicDsl.g:3173:2: ( rule__Note__Group_10__0 )?
            {
             before(grammarAccess.getNoteAccess().getGroup_10()); 
            // InternalMusicDsl.g:3174:2: ( rule__Note__Group_10__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==75) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMusicDsl.g:3174:3: rule__Note__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Note__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNoteAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__10__Impl"


    // $ANTLR start "rule__Note__Group__11"
    // InternalMusicDsl.g:3182:1: rule__Note__Group__11 : rule__Note__Group__11__Impl rule__Note__Group__12 ;
    public final void rule__Note__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3186:1: ( rule__Note__Group__11__Impl rule__Note__Group__12 )
            // InternalMusicDsl.g:3187:2: rule__Note__Group__11__Impl rule__Note__Group__12
            {
            pushFollow(FOLLOW_27);
            rule__Note__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__11"


    // $ANTLR start "rule__Note__Group__11__Impl"
    // InternalMusicDsl.g:3194:1: rule__Note__Group__11__Impl : ( ( rule__Note__FermataAssignment_11 )? ) ;
    public final void rule__Note__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3198:1: ( ( ( rule__Note__FermataAssignment_11 )? ) )
            // InternalMusicDsl.g:3199:1: ( ( rule__Note__FermataAssignment_11 )? )
            {
            // InternalMusicDsl.g:3199:1: ( ( rule__Note__FermataAssignment_11 )? )
            // InternalMusicDsl.g:3200:2: ( rule__Note__FermataAssignment_11 )?
            {
             before(grammarAccess.getNoteAccess().getFermataAssignment_11()); 
            // InternalMusicDsl.g:3201:2: ( rule__Note__FermataAssignment_11 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==80) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMusicDsl.g:3201:3: rule__Note__FermataAssignment_11
                    {
                    pushFollow(FOLLOW_2);
                    rule__Note__FermataAssignment_11();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNoteAccess().getFermataAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__11__Impl"


    // $ANTLR start "rule__Note__Group__12"
    // InternalMusicDsl.g:3209:1: rule__Note__Group__12 : rule__Note__Group__12__Impl rule__Note__Group__13 ;
    public final void rule__Note__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3213:1: ( rule__Note__Group__12__Impl rule__Note__Group__13 )
            // InternalMusicDsl.g:3214:2: rule__Note__Group__12__Impl rule__Note__Group__13
            {
            pushFollow(FOLLOW_27);
            rule__Note__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__12"


    // $ANTLR start "rule__Note__Group__12__Impl"
    // InternalMusicDsl.g:3221:1: rule__Note__Group__12__Impl : ( ( rule__Note__DotAssignment_12 )? ) ;
    public final void rule__Note__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3225:1: ( ( ( rule__Note__DotAssignment_12 )? ) )
            // InternalMusicDsl.g:3226:1: ( ( rule__Note__DotAssignment_12 )? )
            {
            // InternalMusicDsl.g:3226:1: ( ( rule__Note__DotAssignment_12 )? )
            // InternalMusicDsl.g:3227:2: ( rule__Note__DotAssignment_12 )?
            {
             before(grammarAccess.getNoteAccess().getDotAssignment_12()); 
            // InternalMusicDsl.g:3228:2: ( rule__Note__DotAssignment_12 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==81) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMusicDsl.g:3228:3: rule__Note__DotAssignment_12
                    {
                    pushFollow(FOLLOW_2);
                    rule__Note__DotAssignment_12();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNoteAccess().getDotAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__12__Impl"


    // $ANTLR start "rule__Note__Group__13"
    // InternalMusicDsl.g:3236:1: rule__Note__Group__13 : rule__Note__Group__13__Impl rule__Note__Group__14 ;
    public final void rule__Note__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3240:1: ( rule__Note__Group__13__Impl rule__Note__Group__14 )
            // InternalMusicDsl.g:3241:2: rule__Note__Group__13__Impl rule__Note__Group__14
            {
            pushFollow(FOLLOW_27);
            rule__Note__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__13"


    // $ANTLR start "rule__Note__Group__13__Impl"
    // InternalMusicDsl.g:3248:1: rule__Note__Group__13__Impl : ( ( rule__Note__ChordAssignment_13 )? ) ;
    public final void rule__Note__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3252:1: ( ( ( rule__Note__ChordAssignment_13 )? ) )
            // InternalMusicDsl.g:3253:1: ( ( rule__Note__ChordAssignment_13 )? )
            {
            // InternalMusicDsl.g:3253:1: ( ( rule__Note__ChordAssignment_13 )? )
            // InternalMusicDsl.g:3254:2: ( rule__Note__ChordAssignment_13 )?
            {
             before(grammarAccess.getNoteAccess().getChordAssignment_13()); 
            // InternalMusicDsl.g:3255:2: ( rule__Note__ChordAssignment_13 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==82) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMusicDsl.g:3255:3: rule__Note__ChordAssignment_13
                    {
                    pushFollow(FOLLOW_2);
                    rule__Note__ChordAssignment_13();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNoteAccess().getChordAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__13__Impl"


    // $ANTLR start "rule__Note__Group__14"
    // InternalMusicDsl.g:3263:1: rule__Note__Group__14 : rule__Note__Group__14__Impl ;
    public final void rule__Note__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3267:1: ( rule__Note__Group__14__Impl )
            // InternalMusicDsl.g:3268:2: rule__Note__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Note__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__14"


    // $ANTLR start "rule__Note__Group__14__Impl"
    // InternalMusicDsl.g:3274:1: rule__Note__Group__14__Impl : ( ( rule__Note__Group_14__0 )? ) ;
    public final void rule__Note__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3278:1: ( ( ( rule__Note__Group_14__0 )? ) )
            // InternalMusicDsl.g:3279:1: ( ( rule__Note__Group_14__0 )? )
            {
            // InternalMusicDsl.g:3279:1: ( ( rule__Note__Group_14__0 )? )
            // InternalMusicDsl.g:3280:2: ( rule__Note__Group_14__0 )?
            {
             before(grammarAccess.getNoteAccess().getGroup_14()); 
            // InternalMusicDsl.g:3281:2: ( rule__Note__Group_14__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==76) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMusicDsl.g:3281:3: rule__Note__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Note__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNoteAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__14__Impl"


    // $ANTLR start "rule__Note__Group_4__0"
    // InternalMusicDsl.g:3290:1: rule__Note__Group_4__0 : rule__Note__Group_4__0__Impl rule__Note__Group_4__1 ;
    public final void rule__Note__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3294:1: ( rule__Note__Group_4__0__Impl rule__Note__Group_4__1 )
            // InternalMusicDsl.g:3295:2: rule__Note__Group_4__0__Impl rule__Note__Group_4__1
            {
            pushFollow(FOLLOW_23);
            rule__Note__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_4__0"


    // $ANTLR start "rule__Note__Group_4__0__Impl"
    // InternalMusicDsl.g:3302:1: rule__Note__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__Note__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3306:1: ( ( 'type' ) )
            // InternalMusicDsl.g:3307:1: ( 'type' )
            {
            // InternalMusicDsl.g:3307:1: ( 'type' )
            // InternalMusicDsl.g:3308:2: 'type'
            {
             before(grammarAccess.getNoteAccess().getTypeKeyword_4_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getNoteAccess().getTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_4__0__Impl"


    // $ANTLR start "rule__Note__Group_4__1"
    // InternalMusicDsl.g:3317:1: rule__Note__Group_4__1 : rule__Note__Group_4__1__Impl ;
    public final void rule__Note__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3321:1: ( rule__Note__Group_4__1__Impl )
            // InternalMusicDsl.g:3322:2: rule__Note__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Note__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_4__1"


    // $ANTLR start "rule__Note__Group_4__1__Impl"
    // InternalMusicDsl.g:3328:1: rule__Note__Group_4__1__Impl : ( ( rule__Note__TypeAssignment_4_1 ) ) ;
    public final void rule__Note__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3332:1: ( ( ( rule__Note__TypeAssignment_4_1 ) ) )
            // InternalMusicDsl.g:3333:1: ( ( rule__Note__TypeAssignment_4_1 ) )
            {
            // InternalMusicDsl.g:3333:1: ( ( rule__Note__TypeAssignment_4_1 ) )
            // InternalMusicDsl.g:3334:2: ( rule__Note__TypeAssignment_4_1 )
            {
             before(grammarAccess.getNoteAccess().getTypeAssignment_4_1()); 
            // InternalMusicDsl.g:3335:2: ( rule__Note__TypeAssignment_4_1 )
            // InternalMusicDsl.g:3335:3: rule__Note__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Note__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_4__1__Impl"


    // $ANTLR start "rule__Note__Group_5__0"
    // InternalMusicDsl.g:3344:1: rule__Note__Group_5__0 : rule__Note__Group_5__0__Impl rule__Note__Group_5__1 ;
    public final void rule__Note__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3348:1: ( rule__Note__Group_5__0__Impl rule__Note__Group_5__1 )
            // InternalMusicDsl.g:3349:2: rule__Note__Group_5__0__Impl rule__Note__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__Note__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_5__0"


    // $ANTLR start "rule__Note__Group_5__0__Impl"
    // InternalMusicDsl.g:3356:1: rule__Note__Group_5__0__Impl : ( 'duration' ) ;
    public final void rule__Note__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3360:1: ( ( 'duration' ) )
            // InternalMusicDsl.g:3361:1: ( 'duration' )
            {
            // InternalMusicDsl.g:3361:1: ( 'duration' )
            // InternalMusicDsl.g:3362:2: 'duration'
            {
             before(grammarAccess.getNoteAccess().getDurationKeyword_5_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getNoteAccess().getDurationKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_5__0__Impl"


    // $ANTLR start "rule__Note__Group_5__1"
    // InternalMusicDsl.g:3371:1: rule__Note__Group_5__1 : rule__Note__Group_5__1__Impl ;
    public final void rule__Note__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3375:1: ( rule__Note__Group_5__1__Impl )
            // InternalMusicDsl.g:3376:2: rule__Note__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Note__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_5__1"


    // $ANTLR start "rule__Note__Group_5__1__Impl"
    // InternalMusicDsl.g:3382:1: rule__Note__Group_5__1__Impl : ( ( rule__Note__DurationAssignment_5_1 ) ) ;
    public final void rule__Note__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3386:1: ( ( ( rule__Note__DurationAssignment_5_1 ) ) )
            // InternalMusicDsl.g:3387:1: ( ( rule__Note__DurationAssignment_5_1 ) )
            {
            // InternalMusicDsl.g:3387:1: ( ( rule__Note__DurationAssignment_5_1 ) )
            // InternalMusicDsl.g:3388:2: ( rule__Note__DurationAssignment_5_1 )
            {
             before(grammarAccess.getNoteAccess().getDurationAssignment_5_1()); 
            // InternalMusicDsl.g:3389:2: ( rule__Note__DurationAssignment_5_1 )
            // InternalMusicDsl.g:3389:3: rule__Note__DurationAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Note__DurationAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getDurationAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_5__1__Impl"


    // $ANTLR start "rule__Note__Group_6__0"
    // InternalMusicDsl.g:3398:1: rule__Note__Group_6__0 : rule__Note__Group_6__0__Impl rule__Note__Group_6__1 ;
    public final void rule__Note__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3402:1: ( rule__Note__Group_6__0__Impl rule__Note__Group_6__1 )
            // InternalMusicDsl.g:3403:2: rule__Note__Group_6__0__Impl rule__Note__Group_6__1
            {
            pushFollow(FOLLOW_9);
            rule__Note__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_6__0"


    // $ANTLR start "rule__Note__Group_6__0__Impl"
    // InternalMusicDsl.g:3410:1: rule__Note__Group_6__0__Impl : ( 'octave' ) ;
    public final void rule__Note__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3414:1: ( ( 'octave' ) )
            // InternalMusicDsl.g:3415:1: ( 'octave' )
            {
            // InternalMusicDsl.g:3415:1: ( 'octave' )
            // InternalMusicDsl.g:3416:2: 'octave'
            {
             before(grammarAccess.getNoteAccess().getOctaveKeyword_6_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getNoteAccess().getOctaveKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_6__0__Impl"


    // $ANTLR start "rule__Note__Group_6__1"
    // InternalMusicDsl.g:3425:1: rule__Note__Group_6__1 : rule__Note__Group_6__1__Impl ;
    public final void rule__Note__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3429:1: ( rule__Note__Group_6__1__Impl )
            // InternalMusicDsl.g:3430:2: rule__Note__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Note__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_6__1"


    // $ANTLR start "rule__Note__Group_6__1__Impl"
    // InternalMusicDsl.g:3436:1: rule__Note__Group_6__1__Impl : ( ( rule__Note__OctaveAssignment_6_1 ) ) ;
    public final void rule__Note__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3440:1: ( ( ( rule__Note__OctaveAssignment_6_1 ) ) )
            // InternalMusicDsl.g:3441:1: ( ( rule__Note__OctaveAssignment_6_1 ) )
            {
            // InternalMusicDsl.g:3441:1: ( ( rule__Note__OctaveAssignment_6_1 ) )
            // InternalMusicDsl.g:3442:2: ( rule__Note__OctaveAssignment_6_1 )
            {
             before(grammarAccess.getNoteAccess().getOctaveAssignment_6_1()); 
            // InternalMusicDsl.g:3443:2: ( rule__Note__OctaveAssignment_6_1 )
            // InternalMusicDsl.g:3443:3: rule__Note__OctaveAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Note__OctaveAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getOctaveAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_6__1__Impl"


    // $ANTLR start "rule__Note__Group_7__0"
    // InternalMusicDsl.g:3452:1: rule__Note__Group_7__0 : rule__Note__Group_7__0__Impl rule__Note__Group_7__1 ;
    public final void rule__Note__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3456:1: ( rule__Note__Group_7__0__Impl rule__Note__Group_7__1 )
            // InternalMusicDsl.g:3457:2: rule__Note__Group_7__0__Impl rule__Note__Group_7__1
            {
            pushFollow(FOLLOW_9);
            rule__Note__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_7__0"


    // $ANTLR start "rule__Note__Group_7__0__Impl"
    // InternalMusicDsl.g:3464:1: rule__Note__Group_7__0__Impl : ( 'voice' ) ;
    public final void rule__Note__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3468:1: ( ( 'voice' ) )
            // InternalMusicDsl.g:3469:1: ( 'voice' )
            {
            // InternalMusicDsl.g:3469:1: ( 'voice' )
            // InternalMusicDsl.g:3470:2: 'voice'
            {
             before(grammarAccess.getNoteAccess().getVoiceKeyword_7_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getNoteAccess().getVoiceKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_7__0__Impl"


    // $ANTLR start "rule__Note__Group_7__1"
    // InternalMusicDsl.g:3479:1: rule__Note__Group_7__1 : rule__Note__Group_7__1__Impl ;
    public final void rule__Note__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3483:1: ( rule__Note__Group_7__1__Impl )
            // InternalMusicDsl.g:3484:2: rule__Note__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Note__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_7__1"


    // $ANTLR start "rule__Note__Group_7__1__Impl"
    // InternalMusicDsl.g:3490:1: rule__Note__Group_7__1__Impl : ( ( rule__Note__VoiceAssignment_7_1 ) ) ;
    public final void rule__Note__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3494:1: ( ( ( rule__Note__VoiceAssignment_7_1 ) ) )
            // InternalMusicDsl.g:3495:1: ( ( rule__Note__VoiceAssignment_7_1 ) )
            {
            // InternalMusicDsl.g:3495:1: ( ( rule__Note__VoiceAssignment_7_1 ) )
            // InternalMusicDsl.g:3496:2: ( rule__Note__VoiceAssignment_7_1 )
            {
             before(grammarAccess.getNoteAccess().getVoiceAssignment_7_1()); 
            // InternalMusicDsl.g:3497:2: ( rule__Note__VoiceAssignment_7_1 )
            // InternalMusicDsl.g:3497:3: rule__Note__VoiceAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Note__VoiceAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getVoiceAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_7__1__Impl"


    // $ANTLR start "rule__Note__Group_8__0"
    // InternalMusicDsl.g:3506:1: rule__Note__Group_8__0 : rule__Note__Group_8__0__Impl rule__Note__Group_8__1 ;
    public final void rule__Note__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3510:1: ( rule__Note__Group_8__0__Impl rule__Note__Group_8__1 )
            // InternalMusicDsl.g:3511:2: rule__Note__Group_8__0__Impl rule__Note__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__Note__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_8__0"


    // $ANTLR start "rule__Note__Group_8__0__Impl"
    // InternalMusicDsl.g:3518:1: rule__Note__Group_8__0__Impl : ( 'dynamic' ) ;
    public final void rule__Note__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3522:1: ( ( 'dynamic' ) )
            // InternalMusicDsl.g:3523:1: ( 'dynamic' )
            {
            // InternalMusicDsl.g:3523:1: ( 'dynamic' )
            // InternalMusicDsl.g:3524:2: 'dynamic'
            {
             before(grammarAccess.getNoteAccess().getDynamicKeyword_8_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getNoteAccess().getDynamicKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_8__0__Impl"


    // $ANTLR start "rule__Note__Group_8__1"
    // InternalMusicDsl.g:3533:1: rule__Note__Group_8__1 : rule__Note__Group_8__1__Impl ;
    public final void rule__Note__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3537:1: ( rule__Note__Group_8__1__Impl )
            // InternalMusicDsl.g:3538:2: rule__Note__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Note__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_8__1"


    // $ANTLR start "rule__Note__Group_8__1__Impl"
    // InternalMusicDsl.g:3544:1: rule__Note__Group_8__1__Impl : ( ( rule__Note__DynamicAssignment_8_1 ) ) ;
    public final void rule__Note__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3548:1: ( ( ( rule__Note__DynamicAssignment_8_1 ) ) )
            // InternalMusicDsl.g:3549:1: ( ( rule__Note__DynamicAssignment_8_1 ) )
            {
            // InternalMusicDsl.g:3549:1: ( ( rule__Note__DynamicAssignment_8_1 ) )
            // InternalMusicDsl.g:3550:2: ( rule__Note__DynamicAssignment_8_1 )
            {
             before(grammarAccess.getNoteAccess().getDynamicAssignment_8_1()); 
            // InternalMusicDsl.g:3551:2: ( rule__Note__DynamicAssignment_8_1 )
            // InternalMusicDsl.g:3551:3: rule__Note__DynamicAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Note__DynamicAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getDynamicAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_8__1__Impl"


    // $ANTLR start "rule__Note__Group_9__0"
    // InternalMusicDsl.g:3560:1: rule__Note__Group_9__0 : rule__Note__Group_9__0__Impl rule__Note__Group_9__1 ;
    public final void rule__Note__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3564:1: ( rule__Note__Group_9__0__Impl rule__Note__Group_9__1 )
            // InternalMusicDsl.g:3565:2: rule__Note__Group_9__0__Impl rule__Note__Group_9__1
            {
            pushFollow(FOLLOW_28);
            rule__Note__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_9__0"


    // $ANTLR start "rule__Note__Group_9__0__Impl"
    // InternalMusicDsl.g:3572:1: rule__Note__Group_9__0__Impl : ( 'accidental' ) ;
    public final void rule__Note__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3576:1: ( ( 'accidental' ) )
            // InternalMusicDsl.g:3577:1: ( 'accidental' )
            {
            // InternalMusicDsl.g:3577:1: ( 'accidental' )
            // InternalMusicDsl.g:3578:2: 'accidental'
            {
             before(grammarAccess.getNoteAccess().getAccidentalKeyword_9_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getNoteAccess().getAccidentalKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_9__0__Impl"


    // $ANTLR start "rule__Note__Group_9__1"
    // InternalMusicDsl.g:3587:1: rule__Note__Group_9__1 : rule__Note__Group_9__1__Impl ;
    public final void rule__Note__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3591:1: ( rule__Note__Group_9__1__Impl )
            // InternalMusicDsl.g:3592:2: rule__Note__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Note__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_9__1"


    // $ANTLR start "rule__Note__Group_9__1__Impl"
    // InternalMusicDsl.g:3598:1: rule__Note__Group_9__1__Impl : ( ( rule__Note__AccidentalAssignment_9_1 ) ) ;
    public final void rule__Note__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3602:1: ( ( ( rule__Note__AccidentalAssignment_9_1 ) ) )
            // InternalMusicDsl.g:3603:1: ( ( rule__Note__AccidentalAssignment_9_1 ) )
            {
            // InternalMusicDsl.g:3603:1: ( ( rule__Note__AccidentalAssignment_9_1 ) )
            // InternalMusicDsl.g:3604:2: ( rule__Note__AccidentalAssignment_9_1 )
            {
             before(grammarAccess.getNoteAccess().getAccidentalAssignment_9_1()); 
            // InternalMusicDsl.g:3605:2: ( rule__Note__AccidentalAssignment_9_1 )
            // InternalMusicDsl.g:3605:3: rule__Note__AccidentalAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Note__AccidentalAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getAccidentalAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_9__1__Impl"


    // $ANTLR start "rule__Note__Group_10__0"
    // InternalMusicDsl.g:3614:1: rule__Note__Group_10__0 : rule__Note__Group_10__0__Impl rule__Note__Group_10__1 ;
    public final void rule__Note__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3618:1: ( rule__Note__Group_10__0__Impl rule__Note__Group_10__1 )
            // InternalMusicDsl.g:3619:2: rule__Note__Group_10__0__Impl rule__Note__Group_10__1
            {
            pushFollow(FOLLOW_4);
            rule__Note__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_10__0"


    // $ANTLR start "rule__Note__Group_10__0__Impl"
    // InternalMusicDsl.g:3626:1: rule__Note__Group_10__0__Impl : ( 'lyrics' ) ;
    public final void rule__Note__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3630:1: ( ( 'lyrics' ) )
            // InternalMusicDsl.g:3631:1: ( 'lyrics' )
            {
            // InternalMusicDsl.g:3631:1: ( 'lyrics' )
            // InternalMusicDsl.g:3632:2: 'lyrics'
            {
             before(grammarAccess.getNoteAccess().getLyricsKeyword_10_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getNoteAccess().getLyricsKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_10__0__Impl"


    // $ANTLR start "rule__Note__Group_10__1"
    // InternalMusicDsl.g:3641:1: rule__Note__Group_10__1 : rule__Note__Group_10__1__Impl ;
    public final void rule__Note__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3645:1: ( rule__Note__Group_10__1__Impl )
            // InternalMusicDsl.g:3646:2: rule__Note__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Note__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_10__1"


    // $ANTLR start "rule__Note__Group_10__1__Impl"
    // InternalMusicDsl.g:3652:1: rule__Note__Group_10__1__Impl : ( ( rule__Note__LyricsAssignment_10_1 ) ) ;
    public final void rule__Note__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3656:1: ( ( ( rule__Note__LyricsAssignment_10_1 ) ) )
            // InternalMusicDsl.g:3657:1: ( ( rule__Note__LyricsAssignment_10_1 ) )
            {
            // InternalMusicDsl.g:3657:1: ( ( rule__Note__LyricsAssignment_10_1 ) )
            // InternalMusicDsl.g:3658:2: ( rule__Note__LyricsAssignment_10_1 )
            {
             before(grammarAccess.getNoteAccess().getLyricsAssignment_10_1()); 
            // InternalMusicDsl.g:3659:2: ( rule__Note__LyricsAssignment_10_1 )
            // InternalMusicDsl.g:3659:3: rule__Note__LyricsAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Note__LyricsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getLyricsAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_10__1__Impl"


    // $ANTLR start "rule__Note__Group_14__0"
    // InternalMusicDsl.g:3668:1: rule__Note__Group_14__0 : rule__Note__Group_14__0__Impl rule__Note__Group_14__1 ;
    public final void rule__Note__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3672:1: ( rule__Note__Group_14__0__Impl rule__Note__Group_14__1 )
            // InternalMusicDsl.g:3673:2: rule__Note__Group_14__0__Impl rule__Note__Group_14__1
            {
            pushFollow(FOLLOW_15);
            rule__Note__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_14__0"


    // $ANTLR start "rule__Note__Group_14__0__Impl"
    // InternalMusicDsl.g:3680:1: rule__Note__Group_14__0__Impl : ( ( rule__Note__NotationAssignment_14_0 ) ) ;
    public final void rule__Note__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3684:1: ( ( ( rule__Note__NotationAssignment_14_0 ) ) )
            // InternalMusicDsl.g:3685:1: ( ( rule__Note__NotationAssignment_14_0 ) )
            {
            // InternalMusicDsl.g:3685:1: ( ( rule__Note__NotationAssignment_14_0 ) )
            // InternalMusicDsl.g:3686:2: ( rule__Note__NotationAssignment_14_0 )
            {
             before(grammarAccess.getNoteAccess().getNotationAssignment_14_0()); 
            // InternalMusicDsl.g:3687:2: ( rule__Note__NotationAssignment_14_0 )
            // InternalMusicDsl.g:3687:3: rule__Note__NotationAssignment_14_0
            {
            pushFollow(FOLLOW_2);
            rule__Note__NotationAssignment_14_0();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getNotationAssignment_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_14__0__Impl"


    // $ANTLR start "rule__Note__Group_14__1"
    // InternalMusicDsl.g:3695:1: rule__Note__Group_14__1 : rule__Note__Group_14__1__Impl ;
    public final void rule__Note__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3699:1: ( rule__Note__Group_14__1__Impl )
            // InternalMusicDsl.g:3700:2: rule__Note__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Note__Group_14__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_14__1"


    // $ANTLR start "rule__Note__Group_14__1__Impl"
    // InternalMusicDsl.g:3706:1: rule__Note__Group_14__1__Impl : ( ( rule__Note__Group_14_1__0 )* ) ;
    public final void rule__Note__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3710:1: ( ( ( rule__Note__Group_14_1__0 )* ) )
            // InternalMusicDsl.g:3711:1: ( ( rule__Note__Group_14_1__0 )* )
            {
            // InternalMusicDsl.g:3711:1: ( ( rule__Note__Group_14_1__0 )* )
            // InternalMusicDsl.g:3712:2: ( rule__Note__Group_14_1__0 )*
            {
             before(grammarAccess.getNoteAccess().getGroup_14_1()); 
            // InternalMusicDsl.g:3713:2: ( rule__Note__Group_14_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==54) ) {
                    int LA41_2 = input.LA(2);

                    if ( (LA41_2==76) ) {
                        alt41=1;
                    }


                }


                switch (alt41) {
            	case 1 :
            	    // InternalMusicDsl.g:3713:3: rule__Note__Group_14_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Note__Group_14_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getNoteAccess().getGroup_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_14__1__Impl"


    // $ANTLR start "rule__Note__Group_14_1__0"
    // InternalMusicDsl.g:3722:1: rule__Note__Group_14_1__0 : rule__Note__Group_14_1__0__Impl rule__Note__Group_14_1__1 ;
    public final void rule__Note__Group_14_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3726:1: ( rule__Note__Group_14_1__0__Impl rule__Note__Group_14_1__1 )
            // InternalMusicDsl.g:3727:2: rule__Note__Group_14_1__0__Impl rule__Note__Group_14_1__1
            {
            pushFollow(FOLLOW_29);
            rule__Note__Group_14_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group_14_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_14_1__0"


    // $ANTLR start "rule__Note__Group_14_1__0__Impl"
    // InternalMusicDsl.g:3734:1: rule__Note__Group_14_1__0__Impl : ( ',' ) ;
    public final void rule__Note__Group_14_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3738:1: ( ( ',' ) )
            // InternalMusicDsl.g:3739:1: ( ',' )
            {
            // InternalMusicDsl.g:3739:1: ( ',' )
            // InternalMusicDsl.g:3740:2: ','
            {
             before(grammarAccess.getNoteAccess().getCommaKeyword_14_1_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getNoteAccess().getCommaKeyword_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_14_1__0__Impl"


    // $ANTLR start "rule__Note__Group_14_1__1"
    // InternalMusicDsl.g:3749:1: rule__Note__Group_14_1__1 : rule__Note__Group_14_1__1__Impl ;
    public final void rule__Note__Group_14_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3753:1: ( rule__Note__Group_14_1__1__Impl )
            // InternalMusicDsl.g:3754:2: rule__Note__Group_14_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Note__Group_14_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_14_1__1"


    // $ANTLR start "rule__Note__Group_14_1__1__Impl"
    // InternalMusicDsl.g:3760:1: rule__Note__Group_14_1__1__Impl : ( ( rule__Note__NotationAssignment_14_1_1 ) ) ;
    public final void rule__Note__Group_14_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3764:1: ( ( ( rule__Note__NotationAssignment_14_1_1 ) ) )
            // InternalMusicDsl.g:3765:1: ( ( rule__Note__NotationAssignment_14_1_1 ) )
            {
            // InternalMusicDsl.g:3765:1: ( ( rule__Note__NotationAssignment_14_1_1 ) )
            // InternalMusicDsl.g:3766:2: ( rule__Note__NotationAssignment_14_1_1 )
            {
             before(grammarAccess.getNoteAccess().getNotationAssignment_14_1_1()); 
            // InternalMusicDsl.g:3767:2: ( rule__Note__NotationAssignment_14_1_1 )
            // InternalMusicDsl.g:3767:3: rule__Note__NotationAssignment_14_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Note__NotationAssignment_14_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getNotationAssignment_14_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_14_1__1__Impl"


    // $ANTLR start "rule__Notation__Group__0"
    // InternalMusicDsl.g:3776:1: rule__Notation__Group__0 : rule__Notation__Group__0__Impl rule__Notation__Group__1 ;
    public final void rule__Notation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3780:1: ( rule__Notation__Group__0__Impl rule__Notation__Group__1 )
            // InternalMusicDsl.g:3781:2: rule__Notation__Group__0__Impl rule__Notation__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Notation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Notation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notation__Group__0"


    // $ANTLR start "rule__Notation__Group__0__Impl"
    // InternalMusicDsl.g:3788:1: rule__Notation__Group__0__Impl : ( () ) ;
    public final void rule__Notation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3792:1: ( ( () ) )
            // InternalMusicDsl.g:3793:1: ( () )
            {
            // InternalMusicDsl.g:3793:1: ( () )
            // InternalMusicDsl.g:3794:2: ()
            {
             before(grammarAccess.getNotationAccess().getNotationAction_0()); 
            // InternalMusicDsl.g:3795:2: ()
            // InternalMusicDsl.g:3795:3: 
            {
            }

             after(grammarAccess.getNotationAccess().getNotationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notation__Group__0__Impl"


    // $ANTLR start "rule__Notation__Group__1"
    // InternalMusicDsl.g:3803:1: rule__Notation__Group__1 : rule__Notation__Group__1__Impl rule__Notation__Group__2 ;
    public final void rule__Notation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3807:1: ( rule__Notation__Group__1__Impl rule__Notation__Group__2 )
            // InternalMusicDsl.g:3808:2: rule__Notation__Group__1__Impl rule__Notation__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__Notation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Notation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notation__Group__1"


    // $ANTLR start "rule__Notation__Group__1__Impl"
    // InternalMusicDsl.g:3815:1: rule__Notation__Group__1__Impl : ( 'notation:' ) ;
    public final void rule__Notation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3819:1: ( ( 'notation:' ) )
            // InternalMusicDsl.g:3820:1: ( 'notation:' )
            {
            // InternalMusicDsl.g:3820:1: ( 'notation:' )
            // InternalMusicDsl.g:3821:2: 'notation:'
            {
             before(grammarAccess.getNotationAccess().getNotationKeyword_1()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getNotationAccess().getNotationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notation__Group__1__Impl"


    // $ANTLR start "rule__Notation__Group__2"
    // InternalMusicDsl.g:3830:1: rule__Notation__Group__2 : rule__Notation__Group__2__Impl rule__Notation__Group__3 ;
    public final void rule__Notation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3834:1: ( rule__Notation__Group__2__Impl rule__Notation__Group__3 )
            // InternalMusicDsl.g:3835:2: rule__Notation__Group__2__Impl rule__Notation__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Notation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Notation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notation__Group__2"


    // $ANTLR start "rule__Notation__Group__2__Impl"
    // InternalMusicDsl.g:3842:1: rule__Notation__Group__2__Impl : ( ( rule__Notation__Group_2__0 )? ) ;
    public final void rule__Notation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3846:1: ( ( ( rule__Notation__Group_2__0 )? ) )
            // InternalMusicDsl.g:3847:1: ( ( rule__Notation__Group_2__0 )? )
            {
            // InternalMusicDsl.g:3847:1: ( ( rule__Notation__Group_2__0 )? )
            // InternalMusicDsl.g:3848:2: ( rule__Notation__Group_2__0 )?
            {
             before(grammarAccess.getNotationAccess().getGroup_2()); 
            // InternalMusicDsl.g:3849:2: ( rule__Notation__Group_2__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==77) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMusicDsl.g:3849:3: rule__Notation__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Notation__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNotationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notation__Group__2__Impl"


    // $ANTLR start "rule__Notation__Group__3"
    // InternalMusicDsl.g:3857:1: rule__Notation__Group__3 : rule__Notation__Group__3__Impl rule__Notation__Group__4 ;
    public final void rule__Notation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3861:1: ( rule__Notation__Group__3__Impl rule__Notation__Group__4 )
            // InternalMusicDsl.g:3862:2: rule__Notation__Group__3__Impl rule__Notation__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__Notation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Notation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notation__Group__3"


    // $ANTLR start "rule__Notation__Group__3__Impl"
    // InternalMusicDsl.g:3869:1: rule__Notation__Group__3__Impl : ( ( rule__Notation__Group_3__0 )? ) ;
    public final void rule__Notation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3873:1: ( ( ( rule__Notation__Group_3__0 )? ) )
            // InternalMusicDsl.g:3874:1: ( ( rule__Notation__Group_3__0 )? )
            {
            // InternalMusicDsl.g:3874:1: ( ( rule__Notation__Group_3__0 )? )
            // InternalMusicDsl.g:3875:2: ( rule__Notation__Group_3__0 )?
            {
             before(grammarAccess.getNotationAccess().getGroup_3()); 
            // InternalMusicDsl.g:3876:2: ( rule__Notation__Group_3__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==78) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMusicDsl.g:3876:3: rule__Notation__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Notation__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNotationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notation__Group__3__Impl"


    // $ANTLR start "rule__Notation__Group__4"
    // InternalMusicDsl.g:3884:1: rule__Notation__Group__4 : rule__Notation__Group__4__Impl ;
    public final void rule__Notation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3888:1: ( rule__Notation__Group__4__Impl )
            // InternalMusicDsl.g:3889:2: rule__Notation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Notation__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notation__Group__4"


    // $ANTLR start "rule__Notation__Group__4__Impl"
    // InternalMusicDsl.g:3895:1: rule__Notation__Group__4__Impl : ( ( rule__Notation__Group_4__0 )? ) ;
    public final void rule__Notation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3899:1: ( ( ( rule__Notation__Group_4__0 )? ) )
            // InternalMusicDsl.g:3900:1: ( ( rule__Notation__Group_4__0 )? )
            {
            // InternalMusicDsl.g:3900:1: ( ( rule__Notation__Group_4__0 )? )
            // InternalMusicDsl.g:3901:2: ( rule__Notation__Group_4__0 )?
            {
             before(grammarAccess.getNotationAccess().getGroup_4()); 
            // InternalMusicDsl.g:3902:2: ( rule__Notation__Group_4__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==79) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMusicDsl.g:3902:3: rule__Notation__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Notation__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNotationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notation__Group__4__Impl"


    // $ANTLR start "rule__Notation__Group_2__0"
    // InternalMusicDsl.g:3911:1: rule__Notation__Group_2__0 : rule__Notation__Group_2__0__Impl rule__Notation__Group_2__1 ;
    public final void rule__Notation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3915:1: ( rule__Notation__Group_2__0__Impl rule__Notation__Group_2__1 )
            // InternalMusicDsl.g:3916:2: rule__Notation__Group_2__0__Impl rule__Notation__Group_2__1
            {
            pushFollow(FOLLOW_31);
            rule__Notation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Notation__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notation__Group_2__0"


    // $ANTLR start "rule__Notation__Group_2__0__Impl"
    // InternalMusicDsl.g:3923:1: rule__Notation__Group_2__0__Impl : ( 'articulation' ) ;
    public final void rule__Notation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3927:1: ( ( 'articulation' ) )
            // InternalMusicDsl.g:3928:1: ( 'articulation' )
            {
            // InternalMusicDsl.g:3928:1: ( 'articulation' )
            // InternalMusicDsl.g:3929:2: 'articulation'
            {
             before(grammarAccess.getNotationAccess().getArticulationKeyword_2_0()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getNotationAccess().getArticulationKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notation__Group_2__0__Impl"


    // $ANTLR start "rule__Notation__Group_2__1"
    // InternalMusicDsl.g:3938:1: rule__Notation__Group_2__1 : rule__Notation__Group_2__1__Impl ;
    public final void rule__Notation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3942:1: ( rule__Notation__Group_2__1__Impl )
            // InternalMusicDsl.g:3943:2: rule__Notation__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Notation__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notation__Group_2__1"


    // $ANTLR start "rule__Notation__Group_2__1__Impl"
    // InternalMusicDsl.g:3949:1: rule__Notation__Group_2__1__Impl : ( ( rule__Notation__ArticulationAssignment_2_1 ) ) ;
    public final void rule__Notation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3953:1: ( ( ( rule__Notation__ArticulationAssignment_2_1 ) ) )
            // InternalMusicDsl.g:3954:1: ( ( rule__Notation__ArticulationAssignment_2_1 ) )
            {
            // InternalMusicDsl.g:3954:1: ( ( rule__Notation__ArticulationAssignment_2_1 ) )
            // InternalMusicDsl.g:3955:2: ( rule__Notation__ArticulationAssignment_2_1 )
            {
             before(grammarAccess.getNotationAccess().getArticulationAssignment_2_1()); 
            // InternalMusicDsl.g:3956:2: ( rule__Notation__ArticulationAssignment_2_1 )
            // InternalMusicDsl.g:3956:3: rule__Notation__ArticulationAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Notation__ArticulationAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNotationAccess().getArticulationAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notation__Group_2__1__Impl"


    // $ANTLR start "rule__Notation__Group_3__0"
    // InternalMusicDsl.g:3965:1: rule__Notation__Group_3__0 : rule__Notation__Group_3__0__Impl rule__Notation__Group_3__1 ;
    public final void rule__Notation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3969:1: ( rule__Notation__Group_3__0__Impl rule__Notation__Group_3__1 )
            // InternalMusicDsl.g:3970:2: rule__Notation__Group_3__0__Impl rule__Notation__Group_3__1
            {
            pushFollow(FOLLOW_32);
            rule__Notation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Notation__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notation__Group_3__0"


    // $ANTLR start "rule__Notation__Group_3__0__Impl"
    // InternalMusicDsl.g:3977:1: rule__Notation__Group_3__0__Impl : ( 'ornament' ) ;
    public final void rule__Notation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3981:1: ( ( 'ornament' ) )
            // InternalMusicDsl.g:3982:1: ( 'ornament' )
            {
            // InternalMusicDsl.g:3982:1: ( 'ornament' )
            // InternalMusicDsl.g:3983:2: 'ornament'
            {
             before(grammarAccess.getNotationAccess().getOrnamentKeyword_3_0()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getNotationAccess().getOrnamentKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notation__Group_3__0__Impl"


    // $ANTLR start "rule__Notation__Group_3__1"
    // InternalMusicDsl.g:3992:1: rule__Notation__Group_3__1 : rule__Notation__Group_3__1__Impl ;
    public final void rule__Notation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:3996:1: ( rule__Notation__Group_3__1__Impl )
            // InternalMusicDsl.g:3997:2: rule__Notation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Notation__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notation__Group_3__1"


    // $ANTLR start "rule__Notation__Group_3__1__Impl"
    // InternalMusicDsl.g:4003:1: rule__Notation__Group_3__1__Impl : ( ( rule__Notation__OrnamentAssignment_3_1 ) ) ;
    public final void rule__Notation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4007:1: ( ( ( rule__Notation__OrnamentAssignment_3_1 ) ) )
            // InternalMusicDsl.g:4008:1: ( ( rule__Notation__OrnamentAssignment_3_1 ) )
            {
            // InternalMusicDsl.g:4008:1: ( ( rule__Notation__OrnamentAssignment_3_1 ) )
            // InternalMusicDsl.g:4009:2: ( rule__Notation__OrnamentAssignment_3_1 )
            {
             before(grammarAccess.getNotationAccess().getOrnamentAssignment_3_1()); 
            // InternalMusicDsl.g:4010:2: ( rule__Notation__OrnamentAssignment_3_1 )
            // InternalMusicDsl.g:4010:3: rule__Notation__OrnamentAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Notation__OrnamentAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNotationAccess().getOrnamentAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notation__Group_3__1__Impl"


    // $ANTLR start "rule__Notation__Group_4__0"
    // InternalMusicDsl.g:4019:1: rule__Notation__Group_4__0 : rule__Notation__Group_4__0__Impl rule__Notation__Group_4__1 ;
    public final void rule__Notation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4023:1: ( rule__Notation__Group_4__0__Impl rule__Notation__Group_4__1 )
            // InternalMusicDsl.g:4024:2: rule__Notation__Group_4__0__Impl rule__Notation__Group_4__1
            {
            pushFollow(FOLLOW_33);
            rule__Notation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Notation__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notation__Group_4__0"


    // $ANTLR start "rule__Notation__Group_4__0__Impl"
    // InternalMusicDsl.g:4031:1: rule__Notation__Group_4__0__Impl : ( 'slur' ) ;
    public final void rule__Notation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4035:1: ( ( 'slur' ) )
            // InternalMusicDsl.g:4036:1: ( 'slur' )
            {
            // InternalMusicDsl.g:4036:1: ( 'slur' )
            // InternalMusicDsl.g:4037:2: 'slur'
            {
             before(grammarAccess.getNotationAccess().getSlurKeyword_4_0()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getNotationAccess().getSlurKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notation__Group_4__0__Impl"


    // $ANTLR start "rule__Notation__Group_4__1"
    // InternalMusicDsl.g:4046:1: rule__Notation__Group_4__1 : rule__Notation__Group_4__1__Impl ;
    public final void rule__Notation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4050:1: ( rule__Notation__Group_4__1__Impl )
            // InternalMusicDsl.g:4051:2: rule__Notation__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Notation__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notation__Group_4__1"


    // $ANTLR start "rule__Notation__Group_4__1__Impl"
    // InternalMusicDsl.g:4057:1: rule__Notation__Group_4__1__Impl : ( ( rule__Notation__SlurAssignment_4_1 ) ) ;
    public final void rule__Notation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4061:1: ( ( ( rule__Notation__SlurAssignment_4_1 ) ) )
            // InternalMusicDsl.g:4062:1: ( ( rule__Notation__SlurAssignment_4_1 ) )
            {
            // InternalMusicDsl.g:4062:1: ( ( rule__Notation__SlurAssignment_4_1 ) )
            // InternalMusicDsl.g:4063:2: ( rule__Notation__SlurAssignment_4_1 )
            {
             before(grammarAccess.getNotationAccess().getSlurAssignment_4_1()); 
            // InternalMusicDsl.g:4064:2: ( rule__Notation__SlurAssignment_4_1 )
            // InternalMusicDsl.g:4064:3: rule__Notation__SlurAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Notation__SlurAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getNotationAccess().getSlurAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notation__Group_4__1__Impl"


    // $ANTLR start "rule__Composition__NameAssignment_2"
    // InternalMusicDsl.g:4073:1: rule__Composition__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Composition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4077:1: ( ( ruleEString ) )
            // InternalMusicDsl.g:4078:2: ( ruleEString )
            {
            // InternalMusicDsl.g:4078:2: ( ruleEString )
            // InternalMusicDsl.g:4079:3: ruleEString
            {
             before(grammarAccess.getCompositionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__NameAssignment_2"


    // $ANTLR start "rule__Composition__AuthorAssignment_4_1"
    // InternalMusicDsl.g:4088:1: rule__Composition__AuthorAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Composition__AuthorAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4092:1: ( ( ruleEString ) )
            // InternalMusicDsl.g:4093:2: ( ruleEString )
            {
            // InternalMusicDsl.g:4093:2: ( ruleEString )
            // InternalMusicDsl.g:4094:3: ruleEString
            {
             before(grammarAccess.getCompositionAccess().getAuthorEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositionAccess().getAuthorEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__AuthorAssignment_4_1"


    // $ANTLR start "rule__Composition__InstrumentAssignment_5_1"
    // InternalMusicDsl.g:4103:1: rule__Composition__InstrumentAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Composition__InstrumentAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4107:1: ( ( ruleEString ) )
            // InternalMusicDsl.g:4108:2: ( ruleEString )
            {
            // InternalMusicDsl.g:4108:2: ( ruleEString )
            // InternalMusicDsl.g:4109:3: ruleEString
            {
             before(grammarAccess.getCompositionAccess().getInstrumentEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositionAccess().getInstrumentEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__InstrumentAssignment_5_1"


    // $ANTLR start "rule__Composition__TonalityAssignment_6_1"
    // InternalMusicDsl.g:4118:1: rule__Composition__TonalityAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Composition__TonalityAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4122:1: ( ( ruleEString ) )
            // InternalMusicDsl.g:4123:2: ( ruleEString )
            {
            // InternalMusicDsl.g:4123:2: ( ruleEString )
            // InternalMusicDsl.g:4124:3: ruleEString
            {
             before(grammarAccess.getCompositionAccess().getTonalityEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositionAccess().getTonalityEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__TonalityAssignment_6_1"


    // $ANTLR start "rule__Composition__SoundTempoAssignment_7_1"
    // InternalMusicDsl.g:4133:1: rule__Composition__SoundTempoAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__Composition__SoundTempoAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4137:1: ( ( ruleEInt ) )
            // InternalMusicDsl.g:4138:2: ( ruleEInt )
            {
            // InternalMusicDsl.g:4138:2: ( ruleEInt )
            // InternalMusicDsl.g:4139:3: ruleEInt
            {
             before(grammarAccess.getCompositionAccess().getSoundTempoEIntParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getCompositionAccess().getSoundTempoEIntParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__SoundTempoAssignment_7_1"


    // $ANTLR start "rule__Composition__StaffAssignment_8"
    // InternalMusicDsl.g:4148:1: rule__Composition__StaffAssignment_8 : ( ruleStaff ) ;
    public final void rule__Composition__StaffAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4152:1: ( ( ruleStaff ) )
            // InternalMusicDsl.g:4153:2: ( ruleStaff )
            {
            // InternalMusicDsl.g:4153:2: ( ruleStaff )
            // InternalMusicDsl.g:4154:3: ruleStaff
            {
             before(grammarAccess.getCompositionAccess().getStaffStaffParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleStaff();

            state._fsp--;

             after(grammarAccess.getCompositionAccess().getStaffStaffParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__StaffAssignment_8"


    // $ANTLR start "rule__Composition__StaffAssignment_9_1"
    // InternalMusicDsl.g:4163:1: rule__Composition__StaffAssignment_9_1 : ( ruleStaff ) ;
    public final void rule__Composition__StaffAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4167:1: ( ( ruleStaff ) )
            // InternalMusicDsl.g:4168:2: ( ruleStaff )
            {
            // InternalMusicDsl.g:4168:2: ( ruleStaff )
            // InternalMusicDsl.g:4169:3: ruleStaff
            {
             before(grammarAccess.getCompositionAccess().getStaffStaffParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStaff();

            state._fsp--;

             after(grammarAccess.getCompositionAccess().getStaffStaffParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__StaffAssignment_9_1"


    // $ANTLR start "rule__Staff__StaffNumberAssignment_2"
    // InternalMusicDsl.g:4178:1: rule__Staff__StaffNumberAssignment_2 : ( ruleEInt ) ;
    public final void rule__Staff__StaffNumberAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4182:1: ( ( ruleEInt ) )
            // InternalMusicDsl.g:4183:2: ( ruleEInt )
            {
            // InternalMusicDsl.g:4183:2: ( ruleEInt )
            // InternalMusicDsl.g:4184:3: ruleEInt
            {
             before(grammarAccess.getStaffAccess().getStaffNumberEIntParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getStaffAccess().getStaffNumberEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__StaffNumberAssignment_2"


    // $ANTLR start "rule__Staff__ClefAssignment_5"
    // InternalMusicDsl.g:4193:1: rule__Staff__ClefAssignment_5 : ( ruleClef ) ;
    public final void rule__Staff__ClefAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4197:1: ( ( ruleClef ) )
            // InternalMusicDsl.g:4198:2: ( ruleClef )
            {
            // InternalMusicDsl.g:4198:2: ( ruleClef )
            // InternalMusicDsl.g:4199:3: ruleClef
            {
             before(grammarAccess.getStaffAccess().getClefClefParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleClef();

            state._fsp--;

             after(grammarAccess.getStaffAccess().getClefClefParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__ClefAssignment_5"


    // $ANTLR start "rule__Staff__KeyAssignment_6_1"
    // InternalMusicDsl.g:4208:1: rule__Staff__KeyAssignment_6_1 : ( ruleKey ) ;
    public final void rule__Staff__KeyAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4212:1: ( ( ruleKey ) )
            // InternalMusicDsl.g:4213:2: ( ruleKey )
            {
            // InternalMusicDsl.g:4213:2: ( ruleKey )
            // InternalMusicDsl.g:4214:3: ruleKey
            {
             before(grammarAccess.getStaffAccess().getKeyKeyParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKey();

            state._fsp--;

             after(grammarAccess.getStaffAccess().getKeyKeyParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__KeyAssignment_6_1"


    // $ANTLR start "rule__Staff__TimeAssignment_8"
    // InternalMusicDsl.g:4223:1: rule__Staff__TimeAssignment_8 : ( ruleTimeSignature ) ;
    public final void rule__Staff__TimeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4227:1: ( ( ruleTimeSignature ) )
            // InternalMusicDsl.g:4228:2: ( ruleTimeSignature )
            {
            // InternalMusicDsl.g:4228:2: ( ruleTimeSignature )
            // InternalMusicDsl.g:4229:3: ruleTimeSignature
            {
             before(grammarAccess.getStaffAccess().getTimeTimeSignatureParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeSignature();

            state._fsp--;

             after(grammarAccess.getStaffAccess().getTimeTimeSignatureParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__TimeAssignment_8"


    // $ANTLR start "rule__Staff__ElementsAssignment_9_0"
    // InternalMusicDsl.g:4238:1: rule__Staff__ElementsAssignment_9_0 : ( ruleStaffElement ) ;
    public final void rule__Staff__ElementsAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4242:1: ( ( ruleStaffElement ) )
            // InternalMusicDsl.g:4243:2: ( ruleStaffElement )
            {
            // InternalMusicDsl.g:4243:2: ( ruleStaffElement )
            // InternalMusicDsl.g:4244:3: ruleStaffElement
            {
             before(grammarAccess.getStaffAccess().getElementsStaffElementParserRuleCall_9_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStaffElement();

            state._fsp--;

             after(grammarAccess.getStaffAccess().getElementsStaffElementParserRuleCall_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__ElementsAssignment_9_0"


    // $ANTLR start "rule__Staff__ElementsAssignment_9_1_1"
    // InternalMusicDsl.g:4253:1: rule__Staff__ElementsAssignment_9_1_1 : ( ruleStaffElement ) ;
    public final void rule__Staff__ElementsAssignment_9_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4257:1: ( ( ruleStaffElement ) )
            // InternalMusicDsl.g:4258:2: ( ruleStaffElement )
            {
            // InternalMusicDsl.g:4258:2: ( ruleStaffElement )
            // InternalMusicDsl.g:4259:3: ruleStaffElement
            {
             before(grammarAccess.getStaffAccess().getElementsStaffElementParserRuleCall_9_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStaffElement();

            state._fsp--;

             after(grammarAccess.getStaffAccess().getElementsStaffElementParserRuleCall_9_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__ElementsAssignment_9_1_1"


    // $ANTLR start "rule__Clef__TypeAssignment_1"
    // InternalMusicDsl.g:4268:1: rule__Clef__TypeAssignment_1 : ( ruleClefType ) ;
    public final void rule__Clef__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4272:1: ( ( ruleClefType ) )
            // InternalMusicDsl.g:4273:2: ( ruleClefType )
            {
            // InternalMusicDsl.g:4273:2: ( ruleClefType )
            // InternalMusicDsl.g:4274:3: ruleClefType
            {
             before(grammarAccess.getClefAccess().getTypeClefTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClefType();

            state._fsp--;

             after(grammarAccess.getClefAccess().getTypeClefTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clef__TypeAssignment_1"


    // $ANTLR start "rule__TimeSignature__BeatAssignment_1"
    // InternalMusicDsl.g:4283:1: rule__TimeSignature__BeatAssignment_1 : ( ruleEInt ) ;
    public final void rule__TimeSignature__BeatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4287:1: ( ( ruleEInt ) )
            // InternalMusicDsl.g:4288:2: ( ruleEInt )
            {
            // InternalMusicDsl.g:4288:2: ( ruleEInt )
            // InternalMusicDsl.g:4289:3: ruleEInt
            {
             before(grammarAccess.getTimeSignatureAccess().getBeatEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTimeSignatureAccess().getBeatEIntParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSignature__BeatAssignment_1"


    // $ANTLR start "rule__TimeSignature__BeatTypeAssignment_4"
    // InternalMusicDsl.g:4298:1: rule__TimeSignature__BeatTypeAssignment_4 : ( ruleEInt ) ;
    public final void rule__TimeSignature__BeatTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4302:1: ( ( ruleEInt ) )
            // InternalMusicDsl.g:4303:2: ( ruleEInt )
            {
            // InternalMusicDsl.g:4303:2: ( ruleEInt )
            // InternalMusicDsl.g:4304:3: ruleEInt
            {
             before(grammarAccess.getTimeSignatureAccess().getBeatTypeEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTimeSignatureAccess().getBeatTypeEIntParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSignature__BeatTypeAssignment_4"


    // $ANTLR start "rule__Key__FifthsAssignment"
    // InternalMusicDsl.g:4313:1: rule__Key__FifthsAssignment : ( ruleEInt ) ;
    public final void rule__Key__FifthsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4317:1: ( ( ruleEInt ) )
            // InternalMusicDsl.g:4318:2: ( ruleEInt )
            {
            // InternalMusicDsl.g:4318:2: ( ruleEInt )
            // InternalMusicDsl.g:4319:3: ruleEInt
            {
             before(grammarAccess.getKeyAccess().getFifthsEIntParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getKeyAccess().getFifthsEIntParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__FifthsAssignment"


    // $ANTLR start "rule__Measure__MeasureNumberAssignment_2"
    // InternalMusicDsl.g:4328:1: rule__Measure__MeasureNumberAssignment_2 : ( ruleEInt ) ;
    public final void rule__Measure__MeasureNumberAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4332:1: ( ( ruleEInt ) )
            // InternalMusicDsl.g:4333:2: ( ruleEInt )
            {
            // InternalMusicDsl.g:4333:2: ( ruleEInt )
            // InternalMusicDsl.g:4334:3: ruleEInt
            {
             before(grammarAccess.getMeasureAccess().getMeasureNumberEIntParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMeasureAccess().getMeasureNumberEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__MeasureNumberAssignment_2"


    // $ANTLR start "rule__Measure__RepetitionAssignment_4_0"
    // InternalMusicDsl.g:4343:1: rule__Measure__RepetitionAssignment_4_0 : ( ruleRepetition ) ;
    public final void rule__Measure__RepetitionAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4347:1: ( ( ruleRepetition ) )
            // InternalMusicDsl.g:4348:2: ( ruleRepetition )
            {
            // InternalMusicDsl.g:4348:2: ( ruleRepetition )
            // InternalMusicDsl.g:4349:3: ruleRepetition
            {
             before(grammarAccess.getMeasureAccess().getRepetitionRepetitionParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRepetition();

            state._fsp--;

             after(grammarAccess.getMeasureAccess().getRepetitionRepetitionParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__RepetitionAssignment_4_0"


    // $ANTLR start "rule__Measure__RepetitionAssignment_4_1_1"
    // InternalMusicDsl.g:4358:1: rule__Measure__RepetitionAssignment_4_1_1 : ( ruleRepetition ) ;
    public final void rule__Measure__RepetitionAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4362:1: ( ( ruleRepetition ) )
            // InternalMusicDsl.g:4363:2: ( ruleRepetition )
            {
            // InternalMusicDsl.g:4363:2: ( ruleRepetition )
            // InternalMusicDsl.g:4364:3: ruleRepetition
            {
             before(grammarAccess.getMeasureAccess().getRepetitionRepetitionParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRepetition();

            state._fsp--;

             after(grammarAccess.getMeasureAccess().getRepetitionRepetitionParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__RepetitionAssignment_4_1_1"


    // $ANTLR start "rule__Measure__RestAssignment_5_0"
    // InternalMusicDsl.g:4373:1: rule__Measure__RestAssignment_5_0 : ( ruleRest ) ;
    public final void rule__Measure__RestAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4377:1: ( ( ruleRest ) )
            // InternalMusicDsl.g:4378:2: ( ruleRest )
            {
            // InternalMusicDsl.g:4378:2: ( ruleRest )
            // InternalMusicDsl.g:4379:3: ruleRest
            {
             before(grammarAccess.getMeasureAccess().getRestRestParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRest();

            state._fsp--;

             after(grammarAccess.getMeasureAccess().getRestRestParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__RestAssignment_5_0"


    // $ANTLR start "rule__Measure__RestAssignment_5_1_1"
    // InternalMusicDsl.g:4388:1: rule__Measure__RestAssignment_5_1_1 : ( ruleRest ) ;
    public final void rule__Measure__RestAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4392:1: ( ( ruleRest ) )
            // InternalMusicDsl.g:4393:2: ( ruleRest )
            {
            // InternalMusicDsl.g:4393:2: ( ruleRest )
            // InternalMusicDsl.g:4394:3: ruleRest
            {
             before(grammarAccess.getMeasureAccess().getRestRestParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRest();

            state._fsp--;

             after(grammarAccess.getMeasureAccess().getRestRestParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__RestAssignment_5_1_1"


    // $ANTLR start "rule__Measure__NoteAssignment_6_0"
    // InternalMusicDsl.g:4403:1: rule__Measure__NoteAssignment_6_0 : ( ruleNote ) ;
    public final void rule__Measure__NoteAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4407:1: ( ( ruleNote ) )
            // InternalMusicDsl.g:4408:2: ( ruleNote )
            {
            // InternalMusicDsl.g:4408:2: ( ruleNote )
            // InternalMusicDsl.g:4409:3: ruleNote
            {
             before(grammarAccess.getMeasureAccess().getNoteNoteParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getMeasureAccess().getNoteNoteParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__NoteAssignment_6_0"


    // $ANTLR start "rule__Measure__NoteAssignment_6_1_1"
    // InternalMusicDsl.g:4418:1: rule__Measure__NoteAssignment_6_1_1 : ( ruleNote ) ;
    public final void rule__Measure__NoteAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4422:1: ( ( ruleNote ) )
            // InternalMusicDsl.g:4423:2: ( ruleNote )
            {
            // InternalMusicDsl.g:4423:2: ( ruleNote )
            // InternalMusicDsl.g:4424:3: ruleNote
            {
             before(grammarAccess.getMeasureAccess().getNoteNoteParserRuleCall_6_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getMeasureAccess().getNoteNoteParserRuleCall_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__NoteAssignment_6_1_1"


    // $ANTLR start "rule__Rest__TypeAssignment_2"
    // InternalMusicDsl.g:4433:1: rule__Rest__TypeAssignment_2 : ( ruleRestType ) ;
    public final void rule__Rest__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4437:1: ( ( ruleRestType ) )
            // InternalMusicDsl.g:4438:2: ( ruleRestType )
            {
            // InternalMusicDsl.g:4438:2: ( ruleRestType )
            // InternalMusicDsl.g:4439:3: ruleRestType
            {
             before(grammarAccess.getRestAccess().getTypeRestTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRestType();

            state._fsp--;

             after(grammarAccess.getRestAccess().getTypeRestTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rest__TypeAssignment_2"


    // $ANTLR start "rule__Repetition__TypeAssignment_2"
    // InternalMusicDsl.g:4448:1: rule__Repetition__TypeAssignment_2 : ( ruleRepetitionType ) ;
    public final void rule__Repetition__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4452:1: ( ( ruleRepetitionType ) )
            // InternalMusicDsl.g:4453:2: ( ruleRepetitionType )
            {
            // InternalMusicDsl.g:4453:2: ( ruleRepetitionType )
            // InternalMusicDsl.g:4454:3: ruleRepetitionType
            {
             before(grammarAccess.getRepetitionAccess().getTypeRepetitionTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRepetitionType();

            state._fsp--;

             after(grammarAccess.getRepetitionAccess().getTypeRepetitionTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repetition__TypeAssignment_2"


    // $ANTLR start "rule__Note__NameAssignment_2"
    // InternalMusicDsl.g:4463:1: rule__Note__NameAssignment_2 : ( ruleNoteName ) ;
    public final void rule__Note__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4467:1: ( ( ruleNoteName ) )
            // InternalMusicDsl.g:4468:2: ( ruleNoteName )
            {
            // InternalMusicDsl.g:4468:2: ( ruleNoteName )
            // InternalMusicDsl.g:4469:3: ruleNoteName
            {
             before(grammarAccess.getNoteAccess().getNameNoteNameEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNoteName();

            state._fsp--;

             after(grammarAccess.getNoteAccess().getNameNoteNameEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__NameAssignment_2"


    // $ANTLR start "rule__Note__TypeAssignment_4_1"
    // InternalMusicDsl.g:4478:1: rule__Note__TypeAssignment_4_1 : ( ruleNoteType ) ;
    public final void rule__Note__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4482:1: ( ( ruleNoteType ) )
            // InternalMusicDsl.g:4483:2: ( ruleNoteType )
            {
            // InternalMusicDsl.g:4483:2: ( ruleNoteType )
            // InternalMusicDsl.g:4484:3: ruleNoteType
            {
             before(grammarAccess.getNoteAccess().getTypeNoteTypeEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNoteType();

            state._fsp--;

             after(grammarAccess.getNoteAccess().getTypeNoteTypeEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__TypeAssignment_4_1"


    // $ANTLR start "rule__Note__DurationAssignment_5_1"
    // InternalMusicDsl.g:4493:1: rule__Note__DurationAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Note__DurationAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4497:1: ( ( ruleEInt ) )
            // InternalMusicDsl.g:4498:2: ( ruleEInt )
            {
            // InternalMusicDsl.g:4498:2: ( ruleEInt )
            // InternalMusicDsl.g:4499:3: ruleEInt
            {
             before(grammarAccess.getNoteAccess().getDurationEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getNoteAccess().getDurationEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__DurationAssignment_5_1"


    // $ANTLR start "rule__Note__OctaveAssignment_6_1"
    // InternalMusicDsl.g:4508:1: rule__Note__OctaveAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Note__OctaveAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4512:1: ( ( ruleEInt ) )
            // InternalMusicDsl.g:4513:2: ( ruleEInt )
            {
            // InternalMusicDsl.g:4513:2: ( ruleEInt )
            // InternalMusicDsl.g:4514:3: ruleEInt
            {
             before(grammarAccess.getNoteAccess().getOctaveEIntParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getNoteAccess().getOctaveEIntParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__OctaveAssignment_6_1"


    // $ANTLR start "rule__Note__VoiceAssignment_7_1"
    // InternalMusicDsl.g:4523:1: rule__Note__VoiceAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__Note__VoiceAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4527:1: ( ( ruleEInt ) )
            // InternalMusicDsl.g:4528:2: ( ruleEInt )
            {
            // InternalMusicDsl.g:4528:2: ( ruleEInt )
            // InternalMusicDsl.g:4529:3: ruleEInt
            {
             before(grammarAccess.getNoteAccess().getVoiceEIntParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getNoteAccess().getVoiceEIntParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__VoiceAssignment_7_1"


    // $ANTLR start "rule__Note__DynamicAssignment_8_1"
    // InternalMusicDsl.g:4538:1: rule__Note__DynamicAssignment_8_1 : ( ruleEString ) ;
    public final void rule__Note__DynamicAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4542:1: ( ( ruleEString ) )
            // InternalMusicDsl.g:4543:2: ( ruleEString )
            {
            // InternalMusicDsl.g:4543:2: ( ruleEString )
            // InternalMusicDsl.g:4544:3: ruleEString
            {
             before(grammarAccess.getNoteAccess().getDynamicEStringParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNoteAccess().getDynamicEStringParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__DynamicAssignment_8_1"


    // $ANTLR start "rule__Note__AccidentalAssignment_9_1"
    // InternalMusicDsl.g:4553:1: rule__Note__AccidentalAssignment_9_1 : ( ruleAccidentalType ) ;
    public final void rule__Note__AccidentalAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4557:1: ( ( ruleAccidentalType ) )
            // InternalMusicDsl.g:4558:2: ( ruleAccidentalType )
            {
            // InternalMusicDsl.g:4558:2: ( ruleAccidentalType )
            // InternalMusicDsl.g:4559:3: ruleAccidentalType
            {
             before(grammarAccess.getNoteAccess().getAccidentalAccidentalTypeEnumRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAccidentalType();

            state._fsp--;

             after(grammarAccess.getNoteAccess().getAccidentalAccidentalTypeEnumRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__AccidentalAssignment_9_1"


    // $ANTLR start "rule__Note__LyricsAssignment_10_1"
    // InternalMusicDsl.g:4568:1: rule__Note__LyricsAssignment_10_1 : ( ruleEString ) ;
    public final void rule__Note__LyricsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4572:1: ( ( ruleEString ) )
            // InternalMusicDsl.g:4573:2: ( ruleEString )
            {
            // InternalMusicDsl.g:4573:2: ( ruleEString )
            // InternalMusicDsl.g:4574:3: ruleEString
            {
             before(grammarAccess.getNoteAccess().getLyricsEStringParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNoteAccess().getLyricsEStringParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__LyricsAssignment_10_1"


    // $ANTLR start "rule__Note__FermataAssignment_11"
    // InternalMusicDsl.g:4583:1: rule__Note__FermataAssignment_11 : ( ( 'fermata' ) ) ;
    public final void rule__Note__FermataAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4587:1: ( ( ( 'fermata' ) ) )
            // InternalMusicDsl.g:4588:2: ( ( 'fermata' ) )
            {
            // InternalMusicDsl.g:4588:2: ( ( 'fermata' ) )
            // InternalMusicDsl.g:4589:3: ( 'fermata' )
            {
             before(grammarAccess.getNoteAccess().getFermataFermataKeyword_11_0()); 
            // InternalMusicDsl.g:4590:3: ( 'fermata' )
            // InternalMusicDsl.g:4591:4: 'fermata'
            {
             before(grammarAccess.getNoteAccess().getFermataFermataKeyword_11_0()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getNoteAccess().getFermataFermataKeyword_11_0()); 

            }

             after(grammarAccess.getNoteAccess().getFermataFermataKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__FermataAssignment_11"


    // $ANTLR start "rule__Note__DotAssignment_12"
    // InternalMusicDsl.g:4602:1: rule__Note__DotAssignment_12 : ( ( 'dot' ) ) ;
    public final void rule__Note__DotAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4606:1: ( ( ( 'dot' ) ) )
            // InternalMusicDsl.g:4607:2: ( ( 'dot' ) )
            {
            // InternalMusicDsl.g:4607:2: ( ( 'dot' ) )
            // InternalMusicDsl.g:4608:3: ( 'dot' )
            {
             before(grammarAccess.getNoteAccess().getDotDotKeyword_12_0()); 
            // InternalMusicDsl.g:4609:3: ( 'dot' )
            // InternalMusicDsl.g:4610:4: 'dot'
            {
             before(grammarAccess.getNoteAccess().getDotDotKeyword_12_0()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getNoteAccess().getDotDotKeyword_12_0()); 

            }

             after(grammarAccess.getNoteAccess().getDotDotKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__DotAssignment_12"


    // $ANTLR start "rule__Note__ChordAssignment_13"
    // InternalMusicDsl.g:4621:1: rule__Note__ChordAssignment_13 : ( ( 'chord' ) ) ;
    public final void rule__Note__ChordAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4625:1: ( ( ( 'chord' ) ) )
            // InternalMusicDsl.g:4626:2: ( ( 'chord' ) )
            {
            // InternalMusicDsl.g:4626:2: ( ( 'chord' ) )
            // InternalMusicDsl.g:4627:3: ( 'chord' )
            {
             before(grammarAccess.getNoteAccess().getChordChordKeyword_13_0()); 
            // InternalMusicDsl.g:4628:3: ( 'chord' )
            // InternalMusicDsl.g:4629:4: 'chord'
            {
             before(grammarAccess.getNoteAccess().getChordChordKeyword_13_0()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getNoteAccess().getChordChordKeyword_13_0()); 

            }

             after(grammarAccess.getNoteAccess().getChordChordKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__ChordAssignment_13"


    // $ANTLR start "rule__Note__NotationAssignment_14_0"
    // InternalMusicDsl.g:4640:1: rule__Note__NotationAssignment_14_0 : ( ruleNotation ) ;
    public final void rule__Note__NotationAssignment_14_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4644:1: ( ( ruleNotation ) )
            // InternalMusicDsl.g:4645:2: ( ruleNotation )
            {
            // InternalMusicDsl.g:4645:2: ( ruleNotation )
            // InternalMusicDsl.g:4646:3: ruleNotation
            {
             before(grammarAccess.getNoteAccess().getNotationNotationParserRuleCall_14_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNotation();

            state._fsp--;

             after(grammarAccess.getNoteAccess().getNotationNotationParserRuleCall_14_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__NotationAssignment_14_0"


    // $ANTLR start "rule__Note__NotationAssignment_14_1_1"
    // InternalMusicDsl.g:4655:1: rule__Note__NotationAssignment_14_1_1 : ( ruleNotation ) ;
    public final void rule__Note__NotationAssignment_14_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4659:1: ( ( ruleNotation ) )
            // InternalMusicDsl.g:4660:2: ( ruleNotation )
            {
            // InternalMusicDsl.g:4660:2: ( ruleNotation )
            // InternalMusicDsl.g:4661:3: ruleNotation
            {
             before(grammarAccess.getNoteAccess().getNotationNotationParserRuleCall_14_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNotation();

            state._fsp--;

             after(grammarAccess.getNoteAccess().getNotationNotationParserRuleCall_14_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__NotationAssignment_14_1_1"


    // $ANTLR start "rule__Notation__ArticulationAssignment_2_1"
    // InternalMusicDsl.g:4670:1: rule__Notation__ArticulationAssignment_2_1 : ( ruleArticulationType ) ;
    public final void rule__Notation__ArticulationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4674:1: ( ( ruleArticulationType ) )
            // InternalMusicDsl.g:4675:2: ( ruleArticulationType )
            {
            // InternalMusicDsl.g:4675:2: ( ruleArticulationType )
            // InternalMusicDsl.g:4676:3: ruleArticulationType
            {
             before(grammarAccess.getNotationAccess().getArticulationArticulationTypeEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArticulationType();

            state._fsp--;

             after(grammarAccess.getNotationAccess().getArticulationArticulationTypeEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notation__ArticulationAssignment_2_1"


    // $ANTLR start "rule__Notation__OrnamentAssignment_3_1"
    // InternalMusicDsl.g:4685:1: rule__Notation__OrnamentAssignment_3_1 : ( ruleOrnamentType ) ;
    public final void rule__Notation__OrnamentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4689:1: ( ( ruleOrnamentType ) )
            // InternalMusicDsl.g:4690:2: ( ruleOrnamentType )
            {
            // InternalMusicDsl.g:4690:2: ( ruleOrnamentType )
            // InternalMusicDsl.g:4691:3: ruleOrnamentType
            {
             before(grammarAccess.getNotationAccess().getOrnamentOrnamentTypeEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrnamentType();

            state._fsp--;

             after(grammarAccess.getNotationAccess().getOrnamentOrnamentTypeEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notation__OrnamentAssignment_3_1"


    // $ANTLR start "rule__Notation__SlurAssignment_4_1"
    // InternalMusicDsl.g:4700:1: rule__Notation__SlurAssignment_4_1 : ( ruleSlurType ) ;
    public final void rule__Notation__SlurAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMusicDsl.g:4704:1: ( ( ruleSlurType ) )
            // InternalMusicDsl.g:4705:2: ( ruleSlurType )
            {
            // InternalMusicDsl.g:4705:2: ( ruleSlurType )
            // InternalMusicDsl.g:4706:3: ruleSlurType
            {
             before(grammarAccess.getNotationAccess().getSlurSlurTypeEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSlurType();

            state._fsp--;

             after(grammarAccess.getNotationAccess().getSlurSlurTypeEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notation__SlurAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x013C000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0042000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0080000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x4002000000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x4000000000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x4000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000000FE000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000001FC00000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000071FE0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000FC00000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00007F0000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000300000000L});

}