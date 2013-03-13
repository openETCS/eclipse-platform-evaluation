/**
 */
package org.openetcs.dsl.expression.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openetcs.dsl.expression.Expression;
import org.openetcs.dsl.expression.ExpressionPackage;
import org.openetcs.dsl.expression.KeyValuePair;
import org.openetcs.dsl.expression.KeyValuePairRest;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Value Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.dsl.expression.impl.KeyValuePairImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.openetcs.dsl.expression.impl.KeyValuePairImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.openetcs.dsl.expression.impl.KeyValuePairImpl#getRest <em>Rest</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KeyValuePairImpl extends KeyValuePairRestImpl implements KeyValuePair
{
  /**
   * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKey()
   * @generated
   * @ordered
   */
  protected static final String KEY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKey()
   * @generated
   * @ordered
   */
  protected String key = KEY_EDEFAULT;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Expression value;

  /**
   * The cached value of the '{@link #getRest() <em>Rest</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRest()
   * @generated
   * @ordered
   */
  protected EList<KeyValuePairRest> rest;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KeyValuePairImpl()
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
    return ExpressionPackage.Literals.KEY_VALUE_PAIR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getKey()
  {
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKey(String newKey)
  {
    String oldKey = key;
    key = newKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.KEY_VALUE_PAIR__KEY, oldKey, key));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(Expression newValue, NotificationChain msgs)
  {
    Expression oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.KEY_VALUE_PAIR__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(Expression newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.KEY_VALUE_PAIR__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.KEY_VALUE_PAIR__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.KEY_VALUE_PAIR__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<KeyValuePairRest> getRest()
  {
    if (rest == null)
    {
      rest = new EObjectContainmentEList<KeyValuePairRest>(KeyValuePairRest.class, this, ExpressionPackage.KEY_VALUE_PAIR__REST);
    }
    return rest;
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
      case ExpressionPackage.KEY_VALUE_PAIR__VALUE:
        return basicSetValue(null, msgs);
      case ExpressionPackage.KEY_VALUE_PAIR__REST:
        return ((InternalEList<?>)getRest()).basicRemove(otherEnd, msgs);
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
      case ExpressionPackage.KEY_VALUE_PAIR__KEY:
        return getKey();
      case ExpressionPackage.KEY_VALUE_PAIR__VALUE:
        return getValue();
      case ExpressionPackage.KEY_VALUE_PAIR__REST:
        return getRest();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExpressionPackage.KEY_VALUE_PAIR__KEY:
        setKey((String)newValue);
        return;
      case ExpressionPackage.KEY_VALUE_PAIR__VALUE:
        setValue((Expression)newValue);
        return;
      case ExpressionPackage.KEY_VALUE_PAIR__REST:
        getRest().clear();
        getRest().addAll((Collection<? extends KeyValuePairRest>)newValue);
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
      case ExpressionPackage.KEY_VALUE_PAIR__KEY:
        setKey(KEY_EDEFAULT);
        return;
      case ExpressionPackage.KEY_VALUE_PAIR__VALUE:
        setValue((Expression)null);
        return;
      case ExpressionPackage.KEY_VALUE_PAIR__REST:
        getRest().clear();
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
      case ExpressionPackage.KEY_VALUE_PAIR__KEY:
        return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
      case ExpressionPackage.KEY_VALUE_PAIR__VALUE:
        return value != null;
      case ExpressionPackage.KEY_VALUE_PAIR__REST:
        return rest != null && !rest.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (key: ");
    result.append(key);
    result.append(')');
    return result.toString();
  }

} //KeyValuePairImpl
