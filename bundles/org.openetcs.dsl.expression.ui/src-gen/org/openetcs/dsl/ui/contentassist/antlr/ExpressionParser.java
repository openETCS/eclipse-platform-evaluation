/*
* generated by Xtext
*/
package org.openetcs.dsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.openetcs.dsl.services.ExpressionGrammarAccess;

public class ExpressionParser extends AbstractContentAssistParser {
	
	@Inject
	private ExpressionGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.openetcs.dsl.ui.contentassist.antlr.internal.InternalExpressionParser createParser() {
		org.openetcs.dsl.ui.contentassist.antlr.internal.InternalExpressionParser result = new org.openetcs.dsl.ui.contentassist.antlr.internal.InternalExpressionParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getPhraseAccess().getAlternatives(), "rule__Phrase__Alternatives");
					put(grammarAccess.getAssignmentStatementAccess().getAlternatives(), "rule__AssignmentStatement__Alternatives");
					put(grammarAccess.getEqualityExpressionAccess().getOpAlternatives_2_0_0(), "rule__EqualityExpression__OpAlternatives_2_0_0");
					put(grammarAccess.getDashExpressionAccess().getOpAlternatives_2_0_0(), "rule__DashExpression__OpAlternatives_2_0_0");
					put(grammarAccess.getPointExpressionAccess().getOpAlternatives_2_0_0(), "rule__PointExpression__OpAlternatives_2_0_0");
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
					put(grammarAccess.getListExpressionAccess().getAlternatives(), "rule__ListExpression__Alternatives");
					put(grammarAccess.getUnaryExpressionAccess().getAlternatives(), "rule__UnaryExpression__Alternatives");
					put(grammarAccess.getTermAccess().getAlternatives(), "rule__Term__Alternatives");
					put(grammarAccess.getStatementListAccess().getGroup(), "rule__StatementList__Group__0");
					put(grammarAccess.getVariableAssignmentStatementAccess().getGroup(), "rule__VariableAssignmentStatement__Group__0");
					put(grammarAccess.getSelfAssignmentStatementAccess().getGroup(), "rule__SelfAssignmentStatement__Group__0");
					put(grammarAccess.getOrExpressionAccess().getGroup(), "rule__OrExpression__Group__0");
					put(grammarAccess.getOrExpressionAccess().getGroup_2(), "rule__OrExpression__Group_2__0");
					put(grammarAccess.getAndExpressionAccess().getGroup(), "rule__AndExpression__Group__0");
					put(grammarAccess.getAndExpressionAccess().getGroup_2(), "rule__AndExpression__Group_2__0");
					put(grammarAccess.getEqualityExpressionAccess().getGroup(), "rule__EqualityExpression__Group__0");
					put(grammarAccess.getEqualityExpressionAccess().getGroup_2(), "rule__EqualityExpression__Group_2__0");
					put(grammarAccess.getDashExpressionAccess().getGroup(), "rule__DashExpression__Group__0");
					put(grammarAccess.getDashExpressionAccess().getGroup_2(), "rule__DashExpression__Group_2__0");
					put(grammarAccess.getPointExpressionAccess().getGroup(), "rule__PointExpression__Group__0");
					put(grammarAccess.getPointExpressionAccess().getGroup_2(), "rule__PointExpression__Group_2__0");
					put(grammarAccess.getPowExpressionAccess().getGroup(), "rule__PowExpression__Group__0");
					put(grammarAccess.getPowExpressionAccess().getGroup_2(), "rule__PowExpression__Group_2__0");
					put(grammarAccess.getQualifierExpressionAccess().getGroup(), "rule__QualifierExpression__Group__0");
					put(grammarAccess.getQualifierExpressionAccess().getGroup_2(), "rule__QualifierExpression__Group_2__0");
					put(grammarAccess.getFunctionCallAccess().getGroup(), "rule__FunctionCall__Group__0");
					put(grammarAccess.getProcedureCallAccess().getGroup(), "rule__ProcedureCall__Group__0");
					put(grammarAccess.getExpressionListAccess().getGroup(), "rule__ExpressionList__Group__0");
					put(grammarAccess.getExpressionRestAccess().getGroup(), "rule__ExpressionRest__Group__0");
					put(grammarAccess.getListExpressionAccess().getGroup_0(), "rule__ListExpression__Group_0__0");
					put(grammarAccess.getListExpressionAccess().getGroup_0_1(), "rule__ListExpression__Group_0_1__0");
					put(grammarAccess.getListExpressionAccess().getGroup_1(), "rule__ListExpression__Group_1__0");
					put(grammarAccess.getListExpressionAccess().getGroup_1_1(), "rule__ListExpression__Group_1_1__0");
					put(grammarAccess.getListExpressionAccess().getGroup_2(), "rule__ListExpression__Group_2__0");
					put(grammarAccess.getListExpressionAccess().getGroup_2_1(), "rule__ListExpression__Group_2_1__0");
					put(grammarAccess.getListExpressionAccess().getGroup_3(), "rule__ListExpression__Group_3__0");
					put(grammarAccess.getListExpressionAccess().getGroup_3_1(), "rule__ListExpression__Group_3_1__0");
					put(grammarAccess.getListExpressionAccess().getGroup_4(), "rule__ListExpression__Group_4__0");
					put(grammarAccess.getListExpressionAccess().getGroup_4_1(), "rule__ListExpression__Group_4_1__0");
					put(grammarAccess.getListExpressionAccess().getGroup_5(), "rule__ListExpression__Group_5__0");
					put(grammarAccess.getListExpressionAccess().getGroup_5_1(), "rule__ListExpression__Group_5_1__0");
					put(grammarAccess.getListExpressionAccess().getGroup_6(), "rule__ListExpression__Group_6__0");
					put(grammarAccess.getListExpressionAccess().getGroup_6_1(), "rule__ListExpression__Group_6_1__0");
					put(grammarAccess.getListExpressionAccess().getGroup_7(), "rule__ListExpression__Group_7__0");
					put(grammarAccess.getListExpressionAccess().getGroup_7_1(), "rule__ListExpression__Group_7_1__0");
					put(grammarAccess.getListExpressionAccess().getGroup_8(), "rule__ListExpression__Group_8__0");
					put(grammarAccess.getListExpressionAccess().getGroup_8_1(), "rule__ListExpression__Group_8_1__0");
					put(grammarAccess.getListValueAccess().getGroup(), "rule__ListValue__Group__0");
					put(grammarAccess.getListValueAccess().getGroup_1(), "rule__ListValue__Group_1__0");
					put(grammarAccess.getUnaryExpressionAccess().getGroup_0(), "rule__UnaryExpression__Group_0__0");
					put(grammarAccess.getUnaryExpressionAccess().getGroup_1(), "rule__UnaryExpression__Group_1__0");
					put(grammarAccess.getUnaryExpressionAccess().getGroup_2(), "rule__UnaryExpression__Group_2__0");
					put(grammarAccess.getStructureExpressionAccess().getGroup(), "rule__StructureExpression__Group__0");
					put(grammarAccess.getStructureExpressionAccess().getGroup_1(), "rule__StructureExpression__Group_1__0");
					put(grammarAccess.getKeyValuePairAccess().getGroup(), "rule__KeyValuePair__Group__0");
					put(grammarAccess.getKeyValuePairRestAccess().getGroup(), "rule__KeyValuePairRest__Group__0");
					put(grammarAccess.getTermAccess().getGroup_1(), "rule__Term__Group_1__0");
					put(grammarAccess.getTermAccess().getGroup_2(), "rule__Term__Group_2__0");
					put(grammarAccess.getTermAccess().getGroup_3(), "rule__Term__Group_3__0");
					put(grammarAccess.getListAccess().getGroup(), "rule__List__Group__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getModelAccess().getPhraseAssignment(), "rule__Model__PhraseAssignment");
					put(grammarAccess.getStatementListAccess().getHeadAssignment_0(), "rule__StatementList__HeadAssignment_0");
					put(grammarAccess.getStatementListAccess().getTailAssignment_2(), "rule__StatementList__TailAssignment_2");
					put(grammarAccess.getVariableAssignmentStatementAccess().getDesignatorAssignment_0(), "rule__VariableAssignmentStatement__DesignatorAssignment_0");
					put(grammarAccess.getVariableAssignmentStatementAccess().getExpressionAssignment_2(), "rule__VariableAssignmentStatement__ExpressionAssignment_2");
					put(grammarAccess.getSelfAssignmentStatementAccess().getExpressionAssignment_2(), "rule__SelfAssignmentStatement__ExpressionAssignment_2");
					put(grammarAccess.getOrExpressionAccess().getOpAssignment_2_0(), "rule__OrExpression__OpAssignment_2_0");
					put(grammarAccess.getOrExpressionAccess().getRightAssignment_2_1(), "rule__OrExpression__RightAssignment_2_1");
					put(grammarAccess.getAndExpressionAccess().getOpAssignment_2_0(), "rule__AndExpression__OpAssignment_2_0");
					put(grammarAccess.getAndExpressionAccess().getRightAssignment_2_1(), "rule__AndExpression__RightAssignment_2_1");
					put(grammarAccess.getEqualityExpressionAccess().getOpAssignment_2_0(), "rule__EqualityExpression__OpAssignment_2_0");
					put(grammarAccess.getEqualityExpressionAccess().getRightAssignment_2_1(), "rule__EqualityExpression__RightAssignment_2_1");
					put(grammarAccess.getDashExpressionAccess().getOpAssignment_2_0(), "rule__DashExpression__OpAssignment_2_0");
					put(grammarAccess.getDashExpressionAccess().getRightAssignment_2_1(), "rule__DashExpression__RightAssignment_2_1");
					put(grammarAccess.getPointExpressionAccess().getOpAssignment_2_0(), "rule__PointExpression__OpAssignment_2_0");
					put(grammarAccess.getPointExpressionAccess().getRightAssignment_2_1(), "rule__PointExpression__RightAssignment_2_1");
					put(grammarAccess.getPowExpressionAccess().getOpAssignment_2_0(), "rule__PowExpression__OpAssignment_2_0");
					put(grammarAccess.getPowExpressionAccess().getRightAssignment_2_1(), "rule__PowExpression__RightAssignment_2_1");
					put(grammarAccess.getQualifierExpressionAccess().getOpAssignment_2_0(), "rule__QualifierExpression__OpAssignment_2_0");
					put(grammarAccess.getQualifierExpressionAccess().getRightAssignment_2_1(), "rule__QualifierExpression__RightAssignment_2_1");
					put(grammarAccess.getFunctionCallAccess().getFunctionAssignment_0(), "rule__FunctionCall__FunctionAssignment_0");
					put(grammarAccess.getFunctionCallAccess().getParamsAssignment_2(), "rule__FunctionCall__ParamsAssignment_2");
					put(grammarAccess.getProcedureCallAccess().getProcedureAssignment_0(), "rule__ProcedureCall__ProcedureAssignment_0");
					put(grammarAccess.getProcedureCallAccess().getParamsAssignment_2(), "rule__ProcedureCall__ParamsAssignment_2");
					put(grammarAccess.getExpressionListAccess().getHeadAssignment_0(), "rule__ExpressionList__HeadAssignment_0");
					put(grammarAccess.getExpressionListAccess().getTailAssignment_1(), "rule__ExpressionList__TailAssignment_1");
					put(grammarAccess.getListExpressionAccess().getExprAssignment_0_1_1(), "rule__ListExpression__ExprAssignment_0_1_1");
					put(grammarAccess.getListExpressionAccess().getExprAssignment_1_1_1(), "rule__ListExpression__ExprAssignment_1_1_1");
					put(grammarAccess.getListExpressionAccess().getExprAssignment_2_1_1(), "rule__ListExpression__ExprAssignment_2_1_1");
					put(grammarAccess.getListExpressionAccess().getExprAssignment_3_1_1(), "rule__ListExpression__ExprAssignment_3_1_1");
					put(grammarAccess.getListExpressionAccess().getExprAssignment_4_1_1(), "rule__ListExpression__ExprAssignment_4_1_1");
					put(grammarAccess.getListExpressionAccess().getExprAssignment_5_1_1(), "rule__ListExpression__ExprAssignment_5_1_1");
					put(grammarAccess.getListExpressionAccess().getUsingExprAssignment_5_1_3(), "rule__ListExpression__UsingExprAssignment_5_1_3");
					put(grammarAccess.getListExpressionAccess().getInitValueAssignment_5_1_5(), "rule__ListExpression__InitValueAssignment_5_1_5");
					put(grammarAccess.getListExpressionAccess().getExprAssignment_6_1_1(), "rule__ListExpression__ExprAssignment_6_1_1");
					put(grammarAccess.getListExpressionAccess().getUsingExprAssignment_6_1_3(), "rule__ListExpression__UsingExprAssignment_6_1_3");
					put(grammarAccess.getListExpressionAccess().getExprAssignment_7_1_1(), "rule__ListExpression__ExprAssignment_7_1_1");
					put(grammarAccess.getListExpressionAccess().getUsingExprAssignment_7_1_3(), "rule__ListExpression__UsingExprAssignment_7_1_3");
					put(grammarAccess.getListExpressionAccess().getApplyExprAssignment_8_1_1(), "rule__ListExpression__ApplyExprAssignment_8_1_1");
					put(grammarAccess.getListExpressionAccess().getExprAssignment_8_1_3(), "rule__ListExpression__ExprAssignment_8_1_3");
					put(grammarAccess.getListValueAccess().getConditionAssignment_1_1(), "rule__ListValue__ConditionAssignment_1_1");
					put(grammarAccess.getUnaryExpressionAccess().getStructuredExpressionAssignment_0_1(), "rule__UnaryExpression__StructuredExpressionAssignment_0_1");
					put(grammarAccess.getUnaryExpressionAccess().getStructuredExpressionAssignment_1_4(), "rule__UnaryExpression__StructuredExpressionAssignment_1_4");
					put(grammarAccess.getUnaryExpressionAccess().getStructuredExpressionAssignment_2_4(), "rule__UnaryExpression__StructuredExpressionAssignment_2_4");
					put(grammarAccess.getStructureExpressionAccess().getKeyValuePairAssignment_1_1(), "rule__StructureExpression__KeyValuePairAssignment_1_1");
					put(grammarAccess.getStructureExpressionAccess().getStructuredExpressionsAssignment_1_3(), "rule__StructureExpression__StructuredExpressionsAssignment_1_3");
					put(grammarAccess.getKeyValuePairAccess().getKeyAssignment_0(), "rule__KeyValuePair__KeyAssignment_0");
					put(grammarAccess.getKeyValuePairAccess().getValueAssignment_2(), "rule__KeyValuePair__ValueAssignment_2");
					put(grammarAccess.getKeyValuePairAccess().getRestAssignment_3(), "rule__KeyValuePair__RestAssignment_3");
					put(grammarAccess.getTermAccess().getValueAssignment_1_1(), "rule__Term__ValueAssignment_1_1");
					put(grammarAccess.getTermAccess().getValueAssignment_2_1(), "rule__Term__ValueAssignment_2_1");
					put(grammarAccess.getTermAccess().getValueAssignment_3_1(), "rule__Term__ValueAssignment_3_1");
					put(grammarAccess.getListAccess().getTermsAssignment_2(), "rule__List__TermsAssignment_2");
					put(grammarAccess.getDesignatorAccess().getValueAssignment(), "rule__Designator__ValueAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.openetcs.dsl.ui.contentassist.antlr.internal.InternalExpressionParser typedParser = (org.openetcs.dsl.ui.contentassist.antlr.internal.InternalExpressionParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ExpressionGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ExpressionGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
