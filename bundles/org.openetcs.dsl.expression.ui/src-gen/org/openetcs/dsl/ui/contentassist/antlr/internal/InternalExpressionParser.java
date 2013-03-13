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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:537:1: entryRuleExpressionList : ruleExpressionList EOF ;
    public final void entryRuleExpressionList() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:538:1: ( ruleExpressionList EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:539:1: ruleExpressionList EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionListRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionList_in_entryRuleExpressionList1085);
            ruleExpressionList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionListRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionList1092); if (state.failed) return ;

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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:546:1: ruleExpressionList : ( ( rule__ExpressionList__Group__0 ) ) ;
    public final void ruleExpressionList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:550:2: ( ( ( rule__ExpressionList__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:551:1: ( ( rule__ExpressionList__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:551:1: ( ( rule__ExpressionList__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:552:1: ( rule__ExpressionList__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionListAccess().getGroup()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:553:1: ( rule__ExpressionList__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:553:2: rule__ExpressionList__Group__0
            {
            pushFollow(FOLLOW_rule__ExpressionList__Group__0_in_ruleExpressionList1118);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:565:1: entryRuleExpressionRest : ruleExpressionRest EOF ;
    public final void entryRuleExpressionRest() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:566:1: ( ruleExpressionRest EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:567:1: ruleExpressionRest EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRestRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionRest_in_entryRuleExpressionRest1145);
            ruleExpressionRest();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRestRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionRest1152); if (state.failed) return ;

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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:574:1: ruleExpressionRest : ( ( rule__ExpressionRest__Group__0 ) ) ;
    public final void ruleExpressionRest() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:578:2: ( ( ( rule__ExpressionRest__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:579:1: ( ( rule__ExpressionRest__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:579:1: ( ( rule__ExpressionRest__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:580:1: ( rule__ExpressionRest__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRestAccess().getGroup()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:581:1: ( rule__ExpressionRest__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:581:2: rule__ExpressionRest__Group__0
            {
            pushFollow(FOLLOW_rule__ExpressionRest__Group__0_in_ruleExpressionRest1178);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:593:1: entryRuleListExpression : ruleListExpression EOF ;
    public final void entryRuleListExpression() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:594:1: ( ruleListExpression EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:595:1: ruleListExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleListExpression_in_entryRuleListExpression1205);
            ruleListExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleListExpression1212); if (state.failed) return ;

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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:602:1: ruleListExpression : ( ( rule__ListExpression__Alternatives ) ) ;
    public final void ruleListExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:606:2: ( ( ( rule__ListExpression__Alternatives ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:607:1: ( ( rule__ListExpression__Alternatives ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:607:1: ( ( rule__ListExpression__Alternatives ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:608:1: ( rule__ListExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getAlternatives()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:609:1: ( rule__ListExpression__Alternatives )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:609:2: rule__ListExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__ListExpression__Alternatives_in_ruleListExpression1238);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:621:1: entryRuleListValue : ruleListValue EOF ;
    public final void entryRuleListValue() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:622:1: ( ruleListValue EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:623:1: ruleListValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListValueRule()); 
            }
            pushFollow(FOLLOW_ruleListValue_in_entryRuleListValue1265);
            ruleListValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleListValue1272); if (state.failed) return ;

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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:630:1: ruleListValue : ( ( rule__ListValue__Group__0 ) ) ;
    public final void ruleListValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:634:2: ( ( ( rule__ListValue__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:635:1: ( ( rule__ListValue__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:635:1: ( ( rule__ListValue__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:636:1: ( rule__ListValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListValueAccess().getGroup()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:637:1: ( rule__ListValue__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:637:2: rule__ListValue__Group__0
            {
            pushFollow(FOLLOW_rule__ListValue__Group__0_in_ruleListValue1298);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:649:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:650:1: ( ruleCondition EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:651:1: ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition1325);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition1332); if (state.failed) return ;

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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:658:1: ruleCondition : ( ruleExpression ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:662:2: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:663:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:663:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:664:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getExpressionParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleCondition1358);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:677:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:678:1: ( ruleUnaryExpression EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:679:1: ruleUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression1384);
            ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpression1391); if (state.failed) return ;

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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:686:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Alternatives ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:690:2: ( ( ( rule__UnaryExpression__Alternatives ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:691:1: ( ( rule__UnaryExpression__Alternatives ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:691:1: ( ( rule__UnaryExpression__Alternatives ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:692:1: ( rule__UnaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:693:1: ( rule__UnaryExpression__Alternatives )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:693:2: rule__UnaryExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Alternatives_in_ruleUnaryExpression1417);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:705:1: entryRuleStructureExpression : ruleStructureExpression EOF ;
    public final void entryRuleStructureExpression() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:706:1: ( ruleStructureExpression EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:707:1: ruleStructureExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructureExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleStructureExpression_in_entryRuleStructureExpression1444);
            ruleStructureExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStructureExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructureExpression1451); if (state.failed) return ;

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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:714:1: ruleStructureExpression : ( ( rule__StructureExpression__Group__0 ) ) ;
    public final void ruleStructureExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:718:2: ( ( ( rule__StructureExpression__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:719:1: ( ( rule__StructureExpression__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:719:1: ( ( rule__StructureExpression__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:720:1: ( rule__StructureExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructureExpressionAccess().getGroup()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:721:1: ( rule__StructureExpression__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:721:2: rule__StructureExpression__Group__0
            {
            pushFollow(FOLLOW_rule__StructureExpression__Group__0_in_ruleStructureExpression1477);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:733:1: entryRuleKeyValuePair : ruleKeyValuePair EOF ;
    public final void entryRuleKeyValuePair() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:734:1: ( ruleKeyValuePair EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:735:1: ruleKeyValuePair EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairRule()); 
            }
            pushFollow(FOLLOW_ruleKeyValuePair_in_entryRuleKeyValuePair1504);
            ruleKeyValuePair();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyValuePairRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyValuePair1511); if (state.failed) return ;

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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:742:1: ruleKeyValuePair : ( ( rule__KeyValuePair__Group__0 ) ) ;
    public final void ruleKeyValuePair() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:746:2: ( ( ( rule__KeyValuePair__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:747:1: ( ( rule__KeyValuePair__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:747:1: ( ( rule__KeyValuePair__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:748:1: ( rule__KeyValuePair__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getGroup()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:749:1: ( rule__KeyValuePair__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:749:2: rule__KeyValuePair__Group__0
            {
            pushFollow(FOLLOW_rule__KeyValuePair__Group__0_in_ruleKeyValuePair1537);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:761:1: entryRuleKeyValuePairRest : ruleKeyValuePairRest EOF ;
    public final void entryRuleKeyValuePairRest() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:762:1: ( ruleKeyValuePairRest EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:763:1: ruleKeyValuePairRest EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairRestRule()); 
            }
            pushFollow(FOLLOW_ruleKeyValuePairRest_in_entryRuleKeyValuePairRest1564);
            ruleKeyValuePairRest();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyValuePairRestRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyValuePairRest1571); if (state.failed) return ;

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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:770:1: ruleKeyValuePairRest : ( ( rule__KeyValuePairRest__Group__0 ) ) ;
    public final void ruleKeyValuePairRest() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:774:2: ( ( ( rule__KeyValuePairRest__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:775:1: ( ( rule__KeyValuePairRest__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:775:1: ( ( rule__KeyValuePairRest__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:776:1: ( rule__KeyValuePairRest__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairRestAccess().getGroup()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:777:1: ( rule__KeyValuePairRest__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:777:2: rule__KeyValuePairRest__Group__0
            {
            pushFollow(FOLLOW_rule__KeyValuePairRest__Group__0_in_ruleKeyValuePairRest1597);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:789:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:790:1: ( ruleTerm EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:791:1: ruleTerm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermRule()); 
            }
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm1624);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm1631); if (state.failed) return ;

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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:798:1: ruleTerm : ( ( rule__Term__Alternatives ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:802:2: ( ( ( rule__Term__Alternatives ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:803:1: ( ( rule__Term__Alternatives ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:803:1: ( ( rule__Term__Alternatives ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:804:1: ( rule__Term__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getAlternatives()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:805:1: ( rule__Term__Alternatives )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:805:2: rule__Term__Alternatives
            {
            pushFollow(FOLLOW_rule__Term__Alternatives_in_ruleTerm1657);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:817:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:818:1: ( ruleList EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:819:1: ruleList EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListRule()); 
            }
            pushFollow(FOLLOW_ruleList_in_entryRuleList1684);
            ruleList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleList1691); if (state.failed) return ;

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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:826:1: ruleList : ( ( rule__List__Group__0 ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:830:2: ( ( ( rule__List__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:831:1: ( ( rule__List__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:831:1: ( ( rule__List__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:832:1: ( rule__List__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getGroup()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:833:1: ( rule__List__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:833:2: rule__List__Group__0
            {
            pushFollow(FOLLOW_rule__List__Group__0_in_ruleList1717);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:847:1: entryRuleDesignator : ruleDesignator EOF ;
    public final void entryRuleDesignator() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:848:1: ( ruleDesignator EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:849:1: ruleDesignator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDesignatorRule()); 
            }
            pushFollow(FOLLOW_ruleDesignator_in_entryRuleDesignator1746);
            ruleDesignator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDesignatorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDesignator1753); if (state.failed) return ;

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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:856:1: ruleDesignator : ( ( rule__Designator__ValueAssignment ) ) ;
    public final void ruleDesignator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:860:2: ( ( ( rule__Designator__ValueAssignment ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:861:1: ( ( rule__Designator__ValueAssignment ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:861:1: ( ( rule__Designator__ValueAssignment ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:862:1: ( rule__Designator__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDesignatorAccess().getValueAssignment()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:863:1: ( rule__Designator__ValueAssignment )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:863:2: rule__Designator__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Designator__ValueAssignment_in_ruleDesignator1779);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:875:1: rule__Phrase__Alternatives : ( ( ruleExpression ) | ( ruleStatementList ) );
    public final void rule__Phrase__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:879:1: ( ( ruleExpression ) | ( ruleStatementList ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==23) ) {
                    alt1=2;
                }
                else if ( (LA1_1==EOF||(LA1_1>=12 && LA1_1<=21)||LA1_1==25||LA1_1==42||(LA1_1>=47 && LA1_1<=50)) ) {
                    alt1=1;
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:880:1: ( ruleExpression )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:880:1: ( ruleExpression )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:881:1: ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPhraseAccess().getExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rule__Phrase__Alternatives1815);
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:886:6: ( ruleStatementList )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:886:6: ( ruleStatementList )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:887:1: ruleStatementList
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPhraseAccess().getStatementListParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleStatementList_in_rule__Phrase__Alternatives1832);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:897:1: rule__AssignmentStatement__Alternatives : ( ( ruleVariableAssignmentStatement ) | ( ruleSelfAssignmentStatement ) );
    public final void rule__AssignmentStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:901:1: ( ( ruleVariableAssignmentStatement ) | ( ruleSelfAssignmentStatement ) )
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:902:1: ( ruleVariableAssignmentStatement )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:902:1: ( ruleVariableAssignmentStatement )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:903:1: ruleVariableAssignmentStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssignmentStatementAccess().getVariableAssignmentStatementParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleVariableAssignmentStatement_in_rule__AssignmentStatement__Alternatives1864);
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:908:6: ( ruleSelfAssignmentStatement )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:908:6: ( ruleSelfAssignmentStatement )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:909:1: ruleSelfAssignmentStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssignmentStatementAccess().getSelfAssignmentStatementParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleSelfAssignmentStatement_in_rule__AssignmentStatement__Alternatives1881);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:919:1: rule__EqualityExpression__OpAlternatives_2_0_0 : ( ( '==' ) | ( '!=' ) | ( '<=' ) | ( '>=' ) | ( 'in' ) | ( 'not in' ) );
    public final void rule__EqualityExpression__OpAlternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:923:1: ( ( '==' ) | ( '!=' ) | ( '<=' ) | ( '>=' ) | ( 'in' ) | ( 'not in' ) )
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:924:1: ( '==' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:924:1: ( '==' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:925:1: '=='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityExpressionAccess().getOpEqualsSignEqualsSignKeyword_2_0_0_0()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__EqualityExpression__OpAlternatives_2_0_01914); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualityExpressionAccess().getOpEqualsSignEqualsSignKeyword_2_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:932:6: ( '!=' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:932:6: ( '!=' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:933:1: '!='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityExpressionAccess().getOpExclamationMarkEqualsSignKeyword_2_0_0_1()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__EqualityExpression__OpAlternatives_2_0_01934); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualityExpressionAccess().getOpExclamationMarkEqualsSignKeyword_2_0_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:940:6: ( '<=' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:940:6: ( '<=' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:941:1: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityExpressionAccess().getOpLessThanSignEqualsSignKeyword_2_0_0_2()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__EqualityExpression__OpAlternatives_2_0_01954); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualityExpressionAccess().getOpLessThanSignEqualsSignKeyword_2_0_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:948:6: ( '>=' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:948:6: ( '>=' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:949:1: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_2_0_0_3()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__EqualityExpression__OpAlternatives_2_0_01974); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualityExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_2_0_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:956:6: ( 'in' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:956:6: ( 'in' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:957:1: 'in'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityExpressionAccess().getOpInKeyword_2_0_0_4()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__EqualityExpression__OpAlternatives_2_0_01994); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualityExpressionAccess().getOpInKeyword_2_0_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:964:6: ( 'not in' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:964:6: ( 'not in' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:965:1: 'not in'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityExpressionAccess().getOpNotInKeyword_2_0_0_5()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__EqualityExpression__OpAlternatives_2_0_02014); if (state.failed) return ;
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:977:1: rule__DashExpression__OpAlternatives_2_0_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__DashExpression__OpAlternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:981:1: ( ( '+' ) | ( '-' ) )
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:982:1: ( '+' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:982:1: ( '+' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:983:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDashExpressionAccess().getOpPlusSignKeyword_2_0_0_0()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__DashExpression__OpAlternatives_2_0_02049); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDashExpressionAccess().getOpPlusSignKeyword_2_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:990:6: ( '-' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:990:6: ( '-' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:991:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDashExpressionAccess().getOpHyphenMinusKeyword_2_0_0_1()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__DashExpression__OpAlternatives_2_0_02069); if (state.failed) return ;
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1003:1: rule__PointExpression__OpAlternatives_2_0_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__PointExpression__OpAlternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1007:1: ( ( '*' ) | ( '/' ) )
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1008:1: ( '*' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1008:1: ( '*' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1009:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPointExpressionAccess().getOpAsteriskKeyword_2_0_0_0()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__PointExpression__OpAlternatives_2_0_02104); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPointExpressionAccess().getOpAsteriskKeyword_2_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1016:6: ( '/' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1016:6: ( '/' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1017:1: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPointExpressionAccess().getOpSolidusKeyword_2_0_0_1()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__PointExpression__OpAlternatives_2_0_02124); if (state.failed) return ;
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1029:1: rule__PrimaryExpression__Alternatives : ( ( ruleUnaryExpression ) | ( ruleFunctionCall ) | ( ruleListExpression ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1033:1: ( ( ruleUnaryExpression ) | ( ruleFunctionCall ) | ( ruleListExpression ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==25) ) {
                    alt6=2;
                }
                else if ( (LA6_1==EOF||(LA6_1>=12 && LA6_1<=22)||(LA6_1>=26 && LA6_1<=27)||(LA6_1>=34 && LA6_1<=35)||(LA6_1>=39 && LA6_1<=40)||(LA6_1>=42 && LA6_1<=43)||(LA6_1>=47 && LA6_1<=50)) ) {
                    alt6=1;
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1034:1: ( ruleUnaryExpression )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1034:1: ( ruleUnaryExpression )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1035:1: ruleUnaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleUnaryExpression_in_rule__PrimaryExpression__Alternatives2158);
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1040:6: ( ruleFunctionCall )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1040:6: ( ruleFunctionCall )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1041:1: ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getFunctionCallParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleFunctionCall_in_rule__PrimaryExpression__Alternatives2175);
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1046:6: ( ruleListExpression )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1046:6: ( ruleListExpression )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1047:1: ruleListExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getListExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleListExpression_in_rule__PrimaryExpression__Alternatives2192);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1057:1: rule__ListExpression__Alternatives : ( ( ( rule__ListExpression__Group_0__0 ) ) | ( ( rule__ListExpression__Group_1__0 ) ) | ( ( rule__ListExpression__Group_2__0 ) ) | ( ( rule__ListExpression__Group_3__0 ) ) | ( ( rule__ListExpression__Group_4__0 ) ) | ( ( rule__ListExpression__Group_5__0 ) ) | ( ( rule__ListExpression__Group_6__0 ) ) | ( ( rule__ListExpression__Group_7__0 ) ) | ( ( rule__ListExpression__Group_8__0 ) ) );
    public final void rule__ListExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1061:1: ( ( ( rule__ListExpression__Group_0__0 ) ) | ( ( rule__ListExpression__Group_1__0 ) ) | ( ( rule__ListExpression__Group_2__0 ) ) | ( ( rule__ListExpression__Group_3__0 ) ) | ( ( rule__ListExpression__Group_4__0 ) ) | ( ( rule__ListExpression__Group_5__0 ) ) | ( ( rule__ListExpression__Group_6__0 ) ) | ( ( rule__ListExpression__Group_7__0 ) ) | ( ( rule__ListExpression__Group_8__0 ) ) )
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1062:1: ( ( rule__ListExpression__Group_0__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1062:1: ( ( rule__ListExpression__Group_0__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1063:1: ( rule__ListExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListExpressionAccess().getGroup_0()); 
                    }
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1064:1: ( rule__ListExpression__Group_0__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1064:2: rule__ListExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ListExpression__Group_0__0_in_rule__ListExpression__Alternatives2224);
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1068:6: ( ( rule__ListExpression__Group_1__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1068:6: ( ( rule__ListExpression__Group_1__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1069:1: ( rule__ListExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListExpressionAccess().getGroup_1()); 
                    }
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1070:1: ( rule__ListExpression__Group_1__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1070:2: rule__ListExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ListExpression__Group_1__0_in_rule__ListExpression__Alternatives2242);
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1074:6: ( ( rule__ListExpression__Group_2__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1074:6: ( ( rule__ListExpression__Group_2__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1075:1: ( rule__ListExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListExpressionAccess().getGroup_2()); 
                    }
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1076:1: ( rule__ListExpression__Group_2__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1076:2: rule__ListExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ListExpression__Group_2__0_in_rule__ListExpression__Alternatives2260);
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1080:6: ( ( rule__ListExpression__Group_3__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1080:6: ( ( rule__ListExpression__Group_3__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1081:1: ( rule__ListExpression__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListExpressionAccess().getGroup_3()); 
                    }
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1082:1: ( rule__ListExpression__Group_3__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1082:2: rule__ListExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ListExpression__Group_3__0_in_rule__ListExpression__Alternatives2278);
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1086:6: ( ( rule__ListExpression__Group_4__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1086:6: ( ( rule__ListExpression__Group_4__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1087:1: ( rule__ListExpression__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListExpressionAccess().getGroup_4()); 
                    }
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1088:1: ( rule__ListExpression__Group_4__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1088:2: rule__ListExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ListExpression__Group_4__0_in_rule__ListExpression__Alternatives2296);
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1092:6: ( ( rule__ListExpression__Group_5__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1092:6: ( ( rule__ListExpression__Group_5__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1093:1: ( rule__ListExpression__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListExpressionAccess().getGroup_5()); 
                    }
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1094:1: ( rule__ListExpression__Group_5__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1094:2: rule__ListExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ListExpression__Group_5__0_in_rule__ListExpression__Alternatives2314);
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1098:6: ( ( rule__ListExpression__Group_6__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1098:6: ( ( rule__ListExpression__Group_6__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1099:1: ( rule__ListExpression__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListExpressionAccess().getGroup_6()); 
                    }
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1100:1: ( rule__ListExpression__Group_6__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1100:2: rule__ListExpression__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__ListExpression__Group_6__0_in_rule__ListExpression__Alternatives2332);
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1104:6: ( ( rule__ListExpression__Group_7__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1104:6: ( ( rule__ListExpression__Group_7__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1105:1: ( rule__ListExpression__Group_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListExpressionAccess().getGroup_7()); 
                    }
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1106:1: ( rule__ListExpression__Group_7__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1106:2: rule__ListExpression__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__ListExpression__Group_7__0_in_rule__ListExpression__Alternatives2350);
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1110:6: ( ( rule__ListExpression__Group_8__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1110:6: ( ( rule__ListExpression__Group_8__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1111:1: ( rule__ListExpression__Group_8__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListExpressionAccess().getGroup_8()); 
                    }
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1112:1: ( rule__ListExpression__Group_8__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1112:2: rule__ListExpression__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__ListExpression__Group_8__0_in_rule__ListExpression__Alternatives2368);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1121:1: rule__UnaryExpression__Alternatives : ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( ( rule__UnaryExpression__Group_1__0 ) ) | ( ( rule__UnaryExpression__Group_2__0 ) ) );
    public final void rule__UnaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1125:1: ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( ( rule__UnaryExpression__Group_1__0 ) ) | ( ( rule__UnaryExpression__Group_2__0 ) ) )
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1126:1: ( ( rule__UnaryExpression__Group_0__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1126:1: ( ( rule__UnaryExpression__Group_0__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1127:1: ( rule__UnaryExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExpressionAccess().getGroup_0()); 
                    }
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1128:1: ( rule__UnaryExpression__Group_0__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1128:2: rule__UnaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__UnaryExpression__Group_0__0_in_rule__UnaryExpression__Alternatives2401);
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1132:6: ( ( rule__UnaryExpression__Group_1__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1132:6: ( ( rule__UnaryExpression__Group_1__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1133:1: ( rule__UnaryExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExpressionAccess().getGroup_1()); 
                    }
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1134:1: ( rule__UnaryExpression__Group_1__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1134:2: rule__UnaryExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__UnaryExpression__Group_1__0_in_rule__UnaryExpression__Alternatives2419);
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1138:6: ( ( rule__UnaryExpression__Group_2__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1138:6: ( ( rule__UnaryExpression__Group_2__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1139:1: ( rule__UnaryExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExpressionAccess().getGroup_2()); 
                    }
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1140:1: ( rule__UnaryExpression__Group_2__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1140:2: rule__UnaryExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__UnaryExpression__Group_2__0_in_rule__UnaryExpression__Alternatives2437);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1149:1: rule__Term__Alternatives : ( ( ruleDesignator ) | ( ( rule__Term__Group_1__0 ) ) | ( ( rule__Term__Group_2__0 ) ) | ( ( rule__Term__Group_3__0 ) ) | ( ruleList ) );
    public final void rule__Term__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1153:1: ( ( ruleDesignator ) | ( ( rule__Term__Group_1__0 ) ) | ( ( rule__Term__Group_2__0 ) ) | ( ( rule__Term__Group_3__0 ) ) | ( ruleList ) )
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1154:1: ( ruleDesignator )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1154:1: ( ruleDesignator )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1155:1: ruleDesignator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getDesignatorParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleDesignator_in_rule__Term__Alternatives2470);
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1160:6: ( ( rule__Term__Group_1__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1160:6: ( ( rule__Term__Group_1__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1161:1: ( rule__Term__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getGroup_1()); 
                    }
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1162:1: ( rule__Term__Group_1__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1162:2: rule__Term__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Term__Group_1__0_in_rule__Term__Alternatives2487);
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1166:6: ( ( rule__Term__Group_2__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1166:6: ( ( rule__Term__Group_2__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1167:1: ( rule__Term__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getGroup_2()); 
                    }
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1168:1: ( rule__Term__Group_2__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1168:2: rule__Term__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Term__Group_2__0_in_rule__Term__Alternatives2505);
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1172:6: ( ( rule__Term__Group_3__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1172:6: ( ( rule__Term__Group_3__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1173:1: ( rule__Term__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getGroup_3()); 
                    }
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1174:1: ( rule__Term__Group_3__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1174:2: rule__Term__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Term__Group_3__0_in_rule__Term__Alternatives2523);
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1178:6: ( ruleList )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1178:6: ( ruleList )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1179:1: ruleList
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getListParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleList_in_rule__Term__Alternatives2541);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1191:1: rule__StatementList__Group__0 : rule__StatementList__Group__0__Impl rule__StatementList__Group__1 ;
    public final void rule__StatementList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1195:1: ( rule__StatementList__Group__0__Impl rule__StatementList__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1196:2: rule__StatementList__Group__0__Impl rule__StatementList__Group__1
            {
            pushFollow(FOLLOW_rule__StatementList__Group__0__Impl_in_rule__StatementList__Group__02571);
            rule__StatementList__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StatementList__Group__1_in_rule__StatementList__Group__02574);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1203:1: rule__StatementList__Group__0__Impl : ( ( rule__StatementList__HeadAssignment_0 ) ) ;
    public final void rule__StatementList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1207:1: ( ( ( rule__StatementList__HeadAssignment_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1208:1: ( ( rule__StatementList__HeadAssignment_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1208:1: ( ( rule__StatementList__HeadAssignment_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1209:1: ( rule__StatementList__HeadAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementListAccess().getHeadAssignment_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1210:1: ( rule__StatementList__HeadAssignment_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1210:2: rule__StatementList__HeadAssignment_0
            {
            pushFollow(FOLLOW_rule__StatementList__HeadAssignment_0_in_rule__StatementList__Group__0__Impl2601);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1220:1: rule__StatementList__Group__1 : rule__StatementList__Group__1__Impl rule__StatementList__Group__2 ;
    public final void rule__StatementList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1224:1: ( rule__StatementList__Group__1__Impl rule__StatementList__Group__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1225:2: rule__StatementList__Group__1__Impl rule__StatementList__Group__2
            {
            pushFollow(FOLLOW_rule__StatementList__Group__1__Impl_in_rule__StatementList__Group__12631);
            rule__StatementList__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StatementList__Group__2_in_rule__StatementList__Group__12634);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1232:1: rule__StatementList__Group__1__Impl : ( ';' ) ;
    public final void rule__StatementList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1236:1: ( ( ';' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1237:1: ( ';' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1237:1: ( ';' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1238:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementListAccess().getSemicolonKeyword_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__StatementList__Group__1__Impl2662); if (state.failed) return ;
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1251:1: rule__StatementList__Group__2 : rule__StatementList__Group__2__Impl ;
    public final void rule__StatementList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1255:1: ( rule__StatementList__Group__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1256:2: rule__StatementList__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__StatementList__Group__2__Impl_in_rule__StatementList__Group__22693);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1262:1: rule__StatementList__Group__2__Impl : ( ( rule__StatementList__TailAssignment_2 )? ) ;
    public final void rule__StatementList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1266:1: ( ( ( rule__StatementList__TailAssignment_2 )? ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1267:1: ( ( rule__StatementList__TailAssignment_2 )? )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1267:1: ( ( rule__StatementList__TailAssignment_2 )? )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1268:1: ( rule__StatementList__TailAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementListAccess().getTailAssignment_2()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1269:1: ( rule__StatementList__TailAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1269:2: rule__StatementList__TailAssignment_2
                    {
                    pushFollow(FOLLOW_rule__StatementList__TailAssignment_2_in_rule__StatementList__Group__2__Impl2720);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1285:1: rule__VariableAssignmentStatement__Group__0 : rule__VariableAssignmentStatement__Group__0__Impl rule__VariableAssignmentStatement__Group__1 ;
    public final void rule__VariableAssignmentStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1289:1: ( rule__VariableAssignmentStatement__Group__0__Impl rule__VariableAssignmentStatement__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1290:2: rule__VariableAssignmentStatement__Group__0__Impl rule__VariableAssignmentStatement__Group__1
            {
            pushFollow(FOLLOW_rule__VariableAssignmentStatement__Group__0__Impl_in_rule__VariableAssignmentStatement__Group__02757);
            rule__VariableAssignmentStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableAssignmentStatement__Group__1_in_rule__VariableAssignmentStatement__Group__02760);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1297:1: rule__VariableAssignmentStatement__Group__0__Impl : ( ( rule__VariableAssignmentStatement__DesignatorAssignment_0 ) ) ;
    public final void rule__VariableAssignmentStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1301:1: ( ( ( rule__VariableAssignmentStatement__DesignatorAssignment_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1302:1: ( ( rule__VariableAssignmentStatement__DesignatorAssignment_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1302:1: ( ( rule__VariableAssignmentStatement__DesignatorAssignment_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1303:1: ( rule__VariableAssignmentStatement__DesignatorAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAssignmentStatementAccess().getDesignatorAssignment_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1304:1: ( rule__VariableAssignmentStatement__DesignatorAssignment_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1304:2: rule__VariableAssignmentStatement__DesignatorAssignment_0
            {
            pushFollow(FOLLOW_rule__VariableAssignmentStatement__DesignatorAssignment_0_in_rule__VariableAssignmentStatement__Group__0__Impl2787);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1314:1: rule__VariableAssignmentStatement__Group__1 : rule__VariableAssignmentStatement__Group__1__Impl rule__VariableAssignmentStatement__Group__2 ;
    public final void rule__VariableAssignmentStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1318:1: ( rule__VariableAssignmentStatement__Group__1__Impl rule__VariableAssignmentStatement__Group__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1319:2: rule__VariableAssignmentStatement__Group__1__Impl rule__VariableAssignmentStatement__Group__2
            {
            pushFollow(FOLLOW_rule__VariableAssignmentStatement__Group__1__Impl_in_rule__VariableAssignmentStatement__Group__12817);
            rule__VariableAssignmentStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableAssignmentStatement__Group__2_in_rule__VariableAssignmentStatement__Group__12820);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1326:1: rule__VariableAssignmentStatement__Group__1__Impl : ( '<-' ) ;
    public final void rule__VariableAssignmentStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1330:1: ( ( '<-' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1331:1: ( '<-' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1331:1: ( '<-' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1332:1: '<-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAssignmentStatementAccess().getLessThanSignHyphenMinusKeyword_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__VariableAssignmentStatement__Group__1__Impl2848); if (state.failed) return ;
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1345:1: rule__VariableAssignmentStatement__Group__2 : rule__VariableAssignmentStatement__Group__2__Impl ;
    public final void rule__VariableAssignmentStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1349:1: ( rule__VariableAssignmentStatement__Group__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1350:2: rule__VariableAssignmentStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__VariableAssignmentStatement__Group__2__Impl_in_rule__VariableAssignmentStatement__Group__22879);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1356:1: rule__VariableAssignmentStatement__Group__2__Impl : ( ( rule__VariableAssignmentStatement__ExpressionAssignment_2 ) ) ;
    public final void rule__VariableAssignmentStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1360:1: ( ( ( rule__VariableAssignmentStatement__ExpressionAssignment_2 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1361:1: ( ( rule__VariableAssignmentStatement__ExpressionAssignment_2 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1361:1: ( ( rule__VariableAssignmentStatement__ExpressionAssignment_2 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1362:1: ( rule__VariableAssignmentStatement__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAssignmentStatementAccess().getExpressionAssignment_2()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1363:1: ( rule__VariableAssignmentStatement__ExpressionAssignment_2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1363:2: rule__VariableAssignmentStatement__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__VariableAssignmentStatement__ExpressionAssignment_2_in_rule__VariableAssignmentStatement__Group__2__Impl2906);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1379:1: rule__SelfAssignmentStatement__Group__0 : rule__SelfAssignmentStatement__Group__0__Impl rule__SelfAssignmentStatement__Group__1 ;
    public final void rule__SelfAssignmentStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1383:1: ( rule__SelfAssignmentStatement__Group__0__Impl rule__SelfAssignmentStatement__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1384:2: rule__SelfAssignmentStatement__Group__0__Impl rule__SelfAssignmentStatement__Group__1
            {
            pushFollow(FOLLOW_rule__SelfAssignmentStatement__Group__0__Impl_in_rule__SelfAssignmentStatement__Group__02942);
            rule__SelfAssignmentStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SelfAssignmentStatement__Group__1_in_rule__SelfAssignmentStatement__Group__02945);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1391:1: rule__SelfAssignmentStatement__Group__0__Impl : ( 'CurrentState' ) ;
    public final void rule__SelfAssignmentStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1395:1: ( ( 'CurrentState' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1396:1: ( 'CurrentState' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1396:1: ( 'CurrentState' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1397:1: 'CurrentState'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfAssignmentStatementAccess().getCurrentStateKeyword_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__SelfAssignmentStatement__Group__0__Impl2973); if (state.failed) return ;
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1410:1: rule__SelfAssignmentStatement__Group__1 : rule__SelfAssignmentStatement__Group__1__Impl rule__SelfAssignmentStatement__Group__2 ;
    public final void rule__SelfAssignmentStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1414:1: ( rule__SelfAssignmentStatement__Group__1__Impl rule__SelfAssignmentStatement__Group__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1415:2: rule__SelfAssignmentStatement__Group__1__Impl rule__SelfAssignmentStatement__Group__2
            {
            pushFollow(FOLLOW_rule__SelfAssignmentStatement__Group__1__Impl_in_rule__SelfAssignmentStatement__Group__13004);
            rule__SelfAssignmentStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SelfAssignmentStatement__Group__2_in_rule__SelfAssignmentStatement__Group__13007);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1422:1: rule__SelfAssignmentStatement__Group__1__Impl : ( '<-' ) ;
    public final void rule__SelfAssignmentStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1426:1: ( ( '<-' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1427:1: ( '<-' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1427:1: ( '<-' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1428:1: '<-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfAssignmentStatementAccess().getLessThanSignHyphenMinusKeyword_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__SelfAssignmentStatement__Group__1__Impl3035); if (state.failed) return ;
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1441:1: rule__SelfAssignmentStatement__Group__2 : rule__SelfAssignmentStatement__Group__2__Impl ;
    public final void rule__SelfAssignmentStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1445:1: ( rule__SelfAssignmentStatement__Group__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1446:2: rule__SelfAssignmentStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SelfAssignmentStatement__Group__2__Impl_in_rule__SelfAssignmentStatement__Group__23066);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1452:1: rule__SelfAssignmentStatement__Group__2__Impl : ( ( rule__SelfAssignmentStatement__ExpressionAssignment_2 ) ) ;
    public final void rule__SelfAssignmentStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1456:1: ( ( ( rule__SelfAssignmentStatement__ExpressionAssignment_2 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1457:1: ( ( rule__SelfAssignmentStatement__ExpressionAssignment_2 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1457:1: ( ( rule__SelfAssignmentStatement__ExpressionAssignment_2 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1458:1: ( rule__SelfAssignmentStatement__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfAssignmentStatementAccess().getExpressionAssignment_2()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1459:1: ( rule__SelfAssignmentStatement__ExpressionAssignment_2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1459:2: rule__SelfAssignmentStatement__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__SelfAssignmentStatement__ExpressionAssignment_2_in_rule__SelfAssignmentStatement__Group__2__Impl3093);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1475:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1479:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1480:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__03129);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__03132);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1487:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1491:1: ( ( ruleAndExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1492:1: ( ruleAndExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1492:1: ( ruleAndExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1493:1: ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl3159);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1504:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl rule__OrExpression__Group__2 ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1508:1: ( rule__OrExpression__Group__1__Impl rule__OrExpression__Group__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1509:2: rule__OrExpression__Group__1__Impl rule__OrExpression__Group__2
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__13188);
            rule__OrExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OrExpression__Group__2_in_rule__OrExpression__Group__13191);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1516:1: rule__OrExpression__Group__1__Impl : ( () ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1520:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1521:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1521:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1522:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1523:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1525:1: 
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1535:1: rule__OrExpression__Group__2 : rule__OrExpression__Group__2__Impl ;
    public final void rule__OrExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1539:1: ( rule__OrExpression__Group__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1540:2: rule__OrExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__2__Impl_in_rule__OrExpression__Group__23249);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1546:1: rule__OrExpression__Group__2__Impl : ( ( rule__OrExpression__Group_2__0 )? ) ;
    public final void rule__OrExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1550:1: ( ( ( rule__OrExpression__Group_2__0 )? ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1551:1: ( ( rule__OrExpression__Group_2__0 )? )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1551:1: ( ( rule__OrExpression__Group_2__0 )? )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1552:1: ( rule__OrExpression__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_2()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1553:1: ( rule__OrExpression__Group_2__0 )?
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1553:2: rule__OrExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__OrExpression__Group_2__0_in_rule__OrExpression__Group__2__Impl3276);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1569:1: rule__OrExpression__Group_2__0 : rule__OrExpression__Group_2__0__Impl rule__OrExpression__Group_2__1 ;
    public final void rule__OrExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1573:1: ( rule__OrExpression__Group_2__0__Impl rule__OrExpression__Group_2__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1574:2: rule__OrExpression__Group_2__0__Impl rule__OrExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_2__0__Impl_in_rule__OrExpression__Group_2__03313);
            rule__OrExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OrExpression__Group_2__1_in_rule__OrExpression__Group_2__03316);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1581:1: rule__OrExpression__Group_2__0__Impl : ( ( rule__OrExpression__OpAssignment_2_0 ) ) ;
    public final void rule__OrExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1585:1: ( ( ( rule__OrExpression__OpAssignment_2_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1586:1: ( ( rule__OrExpression__OpAssignment_2_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1586:1: ( ( rule__OrExpression__OpAssignment_2_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1587:1: ( rule__OrExpression__OpAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOpAssignment_2_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1588:1: ( rule__OrExpression__OpAssignment_2_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1588:2: rule__OrExpression__OpAssignment_2_0
            {
            pushFollow(FOLLOW_rule__OrExpression__OpAssignment_2_0_in_rule__OrExpression__Group_2__0__Impl3343);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1598:1: rule__OrExpression__Group_2__1 : rule__OrExpression__Group_2__1__Impl ;
    public final void rule__OrExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1602:1: ( rule__OrExpression__Group_2__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1603:2: rule__OrExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_2__1__Impl_in_rule__OrExpression__Group_2__13373);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1609:1: rule__OrExpression__Group_2__1__Impl : ( ( rule__OrExpression__RightAssignment_2_1 ) ) ;
    public final void rule__OrExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1613:1: ( ( ( rule__OrExpression__RightAssignment_2_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1614:1: ( ( rule__OrExpression__RightAssignment_2_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1614:1: ( ( rule__OrExpression__RightAssignment_2_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1615:1: ( rule__OrExpression__RightAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getRightAssignment_2_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1616:1: ( rule__OrExpression__RightAssignment_2_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1616:2: rule__OrExpression__RightAssignment_2_1
            {
            pushFollow(FOLLOW_rule__OrExpression__RightAssignment_2_1_in_rule__OrExpression__Group_2__1__Impl3400);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1630:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1634:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1635:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__03434);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__03437);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1642:1: rule__AndExpression__Group__0__Impl : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1646:1: ( ( ruleEqualityExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1647:1: ( ruleEqualityExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1647:1: ( ruleEqualityExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1648:1: ruleEqualityExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleEqualityExpression_in_rule__AndExpression__Group__0__Impl3464);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1659:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl rule__AndExpression__Group__2 ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1663:1: ( rule__AndExpression__Group__1__Impl rule__AndExpression__Group__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1664:2: rule__AndExpression__Group__1__Impl rule__AndExpression__Group__2
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__13493);
            rule__AndExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AndExpression__Group__2_in_rule__AndExpression__Group__13496);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1671:1: rule__AndExpression__Group__1__Impl : ( () ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1675:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1676:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1676:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1677:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1678:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1680:1: 
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1690:1: rule__AndExpression__Group__2 : rule__AndExpression__Group__2__Impl ;
    public final void rule__AndExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1694:1: ( rule__AndExpression__Group__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1695:2: rule__AndExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__2__Impl_in_rule__AndExpression__Group__23554);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1701:1: rule__AndExpression__Group__2__Impl : ( ( rule__AndExpression__Group_2__0 )? ) ;
    public final void rule__AndExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1705:1: ( ( ( rule__AndExpression__Group_2__0 )? ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1706:1: ( ( rule__AndExpression__Group_2__0 )? )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1706:1: ( ( rule__AndExpression__Group_2__0 )? )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1707:1: ( rule__AndExpression__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_2()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1708:1: ( rule__AndExpression__Group_2__0 )?
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1708:2: rule__AndExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__AndExpression__Group_2__0_in_rule__AndExpression__Group__2__Impl3581);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1724:1: rule__AndExpression__Group_2__0 : rule__AndExpression__Group_2__0__Impl rule__AndExpression__Group_2__1 ;
    public final void rule__AndExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1728:1: ( rule__AndExpression__Group_2__0__Impl rule__AndExpression__Group_2__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1729:2: rule__AndExpression__Group_2__0__Impl rule__AndExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_2__0__Impl_in_rule__AndExpression__Group_2__03618);
            rule__AndExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AndExpression__Group_2__1_in_rule__AndExpression__Group_2__03621);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1736:1: rule__AndExpression__Group_2__0__Impl : ( ( rule__AndExpression__OpAssignment_2_0 ) ) ;
    public final void rule__AndExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1740:1: ( ( ( rule__AndExpression__OpAssignment_2_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1741:1: ( ( rule__AndExpression__OpAssignment_2_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1741:1: ( ( rule__AndExpression__OpAssignment_2_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1742:1: ( rule__AndExpression__OpAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOpAssignment_2_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1743:1: ( rule__AndExpression__OpAssignment_2_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1743:2: rule__AndExpression__OpAssignment_2_0
            {
            pushFollow(FOLLOW_rule__AndExpression__OpAssignment_2_0_in_rule__AndExpression__Group_2__0__Impl3648);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1753:1: rule__AndExpression__Group_2__1 : rule__AndExpression__Group_2__1__Impl ;
    public final void rule__AndExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1757:1: ( rule__AndExpression__Group_2__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1758:2: rule__AndExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_2__1__Impl_in_rule__AndExpression__Group_2__13678);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1764:1: rule__AndExpression__Group_2__1__Impl : ( ( rule__AndExpression__RightAssignment_2_1 ) ) ;
    public final void rule__AndExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1768:1: ( ( ( rule__AndExpression__RightAssignment_2_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1769:1: ( ( rule__AndExpression__RightAssignment_2_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1769:1: ( ( rule__AndExpression__RightAssignment_2_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1770:1: ( rule__AndExpression__RightAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getRightAssignment_2_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1771:1: ( rule__AndExpression__RightAssignment_2_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1771:2: rule__AndExpression__RightAssignment_2_1
            {
            pushFollow(FOLLOW_rule__AndExpression__RightAssignment_2_1_in_rule__AndExpression__Group_2__1__Impl3705);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1785:1: rule__EqualityExpression__Group__0 : rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 ;
    public final void rule__EqualityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1789:1: ( rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1790:2: rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group__0__Impl_in_rule__EqualityExpression__Group__03739);
            rule__EqualityExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqualityExpression__Group__1_in_rule__EqualityExpression__Group__03742);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1797:1: rule__EqualityExpression__Group__0__Impl : ( ruleDashExpression ) ;
    public final void rule__EqualityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1801:1: ( ( ruleDashExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1802:1: ( ruleDashExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1802:1: ( ruleDashExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1803:1: ruleDashExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getDashExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleDashExpression_in_rule__EqualityExpression__Group__0__Impl3769);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1814:1: rule__EqualityExpression__Group__1 : rule__EqualityExpression__Group__1__Impl rule__EqualityExpression__Group__2 ;
    public final void rule__EqualityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1818:1: ( rule__EqualityExpression__Group__1__Impl rule__EqualityExpression__Group__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1819:2: rule__EqualityExpression__Group__1__Impl rule__EqualityExpression__Group__2
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group__1__Impl_in_rule__EqualityExpression__Group__13798);
            rule__EqualityExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqualityExpression__Group__2_in_rule__EqualityExpression__Group__13801);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1826:1: rule__EqualityExpression__Group__1__Impl : ( () ) ;
    public final void rule__EqualityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1830:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1831:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1831:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1832:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1833:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1835:1: 
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1845:1: rule__EqualityExpression__Group__2 : rule__EqualityExpression__Group__2__Impl ;
    public final void rule__EqualityExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1849:1: ( rule__EqualityExpression__Group__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1850:2: rule__EqualityExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group__2__Impl_in_rule__EqualityExpression__Group__23859);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1856:1: rule__EqualityExpression__Group__2__Impl : ( ( rule__EqualityExpression__Group_2__0 )? ) ;
    public final void rule__EqualityExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1860:1: ( ( ( rule__EqualityExpression__Group_2__0 )? ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1861:1: ( ( rule__EqualityExpression__Group_2__0 )? )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1861:1: ( ( rule__EqualityExpression__Group_2__0 )? )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1862:1: ( rule__EqualityExpression__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getGroup_2()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1863:1: ( rule__EqualityExpression__Group_2__0 )?
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1863:2: rule__EqualityExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__EqualityExpression__Group_2__0_in_rule__EqualityExpression__Group__2__Impl3886);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1879:1: rule__EqualityExpression__Group_2__0 : rule__EqualityExpression__Group_2__0__Impl rule__EqualityExpression__Group_2__1 ;
    public final void rule__EqualityExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1883:1: ( rule__EqualityExpression__Group_2__0__Impl rule__EqualityExpression__Group_2__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1884:2: rule__EqualityExpression__Group_2__0__Impl rule__EqualityExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group_2__0__Impl_in_rule__EqualityExpression__Group_2__03923);
            rule__EqualityExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EqualityExpression__Group_2__1_in_rule__EqualityExpression__Group_2__03926);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1891:1: rule__EqualityExpression__Group_2__0__Impl : ( ( rule__EqualityExpression__OpAssignment_2_0 ) ) ;
    public final void rule__EqualityExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1895:1: ( ( ( rule__EqualityExpression__OpAssignment_2_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1896:1: ( ( rule__EqualityExpression__OpAssignment_2_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1896:1: ( ( rule__EqualityExpression__OpAssignment_2_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1897:1: ( rule__EqualityExpression__OpAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getOpAssignment_2_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1898:1: ( rule__EqualityExpression__OpAssignment_2_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1898:2: rule__EqualityExpression__OpAssignment_2_0
            {
            pushFollow(FOLLOW_rule__EqualityExpression__OpAssignment_2_0_in_rule__EqualityExpression__Group_2__0__Impl3953);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1908:1: rule__EqualityExpression__Group_2__1 : rule__EqualityExpression__Group_2__1__Impl ;
    public final void rule__EqualityExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1912:1: ( rule__EqualityExpression__Group_2__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1913:2: rule__EqualityExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group_2__1__Impl_in_rule__EqualityExpression__Group_2__13983);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1919:1: rule__EqualityExpression__Group_2__1__Impl : ( ( rule__EqualityExpression__RightAssignment_2_1 ) ) ;
    public final void rule__EqualityExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1923:1: ( ( ( rule__EqualityExpression__RightAssignment_2_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1924:1: ( ( rule__EqualityExpression__RightAssignment_2_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1924:1: ( ( rule__EqualityExpression__RightAssignment_2_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1925:1: ( rule__EqualityExpression__RightAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getRightAssignment_2_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1926:1: ( rule__EqualityExpression__RightAssignment_2_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1926:2: rule__EqualityExpression__RightAssignment_2_1
            {
            pushFollow(FOLLOW_rule__EqualityExpression__RightAssignment_2_1_in_rule__EqualityExpression__Group_2__1__Impl4010);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1940:1: rule__DashExpression__Group__0 : rule__DashExpression__Group__0__Impl rule__DashExpression__Group__1 ;
    public final void rule__DashExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1944:1: ( rule__DashExpression__Group__0__Impl rule__DashExpression__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1945:2: rule__DashExpression__Group__0__Impl rule__DashExpression__Group__1
            {
            pushFollow(FOLLOW_rule__DashExpression__Group__0__Impl_in_rule__DashExpression__Group__04044);
            rule__DashExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DashExpression__Group__1_in_rule__DashExpression__Group__04047);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1952:1: rule__DashExpression__Group__0__Impl : ( rulePointExpression ) ;
    public final void rule__DashExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1956:1: ( ( rulePointExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1957:1: ( rulePointExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1957:1: ( rulePointExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1958:1: rulePointExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDashExpressionAccess().getPointExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePointExpression_in_rule__DashExpression__Group__0__Impl4074);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1969:1: rule__DashExpression__Group__1 : rule__DashExpression__Group__1__Impl rule__DashExpression__Group__2 ;
    public final void rule__DashExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1973:1: ( rule__DashExpression__Group__1__Impl rule__DashExpression__Group__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1974:2: rule__DashExpression__Group__1__Impl rule__DashExpression__Group__2
            {
            pushFollow(FOLLOW_rule__DashExpression__Group__1__Impl_in_rule__DashExpression__Group__14103);
            rule__DashExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DashExpression__Group__2_in_rule__DashExpression__Group__14106);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1981:1: rule__DashExpression__Group__1__Impl : ( () ) ;
    public final void rule__DashExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1985:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1986:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1986:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1987:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDashExpressionAccess().getDashExpressionLeftAction_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1988:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1990:1: 
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2000:1: rule__DashExpression__Group__2 : rule__DashExpression__Group__2__Impl ;
    public final void rule__DashExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2004:1: ( rule__DashExpression__Group__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2005:2: rule__DashExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DashExpression__Group__2__Impl_in_rule__DashExpression__Group__24164);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2011:1: rule__DashExpression__Group__2__Impl : ( ( rule__DashExpression__Group_2__0 )? ) ;
    public final void rule__DashExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2015:1: ( ( ( rule__DashExpression__Group_2__0 )? ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2016:1: ( ( rule__DashExpression__Group_2__0 )? )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2016:1: ( ( rule__DashExpression__Group_2__0 )? )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2017:1: ( rule__DashExpression__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDashExpressionAccess().getGroup_2()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2018:1: ( rule__DashExpression__Group_2__0 )?
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2018:2: rule__DashExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DashExpression__Group_2__0_in_rule__DashExpression__Group__2__Impl4191);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2034:1: rule__DashExpression__Group_2__0 : rule__DashExpression__Group_2__0__Impl rule__DashExpression__Group_2__1 ;
    public final void rule__DashExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2038:1: ( rule__DashExpression__Group_2__0__Impl rule__DashExpression__Group_2__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2039:2: rule__DashExpression__Group_2__0__Impl rule__DashExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__DashExpression__Group_2__0__Impl_in_rule__DashExpression__Group_2__04228);
            rule__DashExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DashExpression__Group_2__1_in_rule__DashExpression__Group_2__04231);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2046:1: rule__DashExpression__Group_2__0__Impl : ( ( rule__DashExpression__OpAssignment_2_0 ) ) ;
    public final void rule__DashExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2050:1: ( ( ( rule__DashExpression__OpAssignment_2_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2051:1: ( ( rule__DashExpression__OpAssignment_2_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2051:1: ( ( rule__DashExpression__OpAssignment_2_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2052:1: ( rule__DashExpression__OpAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDashExpressionAccess().getOpAssignment_2_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2053:1: ( rule__DashExpression__OpAssignment_2_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2053:2: rule__DashExpression__OpAssignment_2_0
            {
            pushFollow(FOLLOW_rule__DashExpression__OpAssignment_2_0_in_rule__DashExpression__Group_2__0__Impl4258);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2063:1: rule__DashExpression__Group_2__1 : rule__DashExpression__Group_2__1__Impl ;
    public final void rule__DashExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2067:1: ( rule__DashExpression__Group_2__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2068:2: rule__DashExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DashExpression__Group_2__1__Impl_in_rule__DashExpression__Group_2__14288);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2074:1: rule__DashExpression__Group_2__1__Impl : ( ( rule__DashExpression__RightAssignment_2_1 ) ) ;
    public final void rule__DashExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2078:1: ( ( ( rule__DashExpression__RightAssignment_2_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2079:1: ( ( rule__DashExpression__RightAssignment_2_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2079:1: ( ( rule__DashExpression__RightAssignment_2_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2080:1: ( rule__DashExpression__RightAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDashExpressionAccess().getRightAssignment_2_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2081:1: ( rule__DashExpression__RightAssignment_2_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2081:2: rule__DashExpression__RightAssignment_2_1
            {
            pushFollow(FOLLOW_rule__DashExpression__RightAssignment_2_1_in_rule__DashExpression__Group_2__1__Impl4315);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2095:1: rule__PointExpression__Group__0 : rule__PointExpression__Group__0__Impl rule__PointExpression__Group__1 ;
    public final void rule__PointExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2099:1: ( rule__PointExpression__Group__0__Impl rule__PointExpression__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2100:2: rule__PointExpression__Group__0__Impl rule__PointExpression__Group__1
            {
            pushFollow(FOLLOW_rule__PointExpression__Group__0__Impl_in_rule__PointExpression__Group__04349);
            rule__PointExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PointExpression__Group__1_in_rule__PointExpression__Group__04352);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2107:1: rule__PointExpression__Group__0__Impl : ( rulePowExpression ) ;
    public final void rule__PointExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2111:1: ( ( rulePowExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2112:1: ( rulePowExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2112:1: ( rulePowExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2113:1: rulePowExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointExpressionAccess().getPowExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePowExpression_in_rule__PointExpression__Group__0__Impl4379);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2124:1: rule__PointExpression__Group__1 : rule__PointExpression__Group__1__Impl rule__PointExpression__Group__2 ;
    public final void rule__PointExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2128:1: ( rule__PointExpression__Group__1__Impl rule__PointExpression__Group__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2129:2: rule__PointExpression__Group__1__Impl rule__PointExpression__Group__2
            {
            pushFollow(FOLLOW_rule__PointExpression__Group__1__Impl_in_rule__PointExpression__Group__14408);
            rule__PointExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PointExpression__Group__2_in_rule__PointExpression__Group__14411);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2136:1: rule__PointExpression__Group__1__Impl : ( () ) ;
    public final void rule__PointExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2140:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2141:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2141:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2142:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointExpressionAccess().getPointExpressionLeftAction_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2143:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2145:1: 
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2155:1: rule__PointExpression__Group__2 : rule__PointExpression__Group__2__Impl ;
    public final void rule__PointExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2159:1: ( rule__PointExpression__Group__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2160:2: rule__PointExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PointExpression__Group__2__Impl_in_rule__PointExpression__Group__24469);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2166:1: rule__PointExpression__Group__2__Impl : ( ( rule__PointExpression__Group_2__0 )? ) ;
    public final void rule__PointExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2170:1: ( ( ( rule__PointExpression__Group_2__0 )? ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2171:1: ( ( rule__PointExpression__Group_2__0 )? )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2171:1: ( ( rule__PointExpression__Group_2__0 )? )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2172:1: ( rule__PointExpression__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointExpressionAccess().getGroup_2()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2173:1: ( rule__PointExpression__Group_2__0 )?
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2173:2: rule__PointExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__PointExpression__Group_2__0_in_rule__PointExpression__Group__2__Impl4496);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2189:1: rule__PointExpression__Group_2__0 : rule__PointExpression__Group_2__0__Impl rule__PointExpression__Group_2__1 ;
    public final void rule__PointExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2193:1: ( rule__PointExpression__Group_2__0__Impl rule__PointExpression__Group_2__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2194:2: rule__PointExpression__Group_2__0__Impl rule__PointExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__PointExpression__Group_2__0__Impl_in_rule__PointExpression__Group_2__04533);
            rule__PointExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PointExpression__Group_2__1_in_rule__PointExpression__Group_2__04536);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2201:1: rule__PointExpression__Group_2__0__Impl : ( ( rule__PointExpression__OpAssignment_2_0 ) ) ;
    public final void rule__PointExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2205:1: ( ( ( rule__PointExpression__OpAssignment_2_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2206:1: ( ( rule__PointExpression__OpAssignment_2_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2206:1: ( ( rule__PointExpression__OpAssignment_2_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2207:1: ( rule__PointExpression__OpAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointExpressionAccess().getOpAssignment_2_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2208:1: ( rule__PointExpression__OpAssignment_2_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2208:2: rule__PointExpression__OpAssignment_2_0
            {
            pushFollow(FOLLOW_rule__PointExpression__OpAssignment_2_0_in_rule__PointExpression__Group_2__0__Impl4563);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2218:1: rule__PointExpression__Group_2__1 : rule__PointExpression__Group_2__1__Impl ;
    public final void rule__PointExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2222:1: ( rule__PointExpression__Group_2__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2223:2: rule__PointExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PointExpression__Group_2__1__Impl_in_rule__PointExpression__Group_2__14593);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2229:1: rule__PointExpression__Group_2__1__Impl : ( ( rule__PointExpression__RightAssignment_2_1 ) ) ;
    public final void rule__PointExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2233:1: ( ( ( rule__PointExpression__RightAssignment_2_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2234:1: ( ( rule__PointExpression__RightAssignment_2_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2234:1: ( ( rule__PointExpression__RightAssignment_2_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2235:1: ( rule__PointExpression__RightAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointExpressionAccess().getRightAssignment_2_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2236:1: ( rule__PointExpression__RightAssignment_2_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2236:2: rule__PointExpression__RightAssignment_2_1
            {
            pushFollow(FOLLOW_rule__PointExpression__RightAssignment_2_1_in_rule__PointExpression__Group_2__1__Impl4620);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2250:1: rule__PowExpression__Group__0 : rule__PowExpression__Group__0__Impl rule__PowExpression__Group__1 ;
    public final void rule__PowExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2254:1: ( rule__PowExpression__Group__0__Impl rule__PowExpression__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2255:2: rule__PowExpression__Group__0__Impl rule__PowExpression__Group__1
            {
            pushFollow(FOLLOW_rule__PowExpression__Group__0__Impl_in_rule__PowExpression__Group__04654);
            rule__PowExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PowExpression__Group__1_in_rule__PowExpression__Group__04657);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2262:1: rule__PowExpression__Group__0__Impl : ( ruleQualifierExpression ) ;
    public final void rule__PowExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2266:1: ( ( ruleQualifierExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2267:1: ( ruleQualifierExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2267:1: ( ruleQualifierExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2268:1: ruleQualifierExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowExpressionAccess().getQualifierExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifierExpression_in_rule__PowExpression__Group__0__Impl4684);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2279:1: rule__PowExpression__Group__1 : rule__PowExpression__Group__1__Impl rule__PowExpression__Group__2 ;
    public final void rule__PowExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2283:1: ( rule__PowExpression__Group__1__Impl rule__PowExpression__Group__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2284:2: rule__PowExpression__Group__1__Impl rule__PowExpression__Group__2
            {
            pushFollow(FOLLOW_rule__PowExpression__Group__1__Impl_in_rule__PowExpression__Group__14713);
            rule__PowExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PowExpression__Group__2_in_rule__PowExpression__Group__14716);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2291:1: rule__PowExpression__Group__1__Impl : ( () ) ;
    public final void rule__PowExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2295:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2296:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2296:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2297:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowExpressionAccess().getPowExpressionLeftAction_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2298:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2300:1: 
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2310:1: rule__PowExpression__Group__2 : rule__PowExpression__Group__2__Impl ;
    public final void rule__PowExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2314:1: ( rule__PowExpression__Group__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2315:2: rule__PowExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PowExpression__Group__2__Impl_in_rule__PowExpression__Group__24774);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2321:1: rule__PowExpression__Group__2__Impl : ( ( rule__PowExpression__Group_2__0 )? ) ;
    public final void rule__PowExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2325:1: ( ( ( rule__PowExpression__Group_2__0 )? ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2326:1: ( ( rule__PowExpression__Group_2__0 )? )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2326:1: ( ( rule__PowExpression__Group_2__0 )? )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2327:1: ( rule__PowExpression__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowExpressionAccess().getGroup_2()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2328:1: ( rule__PowExpression__Group_2__0 )?
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2328:2: rule__PowExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__PowExpression__Group_2__0_in_rule__PowExpression__Group__2__Impl4801);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2344:1: rule__PowExpression__Group_2__0 : rule__PowExpression__Group_2__0__Impl rule__PowExpression__Group_2__1 ;
    public final void rule__PowExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2348:1: ( rule__PowExpression__Group_2__0__Impl rule__PowExpression__Group_2__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2349:2: rule__PowExpression__Group_2__0__Impl rule__PowExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__PowExpression__Group_2__0__Impl_in_rule__PowExpression__Group_2__04838);
            rule__PowExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PowExpression__Group_2__1_in_rule__PowExpression__Group_2__04841);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2356:1: rule__PowExpression__Group_2__0__Impl : ( ( rule__PowExpression__OpAssignment_2_0 ) ) ;
    public final void rule__PowExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2360:1: ( ( ( rule__PowExpression__OpAssignment_2_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2361:1: ( ( rule__PowExpression__OpAssignment_2_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2361:1: ( ( rule__PowExpression__OpAssignment_2_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2362:1: ( rule__PowExpression__OpAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowExpressionAccess().getOpAssignment_2_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2363:1: ( rule__PowExpression__OpAssignment_2_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2363:2: rule__PowExpression__OpAssignment_2_0
            {
            pushFollow(FOLLOW_rule__PowExpression__OpAssignment_2_0_in_rule__PowExpression__Group_2__0__Impl4868);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2373:1: rule__PowExpression__Group_2__1 : rule__PowExpression__Group_2__1__Impl ;
    public final void rule__PowExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2377:1: ( rule__PowExpression__Group_2__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2378:2: rule__PowExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PowExpression__Group_2__1__Impl_in_rule__PowExpression__Group_2__14898);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2384:1: rule__PowExpression__Group_2__1__Impl : ( ( rule__PowExpression__RightAssignment_2_1 ) ) ;
    public final void rule__PowExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2388:1: ( ( ( rule__PowExpression__RightAssignment_2_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2389:1: ( ( rule__PowExpression__RightAssignment_2_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2389:1: ( ( rule__PowExpression__RightAssignment_2_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2390:1: ( rule__PowExpression__RightAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowExpressionAccess().getRightAssignment_2_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2391:1: ( rule__PowExpression__RightAssignment_2_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2391:2: rule__PowExpression__RightAssignment_2_1
            {
            pushFollow(FOLLOW_rule__PowExpression__RightAssignment_2_1_in_rule__PowExpression__Group_2__1__Impl4925);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2405:1: rule__QualifierExpression__Group__0 : rule__QualifierExpression__Group__0__Impl rule__QualifierExpression__Group__1 ;
    public final void rule__QualifierExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2409:1: ( rule__QualifierExpression__Group__0__Impl rule__QualifierExpression__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2410:2: rule__QualifierExpression__Group__0__Impl rule__QualifierExpression__Group__1
            {
            pushFollow(FOLLOW_rule__QualifierExpression__Group__0__Impl_in_rule__QualifierExpression__Group__04959);
            rule__QualifierExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifierExpression__Group__1_in_rule__QualifierExpression__Group__04962);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2417:1: rule__QualifierExpression__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__QualifierExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2421:1: ( ( rulePrimaryExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2422:1: ( rulePrimaryExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2422:1: ( rulePrimaryExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2423:1: rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifierExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__QualifierExpression__Group__0__Impl4989);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2434:1: rule__QualifierExpression__Group__1 : rule__QualifierExpression__Group__1__Impl rule__QualifierExpression__Group__2 ;
    public final void rule__QualifierExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2438:1: ( rule__QualifierExpression__Group__1__Impl rule__QualifierExpression__Group__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2439:2: rule__QualifierExpression__Group__1__Impl rule__QualifierExpression__Group__2
            {
            pushFollow(FOLLOW_rule__QualifierExpression__Group__1__Impl_in_rule__QualifierExpression__Group__15018);
            rule__QualifierExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifierExpression__Group__2_in_rule__QualifierExpression__Group__15021);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2446:1: rule__QualifierExpression__Group__1__Impl : ( () ) ;
    public final void rule__QualifierExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2450:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2451:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2451:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2452:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifierExpressionAccess().getQualifierExpressionLeftAction_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2453:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2455:1: 
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2465:1: rule__QualifierExpression__Group__2 : rule__QualifierExpression__Group__2__Impl ;
    public final void rule__QualifierExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2469:1: ( rule__QualifierExpression__Group__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2470:2: rule__QualifierExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__QualifierExpression__Group__2__Impl_in_rule__QualifierExpression__Group__25079);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2476:1: rule__QualifierExpression__Group__2__Impl : ( ( rule__QualifierExpression__Group_2__0 )? ) ;
    public final void rule__QualifierExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2480:1: ( ( ( rule__QualifierExpression__Group_2__0 )? ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2481:1: ( ( rule__QualifierExpression__Group_2__0 )? )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2481:1: ( ( rule__QualifierExpression__Group_2__0 )? )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2482:1: ( rule__QualifierExpression__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifierExpressionAccess().getGroup_2()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2483:1: ( rule__QualifierExpression__Group_2__0 )?
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2483:2: rule__QualifierExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__QualifierExpression__Group_2__0_in_rule__QualifierExpression__Group__2__Impl5106);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2499:1: rule__QualifierExpression__Group_2__0 : rule__QualifierExpression__Group_2__0__Impl rule__QualifierExpression__Group_2__1 ;
    public final void rule__QualifierExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2503:1: ( rule__QualifierExpression__Group_2__0__Impl rule__QualifierExpression__Group_2__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2504:2: rule__QualifierExpression__Group_2__0__Impl rule__QualifierExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__QualifierExpression__Group_2__0__Impl_in_rule__QualifierExpression__Group_2__05143);
            rule__QualifierExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifierExpression__Group_2__1_in_rule__QualifierExpression__Group_2__05146);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2511:1: rule__QualifierExpression__Group_2__0__Impl : ( ( rule__QualifierExpression__OpAssignment_2_0 ) ) ;
    public final void rule__QualifierExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2515:1: ( ( ( rule__QualifierExpression__OpAssignment_2_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2516:1: ( ( rule__QualifierExpression__OpAssignment_2_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2516:1: ( ( rule__QualifierExpression__OpAssignment_2_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2517:1: ( rule__QualifierExpression__OpAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifierExpressionAccess().getOpAssignment_2_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2518:1: ( rule__QualifierExpression__OpAssignment_2_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2518:2: rule__QualifierExpression__OpAssignment_2_0
            {
            pushFollow(FOLLOW_rule__QualifierExpression__OpAssignment_2_0_in_rule__QualifierExpression__Group_2__0__Impl5173);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2528:1: rule__QualifierExpression__Group_2__1 : rule__QualifierExpression__Group_2__1__Impl ;
    public final void rule__QualifierExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2532:1: ( rule__QualifierExpression__Group_2__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2533:2: rule__QualifierExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifierExpression__Group_2__1__Impl_in_rule__QualifierExpression__Group_2__15203);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2539:1: rule__QualifierExpression__Group_2__1__Impl : ( ( rule__QualifierExpression__RightAssignment_2_1 ) ) ;
    public final void rule__QualifierExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2543:1: ( ( ( rule__QualifierExpression__RightAssignment_2_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2544:1: ( ( rule__QualifierExpression__RightAssignment_2_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2544:1: ( ( rule__QualifierExpression__RightAssignment_2_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2545:1: ( rule__QualifierExpression__RightAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifierExpressionAccess().getRightAssignment_2_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2546:1: ( rule__QualifierExpression__RightAssignment_2_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2546:2: rule__QualifierExpression__RightAssignment_2_1
            {
            pushFollow(FOLLOW_rule__QualifierExpression__RightAssignment_2_1_in_rule__QualifierExpression__Group_2__1__Impl5230);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2560:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2564:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2565:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__0__Impl_in_rule__FunctionCall__Group__05264);
            rule__FunctionCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionCall__Group__1_in_rule__FunctionCall__Group__05267);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2572:1: rule__FunctionCall__Group__0__Impl : ( ruleDesignator ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2576:1: ( ( ruleDesignator ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2577:1: ( ruleDesignator )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2577:1: ( ruleDesignator )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2578:1: ruleDesignator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getDesignatorParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleDesignator_in_rule__FunctionCall__Group__0__Impl5294);
            ruleDesignator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getDesignatorParserRuleCall_0()); 
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2589:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2593:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2594:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__1__Impl_in_rule__FunctionCall__Group__15323);
            rule__FunctionCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionCall__Group__2_in_rule__FunctionCall__Group__15326);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2601:1: rule__FunctionCall__Group__1__Impl : ( '(' ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2605:1: ( ( '(' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2606:1: ( '(' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2606:1: ( '(' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2607:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,25,FOLLOW_25_in_rule__FunctionCall__Group__1__Impl5354); if (state.failed) return ;
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2620:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2624:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2625:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__2__Impl_in_rule__FunctionCall__Group__25385);
            rule__FunctionCall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionCall__Group__3_in_rule__FunctionCall__Group__25388);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2632:1: rule__FunctionCall__Group__2__Impl : ( ( rule__FunctionCall__ParamsAssignment_2 )? ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2636:1: ( ( ( rule__FunctionCall__ParamsAssignment_2 )? ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2637:1: ( ( rule__FunctionCall__ParamsAssignment_2 )? )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2637:1: ( ( rule__FunctionCall__ParamsAssignment_2 )? )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2638:1: ( rule__FunctionCall__ParamsAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParamsAssignment_2()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2639:1: ( rule__FunctionCall__ParamsAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_DOUBLE)||LA18_0==25||(LA18_0>=28 && LA18_0<=33)||(LA18_0>=36 && LA18_0<=38)||LA18_0==41||LA18_0==45) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2639:2: rule__FunctionCall__ParamsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FunctionCall__ParamsAssignment_2_in_rule__FunctionCall__Group__2__Impl5415);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2649:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2653:1: ( rule__FunctionCall__Group__3__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2654:2: rule__FunctionCall__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__3__Impl_in_rule__FunctionCall__Group__35446);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2660:1: rule__FunctionCall__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2664:1: ( ( ')' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2665:1: ( ')' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2665:1: ( ')' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2666:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,26,FOLLOW_26_in_rule__FunctionCall__Group__3__Impl5474); if (state.failed) return ;
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2687:1: rule__ExpressionList__Group__0 : rule__ExpressionList__Group__0__Impl rule__ExpressionList__Group__1 ;
    public final void rule__ExpressionList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2691:1: ( rule__ExpressionList__Group__0__Impl rule__ExpressionList__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2692:2: rule__ExpressionList__Group__0__Impl rule__ExpressionList__Group__1
            {
            pushFollow(FOLLOW_rule__ExpressionList__Group__0__Impl_in_rule__ExpressionList__Group__05513);
            rule__ExpressionList__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExpressionList__Group__1_in_rule__ExpressionList__Group__05516);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2699:1: rule__ExpressionList__Group__0__Impl : ( ( rule__ExpressionList__HeadAssignment_0 ) ) ;
    public final void rule__ExpressionList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2703:1: ( ( ( rule__ExpressionList__HeadAssignment_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2704:1: ( ( rule__ExpressionList__HeadAssignment_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2704:1: ( ( rule__ExpressionList__HeadAssignment_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2705:1: ( rule__ExpressionList__HeadAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionListAccess().getHeadAssignment_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2706:1: ( rule__ExpressionList__HeadAssignment_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2706:2: rule__ExpressionList__HeadAssignment_0
            {
            pushFollow(FOLLOW_rule__ExpressionList__HeadAssignment_0_in_rule__ExpressionList__Group__0__Impl5543);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2716:1: rule__ExpressionList__Group__1 : rule__ExpressionList__Group__1__Impl ;
    public final void rule__ExpressionList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2720:1: ( rule__ExpressionList__Group__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2721:2: rule__ExpressionList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExpressionList__Group__1__Impl_in_rule__ExpressionList__Group__15573);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2727:1: rule__ExpressionList__Group__1__Impl : ( ( rule__ExpressionList__TailAssignment_1 )* ) ;
    public final void rule__ExpressionList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2731:1: ( ( ( rule__ExpressionList__TailAssignment_1 )* ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2732:1: ( ( rule__ExpressionList__TailAssignment_1 )* )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2732:1: ( ( rule__ExpressionList__TailAssignment_1 )* )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2733:1: ( rule__ExpressionList__TailAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionListAccess().getTailAssignment_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2734:1: ( rule__ExpressionList__TailAssignment_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==27) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2734:2: rule__ExpressionList__TailAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__ExpressionList__TailAssignment_1_in_rule__ExpressionList__Group__1__Impl5600);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2748:1: rule__ExpressionRest__Group__0 : rule__ExpressionRest__Group__0__Impl rule__ExpressionRest__Group__1 ;
    public final void rule__ExpressionRest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2752:1: ( rule__ExpressionRest__Group__0__Impl rule__ExpressionRest__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2753:2: rule__ExpressionRest__Group__0__Impl rule__ExpressionRest__Group__1
            {
            pushFollow(FOLLOW_rule__ExpressionRest__Group__0__Impl_in_rule__ExpressionRest__Group__05635);
            rule__ExpressionRest__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExpressionRest__Group__1_in_rule__ExpressionRest__Group__05638);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2760:1: rule__ExpressionRest__Group__0__Impl : ( ',' ) ;
    public final void rule__ExpressionRest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2764:1: ( ( ',' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2765:1: ( ',' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2765:1: ( ',' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2766:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRestAccess().getCommaKeyword_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__ExpressionRest__Group__0__Impl5666); if (state.failed) return ;
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2779:1: rule__ExpressionRest__Group__1 : rule__ExpressionRest__Group__1__Impl ;
    public final void rule__ExpressionRest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2783:1: ( rule__ExpressionRest__Group__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2784:2: rule__ExpressionRest__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExpressionRest__Group__1__Impl_in_rule__ExpressionRest__Group__15697);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2790:1: rule__ExpressionRest__Group__1__Impl : ( ruleExpression ) ;
    public final void rule__ExpressionRest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2794:1: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2795:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2795:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2796:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRestAccess().getExpressionParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ExpressionRest__Group__1__Impl5724);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2811:1: rule__ListExpression__Group_0__0 : rule__ListExpression__Group_0__0__Impl rule__ListExpression__Group_0__1 ;
    public final void rule__ListExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2815:1: ( rule__ListExpression__Group_0__0__Impl rule__ListExpression__Group_0__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2816:2: rule__ListExpression__Group_0__0__Impl rule__ListExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_0__0__Impl_in_rule__ListExpression__Group_0__05757);
            rule__ListExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_0__1_in_rule__ListExpression__Group_0__05760);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2823:1: rule__ListExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ListExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2827:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2828:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2828:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2829:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getThereIsInAction_0_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2830:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2832:1: 
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2842:1: rule__ListExpression__Group_0__1 : rule__ListExpression__Group_0__1__Impl ;
    public final void rule__ListExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2846:1: ( rule__ListExpression__Group_0__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2847:2: rule__ListExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_0__1__Impl_in_rule__ListExpression__Group_0__15818);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2853:1: rule__ListExpression__Group_0__1__Impl : ( ( rule__ListExpression__Group_0_1__0 ) ) ;
    public final void rule__ListExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2857:1: ( ( ( rule__ListExpression__Group_0_1__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2858:1: ( ( rule__ListExpression__Group_0_1__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2858:1: ( ( rule__ListExpression__Group_0_1__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2859:1: ( rule__ListExpression__Group_0_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getGroup_0_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2860:1: ( rule__ListExpression__Group_0_1__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2860:2: rule__ListExpression__Group_0_1__0
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_0_1__0_in_rule__ListExpression__Group_0__1__Impl5845);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2874:1: rule__ListExpression__Group_0_1__0 : rule__ListExpression__Group_0_1__0__Impl rule__ListExpression__Group_0_1__1 ;
    public final void rule__ListExpression__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2878:1: ( rule__ListExpression__Group_0_1__0__Impl rule__ListExpression__Group_0_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2879:2: rule__ListExpression__Group_0_1__0__Impl rule__ListExpression__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_0_1__0__Impl_in_rule__ListExpression__Group_0_1__05879);
            rule__ListExpression__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_0_1__1_in_rule__ListExpression__Group_0_1__05882);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2886:1: rule__ListExpression__Group_0_1__0__Impl : ( ( 'THERE_IS_IN' ) ) ;
    public final void rule__ListExpression__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2890:1: ( ( ( 'THERE_IS_IN' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2891:1: ( ( 'THERE_IS_IN' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2891:1: ( ( 'THERE_IS_IN' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2892:1: ( 'THERE_IS_IN' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getTHERE_IS_INKeyword_0_1_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2893:1: ( 'THERE_IS_IN' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2894:2: 'THERE_IS_IN'
            {
            match(input,28,FOLLOW_28_in_rule__ListExpression__Group_0_1__0__Impl5911); if (state.failed) return ;

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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2905:1: rule__ListExpression__Group_0_1__1 : rule__ListExpression__Group_0_1__1__Impl ;
    public final void rule__ListExpression__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2909:1: ( rule__ListExpression__Group_0_1__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2910:2: rule__ListExpression__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_0_1__1__Impl_in_rule__ListExpression__Group_0_1__15943);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2916:1: rule__ListExpression__Group_0_1__1__Impl : ( ( rule__ListExpression__ExprAssignment_0_1_1 ) ) ;
    public final void rule__ListExpression__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2920:1: ( ( ( rule__ListExpression__ExprAssignment_0_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2921:1: ( ( rule__ListExpression__ExprAssignment_0_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2921:1: ( ( rule__ListExpression__ExprAssignment_0_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2922:1: ( rule__ListExpression__ExprAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprAssignment_0_1_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2923:1: ( rule__ListExpression__ExprAssignment_0_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2923:2: rule__ListExpression__ExprAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__ListExpression__ExprAssignment_0_1_1_in_rule__ListExpression__Group_0_1__1__Impl5970);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2937:1: rule__ListExpression__Group_1__0 : rule__ListExpression__Group_1__0__Impl rule__ListExpression__Group_1__1 ;
    public final void rule__ListExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2941:1: ( rule__ListExpression__Group_1__0__Impl rule__ListExpression__Group_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2942:2: rule__ListExpression__Group_1__0__Impl rule__ListExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_1__0__Impl_in_rule__ListExpression__Group_1__06004);
            rule__ListExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_1__1_in_rule__ListExpression__Group_1__06007);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2949:1: rule__ListExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ListExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2953:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2954:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2954:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2955:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getForallInAction_1_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2956:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2958:1: 
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2968:1: rule__ListExpression__Group_1__1 : rule__ListExpression__Group_1__1__Impl ;
    public final void rule__ListExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2972:1: ( rule__ListExpression__Group_1__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2973:2: rule__ListExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_1__1__Impl_in_rule__ListExpression__Group_1__16065);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2979:1: rule__ListExpression__Group_1__1__Impl : ( ( rule__ListExpression__Group_1_1__0 ) ) ;
    public final void rule__ListExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2983:1: ( ( ( rule__ListExpression__Group_1_1__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2984:1: ( ( rule__ListExpression__Group_1_1__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2984:1: ( ( rule__ListExpression__Group_1_1__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2985:1: ( rule__ListExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getGroup_1_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2986:1: ( rule__ListExpression__Group_1_1__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2986:2: rule__ListExpression__Group_1_1__0
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_1_1__0_in_rule__ListExpression__Group_1__1__Impl6092);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3000:1: rule__ListExpression__Group_1_1__0 : rule__ListExpression__Group_1_1__0__Impl rule__ListExpression__Group_1_1__1 ;
    public final void rule__ListExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3004:1: ( rule__ListExpression__Group_1_1__0__Impl rule__ListExpression__Group_1_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3005:2: rule__ListExpression__Group_1_1__0__Impl rule__ListExpression__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_1_1__0__Impl_in_rule__ListExpression__Group_1_1__06126);
            rule__ListExpression__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_1_1__1_in_rule__ListExpression__Group_1_1__06129);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3012:1: rule__ListExpression__Group_1_1__0__Impl : ( ( 'FORALL_IN' ) ) ;
    public final void rule__ListExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3016:1: ( ( ( 'FORALL_IN' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3017:1: ( ( 'FORALL_IN' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3017:1: ( ( 'FORALL_IN' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3018:1: ( 'FORALL_IN' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getFORALL_INKeyword_1_1_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3019:1: ( 'FORALL_IN' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3020:2: 'FORALL_IN'
            {
            match(input,29,FOLLOW_29_in_rule__ListExpression__Group_1_1__0__Impl6158); if (state.failed) return ;

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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3031:1: rule__ListExpression__Group_1_1__1 : rule__ListExpression__Group_1_1__1__Impl ;
    public final void rule__ListExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3035:1: ( rule__ListExpression__Group_1_1__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3036:2: rule__ListExpression__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_1_1__1__Impl_in_rule__ListExpression__Group_1_1__16190);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3042:1: rule__ListExpression__Group_1_1__1__Impl : ( ( rule__ListExpression__ExprAssignment_1_1_1 ) ) ;
    public final void rule__ListExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3046:1: ( ( ( rule__ListExpression__ExprAssignment_1_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3047:1: ( ( rule__ListExpression__ExprAssignment_1_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3047:1: ( ( rule__ListExpression__ExprAssignment_1_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3048:1: ( rule__ListExpression__ExprAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprAssignment_1_1_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3049:1: ( rule__ListExpression__ExprAssignment_1_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3049:2: rule__ListExpression__ExprAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__ListExpression__ExprAssignment_1_1_1_in_rule__ListExpression__Group_1_1__1__Impl6217);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3063:1: rule__ListExpression__Group_2__0 : rule__ListExpression__Group_2__0__Impl rule__ListExpression__Group_2__1 ;
    public final void rule__ListExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3067:1: ( rule__ListExpression__Group_2__0__Impl rule__ListExpression__Group_2__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3068:2: rule__ListExpression__Group_2__0__Impl rule__ListExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_2__0__Impl_in_rule__ListExpression__Group_2__06251);
            rule__ListExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_2__1_in_rule__ListExpression__Group_2__06254);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3075:1: rule__ListExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__ListExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3079:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3080:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3080:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3081:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getFirstInAction_2_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3082:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3084:1: 
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3094:1: rule__ListExpression__Group_2__1 : rule__ListExpression__Group_2__1__Impl ;
    public final void rule__ListExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3098:1: ( rule__ListExpression__Group_2__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3099:2: rule__ListExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_2__1__Impl_in_rule__ListExpression__Group_2__16312);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3105:1: rule__ListExpression__Group_2__1__Impl : ( ( rule__ListExpression__Group_2_1__0 ) ) ;
    public final void rule__ListExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3109:1: ( ( ( rule__ListExpression__Group_2_1__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3110:1: ( ( rule__ListExpression__Group_2_1__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3110:1: ( ( rule__ListExpression__Group_2_1__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3111:1: ( rule__ListExpression__Group_2_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getGroup_2_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3112:1: ( rule__ListExpression__Group_2_1__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3112:2: rule__ListExpression__Group_2_1__0
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_2_1__0_in_rule__ListExpression__Group_2__1__Impl6339);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3126:1: rule__ListExpression__Group_2_1__0 : rule__ListExpression__Group_2_1__0__Impl rule__ListExpression__Group_2_1__1 ;
    public final void rule__ListExpression__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3130:1: ( rule__ListExpression__Group_2_1__0__Impl rule__ListExpression__Group_2_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3131:2: rule__ListExpression__Group_2_1__0__Impl rule__ListExpression__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_2_1__0__Impl_in_rule__ListExpression__Group_2_1__06373);
            rule__ListExpression__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_2_1__1_in_rule__ListExpression__Group_2_1__06376);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3138:1: rule__ListExpression__Group_2_1__0__Impl : ( ( 'FIRST_IN' ) ) ;
    public final void rule__ListExpression__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3142:1: ( ( ( 'FIRST_IN' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3143:1: ( ( 'FIRST_IN' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3143:1: ( ( 'FIRST_IN' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3144:1: ( 'FIRST_IN' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getFIRST_INKeyword_2_1_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3145:1: ( 'FIRST_IN' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3146:2: 'FIRST_IN'
            {
            match(input,30,FOLLOW_30_in_rule__ListExpression__Group_2_1__0__Impl6405); if (state.failed) return ;

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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3157:1: rule__ListExpression__Group_2_1__1 : rule__ListExpression__Group_2_1__1__Impl ;
    public final void rule__ListExpression__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3161:1: ( rule__ListExpression__Group_2_1__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3162:2: rule__ListExpression__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_2_1__1__Impl_in_rule__ListExpression__Group_2_1__16437);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3168:1: rule__ListExpression__Group_2_1__1__Impl : ( ( rule__ListExpression__ExprAssignment_2_1_1 ) ) ;
    public final void rule__ListExpression__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3172:1: ( ( ( rule__ListExpression__ExprAssignment_2_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3173:1: ( ( rule__ListExpression__ExprAssignment_2_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3173:1: ( ( rule__ListExpression__ExprAssignment_2_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3174:1: ( rule__ListExpression__ExprAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprAssignment_2_1_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3175:1: ( rule__ListExpression__ExprAssignment_2_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3175:2: rule__ListExpression__ExprAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__ListExpression__ExprAssignment_2_1_1_in_rule__ListExpression__Group_2_1__1__Impl6464);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3189:1: rule__ListExpression__Group_3__0 : rule__ListExpression__Group_3__0__Impl rule__ListExpression__Group_3__1 ;
    public final void rule__ListExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3193:1: ( rule__ListExpression__Group_3__0__Impl rule__ListExpression__Group_3__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3194:2: rule__ListExpression__Group_3__0__Impl rule__ListExpression__Group_3__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_3__0__Impl_in_rule__ListExpression__Group_3__06498);
            rule__ListExpression__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_3__1_in_rule__ListExpression__Group_3__06501);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3201:1: rule__ListExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__ListExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3205:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3206:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3206:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3207:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getLastInAction_3_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3208:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3210:1: 
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3220:1: rule__ListExpression__Group_3__1 : rule__ListExpression__Group_3__1__Impl ;
    public final void rule__ListExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3224:1: ( rule__ListExpression__Group_3__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3225:2: rule__ListExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_3__1__Impl_in_rule__ListExpression__Group_3__16559);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3231:1: rule__ListExpression__Group_3__1__Impl : ( ( rule__ListExpression__Group_3_1__0 ) ) ;
    public final void rule__ListExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3235:1: ( ( ( rule__ListExpression__Group_3_1__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3236:1: ( ( rule__ListExpression__Group_3_1__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3236:1: ( ( rule__ListExpression__Group_3_1__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3237:1: ( rule__ListExpression__Group_3_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getGroup_3_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3238:1: ( rule__ListExpression__Group_3_1__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3238:2: rule__ListExpression__Group_3_1__0
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_3_1__0_in_rule__ListExpression__Group_3__1__Impl6586);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3252:1: rule__ListExpression__Group_3_1__0 : rule__ListExpression__Group_3_1__0__Impl rule__ListExpression__Group_3_1__1 ;
    public final void rule__ListExpression__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3256:1: ( rule__ListExpression__Group_3_1__0__Impl rule__ListExpression__Group_3_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3257:2: rule__ListExpression__Group_3_1__0__Impl rule__ListExpression__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_3_1__0__Impl_in_rule__ListExpression__Group_3_1__06620);
            rule__ListExpression__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_3_1__1_in_rule__ListExpression__Group_3_1__06623);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3264:1: rule__ListExpression__Group_3_1__0__Impl : ( ( 'LAST_IN' ) ) ;
    public final void rule__ListExpression__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3268:1: ( ( ( 'LAST_IN' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3269:1: ( ( 'LAST_IN' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3269:1: ( ( 'LAST_IN' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3270:1: ( 'LAST_IN' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getLAST_INKeyword_3_1_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3271:1: ( 'LAST_IN' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3272:2: 'LAST_IN'
            {
            match(input,31,FOLLOW_31_in_rule__ListExpression__Group_3_1__0__Impl6652); if (state.failed) return ;

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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3283:1: rule__ListExpression__Group_3_1__1 : rule__ListExpression__Group_3_1__1__Impl ;
    public final void rule__ListExpression__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3287:1: ( rule__ListExpression__Group_3_1__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3288:2: rule__ListExpression__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_3_1__1__Impl_in_rule__ListExpression__Group_3_1__16684);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3294:1: rule__ListExpression__Group_3_1__1__Impl : ( ( rule__ListExpression__ExprAssignment_3_1_1 ) ) ;
    public final void rule__ListExpression__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3298:1: ( ( ( rule__ListExpression__ExprAssignment_3_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3299:1: ( ( rule__ListExpression__ExprAssignment_3_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3299:1: ( ( rule__ListExpression__ExprAssignment_3_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3300:1: ( rule__ListExpression__ExprAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprAssignment_3_1_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3301:1: ( rule__ListExpression__ExprAssignment_3_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3301:2: rule__ListExpression__ExprAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__ListExpression__ExprAssignment_3_1_1_in_rule__ListExpression__Group_3_1__1__Impl6711);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3315:1: rule__ListExpression__Group_4__0 : rule__ListExpression__Group_4__0__Impl rule__ListExpression__Group_4__1 ;
    public final void rule__ListExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3319:1: ( rule__ListExpression__Group_4__0__Impl rule__ListExpression__Group_4__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3320:2: rule__ListExpression__Group_4__0__Impl rule__ListExpression__Group_4__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_4__0__Impl_in_rule__ListExpression__Group_4__06745);
            rule__ListExpression__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_4__1_in_rule__ListExpression__Group_4__06748);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3327:1: rule__ListExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__ListExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3331:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3332:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3332:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3333:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getCountAction_4_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3334:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3336:1: 
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3346:1: rule__ListExpression__Group_4__1 : rule__ListExpression__Group_4__1__Impl ;
    public final void rule__ListExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3350:1: ( rule__ListExpression__Group_4__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3351:2: rule__ListExpression__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_4__1__Impl_in_rule__ListExpression__Group_4__16806);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3357:1: rule__ListExpression__Group_4__1__Impl : ( ( rule__ListExpression__Group_4_1__0 ) ) ;
    public final void rule__ListExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3361:1: ( ( ( rule__ListExpression__Group_4_1__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3362:1: ( ( rule__ListExpression__Group_4_1__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3362:1: ( ( rule__ListExpression__Group_4_1__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3363:1: ( rule__ListExpression__Group_4_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getGroup_4_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3364:1: ( rule__ListExpression__Group_4_1__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3364:2: rule__ListExpression__Group_4_1__0
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_4_1__0_in_rule__ListExpression__Group_4__1__Impl6833);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3378:1: rule__ListExpression__Group_4_1__0 : rule__ListExpression__Group_4_1__0__Impl rule__ListExpression__Group_4_1__1 ;
    public final void rule__ListExpression__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3382:1: ( rule__ListExpression__Group_4_1__0__Impl rule__ListExpression__Group_4_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3383:2: rule__ListExpression__Group_4_1__0__Impl rule__ListExpression__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_4_1__0__Impl_in_rule__ListExpression__Group_4_1__06867);
            rule__ListExpression__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_4_1__1_in_rule__ListExpression__Group_4_1__06870);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3390:1: rule__ListExpression__Group_4_1__0__Impl : ( ( 'COUNT' ) ) ;
    public final void rule__ListExpression__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3394:1: ( ( ( 'COUNT' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3395:1: ( ( 'COUNT' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3395:1: ( ( 'COUNT' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3396:1: ( 'COUNT' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getCOUNTKeyword_4_1_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3397:1: ( 'COUNT' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3398:2: 'COUNT'
            {
            match(input,32,FOLLOW_32_in_rule__ListExpression__Group_4_1__0__Impl6899); if (state.failed) return ;

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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3409:1: rule__ListExpression__Group_4_1__1 : rule__ListExpression__Group_4_1__1__Impl ;
    public final void rule__ListExpression__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3413:1: ( rule__ListExpression__Group_4_1__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3414:2: rule__ListExpression__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_4_1__1__Impl_in_rule__ListExpression__Group_4_1__16931);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3420:1: rule__ListExpression__Group_4_1__1__Impl : ( ( rule__ListExpression__ExprAssignment_4_1_1 ) ) ;
    public final void rule__ListExpression__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3424:1: ( ( ( rule__ListExpression__ExprAssignment_4_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3425:1: ( ( rule__ListExpression__ExprAssignment_4_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3425:1: ( ( rule__ListExpression__ExprAssignment_4_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3426:1: ( rule__ListExpression__ExprAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprAssignment_4_1_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3427:1: ( rule__ListExpression__ExprAssignment_4_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3427:2: rule__ListExpression__ExprAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__ListExpression__ExprAssignment_4_1_1_in_rule__ListExpression__Group_4_1__1__Impl6958);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3441:1: rule__ListExpression__Group_5__0 : rule__ListExpression__Group_5__0__Impl rule__ListExpression__Group_5__1 ;
    public final void rule__ListExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3445:1: ( rule__ListExpression__Group_5__0__Impl rule__ListExpression__Group_5__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3446:2: rule__ListExpression__Group_5__0__Impl rule__ListExpression__Group_5__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_5__0__Impl_in_rule__ListExpression__Group_5__06992);
            rule__ListExpression__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_5__1_in_rule__ListExpression__Group_5__06995);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3453:1: rule__ListExpression__Group_5__0__Impl : ( () ) ;
    public final void rule__ListExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3457:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3458:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3458:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3459:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getReduceAction_5_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3460:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3462:1: 
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3472:1: rule__ListExpression__Group_5__1 : rule__ListExpression__Group_5__1__Impl ;
    public final void rule__ListExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3476:1: ( rule__ListExpression__Group_5__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3477:2: rule__ListExpression__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_5__1__Impl_in_rule__ListExpression__Group_5__17053);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3483:1: rule__ListExpression__Group_5__1__Impl : ( ( rule__ListExpression__Group_5_1__0 ) ) ;
    public final void rule__ListExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3487:1: ( ( ( rule__ListExpression__Group_5_1__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3488:1: ( ( rule__ListExpression__Group_5_1__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3488:1: ( ( rule__ListExpression__Group_5_1__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3489:1: ( rule__ListExpression__Group_5_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getGroup_5_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3490:1: ( rule__ListExpression__Group_5_1__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3490:2: rule__ListExpression__Group_5_1__0
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_5_1__0_in_rule__ListExpression__Group_5__1__Impl7080);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3504:1: rule__ListExpression__Group_5_1__0 : rule__ListExpression__Group_5_1__0__Impl rule__ListExpression__Group_5_1__1 ;
    public final void rule__ListExpression__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3508:1: ( rule__ListExpression__Group_5_1__0__Impl rule__ListExpression__Group_5_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3509:2: rule__ListExpression__Group_5_1__0__Impl rule__ListExpression__Group_5_1__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_5_1__0__Impl_in_rule__ListExpression__Group_5_1__07114);
            rule__ListExpression__Group_5_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_5_1__1_in_rule__ListExpression__Group_5_1__07117);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3516:1: rule__ListExpression__Group_5_1__0__Impl : ( ( 'REDUCE' ) ) ;
    public final void rule__ListExpression__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3520:1: ( ( ( 'REDUCE' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3521:1: ( ( 'REDUCE' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3521:1: ( ( 'REDUCE' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3522:1: ( 'REDUCE' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getREDUCEKeyword_5_1_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3523:1: ( 'REDUCE' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3524:2: 'REDUCE'
            {
            match(input,33,FOLLOW_33_in_rule__ListExpression__Group_5_1__0__Impl7146); if (state.failed) return ;

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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3535:1: rule__ListExpression__Group_5_1__1 : rule__ListExpression__Group_5_1__1__Impl rule__ListExpression__Group_5_1__2 ;
    public final void rule__ListExpression__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3539:1: ( rule__ListExpression__Group_5_1__1__Impl rule__ListExpression__Group_5_1__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3540:2: rule__ListExpression__Group_5_1__1__Impl rule__ListExpression__Group_5_1__2
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_5_1__1__Impl_in_rule__ListExpression__Group_5_1__17178);
            rule__ListExpression__Group_5_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_5_1__2_in_rule__ListExpression__Group_5_1__17181);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3547:1: rule__ListExpression__Group_5_1__1__Impl : ( ( rule__ListExpression__ExprAssignment_5_1_1 ) ) ;
    public final void rule__ListExpression__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3551:1: ( ( ( rule__ListExpression__ExprAssignment_5_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3552:1: ( ( rule__ListExpression__ExprAssignment_5_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3552:1: ( ( rule__ListExpression__ExprAssignment_5_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3553:1: ( rule__ListExpression__ExprAssignment_5_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprAssignment_5_1_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3554:1: ( rule__ListExpression__ExprAssignment_5_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3554:2: rule__ListExpression__ExprAssignment_5_1_1
            {
            pushFollow(FOLLOW_rule__ListExpression__ExprAssignment_5_1_1_in_rule__ListExpression__Group_5_1__1__Impl7208);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3564:1: rule__ListExpression__Group_5_1__2 : rule__ListExpression__Group_5_1__2__Impl rule__ListExpression__Group_5_1__3 ;
    public final void rule__ListExpression__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3568:1: ( rule__ListExpression__Group_5_1__2__Impl rule__ListExpression__Group_5_1__3 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3569:2: rule__ListExpression__Group_5_1__2__Impl rule__ListExpression__Group_5_1__3
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_5_1__2__Impl_in_rule__ListExpression__Group_5_1__27238);
            rule__ListExpression__Group_5_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_5_1__3_in_rule__ListExpression__Group_5_1__27241);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3576:1: rule__ListExpression__Group_5_1__2__Impl : ( 'USING' ) ;
    public final void rule__ListExpression__Group_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3580:1: ( ( 'USING' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3581:1: ( 'USING' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3581:1: ( 'USING' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3582:1: 'USING'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getUSINGKeyword_5_1_2()); 
            }
            match(input,34,FOLLOW_34_in_rule__ListExpression__Group_5_1__2__Impl7269); if (state.failed) return ;
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3595:1: rule__ListExpression__Group_5_1__3 : rule__ListExpression__Group_5_1__3__Impl rule__ListExpression__Group_5_1__4 ;
    public final void rule__ListExpression__Group_5_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3599:1: ( rule__ListExpression__Group_5_1__3__Impl rule__ListExpression__Group_5_1__4 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3600:2: rule__ListExpression__Group_5_1__3__Impl rule__ListExpression__Group_5_1__4
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_5_1__3__Impl_in_rule__ListExpression__Group_5_1__37300);
            rule__ListExpression__Group_5_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_5_1__4_in_rule__ListExpression__Group_5_1__37303);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3607:1: rule__ListExpression__Group_5_1__3__Impl : ( ( rule__ListExpression__UsingExprAssignment_5_1_3 ) ) ;
    public final void rule__ListExpression__Group_5_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3611:1: ( ( ( rule__ListExpression__UsingExprAssignment_5_1_3 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3612:1: ( ( rule__ListExpression__UsingExprAssignment_5_1_3 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3612:1: ( ( rule__ListExpression__UsingExprAssignment_5_1_3 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3613:1: ( rule__ListExpression__UsingExprAssignment_5_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getUsingExprAssignment_5_1_3()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3614:1: ( rule__ListExpression__UsingExprAssignment_5_1_3 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3614:2: rule__ListExpression__UsingExprAssignment_5_1_3
            {
            pushFollow(FOLLOW_rule__ListExpression__UsingExprAssignment_5_1_3_in_rule__ListExpression__Group_5_1__3__Impl7330);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3624:1: rule__ListExpression__Group_5_1__4 : rule__ListExpression__Group_5_1__4__Impl rule__ListExpression__Group_5_1__5 ;
    public final void rule__ListExpression__Group_5_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3628:1: ( rule__ListExpression__Group_5_1__4__Impl rule__ListExpression__Group_5_1__5 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3629:2: rule__ListExpression__Group_5_1__4__Impl rule__ListExpression__Group_5_1__5
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_5_1__4__Impl_in_rule__ListExpression__Group_5_1__47360);
            rule__ListExpression__Group_5_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_5_1__5_in_rule__ListExpression__Group_5_1__47363);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3636:1: rule__ListExpression__Group_5_1__4__Impl : ( 'INITIAL_VALUE' ) ;
    public final void rule__ListExpression__Group_5_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3640:1: ( ( 'INITIAL_VALUE' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3641:1: ( 'INITIAL_VALUE' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3641:1: ( 'INITIAL_VALUE' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3642:1: 'INITIAL_VALUE'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getINITIAL_VALUEKeyword_5_1_4()); 
            }
            match(input,35,FOLLOW_35_in_rule__ListExpression__Group_5_1__4__Impl7391); if (state.failed) return ;
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3655:1: rule__ListExpression__Group_5_1__5 : rule__ListExpression__Group_5_1__5__Impl ;
    public final void rule__ListExpression__Group_5_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3659:1: ( rule__ListExpression__Group_5_1__5__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3660:2: rule__ListExpression__Group_5_1__5__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_5_1__5__Impl_in_rule__ListExpression__Group_5_1__57422);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3666:1: rule__ListExpression__Group_5_1__5__Impl : ( ( rule__ListExpression__InitValueAssignment_5_1_5 ) ) ;
    public final void rule__ListExpression__Group_5_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3670:1: ( ( ( rule__ListExpression__InitValueAssignment_5_1_5 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3671:1: ( ( rule__ListExpression__InitValueAssignment_5_1_5 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3671:1: ( ( rule__ListExpression__InitValueAssignment_5_1_5 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3672:1: ( rule__ListExpression__InitValueAssignment_5_1_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getInitValueAssignment_5_1_5()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3673:1: ( rule__ListExpression__InitValueAssignment_5_1_5 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3673:2: rule__ListExpression__InitValueAssignment_5_1_5
            {
            pushFollow(FOLLOW_rule__ListExpression__InitValueAssignment_5_1_5_in_rule__ListExpression__Group_5_1__5__Impl7449);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3695:1: rule__ListExpression__Group_6__0 : rule__ListExpression__Group_6__0__Impl rule__ListExpression__Group_6__1 ;
    public final void rule__ListExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3699:1: ( rule__ListExpression__Group_6__0__Impl rule__ListExpression__Group_6__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3700:2: rule__ListExpression__Group_6__0__Impl rule__ListExpression__Group_6__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_6__0__Impl_in_rule__ListExpression__Group_6__07491);
            rule__ListExpression__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_6__1_in_rule__ListExpression__Group_6__07494);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3707:1: rule__ListExpression__Group_6__0__Impl : ( () ) ;
    public final void rule__ListExpression__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3711:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3712:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3712:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3713:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getSumAction_6_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3714:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3716:1: 
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3726:1: rule__ListExpression__Group_6__1 : rule__ListExpression__Group_6__1__Impl ;
    public final void rule__ListExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3730:1: ( rule__ListExpression__Group_6__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3731:2: rule__ListExpression__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_6__1__Impl_in_rule__ListExpression__Group_6__17552);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3737:1: rule__ListExpression__Group_6__1__Impl : ( ( rule__ListExpression__Group_6_1__0 ) ) ;
    public final void rule__ListExpression__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3741:1: ( ( ( rule__ListExpression__Group_6_1__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3742:1: ( ( rule__ListExpression__Group_6_1__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3742:1: ( ( rule__ListExpression__Group_6_1__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3743:1: ( rule__ListExpression__Group_6_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getGroup_6_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3744:1: ( rule__ListExpression__Group_6_1__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3744:2: rule__ListExpression__Group_6_1__0
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_6_1__0_in_rule__ListExpression__Group_6__1__Impl7579);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3758:1: rule__ListExpression__Group_6_1__0 : rule__ListExpression__Group_6_1__0__Impl rule__ListExpression__Group_6_1__1 ;
    public final void rule__ListExpression__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3762:1: ( rule__ListExpression__Group_6_1__0__Impl rule__ListExpression__Group_6_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3763:2: rule__ListExpression__Group_6_1__0__Impl rule__ListExpression__Group_6_1__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_6_1__0__Impl_in_rule__ListExpression__Group_6_1__07613);
            rule__ListExpression__Group_6_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_6_1__1_in_rule__ListExpression__Group_6_1__07616);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3770:1: rule__ListExpression__Group_6_1__0__Impl : ( ( 'SUM' ) ) ;
    public final void rule__ListExpression__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3774:1: ( ( ( 'SUM' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3775:1: ( ( 'SUM' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3775:1: ( ( 'SUM' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3776:1: ( 'SUM' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getSUMKeyword_6_1_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3777:1: ( 'SUM' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3778:2: 'SUM'
            {
            match(input,36,FOLLOW_36_in_rule__ListExpression__Group_6_1__0__Impl7645); if (state.failed) return ;

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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3789:1: rule__ListExpression__Group_6_1__1 : rule__ListExpression__Group_6_1__1__Impl rule__ListExpression__Group_6_1__2 ;
    public final void rule__ListExpression__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3793:1: ( rule__ListExpression__Group_6_1__1__Impl rule__ListExpression__Group_6_1__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3794:2: rule__ListExpression__Group_6_1__1__Impl rule__ListExpression__Group_6_1__2
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_6_1__1__Impl_in_rule__ListExpression__Group_6_1__17677);
            rule__ListExpression__Group_6_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_6_1__2_in_rule__ListExpression__Group_6_1__17680);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3801:1: rule__ListExpression__Group_6_1__1__Impl : ( ( rule__ListExpression__ExprAssignment_6_1_1 ) ) ;
    public final void rule__ListExpression__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3805:1: ( ( ( rule__ListExpression__ExprAssignment_6_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3806:1: ( ( rule__ListExpression__ExprAssignment_6_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3806:1: ( ( rule__ListExpression__ExprAssignment_6_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3807:1: ( rule__ListExpression__ExprAssignment_6_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprAssignment_6_1_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3808:1: ( rule__ListExpression__ExprAssignment_6_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3808:2: rule__ListExpression__ExprAssignment_6_1_1
            {
            pushFollow(FOLLOW_rule__ListExpression__ExprAssignment_6_1_1_in_rule__ListExpression__Group_6_1__1__Impl7707);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3818:1: rule__ListExpression__Group_6_1__2 : rule__ListExpression__Group_6_1__2__Impl rule__ListExpression__Group_6_1__3 ;
    public final void rule__ListExpression__Group_6_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3822:1: ( rule__ListExpression__Group_6_1__2__Impl rule__ListExpression__Group_6_1__3 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3823:2: rule__ListExpression__Group_6_1__2__Impl rule__ListExpression__Group_6_1__3
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_6_1__2__Impl_in_rule__ListExpression__Group_6_1__27737);
            rule__ListExpression__Group_6_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_6_1__3_in_rule__ListExpression__Group_6_1__27740);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3830:1: rule__ListExpression__Group_6_1__2__Impl : ( 'USING' ) ;
    public final void rule__ListExpression__Group_6_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3834:1: ( ( 'USING' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3835:1: ( 'USING' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3835:1: ( 'USING' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3836:1: 'USING'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getUSINGKeyword_6_1_2()); 
            }
            match(input,34,FOLLOW_34_in_rule__ListExpression__Group_6_1__2__Impl7768); if (state.failed) return ;
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3849:1: rule__ListExpression__Group_6_1__3 : rule__ListExpression__Group_6_1__3__Impl ;
    public final void rule__ListExpression__Group_6_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3853:1: ( rule__ListExpression__Group_6_1__3__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3854:2: rule__ListExpression__Group_6_1__3__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_6_1__3__Impl_in_rule__ListExpression__Group_6_1__37799);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3860:1: rule__ListExpression__Group_6_1__3__Impl : ( ( rule__ListExpression__UsingExprAssignment_6_1_3 ) ) ;
    public final void rule__ListExpression__Group_6_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3864:1: ( ( ( rule__ListExpression__UsingExprAssignment_6_1_3 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3865:1: ( ( rule__ListExpression__UsingExprAssignment_6_1_3 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3865:1: ( ( rule__ListExpression__UsingExprAssignment_6_1_3 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3866:1: ( rule__ListExpression__UsingExprAssignment_6_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getUsingExprAssignment_6_1_3()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3867:1: ( rule__ListExpression__UsingExprAssignment_6_1_3 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3867:2: rule__ListExpression__UsingExprAssignment_6_1_3
            {
            pushFollow(FOLLOW_rule__ListExpression__UsingExprAssignment_6_1_3_in_rule__ListExpression__Group_6_1__3__Impl7826);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3885:1: rule__ListExpression__Group_7__0 : rule__ListExpression__Group_7__0__Impl rule__ListExpression__Group_7__1 ;
    public final void rule__ListExpression__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3889:1: ( rule__ListExpression__Group_7__0__Impl rule__ListExpression__Group_7__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3890:2: rule__ListExpression__Group_7__0__Impl rule__ListExpression__Group_7__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_7__0__Impl_in_rule__ListExpression__Group_7__07864);
            rule__ListExpression__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_7__1_in_rule__ListExpression__Group_7__07867);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3897:1: rule__ListExpression__Group_7__0__Impl : ( () ) ;
    public final void rule__ListExpression__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3901:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3902:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3902:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3903:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getMapAction_7_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3904:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3906:1: 
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3916:1: rule__ListExpression__Group_7__1 : rule__ListExpression__Group_7__1__Impl ;
    public final void rule__ListExpression__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3920:1: ( rule__ListExpression__Group_7__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3921:2: rule__ListExpression__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_7__1__Impl_in_rule__ListExpression__Group_7__17925);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3927:1: rule__ListExpression__Group_7__1__Impl : ( ( rule__ListExpression__Group_7_1__0 ) ) ;
    public final void rule__ListExpression__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3931:1: ( ( ( rule__ListExpression__Group_7_1__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3932:1: ( ( rule__ListExpression__Group_7_1__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3932:1: ( ( rule__ListExpression__Group_7_1__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3933:1: ( rule__ListExpression__Group_7_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getGroup_7_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3934:1: ( rule__ListExpression__Group_7_1__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3934:2: rule__ListExpression__Group_7_1__0
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_7_1__0_in_rule__ListExpression__Group_7__1__Impl7952);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3948:1: rule__ListExpression__Group_7_1__0 : rule__ListExpression__Group_7_1__0__Impl rule__ListExpression__Group_7_1__1 ;
    public final void rule__ListExpression__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3952:1: ( rule__ListExpression__Group_7_1__0__Impl rule__ListExpression__Group_7_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3953:2: rule__ListExpression__Group_7_1__0__Impl rule__ListExpression__Group_7_1__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_7_1__0__Impl_in_rule__ListExpression__Group_7_1__07986);
            rule__ListExpression__Group_7_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_7_1__1_in_rule__ListExpression__Group_7_1__07989);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3960:1: rule__ListExpression__Group_7_1__0__Impl : ( ( 'MAP' ) ) ;
    public final void rule__ListExpression__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3964:1: ( ( ( 'MAP' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3965:1: ( ( 'MAP' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3965:1: ( ( 'MAP' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3966:1: ( 'MAP' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getMAPKeyword_7_1_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3967:1: ( 'MAP' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3968:2: 'MAP'
            {
            match(input,37,FOLLOW_37_in_rule__ListExpression__Group_7_1__0__Impl8018); if (state.failed) return ;

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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3979:1: rule__ListExpression__Group_7_1__1 : rule__ListExpression__Group_7_1__1__Impl rule__ListExpression__Group_7_1__2 ;
    public final void rule__ListExpression__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3983:1: ( rule__ListExpression__Group_7_1__1__Impl rule__ListExpression__Group_7_1__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3984:2: rule__ListExpression__Group_7_1__1__Impl rule__ListExpression__Group_7_1__2
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_7_1__1__Impl_in_rule__ListExpression__Group_7_1__18050);
            rule__ListExpression__Group_7_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_7_1__2_in_rule__ListExpression__Group_7_1__18053);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3991:1: rule__ListExpression__Group_7_1__1__Impl : ( ( rule__ListExpression__ExprAssignment_7_1_1 ) ) ;
    public final void rule__ListExpression__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3995:1: ( ( ( rule__ListExpression__ExprAssignment_7_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3996:1: ( ( rule__ListExpression__ExprAssignment_7_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3996:1: ( ( rule__ListExpression__ExprAssignment_7_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3997:1: ( rule__ListExpression__ExprAssignment_7_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprAssignment_7_1_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3998:1: ( rule__ListExpression__ExprAssignment_7_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:3998:2: rule__ListExpression__ExprAssignment_7_1_1
            {
            pushFollow(FOLLOW_rule__ListExpression__ExprAssignment_7_1_1_in_rule__ListExpression__Group_7_1__1__Impl8080);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4008:1: rule__ListExpression__Group_7_1__2 : rule__ListExpression__Group_7_1__2__Impl rule__ListExpression__Group_7_1__3 ;
    public final void rule__ListExpression__Group_7_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4012:1: ( rule__ListExpression__Group_7_1__2__Impl rule__ListExpression__Group_7_1__3 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4013:2: rule__ListExpression__Group_7_1__2__Impl rule__ListExpression__Group_7_1__3
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_7_1__2__Impl_in_rule__ListExpression__Group_7_1__28110);
            rule__ListExpression__Group_7_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_7_1__3_in_rule__ListExpression__Group_7_1__28113);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4020:1: rule__ListExpression__Group_7_1__2__Impl : ( 'USING' ) ;
    public final void rule__ListExpression__Group_7_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4024:1: ( ( 'USING' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4025:1: ( 'USING' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4025:1: ( 'USING' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4026:1: 'USING'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getUSINGKeyword_7_1_2()); 
            }
            match(input,34,FOLLOW_34_in_rule__ListExpression__Group_7_1__2__Impl8141); if (state.failed) return ;
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4039:1: rule__ListExpression__Group_7_1__3 : rule__ListExpression__Group_7_1__3__Impl ;
    public final void rule__ListExpression__Group_7_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4043:1: ( rule__ListExpression__Group_7_1__3__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4044:2: rule__ListExpression__Group_7_1__3__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_7_1__3__Impl_in_rule__ListExpression__Group_7_1__38172);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4050:1: rule__ListExpression__Group_7_1__3__Impl : ( ( rule__ListExpression__UsingExprAssignment_7_1_3 ) ) ;
    public final void rule__ListExpression__Group_7_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4054:1: ( ( ( rule__ListExpression__UsingExprAssignment_7_1_3 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4055:1: ( ( rule__ListExpression__UsingExprAssignment_7_1_3 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4055:1: ( ( rule__ListExpression__UsingExprAssignment_7_1_3 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4056:1: ( rule__ListExpression__UsingExprAssignment_7_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getUsingExprAssignment_7_1_3()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4057:1: ( rule__ListExpression__UsingExprAssignment_7_1_3 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4057:2: rule__ListExpression__UsingExprAssignment_7_1_3
            {
            pushFollow(FOLLOW_rule__ListExpression__UsingExprAssignment_7_1_3_in_rule__ListExpression__Group_7_1__3__Impl8199);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4075:1: rule__ListExpression__Group_8__0 : rule__ListExpression__Group_8__0__Impl rule__ListExpression__Group_8__1 ;
    public final void rule__ListExpression__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4079:1: ( rule__ListExpression__Group_8__0__Impl rule__ListExpression__Group_8__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4080:2: rule__ListExpression__Group_8__0__Impl rule__ListExpression__Group_8__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_8__0__Impl_in_rule__ListExpression__Group_8__08237);
            rule__ListExpression__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_8__1_in_rule__ListExpression__Group_8__08240);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4087:1: rule__ListExpression__Group_8__0__Impl : ( () ) ;
    public final void rule__ListExpression__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4091:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4092:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4092:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4093:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getApplyAction_8_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4094:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4096:1: 
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4106:1: rule__ListExpression__Group_8__1 : rule__ListExpression__Group_8__1__Impl ;
    public final void rule__ListExpression__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4110:1: ( rule__ListExpression__Group_8__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4111:2: rule__ListExpression__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_8__1__Impl_in_rule__ListExpression__Group_8__18298);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4117:1: rule__ListExpression__Group_8__1__Impl : ( ( rule__ListExpression__Group_8_1__0 ) ) ;
    public final void rule__ListExpression__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4121:1: ( ( ( rule__ListExpression__Group_8_1__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4122:1: ( ( rule__ListExpression__Group_8_1__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4122:1: ( ( rule__ListExpression__Group_8_1__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4123:1: ( rule__ListExpression__Group_8_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getGroup_8_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4124:1: ( rule__ListExpression__Group_8_1__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4124:2: rule__ListExpression__Group_8_1__0
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_8_1__0_in_rule__ListExpression__Group_8__1__Impl8325);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4138:1: rule__ListExpression__Group_8_1__0 : rule__ListExpression__Group_8_1__0__Impl rule__ListExpression__Group_8_1__1 ;
    public final void rule__ListExpression__Group_8_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4142:1: ( rule__ListExpression__Group_8_1__0__Impl rule__ListExpression__Group_8_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4143:2: rule__ListExpression__Group_8_1__0__Impl rule__ListExpression__Group_8_1__1
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_8_1__0__Impl_in_rule__ListExpression__Group_8_1__08359);
            rule__ListExpression__Group_8_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_8_1__1_in_rule__ListExpression__Group_8_1__08362);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4150:1: rule__ListExpression__Group_8_1__0__Impl : ( ( 'APPLY' ) ) ;
    public final void rule__ListExpression__Group_8_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4154:1: ( ( ( 'APPLY' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4155:1: ( ( 'APPLY' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4155:1: ( ( 'APPLY' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4156:1: ( 'APPLY' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getAPPLYKeyword_8_1_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4157:1: ( 'APPLY' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4158:2: 'APPLY'
            {
            match(input,38,FOLLOW_38_in_rule__ListExpression__Group_8_1__0__Impl8391); if (state.failed) return ;

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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4169:1: rule__ListExpression__Group_8_1__1 : rule__ListExpression__Group_8_1__1__Impl rule__ListExpression__Group_8_1__2 ;
    public final void rule__ListExpression__Group_8_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4173:1: ( rule__ListExpression__Group_8_1__1__Impl rule__ListExpression__Group_8_1__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4174:2: rule__ListExpression__Group_8_1__1__Impl rule__ListExpression__Group_8_1__2
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_8_1__1__Impl_in_rule__ListExpression__Group_8_1__18423);
            rule__ListExpression__Group_8_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_8_1__2_in_rule__ListExpression__Group_8_1__18426);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4181:1: rule__ListExpression__Group_8_1__1__Impl : ( ( rule__ListExpression__ApplyExprAssignment_8_1_1 ) ) ;
    public final void rule__ListExpression__Group_8_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4185:1: ( ( ( rule__ListExpression__ApplyExprAssignment_8_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4186:1: ( ( rule__ListExpression__ApplyExprAssignment_8_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4186:1: ( ( rule__ListExpression__ApplyExprAssignment_8_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4187:1: ( rule__ListExpression__ApplyExprAssignment_8_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getApplyExprAssignment_8_1_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4188:1: ( rule__ListExpression__ApplyExprAssignment_8_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4188:2: rule__ListExpression__ApplyExprAssignment_8_1_1
            {
            pushFollow(FOLLOW_rule__ListExpression__ApplyExprAssignment_8_1_1_in_rule__ListExpression__Group_8_1__1__Impl8453);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4198:1: rule__ListExpression__Group_8_1__2 : rule__ListExpression__Group_8_1__2__Impl rule__ListExpression__Group_8_1__3 ;
    public final void rule__ListExpression__Group_8_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4202:1: ( rule__ListExpression__Group_8_1__2__Impl rule__ListExpression__Group_8_1__3 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4203:2: rule__ListExpression__Group_8_1__2__Impl rule__ListExpression__Group_8_1__3
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_8_1__2__Impl_in_rule__ListExpression__Group_8_1__28483);
            rule__ListExpression__Group_8_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListExpression__Group_8_1__3_in_rule__ListExpression__Group_8_1__28486);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4210:1: rule__ListExpression__Group_8_1__2__Impl : ( 'ON' ) ;
    public final void rule__ListExpression__Group_8_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4214:1: ( ( 'ON' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4215:1: ( 'ON' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4215:1: ( 'ON' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4216:1: 'ON'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getONKeyword_8_1_2()); 
            }
            match(input,39,FOLLOW_39_in_rule__ListExpression__Group_8_1__2__Impl8514); if (state.failed) return ;
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4229:1: rule__ListExpression__Group_8_1__3 : rule__ListExpression__Group_8_1__3__Impl ;
    public final void rule__ListExpression__Group_8_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4233:1: ( rule__ListExpression__Group_8_1__3__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4234:2: rule__ListExpression__Group_8_1__3__Impl
            {
            pushFollow(FOLLOW_rule__ListExpression__Group_8_1__3__Impl_in_rule__ListExpression__Group_8_1__38545);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4240:1: rule__ListExpression__Group_8_1__3__Impl : ( ( rule__ListExpression__ExprAssignment_8_1_3 ) ) ;
    public final void rule__ListExpression__Group_8_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4244:1: ( ( ( rule__ListExpression__ExprAssignment_8_1_3 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4245:1: ( ( rule__ListExpression__ExprAssignment_8_1_3 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4245:1: ( ( rule__ListExpression__ExprAssignment_8_1_3 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4246:1: ( rule__ListExpression__ExprAssignment_8_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprAssignment_8_1_3()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4247:1: ( rule__ListExpression__ExprAssignment_8_1_3 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4247:2: rule__ListExpression__ExprAssignment_8_1_3
            {
            pushFollow(FOLLOW_rule__ListExpression__ExprAssignment_8_1_3_in_rule__ListExpression__Group_8_1__3__Impl8572);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4265:1: rule__ListValue__Group__0 : rule__ListValue__Group__0__Impl rule__ListValue__Group__1 ;
    public final void rule__ListValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4269:1: ( rule__ListValue__Group__0__Impl rule__ListValue__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4270:2: rule__ListValue__Group__0__Impl rule__ListValue__Group__1
            {
            pushFollow(FOLLOW_rule__ListValue__Group__0__Impl_in_rule__ListValue__Group__08610);
            rule__ListValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListValue__Group__1_in_rule__ListValue__Group__08613);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4277:1: rule__ListValue__Group__0__Impl : ( ruleExpression ) ;
    public final void rule__ListValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4281:1: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4282:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4282:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4283:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListValueAccess().getExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ListValue__Group__0__Impl8640);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4294:1: rule__ListValue__Group__1 : rule__ListValue__Group__1__Impl ;
    public final void rule__ListValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4298:1: ( rule__ListValue__Group__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4299:2: rule__ListValue__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ListValue__Group__1__Impl_in_rule__ListValue__Group__18669);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4305:1: rule__ListValue__Group__1__Impl : ( ( rule__ListValue__Group_1__0 )? ) ;
    public final void rule__ListValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4309:1: ( ( ( rule__ListValue__Group_1__0 )? ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4310:1: ( ( rule__ListValue__Group_1__0 )? )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4310:1: ( ( rule__ListValue__Group_1__0 )? )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4311:1: ( rule__ListValue__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListValueAccess().getGroup_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4312:1: ( rule__ListValue__Group_1__0 )?
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4312:2: rule__ListValue__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ListValue__Group_1__0_in_rule__ListValue__Group__1__Impl8696);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4326:1: rule__ListValue__Group_1__0 : rule__ListValue__Group_1__0__Impl rule__ListValue__Group_1__1 ;
    public final void rule__ListValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4330:1: ( rule__ListValue__Group_1__0__Impl rule__ListValue__Group_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4331:2: rule__ListValue__Group_1__0__Impl rule__ListValue__Group_1__1
            {
            pushFollow(FOLLOW_rule__ListValue__Group_1__0__Impl_in_rule__ListValue__Group_1__08731);
            rule__ListValue__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListValue__Group_1__1_in_rule__ListValue__Group_1__08734);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4338:1: rule__ListValue__Group_1__0__Impl : ( ( '|' ) ) ;
    public final void rule__ListValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4342:1: ( ( ( '|' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4343:1: ( ( '|' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4343:1: ( ( '|' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4344:1: ( '|' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListValueAccess().getVerticalLineKeyword_1_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4345:1: ( '|' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4346:2: '|'
            {
            match(input,40,FOLLOW_40_in_rule__ListValue__Group_1__0__Impl8763); if (state.failed) return ;

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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4357:1: rule__ListValue__Group_1__1 : rule__ListValue__Group_1__1__Impl ;
    public final void rule__ListValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4361:1: ( rule__ListValue__Group_1__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4362:2: rule__ListValue__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ListValue__Group_1__1__Impl_in_rule__ListValue__Group_1__18795);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4368:1: rule__ListValue__Group_1__1__Impl : ( ( rule__ListValue__ConditionAssignment_1_1 ) ) ;
    public final void rule__ListValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4372:1: ( ( ( rule__ListValue__ConditionAssignment_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4373:1: ( ( rule__ListValue__ConditionAssignment_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4373:1: ( ( rule__ListValue__ConditionAssignment_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4374:1: ( rule__ListValue__ConditionAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListValueAccess().getConditionAssignment_1_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4375:1: ( rule__ListValue__ConditionAssignment_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4375:2: rule__ListValue__ConditionAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ListValue__ConditionAssignment_1_1_in_rule__ListValue__Group_1__1__Impl8822);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4389:1: rule__UnaryExpression__Group_0__0 : rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 ;
    public final void rule__UnaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4393:1: ( rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4394:2: rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group_0__0__Impl_in_rule__UnaryExpression__Group_0__08856);
            rule__UnaryExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnaryExpression__Group_0__1_in_rule__UnaryExpression__Group_0__08859);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4401:1: rule__UnaryExpression__Group_0__0__Impl : ( ruleTerm ) ;
    public final void rule__UnaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4405:1: ( ( ruleTerm ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4406:1: ( ruleTerm )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4406:1: ( ruleTerm )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4407:1: ruleTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getTermParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleTerm_in_rule__UnaryExpression__Group_0__0__Impl8886);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4418:1: rule__UnaryExpression__Group_0__1 : rule__UnaryExpression__Group_0__1__Impl ;
    public final void rule__UnaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4422:1: ( rule__UnaryExpression__Group_0__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4423:2: rule__UnaryExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group_0__1__Impl_in_rule__UnaryExpression__Group_0__18915);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4429:1: rule__UnaryExpression__Group_0__1__Impl : ( ( rule__UnaryExpression__StructuredExpressionAssignment_0_1 ) ) ;
    public final void rule__UnaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4433:1: ( ( ( rule__UnaryExpression__StructuredExpressionAssignment_0_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4434:1: ( ( rule__UnaryExpression__StructuredExpressionAssignment_0_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4434:1: ( ( rule__UnaryExpression__StructuredExpressionAssignment_0_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4435:1: ( rule__UnaryExpression__StructuredExpressionAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getStructuredExpressionAssignment_0_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4436:1: ( rule__UnaryExpression__StructuredExpressionAssignment_0_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4436:2: rule__UnaryExpression__StructuredExpressionAssignment_0_1
            {
            pushFollow(FOLLOW_rule__UnaryExpression__StructuredExpressionAssignment_0_1_in_rule__UnaryExpression__Group_0__1__Impl8942);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4450:1: rule__UnaryExpression__Group_1__0 : rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1 ;
    public final void rule__UnaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4454:1: ( rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4455:2: rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group_1__0__Impl_in_rule__UnaryExpression__Group_1__08976);
            rule__UnaryExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnaryExpression__Group_1__1_in_rule__UnaryExpression__Group_1__08979);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4462:1: rule__UnaryExpression__Group_1__0__Impl : ( '(' ) ;
    public final void rule__UnaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4466:1: ( ( '(' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4467:1: ( '(' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4467:1: ( '(' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4468:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__UnaryExpression__Group_1__0__Impl9007); if (state.failed) return ;
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4481:1: rule__UnaryExpression__Group_1__1 : rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2 ;
    public final void rule__UnaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4485:1: ( rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4486:2: rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group_1__1__Impl_in_rule__UnaryExpression__Group_1__19038);
            rule__UnaryExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnaryExpression__Group_1__2_in_rule__UnaryExpression__Group_1__19041);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4493:1: rule__UnaryExpression__Group_1__1__Impl : ( ruleExpression ) ;
    public final void rule__UnaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4497:1: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4498:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4498:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4499:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getExpressionParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__UnaryExpression__Group_1__1__Impl9068);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4510:1: rule__UnaryExpression__Group_1__2 : rule__UnaryExpression__Group_1__2__Impl rule__UnaryExpression__Group_1__3 ;
    public final void rule__UnaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4514:1: ( rule__UnaryExpression__Group_1__2__Impl rule__UnaryExpression__Group_1__3 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4515:2: rule__UnaryExpression__Group_1__2__Impl rule__UnaryExpression__Group_1__3
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group_1__2__Impl_in_rule__UnaryExpression__Group_1__29097);
            rule__UnaryExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnaryExpression__Group_1__3_in_rule__UnaryExpression__Group_1__29100);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4522:1: rule__UnaryExpression__Group_1__2__Impl : ( ')' ) ;
    public final void rule__UnaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4526:1: ( ( ')' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4527:1: ( ')' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4527:1: ( ')' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4528:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__UnaryExpression__Group_1__2__Impl9128); if (state.failed) return ;
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4541:1: rule__UnaryExpression__Group_1__3 : rule__UnaryExpression__Group_1__3__Impl rule__UnaryExpression__Group_1__4 ;
    public final void rule__UnaryExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4545:1: ( rule__UnaryExpression__Group_1__3__Impl rule__UnaryExpression__Group_1__4 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4546:2: rule__UnaryExpression__Group_1__3__Impl rule__UnaryExpression__Group_1__4
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group_1__3__Impl_in_rule__UnaryExpression__Group_1__39159);
            rule__UnaryExpression__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnaryExpression__Group_1__4_in_rule__UnaryExpression__Group_1__39162);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4553:1: rule__UnaryExpression__Group_1__3__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4557:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4558:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4558:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4559:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getUnaryExpressionExprAction_1_3()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4560:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4562:1: 
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4572:1: rule__UnaryExpression__Group_1__4 : rule__UnaryExpression__Group_1__4__Impl ;
    public final void rule__UnaryExpression__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4576:1: ( rule__UnaryExpression__Group_1__4__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4577:2: rule__UnaryExpression__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group_1__4__Impl_in_rule__UnaryExpression__Group_1__49220);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4583:1: rule__UnaryExpression__Group_1__4__Impl : ( ( rule__UnaryExpression__StructuredExpressionAssignment_1_4 ) ) ;
    public final void rule__UnaryExpression__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4587:1: ( ( ( rule__UnaryExpression__StructuredExpressionAssignment_1_4 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4588:1: ( ( rule__UnaryExpression__StructuredExpressionAssignment_1_4 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4588:1: ( ( rule__UnaryExpression__StructuredExpressionAssignment_1_4 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4589:1: ( rule__UnaryExpression__StructuredExpressionAssignment_1_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getStructuredExpressionAssignment_1_4()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4590:1: ( rule__UnaryExpression__StructuredExpressionAssignment_1_4 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4590:2: rule__UnaryExpression__StructuredExpressionAssignment_1_4
            {
            pushFollow(FOLLOW_rule__UnaryExpression__StructuredExpressionAssignment_1_4_in_rule__UnaryExpression__Group_1__4__Impl9247);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4610:1: rule__UnaryExpression__Group_2__0 : rule__UnaryExpression__Group_2__0__Impl rule__UnaryExpression__Group_2__1 ;
    public final void rule__UnaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4614:1: ( rule__UnaryExpression__Group_2__0__Impl rule__UnaryExpression__Group_2__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4615:2: rule__UnaryExpression__Group_2__0__Impl rule__UnaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group_2__0__Impl_in_rule__UnaryExpression__Group_2__09287);
            rule__UnaryExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnaryExpression__Group_2__1_in_rule__UnaryExpression__Group_2__09290);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4622:1: rule__UnaryExpression__Group_2__0__Impl : ( 'NOT (' ) ;
    public final void rule__UnaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4626:1: ( ( 'NOT (' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4627:1: ( 'NOT (' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4627:1: ( 'NOT (' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4628:1: 'NOT ('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getNOTKeyword_2_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__UnaryExpression__Group_2__0__Impl9318); if (state.failed) return ;
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4641:1: rule__UnaryExpression__Group_2__1 : rule__UnaryExpression__Group_2__1__Impl rule__UnaryExpression__Group_2__2 ;
    public final void rule__UnaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4645:1: ( rule__UnaryExpression__Group_2__1__Impl rule__UnaryExpression__Group_2__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4646:2: rule__UnaryExpression__Group_2__1__Impl rule__UnaryExpression__Group_2__2
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group_2__1__Impl_in_rule__UnaryExpression__Group_2__19349);
            rule__UnaryExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnaryExpression__Group_2__2_in_rule__UnaryExpression__Group_2__19352);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4653:1: rule__UnaryExpression__Group_2__1__Impl : ( ruleExpression ) ;
    public final void rule__UnaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4657:1: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4658:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4658:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4659:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getExpressionParserRuleCall_2_1()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__UnaryExpression__Group_2__1__Impl9379);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4670:1: rule__UnaryExpression__Group_2__2 : rule__UnaryExpression__Group_2__2__Impl rule__UnaryExpression__Group_2__3 ;
    public final void rule__UnaryExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4674:1: ( rule__UnaryExpression__Group_2__2__Impl rule__UnaryExpression__Group_2__3 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4675:2: rule__UnaryExpression__Group_2__2__Impl rule__UnaryExpression__Group_2__3
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group_2__2__Impl_in_rule__UnaryExpression__Group_2__29408);
            rule__UnaryExpression__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnaryExpression__Group_2__3_in_rule__UnaryExpression__Group_2__29411);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4682:1: rule__UnaryExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__UnaryExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4686:1: ( ( ')' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4687:1: ( ')' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4687:1: ( ')' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4688:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__UnaryExpression__Group_2__2__Impl9439); if (state.failed) return ;
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4701:1: rule__UnaryExpression__Group_2__3 : rule__UnaryExpression__Group_2__3__Impl rule__UnaryExpression__Group_2__4 ;
    public final void rule__UnaryExpression__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4705:1: ( rule__UnaryExpression__Group_2__3__Impl rule__UnaryExpression__Group_2__4 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4706:2: rule__UnaryExpression__Group_2__3__Impl rule__UnaryExpression__Group_2__4
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group_2__3__Impl_in_rule__UnaryExpression__Group_2__39470);
            rule__UnaryExpression__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnaryExpression__Group_2__4_in_rule__UnaryExpression__Group_2__39473);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4713:1: rule__UnaryExpression__Group_2__3__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4717:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4718:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4718:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4719:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getUnaryExpressionExprAction_2_3()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4720:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4722:1: 
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4732:1: rule__UnaryExpression__Group_2__4 : rule__UnaryExpression__Group_2__4__Impl ;
    public final void rule__UnaryExpression__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4736:1: ( rule__UnaryExpression__Group_2__4__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4737:2: rule__UnaryExpression__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group_2__4__Impl_in_rule__UnaryExpression__Group_2__49531);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4743:1: rule__UnaryExpression__Group_2__4__Impl : ( ( rule__UnaryExpression__StructuredExpressionAssignment_2_4 ) ) ;
    public final void rule__UnaryExpression__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4747:1: ( ( ( rule__UnaryExpression__StructuredExpressionAssignment_2_4 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4748:1: ( ( rule__UnaryExpression__StructuredExpressionAssignment_2_4 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4748:1: ( ( rule__UnaryExpression__StructuredExpressionAssignment_2_4 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4749:1: ( rule__UnaryExpression__StructuredExpressionAssignment_2_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getStructuredExpressionAssignment_2_4()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4750:1: ( rule__UnaryExpression__StructuredExpressionAssignment_2_4 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4750:2: rule__UnaryExpression__StructuredExpressionAssignment_2_4
            {
            pushFollow(FOLLOW_rule__UnaryExpression__StructuredExpressionAssignment_2_4_in_rule__UnaryExpression__Group_2__4__Impl9558);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4770:1: rule__StructureExpression__Group__0 : rule__StructureExpression__Group__0__Impl rule__StructureExpression__Group__1 ;
    public final void rule__StructureExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4774:1: ( rule__StructureExpression__Group__0__Impl rule__StructureExpression__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4775:2: rule__StructureExpression__Group__0__Impl rule__StructureExpression__Group__1
            {
            pushFollow(FOLLOW_rule__StructureExpression__Group__0__Impl_in_rule__StructureExpression__Group__09598);
            rule__StructureExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StructureExpression__Group__1_in_rule__StructureExpression__Group__09601);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4782:1: rule__StructureExpression__Group__0__Impl : ( () ) ;
    public final void rule__StructureExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4786:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4787:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4787:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4788:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructureExpressionAccess().getStructureExpressionAction_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4789:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4791:1: 
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4801:1: rule__StructureExpression__Group__1 : rule__StructureExpression__Group__1__Impl ;
    public final void rule__StructureExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4805:1: ( rule__StructureExpression__Group__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4806:2: rule__StructureExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StructureExpression__Group__1__Impl_in_rule__StructureExpression__Group__19659);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4812:1: rule__StructureExpression__Group__1__Impl : ( ( rule__StructureExpression__Group_1__0 )? ) ;
    public final void rule__StructureExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4816:1: ( ( ( rule__StructureExpression__Group_1__0 )? ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4817:1: ( ( rule__StructureExpression__Group_1__0 )? )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4817:1: ( ( rule__StructureExpression__Group_1__0 )? )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4818:1: ( rule__StructureExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructureExpressionAccess().getGroup_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4819:1: ( rule__StructureExpression__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==42) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4819:2: rule__StructureExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__StructureExpression__Group_1__0_in_rule__StructureExpression__Group__1__Impl9686);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4833:1: rule__StructureExpression__Group_1__0 : rule__StructureExpression__Group_1__0__Impl rule__StructureExpression__Group_1__1 ;
    public final void rule__StructureExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4837:1: ( rule__StructureExpression__Group_1__0__Impl rule__StructureExpression__Group_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4838:2: rule__StructureExpression__Group_1__0__Impl rule__StructureExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__StructureExpression__Group_1__0__Impl_in_rule__StructureExpression__Group_1__09721);
            rule__StructureExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StructureExpression__Group_1__1_in_rule__StructureExpression__Group_1__09724);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4845:1: rule__StructureExpression__Group_1__0__Impl : ( '{' ) ;
    public final void rule__StructureExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4849:1: ( ( '{' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4850:1: ( '{' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4850:1: ( '{' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4851:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructureExpressionAccess().getLeftCurlyBracketKeyword_1_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__StructureExpression__Group_1__0__Impl9752); if (state.failed) return ;
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4864:1: rule__StructureExpression__Group_1__1 : rule__StructureExpression__Group_1__1__Impl rule__StructureExpression__Group_1__2 ;
    public final void rule__StructureExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4868:1: ( rule__StructureExpression__Group_1__1__Impl rule__StructureExpression__Group_1__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4869:2: rule__StructureExpression__Group_1__1__Impl rule__StructureExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__StructureExpression__Group_1__1__Impl_in_rule__StructureExpression__Group_1__19783);
            rule__StructureExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StructureExpression__Group_1__2_in_rule__StructureExpression__Group_1__19786);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4876:1: rule__StructureExpression__Group_1__1__Impl : ( ( rule__StructureExpression__KeyValuePairAssignment_1_1 ) ) ;
    public final void rule__StructureExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4880:1: ( ( ( rule__StructureExpression__KeyValuePairAssignment_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4881:1: ( ( rule__StructureExpression__KeyValuePairAssignment_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4881:1: ( ( rule__StructureExpression__KeyValuePairAssignment_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4882:1: ( rule__StructureExpression__KeyValuePairAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructureExpressionAccess().getKeyValuePairAssignment_1_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4883:1: ( rule__StructureExpression__KeyValuePairAssignment_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4883:2: rule__StructureExpression__KeyValuePairAssignment_1_1
            {
            pushFollow(FOLLOW_rule__StructureExpression__KeyValuePairAssignment_1_1_in_rule__StructureExpression__Group_1__1__Impl9813);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4893:1: rule__StructureExpression__Group_1__2 : rule__StructureExpression__Group_1__2__Impl rule__StructureExpression__Group_1__3 ;
    public final void rule__StructureExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4897:1: ( rule__StructureExpression__Group_1__2__Impl rule__StructureExpression__Group_1__3 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4898:2: rule__StructureExpression__Group_1__2__Impl rule__StructureExpression__Group_1__3
            {
            pushFollow(FOLLOW_rule__StructureExpression__Group_1__2__Impl_in_rule__StructureExpression__Group_1__29843);
            rule__StructureExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StructureExpression__Group_1__3_in_rule__StructureExpression__Group_1__29846);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4905:1: rule__StructureExpression__Group_1__2__Impl : ( '}' ) ;
    public final void rule__StructureExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4909:1: ( ( '}' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4910:1: ( '}' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4910:1: ( '}' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4911:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructureExpressionAccess().getRightCurlyBracketKeyword_1_2()); 
            }
            match(input,43,FOLLOW_43_in_rule__StructureExpression__Group_1__2__Impl9874); if (state.failed) return ;
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4924:1: rule__StructureExpression__Group_1__3 : rule__StructureExpression__Group_1__3__Impl ;
    public final void rule__StructureExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4928:1: ( rule__StructureExpression__Group_1__3__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4929:2: rule__StructureExpression__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__StructureExpression__Group_1__3__Impl_in_rule__StructureExpression__Group_1__39905);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4935:1: rule__StructureExpression__Group_1__3__Impl : ( ( rule__StructureExpression__StructuredExpressionsAssignment_1_3 ) ) ;
    public final void rule__StructureExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4939:1: ( ( ( rule__StructureExpression__StructuredExpressionsAssignment_1_3 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4940:1: ( ( rule__StructureExpression__StructuredExpressionsAssignment_1_3 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4940:1: ( ( rule__StructureExpression__StructuredExpressionsAssignment_1_3 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4941:1: ( rule__StructureExpression__StructuredExpressionsAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructureExpressionAccess().getStructuredExpressionsAssignment_1_3()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4942:1: ( rule__StructureExpression__StructuredExpressionsAssignment_1_3 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4942:2: rule__StructureExpression__StructuredExpressionsAssignment_1_3
            {
            pushFollow(FOLLOW_rule__StructureExpression__StructuredExpressionsAssignment_1_3_in_rule__StructureExpression__Group_1__3__Impl9932);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4960:1: rule__KeyValuePair__Group__0 : rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 ;
    public final void rule__KeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4964:1: ( rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4965:2: rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1
            {
            pushFollow(FOLLOW_rule__KeyValuePair__Group__0__Impl_in_rule__KeyValuePair__Group__09970);
            rule__KeyValuePair__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyValuePair__Group__1_in_rule__KeyValuePair__Group__09973);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4972:1: rule__KeyValuePair__Group__0__Impl : ( ( rule__KeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__KeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4976:1: ( ( ( rule__KeyValuePair__KeyAssignment_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4977:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4977:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4978:1: ( rule__KeyValuePair__KeyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getKeyAssignment_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4979:1: ( rule__KeyValuePair__KeyAssignment_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4979:2: rule__KeyValuePair__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__KeyValuePair__KeyAssignment_0_in_rule__KeyValuePair__Group__0__Impl10000);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4989:1: rule__KeyValuePair__Group__1 : rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 ;
    public final void rule__KeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4993:1: ( rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4994:2: rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2
            {
            pushFollow(FOLLOW_rule__KeyValuePair__Group__1__Impl_in_rule__KeyValuePair__Group__110030);
            rule__KeyValuePair__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyValuePair__Group__2_in_rule__KeyValuePair__Group__110033);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5001:1: rule__KeyValuePair__Group__1__Impl : ( '=>' ) ;
    public final void rule__KeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5005:1: ( ( '=>' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5006:1: ( '=>' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5006:1: ( '=>' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5007:1: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            }
            match(input,44,FOLLOW_44_in_rule__KeyValuePair__Group__1__Impl10061); if (state.failed) return ;
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5020:1: rule__KeyValuePair__Group__2 : rule__KeyValuePair__Group__2__Impl rule__KeyValuePair__Group__3 ;
    public final void rule__KeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5024:1: ( rule__KeyValuePair__Group__2__Impl rule__KeyValuePair__Group__3 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5025:2: rule__KeyValuePair__Group__2__Impl rule__KeyValuePair__Group__3
            {
            pushFollow(FOLLOW_rule__KeyValuePair__Group__2__Impl_in_rule__KeyValuePair__Group__210092);
            rule__KeyValuePair__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyValuePair__Group__3_in_rule__KeyValuePair__Group__210095);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5032:1: rule__KeyValuePair__Group__2__Impl : ( ( rule__KeyValuePair__ValueAssignment_2 ) ) ;
    public final void rule__KeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5036:1: ( ( ( rule__KeyValuePair__ValueAssignment_2 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5037:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5037:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5038:1: ( rule__KeyValuePair__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getValueAssignment_2()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5039:1: ( rule__KeyValuePair__ValueAssignment_2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5039:2: rule__KeyValuePair__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__KeyValuePair__ValueAssignment_2_in_rule__KeyValuePair__Group__2__Impl10122);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5049:1: rule__KeyValuePair__Group__3 : rule__KeyValuePair__Group__3__Impl ;
    public final void rule__KeyValuePair__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5053:1: ( rule__KeyValuePair__Group__3__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5054:2: rule__KeyValuePair__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__KeyValuePair__Group__3__Impl_in_rule__KeyValuePair__Group__310152);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5060:1: rule__KeyValuePair__Group__3__Impl : ( ( rule__KeyValuePair__RestAssignment_3 )? ) ;
    public final void rule__KeyValuePair__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5064:1: ( ( ( rule__KeyValuePair__RestAssignment_3 )? ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5065:1: ( ( rule__KeyValuePair__RestAssignment_3 )? )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5065:1: ( ( rule__KeyValuePair__RestAssignment_3 )? )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5066:1: ( rule__KeyValuePair__RestAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getRestAssignment_3()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5067:1: ( rule__KeyValuePair__RestAssignment_3 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5067:2: rule__KeyValuePair__RestAssignment_3
                    {
                    pushFollow(FOLLOW_rule__KeyValuePair__RestAssignment_3_in_rule__KeyValuePair__Group__3__Impl10179);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5085:1: rule__KeyValuePairRest__Group__0 : rule__KeyValuePairRest__Group__0__Impl rule__KeyValuePairRest__Group__1 ;
    public final void rule__KeyValuePairRest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5089:1: ( rule__KeyValuePairRest__Group__0__Impl rule__KeyValuePairRest__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5090:2: rule__KeyValuePairRest__Group__0__Impl rule__KeyValuePairRest__Group__1
            {
            pushFollow(FOLLOW_rule__KeyValuePairRest__Group__0__Impl_in_rule__KeyValuePairRest__Group__010218);
            rule__KeyValuePairRest__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyValuePairRest__Group__1_in_rule__KeyValuePairRest__Group__010221);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5097:1: rule__KeyValuePairRest__Group__0__Impl : ( ',' ) ;
    public final void rule__KeyValuePairRest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5101:1: ( ( ',' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5102:1: ( ',' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5102:1: ( ',' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5103:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairRestAccess().getCommaKeyword_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__KeyValuePairRest__Group__0__Impl10249); if (state.failed) return ;
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5116:1: rule__KeyValuePairRest__Group__1 : rule__KeyValuePairRest__Group__1__Impl ;
    public final void rule__KeyValuePairRest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5120:1: ( rule__KeyValuePairRest__Group__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5121:2: rule__KeyValuePairRest__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__KeyValuePairRest__Group__1__Impl_in_rule__KeyValuePairRest__Group__110280);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5127:1: rule__KeyValuePairRest__Group__1__Impl : ( ruleKeyValuePair ) ;
    public final void rule__KeyValuePairRest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5131:1: ( ( ruleKeyValuePair ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5132:1: ( ruleKeyValuePair )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5132:1: ( ruleKeyValuePair )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5133:1: ruleKeyValuePair
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairRestAccess().getKeyValuePairParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleKeyValuePair_in_rule__KeyValuePairRest__Group__1__Impl10307);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5148:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5152:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5153:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__010340);
            rule__Term__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__010343);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5160:1: rule__Term__Group_1__0__Impl : ( () ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5164:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5165:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5165:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5166:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getStringValueAction_1_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5167:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5169:1: 
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5179:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5183:1: ( rule__Term__Group_1__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5184:2: rule__Term__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__110401);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5190:1: rule__Term__Group_1__1__Impl : ( ( rule__Term__ValueAssignment_1_1 ) ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5194:1: ( ( ( rule__Term__ValueAssignment_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5195:1: ( ( rule__Term__ValueAssignment_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5195:1: ( ( rule__Term__ValueAssignment_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5196:1: ( rule__Term__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getValueAssignment_1_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5197:1: ( rule__Term__ValueAssignment_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5197:2: rule__Term__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Term__ValueAssignment_1_1_in_rule__Term__Group_1__1__Impl10428);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5211:1: rule__Term__Group_2__0 : rule__Term__Group_2__0__Impl rule__Term__Group_2__1 ;
    public final void rule__Term__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5215:1: ( rule__Term__Group_2__0__Impl rule__Term__Group_2__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5216:2: rule__Term__Group_2__0__Impl rule__Term__Group_2__1
            {
            pushFollow(FOLLOW_rule__Term__Group_2__0__Impl_in_rule__Term__Group_2__010462);
            rule__Term__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Term__Group_2__1_in_rule__Term__Group_2__010465);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5223:1: rule__Term__Group_2__0__Impl : ( () ) ;
    public final void rule__Term__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5227:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5228:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5228:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5229:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getIntegerValueAction_2_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5230:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5232:1: 
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5242:1: rule__Term__Group_2__1 : rule__Term__Group_2__1__Impl ;
    public final void rule__Term__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5246:1: ( rule__Term__Group_2__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5247:2: rule__Term__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group_2__1__Impl_in_rule__Term__Group_2__110523);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5253:1: rule__Term__Group_2__1__Impl : ( ( rule__Term__ValueAssignment_2_1 ) ) ;
    public final void rule__Term__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5257:1: ( ( ( rule__Term__ValueAssignment_2_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5258:1: ( ( rule__Term__ValueAssignment_2_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5258:1: ( ( rule__Term__ValueAssignment_2_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5259:1: ( rule__Term__ValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getValueAssignment_2_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5260:1: ( rule__Term__ValueAssignment_2_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5260:2: rule__Term__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Term__ValueAssignment_2_1_in_rule__Term__Group_2__1__Impl10550);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5274:1: rule__Term__Group_3__0 : rule__Term__Group_3__0__Impl rule__Term__Group_3__1 ;
    public final void rule__Term__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5278:1: ( rule__Term__Group_3__0__Impl rule__Term__Group_3__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5279:2: rule__Term__Group_3__0__Impl rule__Term__Group_3__1
            {
            pushFollow(FOLLOW_rule__Term__Group_3__0__Impl_in_rule__Term__Group_3__010584);
            rule__Term__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Term__Group_3__1_in_rule__Term__Group_3__010587);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5286:1: rule__Term__Group_3__0__Impl : ( () ) ;
    public final void rule__Term__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5290:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5291:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5291:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5292:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getDoubleValueAction_3_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5293:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5295:1: 
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5305:1: rule__Term__Group_3__1 : rule__Term__Group_3__1__Impl ;
    public final void rule__Term__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5309:1: ( rule__Term__Group_3__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5310:2: rule__Term__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group_3__1__Impl_in_rule__Term__Group_3__110645);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5316:1: rule__Term__Group_3__1__Impl : ( ( rule__Term__ValueAssignment_3_1 ) ) ;
    public final void rule__Term__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5320:1: ( ( ( rule__Term__ValueAssignment_3_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5321:1: ( ( rule__Term__ValueAssignment_3_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5321:1: ( ( rule__Term__ValueAssignment_3_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5322:1: ( rule__Term__ValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getValueAssignment_3_1()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5323:1: ( rule__Term__ValueAssignment_3_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5323:2: rule__Term__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Term__ValueAssignment_3_1_in_rule__Term__Group_3__1__Impl10672);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5337:1: rule__List__Group__0 : rule__List__Group__0__Impl rule__List__Group__1 ;
    public final void rule__List__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5341:1: ( rule__List__Group__0__Impl rule__List__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5342:2: rule__List__Group__0__Impl rule__List__Group__1
            {
            pushFollow(FOLLOW_rule__List__Group__0__Impl_in_rule__List__Group__010706);
            rule__List__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__List__Group__1_in_rule__List__Group__010709);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5349:1: rule__List__Group__0__Impl : ( () ) ;
    public final void rule__List__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5353:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5354:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5354:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5355:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getListAction_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5356:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5358:1: 
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5368:1: rule__List__Group__1 : rule__List__Group__1__Impl rule__List__Group__2 ;
    public final void rule__List__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5372:1: ( rule__List__Group__1__Impl rule__List__Group__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5373:2: rule__List__Group__1__Impl rule__List__Group__2
            {
            pushFollow(FOLLOW_rule__List__Group__1__Impl_in_rule__List__Group__110767);
            rule__List__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__List__Group__2_in_rule__List__Group__110770);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5380:1: rule__List__Group__1__Impl : ( '[' ) ;
    public final void rule__List__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5384:1: ( ( '[' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5385:1: ( '[' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5385:1: ( '[' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5386:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,45,FOLLOW_45_in_rule__List__Group__1__Impl10798); if (state.failed) return ;
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5399:1: rule__List__Group__2 : rule__List__Group__2__Impl rule__List__Group__3 ;
    public final void rule__List__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5403:1: ( rule__List__Group__2__Impl rule__List__Group__3 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5404:2: rule__List__Group__2__Impl rule__List__Group__3
            {
            pushFollow(FOLLOW_rule__List__Group__2__Impl_in_rule__List__Group__210829);
            rule__List__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__List__Group__3_in_rule__List__Group__210832);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5411:1: rule__List__Group__2__Impl : ( ( rule__List__TermsAssignment_2 )* ) ;
    public final void rule__List__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5415:1: ( ( ( rule__List__TermsAssignment_2 )* ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5416:1: ( ( rule__List__TermsAssignment_2 )* )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5416:1: ( ( rule__List__TermsAssignment_2 )* )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5417:1: ( rule__List__TermsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getTermsAssignment_2()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5418:1: ( rule__List__TermsAssignment_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_DOUBLE)||LA23_0==45) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5418:2: rule__List__TermsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__List__TermsAssignment_2_in_rule__List__Group__2__Impl10859);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5428:1: rule__List__Group__3 : rule__List__Group__3__Impl ;
    public final void rule__List__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5432:1: ( rule__List__Group__3__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5433:2: rule__List__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__List__Group__3__Impl_in_rule__List__Group__310890);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5439:1: rule__List__Group__3__Impl : ( ']' ) ;
    public final void rule__List__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5443:1: ( ( ']' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5444:1: ( ']' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5444:1: ( ']' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5445:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,46,FOLLOW_46_in_rule__List__Group__3__Impl10918); if (state.failed) return ;
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5469:1: rule__Model__PhraseAssignment : ( rulePhrase ) ;
    public final void rule__Model__PhraseAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5473:1: ( ( rulePhrase ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5474:1: ( rulePhrase )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5474:1: ( rulePhrase )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5475:1: rulePhrase
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPhrasePhraseParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePhrase_in_rule__Model__PhraseAssignment10964);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5484:1: rule__StatementList__HeadAssignment_0 : ( ruleStatement ) ;
    public final void rule__StatementList__HeadAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5488:1: ( ( ruleStatement ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5489:1: ( ruleStatement )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5489:1: ( ruleStatement )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5490:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementListAccess().getHeadStatementParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__StatementList__HeadAssignment_010995);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5499:1: rule__StatementList__TailAssignment_2 : ( ruleStatementList ) ;
    public final void rule__StatementList__TailAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5503:1: ( ( ruleStatementList ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5504:1: ( ruleStatementList )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5504:1: ( ruleStatementList )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5505:1: ruleStatementList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementListAccess().getTailStatementListParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleStatementList_in_rule__StatementList__TailAssignment_211026);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5514:1: rule__VariableAssignmentStatement__DesignatorAssignment_0 : ( ruleDesignator ) ;
    public final void rule__VariableAssignmentStatement__DesignatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5518:1: ( ( ruleDesignator ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5519:1: ( ruleDesignator )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5519:1: ( ruleDesignator )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5520:1: ruleDesignator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAssignmentStatementAccess().getDesignatorDesignatorParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleDesignator_in_rule__VariableAssignmentStatement__DesignatorAssignment_011057);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5529:1: rule__VariableAssignmentStatement__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__VariableAssignmentStatement__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5533:1: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5534:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5534:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5535:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAssignmentStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__VariableAssignmentStatement__ExpressionAssignment_211088);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5544:1: rule__SelfAssignmentStatement__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__SelfAssignmentStatement__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5548:1: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5549:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5549:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5550:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelfAssignmentStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__SelfAssignmentStatement__ExpressionAssignment_211119);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5559:1: rule__OrExpression__OpAssignment_2_0 : ( ( 'OR' ) ) ;
    public final void rule__OrExpression__OpAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5563:1: ( ( ( 'OR' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5564:1: ( ( 'OR' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5564:1: ( ( 'OR' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5565:1: ( 'OR' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOpORKeyword_2_0_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5566:1: ( 'OR' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5567:1: 'OR'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOpORKeyword_2_0_0()); 
            }
            match(input,47,FOLLOW_47_in_rule__OrExpression__OpAssignment_2_011155); if (state.failed) return ;
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5582:1: rule__OrExpression__RightAssignment_2_1 : ( ruleOrExpression ) ;
    public final void rule__OrExpression__RightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5586:1: ( ( ruleOrExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5587:1: ( ruleOrExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5587:1: ( ruleOrExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5588:1: ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getRightOrExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleOrExpression_in_rule__OrExpression__RightAssignment_2_111194);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5597:1: rule__AndExpression__OpAssignment_2_0 : ( ( 'AND' ) ) ;
    public final void rule__AndExpression__OpAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5601:1: ( ( ( 'AND' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5602:1: ( ( 'AND' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5602:1: ( ( 'AND' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5603:1: ( 'AND' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOpANDKeyword_2_0_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5604:1: ( 'AND' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5605:1: 'AND'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOpANDKeyword_2_0_0()); 
            }
            match(input,48,FOLLOW_48_in_rule__AndExpression__OpAssignment_2_011230); if (state.failed) return ;
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5620:1: rule__AndExpression__RightAssignment_2_1 : ( ruleAndExpression ) ;
    public final void rule__AndExpression__RightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5624:1: ( ( ruleAndExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5625:1: ( ruleAndExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5625:1: ( ruleAndExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5626:1: ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getRightAndExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_rule__AndExpression__RightAssignment_2_111269);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5635:1: rule__EqualityExpression__OpAssignment_2_0 : ( ( rule__EqualityExpression__OpAlternatives_2_0_0 ) ) ;
    public final void rule__EqualityExpression__OpAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5639:1: ( ( ( rule__EqualityExpression__OpAlternatives_2_0_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5640:1: ( ( rule__EqualityExpression__OpAlternatives_2_0_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5640:1: ( ( rule__EqualityExpression__OpAlternatives_2_0_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5641:1: ( rule__EqualityExpression__OpAlternatives_2_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getOpAlternatives_2_0_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5642:1: ( rule__EqualityExpression__OpAlternatives_2_0_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5642:2: rule__EqualityExpression__OpAlternatives_2_0_0
            {
            pushFollow(FOLLOW_rule__EqualityExpression__OpAlternatives_2_0_0_in_rule__EqualityExpression__OpAssignment_2_011300);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5651:1: rule__EqualityExpression__RightAssignment_2_1 : ( ruleEqualityExpression ) ;
    public final void rule__EqualityExpression__RightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5655:1: ( ( ruleEqualityExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5656:1: ( ruleEqualityExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5656:1: ( ruleEqualityExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5657:1: ruleEqualityExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getRightEqualityExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleEqualityExpression_in_rule__EqualityExpression__RightAssignment_2_111333);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5666:1: rule__DashExpression__OpAssignment_2_0 : ( ( rule__DashExpression__OpAlternatives_2_0_0 ) ) ;
    public final void rule__DashExpression__OpAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5670:1: ( ( ( rule__DashExpression__OpAlternatives_2_0_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5671:1: ( ( rule__DashExpression__OpAlternatives_2_0_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5671:1: ( ( rule__DashExpression__OpAlternatives_2_0_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5672:1: ( rule__DashExpression__OpAlternatives_2_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDashExpressionAccess().getOpAlternatives_2_0_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5673:1: ( rule__DashExpression__OpAlternatives_2_0_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5673:2: rule__DashExpression__OpAlternatives_2_0_0
            {
            pushFollow(FOLLOW_rule__DashExpression__OpAlternatives_2_0_0_in_rule__DashExpression__OpAssignment_2_011364);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5682:1: rule__DashExpression__RightAssignment_2_1 : ( ruleDashExpression ) ;
    public final void rule__DashExpression__RightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5686:1: ( ( ruleDashExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5687:1: ( ruleDashExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5687:1: ( ruleDashExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5688:1: ruleDashExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDashExpressionAccess().getRightDashExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleDashExpression_in_rule__DashExpression__RightAssignment_2_111397);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5697:1: rule__PointExpression__OpAssignment_2_0 : ( ( rule__PointExpression__OpAlternatives_2_0_0 ) ) ;
    public final void rule__PointExpression__OpAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5701:1: ( ( ( rule__PointExpression__OpAlternatives_2_0_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5702:1: ( ( rule__PointExpression__OpAlternatives_2_0_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5702:1: ( ( rule__PointExpression__OpAlternatives_2_0_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5703:1: ( rule__PointExpression__OpAlternatives_2_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointExpressionAccess().getOpAlternatives_2_0_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5704:1: ( rule__PointExpression__OpAlternatives_2_0_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5704:2: rule__PointExpression__OpAlternatives_2_0_0
            {
            pushFollow(FOLLOW_rule__PointExpression__OpAlternatives_2_0_0_in_rule__PointExpression__OpAssignment_2_011428);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5713:1: rule__PointExpression__RightAssignment_2_1 : ( rulePointExpression ) ;
    public final void rule__PointExpression__RightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5717:1: ( ( rulePointExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5718:1: ( rulePointExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5718:1: ( rulePointExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5719:1: rulePointExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointExpressionAccess().getRightPointExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_rulePointExpression_in_rule__PointExpression__RightAssignment_2_111461);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5728:1: rule__PowExpression__OpAssignment_2_0 : ( ( '^' ) ) ;
    public final void rule__PowExpression__OpAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5732:1: ( ( ( '^' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5733:1: ( ( '^' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5733:1: ( ( '^' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5734:1: ( '^' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowExpressionAccess().getOpCircumflexAccentKeyword_2_0_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5735:1: ( '^' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5736:1: '^'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowExpressionAccess().getOpCircumflexAccentKeyword_2_0_0()); 
            }
            match(input,49,FOLLOW_49_in_rule__PowExpression__OpAssignment_2_011497); if (state.failed) return ;
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5751:1: rule__PowExpression__RightAssignment_2_1 : ( rulePowExpression ) ;
    public final void rule__PowExpression__RightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5755:1: ( ( rulePowExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5756:1: ( rulePowExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5756:1: ( rulePowExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5757:1: rulePowExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowExpressionAccess().getRightPowExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_rulePowExpression_in_rule__PowExpression__RightAssignment_2_111536);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5766:1: rule__QualifierExpression__OpAssignment_2_0 : ( ( '.' ) ) ;
    public final void rule__QualifierExpression__OpAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5770:1: ( ( ( '.' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5771:1: ( ( '.' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5771:1: ( ( '.' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5772:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifierExpressionAccess().getOpFullStopKeyword_2_0_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5773:1: ( '.' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5774:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifierExpressionAccess().getOpFullStopKeyword_2_0_0()); 
            }
            match(input,50,FOLLOW_50_in_rule__QualifierExpression__OpAssignment_2_011572); if (state.failed) return ;
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5789:1: rule__QualifierExpression__RightAssignment_2_1 : ( ruleQualifierExpression ) ;
    public final void rule__QualifierExpression__RightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5793:1: ( ( ruleQualifierExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5794:1: ( ruleQualifierExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5794:1: ( ruleQualifierExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5795:1: ruleQualifierExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifierExpressionAccess().getRightQualifierExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifierExpression_in_rule__QualifierExpression__RightAssignment_2_111611);
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


    // $ANTLR start "rule__FunctionCall__ParamsAssignment_2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5804:1: rule__FunctionCall__ParamsAssignment_2 : ( ruleExpressionList ) ;
    public final void rule__FunctionCall__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5808:1: ( ( ruleExpressionList ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5809:1: ( ruleExpressionList )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5809:1: ( ruleExpressionList )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5810:1: ruleExpressionList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParamsExpressionListParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpressionList_in_rule__FunctionCall__ParamsAssignment_211642);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5819:1: rule__ExpressionList__HeadAssignment_0 : ( ruleExpression ) ;
    public final void rule__ExpressionList__HeadAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5823:1: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5824:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5824:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5825:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionListAccess().getHeadExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ExpressionList__HeadAssignment_011673);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5834:1: rule__ExpressionList__TailAssignment_1 : ( ruleExpressionRest ) ;
    public final void rule__ExpressionList__TailAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5838:1: ( ( ruleExpressionRest ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5839:1: ( ruleExpressionRest )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5839:1: ( ruleExpressionRest )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5840:1: ruleExpressionRest
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionListAccess().getTailExpressionRestParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpressionRest_in_rule__ExpressionList__TailAssignment_111704);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5849:1: rule__ListExpression__ExprAssignment_0_1_1 : ( ruleListValue ) ;
    public final void rule__ListExpression__ExprAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5853:1: ( ( ruleListValue ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5854:1: ( ruleListValue )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5854:1: ( ruleListValue )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5855:1: ruleListValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_0_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_0_1_111735);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5864:1: rule__ListExpression__ExprAssignment_1_1_1 : ( ruleListValue ) ;
    public final void rule__ListExpression__ExprAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5868:1: ( ( ruleListValue ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5869:1: ( ruleListValue )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5869:1: ( ruleListValue )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5870:1: ruleListValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_1_1_111766);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5879:1: rule__ListExpression__ExprAssignment_2_1_1 : ( ruleListValue ) ;
    public final void rule__ListExpression__ExprAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5883:1: ( ( ruleListValue ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5884:1: ( ruleListValue )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5884:1: ( ruleListValue )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5885:1: ruleListValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_2_1_111797);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5894:1: rule__ListExpression__ExprAssignment_3_1_1 : ( ruleListValue ) ;
    public final void rule__ListExpression__ExprAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5898:1: ( ( ruleListValue ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5899:1: ( ruleListValue )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5899:1: ( ruleListValue )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5900:1: ruleListValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_3_1_111828);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5909:1: rule__ListExpression__ExprAssignment_4_1_1 : ( ruleListValue ) ;
    public final void rule__ListExpression__ExprAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5913:1: ( ( ruleListValue ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5914:1: ( ruleListValue )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5914:1: ( ruleListValue )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5915:1: ruleListValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_4_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_4_1_111859);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5924:1: rule__ListExpression__ExprAssignment_5_1_1 : ( ruleListValue ) ;
    public final void rule__ListExpression__ExprAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5928:1: ( ( ruleListValue ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5929:1: ( ruleListValue )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5929:1: ( ruleListValue )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5930:1: ruleListValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_5_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_5_1_111890);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5939:1: rule__ListExpression__UsingExprAssignment_5_1_3 : ( ruleExpression ) ;
    public final void rule__ListExpression__UsingExprAssignment_5_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5943:1: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5944:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5944:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5945:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getUsingExprExpressionParserRuleCall_5_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ListExpression__UsingExprAssignment_5_1_311921);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5954:1: rule__ListExpression__InitValueAssignment_5_1_5 : ( ruleExpression ) ;
    public final void rule__ListExpression__InitValueAssignment_5_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5958:1: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5959:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5959:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5960:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getInitValueExpressionParserRuleCall_5_1_5_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ListExpression__InitValueAssignment_5_1_511952);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5969:1: rule__ListExpression__ExprAssignment_6_1_1 : ( ruleListValue ) ;
    public final void rule__ListExpression__ExprAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5973:1: ( ( ruleListValue ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5974:1: ( ruleListValue )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5974:1: ( ruleListValue )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5975:1: ruleListValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_6_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_6_1_111983);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5984:1: rule__ListExpression__UsingExprAssignment_6_1_3 : ( ruleExpression ) ;
    public final void rule__ListExpression__UsingExprAssignment_6_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5988:1: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5989:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5989:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5990:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getUsingExprExpressionParserRuleCall_6_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ListExpression__UsingExprAssignment_6_1_312014);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:5999:1: rule__ListExpression__ExprAssignment_7_1_1 : ( ruleListValue ) ;
    public final void rule__ListExpression__ExprAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6003:1: ( ( ruleListValue ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6004:1: ( ruleListValue )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6004:1: ( ruleListValue )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6005:1: ruleListValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_7_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_7_1_112045);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6014:1: rule__ListExpression__UsingExprAssignment_7_1_3 : ( ruleExpression ) ;
    public final void rule__ListExpression__UsingExprAssignment_7_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6018:1: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6019:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6019:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6020:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getUsingExprExpressionParserRuleCall_7_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ListExpression__UsingExprAssignment_7_1_312076);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6029:1: rule__ListExpression__ApplyExprAssignment_8_1_1 : ( ruleExpression ) ;
    public final void rule__ListExpression__ApplyExprAssignment_8_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6033:1: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6034:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6034:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6035:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getApplyExprExpressionParserRuleCall_8_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ListExpression__ApplyExprAssignment_8_1_112107);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6044:1: rule__ListExpression__ExprAssignment_8_1_3 : ( ruleListValue ) ;
    public final void rule__ListExpression__ExprAssignment_8_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6048:1: ( ( ruleListValue ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6049:1: ( ruleListValue )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6049:1: ( ruleListValue )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6050:1: ruleListValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getExprListValueParserRuleCall_8_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_8_1_312138);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6059:1: rule__ListValue__ConditionAssignment_1_1 : ( ruleCondition ) ;
    public final void rule__ListValue__ConditionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6063:1: ( ( ruleCondition ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6064:1: ( ruleCondition )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6064:1: ( ruleCondition )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6065:1: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListValueAccess().getConditionConditionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCondition_in_rule__ListValue__ConditionAssignment_1_112169);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6074:1: rule__UnaryExpression__StructuredExpressionAssignment_0_1 : ( ruleStructureExpression ) ;
    public final void rule__UnaryExpression__StructuredExpressionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6078:1: ( ( ruleStructureExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6079:1: ( ruleStructureExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6079:1: ( ruleStructureExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6080:1: ruleStructureExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getStructuredExpressionStructureExpressionParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleStructureExpression_in_rule__UnaryExpression__StructuredExpressionAssignment_0_112200);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6089:1: rule__UnaryExpression__StructuredExpressionAssignment_1_4 : ( ruleStructureExpression ) ;
    public final void rule__UnaryExpression__StructuredExpressionAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6093:1: ( ( ruleStructureExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6094:1: ( ruleStructureExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6094:1: ( ruleStructureExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6095:1: ruleStructureExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getStructuredExpressionStructureExpressionParserRuleCall_1_4_0()); 
            }
            pushFollow(FOLLOW_ruleStructureExpression_in_rule__UnaryExpression__StructuredExpressionAssignment_1_412231);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6104:1: rule__UnaryExpression__StructuredExpressionAssignment_2_4 : ( ruleStructureExpression ) ;
    public final void rule__UnaryExpression__StructuredExpressionAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6108:1: ( ( ruleStructureExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6109:1: ( ruleStructureExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6109:1: ( ruleStructureExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6110:1: ruleStructureExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getStructuredExpressionStructureExpressionParserRuleCall_2_4_0()); 
            }
            pushFollow(FOLLOW_ruleStructureExpression_in_rule__UnaryExpression__StructuredExpressionAssignment_2_412262);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6119:1: rule__StructureExpression__KeyValuePairAssignment_1_1 : ( ruleKeyValuePair ) ;
    public final void rule__StructureExpression__KeyValuePairAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6123:1: ( ( ruleKeyValuePair ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6124:1: ( ruleKeyValuePair )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6124:1: ( ruleKeyValuePair )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6125:1: ruleKeyValuePair
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructureExpressionAccess().getKeyValuePairKeyValuePairParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleKeyValuePair_in_rule__StructureExpression__KeyValuePairAssignment_1_112293);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6134:1: rule__StructureExpression__StructuredExpressionsAssignment_1_3 : ( ruleStructureExpression ) ;
    public final void rule__StructureExpression__StructuredExpressionsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6138:1: ( ( ruleStructureExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6139:1: ( ruleStructureExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6139:1: ( ruleStructureExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6140:1: ruleStructureExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructureExpressionAccess().getStructuredExpressionsStructureExpressionParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleStructureExpression_in_rule__StructureExpression__StructuredExpressionsAssignment_1_312324);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6149:1: rule__KeyValuePair__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__KeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6153:1: ( ( RULE_ID ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6154:1: ( RULE_ID )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6154:1: ( RULE_ID )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6155:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getKeyIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__KeyValuePair__KeyAssignment_012355); if (state.failed) return ;
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6164:1: rule__KeyValuePair__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__KeyValuePair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6168:1: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6169:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6169:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6170:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getValueExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__KeyValuePair__ValueAssignment_212386);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6179:1: rule__KeyValuePair__RestAssignment_3 : ( ruleKeyValuePairRest ) ;
    public final void rule__KeyValuePair__RestAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6183:1: ( ( ruleKeyValuePairRest ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6184:1: ( ruleKeyValuePairRest )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6184:1: ( ruleKeyValuePairRest )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6185:1: ruleKeyValuePairRest
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getRestKeyValuePairRestParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleKeyValuePairRest_in_rule__KeyValuePair__RestAssignment_312417);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6194:1: rule__Term__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Term__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6198:1: ( ( RULE_STRING ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6199:1: ( RULE_STRING )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6199:1: ( RULE_STRING )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6200:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Term__ValueAssignment_1_112448); if (state.failed) return ;
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6209:1: rule__Term__ValueAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Term__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6213:1: ( ( RULE_INT ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6214:1: ( RULE_INT )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6214:1: ( RULE_INT )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6215:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getValueINTTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Term__ValueAssignment_2_112479); if (state.failed) return ;
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6224:1: rule__Term__ValueAssignment_3_1 : ( RULE_DOUBLE ) ;
    public final void rule__Term__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6228:1: ( ( RULE_DOUBLE ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6229:1: ( RULE_DOUBLE )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6229:1: ( RULE_DOUBLE )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6230:1: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getValueDOUBLETerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__Term__ValueAssignment_3_112510); if (state.failed) return ;
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6239:1: rule__List__TermsAssignment_2 : ( ruleTerm ) ;
    public final void rule__List__TermsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6243:1: ( ( ruleTerm ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6244:1: ( ruleTerm )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6244:1: ( ruleTerm )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6245:1: ruleTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getTermsTermParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleTerm_in_rule__List__TermsAssignment_212541);
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
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6254:1: rule__Designator__ValueAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Designator__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6258:1: ( ( ( RULE_ID ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6259:1: ( ( RULE_ID ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6259:1: ( ( RULE_ID ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6260:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDesignatorAccess().getValueEObjectCrossReference_0()); 
            }
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6261:1: ( RULE_ID )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:6262:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDesignatorAccess().getValueEObjectIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Designator__ValueAssignment12576); if (state.failed) return ;
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
        // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1553:2: ( rule__OrExpression__Group_2__0 )
        // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1553:2: rule__OrExpression__Group_2__0
        {
        pushFollow(FOLLOW_rule__OrExpression__Group_2__0_in_synpred27_InternalExpression3276);
        rule__OrExpression__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalExpression

    // $ANTLR start synpred28_InternalExpression
    public final void synpred28_InternalExpression_fragment() throws RecognitionException {   
        // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1708:2: ( rule__AndExpression__Group_2__0 )
        // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1708:2: rule__AndExpression__Group_2__0
        {
        pushFollow(FOLLOW_rule__AndExpression__Group_2__0_in_synpred28_InternalExpression3581);
        rule__AndExpression__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalExpression

    // $ANTLR start synpred29_InternalExpression
    public final void synpred29_InternalExpression_fragment() throws RecognitionException {   
        // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1863:2: ( rule__EqualityExpression__Group_2__0 )
        // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1863:2: rule__EqualityExpression__Group_2__0
        {
        pushFollow(FOLLOW_rule__EqualityExpression__Group_2__0_in_synpred29_InternalExpression3886);
        rule__EqualityExpression__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalExpression

    // $ANTLR start synpred30_InternalExpression
    public final void synpred30_InternalExpression_fragment() throws RecognitionException {   
        // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2018:2: ( rule__DashExpression__Group_2__0 )
        // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2018:2: rule__DashExpression__Group_2__0
        {
        pushFollow(FOLLOW_rule__DashExpression__Group_2__0_in_synpred30_InternalExpression4191);
        rule__DashExpression__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalExpression

    // $ANTLR start synpred31_InternalExpression
    public final void synpred31_InternalExpression_fragment() throws RecognitionException {   
        // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2173:2: ( rule__PointExpression__Group_2__0 )
        // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2173:2: rule__PointExpression__Group_2__0
        {
        pushFollow(FOLLOW_rule__PointExpression__Group_2__0_in_synpred31_InternalExpression4496);
        rule__PointExpression__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalExpression

    // $ANTLR start synpred32_InternalExpression
    public final void synpred32_InternalExpression_fragment() throws RecognitionException {   
        // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2328:2: ( rule__PowExpression__Group_2__0 )
        // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2328:2: rule__PowExpression__Group_2__0
        {
        pushFollow(FOLLOW_rule__PowExpression__Group_2__0_in_synpred32_InternalExpression4801);
        rule__PowExpression__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalExpression

    // $ANTLR start synpred33_InternalExpression
    public final void synpred33_InternalExpression_fragment() throws RecognitionException {   
        // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2483:2: ( rule__QualifierExpression__Group_2__0 )
        // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2483:2: rule__QualifierExpression__Group_2__0
        {
        pushFollow(FOLLOW_rule__QualifierExpression__Group_2__0_in_synpred33_InternalExpression5106);
        rule__QualifierExpression__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalExpression

    // $ANTLR start synpred36_InternalExpression
    public final void synpred36_InternalExpression_fragment() throws RecognitionException {   
        // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4312:2: ( rule__ListValue__Group_1__0 )
        // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:4312:2: rule__ListValue__Group_1__0
        {
        pushFollow(FOLLOW_rule__ListValue__Group_1__0_in_synpred36_InternalExpression8696);
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
    public static final BitSet FOLLOW_ruleExpressionList_in_entryRuleExpressionList1085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionList1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionList__Group__0_in_ruleExpressionList1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionRest_in_entryRuleExpressionRest1145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionRest1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionRest__Group__0_in_ruleExpressionRest1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListExpression_in_entryRuleListExpression1205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListExpression1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Alternatives_in_ruleListExpression1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListValue_in_entryRuleListValue1265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListValue1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListValue__Group__0_in_ruleListValue1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition1325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCondition1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression1384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Alternatives_in_ruleUnaryExpression1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_entryRuleStructureExpression1444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructureExpression1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureExpression__Group__0_in_ruleStructureExpression1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyValuePair_in_entryRuleKeyValuePair1504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyValuePair1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValuePair__Group__0_in_ruleKeyValuePair1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyValuePairRest_in_entryRuleKeyValuePairRest1564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyValuePairRest1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValuePairRest__Group__0_in_ruleKeyValuePairRest1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm1624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Alternatives_in_ruleTerm1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_entryRuleList1684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__Group__0_in_ruleList1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesignator_in_entryRuleDesignator1746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDesignator1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Designator__ValueAssignment_in_ruleDesignator1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Phrase__Alternatives1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementList_in_rule__Phrase__Alternatives1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignmentStatement_in_rule__AssignmentStatement__Alternatives1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfAssignmentStatement_in_rule__AssignmentStatement__Alternatives1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__EqualityExpression__OpAlternatives_2_0_01914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__EqualityExpression__OpAlternatives_2_0_01934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EqualityExpression__OpAlternatives_2_0_01954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EqualityExpression__OpAlternatives_2_0_01974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EqualityExpression__OpAlternatives_2_0_01994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EqualityExpression__OpAlternatives_2_0_02014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DashExpression__OpAlternatives_2_0_02049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DashExpression__OpAlternatives_2_0_02069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PointExpression__OpAlternatives_2_0_02104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PointExpression__OpAlternatives_2_0_02124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__PrimaryExpression__Alternatives2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_rule__PrimaryExpression__Alternatives2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListExpression_in_rule__PrimaryExpression__Alternatives2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_0__0_in_rule__ListExpression__Alternatives2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_1__0_in_rule__ListExpression__Alternatives2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_2__0_in_rule__ListExpression__Alternatives2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_3__0_in_rule__ListExpression__Alternatives2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_4__0_in_rule__ListExpression__Alternatives2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_5__0_in_rule__ListExpression__Alternatives2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_6__0_in_rule__ListExpression__Alternatives2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_7__0_in_rule__ListExpression__Alternatives2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_8__0_in_rule__ListExpression__Alternatives2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_0__0_in_rule__UnaryExpression__Alternatives2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__0_in_rule__UnaryExpression__Alternatives2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__0_in_rule__UnaryExpression__Alternatives2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesignator_in_rule__Term__Alternatives2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0_in_rule__Term__Alternatives2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_2__0_in_rule__Term__Alternatives2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_3__0_in_rule__Term__Alternatives2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_rule__Term__Alternatives2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementList__Group__0__Impl_in_rule__StatementList__Group__02571 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__StatementList__Group__1_in_rule__StatementList__Group__02574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementList__HeadAssignment_0_in_rule__StatementList__Group__0__Impl2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementList__Group__1__Impl_in_rule__StatementList__Group__12631 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__StatementList__Group__2_in_rule__StatementList__Group__12634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__StatementList__Group__1__Impl2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementList__Group__2__Impl_in_rule__StatementList__Group__22693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementList__TailAssignment_2_in_rule__StatementList__Group__2__Impl2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignmentStatement__Group__0__Impl_in_rule__VariableAssignmentStatement__Group__02757 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__VariableAssignmentStatement__Group__1_in_rule__VariableAssignmentStatement__Group__02760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignmentStatement__DesignatorAssignment_0_in_rule__VariableAssignmentStatement__Group__0__Impl2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignmentStatement__Group__1__Impl_in_rule__VariableAssignmentStatement__Group__12817 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__VariableAssignmentStatement__Group__2_in_rule__VariableAssignmentStatement__Group__12820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__VariableAssignmentStatement__Group__1__Impl2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignmentStatement__Group__2__Impl_in_rule__VariableAssignmentStatement__Group__22879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignmentStatement__ExpressionAssignment_2_in_rule__VariableAssignmentStatement__Group__2__Impl2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfAssignmentStatement__Group__0__Impl_in_rule__SelfAssignmentStatement__Group__02942 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__SelfAssignmentStatement__Group__1_in_rule__SelfAssignmentStatement__Group__02945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SelfAssignmentStatement__Group__0__Impl2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfAssignmentStatement__Group__1__Impl_in_rule__SelfAssignmentStatement__Group__13004 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__SelfAssignmentStatement__Group__2_in_rule__SelfAssignmentStatement__Group__13007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SelfAssignmentStatement__Group__1__Impl3035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfAssignmentStatement__Group__2__Impl_in_rule__SelfAssignmentStatement__Group__23066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfAssignmentStatement__ExpressionAssignment_2_in_rule__SelfAssignmentStatement__Group__2__Impl3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__03129 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__03132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__13188 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__2_in_rule__OrExpression__Group__13191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__2__Impl_in_rule__OrExpression__Group__23249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_2__0_in_rule__OrExpression__Group__2__Impl3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_2__0__Impl_in_rule__OrExpression__Group_2__03313 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_2__1_in_rule__OrExpression__Group_2__03316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__OpAssignment_2_0_in_rule__OrExpression__Group_2__0__Impl3343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_2__1__Impl_in_rule__OrExpression__Group_2__13373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__RightAssignment_2_1_in_rule__OrExpression__Group_2__1__Impl3400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__03434 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__03437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_rule__AndExpression__Group__0__Impl3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__13493 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__2_in_rule__AndExpression__Group__13496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__2__Impl_in_rule__AndExpression__Group__23554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_2__0_in_rule__AndExpression__Group__2__Impl3581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_2__0__Impl_in_rule__AndExpression__Group_2__03618 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_2__1_in_rule__AndExpression__Group_2__03621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__OpAssignment_2_0_in_rule__AndExpression__Group_2__0__Impl3648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_2__1__Impl_in_rule__AndExpression__Group_2__13678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__RightAssignment_2_1_in_rule__AndExpression__Group_2__1__Impl3705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group__0__Impl_in_rule__EqualityExpression__Group__03739 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group__1_in_rule__EqualityExpression__Group__03742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDashExpression_in_rule__EqualityExpression__Group__0__Impl3769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group__1__Impl_in_rule__EqualityExpression__Group__13798 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group__2_in_rule__EqualityExpression__Group__13801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group__2__Impl_in_rule__EqualityExpression__Group__23859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_2__0_in_rule__EqualityExpression__Group__2__Impl3886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_2__0__Impl_in_rule__EqualityExpression__Group_2__03923 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_2__1_in_rule__EqualityExpression__Group_2__03926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__OpAssignment_2_0_in_rule__EqualityExpression__Group_2__0__Impl3953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_2__1__Impl_in_rule__EqualityExpression__Group_2__13983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__RightAssignment_2_1_in_rule__EqualityExpression__Group_2__1__Impl4010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashExpression__Group__0__Impl_in_rule__DashExpression__Group__04044 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__DashExpression__Group__1_in_rule__DashExpression__Group__04047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointExpression_in_rule__DashExpression__Group__0__Impl4074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashExpression__Group__1__Impl_in_rule__DashExpression__Group__14103 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__DashExpression__Group__2_in_rule__DashExpression__Group__14106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashExpression__Group__2__Impl_in_rule__DashExpression__Group__24164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashExpression__Group_2__0_in_rule__DashExpression__Group__2__Impl4191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashExpression__Group_2__0__Impl_in_rule__DashExpression__Group_2__04228 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__DashExpression__Group_2__1_in_rule__DashExpression__Group_2__04231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashExpression__OpAssignment_2_0_in_rule__DashExpression__Group_2__0__Impl4258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashExpression__Group_2__1__Impl_in_rule__DashExpression__Group_2__14288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashExpression__RightAssignment_2_1_in_rule__DashExpression__Group_2__1__Impl4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointExpression__Group__0__Impl_in_rule__PointExpression__Group__04349 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__PointExpression__Group__1_in_rule__PointExpression__Group__04352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowExpression_in_rule__PointExpression__Group__0__Impl4379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointExpression__Group__1__Impl_in_rule__PointExpression__Group__14408 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__PointExpression__Group__2_in_rule__PointExpression__Group__14411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointExpression__Group__2__Impl_in_rule__PointExpression__Group__24469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointExpression__Group_2__0_in_rule__PointExpression__Group__2__Impl4496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointExpression__Group_2__0__Impl_in_rule__PointExpression__Group_2__04533 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__PointExpression__Group_2__1_in_rule__PointExpression__Group_2__04536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointExpression__OpAssignment_2_0_in_rule__PointExpression__Group_2__0__Impl4563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointExpression__Group_2__1__Impl_in_rule__PointExpression__Group_2__14593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointExpression__RightAssignment_2_1_in_rule__PointExpression__Group_2__1__Impl4620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowExpression__Group__0__Impl_in_rule__PowExpression__Group__04654 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__PowExpression__Group__1_in_rule__PowExpression__Group__04657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifierExpression_in_rule__PowExpression__Group__0__Impl4684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowExpression__Group__1__Impl_in_rule__PowExpression__Group__14713 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__PowExpression__Group__2_in_rule__PowExpression__Group__14716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowExpression__Group__2__Impl_in_rule__PowExpression__Group__24774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowExpression__Group_2__0_in_rule__PowExpression__Group__2__Impl4801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowExpression__Group_2__0__Impl_in_rule__PowExpression__Group_2__04838 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__PowExpression__Group_2__1_in_rule__PowExpression__Group_2__04841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowExpression__OpAssignment_2_0_in_rule__PowExpression__Group_2__0__Impl4868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowExpression__Group_2__1__Impl_in_rule__PowExpression__Group_2__14898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowExpression__RightAssignment_2_1_in_rule__PowExpression__Group_2__1__Impl4925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifierExpression__Group__0__Impl_in_rule__QualifierExpression__Group__04959 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__QualifierExpression__Group__1_in_rule__QualifierExpression__Group__04962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__QualifierExpression__Group__0__Impl4989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifierExpression__Group__1__Impl_in_rule__QualifierExpression__Group__15018 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__QualifierExpression__Group__2_in_rule__QualifierExpression__Group__15021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifierExpression__Group__2__Impl_in_rule__QualifierExpression__Group__25079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifierExpression__Group_2__0_in_rule__QualifierExpression__Group__2__Impl5106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifierExpression__Group_2__0__Impl_in_rule__QualifierExpression__Group_2__05143 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__QualifierExpression__Group_2__1_in_rule__QualifierExpression__Group_2__05146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifierExpression__OpAssignment_2_0_in_rule__QualifierExpression__Group_2__0__Impl5173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifierExpression__Group_2__1__Impl_in_rule__QualifierExpression__Group_2__15203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifierExpression__RightAssignment_2_1_in_rule__QualifierExpression__Group_2__1__Impl5230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__0__Impl_in_rule__FunctionCall__Group__05264 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__1_in_rule__FunctionCall__Group__05267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesignator_in_rule__FunctionCall__Group__0__Impl5294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__1__Impl_in_rule__FunctionCall__Group__15323 = new BitSet(new long[]{0x00002273F60000F0L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__2_in_rule__FunctionCall__Group__15326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__FunctionCall__Group__1__Impl5354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__2__Impl_in_rule__FunctionCall__Group__25385 = new BitSet(new long[]{0x00002273F60000F0L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__3_in_rule__FunctionCall__Group__25388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__ParamsAssignment_2_in_rule__FunctionCall__Group__2__Impl5415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__3__Impl_in_rule__FunctionCall__Group__35446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__FunctionCall__Group__3__Impl5474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionList__Group__0__Impl_in_rule__ExpressionList__Group__05513 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ExpressionList__Group__1_in_rule__ExpressionList__Group__05516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionList__HeadAssignment_0_in_rule__ExpressionList__Group__0__Impl5543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionList__Group__1__Impl_in_rule__ExpressionList__Group__15573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionList__TailAssignment_1_in_rule__ExpressionList__Group__1__Impl5600 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__ExpressionRest__Group__0__Impl_in_rule__ExpressionRest__Group__05635 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ExpressionRest__Group__1_in_rule__ExpressionRest__Group__05638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ExpressionRest__Group__0__Impl5666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionRest__Group__1__Impl_in_rule__ExpressionRest__Group__15697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ExpressionRest__Group__1__Impl5724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_0__0__Impl_in_rule__ListExpression__Group_0__05757 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_0__1_in_rule__ListExpression__Group_0__05760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_0__1__Impl_in_rule__ListExpression__Group_0__15818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_0_1__0_in_rule__ListExpression__Group_0__1__Impl5845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_0_1__0__Impl_in_rule__ListExpression__Group_0_1__05879 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_0_1__1_in_rule__ListExpression__Group_0_1__05882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ListExpression__Group_0_1__0__Impl5911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_0_1__1__Impl_in_rule__ListExpression__Group_0_1__15943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__ExprAssignment_0_1_1_in_rule__ListExpression__Group_0_1__1__Impl5970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_1__0__Impl_in_rule__ListExpression__Group_1__06004 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_1__1_in_rule__ListExpression__Group_1__06007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_1__1__Impl_in_rule__ListExpression__Group_1__16065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_1_1__0_in_rule__ListExpression__Group_1__1__Impl6092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_1_1__0__Impl_in_rule__ListExpression__Group_1_1__06126 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_1_1__1_in_rule__ListExpression__Group_1_1__06129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ListExpression__Group_1_1__0__Impl6158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_1_1__1__Impl_in_rule__ListExpression__Group_1_1__16190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__ExprAssignment_1_1_1_in_rule__ListExpression__Group_1_1__1__Impl6217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_2__0__Impl_in_rule__ListExpression__Group_2__06251 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_2__1_in_rule__ListExpression__Group_2__06254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_2__1__Impl_in_rule__ListExpression__Group_2__16312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_2_1__0_in_rule__ListExpression__Group_2__1__Impl6339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_2_1__0__Impl_in_rule__ListExpression__Group_2_1__06373 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_2_1__1_in_rule__ListExpression__Group_2_1__06376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ListExpression__Group_2_1__0__Impl6405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_2_1__1__Impl_in_rule__ListExpression__Group_2_1__16437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__ExprAssignment_2_1_1_in_rule__ListExpression__Group_2_1__1__Impl6464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_3__0__Impl_in_rule__ListExpression__Group_3__06498 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_3__1_in_rule__ListExpression__Group_3__06501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_3__1__Impl_in_rule__ListExpression__Group_3__16559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_3_1__0_in_rule__ListExpression__Group_3__1__Impl6586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_3_1__0__Impl_in_rule__ListExpression__Group_3_1__06620 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_3_1__1_in_rule__ListExpression__Group_3_1__06623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ListExpression__Group_3_1__0__Impl6652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_3_1__1__Impl_in_rule__ListExpression__Group_3_1__16684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__ExprAssignment_3_1_1_in_rule__ListExpression__Group_3_1__1__Impl6711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_4__0__Impl_in_rule__ListExpression__Group_4__06745 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_4__1_in_rule__ListExpression__Group_4__06748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_4__1__Impl_in_rule__ListExpression__Group_4__16806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_4_1__0_in_rule__ListExpression__Group_4__1__Impl6833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_4_1__0__Impl_in_rule__ListExpression__Group_4_1__06867 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_4_1__1_in_rule__ListExpression__Group_4_1__06870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ListExpression__Group_4_1__0__Impl6899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_4_1__1__Impl_in_rule__ListExpression__Group_4_1__16931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__ExprAssignment_4_1_1_in_rule__ListExpression__Group_4_1__1__Impl6958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_5__0__Impl_in_rule__ListExpression__Group_5__06992 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_5__1_in_rule__ListExpression__Group_5__06995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_5__1__Impl_in_rule__ListExpression__Group_5__17053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_5_1__0_in_rule__ListExpression__Group_5__1__Impl7080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_5_1__0__Impl_in_rule__ListExpression__Group_5_1__07114 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_5_1__1_in_rule__ListExpression__Group_5_1__07117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ListExpression__Group_5_1__0__Impl7146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_5_1__1__Impl_in_rule__ListExpression__Group_5_1__17178 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_5_1__2_in_rule__ListExpression__Group_5_1__17181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__ExprAssignment_5_1_1_in_rule__ListExpression__Group_5_1__1__Impl7208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_5_1__2__Impl_in_rule__ListExpression__Group_5_1__27238 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_5_1__3_in_rule__ListExpression__Group_5_1__27241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ListExpression__Group_5_1__2__Impl7269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_5_1__3__Impl_in_rule__ListExpression__Group_5_1__37300 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_5_1__4_in_rule__ListExpression__Group_5_1__37303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__UsingExprAssignment_5_1_3_in_rule__ListExpression__Group_5_1__3__Impl7330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_5_1__4__Impl_in_rule__ListExpression__Group_5_1__47360 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_5_1__5_in_rule__ListExpression__Group_5_1__47363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ListExpression__Group_5_1__4__Impl7391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_5_1__5__Impl_in_rule__ListExpression__Group_5_1__57422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__InitValueAssignment_5_1_5_in_rule__ListExpression__Group_5_1__5__Impl7449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_6__0__Impl_in_rule__ListExpression__Group_6__07491 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_6__1_in_rule__ListExpression__Group_6__07494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_6__1__Impl_in_rule__ListExpression__Group_6__17552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_6_1__0_in_rule__ListExpression__Group_6__1__Impl7579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_6_1__0__Impl_in_rule__ListExpression__Group_6_1__07613 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_6_1__1_in_rule__ListExpression__Group_6_1__07616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ListExpression__Group_6_1__0__Impl7645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_6_1__1__Impl_in_rule__ListExpression__Group_6_1__17677 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_6_1__2_in_rule__ListExpression__Group_6_1__17680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__ExprAssignment_6_1_1_in_rule__ListExpression__Group_6_1__1__Impl7707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_6_1__2__Impl_in_rule__ListExpression__Group_6_1__27737 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_6_1__3_in_rule__ListExpression__Group_6_1__27740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ListExpression__Group_6_1__2__Impl7768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_6_1__3__Impl_in_rule__ListExpression__Group_6_1__37799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__UsingExprAssignment_6_1_3_in_rule__ListExpression__Group_6_1__3__Impl7826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_7__0__Impl_in_rule__ListExpression__Group_7__07864 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_7__1_in_rule__ListExpression__Group_7__07867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_7__1__Impl_in_rule__ListExpression__Group_7__17925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_7_1__0_in_rule__ListExpression__Group_7__1__Impl7952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_7_1__0__Impl_in_rule__ListExpression__Group_7_1__07986 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_7_1__1_in_rule__ListExpression__Group_7_1__07989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ListExpression__Group_7_1__0__Impl8018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_7_1__1__Impl_in_rule__ListExpression__Group_7_1__18050 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_7_1__2_in_rule__ListExpression__Group_7_1__18053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__ExprAssignment_7_1_1_in_rule__ListExpression__Group_7_1__1__Impl8080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_7_1__2__Impl_in_rule__ListExpression__Group_7_1__28110 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_7_1__3_in_rule__ListExpression__Group_7_1__28113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ListExpression__Group_7_1__2__Impl8141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_7_1__3__Impl_in_rule__ListExpression__Group_7_1__38172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__UsingExprAssignment_7_1_3_in_rule__ListExpression__Group_7_1__3__Impl8199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_8__0__Impl_in_rule__ListExpression__Group_8__08237 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_8__1_in_rule__ListExpression__Group_8__08240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_8__1__Impl_in_rule__ListExpression__Group_8__18298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_8_1__0_in_rule__ListExpression__Group_8__1__Impl8325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_8_1__0__Impl_in_rule__ListExpression__Group_8_1__08359 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_8_1__1_in_rule__ListExpression__Group_8_1__08362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ListExpression__Group_8_1__0__Impl8391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_8_1__1__Impl_in_rule__ListExpression__Group_8_1__18423 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_8_1__2_in_rule__ListExpression__Group_8_1__18426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__ApplyExprAssignment_8_1_1_in_rule__ListExpression__Group_8_1__1__Impl8453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_8_1__2__Impl_in_rule__ListExpression__Group_8_1__28483 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_8_1__3_in_rule__ListExpression__Group_8_1__28486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ListExpression__Group_8_1__2__Impl8514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__Group_8_1__3__Impl_in_rule__ListExpression__Group_8_1__38545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListExpression__ExprAssignment_8_1_3_in_rule__ListExpression__Group_8_1__3__Impl8572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListValue__Group__0__Impl_in_rule__ListValue__Group__08610 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__ListValue__Group__1_in_rule__ListValue__Group__08613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ListValue__Group__0__Impl8640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListValue__Group__1__Impl_in_rule__ListValue__Group__18669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListValue__Group_1__0_in_rule__ListValue__Group__1__Impl8696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListValue__Group_1__0__Impl_in_rule__ListValue__Group_1__08731 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__ListValue__Group_1__1_in_rule__ListValue__Group_1__08734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ListValue__Group_1__0__Impl8763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListValue__Group_1__1__Impl_in_rule__ListValue__Group_1__18795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListValue__ConditionAssignment_1_1_in_rule__ListValue__Group_1__1__Impl8822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_0__0__Impl_in_rule__UnaryExpression__Group_0__08856 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_0__1_in_rule__UnaryExpression__Group_0__08859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__UnaryExpression__Group_0__0__Impl8886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_0__1__Impl_in_rule__UnaryExpression__Group_0__18915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__StructuredExpressionAssignment_0_1_in_rule__UnaryExpression__Group_0__1__Impl8942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__0__Impl_in_rule__UnaryExpression__Group_1__08976 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__1_in_rule__UnaryExpression__Group_1__08979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__UnaryExpression__Group_1__0__Impl9007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__1__Impl_in_rule__UnaryExpression__Group_1__19038 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__2_in_rule__UnaryExpression__Group_1__19041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__UnaryExpression__Group_1__1__Impl9068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__2__Impl_in_rule__UnaryExpression__Group_1__29097 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__3_in_rule__UnaryExpression__Group_1__29100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__UnaryExpression__Group_1__2__Impl9128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__3__Impl_in_rule__UnaryExpression__Group_1__39159 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__4_in_rule__UnaryExpression__Group_1__39162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__4__Impl_in_rule__UnaryExpression__Group_1__49220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__StructuredExpressionAssignment_1_4_in_rule__UnaryExpression__Group_1__4__Impl9247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__0__Impl_in_rule__UnaryExpression__Group_2__09287 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__1_in_rule__UnaryExpression__Group_2__09290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__UnaryExpression__Group_2__0__Impl9318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__1__Impl_in_rule__UnaryExpression__Group_2__19349 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__2_in_rule__UnaryExpression__Group_2__19352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__UnaryExpression__Group_2__1__Impl9379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__2__Impl_in_rule__UnaryExpression__Group_2__29408 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__3_in_rule__UnaryExpression__Group_2__29411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__UnaryExpression__Group_2__2__Impl9439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__3__Impl_in_rule__UnaryExpression__Group_2__39470 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__4_in_rule__UnaryExpression__Group_2__39473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__4__Impl_in_rule__UnaryExpression__Group_2__49531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__StructuredExpressionAssignment_2_4_in_rule__UnaryExpression__Group_2__4__Impl9558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureExpression__Group__0__Impl_in_rule__StructureExpression__Group__09598 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__StructureExpression__Group__1_in_rule__StructureExpression__Group__09601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureExpression__Group__1__Impl_in_rule__StructureExpression__Group__19659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureExpression__Group_1__0_in_rule__StructureExpression__Group__1__Impl9686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureExpression__Group_1__0__Impl_in_rule__StructureExpression__Group_1__09721 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StructureExpression__Group_1__1_in_rule__StructureExpression__Group_1__09724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__StructureExpression__Group_1__0__Impl9752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureExpression__Group_1__1__Impl_in_rule__StructureExpression__Group_1__19783 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__StructureExpression__Group_1__2_in_rule__StructureExpression__Group_1__19786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureExpression__KeyValuePairAssignment_1_1_in_rule__StructureExpression__Group_1__1__Impl9813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureExpression__Group_1__2__Impl_in_rule__StructureExpression__Group_1__29843 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__StructureExpression__Group_1__3_in_rule__StructureExpression__Group_1__29846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__StructureExpression__Group_1__2__Impl9874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureExpression__Group_1__3__Impl_in_rule__StructureExpression__Group_1__39905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureExpression__StructuredExpressionsAssignment_1_3_in_rule__StructureExpression__Group_1__3__Impl9932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValuePair__Group__0__Impl_in_rule__KeyValuePair__Group__09970 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__KeyValuePair__Group__1_in_rule__KeyValuePair__Group__09973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValuePair__KeyAssignment_0_in_rule__KeyValuePair__Group__0__Impl10000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValuePair__Group__1__Impl_in_rule__KeyValuePair__Group__110030 = new BitSet(new long[]{0x00002273F20000F0L});
    public static final BitSet FOLLOW_rule__KeyValuePair__Group__2_in_rule__KeyValuePair__Group__110033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__KeyValuePair__Group__1__Impl10061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValuePair__Group__2__Impl_in_rule__KeyValuePair__Group__210092 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__KeyValuePair__Group__3_in_rule__KeyValuePair__Group__210095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValuePair__ValueAssignment_2_in_rule__KeyValuePair__Group__2__Impl10122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValuePair__Group__3__Impl_in_rule__KeyValuePair__Group__310152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValuePair__RestAssignment_3_in_rule__KeyValuePair__Group__3__Impl10179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValuePairRest__Group__0__Impl_in_rule__KeyValuePairRest__Group__010218 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__KeyValuePairRest__Group__1_in_rule__KeyValuePairRest__Group__010221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__KeyValuePairRest__Group__0__Impl10249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValuePairRest__Group__1__Impl_in_rule__KeyValuePairRest__Group__110280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyValuePair_in_rule__KeyValuePairRest__Group__1__Impl10307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__010340 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__010343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__110401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__ValueAssignment_1_1_in_rule__Term__Group_1__1__Impl10428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_2__0__Impl_in_rule__Term__Group_2__010462 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Term__Group_2__1_in_rule__Term__Group_2__010465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_2__1__Impl_in_rule__Term__Group_2__110523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__ValueAssignment_2_1_in_rule__Term__Group_2__1__Impl10550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_3__0__Impl_in_rule__Term__Group_3__010584 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Term__Group_3__1_in_rule__Term__Group_3__010587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_3__1__Impl_in_rule__Term__Group_3__110645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__ValueAssignment_3_1_in_rule__Term__Group_3__1__Impl10672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__Group__0__Impl_in_rule__List__Group__010706 = new BitSet(new long[]{0x00002000000000F0L});
    public static final BitSet FOLLOW_rule__List__Group__1_in_rule__List__Group__010709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__Group__1__Impl_in_rule__List__Group__110767 = new BitSet(new long[]{0x00006000000000F0L});
    public static final BitSet FOLLOW_rule__List__Group__2_in_rule__List__Group__110770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__List__Group__1__Impl10798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__Group__2__Impl_in_rule__List__Group__210829 = new BitSet(new long[]{0x00006000000000F0L});
    public static final BitSet FOLLOW_rule__List__Group__3_in_rule__List__Group__210832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__TermsAssignment_2_in_rule__List__Group__2__Impl10859 = new BitSet(new long[]{0x00002000000000F2L});
    public static final BitSet FOLLOW_rule__List__Group__3__Impl_in_rule__List__Group__310890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__List__Group__3__Impl10918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhrase_in_rule__Model__PhraseAssignment10964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__StatementList__HeadAssignment_010995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementList_in_rule__StatementList__TailAssignment_211026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesignator_in_rule__VariableAssignmentStatement__DesignatorAssignment_011057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__VariableAssignmentStatement__ExpressionAssignment_211088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SelfAssignmentStatement__ExpressionAssignment_211119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__OrExpression__OpAssignment_2_011155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_rule__OrExpression__RightAssignment_2_111194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__AndExpression__OpAssignment_2_011230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_rule__AndExpression__RightAssignment_2_111269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__OpAlternatives_2_0_0_in_rule__EqualityExpression__OpAssignment_2_011300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_rule__EqualityExpression__RightAssignment_2_111333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashExpression__OpAlternatives_2_0_0_in_rule__DashExpression__OpAssignment_2_011364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDashExpression_in_rule__DashExpression__RightAssignment_2_111397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointExpression__OpAlternatives_2_0_0_in_rule__PointExpression__OpAssignment_2_011428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointExpression_in_rule__PointExpression__RightAssignment_2_111461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__PowExpression__OpAssignment_2_011497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowExpression_in_rule__PowExpression__RightAssignment_2_111536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__QualifierExpression__OpAssignment_2_011572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifierExpression_in_rule__QualifierExpression__RightAssignment_2_111611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionList_in_rule__FunctionCall__ParamsAssignment_211642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ExpressionList__HeadAssignment_011673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionRest_in_rule__ExpressionList__TailAssignment_111704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_0_1_111735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_1_1_111766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_2_1_111797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_3_1_111828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_4_1_111859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_5_1_111890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ListExpression__UsingExprAssignment_5_1_311921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ListExpression__InitValueAssignment_5_1_511952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_6_1_111983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ListExpression__UsingExprAssignment_6_1_312014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_7_1_112045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ListExpression__UsingExprAssignment_7_1_312076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ListExpression__ApplyExprAssignment_8_1_112107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListValue_in_rule__ListExpression__ExprAssignment_8_1_312138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__ListValue__ConditionAssignment_1_112169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_rule__UnaryExpression__StructuredExpressionAssignment_0_112200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_rule__UnaryExpression__StructuredExpressionAssignment_1_412231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_rule__UnaryExpression__StructuredExpressionAssignment_2_412262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyValuePair_in_rule__StructureExpression__KeyValuePairAssignment_1_112293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_rule__StructureExpression__StructuredExpressionsAssignment_1_312324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__KeyValuePair__KeyAssignment_012355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__KeyValuePair__ValueAssignment_212386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyValuePairRest_in_rule__KeyValuePair__RestAssignment_312417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Term__ValueAssignment_1_112448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Term__ValueAssignment_2_112479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__Term__ValueAssignment_3_112510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__List__TermsAssignment_212541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Designator__ValueAssignment12576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_2__0_in_synpred27_InternalExpression3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_2__0_in_synpred28_InternalExpression3581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_2__0_in_synpred29_InternalExpression3886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashExpression__Group_2__0_in_synpred30_InternalExpression4191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointExpression__Group_2__0_in_synpred31_InternalExpression4496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowExpression__Group_2__0_in_synpred32_InternalExpression4801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifierExpression__Group_2__0_in_synpred33_InternalExpression5106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListValue__Group_1__0_in_synpred36_InternalExpression8696 = new BitSet(new long[]{0x0000000000000002L});

}