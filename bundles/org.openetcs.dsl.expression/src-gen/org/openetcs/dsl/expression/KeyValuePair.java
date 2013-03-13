/**
 */
package org.openetcs.dsl.expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Value Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.dsl.expression.KeyValuePair#getKey <em>Key</em>}</li>
 *   <li>{@link org.openetcs.dsl.expression.KeyValuePair#getValue <em>Value</em>}</li>
 *   <li>{@link org.openetcs.dsl.expression.KeyValuePair#getRest <em>Rest</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.dsl.expression.ExpressionPackage#getKeyValuePair()
 * @model
 * @generated
 */
public interface KeyValuePair extends KeyValuePairRest
{
  /**
   * Returns the value of the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' attribute.
   * @see #setKey(String)
   * @see org.openetcs.dsl.expression.ExpressionPackage#getKeyValuePair_Key()
   * @model
   * @generated
   */
  String getKey();

  /**
   * Sets the value of the '{@link org.openetcs.dsl.expression.KeyValuePair#getKey <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' attribute.
   * @see #getKey()
   * @generated
   */
  void setKey(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Expression)
   * @see org.openetcs.dsl.expression.ExpressionPackage#getKeyValuePair_Value()
   * @model containment="true"
   * @generated
   */
  Expression getValue();

  /**
   * Sets the value of the '{@link org.openetcs.dsl.expression.KeyValuePair#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Expression value);

  /**
   * Returns the value of the '<em><b>Rest</b></em>' containment reference list.
   * The list contents are of type {@link org.openetcs.dsl.expression.KeyValuePairRest}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rest</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rest</em>' containment reference list.
   * @see org.openetcs.dsl.expression.ExpressionPackage#getKeyValuePair_Rest()
   * @model containment="true"
   * @generated
   */
  EList<KeyValuePairRest> getRest();

} // KeyValuePair
