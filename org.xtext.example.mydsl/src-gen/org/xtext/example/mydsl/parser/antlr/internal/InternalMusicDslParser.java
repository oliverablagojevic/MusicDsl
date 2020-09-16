package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MusicDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMusicDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Composition'", "'['", "'author:'", "'instrument:'", "'tonality:'", "'soundTempo:'", "','", "']'", "'-'", "'Staff'", "'clef:'", "'key:'", "'time:'", "'beat'", "'beatType'", "'Measure'", "'begin'", "'end'", "'rest'", "'repetition'", "'note'", "':'", "'type'", "'duration'", "'octave'", "'voice'", "'dynamic'", "'accidental'", "'lyrics'", "'fermata'", "'dot'", "'chord'", "'notation:'", "'articulation'", "'ornament'", "'slur'", "'violin'", "'bass'", "'whole'", "'half'", "'quarter'", "'eighth'", "'sixteenth'", "'thirtysecond'", "'sixtyfourth'", "'left'", "'right'", "'C'", "'D'", "'E'", "'F'", "'G'", "'A'", "'B'", "'sharp'", "'flat'", "'natural'", "'start'", "'stop'", "'detached'", "'legato'", "'staccato'", "'portato'", "'tenuto'", "'marcato'", "'slide'", "'glissando'", "'aciaccatura'", "'appoggiatura'", "'turn'", "'mordent'", "'trill'"
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

        public InternalMusicDslParser(TokenStream input, MusicDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Composition";
       	}

       	@Override
       	protected MusicDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleComposition"
    // InternalMusicDsl.g:65:1: entryRuleComposition returns [EObject current=null] : iv_ruleComposition= ruleComposition EOF ;
    public final EObject entryRuleComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposition = null;


        try {
            // InternalMusicDsl.g:65:52: (iv_ruleComposition= ruleComposition EOF )
            // InternalMusicDsl.g:66:2: iv_ruleComposition= ruleComposition EOF
            {
             newCompositeNode(grammarAccess.getCompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComposition=ruleComposition();

            state._fsp--;

             current =iv_ruleComposition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComposition"


    // $ANTLR start "ruleComposition"
    // InternalMusicDsl.g:72:1: ruleComposition returns [EObject current=null] : ( () otherlv_1= 'Composition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '[' (otherlv_4= 'author:' ( (lv_author_5_0= ruleEString ) ) )? (otherlv_6= 'instrument:' ( (lv_instrument_7_0= ruleEString ) ) )? (otherlv_8= 'tonality:' ( (lv_tonality_9_0= ruleEString ) ) )? (otherlv_10= 'soundTempo:' ( (lv_soundTempo_11_0= ruleEInt ) ) )? ( (lv_staff_12_0= ruleStaff ) ) (otherlv_13= ',' ( (lv_staff_14_0= ruleStaff ) ) )* otherlv_15= ']' ) ;
    public final EObject ruleComposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_author_5_0 = null;

        AntlrDatatypeRuleToken lv_instrument_7_0 = null;

        AntlrDatatypeRuleToken lv_tonality_9_0 = null;

        AntlrDatatypeRuleToken lv_soundTempo_11_0 = null;

        EObject lv_staff_12_0 = null;

        EObject lv_staff_14_0 = null;



        	enterRule();

        try {
            // InternalMusicDsl.g:78:2: ( ( () otherlv_1= 'Composition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '[' (otherlv_4= 'author:' ( (lv_author_5_0= ruleEString ) ) )? (otherlv_6= 'instrument:' ( (lv_instrument_7_0= ruleEString ) ) )? (otherlv_8= 'tonality:' ( (lv_tonality_9_0= ruleEString ) ) )? (otherlv_10= 'soundTempo:' ( (lv_soundTempo_11_0= ruleEInt ) ) )? ( (lv_staff_12_0= ruleStaff ) ) (otherlv_13= ',' ( (lv_staff_14_0= ruleStaff ) ) )* otherlv_15= ']' ) )
            // InternalMusicDsl.g:79:2: ( () otherlv_1= 'Composition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '[' (otherlv_4= 'author:' ( (lv_author_5_0= ruleEString ) ) )? (otherlv_6= 'instrument:' ( (lv_instrument_7_0= ruleEString ) ) )? (otherlv_8= 'tonality:' ( (lv_tonality_9_0= ruleEString ) ) )? (otherlv_10= 'soundTempo:' ( (lv_soundTempo_11_0= ruleEInt ) ) )? ( (lv_staff_12_0= ruleStaff ) ) (otherlv_13= ',' ( (lv_staff_14_0= ruleStaff ) ) )* otherlv_15= ']' )
            {
            // InternalMusicDsl.g:79:2: ( () otherlv_1= 'Composition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '[' (otherlv_4= 'author:' ( (lv_author_5_0= ruleEString ) ) )? (otherlv_6= 'instrument:' ( (lv_instrument_7_0= ruleEString ) ) )? (otherlv_8= 'tonality:' ( (lv_tonality_9_0= ruleEString ) ) )? (otherlv_10= 'soundTempo:' ( (lv_soundTempo_11_0= ruleEInt ) ) )? ( (lv_staff_12_0= ruleStaff ) ) (otherlv_13= ',' ( (lv_staff_14_0= ruleStaff ) ) )* otherlv_15= ']' )
            // InternalMusicDsl.g:80:3: () otherlv_1= 'Composition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '[' (otherlv_4= 'author:' ( (lv_author_5_0= ruleEString ) ) )? (otherlv_6= 'instrument:' ( (lv_instrument_7_0= ruleEString ) ) )? (otherlv_8= 'tonality:' ( (lv_tonality_9_0= ruleEString ) ) )? (otherlv_10= 'soundTempo:' ( (lv_soundTempo_11_0= ruleEInt ) ) )? ( (lv_staff_12_0= ruleStaff ) ) (otherlv_13= ',' ( (lv_staff_14_0= ruleStaff ) ) )* otherlv_15= ']'
            {
            // InternalMusicDsl.g:80:3: ()
            // InternalMusicDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompositionAccess().getCompositionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositionAccess().getCompositionKeyword_1());
            		
            // InternalMusicDsl.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMusicDsl.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalMusicDsl.g:92:4: (lv_name_2_0= ruleEString )
            // InternalMusicDsl.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompositionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MusicDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getCompositionAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalMusicDsl.g:114:3: (otherlv_4= 'author:' ( (lv_author_5_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMusicDsl.g:115:4: otherlv_4= 'author:' ( (lv_author_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCompositionAccess().getAuthorKeyword_4_0());
                    			
                    // InternalMusicDsl.g:119:4: ( (lv_author_5_0= ruleEString ) )
                    // InternalMusicDsl.g:120:5: (lv_author_5_0= ruleEString )
                    {
                    // InternalMusicDsl.g:120:5: (lv_author_5_0= ruleEString )
                    // InternalMusicDsl.g:121:6: lv_author_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCompositionAccess().getAuthorEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_author_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionRule());
                    						}
                    						set(
                    							current,
                    							"author",
                    							lv_author_5_0,
                    							"org.xtext.example.mydsl.MusicDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMusicDsl.g:139:3: (otherlv_6= 'instrument:' ( (lv_instrument_7_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMusicDsl.g:140:4: otherlv_6= 'instrument:' ( (lv_instrument_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getCompositionAccess().getInstrumentKeyword_5_0());
                    			
                    // InternalMusicDsl.g:144:4: ( (lv_instrument_7_0= ruleEString ) )
                    // InternalMusicDsl.g:145:5: (lv_instrument_7_0= ruleEString )
                    {
                    // InternalMusicDsl.g:145:5: (lv_instrument_7_0= ruleEString )
                    // InternalMusicDsl.g:146:6: lv_instrument_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCompositionAccess().getInstrumentEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_instrument_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionRule());
                    						}
                    						set(
                    							current,
                    							"instrument",
                    							lv_instrument_7_0,
                    							"org.xtext.example.mydsl.MusicDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMusicDsl.g:164:3: (otherlv_8= 'tonality:' ( (lv_tonality_9_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMusicDsl.g:165:4: otherlv_8= 'tonality:' ( (lv_tonality_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getCompositionAccess().getTonalityKeyword_6_0());
                    			
                    // InternalMusicDsl.g:169:4: ( (lv_tonality_9_0= ruleEString ) )
                    // InternalMusicDsl.g:170:5: (lv_tonality_9_0= ruleEString )
                    {
                    // InternalMusicDsl.g:170:5: (lv_tonality_9_0= ruleEString )
                    // InternalMusicDsl.g:171:6: lv_tonality_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCompositionAccess().getTonalityEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_tonality_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionRule());
                    						}
                    						set(
                    							current,
                    							"tonality",
                    							lv_tonality_9_0,
                    							"org.xtext.example.mydsl.MusicDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMusicDsl.g:189:3: (otherlv_10= 'soundTempo:' ( (lv_soundTempo_11_0= ruleEInt ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMusicDsl.g:190:4: otherlv_10= 'soundTempo:' ( (lv_soundTempo_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getCompositionAccess().getSoundTempoKeyword_7_0());
                    			
                    // InternalMusicDsl.g:194:4: ( (lv_soundTempo_11_0= ruleEInt ) )
                    // InternalMusicDsl.g:195:5: (lv_soundTempo_11_0= ruleEInt )
                    {
                    // InternalMusicDsl.g:195:5: (lv_soundTempo_11_0= ruleEInt )
                    // InternalMusicDsl.g:196:6: lv_soundTempo_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCompositionAccess().getSoundTempoEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_soundTempo_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionRule());
                    						}
                    						set(
                    							current,
                    							"soundTempo",
                    							lv_soundTempo_11_0,
                    							"org.xtext.example.mydsl.MusicDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMusicDsl.g:214:3: ( (lv_staff_12_0= ruleStaff ) )
            // InternalMusicDsl.g:215:4: (lv_staff_12_0= ruleStaff )
            {
            // InternalMusicDsl.g:215:4: (lv_staff_12_0= ruleStaff )
            // InternalMusicDsl.g:216:5: lv_staff_12_0= ruleStaff
            {

            					newCompositeNode(grammarAccess.getCompositionAccess().getStaffStaffParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_7);
            lv_staff_12_0=ruleStaff();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositionRule());
            					}
            					add(
            						current,
            						"staff",
            						lv_staff_12_0,
            						"org.xtext.example.mydsl.MusicDsl.Staff");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMusicDsl.g:233:3: (otherlv_13= ',' ( (lv_staff_14_0= ruleStaff ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMusicDsl.g:234:4: otherlv_13= ',' ( (lv_staff_14_0= ruleStaff ) )
            	    {
            	    otherlv_13=(Token)match(input,17,FOLLOW_5); 

            	    				newLeafNode(otherlv_13, grammarAccess.getCompositionAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalMusicDsl.g:238:4: ( (lv_staff_14_0= ruleStaff ) )
            	    // InternalMusicDsl.g:239:5: (lv_staff_14_0= ruleStaff )
            	    {
            	    // InternalMusicDsl.g:239:5: (lv_staff_14_0= ruleStaff )
            	    // InternalMusicDsl.g:240:6: lv_staff_14_0= ruleStaff
            	    {

            	    						newCompositeNode(grammarAccess.getCompositionAccess().getStaffStaffParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_staff_14_0=ruleStaff();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"staff",
            	    							lv_staff_14_0,
            	    							"org.xtext.example.mydsl.MusicDsl.Staff");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_15=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getCompositionAccess().getRightSquareBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComposition"


    // $ANTLR start "entryRuleStaffElement"
    // InternalMusicDsl.g:266:1: entryRuleStaffElement returns [EObject current=null] : iv_ruleStaffElement= ruleStaffElement EOF ;
    public final EObject entryRuleStaffElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaffElement = null;


        try {
            // InternalMusicDsl.g:266:53: (iv_ruleStaffElement= ruleStaffElement EOF )
            // InternalMusicDsl.g:267:2: iv_ruleStaffElement= ruleStaffElement EOF
            {
             newCompositeNode(grammarAccess.getStaffElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStaffElement=ruleStaffElement();

            state._fsp--;

             current =iv_ruleStaffElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaffElement"


    // $ANTLR start "ruleStaffElement"
    // InternalMusicDsl.g:273:1: ruleStaffElement returns [EObject current=null] : (this_Measure_0= ruleMeasure | this_Rest_1= ruleRest | this_Repetition_2= ruleRepetition | this_Note_3= ruleNote ) ;
    public final EObject ruleStaffElement() throws RecognitionException {
        EObject current = null;

        EObject this_Measure_0 = null;

        EObject this_Rest_1 = null;

        EObject this_Repetition_2 = null;

        EObject this_Note_3 = null;



        	enterRule();

        try {
            // InternalMusicDsl.g:279:2: ( (this_Measure_0= ruleMeasure | this_Rest_1= ruleRest | this_Repetition_2= ruleRepetition | this_Note_3= ruleNote ) )
            // InternalMusicDsl.g:280:2: (this_Measure_0= ruleMeasure | this_Rest_1= ruleRest | this_Repetition_2= ruleRepetition | this_Note_3= ruleNote )
            {
            // InternalMusicDsl.g:280:2: (this_Measure_0= ruleMeasure | this_Rest_1= ruleRest | this_Repetition_2= ruleRepetition | this_Note_3= ruleNote )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt6=1;
                }
                break;
            case 29:
                {
                alt6=2;
                }
                break;
            case 30:
                {
                alt6=3;
                }
                break;
            case 31:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMusicDsl.g:281:3: this_Measure_0= ruleMeasure
                    {

                    			newCompositeNode(grammarAccess.getStaffElementAccess().getMeasureParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Measure_0=ruleMeasure();

                    state._fsp--;


                    			current = this_Measure_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMusicDsl.g:290:3: this_Rest_1= ruleRest
                    {

                    			newCompositeNode(grammarAccess.getStaffElementAccess().getRestParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rest_1=ruleRest();

                    state._fsp--;


                    			current = this_Rest_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMusicDsl.g:299:3: this_Repetition_2= ruleRepetition
                    {

                    			newCompositeNode(grammarAccess.getStaffElementAccess().getRepetitionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Repetition_2=ruleRepetition();

                    state._fsp--;


                    			current = this_Repetition_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMusicDsl.g:308:3: this_Note_3= ruleNote
                    {

                    			newCompositeNode(grammarAccess.getStaffElementAccess().getNoteParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Note_3=ruleNote();

                    state._fsp--;


                    			current = this_Note_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaffElement"


    // $ANTLR start "entryRuleEString"
    // InternalMusicDsl.g:320:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMusicDsl.g:320:47: (iv_ruleEString= ruleEString EOF )
            // InternalMusicDsl.g:321:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMusicDsl.g:327:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMusicDsl.g:333:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMusicDsl.g:334:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMusicDsl.g:334:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMusicDsl.g:335:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMusicDsl.g:343:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalMusicDsl.g:354:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMusicDsl.g:354:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMusicDsl.g:355:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMusicDsl.g:361:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMusicDsl.g:367:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMusicDsl.g:368:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMusicDsl.g:368:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMusicDsl.g:369:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMusicDsl.g:369:3: (kw= '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMusicDsl.g:370:4: kw= '-'
                    {
                    kw=(Token)match(input,19,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleStaff"
    // InternalMusicDsl.g:387:1: entryRuleStaff returns [EObject current=null] : iv_ruleStaff= ruleStaff EOF ;
    public final EObject entryRuleStaff() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaff = null;


        try {
            // InternalMusicDsl.g:387:46: (iv_ruleStaff= ruleStaff EOF )
            // InternalMusicDsl.g:388:2: iv_ruleStaff= ruleStaff EOF
            {
             newCompositeNode(grammarAccess.getStaffRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStaff=ruleStaff();

            state._fsp--;

             current =iv_ruleStaff; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaff"


    // $ANTLR start "ruleStaff"
    // InternalMusicDsl.g:394:1: ruleStaff returns [EObject current=null] : ( () otherlv_1= 'Staff' ( (lv_staffNumber_2_0= ruleEInt ) ) otherlv_3= '[' otherlv_4= 'clef:' ( (lv_clef_5_0= ruleClef ) ) (otherlv_6= 'key:' ( (lv_key_7_0= ruleKey ) ) )? otherlv_8= 'time:' ( (lv_time_9_0= ruleTimeSignature ) ) ( ( (lv_elements_10_0= ruleStaffElement ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleStaffElement ) ) )* )? otherlv_13= ']' ) ;
    public final EObject ruleStaff() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_staffNumber_2_0 = null;

        EObject lv_clef_5_0 = null;

        EObject lv_key_7_0 = null;

        EObject lv_time_9_0 = null;

        EObject lv_elements_10_0 = null;

        EObject lv_elements_12_0 = null;



        	enterRule();

        try {
            // InternalMusicDsl.g:400:2: ( ( () otherlv_1= 'Staff' ( (lv_staffNumber_2_0= ruleEInt ) ) otherlv_3= '[' otherlv_4= 'clef:' ( (lv_clef_5_0= ruleClef ) ) (otherlv_6= 'key:' ( (lv_key_7_0= ruleKey ) ) )? otherlv_8= 'time:' ( (lv_time_9_0= ruleTimeSignature ) ) ( ( (lv_elements_10_0= ruleStaffElement ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleStaffElement ) ) )* )? otherlv_13= ']' ) )
            // InternalMusicDsl.g:401:2: ( () otherlv_1= 'Staff' ( (lv_staffNumber_2_0= ruleEInt ) ) otherlv_3= '[' otherlv_4= 'clef:' ( (lv_clef_5_0= ruleClef ) ) (otherlv_6= 'key:' ( (lv_key_7_0= ruleKey ) ) )? otherlv_8= 'time:' ( (lv_time_9_0= ruleTimeSignature ) ) ( ( (lv_elements_10_0= ruleStaffElement ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleStaffElement ) ) )* )? otherlv_13= ']' )
            {
            // InternalMusicDsl.g:401:2: ( () otherlv_1= 'Staff' ( (lv_staffNumber_2_0= ruleEInt ) ) otherlv_3= '[' otherlv_4= 'clef:' ( (lv_clef_5_0= ruleClef ) ) (otherlv_6= 'key:' ( (lv_key_7_0= ruleKey ) ) )? otherlv_8= 'time:' ( (lv_time_9_0= ruleTimeSignature ) ) ( ( (lv_elements_10_0= ruleStaffElement ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleStaffElement ) ) )* )? otherlv_13= ']' )
            // InternalMusicDsl.g:402:3: () otherlv_1= 'Staff' ( (lv_staffNumber_2_0= ruleEInt ) ) otherlv_3= '[' otherlv_4= 'clef:' ( (lv_clef_5_0= ruleClef ) ) (otherlv_6= 'key:' ( (lv_key_7_0= ruleKey ) ) )? otherlv_8= 'time:' ( (lv_time_9_0= ruleTimeSignature ) ) ( ( (lv_elements_10_0= ruleStaffElement ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleStaffElement ) ) )* )? otherlv_13= ']'
            {
            // InternalMusicDsl.g:402:3: ()
            // InternalMusicDsl.g:403:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStaffAccess().getStaffAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getStaffAccess().getStaffKeyword_1());
            		
            // InternalMusicDsl.g:413:3: ( (lv_staffNumber_2_0= ruleEInt ) )
            // InternalMusicDsl.g:414:4: (lv_staffNumber_2_0= ruleEInt )
            {
            // InternalMusicDsl.g:414:4: (lv_staffNumber_2_0= ruleEInt )
            // InternalMusicDsl.g:415:5: lv_staffNumber_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getStaffAccess().getStaffNumberEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_staffNumber_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStaffRule());
            					}
            					set(
            						current,
            						"staffNumber",
            						lv_staffNumber_2_0,
            						"org.xtext.example.mydsl.MusicDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getStaffAccess().getLeftSquareBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getStaffAccess().getClefKeyword_4());
            		
            // InternalMusicDsl.g:440:3: ( (lv_clef_5_0= ruleClef ) )
            // InternalMusicDsl.g:441:4: (lv_clef_5_0= ruleClef )
            {
            // InternalMusicDsl.g:441:4: (lv_clef_5_0= ruleClef )
            // InternalMusicDsl.g:442:5: lv_clef_5_0= ruleClef
            {

            					newCompositeNode(grammarAccess.getStaffAccess().getClefClefParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_clef_5_0=ruleClef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStaffRule());
            					}
            					set(
            						current,
            						"clef",
            						lv_clef_5_0,
            						"org.xtext.example.mydsl.MusicDsl.Clef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMusicDsl.g:459:3: (otherlv_6= 'key:' ( (lv_key_7_0= ruleKey ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMusicDsl.g:460:4: otherlv_6= 'key:' ( (lv_key_7_0= ruleKey ) )
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getStaffAccess().getKeyKeyword_6_0());
                    			
                    // InternalMusicDsl.g:464:4: ( (lv_key_7_0= ruleKey ) )
                    // InternalMusicDsl.g:465:5: (lv_key_7_0= ruleKey )
                    {
                    // InternalMusicDsl.g:465:5: (lv_key_7_0= ruleKey )
                    // InternalMusicDsl.g:466:6: lv_key_7_0= ruleKey
                    {

                    						newCompositeNode(grammarAccess.getStaffAccess().getKeyKeyParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_key_7_0=ruleKey();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStaffRule());
                    						}
                    						set(
                    							current,
                    							"key",
                    							lv_key_7_0,
                    							"org.xtext.example.mydsl.MusicDsl.Key");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getStaffAccess().getTimeKeyword_7());
            		
            // InternalMusicDsl.g:488:3: ( (lv_time_9_0= ruleTimeSignature ) )
            // InternalMusicDsl.g:489:4: (lv_time_9_0= ruleTimeSignature )
            {
            // InternalMusicDsl.g:489:4: (lv_time_9_0= ruleTimeSignature )
            // InternalMusicDsl.g:490:5: lv_time_9_0= ruleTimeSignature
            {

            					newCompositeNode(grammarAccess.getStaffAccess().getTimeTimeSignatureParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_14);
            lv_time_9_0=ruleTimeSignature();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStaffRule());
            					}
            					set(
            						current,
            						"time",
            						lv_time_9_0,
            						"org.xtext.example.mydsl.MusicDsl.TimeSignature");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMusicDsl.g:507:3: ( ( (lv_elements_10_0= ruleStaffElement ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleStaffElement ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26||(LA11_0>=29 && LA11_0<=31)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMusicDsl.g:508:4: ( (lv_elements_10_0= ruleStaffElement ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleStaffElement ) ) )*
                    {
                    // InternalMusicDsl.g:508:4: ( (lv_elements_10_0= ruleStaffElement ) )
                    // InternalMusicDsl.g:509:5: (lv_elements_10_0= ruleStaffElement )
                    {
                    // InternalMusicDsl.g:509:5: (lv_elements_10_0= ruleStaffElement )
                    // InternalMusicDsl.g:510:6: lv_elements_10_0= ruleStaffElement
                    {

                    						newCompositeNode(grammarAccess.getStaffAccess().getElementsStaffElementParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_elements_10_0=ruleStaffElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStaffRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_10_0,
                    							"org.xtext.example.mydsl.MusicDsl.StaffElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMusicDsl.g:527:4: (otherlv_11= ',' ( (lv_elements_12_0= ruleStaffElement ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==17) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMusicDsl.g:528:5: otherlv_11= ',' ( (lv_elements_12_0= ruleStaffElement ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FOLLOW_15); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getStaffAccess().getCommaKeyword_9_1_0());
                    	    				
                    	    // InternalMusicDsl.g:532:5: ( (lv_elements_12_0= ruleStaffElement ) )
                    	    // InternalMusicDsl.g:533:6: (lv_elements_12_0= ruleStaffElement )
                    	    {
                    	    // InternalMusicDsl.g:533:6: (lv_elements_12_0= ruleStaffElement )
                    	    // InternalMusicDsl.g:534:7: lv_elements_12_0= ruleStaffElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getStaffAccess().getElementsStaffElementParserRuleCall_9_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_elements_12_0=ruleStaffElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStaffRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_12_0,
                    	    								"org.xtext.example.mydsl.MusicDsl.StaffElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getStaffAccess().getRightSquareBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaff"


    // $ANTLR start "entryRuleClef"
    // InternalMusicDsl.g:561:1: entryRuleClef returns [EObject current=null] : iv_ruleClef= ruleClef EOF ;
    public final EObject entryRuleClef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClef = null;


        try {
            // InternalMusicDsl.g:561:45: (iv_ruleClef= ruleClef EOF )
            // InternalMusicDsl.g:562:2: iv_ruleClef= ruleClef EOF
            {
             newCompositeNode(grammarAccess.getClefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClef=ruleClef();

            state._fsp--;

             current =iv_ruleClef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClef"


    // $ANTLR start "ruleClef"
    // InternalMusicDsl.g:568:1: ruleClef returns [EObject current=null] : ( () ( (lv_type_1_0= ruleClefType ) )? ) ;
    public final EObject ruleClef() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalMusicDsl.g:574:2: ( ( () ( (lv_type_1_0= ruleClefType ) )? ) )
            // InternalMusicDsl.g:575:2: ( () ( (lv_type_1_0= ruleClefType ) )? )
            {
            // InternalMusicDsl.g:575:2: ( () ( (lv_type_1_0= ruleClefType ) )? )
            // InternalMusicDsl.g:576:3: () ( (lv_type_1_0= ruleClefType ) )?
            {
            // InternalMusicDsl.g:576:3: ()
            // InternalMusicDsl.g:577:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClefAccess().getClefAction_0(),
            					current);
            			

            }

            // InternalMusicDsl.g:583:3: ( (lv_type_1_0= ruleClefType ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=47 && LA12_0<=48)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMusicDsl.g:584:4: (lv_type_1_0= ruleClefType )
                    {
                    // InternalMusicDsl.g:584:4: (lv_type_1_0= ruleClefType )
                    // InternalMusicDsl.g:585:5: lv_type_1_0= ruleClefType
                    {

                    					newCompositeNode(grammarAccess.getClefAccess().getTypeClefTypeEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_1_0=ruleClefType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClefRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_1_0,
                    						"org.xtext.example.mydsl.MusicDsl.ClefType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClef"


    // $ANTLR start "entryRuleTimeSignature"
    // InternalMusicDsl.g:606:1: entryRuleTimeSignature returns [EObject current=null] : iv_ruleTimeSignature= ruleTimeSignature EOF ;
    public final EObject entryRuleTimeSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeSignature = null;


        try {
            // InternalMusicDsl.g:606:54: (iv_ruleTimeSignature= ruleTimeSignature EOF )
            // InternalMusicDsl.g:607:2: iv_ruleTimeSignature= ruleTimeSignature EOF
            {
             newCompositeNode(grammarAccess.getTimeSignatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeSignature=ruleTimeSignature();

            state._fsp--;

             current =iv_ruleTimeSignature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeSignature"


    // $ANTLR start "ruleTimeSignature"
    // InternalMusicDsl.g:613:1: ruleTimeSignature returns [EObject current=null] : (otherlv_0= 'beat' ( (lv_beat_1_0= ruleEInt ) ) otherlv_2= ',' otherlv_3= 'beatType' ( (lv_beatType_4_0= ruleEInt ) ) ) ;
    public final EObject ruleTimeSignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_beat_1_0 = null;

        AntlrDatatypeRuleToken lv_beatType_4_0 = null;



        	enterRule();

        try {
            // InternalMusicDsl.g:619:2: ( (otherlv_0= 'beat' ( (lv_beat_1_0= ruleEInt ) ) otherlv_2= ',' otherlv_3= 'beatType' ( (lv_beatType_4_0= ruleEInt ) ) ) )
            // InternalMusicDsl.g:620:2: (otherlv_0= 'beat' ( (lv_beat_1_0= ruleEInt ) ) otherlv_2= ',' otherlv_3= 'beatType' ( (lv_beatType_4_0= ruleEInt ) ) )
            {
            // InternalMusicDsl.g:620:2: (otherlv_0= 'beat' ( (lv_beat_1_0= ruleEInt ) ) otherlv_2= ',' otherlv_3= 'beatType' ( (lv_beatType_4_0= ruleEInt ) ) )
            // InternalMusicDsl.g:621:3: otherlv_0= 'beat' ( (lv_beat_1_0= ruleEInt ) ) otherlv_2= ',' otherlv_3= 'beatType' ( (lv_beatType_4_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeSignatureAccess().getBeatKeyword_0());
            		
            // InternalMusicDsl.g:625:3: ( (lv_beat_1_0= ruleEInt ) )
            // InternalMusicDsl.g:626:4: (lv_beat_1_0= ruleEInt )
            {
            // InternalMusicDsl.g:626:4: (lv_beat_1_0= ruleEInt )
            // InternalMusicDsl.g:627:5: lv_beat_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTimeSignatureAccess().getBeatEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_beat_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeSignatureRule());
            					}
            					set(
            						current,
            						"beat",
            						lv_beat_1_0,
            						"org.xtext.example.mydsl.MusicDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getTimeSignatureAccess().getCommaKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getTimeSignatureAccess().getBeatTypeKeyword_3());
            		
            // InternalMusicDsl.g:652:3: ( (lv_beatType_4_0= ruleEInt ) )
            // InternalMusicDsl.g:653:4: (lv_beatType_4_0= ruleEInt )
            {
            // InternalMusicDsl.g:653:4: (lv_beatType_4_0= ruleEInt )
            // InternalMusicDsl.g:654:5: lv_beatType_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTimeSignatureAccess().getBeatTypeEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_beatType_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeSignatureRule());
            					}
            					set(
            						current,
            						"beatType",
            						lv_beatType_4_0,
            						"org.xtext.example.mydsl.MusicDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeSignature"


    // $ANTLR start "entryRuleKey"
    // InternalMusicDsl.g:675:1: entryRuleKey returns [EObject current=null] : iv_ruleKey= ruleKey EOF ;
    public final EObject entryRuleKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKey = null;


        try {
            // InternalMusicDsl.g:675:44: (iv_ruleKey= ruleKey EOF )
            // InternalMusicDsl.g:676:2: iv_ruleKey= ruleKey EOF
            {
             newCompositeNode(grammarAccess.getKeyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKey=ruleKey();

            state._fsp--;

             current =iv_ruleKey; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKey"


    // $ANTLR start "ruleKey"
    // InternalMusicDsl.g:682:1: ruleKey returns [EObject current=null] : ( (lv_fifths_0_0= ruleEInt ) ) ;
    public final EObject ruleKey() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_fifths_0_0 = null;



        	enterRule();

        try {
            // InternalMusicDsl.g:688:2: ( ( (lv_fifths_0_0= ruleEInt ) ) )
            // InternalMusicDsl.g:689:2: ( (lv_fifths_0_0= ruleEInt ) )
            {
            // InternalMusicDsl.g:689:2: ( (lv_fifths_0_0= ruleEInt ) )
            // InternalMusicDsl.g:690:3: (lv_fifths_0_0= ruleEInt )
            {
            // InternalMusicDsl.g:690:3: (lv_fifths_0_0= ruleEInt )
            // InternalMusicDsl.g:691:4: lv_fifths_0_0= ruleEInt
            {

            				newCompositeNode(grammarAccess.getKeyAccess().getFifthsEIntParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_fifths_0_0=ruleEInt();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getKeyRule());
            				}
            				set(
            					current,
            					"fifths",
            					lv_fifths_0_0,
            					"org.xtext.example.mydsl.MusicDsl.EInt");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKey"


    // $ANTLR start "entryRuleMeasure"
    // InternalMusicDsl.g:711:1: entryRuleMeasure returns [EObject current=null] : iv_ruleMeasure= ruleMeasure EOF ;
    public final EObject entryRuleMeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasure = null;


        try {
            // InternalMusicDsl.g:711:48: (iv_ruleMeasure= ruleMeasure EOF )
            // InternalMusicDsl.g:712:2: iv_ruleMeasure= ruleMeasure EOF
            {
             newCompositeNode(grammarAccess.getMeasureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasure=ruleMeasure();

            state._fsp--;

             current =iv_ruleMeasure; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeasure"


    // $ANTLR start "ruleMeasure"
    // InternalMusicDsl.g:718:1: ruleMeasure returns [EObject current=null] : ( () otherlv_1= 'Measure' ( (lv_measureNumber_2_0= ruleEInt ) ) otherlv_3= 'begin' ( ( (lv_repetition_4_0= ruleRepetition ) ) (otherlv_5= ',' ( (lv_repetition_6_0= ruleRepetition ) ) )* )? ( ( (lv_rest_7_0= ruleRest ) ) (otherlv_8= ',' ( (lv_rest_9_0= ruleRest ) ) )* )? ( ( (lv_note_10_0= ruleNote ) ) (otherlv_11= ',' ( (lv_note_12_0= ruleNote ) ) )* )? otherlv_13= 'end' ) ;
    public final EObject ruleMeasure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_measureNumber_2_0 = null;

        EObject lv_repetition_4_0 = null;

        EObject lv_repetition_6_0 = null;

        EObject lv_rest_7_0 = null;

        EObject lv_rest_9_0 = null;

        EObject lv_note_10_0 = null;

        EObject lv_note_12_0 = null;



        	enterRule();

        try {
            // InternalMusicDsl.g:724:2: ( ( () otherlv_1= 'Measure' ( (lv_measureNumber_2_0= ruleEInt ) ) otherlv_3= 'begin' ( ( (lv_repetition_4_0= ruleRepetition ) ) (otherlv_5= ',' ( (lv_repetition_6_0= ruleRepetition ) ) )* )? ( ( (lv_rest_7_0= ruleRest ) ) (otherlv_8= ',' ( (lv_rest_9_0= ruleRest ) ) )* )? ( ( (lv_note_10_0= ruleNote ) ) (otherlv_11= ',' ( (lv_note_12_0= ruleNote ) ) )* )? otherlv_13= 'end' ) )
            // InternalMusicDsl.g:725:2: ( () otherlv_1= 'Measure' ( (lv_measureNumber_2_0= ruleEInt ) ) otherlv_3= 'begin' ( ( (lv_repetition_4_0= ruleRepetition ) ) (otherlv_5= ',' ( (lv_repetition_6_0= ruleRepetition ) ) )* )? ( ( (lv_rest_7_0= ruleRest ) ) (otherlv_8= ',' ( (lv_rest_9_0= ruleRest ) ) )* )? ( ( (lv_note_10_0= ruleNote ) ) (otherlv_11= ',' ( (lv_note_12_0= ruleNote ) ) )* )? otherlv_13= 'end' )
            {
            // InternalMusicDsl.g:725:2: ( () otherlv_1= 'Measure' ( (lv_measureNumber_2_0= ruleEInt ) ) otherlv_3= 'begin' ( ( (lv_repetition_4_0= ruleRepetition ) ) (otherlv_5= ',' ( (lv_repetition_6_0= ruleRepetition ) ) )* )? ( ( (lv_rest_7_0= ruleRest ) ) (otherlv_8= ',' ( (lv_rest_9_0= ruleRest ) ) )* )? ( ( (lv_note_10_0= ruleNote ) ) (otherlv_11= ',' ( (lv_note_12_0= ruleNote ) ) )* )? otherlv_13= 'end' )
            // InternalMusicDsl.g:726:3: () otherlv_1= 'Measure' ( (lv_measureNumber_2_0= ruleEInt ) ) otherlv_3= 'begin' ( ( (lv_repetition_4_0= ruleRepetition ) ) (otherlv_5= ',' ( (lv_repetition_6_0= ruleRepetition ) ) )* )? ( ( (lv_rest_7_0= ruleRest ) ) (otherlv_8= ',' ( (lv_rest_9_0= ruleRest ) ) )* )? ( ( (lv_note_10_0= ruleNote ) ) (otherlv_11= ',' ( (lv_note_12_0= ruleNote ) ) )* )? otherlv_13= 'end'
            {
            // InternalMusicDsl.g:726:3: ()
            // InternalMusicDsl.g:727:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureAccess().getMeasureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getMeasureAccess().getMeasureKeyword_1());
            		
            // InternalMusicDsl.g:737:3: ( (lv_measureNumber_2_0= ruleEInt ) )
            // InternalMusicDsl.g:738:4: (lv_measureNumber_2_0= ruleEInt )
            {
            // InternalMusicDsl.g:738:4: (lv_measureNumber_2_0= ruleEInt )
            // InternalMusicDsl.g:739:5: lv_measureNumber_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getMeasureAccess().getMeasureNumberEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_measureNumber_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureRule());
            					}
            					set(
            						current,
            						"measureNumber",
            						lv_measureNumber_2_0,
            						"org.xtext.example.mydsl.MusicDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getMeasureAccess().getBeginKeyword_3());
            		
            // InternalMusicDsl.g:760:3: ( ( (lv_repetition_4_0= ruleRepetition ) ) (otherlv_5= ',' ( (lv_repetition_6_0= ruleRepetition ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMusicDsl.g:761:4: ( (lv_repetition_4_0= ruleRepetition ) ) (otherlv_5= ',' ( (lv_repetition_6_0= ruleRepetition ) ) )*
                    {
                    // InternalMusicDsl.g:761:4: ( (lv_repetition_4_0= ruleRepetition ) )
                    // InternalMusicDsl.g:762:5: (lv_repetition_4_0= ruleRepetition )
                    {
                    // InternalMusicDsl.g:762:5: (lv_repetition_4_0= ruleRepetition )
                    // InternalMusicDsl.g:763:6: lv_repetition_4_0= ruleRepetition
                    {

                    						newCompositeNode(grammarAccess.getMeasureAccess().getRepetitionRepetitionParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_repetition_4_0=ruleRepetition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureRule());
                    						}
                    						add(
                    							current,
                    							"repetition",
                    							lv_repetition_4_0,
                    							"org.xtext.example.mydsl.MusicDsl.Repetition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMusicDsl.g:780:4: (otherlv_5= ',' ( (lv_repetition_6_0= ruleRepetition ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==17) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalMusicDsl.g:781:5: otherlv_5= ',' ( (lv_repetition_6_0= ruleRepetition ) )
                    	    {
                    	    otherlv_5=(Token)match(input,17,FOLLOW_21); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getMeasureAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalMusicDsl.g:785:5: ( (lv_repetition_6_0= ruleRepetition ) )
                    	    // InternalMusicDsl.g:786:6: (lv_repetition_6_0= ruleRepetition )
                    	    {
                    	    // InternalMusicDsl.g:786:6: (lv_repetition_6_0= ruleRepetition )
                    	    // InternalMusicDsl.g:787:7: lv_repetition_6_0= ruleRepetition
                    	    {

                    	    							newCompositeNode(grammarAccess.getMeasureAccess().getRepetitionRepetitionParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_repetition_6_0=ruleRepetition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMeasureRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"repetition",
                    	    								lv_repetition_6_0,
                    	    								"org.xtext.example.mydsl.MusicDsl.Repetition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMusicDsl.g:806:3: ( ( (lv_rest_7_0= ruleRest ) ) (otherlv_8= ',' ( (lv_rest_9_0= ruleRest ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMusicDsl.g:807:4: ( (lv_rest_7_0= ruleRest ) ) (otherlv_8= ',' ( (lv_rest_9_0= ruleRest ) ) )*
                    {
                    // InternalMusicDsl.g:807:4: ( (lv_rest_7_0= ruleRest ) )
                    // InternalMusicDsl.g:808:5: (lv_rest_7_0= ruleRest )
                    {
                    // InternalMusicDsl.g:808:5: (lv_rest_7_0= ruleRest )
                    // InternalMusicDsl.g:809:6: lv_rest_7_0= ruleRest
                    {

                    						newCompositeNode(grammarAccess.getMeasureAccess().getRestRestParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_rest_7_0=ruleRest();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureRule());
                    						}
                    						add(
                    							current,
                    							"rest",
                    							lv_rest_7_0,
                    							"org.xtext.example.mydsl.MusicDsl.Rest");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMusicDsl.g:826:4: (otherlv_8= ',' ( (lv_rest_9_0= ruleRest ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==17) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalMusicDsl.g:827:5: otherlv_8= ',' ( (lv_rest_9_0= ruleRest ) )
                    	    {
                    	    otherlv_8=(Token)match(input,17,FOLLOW_22); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getMeasureAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalMusicDsl.g:831:5: ( (lv_rest_9_0= ruleRest ) )
                    	    // InternalMusicDsl.g:832:6: (lv_rest_9_0= ruleRest )
                    	    {
                    	    // InternalMusicDsl.g:832:6: (lv_rest_9_0= ruleRest )
                    	    // InternalMusicDsl.g:833:7: lv_rest_9_0= ruleRest
                    	    {

                    	    							newCompositeNode(grammarAccess.getMeasureAccess().getRestRestParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_rest_9_0=ruleRest();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMeasureRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rest",
                    	    								lv_rest_9_0,
                    	    								"org.xtext.example.mydsl.MusicDsl.Rest");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMusicDsl.g:852:3: ( ( (lv_note_10_0= ruleNote ) ) (otherlv_11= ',' ( (lv_note_12_0= ruleNote ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMusicDsl.g:853:4: ( (lv_note_10_0= ruleNote ) ) (otherlv_11= ',' ( (lv_note_12_0= ruleNote ) ) )*
                    {
                    // InternalMusicDsl.g:853:4: ( (lv_note_10_0= ruleNote ) )
                    // InternalMusicDsl.g:854:5: (lv_note_10_0= ruleNote )
                    {
                    // InternalMusicDsl.g:854:5: (lv_note_10_0= ruleNote )
                    // InternalMusicDsl.g:855:6: lv_note_10_0= ruleNote
                    {

                    						newCompositeNode(grammarAccess.getMeasureAccess().getNoteNoteParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_note_10_0=ruleNote();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureRule());
                    						}
                    						add(
                    							current,
                    							"note",
                    							lv_note_10_0,
                    							"org.xtext.example.mydsl.MusicDsl.Note");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMusicDsl.g:872:4: (otherlv_11= ',' ( (lv_note_12_0= ruleNote ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==17) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalMusicDsl.g:873:5: otherlv_11= ',' ( (lv_note_12_0= ruleNote ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FOLLOW_15); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getMeasureAccess().getCommaKeyword_6_1_0());
                    	    				
                    	    // InternalMusicDsl.g:877:5: ( (lv_note_12_0= ruleNote ) )
                    	    // InternalMusicDsl.g:878:6: (lv_note_12_0= ruleNote )
                    	    {
                    	    // InternalMusicDsl.g:878:6: (lv_note_12_0= ruleNote )
                    	    // InternalMusicDsl.g:879:7: lv_note_12_0= ruleNote
                    	    {

                    	    							newCompositeNode(grammarAccess.getMeasureAccess().getNoteNoteParserRuleCall_6_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_note_12_0=ruleNote();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMeasureRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"note",
                    	    								lv_note_12_0,
                    	    								"org.xtext.example.mydsl.MusicDsl.Note");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getMeasureAccess().getEndKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMeasure"


    // $ANTLR start "entryRuleRest"
    // InternalMusicDsl.g:906:1: entryRuleRest returns [EObject current=null] : iv_ruleRest= ruleRest EOF ;
    public final EObject entryRuleRest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRest = null;


        try {
            // InternalMusicDsl.g:906:45: (iv_ruleRest= ruleRest EOF )
            // InternalMusicDsl.g:907:2: iv_ruleRest= ruleRest EOF
            {
             newCompositeNode(grammarAccess.getRestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRest=ruleRest();

            state._fsp--;

             current =iv_ruleRest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRest"


    // $ANTLR start "ruleRest"
    // InternalMusicDsl.g:913:1: ruleRest returns [EObject current=null] : ( () otherlv_1= 'rest' ( (lv_type_2_0= ruleRestType ) )? ) ;
    public final EObject ruleRest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalMusicDsl.g:919:2: ( ( () otherlv_1= 'rest' ( (lv_type_2_0= ruleRestType ) )? ) )
            // InternalMusicDsl.g:920:2: ( () otherlv_1= 'rest' ( (lv_type_2_0= ruleRestType ) )? )
            {
            // InternalMusicDsl.g:920:2: ( () otherlv_1= 'rest' ( (lv_type_2_0= ruleRestType ) )? )
            // InternalMusicDsl.g:921:3: () otherlv_1= 'rest' ( (lv_type_2_0= ruleRestType ) )?
            {
            // InternalMusicDsl.g:921:3: ()
            // InternalMusicDsl.g:922:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRestAccess().getRestAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getRestAccess().getRestKeyword_1());
            		
            // InternalMusicDsl.g:932:3: ( (lv_type_2_0= ruleRestType ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=49 && LA19_0<=55)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMusicDsl.g:933:4: (lv_type_2_0= ruleRestType )
                    {
                    // InternalMusicDsl.g:933:4: (lv_type_2_0= ruleRestType )
                    // InternalMusicDsl.g:934:5: lv_type_2_0= ruleRestType
                    {

                    					newCompositeNode(grammarAccess.getRestAccess().getTypeRestTypeEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_2_0=ruleRestType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRestRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_2_0,
                    						"org.xtext.example.mydsl.MusicDsl.RestType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRest"


    // $ANTLR start "entryRuleRepetition"
    // InternalMusicDsl.g:955:1: entryRuleRepetition returns [EObject current=null] : iv_ruleRepetition= ruleRepetition EOF ;
    public final EObject entryRuleRepetition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepetition = null;


        try {
            // InternalMusicDsl.g:955:51: (iv_ruleRepetition= ruleRepetition EOF )
            // InternalMusicDsl.g:956:2: iv_ruleRepetition= ruleRepetition EOF
            {
             newCompositeNode(grammarAccess.getRepetitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepetition=ruleRepetition();

            state._fsp--;

             current =iv_ruleRepetition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepetition"


    // $ANTLR start "ruleRepetition"
    // InternalMusicDsl.g:962:1: ruleRepetition returns [EObject current=null] : ( () otherlv_1= 'repetition' ( (lv_type_2_0= ruleRepetitionType ) )? ) ;
    public final EObject ruleRepetition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalMusicDsl.g:968:2: ( ( () otherlv_1= 'repetition' ( (lv_type_2_0= ruleRepetitionType ) )? ) )
            // InternalMusicDsl.g:969:2: ( () otherlv_1= 'repetition' ( (lv_type_2_0= ruleRepetitionType ) )? )
            {
            // InternalMusicDsl.g:969:2: ( () otherlv_1= 'repetition' ( (lv_type_2_0= ruleRepetitionType ) )? )
            // InternalMusicDsl.g:970:3: () otherlv_1= 'repetition' ( (lv_type_2_0= ruleRepetitionType ) )?
            {
            // InternalMusicDsl.g:970:3: ()
            // InternalMusicDsl.g:971:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRepetitionAccess().getRepetitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getRepetitionAccess().getRepetitionKeyword_1());
            		
            // InternalMusicDsl.g:981:3: ( (lv_type_2_0= ruleRepetitionType ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=56 && LA20_0<=57)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMusicDsl.g:982:4: (lv_type_2_0= ruleRepetitionType )
                    {
                    // InternalMusicDsl.g:982:4: (lv_type_2_0= ruleRepetitionType )
                    // InternalMusicDsl.g:983:5: lv_type_2_0= ruleRepetitionType
                    {

                    					newCompositeNode(grammarAccess.getRepetitionAccess().getTypeRepetitionTypeEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_2_0=ruleRepetitionType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRepetitionRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_2_0,
                    						"org.xtext.example.mydsl.MusicDsl.RepetitionType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepetition"


    // $ANTLR start "entryRuleNote"
    // InternalMusicDsl.g:1004:1: entryRuleNote returns [EObject current=null] : iv_ruleNote= ruleNote EOF ;
    public final EObject entryRuleNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNote = null;


        try {
            // InternalMusicDsl.g:1004:45: (iv_ruleNote= ruleNote EOF )
            // InternalMusicDsl.g:1005:2: iv_ruleNote= ruleNote EOF
            {
             newCompositeNode(grammarAccess.getNoteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNote=ruleNote();

            state._fsp--;

             current =iv_ruleNote; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNote"


    // $ANTLR start "ruleNote"
    // InternalMusicDsl.g:1011:1: ruleNote returns [EObject current=null] : ( () otherlv_1= 'note' ( (lv_name_2_0= ruleNoteName ) ) otherlv_3= ':' (otherlv_4= 'type' ( (lv_type_5_0= ruleNoteType ) ) )? (otherlv_6= 'duration' ( (lv_duration_7_0= ruleEInt ) ) )? (otherlv_8= 'octave' ( (lv_octave_9_0= ruleEInt ) ) )? (otherlv_10= 'voice' ( (lv_voice_11_0= ruleEInt ) ) )? (otherlv_12= 'dynamic' ( (lv_dynamic_13_0= ruleEString ) ) )? (otherlv_14= 'accidental' ( (lv_accidental_15_0= ruleAccidentalType ) ) )? (otherlv_16= 'lyrics' ( (lv_lyrics_17_0= ruleEString ) ) )? ( (lv_fermata_18_0= 'fermata' ) )? ( (lv_dot_19_0= 'dot' ) )? ( (lv_chord_20_0= 'chord' ) )? ( ( (lv_notation_21_0= ruleNotation ) ) (otherlv_22= ',' ( (lv_notation_23_0= ruleNotation ) ) )* )? ) ;
    public final EObject ruleNote() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token lv_fermata_18_0=null;
        Token lv_dot_19_0=null;
        Token lv_chord_20_0=null;
        Token otherlv_22=null;
        Enumerator lv_name_2_0 = null;

        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_duration_7_0 = null;

        AntlrDatatypeRuleToken lv_octave_9_0 = null;

        AntlrDatatypeRuleToken lv_voice_11_0 = null;

        AntlrDatatypeRuleToken lv_dynamic_13_0 = null;

        Enumerator lv_accidental_15_0 = null;

        AntlrDatatypeRuleToken lv_lyrics_17_0 = null;

        EObject lv_notation_21_0 = null;

        EObject lv_notation_23_0 = null;



        	enterRule();

        try {
            // InternalMusicDsl.g:1017:2: ( ( () otherlv_1= 'note' ( (lv_name_2_0= ruleNoteName ) ) otherlv_3= ':' (otherlv_4= 'type' ( (lv_type_5_0= ruleNoteType ) ) )? (otherlv_6= 'duration' ( (lv_duration_7_0= ruleEInt ) ) )? (otherlv_8= 'octave' ( (lv_octave_9_0= ruleEInt ) ) )? (otherlv_10= 'voice' ( (lv_voice_11_0= ruleEInt ) ) )? (otherlv_12= 'dynamic' ( (lv_dynamic_13_0= ruleEString ) ) )? (otherlv_14= 'accidental' ( (lv_accidental_15_0= ruleAccidentalType ) ) )? (otherlv_16= 'lyrics' ( (lv_lyrics_17_0= ruleEString ) ) )? ( (lv_fermata_18_0= 'fermata' ) )? ( (lv_dot_19_0= 'dot' ) )? ( (lv_chord_20_0= 'chord' ) )? ( ( (lv_notation_21_0= ruleNotation ) ) (otherlv_22= ',' ( (lv_notation_23_0= ruleNotation ) ) )* )? ) )
            // InternalMusicDsl.g:1018:2: ( () otherlv_1= 'note' ( (lv_name_2_0= ruleNoteName ) ) otherlv_3= ':' (otherlv_4= 'type' ( (lv_type_5_0= ruleNoteType ) ) )? (otherlv_6= 'duration' ( (lv_duration_7_0= ruleEInt ) ) )? (otherlv_8= 'octave' ( (lv_octave_9_0= ruleEInt ) ) )? (otherlv_10= 'voice' ( (lv_voice_11_0= ruleEInt ) ) )? (otherlv_12= 'dynamic' ( (lv_dynamic_13_0= ruleEString ) ) )? (otherlv_14= 'accidental' ( (lv_accidental_15_0= ruleAccidentalType ) ) )? (otherlv_16= 'lyrics' ( (lv_lyrics_17_0= ruleEString ) ) )? ( (lv_fermata_18_0= 'fermata' ) )? ( (lv_dot_19_0= 'dot' ) )? ( (lv_chord_20_0= 'chord' ) )? ( ( (lv_notation_21_0= ruleNotation ) ) (otherlv_22= ',' ( (lv_notation_23_0= ruleNotation ) ) )* )? )
            {
            // InternalMusicDsl.g:1018:2: ( () otherlv_1= 'note' ( (lv_name_2_0= ruleNoteName ) ) otherlv_3= ':' (otherlv_4= 'type' ( (lv_type_5_0= ruleNoteType ) ) )? (otherlv_6= 'duration' ( (lv_duration_7_0= ruleEInt ) ) )? (otherlv_8= 'octave' ( (lv_octave_9_0= ruleEInt ) ) )? (otherlv_10= 'voice' ( (lv_voice_11_0= ruleEInt ) ) )? (otherlv_12= 'dynamic' ( (lv_dynamic_13_0= ruleEString ) ) )? (otherlv_14= 'accidental' ( (lv_accidental_15_0= ruleAccidentalType ) ) )? (otherlv_16= 'lyrics' ( (lv_lyrics_17_0= ruleEString ) ) )? ( (lv_fermata_18_0= 'fermata' ) )? ( (lv_dot_19_0= 'dot' ) )? ( (lv_chord_20_0= 'chord' ) )? ( ( (lv_notation_21_0= ruleNotation ) ) (otherlv_22= ',' ( (lv_notation_23_0= ruleNotation ) ) )* )? )
            // InternalMusicDsl.g:1019:3: () otherlv_1= 'note' ( (lv_name_2_0= ruleNoteName ) ) otherlv_3= ':' (otherlv_4= 'type' ( (lv_type_5_0= ruleNoteType ) ) )? (otherlv_6= 'duration' ( (lv_duration_7_0= ruleEInt ) ) )? (otherlv_8= 'octave' ( (lv_octave_9_0= ruleEInt ) ) )? (otherlv_10= 'voice' ( (lv_voice_11_0= ruleEInt ) ) )? (otherlv_12= 'dynamic' ( (lv_dynamic_13_0= ruleEString ) ) )? (otherlv_14= 'accidental' ( (lv_accidental_15_0= ruleAccidentalType ) ) )? (otherlv_16= 'lyrics' ( (lv_lyrics_17_0= ruleEString ) ) )? ( (lv_fermata_18_0= 'fermata' ) )? ( (lv_dot_19_0= 'dot' ) )? ( (lv_chord_20_0= 'chord' ) )? ( ( (lv_notation_21_0= ruleNotation ) ) (otherlv_22= ',' ( (lv_notation_23_0= ruleNotation ) ) )* )?
            {
            // InternalMusicDsl.g:1019:3: ()
            // InternalMusicDsl.g:1020:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNoteAccess().getNoteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getNoteAccess().getNoteKeyword_1());
            		
            // InternalMusicDsl.g:1030:3: ( (lv_name_2_0= ruleNoteName ) )
            // InternalMusicDsl.g:1031:4: (lv_name_2_0= ruleNoteName )
            {
            // InternalMusicDsl.g:1031:4: (lv_name_2_0= ruleNoteName )
            // InternalMusicDsl.g:1032:5: lv_name_2_0= ruleNoteName
            {

            					newCompositeNode(grammarAccess.getNoteAccess().getNameNoteNameEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
            lv_name_2_0=ruleNoteName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNoteRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MusicDsl.NoteName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getNoteAccess().getColonKeyword_3());
            		
            // InternalMusicDsl.g:1053:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleNoteType ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMusicDsl.g:1054:4: otherlv_4= 'type' ( (lv_type_5_0= ruleNoteType ) )
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_29); 

                    				newLeafNode(otherlv_4, grammarAccess.getNoteAccess().getTypeKeyword_4_0());
                    			
                    // InternalMusicDsl.g:1058:4: ( (lv_type_5_0= ruleNoteType ) )
                    // InternalMusicDsl.g:1059:5: (lv_type_5_0= ruleNoteType )
                    {
                    // InternalMusicDsl.g:1059:5: (lv_type_5_0= ruleNoteType )
                    // InternalMusicDsl.g:1060:6: lv_type_5_0= ruleNoteType
                    {

                    						newCompositeNode(grammarAccess.getNoteAccess().getTypeNoteTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_type_5_0=ruleNoteType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNoteRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"org.xtext.example.mydsl.MusicDsl.NoteType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMusicDsl.g:1078:3: (otherlv_6= 'duration' ( (lv_duration_7_0= ruleEInt ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMusicDsl.g:1079:4: otherlv_6= 'duration' ( (lv_duration_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getNoteAccess().getDurationKeyword_5_0());
                    			
                    // InternalMusicDsl.g:1083:4: ( (lv_duration_7_0= ruleEInt ) )
                    // InternalMusicDsl.g:1084:5: (lv_duration_7_0= ruleEInt )
                    {
                    // InternalMusicDsl.g:1084:5: (lv_duration_7_0= ruleEInt )
                    // InternalMusicDsl.g:1085:6: lv_duration_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getNoteAccess().getDurationEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_duration_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNoteRule());
                    						}
                    						set(
                    							current,
                    							"duration",
                    							lv_duration_7_0,
                    							"org.xtext.example.mydsl.MusicDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMusicDsl.g:1103:3: (otherlv_8= 'octave' ( (lv_octave_9_0= ruleEInt ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMusicDsl.g:1104:4: otherlv_8= 'octave' ( (lv_octave_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,35,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getNoteAccess().getOctaveKeyword_6_0());
                    			
                    // InternalMusicDsl.g:1108:4: ( (lv_octave_9_0= ruleEInt ) )
                    // InternalMusicDsl.g:1109:5: (lv_octave_9_0= ruleEInt )
                    {
                    // InternalMusicDsl.g:1109:5: (lv_octave_9_0= ruleEInt )
                    // InternalMusicDsl.g:1110:6: lv_octave_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getNoteAccess().getOctaveEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_octave_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNoteRule());
                    						}
                    						set(
                    							current,
                    							"octave",
                    							lv_octave_9_0,
                    							"org.xtext.example.mydsl.MusicDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMusicDsl.g:1128:3: (otherlv_10= 'voice' ( (lv_voice_11_0= ruleEInt ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==36) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMusicDsl.g:1129:4: otherlv_10= 'voice' ( (lv_voice_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,36,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getNoteAccess().getVoiceKeyword_7_0());
                    			
                    // InternalMusicDsl.g:1133:4: ( (lv_voice_11_0= ruleEInt ) )
                    // InternalMusicDsl.g:1134:5: (lv_voice_11_0= ruleEInt )
                    {
                    // InternalMusicDsl.g:1134:5: (lv_voice_11_0= ruleEInt )
                    // InternalMusicDsl.g:1135:6: lv_voice_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getNoteAccess().getVoiceEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_voice_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNoteRule());
                    						}
                    						set(
                    							current,
                    							"voice",
                    							lv_voice_11_0,
                    							"org.xtext.example.mydsl.MusicDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMusicDsl.g:1153:3: (otherlv_12= 'dynamic' ( (lv_dynamic_13_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMusicDsl.g:1154:4: otherlv_12= 'dynamic' ( (lv_dynamic_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getNoteAccess().getDynamicKeyword_8_0());
                    			
                    // InternalMusicDsl.g:1158:4: ( (lv_dynamic_13_0= ruleEString ) )
                    // InternalMusicDsl.g:1159:5: (lv_dynamic_13_0= ruleEString )
                    {
                    // InternalMusicDsl.g:1159:5: (lv_dynamic_13_0= ruleEString )
                    // InternalMusicDsl.g:1160:6: lv_dynamic_13_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getNoteAccess().getDynamicEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_dynamic_13_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNoteRule());
                    						}
                    						set(
                    							current,
                    							"dynamic",
                    							lv_dynamic_13_0,
                    							"org.xtext.example.mydsl.MusicDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMusicDsl.g:1178:3: (otherlv_14= 'accidental' ( (lv_accidental_15_0= ruleAccidentalType ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMusicDsl.g:1179:4: otherlv_14= 'accidental' ( (lv_accidental_15_0= ruleAccidentalType ) )
                    {
                    otherlv_14=(Token)match(input,38,FOLLOW_35); 

                    				newLeafNode(otherlv_14, grammarAccess.getNoteAccess().getAccidentalKeyword_9_0());
                    			
                    // InternalMusicDsl.g:1183:4: ( (lv_accidental_15_0= ruleAccidentalType ) )
                    // InternalMusicDsl.g:1184:5: (lv_accidental_15_0= ruleAccidentalType )
                    {
                    // InternalMusicDsl.g:1184:5: (lv_accidental_15_0= ruleAccidentalType )
                    // InternalMusicDsl.g:1185:6: lv_accidental_15_0= ruleAccidentalType
                    {

                    						newCompositeNode(grammarAccess.getNoteAccess().getAccidentalAccidentalTypeEnumRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_accidental_15_0=ruleAccidentalType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNoteRule());
                    						}
                    						set(
                    							current,
                    							"accidental",
                    							lv_accidental_15_0,
                    							"org.xtext.example.mydsl.MusicDsl.AccidentalType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMusicDsl.g:1203:3: (otherlv_16= 'lyrics' ( (lv_lyrics_17_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMusicDsl.g:1204:4: otherlv_16= 'lyrics' ( (lv_lyrics_17_0= ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getNoteAccess().getLyricsKeyword_10_0());
                    			
                    // InternalMusicDsl.g:1208:4: ( (lv_lyrics_17_0= ruleEString ) )
                    // InternalMusicDsl.g:1209:5: (lv_lyrics_17_0= ruleEString )
                    {
                    // InternalMusicDsl.g:1209:5: (lv_lyrics_17_0= ruleEString )
                    // InternalMusicDsl.g:1210:6: lv_lyrics_17_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getNoteAccess().getLyricsEStringParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_lyrics_17_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNoteRule());
                    						}
                    						set(
                    							current,
                    							"lyrics",
                    							lv_lyrics_17_0,
                    							"org.xtext.example.mydsl.MusicDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMusicDsl.g:1228:3: ( (lv_fermata_18_0= 'fermata' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMusicDsl.g:1229:4: (lv_fermata_18_0= 'fermata' )
                    {
                    // InternalMusicDsl.g:1229:4: (lv_fermata_18_0= 'fermata' )
                    // InternalMusicDsl.g:1230:5: lv_fermata_18_0= 'fermata'
                    {
                    lv_fermata_18_0=(Token)match(input,40,FOLLOW_38); 

                    					newLeafNode(lv_fermata_18_0, grammarAccess.getNoteAccess().getFermataFermataKeyword_11_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNoteRule());
                    					}
                    					setWithLastConsumed(current, "fermata", true, "fermata");
                    				

                    }


                    }
                    break;

            }

            // InternalMusicDsl.g:1242:3: ( (lv_dot_19_0= 'dot' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==41) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMusicDsl.g:1243:4: (lv_dot_19_0= 'dot' )
                    {
                    // InternalMusicDsl.g:1243:4: (lv_dot_19_0= 'dot' )
                    // InternalMusicDsl.g:1244:5: lv_dot_19_0= 'dot'
                    {
                    lv_dot_19_0=(Token)match(input,41,FOLLOW_39); 

                    					newLeafNode(lv_dot_19_0, grammarAccess.getNoteAccess().getDotDotKeyword_12_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNoteRule());
                    					}
                    					setWithLastConsumed(current, "dot", true, "dot");
                    				

                    }


                    }
                    break;

            }

            // InternalMusicDsl.g:1256:3: ( (lv_chord_20_0= 'chord' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==42) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMusicDsl.g:1257:4: (lv_chord_20_0= 'chord' )
                    {
                    // InternalMusicDsl.g:1257:4: (lv_chord_20_0= 'chord' )
                    // InternalMusicDsl.g:1258:5: lv_chord_20_0= 'chord'
                    {
                    lv_chord_20_0=(Token)match(input,42,FOLLOW_40); 

                    					newLeafNode(lv_chord_20_0, grammarAccess.getNoteAccess().getChordChordKeyword_13_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNoteRule());
                    					}
                    					setWithLastConsumed(current, "chord", true, "chord");
                    				

                    }


                    }
                    break;

            }

            // InternalMusicDsl.g:1270:3: ( ( (lv_notation_21_0= ruleNotation ) ) (otherlv_22= ',' ( (lv_notation_23_0= ruleNotation ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==43) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMusicDsl.g:1271:4: ( (lv_notation_21_0= ruleNotation ) ) (otherlv_22= ',' ( (lv_notation_23_0= ruleNotation ) ) )*
                    {
                    // InternalMusicDsl.g:1271:4: ( (lv_notation_21_0= ruleNotation ) )
                    // InternalMusicDsl.g:1272:5: (lv_notation_21_0= ruleNotation )
                    {
                    // InternalMusicDsl.g:1272:5: (lv_notation_21_0= ruleNotation )
                    // InternalMusicDsl.g:1273:6: lv_notation_21_0= ruleNotation
                    {

                    						newCompositeNode(grammarAccess.getNoteAccess().getNotationNotationParserRuleCall_14_0_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_notation_21_0=ruleNotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNoteRule());
                    						}
                    						add(
                    							current,
                    							"notation",
                    							lv_notation_21_0,
                    							"org.xtext.example.mydsl.MusicDsl.Notation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMusicDsl.g:1290:4: (otherlv_22= ',' ( (lv_notation_23_0= ruleNotation ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==17) ) {
                            int LA31_2 = input.LA(2);

                            if ( (LA31_2==43) ) {
                                alt31=1;
                            }


                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalMusicDsl.g:1291:5: otherlv_22= ',' ( (lv_notation_23_0= ruleNotation ) )
                    	    {
                    	    otherlv_22=(Token)match(input,17,FOLLOW_42); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getNoteAccess().getCommaKeyword_14_1_0());
                    	    				
                    	    // InternalMusicDsl.g:1295:5: ( (lv_notation_23_0= ruleNotation ) )
                    	    // InternalMusicDsl.g:1296:6: (lv_notation_23_0= ruleNotation )
                    	    {
                    	    // InternalMusicDsl.g:1296:6: (lv_notation_23_0= ruleNotation )
                    	    // InternalMusicDsl.g:1297:7: lv_notation_23_0= ruleNotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getNoteAccess().getNotationNotationParserRuleCall_14_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
                    	    lv_notation_23_0=ruleNotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNoteRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"notation",
                    	    								lv_notation_23_0,
                    	    								"org.xtext.example.mydsl.MusicDsl.Notation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNote"


    // $ANTLR start "entryRuleNotation"
    // InternalMusicDsl.g:1320:1: entryRuleNotation returns [EObject current=null] : iv_ruleNotation= ruleNotation EOF ;
    public final EObject entryRuleNotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotation = null;


        try {
            // InternalMusicDsl.g:1320:49: (iv_ruleNotation= ruleNotation EOF )
            // InternalMusicDsl.g:1321:2: iv_ruleNotation= ruleNotation EOF
            {
             newCompositeNode(grammarAccess.getNotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotation=ruleNotation();

            state._fsp--;

             current =iv_ruleNotation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotation"


    // $ANTLR start "ruleNotation"
    // InternalMusicDsl.g:1327:1: ruleNotation returns [EObject current=null] : ( () otherlv_1= 'notation:' (otherlv_2= 'articulation' ( (lv_articulation_3_0= ruleArticulationType ) ) )? (otherlv_4= 'ornament' ( (lv_ornament_5_0= ruleOrnamentType ) ) )? (otherlv_6= 'slur' ( (lv_slur_7_0= ruleSlurType ) ) )? ) ;
    public final EObject ruleNotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_articulation_3_0 = null;

        Enumerator lv_ornament_5_0 = null;

        Enumerator lv_slur_7_0 = null;



        	enterRule();

        try {
            // InternalMusicDsl.g:1333:2: ( ( () otherlv_1= 'notation:' (otherlv_2= 'articulation' ( (lv_articulation_3_0= ruleArticulationType ) ) )? (otherlv_4= 'ornament' ( (lv_ornament_5_0= ruleOrnamentType ) ) )? (otherlv_6= 'slur' ( (lv_slur_7_0= ruleSlurType ) ) )? ) )
            // InternalMusicDsl.g:1334:2: ( () otherlv_1= 'notation:' (otherlv_2= 'articulation' ( (lv_articulation_3_0= ruleArticulationType ) ) )? (otherlv_4= 'ornament' ( (lv_ornament_5_0= ruleOrnamentType ) ) )? (otherlv_6= 'slur' ( (lv_slur_7_0= ruleSlurType ) ) )? )
            {
            // InternalMusicDsl.g:1334:2: ( () otherlv_1= 'notation:' (otherlv_2= 'articulation' ( (lv_articulation_3_0= ruleArticulationType ) ) )? (otherlv_4= 'ornament' ( (lv_ornament_5_0= ruleOrnamentType ) ) )? (otherlv_6= 'slur' ( (lv_slur_7_0= ruleSlurType ) ) )? )
            // InternalMusicDsl.g:1335:3: () otherlv_1= 'notation:' (otherlv_2= 'articulation' ( (lv_articulation_3_0= ruleArticulationType ) ) )? (otherlv_4= 'ornament' ( (lv_ornament_5_0= ruleOrnamentType ) ) )? (otherlv_6= 'slur' ( (lv_slur_7_0= ruleSlurType ) ) )?
            {
            // InternalMusicDsl.g:1335:3: ()
            // InternalMusicDsl.g:1336:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNotationAccess().getNotationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getNotationAccess().getNotationKeyword_1());
            		
            // InternalMusicDsl.g:1346:3: (otherlv_2= 'articulation' ( (lv_articulation_3_0= ruleArticulationType ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==44) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMusicDsl.g:1347:4: otherlv_2= 'articulation' ( (lv_articulation_3_0= ruleArticulationType ) )
                    {
                    otherlv_2=(Token)match(input,44,FOLLOW_44); 

                    				newLeafNode(otherlv_2, grammarAccess.getNotationAccess().getArticulationKeyword_2_0());
                    			
                    // InternalMusicDsl.g:1351:4: ( (lv_articulation_3_0= ruleArticulationType ) )
                    // InternalMusicDsl.g:1352:5: (lv_articulation_3_0= ruleArticulationType )
                    {
                    // InternalMusicDsl.g:1352:5: (lv_articulation_3_0= ruleArticulationType )
                    // InternalMusicDsl.g:1353:6: lv_articulation_3_0= ruleArticulationType
                    {

                    						newCompositeNode(grammarAccess.getNotationAccess().getArticulationArticulationTypeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_articulation_3_0=ruleArticulationType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNotationRule());
                    						}
                    						set(
                    							current,
                    							"articulation",
                    							lv_articulation_3_0,
                    							"org.xtext.example.mydsl.MusicDsl.ArticulationType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMusicDsl.g:1371:3: (otherlv_4= 'ornament' ( (lv_ornament_5_0= ruleOrnamentType ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==45) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMusicDsl.g:1372:4: otherlv_4= 'ornament' ( (lv_ornament_5_0= ruleOrnamentType ) )
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_46); 

                    				newLeafNode(otherlv_4, grammarAccess.getNotationAccess().getOrnamentKeyword_3_0());
                    			
                    // InternalMusicDsl.g:1376:4: ( (lv_ornament_5_0= ruleOrnamentType ) )
                    // InternalMusicDsl.g:1377:5: (lv_ornament_5_0= ruleOrnamentType )
                    {
                    // InternalMusicDsl.g:1377:5: (lv_ornament_5_0= ruleOrnamentType )
                    // InternalMusicDsl.g:1378:6: lv_ornament_5_0= ruleOrnamentType
                    {

                    						newCompositeNode(grammarAccess.getNotationAccess().getOrnamentOrnamentTypeEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_ornament_5_0=ruleOrnamentType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNotationRule());
                    						}
                    						set(
                    							current,
                    							"ornament",
                    							lv_ornament_5_0,
                    							"org.xtext.example.mydsl.MusicDsl.OrnamentType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMusicDsl.g:1396:3: (otherlv_6= 'slur' ( (lv_slur_7_0= ruleSlurType ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==46) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMusicDsl.g:1397:4: otherlv_6= 'slur' ( (lv_slur_7_0= ruleSlurType ) )
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_48); 

                    				newLeafNode(otherlv_6, grammarAccess.getNotationAccess().getSlurKeyword_4_0());
                    			
                    // InternalMusicDsl.g:1401:4: ( (lv_slur_7_0= ruleSlurType ) )
                    // InternalMusicDsl.g:1402:5: (lv_slur_7_0= ruleSlurType )
                    {
                    // InternalMusicDsl.g:1402:5: (lv_slur_7_0= ruleSlurType )
                    // InternalMusicDsl.g:1403:6: lv_slur_7_0= ruleSlurType
                    {

                    						newCompositeNode(grammarAccess.getNotationAccess().getSlurSlurTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_slur_7_0=ruleSlurType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNotationRule());
                    						}
                    						set(
                    							current,
                    							"slur",
                    							lv_slur_7_0,
                    							"org.xtext.example.mydsl.MusicDsl.SlurType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNotation"


    // $ANTLR start "ruleClefType"
    // InternalMusicDsl.g:1425:1: ruleClefType returns [Enumerator current=null] : ( (enumLiteral_0= 'violin' ) | (enumLiteral_1= 'bass' ) ) ;
    public final Enumerator ruleClefType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMusicDsl.g:1431:2: ( ( (enumLiteral_0= 'violin' ) | (enumLiteral_1= 'bass' ) ) )
            // InternalMusicDsl.g:1432:2: ( (enumLiteral_0= 'violin' ) | (enumLiteral_1= 'bass' ) )
            {
            // InternalMusicDsl.g:1432:2: ( (enumLiteral_0= 'violin' ) | (enumLiteral_1= 'bass' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==47) ) {
                alt36=1;
            }
            else if ( (LA36_0==48) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalMusicDsl.g:1433:3: (enumLiteral_0= 'violin' )
                    {
                    // InternalMusicDsl.g:1433:3: (enumLiteral_0= 'violin' )
                    // InternalMusicDsl.g:1434:4: enumLiteral_0= 'violin'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getClefTypeAccess().getViolinEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getClefTypeAccess().getViolinEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMusicDsl.g:1441:3: (enumLiteral_1= 'bass' )
                    {
                    // InternalMusicDsl.g:1441:3: (enumLiteral_1= 'bass' )
                    // InternalMusicDsl.g:1442:4: enumLiteral_1= 'bass'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getClefTypeAccess().getBassEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getClefTypeAccess().getBassEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClefType"


    // $ANTLR start "ruleRestType"
    // InternalMusicDsl.g:1452:1: ruleRestType returns [Enumerator current=null] : ( (enumLiteral_0= 'whole' ) | (enumLiteral_1= 'half' ) | (enumLiteral_2= 'quarter' ) | (enumLiteral_3= 'eighth' ) | (enumLiteral_4= 'sixteenth' ) | (enumLiteral_5= 'thirtysecond' ) | (enumLiteral_6= 'sixtyfourth' ) ) ;
    public final Enumerator ruleRestType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalMusicDsl.g:1458:2: ( ( (enumLiteral_0= 'whole' ) | (enumLiteral_1= 'half' ) | (enumLiteral_2= 'quarter' ) | (enumLiteral_3= 'eighth' ) | (enumLiteral_4= 'sixteenth' ) | (enumLiteral_5= 'thirtysecond' ) | (enumLiteral_6= 'sixtyfourth' ) ) )
            // InternalMusicDsl.g:1459:2: ( (enumLiteral_0= 'whole' ) | (enumLiteral_1= 'half' ) | (enumLiteral_2= 'quarter' ) | (enumLiteral_3= 'eighth' ) | (enumLiteral_4= 'sixteenth' ) | (enumLiteral_5= 'thirtysecond' ) | (enumLiteral_6= 'sixtyfourth' ) )
            {
            // InternalMusicDsl.g:1459:2: ( (enumLiteral_0= 'whole' ) | (enumLiteral_1= 'half' ) | (enumLiteral_2= 'quarter' ) | (enumLiteral_3= 'eighth' ) | (enumLiteral_4= 'sixteenth' ) | (enumLiteral_5= 'thirtysecond' ) | (enumLiteral_6= 'sixtyfourth' ) )
            int alt37=7;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt37=1;
                }
                break;
            case 50:
                {
                alt37=2;
                }
                break;
            case 51:
                {
                alt37=3;
                }
                break;
            case 52:
                {
                alt37=4;
                }
                break;
            case 53:
                {
                alt37=5;
                }
                break;
            case 54:
                {
                alt37=6;
                }
                break;
            case 55:
                {
                alt37=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalMusicDsl.g:1460:3: (enumLiteral_0= 'whole' )
                    {
                    // InternalMusicDsl.g:1460:3: (enumLiteral_0= 'whole' )
                    // InternalMusicDsl.g:1461:4: enumLiteral_0= 'whole'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getRestTypeAccess().getWholeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRestTypeAccess().getWholeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMusicDsl.g:1468:3: (enumLiteral_1= 'half' )
                    {
                    // InternalMusicDsl.g:1468:3: (enumLiteral_1= 'half' )
                    // InternalMusicDsl.g:1469:4: enumLiteral_1= 'half'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getRestTypeAccess().getHalfEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRestTypeAccess().getHalfEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMusicDsl.g:1476:3: (enumLiteral_2= 'quarter' )
                    {
                    // InternalMusicDsl.g:1476:3: (enumLiteral_2= 'quarter' )
                    // InternalMusicDsl.g:1477:4: enumLiteral_2= 'quarter'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getRestTypeAccess().getQuarterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRestTypeAccess().getQuarterEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMusicDsl.g:1484:3: (enumLiteral_3= 'eighth' )
                    {
                    // InternalMusicDsl.g:1484:3: (enumLiteral_3= 'eighth' )
                    // InternalMusicDsl.g:1485:4: enumLiteral_3= 'eighth'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getRestTypeAccess().getEighthEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRestTypeAccess().getEighthEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMusicDsl.g:1492:3: (enumLiteral_4= 'sixteenth' )
                    {
                    // InternalMusicDsl.g:1492:3: (enumLiteral_4= 'sixteenth' )
                    // InternalMusicDsl.g:1493:4: enumLiteral_4= 'sixteenth'
                    {
                    enumLiteral_4=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getRestTypeAccess().getSixteenthEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getRestTypeAccess().getSixteenthEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMusicDsl.g:1500:3: (enumLiteral_5= 'thirtysecond' )
                    {
                    // InternalMusicDsl.g:1500:3: (enumLiteral_5= 'thirtysecond' )
                    // InternalMusicDsl.g:1501:4: enumLiteral_5= 'thirtysecond'
                    {
                    enumLiteral_5=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getRestTypeAccess().getThirtysecondEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getRestTypeAccess().getThirtysecondEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMusicDsl.g:1508:3: (enumLiteral_6= 'sixtyfourth' )
                    {
                    // InternalMusicDsl.g:1508:3: (enumLiteral_6= 'sixtyfourth' )
                    // InternalMusicDsl.g:1509:4: enumLiteral_6= 'sixtyfourth'
                    {
                    enumLiteral_6=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getRestTypeAccess().getSixtyfourthEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getRestTypeAccess().getSixtyfourthEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRestType"


    // $ANTLR start "ruleRepetitionType"
    // InternalMusicDsl.g:1519:1: ruleRepetitionType returns [Enumerator current=null] : ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) ;
    public final Enumerator ruleRepetitionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMusicDsl.g:1525:2: ( ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) )
            // InternalMusicDsl.g:1526:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            {
            // InternalMusicDsl.g:1526:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==56) ) {
                alt38=1;
            }
            else if ( (LA38_0==57) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalMusicDsl.g:1527:3: (enumLiteral_0= 'left' )
                    {
                    // InternalMusicDsl.g:1527:3: (enumLiteral_0= 'left' )
                    // InternalMusicDsl.g:1528:4: enumLiteral_0= 'left'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getRepetitionTypeAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRepetitionTypeAccess().getLeftEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMusicDsl.g:1535:3: (enumLiteral_1= 'right' )
                    {
                    // InternalMusicDsl.g:1535:3: (enumLiteral_1= 'right' )
                    // InternalMusicDsl.g:1536:4: enumLiteral_1= 'right'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getRepetitionTypeAccess().getRightEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRepetitionTypeAccess().getRightEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepetitionType"


    // $ANTLR start "ruleNoteName"
    // InternalMusicDsl.g:1546:1: ruleNoteName returns [Enumerator current=null] : ( (enumLiteral_0= 'C' ) | (enumLiteral_1= 'D' ) | (enumLiteral_2= 'E' ) | (enumLiteral_3= 'F' ) | (enumLiteral_4= 'G' ) | (enumLiteral_5= 'A' ) | (enumLiteral_6= 'B' ) ) ;
    public final Enumerator ruleNoteName() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalMusicDsl.g:1552:2: ( ( (enumLiteral_0= 'C' ) | (enumLiteral_1= 'D' ) | (enumLiteral_2= 'E' ) | (enumLiteral_3= 'F' ) | (enumLiteral_4= 'G' ) | (enumLiteral_5= 'A' ) | (enumLiteral_6= 'B' ) ) )
            // InternalMusicDsl.g:1553:2: ( (enumLiteral_0= 'C' ) | (enumLiteral_1= 'D' ) | (enumLiteral_2= 'E' ) | (enumLiteral_3= 'F' ) | (enumLiteral_4= 'G' ) | (enumLiteral_5= 'A' ) | (enumLiteral_6= 'B' ) )
            {
            // InternalMusicDsl.g:1553:2: ( (enumLiteral_0= 'C' ) | (enumLiteral_1= 'D' ) | (enumLiteral_2= 'E' ) | (enumLiteral_3= 'F' ) | (enumLiteral_4= 'G' ) | (enumLiteral_5= 'A' ) | (enumLiteral_6= 'B' ) )
            int alt39=7;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt39=1;
                }
                break;
            case 59:
                {
                alt39=2;
                }
                break;
            case 60:
                {
                alt39=3;
                }
                break;
            case 61:
                {
                alt39=4;
                }
                break;
            case 62:
                {
                alt39=5;
                }
                break;
            case 63:
                {
                alt39=6;
                }
                break;
            case 64:
                {
                alt39=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalMusicDsl.g:1554:3: (enumLiteral_0= 'C' )
                    {
                    // InternalMusicDsl.g:1554:3: (enumLiteral_0= 'C' )
                    // InternalMusicDsl.g:1555:4: enumLiteral_0= 'C'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getNoteNameAccess().getCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNoteNameAccess().getCEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMusicDsl.g:1562:3: (enumLiteral_1= 'D' )
                    {
                    // InternalMusicDsl.g:1562:3: (enumLiteral_1= 'D' )
                    // InternalMusicDsl.g:1563:4: enumLiteral_1= 'D'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getNoteNameAccess().getDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNoteNameAccess().getDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMusicDsl.g:1570:3: (enumLiteral_2= 'E' )
                    {
                    // InternalMusicDsl.g:1570:3: (enumLiteral_2= 'E' )
                    // InternalMusicDsl.g:1571:4: enumLiteral_2= 'E'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getNoteNameAccess().getEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNoteNameAccess().getEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMusicDsl.g:1578:3: (enumLiteral_3= 'F' )
                    {
                    // InternalMusicDsl.g:1578:3: (enumLiteral_3= 'F' )
                    // InternalMusicDsl.g:1579:4: enumLiteral_3= 'F'
                    {
                    enumLiteral_3=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getNoteNameAccess().getFEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNoteNameAccess().getFEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMusicDsl.g:1586:3: (enumLiteral_4= 'G' )
                    {
                    // InternalMusicDsl.g:1586:3: (enumLiteral_4= 'G' )
                    // InternalMusicDsl.g:1587:4: enumLiteral_4= 'G'
                    {
                    enumLiteral_4=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getNoteNameAccess().getGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getNoteNameAccess().getGEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMusicDsl.g:1594:3: (enumLiteral_5= 'A' )
                    {
                    // InternalMusicDsl.g:1594:3: (enumLiteral_5= 'A' )
                    // InternalMusicDsl.g:1595:4: enumLiteral_5= 'A'
                    {
                    enumLiteral_5=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getNoteNameAccess().getAEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getNoteNameAccess().getAEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMusicDsl.g:1602:3: (enumLiteral_6= 'B' )
                    {
                    // InternalMusicDsl.g:1602:3: (enumLiteral_6= 'B' )
                    // InternalMusicDsl.g:1603:4: enumLiteral_6= 'B'
                    {
                    enumLiteral_6=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getNoteNameAccess().getBEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getNoteNameAccess().getBEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoteName"


    // $ANTLR start "ruleNoteType"
    // InternalMusicDsl.g:1613:1: ruleNoteType returns [Enumerator current=null] : ( (enumLiteral_0= 'whole' ) | (enumLiteral_1= 'half' ) | (enumLiteral_2= 'quarter' ) | (enumLiteral_3= 'eighth' ) | (enumLiteral_4= 'sixteenth' ) | (enumLiteral_5= 'thirtysecond' ) | (enumLiteral_6= 'sixtyfourth' ) ) ;
    public final Enumerator ruleNoteType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalMusicDsl.g:1619:2: ( ( (enumLiteral_0= 'whole' ) | (enumLiteral_1= 'half' ) | (enumLiteral_2= 'quarter' ) | (enumLiteral_3= 'eighth' ) | (enumLiteral_4= 'sixteenth' ) | (enumLiteral_5= 'thirtysecond' ) | (enumLiteral_6= 'sixtyfourth' ) ) )
            // InternalMusicDsl.g:1620:2: ( (enumLiteral_0= 'whole' ) | (enumLiteral_1= 'half' ) | (enumLiteral_2= 'quarter' ) | (enumLiteral_3= 'eighth' ) | (enumLiteral_4= 'sixteenth' ) | (enumLiteral_5= 'thirtysecond' ) | (enumLiteral_6= 'sixtyfourth' ) )
            {
            // InternalMusicDsl.g:1620:2: ( (enumLiteral_0= 'whole' ) | (enumLiteral_1= 'half' ) | (enumLiteral_2= 'quarter' ) | (enumLiteral_3= 'eighth' ) | (enumLiteral_4= 'sixteenth' ) | (enumLiteral_5= 'thirtysecond' ) | (enumLiteral_6= 'sixtyfourth' ) )
            int alt40=7;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt40=1;
                }
                break;
            case 50:
                {
                alt40=2;
                }
                break;
            case 51:
                {
                alt40=3;
                }
                break;
            case 52:
                {
                alt40=4;
                }
                break;
            case 53:
                {
                alt40=5;
                }
                break;
            case 54:
                {
                alt40=6;
                }
                break;
            case 55:
                {
                alt40=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalMusicDsl.g:1621:3: (enumLiteral_0= 'whole' )
                    {
                    // InternalMusicDsl.g:1621:3: (enumLiteral_0= 'whole' )
                    // InternalMusicDsl.g:1622:4: enumLiteral_0= 'whole'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getNoteTypeAccess().getWholeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNoteTypeAccess().getWholeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMusicDsl.g:1629:3: (enumLiteral_1= 'half' )
                    {
                    // InternalMusicDsl.g:1629:3: (enumLiteral_1= 'half' )
                    // InternalMusicDsl.g:1630:4: enumLiteral_1= 'half'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getNoteTypeAccess().getHalfEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNoteTypeAccess().getHalfEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMusicDsl.g:1637:3: (enumLiteral_2= 'quarter' )
                    {
                    // InternalMusicDsl.g:1637:3: (enumLiteral_2= 'quarter' )
                    // InternalMusicDsl.g:1638:4: enumLiteral_2= 'quarter'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getNoteTypeAccess().getQuarterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNoteTypeAccess().getQuarterEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMusicDsl.g:1645:3: (enumLiteral_3= 'eighth' )
                    {
                    // InternalMusicDsl.g:1645:3: (enumLiteral_3= 'eighth' )
                    // InternalMusicDsl.g:1646:4: enumLiteral_3= 'eighth'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getNoteTypeAccess().getEighthEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNoteTypeAccess().getEighthEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMusicDsl.g:1653:3: (enumLiteral_4= 'sixteenth' )
                    {
                    // InternalMusicDsl.g:1653:3: (enumLiteral_4= 'sixteenth' )
                    // InternalMusicDsl.g:1654:4: enumLiteral_4= 'sixteenth'
                    {
                    enumLiteral_4=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getNoteTypeAccess().getSixteenthEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getNoteTypeAccess().getSixteenthEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMusicDsl.g:1661:3: (enumLiteral_5= 'thirtysecond' )
                    {
                    // InternalMusicDsl.g:1661:3: (enumLiteral_5= 'thirtysecond' )
                    // InternalMusicDsl.g:1662:4: enumLiteral_5= 'thirtysecond'
                    {
                    enumLiteral_5=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getNoteTypeAccess().getThirtysecondEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getNoteTypeAccess().getThirtysecondEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMusicDsl.g:1669:3: (enumLiteral_6= 'sixtyfourth' )
                    {
                    // InternalMusicDsl.g:1669:3: (enumLiteral_6= 'sixtyfourth' )
                    // InternalMusicDsl.g:1670:4: enumLiteral_6= 'sixtyfourth'
                    {
                    enumLiteral_6=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getNoteTypeAccess().getSixtyfourthEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getNoteTypeAccess().getSixtyfourthEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoteType"


    // $ANTLR start "ruleAccidentalType"
    // InternalMusicDsl.g:1680:1: ruleAccidentalType returns [Enumerator current=null] : ( (enumLiteral_0= 'sharp' ) | (enumLiteral_1= 'flat' ) | (enumLiteral_2= 'natural' ) ) ;
    public final Enumerator ruleAccidentalType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMusicDsl.g:1686:2: ( ( (enumLiteral_0= 'sharp' ) | (enumLiteral_1= 'flat' ) | (enumLiteral_2= 'natural' ) ) )
            // InternalMusicDsl.g:1687:2: ( (enumLiteral_0= 'sharp' ) | (enumLiteral_1= 'flat' ) | (enumLiteral_2= 'natural' ) )
            {
            // InternalMusicDsl.g:1687:2: ( (enumLiteral_0= 'sharp' ) | (enumLiteral_1= 'flat' ) | (enumLiteral_2= 'natural' ) )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt41=1;
                }
                break;
            case 66:
                {
                alt41=2;
                }
                break;
            case 67:
                {
                alt41=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalMusicDsl.g:1688:3: (enumLiteral_0= 'sharp' )
                    {
                    // InternalMusicDsl.g:1688:3: (enumLiteral_0= 'sharp' )
                    // InternalMusicDsl.g:1689:4: enumLiteral_0= 'sharp'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getAccidentalTypeAccess().getSharpEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAccidentalTypeAccess().getSharpEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMusicDsl.g:1696:3: (enumLiteral_1= 'flat' )
                    {
                    // InternalMusicDsl.g:1696:3: (enumLiteral_1= 'flat' )
                    // InternalMusicDsl.g:1697:4: enumLiteral_1= 'flat'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getAccidentalTypeAccess().getFlatEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAccidentalTypeAccess().getFlatEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMusicDsl.g:1704:3: (enumLiteral_2= 'natural' )
                    {
                    // InternalMusicDsl.g:1704:3: (enumLiteral_2= 'natural' )
                    // InternalMusicDsl.g:1705:4: enumLiteral_2= 'natural'
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getAccidentalTypeAccess().getNaturalEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAccidentalTypeAccess().getNaturalEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAccidentalType"


    // $ANTLR start "ruleSlurType"
    // InternalMusicDsl.g:1715:1: ruleSlurType returns [Enumerator current=null] : ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'stop' ) ) ;
    public final Enumerator ruleSlurType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMusicDsl.g:1721:2: ( ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'stop' ) ) )
            // InternalMusicDsl.g:1722:2: ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'stop' ) )
            {
            // InternalMusicDsl.g:1722:2: ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'stop' ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==68) ) {
                alt42=1;
            }
            else if ( (LA42_0==69) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalMusicDsl.g:1723:3: (enumLiteral_0= 'start' )
                    {
                    // InternalMusicDsl.g:1723:3: (enumLiteral_0= 'start' )
                    // InternalMusicDsl.g:1724:4: enumLiteral_0= 'start'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getSlurTypeAccess().getStartEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSlurTypeAccess().getStartEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMusicDsl.g:1731:3: (enumLiteral_1= 'stop' )
                    {
                    // InternalMusicDsl.g:1731:3: (enumLiteral_1= 'stop' )
                    // InternalMusicDsl.g:1732:4: enumLiteral_1= 'stop'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getSlurTypeAccess().getStopEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSlurTypeAccess().getStopEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSlurType"


    // $ANTLR start "ruleArticulationType"
    // InternalMusicDsl.g:1742:1: ruleArticulationType returns [Enumerator current=null] : ( (enumLiteral_0= 'detached' ) | (enumLiteral_1= 'legato' ) | (enumLiteral_2= 'staccato' ) | (enumLiteral_3= 'portato' ) | (enumLiteral_4= 'tenuto' ) | (enumLiteral_5= 'marcato' ) ) ;
    public final Enumerator ruleArticulationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalMusicDsl.g:1748:2: ( ( (enumLiteral_0= 'detached' ) | (enumLiteral_1= 'legato' ) | (enumLiteral_2= 'staccato' ) | (enumLiteral_3= 'portato' ) | (enumLiteral_4= 'tenuto' ) | (enumLiteral_5= 'marcato' ) ) )
            // InternalMusicDsl.g:1749:2: ( (enumLiteral_0= 'detached' ) | (enumLiteral_1= 'legato' ) | (enumLiteral_2= 'staccato' ) | (enumLiteral_3= 'portato' ) | (enumLiteral_4= 'tenuto' ) | (enumLiteral_5= 'marcato' ) )
            {
            // InternalMusicDsl.g:1749:2: ( (enumLiteral_0= 'detached' ) | (enumLiteral_1= 'legato' ) | (enumLiteral_2= 'staccato' ) | (enumLiteral_3= 'portato' ) | (enumLiteral_4= 'tenuto' ) | (enumLiteral_5= 'marcato' ) )
            int alt43=6;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt43=1;
                }
                break;
            case 71:
                {
                alt43=2;
                }
                break;
            case 72:
                {
                alt43=3;
                }
                break;
            case 73:
                {
                alt43=4;
                }
                break;
            case 74:
                {
                alt43=5;
                }
                break;
            case 75:
                {
                alt43=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalMusicDsl.g:1750:3: (enumLiteral_0= 'detached' )
                    {
                    // InternalMusicDsl.g:1750:3: (enumLiteral_0= 'detached' )
                    // InternalMusicDsl.g:1751:4: enumLiteral_0= 'detached'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getArticulationTypeAccess().getDetachedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getArticulationTypeAccess().getDetachedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMusicDsl.g:1758:3: (enumLiteral_1= 'legato' )
                    {
                    // InternalMusicDsl.g:1758:3: (enumLiteral_1= 'legato' )
                    // InternalMusicDsl.g:1759:4: enumLiteral_1= 'legato'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getArticulationTypeAccess().getLegatoEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getArticulationTypeAccess().getLegatoEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMusicDsl.g:1766:3: (enumLiteral_2= 'staccato' )
                    {
                    // InternalMusicDsl.g:1766:3: (enumLiteral_2= 'staccato' )
                    // InternalMusicDsl.g:1767:4: enumLiteral_2= 'staccato'
                    {
                    enumLiteral_2=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getArticulationTypeAccess().getStaccatoEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getArticulationTypeAccess().getStaccatoEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMusicDsl.g:1774:3: (enumLiteral_3= 'portato' )
                    {
                    // InternalMusicDsl.g:1774:3: (enumLiteral_3= 'portato' )
                    // InternalMusicDsl.g:1775:4: enumLiteral_3= 'portato'
                    {
                    enumLiteral_3=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getArticulationTypeAccess().getPortatoEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getArticulationTypeAccess().getPortatoEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMusicDsl.g:1782:3: (enumLiteral_4= 'tenuto' )
                    {
                    // InternalMusicDsl.g:1782:3: (enumLiteral_4= 'tenuto' )
                    // InternalMusicDsl.g:1783:4: enumLiteral_4= 'tenuto'
                    {
                    enumLiteral_4=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getArticulationTypeAccess().getTenutoEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getArticulationTypeAccess().getTenutoEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMusicDsl.g:1790:3: (enumLiteral_5= 'marcato' )
                    {
                    // InternalMusicDsl.g:1790:3: (enumLiteral_5= 'marcato' )
                    // InternalMusicDsl.g:1791:4: enumLiteral_5= 'marcato'
                    {
                    enumLiteral_5=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getArticulationTypeAccess().getMarcatoEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getArticulationTypeAccess().getMarcatoEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArticulationType"


    // $ANTLR start "ruleOrnamentType"
    // InternalMusicDsl.g:1801:1: ruleOrnamentType returns [Enumerator current=null] : ( (enumLiteral_0= 'slide' ) | (enumLiteral_1= 'glissando' ) | (enumLiteral_2= 'aciaccatura' ) | (enumLiteral_3= 'appoggiatura' ) | (enumLiteral_4= 'turn' ) | (enumLiteral_5= 'mordent' ) | (enumLiteral_6= 'trill' ) ) ;
    public final Enumerator ruleOrnamentType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalMusicDsl.g:1807:2: ( ( (enumLiteral_0= 'slide' ) | (enumLiteral_1= 'glissando' ) | (enumLiteral_2= 'aciaccatura' ) | (enumLiteral_3= 'appoggiatura' ) | (enumLiteral_4= 'turn' ) | (enumLiteral_5= 'mordent' ) | (enumLiteral_6= 'trill' ) ) )
            // InternalMusicDsl.g:1808:2: ( (enumLiteral_0= 'slide' ) | (enumLiteral_1= 'glissando' ) | (enumLiteral_2= 'aciaccatura' ) | (enumLiteral_3= 'appoggiatura' ) | (enumLiteral_4= 'turn' ) | (enumLiteral_5= 'mordent' ) | (enumLiteral_6= 'trill' ) )
            {
            // InternalMusicDsl.g:1808:2: ( (enumLiteral_0= 'slide' ) | (enumLiteral_1= 'glissando' ) | (enumLiteral_2= 'aciaccatura' ) | (enumLiteral_3= 'appoggiatura' ) | (enumLiteral_4= 'turn' ) | (enumLiteral_5= 'mordent' ) | (enumLiteral_6= 'trill' ) )
            int alt44=7;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt44=1;
                }
                break;
            case 77:
                {
                alt44=2;
                }
                break;
            case 78:
                {
                alt44=3;
                }
                break;
            case 79:
                {
                alt44=4;
                }
                break;
            case 80:
                {
                alt44=5;
                }
                break;
            case 81:
                {
                alt44=6;
                }
                break;
            case 82:
                {
                alt44=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalMusicDsl.g:1809:3: (enumLiteral_0= 'slide' )
                    {
                    // InternalMusicDsl.g:1809:3: (enumLiteral_0= 'slide' )
                    // InternalMusicDsl.g:1810:4: enumLiteral_0= 'slide'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getOrnamentTypeAccess().getSlideEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOrnamentTypeAccess().getSlideEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMusicDsl.g:1817:3: (enumLiteral_1= 'glissando' )
                    {
                    // InternalMusicDsl.g:1817:3: (enumLiteral_1= 'glissando' )
                    // InternalMusicDsl.g:1818:4: enumLiteral_1= 'glissando'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getOrnamentTypeAccess().getGlissandoEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOrnamentTypeAccess().getGlissandoEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMusicDsl.g:1825:3: (enumLiteral_2= 'aciaccatura' )
                    {
                    // InternalMusicDsl.g:1825:3: (enumLiteral_2= 'aciaccatura' )
                    // InternalMusicDsl.g:1826:4: enumLiteral_2= 'aciaccatura'
                    {
                    enumLiteral_2=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getOrnamentTypeAccess().getAciaccaturaEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOrnamentTypeAccess().getAciaccaturaEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMusicDsl.g:1833:3: (enumLiteral_3= 'appoggiatura' )
                    {
                    // InternalMusicDsl.g:1833:3: (enumLiteral_3= 'appoggiatura' )
                    // InternalMusicDsl.g:1834:4: enumLiteral_3= 'appoggiatura'
                    {
                    enumLiteral_3=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getOrnamentTypeAccess().getAppoggiaturaEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOrnamentTypeAccess().getAppoggiaturaEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMusicDsl.g:1841:3: (enumLiteral_4= 'turn' )
                    {
                    // InternalMusicDsl.g:1841:3: (enumLiteral_4= 'turn' )
                    // InternalMusicDsl.g:1842:4: enumLiteral_4= 'turn'
                    {
                    enumLiteral_4=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getOrnamentTypeAccess().getTurnEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOrnamentTypeAccess().getTurnEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMusicDsl.g:1849:3: (enumLiteral_5= 'mordent' )
                    {
                    // InternalMusicDsl.g:1849:3: (enumLiteral_5= 'mordent' )
                    // InternalMusicDsl.g:1850:4: enumLiteral_5= 'mordent'
                    {
                    enumLiteral_5=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getOrnamentTypeAccess().getMordentEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getOrnamentTypeAccess().getMordentEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMusicDsl.g:1857:3: (enumLiteral_6= 'trill' )
                    {
                    // InternalMusicDsl.g:1857:3: (enumLiteral_6= 'trill' )
                    // InternalMusicDsl.g:1858:4: enumLiteral_6= 'trill'
                    {
                    enumLiteral_6=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getOrnamentTypeAccess().getTrillEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getOrnamentTypeAccess().getTrillEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrnamentType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000011E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0001800000C00000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000E4040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000E4000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000F4000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000F4020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00FE000000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0xFC00000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000FFE00000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00FE000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000FFC00000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000FF800000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000FF000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000FE000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000F8000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000F0000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000E0000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000700000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x000000000007F000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});

}