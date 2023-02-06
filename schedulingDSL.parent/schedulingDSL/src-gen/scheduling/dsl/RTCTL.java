/**
 * generated by Xtext 2.10.0
 */
package scheduling.dsl;

import java.lang.String;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RTCTL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scheduling.dsl.RTCTL#getOp <em>Op</em>}</li>
 *   <li>{@link scheduling.dsl.RTCTL#getExp <em>Exp</em>}</li>
 *   <li>{@link scheduling.dsl.RTCTL#getF <em>F</em>}</li>
 *   <li>{@link scheduling.dsl.RTCTL#getF1 <em>F1</em>}</li>
 *   <li>{@link scheduling.dsl.RTCTL#getF2 <em>F2</em>}</li>
 *   <li>{@link scheduling.dsl.RTCTL#getLte <em>Lte</em>}</li>
 * </ul>
 *
 * @see scheduling.dsl.DslPackage#getRTCTL()
 * @model
 * @generated
 */
public interface RTCTL extends EObject
{
  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see scheduling.dsl.DslPackage#getRTCTL_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link scheduling.dsl.RTCTL#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Expression)
   * @see scheduling.dsl.DslPackage#getRTCTL_Exp()
   * @model containment="true"
   * @generated
   */
  Expression getExp();

  /**
   * Sets the value of the '{@link scheduling.dsl.RTCTL#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Expression value);

  /**
   * Returns the value of the '<em><b>F</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>F</em>' containment reference.
   * @see #setF(RTCTL)
   * @see scheduling.dsl.DslPackage#getRTCTL_F()
   * @model containment="true"
   * @generated
   */
  RTCTL getF();

  /**
   * Sets the value of the '{@link scheduling.dsl.RTCTL#getF <em>F</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>F</em>' containment reference.
   * @see #getF()
   * @generated
   */
  void setF(RTCTL value);

  /**
   * Returns the value of the '<em><b>F1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>F1</em>' containment reference.
   * @see #setF1(RTCTL)
   * @see scheduling.dsl.DslPackage#getRTCTL_F1()
   * @model containment="true"
   * @generated
   */
  RTCTL getF1();

  /**
   * Sets the value of the '{@link scheduling.dsl.RTCTL#getF1 <em>F1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>F1</em>' containment reference.
   * @see #getF1()
   * @generated
   */
  void setF1(RTCTL value);

  /**
   * Returns the value of the '<em><b>F2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>F2</em>' containment reference.
   * @see #setF2(RTCTL)
   * @see scheduling.dsl.DslPackage#getRTCTL_F2()
   * @model containment="true"
   * @generated
   */
  RTCTL getF2();

  /**
   * Sets the value of the '{@link scheduling.dsl.RTCTL#getF2 <em>F2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>F2</em>' containment reference.
   * @see #getF2()
   * @generated
   */
  void setF2(RTCTL value);

  /**
   * Returns the value of the '<em><b>Lte</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lte</em>' containment reference.
   * @see #setLte(LTE)
   * @see scheduling.dsl.DslPackage#getRTCTL_Lte()
   * @model containment="true"
   * @generated
   */
  LTE getLte();

  /**
   * Sets the value of the '{@link scheduling.dsl.RTCTL#getLte <em>Lte</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lte</em>' containment reference.
   * @see #getLte()
   * @generated
   */
  void setLte(LTE value);

} // RTCTL
