/**
 */
package org.openetcs.dsl.expression;

import org.eclipse.emf.ecore.EObject;

import org.openetcs.model.ertmsformalspecs.Procedure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.dsl.expression.ProcedureCall#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.openetcs.dsl.expression.ProcedureCall#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.dsl.expression.ExpressionPackage#getProcedureCall()
 * @model
 * @generated
 */
public interface ProcedureCall extends EObject
{
  /**
   * Returns the value of the '<em><b>Procedure</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Procedure</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Procedure</em>' reference.
   * @see #setProcedure(Procedure)
   * @see org.openetcs.dsl.expression.ExpressionPackage#getProcedureCall_Procedure()
   * @model
   * @generated
   */
  Procedure getProcedure();

  /**
   * Sets the value of the '{@link org.openetcs.dsl.expression.ProcedureCall#getProcedure <em>Procedure</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Procedure</em>' reference.
   * @see #getProcedure()
   * @generated
   */
  void setProcedure(Procedure value);

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
   * @see org.openetcs.dsl.expression.ExpressionPackage#getProcedureCall_Params()
   * @model containment="true"
   * @generated
   */
  ExpressionList getParams();

  /**
   * Sets the value of the '{@link org.openetcs.dsl.expression.ProcedureCall#getParams <em>Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Params</em>' containment reference.
   * @see #getParams()
   * @generated
   */
  void setParams(ExpressionList value);

} // ProcedureCall
