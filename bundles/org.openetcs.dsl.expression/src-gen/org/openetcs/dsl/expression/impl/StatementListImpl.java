/**
 */
package org.openetcs.dsl.expression.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openetcs.dsl.expression.ExpressionPackage;
import org.openetcs.dsl.expression.Statement;
import org.openetcs.dsl.expression.StatementList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.dsl.expression.impl.StatementListImpl#getHead <em>Head</em>}</li>
 *   <li>{@link org.openetcs.dsl.expression.impl.StatementListImpl#getTail <em>Tail</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatementListImpl extends PhraseImpl implements StatementList
{
  /**
   * The cached value of the '{@link #getHead() <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHead()
   * @generated
   * @ordered
   */
  protected Statement head;

  /**
   * The cached value of the '{@link #getTail() <em>Tail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTail()
   * @generated
   * @ordered
   */
  protected StatementList tail;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatementListImpl()
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
    return ExpressionPackage.Literals.STATEMENT_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getHead()
  {
    return head;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHead(Statement newHead, NotificationChain msgs)
  {
    Statement oldHead = head;
    head = newHead;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.STATEMENT_LIST__HEAD, oldHead, newHead);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHead(Statement newHead)
  {
    if (newHead != head)
    {
      NotificationChain msgs = null;
      if (head != null)
        msgs = ((InternalEObject)head).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.STATEMENT_LIST__HEAD, null, msgs);
      if (newHead != null)
        msgs = ((InternalEObject)newHead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.STATEMENT_LIST__HEAD, null, msgs);
      msgs = basicSetHead(newHead, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.STATEMENT_LIST__HEAD, newHead, newHead));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementList getTail()
  {
    return tail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTail(StatementList newTail, NotificationChain msgs)
  {
    StatementList oldTail = tail;
    tail = newTail;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.STATEMENT_LIST__TAIL, oldTail, newTail);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTail(StatementList newTail)
  {
    if (newTail != tail)
    {
      NotificationChain msgs = null;
      if (tail != null)
        msgs = ((InternalEObject)tail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.STATEMENT_LIST__TAIL, null, msgs);
      if (newTail != null)
        msgs = ((InternalEObject)newTail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.STATEMENT_LIST__TAIL, null, msgs);
      msgs = basicSetTail(newTail, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.STATEMENT_LIST__TAIL, newTail, newTail));
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
      case ExpressionPackage.STATEMENT_LIST__HEAD:
        return basicSetHead(null, msgs);
      case ExpressionPackage.STATEMENT_LIST__TAIL:
        return basicSetTail(null, msgs);
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
      case ExpressionPackage.STATEMENT_LIST__HEAD:
        return getHead();
      case ExpressionPackage.STATEMENT_LIST__TAIL:
        return getTail();
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
      case ExpressionPackage.STATEMENT_LIST__HEAD:
        setHead((Statement)newValue);
        return;
      case ExpressionPackage.STATEMENT_LIST__TAIL:
        setTail((StatementList)newValue);
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
      case ExpressionPackage.STATEMENT_LIST__HEAD:
        setHead((Statement)null);
        return;
      case ExpressionPackage.STATEMENT_LIST__TAIL:
        setTail((StatementList)null);
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
      case ExpressionPackage.STATEMENT_LIST__HEAD:
        return head != null;
      case ExpressionPackage.STATEMENT_LIST__TAIL:
        return tail != null;
    }
    return super.eIsSet(featureID);
  }

} //StatementListImpl
