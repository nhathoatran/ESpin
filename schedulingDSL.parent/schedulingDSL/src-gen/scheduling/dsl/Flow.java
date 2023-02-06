/**
 * generated by Xtext 2.10.0
 */
package scheduling.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scheduling.dsl.Flow#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see scheduling.dsl.DslPackage#getFlow()
 * @model
 * @generated
 */
public interface Flow extends EObject
{
  /**
   * Returns the value of the '<em><b>Event</b></em>' containment reference list.
   * The list contents are of type {@link scheduling.dsl.ENAME}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' containment reference list.
   * @see scheduling.dsl.DslPackage#getFlow_Event()
   * @model containment="true"
   * @generated
   */
  EList<ENAME> getEvent();

} // Flow