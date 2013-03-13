/**
 */
package org.openetcs.dsl.expression.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openetcs.dsl.expression.Designator;
import org.openetcs.dsl.expression.Expression;
import org.openetcs.dsl.expression.ExpressionList;
import org.openetcs.dsl.expression.ExpressionPackage;
import org.openetcs.dsl.expression.Term;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Designator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.dsl.expression.impl.DesignatorImpl#getStructuredExpression <em>Structured Expression</em>}</li>
 *   <li>{@link org.openetcs.dsl.expression.impl.DesignatorImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.openetcs.dsl.expression.impl.DesignatorImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DesignatorImpl extends FunctionCallImpl implements Designator
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
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected ExpressionList params;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected EObject value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DesignatorImpl()
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
    return ExpressionPackage.Literals.DESIGNATOR;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.DESIGNATOR__STRUCTURED_EXPRESSION, oldStructuredExpression, newStructuredExpression);
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
        msgs = ((InternalEObject)structuredExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.DESIGNATOR__STRUCTURED_EXPRESSION, null, msgs);
      if (newStructuredExpression != null)
        msgs = ((InternalEObject)newStructuredExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.DESIGNATOR__STRUCTURED_EXPRESSION, null, msgs);
      msgs = basicSetStructuredExpression(newStructuredExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.DESIGNATOR__STRUCTURED_EXPRESSION, newStructuredExpression, newStructuredExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionList getParams()
  {
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParams(ExpressionList newParams, NotificationChain msgs)
  {
    ExpressionList oldParams = params;
    params = newParams;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.DESIGNATOR__PARAMS, oldParams, newParams);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParams(ExpressionList newParams)
  {
    if (newParams != params)
    {
      NotificationChain msgs = null;
      if (params != null)
        msgs = ((InternalEObject)params).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.DESIGNATOR__PARAMS, null, msgs);
      if (newParams != null)
        msgs = ((InternalEObject)newParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.DESIGNATOR__PARAMS, null, msgs);
      msgs = basicSetParams(newParams, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.DESIGNATOR__PARAMS, newParams, newParams));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getValue()
  {
    if (value != null && value.eIsProxy())
    {
      InternalEObject oldValue = (InternalEObject)value;
      value = eResolveProxy(oldValue);
      if (value != oldValue)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionPackage.DESIGNATOR__VALUE, oldValue, value));
      }
    }
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject basicGetValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(EObject newValue)
  {
    EObject oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.DESIGNATOR__VALUE, oldValue, value));
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
      case ExpressionPackage.DESIGNATOR__STRUCTURED_EXPRESSION:
        return basicSetStructuredExpression(null, msgs);
      case ExpressionPackage.DESIGNATOR__PARAMS:
        return basicSetParams(null, msgs);
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
      case ExpressionPackage.DESIGNATOR__STRUCTURED_EXPRESSION:
        return getStructuredExpression();
      case ExpressionPackage.DESIGNATOR__PARAMS:
        return getParams();
      case ExpressionPackage.DESIGNATOR__VALUE:
        if (resolve) return getValue();
        return basicGetValue();
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
      case ExpressionPackage.DESIGNATOR__STRUCTURED_EXPRESSION:
        setStructuredExpression((Expression)newValue);
        return;
      case ExpressionPackage.DESIGNATOR__PARAMS:
        setParams((ExpressionList)newValue);
        return;
      case ExpressionPackage.DESIGNATOR__VALUE:
        setValue((EObject)newValue);
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
      case ExpressionPackage.DESIGNATOR__STRUCTURED_EXPRESSION:
        setStructuredExpression((Expression)null);
        return;
      case ExpressionPackage.DESIGNATOR__PARAMS:
        setParams((ExpressionList)null);
        return;
      case ExpressionPackage.DESIGNATOR__VALUE:
        setValue((EObject)null);
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
      case ExpressionPackage.DESIGNATOR__STRUCTURED_EXPRESSION:
        return structuredExpression != null;
      case ExpressionPackage.DESIGNATOR__PARAMS:
        return params != null;
      case ExpressionPackage.DESIGNATOR__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Term.class)
    {
      switch (derivedFeatureID)
      {
        case ExpressionPackage.DESIGNATOR__STRUCTURED_EXPRESSION: return ExpressionPackage.TERM__STRUCTURED_EXPRESSION;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Term.class)
    {
      switch (baseFeatureID)
      {
        case ExpressionPackage.TERM__STRUCTURED_EXPRESSION: return ExpressionPackage.DESIGNATOR__STRUCTURED_EXPRESSION;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //DesignatorImpl
