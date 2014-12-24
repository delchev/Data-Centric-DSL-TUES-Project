/**
 */
package org.dataCentricDSL.impl;

import org.dataCentricDSL.DataCentricDSLPackage;
import org.dataCentricDSL.Print;
import org.dataCentricDSL.Query;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.dataCentricDSL.impl.QueryImpl#getPrintValue <em>Print Value</em>}</li>
 *   <li>{@link org.dataCentricDSL.impl.QueryImpl#getQueryValue <em>Query Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryImpl extends SimpleStatementImpl implements Query
{
  /**
   * The default value of the '{@link #getPrintValue() <em>Print Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrintValue()
   * @generated
   * @ordered
   */
  protected static final String PRINT_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrintValue() <em>Print Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrintValue()
   * @generated
   * @ordered
   */
  protected String printValue = PRINT_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getQueryValue() <em>Query Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQueryValue()
   * @generated
   * @ordered
   */
  protected static final String QUERY_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQueryValue() <em>Query Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQueryValue()
   * @generated
   * @ordered
   */
  protected String queryValue = QUERY_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QueryImpl()
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
    return DataCentricDSLPackage.Literals.QUERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrintValue()
  {
    return printValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrintValue(String newPrintValue)
  {
    String oldPrintValue = printValue;
    printValue = newPrintValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.QUERY__PRINT_VALUE, oldPrintValue, printValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getQueryValue()
  {
    return queryValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQueryValue(String newQueryValue)
  {
    String oldQueryValue = queryValue;
    queryValue = newQueryValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataCentricDSLPackage.QUERY__QUERY_VALUE, oldQueryValue, queryValue));
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
      case DataCentricDSLPackage.QUERY__PRINT_VALUE:
        return getPrintValue();
      case DataCentricDSLPackage.QUERY__QUERY_VALUE:
        return getQueryValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DataCentricDSLPackage.QUERY__PRINT_VALUE:
        setPrintValue((String)newValue);
        return;
      case DataCentricDSLPackage.QUERY__QUERY_VALUE:
        setQueryValue((String)newValue);
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
      case DataCentricDSLPackage.QUERY__PRINT_VALUE:
        setPrintValue(PRINT_VALUE_EDEFAULT);
        return;
      case DataCentricDSLPackage.QUERY__QUERY_VALUE:
        setQueryValue(QUERY_VALUE_EDEFAULT);
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
      case DataCentricDSLPackage.QUERY__PRINT_VALUE:
        return PRINT_VALUE_EDEFAULT == null ? printValue != null : !PRINT_VALUE_EDEFAULT.equals(printValue);
      case DataCentricDSLPackage.QUERY__QUERY_VALUE:
        return QUERY_VALUE_EDEFAULT == null ? queryValue != null : !QUERY_VALUE_EDEFAULT.equals(queryValue);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Print.class)
    {
      switch (derivedFeatureID)
      {
        case DataCentricDSLPackage.QUERY__PRINT_VALUE: return DataCentricDSLPackage.PRINT__PRINT_VALUE;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Print.class)
    {
      switch (baseFeatureID)
      {
        case DataCentricDSLPackage.PRINT__PRINT_VALUE: return DataCentricDSLPackage.QUERY__PRINT_VALUE;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (printValue: ");
    result.append(printValue);
    result.append(", queryValue: ");
    result.append(queryValue);
    result.append(')');
    return result.toString();
  }

} //QueryImpl
