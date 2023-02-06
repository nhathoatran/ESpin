/**
 * generated by Xtext 2.10.0
 */
package scheduling.dsl;

import java.lang.String;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chan Dec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scheduling.dsl.ChanDec#getCname <em>Cname</em>}</li>
 *   <li>{@link scheduling.dsl.ChanDec#getIvalue <em>Ivalue</em>}</li>
 *   <li>{@link scheduling.dsl.ChanDec#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see scheduling.dsl.DslPackage#getChanDec()
 * @model
 * @generated
 */
public interface ChanDec extends EObject
{
  /**
   * Returns the value of the '<em><b>Cname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cname</em>' attribute.
   * @see #setCname(String)
   * @see scheduling.dsl.DslPackage#getChanDec_Cname()
   * @model
   * @generated
   */
  String getCname();

  /**
   * Sets the value of the '{@link scheduling.dsl.ChanDec#getCname <em>Cname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cname</em>' attribute.
   * @see #getCname()
   * @generated
   */
  void setCname(String value);

  /**
   * Returns the value of the '<em><b>Ivalue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ivalue</em>' containment reference.
   * @see #setIvalue(NumValue)
   * @see scheduling.dsl.DslPackage#getChanDec_Ivalue()
   * @model containment="true"
   * @generated
   */
  NumValue getIvalue();

  /**
   * Sets the value of the '{@link scheduling.dsl.ChanDec#getIvalue <em>Ivalue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ivalue</em>' containment reference.
   * @see #getIvalue()
   * @generated
   */
  void setIvalue(NumValue value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link scheduling.dsl.TypeName}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see scheduling.dsl.TypeName
   * @see #setType(TypeName)
   * @see scheduling.dsl.DslPackage#getChanDec_Type()
   * @model
   * @generated
   */
  TypeName getType();

  /**
   * Sets the value of the '{@link scheduling.dsl.ChanDec#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see scheduling.dsl.TypeName
   * @see #getType()
   * @generated
   */
  void setType(TypeName value);

} // ChanDec