/**
 * generated by Xtext 2.10.0
 */
package scheduling.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Dec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scheduling.dsl.VarDec#getType <em>Type</em>}</li>
 *   <li>{@link scheduling.dsl.VarDec#getEnumtype <em>Enumtype</em>}</li>
 *   <li>{@link scheduling.dsl.VarDec#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see scheduling.dsl.DslPackage#getVarDec()
 * @model
 * @generated
 */
public interface VarDec extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link scheduling.dsl.TypeName}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see scheduling.dsl.TypeName
   * @see #setType(TypeName)
   * @see scheduling.dsl.DslPackage#getVarDec_Type()
   * @model
   * @generated
   */
  TypeName getType();

  /**
   * Sets the value of the '{@link scheduling.dsl.VarDec#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see scheduling.dsl.TypeName
   * @see #getType()
   * @generated
   */
  void setType(TypeName value);

  /**
   * Returns the value of the '<em><b>Enumtype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enumtype</em>' reference.
   * @see #setEnumtype(EnumType)
   * @see scheduling.dsl.DslPackage#getVarDec_Enumtype()
   * @model
   * @generated
   */
  EnumType getEnumtype();

  /**
   * Sets the value of the '{@link scheduling.dsl.VarDec#getEnumtype <em>Enumtype</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enumtype</em>' reference.
   * @see #getEnumtype()
   * @generated
   */
  void setEnumtype(EnumType value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference list.
   * The list contents are of type {@link scheduling.dsl.VDec}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference list.
   * @see scheduling.dsl.DslPackage#getVarDec_Name()
   * @model containment="true"
   * @generated
   */
  EList<VDec> getName();

} // VarDec
