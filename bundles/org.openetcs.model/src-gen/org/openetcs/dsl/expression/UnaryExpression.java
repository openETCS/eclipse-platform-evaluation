/**
 */
package org.openetcs.dsl.expression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.dsl.expression.UnaryExpression#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.openetcs.dsl.expression.UnaryExpression#getStructuredExpression <em>Structured Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.dsl.expression.ExpressionPackage#getUnaryExpression()
 * @model
 * @generated
 */
public interface UnaryExpression extends Expression
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
   * @see org.openetcs.dsl.expression.ExpressionPackage#getUnaryExpression_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link org.openetcs.dsl.expression.UnaryExpression#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expression value);

  /**
   * Returns the value of the '<em><b>Structured Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Structured Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Structured Expression</em>' containment reference.
   * @see #setStructuredExpression(Expression)
   * @see org.openetcs.dsl.expression.ExpressionPackage#getUnaryExpression_StructuredExpression()
   * @model containment="true"
   * @generated
   */
  Expression getStructuredExpression();

  /**
   * Sets the value of the '{@link org.openetcs.dsl.expression.UnaryExpression#getStructuredExpression <em>Structured Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Structured Expression</em>' containment reference.
   * @see #getStructuredExpression()
   * @generated
   */
  void setStructuredExpression(Expression value);

} // UnaryExpression
