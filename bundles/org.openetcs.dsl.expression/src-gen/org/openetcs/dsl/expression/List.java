/**
 */
package org.openetcs.dsl.expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.dsl.expression.List#getTerms <em>Terms</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.dsl.expression.ExpressionPackage#getList()
 * @model
 * @generated
 */
public interface List extends Term
{
  /**
   * Returns the value of the '<em><b>Terms</b></em>' containment reference list.
   * The list contents are of type {@link org.openetcs.dsl.expression.Term}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Terms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Terms</em>' containment reference list.
   * @see org.openetcs.dsl.expression.ExpressionPackage#getList_Terms()
   * @model containment="true"
   * @generated
   */
  EList<Term> getTerms();

} // List
