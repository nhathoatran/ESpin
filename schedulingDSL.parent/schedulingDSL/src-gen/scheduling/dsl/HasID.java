/**
 * generated by Xtext 2.10.0
 */
package scheduling.dsl;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has ID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scheduling.dsl.HasID#getProc <em>Proc</em>}</li>
 *   <li>{@link scheduling.dsl.HasID#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see scheduling.dsl.DslPackage#getHasID()
 * @model
 * @generated
 */
public interface HasID extends Expression
{
  /**
   * Returns the value of the '<em><b>Proc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Proc</em>' containment reference.
   * @see #setProc(scheduling.dsl.Process)
   * @see scheduling.dsl.DslPackage#getHasID_Proc()
   * @model containment="true"
   * @generated
   */
  scheduling.dsl.Process getProc();

  /**
   * Sets the value of the '{@link scheduling.dsl.HasID#getProc <em>Proc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Proc</em>' containment reference.
   * @see #getProc()
   * @generated
   */
  void setProc(scheduling.dsl.Process value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see scheduling.dsl.DslPackage#getHasID_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link scheduling.dsl.HasID#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

} // HasID