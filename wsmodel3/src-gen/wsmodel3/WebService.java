/**
 */
package wsmodel3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wsmodel3.WebService#getRest <em>Rest</em>}</li>
 *   <li>{@link wsmodel3.WebService#getWebserver <em>Webserver</em>}</li>
 *   <li>{@link wsmodel3.WebService#getDbserver <em>Dbserver</em>}</li>
 * </ul>
 *
 * @see wsmodel3.Wsmodel3Package#getWebService()
 * @model
 * @generated
 */
public interface WebService extends EObject {
	/**
	 * Returns the value of the '<em><b>Rest</b></em>' containment reference list.
	 * The list contents are of type {@link wsmodel3.REST}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rest</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest</em>' containment reference list.
	 * @see wsmodel3.Wsmodel3Package#getWebService_Rest()
	 * @model containment="true"
	 * @generated
	 */
	EList<REST> getRest();

	/**
	 * Returns the value of the '<em><b>Webserver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Webserver</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Webserver</em>' reference.
	 * @see #setWebserver(WebServer)
	 * @see wsmodel3.Wsmodel3Package#getWebService_Webserver()
	 * @model required="true"
	 * @generated
	 */
	WebServer getWebserver();

	/**
	 * Sets the value of the '{@link wsmodel3.WebService#getWebserver <em>Webserver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Webserver</em>' reference.
	 * @see #getWebserver()
	 * @generated
	 */
	void setWebserver(WebServer value);

	/**
	 * Returns the value of the '<em><b>Dbserver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dbserver</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbserver</em>' reference.
	 * @see #setDbserver(DBServer)
	 * @see wsmodel3.Wsmodel3Package#getWebService_Dbserver()
	 * @model required="true"
	 * @generated
	 */
	DBServer getDbserver();

	/**
	 * Sets the value of the '{@link wsmodel3.WebService#getDbserver <em>Dbserver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbserver</em>' reference.
	 * @see #getDbserver()
	 * @generated
	 */
	void setDbserver(DBServer value);

} // WebService
