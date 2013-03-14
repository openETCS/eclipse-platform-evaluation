/**
 */
package org.openetcs.dsl.expression.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.openetcs.dsl.expression.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openetcs.dsl.expression.ExpressionPackage
 * @generated
 */
public class ExpressionSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ExpressionPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ExpressionPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ExpressionPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.PHRASE:
      {
        Phrase phrase = (Phrase)theEObject;
        T result = casePhrase(phrase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.STATEMENT_LIST:
      {
        StatementList statementList = (StatementList)theEObject;
        T result = caseStatementList(statementList);
        if (result == null) result = casePhrase(statementList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.ASSIGNMENT_STATEMENT:
      {
        AssignmentStatement assignmentStatement = (AssignmentStatement)theEObject;
        T result = caseAssignmentStatement(assignmentStatement);
        if (result == null) result = caseStatement(assignmentStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.VARIABLE_ASSIGNMENT_STATEMENT:
      {
        VariableAssignmentStatement variableAssignmentStatement = (VariableAssignmentStatement)theEObject;
        T result = caseVariableAssignmentStatement(variableAssignmentStatement);
        if (result == null) result = caseAssignmentStatement(variableAssignmentStatement);
        if (result == null) result = caseStatement(variableAssignmentStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.SELF_ASSIGNMENT_STATEMENT:
      {
        SelfAssignmentStatement selfAssignmentStatement = (SelfAssignmentStatement)theEObject;
        T result = caseSelfAssignmentStatement(selfAssignmentStatement);
        if (result == null) result = caseAssignmentStatement(selfAssignmentStatement);
        if (result == null) result = caseStatement(selfAssignmentStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = casePhrase(expression);
        if (result == null) result = caseExpressionRest(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.FUNCTION_CALL:
      {
        FunctionCall functionCall = (FunctionCall)theEObject;
        T result = caseFunctionCall(functionCall);
        if (result == null) result = caseExpression(functionCall);
        if (result == null) result = casePhrase(functionCall);
        if (result == null) result = caseExpressionRest(functionCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.PROCEDURE_CALL:
      {
        ProcedureCall procedureCall = (ProcedureCall)theEObject;
        T result = caseProcedureCall(procedureCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.EXPRESSION_LIST:
      {
        ExpressionList expressionList = (ExpressionList)theEObject;
        T result = caseExpressionList(expressionList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.EXPRESSION_REST:
      {
        ExpressionRest expressionRest = (ExpressionRest)theEObject;
        T result = caseExpressionRest(expressionRest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.KEY_VALUE_PAIR:
      {
        KeyValuePair keyValuePair = (KeyValuePair)theEObject;
        T result = caseKeyValuePair(keyValuePair);
        if (result == null) result = caseKeyValuePairRest(keyValuePair);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.KEY_VALUE_PAIR_REST:
      {
        KeyValuePairRest keyValuePairRest = (KeyValuePairRest)theEObject;
        T result = caseKeyValuePairRest(keyValuePairRest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.TERM:
      {
        Term term = (Term)theEObject;
        T result = caseTerm(term);
        if (result == null) result = caseExpression(term);
        if (result == null) result = casePhrase(term);
        if (result == null) result = caseExpressionRest(term);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.LIST:
      {
        List list = (List)theEObject;
        T result = caseList(list);
        if (result == null) result = caseTerm(list);
        if (result == null) result = caseExpression(list);
        if (result == null) result = casePhrase(list);
        if (result == null) result = caseExpressionRest(list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.DESIGNATOR:
      {
        Designator designator = (Designator)theEObject;
        T result = caseDesignator(designator);
        if (result == null) result = caseTerm(designator);
        if (result == null) result = caseExpression(designator);
        if (result == null) result = casePhrase(designator);
        if (result == null) result = caseExpressionRest(designator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.OR_EXPRESSION:
      {
        OrExpression orExpression = (OrExpression)theEObject;
        T result = caseOrExpression(orExpression);
        if (result == null) result = caseExpression(orExpression);
        if (result == null) result = casePhrase(orExpression);
        if (result == null) result = caseExpressionRest(orExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.AND_EXPRESSION:
      {
        AndExpression andExpression = (AndExpression)theEObject;
        T result = caseAndExpression(andExpression);
        if (result == null) result = caseExpression(andExpression);
        if (result == null) result = casePhrase(andExpression);
        if (result == null) result = caseExpressionRest(andExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.EQUALITY_EXPRESSION:
      {
        EqualityExpression equalityExpression = (EqualityExpression)theEObject;
        T result = caseEqualityExpression(equalityExpression);
        if (result == null) result = caseExpression(equalityExpression);
        if (result == null) result = casePhrase(equalityExpression);
        if (result == null) result = caseExpressionRest(equalityExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.DASH_EXPRESSION:
      {
        DashExpression dashExpression = (DashExpression)theEObject;
        T result = caseDashExpression(dashExpression);
        if (result == null) result = caseExpression(dashExpression);
        if (result == null) result = casePhrase(dashExpression);
        if (result == null) result = caseExpressionRest(dashExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.POINT_EXPRESSION:
      {
        PointExpression pointExpression = (PointExpression)theEObject;
        T result = casePointExpression(pointExpression);
        if (result == null) result = caseExpression(pointExpression);
        if (result == null) result = casePhrase(pointExpression);
        if (result == null) result = caseExpressionRest(pointExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.POW_EXPRESSION:
      {
        PowExpression powExpression = (PowExpression)theEObject;
        T result = casePowExpression(powExpression);
        if (result == null) result = caseExpression(powExpression);
        if (result == null) result = casePhrase(powExpression);
        if (result == null) result = caseExpressionRest(powExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.QUALIFIER_EXPRESSION:
      {
        QualifierExpression qualifierExpression = (QualifierExpression)theEObject;
        T result = caseQualifierExpression(qualifierExpression);
        if (result == null) result = caseExpression(qualifierExpression);
        if (result == null) result = casePhrase(qualifierExpression);
        if (result == null) result = caseExpressionRest(qualifierExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.THERE_IS_IN:
      {
        ThereIsIn thereIsIn = (ThereIsIn)theEObject;
        T result = caseThereIsIn(thereIsIn);
        if (result == null) result = caseExpression(thereIsIn);
        if (result == null) result = casePhrase(thereIsIn);
        if (result == null) result = caseExpressionRest(thereIsIn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.FORALL_IN:
      {
        ForallIn forallIn = (ForallIn)theEObject;
        T result = caseForallIn(forallIn);
        if (result == null) result = caseExpression(forallIn);
        if (result == null) result = casePhrase(forallIn);
        if (result == null) result = caseExpressionRest(forallIn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.FIRST_IN:
      {
        FirstIn firstIn = (FirstIn)theEObject;
        T result = caseFirstIn(firstIn);
        if (result == null) result = caseExpression(firstIn);
        if (result == null) result = casePhrase(firstIn);
        if (result == null) result = caseExpressionRest(firstIn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.LAST_IN:
      {
        LastIn lastIn = (LastIn)theEObject;
        T result = caseLastIn(lastIn);
        if (result == null) result = caseExpression(lastIn);
        if (result == null) result = casePhrase(lastIn);
        if (result == null) result = caseExpressionRest(lastIn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.COUNT:
      {
        Count count = (Count)theEObject;
        T result = caseCount(count);
        if (result == null) result = caseExpression(count);
        if (result == null) result = casePhrase(count);
        if (result == null) result = caseExpressionRest(count);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.REDUCE:
      {
        Reduce reduce = (Reduce)theEObject;
        T result = caseReduce(reduce);
        if (result == null) result = caseExpression(reduce);
        if (result == null) result = casePhrase(reduce);
        if (result == null) result = caseExpressionRest(reduce);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.SUM:
      {
        Sum sum = (Sum)theEObject;
        T result = caseSum(sum);
        if (result == null) result = caseExpression(sum);
        if (result == null) result = casePhrase(sum);
        if (result == null) result = caseExpressionRest(sum);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.MAP:
      {
        Map map = (Map)theEObject;
        T result = caseMap(map);
        if (result == null) result = caseExpression(map);
        if (result == null) result = casePhrase(map);
        if (result == null) result = caseExpressionRest(map);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.APPLY:
      {
        Apply apply = (Apply)theEObject;
        T result = caseApply(apply);
        if (result == null) result = caseExpression(apply);
        if (result == null) result = casePhrase(apply);
        if (result == null) result = caseExpressionRest(apply);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.UNARY_EXPRESSION:
      {
        UnaryExpression unaryExpression = (UnaryExpression)theEObject;
        T result = caseUnaryExpression(unaryExpression);
        if (result == null) result = caseExpression(unaryExpression);
        if (result == null) result = casePhrase(unaryExpression);
        if (result == null) result = caseExpressionRest(unaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.STRUCTURE_EXPRESSION:
      {
        StructureExpression structureExpression = (StructureExpression)theEObject;
        T result = caseStructureExpression(structureExpression);
        if (result == null) result = caseExpression(structureExpression);
        if (result == null) result = casePhrase(structureExpression);
        if (result == null) result = caseExpressionRest(structureExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.STRING_VALUE:
      {
        StringValue stringValue = (StringValue)theEObject;
        T result = caseStringValue(stringValue);
        if (result == null) result = caseTerm(stringValue);
        if (result == null) result = caseExpression(stringValue);
        if (result == null) result = casePhrase(stringValue);
        if (result == null) result = caseExpressionRest(stringValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.INTEGER_VALUE:
      {
        IntegerValue integerValue = (IntegerValue)theEObject;
        T result = caseIntegerValue(integerValue);
        if (result == null) result = caseTerm(integerValue);
        if (result == null) result = caseExpression(integerValue);
        if (result == null) result = casePhrase(integerValue);
        if (result == null) result = caseExpressionRest(integerValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.DOUBLE_VALUE:
      {
        DoubleValue doubleValue = (DoubleValue)theEObject;
        T result = caseDoubleValue(doubleValue);
        if (result == null) result = caseTerm(doubleValue);
        if (result == null) result = caseExpression(doubleValue);
        if (result == null) result = casePhrase(doubleValue);
        if (result == null) result = caseExpressionRest(doubleValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Phrase</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Phrase</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePhrase(Phrase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatementList(StatementList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignment Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignment Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignmentStatement(AssignmentStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Assignment Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Assignment Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableAssignmentStatement(VariableAssignmentStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Self Assignment Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Self Assignment Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelfAssignmentStatement(SelfAssignmentStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionCall(FunctionCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Procedure Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Procedure Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcedureCall(ProcedureCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionList(ExpressionList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rest</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rest</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionRest(ExpressionRest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Key Value Pair</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Key Value Pair</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKeyValuePair(KeyValuePair object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Key Value Pair Rest</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Key Value Pair Rest</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKeyValuePairRest(KeyValuePairRest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerm(Term object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseList(List object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Designator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Designator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDesignator(Designator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrExpression(OrExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndExpression(AndExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equality Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equality Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEqualityExpression(EqualityExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dash Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dash Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDashExpression(DashExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Point Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePointExpression(PointExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pow Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pow Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePowExpression(PowExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qualifier Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qualifier Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualifierExpression(QualifierExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>There Is In</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>There Is In</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseThereIsIn(ThereIsIn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Forall In</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Forall In</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForallIn(ForallIn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>First In</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>First In</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFirstIn(FirstIn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Last In</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Last In</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLastIn(LastIn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Count</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Count</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCount(Count object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reduce</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reduce</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReduce(Reduce object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sum</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sum</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSum(Sum object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Map</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Map</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMap(Map object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Apply</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Apply</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApply(Apply object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryExpression(UnaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Structure Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Structure Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructureExpression(StructureExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringValue(StringValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerValue(IntegerValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Double Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Double Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoubleValue(DoubleValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ExpressionSwitch
