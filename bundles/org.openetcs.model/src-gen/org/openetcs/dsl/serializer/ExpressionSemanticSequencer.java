package org.openetcs.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.openetcs.dsl.expression.AndExpression;
import org.openetcs.dsl.expression.Apply;
import org.openetcs.dsl.expression.Count;
import org.openetcs.dsl.expression.DashExpression;
import org.openetcs.dsl.expression.Designator;
import org.openetcs.dsl.expression.DoubleValue;
import org.openetcs.dsl.expression.EqualityExpression;
import org.openetcs.dsl.expression.ExpressionList;
import org.openetcs.dsl.expression.ExpressionPackage;
import org.openetcs.dsl.expression.FirstIn;
import org.openetcs.dsl.expression.ForallIn;
import org.openetcs.dsl.expression.FunctionCall;
import org.openetcs.dsl.expression.IntegerValue;
import org.openetcs.dsl.expression.KeyValuePair;
import org.openetcs.dsl.expression.LastIn;
import org.openetcs.dsl.expression.List;
import org.openetcs.dsl.expression.Map;
import org.openetcs.dsl.expression.Model;
import org.openetcs.dsl.expression.OrExpression;
import org.openetcs.dsl.expression.PointExpression;
import org.openetcs.dsl.expression.PowExpression;
import org.openetcs.dsl.expression.ProcedureCall;
import org.openetcs.dsl.expression.QualifierExpression;
import org.openetcs.dsl.expression.Reduce;
import org.openetcs.dsl.expression.SelfAssignmentStatement;
import org.openetcs.dsl.expression.StatementList;
import org.openetcs.dsl.expression.StringValue;
import org.openetcs.dsl.expression.StructureExpression;
import org.openetcs.dsl.expression.Sum;
import org.openetcs.dsl.expression.ThereIsIn;
import org.openetcs.dsl.expression.UnaryExpression;
import org.openetcs.dsl.expression.VariableAssignmentStatement;
import org.openetcs.dsl.services.ExpressionGrammarAccess;

@SuppressWarnings("all")
public class ExpressionSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ExpressionGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ExpressionPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ExpressionPackage.AND_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1()) {
					sequence_AndExpression(context, (AndExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.APPLY:
				if(context == grammarAccess.getListExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getQualifierExpressionAccess().getQualifierExpressionLeftAction_1()) {
					sequence_ListExpression(context, (Apply) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.COUNT:
				if(context == grammarAccess.getListExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getQualifierExpressionAccess().getQualifierExpressionLeftAction_1()) {
					sequence_ListExpression(context, (Count) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.DASH_EXPRESSION:
				if(context == grammarAccess.getDashExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1()) {
					sequence_DashExpression(context, (DashExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.DESIGNATOR:
				if(context == grammarAccess.getDesignatorRule() ||
				   context == grammarAccess.getTermRule()) {
					sequence_Designator(context, (Designator) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getQualifierExpressionAccess().getQualifierExpressionLeftAction_1() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_Designator_UnaryExpression(context, (Designator) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.DOUBLE_VALUE:
				if(context == grammarAccess.getTermRule()) {
					sequence_Term(context, (DoubleValue) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getQualifierExpressionAccess().getQualifierExpressionLeftAction_1() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_Term_UnaryExpression(context, (DoubleValue) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.EQUALITY_EXPRESSION:
				if(context == grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1() ||
				   context == grammarAccess.getEqualityExpressionRule()) {
					sequence_EqualityExpression(context, (EqualityExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.EXPRESSION_LIST:
				if(context == grammarAccess.getExpressionListRule()) {
					sequence_ExpressionList(context, (ExpressionList) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.FIRST_IN:
				if(context == grammarAccess.getListExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getQualifierExpressionAccess().getQualifierExpressionLeftAction_1()) {
					sequence_ListExpression(context, (FirstIn) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.FORALL_IN:
				if(context == grammarAccess.getListExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getQualifierExpressionAccess().getQualifierExpressionLeftAction_1()) {
					sequence_ListExpression(context, (ForallIn) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.FUNCTION_CALL:
				if(context == grammarAccess.getFunctionCallRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getQualifierExpressionAccess().getQualifierExpressionLeftAction_1()) {
					sequence_FunctionCall(context, (FunctionCall) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.INTEGER_VALUE:
				if(context == grammarAccess.getTermRule()) {
					sequence_Term(context, (IntegerValue) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getQualifierExpressionAccess().getQualifierExpressionLeftAction_1() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_Term_UnaryExpression(context, (IntegerValue) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.KEY_VALUE_PAIR:
				if(context == grammarAccess.getKeyValuePairRule() ||
				   context == grammarAccess.getKeyValuePairRestRule()) {
					sequence_KeyValuePair(context, (KeyValuePair) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.LAST_IN:
				if(context == grammarAccess.getListExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getQualifierExpressionAccess().getQualifierExpressionLeftAction_1()) {
					sequence_ListExpression(context, (LastIn) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.LIST:
				if(context == grammarAccess.getListRule() ||
				   context == grammarAccess.getTermRule()) {
					sequence_List(context, (List) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getQualifierExpressionAccess().getQualifierExpressionLeftAction_1() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_List_UnaryExpression(context, (List) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.MAP:
				if(context == grammarAccess.getListExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getQualifierExpressionAccess().getQualifierExpressionLeftAction_1()) {
					sequence_ListExpression(context, (Map) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.OR_EXPRESSION:
				if(context == grammarAccess.getListValueRule()) {
					sequence_ListValue_OrExpression(context, (OrExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getConditionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionRestRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getPhraseRule() ||
				   context == grammarAccess.getUnaryExpressionAccess().getUnaryExpressionExprAction_1_3() ||
				   context == grammarAccess.getUnaryExpressionAccess().getUnaryExpressionExprAction_2_3()) {
					sequence_OrExpression(context, (OrExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.POINT_EXPRESSION:
				if(context == grammarAccess.getDashExpressionAccess().getDashExpressionLeftAction_1() ||
				   context == grammarAccess.getPointExpressionRule()) {
					sequence_PointExpression(context, (PointExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.POW_EXPRESSION:
				if(context == grammarAccess.getPointExpressionAccess().getPointExpressionLeftAction_1() ||
				   context == grammarAccess.getPowExpressionRule()) {
					sequence_PowExpression(context, (PowExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.PROCEDURE_CALL:
				if(context == grammarAccess.getProcedureCallRule()) {
					sequence_ProcedureCall(context, (ProcedureCall) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.QUALIFIER_EXPRESSION:
				if(context == grammarAccess.getPowExpressionAccess().getPowExpressionLeftAction_1() ||
				   context == grammarAccess.getQualifierExpressionRule()) {
					sequence_QualifierExpression(context, (QualifierExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.REDUCE:
				if(context == grammarAccess.getListExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getQualifierExpressionAccess().getQualifierExpressionLeftAction_1()) {
					sequence_ListExpression(context, (Reduce) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.SELF_ASSIGNMENT_STATEMENT:
				if(context == grammarAccess.getAssignmentStatementRule() ||
				   context == grammarAccess.getSelfAssignmentStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_SelfAssignmentStatement(context, (SelfAssignmentStatement) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.STATEMENT_LIST:
				if(context == grammarAccess.getPhraseRule() ||
				   context == grammarAccess.getStatementListRule()) {
					sequence_StatementList(context, (StatementList) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.STRING_VALUE:
				if(context == grammarAccess.getTermRule()) {
					sequence_Term(context, (StringValue) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getQualifierExpressionAccess().getQualifierExpressionLeftAction_1() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_Term_UnaryExpression(context, (StringValue) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.STRUCTURE_EXPRESSION:
				if(context == grammarAccess.getStructureExpressionRule()) {
					sequence_StructureExpression(context, (StructureExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.SUM:
				if(context == grammarAccess.getListExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getQualifierExpressionAccess().getQualifierExpressionLeftAction_1()) {
					sequence_ListExpression(context, (Sum) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.THERE_IS_IN:
				if(context == grammarAccess.getListExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getQualifierExpressionAccess().getQualifierExpressionLeftAction_1()) {
					sequence_ListExpression(context, (ThereIsIn) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.UNARY_EXPRESSION:
				if(context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getQualifierExpressionAccess().getQualifierExpressionLeftAction_1() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_UnaryExpression(context, (UnaryExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.VARIABLE_ASSIGNMENT_STATEMENT:
				if(context == grammarAccess.getAssignmentStatementRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getVariableAssignmentStatementRule()) {
					sequence_VariableAssignmentStatement(context, (VariableAssignmentStatement) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     ((left=AndExpression_AndExpression_1 (op='AND' right=AndExpression)?) | left=AndExpression_AndExpression_1)
	 */
	protected void sequence_AndExpression(EObject context, AndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((left=DashExpression_DashExpression_1 ((op='+' | op='-') right=DashExpression)?) | left=DashExpression_DashExpression_1)
	 */
	protected void sequence_DashExpression(EObject context, DashExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=[EObject|ID]
	 */
	protected void sequence_Designator(EObject context, Designator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=[EObject|ID] structuredExpression=StructureExpression)
	 */
	protected void sequence_Designator_UnaryExpression(EObject context, Designator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             left=EqualityExpression_EqualityExpression_1 
	 *             (
	 *                 (
	 *                     op='==' | 
	 *                     op='!=' | 
	 *                     op='<=' | 
	 *                     op='>=' | 
	 *                     op='in' | 
	 *                     op='not in'
	 *                 ) 
	 *                 right=EqualityExpression
	 *             )?
	 *         ) | 
	 *         left=EqualityExpression_EqualityExpression_1
	 *     )
	 */
	protected void sequence_EqualityExpression(EObject context, EqualityExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (head=Expression tail+=ExpressionRest*)
	 */
	protected void sequence_ExpressionList(EObject context, ExpressionList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (function=[Function|ID] params=ExpressionList?)
	 */
	protected void sequence_FunctionCall(EObject context, FunctionCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key=ID value=Expression rest+=KeyValuePairRest?)
	 */
	protected void sequence_KeyValuePair(EObject context, KeyValuePair semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (applyExpr=Expression expr=ListValue)
	 */
	protected void sequence_ListExpression(EObject context, Apply semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expr=ListValue
	 */
	protected void sequence_ListExpression(EObject context, Count semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expr=ListValue
	 */
	protected void sequence_ListExpression(EObject context, FirstIn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expr=ListValue
	 */
	protected void sequence_ListExpression(EObject context, ForallIn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expr=ListValue
	 */
	protected void sequence_ListExpression(EObject context, LastIn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr=ListValue usingExpr=Expression)
	 */
	protected void sequence_ListExpression(EObject context, Map semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr=ListValue usingExpr=Expression initValue=Expression)
	 */
	protected void sequence_ListExpression(EObject context, Reduce semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr=ListValue usingExpr=Expression)
	 */
	protected void sequence_ListExpression(EObject context, Sum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expr=ListValue
	 */
	protected void sequence_ListExpression(EObject context, ThereIsIn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((left=OrExpression_OrExpression_1 (op='OR' right=OrExpression)?) | left=OrExpression_OrExpression_1) condition=Condition?)
	 */
	protected void sequence_ListValue_OrExpression(EObject context, OrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (terms+=Term*)
	 */
	protected void sequence_List(EObject context, List semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (terms+=Term* structuredExpression=StructureExpression)
	 */
	protected void sequence_List_UnaryExpression(EObject context, List semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     phrase=Phrase
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionPackage.Literals.MODEL__PHRASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionPackage.Literals.MODEL__PHRASE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModelAccess().getPhrasePhraseParserRuleCall_0(), semanticObject.getPhrase());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((left=OrExpression_OrExpression_1 (op='OR' right=OrExpression)?) | left=OrExpression_OrExpression_1)
	 */
	protected void sequence_OrExpression(EObject context, OrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((left=PointExpression_PointExpression_1 ((op='*' | op='/') right=PointExpression)?) | left=PointExpression_PointExpression_1)
	 */
	protected void sequence_PointExpression(EObject context, PointExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((left=PowExpression_PowExpression_1 (op='^' right=PowExpression)?) | left=PowExpression_PowExpression_1)
	 */
	protected void sequence_PowExpression(EObject context, PowExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (procedure=[Procedure|ID] params=ExpressionList?)
	 */
	protected void sequence_ProcedureCall(EObject context, ProcedureCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((left=QualifierExpression_QualifierExpression_1 (op='.' right=QualifierExpression)?) | left=QualifierExpression_QualifierExpression_1)
	 */
	protected void sequence_QualifierExpression(EObject context, QualifierExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=Expression
	 */
	protected void sequence_SelfAssignmentStatement(EObject context, SelfAssignmentStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionPackage.Literals.ASSIGNMENT_STATEMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionPackage.Literals.ASSIGNMENT_STATEMENT__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSelfAssignmentStatementAccess().getExpressionExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (head=Statement tail=StatementList?)
	 */
	protected void sequence_StatementList(EObject context, StatementList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((keyValuePair=KeyValuePair structuredExpressions+=StructureExpression)?)
	 */
	protected void sequence_StructureExpression(EObject context, StructureExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=DOUBLE
	 */
	protected void sequence_Term(EObject context, DoubleValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Term(EObject context, IntegerValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_Term(EObject context, StringValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=DOUBLE structuredExpression=StructureExpression)
	 */
	protected void sequence_Term_UnaryExpression(EObject context, DoubleValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=INT structuredExpression=StructureExpression)
	 */
	protected void sequence_Term_UnaryExpression(EObject context, IntegerValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=STRING structuredExpression=StructureExpression)
	 */
	protected void sequence_Term_UnaryExpression(EObject context, StringValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (expr=UnaryExpression_UnaryExpression_1_3 structuredExpression=StructureExpression) | 
	 *         (expr=UnaryExpression_UnaryExpression_2_3 structuredExpression=StructureExpression)
	 *     )
	 */
	protected void sequence_UnaryExpression(EObject context, UnaryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (designator=Designator expression=Expression)
	 */
	protected void sequence_VariableAssignmentStatement(EObject context, VariableAssignmentStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionPackage.Literals.ASSIGNMENT_STATEMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionPackage.Literals.ASSIGNMENT_STATEMENT__EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, ExpressionPackage.Literals.VARIABLE_ASSIGNMENT_STATEMENT__DESIGNATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionPackage.Literals.VARIABLE_ASSIGNMENT_STATEMENT__DESIGNATOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableAssignmentStatementAccess().getDesignatorDesignatorParserRuleCall_0_0(), semanticObject.getDesignator());
		feeder.accept(grammarAccess.getVariableAssignmentStatementAccess().getExpressionExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
}
