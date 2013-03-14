/**
 */
package org.openetcs.dsl.expression;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.openetcs.dsl.expression.ExpressionFactory
 * @model kind="package"
 * @generated
 */
public interface ExpressionPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "expression";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.openetcs.org/dsl/Expression";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "expression";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ExpressionPackage eINSTANCE = org.openetcs.dsl.expression.impl.ExpressionPackageImpl.init();

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.ModelImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Phrase</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PHRASE = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.PhraseImpl <em>Phrase</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.PhraseImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getPhrase()
   * @generated
   */
  int PHRASE = 1;

  /**
   * The number of structural features of the '<em>Phrase</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHRASE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.StatementListImpl <em>Statement List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.StatementListImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getStatementList()
   * @generated
   */
  int STATEMENT_LIST = 2;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_LIST__HEAD = PHRASE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_LIST__TAIL = PHRASE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Statement List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_LIST_FEATURE_COUNT = PHRASE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.StatementImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 3;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.AssignmentStatementImpl <em>Assignment Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.AssignmentStatementImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getAssignmentStatement()
   * @generated
   */
  int ASSIGNMENT_STATEMENT = 4;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Assignment Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.VariableAssignmentStatementImpl <em>Variable Assignment Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.VariableAssignmentStatementImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getVariableAssignmentStatement()
   * @generated
   */
  int VARIABLE_ASSIGNMENT_STATEMENT = 5;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGNMENT_STATEMENT__EXPRESSION = ASSIGNMENT_STATEMENT__EXPRESSION;

  /**
   * The feature id for the '<em><b>Designator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGNMENT_STATEMENT__DESIGNATOR = ASSIGNMENT_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Assignment Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGNMENT_STATEMENT_FEATURE_COUNT = ASSIGNMENT_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.SelfAssignmentStatementImpl <em>Self Assignment Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.SelfAssignmentStatementImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getSelfAssignmentStatement()
   * @generated
   */
  int SELF_ASSIGNMENT_STATEMENT = 6;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_ASSIGNMENT_STATEMENT__EXPRESSION = ASSIGNMENT_STATEMENT__EXPRESSION;

  /**
   * The number of structural features of the '<em>Self Assignment Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_ASSIGNMENT_STATEMENT_FEATURE_COUNT = ASSIGNMENT_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.ExpressionImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 7;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__CONDITION = PHRASE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = PHRASE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.FunctionCallImpl <em>Function Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.FunctionCallImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getFunctionCall()
   * @generated
   */
  int FUNCTION_CALL = 8;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__CONDITION = EXPRESSION__CONDITION;

  /**
   * The feature id for the '<em><b>Function</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__FUNCTION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__PARAMS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.ProcedureCallImpl <em>Procedure Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.ProcedureCallImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getProcedureCall()
   * @generated
   */
  int PROCEDURE_CALL = 9;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_CALL__PROCEDURE = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_CALL__PARAMS = 1;

  /**
   * The number of structural features of the '<em>Procedure Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_CALL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.ExpressionListImpl <em>List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.ExpressionListImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getExpressionList()
   * @generated
   */
  int EXPRESSION_LIST = 10;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LIST__HEAD = 0;

  /**
   * The feature id for the '<em><b>Tail</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LIST__TAIL = 1;

  /**
   * The number of structural features of the '<em>List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LIST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.ExpressionRestImpl <em>Rest</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.ExpressionRestImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getExpressionRest()
   * @generated
   */
  int EXPRESSION_REST = 11;

  /**
   * The number of structural features of the '<em>Rest</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_REST_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.KeyValuePairRestImpl <em>Key Value Pair Rest</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.KeyValuePairRestImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getKeyValuePairRest()
   * @generated
   */
  int KEY_VALUE_PAIR_REST = 13;

  /**
   * The number of structural features of the '<em>Key Value Pair Rest</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_VALUE_PAIR_REST_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.KeyValuePairImpl <em>Key Value Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.KeyValuePairImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getKeyValuePair()
   * @generated
   */
  int KEY_VALUE_PAIR = 12;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_VALUE_PAIR__KEY = KEY_VALUE_PAIR_REST_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_VALUE_PAIR__VALUE = KEY_VALUE_PAIR_REST_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Rest</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_VALUE_PAIR__REST = KEY_VALUE_PAIR_REST_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Key Value Pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_VALUE_PAIR_FEATURE_COUNT = KEY_VALUE_PAIR_REST_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.TermImpl <em>Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.TermImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getTerm()
   * @generated
   */
  int TERM = 14;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__CONDITION = EXPRESSION__CONDITION;

  /**
   * The feature id for the '<em><b>Structured Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__STRUCTURED_EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.ListImpl <em>List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.ListImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getList()
   * @generated
   */
  int LIST = 15;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST__CONDITION = TERM__CONDITION;

  /**
   * The feature id for the '<em><b>Structured Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST__STRUCTURED_EXPRESSION = TERM__STRUCTURED_EXPRESSION;

  /**
   * The feature id for the '<em><b>Terms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST__TERMS = TERM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.DesignatorImpl <em>Designator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.DesignatorImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getDesignator()
   * @generated
   */
  int DESIGNATOR = 16;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIGNATOR__CONDITION = TERM__CONDITION;

  /**
   * The feature id for the '<em><b>Structured Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIGNATOR__STRUCTURED_EXPRESSION = TERM__STRUCTURED_EXPRESSION;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIGNATOR__VALUE = TERM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Designator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIGNATOR_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.OrExpressionImpl <em>Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.OrExpressionImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getOrExpression()
   * @generated
   */
  int OR_EXPRESSION = 17;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__CONDITION = EXPRESSION__CONDITION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.AndExpressionImpl <em>And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.AndExpressionImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getAndExpression()
   * @generated
   */
  int AND_EXPRESSION = 18;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__CONDITION = EXPRESSION__CONDITION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.EqualityExpressionImpl <em>Equality Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.EqualityExpressionImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getEqualityExpression()
   * @generated
   */
  int EQUALITY_EXPRESSION = 19;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION__CONDITION = EXPRESSION__CONDITION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Equality Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.DashExpressionImpl <em>Dash Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.DashExpressionImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getDashExpression()
   * @generated
   */
  int DASH_EXPRESSION = 20;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DASH_EXPRESSION__CONDITION = EXPRESSION__CONDITION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DASH_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DASH_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DASH_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Dash Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DASH_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.PointExpressionImpl <em>Point Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.PointExpressionImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getPointExpression()
   * @generated
   */
  int POINT_EXPRESSION = 21;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_EXPRESSION__CONDITION = EXPRESSION__CONDITION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Point Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.PowExpressionImpl <em>Pow Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.PowExpressionImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getPowExpression()
   * @generated
   */
  int POW_EXPRESSION = 22;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW_EXPRESSION__CONDITION = EXPRESSION__CONDITION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Pow Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.QualifierExpressionImpl <em>Qualifier Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.QualifierExpressionImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getQualifierExpression()
   * @generated
   */
  int QUALIFIER_EXPRESSION = 23;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIER_EXPRESSION__CONDITION = EXPRESSION__CONDITION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIER_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIER_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIER_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Qualifier Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIER_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.ThereIsInImpl <em>There Is In</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.ThereIsInImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getThereIsIn()
   * @generated
   */
  int THERE_IS_IN = 24;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THERE_IS_IN__CONDITION = EXPRESSION__CONDITION;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THERE_IS_IN__EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>There Is In</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THERE_IS_IN_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.ForallInImpl <em>Forall In</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.ForallInImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getForallIn()
   * @generated
   */
  int FORALL_IN = 25;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORALL_IN__CONDITION = EXPRESSION__CONDITION;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORALL_IN__EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Forall In</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORALL_IN_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.FirstInImpl <em>First In</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.FirstInImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getFirstIn()
   * @generated
   */
  int FIRST_IN = 26;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIRST_IN__CONDITION = EXPRESSION__CONDITION;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIRST_IN__EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>First In</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIRST_IN_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.LastInImpl <em>Last In</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.LastInImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getLastIn()
   * @generated
   */
  int LAST_IN = 27;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAST_IN__CONDITION = EXPRESSION__CONDITION;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAST_IN__EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Last In</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAST_IN_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.CountImpl <em>Count</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.CountImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getCount()
   * @generated
   */
  int COUNT = 28;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNT__CONDITION = EXPRESSION__CONDITION;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNT__EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Count</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.ReduceImpl <em>Reduce</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.ReduceImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getReduce()
   * @generated
   */
  int REDUCE = 29;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REDUCE__CONDITION = EXPRESSION__CONDITION;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REDUCE__EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Using Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REDUCE__USING_EXPR = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Init Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REDUCE__INIT_VALUE = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Reduce</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REDUCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.SumImpl <em>Sum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.SumImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getSum()
   * @generated
   */
  int SUM = 30;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM__CONDITION = EXPRESSION__CONDITION;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM__EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Using Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM__USING_EXPR = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.MapImpl <em>Map</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.MapImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getMap()
   * @generated
   */
  int MAP = 31;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP__CONDITION = EXPRESSION__CONDITION;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP__EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Using Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP__USING_EXPR = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.ApplyImpl <em>Apply</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.ApplyImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getApply()
   * @generated
   */
  int APPLY = 32;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY__CONDITION = EXPRESSION__CONDITION;

  /**
   * The feature id for the '<em><b>Apply Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY__APPLY_EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY__EXPR = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Apply</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.UnaryExpressionImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getUnaryExpression()
   * @generated
   */
  int UNARY_EXPRESSION = 33;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__CONDITION = EXPRESSION__CONDITION;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Structured Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__STRUCTURED_EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.StructureExpressionImpl <em>Structure Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.StructureExpressionImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getStructureExpression()
   * @generated
   */
  int STRUCTURE_EXPRESSION = 34;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_EXPRESSION__CONDITION = EXPRESSION__CONDITION;

  /**
   * The feature id for the '<em><b>Key Value Pair</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_EXPRESSION__KEY_VALUE_PAIR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Structured Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_EXPRESSION__STRUCTURED_EXPRESSIONS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Structure Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.StringValueImpl <em>String Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.StringValueImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getStringValue()
   * @generated
   */
  int STRING_VALUE = 35;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__CONDITION = TERM__CONDITION;

  /**
   * The feature id for the '<em><b>Structured Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__STRUCTURED_EXPRESSION = TERM__STRUCTURED_EXPRESSION;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__VALUE = TERM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.IntegerValueImpl <em>Integer Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.IntegerValueImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getIntegerValue()
   * @generated
   */
  int INTEGER_VALUE = 36;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_VALUE__CONDITION = TERM__CONDITION;

  /**
   * The feature id for the '<em><b>Structured Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_VALUE__STRUCTURED_EXPRESSION = TERM__STRUCTURED_EXPRESSION;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_VALUE__VALUE = TERM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_VALUE_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.DoubleValueImpl <em>Double Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.DoubleValueImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getDoubleValue()
   * @generated
   */
  int DOUBLE_VALUE = 37;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_VALUE__CONDITION = TERM__CONDITION;

  /**
   * The feature id for the '<em><b>Structured Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_VALUE__STRUCTURED_EXPRESSION = TERM__STRUCTURED_EXPRESSION;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_VALUE__VALUE = TERM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Double Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_VALUE_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.openetcs.dsl.expression.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.Model#getPhrase <em>Phrase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Phrase</em>'.
   * @see org.openetcs.dsl.expression.Model#getPhrase()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Phrase();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.Phrase <em>Phrase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Phrase</em>'.
   * @see org.openetcs.dsl.expression.Phrase
   * @generated
   */
  EClass getPhrase();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.StatementList <em>Statement List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement List</em>'.
   * @see org.openetcs.dsl.expression.StatementList
   * @generated
   */
  EClass getStatementList();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.StatementList#getHead <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Head</em>'.
   * @see org.openetcs.dsl.expression.StatementList#getHead()
   * @see #getStatementList()
   * @generated
   */
  EReference getStatementList_Head();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.StatementList#getTail <em>Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tail</em>'.
   * @see org.openetcs.dsl.expression.StatementList#getTail()
   * @see #getStatementList()
   * @generated
   */
  EReference getStatementList_Tail();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.openetcs.dsl.expression.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.AssignmentStatement <em>Assignment Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Statement</em>'.
   * @see org.openetcs.dsl.expression.AssignmentStatement
   * @generated
   */
  EClass getAssignmentStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.AssignmentStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.openetcs.dsl.expression.AssignmentStatement#getExpression()
   * @see #getAssignmentStatement()
   * @generated
   */
  EReference getAssignmentStatement_Expression();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.VariableAssignmentStatement <em>Variable Assignment Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Assignment Statement</em>'.
   * @see org.openetcs.dsl.expression.VariableAssignmentStatement
   * @generated
   */
  EClass getVariableAssignmentStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.VariableAssignmentStatement#getDesignator <em>Designator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Designator</em>'.
   * @see org.openetcs.dsl.expression.VariableAssignmentStatement#getDesignator()
   * @see #getVariableAssignmentStatement()
   * @generated
   */
  EReference getVariableAssignmentStatement_Designator();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.SelfAssignmentStatement <em>Self Assignment Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Self Assignment Statement</em>'.
   * @see org.openetcs.dsl.expression.SelfAssignmentStatement
   * @generated
   */
  EClass getSelfAssignmentStatement();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.openetcs.dsl.expression.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.Expression#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.openetcs.dsl.expression.Expression#getCondition()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Condition();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.FunctionCall <em>Function Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Call</em>'.
   * @see org.openetcs.dsl.expression.FunctionCall
   * @generated
   */
  EClass getFunctionCall();

  /**
   * Returns the meta object for the reference '{@link org.openetcs.dsl.expression.FunctionCall#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Function</em>'.
   * @see org.openetcs.dsl.expression.FunctionCall#getFunction()
   * @see #getFunctionCall()
   * @generated
   */
  EReference getFunctionCall_Function();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.FunctionCall#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Params</em>'.
   * @see org.openetcs.dsl.expression.FunctionCall#getParams()
   * @see #getFunctionCall()
   * @generated
   */
  EReference getFunctionCall_Params();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.ProcedureCall <em>Procedure Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure Call</em>'.
   * @see org.openetcs.dsl.expression.ProcedureCall
   * @generated
   */
  EClass getProcedureCall();

  /**
   * Returns the meta object for the reference '{@link org.openetcs.dsl.expression.ProcedureCall#getProcedure <em>Procedure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Procedure</em>'.
   * @see org.openetcs.dsl.expression.ProcedureCall#getProcedure()
   * @see #getProcedureCall()
   * @generated
   */
  EReference getProcedureCall_Procedure();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.ProcedureCall#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Params</em>'.
   * @see org.openetcs.dsl.expression.ProcedureCall#getParams()
   * @see #getProcedureCall()
   * @generated
   */
  EReference getProcedureCall_Params();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.ExpressionList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List</em>'.
   * @see org.openetcs.dsl.expression.ExpressionList
   * @generated
   */
  EClass getExpressionList();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.ExpressionList#getHead <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Head</em>'.
   * @see org.openetcs.dsl.expression.ExpressionList#getHead()
   * @see #getExpressionList()
   * @generated
   */
  EReference getExpressionList_Head();

  /**
   * Returns the meta object for the containment reference list '{@link org.openetcs.dsl.expression.ExpressionList#getTail <em>Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tail</em>'.
   * @see org.openetcs.dsl.expression.ExpressionList#getTail()
   * @see #getExpressionList()
   * @generated
   */
  EReference getExpressionList_Tail();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.ExpressionRest <em>Rest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rest</em>'.
   * @see org.openetcs.dsl.expression.ExpressionRest
   * @generated
   */
  EClass getExpressionRest();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.KeyValuePair <em>Key Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Key Value Pair</em>'.
   * @see org.openetcs.dsl.expression.KeyValuePair
   * @generated
   */
  EClass getKeyValuePair();

  /**
   * Returns the meta object for the attribute '{@link org.openetcs.dsl.expression.KeyValuePair#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.openetcs.dsl.expression.KeyValuePair#getKey()
   * @see #getKeyValuePair()
   * @generated
   */
  EAttribute getKeyValuePair_Key();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.KeyValuePair#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.openetcs.dsl.expression.KeyValuePair#getValue()
   * @see #getKeyValuePair()
   * @generated
   */
  EReference getKeyValuePair_Value();

  /**
   * Returns the meta object for the containment reference list '{@link org.openetcs.dsl.expression.KeyValuePair#getRest <em>Rest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rest</em>'.
   * @see org.openetcs.dsl.expression.KeyValuePair#getRest()
   * @see #getKeyValuePair()
   * @generated
   */
  EReference getKeyValuePair_Rest();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.KeyValuePairRest <em>Key Value Pair Rest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Key Value Pair Rest</em>'.
   * @see org.openetcs.dsl.expression.KeyValuePairRest
   * @generated
   */
  EClass getKeyValuePairRest();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term</em>'.
   * @see org.openetcs.dsl.expression.Term
   * @generated
   */
  EClass getTerm();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.Term#getStructuredExpression <em>Structured Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Structured Expression</em>'.
   * @see org.openetcs.dsl.expression.Term#getStructuredExpression()
   * @see #getTerm()
   * @generated
   */
  EReference getTerm_StructuredExpression();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.List <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List</em>'.
   * @see org.openetcs.dsl.expression.List
   * @generated
   */
  EClass getList();

  /**
   * Returns the meta object for the containment reference list '{@link org.openetcs.dsl.expression.List#getTerms <em>Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Terms</em>'.
   * @see org.openetcs.dsl.expression.List#getTerms()
   * @see #getList()
   * @generated
   */
  EReference getList_Terms();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.Designator <em>Designator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Designator</em>'.
   * @see org.openetcs.dsl.expression.Designator
   * @generated
   */
  EClass getDesignator();

  /**
   * Returns the meta object for the reference '{@link org.openetcs.dsl.expression.Designator#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see org.openetcs.dsl.expression.Designator#getValue()
   * @see #getDesignator()
   * @generated
   */
  EReference getDesignator_Value();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.OrExpression <em>Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Expression</em>'.
   * @see org.openetcs.dsl.expression.OrExpression
   * @generated
   */
  EClass getOrExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.OrExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.openetcs.dsl.expression.OrExpression#getLeft()
   * @see #getOrExpression()
   * @generated
   */
  EReference getOrExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link org.openetcs.dsl.expression.OrExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.openetcs.dsl.expression.OrExpression#getOp()
   * @see #getOrExpression()
   * @generated
   */
  EAttribute getOrExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.OrExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.openetcs.dsl.expression.OrExpression#getRight()
   * @see #getOrExpression()
   * @generated
   */
  EReference getOrExpression_Right();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Expression</em>'.
   * @see org.openetcs.dsl.expression.AndExpression
   * @generated
   */
  EClass getAndExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.AndExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.openetcs.dsl.expression.AndExpression#getLeft()
   * @see #getAndExpression()
   * @generated
   */
  EReference getAndExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link org.openetcs.dsl.expression.AndExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.openetcs.dsl.expression.AndExpression#getOp()
   * @see #getAndExpression()
   * @generated
   */
  EAttribute getAndExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.AndExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.openetcs.dsl.expression.AndExpression#getRight()
   * @see #getAndExpression()
   * @generated
   */
  EReference getAndExpression_Right();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.EqualityExpression <em>Equality Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equality Expression</em>'.
   * @see org.openetcs.dsl.expression.EqualityExpression
   * @generated
   */
  EClass getEqualityExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.EqualityExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.openetcs.dsl.expression.EqualityExpression#getLeft()
   * @see #getEqualityExpression()
   * @generated
   */
  EReference getEqualityExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link org.openetcs.dsl.expression.EqualityExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.openetcs.dsl.expression.EqualityExpression#getOp()
   * @see #getEqualityExpression()
   * @generated
   */
  EAttribute getEqualityExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.EqualityExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.openetcs.dsl.expression.EqualityExpression#getRight()
   * @see #getEqualityExpression()
   * @generated
   */
  EReference getEqualityExpression_Right();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.DashExpression <em>Dash Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dash Expression</em>'.
   * @see org.openetcs.dsl.expression.DashExpression
   * @generated
   */
  EClass getDashExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.DashExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.openetcs.dsl.expression.DashExpression#getLeft()
   * @see #getDashExpression()
   * @generated
   */
  EReference getDashExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link org.openetcs.dsl.expression.DashExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.openetcs.dsl.expression.DashExpression#getOp()
   * @see #getDashExpression()
   * @generated
   */
  EAttribute getDashExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.DashExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.openetcs.dsl.expression.DashExpression#getRight()
   * @see #getDashExpression()
   * @generated
   */
  EReference getDashExpression_Right();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.PointExpression <em>Point Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Point Expression</em>'.
   * @see org.openetcs.dsl.expression.PointExpression
   * @generated
   */
  EClass getPointExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.PointExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.openetcs.dsl.expression.PointExpression#getLeft()
   * @see #getPointExpression()
   * @generated
   */
  EReference getPointExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link org.openetcs.dsl.expression.PointExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.openetcs.dsl.expression.PointExpression#getOp()
   * @see #getPointExpression()
   * @generated
   */
  EAttribute getPointExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.PointExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.openetcs.dsl.expression.PointExpression#getRight()
   * @see #getPointExpression()
   * @generated
   */
  EReference getPointExpression_Right();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.PowExpression <em>Pow Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pow Expression</em>'.
   * @see org.openetcs.dsl.expression.PowExpression
   * @generated
   */
  EClass getPowExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.PowExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.openetcs.dsl.expression.PowExpression#getLeft()
   * @see #getPowExpression()
   * @generated
   */
  EReference getPowExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link org.openetcs.dsl.expression.PowExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.openetcs.dsl.expression.PowExpression#getOp()
   * @see #getPowExpression()
   * @generated
   */
  EAttribute getPowExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.PowExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.openetcs.dsl.expression.PowExpression#getRight()
   * @see #getPowExpression()
   * @generated
   */
  EReference getPowExpression_Right();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.QualifierExpression <em>Qualifier Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualifier Expression</em>'.
   * @see org.openetcs.dsl.expression.QualifierExpression
   * @generated
   */
  EClass getQualifierExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.QualifierExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.openetcs.dsl.expression.QualifierExpression#getLeft()
   * @see #getQualifierExpression()
   * @generated
   */
  EReference getQualifierExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link org.openetcs.dsl.expression.QualifierExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.openetcs.dsl.expression.QualifierExpression#getOp()
   * @see #getQualifierExpression()
   * @generated
   */
  EAttribute getQualifierExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.QualifierExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.openetcs.dsl.expression.QualifierExpression#getRight()
   * @see #getQualifierExpression()
   * @generated
   */
  EReference getQualifierExpression_Right();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.ThereIsIn <em>There Is In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>There Is In</em>'.
   * @see org.openetcs.dsl.expression.ThereIsIn
   * @generated
   */
  EClass getThereIsIn();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.ThereIsIn#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.openetcs.dsl.expression.ThereIsIn#getExpr()
   * @see #getThereIsIn()
   * @generated
   */
  EReference getThereIsIn_Expr();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.ForallIn <em>Forall In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Forall In</em>'.
   * @see org.openetcs.dsl.expression.ForallIn
   * @generated
   */
  EClass getForallIn();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.ForallIn#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.openetcs.dsl.expression.ForallIn#getExpr()
   * @see #getForallIn()
   * @generated
   */
  EReference getForallIn_Expr();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.FirstIn <em>First In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>First In</em>'.
   * @see org.openetcs.dsl.expression.FirstIn
   * @generated
   */
  EClass getFirstIn();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.FirstIn#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.openetcs.dsl.expression.FirstIn#getExpr()
   * @see #getFirstIn()
   * @generated
   */
  EReference getFirstIn_Expr();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.LastIn <em>Last In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Last In</em>'.
   * @see org.openetcs.dsl.expression.LastIn
   * @generated
   */
  EClass getLastIn();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.LastIn#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.openetcs.dsl.expression.LastIn#getExpr()
   * @see #getLastIn()
   * @generated
   */
  EReference getLastIn_Expr();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.Count <em>Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Count</em>'.
   * @see org.openetcs.dsl.expression.Count
   * @generated
   */
  EClass getCount();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.Count#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.openetcs.dsl.expression.Count#getExpr()
   * @see #getCount()
   * @generated
   */
  EReference getCount_Expr();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.Reduce <em>Reduce</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reduce</em>'.
   * @see org.openetcs.dsl.expression.Reduce
   * @generated
   */
  EClass getReduce();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.Reduce#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.openetcs.dsl.expression.Reduce#getExpr()
   * @see #getReduce()
   * @generated
   */
  EReference getReduce_Expr();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.Reduce#getUsingExpr <em>Using Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Using Expr</em>'.
   * @see org.openetcs.dsl.expression.Reduce#getUsingExpr()
   * @see #getReduce()
   * @generated
   */
  EReference getReduce_UsingExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.Reduce#getInitValue <em>Init Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init Value</em>'.
   * @see org.openetcs.dsl.expression.Reduce#getInitValue()
   * @see #getReduce()
   * @generated
   */
  EReference getReduce_InitValue();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.Sum <em>Sum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sum</em>'.
   * @see org.openetcs.dsl.expression.Sum
   * @generated
   */
  EClass getSum();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.Sum#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.openetcs.dsl.expression.Sum#getExpr()
   * @see #getSum()
   * @generated
   */
  EReference getSum_Expr();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.Sum#getUsingExpr <em>Using Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Using Expr</em>'.
   * @see org.openetcs.dsl.expression.Sum#getUsingExpr()
   * @see #getSum()
   * @generated
   */
  EReference getSum_UsingExpr();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.Map <em>Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Map</em>'.
   * @see org.openetcs.dsl.expression.Map
   * @generated
   */
  EClass getMap();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.Map#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.openetcs.dsl.expression.Map#getExpr()
   * @see #getMap()
   * @generated
   */
  EReference getMap_Expr();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.Map#getUsingExpr <em>Using Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Using Expr</em>'.
   * @see org.openetcs.dsl.expression.Map#getUsingExpr()
   * @see #getMap()
   * @generated
   */
  EReference getMap_UsingExpr();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.Apply <em>Apply</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Apply</em>'.
   * @see org.openetcs.dsl.expression.Apply
   * @generated
   */
  EClass getApply();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.Apply#getApplyExpr <em>Apply Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Apply Expr</em>'.
   * @see org.openetcs.dsl.expression.Apply#getApplyExpr()
   * @see #getApply()
   * @generated
   */
  EReference getApply_ApplyExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.Apply#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.openetcs.dsl.expression.Apply#getExpr()
   * @see #getApply()
   * @generated
   */
  EReference getApply_Expr();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Expression</em>'.
   * @see org.openetcs.dsl.expression.UnaryExpression
   * @generated
   */
  EClass getUnaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.UnaryExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.openetcs.dsl.expression.UnaryExpression#getExpr()
   * @see #getUnaryExpression()
   * @generated
   */
  EReference getUnaryExpression_Expr();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.UnaryExpression#getStructuredExpression <em>Structured Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Structured Expression</em>'.
   * @see org.openetcs.dsl.expression.UnaryExpression#getStructuredExpression()
   * @see #getUnaryExpression()
   * @generated
   */
  EReference getUnaryExpression_StructuredExpression();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.StructureExpression <em>Structure Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structure Expression</em>'.
   * @see org.openetcs.dsl.expression.StructureExpression
   * @generated
   */
  EClass getStructureExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.StructureExpression#getKeyValuePair <em>Key Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Key Value Pair</em>'.
   * @see org.openetcs.dsl.expression.StructureExpression#getKeyValuePair()
   * @see #getStructureExpression()
   * @generated
   */
  EReference getStructureExpression_KeyValuePair();

  /**
   * Returns the meta object for the containment reference list '{@link org.openetcs.dsl.expression.StructureExpression#getStructuredExpressions <em>Structured Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Structured Expressions</em>'.
   * @see org.openetcs.dsl.expression.StructureExpression#getStructuredExpressions()
   * @see #getStructureExpression()
   * @generated
   */
  EReference getStructureExpression_StructuredExpressions();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Value</em>'.
   * @see org.openetcs.dsl.expression.StringValue
   * @generated
   */
  EClass getStringValue();

  /**
   * Returns the meta object for the attribute '{@link org.openetcs.dsl.expression.StringValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.openetcs.dsl.expression.StringValue#getValue()
   * @see #getStringValue()
   * @generated
   */
  EAttribute getStringValue_Value();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.IntegerValue <em>Integer Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Value</em>'.
   * @see org.openetcs.dsl.expression.IntegerValue
   * @generated
   */
  EClass getIntegerValue();

  /**
   * Returns the meta object for the attribute '{@link org.openetcs.dsl.expression.IntegerValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.openetcs.dsl.expression.IntegerValue#getValue()
   * @see #getIntegerValue()
   * @generated
   */
  EAttribute getIntegerValue_Value();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.DoubleValue <em>Double Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double Value</em>'.
   * @see org.openetcs.dsl.expression.DoubleValue
   * @generated
   */
  EClass getDoubleValue();

  /**
   * Returns the meta object for the attribute '{@link org.openetcs.dsl.expression.DoubleValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.openetcs.dsl.expression.DoubleValue#getValue()
   * @see #getDoubleValue()
   * @generated
   */
  EAttribute getDoubleValue_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ExpressionFactory getExpressionFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.ModelImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Phrase</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PHRASE = eINSTANCE.getModel_Phrase();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.PhraseImpl <em>Phrase</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.PhraseImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getPhrase()
     * @generated
     */
    EClass PHRASE = eINSTANCE.getPhrase();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.StatementListImpl <em>Statement List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.StatementListImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getStatementList()
     * @generated
     */
    EClass STATEMENT_LIST = eINSTANCE.getStatementList();

    /**
     * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_LIST__HEAD = eINSTANCE.getStatementList_Head();

    /**
     * The meta object literal for the '<em><b>Tail</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_LIST__TAIL = eINSTANCE.getStatementList_Tail();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.StatementImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.AssignmentStatementImpl <em>Assignment Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.AssignmentStatementImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getAssignmentStatement()
     * @generated
     */
    EClass ASSIGNMENT_STATEMENT = eINSTANCE.getAssignmentStatement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT_STATEMENT__EXPRESSION = eINSTANCE.getAssignmentStatement_Expression();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.VariableAssignmentStatementImpl <em>Variable Assignment Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.VariableAssignmentStatementImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getVariableAssignmentStatement()
     * @generated
     */
    EClass VARIABLE_ASSIGNMENT_STATEMENT = eINSTANCE.getVariableAssignmentStatement();

    /**
     * The meta object literal for the '<em><b>Designator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_ASSIGNMENT_STATEMENT__DESIGNATOR = eINSTANCE.getVariableAssignmentStatement_Designator();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.SelfAssignmentStatementImpl <em>Self Assignment Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.SelfAssignmentStatementImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getSelfAssignmentStatement()
     * @generated
     */
    EClass SELF_ASSIGNMENT_STATEMENT = eINSTANCE.getSelfAssignmentStatement();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.ExpressionImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__CONDITION = eINSTANCE.getExpression_Condition();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.FunctionCallImpl <em>Function Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.FunctionCallImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getFunctionCall()
     * @generated
     */
    EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL__FUNCTION = eINSTANCE.getFunctionCall_Function();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL__PARAMS = eINSTANCE.getFunctionCall_Params();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.ProcedureCallImpl <em>Procedure Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.ProcedureCallImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getProcedureCall()
     * @generated
     */
    EClass PROCEDURE_CALL = eINSTANCE.getProcedureCall();

    /**
     * The meta object literal for the '<em><b>Procedure</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_CALL__PROCEDURE = eINSTANCE.getProcedureCall_Procedure();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_CALL__PARAMS = eINSTANCE.getProcedureCall_Params();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.ExpressionListImpl <em>List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.ExpressionListImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getExpressionList()
     * @generated
     */
    EClass EXPRESSION_LIST = eINSTANCE.getExpressionList();

    /**
     * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_LIST__HEAD = eINSTANCE.getExpressionList_Head();

    /**
     * The meta object literal for the '<em><b>Tail</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_LIST__TAIL = eINSTANCE.getExpressionList_Tail();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.ExpressionRestImpl <em>Rest</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.ExpressionRestImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getExpressionRest()
     * @generated
     */
    EClass EXPRESSION_REST = eINSTANCE.getExpressionRest();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.KeyValuePairImpl <em>Key Value Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.KeyValuePairImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getKeyValuePair()
     * @generated
     */
    EClass KEY_VALUE_PAIR = eINSTANCE.getKeyValuePair();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEY_VALUE_PAIR__KEY = eINSTANCE.getKeyValuePair_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEY_VALUE_PAIR__VALUE = eINSTANCE.getKeyValuePair_Value();

    /**
     * The meta object literal for the '<em><b>Rest</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEY_VALUE_PAIR__REST = eINSTANCE.getKeyValuePair_Rest();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.KeyValuePairRestImpl <em>Key Value Pair Rest</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.KeyValuePairRestImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getKeyValuePairRest()
     * @generated
     */
    EClass KEY_VALUE_PAIR_REST = eINSTANCE.getKeyValuePairRest();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.TermImpl <em>Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.TermImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getTerm()
     * @generated
     */
    EClass TERM = eINSTANCE.getTerm();

    /**
     * The meta object literal for the '<em><b>Structured Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM__STRUCTURED_EXPRESSION = eINSTANCE.getTerm_StructuredExpression();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.ListImpl <em>List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.ListImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getList()
     * @generated
     */
    EClass LIST = eINSTANCE.getList();

    /**
     * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST__TERMS = eINSTANCE.getList_Terms();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.DesignatorImpl <em>Designator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.DesignatorImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getDesignator()
     * @generated
     */
    EClass DESIGNATOR = eINSTANCE.getDesignator();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESIGNATOR__VALUE = eINSTANCE.getDesignator_Value();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.OrExpressionImpl <em>Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.OrExpressionImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getOrExpression()
     * @generated
     */
    EClass OR_EXPRESSION = eINSTANCE.getOrExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPRESSION__LEFT = eINSTANCE.getOrExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OR_EXPRESSION__OP = eINSTANCE.getOrExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPRESSION__RIGHT = eINSTANCE.getOrExpression_Right();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.AndExpressionImpl <em>And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.AndExpressionImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getAndExpression()
     * @generated
     */
    EClass AND_EXPRESSION = eINSTANCE.getAndExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPRESSION__LEFT = eINSTANCE.getAndExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AND_EXPRESSION__OP = eINSTANCE.getAndExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPRESSION__RIGHT = eINSTANCE.getAndExpression_Right();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.EqualityExpressionImpl <em>Equality Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.EqualityExpressionImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getEqualityExpression()
     * @generated
     */
    EClass EQUALITY_EXPRESSION = eINSTANCE.getEqualityExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALITY_EXPRESSION__LEFT = eINSTANCE.getEqualityExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUALITY_EXPRESSION__OP = eINSTANCE.getEqualityExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALITY_EXPRESSION__RIGHT = eINSTANCE.getEqualityExpression_Right();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.DashExpressionImpl <em>Dash Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.DashExpressionImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getDashExpression()
     * @generated
     */
    EClass DASH_EXPRESSION = eINSTANCE.getDashExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DASH_EXPRESSION__LEFT = eINSTANCE.getDashExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DASH_EXPRESSION__OP = eINSTANCE.getDashExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DASH_EXPRESSION__RIGHT = eINSTANCE.getDashExpression_Right();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.PointExpressionImpl <em>Point Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.PointExpressionImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getPointExpression()
     * @generated
     */
    EClass POINT_EXPRESSION = eINSTANCE.getPointExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINT_EXPRESSION__LEFT = eINSTANCE.getPointExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT_EXPRESSION__OP = eINSTANCE.getPointExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINT_EXPRESSION__RIGHT = eINSTANCE.getPointExpression_Right();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.PowExpressionImpl <em>Pow Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.PowExpressionImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getPowExpression()
     * @generated
     */
    EClass POW_EXPRESSION = eINSTANCE.getPowExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POW_EXPRESSION__LEFT = eINSTANCE.getPowExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POW_EXPRESSION__OP = eINSTANCE.getPowExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POW_EXPRESSION__RIGHT = eINSTANCE.getPowExpression_Right();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.QualifierExpressionImpl <em>Qualifier Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.QualifierExpressionImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getQualifierExpression()
     * @generated
     */
    EClass QUALIFIER_EXPRESSION = eINSTANCE.getQualifierExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALIFIER_EXPRESSION__LEFT = eINSTANCE.getQualifierExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUALIFIER_EXPRESSION__OP = eINSTANCE.getQualifierExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALIFIER_EXPRESSION__RIGHT = eINSTANCE.getQualifierExpression_Right();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.ThereIsInImpl <em>There Is In</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.ThereIsInImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getThereIsIn()
     * @generated
     */
    EClass THERE_IS_IN = eINSTANCE.getThereIsIn();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THERE_IS_IN__EXPR = eINSTANCE.getThereIsIn_Expr();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.ForallInImpl <em>Forall In</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.ForallInImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getForallIn()
     * @generated
     */
    EClass FORALL_IN = eINSTANCE.getForallIn();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORALL_IN__EXPR = eINSTANCE.getForallIn_Expr();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.FirstInImpl <em>First In</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.FirstInImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getFirstIn()
     * @generated
     */
    EClass FIRST_IN = eINSTANCE.getFirstIn();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIRST_IN__EXPR = eINSTANCE.getFirstIn_Expr();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.LastInImpl <em>Last In</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.LastInImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getLastIn()
     * @generated
     */
    EClass LAST_IN = eINSTANCE.getLastIn();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAST_IN__EXPR = eINSTANCE.getLastIn_Expr();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.CountImpl <em>Count</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.CountImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getCount()
     * @generated
     */
    EClass COUNT = eINSTANCE.getCount();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COUNT__EXPR = eINSTANCE.getCount_Expr();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.ReduceImpl <em>Reduce</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.ReduceImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getReduce()
     * @generated
     */
    EClass REDUCE = eINSTANCE.getReduce();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REDUCE__EXPR = eINSTANCE.getReduce_Expr();

    /**
     * The meta object literal for the '<em><b>Using Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REDUCE__USING_EXPR = eINSTANCE.getReduce_UsingExpr();

    /**
     * The meta object literal for the '<em><b>Init Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REDUCE__INIT_VALUE = eINSTANCE.getReduce_InitValue();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.SumImpl <em>Sum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.SumImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getSum()
     * @generated
     */
    EClass SUM = eINSTANCE.getSum();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUM__EXPR = eINSTANCE.getSum_Expr();

    /**
     * The meta object literal for the '<em><b>Using Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUM__USING_EXPR = eINSTANCE.getSum_UsingExpr();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.MapImpl <em>Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.MapImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getMap()
     * @generated
     */
    EClass MAP = eINSTANCE.getMap();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP__EXPR = eINSTANCE.getMap_Expr();

    /**
     * The meta object literal for the '<em><b>Using Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP__USING_EXPR = eINSTANCE.getMap_UsingExpr();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.ApplyImpl <em>Apply</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.ApplyImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getApply()
     * @generated
     */
    EClass APPLY = eINSTANCE.getApply();

    /**
     * The meta object literal for the '<em><b>Apply Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLY__APPLY_EXPR = eINSTANCE.getApply_ApplyExpr();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLY__EXPR = eINSTANCE.getApply_Expr();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.UnaryExpressionImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getUnaryExpression()
     * @generated
     */
    EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPRESSION__EXPR = eINSTANCE.getUnaryExpression_Expr();

    /**
     * The meta object literal for the '<em><b>Structured Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPRESSION__STRUCTURED_EXPRESSION = eINSTANCE.getUnaryExpression_StructuredExpression();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.StructureExpressionImpl <em>Structure Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.StructureExpressionImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getStructureExpression()
     * @generated
     */
    EClass STRUCTURE_EXPRESSION = eINSTANCE.getStructureExpression();

    /**
     * The meta object literal for the '<em><b>Key Value Pair</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCTURE_EXPRESSION__KEY_VALUE_PAIR = eINSTANCE.getStructureExpression_KeyValuePair();

    /**
     * The meta object literal for the '<em><b>Structured Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCTURE_EXPRESSION__STRUCTURED_EXPRESSIONS = eINSTANCE.getStructureExpression_StructuredExpressions();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.StringValueImpl <em>String Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.StringValueImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getStringValue()
     * @generated
     */
    EClass STRING_VALUE = eINSTANCE.getStringValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.IntegerValueImpl <em>Integer Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.IntegerValueImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getIntegerValue()
     * @generated
     */
    EClass INTEGER_VALUE = eINSTANCE.getIntegerValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_VALUE__VALUE = eINSTANCE.getIntegerValue_Value();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.DoubleValueImpl <em>Double Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.DoubleValueImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getDoubleValue()
     * @generated
     */
    EClass DOUBLE_VALUE = eINSTANCE.getDoubleValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOUBLE_VALUE__VALUE = eINSTANCE.getDoubleValue_Value();

  }

} //ExpressionPackage
