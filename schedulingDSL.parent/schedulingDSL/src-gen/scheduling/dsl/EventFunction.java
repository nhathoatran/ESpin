/**
 * generated by Xtext 2.10.0
 */
package scheduling.dsl;

import java.lang.String;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scheduling.dsl.EventFunction#getName <em>Name</em>}</li>
 *   <li>{@link scheduling.dsl.EventFunction#getFuncpara <em>Funcpara</em>}</li>
 * </ul>
 *
 * @see scheduling.dsl.DslPackage#getEventFunction()
 * @model
 * @generated
 */
public interface EventFunction extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see scheduling.dsl.DslPackage#getEventFunction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link scheduling.dsl.EventFunction#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Funcpara</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Funcpara</em>' containment reference.
   * @see #setFuncpara(ParaListItem)
   * @see scheduling.dsl.DslPackage#getEventFunction_Funcpara()
   * @model containment="true"
   * @generated
   */
  ParaListItem getFuncpara();

  /**
   * Sets the value of the '{@link scheduling.dsl.EventFunction#getFuncpara <em>Funcpara</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Funcpara</em>' containment reference.
   * @see #getFuncpara()
   * @generated
   */
  void setFuncpara(ParaListItem value);

} // EventFunction
