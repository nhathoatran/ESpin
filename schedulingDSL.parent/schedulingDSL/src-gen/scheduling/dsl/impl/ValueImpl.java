/**
 * generated by Xtext 2.10.0
 */
package scheduling.dsl.impl;

import java.lang.String;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import scheduling.dsl.BoolValue;
import scheduling.dsl.DslPackage;
import scheduling.dsl.ListDef;
import scheduling.dsl.NumValue;
import scheduling.dsl.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scheduling.dsl.impl.ValueImpl#getNum <em>Num</em>}</li>
 *   <li>{@link scheduling.dsl.impl.ValueImpl#getBool <em>Bool</em>}</li>
 *   <li>{@link scheduling.dsl.impl.ValueImpl#getNondef <em>Nondef</em>}</li>
 *   <li>{@link scheduling.dsl.impl.ValueImpl#getList <em>List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueImpl extends MinimalEObjectImpl.Container implements Value
{
  /**
   * The cached value of the '{@link #getNum() <em>Num</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNum()
   * @generated
   * @ordered
   */
  protected NumValue num;

  /**
   * The cached value of the '{@link #getBool() <em>Bool</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBool()
   * @generated
   * @ordered
   */
  protected BoolValue bool;

  /**
   * The default value of the '{@link #getNondef() <em>Nondef</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNondef()
   * @generated
   * @ordered
   */
  protected static final String NONDEF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNondef() <em>Nondef</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNondef()
   * @generated
   * @ordered
   */
  protected String nondef = NONDEF_EDEFAULT;

  /**
   * The cached value of the '{@link #getList() <em>List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getList()
   * @generated
   * @ordered
   */
  protected ListDef list;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValueImpl()
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
    return DslPackage.eINSTANCE.getValue();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NumValue getNum()
  {
    return num;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNum(NumValue newNum, NotificationChain msgs)
  {
    NumValue oldNum = num;
    num = newNum;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.VALUE__NUM, oldNum, newNum);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNum(NumValue newNum)
  {
    if (newNum != num)
    {
      NotificationChain msgs = null;
      if (num != null)
        msgs = ((InternalEObject)num).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.VALUE__NUM, null, msgs);
      if (newNum != null)
        msgs = ((InternalEObject)newNum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.VALUE__NUM, null, msgs);
      msgs = basicSetNum(newNum, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.VALUE__NUM, newNum, newNum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BoolValue getBool()
  {
    return bool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBool(BoolValue newBool, NotificationChain msgs)
  {
    BoolValue oldBool = bool;
    bool = newBool;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.VALUE__BOOL, oldBool, newBool);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBool(BoolValue newBool)
  {
    if (newBool != bool)
    {
      NotificationChain msgs = null;
      if (bool != null)
        msgs = ((InternalEObject)bool).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.VALUE__BOOL, null, msgs);
      if (newBool != null)
        msgs = ((InternalEObject)newBool).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.VALUE__BOOL, null, msgs);
      msgs = basicSetBool(newBool, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.VALUE__BOOL, newBool, newBool));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNondef()
  {
    return nondef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNondef(String newNondef)
  {
    String oldNondef = nondef;
    nondef = newNondef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.VALUE__NONDEF, oldNondef, nondef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ListDef getList()
  {
    return list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetList(ListDef newList, NotificationChain msgs)
  {
    ListDef oldList = list;
    list = newList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.VALUE__LIST, oldList, newList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setList(ListDef newList)
  {
    if (newList != list)
    {
      NotificationChain msgs = null;
      if (list != null)
        msgs = ((InternalEObject)list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.VALUE__LIST, null, msgs);
      if (newList != null)
        msgs = ((InternalEObject)newList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.VALUE__LIST, null, msgs);
      msgs = basicSetList(newList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.VALUE__LIST, newList, newList));
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
      case DslPackage.VALUE__NUM:
        return basicSetNum(null, msgs);
      case DslPackage.VALUE__BOOL:
        return basicSetBool(null, msgs);
      case DslPackage.VALUE__LIST:
        return basicSetList(null, msgs);
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
      case DslPackage.VALUE__NUM:
        return getNum();
      case DslPackage.VALUE__BOOL:
        return getBool();
      case DslPackage.VALUE__NONDEF:
        return getNondef();
      case DslPackage.VALUE__LIST:
        return getList();
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
      case DslPackage.VALUE__NUM:
        setNum((NumValue)newValue);
        return;
      case DslPackage.VALUE__BOOL:
        setBool((BoolValue)newValue);
        return;
      case DslPackage.VALUE__NONDEF:
        setNondef((String)newValue);
        return;
      case DslPackage.VALUE__LIST:
        setList((ListDef)newValue);
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
      case DslPackage.VALUE__NUM:
        setNum((NumValue)null);
        return;
      case DslPackage.VALUE__BOOL:
        setBool((BoolValue)null);
        return;
      case DslPackage.VALUE__NONDEF:
        setNondef(NONDEF_EDEFAULT);
        return;
      case DslPackage.VALUE__LIST:
        setList((ListDef)null);
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
      case DslPackage.VALUE__NUM:
        return num != null;
      case DslPackage.VALUE__BOOL:
        return bool != null;
      case DslPackage.VALUE__NONDEF:
        return NONDEF_EDEFAULT == null ? nondef != null : !NONDEF_EDEFAULT.equals(nondef);
      case DslPackage.VALUE__LIST:
        return list != null;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (nondef: ");
    result.append(nondef);
    result.append(')');
    return result.toString();
  }

} //ValueImpl