/**
 * <copyright>
 *
 * Copyright (c) 2002-2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: XSDAnnotation.java,v 1.1 2004/03/06 18:00:10 marcelop Exp $
 */
package org.eclipse.xsd;


import java.util.Set;

import org.w3c.dom.Element;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object 
 * '<a href="http://www.w3.org/TR/xmlschema-1/#cAnnotations"><em><b>Annotation</b></em></a>'.
 * Access to the contents of an annotation is provided via their DOM representation.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xsd.XSDAnnotation#getApplicationInformation <em>Application Information</em>}</li>
 *   <li>{@link org.eclipse.xsd.XSDAnnotation#getUserInformation <em>User Information</em>}</li>
 *   <li>{@link org.eclipse.xsd.XSDAnnotation#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xsd.XSDPackage#getXSDAnnotation()
 * @model 
 * @generated
 */
public interface XSDAnnotation extends XSDComponent, XSDRedefineContent
{
  /**
   * Returns the value of the '<em><b>Application Information</b></em>' attribute list.
   * The list contents are of type {@link org.w3c.dom.Element}.
   * <!-- begin-user-doc -->
   * <p>
   * This represents the 
   * <a href="http://www.w3.org/TR/xmlschema-1/#application_information">application information</a>
   * infoset property,
   * i.e., a list of <a href="http://www.w3.org/TR/xmlschema-1/#element-appinfo">appinfo</a> elements.
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Application Information</em>' attribute list.
   * @see org.eclipse.xsd.XSDPackage#getXSDAnnotation_ApplicationInformation()
   * @model type="org.w3c.dom.Element" dataType="org.eclipse.xsd.DOMElement"
   * @generated
   */
  EList getApplicationInformation();

  /**
   * Returns the value of the '<em><b>User Information</b></em>' attribute list.
   * The list contents are of type {@link org.w3c.dom.Element}.
   * <!-- begin-user-doc -->
   * <p>
   * This represents the 
   * <a href="http://www.w3.org/TR/xmlschema-1/#user_information">user information</a>
   * infoset property,
   * i.e., a list of <a href="http://www.w3.org/TR/xmlschema-1/#element-documentation">documentation</a> elements.
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>User Information</em>' attribute list.
   * @see org.eclipse.xsd.XSDPackage#getXSDAnnotation_UserInformation()
   * @model type="org.w3c.dom.Element" dataType="org.eclipse.xsd.DOMElement"
   * @generated
   */
  EList getUserInformation();

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' attribute list.
   * The list contents are of type {@link org.w3c.dom.Attr}.
   * <!-- begin-user-doc -->
   * <p>
   * This represents the 
   * <a href="http://www.w3.org/TR/xmlschema-1/#attributes">attributes</a>
   * infoset property.
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' attribute list.
   * @see org.eclipse.xsd.XSDPackage#getXSDAnnotation_Attributes()
   * @model type="org.w3c.dom.Attr" dataType="org.eclipse.xsd.DOMAttr"
   * @generated
   */
  EList getAttributes();

  /**
   * Creates a new appinfo element using the containing schema's document as the factory.
   * The caller is responsible for adding the appinfo element to annotation element.
   * @param sourceURI the initial value of the source attribute.
   * @return a new appinfo element.
   */
  Element createApplicationInformation(String sourceURI);

  /**
   * This creates a new documentation element using the containing schema's document as the factory.
   * The caller is responsible for adding the documentation element to annotation element.
   * @param sourceURI the initial value of the source attribute.
   * @return a new documentation element.
   */
  Element createUserInformation(String sourceURI);

  /**
   * Returns only those elements returned by {@link #getApplicationInformation()} with the given sourceURI;
   * a null sourceURI matches elements without a source attribute.
   * @param sourceURI the source URI to match.
   * @return the elements with the given sourceURI.
   */
  EList getApplicationInformation(String sourceURI);

  /**
   * Returns only those elements returned by {@link #getUserInformation()} with the given sourceURI;
   * a null sourceURI matches elements without a source attribute.
   * @param sourceURI the source URI to match.
   * @return the elements with the given sourceURI.
   */
  EList getUserInformation(String sourceURI);

  /**
   * Returns the set of source attribute values of all the appinfo elements.
   * @return the set of source attribute values of all the appinfo elements.
   */
  Set getApplicationInformationSources();

  /**
   * Returns the set of source attribute values of all the documentation elements.
   * @return the set of source attribute values of all the documentation elements.
   */
  Set getUserInformationSources();
}
