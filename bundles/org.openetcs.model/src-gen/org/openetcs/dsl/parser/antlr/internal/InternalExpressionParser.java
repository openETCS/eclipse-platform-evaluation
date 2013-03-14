package org.openetcs.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.openetcs.dsl.services.ExpressionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalExpressionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'<-'", "'CurrentState'", "'OR'", "'AND'", "'=='", "'!='", "'<='", "'>='", "'in'", "'not in'", "'+'", "'-'", "'*'", "'/'", "'^'", "'.'", "'('", "')'", "','", "'THERE_IS_IN'", "'FORALL_IN'", "'FIRST_IN'", "'LAST_IN'", "'COUNT'", "'REDUCE'", "'USING'", "'INITIAL_VALUE'", "'SUM'", "'MAP'", "'APPLY'", "'ON'", "'|'", "'NOT ('", "'{'", "'}'", "'=>'", "'['", "']'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_DOUBLE=7;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalExpressionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExpressionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExpressionParser.tokenNames; }
    public String getGrammarFileName() { return "../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g"; }



     	private ExpressionGrammarAccess grammarAccess;
     	
        public InternalExpressionParser(TokenStream input, ExpressionGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ExpressionGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:69:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:76:1: ruleModel returns [EObject current=null] : ( (lv_phrase_0_0= rulePhrase ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_phrase_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:79:28: ( ( (lv_phrase_0_0= rulePhrase ) ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:80:1: ( (lv_phrase_0_0= rulePhrase ) )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:80:1: ( (lv_phrase_0_0= rulePhrase ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:81:1: (lv_phrase_0_0= rulePhrase )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:81:1: (lv_phrase_0_0= rulePhrase )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:82:3: lv_phrase_0_0= rulePhrase
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getPhrasePhraseParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePhrase_in_ruleModel130);
            lv_phrase_0_0=rulePhrase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelRule());
              	        }
                     		set(
                     			current, 
                     			"phrase",
                      		lv_phrase_0_0, 
                      		"Phrase");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePhrase"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:106:1: entryRulePhrase returns [EObject current=null] : iv_rulePhrase= rulePhrase EOF ;
    public final EObject entryRulePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhrase = null;


        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:107:2: (iv_rulePhrase= rulePhrase EOF )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:108:2: iv_rulePhrase= rulePhrase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPhraseRule()); 
            }
            pushFollow(FOLLOW_rulePhrase_in_entryRulePhrase165);
            iv_rulePhrase=rulePhrase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePhrase; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePhrase175); if (state.failed) return current;

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
    // $ANTLR end "entryRulePhrase"


    // $ANTLR start "rulePhrase"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:115:1: rulePhrase returns [EObject current=null] : (this_Expression_0= ruleExpression | this_StatementList_1= ruleStatementList ) ;
    public final EObject rulePhrase() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;

        EObject this_StatementList_1 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:118:28: ( (this_Expression_0= ruleExpression | this_StatementList_1= ruleStatementList ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:119:1: (this_Expression_0= ruleExpression | this_StatementList_1= ruleStatementList )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:119:1: (this_Expression_0= ruleExpression | this_StatementList_1= ruleStatementList )
            int alt1=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==13) ) {
                    alt1=2;
                }
                else if ( (LA1_1==EOF||(LA1_1>=15 && LA1_1<=29)||LA1_1==46) ) {
                    alt1=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_DOUBLE:
            case 29:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 40:
            case 41:
            case 42:
            case 45:
            case 49:
                {
                alt1=1;
                }
                break;
            case 14:
                {
                alt1=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:120:5: this_Expression_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPhraseAccess().getExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulePhrase222);
                    this_Expression_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:130:5: this_StatementList_1= ruleStatementList
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPhraseAccess().getStatementListParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatementList_in_rulePhrase249);
                    this_StatementList_1=ruleStatementList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StatementList_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePhrase"


    // $ANTLR start "entryRuleStatementList"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:146:1: entryRuleStatementList returns [EObject current=null] : iv_ruleStatementList= ruleStatementList EOF ;
    public final EObject entryRuleStatementList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementList = null;


        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:147:2: (iv_ruleStatementList= ruleStatementList EOF )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:148:2: iv_ruleStatementList= ruleStatementList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementListRule()); 
            }
            pushFollow(FOLLOW_ruleStatementList_in_entryRuleStatementList284);
            iv_ruleStatementList=ruleStatementList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatementList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatementList294); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatementList"


    // $ANTLR start "ruleStatementList"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:155:1: ruleStatementList returns [EObject current=null] : ( ( (lv_head_0_0= ruleStatement ) ) otherlv_1= ';' ( (lv_tail_2_0= ruleStatementList ) )? ) ;
    public final EObject ruleStatementList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_head_0_0 = null;

        EObject lv_tail_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:158:28: ( ( ( (lv_head_0_0= ruleStatement ) ) otherlv_1= ';' ( (lv_tail_2_0= ruleStatementList ) )? ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:159:1: ( ( (lv_head_0_0= ruleStatement ) ) otherlv_1= ';' ( (lv_tail_2_0= ruleStatementList ) )? )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:159:1: ( ( (lv_head_0_0= ruleStatement ) ) otherlv_1= ';' ( (lv_tail_2_0= ruleStatementList ) )? )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:159:2: ( (lv_head_0_0= ruleStatement ) ) otherlv_1= ';' ( (lv_tail_2_0= ruleStatementList ) )?
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:159:2: ( (lv_head_0_0= ruleStatement ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:160:1: (lv_head_0_0= ruleStatement )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:160:1: (lv_head_0_0= ruleStatement )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:161:3: lv_head_0_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatementListAccess().getHeadStatementParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleStatementList340);
            lv_head_0_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStatementListRule());
              	        }
                     		set(
                     			current, 
                     			"head",
                      		lv_head_0_0, 
                      		"Statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleStatementList352); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStatementListAccess().getSemicolonKeyword_1());
                  
            }
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:181:1: ( (lv_tail_2_0= ruleStatementList ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:182:1: (lv_tail_2_0= ruleStatementList )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:182:1: (lv_tail_2_0= ruleStatementList )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:183:3: lv_tail_2_0= ruleStatementList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementListAccess().getTailStatementListParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatementList_in_ruleStatementList373);
                    lv_tail_2_0=ruleStatementList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementListRule());
                      	        }
                             		set(
                             			current, 
                             			"tail",
                              		lv_tail_2_0, 
                              		"StatementList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStatementList"


    // $ANTLR start "entryRuleStatement"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:207:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:208:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:209:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement410);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement420); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:216:1: ruleStatement returns [EObject current=null] : this_AssignmentStatement_0= ruleAssignmentStatement ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_AssignmentStatement_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:219:28: (this_AssignmentStatement_0= ruleAssignmentStatement )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:221:5: this_AssignmentStatement_0= ruleAssignmentStatement
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getStatementAccess().getAssignmentStatementParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignmentStatement_in_ruleStatement466);
            this_AssignmentStatement_0=ruleAssignmentStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AssignmentStatement_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleAssignmentStatement"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:237:1: entryRuleAssignmentStatement returns [EObject current=null] : iv_ruleAssignmentStatement= ruleAssignmentStatement EOF ;
    public final EObject entryRuleAssignmentStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentStatement = null;


        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:238:2: (iv_ruleAssignmentStatement= ruleAssignmentStatement EOF )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:239:2: iv_ruleAssignmentStatement= ruleAssignmentStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentStatementRule()); 
            }
            pushFollow(FOLLOW_ruleAssignmentStatement_in_entryRuleAssignmentStatement500);
            iv_ruleAssignmentStatement=ruleAssignmentStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentStatement510); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssignmentStatement"


    // $ANTLR start "ruleAssignmentStatement"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:246:1: ruleAssignmentStatement returns [EObject current=null] : (this_VariableAssignmentStatement_0= ruleVariableAssignmentStatement | this_SelfAssignmentStatement_1= ruleSelfAssignmentStatement ) ;
    public final EObject ruleAssignmentStatement() throws RecognitionException {
        EObject current = null;

        EObject this_VariableAssignmentStatement_0 = null;

        EObject this_SelfAssignmentStatement_1 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:249:28: ( (this_VariableAssignmentStatement_0= ruleVariableAssignmentStatement | this_SelfAssignmentStatement_1= ruleSelfAssignmentStatement ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:250:1: (this_VariableAssignmentStatement_0= ruleVariableAssignmentStatement | this_SelfAssignmentStatement_1= ruleSelfAssignmentStatement )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:250:1: (this_VariableAssignmentStatement_0= ruleVariableAssignmentStatement | this_SelfAssignmentStatement_1= ruleSelfAssignmentStatement )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:251:5: this_VariableAssignmentStatement_0= ruleVariableAssignmentStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssignmentStatementAccess().getVariableAssignmentStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableAssignmentStatement_in_ruleAssignmentStatement557);
                    this_VariableAssignmentStatement_0=ruleVariableAssignmentStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableAssignmentStatement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:261:5: this_SelfAssignmentStatement_1= ruleSelfAssignmentStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssignmentStatementAccess().getSelfAssignmentStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelfAssignmentStatement_in_ruleAssignmentStatement584);
                    this_SelfAssignmentStatement_1=ruleSelfAssignmentStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SelfAssignmentStatement_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAssignmentStatement"


    // $ANTLR start "entryRuleVariableAssignmentStatement"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:277:1: entryRuleVariableAssignmentStatement returns [EObject current=null] : iv_ruleVariableAssignmentStatement= ruleVariableAssignmentStatement EOF ;
    public final EObject entryRuleVariableAssignmentStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignmentStatement = null;


        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:278:2: (iv_ruleVariableAssignmentStatement= ruleVariableAssignmentStatement EOF )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:279:2: iv_ruleVariableAssignmentStatement= ruleVariableAssignmentStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableAssignmentStatementRule()); 
            }
            pushFollow(FOLLOW_ruleVariableAssignmentStatement_in_entryRuleVariableAssignmentStatement619);
            iv_ruleVariableAssignmentStatement=ruleVariableAssignmentStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableAssignmentStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAssignmentStatement629); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableAssignmentStatement"


    // $ANTLR start "ruleVariableAssignmentStatement"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:286:1: ruleVariableAssignmentStatement returns [EObject current=null] : ( ( (lv_designator_0_0= ruleDesignator ) ) otherlv_1= '<-' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleVariableAssignmentStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_designator_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:289:28: ( ( ( (lv_designator_0_0= ruleDesignator ) ) otherlv_1= '<-' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:290:1: ( ( (lv_designator_0_0= ruleDesignator ) ) otherlv_1= '<-' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:290:1: ( ( (lv_designator_0_0= ruleDesignator ) ) otherlv_1= '<-' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:290:2: ( (lv_designator_0_0= ruleDesignator ) ) otherlv_1= '<-' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:290:2: ( (lv_designator_0_0= ruleDesignator ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:291:1: (lv_designator_0_0= ruleDesignator )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:291:1: (lv_designator_0_0= ruleDesignator )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:292:3: lv_designator_0_0= ruleDesignator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableAssignmentStatementAccess().getDesignatorDesignatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDesignator_in_ruleVariableAssignmentStatement675);
            lv_designator_0_0=ruleDesignator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableAssignmentStatementRule());
              	        }
                     		set(
                     			current, 
                     			"designator",
                      		lv_designator_0_0, 
                      		"Designator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleVariableAssignmentStatement687); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVariableAssignmentStatementAccess().getLessThanSignHyphenMinusKeyword_1());
                  
            }
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:312:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:313:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:313:1: (lv_expression_2_0= ruleExpression )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:314:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableAssignmentStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleVariableAssignmentStatement708);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableAssignmentStatementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVariableAssignmentStatement"


    // $ANTLR start "entryRuleSelfAssignmentStatement"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:338:1: entryRuleSelfAssignmentStatement returns [EObject current=null] : iv_ruleSelfAssignmentStatement= ruleSelfAssignmentStatement EOF ;
    public final EObject entryRuleSelfAssignmentStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfAssignmentStatement = null;


        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:339:2: (iv_ruleSelfAssignmentStatement= ruleSelfAssignmentStatement EOF )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:340:2: iv_ruleSelfAssignmentStatement= ruleSelfAssignmentStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelfAssignmentStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSelfAssignmentStatement_in_entryRuleSelfAssignmentStatement744);
            iv_ruleSelfAssignmentStatement=ruleSelfAssignmentStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelfAssignmentStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelfAssignmentStatement754); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSelfAssignmentStatement"


    // $ANTLR start "ruleSelfAssignmentStatement"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:347:1: ruleSelfAssignmentStatement returns [EObject current=null] : (otherlv_0= 'CurrentState' otherlv_1= '<-' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleSelfAssignmentStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:350:28: ( (otherlv_0= 'CurrentState' otherlv_1= '<-' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:351:1: (otherlv_0= 'CurrentState' otherlv_1= '<-' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:351:1: (otherlv_0= 'CurrentState' otherlv_1= '<-' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:351:3: otherlv_0= 'CurrentState' otherlv_1= '<-' ( (lv_expression_2_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleSelfAssignmentStatement791); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSelfAssignmentStatementAccess().getCurrentStateKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleSelfAssignmentStatement803); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSelfAssignmentStatementAccess().getLessThanSignHyphenMinusKeyword_1());
                  
            }
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:359:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:360:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:360:1: (lv_expression_2_0= ruleExpression )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:361:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelfAssignmentStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleSelfAssignmentStatement824);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSelfAssignmentStatementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSelfAssignmentStatement"


    // $ANTLR start "entryRuleExpression"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:385:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:386:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:387:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression860);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression870); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:394:1: ruleExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:397:28: (this_OrExpression_0= ruleOrExpression )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:399:5: this_OrExpression_0= ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOrExpression_in_ruleExpression916);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOrExpression"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:415:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:416:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:417:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression950);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression960); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:424:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression () ( ( ( ( 'OR' ) )=> (lv_op_2_0= 'OR' ) ) ( (lv_right_3_0= ruleOrExpression ) ) )? ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:427:28: ( (this_AndExpression_0= ruleAndExpression () ( ( ( ( 'OR' ) )=> (lv_op_2_0= 'OR' ) ) ( (lv_right_3_0= ruleOrExpression ) ) )? ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:428:1: (this_AndExpression_0= ruleAndExpression () ( ( ( ( 'OR' ) )=> (lv_op_2_0= 'OR' ) ) ( (lv_right_3_0= ruleOrExpression ) ) )? )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:428:1: (this_AndExpression_0= ruleAndExpression () ( ( ( ( 'OR' ) )=> (lv_op_2_0= 'OR' ) ) ( (lv_right_3_0= ruleOrExpression ) ) )? )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:429:5: this_AndExpression_0= ruleAndExpression () ( ( ( ( 'OR' ) )=> (lv_op_2_0= 'OR' ) ) ( (lv_right_3_0= ruleOrExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression1007);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:437:1: ()
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:438:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElementAndSet(
                          grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1(),
                          current);
                  
            }

            }

            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:443:2: ( ( ( ( 'OR' ) )=> (lv_op_2_0= 'OR' ) ) ( (lv_right_3_0= ruleOrExpression ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                int LA4_1 = input.LA(2);

                if ( (synpred1_InternalExpression()) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:443:3: ( ( ( 'OR' ) )=> (lv_op_2_0= 'OR' ) ) ( (lv_right_3_0= ruleOrExpression ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:443:3: ( ( ( 'OR' ) )=> (lv_op_2_0= 'OR' ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:443:4: ( ( 'OR' ) )=> (lv_op_2_0= 'OR' )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:450:1: (lv_op_2_0= 'OR' )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:451:3: lv_op_2_0= 'OR'
                    {
                    lv_op_2_0=(Token)match(input,15,FOLLOW_15_in_ruleOrExpression1049); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_op_2_0, grammarAccess.getOrExpressionAccess().getOpORKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOrExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "op", lv_op_2_0, "OR");
                      	    
                    }

                    }


                    }

                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:464:2: ( (lv_right_3_0= ruleOrExpression ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:465:1: (lv_right_3_0= ruleOrExpression )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:465:1: (lv_right_3_0= ruleOrExpression )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:466:3: lv_right_3_0= ruleOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOrExpressionAccess().getRightOrExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOrExpression_in_ruleOrExpression1083);
                    lv_right_3_0=ruleOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOrExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"OrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:490:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:491:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:492:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression1121);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression1131); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:499:1: ruleAndExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression () ( ( ( ( 'AND' ) )=> (lv_op_2_0= 'AND' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )? ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_EqualityExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:502:28: ( (this_EqualityExpression_0= ruleEqualityExpression () ( ( ( ( 'AND' ) )=> (lv_op_2_0= 'AND' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )? ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:503:1: (this_EqualityExpression_0= ruleEqualityExpression () ( ( ( ( 'AND' ) )=> (lv_op_2_0= 'AND' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )? )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:503:1: (this_EqualityExpression_0= ruleEqualityExpression () ( ( ( ( 'AND' ) )=> (lv_op_2_0= 'AND' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )? )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:504:5: this_EqualityExpression_0= ruleEqualityExpression () ( ( ( ( 'AND' ) )=> (lv_op_2_0= 'AND' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleEqualityExpression_in_ruleAndExpression1178);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_EqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:512:1: ()
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:513:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElementAndSet(
                          grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1(),
                          current);
                  
            }

            }

            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:518:2: ( ( ( ( 'AND' ) )=> (lv_op_2_0= 'AND' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                int LA5_1 = input.LA(2);

                if ( (synpred2_InternalExpression()) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:518:3: ( ( ( 'AND' ) )=> (lv_op_2_0= 'AND' ) ) ( (lv_right_3_0= ruleAndExpression ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:518:3: ( ( ( 'AND' ) )=> (lv_op_2_0= 'AND' ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:518:4: ( ( 'AND' ) )=> (lv_op_2_0= 'AND' )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:525:1: (lv_op_2_0= 'AND' )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:526:3: lv_op_2_0= 'AND'
                    {
                    lv_op_2_0=(Token)match(input,16,FOLLOW_16_in_ruleAndExpression1220); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_op_2_0, grammarAccess.getAndExpressionAccess().getOpANDKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAndExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "op", lv_op_2_0, "AND");
                      	    
                    }

                    }


                    }

                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:539:2: ( (lv_right_3_0= ruleAndExpression ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:540:1: (lv_right_3_0= ruleAndExpression )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:540:1: (lv_right_3_0= ruleAndExpression )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:541:3: lv_right_3_0= ruleAndExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightAndExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAndExpression_in_ruleAndExpression1254);
                    lv_right_3_0=ruleAndExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"AndExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:565:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:566:2: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:567:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression1292);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualityExpression1302); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:574:1: ruleEqualityExpression returns [EObject current=null] : (this_DashExpression_0= ruleDashExpression () ( ( ( ( ( '==' | '!=' | '<=' | '>=' | 'in' | 'not in' ) ) )=> ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )? ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        Token lv_op_2_5=null;
        Token lv_op_2_6=null;
        EObject this_DashExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:577:28: ( (this_DashExpression_0= ruleDashExpression () ( ( ( ( ( '==' | '!=' | '<=' | '>=' | 'in' | 'not in' ) ) )=> ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )? ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:578:1: (this_DashExpression_0= ruleDashExpression () ( ( ( ( ( '==' | '!=' | '<=' | '>=' | 'in' | 'not in' ) ) )=> ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )? )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:578:1: (this_DashExpression_0= ruleDashExpression () ( ( ( ( ( '==' | '!=' | '<=' | '>=' | 'in' | 'not in' ) ) )=> ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )? )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:579:5: this_DashExpression_0= ruleDashExpression () ( ( ( ( ( '==' | '!=' | '<=' | '>=' | 'in' | 'not in' ) ) )=> ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEqualityExpressionAccess().getDashExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleDashExpression_in_ruleEqualityExpression1349);
            this_DashExpression_0=ruleDashExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DashExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:587:1: ()
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:588:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElementAndSet(
                          grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1(),
                          current);
                  
            }

            }

            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:593:2: ( ( ( ( ( '==' | '!=' | '<=' | '>=' | 'in' | 'not in' ) ) )=> ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )?
            int alt7=2;
            switch ( input.LA(1) ) {
                case 17:
                    {
                    int LA7_1 = input.LA(2);

                    if ( (synpred3_InternalExpression()) ) {
                        alt7=1;
                    }
                    }
                    break;
                case 18:
                    {
                    int LA7_2 = input.LA(2);

                    if ( (synpred3_InternalExpression()) ) {
                        alt7=1;
                    }
                    }
                    break;
                case 19:
                    {
                    int LA7_3 = input.LA(2);

                    if ( (synpred3_InternalExpression()) ) {
                        alt7=1;
                    }
                    }
                    break;
                case 20:
                    {
                    int LA7_4 = input.LA(2);

                    if ( (synpred3_InternalExpression()) ) {
                        alt7=1;
                    }
                    }
                    break;
                case 21:
                    {
                    int LA7_5 = input.LA(2);

                    if ( (synpred3_InternalExpression()) ) {
                        alt7=1;
                    }
                    }
                    break;
                case 22:
                    {
                    int LA7_6 = input.LA(2);

                    if ( (synpred3_InternalExpression()) ) {
                        alt7=1;
                    }
                    }
                    break;
            }

            switch (alt7) {
                case 1 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:593:3: ( ( ( ( '==' | '!=' | '<=' | '>=' | 'in' | 'not in' ) ) )=> ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' ) ) ) ( (lv_right_3_0= ruleEqualityExpression ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:593:3: ( ( ( ( '==' | '!=' | '<=' | '>=' | 'in' | 'not in' ) ) )=> ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' ) ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:593:4: ( ( ( '==' | '!=' | '<=' | '>=' | 'in' | 'not in' ) ) )=> ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:618:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:619:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:619:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' )
                    int alt6=6;
                    switch ( input.LA(1) ) {
                    case 17:
                        {
                        alt6=1;
                        }
                        break;
                    case 18:
                        {
                        alt6=2;
                        }
                        break;
                    case 19:
                        {
                        alt6=3;
                        }
                        break;
                    case 20:
                        {
                        alt6=4;
                        }
                        break;
                    case 21:
                        {
                        alt6=5;
                        }
                        break;
                    case 22:
                        {
                        alt6=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }

                    switch (alt6) {
                        case 1 :
                            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:620:3: lv_op_2_1= '=='
                            {
                            lv_op_2_1=(Token)match(input,17,FOLLOW_17_in_ruleEqualityExpression1468); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_1, grammarAccess.getEqualityExpressionAccess().getOpEqualsSignEqualsSignKeyword_2_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getEqualityExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:632:8: lv_op_2_2= '!='
                            {
                            lv_op_2_2=(Token)match(input,18,FOLLOW_18_in_ruleEqualityExpression1497); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_2, grammarAccess.getEqualityExpressionAccess().getOpExclamationMarkEqualsSignKeyword_2_0_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getEqualityExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:644:8: lv_op_2_3= '<='
                            {
                            lv_op_2_3=(Token)match(input,19,FOLLOW_19_in_ruleEqualityExpression1526); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_3, grammarAccess.getEqualityExpressionAccess().getOpLessThanSignEqualsSignKeyword_2_0_0_2());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getEqualityExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_3, null);
                              	    
                            }

                            }
                            break;
                        case 4 :
                            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:656:8: lv_op_2_4= '>='
                            {
                            lv_op_2_4=(Token)match(input,20,FOLLOW_20_in_ruleEqualityExpression1555); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_4, grammarAccess.getEqualityExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_2_0_0_3());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getEqualityExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_4, null);
                              	    
                            }

                            }
                            break;
                        case 5 :
                            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:668:8: lv_op_2_5= 'in'
                            {
                            lv_op_2_5=(Token)match(input,21,FOLLOW_21_in_ruleEqualityExpression1584); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_5, grammarAccess.getEqualityExpressionAccess().getOpInKeyword_2_0_0_4());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getEqualityExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_5, null);
                              	    
                            }

                            }
                            break;
                        case 6 :
                            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:680:8: lv_op_2_6= 'not in'
                            {
                            lv_op_2_6=(Token)match(input,22,FOLLOW_22_in_ruleEqualityExpression1613); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_6, grammarAccess.getEqualityExpressionAccess().getOpNotInKeyword_2_0_0_5());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getEqualityExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_6, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:695:2: ( (lv_right_3_0= ruleEqualityExpression ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:696:1: (lv_right_3_0= ruleEqualityExpression )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:696:1: (lv_right_3_0= ruleEqualityExpression )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:697:3: lv_right_3_0= ruleEqualityExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightEqualityExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEqualityExpression_in_ruleEqualityExpression1650);
                    lv_right_3_0=ruleEqualityExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"EqualityExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleDashExpression"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:721:1: entryRuleDashExpression returns [EObject current=null] : iv_ruleDashExpression= ruleDashExpression EOF ;
    public final EObject entryRuleDashExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDashExpression = null;


        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:722:2: (iv_ruleDashExpression= ruleDashExpression EOF )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:723:2: iv_ruleDashExpression= ruleDashExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDashExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleDashExpression_in_entryRuleDashExpression1688);
            iv_ruleDashExpression=ruleDashExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDashExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDashExpression1698); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDashExpression"


    // $ANTLR start "ruleDashExpression"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:730:1: ruleDashExpression returns [EObject current=null] : (this_PointExpression_0= rulePointExpression () ( ( ( ( ( '+' | '-' ) ) )=> ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleDashExpression ) ) )? ) ;
    public final EObject ruleDashExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_PointExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:733:28: ( (this_PointExpression_0= rulePointExpression () ( ( ( ( ( '+' | '-' ) ) )=> ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleDashExpression ) ) )? ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:734:1: (this_PointExpression_0= rulePointExpression () ( ( ( ( ( '+' | '-' ) ) )=> ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleDashExpression ) ) )? )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:734:1: (this_PointExpression_0= rulePointExpression () ( ( ( ( ( '+' | '-' ) ) )=> ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleDashExpression ) ) )? )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:735:5: this_PointExpression_0= rulePointExpression () ( ( ( ( ( '+' | '-' ) ) )=> ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleDashExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDashExpressionAccess().getPointExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePointExpression_in_ruleDashExpression1745);
            this_PointExpression_0=rulePointExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PointExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:743:1: ()
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:744:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElementAndSet(
                          grammarAccess.getDashExpressionAccess().getDashExpressionLeftAction_1(),
                          current);
                  
            }

            }

            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:749:2: ( ( ( ( ( '+' | '-' ) ) )=> ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleDashExpression ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                int LA9_1 = input.LA(2);

                if ( (synpred4_InternalExpression()) ) {
                    alt9=1;
                }
            }
            else if ( (LA9_0==24) ) {
                int LA9_2 = input.LA(2);

                if ( (synpred4_InternalExpression()) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:749:3: ( ( ( ( '+' | '-' ) ) )=> ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleDashExpression ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:749:3: ( ( ( ( '+' | '-' ) ) )=> ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:749:4: ( ( ( '+' | '-' ) ) )=> ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:762:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:763:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:763:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==23) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==24) ) {
                        alt8=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:764:3: lv_op_2_1= '+'
                            {
                            lv_op_2_1=(Token)match(input,23,FOLLOW_23_in_ruleDashExpression1808); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_1, grammarAccess.getDashExpressionAccess().getOpPlusSignKeyword_2_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getDashExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:776:8: lv_op_2_2= '-'
                            {
                            lv_op_2_2=(Token)match(input,24,FOLLOW_24_in_ruleDashExpression1837); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_2, grammarAccess.getDashExpressionAccess().getOpHyphenMinusKeyword_2_0_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getDashExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:791:2: ( (lv_right_3_0= ruleDashExpression ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:792:1: (lv_right_3_0= ruleDashExpression )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:792:1: (lv_right_3_0= ruleDashExpression )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:793:3: lv_right_3_0= ruleDashExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDashExpressionAccess().getRightDashExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDashExpression_in_ruleDashExpression1874);
                    lv_right_3_0=ruleDashExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDashExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"DashExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDashExpression"


    // $ANTLR start "entryRulePointExpression"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:817:1: entryRulePointExpression returns [EObject current=null] : iv_rulePointExpression= rulePointExpression EOF ;
    public final EObject entryRulePointExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointExpression = null;


        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:818:2: (iv_rulePointExpression= rulePointExpression EOF )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:819:2: iv_rulePointExpression= rulePointExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPointExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePointExpression_in_entryRulePointExpression1912);
            iv_rulePointExpression=rulePointExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePointExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePointExpression1922); if (state.failed) return current;

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
    // $ANTLR end "entryRulePointExpression"


    // $ANTLR start "rulePointExpression"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:826:1: rulePointExpression returns [EObject current=null] : (this_PowExpression_0= rulePowExpression () ( ( ( ( ( '*' | '/' ) ) )=> ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePointExpression ) ) )? ) ;
    public final EObject rulePointExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_PowExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:829:28: ( (this_PowExpression_0= rulePowExpression () ( ( ( ( ( '*' | '/' ) ) )=> ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePointExpression ) ) )? ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:830:1: (this_PowExpression_0= rulePowExpression () ( ( ( ( ( '*' | '/' ) ) )=> ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePointExpression ) ) )? )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:830:1: (this_PowExpression_0= rulePowExpression () ( ( ( ( ( '*' | '/' ) ) )=> ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePointExpression ) ) )? )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:831:5: this_PowExpression_0= rulePowExpression () ( ( ( ( ( '*' | '/' ) ) )=> ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePointExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPointExpressionAccess().getPowExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePowExpression_in_rulePointExpression1969);
            this_PowExpression_0=rulePowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PowExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:839:1: ()
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:840:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElementAndSet(
                          grammarAccess.getPointExpressionAccess().getPointExpressionLeftAction_1(),
                          current);
                  
            }

            }

            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:845:2: ( ( ( ( ( '*' | '/' ) ) )=> ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePointExpression ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                int LA11_1 = input.LA(2);

                if ( (synpred5_InternalExpression()) ) {
                    alt11=1;
                }
            }
            else if ( (LA11_0==26) ) {
                int LA11_2 = input.LA(2);

                if ( (synpred5_InternalExpression()) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:845:3: ( ( ( ( '*' | '/' ) ) )=> ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePointExpression ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:845:3: ( ( ( ( '*' | '/' ) ) )=> ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:845:4: ( ( ( '*' | '/' ) ) )=> ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:858:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:859:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:859:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==25) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==26) ) {
                        alt10=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:860:3: lv_op_2_1= '*'
                            {
                            lv_op_2_1=(Token)match(input,25,FOLLOW_25_in_rulePointExpression2032); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_1, grammarAccess.getPointExpressionAccess().getOpAsteriskKeyword_2_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPointExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:872:8: lv_op_2_2= '/'
                            {
                            lv_op_2_2=(Token)match(input,26,FOLLOW_26_in_rulePointExpression2061); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_2, grammarAccess.getPointExpressionAccess().getOpSolidusKeyword_2_0_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPointExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:887:2: ( (lv_right_3_0= rulePointExpression ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:888:1: (lv_right_3_0= rulePointExpression )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:888:1: (lv_right_3_0= rulePointExpression )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:889:3: lv_right_3_0= rulePointExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPointExpressionAccess().getRightPointExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePointExpression_in_rulePointExpression2098);
                    lv_right_3_0=rulePointExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPointExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"PointExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePointExpression"


    // $ANTLR start "entryRulePowExpression"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:913:1: entryRulePowExpression returns [EObject current=null] : iv_rulePowExpression= rulePowExpression EOF ;
    public final EObject entryRulePowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePowExpression = null;


        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:914:2: (iv_rulePowExpression= rulePowExpression EOF )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:915:2: iv_rulePowExpression= rulePowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPowExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePowExpression_in_entryRulePowExpression2136);
            iv_rulePowExpression=rulePowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePowExpression2146); if (state.failed) return current;

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
    // $ANTLR end "entryRulePowExpression"


    // $ANTLR start "rulePowExpression"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:922:1: rulePowExpression returns [EObject current=null] : (this_QualifierExpression_0= ruleQualifierExpression () ( ( ( ( '^' ) )=> (lv_op_2_0= '^' ) ) ( (lv_right_3_0= rulePowExpression ) ) )? ) ;
    public final EObject rulePowExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_QualifierExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:925:28: ( (this_QualifierExpression_0= ruleQualifierExpression () ( ( ( ( '^' ) )=> (lv_op_2_0= '^' ) ) ( (lv_right_3_0= rulePowExpression ) ) )? ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:926:1: (this_QualifierExpression_0= ruleQualifierExpression () ( ( ( ( '^' ) )=> (lv_op_2_0= '^' ) ) ( (lv_right_3_0= rulePowExpression ) ) )? )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:926:1: (this_QualifierExpression_0= ruleQualifierExpression () ( ( ( ( '^' ) )=> (lv_op_2_0= '^' ) ) ( (lv_right_3_0= rulePowExpression ) ) )? )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:927:5: this_QualifierExpression_0= ruleQualifierExpression () ( ( ( ( '^' ) )=> (lv_op_2_0= '^' ) ) ( (lv_right_3_0= rulePowExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPowExpressionAccess().getQualifierExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifierExpression_in_rulePowExpression2193);
            this_QualifierExpression_0=ruleQualifierExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_QualifierExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:935:1: ()
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:936:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElementAndSet(
                          grammarAccess.getPowExpressionAccess().getPowExpressionLeftAction_1(),
                          current);
                  
            }

            }

            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:941:2: ( ( ( ( '^' ) )=> (lv_op_2_0= '^' ) ) ( (lv_right_3_0= rulePowExpression ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                int LA12_1 = input.LA(2);

                if ( (synpred6_InternalExpression()) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:941:3: ( ( ( '^' ) )=> (lv_op_2_0= '^' ) ) ( (lv_right_3_0= rulePowExpression ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:941:3: ( ( ( '^' ) )=> (lv_op_2_0= '^' ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:941:4: ( ( '^' ) )=> (lv_op_2_0= '^' )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:948:1: (lv_op_2_0= '^' )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:949:3: lv_op_2_0= '^'
                    {
                    lv_op_2_0=(Token)match(input,27,FOLLOW_27_in_rulePowExpression2235); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_op_2_0, grammarAccess.getPowExpressionAccess().getOpCircumflexAccentKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPowExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "op", lv_op_2_0, "^");
                      	    
                    }

                    }


                    }

                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:962:2: ( (lv_right_3_0= rulePowExpression ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:963:1: (lv_right_3_0= rulePowExpression )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:963:1: (lv_right_3_0= rulePowExpression )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:964:3: lv_right_3_0= rulePowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPowExpressionAccess().getRightPowExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePowExpression_in_rulePowExpression2269);
                    lv_right_3_0=rulePowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPowExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"PowExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePowExpression"


    // $ANTLR start "entryRuleQualifierExpression"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:988:1: entryRuleQualifierExpression returns [EObject current=null] : iv_ruleQualifierExpression= ruleQualifierExpression EOF ;
    public final EObject entryRuleQualifierExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifierExpression = null;


        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:989:2: (iv_ruleQualifierExpression= ruleQualifierExpression EOF )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:990:2: iv_ruleQualifierExpression= ruleQualifierExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifierExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleQualifierExpression_in_entryRuleQualifierExpression2307);
            iv_ruleQualifierExpression=ruleQualifierExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifierExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifierExpression2317); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifierExpression"


    // $ANTLR start "ruleQualifierExpression"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:997:1: ruleQualifierExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression () ( ( ( ( '.' ) )=> (lv_op_2_0= '.' ) ) ( (lv_right_3_0= ruleQualifierExpression ) ) )? ) ;
    public final EObject ruleQualifierExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1000:28: ( (this_PrimaryExpression_0= rulePrimaryExpression () ( ( ( ( '.' ) )=> (lv_op_2_0= '.' ) ) ( (lv_right_3_0= ruleQualifierExpression ) ) )? ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1001:1: (this_PrimaryExpression_0= rulePrimaryExpression () ( ( ( ( '.' ) )=> (lv_op_2_0= '.' ) ) ( (lv_right_3_0= ruleQualifierExpression ) ) )? )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1001:1: (this_PrimaryExpression_0= rulePrimaryExpression () ( ( ( ( '.' ) )=> (lv_op_2_0= '.' ) ) ( (lv_right_3_0= ruleQualifierExpression ) ) )? )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1002:5: this_PrimaryExpression_0= rulePrimaryExpression () ( ( ( ( '.' ) )=> (lv_op_2_0= '.' ) ) ( (lv_right_3_0= ruleQualifierExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifierExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleQualifierExpression2364);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1010:1: ()
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1011:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElementAndSet(
                          grammarAccess.getQualifierExpressionAccess().getQualifierExpressionLeftAction_1(),
                          current);
                  
            }

            }

            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1016:2: ( ( ( ( '.' ) )=> (lv_op_2_0= '.' ) ) ( (lv_right_3_0= ruleQualifierExpression ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                int LA13_1 = input.LA(2);

                if ( (synpred7_InternalExpression()) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1016:3: ( ( ( '.' ) )=> (lv_op_2_0= '.' ) ) ( (lv_right_3_0= ruleQualifierExpression ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1016:3: ( ( ( '.' ) )=> (lv_op_2_0= '.' ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1016:4: ( ( '.' ) )=> (lv_op_2_0= '.' )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1023:1: (lv_op_2_0= '.' )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1024:3: lv_op_2_0= '.'
                    {
                    lv_op_2_0=(Token)match(input,28,FOLLOW_28_in_ruleQualifierExpression2406); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_op_2_0, grammarAccess.getQualifierExpressionAccess().getOpFullStopKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getQualifierExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "op", lv_op_2_0, ".");
                      	    
                    }

                    }


                    }

                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1037:2: ( (lv_right_3_0= ruleQualifierExpression ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1038:1: (lv_right_3_0= ruleQualifierExpression )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1038:1: (lv_right_3_0= ruleQualifierExpression )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1039:3: lv_right_3_0= ruleQualifierExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQualifierExpressionAccess().getRightQualifierExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifierExpression_in_ruleQualifierExpression2440);
                    lv_right_3_0=ruleQualifierExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getQualifierExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"QualifierExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifierExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1063:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1064:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1065:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2478);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression2488); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1072:1: rulePrimaryExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression | this_FunctionCall_1= ruleFunctionCall | this_ListExpression_2= ruleListExpression ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryExpression_0 = null;

        EObject this_FunctionCall_1 = null;

        EObject this_ListExpression_2 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1075:28: ( (this_UnaryExpression_0= ruleUnaryExpression | this_FunctionCall_1= ruleFunctionCall | this_ListExpression_2= ruleListExpression ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1076:1: (this_UnaryExpression_0= ruleUnaryExpression | this_FunctionCall_1= ruleFunctionCall | this_ListExpression_2= ruleListExpression )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1076:1: (this_UnaryExpression_0= ruleUnaryExpression | this_FunctionCall_1= ruleFunctionCall | this_ListExpression_2= ruleListExpression )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==29) ) {
                    alt14=2;
                }
                else if ( (LA14_1==EOF||LA14_1==12||(LA14_1>=15 && LA14_1<=28)||(LA14_1>=30 && LA14_1<=31)||(LA14_1>=38 && LA14_1<=39)||(LA14_1>=43 && LA14_1<=44)||(LA14_1>=46 && LA14_1<=47)) ) {
                    alt14=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_DOUBLE:
            case 29:
            case 45:
            case 49:
                {
                alt14=1;
                }
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 40:
            case 41:
            case 42:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1077:5: this_UnaryExpression_0= ruleUnaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnaryExpression_in_rulePrimaryExpression2535);
                    this_UnaryExpression_0=ruleUnaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnaryExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1087:5: this_FunctionCall_1= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFunctionCallParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionCall_in_rulePrimaryExpression2562);
                    this_FunctionCall_1=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionCall_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1097:5: this_ListExpression_2= ruleListExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getListExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleListExpression_in_rulePrimaryExpression2589);
                    this_ListExpression_2=ruleListExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ListExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleFunctionCall"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1113:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1114:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1115:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall2624);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall2634); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1122:1: ruleFunctionCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpressionList ) )? otherlv_3= ')' ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_params_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1125:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpressionList ) )? otherlv_3= ')' ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1126:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpressionList ) )? otherlv_3= ')' )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1126:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpressionList ) )? otherlv_3= ')' )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1126:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleExpressionList ) )? otherlv_3= ')'
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1126:2: ( (otherlv_0= RULE_ID ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1127:1: (otherlv_0= RULE_ID )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1127:1: (otherlv_0= RULE_ID )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1128:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionCallRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionCall2679); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getFunctionFunctionCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleFunctionCall2691); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1143:1: ( (lv_params_2_0= ruleExpressionList ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_DOUBLE)||LA15_0==29||(LA15_0>=32 && LA15_0<=37)||(LA15_0>=40 && LA15_0<=42)||LA15_0==45||LA15_0==49) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1144:1: (lv_params_2_0= ruleExpressionList )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1144:1: (lv_params_2_0= ruleExpressionList )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1145:3: lv_params_2_0= ruleExpressionList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParamsExpressionListParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpressionList_in_ruleFunctionCall2712);
                    lv_params_2_0=ruleExpressionList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                      	        }
                             		set(
                             			current, 
                             			"params",
                              		lv_params_2_0, 
                              		"ExpressionList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleFunctionCall2725); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleExpressionList"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1175:1: entryRuleExpressionList returns [EObject current=null] : iv_ruleExpressionList= ruleExpressionList EOF ;
    public final EObject entryRuleExpressionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionList = null;


        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1176:2: (iv_ruleExpressionList= ruleExpressionList EOF )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1177:2: iv_ruleExpressionList= ruleExpressionList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionListRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionList_in_entryRuleExpressionList2763);
            iv_ruleExpressionList=ruleExpressionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionList2773); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionList"


    // $ANTLR start "ruleExpressionList"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1184:1: ruleExpressionList returns [EObject current=null] : ( ( (lv_head_0_0= ruleExpression ) ) ( (lv_tail_1_0= ruleExpressionRest ) )* ) ;
    public final EObject ruleExpressionList() throws RecognitionException {
        EObject current = null;

        EObject lv_head_0_0 = null;

        EObject lv_tail_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1187:28: ( ( ( (lv_head_0_0= ruleExpression ) ) ( (lv_tail_1_0= ruleExpressionRest ) )* ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1188:1: ( ( (lv_head_0_0= ruleExpression ) ) ( (lv_tail_1_0= ruleExpressionRest ) )* )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1188:1: ( ( (lv_head_0_0= ruleExpression ) ) ( (lv_tail_1_0= ruleExpressionRest ) )* )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1188:2: ( (lv_head_0_0= ruleExpression ) ) ( (lv_tail_1_0= ruleExpressionRest ) )*
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1188:2: ( (lv_head_0_0= ruleExpression ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1189:1: (lv_head_0_0= ruleExpression )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1189:1: (lv_head_0_0= ruleExpression )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1190:3: lv_head_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionListAccess().getHeadExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionList2819);
            lv_head_0_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExpressionListRule());
              	        }
                     		set(
                     			current, 
                     			"head",
                      		lv_head_0_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1206:2: ( (lv_tail_1_0= ruleExpressionRest ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==31) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1207:1: (lv_tail_1_0= ruleExpressionRest )
            	    {
            	    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1207:1: (lv_tail_1_0= ruleExpressionRest )
            	    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1208:3: lv_tail_1_0= ruleExpressionRest
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionListAccess().getTailExpressionRestParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionRest_in_ruleExpressionList2840);
            	    lv_tail_1_0=ruleExpressionRest();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"tail",
            	              		lv_tail_1_0, 
            	              		"ExpressionRest");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpressionList"


    // $ANTLR start "entryRuleExpressionRest"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1232:1: entryRuleExpressionRest returns [EObject current=null] : iv_ruleExpressionRest= ruleExpressionRest EOF ;
    public final EObject entryRuleExpressionRest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionRest = null;


        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1233:2: (iv_ruleExpressionRest= ruleExpressionRest EOF )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1234:2: iv_ruleExpressionRest= ruleExpressionRest EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRestRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionRest_in_entryRuleExpressionRest2877);
            iv_ruleExpressionRest=ruleExpressionRest();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionRest; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionRest2887); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionRest"


    // $ANTLR start "ruleExpressionRest"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1241:1: ruleExpressionRest returns [EObject current=null] : (otherlv_0= ',' this_Expression_1= ruleExpression ) ;
    public final EObject ruleExpressionRest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1244:28: ( (otherlv_0= ',' this_Expression_1= ruleExpression ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1245:1: (otherlv_0= ',' this_Expression_1= ruleExpression )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1245:1: (otherlv_0= ',' this_Expression_1= ruleExpression )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1245:3: otherlv_0= ',' this_Expression_1= ruleExpression
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleExpressionRest2924); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExpressionRestAccess().getCommaKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionRestAccess().getExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionRest2946);
            this_Expression_1=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Expression_1; 
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpressionRest"


    // $ANTLR start "entryRuleListExpression"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1266:1: entryRuleListExpression returns [EObject current=null] : iv_ruleListExpression= ruleListExpression EOF ;
    public final EObject entryRuleListExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListExpression = null;


        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1267:2: (iv_ruleListExpression= ruleListExpression EOF )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1268:2: iv_ruleListExpression= ruleListExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleListExpression_in_entryRuleListExpression2981);
            iv_ruleListExpression=ruleListExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleListExpression2991); if (state.failed) return current;

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
    // $ANTLR end "entryRuleListExpression"


    // $ANTLR start "ruleListExpression"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1275:1: ruleListExpression returns [EObject current=null] : ( ( () ( ( ( 'THERE_IS_IN' )=>otherlv_1= 'THERE_IS_IN' ) ( (lv_expr_2_0= ruleListValue ) ) ) ) | ( () ( ( ( 'FORALL_IN' )=>otherlv_4= 'FORALL_IN' ) ( (lv_expr_5_0= ruleListValue ) ) ) ) | ( () ( ( ( 'FIRST_IN' )=>otherlv_7= 'FIRST_IN' ) ( (lv_expr_8_0= ruleListValue ) ) ) ) | ( () ( ( ( 'LAST_IN' )=>otherlv_10= 'LAST_IN' ) ( (lv_expr_11_0= ruleListValue ) ) ) ) | ( () ( ( ( 'COUNT' )=>otherlv_13= 'COUNT' ) ( (lv_expr_14_0= ruleListValue ) ) ) ) | ( () ( ( ( 'REDUCE' )=>otherlv_16= 'REDUCE' ) ( (lv_expr_17_0= ruleListValue ) ) otherlv_18= 'USING' ( (lv_usingExpr_19_0= ruleExpression ) ) otherlv_20= 'INITIAL_VALUE' ( (lv_initValue_21_0= ruleExpression ) ) ) ) | ( () ( ( ( 'SUM' )=>otherlv_23= 'SUM' ) ( (lv_expr_24_0= ruleListValue ) ) otherlv_25= 'USING' ( (lv_usingExpr_26_0= ruleExpression ) ) ) ) | ( () ( ( ( 'MAP' )=>otherlv_28= 'MAP' ) ( (lv_expr_29_0= ruleListValue ) ) otherlv_30= 'USING' ( (lv_usingExpr_31_0= ruleExpression ) ) ) ) | ( () ( ( ( 'APPLY' )=>otherlv_33= 'APPLY' ) ( (lv_applyExpr_34_0= ruleExpression ) ) otherlv_35= 'ON' ( (lv_expr_36_0= ruleListValue ) ) ) ) ) ;
    public final EObject ruleListExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        EObject lv_expr_2_0 = null;

        EObject lv_expr_5_0 = null;

        EObject lv_expr_8_0 = null;

        EObject lv_expr_11_0 = null;

        EObject lv_expr_14_0 = null;

        EObject lv_expr_17_0 = null;

        EObject lv_usingExpr_19_0 = null;

        EObject lv_initValue_21_0 = null;

        EObject lv_expr_24_0 = null;

        EObject lv_usingExpr_26_0 = null;

        EObject lv_expr_29_0 = null;

        EObject lv_usingExpr_31_0 = null;

        EObject lv_applyExpr_34_0 = null;

        EObject lv_expr_36_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1278:28: ( ( ( () ( ( ( 'THERE_IS_IN' )=>otherlv_1= 'THERE_IS_IN' ) ( (lv_expr_2_0= ruleListValue ) ) ) ) | ( () ( ( ( 'FORALL_IN' )=>otherlv_4= 'FORALL_IN' ) ( (lv_expr_5_0= ruleListValue ) ) ) ) | ( () ( ( ( 'FIRST_IN' )=>otherlv_7= 'FIRST_IN' ) ( (lv_expr_8_0= ruleListValue ) ) ) ) | ( () ( ( ( 'LAST_IN' )=>otherlv_10= 'LAST_IN' ) ( (lv_expr_11_0= ruleListValue ) ) ) ) | ( () ( ( ( 'COUNT' )=>otherlv_13= 'COUNT' ) ( (lv_expr_14_0= ruleListValue ) ) ) ) | ( () ( ( ( 'REDUCE' )=>otherlv_16= 'REDUCE' ) ( (lv_expr_17_0= ruleListValue ) ) otherlv_18= 'USING' ( (lv_usingExpr_19_0= ruleExpression ) ) otherlv_20= 'INITIAL_VALUE' ( (lv_initValue_21_0= ruleExpression ) ) ) ) | ( () ( ( ( 'SUM' )=>otherlv_23= 'SUM' ) ( (lv_expr_24_0= ruleListValue ) ) otherlv_25= 'USING' ( (lv_usingExpr_26_0= ruleExpression ) ) ) ) | ( () ( ( ( 'MAP' )=>otherlv_28= 'MAP' ) ( (lv_expr_29_0= ruleListValue ) ) otherlv_30= 'USING' ( (lv_usingExpr_31_0= ruleExpression ) ) ) ) | ( () ( ( ( 'APPLY' )=>otherlv_33= 'APPLY' ) ( (lv_applyExpr_34_0= ruleExpression ) ) otherlv_35= 'ON' ( (lv_expr_36_0= ruleListValue ) ) ) ) ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1279:1: ( ( () ( ( ( 'THERE_IS_IN' )=>otherlv_1= 'THERE_IS_IN' ) ( (lv_expr_2_0= ruleListValue ) ) ) ) | ( () ( ( ( 'FORALL_IN' )=>otherlv_4= 'FORALL_IN' ) ( (lv_expr_5_0= ruleListValue ) ) ) ) | ( () ( ( ( 'FIRST_IN' )=>otherlv_7= 'FIRST_IN' ) ( (lv_expr_8_0= ruleListValue ) ) ) ) | ( () ( ( ( 'LAST_IN' )=>otherlv_10= 'LAST_IN' ) ( (lv_expr_11_0= ruleListValue ) ) ) ) | ( () ( ( ( 'COUNT' )=>otherlv_13= 'COUNT' ) ( (lv_expr_14_0= ruleListValue ) ) ) ) | ( () ( ( ( 'REDUCE' )=>otherlv_16= 'REDUCE' ) ( (lv_expr_17_0= ruleListValue ) ) otherlv_18= 'USING' ( (lv_usingExpr_19_0= ruleExpression ) ) otherlv_20= 'INITIAL_VALUE' ( (lv_initValue_21_0= ruleExpression ) ) ) ) | ( () ( ( ( 'SUM' )=>otherlv_23= 'SUM' ) ( (lv_expr_24_0= ruleListValue ) ) otherlv_25= 'USING' ( (lv_usingExpr_26_0= ruleExpression ) ) ) ) | ( () ( ( ( 'MAP' )=>otherlv_28= 'MAP' ) ( (lv_expr_29_0= ruleListValue ) ) otherlv_30= 'USING' ( (lv_usingExpr_31_0= ruleExpression ) ) ) ) | ( () ( ( ( 'APPLY' )=>otherlv_33= 'APPLY' ) ( (lv_applyExpr_34_0= ruleExpression ) ) otherlv_35= 'ON' ( (lv_expr_36_0= ruleListValue ) ) ) ) )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1279:1: ( ( () ( ( ( 'THERE_IS_IN' )=>otherlv_1= 'THERE_IS_IN' ) ( (lv_expr_2_0= ruleListValue ) ) ) ) | ( () ( ( ( 'FORALL_IN' )=>otherlv_4= 'FORALL_IN' ) ( (lv_expr_5_0= ruleListValue ) ) ) ) | ( () ( ( ( 'FIRST_IN' )=>otherlv_7= 'FIRST_IN' ) ( (lv_expr_8_0= ruleListValue ) ) ) ) | ( () ( ( ( 'LAST_IN' )=>otherlv_10= 'LAST_IN' ) ( (lv_expr_11_0= ruleListValue ) ) ) ) | ( () ( ( ( 'COUNT' )=>otherlv_13= 'COUNT' ) ( (lv_expr_14_0= ruleListValue ) ) ) ) | ( () ( ( ( 'REDUCE' )=>otherlv_16= 'REDUCE' ) ( (lv_expr_17_0= ruleListValue ) ) otherlv_18= 'USING' ( (lv_usingExpr_19_0= ruleExpression ) ) otherlv_20= 'INITIAL_VALUE' ( (lv_initValue_21_0= ruleExpression ) ) ) ) | ( () ( ( ( 'SUM' )=>otherlv_23= 'SUM' ) ( (lv_expr_24_0= ruleListValue ) ) otherlv_25= 'USING' ( (lv_usingExpr_26_0= ruleExpression ) ) ) ) | ( () ( ( ( 'MAP' )=>otherlv_28= 'MAP' ) ( (lv_expr_29_0= ruleListValue ) ) otherlv_30= 'USING' ( (lv_usingExpr_31_0= ruleExpression ) ) ) ) | ( () ( ( ( 'APPLY' )=>otherlv_33= 'APPLY' ) ( (lv_applyExpr_34_0= ruleExpression ) ) otherlv_35= 'ON' ( (lv_expr_36_0= ruleListValue ) ) ) ) )
            int alt17=9;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1279:2: ( () ( ( ( 'THERE_IS_IN' )=>otherlv_1= 'THERE_IS_IN' ) ( (lv_expr_2_0= ruleListValue ) ) ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1279:2: ( () ( ( ( 'THERE_IS_IN' )=>otherlv_1= 'THERE_IS_IN' ) ( (lv_expr_2_0= ruleListValue ) ) ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1279:3: () ( ( ( 'THERE_IS_IN' )=>otherlv_1= 'THERE_IS_IN' ) ( (lv_expr_2_0= ruleListValue ) ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1279:3: ()
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1280:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getListExpressionAccess().getThereIsInAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1285:2: ( ( ( 'THERE_IS_IN' )=>otherlv_1= 'THERE_IS_IN' ) ( (lv_expr_2_0= ruleListValue ) ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1285:3: ( ( 'THERE_IS_IN' )=>otherlv_1= 'THERE_IS_IN' ) ( (lv_expr_2_0= ruleListValue ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1285:3: ( ( 'THERE_IS_IN' )=>otherlv_1= 'THERE_IS_IN' )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1285:4: ( 'THERE_IS_IN' )=>otherlv_1= 'THERE_IS_IN'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleListExpression3047); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getListExpressionAccess().getTHERE_IS_INKeyword_0_1_0());
                          
                    }

                    }

                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1290:2: ( (lv_expr_2_0= ruleListValue ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1291:1: (lv_expr_2_0= ruleListValue )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1291:1: (lv_expr_2_0= ruleListValue )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1292:3: lv_expr_2_0= ruleListValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_0_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleListValue_in_ruleListExpression3069);
                    lv_expr_2_0=ruleListValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getListExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_2_0, 
                              		"ListValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1309:6: ( () ( ( ( 'FORALL_IN' )=>otherlv_4= 'FORALL_IN' ) ( (lv_expr_5_0= ruleListValue ) ) ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1309:6: ( () ( ( ( 'FORALL_IN' )=>otherlv_4= 'FORALL_IN' ) ( (lv_expr_5_0= ruleListValue ) ) ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1309:7: () ( ( ( 'FORALL_IN' )=>otherlv_4= 'FORALL_IN' ) ( (lv_expr_5_0= ruleListValue ) ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1309:7: ()
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1310:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getListExpressionAccess().getForallInAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1315:2: ( ( ( 'FORALL_IN' )=>otherlv_4= 'FORALL_IN' ) ( (lv_expr_5_0= ruleListValue ) ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1315:3: ( ( 'FORALL_IN' )=>otherlv_4= 'FORALL_IN' ) ( (lv_expr_5_0= ruleListValue ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1315:3: ( ( 'FORALL_IN' )=>otherlv_4= 'FORALL_IN' )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1315:4: ( 'FORALL_IN' )=>otherlv_4= 'FORALL_IN'
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleListExpression3108); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getListExpressionAccess().getFORALL_INKeyword_1_1_0());
                          
                    }

                    }

                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1320:2: ( (lv_expr_5_0= ruleListValue ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1321:1: (lv_expr_5_0= ruleListValue )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1321:1: (lv_expr_5_0= ruleListValue )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1322:3: lv_expr_5_0= ruleListValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleListValue_in_ruleListExpression3130);
                    lv_expr_5_0=ruleListValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getListExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_5_0, 
                              		"ListValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1339:6: ( () ( ( ( 'FIRST_IN' )=>otherlv_7= 'FIRST_IN' ) ( (lv_expr_8_0= ruleListValue ) ) ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1339:6: ( () ( ( ( 'FIRST_IN' )=>otherlv_7= 'FIRST_IN' ) ( (lv_expr_8_0= ruleListValue ) ) ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1339:7: () ( ( ( 'FIRST_IN' )=>otherlv_7= 'FIRST_IN' ) ( (lv_expr_8_0= ruleListValue ) ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1339:7: ()
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1340:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getListExpressionAccess().getFirstInAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1345:2: ( ( ( 'FIRST_IN' )=>otherlv_7= 'FIRST_IN' ) ( (lv_expr_8_0= ruleListValue ) ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1345:3: ( ( 'FIRST_IN' )=>otherlv_7= 'FIRST_IN' ) ( (lv_expr_8_0= ruleListValue ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1345:3: ( ( 'FIRST_IN' )=>otherlv_7= 'FIRST_IN' )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1345:4: ( 'FIRST_IN' )=>otherlv_7= 'FIRST_IN'
                    {
                    otherlv_7=(Token)match(input,34,FOLLOW_34_in_ruleListExpression3169); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getListExpressionAccess().getFIRST_INKeyword_2_1_0());
                          
                    }

                    }

                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1350:2: ( (lv_expr_8_0= ruleListValue ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1351:1: (lv_expr_8_0= ruleListValue )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1351:1: (lv_expr_8_0= ruleListValue )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1352:3: lv_expr_8_0= ruleListValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleListValue_in_ruleListExpression3191);
                    lv_expr_8_0=ruleListValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getListExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_8_0, 
                              		"ListValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1369:6: ( () ( ( ( 'LAST_IN' )=>otherlv_10= 'LAST_IN' ) ( (lv_expr_11_0= ruleListValue ) ) ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1369:6: ( () ( ( ( 'LAST_IN' )=>otherlv_10= 'LAST_IN' ) ( (lv_expr_11_0= ruleListValue ) ) ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1369:7: () ( ( ( 'LAST_IN' )=>otherlv_10= 'LAST_IN' ) ( (lv_expr_11_0= ruleListValue ) ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1369:7: ()
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1370:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getListExpressionAccess().getLastInAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1375:2: ( ( ( 'LAST_IN' )=>otherlv_10= 'LAST_IN' ) ( (lv_expr_11_0= ruleListValue ) ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1375:3: ( ( 'LAST_IN' )=>otherlv_10= 'LAST_IN' ) ( (lv_expr_11_0= ruleListValue ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1375:3: ( ( 'LAST_IN' )=>otherlv_10= 'LAST_IN' )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1375:4: ( 'LAST_IN' )=>otherlv_10= 'LAST_IN'
                    {
                    otherlv_10=(Token)match(input,35,FOLLOW_35_in_ruleListExpression3230); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getListExpressionAccess().getLAST_INKeyword_3_1_0());
                          
                    }

                    }

                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1380:2: ( (lv_expr_11_0= ruleListValue ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1381:1: (lv_expr_11_0= ruleListValue )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1381:1: (lv_expr_11_0= ruleListValue )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1382:3: lv_expr_11_0= ruleListValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleListValue_in_ruleListExpression3252);
                    lv_expr_11_0=ruleListValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getListExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_11_0, 
                              		"ListValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1399:6: ( () ( ( ( 'COUNT' )=>otherlv_13= 'COUNT' ) ( (lv_expr_14_0= ruleListValue ) ) ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1399:6: ( () ( ( ( 'COUNT' )=>otherlv_13= 'COUNT' ) ( (lv_expr_14_0= ruleListValue ) ) ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1399:7: () ( ( ( 'COUNT' )=>otherlv_13= 'COUNT' ) ( (lv_expr_14_0= ruleListValue ) ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1399:7: ()
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1400:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getListExpressionAccess().getCountAction_4_0(),
                                  current);
                          
                    }

                    }

                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1405:2: ( ( ( 'COUNT' )=>otherlv_13= 'COUNT' ) ( (lv_expr_14_0= ruleListValue ) ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1405:3: ( ( 'COUNT' )=>otherlv_13= 'COUNT' ) ( (lv_expr_14_0= ruleListValue ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1405:3: ( ( 'COUNT' )=>otherlv_13= 'COUNT' )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1405:4: ( 'COUNT' )=>otherlv_13= 'COUNT'
                    {
                    otherlv_13=(Token)match(input,36,FOLLOW_36_in_ruleListExpression3291); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getListExpressionAccess().getCOUNTKeyword_4_1_0());
                          
                    }

                    }

                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1410:2: ( (lv_expr_14_0= ruleListValue ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1411:1: (lv_expr_14_0= ruleListValue )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1411:1: (lv_expr_14_0= ruleListValue )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1412:3: lv_expr_14_0= ruleListValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_4_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleListValue_in_ruleListExpression3313);
                    lv_expr_14_0=ruleListValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getListExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_14_0, 
                              		"ListValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1429:6: ( () ( ( ( 'REDUCE' )=>otherlv_16= 'REDUCE' ) ( (lv_expr_17_0= ruleListValue ) ) otherlv_18= 'USING' ( (lv_usingExpr_19_0= ruleExpression ) ) otherlv_20= 'INITIAL_VALUE' ( (lv_initValue_21_0= ruleExpression ) ) ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1429:6: ( () ( ( ( 'REDUCE' )=>otherlv_16= 'REDUCE' ) ( (lv_expr_17_0= ruleListValue ) ) otherlv_18= 'USING' ( (lv_usingExpr_19_0= ruleExpression ) ) otherlv_20= 'INITIAL_VALUE' ( (lv_initValue_21_0= ruleExpression ) ) ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1429:7: () ( ( ( 'REDUCE' )=>otherlv_16= 'REDUCE' ) ( (lv_expr_17_0= ruleListValue ) ) otherlv_18= 'USING' ( (lv_usingExpr_19_0= ruleExpression ) ) otherlv_20= 'INITIAL_VALUE' ( (lv_initValue_21_0= ruleExpression ) ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1429:7: ()
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1430:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getListExpressionAccess().getReduceAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1435:2: ( ( ( 'REDUCE' )=>otherlv_16= 'REDUCE' ) ( (lv_expr_17_0= ruleListValue ) ) otherlv_18= 'USING' ( (lv_usingExpr_19_0= ruleExpression ) ) otherlv_20= 'INITIAL_VALUE' ( (lv_initValue_21_0= ruleExpression ) ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1435:3: ( ( 'REDUCE' )=>otherlv_16= 'REDUCE' ) ( (lv_expr_17_0= ruleListValue ) ) otherlv_18= 'USING' ( (lv_usingExpr_19_0= ruleExpression ) ) otherlv_20= 'INITIAL_VALUE' ( (lv_initValue_21_0= ruleExpression ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1435:3: ( ( 'REDUCE' )=>otherlv_16= 'REDUCE' )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1435:4: ( 'REDUCE' )=>otherlv_16= 'REDUCE'
                    {
                    otherlv_16=(Token)match(input,37,FOLLOW_37_in_ruleListExpression3352); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getListExpressionAccess().getREDUCEKeyword_5_1_0());
                          
                    }

                    }

                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1440:2: ( (lv_expr_17_0= ruleListValue ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1441:1: (lv_expr_17_0= ruleListValue )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1441:1: (lv_expr_17_0= ruleListValue )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1442:3: lv_expr_17_0= ruleListValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_5_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleListValue_in_ruleListExpression3374);
                    lv_expr_17_0=ruleListValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getListExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_17_0, 
                              		"ListValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_18=(Token)match(input,38,FOLLOW_38_in_ruleListExpression3386); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getListExpressionAccess().getUSINGKeyword_5_1_2());
                          
                    }
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1462:1: ( (lv_usingExpr_19_0= ruleExpression ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1463:1: (lv_usingExpr_19_0= ruleExpression )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1463:1: (lv_usingExpr_19_0= ruleExpression )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1464:3: lv_usingExpr_19_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getListExpressionAccess().getUsingExprExpressionParserRuleCall_5_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleListExpression3407);
                    lv_usingExpr_19_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getListExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"usingExpr",
                              		lv_usingExpr_19_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_20=(Token)match(input,39,FOLLOW_39_in_ruleListExpression3419); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getListExpressionAccess().getINITIAL_VALUEKeyword_5_1_4());
                          
                    }
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1484:1: ( (lv_initValue_21_0= ruleExpression ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1485:1: (lv_initValue_21_0= ruleExpression )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1485:1: (lv_initValue_21_0= ruleExpression )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1486:3: lv_initValue_21_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getListExpressionAccess().getInitValueExpressionParserRuleCall_5_1_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleListExpression3440);
                    lv_initValue_21_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getListExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"initValue",
                              		lv_initValue_21_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1503:6: ( () ( ( ( 'SUM' )=>otherlv_23= 'SUM' ) ( (lv_expr_24_0= ruleListValue ) ) otherlv_25= 'USING' ( (lv_usingExpr_26_0= ruleExpression ) ) ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1503:6: ( () ( ( ( 'SUM' )=>otherlv_23= 'SUM' ) ( (lv_expr_24_0= ruleListValue ) ) otherlv_25= 'USING' ( (lv_usingExpr_26_0= ruleExpression ) ) ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1503:7: () ( ( ( 'SUM' )=>otherlv_23= 'SUM' ) ( (lv_expr_24_0= ruleListValue ) ) otherlv_25= 'USING' ( (lv_usingExpr_26_0= ruleExpression ) ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1503:7: ()
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1504:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getListExpressionAccess().getSumAction_6_0(),
                                  current);
                          
                    }

                    }

                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1509:2: ( ( ( 'SUM' )=>otherlv_23= 'SUM' ) ( (lv_expr_24_0= ruleListValue ) ) otherlv_25= 'USING' ( (lv_usingExpr_26_0= ruleExpression ) ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1509:3: ( ( 'SUM' )=>otherlv_23= 'SUM' ) ( (lv_expr_24_0= ruleListValue ) ) otherlv_25= 'USING' ( (lv_usingExpr_26_0= ruleExpression ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1509:3: ( ( 'SUM' )=>otherlv_23= 'SUM' )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1509:4: ( 'SUM' )=>otherlv_23= 'SUM'
                    {
                    otherlv_23=(Token)match(input,40,FOLLOW_40_in_ruleListExpression3479); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getListExpressionAccess().getSUMKeyword_6_1_0());
                          
                    }

                    }

                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1514:2: ( (lv_expr_24_0= ruleListValue ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1515:1: (lv_expr_24_0= ruleListValue )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1515:1: (lv_expr_24_0= ruleListValue )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1516:3: lv_expr_24_0= ruleListValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_6_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleListValue_in_ruleListExpression3501);
                    lv_expr_24_0=ruleListValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getListExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_24_0, 
                              		"ListValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_25=(Token)match(input,38,FOLLOW_38_in_ruleListExpression3513); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getListExpressionAccess().getUSINGKeyword_6_1_2());
                          
                    }
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1536:1: ( (lv_usingExpr_26_0= ruleExpression ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1537:1: (lv_usingExpr_26_0= ruleExpression )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1537:1: (lv_usingExpr_26_0= ruleExpression )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1538:3: lv_usingExpr_26_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getListExpressionAccess().getUsingExprExpressionParserRuleCall_6_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleListExpression3534);
                    lv_usingExpr_26_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getListExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"usingExpr",
                              		lv_usingExpr_26_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1555:6: ( () ( ( ( 'MAP' )=>otherlv_28= 'MAP' ) ( (lv_expr_29_0= ruleListValue ) ) otherlv_30= 'USING' ( (lv_usingExpr_31_0= ruleExpression ) ) ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1555:6: ( () ( ( ( 'MAP' )=>otherlv_28= 'MAP' ) ( (lv_expr_29_0= ruleListValue ) ) otherlv_30= 'USING' ( (lv_usingExpr_31_0= ruleExpression ) ) ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1555:7: () ( ( ( 'MAP' )=>otherlv_28= 'MAP' ) ( (lv_expr_29_0= ruleListValue ) ) otherlv_30= 'USING' ( (lv_usingExpr_31_0= ruleExpression ) ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1555:7: ()
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1556:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getListExpressionAccess().getMapAction_7_0(),
                                  current);
                          
                    }

                    }

                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1561:2: ( ( ( 'MAP' )=>otherlv_28= 'MAP' ) ( (lv_expr_29_0= ruleListValue ) ) otherlv_30= 'USING' ( (lv_usingExpr_31_0= ruleExpression ) ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1561:3: ( ( 'MAP' )=>otherlv_28= 'MAP' ) ( (lv_expr_29_0= ruleListValue ) ) otherlv_30= 'USING' ( (lv_usingExpr_31_0= ruleExpression ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1561:3: ( ( 'MAP' )=>otherlv_28= 'MAP' )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1561:4: ( 'MAP' )=>otherlv_28= 'MAP'
                    {
                    otherlv_28=(Token)match(input,41,FOLLOW_41_in_ruleListExpression3573); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_28, grammarAccess.getListExpressionAccess().getMAPKeyword_7_1_0());
                          
                    }

                    }

                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1566:2: ( (lv_expr_29_0= ruleListValue ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1567:1: (lv_expr_29_0= ruleListValue )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1567:1: (lv_expr_29_0= ruleListValue )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1568:3: lv_expr_29_0= ruleListValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_7_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleListValue_in_ruleListExpression3595);
                    lv_expr_29_0=ruleListValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getListExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_29_0, 
                              		"ListValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_30=(Token)match(input,38,FOLLOW_38_in_ruleListExpression3607); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_30, grammarAccess.getListExpressionAccess().getUSINGKeyword_7_1_2());
                          
                    }
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1588:1: ( (lv_usingExpr_31_0= ruleExpression ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1589:1: (lv_usingExpr_31_0= ruleExpression )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1589:1: (lv_usingExpr_31_0= ruleExpression )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1590:3: lv_usingExpr_31_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getListExpressionAccess().getUsingExprExpressionParserRuleCall_7_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleListExpression3628);
                    lv_usingExpr_31_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getListExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"usingExpr",
                              		lv_usingExpr_31_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1607:6: ( () ( ( ( 'APPLY' )=>otherlv_33= 'APPLY' ) ( (lv_applyExpr_34_0= ruleExpression ) ) otherlv_35= 'ON' ( (lv_expr_36_0= ruleListValue ) ) ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1607:6: ( () ( ( ( 'APPLY' )=>otherlv_33= 'APPLY' ) ( (lv_applyExpr_34_0= ruleExpression ) ) otherlv_35= 'ON' ( (lv_expr_36_0= ruleListValue ) ) ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1607:7: () ( ( ( 'APPLY' )=>otherlv_33= 'APPLY' ) ( (lv_applyExpr_34_0= ruleExpression ) ) otherlv_35= 'ON' ( (lv_expr_36_0= ruleListValue ) ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1607:7: ()
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1608:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getListExpressionAccess().getApplyAction_8_0(),
                                  current);
                          
                    }

                    }

                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1613:2: ( ( ( 'APPLY' )=>otherlv_33= 'APPLY' ) ( (lv_applyExpr_34_0= ruleExpression ) ) otherlv_35= 'ON' ( (lv_expr_36_0= ruleListValue ) ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1613:3: ( ( 'APPLY' )=>otherlv_33= 'APPLY' ) ( (lv_applyExpr_34_0= ruleExpression ) ) otherlv_35= 'ON' ( (lv_expr_36_0= ruleListValue ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1613:3: ( ( 'APPLY' )=>otherlv_33= 'APPLY' )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1613:4: ( 'APPLY' )=>otherlv_33= 'APPLY'
                    {
                    otherlv_33=(Token)match(input,42,FOLLOW_42_in_ruleListExpression3667); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_33, grammarAccess.getListExpressionAccess().getAPPLYKeyword_8_1_0());
                          
                    }

                    }

                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1618:2: ( (lv_applyExpr_34_0= ruleExpression ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1619:1: (lv_applyExpr_34_0= ruleExpression )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1619:1: (lv_applyExpr_34_0= ruleExpression )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1620:3: lv_applyExpr_34_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getListExpressionAccess().getApplyExprExpressionParserRuleCall_8_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleListExpression3689);
                    lv_applyExpr_34_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getListExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"applyExpr",
                              		lv_applyExpr_34_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_35=(Token)match(input,43,FOLLOW_43_in_ruleListExpression3701); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_35, grammarAccess.getListExpressionAccess().getONKeyword_8_1_2());
                          
                    }
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1640:1: ( (lv_expr_36_0= ruleListValue ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1641:1: (lv_expr_36_0= ruleListValue )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1641:1: (lv_expr_36_0= ruleListValue )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1642:3: lv_expr_36_0= ruleListValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_8_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleListValue_in_ruleListExpression3722);
                    lv_expr_36_0=ruleListValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getListExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_36_0, 
                              		"ListValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleListExpression"


    // $ANTLR start "entryRuleListValue"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1666:1: entryRuleListValue returns [EObject current=null] : iv_ruleListValue= ruleListValue EOF ;
    public final EObject entryRuleListValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListValue = null;


        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1667:2: (iv_ruleListValue= ruleListValue EOF )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1668:2: iv_ruleListValue= ruleListValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListValueRule()); 
            }
            pushFollow(FOLLOW_ruleListValue_in_entryRuleListValue3760);
            iv_ruleListValue=ruleListValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleListValue3770); if (state.failed) return current;

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
    // $ANTLR end "entryRuleListValue"


    // $ANTLR start "ruleListValue"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1675:1: ruleListValue returns [EObject current=null] : (this_Expression_0= ruleExpression ( ( ( '|' )=>otherlv_1= '|' ) ( (lv_condition_2_0= ruleCondition ) ) )? ) ;
    public final EObject ruleListValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Expression_0 = null;

        EObject lv_condition_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1678:28: ( (this_Expression_0= ruleExpression ( ( ( '|' )=>otherlv_1= '|' ) ( (lv_condition_2_0= ruleCondition ) ) )? ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1679:1: (this_Expression_0= ruleExpression ( ( ( '|' )=>otherlv_1= '|' ) ( (lv_condition_2_0= ruleCondition ) ) )? )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1679:1: (this_Expression_0= ruleExpression ( ( ( '|' )=>otherlv_1= '|' ) ( (lv_condition_2_0= ruleCondition ) ) )? )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1680:5: this_Expression_0= ruleExpression ( ( ( '|' )=>otherlv_1= '|' ) ( (lv_condition_2_0= ruleCondition ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getListValueAccess().getExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleListValue3817);
            this_Expression_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Expression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1688:1: ( ( ( '|' )=>otherlv_1= '|' ) ( (lv_condition_2_0= ruleCondition ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==44) ) {
                int LA18_1 = input.LA(2);

                if ( (synpred17_InternalExpression()) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1688:2: ( ( '|' )=>otherlv_1= '|' ) ( (lv_condition_2_0= ruleCondition ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1688:2: ( ( '|' )=>otherlv_1= '|' )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1688:3: ( '|' )=>otherlv_1= '|'
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleListValue3837); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getListValueAccess().getVerticalLineKeyword_1_0());
                          
                    }

                    }

                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1693:2: ( (lv_condition_2_0= ruleCondition ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1694:1: (lv_condition_2_0= ruleCondition )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1694:1: (lv_condition_2_0= ruleCondition )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1695:3: lv_condition_2_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getListValueAccess().getConditionConditionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCondition_in_ruleListValue3859);
                    lv_condition_2_0=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getListValueRule());
                      	        }
                             		set(
                             			current, 
                             			"condition",
                              		lv_condition_2_0, 
                              		"Condition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleListValue"


    // $ANTLR start "entryRuleCondition"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1719:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1720:2: (iv_ruleCondition= ruleCondition EOF )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1721:2: iv_ruleCondition= ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition3897);
            iv_ruleCondition=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition3907); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1728:1: ruleCondition returns [EObject current=null] : this_Expression_0= ruleExpression ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1731:28: (this_Expression_0= ruleExpression )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1733:5: this_Expression_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConditionAccess().getExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleCondition3953);
            this_Expression_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Expression_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleUnaryExpression"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1749:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1750:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1751:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression3987);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpression3997); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1758:1: ruleUnaryExpression returns [EObject current=null] : ( (this_Term_0= ruleTerm ( (lv_structuredExpression_1_0= ruleStructureExpression ) ) ) | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' () ( (lv_structuredExpression_6_0= ruleStructureExpression ) ) ) | (otherlv_7= 'NOT (' this_Expression_8= ruleExpression otherlv_9= ')' () ( (lv_structuredExpression_11_0= ruleStructureExpression ) ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject this_Term_0 = null;

        EObject lv_structuredExpression_1_0 = null;

        EObject this_Expression_3 = null;

        EObject lv_structuredExpression_6_0 = null;

        EObject this_Expression_8 = null;

        EObject lv_structuredExpression_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1761:28: ( ( (this_Term_0= ruleTerm ( (lv_structuredExpression_1_0= ruleStructureExpression ) ) ) | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' () ( (lv_structuredExpression_6_0= ruleStructureExpression ) ) ) | (otherlv_7= 'NOT (' this_Expression_8= ruleExpression otherlv_9= ')' () ( (lv_structuredExpression_11_0= ruleStructureExpression ) ) ) ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1762:1: ( (this_Term_0= ruleTerm ( (lv_structuredExpression_1_0= ruleStructureExpression ) ) ) | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' () ( (lv_structuredExpression_6_0= ruleStructureExpression ) ) ) | (otherlv_7= 'NOT (' this_Expression_8= ruleExpression otherlv_9= ')' () ( (lv_structuredExpression_11_0= ruleStructureExpression ) ) ) )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1762:1: ( (this_Term_0= ruleTerm ( (lv_structuredExpression_1_0= ruleStructureExpression ) ) ) | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' () ( (lv_structuredExpression_6_0= ruleStructureExpression ) ) ) | (otherlv_7= 'NOT (' this_Expression_8= ruleExpression otherlv_9= ')' () ( (lv_structuredExpression_11_0= ruleStructureExpression ) ) ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case RULE_DOUBLE:
            case 49:
                {
                alt19=1;
                }
                break;
            case 29:
                {
                alt19=2;
                }
                break;
            case 45:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1762:2: (this_Term_0= ruleTerm ( (lv_structuredExpression_1_0= ruleStructureExpression ) ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1762:2: (this_Term_0= ruleTerm ( (lv_structuredExpression_1_0= ruleStructureExpression ) ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1763:5: this_Term_0= ruleTerm ( (lv_structuredExpression_1_0= ruleStructureExpression ) )
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryExpressionAccess().getTermParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTerm_in_ruleUnaryExpression4045);
                    this_Term_0=ruleTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Term_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1771:1: ( (lv_structuredExpression_1_0= ruleStructureExpression ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1772:1: (lv_structuredExpression_1_0= ruleStructureExpression )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1772:1: (lv_structuredExpression_1_0= ruleStructureExpression )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1773:3: lv_structuredExpression_1_0= ruleStructureExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getStructuredExpressionStructureExpressionParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStructureExpression_in_ruleUnaryExpression4065);
                    lv_structuredExpression_1_0=ruleStructureExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"structuredExpression",
                              		lv_structuredExpression_1_0, 
                              		"StructureExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1790:6: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' () ( (lv_structuredExpression_6_0= ruleStructureExpression ) ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1790:6: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' () ( (lv_structuredExpression_6_0= ruleStructureExpression ) ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1790:8: otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' () ( (lv_structuredExpression_6_0= ruleStructureExpression ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleUnaryExpression4085); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getUnaryExpressionAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryExpressionAccess().getExpressionParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleUnaryExpression4107);
                    this_Expression_3=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleUnaryExpression4118); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getUnaryExpressionAccess().getRightParenthesisKeyword_1_2());
                          
                    }
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1807:1: ()
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1808:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getUnaryExpressionAccess().getUnaryExpressionExprAction_1_3(),
                                  current);
                          
                    }

                    }

                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1813:2: ( (lv_structuredExpression_6_0= ruleStructureExpression ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1814:1: (lv_structuredExpression_6_0= ruleStructureExpression )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1814:1: (lv_structuredExpression_6_0= ruleStructureExpression )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1815:3: lv_structuredExpression_6_0= ruleStructureExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getStructuredExpressionStructureExpressionParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStructureExpression_in_ruleUnaryExpression4148);
                    lv_structuredExpression_6_0=ruleStructureExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"structuredExpression",
                              		lv_structuredExpression_6_0, 
                              		"StructureExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1832:6: (otherlv_7= 'NOT (' this_Expression_8= ruleExpression otherlv_9= ')' () ( (lv_structuredExpression_11_0= ruleStructureExpression ) ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1832:6: (otherlv_7= 'NOT (' this_Expression_8= ruleExpression otherlv_9= ')' () ( (lv_structuredExpression_11_0= ruleStructureExpression ) ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1832:8: otherlv_7= 'NOT (' this_Expression_8= ruleExpression otherlv_9= ')' () ( (lv_structuredExpression_11_0= ruleStructureExpression ) )
                    {
                    otherlv_7=(Token)match(input,45,FOLLOW_45_in_ruleUnaryExpression4168); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getUnaryExpressionAccess().getNOTKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryExpressionAccess().getExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleUnaryExpression4190);
                    this_Expression_8=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_9=(Token)match(input,30,FOLLOW_30_in_ruleUnaryExpression4201); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getUnaryExpressionAccess().getRightParenthesisKeyword_2_2());
                          
                    }
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1849:1: ()
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1850:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getUnaryExpressionAccess().getUnaryExpressionExprAction_2_3(),
                                  current);
                          
                    }

                    }

                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1855:2: ( (lv_structuredExpression_11_0= ruleStructureExpression ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1856:1: (lv_structuredExpression_11_0= ruleStructureExpression )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1856:1: (lv_structuredExpression_11_0= ruleStructureExpression )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1857:3: lv_structuredExpression_11_0= ruleStructureExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getStructuredExpressionStructureExpressionParserRuleCall_2_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStructureExpression_in_ruleUnaryExpression4231);
                    lv_structuredExpression_11_0=ruleStructureExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"structuredExpression",
                              		lv_structuredExpression_11_0, 
                              		"StructureExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleStructureExpression"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1881:1: entryRuleStructureExpression returns [EObject current=null] : iv_ruleStructureExpression= ruleStructureExpression EOF ;
    public final EObject entryRuleStructureExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructureExpression = null;


        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1882:2: (iv_ruleStructureExpression= ruleStructureExpression EOF )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1883:2: iv_ruleStructureExpression= ruleStructureExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructureExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleStructureExpression_in_entryRuleStructureExpression4268);
            iv_ruleStructureExpression=ruleStructureExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructureExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructureExpression4278); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStructureExpression"


    // $ANTLR start "ruleStructureExpression"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1890:1: ruleStructureExpression returns [EObject current=null] : ( () (otherlv_1= '{' ( (lv_keyValuePair_2_0= ruleKeyValuePair ) ) otherlv_3= '}' ( (lv_structuredExpressions_4_0= ruleStructureExpression ) ) )? ) ;
    public final EObject ruleStructureExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_keyValuePair_2_0 = null;

        EObject lv_structuredExpressions_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1893:28: ( ( () (otherlv_1= '{' ( (lv_keyValuePair_2_0= ruleKeyValuePair ) ) otherlv_3= '}' ( (lv_structuredExpressions_4_0= ruleStructureExpression ) ) )? ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1894:1: ( () (otherlv_1= '{' ( (lv_keyValuePair_2_0= ruleKeyValuePair ) ) otherlv_3= '}' ( (lv_structuredExpressions_4_0= ruleStructureExpression ) ) )? )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1894:1: ( () (otherlv_1= '{' ( (lv_keyValuePair_2_0= ruleKeyValuePair ) ) otherlv_3= '}' ( (lv_structuredExpressions_4_0= ruleStructureExpression ) ) )? )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1894:2: () (otherlv_1= '{' ( (lv_keyValuePair_2_0= ruleKeyValuePair ) ) otherlv_3= '}' ( (lv_structuredExpressions_4_0= ruleStructureExpression ) ) )?
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1894:2: ()
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1895:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStructureExpressionAccess().getStructureExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1900:2: (otherlv_1= '{' ( (lv_keyValuePair_2_0= ruleKeyValuePair ) ) otherlv_3= '}' ( (lv_structuredExpressions_4_0= ruleStructureExpression ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==46) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1900:4: otherlv_1= '{' ( (lv_keyValuePair_2_0= ruleKeyValuePair ) ) otherlv_3= '}' ( (lv_structuredExpressions_4_0= ruleStructureExpression ) )
                    {
                    otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleStructureExpression4325); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStructureExpressionAccess().getLeftCurlyBracketKeyword_1_0());
                          
                    }
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1904:1: ( (lv_keyValuePair_2_0= ruleKeyValuePair ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1905:1: (lv_keyValuePair_2_0= ruleKeyValuePair )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1905:1: (lv_keyValuePair_2_0= ruleKeyValuePair )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1906:3: lv_keyValuePair_2_0= ruleKeyValuePair
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStructureExpressionAccess().getKeyValuePairKeyValuePairParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleKeyValuePair_in_ruleStructureExpression4346);
                    lv_keyValuePair_2_0=ruleKeyValuePair();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStructureExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"keyValuePair",
                              		lv_keyValuePair_2_0, 
                              		"KeyValuePair");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleStructureExpression4358); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getStructureExpressionAccess().getRightCurlyBracketKeyword_1_2());
                          
                    }
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1926:1: ( (lv_structuredExpressions_4_0= ruleStructureExpression ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1927:1: (lv_structuredExpressions_4_0= ruleStructureExpression )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1927:1: (lv_structuredExpressions_4_0= ruleStructureExpression )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1928:3: lv_structuredExpressions_4_0= ruleStructureExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStructureExpressionAccess().getStructuredExpressionsStructureExpressionParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStructureExpression_in_ruleStructureExpression4379);
                    lv_structuredExpressions_4_0=ruleStructureExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStructureExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"structuredExpressions",
                              		lv_structuredExpressions_4_0, 
                              		"StructureExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStructureExpression"


    // $ANTLR start "entryRuleKeyValuePair"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1952:1: entryRuleKeyValuePair returns [EObject current=null] : iv_ruleKeyValuePair= ruleKeyValuePair EOF ;
    public final EObject entryRuleKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePair = null;


        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1953:2: (iv_ruleKeyValuePair= ruleKeyValuePair EOF )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1954:2: iv_ruleKeyValuePair= ruleKeyValuePair EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyValuePairRule()); 
            }
            pushFollow(FOLLOW_ruleKeyValuePair_in_entryRuleKeyValuePair4417);
            iv_ruleKeyValuePair=ruleKeyValuePair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyValuePair; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyValuePair4427); if (state.failed) return current;

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
    // $ANTLR end "entryRuleKeyValuePair"


    // $ANTLR start "ruleKeyValuePair"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1961:1: ruleKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_value_2_0= ruleExpression ) ) ( (lv_rest_3_0= ruleKeyValuePairRest ) )? ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;

        EObject lv_rest_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1964:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_value_2_0= ruleExpression ) ) ( (lv_rest_3_0= ruleKeyValuePairRest ) )? ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1965:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_value_2_0= ruleExpression ) ) ( (lv_rest_3_0= ruleKeyValuePairRest ) )? )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1965:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_value_2_0= ruleExpression ) ) ( (lv_rest_3_0= ruleKeyValuePairRest ) )? )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1965:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_value_2_0= ruleExpression ) ) ( (lv_rest_3_0= ruleKeyValuePairRest ) )?
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1965:2: ( (lv_key_0_0= RULE_ID ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1966:1: (lv_key_0_0= RULE_ID )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1966:1: (lv_key_0_0= RULE_ID )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1967:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKeyValuePair4469); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_key_0_0, grammarAccess.getKeyValuePairAccess().getKeyIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getKeyValuePairRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"key",
                      		lv_key_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleKeyValuePair4486); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getKeyValuePairAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1987:1: ( (lv_value_2_0= ruleExpression ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1988:1: (lv_value_2_0= ruleExpression )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1988:1: (lv_value_2_0= ruleExpression )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1989:3: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyValuePairAccess().getValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleKeyValuePair4507);
            lv_value_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyValuePairRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2005:2: ( (lv_rest_3_0= ruleKeyValuePairRest ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2006:1: (lv_rest_3_0= ruleKeyValuePairRest )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2006:1: (lv_rest_3_0= ruleKeyValuePairRest )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2007:3: lv_rest_3_0= ruleKeyValuePairRest
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getKeyValuePairAccess().getRestKeyValuePairRestParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleKeyValuePairRest_in_ruleKeyValuePair4528);
                    lv_rest_3_0=ruleKeyValuePairRest();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getKeyValuePairRule());
                      	        }
                             		add(
                             			current, 
                             			"rest",
                              		lv_rest_3_0, 
                              		"KeyValuePairRest");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleKeyValuePair"


    // $ANTLR start "entryRuleKeyValuePairRest"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2031:1: entryRuleKeyValuePairRest returns [EObject current=null] : iv_ruleKeyValuePairRest= ruleKeyValuePairRest EOF ;
    public final EObject entryRuleKeyValuePairRest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePairRest = null;


        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2032:2: (iv_ruleKeyValuePairRest= ruleKeyValuePairRest EOF )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2033:2: iv_ruleKeyValuePairRest= ruleKeyValuePairRest EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyValuePairRestRule()); 
            }
            pushFollow(FOLLOW_ruleKeyValuePairRest_in_entryRuleKeyValuePairRest4565);
            iv_ruleKeyValuePairRest=ruleKeyValuePairRest();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyValuePairRest; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyValuePairRest4575); if (state.failed) return current;

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
    // $ANTLR end "entryRuleKeyValuePairRest"


    // $ANTLR start "ruleKeyValuePairRest"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2040:1: ruleKeyValuePairRest returns [EObject current=null] : (otherlv_0= ',' this_KeyValuePair_1= ruleKeyValuePair ) ;
    public final EObject ruleKeyValuePairRest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_KeyValuePair_1 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2043:28: ( (otherlv_0= ',' this_KeyValuePair_1= ruleKeyValuePair ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2044:1: (otherlv_0= ',' this_KeyValuePair_1= ruleKeyValuePair )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2044:1: (otherlv_0= ',' this_KeyValuePair_1= ruleKeyValuePair )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2044:3: otherlv_0= ',' this_KeyValuePair_1= ruleKeyValuePair
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleKeyValuePairRest4612); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyValuePairRestAccess().getCommaKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getKeyValuePairRestAccess().getKeyValuePairParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleKeyValuePair_in_ruleKeyValuePairRest4634);
            this_KeyValuePair_1=ruleKeyValuePair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_KeyValuePair_1; 
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleKeyValuePairRest"


    // $ANTLR start "entryRuleTerm"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2065:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2066:2: (iv_ruleTerm= ruleTerm EOF )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2067:2: iv_ruleTerm= ruleTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermRule()); 
            }
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm4669);
            iv_ruleTerm=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm4679); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2074:1: ruleTerm returns [EObject current=null] : (this_Designator_0= ruleDesignator | ( () ( (lv_value_2_0= RULE_STRING ) ) ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_DOUBLE ) ) ) | this_List_7= ruleList ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token lv_value_2_0=null;
        Token lv_value_4_0=null;
        Token lv_value_6_0=null;
        EObject this_Designator_0 = null;

        EObject this_List_7 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2077:28: ( (this_Designator_0= ruleDesignator | ( () ( (lv_value_2_0= RULE_STRING ) ) ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_DOUBLE ) ) ) | this_List_7= ruleList ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2078:1: (this_Designator_0= ruleDesignator | ( () ( (lv_value_2_0= RULE_STRING ) ) ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_DOUBLE ) ) ) | this_List_7= ruleList )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2078:1: (this_Designator_0= ruleDesignator | ( () ( (lv_value_2_0= RULE_STRING ) ) ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_DOUBLE ) ) ) | this_List_7= ruleList )
            int alt22=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt22=1;
                }
                break;
            case RULE_STRING:
                {
                alt22=2;
                }
                break;
            case RULE_INT:
                {
                alt22=3;
                }
                break;
            case RULE_DOUBLE:
                {
                alt22=4;
                }
                break;
            case 49:
                {
                alt22=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2079:5: this_Designator_0= ruleDesignator
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTermAccess().getDesignatorParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDesignator_in_ruleTerm4726);
                    this_Designator_0=ruleDesignator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Designator_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2088:6: ( () ( (lv_value_2_0= RULE_STRING ) ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2088:6: ( () ( (lv_value_2_0= RULE_STRING ) ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2088:7: () ( (lv_value_2_0= RULE_STRING ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2088:7: ()
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2089:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTermAccess().getStringValueAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2094:2: ( (lv_value_2_0= RULE_STRING ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2095:1: (lv_value_2_0= RULE_STRING )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2095:1: (lv_value_2_0= RULE_STRING )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2096:3: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTerm4758); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_2_0, grammarAccess.getTermAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTermRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_2_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2113:6: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2113:6: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2113:7: () ( (lv_value_4_0= RULE_INT ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2113:7: ()
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2114:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTermAccess().getIntegerValueAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2119:2: ( (lv_value_4_0= RULE_INT ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2120:1: (lv_value_4_0= RULE_INT )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2120:1: (lv_value_4_0= RULE_INT )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2121:3: lv_value_4_0= RULE_INT
                    {
                    lv_value_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTerm4797); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_4_0, grammarAccess.getTermAccess().getValueINTTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTermRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_4_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2138:6: ( () ( (lv_value_6_0= RULE_DOUBLE ) ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2138:6: ( () ( (lv_value_6_0= RULE_DOUBLE ) ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2138:7: () ( (lv_value_6_0= RULE_DOUBLE ) )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2138:7: ()
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2139:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTermAccess().getDoubleValueAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2144:2: ( (lv_value_6_0= RULE_DOUBLE ) )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2145:1: (lv_value_6_0= RULE_DOUBLE )
                    {
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2145:1: (lv_value_6_0= RULE_DOUBLE )
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2146:3: lv_value_6_0= RULE_DOUBLE
                    {
                    lv_value_6_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleTerm4836); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_6_0, grammarAccess.getTermAccess().getValueDOUBLETerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTermRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_6_0, 
                              		"DOUBLE");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2164:5: this_List_7= ruleList
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTermAccess().getListParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleList_in_ruleTerm4870);
                    this_List_7=ruleList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_List_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleList"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2180:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2181:2: (iv_ruleList= ruleList EOF )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2182:2: iv_ruleList= ruleList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListRule()); 
            }
            pushFollow(FOLLOW_ruleList_in_entryRuleList4905);
            iv_ruleList=ruleList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleList4915); if (state.failed) return current;

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
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2189:1: ruleList returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_terms_2_0= ruleTerm ) )* otherlv_3= ']' ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_terms_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2192:28: ( ( () otherlv_1= '[' ( (lv_terms_2_0= ruleTerm ) )* otherlv_3= ']' ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2193:1: ( () otherlv_1= '[' ( (lv_terms_2_0= ruleTerm ) )* otherlv_3= ']' )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2193:1: ( () otherlv_1= '[' ( (lv_terms_2_0= ruleTerm ) )* otherlv_3= ']' )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2193:2: () otherlv_1= '[' ( (lv_terms_2_0= ruleTerm ) )* otherlv_3= ']'
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2193:2: ()
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2194:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getListAccess().getListAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleList4961); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getListAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2203:1: ( (lv_terms_2_0= ruleTerm ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_DOUBLE)||LA23_0==49) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2204:1: (lv_terms_2_0= ruleTerm )
            	    {
            	    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2204:1: (lv_terms_2_0= ruleTerm )
            	    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2205:3: lv_terms_2_0= ruleTerm
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getListAccess().getTermsTermParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTerm_in_ruleList4982);
            	    lv_terms_2_0=ruleTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"terms",
            	              		lv_terms_2_0, 
            	              		"Term");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_3=(Token)match(input,50,FOLLOW_50_in_ruleList4995); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getListAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleDesignator"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2235:1: entryRuleDesignator returns [EObject current=null] : iv_ruleDesignator= ruleDesignator EOF ;
    public final EObject entryRuleDesignator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDesignator = null;


        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2236:2: (iv_ruleDesignator= ruleDesignator EOF )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2237:2: iv_ruleDesignator= ruleDesignator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDesignatorRule()); 
            }
            pushFollow(FOLLOW_ruleDesignator_in_entryRuleDesignator5033);
            iv_ruleDesignator=ruleDesignator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDesignator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDesignator5043); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDesignator"


    // $ANTLR start "ruleDesignator"
    // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2244:1: ruleDesignator returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleDesignator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2247:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2248:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2248:1: ( (otherlv_0= RULE_ID ) )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2249:1: (otherlv_0= RULE_ID )
            {
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2249:1: (otherlv_0= RULE_ID )
            // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:2250:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDesignatorRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDesignator5087); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getDesignatorAccess().getValueEObjectCrossReference_0()); 
              	
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDesignator"

    // $ANTLR start synpred1_InternalExpression
    public final void synpred1_InternalExpression_fragment() throws RecognitionException {   
        // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:443:4: ( ( 'OR' ) )
        // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:444:1: ( 'OR' )
        {
        // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:444:1: ( 'OR' )
        // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:445:2: 'OR'
        {
        match(input,15,FOLLOW_15_in_synpred1_InternalExpression1031); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalExpression

    // $ANTLR start synpred2_InternalExpression
    public final void synpred2_InternalExpression_fragment() throws RecognitionException {   
        // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:518:4: ( ( 'AND' ) )
        // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:519:1: ( 'AND' )
        {
        // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:519:1: ( 'AND' )
        // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:520:2: 'AND'
        {
        match(input,16,FOLLOW_16_in_synpred2_InternalExpression1202); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalExpression

    // $ANTLR start synpred3_InternalExpression
    public final void synpred3_InternalExpression_fragment() throws RecognitionException {   
        // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:593:4: ( ( ( '==' | '!=' | '<=' | '>=' | 'in' | 'not in' ) ) )
        // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:594:1: ( ( '==' | '!=' | '<=' | '>=' | 'in' | 'not in' ) )
        {
        // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:594:1: ( ( '==' | '!=' | '<=' | '>=' | 'in' | 'not in' ) )
        // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:595:1: ( '==' | '!=' | '<=' | '>=' | 'in' | 'not in' )
        {
        if ( (input.LA(1)>=17 && input.LA(1)<=22) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }
    }
    // $ANTLR end synpred3_InternalExpression

    // $ANTLR start synpred4_InternalExpression
    public final void synpred4_InternalExpression_fragment() throws RecognitionException {   
        // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:749:4: ( ( ( '+' | '-' ) ) )
        // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:750:1: ( ( '+' | '-' ) )
        {
        // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:750:1: ( ( '+' | '-' ) )
        // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:751:1: ( '+' | '-' )
        {
        if ( (input.LA(1)>=23 && input.LA(1)<=24) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }
    }
    // $ANTLR end synpred4_InternalExpression

    // $ANTLR start synpred5_InternalExpression
    public final void synpred5_InternalExpression_fragment() throws RecognitionException {   
        // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:845:4: ( ( ( '*' | '/' ) ) )
        // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:846:1: ( ( '*' | '/' ) )
        {
        // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:846:1: ( ( '*' | '/' ) )
        // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:847:1: ( '*' | '/' )
        {
        if ( (input.LA(1)>=25 && input.LA(1)<=26) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }
    }
    // $ANTLR end synpred5_InternalExpression

    // $ANTLR start synpred6_InternalExpression
    public final void synpred6_InternalExpression_fragment() throws RecognitionException {   
        // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:941:4: ( ( '^' ) )
        // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:942:1: ( '^' )
        {
        // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:942:1: ( '^' )
        // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:943:2: '^'
        {
        match(input,27,FOLLOW_27_in_synpred6_InternalExpression2217); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred6_InternalExpression

    // $ANTLR start synpred7_InternalExpression
    public final void synpred7_InternalExpression_fragment() throws RecognitionException {   
        // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1016:4: ( ( '.' ) )
        // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1017:1: ( '.' )
        {
        // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1017:1: ( '.' )
        // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1018:2: '.'
        {
        match(input,28,FOLLOW_28_in_synpred7_InternalExpression2388); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalExpression

    // $ANTLR start synpred17_InternalExpression
    public final void synpred17_InternalExpression_fragment() throws RecognitionException {   
        // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1688:3: ( '|' )
        // ../org.openetcs.model/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1688:5: '|'
        {
        match(input,44,FOLLOW_44_in_synpred17_InternalExpression3829); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_InternalExpression

    // Delegated rules

    public final boolean synpred1_InternalExpression() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalExpression_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalExpression() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalExpression_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalExpression() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalExpression_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalExpression() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalExpression_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalExpression() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalExpression_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalExpression() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalExpression_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalExpression() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalExpression_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalExpression() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalExpression_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\12\uffff";
    static final String DFA17_eofS =
        "\12\uffff";
    static final String DFA17_minS =
        "\1\40\11\uffff";
    static final String DFA17_maxS =
        "\1\52\11\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA17_specialS =
        "\12\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff\1\7\1\10\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1279:1: ( ( () ( ( ( 'THERE_IS_IN' )=>otherlv_1= 'THERE_IS_IN' ) ( (lv_expr_2_0= ruleListValue ) ) ) ) | ( () ( ( ( 'FORALL_IN' )=>otherlv_4= 'FORALL_IN' ) ( (lv_expr_5_0= ruleListValue ) ) ) ) | ( () ( ( ( 'FIRST_IN' )=>otherlv_7= 'FIRST_IN' ) ( (lv_expr_8_0= ruleListValue ) ) ) ) | ( () ( ( ( 'LAST_IN' )=>otherlv_10= 'LAST_IN' ) ( (lv_expr_11_0= ruleListValue ) ) ) ) | ( () ( ( ( 'COUNT' )=>otherlv_13= 'COUNT' ) ( (lv_expr_14_0= ruleListValue ) ) ) ) | ( () ( ( ( 'REDUCE' )=>otherlv_16= 'REDUCE' ) ( (lv_expr_17_0= ruleListValue ) ) otherlv_18= 'USING' ( (lv_usingExpr_19_0= ruleExpression ) ) otherlv_20= 'INITIAL_VALUE' ( (lv_initValue_21_0= ruleExpression ) ) ) ) | ( () ( ( ( 'SUM' )=>otherlv_23= 'SUM' ) ( (lv_expr_24_0= ruleListValue ) ) otherlv_25= 'USING' ( (lv_usingExpr_26_0= ruleExpression ) ) ) ) | ( () ( ( ( 'MAP' )=>otherlv_28= 'MAP' ) ( (lv_expr_29_0= ruleListValue ) ) otherlv_30= 'USING' ( (lv_usingExpr_31_0= ruleExpression ) ) ) ) | ( () ( ( ( 'APPLY' )=>otherlv_33= 'APPLY' ) ( (lv_applyExpr_34_0= ruleExpression ) ) otherlv_35= 'ON' ( (lv_expr_36_0= ruleListValue ) ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhrase_in_ruleModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhrase_in_entryRulePhrase165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhrase175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePhrase222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementList_in_rulePhrase249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementList_in_entryRuleStatementList284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatementList294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatementList340 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStatementList352 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_ruleStatementList_in_ruleStatementList373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentStatement_in_ruleStatement466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentStatement_in_entryRuleAssignmentStatement500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentStatement510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignmentStatement_in_ruleAssignmentStatement557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfAssignmentStatement_in_ruleAssignmentStatement584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignmentStatement_in_entryRuleVariableAssignmentStatement619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAssignmentStatement629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesignator_in_ruleVariableAssignmentStatement675 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleVariableAssignmentStatement687 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableAssignmentStatement708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfAssignmentStatement_in_entryRuleSelfAssignmentStatement744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelfAssignmentStatement754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSelfAssignmentStatement791 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSelfAssignmentStatement803 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSelfAssignmentStatement824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleExpression916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression1007 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleOrExpression1049 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleOrExpression1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression1121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_ruleAndExpression1178 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleAndExpression1220 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleAndExpression1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression1292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualityExpression1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDashExpression_in_ruleEqualityExpression1349 = new BitSet(new long[]{0x00000000007E0002L});
    public static final BitSet FOLLOW_17_in_ruleEqualityExpression1468 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_18_in_ruleEqualityExpression1497 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_19_in_ruleEqualityExpression1526 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_20_in_ruleEqualityExpression1555 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_21_in_ruleEqualityExpression1584 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_22_in_ruleEqualityExpression1613 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_ruleEqualityExpression1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDashExpression_in_entryRuleDashExpression1688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDashExpression1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointExpression_in_ruleDashExpression1745 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_23_in_ruleDashExpression1808 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_24_in_ruleDashExpression1837 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_ruleDashExpression_in_ruleDashExpression1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointExpression_in_entryRulePointExpression1912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePointExpression1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowExpression_in_rulePointExpression1969 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_25_in_rulePointExpression2032 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_26_in_rulePointExpression2061 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_rulePointExpression_in_rulePointExpression2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowExpression_in_entryRulePowExpression2136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePowExpression2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifierExpression_in_rulePowExpression2193 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_rulePowExpression2235 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_rulePowExpression_in_rulePowExpression2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifierExpression_in_entryRuleQualifierExpression2307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifierExpression2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleQualifierExpression2364 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleQualifierExpression2406 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_ruleQualifierExpression_in_ruleQualifierExpression2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rulePrimaryExpression2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_rulePrimaryExpression2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListExpression_in_rulePrimaryExpression2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall2624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionCall2679 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleFunctionCall2691 = new BitSet(new long[]{0x0002273F600000F0L});
    public static final BitSet FOLLOW_ruleExpressionList_in_ruleFunctionCall2712 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleFunctionCall2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionList_in_entryRuleExpressionList2763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionList2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionList2819 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleExpressionRest_in_ruleExpressionList2840 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleExpressionRest_in_entryRuleExpressionRest2877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionRest2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleExpressionRest2924 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionRest2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListExpression_in_entryRuleListExpression2981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListExpression2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleListExpression3047 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_ruleListValue_in_ruleListExpression3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleListExpression3108 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_ruleListValue_in_ruleListExpression3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleListExpression3169 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_ruleListValue_in_ruleListExpression3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleListExpression3230 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_ruleListValue_in_ruleListExpression3252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleListExpression3291 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_ruleListValue_in_ruleListExpression3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleListExpression3352 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_ruleListValue_in_ruleListExpression3374 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleListExpression3386 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleListExpression3407 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleListExpression3419 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleListExpression3440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleListExpression3479 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_ruleListValue_in_ruleListExpression3501 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleListExpression3513 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleListExpression3534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleListExpression3573 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_ruleListValue_in_ruleListExpression3595 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleListExpression3607 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleListExpression3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleListExpression3667 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleListExpression3689 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleListExpression3701 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_ruleListValue_in_ruleListExpression3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListValue_in_entryRuleListValue3760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListValue3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleListValue3817 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleListValue3837 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleListValue3859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition3897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition3907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCondition3953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression3987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression3997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleUnaryExpression4045 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_ruleUnaryExpression4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleUnaryExpression4085 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleUnaryExpression4107 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleUnaryExpression4118 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_ruleUnaryExpression4148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleUnaryExpression4168 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleUnaryExpression4190 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleUnaryExpression4201 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_ruleUnaryExpression4231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_entryRuleStructureExpression4268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructureExpression4278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleStructureExpression4325 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleKeyValuePair_in_ruleStructureExpression4346 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleStructureExpression4358 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_ruleStructureExpression4379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyValuePair_in_entryRuleKeyValuePair4417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyValuePair4427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKeyValuePair4469 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleKeyValuePair4486 = new BitSet(new long[]{0x0002273F200000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleKeyValuePair4507 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleKeyValuePairRest_in_ruleKeyValuePair4528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyValuePairRest_in_entryRuleKeyValuePairRest4565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyValuePairRest4575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleKeyValuePairRest4612 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleKeyValuePair_in_ruleKeyValuePairRest4634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm4669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm4679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesignator_in_ruleTerm4726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTerm4758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTerm4797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleTerm4836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_ruleTerm4870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_entryRuleList4905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList4915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleList4961 = new BitSet(new long[]{0x00060000000000F0L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleList4982 = new BitSet(new long[]{0x00060000000000F0L});
    public static final BitSet FOLLOW_50_in_ruleList4995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesignator_in_entryRuleDesignator5033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDesignator5043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDesignator5087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_synpred1_InternalExpression1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_synpred2_InternalExpression1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred3_InternalExpression1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred4_InternalExpression1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred5_InternalExpression1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred6_InternalExpression2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred7_InternalExpression2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred17_InternalExpression3829 = new BitSet(new long[]{0x0000000000000002L});

}