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
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consultation Note</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getConsultationNote()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='GeneralHeaderConstraintsTemplateId ConsultationNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections ConsultationNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent ConsultationNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection ConsultationNoteHasReasonForReferralOrReasonForVisit GeneralHeaderConstraintsCode GeneralHeaderConstraintsCodeP ConsultationNoteComponentOf ConsultationNoteInFulfillmentOf ConsultationNoteComponent308 ConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth ConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntity ConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntityHasPersonOrganizationOrBoth ConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntity ConsultationNoteComponentOfEncompassingEncounter2PreciseToTheDay ConsultationNoteComponentOfEncompassingEncounter2EffectiveTime ConsultationNoteComponentOfEncompassingEncounter2Id ConsultationNoteComponentOfEncompassingEncounter ConsultationNoteInFulfillmentOfOrderId ConsultationNoteInFulfillmentOfOrder ConsultationNoteComponentStructuredBodyComponentHistoryOfPresentIllness317 ConsultationNoteComponentStructuredBodyAssessmentAndPlanSection310 ConsultationNoteComponentStructuredBodyAssessmentSection312 ConsultationNoteComponentStructuredBodyPlanOfCareSection314 ConsultationNoteComponentStructuredBodyHistoryOfPresentIllness316 ConsultationNoteComponentStructuredBodyPhysicalExamSection318 ConsultationNoteComponentStructuredBodyReasonForReferralSection320 ConsultationNoteComponentStructuredBodyReasonForVisitSection322 ConsultationNoteComponentStructuredBodyAllergiesSection324 ConsultationNoteComponentStructuredBodyChiefComplaintSection326 ConsultationNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection328 ConsultationNoteComponentStructuredBodyFamilyHistorySection330 ConsultationNoteComponentStructuredBodyGeneralStatusSection332 ConsultationNoteComponentStructuredBodyHistoryOfPastIllnessSection334 ConsultationNoteComponentStructuredBodyImmunizationsSection336 ConsultationNoteComponentStructuredBodyMedicationsSectionEntriesOptional338 ConsultationNoteComponentStructuredBodyProblemSectionEntriesOptional340 ConsultationNoteComponentStructuredBodyProceduresSectionEntriesOptional342 ConsultationNoteComponentStructuredBodyResultsSectionEntriesOptional344 ConsultationNoteComponentStructuredBodyReviewOfSystemsSection346 ConsultationNoteComponentStructuredBodySocialHistorySection348 ConsultationNoteComponentStructuredBodyVitalSignsSectionEntriesOptional350 ConsultationNoteComponentStructuredBody309' templateId.root='2.16.840.1.113883.10.20.22.1.4' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.dependOn.GeneralHeaderConstraintsCode='GeneralHeaderConstraintsCodeP' constraints.validation.query='ConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth ConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntity ConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntityHasPersonOrganizationOrBoth ConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntity ConsultationNoteComponentOfEncompassingEncounter2PreciseToTheDay ConsultationNoteComponentOfEncompassingEncounter2PreciseToTheMinute ConsultationNoteComponentOfEncompassingEncounter2PreciseToTheSecond ConsultationNoteComponentOfEncompassingEncounter2IfMorePreciseThanDayIncludeTimeZoneOffset ConsultationNoteComponentOfEncompassingEncounter2EffectiveTime ConsultationNoteComponentOfEncompassingEncounter2Id ConsultationNoteComponentOfEncompassingEncounter2ResponsibleParty ConsultationNoteComponentOfEncompassingEncounter2EncounterParticipant ConsultationNoteComponentOfEncompassingEncounter ConsultationNoteInFulfillmentOfOrderId ConsultationNoteInFulfillmentOfOrder ConsultationNoteComponentStructuredBodyComponentAssessmentAndPlanSection311 ConsultationNoteComponentStructuredBodyComponentAssessmentSection313 ConsultationNoteComponentStructuredBodyComponentPlanOfCareSection315 ConsultationNoteComponentStructuredBodyComponentHistoryOfPresentIllness317 ConsultationNoteComponentStructuredBodyComponentPhysicalExamSection319 ConsultationNoteComponentStructuredBodyComponentReasonForReferralSection321 ConsultationNoteComponentStructuredBodyComponentReasonForVisitSection323 ConsultationNoteComponentStructuredBodyComponentAllergiesSection325 ConsultationNoteComponentStructuredBodyComponentChiefComplaintSection327 ConsultationNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection329 ConsultationNoteComponentStructuredBodyComponentFamilyHistorySection331 ConsultationNoteComponentStructuredBodyComponentGeneralStatusSection333 ConsultationNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection335 ConsultationNoteComponentStructuredBodyComponentImmunizationsSection337 ConsultationNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional339 ConsultationNoteComponentStructuredBodyComponentProblemSectionEntriesOptional341 ConsultationNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional343 ConsultationNoteComponentStructuredBodyComponentResultsSectionEntriesOptional345 ConsultationNoteComponentStructuredBodyComponentReviewOfSystemsSection347 ConsultationNoteComponentStructuredBodyComponentSocialHistorySection349 ConsultationNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional351 ConsultationNoteComponentStructuredBodyAssessmentAndPlanSection310 ConsultationNoteComponentStructuredBodyAssessmentSection312 ConsultationNoteComponentStructuredBodyPlanOfCareSection314 ConsultationNoteComponentStructuredBodyHistoryOfPresentIllness316 ConsultationNoteComponentStructuredBodyPhysicalExamSection318 ConsultationNoteComponentStructuredBodyReasonForReferralSection320 ConsultationNoteComponentStructuredBodyReasonForVisitSection322 ConsultationNoteComponentStructuredBodyAllergiesSection324 ConsultationNoteComponentStructuredBodyChiefComplaintSection326 ConsultationNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection328 ConsultationNoteComponentStructuredBodyFamilyHistorySection330 ConsultationNoteComponentStructuredBodyGeneralStatusSection332 ConsultationNoteComponentStructuredBodyHistoryOfPastIllnessSection334 ConsultationNoteComponentStructuredBodyImmunizationsSection336 ConsultationNoteComponentStructuredBodyMedicationsSectionEntriesOptional338 ConsultationNoteComponentStructuredBodyProblemSectionEntriesOptional340 ConsultationNoteComponentStructuredBodyProceduresSectionEntriesOptional342 ConsultationNoteComponentStructuredBodyResultsSectionEntriesOptional344 ConsultationNoteComponentStructuredBodyReviewOfSystemsSection346 ConsultationNoteComponentStructuredBodySocialHistorySection348 ConsultationNoteComponentStructuredBodyVitalSignsSectionEntriesOptional350 ConsultationNoteComponentStructuredBody309' constraints.validation.warning='ConsultationNoteComponentOfEncompassingEncounter2PreciseToTheMinute ConsultationNoteComponentOfEncompassingEncounter2IfMorePreciseThanDayIncludeTimeZoneOffset ConsultationNoteComponentStructuredBodyComponentPhysicalExamSection319' constraints.validation.info='ConsultationNoteComponentOfEncompassingEncounter2PreciseToTheSecond ConsultationNoteComponentOfEncompassingEncounter2ResponsibleParty ConsultationNoteComponentOfEncompassingEncounter2EncounterParticipant ConsultationNoteComponentStructuredBodyComponentAssessmentAndPlanSection311 ConsultationNoteComponentStructuredBodyComponentAssessmentSection313 ConsultationNoteComponentStructuredBodyComponentPlanOfCareSection315 ConsultationNoteComponentStructuredBodyComponentReasonForReferralSection321 ConsultationNoteComponentStructuredBodyComponentReasonForVisitSection323 ConsultationNoteComponentStructuredBodyComponentAllergiesSection325 ConsultationNoteComponentStructuredBodyComponentChiefComplaintSection327 ConsultationNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection329 ConsultationNoteComponentStructuredBodyComponentFamilyHistorySection331 ConsultationNoteComponentStructuredBodyComponentGeneralStatusSection333 ConsultationNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection335 ConsultationNoteComponentStructuredBodyComponentImmunizationsSection337 ConsultationNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional339 ConsultationNoteComponentStructuredBodyComponentProblemSectionEntriesOptional341 ConsultationNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional343 ConsultationNoteComponentStructuredBodyComponentResultsSectionEntriesOptional345 ConsultationNoteComponentStructuredBodyComponentReviewOfSystemsSection347 ConsultationNoteComponentStructuredBodyComponentSocialHistorySection349 ConsultationNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional351'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolConsultationNoteComponentOf constraints.validation.error='ConsultationNoteComponentOfEncompassingEncounter'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolConsultationNoteComponentOfEncompassingEncounter2 constraints.validation.error='ConsultationNoteComponentOfEncompassingEncounter2PreciseToTheDay ConsultationNoteComponentOfEncompassingEncounter2EffectiveTime ConsultationNoteComponentOfEncompassingEncounter2Id' constraints.validation.warning='ConsultationNoteComponentOfEncompassingEncounter2PreciseToTheMinute ConsultationNoteComponentOfEncompassingEncounter2IfMorePreciseThanDayIncludeTimeZoneOffset' constraints.validation.info='ConsultationNoteComponentOfEncompassingEncounter2PreciseToTheSecond ConsultationNoteComponentOfEncompassingEncounter2ResponsibleParty ConsultationNoteComponentOfEncompassingEncounter2EncounterParticipant'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolConsultationNoteComponentOfEncompassingEncounter2ResponsibleParty constraints.validation.error='ConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth ConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolConsultationNoteComponentOfEncompassingEncounter2EncounterParticipant constraints.validation.error='ConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntityHasPersonOrganizationOrBoth ConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolConsultationNoteInFulfillmentOf constraints.validation.error='ConsultationNoteInFulfillmentOfOrder'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolConsultationNoteInFulfillmentOfOrder constraints.validation.error='ConsultationNoteInFulfillmentOfOrderId'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolConsultationNoteComponent constraints.validation.error='ConsultationNoteComponentStructuredBody309 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentHistoryOfPresentIllness317 ComponentConsultationNoteComponentStructuredBodyAssessmentAndPlanSection310 ComponentConsultationNoteComponentStructuredBodyAssessmentSection312 ComponentConsultationNoteComponentStructuredBodyPlanOfCareSection314 ComponentConsultationNoteComponentStructuredBodyHistoryOfPresentIllness316 ComponentConsultationNoteComponentStructuredBodyPhysicalExamSection318 ComponentConsultationNoteComponentStructuredBodyReasonForReferralSection320 ComponentConsultationNoteComponentStructuredBodyReasonForVisitSection322 ComponentConsultationNoteComponentStructuredBodyAllergiesSection324 ComponentConsultationNoteComponentStructuredBodyChiefComplaintSection326 ComponentConsultationNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection328 ComponentConsultationNoteComponentStructuredBodyFamilyHistorySection330 ComponentConsultationNoteComponentStructuredBodyGeneralStatusSection332 ComponentConsultationNoteComponentStructuredBodyHistoryOfPastIllnessSection334 ComponentConsultationNoteComponentStructuredBodyImmunizationsSection336 ComponentConsultationNoteComponentStructuredBodyMedicationsSectionEntriesOptional338 ComponentConsultationNoteComponentStructuredBodyProblemSectionEntriesOptional340 ComponentConsultationNoteComponentStructuredBodyProceduresSectionEntriesOptional342 ComponentConsultationNoteComponentStructuredBodyResultsSectionEntriesOptional344 ComponentConsultationNoteComponentStructuredBodyReviewOfSystemsSection346 ComponentConsultationNoteComponentStructuredBodySocialHistorySection348 ComponentConsultationNoteComponentStructuredBodyVitalSignsSectionEntriesOptional350' constraints.validation.info='ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentAssessmentAndPlanSection311 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentAssessmentSection313 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentPlanOfCareSection315 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentReasonForReferralSection321 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentReasonForVisitSection323 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentAllergiesSection325 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentChiefComplaintSection327 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection329 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentFamilyHistorySection331 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentGeneralStatusSection333 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection335 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentImmunizationsSection337 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional339 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentProblemSectionEntriesOptional341 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional343 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentResultsSectionEntriesOptional345 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentReviewOfSystemsSection347 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentSocialHistorySection349 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional351' constraints.validation.query='ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentAssessmentAndPlanSection311 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentAssessmentSection313 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentPlanOfCareSection315 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentHistoryOfPresentIllness317 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentPhysicalExamSection319 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentReasonForReferralSection321 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentReasonForVisitSection323 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentAllergiesSection325 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentChiefComplaintSection327 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection329 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentFamilyHistorySection331 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentGeneralStatusSection333 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection335 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentImmunizationsSection337 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional339 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentProblemSectionEntriesOptional341 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional343 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentResultsSectionEntriesOptional345 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentReviewOfSystemsSection347 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentSocialHistorySection349 ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional351 ComponentConsultationNoteComponentStructuredBodyAssessmentAndPlanSection310 ComponentConsultationNoteComponentStructuredBodyAssessmentSection312 ComponentConsultationNoteComponentStructuredBodyPlanOfCareSection314 ComponentConsultationNoteComponentStructuredBodyHistoryOfPresentIllness316 ComponentConsultationNoteComponentStructuredBodyPhysicalExamSection318 ComponentConsultationNoteComponentStructuredBodyReasonForReferralSection320 ComponentConsultationNoteComponentStructuredBodyReasonForVisitSection322 ComponentConsultationNoteComponentStructuredBodyAllergiesSection324 ComponentConsultationNoteComponentStructuredBodyChiefComplaintSection326 ComponentConsultationNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection328 ComponentConsultationNoteComponentStructuredBodyFamilyHistorySection330 ComponentConsultationNoteComponentStructuredBodyGeneralStatusSection332 ComponentConsultationNoteComponentStructuredBodyHistoryOfPastIllnessSection334 ComponentConsultationNoteComponentStructuredBodyImmunizationsSection336 ComponentConsultationNoteComponentStructuredBodyMedicationsSectionEntriesOptional338 ComponentConsultationNoteComponentStructuredBodyProblemSectionEntriesOptional340 ComponentConsultationNoteComponentStructuredBodyProceduresSectionEntriesOptional342 ComponentConsultationNoteComponentStructuredBodyResultsSectionEntriesOptional344 ComponentConsultationNoteComponentStructuredBodyReviewOfSystemsSection346 ComponentConsultationNoteComponentStructuredBodySocialHistorySection348 ComponentConsultationNoteComponentStructuredBodyVitalSignsSectionEntriesOptional350' constraints.validation.warning='ComponentStructuredBodyConsultationNoteComponentStructuredBodyComponentPhysicalExamSection319'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolConsultationNoteComponentStructuredBody constraints.validation.error='ConsultationNoteComponentStructuredBodyAssessmentAndPlanSection310 ConsultationNoteComponentStructuredBodyAssessmentSection312 ConsultationNoteComponentStructuredBodyPlanOfCareSection314 ConsultationNoteComponentStructuredBodyHistoryOfPresentIllness316 ConsultationNoteComponentStructuredBodyPhysicalExamSection318 ConsultationNoteComponentStructuredBodyReasonForReferralSection320 ConsultationNoteComponentStructuredBodyReasonForVisitSection322 ConsultationNoteComponentStructuredBodyAllergiesSection324 ConsultationNoteComponentStructuredBodyChiefComplaintSection326 ConsultationNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection328 ConsultationNoteComponentStructuredBodyFamilyHistorySection330 ConsultationNoteComponentStructuredBodyGeneralStatusSection332 ConsultationNoteComponentStructuredBodyHistoryOfPastIllnessSection334 ConsultationNoteComponentStructuredBodyImmunizationsSection336 ConsultationNoteComponentStructuredBodyMedicationsSectionEntriesOptional338 ConsultationNoteComponentStructuredBodyProblemSectionEntriesOptional340 ConsultationNoteComponentStructuredBodyProceduresSectionEntriesOptional342 ConsultationNoteComponentStructuredBodyResultsSectionEntriesOptional344 ConsultationNoteComponentStructuredBodyReviewOfSystemsSection346 ConsultationNoteComponentStructuredBodySocialHistorySection348 ConsultationNoteComponentStructuredBodyVitalSignsSectionEntriesOptional350 StructuredBodyConsultationNoteComponentStructuredBodyComponentHistoryOfPresentIllness317' constraints.validation.info='StructuredBodyConsultationNoteComponentStructuredBodyComponentAssessmentAndPlanSection311 StructuredBodyConsultationNoteComponentStructuredBodyComponentAssessmentSection313 StructuredBodyConsultationNoteComponentStructuredBodyComponentPlanOfCareSection315 StructuredBodyConsultationNoteComponentStructuredBodyComponentReasonForReferralSection321 StructuredBodyConsultationNoteComponentStructuredBodyComponentReasonForVisitSection323 StructuredBodyConsultationNoteComponentStructuredBodyComponentAllergiesSection325 StructuredBodyConsultationNoteComponentStructuredBodyComponentChiefComplaintSection327 StructuredBodyConsultationNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection329 StructuredBodyConsultationNoteComponentStructuredBodyComponentFamilyHistorySection331 StructuredBodyConsultationNoteComponentStructuredBodyComponentGeneralStatusSection333 StructuredBodyConsultationNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection335 StructuredBodyConsultationNoteComponentStructuredBodyComponentImmunizationsSection337 StructuredBodyConsultationNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional339 StructuredBodyConsultationNoteComponentStructuredBodyComponentProblemSectionEntriesOptional341 StructuredBodyConsultationNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional343 StructuredBodyConsultationNoteComponentStructuredBodyComponentResultsSectionEntriesOptional345 StructuredBodyConsultationNoteComponentStructuredBodyComponentReviewOfSystemsSection347 StructuredBodyConsultationNoteComponentStructuredBodyComponentSocialHistorySection349 StructuredBodyConsultationNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional351' constraints.validation.query='StructuredBodyConsultationNoteComponentStructuredBodyComponentAssessmentAndPlanSection311 StructuredBodyConsultationNoteComponentStructuredBodyComponentAssessmentSection313 StructuredBodyConsultationNoteComponentStructuredBodyComponentPlanOfCareSection315 StructuredBodyConsultationNoteComponentStructuredBodyComponentHistoryOfPresentIllness317 StructuredBodyConsultationNoteComponentStructuredBodyComponentPhysicalExamSection319 StructuredBodyConsultationNoteComponentStructuredBodyComponentReasonForReferralSection321 StructuredBodyConsultationNoteComponentStructuredBodyComponentReasonForVisitSection323 StructuredBodyConsultationNoteComponentStructuredBodyComponentAllergiesSection325 StructuredBodyConsultationNoteComponentStructuredBodyComponentChiefComplaintSection327 StructuredBodyConsultationNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection329 StructuredBodyConsultationNoteComponentStructuredBodyComponentFamilyHistorySection331 StructuredBodyConsultationNoteComponentStructuredBodyComponentGeneralStatusSection333 StructuredBodyConsultationNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection335 StructuredBodyConsultationNoteComponentStructuredBodyComponentImmunizationsSection337 StructuredBodyConsultationNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional339 StructuredBodyConsultationNoteComponentStructuredBodyComponentProblemSectionEntriesOptional341 StructuredBodyConsultationNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional343 StructuredBodyConsultationNoteComponentStructuredBodyComponentResultsSectionEntriesOptional345 StructuredBodyConsultationNoteComponentStructuredBodyComponentReviewOfSystemsSection347 StructuredBodyConsultationNoteComponentStructuredBodyComponentSocialHistorySection349 StructuredBodyConsultationNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional351' constraints.validation.warning='StructuredBodyConsultationNoteComponentStructuredBodyComponentPhysicalExamSection319'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolConsultationNoteComponentStructuredBodyComponent constraints.validation.info='ConsultationNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional351' constraints.validation.error='ConsultationNoteComponentStructuredBodyComponentHistoryOfPresentIllness317' constraints.validation.warning='ConsultationNoteComponentStructuredBodyComponentPhysicalExamSection319'"
 * @generated
 */
public interface ConsultationNote extends GeneralHeaderConstraints {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection)) and  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))'"
	 * @generated
	 */
	boolean validateConsultationNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection)) or  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))'"
	 * @generated
	 */
	boolean validateConsultationNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)) or  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))'"
	 * @generated
	 */
	boolean validateConsultationNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForReferralSection)) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))'"
	 * @generated
	 */
	boolean validateConsultationNoteHasReasonForReferralOrReasonForVisit(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.inFulfillmentOf->exists(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))'"
	 * @generated
	 */
	boolean validateConsultationNoteInFulfillmentOf(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component2 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component2))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponent308(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->excluding(null)->reject(not assignedEntity.assignedPerson.oclIsUndefined() or not assignedEntity.representedOrganization->isEmpty())'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(rim::Role)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->excluding(null)->reject(not assignedEntity.assignedPerson.oclIsUndefined() or not assignedEntity.representedOrganization->isEmpty())'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntityHasPersonOrganizationOrBoth(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(rim::Role)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(not effectiveTime.value.oclIsUndefined() implies effectiveTime.value.size() >= 8)'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheDay(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(not effectiveTime.value.oclIsUndefined() implies effectiveTime.value.size() >= 12)'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheMinute(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(not effectiveTime.value.oclIsUndefined() implies effectiveTime.value.size() >= 14)'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheSecond(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(not effectiveTime.value.oclIsUndefined() and effectiveTime.value.size() > 8 implies effectiveTime.value.size() >= 15)'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentOfEncompassingEncounter2IfMorePreciseThanDayIncludeTimeZoneOffset(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentOfEncompassingEncounter2EffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentOfEncompassingEncounter2Id(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(responsibleParty->one(responsibleParty : cda::ResponsibleParty | not responsibleParty.oclIsUndefined() and responsibleParty.oclIsKindOf(cda::ResponsibleParty)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentOfEncompassingEncounter2ResponsibleParty(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(encounterParticipant->exists(encounterParticipant : cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and encounterParticipant.oclIsKindOf(cda::EncounterParticipant)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipant(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null)->reject(encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentOfEncompassingEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.inFulfillmentOf->excluding(null).order->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	 * @generated
	 */
	boolean validateConsultationNoteInFulfillmentOfOrderId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.inFulfillmentOf->excluding(null)->reject(order->one(order : cda::Order | not order.oclIsUndefined() and order.oclIsKindOf(cda::Order)))'"
	 * @generated
	 */
	boolean validateConsultationNoteInFulfillmentOfOrder(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyComponentAssessmentAndPlanSection311(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyComponentAssessmentSection313(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyComponentPlanOfCareSection315(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyComponentHistoryOfPresentIllness317(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyComponentPhysicalExamSection319(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForReferralSection)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyComponentReasonForReferralSection321(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyComponentReasonForVisitSection323(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyComponentAllergiesSection325(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyComponentChiefComplaintSection327(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection329(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyComponentFamilyHistorySection331(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::GeneralStatusSection)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyComponentGeneralStatusSection333(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection335(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyComponentImmunizationsSection337(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional339(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyComponentProblemSectionEntriesOptional341(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional343(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSectionEntriesOptional)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyComponentResultsSectionEntriesOptional345(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyComponentReviewOfSystemsSection347(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyComponentSocialHistorySection349(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional351(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyAssessmentAndPlanSection310(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyAssessmentSection312(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyPlanOfCareSection314(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyHistoryOfPresentIllness316(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyPhysicalExamSection318(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyReasonForReferralSection320(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyReasonForVisitSection322(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyAllergiesSection324(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyChiefComplaintSection326(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection328(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyFamilyHistorySection330(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyGeneralStatusSection332(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyHistoryOfPastIllnessSection334(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyImmunizationsSection336(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyMedicationsSectionEntriesOptional338(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyProblemSectionEntriesOptional340(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyProceduresSectionEntriesOptional342(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyResultsSectionEntriesOptional344(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyReviewOfSystemsSection346(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodySocialHistorySection348(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBodyVitalSignsSectionEntriesOptional350(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null)->reject(structuredBody->one(structuredBody : cda::StructuredBody | not structuredBody.oclIsUndefined() and structuredBody.oclIsKindOf(cda::StructuredBody)))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentStructuredBody309(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))'"
	 * @generated
	 */
	boolean validateConsultationNoteComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsultationNote init();

	/**
     * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ConsultationNote init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ConsultationNote
