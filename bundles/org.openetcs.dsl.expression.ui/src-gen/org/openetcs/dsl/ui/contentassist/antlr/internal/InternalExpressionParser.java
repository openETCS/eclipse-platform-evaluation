package org.openetcs.dsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.openetcs.dsl.services.ExpressionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalExpressionParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=='", "'!='", "'<='", "'>='", "'in'", "'not in'", "'+'", "'-'", "'*'", "'/'", "';'", "'<-'", "'CurrentState'", "'('", "')'", "','", "'THERE_IS_IN'", "'FORALL_IN'", "'FIRST_IN'", "'LAST_IN'", "'COUNT'", "'REDUCE'", "'USING'", "'INITIAL_VALUE'", "'SUM'", "'MAP'", "'APPLY'", "'ON'", "'|'", "'NOT ('", "'{'", "'}'", "'=>'", "'['", "']'", "'OR'", "'AND'", "'^'", "'.'"
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
    public String getGrammarFileName() { return "../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g"; }


     
     	private ExpressionGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ExpressionGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:62:1: ( ruleModel EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:63:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel67);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:70:1: ruleModel : ( ( rule__Model__PhraseAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:74:2: ( ( ( rule__Model__PhraseAssignment ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:75:1: ( ( rule__Model__PhraseAssignment ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:75:1: ( ( rule__Model__PhraseAssignment ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:76:1: ( rule__Model__PhraseAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPhraseAssignment()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:77:1: ( rule__Model__PhraseAssignment )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:77:2: rule__Model__PhraseAssignment
            {
            pushFollow(FOLLOW_rule__Model__PhraseAssignment_in_ruleModel100);
            rule__Model__PhraseAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getPhraseAssignment()); 
            }

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePhrase"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:89:1: entryRulePhrase : rulePhrase EOF ;
    public final void entryRulePhrase() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:90:1: ( rulePhrase EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:91:1: rulePhrase EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPhraseRule()); 
            }
            pushFollow(FOLLOW_rulePhrase_in_entryRulePhrase127);
            rulePhrase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPhraseRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePhrase134); if (state.failed) return ;

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
    // $ANTLR end "entryRulePhrase"


    // $ANTLR start "rulePhrase"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:98:1: rulePhrase : ( ( rule__Phrase__Alternatives ) ) ;
    public final void rulePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:102:2: ( ( ( rule__Phrase__Alternatives ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:103:1: ( ( rule__Phrase__Alternatives ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:103:1: ( ( rule__Phrase__Alternatives ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:104:1: ( rule__Phrase__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPhraseAccess().getAlternatives()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:105:1: ( rule__Phrase__Alternatives )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:105:2: rule__Phrase__Alternatives
            {
            pushFollow(FOLLOW_rule__Phrase__Alternatives_in_rulePhrase160);
            rule__Phrase__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPhraseAccess().getAlternatives()); 
            }

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
    // $ANTLR end "rulePhrase"


    // $ANTLR start "entryRuleStatementList"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:117:1: entryRuleStatementList : ruleStatementList EOF ;
    public final void entryRuleStatementList() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:118:1: ( ruleStatementList EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:119:1: ruleStatementList EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementListRule()); 
            }
            pushFollow(FOLLOW_ruleStatementList_in_entryRuleStatementList187);
            ruleStatementList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementListRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatementList194); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStatementList"


    // $ANTLR start "ruleStatementList"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:126:1: ruleStatementList : ( ( rule__StatementList__Group__0 ) ) ;
    public final void ruleStatementList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:130:2: ( ( ( rule__StatementList__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:131:1: ( ( rule__StatementList__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:131:1: ( ( rule__StatementList__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:132:1: ( rule__StatementList__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementListAccess().getGroup()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:133:1: ( rule__StatementList__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:133:2: rule__StatementList__Group__0
            {
            pushFollow(FOLLOW_rule__StatementList__Group__0_in_ruleStatementList220);
            rule__StatementList__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementListAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleStatementList"


    // $ANTLR start "entryRuleStatement"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:145:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:146:1: ( ruleStatement EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:147:1: ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement247);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement254); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:154:1: ruleStatement : ( ruleAssignmentStatement ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:158:2: ( ( ruleAssignmentStatement ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:159:1: ( ruleAssignmentStatement )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:159:1: ( ruleAssignmentStatement )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:160:1: ruleAssignmentStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAssignmentStatementParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleAssignmentStatement_in_ruleStatement280);
            ruleAssignmentStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAssignmentStatementParserRuleCall()); 
            }

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleAssignmentStatement"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:173:1: entryRuleAssignmentStatement : ruleAssignmentStatement EOF ;
    public final void entryRuleAssignmentStatement() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:174:1: ( ruleAssignmentStatement EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:175:1: ruleAssignmentStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentStatementRule()); 
            }
            pushFollow(FOLLOW_ruleAssignmentStatement_in_entryRuleAssignmentStatement306);
            ruleAssignmentStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentStatementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentStatement313); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAssignmentStatement"


    // $ANTLR start "ruleAssignmentStatement"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:182:1: ruleAssignmentStatement : ( ( rule__AssignmentStatement__Alternatives ) ) ;
    public final void ruleAssignmentStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:186:2: ( ( ( rule__AssignmentStatement__Alternatives ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:187:1: ( ( rule__AssignmentStatement__Alternatives ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:187:1: ( ( rule__AssignmentStatement__Alternatives ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:188:1: ( rule__AssignmentStatement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentStatementAccess().getAlternatives()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:189:1: ( rule__AssignmentStatement__Alternatives )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:189:2: rule__AssignmentStatement__Alternatives
            {
            pushFollow(FOLLOW_rule__AssignmentStatement__Alternatives_in_ruleAssignmentStatement339);
            rule__AssignmentStatement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentStatementAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleAssignmentStatement"


    // $ANTLR start "entryRuleVariableAssignmentStatement"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:201:1: entryRuleVariableAssignmentStatement : ruleVariableAssignmentStatement EOF ;
    public final void entryRuleVariableAssignmentStatement() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:202:1: ( ruleVariableAssignmentStatement EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:203:1: ruleVariableAssignmentStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAssignmentStatementRule()); 
            }
            pushFollow(FOLLOW_ruleVariableAssignmentStatement_in_entryRuleVariableAssignmentStatement366);
            ruleVariableAssignmentStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAssignmentStatementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAssignmentStatement373); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVariableAssignmentStatement"


    // $ANTLR start "ruleVariableAssignmentStatement"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:210:1: ruleVariableAssignmentStatement : ( ( rule__VariableAssignmentStatement__Group__0 ) ) ;
    public final void ruleVariableAssignmentStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:214:2: ( ( ( rule__VariableAssignmentStatement__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:215:1: ( ( rule__VariableAssignmentStatement__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:215:1: ( ( rule__VariableAssignmentStatement__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:216:1: ( rule__VariableAssignmentStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAssignmentStatementAccess().getGroup()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:217:1: ( rule__VariableAssignmentStatement__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:217:2: rule__VariableAssignmentStatement__Group__0
            {
            pushFollow(FOLLOW_rule__VariableAssignmentStatement__Group__0_in_ruleVariableAssignmentStatement399);
            rule__VariableAssignmentStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAssignmentStatementAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleVariableAssignmentStatement"


    // $ANTLR start "entryRuleSelfAssignmentStatement"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:229:1: entryRuleSelfAssignmentStatement : ruleSelfAssignmentStatement EOF ;
    public final void entryRuleSelfAssignmentStatement() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:230:1: ( ruleSelfAssignmentStatement EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:231:1: ruleSelfAssignmentStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfAssignmentStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSelfAssignmentStatement_in_entryRuleSelfAssignmentStatement426);
            ruleSelfAssignmentStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelfAssignmentStatementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelfAssignmentStatement433); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSelfAssignmentStatement"


    // $ANTLR start "ruleSelfAssignmentStatement"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:238:1: ruleSelfAssignmentStatement : ( ( rule__SelfAssignmentStatement__Group__0 ) ) ;
    public final void ruleSelfAssignmentStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:242:2: ( ( ( rule__SelfAssignmentStatement__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:243:1: ( ( rule__SelfAssignmentStatement__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:243:1: ( ( rule__SelfAssignmentStatement__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:244:1: ( rule__SelfAssignmentStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfAssignmentStatementAccess().getGroup()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:245:1: ( rule__SelfAssignmentStatement__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:245:2: rule__SelfAssignmentStatement__Group__0
            {
            pushFollow(FOLLOW_rule__SelfAssignmentStatement__Group__0_in_ruleSelfAssignmentStatement459);
            rule__SelfAssignmentStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelfAssignmentStatementAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleSelfAssignmentStatement"


    // $ANTLR start "entryRuleExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:257:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:258:1: ( ruleExpression EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:259:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression486);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression493); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:266:1: ruleExpression : ( ruleOrExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:270:2: ( ( ruleOrExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:271:1: ( ruleOrExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:271:1: ( ruleOrExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:272:1: ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleOrExpression_in_ruleExpression519);
            ruleOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall()); 
            }

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOrExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:285:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:286:1: ( ruleOrExpression EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:287:1: ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression545);
            ruleOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression552); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:294:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:298:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:299:1: ( ( rule__OrExpression__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:299:1: ( ( rule__OrExpression__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:300:1: ( rule__OrExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:301:1: ( rule__OrExpression__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:301:2: rule__OrExpression__Group__0
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression578);
            rule__OrExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:313:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:314:1: ( ruleAndExpression EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:315:1: ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression605);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression612); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:322:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:326:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:327:1: ( ( rule__AndExpression__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:327:1: ( ( rule__AndExpression__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:328:1: ( rule__AndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:329:1: ( rule__AndExpression__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:329:2: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression638);
            rule__AndExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:341:1: entryRuleEqualityExpression : ruleEqualityExpression EOF ;
    public final void entryRuleEqualityExpression() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:342:1: ( ruleEqualityExpression EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:343:1: ruleEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression665);
            ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualityExpression672); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:350:1: ruleEqualityExpression : ( ( rule__EqualityExpression__Group__0 ) ) ;
    public final void ruleEqualityExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:354:2: ( ( ( rule__EqualityExpression__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:355:1: ( ( rule__EqualityExpression__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:355:1: ( ( rule__EqualityExpression__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:356:1: ( rule__EqualityExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getGroup()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:357:1: ( rule__EqualityExpression__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:357:2: rule__EqualityExpression__Group__0
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group__0_in_ruleEqualityExpression698);
            rule__EqualityExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleDashExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:369:1: entryRuleDashExpression : ruleDashExpression EOF ;
    public final void entryRuleDashExpression() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:370:1: ( ruleDashExpression EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:371:1: ruleDashExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDashExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleDashExpression_in_entryRuleDashExpression725);
            ruleDashExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDashExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDashExpression732); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDashExpression"


    // $ANTLR start "ruleDashExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:378:1: ruleDashExpression : ( ( rule__DashExpression__Group__0 ) ) ;
    public final void ruleDashExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:382:2: ( ( ( rule__DashExpression__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:383:1: ( ( rule__DashExpression__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:383:1: ( ( rule__DashExpression__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:384:1: ( rule__DashExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDashExpressionAccess().getGroup()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:385:1: ( rule__DashExpression__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:385:2: rule__DashExpression__Group__0
            {
            pushFollow(FOLLOW_rule__DashExpression__Group__0_in_ruleDashExpression758);
            rule__DashExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDashExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleDashExpression"


    // $ANTLR start "entryRulePointExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:397:1: entryRulePointExpression : rulePointExpression EOF ;
    public final void entryRulePointExpression() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:398:1: ( rulePointExpression EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:399:1: rulePointExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePointExpression_in_entryRulePointExpression785);
            rulePointExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePointExpression792); if (state.failed) return ;

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
    // $ANTLR end "entryRulePointExpression"


    // $ANTLR start "rulePointExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:406:1: rulePointExpression : ( ( rule__PointExpression__Group__0 ) ) ;
    public final void rulePointExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:410:2: ( ( ( rule__PointExpression__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:411:1: ( ( rule__PointExpression__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:411:1: ( ( rule__PointExpression__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:412:1: ( rule__PointExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointExpressionAccess().getGroup()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:413:1: ( rule__PointExpression__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:413:2: rule__PointExpression__Group__0
            {
            pushFollow(FOLLOW_rule__PointExpression__Group__0_in_rulePointExpression818);
            rule__PointExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "rulePointExpression"


    // $ANTLR start "entryRulePowExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:425:1: entryRulePowExpression : rulePowExpression EOF ;
    public final void entryRulePowExpression() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:426:1: ( rulePowExpression EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:427:1: rulePowExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePowExpression_in_entryRulePowExpression845);
            rulePowExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePowExpression852); if (state.failed) return ;

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
    // $ANTLR end "entryRulePowExpression"


    // $ANTLR start "rulePowExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:434:1: rulePowExpression : ( ( rule__PowExpression__Group__0 ) ) ;
    public final void rulePowExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:438:2: ( ( ( rule__PowExpression__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:439:1: ( ( rule__PowExpression__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:439:1: ( ( rule__PowExpression__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:440:1: ( rule__PowExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowExpressionAccess().getGroup()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:441:1: ( rule__PowExpression__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:441:2: rule__PowExpression__Group__0
            {
            pushFollow(FOLLOW_rule__PowExpression__Group__0_in_rulePowExpression878);
            rule__PowExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "rulePowExpression"


    // $ANTLR start "entryRuleQualifierExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:453:1: entryRuleQualifierExpression : ruleQualifierExpression EOF ;
    public final void entryRuleQualifierExpression() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:454:1: ( ruleQualifierExpression EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:455:1: ruleQualifierExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifierExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleQualifierExpression_in_entryRuleQualifierExpression905);
            ruleQualifierExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifierExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifierExpression912); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifierExpression"


    // $ANTLR start "ruleQualifierExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:462:1: ruleQualifierExpression : ( ( rule__QualifierExpression__Group__0 ) ) ;
    public final void ruleQualifierExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:466:2: ( ( ( rule__QualifierExpression__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:467:1: ( ( rule__QualifierExpression__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:467:1: ( ( rule__QualifierExpression__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:468:1: ( rule__QualifierExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifierExpressionAccess().getGroup()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:469:1: ( rule__QualifierExpression__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:469:2: rule__QualifierExpression__Group__0
            {
            pushFollow(FOLLOW_rule__QualifierExpression__Group__0_in_ruleQualifierExpression938);
            rule__QualifierExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifierExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleQualifierExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:481:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:482:1: ( rulePrimaryExpression EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:483:1: rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression965);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression972); if (state.failed) return ;

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:490:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:494:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:495:1: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:495:1: ( ( rule__PrimaryExpression__Alternatives ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:496:1: ( rule__PrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:497:1: ( rule__PrimaryExpression__Alternatives )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:497:2: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression998);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }

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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleFunctionCall"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:509:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:510:1: ( ruleFunctionCall EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:511:1: ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall1025);
            ruleFunctionCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall1032); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:518:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:522:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:523:1: ( ( rule__FunctionCall__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:523:1: ( ( rule__FunctionCall__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:524:1: ( rule__FunctionCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:525:1: ( rule__FunctionCall__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:525:2: rule__FunctionCall__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__0_in_ruleFunctionCall1058);
            rule__FunctionCall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleExpressionList"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:539:1: entryRuleExpressionList : ruleExpressionList EOF ;
    public final void entryRuleExpressionList() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:540:1: ( ruleExpressionList EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:541:1: ruleExpressionList EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionListRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionList_in_entryRuleExpressionList1087);
            ruleExpressionList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionListRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionList1094); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpressionList"


    // $ANTLR start "ruleExpressionList"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:548:1: ruleExpressionList : ( ( rule__ExpressionList__Group__0 ) ) ;
    public final void ruleExpressionList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:552:2: ( ( ( rule__ExpressionList__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:553:1: ( ( rule__ExpressionList__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:553:1: ( ( rule__ExpressionList__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:554:1: ( rule__ExpressionList__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionListAccess().getGroup()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:555:1: ( rule__ExpressionList__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:555:2: rule__ExpressionList__Group__0
            {
            pushFollow(FOLLOW_rule__ExpressionList__Group__0_in_ruleExpressionList1120);
            rule__ExpressionList__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionListAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleExpressionList"


    // $ANTLR start "entryRuleExpressionRest"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:567:1: entryRuleExpressionRest : ruleExpressionRest EOF ;
    public final void entryRuleExpressionRest() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:568:1: ( ruleExpressionRest EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:569:1: ruleExpressionRest EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRestRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionRest_in_entryRuleExpressionRest1147);
            ruleExpressionRest();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRestRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionRest1154); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpressionRest"


    // $ANTLR start "ruleExpressionRest"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:576:1: ruleExpressionRest : ( ( rule__ExpressionRest__Group__0 ) ) ;
    public final void ruleExpressionRest() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:580:2: ( ( ( rule__ExpressionRest__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:581:1: ( ( rule__ExpressionRest__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:581:1: ( ( rule__ExpressionRest__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:582:1: ( rule__ExpressionRest__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRestAccess().getGroup()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:583:1: ( rule__ExpressionRest__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:583:2: rule__ExpressionRest__Group__0
            {
            pushFollow(FOLLOW_rule__ExpressionRest__Group__0_in_ruleExpressionRest1180);
            rule__ExpressionRest__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRestAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleExpressionRest"


    // $ANTLR start "entryRuleListExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:595:1: entryRuleListExpression : ruleListExpression EOF ;
    public final void entryRuleListExpression() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:596:1: ( ruleListExpression EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:597:1: ruleListExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleListExpression_in_entryRuleListExpression1207);
            ruleListExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleListExpression1214); if (state.failed) return ;

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
    // $ANTLR end "entryRuleListExpression"


    // $ANTLR start "ruleListExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:604:1: ruleListExpression : ( ( rule__ListExpression__Alternatives ) ) ;
    public final void ruleListExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:608:2: ( ( ( rule__ListExpression__Alternatives ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:609:1: ( ( rule__ListExpression__Alternatives ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:609:1: ( ( rule__ListExpression__Alternatives ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:610:1: ( rule__ListExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getAlternatives()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:611:1: ( rule__ListExpression__Alternatives )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:611:2: rule__ListExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__ListExpression__Alternatives_in_ruleListExpression1240);
            rule__ListExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleListExpression"


    // $ANTLR start "entryRuleListValue"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:623:1: entryRuleListValue : ruleListValue EOF ;
    public final void entryRuleListValue() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:624:1: ( ruleListValue EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:625:1: ruleListValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListValueRule()); 
            }
            pushFollow(FOLLOW_ruleListValue_in_entryRuleListValue1267);
            ruleListValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleListValue1274); if (state.failed) return ;

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
    // $ANTLR end "entryRuleListValue"


    // $ANTLR start "ruleListValue"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:632:1: ruleListValue : ( ( rule__ListValue__Group__0 ) ) ;
    public final void ruleListValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:636:2: ( ( ( rule__ListValue__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:637:1: ( ( rule__ListValue__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:637:1: ( ( rule__ListValue__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:638:1: ( rule__ListValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListValueAccess().getGroup()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:639:1: ( rule__ListValue__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:639:2: rule__ListValue__Group__0
            {
            pushFollow(FOLLOW_rule__ListValue__Group__0_in_ruleListValue1300);
            rule__ListValue__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListValueAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleListValue"


    // $ANTLR start "entryRuleCondition"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:651:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:652:1: ( ruleCondition EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:653:1: ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition1327);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition1334); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:660:1: ruleCondition : ( ruleExpression ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:664:2: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:665:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:665:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:666:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getExpressionParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleCondition1360);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getExpressionParserRuleCall()); 
            }

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleUnaryExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:679:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:680:1: ( ruleUnaryExpression EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:681:1: ruleUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression1386);
            ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpression1393); if (state.failed) return ;

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
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:688:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Alternatives ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:692:2: ( ( ( rule__UnaryExpression__Alternatives ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:693:1: ( ( rule__UnaryExpression__Alternatives ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:693:1: ( ( rule__UnaryExpression__Alternatives ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:694:1: ( rule__UnaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:695:1: ( rule__UnaryExpression__Alternatives )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:695:2: rule__UnaryExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Alternatives_in_ruleUnaryExpression1419);
            rule__UnaryExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleStructureExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:707:1: entryRuleStructureExpression : ruleStructureExpression EOF ;
    public final void entryRuleStructureExpression() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:708:1: ( ruleStructureExpression EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:709:1: ruleStructureExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructureExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleStructureExpression_in_entryRuleStructureExpression1446);
            ruleStructureExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStructureExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructureExpression1453); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStructureExpression"


    // $ANTLR start "ruleStructureExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:716:1: ruleStructureExpression : ( ( rule__StructureExpression__Group__0 ) ) ;
    public final void ruleStructureExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:720:2: ( ( ( rule__StructureExpression__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:721:1: ( ( rule__StructureExpression__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:721:1: ( ( rule__StructureExpression__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:722:1: ( rule__StructureExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructureExpressionAccess().getGroup()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:723:1: ( rule__StructureExpression__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:723:2: rule__StructureExpression__Group__0
            {
            pushFollow(FOLLOW_rule__StructureExpression__Group__0_in_ruleStructureExpression1479);
            rule__StructureExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStructureExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleStructureExpression"


    // $ANTLR start "entryRuleKeyValuePair"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:735:1: entryRuleKeyValuePair : ruleKeyValuePair EOF ;
    public final void entryRuleKeyValuePair() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:736:1: ( ruleKeyValuePair EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:737:1: ruleKeyValuePair EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairRule()); 
            }
            pushFollow(FOLLOW_ruleKeyValuePair_in_entryRuleKeyValuePair1506);
            ruleKeyValuePair();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyValuePairRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyValuePair1513); if (state.failed) return ;

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
    // $ANTLR end "entryRuleKeyValuePair"


    // $ANTLR start "ruleKeyValuePair"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:744:1: ruleKeyValuePair : ( ( rule__KeyValuePair__Group__0 ) ) ;
    public final void ruleKeyValuePair() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:748:2: ( ( ( rule__KeyValuePair__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:749:1: ( ( rule__KeyValuePair__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:749:1: ( ( rule__KeyValuePair__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:750:1: ( rule__KeyValuePair__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getGroup()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:751:1: ( rule__KeyValuePair__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:751:2: rule__KeyValuePair__Group__0
            {
            pushFollow(FOLLOW_rule__KeyValuePair__Group__0_in_ruleKeyValuePair1539);
            rule__KeyValuePair__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyValuePairAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleKeyValuePair"


    // $ANTLR start "entryRuleKeyValuePairRest"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:763:1: entryRuleKeyValuePairRest : ruleKeyValuePairRest EOF ;
    public final void entryRuleKeyValuePairRest() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:764:1: ( ruleKeyValuePairRest EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:765:1: ruleKeyValuePairRest EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairRestRule()); 
            }
            pushFollow(FOLLOW_ruleKeyValuePairRest_in_entryRuleKeyValuePairRest1566);
            ruleKeyValuePairRest();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyValuePairRestRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyValuePairRest1573); if (state.failed) return ;

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
    // $ANTLR end "entryRuleKeyValuePairRest"


    // $ANTLR start "ruleKeyValuePairRest"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:772:1: ruleKeyValuePairRest : ( ( rule__KeyValuePairRest__Group__0 ) ) ;
    public final void ruleKeyValuePairRest() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:776:2: ( ( ( rule__KeyValuePairRest__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:777:1: ( ( rule__KeyValuePairRest__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:777:1: ( ( rule__KeyValuePairRest__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:778:1: ( rule__KeyValuePairRest__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairRestAccess().getGroup()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:779:1: ( rule__KeyValuePairRest__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:779:2: rule__KeyValuePairRest__Group__0
            {
            pushFollow(FOLLOW_rule__KeyValuePairRest__Group__0_in_ruleKeyValuePairRest1599);
            rule__KeyValuePairRest__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyValuePairRestAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleKeyValuePairRest"


    // $ANTLR start "entryRuleTerm"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:791:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:792:1: ( ruleTerm EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:793:1: ruleTerm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermRule()); 
            }
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm1626);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm1633); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:800:1: ruleTerm : ( ( rule__Term__Alternatives ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:804:2: ( ( ( rule__Term__Alternatives ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:805:1: ( ( rule__Term__Alternatives ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:805:1: ( ( rule__Term__Alternatives ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:806:1: ( rule__Term__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getAlternatives()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:807:1: ( rule__Term__Alternatives )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:807:2: rule__Term__Alternatives
            {
            pushFollow(FOLLOW_rule__Term__Alternatives_in_ruleTerm1659);
            rule__Term__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleList"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:819:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:820:1: ( ruleList EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:821:1: ruleList EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListRule()); 
            }
            pushFollow(FOLLOW_ruleList_in_entryRuleList1686);
            ruleList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleList1693); if (state.failed) return ;

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
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:828:1: ruleList : ( ( rule__List__Group__0 ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:832:2: ( ( ( rule__List__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:833:1: ( ( rule__List__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:833:1: ( ( rule__List__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:834:1: ( rule__List__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getGroup()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:835:1: ( rule__List__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:835:2: rule__List__Group__0
            {
            pushFollow(FOLLOW_rule__List__Group__0_in_ruleList1719);
            rule__List__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleDesignator"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:849:1: entryRuleDesignator : ruleDesignator EOF ;
    public final void entryRuleDesignator() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:850:1: ( ruleDesignator EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:851:1: ruleDesignator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDesignatorRule()); 
            }
            pushFollow(FOLLOW_ruleDesignator_in_entryRuleDesignator1748);
            ruleDesignator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDesignatorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDesignator1755); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDesignator"


    // $ANTLR start "ruleDesignator"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:858:1: ruleDesignator : ( ( rule__Designator__ValueAssignment ) ) ;
    public final void ruleDesignator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:862:2: ( ( ( rule__Designator__ValueAssignment ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:863:1: ( ( rule__Designator__ValueAssignment ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:863:1: ( ( rule__Designator__ValueAssignment ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:864:1: ( rule__Designator__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDesignatorAccess().getValueAssignment()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:865:1: ( rule__Designator__ValueAssignment )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:865:2: rule__Designator__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Designator__ValueAssignment_in_ruleDesignator1781);
            rule__Designator__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDesignatorAccess().getValueAssignment()); 
            }

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
    // $ANTLR end "ruleDesignator"


    // $ANTLR start "rule__Phrase__Alternatives"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:877:1: rule__Phrase__Alternatives : ( ( ruleExpression ) | ( ruleStatementList ) );
    public final void rule__Phrase__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:881:1: ( ( ruleExpression ) | ( ruleStatementList ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==EOF||(LA1_1>=12 && LA1_1<=21)||LA1_1==25||LA1_1==42||(LA1_1>=47 && LA1_1<=50)) ) {
                    alt1=1;
                }
                else if ( (LA1_1==23) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_DOUBLE:
            case 25:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 36:
            case 37:
            case 38:
            case 41:
            case 45:
                {
                alt1=1;
                }
                break;
            case 24:
                {
                alt1=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:882:1: ( ruleExpression )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:882:1: ( ruleExpression )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:883:1: ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPhraseAccess().getExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rule__Phrase__Alternatives1817);
                    ruleExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPhraseAccess().getExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:888:6: ( ruleStatementList )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:888:6: ( ruleStatementList )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:889:1: ruleStatementList
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPhraseAccess().getStatementListParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleStatementList_in_rule__Phrase__Alternatives1834);
                    ruleStatementList();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPhraseAccess().getStatementListParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__Phrase__Alternatives"


    // $ANTLR start "rule__AssignmentStatement__Alternatives"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:899:1: rule__AssignmentStatement__Alternatives : ( ( ruleVariableAssignmentStatement ) | ( ruleSelfAssignmentStatement ) );
    public final void rule__AssignmentStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:903:1: ( ( ruleVariableAssignmentStatement ) | ( ruleSelfAssignmentStatement ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==24) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:904:1: ( ruleVariableAssignmentStatement )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:904:1: ( ruleVariableAssignmentStatement )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:905:1: ruleVariableAssignmentStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssignmentStatementAccess().getVariableAssignmentStatementParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleVariableAssignmentStatement_in_rule__AssignmentStatement__Alternatives1866);
                    ruleVariableAssignmentStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssignmentStatementAccess().getVariableAssignmentStatementParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:910:6: ( ruleSelfAssignmentStatement )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:910:6: ( ruleSelfAssignmentStatement )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:911:1: ruleSelfAssignmentStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssignmentStatementAccess().getSelfAssignmentStatementParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleSelfAssignmentStatement_in_rule__AssignmentStatement__Alternatives1883);
                    ruleSelfAssignmentStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssignmentStatementAccess().getSelfAssignmentStatementParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__AssignmentStatement__Alternatives"


    // $ANTLR start "rule__EqualityExpression__OpAlternatives_2_0_0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:921:1: rule__EqualityExpression__OpAlternatives_2_0_0 : ( ( '==' ) | ( '!=' ) | ( '<=' ) | ( '>=' ) | ( 'in' ) | ( 'not in' ) );
    public final void rule__EqualityExpression__OpAlternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:925:1: ( ( '==' ) | ( '!=' ) | ( '<=' ) | ( '>=' ) | ( 'in' ) | ( 'not in' ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            case 16:
                {
                alt3=5;
                }
                break;
            case 17:
                {
                alt3=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:926:1: ( '==' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:926:1: ( '==' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:927:1: '=='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityExpressionAccess().getOpEqualsSignEqualsSignKeyword_2_0_0_0()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__EqualityExpression__OpAlternatives_2_0_01916); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualityExpressionAccess().getOpEqualsSignEqualsSignKeyword_2_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:934:6: ( '!=' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:934:6: ( '!=' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:935:1: '!='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityExpressionAccess().getOpExclamationMarkEqualsSignKeyword_2_0_0_1()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__EqualityExpression__OpAlternatives_2_0_01936); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualityExpressionAccess().getOpExclamationMarkEqualsSignKeyword_2_0_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:942:6: ( '<=' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:942:6: ( '<=' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:943:1: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityExpressionAccess().getOpLessThanSignEqualsSignKeyword_2_0_0_2()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__EqualityExpression__OpAlternatives_2_0_01956); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualityExpressionAccess().getOpLessThanSignEqualsSignKeyword_2_0_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:950:6: ( '>=' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:950:6: ( '>=' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:951:1: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_2_0_0_3()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__EqualityExpression__OpAlternatives_2_0_01976); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualityExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_2_0_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:958:6: ( 'in' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:958:6: ( 'in' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:959:1: 'in'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityExpressionAccess().getOpInKeyword_2_0_0_4()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__EqualityExpression__OpAlternatives_2_0_01996); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualityExpressionAccess().getOpInKeyword_2_0_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:966:6: ( 'not in' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:966:6: ( 'not in' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:967:1: 'not in'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityExpressionAccess().getOpNotInKeyword_2_0_0_5()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__EqualityExpression__OpAlternatives_2_0_02016); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualityExpressionAccess().getOpNotInKeyword_2_0_0_5()); 
                    }

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
    // $ANTLR end "rule__EqualityExpression__OpAlternatives_2_0_0"


    // $ANTLR start "rule__DashExpression__OpAlternatives_2_0_0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:979:1: rule__DashExpression__OpAlternatives_2_0_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__DashExpression__OpAlternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:983:1: ( ( '+' ) | ( '-' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==19) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:984:1: ( '+' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:984:1: ( '+' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:985:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDashExpressionAccess().getOpPlusSignKeyword_2_0_0_0()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__DashExpression__OpAlternatives_2_0_02051); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDashExpressionAccess().getOpPlusSignKeyword_2_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:992:6: ( '-' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:992:6: ( '-' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:993:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDashExpressionAccess().getOpHyphenMinusKeyword_2_0_0_1()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__DashExpression__OpAlternatives_2_0_02071); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDashExpressionAccess().getOpHyphenMinusKeyword_2_0_0_1()); 
                    }

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
    // $ANTLR end "rule__DashExpression__OpAlternatives_2_0_0"


    // $ANTLR start "rule__PointExpression__OpAlternatives_2_0_0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1005:1: rule__PointExpression__OpAlternatives_2_0_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__PointExpression__OpAlternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1009:1: ( ( '*' ) | ( '/' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            else if ( (LA5_0==21) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1010:1: ( '*' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1010:1: ( '*' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1011:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPointExpressionAccess().getOpAsteriskKeyword_2_0_0_0()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__PointExpression__OpAlternatives_2_0_02106); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPointExpressionAccess().getOpAsteriskKeyword_2_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1018:6: ( '/' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1018:6: ( '/' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1019:1: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPointExpressionAccess().getOpSolidusKeyword_2_0_0_1()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__PointExpression__OpAlternatives_2_0_02126); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPointExpressionAccess().getOpSolidusKeyword_2_0_0_1()); 
                    }

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
    // $ANTLR end "rule__PointExpression__OpAlternatives_2_0_0"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1031:1: rule__PrimaryExpression__Alternatives : ( ( ruleUnaryExpression ) | ( ruleFunctionCall ) | ( ruleListExpression ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1035:1: ( ( ruleUnaryExpression ) | ( ruleFunctionCall ) | ( ruleListExpression ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF||(LA6_1>=12 && LA6_1<=22)||(LA6_1>=26 && LA6_1<=27)||(LA6_1>=34 && LA6_1<=35)||(LA6_1>=39 && LA6_1<=40)||(LA6_1>=42 && LA6_1<=43)||(LA6_1>=47 && LA6_1<=50)) ) {
                    alt6=1;
                }
                else if ( (LA6_1==25) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_DOUBLE:
            case 25:
            case 41:
            case 45:
                {
                alt6=1;
                }
                break;
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 36:
            case 37:
            case 38:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1036:1: ( ruleUnaryExpression )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1036:1: ( ruleUnaryExpression )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1037:1: ruleUnaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleUnaryExpression_in_rule__PrimaryExpression__Alternatives2160);
                    ruleUnaryExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1042:6: ( ruleFunctionCall )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1042:6: ( ruleFunctionCall )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1043:1: ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getFunctionCallParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleFunctionCall_in_rule__PrimaryExpression__Alternatives2177);
                    ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getFunctionCallParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1048:6: ( ruleListExpression )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1048:6: ( ruleListExpression )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1049:1: ruleListExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getListExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleListExpression_in_rule__PrimaryExpression__Alternatives2194);
                    ruleListExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getListExpressionParserRuleCall_2()); 
                    }

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
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__ListExpression__Alternatives"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1059:1: rule__ListExpression__Alternatives : ( ( ( rule__ListExpression__Group_0__0 ) ) | ( ( rule__ListExpression__Group_1__0 ) ) | ( ( rule__ListExpression__Group_2__0 ) ) | ( ( rule__ListExpression__Group_3__0 ) ) | ( ( rule__ListExpression__Group_4__0 ) ) | ( ( rule__ListExpression__Group_5__0 ) ) | ( ( rule__ListExpression__Group_6__0 ) ) | ( ( rule__ListExpression__Group_7__0 ) ) | ( ( rule__ListExpression__Group_8__0 ) ) );
    public final void rule__ListExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1063:1: ( ( ( rule__ListExpression__Group_0__0 ) ) | ( ( rule__ListExpression__Group_1__0 ) ) | ( ( rule__ListExpression__Group_2__0 ) ) | ( ( rule__ListExpression__Group_3__0 ) ) | ( ( rule__ListExpression__Group_4__0 ) ) | ( ( rule__ListExpression__Group_5__0 ) ) | ( ( rule__ListExpression__Group_6__0 ) ) | ( ( rule__ListExpression__Group_7__0 ) ) | ( ( rule__ListExpression__Group_8__0 ) ) )
            int alt7=9;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt7=1;
                }
                break;
            case 29:
                {
                alt7=2;
                }
                break;
            case 30:
                {
                alt7=3;
                }
                break;
            case 31:
                {
                alt7=4;
                }
                break;
            case 32:
                {
                alt7=5;
                }
                break;
            case 33:
                {
                alt7=6;
                }
                break;
            case 36:
                {
                alt7=7;
                }
                break;
            case 37:
                {
                alt7=8;
                }
                break;
            case 38:
                {
                alt7=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1064:1: ( ( rule__ListExpression__Group_0__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1064:1: ( ( rule__ListExpression__Group_0__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1065:1: ( rule__ListExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListExpressionAccess().getGroup_0()); 
                    }
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1066:1: ( rule__ListExpression__Group_0__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1066:2: rule__ListExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ListExpression__Group_0__0_in_rule__ListExpression__Alternatives2226);
                    rule__ListExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getListExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1070:6: ( ( rule__ListExpression__Group_1__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1070:6: ( ( rule__ListExpression__Group_1__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1071:1: ( rule__ListExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListExpressionAccess().getGroup_1()); 
                    }
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1072:1: ( rule__ListExpression__Group_1__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1072:2: rule__ListExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ListExpression__Group_1__0_in_rule__ListExpression__Alternatives2244);
                    rule__ListExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getListExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1076:6: ( ( rule__ListExpression__Group_2__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1076:6: ( ( rule__ListExpression__Group_2__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1077:1: ( rule__ListExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListExpressionAccess().getGroup_2()); 
                    }
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1078:1: ( rule__ListExpression__Group_2__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1078:2: rule__ListExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ListExpression__Group_2__0_in_rule__ListExpression__Alternatives2262);
                    rule__ListExpression__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getListExpressionAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1082:6: ( ( rule__ListExpression__Group_3__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1082:6: ( ( rule__ListExpression__Group_3__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1083:1: ( rule__ListExpression__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListExpressionAccess().getGroup_3()); 
                    }
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1084:1: ( rule__ListExpression__Group_3__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1084:2: rule__ListExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ListExpression__Group_3__0_in_rule__ListExpression__Alternatives2280);
                    rule__ListExpression__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getListExpressionAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1088:6: ( ( rule__ListExpression__Group_4__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1088:6: ( ( rule__ListExpression__Group_4__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1089:1: ( rule__ListExpression__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListExpressionAccess().getGroup_4()); 
                    }
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1090:1: ( rule__ListExpression__Group_4__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1090:2: rule__ListExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ListExpression__Group_4__0_in_rule__ListExpression__Alternatives2298);
                    rule__ListExpression__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getListExpressionAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1094:6: ( ( rule__ListExpression__Group_5__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1094:6: ( ( rule__ListExpression__Group_5__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1095:1: ( rule__ListExpression__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListExpressionAccess().getGroup_5()); 
                    }
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1096:1: ( rule__ListExpression__Group_5__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1096:2: rule__ListExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ListExpression__Group_5__0_in_rule__ListExpression__Alternatives2316);
                    rule__ListExpression__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getListExpressionAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1100:6: ( ( rule__ListExpression__Group_6__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1100:6: ( ( rule__ListExpression__Group_6__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1101:1: ( rule__ListExpression__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListExpressionAccess().getGroup_6()); 
                    }
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1102:1: ( rule__ListExpression__Group_6__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1102:2: rule__ListExpression__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__ListExpression__Group_6__0_in_rule__ListExpression__Alternatives2334);
                    rule__ListExpression__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getListExpressionAccess().getGroup_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1106:6: ( ( rule__ListExpression__Group_7__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1106:6: ( ( rule__ListExpression__Group_7__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1107:1: ( rule__ListExpression__Group_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListExpressionAccess().getGroup_7()); 
                    }
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1108:1: ( rule__ListExpression__Group_7__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1108:2: rule__ListExpression__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__ListExpression__Group_7__0_in_rule__ListExpression__Alternatives2352);
                    rule__ListExpression__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getListExpressionAccess().getGroup_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1112:6: ( ( rule__ListExpression__Group_8__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1112:6: ( ( rule__ListExpression__Group_8__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1113:1: ( rule__ListExpression__Group_8__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListExpressionAccess().getGroup_8()); 
                    }
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1114:1: ( rule__ListExpression__Group_8__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1114:2: rule__ListExpression__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__ListExpression__Group_8__0_in_rule__ListExpression__Alternatives2370);
                    rule__ListExpression__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getListExpressionAccess().getGroup_8()); 
                    }

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
    // $ANTLR end "rule__ListExpression__Alternatives"


    // $ANTLR start "rule__UnaryExpression__Alternatives"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1123:1: rule__UnaryExpression__Alternatives : ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( ( rule__UnaryExpression__Group_1__0 ) ) | ( ( rule__UnaryExpression__Group_2__0 ) ) );
    public final void rule__UnaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1127:1: ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( ( rule__UnaryExpression__Group_1__0 ) ) | ( ( rule__UnaryExpression__Group_2__0 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case RULE_DOUBLE:
            case 45:
                {
                alt8=1;
                }
                break;
            case 25:
                {
                alt8=2;
                }
                break;
            case 41:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1128:1: ( ( rule__UnaryExpression__Group_0__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1128:1: ( ( rule__UnaryExpression__Group_0__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1129:1: ( rule__UnaryExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExpressionAccess().getGroup_0()); 
                    }
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1130:1: ( rule__UnaryExpression__Group_0__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1130:2: rule__UnaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__UnaryExpression__Group_0__0_in_rule__UnaryExpression__Alternatives2403);
                    rule__UnaryExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1134:6: ( ( rule__UnaryExpression__Group_1__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1134:6: ( ( rule__UnaryExpression__Group_1__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1135:1: ( rule__UnaryExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExpressionAccess().getGroup_1()); 
                    }
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1136:1: ( rule__UnaryExpression__Group_1__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1136:2: rule__UnaryExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__UnaryExpression__Group_1__0_in_rule__UnaryExpression__Alternatives2421);
                    rule__UnaryExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1140:6: ( ( rule__UnaryExpression__Group_2__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1140:6: ( ( rule__UnaryExpression__Group_2__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1141:1: ( rule__UnaryExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExpressionAccess().getGroup_2()); 
                    }
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1142:1: ( rule__UnaryExpression__Group_2__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1142:2: rule__UnaryExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__UnaryExpression__Group_2__0_in_rule__UnaryExpression__Alternatives2439);
                    rule__UnaryExpression__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryExpressionAccess().getGroup_2()); 
                    }

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
    // $ANTLR end "rule__UnaryExpression__Alternatives"


    // $ANTLR start "rule__Term__Alternatives"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1151:1: rule__Term__Alternatives : ( ( ruleDesignator ) | ( ( rule__Term__Group_1__0 ) ) | ( ( rule__Term__Group_2__0 ) ) | ( ( rule__Term__Group_3__0 ) ) | ( ruleList ) );
    public final void rule__Term__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1155:1: ( ( ruleDesignator ) | ( ( rule__Term__Group_1__0 ) ) | ( ( rule__Term__Group_2__0 ) ) | ( ( rule__Term__Group_3__0 ) ) | ( ruleList ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt9=1;
                }
                break;
            case RULE_STRING:
                {
                alt9=2;
                }
                break;
            case RULE_INT:
                {
                alt9=3;
                }
                break;
            case RULE_DOUBLE:
                {
                alt9=4;
                }
                break;
            case 45:
                {
                alt9=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1156:1: ( ruleDesignator )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1156:1: ( ruleDesignator )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1157:1: ruleDesignator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getDesignatorParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleDesignator_in_rule__Term__Alternatives2472);
                    ruleDesignator();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermAccess().getDesignatorParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1162:6: ( ( rule__Term__Group_1__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1162:6: ( ( rule__Term__Group_1__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1163:1: ( rule__Term__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getGroup_1()); 
                    }
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1164:1: ( rule__Term__Group_1__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1164:2: rule__Term__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Term__Group_1__0_in_rule__Term__Alternatives2489);
                    rule__Term__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1168:6: ( ( rule__Term__Group_2__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1168:6: ( ( rule__Term__Group_2__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1169:1: ( rule__Term__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getGroup_2()); 
                    }
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1170:1: ( rule__Term__Group_2__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1170:2: rule__Term__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Term__Group_2__0_in_rule__Term__Alternatives2507);
                    rule__Term__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1174:6: ( ( rule__Term__Group_3__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1174:6: ( ( rule__Term__Group_3__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1175:1: ( rule__Term__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getGroup_3()); 
                    }
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1176:1: ( rule__Term__Group_3__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1176:2: rule__Term__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Term__Group_3__0_in_rule__Term__Alternatives2525);
                    rule__Term__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1180:6: ( ruleList )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1180:6: ( ruleList )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1181:1: ruleList
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getListParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleList_in_rule__Term__Alternatives2543);
                    ruleList();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermAccess().getListParserRuleCall_4()); 
                    }

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
    // $ANTLR end "rule__Term__Alternatives"


    // $ANTLR start "rule__StatementList__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1193:1: rule__StatementList__Group__0 : rule__StatementList__Group__0__Impl rule__StatementList__Group__1 ;
    public final void rule__StatementList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1197:1: ( rule__StatementList__Group__0__Impl rule__StatementList__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1198:2: rule__StatementList__Group__0__Impl rule__StatementList__Group__1
            {
            pushFollow(FOLLOW_rule__StatementList__Group__0__Impl_in_rule__StatementList__Group__02573);
            rule__StatementList__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StatementList__Group__1_in_rule__StatementList__Group__02576);
            rule__StatementList__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatementList__Group__0"


    // $ANTLR start "rule__StatementList__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1205:1: rule__StatementList__Group__0__Impl : ( ( rule__StatementList__HeadAssignment_0 ) ) ;
    public final void rule__StatementList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1209:1: ( ( ( rule__StatementList__HeadAssignment_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1210:1: ( ( rule__StatementList__HeadAssignment_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1210:1: ( ( rule__StatementList__HeadAssignment_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1211:1: ( rule__StatementList__HeadAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementListAccess().getHeadAssignment_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1212:1: ( rule__StatementList__HeadAssignment_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1212:2: rule__StatementList__HeadAssignment_0
            {
            pushFollow(FOLLOW_rule__StatementList__HeadAssignment_0_in_rule__StatementList__Group__0__Impl2603);
            rule__StatementList__HeadAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementListAccess().getHeadAssignment_0()); 
            }

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
    // $ANTLR end "rule__StatementList__Group__0__Impl"


    // $ANTLR start "rule__StatementList__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1222:1: rule__StatementList__Group__1 : rule__StatementList__Group__1__Impl rule__StatementList__Group__2 ;
    public final void rule__StatementList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1226:1: ( rule__StatementList__Group__1__Impl rule__StatementList__Group__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1227:2: rule__StatementList__Group__1__Impl rule__StatementList__Group__2
            {
            pushFollow(FOLLOW_rule__StatementList__Group__1__Impl_in_rule__StatementList__Group__12633);
            rule__StatementList__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StatementList__Group__2_in_rule__StatementList__Group__12636);
            rule__StatementList__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatementList__Group__1"


    // $ANTLR start "rule__StatementList__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1234:1: rule__StatementList__Group__1__Impl : ( ';' ) ;
    public final void rule__StatementList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1238:1: ( ( ';' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1239:1: ( ';' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1239:1: ( ';' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1240:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementListAccess().getSemicolonKeyword_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__StatementList__Group__1__Impl2664); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementListAccess().getSemicolonKeyword_1()); 
            }

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
    // $ANTLR end "rule__StatementList__Group__1__Impl"


    // $ANTLR start "rule__StatementList__Group__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1253:1: rule__StatementList__Group__2 : rule__StatementList__Group__2__Impl ;
    public final void rule__StatementList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1257:1: ( rule__StatementList__Group__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1258:2: rule__StatementList__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__StatementList__Group__2__Impl_in_rule__StatementList__Group__22695);
            rule__StatementList__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatementList__Group__2"


    // $ANTLR start "rule__StatementList__Group__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1264:1: rule__StatementList__Group__2__Impl : ( ( rule__StatementList__TailAssignment_2 )? ) ;
    public final void rule__StatementList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1268:1: ( ( ( rule__StatementList__TailAssignment_2 )? ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1269:1: ( ( rule__StatementList__TailAssignment_2 )? )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1269:1: ( ( rule__StatementList__TailAssignment_2 )? )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1270:1: ( rule__StatementList__TailAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementListAccess().getTailAssignment_2()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1271:1: ( rule__StatementList__TailAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1271:2: rule__StatementList__TailAssignment_2
                    {
                    pushFollow(FOLLOW_rule__StatementList__TailAssignment_2_in_rule__StatementList__Group__2__Impl2722);
                    rule__StatementList__TailAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementListAccess().getTailAssignment_2()); 
            }

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
    // $ANTLR end "rule__StatementList__Group__2__Impl"


    // $ANTLR start "rule__VariableAssignmentStatement__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1287:1: rule__VariableAssignmentStatement__Group__0 : rule__VariableAssignmentStatement__Group__0__Impl rule__VariableAssignmentStatement__Group__1 ;
    public final void rule__VariableAssignmentStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1291:1: ( rule__VariableAssignmentStatement__Group__0__Impl rule__VariableAssignmentStatement__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1292:2: rule__VariableAssignmentStatement__Group__0__Impl rule__VariableAssignmentStatement__Group__1
            {
            pushFollow(FOLLOW_rule__VariableAssignmentStatement__Group__0__Impl_in_rule__VariableAssignmentStatement__Group__02759);
            rule__VariableAssignmentStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableAssignmentStatement__Group__1_in_rule__VariableAssignmentStatement__Group__02762);
            rule__VariableAssignmentStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignmentStatement__Group__0"


    // $ANTLR start "rule__VariableAssignmentStatement__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1299:1: rule__VariableAssignmentStatement__Group__0__Impl : ( ( rule__VariableAssignmentStatement__DesignatorAssignment_0 ) ) ;
    public final void rule__VariableAssignmentStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1303:1: ( ( ( rule__VariableAssignmentStatement__DesignatorAssignment_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1304:1: ( ( rule__VariableAssignmentStatement__DesignatorAssignment_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1304:1: ( ( rule__VariableAssignmentStatement__DesignatorAssignment_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1305:1: ( rule__VariableAssignmentStatement__DesignatorAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAssignmentStatementAccess().getDesignatorAssignment_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1306:1: ( rule__VariableAssignmentStatement__DesignatorAssignment_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1306:2: rule__VariableAssignmentStatement__DesignatorAssignment_0
            {
            pushFollow(FOLLOW_rule__VariableAssignmentStatement__DesignatorAssignment_0_in_rule__VariableAssignmentStatement__Group__0__Impl2789);
            rule__VariableAssignmentStatement__DesignatorAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAssignmentStatementAccess().getDesignatorAssignment_0()); 
            }

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
    // $ANTLR end "rule__VariableAssignmentStatement__Group__0__Impl"


    // $ANTLR start "rule__VariableAssignmentStatement__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1316:1: rule__VariableAssignmentStatement__Group__1 : rule__VariableAssignmentStatement__Group__1__Impl rule__VariableAssignmentStatement__Group__2 ;
    public final void rule__VariableAssignmentStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1320:1: ( rule__VariableAssignmentStatement__Group__1__Impl rule__VariableAssignmentStatement__Group__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1321:2: rule__VariableAssignmentStatement__Group__1__Impl rule__VariableAssignmentStatement__Group__2
            {
            pushFollow(FOLLOW_rule__VariableAssignmentStatement__Group__1__Impl_in_rule__VariableAssignmentStatement__Group__12819);
            rule__VariableAssignmentStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableAssignmentStatement__Group__2_in_rule__VariableAssignmentStatement__Group__12822);
            rule__VariableAssignmentStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignmentStatement__Group__1"


    // $ANTLR start "rule__VariableAssignmentStatement__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1328:1: rule__VariableAssignmentStatement__Group__1__Impl : ( '<-' ) ;
    public final void rule__VariableAssignmentStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1332:1: ( ( '<-' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1333:1: ( '<-' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1333:1: ( '<-' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1334:1: '<-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAssignmentStatementAccess().getLessThanSignHyphenMinusKeyword_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__VariableAssignmentStatement__Group__1__Impl2850); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAssignmentStatementAccess().getLessThanSignHyphenMinusKeyword_1()); 
            }

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
    // $ANTLR end "rule__VariableAssignmentStatement__Group__1__Impl"


    // $ANTLR start "rule__VariableAssignmentStatement__Group__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1347:1: rule__VariableAssignmentStatement__Group__2 : rule__VariableAssignmentStatement__Group__2__Impl ;
    public final void rule__VariableAssignmentStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1351:1: ( rule__VariableAssignmentStatement__Group__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1352:2: rule__VariableAssignmentStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__VariableAssignmentStatement__Group__2__Impl_in_rule__VariableAssignmentStatement__Group__22881);
            rule__VariableAssignmentStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignmentStatement__Group__2"


    // $ANTLR start "rule__VariableAssignmentStatement__Group__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1358:1: rule__VariableAssignmentStatement__Group__2__Impl : ( ( rule__VariableAssignmentStatement__ExpressionAssignment_2 ) ) ;
    public final void rule__VariableAssignmentStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1362:1: ( ( ( rule__VariableAssignmentStatement__ExpressionAssignment_2 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1363:1: ( ( rule__VariableAssignmentStatement__ExpressionAssignment_2 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1363:1: ( ( rule__VariableAssignmentStatement__ExpressionAssignment_2 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1364:1: ( rule__VariableAssignmentStatement__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAssignmentStatementAccess().getExpressionAssignment_2()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1365:1: ( rule__VariableAssignmentStatement__ExpressionAssignment_2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1365:2: rule__VariableAssignmentStatement__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__VariableAssignmentStatement__ExpressionAssignment_2_in_rule__VariableAssignmentStatement__Group__2__Impl2908);
            rule__VariableAssignmentStatement__ExpressionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAssignmentStatementAccess().getExpressionAssignment_2()); 
            }

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
    // $ANTLR end "rule__VariableAssignmentStatement__Group__2__Impl"


    // $ANTLR start "rule__SelfAssignmentStatement__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1381:1: rule__SelfAssignmentStatement__Group__0 : rule__SelfAssignmentStatement__Group__0__Impl rule__SelfAssignmentStatement__Group__1 ;
    public final void rule__SelfAssignmentStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1385:1: ( rule__SelfAssignmentStatement__Group__0__Impl rule__SelfAssignmentStatement__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1386:2: rule__SelfAssignmentStatement__Group__0__Impl rule__SelfAssignmentStatement__Group__1
            {
            pushFollow(FOLLOW_rule__SelfAssignmentStatement__Group__0__Impl_in_rule__SelfAssignmentStatement__Group__02944);
            rule__SelfAssignmentStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SelfAssignmentStatement__Group__1_in_rule__SelfAssignmentStatement__Group__02947);
            rule__SelfAssignmentStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfAssignmentStatement__Group__0"


    // $ANTLR start "rule__SelfAssignmentStatement__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1393:1: rule__SelfAssignmentStatement__Group__0__Impl : ( 'CurrentState' ) ;
    public final void rule__SelfAssignmentStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1397:1: ( ( 'CurrentState' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1398:1: ( 'CurrentState' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1398:1: ( 'CurrentState' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1399:1: 'CurrentState'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfAssignmentStatementAccess().getCurrentStateKeyword_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__SelfAssignmentStatement__Group__0__Impl2975); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelfAssignmentStatementAccess().getCurrentStateKeyword_0()); 
            }

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
    // $ANTLR end "rule__SelfAssignmentStatement__Group__0__Impl"


    // $ANTLR start "rule__SelfAssignmentStatement__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1412:1: rule__SelfAssignmentStatement__Group__1 : rule__SelfAssignmentStatement__Group__1__Impl rule__SelfAssignmentStatement__Group__2 ;
    public final void rule__SelfAssignmentStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1416:1: ( rule__SelfAssignmentStatement__Group__1__Impl rule__SelfAssignmentStatement__Group__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1417:2: rule__SelfAssignmentStatement__Group__1__Impl rule__SelfAssignmentStatement__Group__2
            {
            pushFollow(FOLLOW_rule__SelfAssignmentStatement__Group__1__Impl_in_rule__SelfAssignmentStatement__Group__13006);
            rule__SelfAssignmentStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SelfAssignmentStatement__Group__2_in_rule__SelfAssignmentStatement__Group__13009);
            rule__SelfAssignmentStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfAssignmentStatement__Group__1"


    // $ANTLR start "rule__SelfAssignmentStatement__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1424:1: rule__SelfAssignmentStatement__Group__1__Impl : ( '<-' ) ;
    public final void rule__SelfAssignmentStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1428:1: ( ( '<-' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1429:1: ( '<-' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1429:1: ( '<-' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1430:1: '<-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfAssignmentStatementAccess().getLessThanSignHyphenMinusKeyword_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__SelfAssignmentStatement__Group__1__Impl3037); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelfAssignmentStatementAccess().getLessThanSignHyphenMinusKeyword_1()); 
            }

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
    // $ANTLR end "rule__SelfAssignmentStatement__Group__1__Impl"


    // $ANTLR start "rule__SelfAssignmentStatement__Group__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1443:1: rule__SelfAssignmentStatement__Group__2 : rule__SelfAssignmentStatement__Group__2__Impl ;
    public final void rule__SelfAssignmentStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1447:1: ( rule__SelfAssignmentStatement__Group__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1448:2: rule__SelfAssignmentStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SelfAssignmentStatement__Group__2__Impl_in_rule__SelfAssignmentStatement__Group__23068);
            rule__SelfAssignmentStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfAssignmentStatement__Group__2"


    // $ANTLR start "rule__SelfAssignmentStatement__Group__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1454:1: rule__SelfAssignmentStatement__Group__2__Impl : ( ( rule__SelfAssignmentStatement__ExpressionAssignment_2 ) ) ;
    public final void rule__SelfAssignmentStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1458:1: ( ( ( rule__SelfAssignmentStatement__ExpressionAssignment_2 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1459:1: ( ( rule__SelfAssignmentStatement__ExpressionAssignment_2 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1459:1: ( ( rule__SelfAssignmentStatement__ExpressionAssignment_2 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1460:1: ( rule__SelfAssignmentStatement__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfAssignmentStatementAccess().getExpressionAssignment_2()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1461:1: ( rule__SelfAssignmentStatement__ExpressionAssignment_2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1461:2: rule__SelfAssignmentStatement__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__SelfAssignmentStatement__ExpressionAssignment_2_in_rule__SelfAssignmentStatement__Group__2__Impl3095);
            rule__SelfAssignmentStatement__ExpressionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelfAssignmentStatementAccess().getExpressionAssignment_2()); 
            }

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
    // $ANTLR end "rule__SelfAssignmentStatement__Group__2__Impl"


    // $ANTLR start "rule__OrExpression__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1477:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1481:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1482:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__03131);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__03134);
            rule__OrExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0"


    // $ANTLR start "rule__OrExpression__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1489:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1493:1: ( ( ruleAndExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1494:1: ( ruleAndExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1494:1: ( ruleAndExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1495:1: ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl3161);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__OrExpression__Group__0__Impl"


    // $ANTLR start "rule__OrExpression__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1506:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl rule__OrExpression__Group__2 ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1510:1: ( rule__OrExpression__Group__1__Impl rule__OrExpression__Group__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1511:2: rule__OrExpression__Group__1__Impl rule__OrExpression__Group__2
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__13190);
            rule__OrExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OrExpression__Group__2_in_rule__OrExpression__Group__13193);
            rule__OrExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1"


    // $ANTLR start "rule__OrExpression__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1518:1: rule__OrExpression__Group__1__Impl : ( () ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1522:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1523:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1523:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1524:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1525:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1527:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1537:1: rule__OrExpression__Group__2 : rule__OrExpression__Group__2__Impl ;
    public final void rule__OrExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1541:1: ( rule__OrExpression__Group__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1542:2: rule__OrExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__2__Impl_in_rule__OrExpression__Group__23251);
            rule__OrExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__2"


    // $ANTLR start "rule__OrExpression__Group__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1548:1: rule__OrExpression__Group__2__Impl : ( ( rule__OrExpression__Group_2__0 )? ) ;
    public final void rule__OrExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1552:1: ( ( ( rule__OrExpression__Group_2__0 )? ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1553:1: ( ( rule__OrExpression__Group_2__0 )? )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1553:1: ( ( rule__OrExpression__Group_2__0 )? )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1554:1: ( rule__OrExpression__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_2()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1555:1: ( rule__OrExpression__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==47) ) {
                int LA11_1 = input.LA(2);

                if ( (synpred27_InternalExpression()) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1555:2: rule__OrExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__OrExpression__Group_2__0_in_rule__OrExpression__Group__2__Impl3278);
                    rule__OrExpression__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getGroup_2()); 
            }

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
    // $ANTLR end "rule__OrExpression__Group__2__Impl"


    // $ANTLR start "rule__OrExpression__Group_2__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1571:1: rule__OrExpression__Group_2__0 : rule__OrExpression__Group_2__0__Impl rule__OrExpression__Group_2__1 ;
    public final void rule__OrExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1575:1: ( rule__OrExpression__Group_2__0__Impl rule__OrExpression__Group_2__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1576:2: rule__OrExpression__Group_2__0__Impl rule__OrExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_2__0__Impl_in_rule__OrExpression__Group_2__03315);
            rule__OrExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OrExpression__Group_2__1_in_rule__OrExpression__Group_2__03318);
            rule__OrExpression__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_2__0"


    // $ANTLR start "rule__OrExpression__Group_2__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1583:1: rule__OrExpression__Group_2__0__Impl : ( ( rule__OrExpression__OpAssignment_2_0 ) ) ;
    public final void rule__OrExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1587:1: ( ( ( rule__OrExpression__OpAssignment_2_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1588:1: ( ( rule__OrExpression__OpAssignment_2_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1588:1: ( ( rule__OrExpression__OpAssignment_2_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1589:1: ( rule__OrExpression__OpAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOpAssignment_2_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1590:1: ( rule__OrExpression__OpAssignment_2_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1590:2: rule__OrExpression__OpAssignment_2_0
            {
            pushFollow(FOLLOW_rule__OrExpression__OpAssignment_2_0_in_rule__OrExpression__Group_2__0__Impl3345);
            rule__OrExpression__OpAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOpAssignment_2_0()); 
            }

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
    // $ANTLR end "rule__OrExpression__Group_2__0__Impl"


    // $ANTLR start "rule__OrExpression__Group_2__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1600:1: rule__OrExpression__Group_2__1 : rule__OrExpression__Group_2__1__Impl ;
    public final void rule__OrExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1604:1: ( rule__OrExpression__Group_2__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1605:2: rule__OrExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_2__1__Impl_in_rule__OrExpression__Group_2__13375);
            rule__OrExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_2__1"


    // $ANTLR start "rule__OrExpression__Group_2__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1611:1: rule__OrExpression__Group_2__1__Impl : ( ( rule__OrExpression__RightAssignment_2_1 ) ) ;
    public final void rule__OrExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1615:1: ( ( ( rule__OrExpression__RightAssignment_2_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1616:1: ( ( rule__OrExpression__RightAssignment_2_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1616:1: ( ( rule__OrExpression__RightAssignment_2_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1617:1: ( rule__OrExpression__RightAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getRightAssignment_2_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1618:1: ( rule__OrExpression__RightAssignment_2_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1618:2: rule__OrExpression__RightAssignment_2_1
            {
            pushFollow(FOLLOW_rule__OrExpression__RightAssignment_2_1_in_rule__OrExpression__Group_2__1__Impl3402);
            rule__OrExpression__RightAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getRightAssignment_2_1()); 
            }

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
    // $ANTLR end "rule__OrExpression__Group_2__1__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1632:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1636:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1637:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__03436);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__03439);
            rule__AndExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1644:1: rule__AndExpression__Group__0__Impl : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1648:1: ( ( ruleEqualityExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1649:1: ( ruleEqualityExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1649:1: ( ruleEqualityExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1650:1: ruleEqualityExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleEqualityExpression_in_rule__AndExpression__Group__0__Impl3466);
            ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1661:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl rule__AndExpression__Group__2 ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1665:1: ( rule__AndExpression__Group__1__Impl rule__AndExpression__Group__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1666:2: rule__AndExpression__Group__1__Impl rule__AndExpression__Group__2
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__13495);
            rule__AndExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AndExpression__Group__2_in_rule__AndExpression__Group__13498);
            rule__AndExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1673:1: rule__AndExpression__Group__1__Impl : ( () ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1677:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1678:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1678:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1679:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1680:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1682:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1692:1: rule__AndExpression__Group__2 : rule__AndExpression__Group__2__Impl ;
    public final void rule__AndExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1696:1: ( rule__AndExpression__Group__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1697:2: rule__AndExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__2__Impl_in_rule__AndExpression__Group__23556);
            rule__AndExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__2"


    // $ANTLR start "rule__AndExpression__Group__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1703:1: rule__AndExpression__Group__2__Impl : ( ( rule__AndExpression__Group_2__0 )? ) ;
    public final void rule__AndExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1707:1: ( ( ( rule__AndExpression__Group_2__0 )? ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1708:1: ( ( rule__AndExpression__Group_2__0 )? )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1708:1: ( ( rule__AndExpression__Group_2__0 )? )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1709:1: ( rule__AndExpression__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_2()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1710:1: ( rule__AndExpression__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==48) ) {
                int LA12_1 = input.LA(2);

                if ( (synpred28_InternalExpression()) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1710:2: rule__AndExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__AndExpression__Group_2__0_in_rule__AndExpression__Group__2__Impl3583);
                    rule__AndExpression__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getGroup_2()); 
            }

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
    // $ANTLR end "rule__AndExpression__Group__2__Impl"


    // $ANTLR start "rule__AndExpression__Group_2__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1726:1: rule__AndExpression__Group_2__0 : rule__AndExpression__Group_2__0__Impl rule__AndExpression__Group_2__1 ;
    public final void rule__AndExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1730:1: ( rule__AndExpression__Group_2__0__Impl rule__AndExpression__Group_2__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1731:2: rule__AndExpression__Group_2__0__Impl rule__AndExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_2__0__Impl_in_rule__AndExpression__Group_2__03620);
            rule__AndExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AndExpression__Group_2__1_in_rule__AndExpression__Group_2__03623);
            rule__AndExpression__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_2__0"


    // $ANTLR start "rule__AndExpression__Group_2__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1738:1: rule__AndExpression__Group_2__0__Impl : ( ( rule__AndExpression__OpAssignment_2_0 ) ) ;
    public final void rule__AndExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1742:1: ( ( ( rule__AndExpression__OpAssignment_2_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1743:1: ( ( rule__AndExpression__OpAssignment_2_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1743:1: ( ( rule__AndExpression__OpAssignment_2_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1744:1: ( rule__AndExpression__OpAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOpAssignment_2_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1745:1: ( rule__AndExpression__OpAssignment_2_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1745:2: rule__AndExpression__OpAssignment_2_0
            {
            pushFollow(FOLLOW_rule__AndExpression__OpAssignment_2_0_in_rule__AndExpression__Group_2__0__Impl3650);
            rule__AndExpression__OpAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getOpAssignment_2_0()); 
            }

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
    // $ANTLR end "rule__AndExpression__Group_2__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_2__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1755:1: rule__AndExpression__Group_2__1 : rule__AndExpression__Group_2__1__Impl ;
    public final void rule__AndExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1759:1: ( rule__AndExpression__Group_2__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1760:2: rule__AndExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_2__1__Impl_in_rule__AndExpression__Group_2__13680);
            rule__AndExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_2__1"


    // $ANTLR start "rule__AndExpression__Group_2__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1766:1: rule__AndExpression__Group_2__1__Impl : ( ( rule__AndExpression__RightAssignment_2_1 ) ) ;
    public final void rule__AndExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1770:1: ( ( ( rule__AndExpression__RightAssignment_2_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1771:1: ( ( rule__AndExpression__RightAssignment_2_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1771:1: ( ( rule__AndExpression__RightAssignment_2_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1772:1: ( rule__AndExpression__RightAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getRightAssignment_2_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1773:1: ( rule__AndExpression__RightAssignment_2_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1773:2: rule__AndExpression__RightAssignment_2_1
            {
            pushFollow(FOLLOW_rule__AndExpression__RightAssignment_2_1_in_rule__AndExpression__Group_2__1__Impl3707);
            rule__AndExpression__RightAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getRightAssignment_2_1()); 
            }

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
    // $ANTLR end "rule__AndExpression__Group_2__1__Impl"


    // $ANTLR start "rule__EqualityExpression__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1787:1: rule__EqualityExpression__Group__0 : rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 ;
    public final void rule__EqualityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1791:1: ( rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1792:2: rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group__0__Impl_in_rule__EqualityExpression__Group__03741);
            rule__EqualityExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqualityExpression__Group__1_in_rule__EqualityExpression__Group__03744);
            rule__EqualityExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group__0"


    // $ANTLR start "rule__EqualityExpression__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1799:1: rule__EqualityExpression__Group__0__Impl : ( ruleDashExpression ) ;
    public final void rule__EqualityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1803:1: ( ( ruleDashExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1804:1: ( ruleDashExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1804:1: ( ruleDashExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1805:1: ruleDashExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getDashExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleDashExpression_in_rule__EqualityExpression__Group__0__Impl3771);
            ruleDashExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getDashExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__EqualityExpression__Group__0__Impl"


    // $ANTLR start "rule__EqualityExpression__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1816:1: rule__EqualityExpression__Group__1 : rule__EqualityExpression__Group__1__Impl rule__EqualityExpression__Group__2 ;
    public final void rule__EqualityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1820:1: ( rule__EqualityExpression__Group__1__Impl rule__EqualityExpression__Group__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1821:2: rule__EqualityExpression__Group__1__Impl rule__EqualityExpression__Group__2
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group__1__Impl_in_rule__EqualityExpression__Group__13800);
            rule__EqualityExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqualityExpression__Group__2_in_rule__EqualityExpression__Group__13803);
            rule__EqualityExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group__1"


    // $ANTLR start "rule__EqualityExpression__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1828:1: rule__EqualityExpression__Group__1__Impl : ( () ) ;
    public final void rule__EqualityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1832:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1833:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1833:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1834:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1835:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1837:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group__1__Impl"


    // $ANTLR start "rule__EqualityExpression__Group__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1847:1: rule__EqualityExpression__Group__2 : rule__EqualityExpression__Group__2__Impl ;
    public final void rule__EqualityExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1851:1: ( rule__EqualityExpression__Group__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1852:2: rule__EqualityExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group__2__Impl_in_rule__EqualityExpression__Group__23861);
            rule__EqualityExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group__2"


    // $ANTLR start "rule__EqualityExpression__Group__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1858:1: rule__EqualityExpression__Group__2__Impl : ( ( rule__EqualityExpression__Group_2__0 )? ) ;
    public final void rule__EqualityExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1862:1: ( ( ( rule__EqualityExpression__Group_2__0 )? ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1863:1: ( ( rule__EqualityExpression__Group_2__0 )? )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1863:1: ( ( rule__EqualityExpression__Group_2__0 )? )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1864:1: ( rule__EqualityExpression__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getGroup_2()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1865:1: ( rule__EqualityExpression__Group_2__0 )?
            int alt13=2;
            switch ( input.LA(1) ) {
                case 12:
                    {
                    int LA13_1 = input.LA(2);

                    if ( (synpred29_InternalExpression()) ) {
                        alt13=1;
                    }
                    }
                    break;
                case 13:
                    {
                    int LA13_2 = input.LA(2);

                    if ( (synpred29_InternalExpression()) ) {
                        alt13=1;
                    }
                    }
                    break;
                case 14:
                    {
                    int LA13_3 = input.LA(2);

                    if ( (synpred29_InternalExpression()) ) {
                        alt13=1;
                    }
                    }
                    break;
                case 15:
                    {
                    int LA13_4 = input.LA(2);

                    if ( (synpred29_InternalExpression()) ) {
                        alt13=1;
                    }
                    }
                    break;
                case 16:
                    {
                    int LA13_5 = input.LA(2);

                    if ( (synpred29_InternalExpression()) ) {
                        alt13=1;
                    }
                    }
                    break;
                case 17:
                    {
                    int LA13_6 = input.LA(2);

                    if ( (synpred29_InternalExpression()) ) {
                        alt13=1;
                    }
                    }
                    break;
            }

            switch (alt13) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1865:2: rule__EqualityExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__EqualityExpression__Group_2__0_in_rule__EqualityExpression__Group__2__Impl3888);
                    rule__EqualityExpression__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getGroup_2()); 
            }

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
    // $ANTLR end "rule__EqualityExpression__Group__2__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_2__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1881:1: rule__EqualityExpression__Group_2__0 : rule__EqualityExpression__Group_2__0__Impl rule__EqualityExpression__Group_2__1 ;
    public final void rule__EqualityExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1885:1: ( rule__EqualityExpression__Group_2__0__Impl rule__EqualityExpression__Group_2__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1886:2: rule__EqualityExpression__Group_2__0__Impl rule__EqualityExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group_2__0__Impl_in_rule__EqualityExpression__Group_2__03925);
            rule__EqualityExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqualityExpression__Group_2__1_in_rule__EqualityExpression__Group_2__03928);
            rule__EqualityExpression__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_2__0"


    // $ANTLR start "rule__EqualityExpression__Group_2__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1893:1: rule__EqualityExpression__Group_2__0__Impl : ( ( rule__EqualityExpression__OpAssignment_2_0 ) ) ;
    public final void rule__EqualityExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1897:1: ( ( ( rule__EqualityExpression__OpAssignment_2_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1898:1: ( ( rule__EqualityExpression__OpAssignment_2_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1898:1: ( ( rule__EqualityExpression__OpAssignment_2_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1899:1: ( rule__EqualityExpression__OpAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getOpAssignment_2_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1900:1: ( rule__EqualityExpression__OpAssignment_2_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1900:2: rule__EqualityExpression__OpAssignment_2_0
            {
            pushFollow(FOLLOW_rule__EqualityExpression__OpAssignment_2_0_in_rule__EqualityExpression__Group_2__0__Impl3955);
            rule__EqualityExpression__OpAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getOpAssignment_2_0()); 
            }

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
    // $ANTLR end "rule__EqualityExpression__Group_2__0__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_2__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1910:1: rule__EqualityExpression__Group_2__1 : rule__EqualityExpression__Group_2__1__Impl ;
    public final void rule__EqualityExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1914:1: ( rule__EqualityExpression__Group_2__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1915:2: rule__EqualityExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group_2__1__Impl_in_rule__EqualityExpression__Group_2__13985);
            rule__EqualityExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_2__1"


    // $ANTLR start "rule__EqualityExpression__Group_2__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1921:1: rule__EqualityExpression__Group_2__1__Impl : ( ( rule__EqualityExpression__RightAssignment_2_1 ) ) ;
    public final void rule__EqualityExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1925:1: ( ( ( rule__EqualityExpression__RightAssignment_2_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1926:1: ( ( rule__EqualityExpression__RightAssignment_2_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1926:1: ( ( rule__EqualityExpression__RightAssignment_2_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1927:1: ( rule__EqualityExpression__RightAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getRightAssignment_2_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1928:1: ( rule__EqualityExpression__RightAssignment_2_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1928:2: rule__EqualityExpression__RightAssignment_2_1
            {
            pushFollow(FOLLOW_rule__EqualityExpression__RightAssignment_2_1_in_rule__EqualityExpression__Group_2__1__Impl4012);
            rule__EqualityExpression__RightAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getRightAssignment_2_1()); 
            }

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
    // $ANTLR end "rule__EqualityExpression__Group_2__1__Impl"


    // $ANTLR start "rule__DashExpression__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1942:1: rule__DashExpression__Group__0 : rule__DashExpression__Group__0__Impl rule__DashExpression__Group__1 ;
    public final void rule__DashExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1946:1: ( rule__DashExpression__Group__0__Impl rule__DashExpression__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1947:2: rule__DashExpression__Group__0__Impl rule__DashExpression__Group__1
            {
            pushFollow(FOLLOW_rule__DashExpression__Group__0__Impl_in_rule__DashExpression__Group__04046);
            rule__DashExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DashExpression__Group__1_in_rule__DashExpression__Group__04049);
            rule__DashExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashExpression__Group__0"


    // $ANTLR start "rule__DashExpression__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1954:1: rule__DashExpression__Group__0__Impl : ( rulePointExpression ) ;
    public final void rule__DashExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1958:1: ( ( rulePointExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1959:1: ( rulePointExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1959:1: ( rulePointExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1960:1: rulePointExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDashExpressionAccess().getPointExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePointExpression_in_rule__DashExpression__Group__0__Impl4076);
            rulePointExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDashExpressionAccess().getPointExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__DashExpression__Group__0__Impl"


    // $ANTLR start "rule__DashExpression__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1971:1: rule__DashExpression__Group__1 : rule__DashExpression__Group__1__Impl rule__DashExpression__Group__2 ;
    public final void rule__DashExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1975:1: ( rule__DashExpression__Group__1__Impl rule__DashExpression__Group__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1976:2: rule__DashExpression__Group__1__Impl rule__DashExpression__Group__2
            {
            pushFollow(FOLLOW_rule__DashExpression__Group__1__Impl_in_rule__DashExpression__Group__14105);
            rule__DashExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DashExpression__Group__2_in_rule__DashExpression__Group__14108);
            rule__DashExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashExpression__Group__1"


    // $ANTLR start "rule__DashExpression__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1983:1: rule__DashExpression__Group__1__Impl : ( () ) ;
    public final void rule__DashExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1987:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1988:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1988:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1989:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDashExpressionAccess().getDashExpressionLeftAction_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1990:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1992:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDashExpressionAccess().getDashExpressionLeftAction_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashExpression__Group__1__Impl"


    // $ANTLR start "rule__DashExpression__Group__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2002:1: rule__DashExpression__Group__2 : rule__DashExpression__Group__2__Impl ;
    public final void rule__DashExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2006:1: ( rule__DashExpression__Group__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2007:2: rule__DashExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DashExpression__Group__2__Impl_in_rule__DashExpression__Group__24166);
            rule__DashExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashExpression__Group__2"


    // $ANTLR start "rule__DashExpression__Group__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2013:1: rule__DashExpression__Group__2__Impl : ( ( rule__DashExpression__Group_2__0 )? ) ;
    public final void rule__DashExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2017:1: ( ( ( rule__DashExpression__Group_2__0 )? ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2018:1: ( ( rule__DashExpression__Group_2__0 )? )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2018:1: ( ( rule__DashExpression__Group_2__0 )? )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2019:1: ( rule__DashExpression__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDashExpressionAccess().getGroup_2()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2020:1: ( rule__DashExpression__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                int LA14_1 = input.LA(2);

                if ( (synpred30_InternalExpression()) ) {
                    alt14=1;
                }
            }
            else if ( (LA14_0==19) ) {
                int LA14_2 = input.LA(2);

                if ( (synpred30_InternalExpression()) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2020:2: rule__DashExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DashExpression__Group_2__0_in_rule__DashExpression__Group__2__Impl4193);
                    rule__DashExpression__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDashExpressionAccess().getGroup_2()); 
            }

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
    // $ANTLR end "rule__DashExpression__Group__2__Impl"


    // $ANTLR start "rule__DashExpression__Group_2__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2036:1: rule__DashExpression__Group_2__0 : rule__DashExpression__Group_2__0__Impl rule__DashExpression__Group_2__1 ;
    public final void rule__DashExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2040:1: ( rule__DashExpression__Group_2__0__Impl rule__DashExpression__Group_2__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2041:2: rule__DashExpression__Group_2__0__Impl rule__DashExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__DashExpression__Group_2__0__Impl_in_rule__DashExpression__Group_2__04230);
            rule__DashExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DashExpression__Group_2__1_in_rule__DashExpression__Group_2__04233);
            rule__DashExpression__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashExpression__Group_2__0"


    // $ANTLR start "rule__DashExpression__Group_2__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2048:1: rule__DashExpression__Group_2__0__Impl : ( ( rule__DashExpression__OpAssignment_2_0 ) ) ;
    public final void rule__DashExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2052:1: ( ( ( rule__DashExpression__OpAssignment_2_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2053:1: ( ( rule__DashExpression__OpAssignment_2_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2053:1: ( ( rule__DashExpression__OpAssignment_2_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2054:1: ( rule__DashExpression__OpAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDashExpressionAccess().getOpAssignment_2_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2055:1: ( rule__DashExpression__OpAssignment_2_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2055:2: rule__DashExpression__OpAssignment_2_0
            {
            pushFollow(FOLLOW_rule__DashExpression__OpAssignment_2_0_in_rule__DashExpression__Group_2__0__Impl4260);
            rule__DashExpression__OpAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDashExpressionAccess().getOpAssignment_2_0()); 
            }

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
    // $ANTLR end "rule__DashExpression__Group_2__0__Impl"


    // $ANTLR start "rule__DashExpression__Group_2__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2065:1: rule__DashExpression__Group_2__1 : rule__DashExpression__Group_2__1__Impl ;
    public final void rule__DashExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2069:1: ( rule__DashExpression__Group_2__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2070:2: rule__DashExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DashExpression__Group_2__1__Impl_in_rule__DashExpression__Group_2__14290);
            rule__DashExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashExpression__Group_2__1"


    // $ANTLR start "rule__DashExpression__Group_2__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2076:1: rule__DashExpression__Group_2__1__Impl : ( ( rule__DashExpression__RightAssignment_2_1 ) ) ;
    public final void rule__DashExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2080:1: ( ( ( rule__DashExpression__RightAssignment_2_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2081:1: ( ( rule__DashExpression__RightAssignment_2_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2081:1: ( ( rule__DashExpression__RightAssignment_2_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2082:1: ( rule__DashExpression__RightAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDashExpressionAccess().getRightAssignment_2_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2083:1: ( rule__DashExpression__RightAssignment_2_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2083:2: rule__DashExpression__RightAssignment_2_1
            {
            pushFollow(FOLLOW_rule__DashExpression__RightAssignment_2_1_in_rule__DashExpression__Group_2__1__Impl4317);
            rule__DashExpression__RightAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDashExpressionAccess().getRightAssignment_2_1()); 
            }

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
    // $ANTLR end "rule__DashExpression__Group_2__1__Impl"


    // $ANTLR start "rule__PointExpression__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2097:1: rule__PointExpression__Group__0 : rule__PointExpression__Group__0__Impl rule__PointExpression__Group__1 ;
    public final void rule__PointExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2101:1: ( rule__PointExpression__Group__0__Impl rule__PointExpression__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2102:2: rule__PointExpression__Group__0__Impl rule__PointExpression__Group__1
            {
            pushFollow(FOLLOW_rule__PointExpression__Group__0__Impl_in_rule__PointExpression__Group__04351);
            rule__PointExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PointExpression__Group__1_in_rule__PointExpression__Group__04354);
            rule__PointExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointExpression__Group__0"


    // $ANTLR start "rule__PointExpression__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2109:1: rule__PointExpression__Group__0__Impl : ( rulePowExpression ) ;
    public final void rule__PointExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2113:1: ( ( rulePowExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2114:1: ( rulePowExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2114:1: ( rulePowExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2115:1: rulePowExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointExpressionAccess().getPowExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePowExpression_in_rule__PointExpression__Group__0__Impl4381);
            rulePowExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointExpressionAccess().getPowExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__PointExpression__Group__0__Impl"


    // $ANTLR start "rule__PointExpression__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2126:1: rule__PointExpression__Group__1 : rule__PointExpression__Group__1__Impl rule__PointExpression__Group__2 ;
    public final void rule__PointExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2130:1: ( rule__PointExpression__Group__1__Impl rule__PointExpression__Group__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2131:2: rule__PointExpression__Group__1__Impl rule__PointExpression__Group__2
            {
            pushFollow(FOLLOW_rule__PointExpression__Group__1__Impl_in_rule__PointExpression__Group__14410);
            rule__PointExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PointExpression__Group__2_in_rule__PointExpression__Group__14413);
            rule__PointExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointExpression__Group__1"


    // $ANTLR start "rule__PointExpression__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2138:1: rule__PointExpression__Group__1__Impl : ( () ) ;
    public final void rule__PointExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2142:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2143:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2143:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2144:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointExpressionAccess().getPointExpressionLeftAction_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2145:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2147:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointExpressionAccess().getPointExpressionLeftAction_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointExpression__Group__1__Impl"


    // $ANTLR start "rule__PointExpression__Group__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2157:1: rule__PointExpression__Group__2 : rule__PointExpression__Group__2__Impl ;
    public final void rule__PointExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2161:1: ( rule__PointExpression__Group__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2162:2: rule__PointExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PointExpression__Group__2__Impl_in_rule__PointExpression__Group__24471);
            rule__PointExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointExpression__Group__2"


    // $ANTLR start "rule__PointExpression__Group__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2168:1: rule__PointExpression__Group__2__Impl : ( ( rule__PointExpression__Group_2__0 )? ) ;
    public final void rule__PointExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2172:1: ( ( ( rule__PointExpression__Group_2__0 )? ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2173:1: ( ( rule__PointExpression__Group_2__0 )? )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2173:1: ( ( rule__PointExpression__Group_2__0 )? )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2174:1: ( rule__PointExpression__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointExpressionAccess().getGroup_2()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2175:1: ( rule__PointExpression__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                int LA15_1 = input.LA(2);

                if ( (synpred31_InternalExpression()) ) {
                    alt15=1;
                }
            }
            else if ( (LA15_0==21) ) {
                int LA15_2 = input.LA(2);

                if ( (synpred31_InternalExpression()) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2175:2: rule__PointExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__PointExpression__Group_2__0_in_rule__PointExpression__Group__2__Impl4498);
                    rule__PointExpression__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointExpressionAccess().getGroup_2()); 
            }

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
    // $ANTLR end "rule__PointExpression__Group__2__Impl"


    // $ANTLR start "rule__PointExpression__Group_2__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2191:1: rule__PointExpression__Group_2__0 : rule__PointExpression__Group_2__0__Impl rule__PointExpression__Group_2__1 ;
    public final void rule__PointExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2195:1: ( rule__PointExpression__Group_2__0__Impl rule__PointExpression__Group_2__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2196:2: rule__PointExpression__Group_2__0__Impl rule__PointExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__PointExpression__Group_2__0__Impl_in_rule__PointExpression__Group_2__04535);
            rule__PointExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PointExpression__Group_2__1_in_rule__PointExpression__Group_2__04538);
            rule__PointExpression__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointExpression__Group_2__0"


    // $ANTLR start "rule__PointExpression__Group_2__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2203:1: rule__PointExpression__Group_2__0__Impl : ( ( rule__PointExpression__OpAssignment_2_0 ) ) ;
    public final void rule__PointExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2207:1: ( ( ( rule__PointExpression__OpAssignment_2_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2208:1: ( ( rule__PointExpression__OpAssignment_2_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2208:1: ( ( rule__PointExpression__OpAssignment_2_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2209:1: ( rule__PointExpression__OpAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointExpressionAccess().getOpAssignment_2_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2210:1: ( rule__PointExpression__OpAssignment_2_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2210:2: rule__PointExpression__OpAssignment_2_0
            {
            pushFollow(FOLLOW_rule__PointExpression__OpAssignment_2_0_in_rule__PointExpression__Group_2__0__Impl4565);
            rule__PointExpression__OpAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointExpressionAccess().getOpAssignment_2_0()); 
            }

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
    // $ANTLR end "rule__PointExpression__Group_2__0__Impl"


    // $ANTLR start "rule__PointExpression__Group_2__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2220:1: rule__PointExpression__Group_2__1 : rule__PointExpression__Group_2__1__Impl ;
    public final void rule__PointExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2224:1: ( rule__PointExpression__Group_2__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2225:2: rule__PointExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PointExpression__Group_2__1__Impl_in_rule__PointExpression__Group_2__14595);
            rule__PointExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointExpression__Group_2__1"


    // $ANTLR start "rule__PointExpression__Group_2__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2231:1: rule__PointExpression__Group_2__1__Impl : ( ( rule__PointExpression__RightAssignment_2_1 ) ) ;
    public final void rule__PointExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2235:1: ( ( ( rule__PointExpression__RightAssignment_2_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2236:1: ( ( rule__PointExpression__RightAssignment_2_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2236:1: ( ( rule__PointExpression__RightAssignment_2_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2237:1: ( rule__PointExpression__RightAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointExpressionAccess().getRightAssignment_2_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2238:1: ( rule__PointExpression__RightAssignment_2_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2238:2: rule__PointExpression__RightAssignment_2_1
            {
            pushFollow(FOLLOW_rule__PointExpression__RightAssignment_2_1_in_rule__PointExpression__Group_2__1__Impl4622);
            rule__PointExpression__RightAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointExpressionAccess().getRightAssignment_2_1()); 
            }

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
    // $ANTLR end "rule__PointExpression__Group_2__1__Impl"


    // $ANTLR start "rule__PowExpression__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2252:1: rule__PowExpression__Group__0 : rule__PowExpression__Group__0__Impl rule__PowExpression__Group__1 ;
    public final void rule__PowExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2256:1: ( rule__PowExpression__Group__0__Impl rule__PowExpression__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2257:2: rule__PowExpression__Group__0__Impl rule__PowExpression__Group__1
            {
            pushFollow(FOLLOW_rule__PowExpression__Group__0__Impl_in_rule__PowExpression__Group__04656);
            rule__PowExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PowExpression__Group__1_in_rule__PowExpression__Group__04659);
            rule__PowExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowExpression__Group__0"


    // $ANTLR start "rule__PowExpression__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2264:1: rule__PowExpression__Group__0__Impl : ( ruleQualifierExpression ) ;
    public final void rule__PowExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2268:1: ( ( ruleQualifierExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2269:1: ( ruleQualifierExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2269:1: ( ruleQualifierExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2270:1: ruleQualifierExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowExpressionAccess().getQualifierExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifierExpression_in_rule__PowExpression__Group__0__Impl4686);
            ruleQualifierExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowExpressionAccess().getQualifierExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__PowExpression__Group__0__Impl"


    // $ANTLR start "rule__PowExpression__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2281:1: rule__PowExpression__Group__1 : rule__PowExpression__Group__1__Impl rule__PowExpression__Group__2 ;
    public final void rule__PowExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2285:1: ( rule__PowExpression__Group__1__Impl rule__PowExpression__Group__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2286:2: rule__PowExpression__Group__1__Impl rule__PowExpression__Group__2
            {
            pushFollow(FOLLOW_rule__PowExpression__Group__1__Impl_in_rule__PowExpression__Group__14715);
            rule__PowExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PowExpression__Group__2_in_rule__PowExpression__Group__14718);
            rule__PowExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowExpression__Group__1"


    // $ANTLR start "rule__PowExpression__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2293:1: rule__PowExpression__Group__1__Impl : ( () ) ;
    public final void rule__PowExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2297:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2298:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2298:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2299:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowExpressionAccess().getPowExpressionLeftAction_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2300:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2302:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowExpressionAccess().getPowExpressionLeftAction_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowExpression__Group__1__Impl"


    // $ANTLR start "rule__PowExpression__Group__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2312:1: rule__PowExpression__Group__2 : rule__PowExpression__Group__2__Impl ;
    public final void rule__PowExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2316:1: ( rule__PowExpression__Group__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2317:2: rule__PowExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PowExpression__Group__2__Impl_in_rule__PowExpression__Group__24776);
            rule__PowExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowExpression__Group__2"


    // $ANTLR start "rule__PowExpression__Group__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2323:1: rule__PowExpression__Group__2__Impl : ( ( rule__PowExpression__Group_2__0 )? ) ;
    public final void rule__PowExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2327:1: ( ( ( rule__PowExpression__Group_2__0 )? ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2328:1: ( ( rule__PowExpression__Group_2__0 )? )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2328:1: ( ( rule__PowExpression__Group_2__0 )? )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2329:1: ( rule__PowExpression__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowExpressionAccess().getGroup_2()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2330:1: ( rule__PowExpression__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==49) ) {
                int LA16_1 = input.LA(2);

                if ( (synpred32_InternalExpression()) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2330:2: rule__PowExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__PowExpression__Group_2__0_in_rule__PowExpression__Group__2__Impl4803);
                    rule__PowExpression__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowExpressionAccess().getGroup_2()); 
            }

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
    // $ANTLR end "rule__PowExpression__Group__2__Impl"


    // $ANTLR start "rule__PowExpression__Group_2__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2346:1: rule__PowExpression__Group_2__0 : rule__PowExpression__Group_2__0__Impl rule__PowExpression__Group_2__1 ;
    public final void rule__PowExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2350:1: ( rule__PowExpression__Group_2__0__Impl rule__PowExpression__Group_2__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2351:2: rule__PowExpression__Group_2__0__Impl rule__PowExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__PowExpression__Group_2__0__Impl_in_rule__PowExpression__Group_2__04840);
            rule__PowExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PowExpression__Group_2__1_in_rule__PowExpression__Group_2__04843);
            rule__PowExpression__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowExpression__Group_2__0"


    // $ANTLR start "rule__PowExpression__Group_2__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2358:1: rule__PowExpression__Group_2__0__Impl : ( ( rule__PowExpression__OpAssignment_2_0 ) ) ;
    public final void rule__PowExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2362:1: ( ( ( rule__PowExpression__OpAssignment_2_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2363:1: ( ( rule__PowExpression__OpAssignment_2_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2363:1: ( ( rule__PowExpression__OpAssignment_2_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2364:1: ( rule__PowExpression__OpAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowExpressionAccess().getOpAssignment_2_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2365:1: ( rule__PowExpression__OpAssignment_2_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2365:2: rule__PowExpression__OpAssignment_2_0
            {
            pushFollow(FOLLOW_rule__PowExpression__OpAssignment_2_0_in_rule__PowExpression__Group_2__0__Impl4870);
            rule__PowExpression__OpAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowExpressionAccess().getOpAssignment_2_0()); 
            }

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
    // $ANTLR end "rule__PowExpression__Group_2__0__Impl"


    // $ANTLR start "rule__PowExpression__Group_2__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2375:1: rule__PowExpression__Group_2__1 : rule__PowExpression__Group_2__1__Impl ;
    public final void rule__PowExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2379:1: ( rule__PowExpression__Group_2__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2380:2: rule__PowExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PowExpression__Group_2__1__Impl_in_rule__PowExpression__Group_2__14900);
            rule__PowExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowExpression__Group_2__1"


    // $ANTLR start "rule__PowExpression__Group_2__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2386:1: rule__PowExpression__Group_2__1__Impl : ( ( rule__PowExpression__RightAssignment_2_1 ) ) ;
    public final void rule__PowExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2390:1: ( ( ( rule__PowExpression__RightAssignment_2_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2391:1: ( ( rule__PowExpression__RightAssignment_2_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2391:1: ( ( rule__PowExpression__RightAssignment_2_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2392:1: ( rule__PowExpression__RightAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowExpressionAccess().getRightAssignment_2_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2393:1: ( rule__PowExpression__RightAssignment_2_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2393:2: rule__PowExpression__RightAssignment_2_1
            {
            pushFollow(FOLLOW_rule__PowExpression__RightAssignment_2_1_in_rule__PowExpression__Group_2__1__Impl4927);
            rule__PowExpression__RightAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowExpressionAccess().getRightAssignment_2_1()); 
            }

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
    // $ANTLR end "rule__PowExpression__Group_2__1__Impl"


    // $ANTLR start "rule__QualifierExpression__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2407:1: rule__QualifierExpression__Group__0 : rule__QualifierExpression__Group__0__Impl rule__QualifierExpression__Group__1 ;
    public final void rule__QualifierExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2411:1: ( rule__QualifierExpression__Group__0__Impl rule__QualifierExpression__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2412:2: rule__QualifierExpression__Group__0__Impl rule__QualifierExpression__Group__1
            {
            pushFollow(FOLLOW_rule__QualifierExpression__Group__0__Impl_in_rule__QualifierExpression__Group__04961);
            rule__QualifierExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifierExpression__Group__1_in_rule__QualifierExpression__Group__04964);
            rule__QualifierExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifierExpression__Group__0"


    // $ANTLR start "rule__QualifierExpression__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2419:1: rule__QualifierExpression__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__QualifierExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2423:1: ( ( rulePrimaryExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2424:1: ( rulePrimaryExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2424:1: ( rulePrimaryExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2425:1: rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifierExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__QualifierExpression__Group__0__Impl4991);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifierExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__QualifierExpression__Group__0__Impl"


    // $ANTLR start "rule__QualifierExpression__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2436:1: rule__QualifierExpression__Group__1 : rule__QualifierExpression__Group__1__Impl rule__QualifierExpression__Group__2 ;
    public final void rule__QualifierExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2440:1: ( rule__QualifierExpression__Group__1__Impl rule__QualifierExpression__Group__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2441:2: rule__QualifierExpression__Group__1__Impl rule__QualifierExpression__Group__2
            {
            pushFollow(FOLLOW_rule__QualifierExpression__Group__1__Impl_in_rule__QualifierExpression__Group__15020);
            rule__QualifierExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifierExpression__Group__2_in_rule__QualifierExpression__Group__15023);
            rule__QualifierExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifierExpression__Group__1"


    // $ANTLR start "rule__QualifierExpression__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2448:1: rule__QualifierExpression__Group__1__Impl : ( () ) ;
    public final void rule__QualifierExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2452:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2453:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2453:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2454:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifierExpressionAccess().getQualifierExpressionLeftAction_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2455:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2457:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifierExpressionAccess().getQualifierExpressionLeftAction_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifierExpression__Group__1__Impl"


    // $ANTLR start "rule__QualifierExpression__Group__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2467:1: rule__QualifierExpression__Group__2 : rule__QualifierExpression__Group__2__Impl ;
    public final void rule__QualifierExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2471:1: ( rule__QualifierExpression__Group__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2472:2: rule__QualifierExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__QualifierExpression__Group__2__Impl_in_rule__QualifierExpression__Group__25081);
            rule__QualifierExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifierExpression__Group__2"


    // $ANTLR start "rule__QualifierExpression__Group__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2478:1: rule__QualifierExpression__Group__2__Impl : ( ( rule__QualifierExpression__Group_2__0 )? ) ;
    public final void rule__QualifierExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2482:1: ( ( ( rule__QualifierExpression__Group_2__0 )? ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2483:1: ( ( rule__QualifierExpression__Group_2__0 )? )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2483:1: ( ( rule__QualifierExpression__Group_2__0 )? )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2484:1: ( rule__QualifierExpression__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifierExpressionAccess().getGroup_2()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2485:1: ( rule__QualifierExpression__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==50) ) {
                int LA17_1 = input.LA(2);

                if ( (synpred33_InternalExpression()) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2485:2: rule__QualifierExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__QualifierExpression__Group_2__0_in_rule__QualifierExpression__Group__2__Impl5108);
                    rule__QualifierExpression__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifierExpressionAccess().getGroup_2()); 
            }

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
    // $ANTLR end "rule__QualifierExpression__Group__2__Impl"


    // $ANTLR start "rule__QualifierExpression__Group_2__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2501:1: rule__QualifierExpression__Group_2__0 : rule__QualifierExpression__Group_2__0__Impl rule__QualifierExpression__Group_2__1 ;
    public final void rule__QualifierExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2505:1: ( rule__QualifierExpression__Group_2__0__Impl rule__QualifierExpression__Group_2__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2506:2: rule__QualifierExpression__Group_2__0__Impl rule__QualifierExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__QualifierExpression__Group_2__0__Impl_in_rule__QualifierExpression__Group_2__05145);
            rule__QualifierExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifierExpression__Group_2__1_in_rule__QualifierExpression__Group_2__05148);
            rule__QualifierExpression__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifierExpression__Group_2__0"


    // $ANTLR start "rule__QualifierExpression__Group_2__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2513:1: rule__QualifierExpression__Group_2__0__Impl : ( ( rule__QualifierExpression__OpAssignment_2_0 ) ) ;
    public final void rule__QualifierExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2517:1: ( ( ( rule__QualifierExpression__OpAssignment_2_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2518:1: ( ( rule__QualifierExpression__OpAssignment_2_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2518:1: ( ( rule__QualifierExpression__OpAssignment_2_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2519:1: ( rule__QualifierExpression__OpAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifierExpressionAccess().getOpAssignment_2_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2520:1: ( rule__QualifierExpression__OpAssignment_2_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2520:2: rule__QualifierExpression__OpAssignment_2_0
            {
            pushFollow(FOLLOW_rule__QualifierExpression__OpAssignment_2_0_in_rule__QualifierExpression__Group_2__0__Impl5175);
            rule__QualifierExpression__OpAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifierExpressionAccess().getOpAssignment_2_0()); 
            }

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
    // $ANTLR end "rule__QualifierExpression__Group_2__0__Impl"


    // $ANTLR start "rule__QualifierExpression__Group_2__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2530:1: rule__QualifierExpression__Group_2__1 : rule__QualifierExpression__Group_2__1__Impl ;
    public final void rule__QualifierExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2534:1: ( rule__QualifierExpression__Group_2__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2535:2: rule__QualifierExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifierExpression__Group_2__1__Impl_in_rule__QualifierExpression__Group_2__15205);
            rule__QualifierExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifierExpression__Group_2__1"


    // $ANTLR start "rule__QualifierExpression__Group_2__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2541:1: rule__QualifierExpression__Group_2__1__Impl : ( ( rule__QualifierExpression__RightAssignment_2_1 ) ) ;
    public final void rule__QualifierExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2545:1: ( ( ( rule__QualifierExpression__RightAssignment_2_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2546:1: ( ( rule__QualifierExpression__RightAssignment_2_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2546:1: ( ( rule__QualifierExpression__RightAssignment_2_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2547:1: ( rule__QualifierExpression__RightAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifierExpressionAccess().getRightAssignment_2_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2548:1: ( rule__QualifierExpression__RightAssignment_2_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2548:2: rule__QualifierExpression__RightAssignment_2_1
            {
            pushFollow(FOLLOW_rule__QualifierExpression__RightAssignment_2_1_in_rule__QualifierExpression__Group_2__1__Impl5232);
            rule__QualifierExpression__RightAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifierExpressionAccess().getRightAssignment_2_1()); 
            }

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
    // $ANTLR end "rule__QualifierExpression__Group_2__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2562:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2566:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2567:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__0__Impl_in_rule__FunctionCall__Group__05266);
            rule__FunctionCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionCall__Group__1_in_rule__FunctionCall__Group__05269);
            rule__FunctionCall__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__0"


    // $ANTLR start "rule__FunctionCall__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2574:1: rule__FunctionCall__Group__0__Impl : ( ( rule__FunctionCall__FunctionAssignment_0 ) ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2578:1: ( ( ( rule__FunctionCall__FunctionAssignment_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2579:1: ( ( rule__FunctionCall__FunctionAssignment_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2579:1: ( ( rule__FunctionCall__FunctionAssignment_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2580:1: ( rule__FunctionCall__FunctionAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFunctionAssignment_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2581:1: ( rule__FunctionCall__FunctionAssignment_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2581:2: rule__FunctionCall__FunctionAssignment_0
            {
            pushFollow(FOLLOW_rule__FunctionCall__FunctionAssignment_0_in_rule__FunctionCall__Group__0__Impl5296);
            rule__FunctionCall__FunctionAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getFunctionAssignment_0()); 
            }

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
    // $ANTLR end "rule__FunctionCall__Group__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2591:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2595:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2596:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__1__Impl_in_rule__FunctionCall__Group__15326);
            rule__FunctionCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionCall__Group__2_in_rule__FunctionCall__Group__15329);
            rule__FunctionCall__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__1"


    // $ANTLR start "rule__FunctionCall__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2603:1: rule__FunctionCall__Group__1__Impl : ( '(' ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2607:1: ( ( '(' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2608:1: ( '(' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2608:1: ( '(' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2609:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,25,FOLLOW_25_in_rule__FunctionCall__Group__1__Impl5357); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1()); 
            }

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
    // $ANTLR end "rule__FunctionCall__Group__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2622:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2626:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2627:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__2__Impl_in_rule__FunctionCall__Group__25388);
            rule__FunctionCall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionCall__Group__3_in_rule__FunctionCall__Group__25391);
            rule__FunctionCall__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__2"


    // $ANTLR start "rule__FunctionCall__Group__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2634:1: rule__FunctionCall__Group__2__Impl : ( ( rule__FunctionCall__ParamsAssignment_2 )? ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2638:1: ( ( ( rule__FunctionCall__ParamsAssignment_2 )? ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2639:1: ( ( rule__FunctionCall__ParamsAssignment_2 )? )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2639:1: ( ( rule__FunctionCall__ParamsAssignment_2 )? )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2640:1: ( rule__FunctionCall__ParamsAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParamsAssignment_2()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2641:1: ( rule__FunctionCall__ParamsAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_DOUBLE)||LA18_0==25||(LA18_0>=28 && LA18_0<=33)||(LA18_0>=36 && LA18_0<=38)||LA18_0==41||LA18_0==45) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2641:2: rule__FunctionCall__ParamsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FunctionCall__ParamsAssignment_2_in_rule__FunctionCall__Group__2__Impl5418);
                    rule__FunctionCall__ParamsAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getParamsAssignment_2()); 
            }

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
    // $ANTLR end "rule__FunctionCall__Group__2__Impl"


    // $ANTLR start "rule__FunctionCall__Group__3"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2651:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2655:1: ( rule__FunctionCall__Group__3__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2656:2: rule__FunctionCall__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__3__Impl_in_rule__FunctionCall__Group__35449);
            rule__FunctionCall__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__3"


    // $ANTLR start "rule__FunctionCall__Group__3__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2662:1: rule__FunctionCall__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2666:1: ( ( ')' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2667:1: ( ')' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2667:1: ( ')' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2668:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,26,FOLLOW_26_in_rule__FunctionCall__Group__3__Impl5477); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3()); 
            }

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
    // $ANTLR end "rule__FunctionCall__Group__3__Impl"


    // $ANTLR start "rule__ExpressionList__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2690:1: rule__ExpressionList__Group__0 : rule__ExpressionList__Group__0__Impl rule__ExpressionList__Group__1 ;
    public final void rule__ExpressionList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2694:1: ( rule__ExpressionList__Group__0__Impl rule__ExpressionList__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2695:2: rule__ExpressionList__Group__0__Impl rule__ExpressionList__Group__1
            {
            pushFollow(FOLLOW_rule__ExpressionList__Group__0__Impl_in_rule__ExpressionList__Group__05517);
            rule__ExpressionList__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExpressionList__Group__1_in_rule__ExpressionList__Group__05520);
            rule__ExpressionList__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionList__Group__0"


    // $ANTLR start "rule__ExpressionList__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2702:1: rule__ExpressionList__Group__0__Impl : ( ( rule__ExpressionList__HeadAssignment_0 ) ) ;
    public final void rule__ExpressionList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2706:1: ( ( ( rule__ExpressionList__HeadAssignment_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2707:1: ( ( rule__ExpressionList__HeadAssignment_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2707:1: ( ( rule__ExpressionList__HeadAssignment_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2708:1: ( rule__ExpressionList__HeadAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionListAccess().getHeadAssignment_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2709:1: ( rule__ExpressionList__HeadAssignment_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2709:2: rule__ExpressionList__HeadAssignment_0
            {
            pushFollow(FOLLOW_rule__ExpressionList__HeadAssignment_0_in_rule__ExpressionList__Group__0__Impl5547);
            rule__ExpressionList__HeadAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionListAccess().getHeadAssignment_0()); 
            }

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
    // $ANTLR end "rule__ExpressionList__Group__0__Impl"


    // $ANTLR start "rule__ExpressionList__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2719:1: rule__ExpressionList__Group__1 : rule__ExpressionList__Group__1__Impl ;
    public final void rule__ExpressionList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2723:1: ( rule__ExpressionList__Group__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2724:2: rule__ExpressionList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExpressionList__Group__1__Impl_in_rule__ExpressionList__Group__15577);
            rule__ExpressionList__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionList__Group__1"


    // $ANTLR start "rule__ExpressionList__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2730:1: rule__ExpressionList__Group__1__Impl : ( ( rule__ExpressionList__TailAssignment_1 )* ) ;
    public final void rule__ExpressionList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2734:1: ( ( ( rule__ExpressionList__TailAssignment_1 )* ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2735:1: ( ( rule__ExpressionList__TailAssignment_1 )* )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2735:1: ( ( rule__ExpressionList__TailAssignment_1 )* )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2736:1: ( rule__ExpressionList__TailAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionListAccess().getTailAssignment_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2737:1: ( rule__ExpressionList__TailAssignment_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==27) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2737:2: rule__ExpressionList__TailAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__ExpressionList__TailAssignment_1_in_rule__ExpressionList__Group__1__Impl5604);
            	    rule__ExpressionList__TailAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionListAccess().getTailAssignment_1()); 
            }

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
    // $ANTLR end "rule__ExpressionList__Group__1__Impl"


    // $ANTLR start "rule__ExpressionRest__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2751:1: rule__ExpressionRest__Group__0 : rule__ExpressionRest__Group__0__Impl rule__ExpressionRest__Group__1 ;
    public final void rule__ExpressionRest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2755:1: ( rule__ExpressionRest__Group__0__Impl rule__ExpressionRest__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2756:2: rule__ExpressionRest__Group__0__Impl rule__ExpressionRest__Group__1
            {
            pushFollow(FOLLOW_rule__ExpressionRest__Group__0__Impl_in_rule__ExpressionRest__Group__05639);
            rule__ExpressionRest__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExpressionRest__Group__1_in_rule__ExpressionRest__Group__05642);
            rule__ExpressionRest__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionRest__Group__0"


    // $ANTLR start "rule__ExpressionRest__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2763:1: rule__ExpressionRest__Group__0__Impl : ( ',' ) ;
    public final void rule__ExpressionRest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2767:1: ( ( ',' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2768:1: ( ',' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2768:1: ( ',' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2769:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRestAccess().getCommaKeyword_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__ExpressionRest__Group__0__Impl5670); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRestAccess().getCommaKeyword_0()); 
            }

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
    // $ANTLR end "rule__ExpressionRest__Group__0__Impl"


    // $ANTLR start "rule__ExpressionRest__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2782:1: rule__ExpressionRest__Group__1 : rule__ExpressionRest__Group__1__Impl ;
    public final void rule__ExpressionRest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2786:1: ( rule__ExpressionRest__Group__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2787:2: rule__ExpressionRest__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExpressionRest__Group__1__Impl_in_rule__ExpressionRest__Group__15701);
            rule__ExpressionRest__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionRest__Group__1"


    // $ANTLR start "rule__ExpressionRest__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2793:1: rule__ExpressionRest__Group__1__Impl : ( ruleExpression ) ;
    public final void rule__ExpressionRest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2797:1: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2798:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2798:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2799:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRestAccess().getExpressionParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ExpressionRest__Group__1__Impl5728);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRestAccess().getExpressionParserRuleCall_1()); 
            }

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
    // $ANTLR end "rule__ExpressionRest__Group__1__Impl"


    // $ANTLR start "rule__ListExpression__Group_0__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2814:1: rule__ListExpression__Group_0__0 : rule__ListExpression__Group_0__0__Impl rule__ListExpression__Group_0__1 ;
    public final void rule__ListExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2818:1: ( rule__ListExpression__Group_0__0__Impl rule__ListExpression__Group_0__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2819:2: rule__ListExpression__Group_0__0__Impl rule__ListExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_0__0__Impl_in_rule__ListExpression__Group_0__05761);
            rule__ListExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_0__1_in_rule__ListExpression__Group_0__05764);
            rule__ListExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_0__0"


    // $ANTLR start "rule__ListExpression__Group_0__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2826:1: rule__ListExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ListExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2830:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2831:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2831:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2832:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getThereIsInAction_0_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2833:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2835:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getThereIsInAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_0__0__Impl"


    // $ANTLR start "rule__ListExpression__Group_0__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2845:1: rule__ListExpression__Group_0__1 : rule__ListExpression__Group_0__1__Impl ;
    public final void rule__ListExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2849:1: ( rule__ListExpression__Group_0__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2850:2: rule__ListExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_0__1__Impl_in_rule__ListExpression__Group_0__15822);
            rule__ListExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_0__1"


    // $ANTLR start "rule__ListExpression__Group_0__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2856:1: rule__ListExpression__Group_0__1__Impl : ( ( rule__ListExpression__Group_0_1__0 ) ) ;
    public final void rule__ListExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2860:1: ( ( ( rule__ListExpression__Group_0_1__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2861:1: ( ( rule__ListExpression__Group_0_1__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2861:1: ( ( rule__ListExpression__Group_0_1__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2862:1: ( rule__ListExpression__Group_0_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getGroup_0_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2863:1: ( rule__ListExpression__Group_0_1__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2863:2: rule__ListExpression__Group_0_1__0
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_0_1__0_in_rule__ListExpression__Group_0__1__Impl5849);
            rule__ListExpression__Group_0_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getGroup_0_1()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_0__1__Impl"


    // $ANTLR start "rule__ListExpression__Group_0_1__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2877:1: rule__ListExpression__Group_0_1__0 : rule__ListExpression__Group_0_1__0__Impl rule__ListExpression__Group_0_1__1 ;
    public final void rule__ListExpression__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2881:1: ( rule__ListExpression__Group_0_1__0__Impl rule__ListExpression__Group_0_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2882:2: rule__ListExpression__Group_0_1__0__Impl rule__ListExpression__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_0_1__0__Impl_in_rule__ListExpression__Group_0_1__05883);
            rule__ListExpression__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_0_1__1_in_rule__ListExpression__Group_0_1__05886);
            rule__ListExpression__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_0_1__0"


    // $ANTLR start "rule__ListExpression__Group_0_1__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2889:1: rule__ListExpression__Group_0_1__0__Impl : ( ( 'THERE_IS_IN' ) ) ;
    public final void rule__ListExpression__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2893:1: ( ( ( 'THERE_IS_IN' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2894:1: ( ( 'THERE_IS_IN' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2894:1: ( ( 'THERE_IS_IN' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2895:1: ( 'THERE_IS_IN' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getTHERE_IS_INKeyword_0_1_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2896:1: ( 'THERE_IS_IN' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2897:2: 'THERE_IS_IN'
            {
            match(input,28,FOLLOW_28_in_rule__ListExpression__Group_0_1__0__Impl5915); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getTHERE_IS_INKeyword_0_1_0()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_0_1__0__Impl"


    // $ANTLR start "rule__ListExpression__Group_0_1__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2908:1: rule__ListExpression__Group_0_1__1 : rule__ListExpression__Group_0_1__1__Impl ;
    public final void rule__ListExpression__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2912:1: ( rule__ListExpression__Group_0_1__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2913:2: rule__ListExpression__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_0_1__1__Impl_in_rule__ListExpression__Group_0_1__15947);
            rule__ListExpression__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_0_1__1"


    // $ANTLR start "rule__ListExpression__Group_0_1__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2919:1: rule__ListExpression__Group_0_1__1__Impl : ( ( rule__ListExpression__ExprAssignment_0_1_1 ) ) ;
    public final void rule__ListExpression__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2923:1: ( ( ( rule__ListExpression__ExprAssignment_0_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2924:1: ( ( rule__ListExpression__ExprAssignment_0_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2924:1: ( ( rule__ListExpression__ExprAssignment_0_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2925:1: ( rule__ListExpression__ExprAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprAssignment_0_1_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2926:1: ( rule__ListExpression__ExprAssignment_0_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2926:2: rule__ListExpression__ExprAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__ListExpression__ExprAssignment_0_1_1_in_rule__ListExpression__Group_0_1__1__Impl5974);
            rule__ListExpression__ExprAssignment_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getExprAssignment_0_1_1()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_0_1__1__Impl"


    // $ANTLR start "rule__ListExpression__Group_1__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2940:1: rule__ListExpression__Group_1__0 : rule__ListExpression__Group_1__0__Impl rule__ListExpression__Group_1__1 ;
    public final void rule__ListExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2944:1: ( rule__ListExpression__Group_1__0__Impl rule__ListExpression__Group_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2945:2: rule__ListExpression__Group_1__0__Impl rule__ListExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_1__0__Impl_in_rule__ListExpression__Group_1__06008);
            rule__ListExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_1__1_in_rule__ListExpression__Group_1__06011);
            rule__ListExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_1__0"


    // $ANTLR start "rule__ListExpression__Group_1__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2952:1: rule__ListExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ListExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2956:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2957:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2957:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2958:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getForallInAction_1_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2959:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2961:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getForallInAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ListExpression__Group_1__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2971:1: rule__ListExpression__Group_1__1 : rule__ListExpression__Group_1__1__Impl ;
    public final void rule__ListExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2975:1: ( rule__ListExpression__Group_1__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2976:2: rule__ListExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_1__1__Impl_in_rule__ListExpression__Group_1__16069);
            rule__ListExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_1__1"


    // $ANTLR start "rule__ListExpression__Group_1__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2982:1: rule__ListExpression__Group_1__1__Impl : ( ( rule__ListExpression__Group_1_1__0 ) ) ;
    public final void rule__ListExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2986:1: ( ( ( rule__ListExpression__Group_1_1__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2987:1: ( ( rule__ListExpression__Group_1_1__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2987:1: ( ( rule__ListExpression__Group_1_1__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2988:1: ( rule__ListExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getGroup_1_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2989:1: ( rule__ListExpression__Group_1_1__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2989:2: rule__ListExpression__Group_1_1__0
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_1_1__0_in_rule__ListExpression__Group_1__1__Impl6096);
            rule__ListExpression__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getGroup_1_1()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ListExpression__Group_1_1__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3003:1: rule__ListExpression__Group_1_1__0 : rule__ListExpression__Group_1_1__0__Impl rule__ListExpression__Group_1_1__1 ;
    public final void rule__ListExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3007:1: ( rule__ListExpression__Group_1_1__0__Impl rule__ListExpression__Group_1_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3008:2: rule__ListExpression__Group_1_1__0__Impl rule__ListExpression__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_1_1__0__Impl_in_rule__ListExpression__Group_1_1__06130);
            rule__ListExpression__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_1_1__1_in_rule__ListExpression__Group_1_1__06133);
            rule__ListExpression__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_1_1__0"


    // $ANTLR start "rule__ListExpression__Group_1_1__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3015:1: rule__ListExpression__Group_1_1__0__Impl : ( ( 'FORALL_IN' ) ) ;
    public final void rule__ListExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3019:1: ( ( ( 'FORALL_IN' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3020:1: ( ( 'FORALL_IN' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3020:1: ( ( 'FORALL_IN' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3021:1: ( 'FORALL_IN' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getFORALL_INKeyword_1_1_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3022:1: ( 'FORALL_IN' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3023:2: 'FORALL_IN'
            {
            match(input,29,FOLLOW_29_in_rule__ListExpression__Group_1_1__0__Impl6162); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getFORALL_INKeyword_1_1_0()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_1_1__0__Impl"


    // $ANTLR start "rule__ListExpression__Group_1_1__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3034:1: rule__ListExpression__Group_1_1__1 : rule__ListExpression__Group_1_1__1__Impl ;
    public final void rule__ListExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3038:1: ( rule__ListExpression__Group_1_1__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3039:2: rule__ListExpression__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_1_1__1__Impl_in_rule__ListExpression__Group_1_1__16194);
            rule__ListExpression__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_1_1__1"


    // $ANTLR start "rule__ListExpression__Group_1_1__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3045:1: rule__ListExpression__Group_1_1__1__Impl : ( ( rule__ListExpression__ExprAssignment_1_1_1 ) ) ;
    public final void rule__ListExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3049:1: ( ( ( rule__ListExpression__ExprAssignment_1_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3050:1: ( ( rule__ListExpression__ExprAssignment_1_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3050:1: ( ( rule__ListExpression__ExprAssignment_1_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3051:1: ( rule__ListExpression__ExprAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprAssignment_1_1_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3052:1: ( rule__ListExpression__ExprAssignment_1_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3052:2: rule__ListExpression__ExprAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__ListExpression__ExprAssignment_1_1_1_in_rule__ListExpression__Group_1_1__1__Impl6221);
            rule__ListExpression__ExprAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getExprAssignment_1_1_1()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_1_1__1__Impl"


    // $ANTLR start "rule__ListExpression__Group_2__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3066:1: rule__ListExpression__Group_2__0 : rule__ListExpression__Group_2__0__Impl rule__ListExpression__Group_2__1 ;
    public final void rule__ListExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3070:1: ( rule__ListExpression__Group_2__0__Impl rule__ListExpression__Group_2__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3071:2: rule__ListExpression__Group_2__0__Impl rule__ListExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_2__0__Impl_in_rule__ListExpression__Group_2__06255);
            rule__ListExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_2__1_in_rule__ListExpression__Group_2__06258);
            rule__ListExpression__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_2__0"


    // $ANTLR start "rule__ListExpression__Group_2__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3078:1: rule__ListExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__ListExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3082:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3083:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3083:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3084:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getFirstInAction_2_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3085:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3087:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getFirstInAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_2__0__Impl"


    // $ANTLR start "rule__ListExpression__Group_2__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3097:1: rule__ListExpression__Group_2__1 : rule__ListExpression__Group_2__1__Impl ;
    public final void rule__ListExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3101:1: ( rule__ListExpression__Group_2__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3102:2: rule__ListExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_2__1__Impl_in_rule__ListExpression__Group_2__16316);
            rule__ListExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_2__1"


    // $ANTLR start "rule__ListExpression__Group_2__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3108:1: rule__ListExpression__Group_2__1__Impl : ( ( rule__ListExpression__Group_2_1__0 ) ) ;
    public final void rule__ListExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3112:1: ( ( ( rule__ListExpression__Group_2_1__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3113:1: ( ( rule__ListExpression__Group_2_1__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3113:1: ( ( rule__ListExpression__Group_2_1__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3114:1: ( rule__ListExpression__Group_2_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getGroup_2_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3115:1: ( rule__ListExpression__Group_2_1__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3115:2: rule__ListExpression__Group_2_1__0
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_2_1__0_in_rule__ListExpression__Group_2__1__Impl6343);
            rule__ListExpression__Group_2_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getGroup_2_1()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_2__1__Impl"


    // $ANTLR start "rule__ListExpression__Group_2_1__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3129:1: rule__ListExpression__Group_2_1__0 : rule__ListExpression__Group_2_1__0__Impl rule__ListExpression__Group_2_1__1 ;
    public final void rule__ListExpression__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3133:1: ( rule__ListExpression__Group_2_1__0__Impl rule__ListExpression__Group_2_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3134:2: rule__ListExpression__Group_2_1__0__Impl rule__ListExpression__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_2_1__0__Impl_in_rule__ListExpression__Group_2_1__06377);
            rule__ListExpression__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_2_1__1_in_rule__ListExpression__Group_2_1__06380);
            rule__ListExpression__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_2_1__0"


    // $ANTLR start "rule__ListExpression__Group_2_1__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3141:1: rule__ListExpression__Group_2_1__0__Impl : ( ( 'FIRST_IN' ) ) ;
    public final void rule__ListExpression__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3145:1: ( ( ( 'FIRST_IN' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3146:1: ( ( 'FIRST_IN' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3146:1: ( ( 'FIRST_IN' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3147:1: ( 'FIRST_IN' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getFIRST_INKeyword_2_1_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3148:1: ( 'FIRST_IN' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3149:2: 'FIRST_IN'
            {
            match(input,30,FOLLOW_30_in_rule__ListExpression__Group_2_1__0__Impl6409); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getFIRST_INKeyword_2_1_0()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_2_1__0__Impl"


    // $ANTLR start "rule__ListExpression__Group_2_1__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3160:1: rule__ListExpression__Group_2_1__1 : rule__ListExpression__Group_2_1__1__Impl ;
    public final void rule__ListExpression__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3164:1: ( rule__ListExpression__Group_2_1__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3165:2: rule__ListExpression__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_2_1__1__Impl_in_rule__ListExpression__Group_2_1__16441);
            rule__ListExpression__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_2_1__1"


    // $ANTLR start "rule__ListExpression__Group_2_1__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3171:1: rule__ListExpression__Group_2_1__1__Impl : ( ( rule__ListExpression__ExprAssignment_2_1_1 ) ) ;
    public final void rule__ListExpression__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3175:1: ( ( ( rule__ListExpression__ExprAssignment_2_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3176:1: ( ( rule__ListExpression__ExprAssignment_2_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3176:1: ( ( rule__ListExpression__ExprAssignment_2_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3177:1: ( rule__ListExpression__ExprAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprAssignment_2_1_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3178:1: ( rule__ListExpression__ExprAssignment_2_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3178:2: rule__ListExpression__ExprAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__ListExpression__ExprAssignment_2_1_1_in_rule__ListExpression__Group_2_1__1__Impl6468);
            rule__ListExpression__ExprAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getExprAssignment_2_1_1()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_2_1__1__Impl"


    // $ANTLR start "rule__ListExpression__Group_3__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3192:1: rule__ListExpression__Group_3__0 : rule__ListExpression__Group_3__0__Impl rule__ListExpression__Group_3__1 ;
    public final void rule__ListExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3196:1: ( rule__ListExpression__Group_3__0__Impl rule__ListExpression__Group_3__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3197:2: rule__ListExpression__Group_3__0__Impl rule__ListExpression__Group_3__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_3__0__Impl_in_rule__ListExpression__Group_3__06502);
            rule__ListExpression__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_3__1_in_rule__ListExpression__Group_3__06505);
            rule__ListExpression__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_3__0"


    // $ANTLR start "rule__ListExpression__Group_3__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3204:1: rule__ListExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__ListExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3208:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3209:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3209:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3210:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getLastInAction_3_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3211:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3213:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getLastInAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_3__0__Impl"


    // $ANTLR start "rule__ListExpression__Group_3__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3223:1: rule__ListExpression__Group_3__1 : rule__ListExpression__Group_3__1__Impl ;
    public final void rule__ListExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3227:1: ( rule__ListExpression__Group_3__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3228:2: rule__ListExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_3__1__Impl_in_rule__ListExpression__Group_3__16563);
            rule__ListExpression__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_3__1"


    // $ANTLR start "rule__ListExpression__Group_3__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3234:1: rule__ListExpression__Group_3__1__Impl : ( ( rule__ListExpression__Group_3_1__0 ) ) ;
    public final void rule__ListExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3238:1: ( ( ( rule__ListExpression__Group_3_1__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3239:1: ( ( rule__ListExpression__Group_3_1__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3239:1: ( ( rule__ListExpression__Group_3_1__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3240:1: ( rule__ListExpression__Group_3_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getGroup_3_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3241:1: ( rule__ListExpression__Group_3_1__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3241:2: rule__ListExpression__Group_3_1__0
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_3_1__0_in_rule__ListExpression__Group_3__1__Impl6590);
            rule__ListExpression__Group_3_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getGroup_3_1()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_3__1__Impl"


    // $ANTLR start "rule__ListExpression__Group_3_1__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3255:1: rule__ListExpression__Group_3_1__0 : rule__ListExpression__Group_3_1__0__Impl rule__ListExpression__Group_3_1__1 ;
    public final void rule__ListExpression__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3259:1: ( rule__ListExpression__Group_3_1__0__Impl rule__ListExpression__Group_3_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3260:2: rule__ListExpression__Group_3_1__0__Impl rule__ListExpression__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_3_1__0__Impl_in_rule__ListExpression__Group_3_1__06624);
            rule__ListExpression__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_3_1__1_in_rule__ListExpression__Group_3_1__06627);
            rule__ListExpression__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_3_1__0"


    // $ANTLR start "rule__ListExpression__Group_3_1__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3267:1: rule__ListExpression__Group_3_1__0__Impl : ( ( 'LAST_IN' ) ) ;
    public final void rule__ListExpression__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3271:1: ( ( ( 'LAST_IN' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3272:1: ( ( 'LAST_IN' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3272:1: ( ( 'LAST_IN' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3273:1: ( 'LAST_IN' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getLAST_INKeyword_3_1_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3274:1: ( 'LAST_IN' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3275:2: 'LAST_IN'
            {
            match(input,31,FOLLOW_31_in_rule__ListExpression__Group_3_1__0__Impl6656); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getLAST_INKeyword_3_1_0()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_3_1__0__Impl"


    // $ANTLR start "rule__ListExpression__Group_3_1__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3286:1: rule__ListExpression__Group_3_1__1 : rule__ListExpression__Group_3_1__1__Impl ;
    public final void rule__ListExpression__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3290:1: ( rule__ListExpression__Group_3_1__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3291:2: rule__ListExpression__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_3_1__1__Impl_in_rule__ListExpression__Group_3_1__16688);
            rule__ListExpression__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_3_1__1"


    // $ANTLR start "rule__ListExpression__Group_3_1__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3297:1: rule__ListExpression__Group_3_1__1__Impl : ( ( rule__ListExpression__ExprAssignment_3_1_1 ) ) ;
    public final void rule__ListExpression__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3301:1: ( ( ( rule__ListExpression__ExprAssignment_3_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3302:1: ( ( rule__ListExpression__ExprAssignment_3_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3302:1: ( ( rule__ListExpression__ExprAssignment_3_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3303:1: ( rule__ListExpression__ExprAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprAssignment_3_1_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3304:1: ( rule__ListExpression__ExprAssignment_3_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3304:2: rule__ListExpression__ExprAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__ListExpression__ExprAssignment_3_1_1_in_rule__ListExpression__Group_3_1__1__Impl6715);
            rule__ListExpression__ExprAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getExprAssignment_3_1_1()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_3_1__1__Impl"


    // $ANTLR start "rule__ListExpression__Group_4__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3318:1: rule__ListExpression__Group_4__0 : rule__ListExpression__Group_4__0__Impl rule__ListExpression__Group_4__1 ;
    public final void rule__ListExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3322:1: ( rule__ListExpression__Group_4__0__Impl rule__ListExpression__Group_4__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3323:2: rule__ListExpression__Group_4__0__Impl rule__ListExpression__Group_4__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_4__0__Impl_in_rule__ListExpression__Group_4__06749);
            rule__ListExpression__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_4__1_in_rule__ListExpression__Group_4__06752);
            rule__ListExpression__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_4__0"


    // $ANTLR start "rule__ListExpression__Group_4__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3330:1: rule__ListExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__ListExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3334:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3335:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3335:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3336:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getCountAction_4_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3337:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3339:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getCountAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_4__0__Impl"


    // $ANTLR start "rule__ListExpression__Group_4__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3349:1: rule__ListExpression__Group_4__1 : rule__ListExpression__Group_4__1__Impl ;
    public final void rule__ListExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3353:1: ( rule__ListExpression__Group_4__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3354:2: rule__ListExpression__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_4__1__Impl_in_rule__ListExpression__Group_4__16810);
            rule__ListExpression__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_4__1"


    // $ANTLR start "rule__ListExpression__Group_4__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3360:1: rule__ListExpression__Group_4__1__Impl : ( ( rule__ListExpression__Group_4_1__0 ) ) ;
    public final void rule__ListExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3364:1: ( ( ( rule__ListExpression__Group_4_1__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3365:1: ( ( rule__ListExpression__Group_4_1__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3365:1: ( ( rule__ListExpression__Group_4_1__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3366:1: ( rule__ListExpression__Group_4_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getGroup_4_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3367:1: ( rule__ListExpression__Group_4_1__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3367:2: rule__ListExpression__Group_4_1__0
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_4_1__0_in_rule__ListExpression__Group_4__1__Impl6837);
            rule__ListExpression__Group_4_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getGroup_4_1()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_4__1__Impl"


    // $ANTLR start "rule__ListExpression__Group_4_1__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3381:1: rule__ListExpression__Group_4_1__0 : rule__ListExpression__Group_4_1__0__Impl rule__ListExpression__Group_4_1__1 ;
    public final void rule__ListExpression__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3385:1: ( rule__ListExpression__Group_4_1__0__Impl rule__ListExpression__Group_4_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3386:2: rule__ListExpression__Group_4_1__0__Impl rule__ListExpression__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_4_1__0__Impl_in_rule__ListExpression__Group_4_1__06871);
            rule__ListExpression__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_4_1__1_in_rule__ListExpression__Group_4_1__06874);
            rule__ListExpression__Group_4_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_4_1__0"


    // $ANTLR start "rule__ListExpression__Group_4_1__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3393:1: rule__ListExpression__Group_4_1__0__Impl : ( ( 'COUNT' ) ) ;
    public final void rule__ListExpression__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3397:1: ( ( ( 'COUNT' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3398:1: ( ( 'COUNT' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3398:1: ( ( 'COUNT' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3399:1: ( 'COUNT' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getCOUNTKeyword_4_1_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3400:1: ( 'COUNT' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3401:2: 'COUNT'
            {
            match(input,32,FOLLOW_32_in_rule__ListExpression__Group_4_1__0__Impl6903); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getCOUNTKeyword_4_1_0()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_4_1__0__Impl"


    // $ANTLR start "rule__ListExpression__Group_4_1__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3412:1: rule__ListExpression__Group_4_1__1 : rule__ListExpression__Group_4_1__1__Impl ;
    public final void rule__ListExpression__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3416:1: ( rule__ListExpression__Group_4_1__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3417:2: rule__ListExpression__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_4_1__1__Impl_in_rule__ListExpression__Group_4_1__16935);
            rule__ListExpression__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_4_1__1"


    // $ANTLR start "rule__ListExpression__Group_4_1__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3423:1: rule__ListExpression__Group_4_1__1__Impl : ( ( rule__ListExpression__ExprAssignment_4_1_1 ) ) ;
    public final void rule__ListExpression__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3427:1: ( ( ( rule__ListExpression__ExprAssignment_4_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3428:1: ( ( rule__ListExpression__ExprAssignment_4_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3428:1: ( ( rule__ListExpression__ExprAssignment_4_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3429:1: ( rule__ListExpression__ExprAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprAssignment_4_1_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3430:1: ( rule__ListExpression__ExprAssignment_4_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3430:2: rule__ListExpression__ExprAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__ListExpression__ExprAssignment_4_1_1_in_rule__ListExpression__Group_4_1__1__Impl6962);
            rule__ListExpression__ExprAssignment_4_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getExprAssignment_4_1_1()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_4_1__1__Impl"


    // $ANTLR start "rule__ListExpression__Group_5__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3444:1: rule__ListExpression__Group_5__0 : rule__ListExpression__Group_5__0__Impl rule__ListExpression__Group_5__1 ;
    public final void rule__ListExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3448:1: ( rule__ListExpression__Group_5__0__Impl rule__ListExpression__Group_5__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3449:2: rule__ListExpression__Group_5__0__Impl rule__ListExpression__Group_5__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_5__0__Impl_in_rule__ListExpression__Group_5__06996);
            rule__ListExpression__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_5__1_in_rule__ListExpression__Group_5__06999);
            rule__ListExpression__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_5__0"


    // $ANTLR start "rule__ListExpression__Group_5__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3456:1: rule__ListExpression__Group_5__0__Impl : ( () ) ;
    public final void rule__ListExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3460:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3461:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3461:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3462:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getReduceAction_5_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3463:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3465:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getReduceAction_5_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_5__0__Impl"


    // $ANTLR start "rule__ListExpression__Group_5__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3475:1: rule__ListExpression__Group_5__1 : rule__ListExpression__Group_5__1__Impl ;
    public final void rule__ListExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3479:1: ( rule__ListExpression__Group_5__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3480:2: rule__ListExpression__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_5__1__Impl_in_rule__ListExpression__Group_5__17057);
            rule__ListExpression__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_5__1"


    // $ANTLR start "rule__ListExpression__Group_5__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3486:1: rule__ListExpression__Group_5__1__Impl : ( ( rule__ListExpression__Group_5_1__0 ) ) ;
    public final void rule__ListExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3490:1: ( ( ( rule__ListExpression__Group_5_1__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3491:1: ( ( rule__ListExpression__Group_5_1__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3491:1: ( ( rule__ListExpression__Group_5_1__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3492:1: ( rule__ListExpression__Group_5_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getGroup_5_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3493:1: ( rule__ListExpression__Group_5_1__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3493:2: rule__ListExpression__Group_5_1__0
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_5_1__0_in_rule__ListExpression__Group_5__1__Impl7084);
            rule__ListExpression__Group_5_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getGroup_5_1()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_5__1__Impl"


    // $ANTLR start "rule__ListExpression__Group_5_1__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3507:1: rule__ListExpression__Group_5_1__0 : rule__ListExpression__Group_5_1__0__Impl rule__ListExpression__Group_5_1__1 ;
    public final void rule__ListExpression__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3511:1: ( rule__ListExpression__Group_5_1__0__Impl rule__ListExpression__Group_5_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3512:2: rule__ListExpression__Group_5_1__0__Impl rule__ListExpression__Group_5_1__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_5_1__0__Impl_in_rule__ListExpression__Group_5_1__07118);
            rule__ListExpression__Group_5_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_5_1__1_in_rule__ListExpression__Group_5_1__07121);
            rule__ListExpression__Group_5_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_5_1__0"


    // $ANTLR start "rule__ListExpression__Group_5_1__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3519:1: rule__ListExpression__Group_5_1__0__Impl : ( ( 'REDUCE' ) ) ;
    public final void rule__ListExpression__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3523:1: ( ( ( 'REDUCE' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3524:1: ( ( 'REDUCE' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3524:1: ( ( 'REDUCE' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3525:1: ( 'REDUCE' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getREDUCEKeyword_5_1_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3526:1: ( 'REDUCE' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3527:2: 'REDUCE'
            {
            match(input,33,FOLLOW_33_in_rule__ListExpression__Group_5_1__0__Impl7150); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getREDUCEKeyword_5_1_0()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_5_1__0__Impl"


    // $ANTLR start "rule__ListExpression__Group_5_1__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3538:1: rule__ListExpression__Group_5_1__1 : rule__ListExpression__Group_5_1__1__Impl rule__ListExpression__Group_5_1__2 ;
    public final void rule__ListExpression__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3542:1: ( rule__ListExpression__Group_5_1__1__Impl rule__ListExpression__Group_5_1__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3543:2: rule__ListExpression__Group_5_1__1__Impl rule__ListExpression__Group_5_1__2
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_5_1__1__Impl_in_rule__ListExpression__Group_5_1__17182);
            rule__ListExpression__Group_5_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_5_1__2_in_rule__ListExpression__Group_5_1__17185);
            rule__ListExpression__Group_5_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_5_1__1"


    // $ANTLR start "rule__ListExpression__Group_5_1__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3550:1: rule__ListExpression__Group_5_1__1__Impl : ( ( rule__ListExpression__ExprAssignment_5_1_1 ) ) ;
    public final void rule__ListExpression__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3554:1: ( ( ( rule__ListExpression__ExprAssignment_5_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3555:1: ( ( rule__ListExpression__ExprAssignment_5_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3555:1: ( ( rule__ListExpression__ExprAssignment_5_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3556:1: ( rule__ListExpression__ExprAssignment_5_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprAssignment_5_1_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3557:1: ( rule__ListExpression__ExprAssignment_5_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3557:2: rule__ListExpression__ExprAssignment_5_1_1
            {
            pushFollow(FOLLOW_rule__ListExpression__ExprAssignment_5_1_1_in_rule__ListExpression__Group_5_1__1__Impl7212);
            rule__ListExpression__ExprAssignment_5_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getExprAssignment_5_1_1()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_5_1__1__Impl"


    // $ANTLR start "rule__ListExpression__Group_5_1__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3567:1: rule__ListExpression__Group_5_1__2 : rule__ListExpression__Group_5_1__2__Impl rule__ListExpression__Group_5_1__3 ;
    public final void rule__ListExpression__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3571:1: ( rule__ListExpression__Group_5_1__2__Impl rule__ListExpression__Group_5_1__3 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3572:2: rule__ListExpression__Group_5_1__2__Impl rule__ListExpression__Group_5_1__3
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_5_1__2__Impl_in_rule__ListExpression__Group_5_1__27242);
            rule__ListExpression__Group_5_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_5_1__3_in_rule__ListExpression__Group_5_1__27245);
            rule__ListExpression__Group_5_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_5_1__2"


    // $ANTLR start "rule__ListExpression__Group_5_1__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3579:1: rule__ListExpression__Group_5_1__2__Impl : ( 'USING' ) ;
    public final void rule__ListExpression__Group_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3583:1: ( ( 'USING' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3584:1: ( 'USING' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3584:1: ( 'USING' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3585:1: 'USING'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getUSINGKeyword_5_1_2()); 
            }
            match(input,34,FOLLOW_34_in_rule__ListExpression__Group_5_1__2__Impl7273); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getUSINGKeyword_5_1_2()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_5_1__2__Impl"


    // $ANTLR start "rule__ListExpression__Group_5_1__3"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3598:1: rule__ListExpression__Group_5_1__3 : rule__ListExpression__Group_5_1__3__Impl rule__ListExpression__Group_5_1__4 ;
    public final void rule__ListExpression__Group_5_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3602:1: ( rule__ListExpression__Group_5_1__3__Impl rule__ListExpression__Group_5_1__4 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3603:2: rule__ListExpression__Group_5_1__3__Impl rule__ListExpression__Group_5_1__4
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_5_1__3__Impl_in_rule__ListExpression__Group_5_1__37304);
            rule__ListExpression__Group_5_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_5_1__4_in_rule__ListExpression__Group_5_1__37307);
            rule__ListExpression__Group_5_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_5_1__3"


    // $ANTLR start "rule__ListExpression__Group_5_1__3__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3610:1: rule__ListExpression__Group_5_1__3__Impl : ( ( rule__ListExpression__UsingExprAssignment_5_1_3 ) ) ;
    public final void rule__ListExpression__Group_5_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3614:1: ( ( ( rule__ListExpression__UsingExprAssignment_5_1_3 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3615:1: ( ( rule__ListExpression__UsingExprAssignment_5_1_3 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3615:1: ( ( rule__ListExpression__UsingExprAssignment_5_1_3 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3616:1: ( rule__ListExpression__UsingExprAssignment_5_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getUsingExprAssignment_5_1_3()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3617:1: ( rule__ListExpression__UsingExprAssignment_5_1_3 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3617:2: rule__ListExpression__UsingExprAssignment_5_1_3
            {
            pushFollow(FOLLOW_rule__ListExpression__UsingExprAssignment_5_1_3_in_rule__ListExpression__Group_5_1__3__Impl7334);
            rule__ListExpression__UsingExprAssignment_5_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getUsingExprAssignment_5_1_3()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_5_1__3__Impl"


    // $ANTLR start "rule__ListExpression__Group_5_1__4"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3627:1: rule__ListExpression__Group_5_1__4 : rule__ListExpression__Group_5_1__4__Impl rule__ListExpression__Group_5_1__5 ;
    public final void rule__ListExpression__Group_5_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3631:1: ( rule__ListExpression__Group_5_1__4__Impl rule__ListExpression__Group_5_1__5 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3632:2: rule__ListExpression__Group_5_1__4__Impl rule__ListExpression__Group_5_1__5
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_5_1__4__Impl_in_rule__ListExpression__Group_5_1__47364);
            rule__ListExpression__Group_5_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_5_1__5_in_rule__ListExpression__Group_5_1__47367);
            rule__ListExpression__Group_5_1__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_5_1__4"


    // $ANTLR start "rule__ListExpression__Group_5_1__4__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3639:1: rule__ListExpression__Group_5_1__4__Impl : ( 'INITIAL_VALUE' ) ;
    public final void rule__ListExpression__Group_5_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3643:1: ( ( 'INITIAL_VALUE' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3644:1: ( 'INITIAL_VALUE' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3644:1: ( 'INITIAL_VALUE' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3645:1: 'INITIAL_VALUE'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getINITIAL_VALUEKeyword_5_1_4()); 
            }
            match(input,35,FOLLOW_35_in_rule__ListExpression__Group_5_1__4__Impl7395); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getINITIAL_VALUEKeyword_5_1_4()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_5_1__4__Impl"


    // $ANTLR start "rule__ListExpression__Group_5_1__5"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3658:1: rule__ListExpression__Group_5_1__5 : rule__ListExpression__Group_5_1__5__Impl ;
    public final void rule__ListExpression__Group_5_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3662:1: ( rule__ListExpression__Group_5_1__5__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3663:2: rule__ListExpression__Group_5_1__5__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_5_1__5__Impl_in_rule__ListExpression__Group_5_1__57426);
            rule__ListExpression__Group_5_1__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_5_1__5"


    // $ANTLR start "rule__ListExpression__Group_5_1__5__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3669:1: rule__ListExpression__Group_5_1__5__Impl : ( ( rule__ListExpression__InitValueAssignment_5_1_5 ) ) ;
    public final void rule__ListExpression__Group_5_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3673:1: ( ( ( rule__ListExpression__InitValueAssignment_5_1_5 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3674:1: ( ( rule__ListExpression__InitValueAssignment_5_1_5 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3674:1: ( ( rule__ListExpression__InitValueAssignment_5_1_5 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3675:1: ( rule__ListExpression__InitValueAssignment_5_1_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getInitValueAssignment_5_1_5()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3676:1: ( rule__ListExpression__InitValueAssignment_5_1_5 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3676:2: rule__ListExpression__InitValueAssignment_5_1_5
            {
            pushFollow(FOLLOW_rule__ListExpression__InitValueAssignment_5_1_5_in_rule__ListExpression__Group_5_1__5__Impl7453);
            rule__ListExpression__InitValueAssignment_5_1_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getInitValueAssignment_5_1_5()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_5_1__5__Impl"


    // $ANTLR start "rule__ListExpression__Group_6__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3698:1: rule__ListExpression__Group_6__0 : rule__ListExpression__Group_6__0__Impl rule__ListExpression__Group_6__1 ;
    public final void rule__ListExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3702:1: ( rule__ListExpression__Group_6__0__Impl rule__ListExpression__Group_6__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3703:2: rule__ListExpression__Group_6__0__Impl rule__ListExpression__Group_6__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_6__0__Impl_in_rule__ListExpression__Group_6__07495);
            rule__ListExpression__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_6__1_in_rule__ListExpression__Group_6__07498);
            rule__ListExpression__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_6__0"


    // $ANTLR start "rule__ListExpression__Group_6__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3710:1: rule__ListExpression__Group_6__0__Impl : ( () ) ;
    public final void rule__ListExpression__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3714:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3715:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3715:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3716:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getSumAction_6_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3717:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3719:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getSumAction_6_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_6__0__Impl"


    // $ANTLR start "rule__ListExpression__Group_6__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3729:1: rule__ListExpression__Group_6__1 : rule__ListExpression__Group_6__1__Impl ;
    public final void rule__ListExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3733:1: ( rule__ListExpression__Group_6__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3734:2: rule__ListExpression__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_6__1__Impl_in_rule__ListExpression__Group_6__17556);
            rule__ListExpression__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_6__1"


    // $ANTLR start "rule__ListExpression__Group_6__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3740:1: rule__ListExpression__Group_6__1__Impl : ( ( rule__ListExpression__Group_6_1__0 ) ) ;
    public final void rule__ListExpression__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3744:1: ( ( ( rule__ListExpression__Group_6_1__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3745:1: ( ( rule__ListExpression__Group_6_1__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3745:1: ( ( rule__ListExpression__Group_6_1__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3746:1: ( rule__ListExpression__Group_6_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getGroup_6_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3747:1: ( rule__ListExpression__Group_6_1__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3747:2: rule__ListExpression__Group_6_1__0
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_6_1__0_in_rule__ListExpression__Group_6__1__Impl7583);
            rule__ListExpression__Group_6_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getGroup_6_1()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_6__1__Impl"


    // $ANTLR start "rule__ListExpression__Group_6_1__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3761:1: rule__ListExpression__Group_6_1__0 : rule__ListExpression__Group_6_1__0__Impl rule__ListExpression__Group_6_1__1 ;
    public final void rule__ListExpression__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3765:1: ( rule__ListExpression__Group_6_1__0__Impl rule__ListExpression__Group_6_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3766:2: rule__ListExpression__Group_6_1__0__Impl rule__ListExpression__Group_6_1__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_6_1__0__Impl_in_rule__ListExpression__Group_6_1__07617);
            rule__ListExpression__Group_6_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_6_1__1_in_rule__ListExpression__Group_6_1__07620);
            rule__ListExpression__Group_6_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_6_1__0"


    // $ANTLR start "rule__ListExpression__Group_6_1__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3773:1: rule__ListExpression__Group_6_1__0__Impl : ( ( 'SUM' ) ) ;
    public final void rule__ListExpression__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3777:1: ( ( ( 'SUM' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3778:1: ( ( 'SUM' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3778:1: ( ( 'SUM' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3779:1: ( 'SUM' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getSUMKeyword_6_1_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3780:1: ( 'SUM' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3781:2: 'SUM'
            {
            match(input,36,FOLLOW_36_in_rule__ListExpression__Group_6_1__0__Impl7649); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getSUMKeyword_6_1_0()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_6_1__0__Impl"


    // $ANTLR start "rule__ListExpression__Group_6_1__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3792:1: rule__ListExpression__Group_6_1__1 : rule__ListExpression__Group_6_1__1__Impl rule__ListExpression__Group_6_1__2 ;
    public final void rule__ListExpression__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3796:1: ( rule__ListExpression__Group_6_1__1__Impl rule__ListExpression__Group_6_1__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3797:2: rule__ListExpression__Group_6_1__1__Impl rule__ListExpression__Group_6_1__2
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_6_1__1__Impl_in_rule__ListExpression__Group_6_1__17681);
            rule__ListExpression__Group_6_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_6_1__2_in_rule__ListExpression__Group_6_1__17684);
            rule__ListExpression__Group_6_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_6_1__1"


    // $ANTLR start "rule__ListExpression__Group_6_1__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3804:1: rule__ListExpression__Group_6_1__1__Impl : ( ( rule__ListExpression__ExprAssignment_6_1_1 ) ) ;
    public final void rule__ListExpression__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3808:1: ( ( ( rule__ListExpression__ExprAssignment_6_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3809:1: ( ( rule__ListExpression__ExprAssignment_6_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3809:1: ( ( rule__ListExpression__ExprAssignment_6_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3810:1: ( rule__ListExpression__ExprAssignment_6_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprAssignment_6_1_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3811:1: ( rule__ListExpression__ExprAssignment_6_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3811:2: rule__ListExpression__ExprAssignment_6_1_1
            {
            pushFollow(FOLLOW_rule__ListExpression__ExprAssignment_6_1_1_in_rule__ListExpression__Group_6_1__1__Impl7711);
            rule__ListExpression__ExprAssignment_6_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getExprAssignment_6_1_1()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_6_1__1__Impl"


    // $ANTLR start "rule__ListExpression__Group_6_1__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3821:1: rule__ListExpression__Group_6_1__2 : rule__ListExpression__Group_6_1__2__Impl rule__ListExpression__Group_6_1__3 ;
    public final void rule__ListExpression__Group_6_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3825:1: ( rule__ListExpression__Group_6_1__2__Impl rule__ListExpression__Group_6_1__3 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3826:2: rule__ListExpression__Group_6_1__2__Impl rule__ListExpression__Group_6_1__3
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_6_1__2__Impl_in_rule__ListExpression__Group_6_1__27741);
            rule__ListExpression__Group_6_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_6_1__3_in_rule__ListExpression__Group_6_1__27744);
            rule__ListExpression__Group_6_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_6_1__2"


    // $ANTLR start "rule__ListExpression__Group_6_1__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3833:1: rule__ListExpression__Group_6_1__2__Impl : ( 'USING' ) ;
    public final void rule__ListExpression__Group_6_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3837:1: ( ( 'USING' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3838:1: ( 'USING' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3838:1: ( 'USING' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3839:1: 'USING'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getUSINGKeyword_6_1_2()); 
            }
            match(input,34,FOLLOW_34_in_rule__ListExpression__Group_6_1__2__Impl7772); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getUSINGKeyword_6_1_2()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_6_1__2__Impl"


    // $ANTLR start "rule__ListExpression__Group_6_1__3"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3852:1: rule__ListExpression__Group_6_1__3 : rule__ListExpression__Group_6_1__3__Impl ;
    public final void rule__ListExpression__Group_6_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3856:1: ( rule__ListExpression__Group_6_1__3__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3857:2: rule__ListExpression__Group_6_1__3__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_6_1__3__Impl_in_rule__ListExpression__Group_6_1__37803);
            rule__ListExpression__Group_6_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_6_1__3"


    // $ANTLR start "rule__ListExpression__Group_6_1__3__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3863:1: rule__ListExpression__Group_6_1__3__Impl : ( ( rule__ListExpression__UsingExprAssignment_6_1_3 ) ) ;
    public final void rule__ListExpression__Group_6_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3867:1: ( ( ( rule__ListExpression__UsingExprAssignment_6_1_3 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3868:1: ( ( rule__ListExpression__UsingExprAssignment_6_1_3 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3868:1: ( ( rule__ListExpression__UsingExprAssignment_6_1_3 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3869:1: ( rule__ListExpression__UsingExprAssignment_6_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getUsingExprAssignment_6_1_3()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3870:1: ( rule__ListExpression__UsingExprAssignment_6_1_3 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3870:2: rule__ListExpression__UsingExprAssignment_6_1_3
            {
            pushFollow(FOLLOW_rule__ListExpression__UsingExprAssignment_6_1_3_in_rule__ListExpression__Group_6_1__3__Impl7830);
            rule__ListExpression__UsingExprAssignment_6_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getUsingExprAssignment_6_1_3()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_6_1__3__Impl"


    // $ANTLR start "rule__ListExpression__Group_7__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3888:1: rule__ListExpression__Group_7__0 : rule__ListExpression__Group_7__0__Impl rule__ListExpression__Group_7__1 ;
    public final void rule__ListExpression__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3892:1: ( rule__ListExpression__Group_7__0__Impl rule__ListExpression__Group_7__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3893:2: rule__ListExpression__Group_7__0__Impl rule__ListExpression__Group_7__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_7__0__Impl_in_rule__ListExpression__Group_7__07868);
            rule__ListExpression__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_7__1_in_rule__ListExpression__Group_7__07871);
            rule__ListExpression__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_7__0"


    // $ANTLR start "rule__ListExpression__Group_7__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3900:1: rule__ListExpression__Group_7__0__Impl : ( () ) ;
    public final void rule__ListExpression__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3904:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3905:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3905:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3906:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getMapAction_7_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3907:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3909:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getMapAction_7_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_7__0__Impl"


    // $ANTLR start "rule__ListExpression__Group_7__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3919:1: rule__ListExpression__Group_7__1 : rule__ListExpression__Group_7__1__Impl ;
    public final void rule__ListExpression__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3923:1: ( rule__ListExpression__Group_7__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3924:2: rule__ListExpression__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_7__1__Impl_in_rule__ListExpression__Group_7__17929);
            rule__ListExpression__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_7__1"


    // $ANTLR start "rule__ListExpression__Group_7__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3930:1: rule__ListExpression__Group_7__1__Impl : ( ( rule__ListExpression__Group_7_1__0 ) ) ;
    public final void rule__ListExpression__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3934:1: ( ( ( rule__ListExpression__Group_7_1__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3935:1: ( ( rule__ListExpression__Group_7_1__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3935:1: ( ( rule__ListExpression__Group_7_1__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3936:1: ( rule__ListExpression__Group_7_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getGroup_7_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3937:1: ( rule__ListExpression__Group_7_1__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3937:2: rule__ListExpression__Group_7_1__0
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_7_1__0_in_rule__ListExpression__Group_7__1__Impl7956);
            rule__ListExpression__Group_7_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getGroup_7_1()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_7__1__Impl"


    // $ANTLR start "rule__ListExpression__Group_7_1__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3951:1: rule__ListExpression__Group_7_1__0 : rule__ListExpression__Group_7_1__0__Impl rule__ListExpression__Group_7_1__1 ;
    public final void rule__ListExpression__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3955:1: ( rule__ListExpression__Group_7_1__0__Impl rule__ListExpression__Group_7_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3956:2: rule__ListExpression__Group_7_1__0__Impl rule__ListExpression__Group_7_1__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_7_1__0__Impl_in_rule__ListExpression__Group_7_1__07990);
            rule__ListExpression__Group_7_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_7_1__1_in_rule__ListExpression__Group_7_1__07993);
            rule__ListExpression__Group_7_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_7_1__0"


    // $ANTLR start "rule__ListExpression__Group_7_1__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3963:1: rule__ListExpression__Group_7_1__0__Impl : ( ( 'MAP' ) ) ;
    public final void rule__ListExpression__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3967:1: ( ( ( 'MAP' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3968:1: ( ( 'MAP' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3968:1: ( ( 'MAP' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3969:1: ( 'MAP' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getMAPKeyword_7_1_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3970:1: ( 'MAP' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3971:2: 'MAP'
            {
            match(input,37,FOLLOW_37_in_rule__ListExpression__Group_7_1__0__Impl8022); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getMAPKeyword_7_1_0()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_7_1__0__Impl"


    // $ANTLR start "rule__ListExpression__Group_7_1__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3982:1: rule__ListExpression__Group_7_1__1 : rule__ListExpression__Group_7_1__1__Impl rule__ListExpression__Group_7_1__2 ;
    public final void rule__ListExpression__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3986:1: ( rule__ListExpression__Group_7_1__1__Impl rule__ListExpression__Group_7_1__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3987:2: rule__ListExpression__Group_7_1__1__Impl rule__ListExpression__Group_7_1__2
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_7_1__1__Impl_in_rule__ListExpression__Group_7_1__18054);
            rule__ListExpression__Group_7_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_7_1__2_in_rule__ListExpression__Group_7_1__18057);
            rule__ListExpression__Group_7_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_7_1__1"


    // $ANTLR start "rule__ListExpression__Group_7_1__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3994:1: rule__ListExpression__Group_7_1__1__Impl : ( ( rule__ListExpression__ExprAssignment_7_1_1 ) ) ;
    public final void rule__ListExpression__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3998:1: ( ( ( rule__ListExpression__ExprAssignment_7_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3999:1: ( ( rule__ListExpression__ExprAssignment_7_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3999:1: ( ( rule__ListExpression__ExprAssignment_7_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4000:1: ( rule__ListExpression__ExprAssignment_7_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprAssignment_7_1_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4001:1: ( rule__ListExpression__ExprAssignment_7_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4001:2: rule__ListExpression__ExprAssignment_7_1_1
            {
            pushFollow(FOLLOW_rule__ListExpression__ExprAssignment_7_1_1_in_rule__ListExpression__Group_7_1__1__Impl8084);
            rule__ListExpression__ExprAssignment_7_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getExprAssignment_7_1_1()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_7_1__1__Impl"


    // $ANTLR start "rule__ListExpression__Group_7_1__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4011:1: rule__ListExpression__Group_7_1__2 : rule__ListExpression__Group_7_1__2__Impl rule__ListExpression__Group_7_1__3 ;
    public final void rule__ListExpression__Group_7_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4015:1: ( rule__ListExpression__Group_7_1__2__Impl rule__ListExpression__Group_7_1__3 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4016:2: rule__ListExpression__Group_7_1__2__Impl rule__ListExpression__Group_7_1__3
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_7_1__2__Impl_in_rule__ListExpression__Group_7_1__28114);
            rule__ListExpression__Group_7_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_7_1__3_in_rule__ListExpression__Group_7_1__28117);
            rule__ListExpression__Group_7_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_7_1__2"


    // $ANTLR start "rule__ListExpression__Group_7_1__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4023:1: rule__ListExpression__Group_7_1__2__Impl : ( 'USING' ) ;
    public final void rule__ListExpression__Group_7_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4027:1: ( ( 'USING' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4028:1: ( 'USING' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4028:1: ( 'USING' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4029:1: 'USING'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getUSINGKeyword_7_1_2()); 
            }
            match(input,34,FOLLOW_34_in_rule__ListExpression__Group_7_1__2__Impl8145); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getUSINGKeyword_7_1_2()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_7_1__2__Impl"


    // $ANTLR start "rule__ListExpression__Group_7_1__3"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4042:1: rule__ListExpression__Group_7_1__3 : rule__ListExpression__Group_7_1__3__Impl ;
    public final void rule__ListExpression__Group_7_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4046:1: ( rule__ListExpression__Group_7_1__3__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4047:2: rule__ListExpression__Group_7_1__3__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_7_1__3__Impl_in_rule__ListExpression__Group_7_1__38176);
            rule__ListExpression__Group_7_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_7_1__3"


    // $ANTLR start "rule__ListExpression__Group_7_1__3__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4053:1: rule__ListExpression__Group_7_1__3__Impl : ( ( rule__ListExpression__UsingExprAssignment_7_1_3 ) ) ;
    public final void rule__ListExpression__Group_7_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4057:1: ( ( ( rule__ListExpression__UsingExprAssignment_7_1_3 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4058:1: ( ( rule__ListExpression__UsingExprAssignment_7_1_3 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4058:1: ( ( rule__ListExpression__UsingExprAssignment_7_1_3 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4059:1: ( rule__ListExpression__UsingExprAssignment_7_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getUsingExprAssignment_7_1_3()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4060:1: ( rule__ListExpression__UsingExprAssignment_7_1_3 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4060:2: rule__ListExpression__UsingExprAssignment_7_1_3
            {
            pushFollow(FOLLOW_rule__ListExpression__UsingExprAssignment_7_1_3_in_rule__ListExpression__Group_7_1__3__Impl8203);
            rule__ListExpression__UsingExprAssignment_7_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getUsingExprAssignment_7_1_3()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_7_1__3__Impl"


    // $ANTLR start "rule__ListExpression__Group_8__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4078:1: rule__ListExpression__Group_8__0 : rule__ListExpression__Group_8__0__Impl rule__ListExpression__Group_8__1 ;
    public final void rule__ListExpression__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4082:1: ( rule__ListExpression__Group_8__0__Impl rule__ListExpression__Group_8__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4083:2: rule__ListExpression__Group_8__0__Impl rule__ListExpression__Group_8__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_8__0__Impl_in_rule__ListExpression__Group_8__08241);
            rule__ListExpression__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_8__1_in_rule__ListExpression__Group_8__08244);
            rule__ListExpression__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_8__0"


    // $ANTLR start "rule__ListExpression__Group_8__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4090:1: rule__ListExpression__Group_8__0__Impl : ( () ) ;
    public final void rule__ListExpression__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4094:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4095:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4095:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4096:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getApplyAction_8_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4097:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4099:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getApplyAction_8_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_8__0__Impl"


    // $ANTLR start "rule__ListExpression__Group_8__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4109:1: rule__ListExpression__Group_8__1 : rule__ListExpression__Group_8__1__Impl ;
    public final void rule__ListExpression__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4113:1: ( rule__ListExpression__Group_8__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4114:2: rule__ListExpression__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_8__1__Impl_in_rule__ListExpression__Group_8__18302);
            rule__ListExpression__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_8__1"


    // $ANTLR start "rule__ListExpression__Group_8__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4120:1: rule__ListExpression__Group_8__1__Impl : ( ( rule__ListExpression__Group_8_1__0 ) ) ;
    public final void rule__ListExpression__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4124:1: ( ( ( rule__ListExpression__Group_8_1__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4125:1: ( ( rule__ListExpression__Group_8_1__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4125:1: ( ( rule__ListExpression__Group_8_1__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4126:1: ( rule__ListExpression__Group_8_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getGroup_8_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4127:1: ( rule__ListExpression__Group_8_1__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4127:2: rule__ListExpression__Group_8_1__0
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_8_1__0_in_rule__ListExpression__Group_8__1__Impl8329);
            rule__ListExpression__Group_8_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getGroup_8_1()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_8__1__Impl"


    // $ANTLR start "rule__ListExpression__Group_8_1__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4141:1: rule__ListExpression__Group_8_1__0 : rule__ListExpression__Group_8_1__0__Impl rule__ListExpression__Group_8_1__1 ;
    public final void rule__ListExpression__Group_8_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4145:1: ( rule__ListExpression__Group_8_1__0__Impl rule__ListExpression__Group_8_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4146:2: rule__ListExpression__Group_8_1__0__Impl rule__ListExpression__Group_8_1__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_8_1__0__Impl_in_rule__ListExpression__Group_8_1__08363);
            rule__ListExpression__Group_8_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_8_1__1_in_rule__ListExpression__Group_8_1__08366);
            rule__ListExpression__Group_8_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_8_1__0"


    // $ANTLR start "rule__ListExpression__Group_8_1__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4153:1: rule__ListExpression__Group_8_1__0__Impl : ( ( 'APPLY' ) ) ;
    public final void rule__ListExpression__Group_8_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4157:1: ( ( ( 'APPLY' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4158:1: ( ( 'APPLY' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4158:1: ( ( 'APPLY' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4159:1: ( 'APPLY' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getAPPLYKeyword_8_1_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4160:1: ( 'APPLY' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4161:2: 'APPLY'
            {
            match(input,38,FOLLOW_38_in_rule__ListExpression__Group_8_1__0__Impl8395); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getAPPLYKeyword_8_1_0()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_8_1__0__Impl"


    // $ANTLR start "rule__ListExpression__Group_8_1__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4172:1: rule__ListExpression__Group_8_1__1 : rule__ListExpression__Group_8_1__1__Impl rule__ListExpression__Group_8_1__2 ;
    public final void rule__ListExpression__Group_8_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4176:1: ( rule__ListExpression__Group_8_1__1__Impl rule__ListExpression__Group_8_1__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4177:2: rule__ListExpression__Group_8_1__1__Impl rule__ListExpression__Group_8_1__2
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_8_1__1__Impl_in_rule__ListExpression__Group_8_1__18427);
            rule__ListExpression__Group_8_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_8_1__2_in_rule__ListExpression__Group_8_1__18430);
            rule__ListExpression__Group_8_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_8_1__1"


    // $ANTLR start "rule__ListExpression__Group_8_1__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4184:1: rule__ListExpression__Group_8_1__1__Impl : ( ( rule__ListExpression__ApplyExprAssignment_8_1_1 ) ) ;
    public final void rule__ListExpression__Group_8_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4188:1: ( ( ( rule__ListExpression__ApplyExprAssignment_8_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4189:1: ( ( rule__ListExpression__ApplyExprAssignment_8_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4189:1: ( ( rule__ListExpression__ApplyExprAssignment_8_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4190:1: ( rule__ListExpression__ApplyExprAssignment_8_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getApplyExprAssignment_8_1_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4191:1: ( rule__ListExpression__ApplyExprAssignment_8_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4191:2: rule__ListExpression__ApplyExprAssignment_8_1_1
            {
            pushFollow(FOLLOW_rule__ListExpression__ApplyExprAssignment_8_1_1_in_rule__ListExpression__Group_8_1__1__Impl8457);
            rule__ListExpression__ApplyExprAssignment_8_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getApplyExprAssignment_8_1_1()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_8_1__1__Impl"


    // $ANTLR start "rule__ListExpression__Group_8_1__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4201:1: rule__ListExpression__Group_8_1__2 : rule__ListExpression__Group_8_1__2__Impl rule__ListExpression__Group_8_1__3 ;
    public final void rule__ListExpression__Group_8_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4205:1: ( rule__ListExpression__Group_8_1__2__Impl rule__ListExpression__Group_8_1__3 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4206:2: rule__ListExpression__Group_8_1__2__Impl rule__ListExpression__Group_8_1__3
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_8_1__2__Impl_in_rule__ListExpression__Group_8_1__28487);
            rule__ListExpression__Group_8_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_8_1__3_in_rule__ListExpression__Group_8_1__28490);
            rule__ListExpression__Group_8_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_8_1__2"


    // $ANTLR start "rule__ListExpression__Group_8_1__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4213:1: rule__ListExpression__Group_8_1__2__Impl : ( 'ON' ) ;
    public final void rule__ListExpression__Group_8_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4217:1: ( ( 'ON' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4218:1: ( 'ON' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4218:1: ( 'ON' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4219:1: 'ON'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getONKeyword_8_1_2()); 
            }
            match(input,39,FOLLOW_39_in_rule__ListExpression__Group_8_1__2__Impl8518); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getONKeyword_8_1_2()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_8_1__2__Impl"


    // $ANTLR start "rule__ListExpression__Group_8_1__3"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4232:1: rule__ListExpression__Group_8_1__3 : rule__ListExpression__Group_8_1__3__Impl ;
    public final void rule__ListExpression__Group_8_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4236:1: ( rule__ListExpression__Group_8_1__3__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4237:2: rule__ListExpression__Group_8_1__3__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_8_1__3__Impl_in_rule__ListExpression__Group_8_1__38549);
            rule__ListExpression__Group_8_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_8_1__3"


    // $ANTLR start "rule__ListExpression__Group_8_1__3__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4243:1: rule__ListExpression__Group_8_1__3__Impl : ( ( rule__ListExpression__ExprAssignment_8_1_3 ) ) ;
    public final void rule__ListExpression__Group_8_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4247:1: ( ( ( rule__ListExpression__ExprAssignment_8_1_3 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4248:1: ( ( rule__ListExpression__ExprAssignment_8_1_3 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4248:1: ( ( rule__ListExpression__ExprAssignment_8_1_3 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4249:1: ( rule__ListExpression__ExprAssignment_8_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprAssignment_8_1_3()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4250:1: ( rule__ListExpression__ExprAssignment_8_1_3 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4250:2: rule__ListExpression__ExprAssignment_8_1_3
            {
            pushFollow(FOLLOW_rule__ListExpression__ExprAssignment_8_1_3_in_rule__ListExpression__Group_8_1__3__Impl8576);
            rule__ListExpression__ExprAssignment_8_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getExprAssignment_8_1_3()); 
            }

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
    // $ANTLR end "rule__ListExpression__Group_8_1__3__Impl"


    // $ANTLR start "rule__ListValue__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4268:1: rule__ListValue__Group__0 : rule__ListValue__Group__0__Impl rule__ListValue__Group__1 ;
    public final void rule__ListValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4272:1: ( rule__ListValue__Group__0__Impl rule__ListValue__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4273:2: rule__ListValue__Group__0__Impl rule__ListValue__Group__1
            {
            pushFollow(FOLLOW_rule__ListValue__Group__0__Impl_in_rule__ListValue__Group__08614);
            rule__ListValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListValue__Group__1_in_rule__ListValue__Group__08617);
            rule__ListValue__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__0"


    // $ANTLR start "rule__ListValue__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4280:1: rule__ListValue__Group__0__Impl : ( ruleExpression ) ;
    public final void rule__ListValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4284:1: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4285:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4285:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4286:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListValueAccess().getExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ListValue__Group__0__Impl8644);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListValueAccess().getExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__ListValue__Group__0__Impl"


    // $ANTLR start "rule__ListValue__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4297:1: rule__ListValue__Group__1 : rule__ListValue__Group__1__Impl ;
    public final void rule__ListValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4301:1: ( rule__ListValue__Group__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4302:2: rule__ListValue__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ListValue__Group__1__Impl_in_rule__ListValue__Group__18673);
            rule__ListValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__1"


    // $ANTLR start "rule__ListValue__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4308:1: rule__ListValue__Group__1__Impl : ( ( rule__ListValue__Group_1__0 )? ) ;
    public final void rule__ListValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4312:1: ( ( ( rule__ListValue__Group_1__0 )? ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4313:1: ( ( rule__ListValue__Group_1__0 )? )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4313:1: ( ( rule__ListValue__Group_1__0 )? )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4314:1: ( rule__ListValue__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListValueAccess().getGroup_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4315:1: ( rule__ListValue__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40) ) {
                int LA20_1 = input.LA(2);

                if ( (synpred36_InternalExpression()) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4315:2: rule__ListValue__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ListValue__Group_1__0_in_rule__ListValue__Group__1__Impl8700);
                    rule__ListValue__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListValueAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__ListValue__Group__1__Impl"


    // $ANTLR start "rule__ListValue__Group_1__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4329:1: rule__ListValue__Group_1__0 : rule__ListValue__Group_1__0__Impl rule__ListValue__Group_1__1 ;
    public final void rule__ListValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4333:1: ( rule__ListValue__Group_1__0__Impl rule__ListValue__Group_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4334:2: rule__ListValue__Group_1__0__Impl rule__ListValue__Group_1__1
            {
            pushFollow(FOLLOW_rule__ListValue__Group_1__0__Impl_in_rule__ListValue__Group_1__08735);
            rule__ListValue__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListValue__Group_1__1_in_rule__ListValue__Group_1__08738);
            rule__ListValue__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group_1__0"


    // $ANTLR start "rule__ListValue__Group_1__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4341:1: rule__ListValue__Group_1__0__Impl : ( ( '|' ) ) ;
    public final void rule__ListValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4345:1: ( ( ( '|' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4346:1: ( ( '|' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4346:1: ( ( '|' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4347:1: ( '|' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListValueAccess().getVerticalLineKeyword_1_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4348:1: ( '|' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4349:2: '|'
            {
            match(input,40,FOLLOW_40_in_rule__ListValue__Group_1__0__Impl8767); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListValueAccess().getVerticalLineKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__ListValue__Group_1__0__Impl"


    // $ANTLR start "rule__ListValue__Group_1__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4360:1: rule__ListValue__Group_1__1 : rule__ListValue__Group_1__1__Impl ;
    public final void rule__ListValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4364:1: ( rule__ListValue__Group_1__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4365:2: rule__ListValue__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ListValue__Group_1__1__Impl_in_rule__ListValue__Group_1__18799);
            rule__ListValue__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group_1__1"


    // $ANTLR start "rule__ListValue__Group_1__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4371:1: rule__ListValue__Group_1__1__Impl : ( ( rule__ListValue__ConditionAssignment_1_1 ) ) ;
    public final void rule__ListValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4375:1: ( ( ( rule__ListValue__ConditionAssignment_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4376:1: ( ( rule__ListValue__ConditionAssignment_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4376:1: ( ( rule__ListValue__ConditionAssignment_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4377:1: ( rule__ListValue__ConditionAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListValueAccess().getConditionAssignment_1_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4378:1: ( rule__ListValue__ConditionAssignment_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4378:2: rule__ListValue__ConditionAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ListValue__ConditionAssignment_1_1_in_rule__ListValue__Group_1__1__Impl8826);
            rule__ListValue__ConditionAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListValueAccess().getConditionAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__ListValue__Group_1__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_0__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4392:1: rule__UnaryExpression__Group_0__0 : rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 ;
    public final void rule__UnaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4396:1: ( rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4397:2: rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group_0__0__Impl_in_rule__UnaryExpression__Group_0__08860);
            rule__UnaryExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnaryExpression__Group_0__1_in_rule__UnaryExpression__Group_0__08863);
            rule__UnaryExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0__0"


    // $ANTLR start "rule__UnaryExpression__Group_0__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4404:1: rule__UnaryExpression__Group_0__0__Impl : ( ruleTerm ) ;
    public final void rule__UnaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4408:1: ( ( ruleTerm ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4409:1: ( ruleTerm )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4409:1: ( ruleTerm )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4410:1: ruleTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getTermParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleTerm_in_rule__UnaryExpression__Group_0__0__Impl8890);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getTermParserRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__UnaryExpression__Group_0__0__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_0__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4421:1: rule__UnaryExpression__Group_0__1 : rule__UnaryExpression__Group_0__1__Impl ;
    public final void rule__UnaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4425:1: ( rule__UnaryExpression__Group_0__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4426:2: rule__UnaryExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group_0__1__Impl_in_rule__UnaryExpression__Group_0__18919);
            rule__UnaryExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0__1"


    // $ANTLR start "rule__UnaryExpression__Group_0__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4432:1: rule__UnaryExpression__Group_0__1__Impl : ( ( rule__UnaryExpression__StructuredExpressionAssignment_0_1 ) ) ;
    public final void rule__UnaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4436:1: ( ( ( rule__UnaryExpression__StructuredExpressionAssignment_0_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4437:1: ( ( rule__UnaryExpression__StructuredExpressionAssignment_0_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4437:1: ( ( rule__UnaryExpression__StructuredExpressionAssignment_0_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4438:1: ( rule__UnaryExpression__StructuredExpressionAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getStructuredExpressionAssignment_0_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4439:1: ( rule__UnaryExpression__StructuredExpressionAssignment_0_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4439:2: rule__UnaryExpression__StructuredExpressionAssignment_0_1
            {
            pushFollow(FOLLOW_rule__UnaryExpression__StructuredExpressionAssignment_0_1_in_rule__UnaryExpression__Group_0__1__Impl8946);
            rule__UnaryExpression__StructuredExpressionAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getStructuredExpressionAssignment_0_1()); 
            }

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
    // $ANTLR end "rule__UnaryExpression__Group_0__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_1__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4453:1: rule__UnaryExpression__Group_1__0 : rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1 ;
    public final void rule__UnaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4457:1: ( rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4458:2: rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group_1__0__Impl_in_rule__UnaryExpression__Group_1__08980);
            rule__UnaryExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnaryExpression__Group_1__1_in_rule__UnaryExpression__Group_1__08983);
            rule__UnaryExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__0"


    // $ANTLR start "rule__UnaryExpression__Group_1__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4465:1: rule__UnaryExpression__Group_1__0__Impl : ( '(' ) ;
    public final void rule__UnaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4469:1: ( ( '(' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4470:1: ( '(' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4470:1: ( '(' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4471:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__UnaryExpression__Group_1__0__Impl9011); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getLeftParenthesisKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__UnaryExpression__Group_1__0__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_1__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4484:1: rule__UnaryExpression__Group_1__1 : rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2 ;
    public final void rule__UnaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4488:1: ( rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4489:2: rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group_1__1__Impl_in_rule__UnaryExpression__Group_1__19042);
            rule__UnaryExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnaryExpression__Group_1__2_in_rule__UnaryExpression__Group_1__19045);
            rule__UnaryExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__1"


    // $ANTLR start "rule__UnaryExpression__Group_1__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4496:1: rule__UnaryExpression__Group_1__1__Impl : ( ruleExpression ) ;
    public final void rule__UnaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4500:1: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4501:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4501:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4502:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getExpressionParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__UnaryExpression__Group_1__1__Impl9072);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getExpressionParserRuleCall_1_1()); 
            }

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
    // $ANTLR end "rule__UnaryExpression__Group_1__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_1__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4513:1: rule__UnaryExpression__Group_1__2 : rule__UnaryExpression__Group_1__2__Impl rule__UnaryExpression__Group_1__3 ;
    public final void rule__UnaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4517:1: ( rule__UnaryExpression__Group_1__2__Impl rule__UnaryExpression__Group_1__3 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4518:2: rule__UnaryExpression__Group_1__2__Impl rule__UnaryExpression__Group_1__3
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group_1__2__Impl_in_rule__UnaryExpression__Group_1__29101);
            rule__UnaryExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnaryExpression__Group_1__3_in_rule__UnaryExpression__Group_1__29104);
            rule__UnaryExpression__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__2"


    // $ANTLR start "rule__UnaryExpression__Group_1__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4525:1: rule__UnaryExpression__Group_1__2__Impl : ( ')' ) ;
    public final void rule__UnaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4529:1: ( ( ')' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4530:1: ( ')' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4530:1: ( ')' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4531:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__UnaryExpression__Group_1__2__Impl9132); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getRightParenthesisKeyword_1_2()); 
            }

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
    // $ANTLR end "rule__UnaryExpression__Group_1__2__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_1__3"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4544:1: rule__UnaryExpression__Group_1__3 : rule__UnaryExpression__Group_1__3__Impl rule__UnaryExpression__Group_1__4 ;
    public final void rule__UnaryExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4548:1: ( rule__UnaryExpression__Group_1__3__Impl rule__UnaryExpression__Group_1__4 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4549:2: rule__UnaryExpression__Group_1__3__Impl rule__UnaryExpression__Group_1__4
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group_1__3__Impl_in_rule__UnaryExpression__Group_1__39163);
            rule__UnaryExpression__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnaryExpression__Group_1__4_in_rule__UnaryExpression__Group_1__39166);
            rule__UnaryExpression__Group_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__3"


    // $ANTLR start "rule__UnaryExpression__Group_1__3__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4556:1: rule__UnaryExpression__Group_1__3__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4560:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4561:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4561:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4562:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getUnaryExpressionExprAction_1_3()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4563:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4565:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getUnaryExpressionExprAction_1_3()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__3__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_1__4"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4575:1: rule__UnaryExpression__Group_1__4 : rule__UnaryExpression__Group_1__4__Impl ;
    public final void rule__UnaryExpression__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4579:1: ( rule__UnaryExpression__Group_1__4__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4580:2: rule__UnaryExpression__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group_1__4__Impl_in_rule__UnaryExpression__Group_1__49224);
            rule__UnaryExpression__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__4"


    // $ANTLR start "rule__UnaryExpression__Group_1__4__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4586:1: rule__UnaryExpression__Group_1__4__Impl : ( ( rule__UnaryExpression__StructuredExpressionAssignment_1_4 ) ) ;
    public final void rule__UnaryExpression__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4590:1: ( ( ( rule__UnaryExpression__StructuredExpressionAssignment_1_4 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4591:1: ( ( rule__UnaryExpression__StructuredExpressionAssignment_1_4 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4591:1: ( ( rule__UnaryExpression__StructuredExpressionAssignment_1_4 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4592:1: ( rule__UnaryExpression__StructuredExpressionAssignment_1_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getStructuredExpressionAssignment_1_4()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4593:1: ( rule__UnaryExpression__StructuredExpressionAssignment_1_4 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4593:2: rule__UnaryExpression__StructuredExpressionAssignment_1_4
            {
            pushFollow(FOLLOW_rule__UnaryExpression__StructuredExpressionAssignment_1_4_in_rule__UnaryExpression__Group_1__4__Impl9251);
            rule__UnaryExpression__StructuredExpressionAssignment_1_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getStructuredExpressionAssignment_1_4()); 
            }

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
    // $ANTLR end "rule__UnaryExpression__Group_1__4__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_2__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4613:1: rule__UnaryExpression__Group_2__0 : rule__UnaryExpression__Group_2__0__Impl rule__UnaryExpression__Group_2__1 ;
    public final void rule__UnaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4617:1: ( rule__UnaryExpression__Group_2__0__Impl rule__UnaryExpression__Group_2__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4618:2: rule__UnaryExpression__Group_2__0__Impl rule__UnaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group_2__0__Impl_in_rule__UnaryExpression__Group_2__09291);
            rule__UnaryExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnaryExpression__Group_2__1_in_rule__UnaryExpression__Group_2__09294);
            rule__UnaryExpression__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_2__0"


    // $ANTLR start "rule__UnaryExpression__Group_2__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4625:1: rule__UnaryExpression__Group_2__0__Impl : ( 'NOT (' ) ;
    public final void rule__UnaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4629:1: ( ( 'NOT (' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4630:1: ( 'NOT (' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4630:1: ( 'NOT (' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4631:1: 'NOT ('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getNOTKeyword_2_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__UnaryExpression__Group_2__0__Impl9322); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getNOTKeyword_2_0()); 
            }

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
    // $ANTLR end "rule__UnaryExpression__Group_2__0__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_2__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4644:1: rule__UnaryExpression__Group_2__1 : rule__UnaryExpression__Group_2__1__Impl rule__UnaryExpression__Group_2__2 ;
    public final void rule__UnaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4648:1: ( rule__UnaryExpression__Group_2__1__Impl rule__UnaryExpression__Group_2__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4649:2: rule__UnaryExpression__Group_2__1__Impl rule__UnaryExpression__Group_2__2
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group_2__1__Impl_in_rule__UnaryExpression__Group_2__19353);
            rule__UnaryExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnaryExpression__Group_2__2_in_rule__UnaryExpression__Group_2__19356);
            rule__UnaryExpression__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_2__1"


    // $ANTLR start "rule__UnaryExpression__Group_2__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4656:1: rule__UnaryExpression__Group_2__1__Impl : ( ruleExpression ) ;
    public final void rule__UnaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4660:1: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4661:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4661:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4662:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getExpressionParserRuleCall_2_1()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__UnaryExpression__Group_2__1__Impl9383);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getExpressionParserRuleCall_2_1()); 
            }

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
    // $ANTLR end "rule__UnaryExpression__Group_2__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_2__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4673:1: rule__UnaryExpression__Group_2__2 : rule__UnaryExpression__Group_2__2__Impl rule__UnaryExpression__Group_2__3 ;
    public final void rule__UnaryExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4677:1: ( rule__UnaryExpression__Group_2__2__Impl rule__UnaryExpression__Group_2__3 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4678:2: rule__UnaryExpression__Group_2__2__Impl rule__UnaryExpression__Group_2__3
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group_2__2__Impl_in_rule__UnaryExpression__Group_2__29412);
            rule__UnaryExpression__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnaryExpression__Group_2__3_in_rule__UnaryExpression__Group_2__29415);
            rule__UnaryExpression__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_2__2"


    // $ANTLR start "rule__UnaryExpression__Group_2__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4685:1: rule__UnaryExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__UnaryExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4689:1: ( ( ')' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4690:1: ( ')' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4690:1: ( ')' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4691:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__UnaryExpression__Group_2__2__Impl9443); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }

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
    // $ANTLR end "rule__UnaryExpression__Group_2__2__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_2__3"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4704:1: rule__UnaryExpression__Group_2__3 : rule__UnaryExpression__Group_2__3__Impl rule__UnaryExpression__Group_2__4 ;
    public final void rule__UnaryExpression__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4708:1: ( rule__UnaryExpression__Group_2__3__Impl rule__UnaryExpression__Group_2__4 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4709:2: rule__UnaryExpression__Group_2__3__Impl rule__UnaryExpression__Group_2__4
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group_2__3__Impl_in_rule__UnaryExpression__Group_2__39474);
            rule__UnaryExpression__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnaryExpression__Group_2__4_in_rule__UnaryExpression__Group_2__39477);
            rule__UnaryExpression__Group_2__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_2__3"


    // $ANTLR start "rule__UnaryExpression__Group_2__3__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4716:1: rule__UnaryExpression__Group_2__3__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4720:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4721:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4721:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4722:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getUnaryExpressionExprAction_2_3()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4723:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4725:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getUnaryExpressionExprAction_2_3()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_2__3__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_2__4"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4735:1: rule__UnaryExpression__Group_2__4 : rule__UnaryExpression__Group_2__4__Impl ;
    public final void rule__UnaryExpression__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4739:1: ( rule__UnaryExpression__Group_2__4__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4740:2: rule__UnaryExpression__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group_2__4__Impl_in_rule__UnaryExpression__Group_2__49535);
            rule__UnaryExpression__Group_2__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_2__4"


    // $ANTLR start "rule__UnaryExpression__Group_2__4__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4746:1: rule__UnaryExpression__Group_2__4__Impl : ( ( rule__UnaryExpression__StructuredExpressionAssignment_2_4 ) ) ;
    public final void rule__UnaryExpression__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4750:1: ( ( ( rule__UnaryExpression__StructuredExpressionAssignment_2_4 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4751:1: ( ( rule__UnaryExpression__StructuredExpressionAssignment_2_4 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4751:1: ( ( rule__UnaryExpression__StructuredExpressionAssignment_2_4 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4752:1: ( rule__UnaryExpression__StructuredExpressionAssignment_2_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getStructuredExpressionAssignment_2_4()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4753:1: ( rule__UnaryExpression__StructuredExpressionAssignment_2_4 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4753:2: rule__UnaryExpression__StructuredExpressionAssignment_2_4
            {
            pushFollow(FOLLOW_rule__UnaryExpression__StructuredExpressionAssignment_2_4_in_rule__UnaryExpression__Group_2__4__Impl9562);
            rule__UnaryExpression__StructuredExpressionAssignment_2_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getStructuredExpressionAssignment_2_4()); 
            }

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
    // $ANTLR end "rule__UnaryExpression__Group_2__4__Impl"


    // $ANTLR start "rule__StructureExpression__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4773:1: rule__StructureExpression__Group__0 : rule__StructureExpression__Group__0__Impl rule__StructureExpression__Group__1 ;
    public final void rule__StructureExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4777:1: ( rule__StructureExpression__Group__0__Impl rule__StructureExpression__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4778:2: rule__StructureExpression__Group__0__Impl rule__StructureExpression__Group__1
            {
            pushFollow(FOLLOW_rule__StructureExpression__Group__0__Impl_in_rule__StructureExpression__Group__09602);
            rule__StructureExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StructureExpression__Group__1_in_rule__StructureExpression__Group__09605);
            rule__StructureExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructureExpression__Group__0"


    // $ANTLR start "rule__StructureExpression__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4785:1: rule__StructureExpression__Group__0__Impl : ( () ) ;
    public final void rule__StructureExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4789:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4790:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4790:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4791:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructureExpressionAccess().getStructureExpressionAction_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4792:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4794:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStructureExpressionAccess().getStructureExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructureExpression__Group__0__Impl"


    // $ANTLR start "rule__StructureExpression__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4804:1: rule__StructureExpression__Group__1 : rule__StructureExpression__Group__1__Impl ;
    public final void rule__StructureExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4808:1: ( rule__StructureExpression__Group__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4809:2: rule__StructureExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StructureExpression__Group__1__Impl_in_rule__StructureExpression__Group__19663);
            rule__StructureExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructureExpression__Group__1"


    // $ANTLR start "rule__StructureExpression__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4815:1: rule__StructureExpression__Group__1__Impl : ( ( rule__StructureExpression__Group_1__0 )? ) ;
    public final void rule__StructureExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4819:1: ( ( ( rule__StructureExpression__Group_1__0 )? ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4820:1: ( ( rule__StructureExpression__Group_1__0 )? )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4820:1: ( ( rule__StructureExpression__Group_1__0 )? )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4821:1: ( rule__StructureExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructureExpressionAccess().getGroup_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4822:1: ( rule__StructureExpression__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==42) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4822:2: rule__StructureExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__StructureExpression__Group_1__0_in_rule__StructureExpression__Group__1__Impl9690);
                    rule__StructureExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStructureExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__StructureExpression__Group__1__Impl"


    // $ANTLR start "rule__StructureExpression__Group_1__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4836:1: rule__StructureExpression__Group_1__0 : rule__StructureExpression__Group_1__0__Impl rule__StructureExpression__Group_1__1 ;
    public final void rule__StructureExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4840:1: ( rule__StructureExpression__Group_1__0__Impl rule__StructureExpression__Group_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4841:2: rule__StructureExpression__Group_1__0__Impl rule__StructureExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__StructureExpression__Group_1__0__Impl_in_rule__StructureExpression__Group_1__09725);
            rule__StructureExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StructureExpression__Group_1__1_in_rule__StructureExpression__Group_1__09728);
            rule__StructureExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructureExpression__Group_1__0"


    // $ANTLR start "rule__StructureExpression__Group_1__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4848:1: rule__StructureExpression__Group_1__0__Impl : ( '{' ) ;
    public final void rule__StructureExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4852:1: ( ( '{' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4853:1: ( '{' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4853:1: ( '{' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4854:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructureExpressionAccess().getLeftCurlyBracketKeyword_1_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__StructureExpression__Group_1__0__Impl9756); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStructureExpressionAccess().getLeftCurlyBracketKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__StructureExpression__Group_1__0__Impl"


    // $ANTLR start "rule__StructureExpression__Group_1__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4867:1: rule__StructureExpression__Group_1__1 : rule__StructureExpression__Group_1__1__Impl rule__StructureExpression__Group_1__2 ;
    public final void rule__StructureExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4871:1: ( rule__StructureExpression__Group_1__1__Impl rule__StructureExpression__Group_1__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4872:2: rule__StructureExpression__Group_1__1__Impl rule__StructureExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__StructureExpression__Group_1__1__Impl_in_rule__StructureExpression__Group_1__19787);
            rule__StructureExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StructureExpression__Group_1__2_in_rule__StructureExpression__Group_1__19790);
            rule__StructureExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructureExpression__Group_1__1"


    // $ANTLR start "rule__StructureExpression__Group_1__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4879:1: rule__StructureExpression__Group_1__1__Impl : ( ( rule__StructureExpression__KeyValuePairAssignment_1_1 ) ) ;
    public final void rule__StructureExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4883:1: ( ( ( rule__StructureExpression__KeyValuePairAssignment_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4884:1: ( ( rule__StructureExpression__KeyValuePairAssignment_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4884:1: ( ( rule__StructureExpression__KeyValuePairAssignment_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4885:1: ( rule__StructureExpression__KeyValuePairAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructureExpressionAccess().getKeyValuePairAssignment_1_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4886:1: ( rule__StructureExpression__KeyValuePairAssignment_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4886:2: rule__StructureExpression__KeyValuePairAssignment_1_1
            {
            pushFollow(FOLLOW_rule__StructureExpression__KeyValuePairAssignment_1_1_in_rule__StructureExpression__Group_1__1__Impl9817);
            rule__StructureExpression__KeyValuePairAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStructureExpressionAccess().getKeyValuePairAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__StructureExpression__Group_1__1__Impl"


    // $ANTLR start "rule__StructureExpression__Group_1__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4896:1: rule__StructureExpression__Group_1__2 : rule__StructureExpression__Group_1__2__Impl rule__StructureExpression__Group_1__3 ;
    public final void rule__StructureExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4900:1: ( rule__StructureExpression__Group_1__2__Impl rule__StructureExpression__Group_1__3 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4901:2: rule__StructureExpression__Group_1__2__Impl rule__StructureExpression__Group_1__3
            {
            pushFollow(FOLLOW_rule__StructureExpression__Group_1__2__Impl_in_rule__StructureExpression__Group_1__29847);
            rule__StructureExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StructureExpression__Group_1__3_in_rule__StructureExpression__Group_1__29850);
            rule__StructureExpression__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructureExpression__Group_1__2"


    // $ANTLR start "rule__StructureExpression__Group_1__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4908:1: rule__StructureExpression__Group_1__2__Impl : ( '}' ) ;
    public final void rule__StructureExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4912:1: ( ( '}' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4913:1: ( '}' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4913:1: ( '}' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4914:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructureExpressionAccess().getRightCurlyBracketKeyword_1_2()); 
            }
            match(input,43,FOLLOW_43_in_rule__StructureExpression__Group_1__2__Impl9878); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStructureExpressionAccess().getRightCurlyBracketKeyword_1_2()); 
            }

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
    // $ANTLR end "rule__StructureExpression__Group_1__2__Impl"


    // $ANTLR start "rule__StructureExpression__Group_1__3"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4927:1: rule__StructureExpression__Group_1__3 : rule__StructureExpression__Group_1__3__Impl ;
    public final void rule__StructureExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4931:1: ( rule__StructureExpression__Group_1__3__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4932:2: rule__StructureExpression__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__StructureExpression__Group_1__3__Impl_in_rule__StructureExpression__Group_1__39909);
            rule__StructureExpression__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructureExpression__Group_1__3"


    // $ANTLR start "rule__StructureExpression__Group_1__3__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4938:1: rule__StructureExpression__Group_1__3__Impl : ( ( rule__StructureExpression__StructuredExpressionsAssignment_1_3 ) ) ;
    public final void rule__StructureExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4942:1: ( ( ( rule__StructureExpression__StructuredExpressionsAssignment_1_3 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4943:1: ( ( rule__StructureExpression__StructuredExpressionsAssignment_1_3 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4943:1: ( ( rule__StructureExpression__StructuredExpressionsAssignment_1_3 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4944:1: ( rule__StructureExpression__StructuredExpressionsAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructureExpressionAccess().getStructuredExpressionsAssignment_1_3()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4945:1: ( rule__StructureExpression__StructuredExpressionsAssignment_1_3 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4945:2: rule__StructureExpression__StructuredExpressionsAssignment_1_3
            {
            pushFollow(FOLLOW_rule__StructureExpression__StructuredExpressionsAssignment_1_3_in_rule__StructureExpression__Group_1__3__Impl9936);
            rule__StructureExpression__StructuredExpressionsAssignment_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStructureExpressionAccess().getStructuredExpressionsAssignment_1_3()); 
            }

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
    // $ANTLR end "rule__StructureExpression__Group_1__3__Impl"


    // $ANTLR start "rule__KeyValuePair__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4963:1: rule__KeyValuePair__Group__0 : rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 ;
    public final void rule__KeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4967:1: ( rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4968:2: rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1
            {
            pushFollow(FOLLOW_rule__KeyValuePair__Group__0__Impl_in_rule__KeyValuePair__Group__09974);
            rule__KeyValuePair__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyValuePair__Group__1_in_rule__KeyValuePair__Group__09977);
            rule__KeyValuePair__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValuePair__Group__0"


    // $ANTLR start "rule__KeyValuePair__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4975:1: rule__KeyValuePair__Group__0__Impl : ( ( rule__KeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__KeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4979:1: ( ( ( rule__KeyValuePair__KeyAssignment_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4980:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4980:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4981:1: ( rule__KeyValuePair__KeyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getKeyAssignment_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4982:1: ( rule__KeyValuePair__KeyAssignment_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4982:2: rule__KeyValuePair__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__KeyValuePair__KeyAssignment_0_in_rule__KeyValuePair__Group__0__Impl10004);
            rule__KeyValuePair__KeyAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyValuePairAccess().getKeyAssignment_0()); 
            }

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
    // $ANTLR end "rule__KeyValuePair__Group__0__Impl"


    // $ANTLR start "rule__KeyValuePair__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4992:1: rule__KeyValuePair__Group__1 : rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 ;
    public final void rule__KeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4996:1: ( rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4997:2: rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2
            {
            pushFollow(FOLLOW_rule__KeyValuePair__Group__1__Impl_in_rule__KeyValuePair__Group__110034);
            rule__KeyValuePair__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyValuePair__Group__2_in_rule__KeyValuePair__Group__110037);
            rule__KeyValuePair__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValuePair__Group__1"


    // $ANTLR start "rule__KeyValuePair__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5004:1: rule__KeyValuePair__Group__1__Impl : ( '=>' ) ;
    public final void rule__KeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5008:1: ( ( '=>' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5009:1: ( '=>' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5009:1: ( '=>' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5010:1: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            }
            match(input,44,FOLLOW_44_in_rule__KeyValuePair__Group__1__Impl10065); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyValuePairAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            }

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
    // $ANTLR end "rule__KeyValuePair__Group__1__Impl"


    // $ANTLR start "rule__KeyValuePair__Group__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5023:1: rule__KeyValuePair__Group__2 : rule__KeyValuePair__Group__2__Impl rule__KeyValuePair__Group__3 ;
    public final void rule__KeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5027:1: ( rule__KeyValuePair__Group__2__Impl rule__KeyValuePair__Group__3 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5028:2: rule__KeyValuePair__Group__2__Impl rule__KeyValuePair__Group__3
            {
            pushFollow(FOLLOW_rule__KeyValuePair__Group__2__Impl_in_rule__KeyValuePair__Group__210096);
            rule__KeyValuePair__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyValuePair__Group__3_in_rule__KeyValuePair__Group__210099);
            rule__KeyValuePair__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValuePair__Group__2"


    // $ANTLR start "rule__KeyValuePair__Group__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5035:1: rule__KeyValuePair__Group__2__Impl : ( ( rule__KeyValuePair__ValueAssignment_2 ) ) ;
    public final void rule__KeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5039:1: ( ( ( rule__KeyValuePair__ValueAssignment_2 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5040:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5040:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5041:1: ( rule__KeyValuePair__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getValueAssignment_2()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5042:1: ( rule__KeyValuePair__ValueAssignment_2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5042:2: rule__KeyValuePair__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__KeyValuePair__ValueAssignment_2_in_rule__KeyValuePair__Group__2__Impl10126);
            rule__KeyValuePair__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyValuePairAccess().getValueAssignment_2()); 
            }

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
    // $ANTLR end "rule__KeyValuePair__Group__2__Impl"


    // $ANTLR start "rule__KeyValuePair__Group__3"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5052:1: rule__KeyValuePair__Group__3 : rule__KeyValuePair__Group__3__Impl ;
    public final void rule__KeyValuePair__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5056:1: ( rule__KeyValuePair__Group__3__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5057:2: rule__KeyValuePair__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__KeyValuePair__Group__3__Impl_in_rule__KeyValuePair__Group__310156);
            rule__KeyValuePair__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValuePair__Group__3"


    // $ANTLR start "rule__KeyValuePair__Group__3__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5063:1: rule__KeyValuePair__Group__3__Impl : ( ( rule__KeyValuePair__RestAssignment_3 )? ) ;
    public final void rule__KeyValuePair__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5067:1: ( ( ( rule__KeyValuePair__RestAssignment_3 )? ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5068:1: ( ( rule__KeyValuePair__RestAssignment_3 )? )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5068:1: ( ( rule__KeyValuePair__RestAssignment_3 )? )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5069:1: ( rule__KeyValuePair__RestAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getRestAssignment_3()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5070:1: ( rule__KeyValuePair__RestAssignment_3 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5070:2: rule__KeyValuePair__RestAssignment_3
                    {
                    pushFollow(FOLLOW_rule__KeyValuePair__RestAssignment_3_in_rule__KeyValuePair__Group__3__Impl10183);
                    rule__KeyValuePair__RestAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyValuePairAccess().getRestAssignment_3()); 
            }

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
    // $ANTLR end "rule__KeyValuePair__Group__3__Impl"


    // $ANTLR start "rule__KeyValuePairRest__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5088:1: rule__KeyValuePairRest__Group__0 : rule__KeyValuePairRest__Group__0__Impl rule__KeyValuePairRest__Group__1 ;
    public final void rule__KeyValuePairRest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5092:1: ( rule__KeyValuePairRest__Group__0__Impl rule__KeyValuePairRest__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5093:2: rule__KeyValuePairRest__Group__0__Impl rule__KeyValuePairRest__Group__1
            {
            pushFollow(FOLLOW_rule__KeyValuePairRest__Group__0__Impl_in_rule__KeyValuePairRest__Group__010222);
            rule__KeyValuePairRest__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyValuePairRest__Group__1_in_rule__KeyValuePairRest__Group__010225);
            rule__KeyValuePairRest__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValuePairRest__Group__0"


    // $ANTLR start "rule__KeyValuePairRest__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5100:1: rule__KeyValuePairRest__Group__0__Impl : ( ',' ) ;
    public final void rule__KeyValuePairRest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5104:1: ( ( ',' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5105:1: ( ',' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5105:1: ( ',' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5106:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairRestAccess().getCommaKeyword_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__KeyValuePairRest__Group__0__Impl10253); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyValuePairRestAccess().getCommaKeyword_0()); 
            }

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
    // $ANTLR end "rule__KeyValuePairRest__Group__0__Impl"


    // $ANTLR start "rule__KeyValuePairRest__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5119:1: rule__KeyValuePairRest__Group__1 : rule__KeyValuePairRest__Group__1__Impl ;
    public final void rule__KeyValuePairRest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5123:1: ( rule__KeyValuePairRest__Group__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5124:2: rule__KeyValuePairRest__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__KeyValuePairRest__Group__1__Impl_in_rule__KeyValuePairRest__Group__110284);
            rule__KeyValuePairRest__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValuePairRest__Group__1"


    // $ANTLR start "rule__KeyValuePairRest__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5130:1: rule__KeyValuePairRest__Group__1__Impl : ( ruleKeyValuePair ) ;
    public final void rule__KeyValuePairRest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5134:1: ( ( ruleKeyValuePair ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5135:1: ( ruleKeyValuePair )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5135:1: ( ruleKeyValuePair )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5136:1: ruleKeyValuePair
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairRestAccess().getKeyValuePairParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleKeyValuePair_in_rule__KeyValuePairRest__Group__1__Impl10311);
            ruleKeyValuePair();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyValuePairRestAccess().getKeyValuePairParserRuleCall_1()); 
            }

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
    // $ANTLR end "rule__KeyValuePairRest__Group__1__Impl"


    // $ANTLR start "rule__Term__Group_1__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5151:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5155:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5156:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__010344);
            rule__Term__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__010347);
            rule__Term__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__0"


    // $ANTLR start "rule__Term__Group_1__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5163:1: rule__Term__Group_1__0__Impl : ( () ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5167:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5168:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5168:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5169:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getStringValueAction_1_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5170:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5172:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getStringValueAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__0__Impl"


    // $ANTLR start "rule__Term__Group_1__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5182:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5186:1: ( rule__Term__Group_1__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5187:2: rule__Term__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__110405);
            rule__Term__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__1"


    // $ANTLR start "rule__Term__Group_1__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5193:1: rule__Term__Group_1__1__Impl : ( ( rule__Term__ValueAssignment_1_1 ) ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5197:1: ( ( ( rule__Term__ValueAssignment_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5198:1: ( ( rule__Term__ValueAssignment_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5198:1: ( ( rule__Term__ValueAssignment_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5199:1: ( rule__Term__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getValueAssignment_1_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5200:1: ( rule__Term__ValueAssignment_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5200:2: rule__Term__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Term__ValueAssignment_1_1_in_rule__Term__Group_1__1__Impl10432);
            rule__Term__ValueAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getValueAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__Term__Group_1__1__Impl"


    // $ANTLR start "rule__Term__Group_2__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5214:1: rule__Term__Group_2__0 : rule__Term__Group_2__0__Impl rule__Term__Group_2__1 ;
    public final void rule__Term__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5218:1: ( rule__Term__Group_2__0__Impl rule__Term__Group_2__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5219:2: rule__Term__Group_2__0__Impl rule__Term__Group_2__1
            {
            pushFollow(FOLLOW_rule__Term__Group_2__0__Impl_in_rule__Term__Group_2__010466);
            rule__Term__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Term__Group_2__1_in_rule__Term__Group_2__010469);
            rule__Term__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_2__0"


    // $ANTLR start "rule__Term__Group_2__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5226:1: rule__Term__Group_2__0__Impl : ( () ) ;
    public final void rule__Term__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5230:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5231:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5231:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5232:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getIntegerValueAction_2_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5233:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5235:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getIntegerValueAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_2__0__Impl"


    // $ANTLR start "rule__Term__Group_2__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5245:1: rule__Term__Group_2__1 : rule__Term__Group_2__1__Impl ;
    public final void rule__Term__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5249:1: ( rule__Term__Group_2__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5250:2: rule__Term__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group_2__1__Impl_in_rule__Term__Group_2__110527);
            rule__Term__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_2__1"


    // $ANTLR start "rule__Term__Group_2__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5256:1: rule__Term__Group_2__1__Impl : ( ( rule__Term__ValueAssignment_2_1 ) ) ;
    public final void rule__Term__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5260:1: ( ( ( rule__Term__ValueAssignment_2_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5261:1: ( ( rule__Term__ValueAssignment_2_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5261:1: ( ( rule__Term__ValueAssignment_2_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5262:1: ( rule__Term__ValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getValueAssignment_2_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5263:1: ( rule__Term__ValueAssignment_2_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5263:2: rule__Term__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Term__ValueAssignment_2_1_in_rule__Term__Group_2__1__Impl10554);
            rule__Term__ValueAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getValueAssignment_2_1()); 
            }

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
    // $ANTLR end "rule__Term__Group_2__1__Impl"


    // $ANTLR start "rule__Term__Group_3__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5277:1: rule__Term__Group_3__0 : rule__Term__Group_3__0__Impl rule__Term__Group_3__1 ;
    public final void rule__Term__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5281:1: ( rule__Term__Group_3__0__Impl rule__Term__Group_3__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5282:2: rule__Term__Group_3__0__Impl rule__Term__Group_3__1
            {
            pushFollow(FOLLOW_rule__Term__Group_3__0__Impl_in_rule__Term__Group_3__010588);
            rule__Term__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Term__Group_3__1_in_rule__Term__Group_3__010591);
            rule__Term__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_3__0"


    // $ANTLR start "rule__Term__Group_3__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5289:1: rule__Term__Group_3__0__Impl : ( () ) ;
    public final void rule__Term__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5293:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5294:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5294:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5295:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getDoubleValueAction_3_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5296:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5298:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getDoubleValueAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_3__0__Impl"


    // $ANTLR start "rule__Term__Group_3__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5308:1: rule__Term__Group_3__1 : rule__Term__Group_3__1__Impl ;
    public final void rule__Term__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5312:1: ( rule__Term__Group_3__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5313:2: rule__Term__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group_3__1__Impl_in_rule__Term__Group_3__110649);
            rule__Term__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_3__1"


    // $ANTLR start "rule__Term__Group_3__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5319:1: rule__Term__Group_3__1__Impl : ( ( rule__Term__ValueAssignment_3_1 ) ) ;
    public final void rule__Term__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5323:1: ( ( ( rule__Term__ValueAssignment_3_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5324:1: ( ( rule__Term__ValueAssignment_3_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5324:1: ( ( rule__Term__ValueAssignment_3_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5325:1: ( rule__Term__ValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getValueAssignment_3_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5326:1: ( rule__Term__ValueAssignment_3_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5326:2: rule__Term__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Term__ValueAssignment_3_1_in_rule__Term__Group_3__1__Impl10676);
            rule__Term__ValueAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getValueAssignment_3_1()); 
            }

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
    // $ANTLR end "rule__Term__Group_3__1__Impl"


    // $ANTLR start "rule__List__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5340:1: rule__List__Group__0 : rule__List__Group__0__Impl rule__List__Group__1 ;
    public final void rule__List__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5344:1: ( rule__List__Group__0__Impl rule__List__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5345:2: rule__List__Group__0__Impl rule__List__Group__1
            {
            pushFollow(FOLLOW_rule__List__Group__0__Impl_in_rule__List__Group__010710);
            rule__List__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__List__Group__1_in_rule__List__Group__010713);
            rule__List__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__0"


    // $ANTLR start "rule__List__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5352:1: rule__List__Group__0__Impl : ( () ) ;
    public final void rule__List__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5356:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5357:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5357:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5358:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getListAction_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5359:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5361:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getListAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__0__Impl"


    // $ANTLR start "rule__List__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5371:1: rule__List__Group__1 : rule__List__Group__1__Impl rule__List__Group__2 ;
    public final void rule__List__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5375:1: ( rule__List__Group__1__Impl rule__List__Group__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5376:2: rule__List__Group__1__Impl rule__List__Group__2
            {
            pushFollow(FOLLOW_rule__List__Group__1__Impl_in_rule__List__Group__110771);
            rule__List__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__List__Group__2_in_rule__List__Group__110774);
            rule__List__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__1"


    // $ANTLR start "rule__List__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5383:1: rule__List__Group__1__Impl : ( '[' ) ;
    public final void rule__List__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5387:1: ( ( '[' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5388:1: ( '[' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5388:1: ( '[' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5389:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,45,FOLLOW_45_in_rule__List__Group__1__Impl10802); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getLeftSquareBracketKeyword_1()); 
            }

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
    // $ANTLR end "rule__List__Group__1__Impl"


    // $ANTLR start "rule__List__Group__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5402:1: rule__List__Group__2 : rule__List__Group__2__Impl rule__List__Group__3 ;
    public final void rule__List__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5406:1: ( rule__List__Group__2__Impl rule__List__Group__3 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5407:2: rule__List__Group__2__Impl rule__List__Group__3
            {
            pushFollow(FOLLOW_rule__List__Group__2__Impl_in_rule__List__Group__210833);
            rule__List__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__List__Group__3_in_rule__List__Group__210836);
            rule__List__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__2"


    // $ANTLR start "rule__List__Group__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5414:1: rule__List__Group__2__Impl : ( ( rule__List__TermsAssignment_2 )* ) ;
    public final void rule__List__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5418:1: ( ( ( rule__List__TermsAssignment_2 )* ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5419:1: ( ( rule__List__TermsAssignment_2 )* )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5419:1: ( ( rule__List__TermsAssignment_2 )* )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5420:1: ( rule__List__TermsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getTermsAssignment_2()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5421:1: ( rule__List__TermsAssignment_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_DOUBLE)||LA23_0==45) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5421:2: rule__List__TermsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__List__TermsAssignment_2_in_rule__List__Group__2__Impl10863);
            	    rule__List__TermsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getTermsAssignment_2()); 
            }

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
    // $ANTLR end "rule__List__Group__2__Impl"


    // $ANTLR start "rule__List__Group__3"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5431:1: rule__List__Group__3 : rule__List__Group__3__Impl ;
    public final void rule__List__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5435:1: ( rule__List__Group__3__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5436:2: rule__List__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__List__Group__3__Impl_in_rule__List__Group__310894);
            rule__List__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__3"


    // $ANTLR start "rule__List__Group__3__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5442:1: rule__List__Group__3__Impl : ( ']' ) ;
    public final void rule__List__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5446:1: ( ( ']' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5447:1: ( ']' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5447:1: ( ']' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5448:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,46,FOLLOW_46_in_rule__List__Group__3__Impl10922); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getRightSquareBracketKeyword_3()); 
            }

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
    // $ANTLR end "rule__List__Group__3__Impl"


    // $ANTLR start "rule__Model__PhraseAssignment"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5472:1: rule__Model__PhraseAssignment : ( rulePhrase ) ;
    public final void rule__Model__PhraseAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5476:1: ( ( rulePhrase ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5477:1: ( rulePhrase )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5477:1: ( rulePhrase )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5478:1: rulePhrase
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPhrasePhraseParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePhrase_in_rule__Model__PhraseAssignment10968);
            rulePhrase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getPhrasePhraseParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Model__PhraseAssignment"


    // $ANTLR start "rule__StatementList__HeadAssignment_0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5487:1: rule__StatementList__HeadAssignment_0 : ( ruleStatement ) ;
    public final void rule__StatementList__HeadAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5491:1: ( ( ruleStatement ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5492:1: ( ruleStatement )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5492:1: ( ruleStatement )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5493:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementListAccess().getHeadStatementParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__StatementList__HeadAssignment_010999);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementListAccess().getHeadStatementParserRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__StatementList__HeadAssignment_0"


    // $ANTLR start "rule__StatementList__TailAssignment_2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5502:1: rule__StatementList__TailAssignment_2 : ( ruleStatementList ) ;
    public final void rule__StatementList__TailAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5506:1: ( ( ruleStatementList ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5507:1: ( ruleStatementList )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5507:1: ( ruleStatementList )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5508:1: ruleStatementList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementListAccess().getTailStatementListParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleStatementList_in_rule__StatementList__TailAssignment_211030);
            ruleStatementList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementListAccess().getTailStatementListParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__StatementList__TailAssignment_2"


    // $ANTLR start "rule__VariableAssignmentStatement__DesignatorAssignment_0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5517:1: rule__VariableAssignmentStatement__DesignatorAssignment_0 : ( ruleDesignator ) ;
    public final void rule__VariableAssignmentStatement__DesignatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5521:1: ( ( ruleDesignator ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5522:1: ( ruleDesignator )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5522:1: ( ruleDesignator )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5523:1: ruleDesignator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAssignmentStatementAccess().getDesignatorDesignatorParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleDesignator_in_rule__VariableAssignmentStatement__DesignatorAssignment_011061);
            ruleDesignator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAssignmentStatementAccess().getDesignatorDesignatorParserRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__VariableAssignmentStatement__DesignatorAssignment_0"


    // $ANTLR start "rule__VariableAssignmentStatement__ExpressionAssignment_2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5532:1: rule__VariableAssignmentStatement__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__VariableAssignmentStatement__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5536:1: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5537:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5537:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5538:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAssignmentStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__VariableAssignmentStatement__ExpressionAssignment_211092);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAssignmentStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__VariableAssignmentStatement__ExpressionAssignment_2"


    // $ANTLR start "rule__SelfAssignmentStatement__ExpressionAssignment_2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5547:1: rule__SelfAssignmentStatement__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__SelfAssignmentStatement__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5551:1: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5552:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5552:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5553:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfAssignmentStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__SelfAssignmentStatement__ExpressionAssignment_211123);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelfAssignmentStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__SelfAssignmentStatement__ExpressionAssignment_2"


    // $ANTLR start "rule__OrExpression__OpAssignment_2_0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5562:1: rule__OrExpression__OpAssignment_2_0 : ( ( 'OR' ) ) ;
    public final void rule__OrExpression__OpAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5566:1: ( ( ( 'OR' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5567:1: ( ( 'OR' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5567:1: ( ( 'OR' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5568:1: ( 'OR' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOpORKeyword_2_0_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5569:1: ( 'OR' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5570:1: 'OR'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOpORKeyword_2_0_0()); 
            }
            match(input,47,FOLLOW_47_in_rule__OrExpression__OpAssignment_2_011159); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOpORKeyword_2_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOpORKeyword_2_0_0()); 
            }

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
    // $ANTLR end "rule__OrExpression__OpAssignment_2_0"


    // $ANTLR start "rule__OrExpression__RightAssignment_2_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5585:1: rule__OrExpression__RightAssignment_2_1 : ( ruleOrExpression ) ;
    public final void rule__OrExpression__RightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5589:1: ( ( ruleOrExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5590:1: ( ruleOrExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5590:1: ( ruleOrExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5591:1: ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getRightOrExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleOrExpression_in_rule__OrExpression__RightAssignment_2_111198);
            ruleOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getRightOrExpressionParserRuleCall_2_1_0()); 
            }

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
    // $ANTLR end "rule__OrExpression__RightAssignment_2_1"


    // $ANTLR start "rule__AndExpression__OpAssignment_2_0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5600:1: rule__AndExpression__OpAssignment_2_0 : ( ( 'AND' ) ) ;
    public final void rule__AndExpression__OpAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5604:1: ( ( ( 'AND' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5605:1: ( ( 'AND' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5605:1: ( ( 'AND' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5606:1: ( 'AND' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOpANDKeyword_2_0_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5607:1: ( 'AND' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5608:1: 'AND'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOpANDKeyword_2_0_0()); 
            }
            match(input,48,FOLLOW_48_in_rule__AndExpression__OpAssignment_2_011234); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getOpANDKeyword_2_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getOpANDKeyword_2_0_0()); 
            }

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
    // $ANTLR end "rule__AndExpression__OpAssignment_2_0"


    // $ANTLR start "rule__AndExpression__RightAssignment_2_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5623:1: rule__AndExpression__RightAssignment_2_1 : ( ruleAndExpression ) ;
    public final void rule__AndExpression__RightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5627:1: ( ( ruleAndExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5628:1: ( ruleAndExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5628:1: ( ruleAndExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5629:1: ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getRightAndExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_rule__AndExpression__RightAssignment_2_111273);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getRightAndExpressionParserRuleCall_2_1_0()); 
            }

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
    // $ANTLR end "rule__AndExpression__RightAssignment_2_1"


    // $ANTLR start "rule__EqualityExpression__OpAssignment_2_0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5638:1: rule__EqualityExpression__OpAssignment_2_0 : ( ( rule__EqualityExpression__OpAlternatives_2_0_0 ) ) ;
    public final void rule__EqualityExpression__OpAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5642:1: ( ( ( rule__EqualityExpression__OpAlternatives_2_0_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5643:1: ( ( rule__EqualityExpression__OpAlternatives_2_0_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5643:1: ( ( rule__EqualityExpression__OpAlternatives_2_0_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5644:1: ( rule__EqualityExpression__OpAlternatives_2_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getOpAlternatives_2_0_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5645:1: ( rule__EqualityExpression__OpAlternatives_2_0_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5645:2: rule__EqualityExpression__OpAlternatives_2_0_0
            {
            pushFollow(FOLLOW_rule__EqualityExpression__OpAlternatives_2_0_0_in_rule__EqualityExpression__OpAssignment_2_011304);
            rule__EqualityExpression__OpAlternatives_2_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getOpAlternatives_2_0_0()); 
            }

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
    // $ANTLR end "rule__EqualityExpression__OpAssignment_2_0"


    // $ANTLR start "rule__EqualityExpression__RightAssignment_2_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5654:1: rule__EqualityExpression__RightAssignment_2_1 : ( ruleEqualityExpression ) ;
    public final void rule__EqualityExpression__RightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5658:1: ( ( ruleEqualityExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5659:1: ( ruleEqualityExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5659:1: ( ruleEqualityExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5660:1: ruleEqualityExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getRightEqualityExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleEqualityExpression_in_rule__EqualityExpression__RightAssignment_2_111337);
            ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getRightEqualityExpressionParserRuleCall_2_1_0()); 
            }

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
    // $ANTLR end "rule__EqualityExpression__RightAssignment_2_1"


    // $ANTLR start "rule__DashExpression__OpAssignment_2_0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5669:1: rule__DashExpression__OpAssignment_2_0 : ( ( rule__DashExpression__OpAlternatives_2_0_0 ) ) ;
    public final void rule__DashExpression__OpAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5673:1: ( ( ( rule__DashExpression__OpAlternatives_2_0_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5674:1: ( ( rule__DashExpression__OpAlternatives_2_0_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5674:1: ( ( rule__DashExpression__OpAlternatives_2_0_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5675:1: ( rule__DashExpression__OpAlternatives_2_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDashExpressionAccess().getOpAlternatives_2_0_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5676:1: ( rule__DashExpression__OpAlternatives_2_0_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5676:2: rule__DashExpression__OpAlternatives_2_0_0
            {
            pushFollow(FOLLOW_rule__DashExpression__OpAlternatives_2_0_0_in_rule__DashExpression__OpAssignment_2_011368);
            rule__DashExpression__OpAlternatives_2_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDashExpressionAccess().getOpAlternatives_2_0_0()); 
            }

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
    // $ANTLR end "rule__DashExpression__OpAssignment_2_0"


    // $ANTLR start "rule__DashExpression__RightAssignment_2_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5685:1: rule__DashExpression__RightAssignment_2_1 : ( ruleDashExpression ) ;
    public final void rule__DashExpression__RightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5689:1: ( ( ruleDashExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5690:1: ( ruleDashExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5690:1: ( ruleDashExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5691:1: ruleDashExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDashExpressionAccess().getRightDashExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleDashExpression_in_rule__DashExpression__RightAssignment_2_111401);
            ruleDashExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDashExpressionAccess().getRightDashExpressionParserRuleCall_2_1_0()); 
            }

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
    // $ANTLR end "rule__DashExpression__RightAssignment_2_1"


    // $ANTLR start "rule__PointExpression__OpAssignment_2_0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5700:1: rule__PointExpression__OpAssignment_2_0 : ( ( rule__PointExpression__OpAlternatives_2_0_0 ) ) ;
    public final void rule__PointExpression__OpAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5704:1: ( ( ( rule__PointExpression__OpAlternatives_2_0_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5705:1: ( ( rule__PointExpression__OpAlternatives_2_0_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5705:1: ( ( rule__PointExpression__OpAlternatives_2_0_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5706:1: ( rule__PointExpression__OpAlternatives_2_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointExpressionAccess().getOpAlternatives_2_0_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5707:1: ( rule__PointExpression__OpAlternatives_2_0_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5707:2: rule__PointExpression__OpAlternatives_2_0_0
            {
            pushFollow(FOLLOW_rule__PointExpression__OpAlternatives_2_0_0_in_rule__PointExpression__OpAssignment_2_011432);
            rule__PointExpression__OpAlternatives_2_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointExpressionAccess().getOpAlternatives_2_0_0()); 
            }

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
    // $ANTLR end "rule__PointExpression__OpAssignment_2_0"


    // $ANTLR start "rule__PointExpression__RightAssignment_2_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5716:1: rule__PointExpression__RightAssignment_2_1 : ( rulePointExpression ) ;
    public final void rule__PointExpression__RightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5720:1: ( ( rulePointExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5721:1: ( rulePointExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5721:1: ( rulePointExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5722:1: rulePointExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointExpressionAccess().getRightPointExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_rulePointExpression_in_rule__PointExpression__RightAssignment_2_111465);
            rulePointExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointExpressionAccess().getRightPointExpressionParserRuleCall_2_1_0()); 
            }

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
    // $ANTLR end "rule__PointExpression__RightAssignment_2_1"


    // $ANTLR start "rule__PowExpression__OpAssignment_2_0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5731:1: rule__PowExpression__OpAssignment_2_0 : ( ( '^' ) ) ;
    public final void rule__PowExpression__OpAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5735:1: ( ( ( '^' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5736:1: ( ( '^' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5736:1: ( ( '^' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5737:1: ( '^' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowExpressionAccess().getOpCircumflexAccentKeyword_2_0_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5738:1: ( '^' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5739:1: '^'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowExpressionAccess().getOpCircumflexAccentKeyword_2_0_0()); 
            }
            match(input,49,FOLLOW_49_in_rule__PowExpression__OpAssignment_2_011501); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowExpressionAccess().getOpCircumflexAccentKeyword_2_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowExpressionAccess().getOpCircumflexAccentKeyword_2_0_0()); 
            }

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
    // $ANTLR end "rule__PowExpression__OpAssignment_2_0"


    // $ANTLR start "rule__PowExpression__RightAssignment_2_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5754:1: rule__PowExpression__RightAssignment_2_1 : ( rulePowExpression ) ;
    public final void rule__PowExpression__RightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5758:1: ( ( rulePowExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5759:1: ( rulePowExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5759:1: ( rulePowExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5760:1: rulePowExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowExpressionAccess().getRightPowExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_rulePowExpression_in_rule__PowExpression__RightAssignment_2_111540);
            rulePowExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowExpressionAccess().getRightPowExpressionParserRuleCall_2_1_0()); 
            }

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
    // $ANTLR end "rule__PowExpression__RightAssignment_2_1"


    // $ANTLR start "rule__QualifierExpression__OpAssignment_2_0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5769:1: rule__QualifierExpression__OpAssignment_2_0 : ( ( '.' ) ) ;
    public final void rule__QualifierExpression__OpAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5773:1: ( ( ( '.' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5774:1: ( ( '.' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5774:1: ( ( '.' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5775:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifierExpressionAccess().getOpFullStopKeyword_2_0_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5776:1: ( '.' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5777:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifierExpressionAccess().getOpFullStopKeyword_2_0_0()); 
            }
            match(input,50,FOLLOW_50_in_rule__QualifierExpression__OpAssignment_2_011576); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifierExpressionAccess().getOpFullStopKeyword_2_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifierExpressionAccess().getOpFullStopKeyword_2_0_0()); 
            }

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
    // $ANTLR end "rule__QualifierExpression__OpAssignment_2_0"


    // $ANTLR start "rule__QualifierExpression__RightAssignment_2_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5792:1: rule__QualifierExpression__RightAssignment_2_1 : ( ruleQualifierExpression ) ;
    public final void rule__QualifierExpression__RightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5796:1: ( ( ruleQualifierExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5797:1: ( ruleQualifierExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5797:1: ( ruleQualifierExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5798:1: ruleQualifierExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifierExpressionAccess().getRightQualifierExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifierExpression_in_rule__QualifierExpression__RightAssignment_2_111615);
            ruleQualifierExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifierExpressionAccess().getRightQualifierExpressionParserRuleCall_2_1_0()); 
            }

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
    // $ANTLR end "rule__QualifierExpression__RightAssignment_2_1"


    // $ANTLR start "rule__FunctionCall__FunctionAssignment_0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5807:1: rule__FunctionCall__FunctionAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionCall__FunctionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5811:1: ( ( ( RULE_ID ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5812:1: ( ( RULE_ID ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5812:1: ( ( RULE_ID ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5813:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFunctionFunctionCrossReference_0_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5814:1: ( RULE_ID )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5815:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFunctionFunctionIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionCall__FunctionAssignment_011650); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getFunctionFunctionIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getFunctionFunctionCrossReference_0_0()); 
            }

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
    // $ANTLR end "rule__FunctionCall__FunctionAssignment_0"


    // $ANTLR start "rule__FunctionCall__ParamsAssignment_2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5826:1: rule__FunctionCall__ParamsAssignment_2 : ( ruleExpressionList ) ;
    public final void rule__FunctionCall__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5830:1: ( ( ruleExpressionList ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5831:1: ( ruleExpressionList )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5831:1: ( ruleExpressionList )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5832:1: ruleExpressionList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParamsExpressionListParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpressionList_in_rule__FunctionCall__ParamsAssignment_211685);
            ruleExpressionList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getParamsExpressionListParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__FunctionCall__ParamsAssignment_2"


    // $ANTLR start "rule__ExpressionList__HeadAssignment_0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5843:1: rule__ExpressionList__HeadAssignment_0 : ( ruleExpression ) ;
    public final void rule__ExpressionList__HeadAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5847:1: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5848:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5848:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5849:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionListAccess().getHeadExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ExpressionList__HeadAssignment_011718);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionListAccess().getHeadExpressionParserRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__ExpressionList__HeadAssignment_0"


    // $ANTLR start "rule__ExpressionList__TailAssignment_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5858:1: rule__ExpressionList__TailAssignment_1 : ( ruleExpressionRest ) ;
    public final void rule__ExpressionList__TailAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5862:1: ( ( ruleExpressionRest ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5863:1: ( ruleExpressionRest )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5863:1: ( ruleExpressionRest )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5864:1: ruleExpressionRest
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionListAccess().getTailExpressionRestParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpressionRest_in_rule__ExpressionList__TailAssignment_111749);
            ruleExpressionRest();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionListAccess().getTailExpressionRestParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__ExpressionList__TailAssignment_1"


    // $ANTLR start "rule__ListExpression__ExprAssignment_0_1_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5873:1: rule__ListExpression__ExprAssignment_0_1_1 : ( ruleListValue ) ;
    public final void rule__ListExpression__ExprAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5877:1: ( ( ruleListValue ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5878:1: ( ruleListValue )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5878:1: ( ruleListValue )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5879:1: ruleListValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_0_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_0_1_111780);
            ruleListValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_0_1_1_0()); 
            }

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
    // $ANTLR end "rule__ListExpression__ExprAssignment_0_1_1"


    // $ANTLR start "rule__ListExpression__ExprAssignment_1_1_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5888:1: rule__ListExpression__ExprAssignment_1_1_1 : ( ruleListValue ) ;
    public final void rule__ListExpression__ExprAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5892:1: ( ( ruleListValue ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5893:1: ( ruleListValue )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5893:1: ( ruleListValue )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5894:1: ruleListValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_1_1_111811);
            ruleListValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_1_1_1_0()); 
            }

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
    // $ANTLR end "rule__ListExpression__ExprAssignment_1_1_1"


    // $ANTLR start "rule__ListExpression__ExprAssignment_2_1_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5903:1: rule__ListExpression__ExprAssignment_2_1_1 : ( ruleListValue ) ;
    public final void rule__ListExpression__ExprAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5907:1: ( ( ruleListValue ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5908:1: ( ruleListValue )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5908:1: ( ruleListValue )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5909:1: ruleListValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_2_1_111842);
            ruleListValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_2_1_1_0()); 
            }

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
    // $ANTLR end "rule__ListExpression__ExprAssignment_2_1_1"


    // $ANTLR start "rule__ListExpression__ExprAssignment_3_1_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5918:1: rule__ListExpression__ExprAssignment_3_1_1 : ( ruleListValue ) ;
    public final void rule__ListExpression__ExprAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5922:1: ( ( ruleListValue ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5923:1: ( ruleListValue )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5923:1: ( ruleListValue )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5924:1: ruleListValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_3_1_111873);
            ruleListValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_3_1_1_0()); 
            }

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
    // $ANTLR end "rule__ListExpression__ExprAssignment_3_1_1"


    // $ANTLR start "rule__ListExpression__ExprAssignment_4_1_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5933:1: rule__ListExpression__ExprAssignment_4_1_1 : ( ruleListValue ) ;
    public final void rule__ListExpression__ExprAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5937:1: ( ( ruleListValue ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5938:1: ( ruleListValue )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5938:1: ( ruleListValue )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5939:1: ruleListValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_4_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_4_1_111904);
            ruleListValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_4_1_1_0()); 
            }

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
    // $ANTLR end "rule__ListExpression__ExprAssignment_4_1_1"


    // $ANTLR start "rule__ListExpression__ExprAssignment_5_1_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5948:1: rule__ListExpression__ExprAssignment_5_1_1 : ( ruleListValue ) ;
    public final void rule__ListExpression__ExprAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5952:1: ( ( ruleListValue ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5953:1: ( ruleListValue )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5953:1: ( ruleListValue )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5954:1: ruleListValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_5_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_5_1_111935);
            ruleListValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_5_1_1_0()); 
            }

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
    // $ANTLR end "rule__ListExpression__ExprAssignment_5_1_1"


    // $ANTLR start "rule__ListExpression__UsingExprAssignment_5_1_3"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5963:1: rule__ListExpression__UsingExprAssignment_5_1_3 : ( ruleExpression ) ;
    public final void rule__ListExpression__UsingExprAssignment_5_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5967:1: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5968:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5968:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5969:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getUsingExprExpressionParserRuleCall_5_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ListExpression__UsingExprAssignment_5_1_311966);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getUsingExprExpressionParserRuleCall_5_1_3_0()); 
            }

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
    // $ANTLR end "rule__ListExpression__UsingExprAssignment_5_1_3"


    // $ANTLR start "rule__ListExpression__InitValueAssignment_5_1_5"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5978:1: rule__ListExpression__InitValueAssignment_5_1_5 : ( ruleExpression ) ;
    public final void rule__ListExpression__InitValueAssignment_5_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5982:1: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5983:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5983:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5984:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getInitValueExpressionParserRuleCall_5_1_5_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ListExpression__InitValueAssignment_5_1_511997);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getInitValueExpressionParserRuleCall_5_1_5_0()); 
            }

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
    // $ANTLR end "rule__ListExpression__InitValueAssignment_5_1_5"


    // $ANTLR start "rule__ListExpression__ExprAssignment_6_1_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5993:1: rule__ListExpression__ExprAssignment_6_1_1 : ( ruleListValue ) ;
    public final void rule__ListExpression__ExprAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5997:1: ( ( ruleListValue ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5998:1: ( ruleListValue )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5998:1: ( ruleListValue )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5999:1: ruleListValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_6_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_6_1_112028);
            ruleListValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_6_1_1_0()); 
            }

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
    // $ANTLR end "rule__ListExpression__ExprAssignment_6_1_1"


    // $ANTLR start "rule__ListExpression__UsingExprAssignment_6_1_3"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6008:1: rule__ListExpression__UsingExprAssignment_6_1_3 : ( ruleExpression ) ;
    public final void rule__ListExpression__UsingExprAssignment_6_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6012:1: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6013:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6013:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6014:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getUsingExprExpressionParserRuleCall_6_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ListExpression__UsingExprAssignment_6_1_312059);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getUsingExprExpressionParserRuleCall_6_1_3_0()); 
            }

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
    // $ANTLR end "rule__ListExpression__UsingExprAssignment_6_1_3"


    // $ANTLR start "rule__ListExpression__ExprAssignment_7_1_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6023:1: rule__ListExpression__ExprAssignment_7_1_1 : ( ruleListValue ) ;
    public final void rule__ListExpression__ExprAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6027:1: ( ( ruleListValue ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6028:1: ( ruleListValue )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6028:1: ( ruleListValue )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6029:1: ruleListValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_7_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_7_1_112090);
            ruleListValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_7_1_1_0()); 
            }

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
    // $ANTLR end "rule__ListExpression__ExprAssignment_7_1_1"


    // $ANTLR start "rule__ListExpression__UsingExprAssignment_7_1_3"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6038:1: rule__ListExpression__UsingExprAssignment_7_1_3 : ( ruleExpression ) ;
    public final void rule__ListExpression__UsingExprAssignment_7_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6042:1: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6043:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6043:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6044:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getUsingExprExpressionParserRuleCall_7_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ListExpression__UsingExprAssignment_7_1_312121);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getUsingExprExpressionParserRuleCall_7_1_3_0()); 
            }

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
    // $ANTLR end "rule__ListExpression__UsingExprAssignment_7_1_3"


    // $ANTLR start "rule__ListExpression__ApplyExprAssignment_8_1_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6053:1: rule__ListExpression__ApplyExprAssignment_8_1_1 : ( ruleExpression ) ;
    public final void rule__ListExpression__ApplyExprAssignment_8_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6057:1: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6058:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6058:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6059:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getApplyExprExpressionParserRuleCall_8_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ListExpression__ApplyExprAssignment_8_1_112152);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getApplyExprExpressionParserRuleCall_8_1_1_0()); 
            }

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
    // $ANTLR end "rule__ListExpression__ApplyExprAssignment_8_1_1"


    // $ANTLR start "rule__ListExpression__ExprAssignment_8_1_3"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6068:1: rule__ListExpression__ExprAssignment_8_1_3 : ( ruleListValue ) ;
    public final void rule__ListExpression__ExprAssignment_8_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6072:1: ( ( ruleListValue ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6073:1: ( ruleListValue )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6073:1: ( ruleListValue )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6074:1: ruleListValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_8_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_8_1_312183);
            ruleListValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_8_1_3_0()); 
            }

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
    // $ANTLR end "rule__ListExpression__ExprAssignment_8_1_3"


    // $ANTLR start "rule__ListValue__ConditionAssignment_1_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6083:1: rule__ListValue__ConditionAssignment_1_1 : ( ruleCondition ) ;
    public final void rule__ListValue__ConditionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6087:1: ( ( ruleCondition ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6088:1: ( ruleCondition )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6088:1: ( ruleCondition )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6089:1: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListValueAccess().getConditionConditionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCondition_in_rule__ListValue__ConditionAssignment_1_112214);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListValueAccess().getConditionConditionParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__ListValue__ConditionAssignment_1_1"


    // $ANTLR start "rule__UnaryExpression__StructuredExpressionAssignment_0_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6098:1: rule__UnaryExpression__StructuredExpressionAssignment_0_1 : ( ruleStructureExpression ) ;
    public final void rule__UnaryExpression__StructuredExpressionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6102:1: ( ( ruleStructureExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6103:1: ( ruleStructureExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6103:1: ( ruleStructureExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6104:1: ruleStructureExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getStructuredExpressionStructureExpressionParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleStructureExpression_in_rule__UnaryExpression__StructuredExpressionAssignment_0_112245);
            ruleStructureExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getStructuredExpressionStructureExpressionParserRuleCall_0_1_0()); 
            }

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
    // $ANTLR end "rule__UnaryExpression__StructuredExpressionAssignment_0_1"


    // $ANTLR start "rule__UnaryExpression__StructuredExpressionAssignment_1_4"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6113:1: rule__UnaryExpression__StructuredExpressionAssignment_1_4 : ( ruleStructureExpression ) ;
    public final void rule__UnaryExpression__StructuredExpressionAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6117:1: ( ( ruleStructureExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6118:1: ( ruleStructureExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6118:1: ( ruleStructureExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6119:1: ruleStructureExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getStructuredExpressionStructureExpressionParserRuleCall_1_4_0()); 
            }
            pushFollow(FOLLOW_ruleStructureExpression_in_rule__UnaryExpression__StructuredExpressionAssignment_1_412276);
            ruleStructureExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getStructuredExpressionStructureExpressionParserRuleCall_1_4_0()); 
            }

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
    // $ANTLR end "rule__UnaryExpression__StructuredExpressionAssignment_1_4"


    // $ANTLR start "rule__UnaryExpression__StructuredExpressionAssignment_2_4"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6128:1: rule__UnaryExpression__StructuredExpressionAssignment_2_4 : ( ruleStructureExpression ) ;
    public final void rule__UnaryExpression__StructuredExpressionAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6132:1: ( ( ruleStructureExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6133:1: ( ruleStructureExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6133:1: ( ruleStructureExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6134:1: ruleStructureExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getStructuredExpressionStructureExpressionParserRuleCall_2_4_0()); 
            }
            pushFollow(FOLLOW_ruleStructureExpression_in_rule__UnaryExpression__StructuredExpressionAssignment_2_412307);
            ruleStructureExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getStructuredExpressionStructureExpressionParserRuleCall_2_4_0()); 
            }

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
    // $ANTLR end "rule__UnaryExpression__StructuredExpressionAssignment_2_4"


    // $ANTLR start "rule__StructureExpression__KeyValuePairAssignment_1_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6143:1: rule__StructureExpression__KeyValuePairAssignment_1_1 : ( ruleKeyValuePair ) ;
    public final void rule__StructureExpression__KeyValuePairAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6147:1: ( ( ruleKeyValuePair ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6148:1: ( ruleKeyValuePair )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6148:1: ( ruleKeyValuePair )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6149:1: ruleKeyValuePair
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructureExpressionAccess().getKeyValuePairKeyValuePairParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleKeyValuePair_in_rule__StructureExpression__KeyValuePairAssignment_1_112338);
            ruleKeyValuePair();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStructureExpressionAccess().getKeyValuePairKeyValuePairParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__StructureExpression__KeyValuePairAssignment_1_1"


    // $ANTLR start "rule__StructureExpression__StructuredExpressionsAssignment_1_3"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6158:1: rule__StructureExpression__StructuredExpressionsAssignment_1_3 : ( ruleStructureExpression ) ;
    public final void rule__StructureExpression__StructuredExpressionsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6162:1: ( ( ruleStructureExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6163:1: ( ruleStructureExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6163:1: ( ruleStructureExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6164:1: ruleStructureExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructureExpressionAccess().getStructuredExpressionsStructureExpressionParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleStructureExpression_in_rule__StructureExpression__StructuredExpressionsAssignment_1_312369);
            ruleStructureExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStructureExpressionAccess().getStructuredExpressionsStructureExpressionParserRuleCall_1_3_0()); 
            }

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
    // $ANTLR end "rule__StructureExpression__StructuredExpressionsAssignment_1_3"


    // $ANTLR start "rule__KeyValuePair__KeyAssignment_0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6173:1: rule__KeyValuePair__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__KeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6177:1: ( ( RULE_ID ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6178:1: ( RULE_ID )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6178:1: ( RULE_ID )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6179:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getKeyIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__KeyValuePair__KeyAssignment_012400); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyValuePairAccess().getKeyIDTerminalRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__KeyValuePair__KeyAssignment_0"


    // $ANTLR start "rule__KeyValuePair__ValueAssignment_2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6188:1: rule__KeyValuePair__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__KeyValuePair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6192:1: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6193:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6193:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6194:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getValueExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__KeyValuePair__ValueAssignment_212431);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyValuePairAccess().getValueExpressionParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__KeyValuePair__ValueAssignment_2"


    // $ANTLR start "rule__KeyValuePair__RestAssignment_3"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6203:1: rule__KeyValuePair__RestAssignment_3 : ( ruleKeyValuePairRest ) ;
    public final void rule__KeyValuePair__RestAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6207:1: ( ( ruleKeyValuePairRest ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6208:1: ( ruleKeyValuePairRest )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6208:1: ( ruleKeyValuePairRest )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6209:1: ruleKeyValuePairRest
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getRestKeyValuePairRestParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleKeyValuePairRest_in_rule__KeyValuePair__RestAssignment_312462);
            ruleKeyValuePairRest();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyValuePairAccess().getRestKeyValuePairRestParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__KeyValuePair__RestAssignment_3"


    // $ANTLR start "rule__Term__ValueAssignment_1_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6218:1: rule__Term__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Term__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6222:1: ( ( RULE_STRING ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6223:1: ( RULE_STRING )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6223:1: ( RULE_STRING )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6224:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Term__ValueAssignment_1_112493); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__Term__ValueAssignment_1_1"


    // $ANTLR start "rule__Term__ValueAssignment_2_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6233:1: rule__Term__ValueAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Term__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6237:1: ( ( RULE_INT ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6238:1: ( RULE_INT )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6238:1: ( RULE_INT )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6239:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getValueINTTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Term__ValueAssignment_2_112524); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getValueINTTerminalRuleCall_2_1_0()); 
            }

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
    // $ANTLR end "rule__Term__ValueAssignment_2_1"


    // $ANTLR start "rule__Term__ValueAssignment_3_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6248:1: rule__Term__ValueAssignment_3_1 : ( RULE_DOUBLE ) ;
    public final void rule__Term__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6252:1: ( ( RULE_DOUBLE ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6253:1: ( RULE_DOUBLE )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6253:1: ( RULE_DOUBLE )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6254:1: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getValueDOUBLETerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__Term__ValueAssignment_3_112555); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getValueDOUBLETerminalRuleCall_3_1_0()); 
            }

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
    // $ANTLR end "rule__Term__ValueAssignment_3_1"


    // $ANTLR start "rule__List__TermsAssignment_2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6263:1: rule__List__TermsAssignment_2 : ( ruleTerm ) ;
    public final void rule__List__TermsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6267:1: ( ( ruleTerm ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6268:1: ( ruleTerm )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6268:1: ( ruleTerm )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6269:1: ruleTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getTermsTermParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleTerm_in_rule__List__TermsAssignment_212586);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getTermsTermParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__List__TermsAssignment_2"


    // $ANTLR start "rule__Designator__ValueAssignment"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6278:1: rule__Designator__ValueAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Designator__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6282:1: ( ( ( RULE_ID ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6283:1: ( ( RULE_ID ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6283:1: ( ( RULE_ID ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6284:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDesignatorAccess().getValueEObjectCrossReference_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6285:1: ( RULE_ID )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6286:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDesignatorAccess().getValueEObjectIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Designator__ValueAssignment12621); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDesignatorAccess().getValueEObjectIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDesignatorAccess().getValueEObjectCrossReference_0()); 
            }

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
    // $ANTLR end "rule__Designator__ValueAssignment"

    // $ANTLR start synpred27_InternalExpression
    public final void synpred27_InternalExpression_fragment() throws RecognitionException {   
        // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1555:2: ( rule__OrExpression__Group_2__0 )
        // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1555:2: rule__OrExpression__Group_2__0
        {
        pushFollow(FOLLOW_rule__OrExpression__Group_2__0_in_synpred27_InternalExpression3278);
        rule__OrExpression__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalExpression

    // $ANTLR start synpred28_InternalExpression
    public final void synpred28_InternalExpression_fragment() throws RecognitionException {   
        // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1710:2: ( rule__AndExpression__Group_2__0 )
        // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1710:2: rule__AndExpression__Group_2__0
        {
        pushFollow(FOLLOW_rule__AndExpression__Group_2__0_in_synpred28_InternalExpression3583);
        rule__AndExpression__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalExpression

    // $ANTLR start synpred29_InternalExpression
    public final void synpred29_InternalExpression_fragment() throws RecognitionException {   
        // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1865:2: ( rule__EqualityExpression__Group_2__0 )
        // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1865:2: rule__EqualityExpression__Group_2__0
        {
        pushFollow(FOLLOW_rule__EqualityExpression__Group_2__0_in_synpred29_InternalExpression3888);
        rule__EqualityExpression__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalExpression

    // $ANTLR start synpred30_InternalExpression
    public final void synpred30_InternalExpression_fragment() throws RecognitionException {   
        // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2020:2: ( rule__DashExpression__Group_2__0 )
        // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2020:2: rule__DashExpression__Group_2__0
        {
        pushFollow(FOLLOW_rule__DashExpression__Group_2__0_in_synpred30_InternalExpression4193);
        rule__DashExpression__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalExpression

    // $ANTLR start synpred31_InternalExpression
    public final void synpred31_InternalExpression_fragment() throws RecognitionException {   
        // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2175:2: ( rule__PointExpression__Group_2__0 )
        // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2175:2: rule__PointExpression__Group_2__0
        {
        pushFollow(FOLLOW_rule__PointExpression__Group_2__0_in_synpred31_InternalExpression4498);
        rule__PointExpression__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalExpression

    // $ANTLR start synpred32_InternalExpression
    public final void synpred32_InternalExpression_fragment() throws RecognitionException {   
        // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2330:2: ( rule__PowExpression__Group_2__0 )
        // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2330:2: rule__PowExpression__Group_2__0
        {
        pushFollow(FOLLOW_rule__PowExpression__Group_2__0_in_synpred32_InternalExpression4803);
        rule__PowExpression__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalExpression

    // $ANTLR start synpred33_InternalExpression
    public final void synpred33_InternalExpression_fragment() throws RecognitionException {   
        // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2485:2: ( rule__QualifierExpression__Group_2__0 )
        // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2485:2: rule__QualifierExpression__Group_2__0
        {
        pushFollow(FOLLOW_rule__QualifierExpression__Group_2__0_in_synpred33_InternalExpression5108);
        rule__QualifierExpression__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalExpression

    // $ANTLR start synpred36_InternalExpression
    public final void synpred36_InternalExpression_fragment() throws RecognitionException {   
        // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4315:2: ( rule__ListValue__Group_1__0 )
        // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4315:2: rule__ListValue__Group_1__0
        {
        pushFollow(FOLLOW_rule__ListValue__Group_1__0_in_synpred36_InternalExpression8700);
        rule__ListValue__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_InternalExpression

    // Delegated rules

    public final boolean synpred28_InternalExpression() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalExpression_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalExpression() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalExpression_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalExpression() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalExpression_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalExpression() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalExpression_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalExpression() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalExpression_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalExpression() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalExpression_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_InternalExpression() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalExpression_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalExpression() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalExpression_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PhraseAssignment_in_ruleModel100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhrase_in_entryRulePhrase127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhrase134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phrase__Alternatives_in_rulePhrase160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementList_in_entryRuleStatementList187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatementList194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementList__Group__0_in_ruleStatementList220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentStatement_in_ruleStatement280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentStatement_in_entryRuleAssignmentStatement306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentStatement313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentStatement__Alternatives_in_ruleAssignmentStatement339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignmentStatement_in_entryRuleVariableAssignmentStatement366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAssignmentStatement373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignmentStatement__Group__0_in_ruleVariableAssignmentStatement399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfAssignmentStatement_in_entryRuleSelfAssignmentStatement426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelfAssignmentStatement433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfAssignmentStatement__Group__0_in_ruleSelfAssignmentStatement459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleExpression519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualityExpression672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group__0_in_ruleEqualityExpression698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDashExpression_in_entryRuleDashExpression725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDashExpression732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashExpression__Group__0_in_ruleDashExpression758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointExpression_in_entryRulePointExpression785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePointExpression792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointExpression__Group__0_in_rulePointExpression818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowExpression_in_entryRulePowExpression845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePowExpression852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowExpression__Group__0_in_rulePowExpression878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifierExpression_in_entryRuleQualifierExpression905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifierExpression912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifierExpression__Group__0_in_ruleQualifierExpression938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall1025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__0_in_ruleFunctionCall1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionList_in_entryRuleExpressionList1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionList1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionList__Group__0_in_ruleExpressionList1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionRest_in_entryRuleExpressionRest1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionRest1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionRest__Group__0_in_ruleExpressionRest1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListExpression_in_entryRuleListExpression1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListExpression1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Alternatives_in_ruleListExpression1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListValue_in_entryRuleListValue1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListValue1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListValue__Group__0_in_ruleListValue1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCondition1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression1386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Alternatives_in_ruleUnaryExpression1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_entryRuleStructureExpression1446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructureExpression1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureExpression__Group__0_in_ruleStructureExpression1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyValuePair_in_entryRuleKeyValuePair1506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyValuePair1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValuePair__Group__0_in_ruleKeyValuePair1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyValuePairRest_in_entryRuleKeyValuePairRest1566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyValuePairRest1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValuePairRest__Group__0_in_ruleKeyValuePairRest1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm1626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Alternatives_in_ruleTerm1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_entryRuleList1686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__Group__0_in_ruleList1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesignator_in_entryRuleDesignator1748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDesignator1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Designator__ValueAssignment_in_ruleDesignator1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Phrase__Alternatives1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementList_in_rule__Phrase__Alternatives1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignmentStatement_in_rule__AssignmentStatement__Alternatives1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfAssignmentStatement_in_rule__AssignmentStatement__Alternatives1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__EqualityExpression__OpAlternatives_2_0_01916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__EqualityExpression__OpAlternatives_2_0_01936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EqualityExpression__OpAlternatives_2_0_01956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EqualityExpression__OpAlternatives_2_0_01976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EqualityExpression__OpAlternatives_2_0_01996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EqualityExpression__OpAlternatives_2_0_02016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DashExpression__OpAlternatives_2_0_02051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DashExpression__OpAlternatives_2_0_02071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PointExpression__OpAlternatives_2_0_02106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PointExpression__OpAlternatives_2_0_02126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__PrimaryExpression__Alternatives2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_rule__PrimaryExpression__Alternatives2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListExpression_in_rule__PrimaryExpression__Alternatives2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_0__0_in_rule__ListExpression__Alternatives2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_1__0_in_rule__ListExpression__Alternatives2244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_2__0_in_rule__ListExpression__Alternatives2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_3__0_in_rule__ListExpression__Alternatives2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_4__0_in_rule__ListExpression__Alternatives2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_5__0_in_rule__ListExpression__Alternatives2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_6__0_in_rule__ListExpression__Alternatives2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_7__0_in_rule__ListExpression__Alternatives2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_8__0_in_rule__ListExpression__Alternatives2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_0__0_in_rule__UnaryExpression__Alternatives2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__0_in_rule__UnaryExpression__Alternatives2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__0_in_rule__UnaryExpression__Alternatives2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesignator_in_rule__Term__Alternatives2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0_in_rule__Term__Alternatives2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_2__0_in_rule__Term__Alternatives2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_3__0_in_rule__Term__Alternatives2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_rule__Term__Alternatives2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementList__Group__0__Impl_in_rule__StatementList__Group__02573 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__StatementList__Group__1_in_rule__StatementList__Group__02576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementList__HeadAssignment_0_in_rule__StatementList__Group__0__Impl2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementList__Group__1__Impl_in_rule__StatementList__Group__12633 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__StatementList__Group__2_in_rule__StatementList__Group__12636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__StatementList__Group__1__Impl2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementList__Group__2__Impl_in_rule__StatementList__Group__22695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementList__TailAssignment_2_in_rule__StatementList__Group__2__Impl2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignmentStatement__Group__0__Impl_in_rule__VariableAssignmentStatement__Group__02759 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__VariableAssignmentStatement__Group__1_in_rule__VariableAssignmentStatement__Group__02762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignmentStatement__DesignatorAssignment_0_in_rule__VariableAssignmentStatement__Group__0__Impl2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignmentStatement__Group__1__Impl_in_rule__VariableAssignmentStatement__Group__12819 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__VariableAssignmentStatement__Group__2_in_rule__VariableAssignmentStatement__Group__12822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__VariableAssignmentStatement__Group__1__Impl2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignmentStatement__Group__2__Impl_in_rule__VariableAssignmentStatement__Group__22881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignmentStatement__ExpressionAssignment_2_in_rule__VariableAssignmentStatement__Group__2__Impl2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfAssignmentStatement__Group__0__Impl_in_rule__SelfAssignmentStatement__Group__02944 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__SelfAssignmentStatement__Group__1_in_rule__SelfAssignmentStatement__Group__02947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SelfAssignmentStatement__Group__0__Impl2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfAssignmentStatement__Group__1__Impl_in_rule__SelfAssignmentStatement__Group__13006 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__SelfAssignmentStatement__Group__2_in_rule__SelfAssignmentStatement__Group__13009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SelfAssignmentStatement__Group__1__Impl3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfAssignmentStatement__Group__2__Impl_in_rule__SelfAssignmentStatement__Group__23068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfAssignmentStatement__ExpressionAssignment_2_in_rule__SelfAssignmentStatement__Group__2__Impl3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__03131 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__03134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl3161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__13190 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__2_in_rule__OrExpression__Group__13193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__2__Impl_in_rule__OrExpression__Group__23251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_2__0_in_rule__OrExpression__Group__2__Impl3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_2__0__Impl_in_rule__OrExpression__Group_2__03315 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_2__1_in_rule__OrExpression__Group_2__03318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__OpAssignment_2_0_in_rule__OrExpression__Group_2__0__Impl3345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_2__1__Impl_in_rule__OrExpression__Group_2__13375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__RightAssignment_2_1_in_rule__OrExpression__Group_2__1__Impl3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__03436 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__03439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_rule__AndExpression__Group__0__Impl3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__13495 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__2_in_rule__AndExpression__Group__13498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__2__Impl_in_rule__AndExpression__Group__23556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_2__0_in_rule__AndExpression__Group__2__Impl3583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_2__0__Impl_in_rule__AndExpression__Group_2__03620 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_2__1_in_rule__AndExpression__Group_2__03623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__OpAssignment_2_0_in_rule__AndExpression__Group_2__0__Impl3650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_2__1__Impl_in_rule__AndExpression__Group_2__13680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__RightAssignment_2_1_in_rule__AndExpression__Group_2__1__Impl3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group__0__Impl_in_rule__EqualityExpression__Group__03741 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group__1_in_rule__EqualityExpression__Group__03744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDashExpression_in_rule__EqualityExpression__Group__0__Impl3771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group__1__Impl_in_rule__EqualityExpression__Group__13800 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group__2_in_rule__EqualityExpression__Group__13803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group__2__Impl_in_rule__EqualityExpression__Group__23861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_2__0_in_rule__EqualityExpression__Group__2__Impl3888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_2__0__Impl_in_rule__EqualityExpression__Group_2__03925 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_2__1_in_rule__EqualityExpression__Group_2__03928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__OpAssignment_2_0_in_rule__EqualityExpression__Group_2__0__Impl3955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_2__1__Impl_in_rule__EqualityExpression__Group_2__13985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__RightAssignment_2_1_in_rule__EqualityExpression__Group_2__1__Impl4012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashExpression__Group__0__Impl_in_rule__DashExpression__Group__04046 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__DashExpression__Group__1_in_rule__DashExpression__Group__04049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointExpression_in_rule__DashExpression__Group__0__Impl4076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashExpression__Group__1__Impl_in_rule__DashExpression__Group__14105 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__DashExpression__Group__2_in_rule__DashExpression__Group__14108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashExpression__Group__2__Impl_in_rule__DashExpression__Group__24166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashExpression__Group_2__0_in_rule__DashExpression__Group__2__Impl4193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashExpression__Group_2__0__Impl_in_rule__DashExpression__Group_2__04230 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__DashExpression__Group_2__1_in_rule__DashExpression__Group_2__04233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashExpression__OpAssignment_2_0_in_rule__DashExpression__Group_2__0__Impl4260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashExpression__Group_2__1__Impl_in_rule__DashExpression__Group_2__14290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashExpression__RightAssignment_2_1_in_rule__DashExpression__Group_2__1__Impl4317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointExpression__Group__0__Impl_in_rule__PointExpression__Group__04351 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__PointExpression__Group__1_in_rule__PointExpression__Group__04354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowExpression_in_rule__PointExpression__Group__0__Impl4381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointExpression__Group__1__Impl_in_rule__PointExpression__Group__14410 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__PointExpression__Group__2_in_rule__PointExpression__Group__14413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointExpression__Group__2__Impl_in_rule__PointExpression__Group__24471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointExpression__Group_2__0_in_rule__PointExpression__Group__2__Impl4498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointExpression__Group_2__0__Impl_in_rule__PointExpression__Group_2__04535 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__PointExpression__Group_2__1_in_rule__PointExpression__Group_2__04538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointExpression__OpAssignment_2_0_in_rule__PointExpression__Group_2__0__Impl4565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointExpression__Group_2__1__Impl_in_rule__PointExpression__Group_2__14595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointExpression__RightAssignment_2_1_in_rule__PointExpression__Group_2__1__Impl4622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowExpression__Group__0__Impl_in_rule__PowExpression__Group__04656 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__PowExpression__Group__1_in_rule__PowExpression__Group__04659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifierExpression_in_rule__PowExpression__Group__0__Impl4686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowExpression__Group__1__Impl_in_rule__PowExpression__Group__14715 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__PowExpression__Group__2_in_rule__PowExpression__Group__14718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowExpression__Group__2__Impl_in_rule__PowExpression__Group__24776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowExpression__Group_2__0_in_rule__PowExpression__Group__2__Impl4803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowExpression__Group_2__0__Impl_in_rule__PowExpression__Group_2__04840 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__PowExpression__Group_2__1_in_rule__PowExpression__Group_2__04843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowExpression__OpAssignment_2_0_in_rule__PowExpression__Group_2__0__Impl4870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowExpression__Group_2__1__Impl_in_rule__PowExpression__Group_2__14900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowExpression__RightAssignment_2_1_in_rule__PowExpression__Group_2__1__Impl4927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifierExpression__Group__0__Impl_in_rule__QualifierExpression__Group__04961 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__QualifierExpression__Group__1_in_rule__QualifierExpression__Group__04964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__QualifierExpression__Group__0__Impl4991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifierExpression__Group__1__Impl_in_rule__QualifierExpression__Group__15020 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__QualifierExpression__Group__2_in_rule__QualifierExpression__Group__15023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifierExpression__Group__2__Impl_in_rule__QualifierExpression__Group__25081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifierExpression__Group_2__0_in_rule__QualifierExpression__Group__2__Impl5108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifierExpression__Group_2__0__Impl_in_rule__QualifierExpression__Group_2__05145 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__QualifierExpression__Group_2__1_in_rule__QualifierExpression__Group_2__05148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifierExpression__OpAssignment_2_0_in_rule__QualifierExpression__Group_2__0__Impl5175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifierExpression__Group_2__1__Impl_in_rule__QualifierExpression__Group_2__15205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifierExpression__RightAssignment_2_1_in_rule__QualifierExpression__Group_2__1__Impl5232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__0__Impl_in_rule__FunctionCall__Group__05266 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__1_in_rule__FunctionCall__Group__05269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__FunctionAssignment_0_in_rule__FunctionCall__Group__0__Impl5296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__1__Impl_in_rule__FunctionCall__Group__15326 = new BitSet(new long[]{0x00002273F60000F0L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__2_in_rule__FunctionCall__Group__15329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__FunctionCall__Group__1__Impl5357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__2__Impl_in_rule__FunctionCall__Group__25388 = new BitSet(new long[]{0x00002273F60000F0L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__3_in_rule__FunctionCall__Group__25391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__ParamsAssignment_2_in_rule__FunctionCall__Group__2__Impl5418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__3__Impl_in_rule__FunctionCall__Group__35449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__FunctionCall__Group__3__Impl5477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionList__Group__0__Impl_in_rule__ExpressionList__Group__05517 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ExpressionList__Group__1_in_rule__ExpressionList__Group__05520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionList__HeadAssignment_0_in_rule__ExpressionList__Group__0__Impl5547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionList__Group__1__Impl_in_rule__ExpressionList__Group__15577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionList__TailAssignment_1_in_rule__ExpressionList__Group__1__Impl5604 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__ExpressionRest__Group__0__Impl_in_rule__ExpressionRest__Group__05639 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ExpressionRest__Group__1_in_rule__ExpressionRest__Group__05642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ExpressionRest__Group__0__Impl5670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionRest__Group__1__Impl_in_rule__ExpressionRest__Group__15701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ExpressionRest__Group__1__Impl5728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_0__0__Impl_in_rule__ListExpression__Group_0__05761 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_0__1_in_rule__ListExpression__Group_0__05764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_0__1__Impl_in_rule__ListExpression__Group_0__15822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_0_1__0_in_rule__ListExpression__Group_0__1__Impl5849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_0_1__0__Impl_in_rule__ListExpression__Group_0_1__05883 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_0_1__1_in_rule__ListExpression__Group_0_1__05886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ListExpression__Group_0_1__0__Impl5915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_0_1__1__Impl_in_rule__ListExpression__Group_0_1__15947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__ExprAssignment_0_1_1_in_rule__ListExpression__Group_0_1__1__Impl5974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_1__0__Impl_in_rule__ListExpression__Group_1__06008 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_1__1_in_rule__ListExpression__Group_1__06011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_1__1__Impl_in_rule__ListExpression__Group_1__16069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_1_1__0_in_rule__ListExpression__Group_1__1__Impl6096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_1_1__0__Impl_in_rule__ListExpression__Group_1_1__06130 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_1_1__1_in_rule__ListExpression__Group_1_1__06133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ListExpression__Group_1_1__0__Impl6162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_1_1__1__Impl_in_rule__ListExpression__Group_1_1__16194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__ExprAssignment_1_1_1_in_rule__ListExpression__Group_1_1__1__Impl6221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_2__0__Impl_in_rule__ListExpression__Group_2__06255 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_2__1_in_rule__ListExpression__Group_2__06258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_2__1__Impl_in_rule__ListExpression__Group_2__16316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_2_1__0_in_rule__ListExpression__Group_2__1__Impl6343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_2_1__0__Impl_in_rule__ListExpression__Group_2_1__06377 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_2_1__1_in_rule__ListExpression__Group_2_1__06380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ListExpression__Group_2_1__0__Impl6409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_2_1__1__Impl_in_rule__ListExpression__Group_2_1__16441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__ExprAssignment_2_1_1_in_rule__ListExpression__Group_2_1__1__Impl6468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_3__0__Impl_in_rule__ListExpression__Group_3__06502 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_3__1_in_rule__ListExpression__Group_3__06505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_3__1__Impl_in_rule__ListExpression__Group_3__16563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_3_1__0_in_rule__ListExpression__Group_3__1__Impl6590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_3_1__0__Impl_in_rule__ListExpression__Group_3_1__06624 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_3_1__1_in_rule__ListExpression__Group_3_1__06627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ListExpression__Group_3_1__0__Impl6656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_3_1__1__Impl_in_rule__ListExpression__Group_3_1__16688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__ExprAssignment_3_1_1_in_rule__ListExpression__Group_3_1__1__Impl6715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_4__0__Impl_in_rule__ListExpression__Group_4__06749 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_4__1_in_rule__ListExpression__Group_4__06752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_4__1__Impl_in_rule__ListExpression__Group_4__16810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_4_1__0_in_rule__ListExpression__Group_4__1__Impl6837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_4_1__0__Impl_in_rule__ListExpression__Group_4_1__06871 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_4_1__1_in_rule__ListExpression__Group_4_1__06874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ListExpression__Group_4_1__0__Impl6903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_4_1__1__Impl_in_rule__ListExpression__Group_4_1__16935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__ExprAssignment_4_1_1_in_rule__ListExpression__Group_4_1__1__Impl6962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_5__0__Impl_in_rule__ListExpression__Group_5__06996 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_5__1_in_rule__ListExpression__Group_5__06999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_5__1__Impl_in_rule__ListExpression__Group_5__17057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_5_1__0_in_rule__ListExpression__Group_5__1__Impl7084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_5_1__0__Impl_in_rule__ListExpression__Group_5_1__07118 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_5_1__1_in_rule__ListExpression__Group_5_1__07121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ListExpression__Group_5_1__0__Impl7150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_5_1__1__Impl_in_rule__ListExpression__Group_5_1__17182 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_5_1__2_in_rule__ListExpression__Group_5_1__17185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__ExprAssignment_5_1_1_in_rule__ListExpression__Group_5_1__1__Impl7212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_5_1__2__Impl_in_rule__ListExpression__Group_5_1__27242 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_5_1__3_in_rule__ListExpression__Group_5_1__27245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ListExpression__Group_5_1__2__Impl7273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_5_1__3__Impl_in_rule__ListExpression__Group_5_1__37304 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_5_1__4_in_rule__ListExpression__Group_5_1__37307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__UsingExprAssignment_5_1_3_in_rule__ListExpression__Group_5_1__3__Impl7334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_5_1__4__Impl_in_rule__ListExpression__Group_5_1__47364 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_5_1__5_in_rule__ListExpression__Group_5_1__47367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ListExpression__Group_5_1__4__Impl7395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_5_1__5__Impl_in_rule__ListExpression__Group_5_1__57426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__InitValueAssignment_5_1_5_in_rule__ListExpression__Group_5_1__5__Impl7453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_6__0__Impl_in_rule__ListExpression__Group_6__07495 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_6__1_in_rule__ListExpression__Group_6__07498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_6__1__Impl_in_rule__ListExpression__Group_6__17556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_6_1__0_in_rule__ListExpression__Group_6__1__Impl7583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_6_1__0__Impl_in_rule__ListExpression__Group_6_1__07617 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_6_1__1_in_rule__ListExpression__Group_6_1__07620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ListExpression__Group_6_1__0__Impl7649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_6_1__1__Impl_in_rule__ListExpression__Group_6_1__17681 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_6_1__2_in_rule__ListExpression__Group_6_1__17684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__ExprAssignment_6_1_1_in_rule__ListExpression__Group_6_1__1__Impl7711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_6_1__2__Impl_in_rule__ListExpression__Group_6_1__27741 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_6_1__3_in_rule__ListExpression__Group_6_1__27744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ListExpression__Group_6_1__2__Impl7772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_6_1__3__Impl_in_rule__ListExpression__Group_6_1__37803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__UsingExprAssignment_6_1_3_in_rule__ListExpression__Group_6_1__3__Impl7830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_7__0__Impl_in_rule__ListExpression__Group_7__07868 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_7__1_in_rule__ListExpression__Group_7__07871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_7__1__Impl_in_rule__ListExpression__Group_7__17929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_7_1__0_in_rule__ListExpression__Group_7__1__Impl7956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_7_1__0__Impl_in_rule__ListExpression__Group_7_1__07990 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_7_1__1_in_rule__ListExpression__Group_7_1__07993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ListExpression__Group_7_1__0__Impl8022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_7_1__1__Impl_in_rule__ListExpression__Group_7_1__18054 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_7_1__2_in_rule__ListExpression__Group_7_1__18057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__ExprAssignment_7_1_1_in_rule__ListExpression__Group_7_1__1__Impl8084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_7_1__2__Impl_in_rule__ListExpression__Group_7_1__28114 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_7_1__3_in_rule__ListExpression__Group_7_1__28117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ListExpression__Group_7_1__2__Impl8145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_7_1__3__Impl_in_rule__ListExpression__Group_7_1__38176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__UsingExprAssignment_7_1_3_in_rule__ListExpression__Group_7_1__3__Impl8203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_8__0__Impl_in_rule__ListExpression__Group_8__08241 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_8__1_in_rule__ListExpression__Group_8__08244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_8__1__Impl_in_rule__ListExpression__Group_8__18302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_8_1__0_in_rule__ListExpression__Group_8__1__Impl8329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_8_1__0__Impl_in_rule__ListExpression__Group_8_1__08363 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_8_1__1_in_rule__ListExpression__Group_8_1__08366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ListExpression__Group_8_1__0__Impl8395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_8_1__1__Impl_in_rule__ListExpression__Group_8_1__18427 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_8_1__2_in_rule__ListExpression__Group_8_1__18430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__ApplyExprAssignment_8_1_1_in_rule__ListExpression__Group_8_1__1__Impl8457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_8_1__2__Impl_in_rule__ListExpression__Group_8_1__28487 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_8_1__3_in_rule__ListExpression__Group_8_1__28490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ListExpression__Group_8_1__2__Impl8518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_8_1__3__Impl_in_rule__ListExpression__Group_8_1__38549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__ExprAssignment_8_1_3_in_rule__ListExpression__Group_8_1__3__Impl8576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListValue__Group__0__Impl_in_rule__ListValue__Group__08614 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__ListValue__Group__1_in_rule__ListValue__Group__08617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ListValue__Group__0__Impl8644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListValue__Group__1__Impl_in_rule__ListValue__Group__18673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListValue__Group_1__0_in_rule__ListValue__Group__1__Impl8700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListValue__Group_1__0__Impl_in_rule__ListValue__Group_1__08735 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ListValue__Group_1__1_in_rule__ListValue__Group_1__08738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ListValue__Group_1__0__Impl8767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListValue__Group_1__1__Impl_in_rule__ListValue__Group_1__18799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListValue__ConditionAssignment_1_1_in_rule__ListValue__Group_1__1__Impl8826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_0__0__Impl_in_rule__UnaryExpression__Group_0__08860 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_0__1_in_rule__UnaryExpression__Group_0__08863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__UnaryExpression__Group_0__0__Impl8890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_0__1__Impl_in_rule__UnaryExpression__Group_0__18919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__StructuredExpressionAssignment_0_1_in_rule__UnaryExpression__Group_0__1__Impl8946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__0__Impl_in_rule__UnaryExpression__Group_1__08980 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__1_in_rule__UnaryExpression__Group_1__08983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__UnaryExpression__Group_1__0__Impl9011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__1__Impl_in_rule__UnaryExpression__Group_1__19042 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__2_in_rule__UnaryExpression__Group_1__19045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__UnaryExpression__Group_1__1__Impl9072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__2__Impl_in_rule__UnaryExpression__Group_1__29101 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__3_in_rule__UnaryExpression__Group_1__29104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__UnaryExpression__Group_1__2__Impl9132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__3__Impl_in_rule__UnaryExpression__Group_1__39163 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__4_in_rule__UnaryExpression__Group_1__39166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__4__Impl_in_rule__UnaryExpression__Group_1__49224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__StructuredExpressionAssignment_1_4_in_rule__UnaryExpression__Group_1__4__Impl9251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__0__Impl_in_rule__UnaryExpression__Group_2__09291 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__1_in_rule__UnaryExpression__Group_2__09294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__UnaryExpression__Group_2__0__Impl9322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__1__Impl_in_rule__UnaryExpression__Group_2__19353 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__2_in_rule__UnaryExpression__Group_2__19356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__UnaryExpression__Group_2__1__Impl9383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__2__Impl_in_rule__UnaryExpression__Group_2__29412 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__3_in_rule__UnaryExpression__Group_2__29415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__UnaryExpression__Group_2__2__Impl9443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__3__Impl_in_rule__UnaryExpression__Group_2__39474 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__4_in_rule__UnaryExpression__Group_2__39477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__4__Impl_in_rule__UnaryExpression__Group_2__49535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__StructuredExpressionAssignment_2_4_in_rule__UnaryExpression__Group_2__4__Impl9562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureExpression__Group__0__Impl_in_rule__StructureExpression__Group__09602 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__StructureExpression__Group__1_in_rule__StructureExpression__Group__09605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureExpression__Group__1__Impl_in_rule__StructureExpression__Group__19663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureExpression__Group_1__0_in_rule__StructureExpression__Group__1__Impl9690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureExpression__Group_1__0__Impl_in_rule__StructureExpression__Group_1__09725 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StructureExpression__Group_1__1_in_rule__StructureExpression__Group_1__09728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__StructureExpression__Group_1__0__Impl9756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureExpression__Group_1__1__Impl_in_rule__StructureExpression__Group_1__19787 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__StructureExpression__Group_1__2_in_rule__StructureExpression__Group_1__19790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureExpression__KeyValuePairAssignment_1_1_in_rule__StructureExpression__Group_1__1__Impl9817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureExpression__Group_1__2__Impl_in_rule__StructureExpression__Group_1__29847 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__StructureExpression__Group_1__3_in_rule__StructureExpression__Group_1__29850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__StructureExpression__Group_1__2__Impl9878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureExpression__Group_1__3__Impl_in_rule__StructureExpression__Group_1__39909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureExpression__StructuredExpressionsAssignment_1_3_in_rule__StructureExpression__Group_1__3__Impl9936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValuePair__Group__0__Impl_in_rule__KeyValuePair__Group__09974 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__KeyValuePair__Group__1_in_rule__KeyValuePair__Group__09977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValuePair__KeyAssignment_0_in_rule__KeyValuePair__Group__0__Impl10004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValuePair__Group__1__Impl_in_rule__KeyValuePair__Group__110034 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__KeyValuePair__Group__2_in_rule__KeyValuePair__Group__110037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__KeyValuePair__Group__1__Impl10065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValuePair__Group__2__Impl_in_rule__KeyValuePair__Group__210096 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__KeyValuePair__Group__3_in_rule__KeyValuePair__Group__210099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValuePair__ValueAssignment_2_in_rule__KeyValuePair__Group__2__Impl10126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValuePair__Group__3__Impl_in_rule__KeyValuePair__Group__310156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValuePair__RestAssignment_3_in_rule__KeyValuePair__Group__3__Impl10183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValuePairRest__Group__0__Impl_in_rule__KeyValuePairRest__Group__010222 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__KeyValuePairRest__Group__1_in_rule__KeyValuePairRest__Group__010225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__KeyValuePairRest__Group__0__Impl10253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValuePairRest__Group__1__Impl_in_rule__KeyValuePairRest__Group__110284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyValuePair_in_rule__KeyValuePairRest__Group__1__Impl10311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__010344 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__010347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__110405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__ValueAssignment_1_1_in_rule__Term__Group_1__1__Impl10432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_2__0__Impl_in_rule__Term__Group_2__010466 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Term__Group_2__1_in_rule__Term__Group_2__010469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_2__1__Impl_in_rule__Term__Group_2__110527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__ValueAssignment_2_1_in_rule__Term__Group_2__1__Impl10554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_3__0__Impl_in_rule__Term__Group_3__010588 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Term__Group_3__1_in_rule__Term__Group_3__010591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_3__1__Impl_in_rule__Term__Group_3__110649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__ValueAssignment_3_1_in_rule__Term__Group_3__1__Impl10676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__Group__0__Impl_in_rule__List__Group__010710 = new BitSet(new long[]{0x00002000000000F0L});
    public static final BitSet FOLLOW_rule__List__Group__1_in_rule__List__Group__010713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__Group__1__Impl_in_rule__List__Group__110771 = new BitSet(new long[]{0x00006000000000F0L});
    public static final BitSet FOLLOW_rule__List__Group__2_in_rule__List__Group__110774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__List__Group__1__Impl10802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__Group__2__Impl_in_rule__List__Group__210833 = new BitSet(new long[]{0x00006000000000F0L});
    public static final BitSet FOLLOW_rule__List__Group__3_in_rule__List__Group__210836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__TermsAssignment_2_in_rule__List__Group__2__Impl10863 = new BitSet(new long[]{0x00002000000000F2L});
    public static final BitSet FOLLOW_rule__List__Group__3__Impl_in_rule__List__Group__310894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__List__Group__3__Impl10922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhrase_in_rule__Model__PhraseAssignment10968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__StatementList__HeadAssignment_010999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementList_in_rule__StatementList__TailAssignment_211030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesignator_in_rule__VariableAssignmentStatement__DesignatorAssignment_011061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__VariableAssignmentStatement__ExpressionAssignment_211092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SelfAssignmentStatement__ExpressionAssignment_211123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__OrExpression__OpAssignment_2_011159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_rule__OrExpression__RightAssignment_2_111198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__AndExpression__OpAssignment_2_011234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_rule__AndExpression__RightAssignment_2_111273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__OpAlternatives_2_0_0_in_rule__EqualityExpression__OpAssignment_2_011304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_rule__EqualityExpression__RightAssignment_2_111337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashExpression__OpAlternatives_2_0_0_in_rule__DashExpression__OpAssignment_2_011368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDashExpression_in_rule__DashExpression__RightAssignment_2_111401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointExpression__OpAlternatives_2_0_0_in_rule__PointExpression__OpAssignment_2_011432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointExpression_in_rule__PointExpression__RightAssignment_2_111465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__PowExpression__OpAssignment_2_011501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowExpression_in_rule__PowExpression__RightAssignment_2_111540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__QualifierExpression__OpAssignment_2_011576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifierExpression_in_rule__QualifierExpression__RightAssignment_2_111615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionCall__FunctionAssignment_011650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionList_in_rule__FunctionCall__ParamsAssignment_211685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ExpressionList__HeadAssignment_011718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionRest_in_rule__ExpressionList__TailAssignment_111749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_0_1_111780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_1_1_111811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_2_1_111842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_3_1_111873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_4_1_111904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_5_1_111935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ListExpression__UsingExprAssignment_5_1_311966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ListExpression__InitValueAssignment_5_1_511997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_6_1_112028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ListExpression__UsingExprAssignment_6_1_312059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_7_1_112090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ListExpression__UsingExprAssignment_7_1_312121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ListExpression__ApplyExprAssignment_8_1_112152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_8_1_312183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__ListValue__ConditionAssignment_1_112214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_rule__UnaryExpression__StructuredExpressionAssignment_0_112245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_rule__UnaryExpression__StructuredExpressionAssignment_1_412276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_rule__UnaryExpression__StructuredExpressionAssignment_2_412307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyValuePair_in_rule__StructureExpression__KeyValuePairAssignment_1_112338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_rule__StructureExpression__StructuredExpressionsAssignment_1_312369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__KeyValuePair__KeyAssignment_012400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__KeyValuePair__ValueAssignment_212431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyValuePairRest_in_rule__KeyValuePair__RestAssignment_312462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Term__ValueAssignment_1_112493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Term__ValueAssignment_2_112524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__Term__ValueAssignment_3_112555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__List__TermsAssignment_212586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Designator__ValueAssignment12621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_2__0_in_synpred27_InternalExpression3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_2__0_in_synpred28_InternalExpression3583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_2__0_in_synpred29_InternalExpression3888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashExpression__Group_2__0_in_synpred30_InternalExpression4193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointExpression__Group_2__0_in_synpred31_InternalExpression4498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowExpression__Group_2__0_in_synpred32_InternalExpression4803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifierExpression__Group_2__0_in_synpred33_InternalExpression5108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListValue__Group_1__0_in_synpred36_InternalExpression8700 = new BitSet(new long[]{0x0000000000000002L});

}