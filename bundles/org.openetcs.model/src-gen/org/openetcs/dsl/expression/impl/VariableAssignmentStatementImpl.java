/**
 */
package org.openetcs.dsl.expression.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openetcs.dsl.expression.Designator;
import org.openetcs.dsl.expression.ExpressionPackage;
import org.openetcs.dsl.expression.VariableAssignmentStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Assignment Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.dsl.expression.impl.VariableAssignmentStatementImpl#getDesignator <em>Designator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableAssignmentStatementImpl extends AssignmentStatementImpl implements VariableAssignmentStatement
{
  /**
   * The cached value of the '{@link #getDesignator() <em>Designator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesignator()
   * @generated
   * @ordered
   */
  protected Designator designator;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableAssignmentStatementImpl()
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
    return ExpressionPackage.Literals.VARIABLE_ASSIGNMENT_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Designator getDesignator()
  {
    return designator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDesignator(Designator newDesignator, NotificationChain msgs)
  {
    Designator oldDesignator = designator;
    designator = newDesignator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.VARIABLE_ASSIGNMENT_STATEMENT__DESIGNATOR, oldDesignator, newDesignator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDesignator(Designator newDesignator)
  {
    if (newDesignator != designator)
    {
      NotificationChain msgs = null;
      if (designator != null)
        msgs = ((InternalEObject)designator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.VARIABLE_ASSIGNMENT_STATEMENT__DESIGNATOR, null, msgs);
      if (newDesignator != null)
        msgs = ((InternalEObject)newDesignator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.VARIABLE_ASSIGNMENT_STATEMENT__DESIGNATOR, null, msgs);
      msgs = basicSetDesignator(newDesignator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.VARIABLE_ASSIGNMENT_STATEMENT__DESIGNATOR, newDesignator, newDesignator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ExpressionPackage.VARIABLE_ASSIGNMENT_STATEMENT__DESIGNATOR:
        return basicSetDesignator(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ExpressionPackage.VARIABLE_ASSIGNMENT_STATEMENT__DESIGNATOR:
        return getDesignator();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExpressionPackage.VARIABLE_ASSIGNMENT_STATEMENT__DESIGNATOR:
        setDesignator((Designator)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ExpressionPackage.VARIABLE_ASSIGNMENT_STATEMENT__DESIGNATOR:
        setDesignator((Designator)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ExpressionPackage.VARIABLE_ASSIGNMENT_STATEMENT__DESIGNATOR:
        return designator != null;
    }
    return super.eIsSet(featureID);
  }

} //VariableAssignmentStatementImpl
