/**
 */
package org.openetcs.dsl.expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.dsl.expression.StructureExpression#getKeyValuePair <em>Key Value Pair</em>}</li>
 *   <li>{@link org.openetcs.dsl.expression.StructureExpression#getStructuredExpressions <em>Structured Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.dsl.expression.ExpressionPackage#getStructureExpression()
 * @model
 * @generated
 */
public interface StructureExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Key Value Pair</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key Value Pair</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key Value Pair</em>' containment reference.
   * @see #setKeyValuePair(KeyValuePair)
   * @see org.openetcs.dsl.expression.ExpressionPackage#getStructureExpression_KeyValuePair()
   * @model containment="true"
   * @generated
   */
  KeyValuePair getKeyValuePair();

  /**
   * Sets the value of the '{@link org.openetcs.dsl.expression.StructureExpression#getKeyValuePair <em>Key Value Pair</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key Value Pair</em>' containment reference.
   * @see #getKeyValuePair()
   * @generated
   */
  void setKeyValuePair(KeyValuePair value);

  /**
   * Returns the value of the '<em><b>Structured Expressions</b></em>' containment reference list.
   * The list contents are of type {@link org.openetcs.dsl.expression.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Structured Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Structured Expressions</em>' containment reference list.
   * @see org.openetcs.dsl.expression.ExpressionPackage#getStructureExpression_StructuredExpressions()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getStructuredExpressions();

} // StructureExpression
