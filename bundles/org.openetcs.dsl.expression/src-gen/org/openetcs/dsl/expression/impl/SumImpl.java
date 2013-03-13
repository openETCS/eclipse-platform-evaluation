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
import org.openetcs.dsl.expression.Sum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.dsl.expression.impl.SumImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.openetcs.dsl.expression.impl.SumImpl#getUsingExpr <em>Using Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SumImpl extends ExpressionImpl implements Sum
{
  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected Expression expr;

  /**
   * The cached value of the '{@link #getUsingExpr() <em>Using Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsingExpr()
   * @generated
   * @ordered
   */
  protected Expression usingExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SumImpl()
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
    return ExpressionPackage.Literals.SUM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(Expression newExpr, NotificationChain msgs)
  {
    Expression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.SUM__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(Expression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.SUM__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.SUM__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.SUM__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getUsingExpr()
  {
    return usingExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUsingExpr(Expression newUsingExpr, NotificationChain msgs)
  {
    Expression oldUsingExpr = usingExpr;
    usingExpr = newUsingExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.SUM__USING_EXPR, oldUsingExpr, newUsingExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUsingExpr(Expression newUsingExpr)
  {
    if (newUsingExpr != usingExpr)
    {
      NotificationChain msgs = null;
      if (usingExpr != null)
        msgs = ((InternalEObject)usingExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.SUM__USING_EXPR, null, msgs);
      if (newUsingExpr != null)
        msgs = ((InternalEObject)newUsingExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.SUM__USING_EXPR, null, msgs);
      msgs = basicSetUsingExpr(newUsingExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.SUM__USING_EXPR, newUsingExpr, newUsingExpr));
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
      case ExpressionPackage.SUM__EXPR:
        return basicSetExpr(null, msgs);
      case ExpressionPackage.SUM__USING_EXPR:
        return basicSetUsingExpr(null, msgs);
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
      case ExpressionPackage.SUM__EXPR:
        return getExpr();
      case ExpressionPackage.SUM__USING_EXPR:
        return getUsingExpr();
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
      case ExpressionPackage.SUM__EXPR:
        setExpr((Expression)newValue);
        return;
      case ExpressionPackage.SUM__USING_EXPR:
        setUsingExpr((Expression)newValue);
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
      case ExpressionPackage.SUM__EXPR:
        setExpr((Expression)null);
        return;
      case ExpressionPackage.SUM__USING_EXPR:
        setUsingExpr((Expression)null);
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
      case ExpressionPackage.SUM__EXPR:
        return expr != null;
      case ExpressionPackage.SUM__USING_EXPR:
        return usingExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //SumImpl
