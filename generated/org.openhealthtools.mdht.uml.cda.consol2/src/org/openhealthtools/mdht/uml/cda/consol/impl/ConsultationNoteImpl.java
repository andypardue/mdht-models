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
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsultationNote;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.operations.ConsultationNoteOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consultation Note</b></em>'.
 * <!-- end-user-doc -->
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
		return ConsolPackage.Literals.CONSULTATION_NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteHasReasonForReferralOrReasonForVisit(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteHasReasonForReferralOrReasonForVisit(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateGeneralHeaderConstraintsCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteInFulfillmentOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteInFulfillmentOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponent308(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponent308(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntityHasPersonOrganizationOrBoth(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntityHasPersonOrganizationOrBoth(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheDay(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheDay(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheMinute(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheMinute(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheSecond(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheSecond(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteComponentOfEncompassingEncounter2IfMorePreciseThanDayIncludeTimeZoneOffset(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2IfMorePreciseThanDayIncludeTimeZoneOffset(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteComponentOfEncompassingEncounter2EffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2EffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteComponentOfEncompassingEncounter2Id(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2Id(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteComponentOfEncompassingEncounter2ResponsibleParty(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2ResponsibleParty(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipant(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteComponentOfEncompassingEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteInFulfillmentOfOrderId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteInFulfillmentOfOrderId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteInFulfillmentOfOrder(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteInFulfillmentOfOrder(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyComponentAssessmentAndPlanSection311(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentAssessmentAndPlanSection311(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyComponentAssessmentSection313(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentAssessmentSection313(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyComponentPlanOfCareSection315(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentPlanOfCareSection315(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyComponentHistoryOfPresentIllness317(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentHistoryOfPresentIllness317(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyComponentPhysicalExamSection319(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentPhysicalExamSection319(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyComponentReasonForReferralSection321(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentReasonForReferralSection321(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyComponentReasonForVisitSection323(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentReasonForVisitSection323(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyComponentAllergiesSection325(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentAllergiesSection325(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyComponentChiefComplaintSection327(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentChiefComplaintSection327(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection329(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection329(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyComponentFamilyHistorySection331(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentFamilyHistorySection331(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyComponentGeneralStatusSection333(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentGeneralStatusSection333(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection335(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection335(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyComponentImmunizationsSection337(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentImmunizationsSection337(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional339(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional339(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyComponentProblemSectionEntriesOptional341(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentProblemSectionEntriesOptional341(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional343(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional343(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyComponentResultsSectionEntriesOptional345(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentResultsSectionEntriesOptional345(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyComponentReviewOfSystemsSection347(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentReviewOfSystemsSection347(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyComponentSocialHistorySection349(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentSocialHistorySection349(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional351(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional351(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyAssessmentAndPlanSection310(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyAssessmentAndPlanSection310(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyAssessmentSection312(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyAssessmentSection312(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyPlanOfCareSection314(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyPlanOfCareSection314(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyHistoryOfPresentIllness316(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyHistoryOfPresentIllness316(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyPhysicalExamSection318(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyPhysicalExamSection318(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyReasonForReferralSection320(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyReasonForReferralSection320(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyReasonForVisitSection322(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyReasonForVisitSection322(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyAllergiesSection324(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyAllergiesSection324(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyChiefComplaintSection326(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyChiefComplaintSection326(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection328(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection328(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyFamilyHistorySection330(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyFamilyHistorySection330(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyGeneralStatusSection332(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyGeneralStatusSection332(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyHistoryOfPastIllnessSection334(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyHistoryOfPastIllnessSection334(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyImmunizationsSection336(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyImmunizationsSection336(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyMedicationsSectionEntriesOptional338(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyMedicationsSectionEntriesOptional338(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyProblemSectionEntriesOptional340(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyProblemSectionEntriesOptional340(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyProceduresSectionEntriesOptional342(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyProceduresSectionEntriesOptional342(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyResultsSectionEntriesOptional344(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyResultsSectionEntriesOptional344(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyReviewOfSystemsSection346(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyReviewOfSystemsSection346(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodySocialHistorySection348(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodySocialHistorySection348(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBodyVitalSignsSectionEntriesOptional350(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyVitalSignsSectionEntriesOptional350(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNoteComponentStructuredBody309(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBody309(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentOf(this, diagnostics, context);
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
	public boolean validateGeneralHeaderConstraintsCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateGeneralHeaderConstraintsCode(this, diagnostics, context);
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
