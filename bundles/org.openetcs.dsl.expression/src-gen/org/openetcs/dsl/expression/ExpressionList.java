/**
 */
package org.openetcs.dsl.expression;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.dsl.expression.ExpressionList#getHead <em>Head</em>}</li>
 *   <li>{@link org.openetcs.dsl.expression.ExpressionList#getTail <em>Tail</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.dsl.expression.ExpressionPackage#getExpressionList()
 * @model
 * @generated
 */
public interface ExpressionList extends EObject
{
  /**
   * Returns the value of the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Head</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Head</em>' containment reference.
   * @see #setHead(Expression)
   * @see org.openetcs.dsl.expression.ExpressionPackage#getExpressionList_Head()
   * @model containment="true"
   * @generated
   */
  Expression getHead();

  /**
   * Sets the value of the '{@link org.openetcs.dsl.expression.ExpressionList#getHead <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head</em>' containment reference.
   * @see #getHead()
   * @generated
   */
  void setHead(Expression value);

  /**
   * Returns the value of the '<em><b>Tail</b></em>' containment reference list.
   * The list contents are of type {@link org.openetcs.dsl.expression.ExpressionRest}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tail</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tail</em>' containment reference list.
   * @see org.openetcs.dsl.expression.ExpressionPackage#getExpressionList_Tail()
   * @model containment="true"
   * @generated
   */
  EList<ExpressionRest> getTail();

} // ExpressionList
