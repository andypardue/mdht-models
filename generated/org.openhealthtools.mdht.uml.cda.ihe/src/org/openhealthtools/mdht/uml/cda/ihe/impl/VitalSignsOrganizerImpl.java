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
package org.openhealthtools.mdht.uml.cda.ihe.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignObservation;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.ihe.operations.VitalSignsOrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vital Signs Organizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class VitalSignsOrganizerImpl extends org.openhealthtools.mdht.uml.cda.ccd.impl.VitalSignsOrganizerImpl
		implements VitalSignsOrganizer {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected VitalSignsOrganizerImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.VITAL_SIGNS_ORGANIZER;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateIHEVitalSignsOrganizerRequireResultsOrganizerTemplateID(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateIHEVitalSignsOrganizerRequireResultsOrganizerTemplateID(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateIHEVitalSignsOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateIHEVitalSignsOrganizerTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateIHEVitalSignsOrganizerClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateIHEVitalSignsOrganizerClassCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateIHEVitalSignsOrganizerCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateIHEVitalSignsOrganizerCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateIHEVitalSignsOrganizerEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateIHEVitalSignsOrganizerEffectiveTime(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateIHEVitalSignsOrganizerStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateIHEVitalSignsOrganizerStatusCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateIHEVitalSignsOrganizerId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateIHEVitalSignsOrganizerId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateIHEVitalSignsOrganizerVitalSignObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateIHEVitalSignsOrganizerVitalSignObservation(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateIHEVitalSignsOrganizerAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateIHEVitalSignsOrganizerAuthor(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EList<VitalSignObservation> getVitalSignObservations() {
		return VitalSignsOrganizerOperations.getVitalSignObservations(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public VitalSignsOrganizer init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VitalSignsOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // VitalSignsOrganizerImpl
