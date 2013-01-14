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
import org.openhealthtools.mdht.uml.cda.ccd.AlertsSection;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;
import org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote;
import org.openhealthtools.mdht.uml.cda.cdt.DiagnosticFindings;
import org.openhealthtools.mdht.uml.cda.cdt.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.cdt.HistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySectionConsult;
import org.openhealthtools.mdht.uml.cda.cdt.PhysicalExaminationSection;
import org.openhealthtools.mdht.uml.cda.cdt.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.cdt.operations.ConsultationNoteOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consultation Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConsultationNoteImpl extends GeneralHeaderConstraintsImpl implements ConsultationNote {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected ConsultationNoteImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return CDTPackage.Literals.CONSULTATION_NOTE;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConsultationNoteReferralOrVisit(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteReferralOrVisit(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConsultationNoteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConsultationNoteHistoryOfPresentIllness(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteHistoryOfPresentIllness(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConsultationNotePhysicalExamination(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNotePhysicalExamination(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConsultationNoteProblemSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteProblemSection(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConsultationNoteProceduresSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteProceduresSection(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConsultationNotePastMedicalHistorySection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNotePastMedicalHistorySection(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConsultationNoteImmunizationsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteImmunizationsSection(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConsultationNoteMedicationsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteMedicationsSection(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConsultationNoteAlertsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteAlertsSection(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConsultationNoteSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteSocialHistorySection(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConsultationNoteFamilyHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteFamilyHistorySection(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConsultationNoteReviewOfSystemsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteReviewOfSystemsSection(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConsultationNoteVitalSignsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteVitalSignsSection(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConsultationNoteGeneralStatusSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteGeneralStatusSection(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateConsultationNoteDiagnosticFindings(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteDiagnosticFindings(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public HistoryOfPresentIllness getHistoryOfPresentIllness() {
		return ConsultationNoteOperations.getHistoryOfPresentIllness(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public PhysicalExaminationSection getPhysicalExamination() {
		return ConsultationNoteOperations.getPhysicalExamination(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ProblemSection getProblemSection() {
		return ConsultationNoteOperations.getProblemSection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ProceduresSection getProceduresSection() {
		return ConsultationNoteOperations.getProceduresSection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public PastMedicalHistorySectionConsult getPastMedicalHistorySection() {
		return ConsultationNoteOperations.getPastMedicalHistorySection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ImmunizationsSection getImmunizationsSection() {
		return ConsultationNoteOperations.getImmunizationsSection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public MedicationsSection getMedicationsSection() {
		return ConsultationNoteOperations.getMedicationsSection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public AlertsSection getAlertsSection() {
		return ConsultationNoteOperations.getAlertsSection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public SocialHistorySection getSocialHistorySection() {
		return ConsultationNoteOperations.getSocialHistorySection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public FamilyHistorySection getFamilyHistorySection() {
		return ConsultationNoteOperations.getFamilyHistorySection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ReviewOfSystemsSection getReviewOfSystemsSection() {
		return ConsultationNoteOperations.getReviewOfSystemsSection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public VitalSignsSection getVitalSignsSection() {
		return ConsultationNoteOperations.getVitalSignsSection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public GeneralStatusSection getGeneralStatusSection() {
		return ConsultationNoteOperations.getGeneralStatusSection(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public DiagnosticFindings getDiagnosticFindings() {
		return ConsultationNoteOperations.getDiagnosticFindings(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public ConsultationNote init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsultationNote init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ConsultationNoteImpl
