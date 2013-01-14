/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.cdt.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;
import org.openhealthtools.mdht.uml.cda.cdt.LevelTwoConformance;
import org.openhealthtools.mdht.uml.cda.cdt.operations.LevelTwoConformanceOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Level Two Conformance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LevelTwoConformanceImpl extends LevelOneConformanceImpl implements LevelTwoConformance {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected LevelTwoConformanceImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return CDTPackage.Literals.LEVEL_TWO_CONFORMANCE;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public boolean validateLevelOneConformanceTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LevelTwoConformanceOperations.validateLevelOneConformanceTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public LevelTwoConformance init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LevelTwoConformance init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // LevelTwoConformanceImpl
