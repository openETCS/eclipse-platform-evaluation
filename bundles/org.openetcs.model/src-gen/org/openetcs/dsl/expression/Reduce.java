/**
 */
package org.openetcs.dsl.expression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reduce</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.dsl.expression.Reduce#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.openetcs.dsl.expression.Reduce#getUsingExpr <em>Using Expr</em>}</li>
 *   <li>{@link org.openetcs.dsl.expression.Reduce#getInitValue <em>Init Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.dsl.expression.ExpressionPackage#getReduce()
 * @model
 * @generated
 */
public interface Reduce extends Expression
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
   * @see org.openetcs.dsl.expression.ExpressionPackage#getReduce_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link org.openetcs.dsl.expression.Reduce#getExpr <em>Expr</em>}' containment reference.
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
   * @see org.openetcs.dsl.expression.ExpressionPackage#getReduce_UsingExpr()
   * @model containment="true"
   * @generated
   */
  Expression getUsingExpr();

  /**
   * Sets the value of the '{@link org.openetcs.dsl.expression.Reduce#getUsingExpr <em>Using Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Using Expr</em>' containment reference.
   * @see #getUsingExpr()
   * @generated
   */
  void setUsingExpr(Expression value);

  /**
   * Returns the value of the '<em><b>Init Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init Value</em>' containment reference.
   * @see #setInitValue(Expression)
   * @see org.openetcs.dsl.expression.ExpressionPackage#getReduce_InitValue()
   * @model containment="true"
   * @generated
   */
  Expression getInitValue();

  /**
   * Sets the value of the '{@link org.openetcs.dsl.expression.Reduce#getInitValue <em>Init Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init Value</em>' containment reference.
   * @see #getInitValue()
   * @generated
   */
  void setInitValue(Expression value);

} // Reduce
