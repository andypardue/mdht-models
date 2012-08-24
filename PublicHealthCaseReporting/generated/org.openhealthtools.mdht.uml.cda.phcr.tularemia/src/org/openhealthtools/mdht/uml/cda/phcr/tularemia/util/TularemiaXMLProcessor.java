/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.tularemia.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TularemiaXMLProcessor extends XMLProcessor {

	/**
   * Public constructor to instantiate the helper.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TularemiaXMLProcessor() {
    super((EPackage.Registry.INSTANCE));
    TularemiaPackage.eINSTANCE.eClass();
  }
	
	/**
   * Register for "*" and "xml" file extensions the TularemiaResourceFactoryImpl factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
    if (registrations == null)
    {
      super.getRegistrations();
      registrations.put(XML_EXTENSION, new TularemiaResourceFactoryImpl());
      registrations.put(STAR_EXTENSION, new TularemiaResourceFactoryImpl());
    }
    return registrations;
  }

} //TularemiaXMLProcessor
