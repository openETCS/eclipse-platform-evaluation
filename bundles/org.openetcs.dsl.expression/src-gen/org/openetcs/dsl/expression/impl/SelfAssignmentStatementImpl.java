/**
 */
package org.openetcs.dsl.expression.impl;

import org.eclipse.emf.ecore.EClass;

import org.openetcs.dsl.expression.ExpressionPackage;
import org.openetcs.dsl.expression.SelfAssignmentStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Self Assignment Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SelfAssignmentStatementImpl extends AssignmentStatementImpl implements SelfAssignmentStatement
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelfAssignmentStatementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ExpressionPackage.Literals.SELF_ASSIGNMENT_STATEMENT;
  }

} //SelfAssignmentStatementImpl
