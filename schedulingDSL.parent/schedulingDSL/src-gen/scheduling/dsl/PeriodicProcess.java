/**
 * generated by Xtext 2.10.0
 */
package scheduling.dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Periodic Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scheduling.dsl.PeriodicProcess#getElement <em>Element</em>}</li>
 *   <li>{@link scheduling.dsl.PeriodicProcess#getOffset <em>Offset</em>}</li>
 *   <li>{@link scheduling.dsl.PeriodicProcess#getPeriod <em>Period</em>}</li>
 *   <li>{@link scheduling.dsl.PeriodicProcess#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @see scheduling.dsl.DslPackage#getPeriodicProcess()
 * @model
 * @generated
 */
public interface PeriodicProcess extends EObject
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' containment reference.
   * @see #setElement(Element)
   * @see scheduling.dsl.DslPackage#getPeriodicProcess_Element()
   * @model containment="true"
   * @generated
   */
  Element getElement();

  /**
   * Sets the value of the '{@link scheduling.dsl.PeriodicProcess#getElement <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' containment reference.
   * @see #getElement()
   * @generated
   */
  void setElement(Element value);

  /**
   * Returns the value of the '<em><b>Offset</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Offset</em>' containment reference.
   * @see #setOffset(NumValue)
   * @see scheduling.dsl.DslPackage#getPeriodicProcess_Offset()
   * @model containment="true"
   * @generated
   */
  NumValue getOffset();

  /**
   * Sets the value of the '{@link scheduling.dsl.PeriodicProcess#getOffset <em>Offset</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Offset</em>' containment reference.
   * @see #getOffset()
   * @generated
   */
  void setOffset(NumValue value);

  /**
   * Returns the value of the '<em><b>Period</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Period</em>' containment reference.
   * @see #setPeriod(NumValue)
   * @see scheduling.dsl.DslPackage#getPeriodicProcess_Period()
   * @model containment="true"
   * @generated
   */
  NumValue getPeriod();

  /**
   * Sets the value of the '{@link scheduling.dsl.PeriodicProcess#getPeriod <em>Period</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Period</em>' containment reference.
   * @see #getPeriod()
   * @generated
   */
  void setPeriod(NumValue value);

  /**
   * Returns the value of the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max</em>' attribute.
   * @see #setMax(int)
   * @see scheduling.dsl.DslPackage#getPeriodicProcess_Max()
   * @model
   * @generated
   */
  int getMax();

  /**
   * Sets the value of the '{@link scheduling.dsl.PeriodicProcess#getMax <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max</em>' attribute.
   * @see #getMax()
   * @generated
   */
  void setMax(int value);

} // PeriodicProcess
