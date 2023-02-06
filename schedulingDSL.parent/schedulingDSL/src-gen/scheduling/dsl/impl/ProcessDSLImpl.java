/**
 * generated by Xtext 2.10.0
 */
package scheduling.dsl.impl;

import java.lang.String;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import scheduling.dsl.Constraints;
import scheduling.dsl.DslPackage;
import scheduling.dsl.ProcessConfig;
import scheduling.dsl.ProcessDSL;
import scheduling.dsl.ProcessDataDef;
import scheduling.dsl.ProcessDef;
import scheduling.dsl.ProcessInit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process DSL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scheduling.dsl.impl.ProcessDSLImpl#getName <em>Name</em>}</li>
 *   <li>{@link scheduling.dsl.impl.ProcessDSLImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link scheduling.dsl.impl.ProcessDSLImpl#getProcessdata <em>Processdata</em>}</li>
 *   <li>{@link scheduling.dsl.impl.ProcessDSLImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link scheduling.dsl.impl.ProcessDSLImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link scheduling.dsl.impl.ProcessDSLImpl#getProcessconfig <em>Processconfig</em>}</li>
 *   <li>{@link scheduling.dsl.impl.ProcessDSLImpl#getProcessinit <em>Processinit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessDSLImpl extends MinimalEObjectImpl.Container implements ProcessDSL
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getParent() <em>Parent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected static final String PARENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParent() <em>Parent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected String parent = PARENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getProcessdata() <em>Processdata</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessdata()
   * @generated
   * @ordered
   */
  protected ProcessDataDef processdata;

  /**
   * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraints()
   * @generated
   * @ordered
   */
  protected Constraints constraints;

  /**
   * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcess()
   * @generated
   * @ordered
   */
  protected EList<ProcessDef> process;

  /**
   * The cached value of the '{@link #getProcessconfig() <em>Processconfig</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessconfig()
   * @generated
   * @ordered
   */
  protected ProcessConfig processconfig;

  /**
   * The cached value of the '{@link #getProcessinit() <em>Processinit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessinit()
   * @generated
   * @ordered
   */
  protected ProcessInit processinit;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcessDSLImpl()
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
    return DslPackage.eINSTANCE.getProcessDSL();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.PROCESS_DSL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getParent()
  {
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setParent(String newParent)
  {
    String oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.PROCESS_DSL__PARENT, oldParent, parent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProcessDataDef getProcessdata()
  {
    return processdata;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProcessdata(ProcessDataDef newProcessdata, NotificationChain msgs)
  {
    ProcessDataDef oldProcessdata = processdata;
    processdata = newProcessdata;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.PROCESS_DSL__PROCESSDATA, oldProcessdata, newProcessdata);
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
  public void setProcessdata(ProcessDataDef newProcessdata)
  {
    if (newProcessdata != processdata)
    {
      NotificationChain msgs = null;
      if (processdata != null)
        msgs = ((InternalEObject)processdata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.PROCESS_DSL__PROCESSDATA, null, msgs);
      if (newProcessdata != null)
        msgs = ((InternalEObject)newProcessdata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.PROCESS_DSL__PROCESSDATA, null, msgs);
      msgs = basicSetProcessdata(newProcessdata, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.PROCESS_DSL__PROCESSDATA, newProcessdata, newProcessdata));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Constraints getConstraints()
  {
    return constraints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstraints(Constraints newConstraints, NotificationChain msgs)
  {
    Constraints oldConstraints = constraints;
    constraints = newConstraints;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.PROCESS_DSL__CONSTRAINTS, oldConstraints, newConstraints);
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
  public void setConstraints(Constraints newConstraints)
  {
    if (newConstraints != constraints)
    {
      NotificationChain msgs = null;
      if (constraints != null)
        msgs = ((InternalEObject)constraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.PROCESS_DSL__CONSTRAINTS, null, msgs);
      if (newConstraints != null)
        msgs = ((InternalEObject)newConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.PROCESS_DSL__CONSTRAINTS, null, msgs);
      msgs = basicSetConstraints(newConstraints, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.PROCESS_DSL__CONSTRAINTS, newConstraints, newConstraints));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ProcessDef> getProcess()
  {
    if (process == null)
    {
      process = new EObjectContainmentEList<ProcessDef>(ProcessDef.class, this, DslPackage.PROCESS_DSL__PROCESS);
    }
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProcessConfig getProcessconfig()
  {
    return processconfig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProcessconfig(ProcessConfig newProcessconfig, NotificationChain msgs)
  {
    ProcessConfig oldProcessconfig = processconfig;
    processconfig = newProcessconfig;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.PROCESS_DSL__PROCESSCONFIG, oldProcessconfig, newProcessconfig);
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
  public void setProcessconfig(ProcessConfig newProcessconfig)
  {
    if (newProcessconfig != processconfig)
    {
      NotificationChain msgs = null;
      if (processconfig != null)
        msgs = ((InternalEObject)processconfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.PROCESS_DSL__PROCESSCONFIG, null, msgs);
      if (newProcessconfig != null)
        msgs = ((InternalEObject)newProcessconfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.PROCESS_DSL__PROCESSCONFIG, null, msgs);
      msgs = basicSetProcessconfig(newProcessconfig, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.PROCESS_DSL__PROCESSCONFIG, newProcessconfig, newProcessconfig));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProcessInit getProcessinit()
  {
    return processinit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProcessinit(ProcessInit newProcessinit, NotificationChain msgs)
  {
    ProcessInit oldProcessinit = processinit;
    processinit = newProcessinit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.PROCESS_DSL__PROCESSINIT, oldProcessinit, newProcessinit);
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
  public void setProcessinit(ProcessInit newProcessinit)
  {
    if (newProcessinit != processinit)
    {
      NotificationChain msgs = null;
      if (processinit != null)
        msgs = ((InternalEObject)processinit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.PROCESS_DSL__PROCESSINIT, null, msgs);
      if (newProcessinit != null)
        msgs = ((InternalEObject)newProcessinit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.PROCESS_DSL__PROCESSINIT, null, msgs);
      msgs = basicSetProcessinit(newProcessinit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.PROCESS_DSL__PROCESSINIT, newProcessinit, newProcessinit));
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
      case DslPackage.PROCESS_DSL__PROCESSDATA:
        return basicSetProcessdata(null, msgs);
      case DslPackage.PROCESS_DSL__CONSTRAINTS:
        return basicSetConstraints(null, msgs);
      case DslPackage.PROCESS_DSL__PROCESS:
        return ((InternalEList<?>)getProcess()).basicRemove(otherEnd, msgs);
      case DslPackage.PROCESS_DSL__PROCESSCONFIG:
        return basicSetProcessconfig(null, msgs);
      case DslPackage.PROCESS_DSL__PROCESSINIT:
        return basicSetProcessinit(null, msgs);
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
      case DslPackage.PROCESS_DSL__NAME:
        return getName();
      case DslPackage.PROCESS_DSL__PARENT:
        return getParent();
      case DslPackage.PROCESS_DSL__PROCESSDATA:
        return getProcessdata();
      case DslPackage.PROCESS_DSL__CONSTRAINTS:
        return getConstraints();
      case DslPackage.PROCESS_DSL__PROCESS:
        return getProcess();
      case DslPackage.PROCESS_DSL__PROCESSCONFIG:
        return getProcessconfig();
      case DslPackage.PROCESS_DSL__PROCESSINIT:
        return getProcessinit();
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
      case DslPackage.PROCESS_DSL__NAME:
        setName((String)newValue);
        return;
      case DslPackage.PROCESS_DSL__PARENT:
        setParent((String)newValue);
        return;
      case DslPackage.PROCESS_DSL__PROCESSDATA:
        setProcessdata((ProcessDataDef)newValue);
        return;
      case DslPackage.PROCESS_DSL__CONSTRAINTS:
        setConstraints((Constraints)newValue);
        return;
      case DslPackage.PROCESS_DSL__PROCESS:
        getProcess().clear();
        getProcess().addAll((Collection<? extends ProcessDef>)newValue);
        return;
      case DslPackage.PROCESS_DSL__PROCESSCONFIG:
        setProcessconfig((ProcessConfig)newValue);
        return;
      case DslPackage.PROCESS_DSL__PROCESSINIT:
        setProcessinit((ProcessInit)newValue);
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
      case DslPackage.PROCESS_DSL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DslPackage.PROCESS_DSL__PARENT:
        setParent(PARENT_EDEFAULT);
        return;
      case DslPackage.PROCESS_DSL__PROCESSDATA:
        setProcessdata((ProcessDataDef)null);
        return;
      case DslPackage.PROCESS_DSL__CONSTRAINTS:
        setConstraints((Constraints)null);
        return;
      case DslPackage.PROCESS_DSL__PROCESS:
        getProcess().clear();
        return;
      case DslPackage.PROCESS_DSL__PROCESSCONFIG:
        setProcessconfig((ProcessConfig)null);
        return;
      case DslPackage.PROCESS_DSL__PROCESSINIT:
        setProcessinit((ProcessInit)null);
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
      case DslPackage.PROCESS_DSL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DslPackage.PROCESS_DSL__PARENT:
        return PARENT_EDEFAULT == null ? parent != null : !PARENT_EDEFAULT.equals(parent);
      case DslPackage.PROCESS_DSL__PROCESSDATA:
        return processdata != null;
      case DslPackage.PROCESS_DSL__CONSTRAINTS:
        return constraints != null;
      case DslPackage.PROCESS_DSL__PROCESS:
        return process != null && !process.isEmpty();
      case DslPackage.PROCESS_DSL__PROCESSCONFIG:
        return processconfig != null;
      case DslPackage.PROCESS_DSL__PROCESSINIT:
        return processinit != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", parent: ");
    result.append(parent);
    result.append(')');
    return result.toString();
  }

} //ProcessDSLImpl