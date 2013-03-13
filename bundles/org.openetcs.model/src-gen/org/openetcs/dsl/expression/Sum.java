/**
 */
package org.openetcs.dsl.expression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.dsl.expression.Sum#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.openetcs.dsl.expression.Sum#getUsingExpr <em>Using Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.dsl.expression.ExpressionPackage#getSum()
 * @model
 * @generated
 */
public interface Sum extends Expression
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expression)
   * @see org.openetcs.dsl.expression.ExpressionPackage#getSum_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link org.openetcs.dsl.expression.Sum#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expression value);

  /**
   * Returns the value of the '<em><b>Using Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Using Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Using Expr</em>' containment reference.
   * @see #setUsingExpr(Expression)
   * @see org.openetcs.dsl.expression.ExpressionPackage#getSum_UsingExpr()
   * @model containment="true"
   * @generated
   */
  Expression getUsingExpr();

  /**
   * Sets the value of the '{@link org.openetcs.dsl.expression.Sum#getUsingExpr <em>Using Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Using Expr</em>' containment reference.
   * @see #getUsingExpr()
   * @generated
   */
  void setUsingExpr(Expression value);

} // Sum
