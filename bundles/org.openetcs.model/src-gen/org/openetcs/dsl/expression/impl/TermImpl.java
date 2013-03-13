/**
 */
package org.openetcs.dsl.expression.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openetcs.dsl.expression.Expression;
import org.openetcs.dsl.expression.ExpressionPackage;
import org.openetcs.dsl.expression.Term;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.dsl.expression.impl.TermImpl#getStructuredExpression <em>Structured Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TermImpl extends ExpressionImpl implements Term
{
  /**
   * The cached value of the '{@link #getStructuredExpression() <em>Structured Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStructuredExpression()
   * @generated
   * @ordered
   */
  protected Expression structuredExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TermImpl()
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
    return ExpressionPackage.Literals.TERM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getStructuredExpression()
  {
    return structuredExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStructuredExpression(Expression newStructuredExpression, NotificationChain msgs)
  {
    Expression oldStructuredExpression = structuredExpression;
    structuredExpression = newStructuredExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.TERM__STRUCTURED_EXPRESSION, oldStructuredExpression, newStructuredExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStructuredExpression(Expression newStructuredExpression)
  {
    if (newStructuredExpression != structuredExpression)
    {
      NotificationChain msgs = null;
      if (structuredExpression != null)
        msgs = ((InternalEObject)structuredExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.TERM__STRUCTURED_EXPRESSION, null, msgs);
      if (newStructuredExpression != null)
        msgs = ((InternalEObject)newStructuredExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.TERM__STRUCTURED_EXPRESSION, null, msgs);
      msgs = basicSetStructuredExpression(newStructuredExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.TERM__STRUCTURED_EXPRESSION, newStructuredExpression, newStructuredExpression));
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
      case ExpressionPackage.TERM__STRUCTURED_EXPRESSION:
        return basicSetStructuredExpression(null, msgs);
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
      case ExpressionPackage.TERM__STRUCTURED_EXPRESSION:
        return getStructuredExpression();
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
      case ExpressionPackage.TERM__STRUCTURED_EXPRESSION:
        setStructuredExpression((Expression)newValue);
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
      case ExpressionPackage.TERM__STRUCTURED_EXPRESSION:
        setStructuredExpression((Expression)null);
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
      case ExpressionPackage.TERM__STRUCTURED_EXPRESSION:
        return structuredExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //TermImpl
