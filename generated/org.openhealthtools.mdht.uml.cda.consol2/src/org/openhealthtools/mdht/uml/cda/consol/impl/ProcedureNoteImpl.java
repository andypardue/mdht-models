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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection;
import org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDescriptionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDispositionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureEstimatedBloodLossSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureImplantsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureNote;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureSpecimensTakenSection;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureNoteOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProcedureNoteImpl extends GeneralHeaderConstraintsImpl implements ProcedureNote {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureNoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROCEDURE_NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteSectionTitles(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteSectionTitles(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateGeneralHeaderConstraintsCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteParticipant1(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteParticipant1(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponent430(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponent430(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacilityId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacilityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacility(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacility(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipantTypeCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipantTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteComponentOfEncompassingEncounter5Code(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentOfEncompassingEncounter5Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteComponentOfEncompassingEncounter5Location(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentOfEncompassingEncounter5Location(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipant(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteComponentOfEncompassingEncounter5(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentOfEncompassingEncounter5(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerTypeCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOfServiceEvent1ProcedureCodes(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1ProcedureCodes(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasLow(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasHighWhenNoWidth(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasHighWhenNoWidth(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeNoHighIfWidth(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeNoHighIfWidth(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheDay(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheDay(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheMinute(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheMinute(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheSecond(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheSecond(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOfServiceEvent1IfMorePreciseThanDayIncludeTimeZoneOffset(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1IfMorePreciseThanDayIncludeTimeZoneOffset(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOfServiceEvent1Code(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOfServiceEvent1EffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1EffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOfServiceEvent1(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyComponentAssessmentSection433(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentAssessmentSection433(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyComponentPlanOfCareSection435(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentPlanOfCareSection435(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyComponentAssessmentAndPlanSection437(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentAssessmentAndPlanSection437(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyComponentComplicationsSection439(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentComplicationsSection439(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyComponentPostprocedureDiagnosisSection441(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentPostprocedureDiagnosisSection441(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyComponentProcedureDescriptionSection443(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentProcedureDescriptionSection443(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyComponentProcedureIndicationsSection445(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentProcedureIndicationsSection445(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional447(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional447(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyComponentAnesthesiaSection449(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentAnesthesiaSection449(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyComponentChiefComplaintSection451(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentChiefComplaintSection451(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection453(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection453(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyComponentFamilyHistorySection455(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentFamilyHistorySection455(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection457(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection457(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection459(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection459(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyComponentMedicalHistorySection461(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentMedicalHistorySection461(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional463(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional463(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyComponentMedicationsAdministeredSection465(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentMedicationsAdministeredSection465(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyComponentPhysicalExamSection467(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentPhysicalExamSection467(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyComponentPlannedProcedureSection469(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentPlannedProcedureSection469(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyComponentProcedureDispositionSection471(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentProcedureDispositionSection471(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyComponentProcedureEstimatedBloodLossSection473(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentProcedureEstimatedBloodLossSection473(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyComponentProcedureFindingsSection475(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentProcedureFindingsSection475(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyComponentProcedureImplantsSection477(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentProcedureImplantsSection477(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyComponentProcedureSpecimensTakenSection479(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentProcedureSpecimensTakenSection479(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional481(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional481(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyComponentReasonForVisitSection483(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentReasonForVisitSection483(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyComponentReviewOfSystemsSection485(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentReviewOfSystemsSection485(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyComponentSocialHistorySection487(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentSocialHistorySection487(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyAssessmentSection432(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyAssessmentSection432(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyPlanOfCareSection434(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyPlanOfCareSection434(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyAssessmentAndPlanSection436(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyAssessmentAndPlanSection436(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyComplicationsSection438(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComplicationsSection438(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyPostprocedureDiagnosisSection440(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyPostprocedureDiagnosisSection440(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyProcedureDescriptionSection442(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyProcedureDescriptionSection442(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyProcedureIndicationsSection444(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyProcedureIndicationsSection444(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyAllergiesSectionEntriesOptional446(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyAllergiesSectionEntriesOptional446(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyAnesthesiaSection448(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyAnesthesiaSection448(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyChiefComplaintSection450(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyChiefComplaintSection450(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection452(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection452(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyFamilyHistorySection454(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyFamilyHistorySection454(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyHistoryOfPastIllnessSection456(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyHistoryOfPastIllnessSection456(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyHistoryOfPresentIllnessSection458(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyHistoryOfPresentIllnessSection458(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyMedicalHistorySection460(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyMedicalHistorySection460(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyMedicationsSectionEntriesOptional462(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyMedicationsSectionEntriesOptional462(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyMedicationsAdministeredSection464(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyMedicationsAdministeredSection464(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyPhysicalExamSection466(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyPhysicalExamSection466(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyPlannedProcedureSection468(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyPlannedProcedureSection468(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyProcedureDispositionSection470(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyProcedureDispositionSection470(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyProcedureEstimatedBloodLossSection472(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyProcedureEstimatedBloodLossSection472(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyProcedureFindingsSection474(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyProcedureFindingsSection474(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyProcedureImplantsSection476(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyProcedureImplantsSection476(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyProcedureSpecimensTakenSection478(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyProcedureSpecimensTakenSection478(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyProceduresSectionEntriesOptional480(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyProceduresSectionEntriesOptional480(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyReasonForVisitSection482(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyReasonForVisitSection482(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodyReviewOfSystemsSection484(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyReviewOfSystemsSection484(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBodySocialHistorySection486(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodySocialHistorySection486(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNoteComponentStructuredBody431(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBody431(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateGeneralHeaderConstraintsCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureNote init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ProcedureNote init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // ProcedureNoteImpl
