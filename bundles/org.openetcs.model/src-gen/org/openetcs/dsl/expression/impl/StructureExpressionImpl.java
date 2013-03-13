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
import org.openetcs.dsl.expression.StructureExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.dsl.expression.impl.StructureExpressionImpl#getKeyValuePair <em>Key Value Pair</em>}</li>
 *   <li>{@link org.openetcs.dsl.expression.impl.StructureExpressionImpl#getStructuredExpressions <em>Structured Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructureExpressionImpl extends ExpressionImpl implements StructureExpression
{
  /**
   * The cached value of the '{@link #getKeyValuePair() <em>Key Value Pair</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyValuePair()
   * @generated
   * @ordered
   */
  protected KeyValuePair keyValuePair;

  /**
   * The cached value of the '{@link #getStructuredExpressions() <em>Structured Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStructuredExpressions()
   * @generated
   * @ordered
   */
  protected EList<Expression> structuredExpressions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StructureExpressionImpl()
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
    return ExpressionPackage.Literals.STRUCTURE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeyValuePair getKeyValuePair()
  {
    return keyValuePair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKeyValuePair(KeyValuePair newKeyValuePair, NotificationChain msgs)
  {
    KeyValuePair oldKeyValuePair = keyValuePair;
    keyValuePair = newKeyValuePair;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.STRUCTURE_EXPRESSION__KEY_VALUE_PAIR, oldKeyValuePair, newKeyValuePair);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKeyValuePair(KeyValuePair newKeyValuePair)
  {
    if (newKeyValuePair != keyValuePair)
    {
      NotificationChain msgs = null;
      if (keyValuePair != null)
        msgs = ((InternalEObject)keyValuePair).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.STRUCTURE_EXPRESSION__KEY_VALUE_PAIR, null, msgs);
      if (newKeyValuePair != null)
        msgs = ((InternalEObject)newKeyValuePair).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.STRUCTURE_EXPRESSION__KEY_VALUE_PAIR, null, msgs);
      msgs = basicSetKeyValuePair(newKeyValuePair, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.STRUCTURE_EXPRESSION__KEY_VALUE_PAIR, newKeyValuePair, newKeyValuePair));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getStructuredExpressions()
  {
    if (structuredExpressions == null)
    {
      structuredExpressions = new EObjectContainmentEList<Expression>(Expression.class, this, ExpressionPackage.STRUCTURE_EXPRESSION__STRUCTURED_EXPRESSIONS);
    }
    return structuredExpressions;
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
      case ExpressionPackage.STRUCTURE_EXPRESSION__KEY_VALUE_PAIR:
        return basicSetKeyValuePair(null, msgs);
      case ExpressionPackage.STRUCTURE_EXPRESSION__STRUCTURED_EXPRESSIONS:
        return ((InternalEList<?>)getStructuredExpressions()).basicRemove(otherEnd, msgs);
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
      case ExpressionPackage.STRUCTURE_EXPRESSION__KEY_VALUE_PAIR:
        return getKeyValuePair();
      case ExpressionPackage.STRUCTURE_EXPRESSION__STRUCTURED_EXPRESSIONS:
        return getStructuredExpressions();
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
      case ExpressionPackage.STRUCTURE_EXPRESSION__KEY_VALUE_PAIR:
        setKeyValuePair((KeyValuePair)newValue);
        return;
      case ExpressionPackage.STRUCTURE_EXPRESSION__STRUCTURED_EXPRESSIONS:
        getStructuredExpressions().clear();
        getStructuredExpressions().addAll((Collection<? extends Expression>)newValue);
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
      case ExpressionPackage.STRUCTURE_EXPRESSION__KEY_VALUE_PAIR:
        setKeyValuePair((KeyValuePair)null);
        return;
      case ExpressionPackage.STRUCTURE_EXPRESSION__STRUCTURED_EXPRESSIONS:
        getStructuredExpressions().clear();
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
      case ExpressionPackage.STRUCTURE_EXPRESSION__KEY_VALUE_PAIR:
        return keyValuePair != null;
      case ExpressionPackage.STRUCTURE_EXPRESSION__STRUCTURED_EXPRESSIONS:
        return structuredExpressions != null && !structuredExpressions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StructureExpressionImpl
