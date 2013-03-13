/**
 */
package org.openetcs.dsl.expression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.dsl.expression.Expression#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.dsl.expression.ExpressionPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends Phrase, ExpressionRest
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Expression)
   * @see org.openetcs.dsl.expression.ExpressionPackage#getExpression_Condition()
   * @model containment="true"
   * @generated
   */
  Expression getCondition();

  /**
   * Sets the value of the '{@link org.openetcs.dsl.expression.Expression#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Expression value);

} // Expression
