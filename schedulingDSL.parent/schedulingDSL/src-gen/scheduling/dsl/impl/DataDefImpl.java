/**
 * generated by Xtext 2.10.0
 */
package scheduling.dsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import scheduling.dsl.DataBlockDef;
import scheduling.dsl.DataDef;
import scheduling.dsl.DataSingleDef;
import scheduling.dsl.DslPackage;
import scheduling.dsl.IfDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scheduling.dsl.impl.DataDefImpl#getIfdef <em>Ifdef</em>}</li>
 *   <li>{@link scheduling.dsl.impl.DataDefImpl#getDatablockdef <em>Datablockdef</em>}</li>
 *   <li>{@link scheduling.dsl.impl.DataDefImpl#getDatasingledef <em>Datasingledef</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataDefImpl extends MinimalEObjectImpl.Container implements DataDef
{
  /**
   * The cached value of the '{@link #getIfdef() <em>Ifdef</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfdef()
   * @generated
   * @ordered
   */
  protected IfDef ifdef;

  /**
   * The cached value of the '{@link #getDatablockdef() <em>Datablockdef</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatablockdef()
   * @generated
   * @ordered
   */
  protected DataBlockDef datablockdef;

  /**
   * The cached value of the '{@link #getDatasingledef() <em>Datasingledef</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatasingledef()
   * @generated
   * @ordered
   */
  protected DataSingleDef datasingledef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataDefImpl()
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
    return DslPackage.eINSTANCE.getDataDef();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IfDef getIfdef()
  {
    return ifdef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfdef(IfDef newIfdef, NotificationChain msgs)
  {
    IfDef oldIfdef = ifdef;
    ifdef = newIfdef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.DATA_DEF__IFDEF, oldIfdef, newIfdef);
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
  public void setIfdef(IfDef newIfdef)
  {
    if (newIfdef != ifdef)
    {
      NotificationChain msgs = null;
      if (ifdef != null)
        msgs = ((InternalEObject)ifdef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.DATA_DEF__IFDEF, null, msgs);
      if (newIfdef != null)
        msgs = ((InternalEObject)newIfdef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.DATA_DEF__IFDEF, null, msgs);
      msgs = basicSetIfdef(newIfdef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.DATA_DEF__IFDEF, newIfdef, newIfdef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataBlockDef getDatablockdef()
  {
    return datablockdef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDatablockdef(DataBlockDef newDatablockdef, NotificationChain msgs)
  {
    DataBlockDef oldDatablockdef = datablockdef;
    datablockdef = newDatablockdef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.DATA_DEF__DATABLOCKDEF, oldDatablockdef, newDatablockdef);
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
  public void setDatablockdef(DataBlockDef newDatablockdef)
  {
    if (newDatablockdef != datablockdef)
    {
      NotificationChain msgs = null;
      if (datablockdef != null)
        msgs = ((InternalEObject)datablockdef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.DATA_DEF__DATABLOCKDEF, null, msgs);
      if (newDatablockdef != null)
        msgs = ((InternalEObject)newDatablockdef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.DATA_DEF__DATABLOCKDEF, null, msgs);
      msgs = basicSetDatablockdef(newDatablockdef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.DATA_DEF__DATABLOCKDEF, newDatablockdef, newDatablockdef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataSingleDef getDatasingledef()
  {
    return datasingledef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDatasingledef(DataSingleDef newDatasingledef, NotificationChain msgs)
  {
    DataSingleDef oldDatasingledef = datasingledef;
    datasingledef = newDatasingledef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.DATA_DEF__DATASINGLEDEF, oldDatasingledef, newDatasingledef);
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
  public void setDatasingledef(DataSingleDef newDatasingledef)
  {
    if (newDatasingledef != datasingledef)
    {
      NotificationChain msgs = null;
      if (datasingledef != null)
        msgs = ((InternalEObject)datasingledef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.DATA_DEF__DATASINGLEDEF, null, msgs);
      if (newDatasingledef != null)
        msgs = ((InternalEObject)newDatasingledef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.DATA_DEF__DATASINGLEDEF, null, msgs);
      msgs = basicSetDatasingledef(newDatasingledef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.DATA_DEF__DATASINGLEDEF, newDatasingledef, newDatasingledef));
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
      case DslPackage.DATA_DEF__IFDEF:
        return basicSetIfdef(null, msgs);
      case DslPackage.DATA_DEF__DATABLOCKDEF:
        return basicSetDatablockdef(null, msgs);
      case DslPackage.DATA_DEF__DATASINGLEDEF:
        return basicSetDatasingledef(null, msgs);
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
      case DslPackage.DATA_DEF__IFDEF:
        return getIfdef();
      case DslPackage.DATA_DEF__DATABLOCKDEF:
        return getDatablockdef();
      case DslPackage.DATA_DEF__DATASINGLEDEF:
        return getDatasingledef();
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
      case DslPackage.DATA_DEF__IFDEF:
        setIfdef((IfDef)newValue);
        return;
      case DslPackage.DATA_DEF__DATABLOCKDEF:
        setDatablockdef((DataBlockDef)newValue);
        return;
      case DslPackage.DATA_DEF__DATASINGLEDEF:
        setDatasingledef((DataSingleDef)newValue);
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
      case DslPackage.DATA_DEF__IFDEF:
        setIfdef((IfDef)null);
        return;
      case DslPackage.DATA_DEF__DATABLOCKDEF:
        setDatablockdef((DataBlockDef)null);
        return;
      case DslPackage.DATA_DEF__DATASINGLEDEF:
        setDatasingledef((DataSingleDef)null);
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
      case DslPackage.DATA_DEF__IFDEF:
        return ifdef != null;
      case DslPackage.DATA_DEF__DATABLOCKDEF:
        return datablockdef != null;
      case DslPackage.DATA_DEF__DATASINGLEDEF:
        return datasingledef != null;
    }
    return super.eIsSet(featureID);
  }

} //DataDefImpl