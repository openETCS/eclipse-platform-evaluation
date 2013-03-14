/**
 */
package org.openetcs.dsl.expression.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.openetcs.dsl.expression.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openetcs.dsl.expression.ExpressionPackage
 * @generated
 */
public class ExpressionAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ExpressionPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ExpressionPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionSwitch<Adapter> modelSwitch =
    new ExpressionSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter casePhrase(Phrase object)
      {
        return createPhraseAdapter();
      }
      @Override
      public Adapter caseStatementList(StatementList object)
      {
        return createStatementListAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseAssignmentStatement(AssignmentStatement object)
      {
        return createAssignmentStatementAdapter();
      }
      @Override
      public Adapter caseVariableAssignmentStatement(VariableAssignmentStatement object)
      {
        return createVariableAssignmentStatementAdapter();
      }
      @Override
      public Adapter caseSelfAssignmentStatement(SelfAssignmentStatement object)
      {
        return createSelfAssignmentStatementAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseFunctionCall(FunctionCall object)
      {
        return createFunctionCallAdapter();
      }
      @Override
      public Adapter caseProcedureCall(ProcedureCall object)
      {
        return createProcedureCallAdapter();
      }
      @Override
      public Adapter caseExpressionList(ExpressionList object)
      {
        return createExpressionListAdapter();
      }
      @Override
      public Adapter caseExpressionRest(ExpressionRest object)
      {
        return createExpressionRestAdapter();
      }
      @Override
      public Adapter caseKeyValuePair(KeyValuePair object)
      {
        return createKeyValuePairAdapter();
      }
      @Override
      public Adapter caseKeyValuePairRest(KeyValuePairRest object)
      {
        return createKeyValuePairRestAdapter();
      }
      @Override
      public Adapter caseTerm(Term object)
      {
        return createTermAdapter();
      }
      @Override
      public Adapter caseList(List object)
      {
        return createListAdapter();
      }
      @Override
      public Adapter caseDesignator(Designator object)
      {
        return createDesignatorAdapter();
      }
      @Override
      public Adapter caseOrExpression(OrExpression object)
      {
        return createOrExpressionAdapter();
      }
      @Override
      public Adapter caseAndExpression(AndExpression object)
      {
        return createAndExpressionAdapter();
      }
      @Override
      public Adapter caseEqualityExpression(EqualityExpression object)
      {
        return createEqualityExpressionAdapter();
      }
      @Override
      public Adapter caseDashExpression(DashExpression object)
      {
        return createDashExpressionAdapter();
      }
      @Override
      public Adapter casePointExpression(PointExpression object)
      {
        return createPointExpressionAdapter();
      }
      @Override
      public Adapter casePowExpression(PowExpression object)
      {
        return createPowExpressionAdapter();
      }
      @Override
      public Adapter caseQualifierExpression(QualifierExpression object)
      {
        return createQualifierExpressionAdapter();
      }
      @Override
      public Adapter caseThereIsIn(ThereIsIn object)
      {
        return createThereIsInAdapter();
      }
      @Override
      public Adapter caseForallIn(ForallIn object)
      {
        return createForallInAdapter();
      }
      @Override
      public Adapter caseFirstIn(FirstIn object)
      {
        return createFirstInAdapter();
      }
      @Override
      public Adapter caseLastIn(LastIn object)
      {
        return createLastInAdapter();
      }
      @Override
      public Adapter caseCount(Count object)
      {
        return createCountAdapter();
      }
      @Override
      public Adapter caseReduce(Reduce object)
      {
        return createReduceAdapter();
      }
      @Override
      public Adapter caseSum(Sum object)
      {
        return createSumAdapter();
      }
      @Override
      public Adapter caseMap(Map object)
      {
        return createMapAdapter();
      }
      @Override
      public Adapter caseApply(Apply object)
      {
        return createApplyAdapter();
      }
      @Override
      public Adapter caseUnaryExpression(UnaryExpression object)
      {
        return createUnaryExpressionAdapter();
      }
      @Override
      public Adapter caseStructureExpression(StructureExpression object)
      {
        return createStructureExpressionAdapter();
      }
      @Override
      public Adapter caseStringValue(StringValue object)
      {
        return createStringValueAdapter();
      }
      @Override
      public Adapter caseIntegerValue(IntegerValue object)
      {
        return createIntegerValueAdapter();
      }
      @Override
      public Adapter caseDoubleValue(DoubleValue object)
      {
        return createDoubleValueAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.Phrase <em>Phrase</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.Phrase
   * @generated
   */
  public Adapter createPhraseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.StatementList <em>Statement List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.StatementList
   * @generated
   */
  public Adapter createStatementListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.AssignmentStatement <em>Assignment Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.AssignmentStatement
   * @generated
   */
  public Adapter createAssignmentStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.VariableAssignmentStatement <em>Variable Assignment Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.VariableAssignmentStatement
   * @generated
   */
  public Adapter createVariableAssignmentStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.SelfAssignmentStatement <em>Self Assignment Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.SelfAssignmentStatement
   * @generated
   */
  public Adapter createSelfAssignmentStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.FunctionCall <em>Function Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.FunctionCall
   * @generated
   */
  public Adapter createFunctionCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.ProcedureCall <em>Procedure Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.ProcedureCall
   * @generated
   */
  public Adapter createProcedureCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.ExpressionList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.ExpressionList
   * @generated
   */
  public Adapter createExpressionListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.ExpressionRest <em>Rest</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.ExpressionRest
   * @generated
   */
  public Adapter createExpressionRestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.KeyValuePair <em>Key Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.KeyValuePair
   * @generated
   */
  public Adapter createKeyValuePairAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.KeyValuePairRest <em>Key Value Pair Rest</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.KeyValuePairRest
   * @generated
   */
  public Adapter createKeyValuePairRestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.Term
   * @generated
   */
  public Adapter createTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.List <em>List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.List
   * @generated
   */
  public Adapter createListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.Designator <em>Designator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.Designator
   * @generated
   */
  public Adapter createDesignatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.OrExpression <em>Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.OrExpression
   * @generated
   */
  public Adapter createOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.AndExpression
   * @generated
   */
  public Adapter createAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.EqualityExpression <em>Equality Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.EqualityExpression
   * @generated
   */
  public Adapter createEqualityExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.DashExpression <em>Dash Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.DashExpression
   * @generated
   */
  public Adapter createDashExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.PointExpression <em>Point Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.PointExpression
   * @generated
   */
  public Adapter createPointExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.PowExpression <em>Pow Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.PowExpression
   * @generated
   */
  public Adapter createPowExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.QualifierExpression <em>Qualifier Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.QualifierExpression
   * @generated
   */
  public Adapter createQualifierExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.ThereIsIn <em>There Is In</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.ThereIsIn
   * @generated
   */
  public Adapter createThereIsInAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.ForallIn <em>Forall In</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.ForallIn
   * @generated
   */
  public Adapter createForallInAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.FirstIn <em>First In</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.FirstIn
   * @generated
   */
  public Adapter createFirstInAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.LastIn <em>Last In</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.LastIn
   * @generated
   */
  public Adapter createLastInAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.Count <em>Count</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.Count
   * @generated
   */
  public Adapter createCountAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.Reduce <em>Reduce</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.Reduce
   * @generated
   */
  public Adapter createReduceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.Sum <em>Sum</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.Sum
   * @generated
   */
  public Adapter createSumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.Map <em>Map</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.Map
   * @generated
   */
  public Adapter createMapAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.Apply <em>Apply</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.Apply
   * @generated
   */
  public Adapter createApplyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.UnaryExpression
   * @generated
   */
  public Adapter createUnaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.StructureExpression <em>Structure Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.StructureExpression
   * @generated
   */
  public Adapter createStructureExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.StringValue
   * @generated
   */
  public Adapter createStringValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.IntegerValue <em>Integer Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.IntegerValue
   * @generated
   */
  public Adapter createIntegerValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openetcs.dsl.expression.DoubleValue <em>Double Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openetcs.dsl.expression.DoubleValue
   * @generated
   */
  public Adapter createDoubleValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ExpressionAdapterFactory
