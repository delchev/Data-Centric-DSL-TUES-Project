/**
 */
package org.dataCentricDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Print Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.dataCentricDSL.PrintFunction#getPrintParam <em>Print Param</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.dataCentricDSL.DataCentricDSLPackage#getPrintFunction()
 * @model
 * @generated
 */
public interface PrintFunction extends SimpleStatement
{
  /**
   * Returns the value of the '<em><b>Print Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Print Param</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Print Param</em>' containment reference.
   * @see #setPrintParam(PrintParam)
   * @see org.dataCentricDSL.DataCentricDSLPackage#getPrintFunction_PrintParam()
   * @model containment="true"
   * @generated
   */
  PrintParam getPrintParam();

  /**
   * Sets the value of the '{@link org.dataCentricDSL.PrintFunction#getPrintParam <em>Print Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Print Param</em>' containment reference.
   * @see #getPrintParam()
   * @generated
   */
  void setPrintParam(PrintParam value);

} // PrintFunction