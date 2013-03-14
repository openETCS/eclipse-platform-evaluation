/**
 */
package org.openetcs.dsl.expression.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openetcs.dsl.expression.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionFactoryImpl extends EFactoryImpl implements ExpressionFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ExpressionFactory init()
  {
    try
    {
      ExpressionFactory theExpressionFactory = (ExpressionFactory)EPackage.Registry.INSTANCE.getEFactory(ExpressionPackage.eNS_URI);
      if (theExpressionFactory != null)
      {
        return theExpressionFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ExpressionFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ExpressionPackage.MODEL: return createModel();
      case ExpressionPackage.PHRASE: return createPhrase();
      case ExpressionPackage.STATEMENT_LIST: return createStatementList();
      case ExpressionPackage.STATEMENT: return createStatement();
      case ExpressionPackage.ASSIGNMENT_STATEMENT: return createAssignmentStatement();
      case ExpressionPackage.VARIABLE_ASSIGNMENT_STATEMENT: return createVariableAssignmentStatement();
      case ExpressionPackage.SELF_ASSIGNMENT_STATEMENT: return createSelfAssignmentStatement();
      case ExpressionPackage.EXPRESSION: return createExpression();
      case ExpressionPackage.FUNCTION_CALL: return createFunctionCall();
      case ExpressionPackage.PROCEDURE_CALL: return createProcedureCall();
      case ExpressionPackage.EXPRESSION_LIST: return createExpressionList();
      case ExpressionPackage.EXPRESSION_REST: return createExpressionRest();
      case ExpressionPackage.KEY_VALUE_PAIR: return createKeyValuePair();
      case ExpressionPackage.KEY_VALUE_PAIR_REST: return createKeyValuePairRest();
      case ExpressionPackage.TERM: return createTerm();
      case ExpressionPackage.LIST: return createList();
      case ExpressionPackage.DESIGNATOR: return createDesignator();
      case ExpressionPackage.OR_EXPRESSION: return createOrExpression();
      case ExpressionPackage.AND_EXPRESSION: return createAndExpression();
      case ExpressionPackage.EQUALITY_EXPRESSION: return createEqualityExpression();
      case ExpressionPackage.DASH_EXPRESSION: return createDashExpression();
      case ExpressionPackage.POINT_EXPRESSION: return createPointExpression();
      case ExpressionPackage.POW_EXPRESSION: return createPowExpression();
      case ExpressionPackage.QUALIFIER_EXPRESSION: return createQualifierExpression();
      case ExpressionPackage.THERE_IS_IN: return createThereIsIn();
      case ExpressionPackage.FORALL_IN: return createForallIn();
      case ExpressionPackage.FIRST_IN: return createFirstIn();
      case ExpressionPackage.LAST_IN: return createLastIn();
      case ExpressionPackage.COUNT: return createCount();
      case ExpressionPackage.REDUCE: return createReduce();
      case ExpressionPackage.SUM: return createSum();
      case ExpressionPackage.MAP: return createMap();
      case ExpressionPackage.APPLY: return createApply();
      case ExpressionPackage.UNARY_EXPRESSION: return createUnaryExpression();
      case ExpressionPackage.STRUCTURE_EXPRESSION: return createStructureExpression();
      case ExpressionPackage.STRING_VALUE: return createStringValue();
      case ExpressionPackage.INTEGER_VALUE: return createIntegerValue();
      case ExpressionPackage.DOUBLE_VALUE: return createDoubleValue();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Phrase createPhrase()
  {
    PhraseImpl phrase = new PhraseImpl();
    return phrase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementList createStatementList()
  {
    StatementListImpl statementList = new StatementListImpl();
    return statementList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignmentStatement createAssignmentStatement()
  {
    AssignmentStatementImpl assignmentStatement = new AssignmentStatementImpl();
    return assignmentStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableAssignmentStatement createVariableAssignmentStatement()
  {
    VariableAssignmentStatementImpl variableAssignmentStatement = new VariableAssignmentStatementImpl();
    return variableAssignmentStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelfAssignmentStatement createSelfAssignmentStatement()
  {
    SelfAssignmentStatementImpl selfAssignmentStatement = new SelfAssignmentStatementImpl();
    return selfAssignmentStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionCall createFunctionCall()
  {
    FunctionCallImpl functionCall = new FunctionCallImpl();
    return functionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcedureCall createProcedureCall()
  {
    ProcedureCallImpl procedureCall = new ProcedureCallImpl();
    return procedureCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionList createExpressionList()
  {
    ExpressionListImpl expressionList = new ExpressionListImpl();
    return expressionList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionRest createExpressionRest()
  {
    ExpressionRestImpl expressionRest = new ExpressionRestImpl();
    return expressionRest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeyValuePair createKeyValuePair()
  {
    KeyValuePairImpl keyValuePair = new KeyValuePairImpl();
    return keyValuePair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeyValuePairRest createKeyValuePairRest()
  {
    KeyValuePairRestImpl keyValuePairRest = new KeyValuePairRestImpl();
    return keyValuePairRest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Term createTerm()
  {
    TermImpl term = new TermImpl();
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List createList()
  {
    ListImpl list = new ListImpl();
    return list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Designator createDesignator()
  {
    DesignatorImpl designator = new DesignatorImpl();
    return designator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrExpression createOrExpression()
  {
    OrExpressionImpl orExpression = new OrExpressionImpl();
    return orExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndExpression createAndExpression()
  {
    AndExpressionImpl andExpression = new AndExpressionImpl();
    return andExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EqualityExpression createEqualityExpression()
  {
    EqualityExpressionImpl equalityExpression = new EqualityExpressionImpl();
    return equalityExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DashExpression createDashExpression()
  {
    DashExpressionImpl dashExpression = new DashExpressionImpl();
    return dashExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PointExpression createPointExpression()
  {
    PointExpressionImpl pointExpression = new PointExpressionImpl();
    return pointExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PowExpression createPowExpression()
  {
    PowExpressionImpl powExpression = new PowExpressionImpl();
    return powExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifierExpression createQualifierExpression()
  {
    QualifierExpressionImpl qualifierExpression = new QualifierExpressionImpl();
    return qualifierExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThereIsIn createThereIsIn()
  {
    ThereIsInImpl thereIsIn = new ThereIsInImpl();
    return thereIsIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForallIn createForallIn()
  {
    ForallInImpl forallIn = new ForallInImpl();
    return forallIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FirstIn createFirstIn()
  {
    FirstInImpl firstIn = new FirstInImpl();
    return firstIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LastIn createLastIn()
  {
    LastInImpl lastIn = new LastInImpl();
    return lastIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Count createCount()
  {
    CountImpl count = new CountImpl();
    return count;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reduce createReduce()
  {
    ReduceImpl reduce = new ReduceImpl();
    return reduce;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sum createSum()
  {
    SumImpl sum = new SumImpl();
    return sum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Map createMap()
  {
    MapImpl map = new MapImpl();
    return map;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Apply createApply()
  {
    ApplyImpl apply = new ApplyImpl();
    return apply;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpression createUnaryExpression()
  {
    UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
    return unaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructureExpression createStructureExpression()
  {
    StructureExpressionImpl structureExpression = new StructureExpressionImpl();
    return structureExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringValue createStringValue()
  {
    StringValueImpl stringValue = new StringValueImpl();
    return stringValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerValue createIntegerValue()
  {
    IntegerValueImpl integerValue = new IntegerValueImpl();
    return integerValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleValue createDoubleValue()
  {
    DoubleValueImpl doubleValue = new DoubleValueImpl();
    return doubleValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionPackage getExpressionPackage()
  {
    return (ExpressionPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ExpressionPackage getPackage()
  {
    return ExpressionPackage.eINSTANCE;
  }

} //ExpressionFactoryImpl
