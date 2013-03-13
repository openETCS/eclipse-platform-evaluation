/**
 */
package org.openetcs.dsl.expression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Assignment Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.dsl.expression.VariableAssignmentStatement#getDesignator <em>Designator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.dsl.expression.ExpressionPackage#getVariableAssignmentStatement()
 * @model
 * @generated
 */
public interface VariableAssignmentStatement extends AssignmentStatement
{
  /**
   * Returns the value of the '<em><b>Designator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Designator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Designator</em>' containment reference.
   * @see #setDesignator(Designator)
   * @see org.openetcs.dsl.expression.ExpressionPackage#getVariableAssignmentStatement_Designator()
   * @model containment="true"
   * @generated
   */
  Designator getDesignator();

  /**
   * Sets the value of the '{@link org.openetcs.dsl.expression.VariableAssignmentStatement#getDesignator <em>Designator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Designator</em>' containment reference.
   * @see #getDesignator()
   * @generated
   */
  void setDesignator(Designator value);

} // VariableAssignmentStatement
