/**
 * Copyright (C) 2009, OFFIS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * This software and supporting documentation were developed by
 * 
 *   OFFIS e.V.
 *   Escherweg 2, 26121 Oldenburg
 *  
 * THIS SOFTWARE IS MADE AVAILABLE,  AS IS,  AND OFFIS 
 * MAKES NO  WARRANTY REGARDING  THE  SOFTWARE,  ITS  PERFORMANCE,  ITS  
 * MERCHANTABILITY  OR FITNESS FOR ANY PARTICULAR USE, FREEDOM FROM ANY 
 * COMPUTER DISEASES  OR ITS CONFORMITY TO ANY SPECIFICATION. THE ENTIRE RISK 
 * AS TO QUALITY AND PERFORMANCE OF THE SOFTWARE IS WITH THE USER.
 *  
 * Author:  "Myriam Lipprandt <myriam.lipprandt@offis.de>", OFFIS e.V.
 * Date: 2011-12-14
 * 
 */
package org.openhealthtools.mdht.uml.cda.phmr.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.impl.ProductInstanceImpl;

import org.openhealthtools.mdht.uml.cda.phmr.PHMRProductInstance;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrPackage;

import org.openhealthtools.mdht.uml.cda.phmr.operations.PHMRProductInstanceOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PHMR Product Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PHMRProductInstanceImpl extends ProductInstanceImpl implements PHMRProductInstance {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PHMRProductInstanceImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return PhmrPackage.Literals.PHMR_PRODUCT_INSTANCE;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validatePHMRProductInstanceCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PHMRProductInstanceOperations.validatePHMRProductInstanceCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validatePHMRProductInstanceId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PHMRProductInstanceOperations.validatePHMRProductInstanceId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public boolean validatePHMRProductInstanceScopingEntity(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PHMRProductInstanceOperations.validatePHMRProductInstanceScopingEntity(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public boolean validatePHMRProductInstancePlayingDevice(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PHMRProductInstanceOperations.validatePHMRProductInstancePlayingDevice(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validateProductInstanceTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PHMRProductInstanceOperations.validateProductInstanceTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public PHMRProductInstance init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public PHMRProductInstance init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //PHMRProductInstanceImpl
