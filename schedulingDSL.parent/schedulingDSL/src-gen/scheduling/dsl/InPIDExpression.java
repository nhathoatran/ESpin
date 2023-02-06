/**
 * generated by Xtext 2.10.0
 */
package scheduling.dsl;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In PID Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scheduling.dsl.InPIDExpression#getCol <em>Col</em>}</li>
 *   <li>{@link scheduling.dsl.InPIDExpression#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see scheduling.dsl.DslPackage#getInPIDExpression()
 * @model
 * @generated
 */
public interface InPIDExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Col</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Col</em>' containment reference.
   * @see #setCol(SchedulerSet)
   * @see scheduling.dsl.DslPackage#getInPIDExpression_Col()
   * @model containment="true"
   * @generated
   */
  SchedulerSet getCol();

  /**
   * Sets the value of the '{@link scheduling.dsl.InPIDExpression#getCol <em>Col</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Col</em>' containment reference.
   * @see #getCol()
   * @generated
   */
  void setCol(SchedulerSet value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see scheduling.dsl.DslPackage#getInPIDExpression_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link scheduling.dsl.InPIDExpression#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

} // InPIDExpression