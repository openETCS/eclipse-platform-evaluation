/**
 */
package org.openetcs.dsl.expression;

import org.openetcs.model.ertmsformalspecs.types.Function;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.dsl.expression.FunctionCall#getFunction <em>Function</em>}</li>
 *   <li>{@link org.openetcs.dsl.expression.FunctionCall#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.dsl.expression.ExpressionPackage#getFunctionCall()
 * @model
 * @generated
 */
public interface FunctionCall extends Expression
{
  /**
   * Returns the value of the '<em><b>Function</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' reference.
   * @see #setFunction(Function)
   * @see org.openetcs.dsl.expression.ExpressionPackage#getFunctionCall_Function()
   * @model
   * @generated
   */
  Function getFunction();

  /**
   * Sets the value of the '{@link org.openetcs.dsl.expression.FunctionCall#getFunction <em>Function</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' reference.
   * @see #getFunction()
   * @generated
   */
  void setFunction(Function value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference.
   * @see #setParams(ExpressionList)
   * @see org.openetcs.dsl.expression.ExpressionPackage#getFunctionCall_Params()
   * @model containment="true"
   * @generated
   */
  ExpressionList getParams();

  /**
   * Sets the value of the '{@link org.openetcs.dsl.expression.FunctionCall#getParams <em>Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Params</em>' containment reference.
   * @see #getParams()
   * @generated
   */
  void setParams(ExpressionList value);

} // FunctionCall
