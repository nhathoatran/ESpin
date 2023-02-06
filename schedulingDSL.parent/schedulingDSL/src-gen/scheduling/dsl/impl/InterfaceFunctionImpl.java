/**
 * generated by Xtext 2.10.0
 */
package scheduling.dsl.impl;

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

import scheduling.dsl.DslPackage;
import scheduling.dsl.FunctionName;
import scheduling.dsl.InterfaceFunction;
import scheduling.dsl.InterfaceParameterList;
import scheduling.dsl.Stm;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scheduling.dsl.impl.InterfaceFunctionImpl#getFunctionname <em>Functionname</em>}</li>
 *   <li>{@link scheduling.dsl.impl.InterfaceFunctionImpl#getParameterlist <em>Parameterlist</em>}</li>
 *   <li>{@link scheduling.dsl.impl.InterfaceFunctionImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceFunctionImpl extends MinimalEObjectImpl.Container implements InterfaceFunction
{
  /**
   * The cached value of the '{@link #getFunctionname() <em>Functionname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionname()
   * @generated
   * @ordered
   */
  protected FunctionName functionname;

  /**
   * The cached value of the '{@link #getParameterlist() <em>Parameterlist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterlist()
   * @generated
   * @ordered
   */
  protected InterfaceParameterList parameterlist;

  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<Stm> statements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InterfaceFunctionImpl()
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
    return DslPackage.eINSTANCE.getInterfaceFunction();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FunctionName getFunctionname()
  {
    return functionname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunctionname(FunctionName newFunctionname, NotificationChain msgs)
  {
    FunctionName oldFunctionname = functionname;
    functionname = newFunctionname;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.INTERFACE_FUNCTION__FUNCTIONNAME, oldFunctionname, newFunctionname);
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
  public void setFunctionname(FunctionName newFunctionname)
  {
    if (newFunctionname != functionname)
    {
      NotificationChain msgs = null;
      if (functionname != null)
        msgs = ((InternalEObject)functionname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.INTERFACE_FUNCTION__FUNCTIONNAME, null, msgs);
      if (newFunctionname != null)
        msgs = ((InternalEObject)newFunctionname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.INTERFACE_FUNCTION__FUNCTIONNAME, null, msgs);
      msgs = basicSetFunctionname(newFunctionname, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.INTERFACE_FUNCTION__FUNCTIONNAME, newFunctionname, newFunctionname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InterfaceParameterList getParameterlist()
  {
    return parameterlist;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameterlist(InterfaceParameterList newParameterlist, NotificationChain msgs)
  {
    InterfaceParameterList oldParameterlist = parameterlist;
    parameterlist = newParameterlist;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.INTERFACE_FUNCTION__PARAMETERLIST, oldParameterlist, newParameterlist);
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
  public void setParameterlist(InterfaceParameterList newParameterlist)
  {
    if (newParameterlist != parameterlist)
    {
      NotificationChain msgs = null;
      if (parameterlist != null)
        msgs = ((InternalEObject)parameterlist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.INTERFACE_FUNCTION__PARAMETERLIST, null, msgs);
      if (newParameterlist != null)
        msgs = ((InternalEObject)newParameterlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.INTERFACE_FUNCTION__PARAMETERLIST, null, msgs);
      msgs = basicSetParameterlist(newParameterlist, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.INTERFACE_FUNCTION__PARAMETERLIST, newParameterlist, newParameterlist));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Stm> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<Stm>(Stm.class, this, DslPackage.INTERFACE_FUNCTION__STATEMENTS);
    }
    return statements;
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
      case DslPackage.INTERFACE_FUNCTION__FUNCTIONNAME:
        return basicSetFunctionname(null, msgs);
      case DslPackage.INTERFACE_FUNCTION__PARAMETERLIST:
        return basicSetParameterlist(null, msgs);
      case DslPackage.INTERFACE_FUNCTION__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
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
      case DslPackage.INTERFACE_FUNCTION__FUNCTIONNAME:
        return getFunctionname();
      case DslPackage.INTERFACE_FUNCTION__PARAMETERLIST:
        return getParameterlist();
      case DslPackage.INTERFACE_FUNCTION__STATEMENTS:
        return getStatements();
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
      case DslPackage.INTERFACE_FUNCTION__FUNCTIONNAME:
        setFunctionname((FunctionName)newValue);
        return;
      case DslPackage.INTERFACE_FUNCTION__PARAMETERLIST:
        setParameterlist((InterfaceParameterList)newValue);
        return;
      case DslPackage.INTERFACE_FUNCTION__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends Stm>)newValue);
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
      case DslPackage.INTERFACE_FUNCTION__FUNCTIONNAME:
        setFunctionname((FunctionName)null);
        return;
      case DslPackage.INTERFACE_FUNCTION__PARAMETERLIST:
        setParameterlist((InterfaceParameterList)null);
        return;
      case DslPackage.INTERFACE_FUNCTION__STATEMENTS:
        getStatements().clear();
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
      case DslPackage.INTERFACE_FUNCTION__FUNCTIONNAME:
        return functionname != null;
      case DslPackage.INTERFACE_FUNCTION__PARAMETERLIST:
        return parameterlist != null;
      case DslPackage.INTERFACE_FUNCTION__STATEMENTS:
        return statements != null && !statements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InterfaceFunctionImpl