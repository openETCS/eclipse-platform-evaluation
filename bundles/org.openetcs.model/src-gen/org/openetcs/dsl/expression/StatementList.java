/**
 */
package org.openetcs.dsl.expression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.dsl.expression.StatementList#getHead <em>Head</em>}</li>
 *   <li>{@link org.openetcs.dsl.expression.StatementList#getTail <em>Tail</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.dsl.expression.ExpressionPackage#getStatementList()
 * @model
 * @generated
 */
public interface StatementList extends Phrase
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
   * @see #setHead(Statement)
   * @see org.openetcs.dsl.expression.ExpressionPackage#getStatementList_Head()
   * @model containment="true"
   * @generated
   */
  Statement getHead();

  /**
   * Sets the value of the '{@link org.openetcs.dsl.expression.StatementList#getHead <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head</em>' containment reference.
   * @see #getHead()
   * @generated
   */
  void setHead(Statement value);

  /**
   * Returns the value of the '<em><b>Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tail</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tail</em>' containment reference.
   * @see #setTail(StatementList)
   * @see org.openetcs.dsl.expression.ExpressionPackage#getStatementList_Tail()
   * @model containment="true"
   * @generated
   */
  StatementList getTail();

  /**
   * Sets the value of the '{@link org.openetcs.dsl.expression.StatementList#getTail <em>Tail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tail</em>' containment reference.
   * @see #getTail()
   * @generated
   */
  void setTail(StatementList value);

} // StatementList
