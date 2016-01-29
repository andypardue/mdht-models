/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStage;
import org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.PhysicalExamSectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Exam Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PhysicalExamSectionImpl extends SectionImpl implements PhysicalExamSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalExamSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PHYSICAL_EXAM_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExamSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExamSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExamSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExamSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExamSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionEntry174(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionEntry174(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionEntry176(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionEntry176(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionEntry178(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionEntry178(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionPressureUlcerObservationEntryPressureUlcerObservation175(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionPressureUlcerObservationEntryPressureUlcerObservation175(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionNumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation177(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionNumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation177(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSectionHighestPressureUlcerStageEntryHighestPressureUlcerStage179(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSectionOperations.validatePhysicalExamSectionHighestPressureUlcerStageEntryHighestPressureUlcerStage179(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalExamSection init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public PhysicalExamSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // PhysicalExamSectionImpl
