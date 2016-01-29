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
 * A representation of the model object '<em><b>History And Physical Note</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getHistoryAndPhysicalNote()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='GeneralHeaderConstraintsTemplateId HistoryAndPhysicalNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections HistoryAndPhysicalNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent HistoryAndPhysicalNoteHasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit HistoryAndPhysicalNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection GeneralHeaderConstraintsCode GeneralHeaderConstraintsCodeP HistoryAndPhysicalNoteComponentOf HistoryAndPhysicalNoteComponent352 HistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityHasPersonOrOrganization HistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntity HistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityHasPersonOrOrganization HistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntity HistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheDay HistoryAndPhysicalNoteComponentOfEncompassingEncounter4EffectiveTime HistoryAndPhysicalNoteComponentOfEncompassingEncounter4Id HistoryAndPhysicalNoteComponentOfEncompassingEncounter HistoryAndPhysicalNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional355 HistoryAndPhysicalNoteComponentStructuredBodyComponentFamilyHistorySection367 HistoryAndPhysicalNoteComponentStructuredBodyComponentGeneralStatusSection369 HistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection371 HistoryAndPhysicalNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional373 HistoryAndPhysicalNoteComponentStructuredBodyComponentPhysicalExamSection375 HistoryAndPhysicalNoteComponentStructuredBodyComponentResultsSectionEntriesOptional379 HistoryAndPhysicalNoteComponentStructuredBodyComponentReviewOfSystemsSection381 HistoryAndPhysicalNoteComponentStructuredBodyComponentSocialHistorySection383 HistoryAndPhysicalNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional393 HistoryAndPhysicalNoteComponentStructuredBodyAllergiesSectionEntriesOptional354 HistoryAndPhysicalNoteComponentStructuredBodyAssessmentSection356 HistoryAndPhysicalNoteComponentStructuredBodyPlanOfCareSection358 HistoryAndPhysicalNoteComponentStructuredBodyAssessmentAndPlanSection360 HistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintSection362 HistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection364 HistoryAndPhysicalNoteComponentStructuredBodyFamilyHistorySection366 HistoryAndPhysicalNoteComponentStructuredBodyGeneralStatusSection368 HistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPastIllnessSection370 HistoryAndPhysicalNoteComponentStructuredBodyMedicationsSectionEntriesOptional372 HistoryAndPhysicalNoteComponentStructuredBodyPhysicalExamSection374 HistoryAndPhysicalNoteComponentStructuredBodyReasonForVisitSection376 HistoryAndPhysicalNoteComponentStructuredBodyResultsSectionEntriesOptional378 HistoryAndPhysicalNoteComponentStructuredBodyReviewOfSystemsSection380 HistoryAndPhysicalNoteComponentStructuredBodySocialHistorySection382 HistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPresentIllnessSection384 HistoryAndPhysicalNoteComponentStructuredBodyImmunizationsSectionEntriesOptional386 HistoryAndPhysicalNoteComponentStructuredBodyProblemSectionEntriesOptional388 HistoryAndPhysicalNoteComponentStructuredBodyProceduresSectionEntriesOptional390 HistoryAndPhysicalNoteComponentStructuredBodyVitalSignsSectionEntriesOptional392 HistoryAndPhysicalNoteComponentStructuredBodyInstructionsSection394 HistoryAndPhysicalNoteComponentStructuredBody353' templateId.root='2.16.840.1.113883.10.20.22.1.3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.dependOn.GeneralHeaderConstraintsCode='GeneralHeaderConstraintsCodeP' constraints.validation.info='HistoryAndPhysicalNoteInFulfillmentOf HistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheSecond HistoryAndPhysicalNoteComponentOfEncompassingEncounter4Location HistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsibleParty HistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipant HistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentSection357 HistoryAndPhysicalNoteComponentStructuredBodyComponentPlanOfCareSection359 HistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentAndPlanSection361 HistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintSection363 HistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection365 HistoryAndPhysicalNoteComponentStructuredBodyComponentReasonForVisitSection377 HistoryAndPhysicalNoteComponentStructuredBodyComponentImmunizationsSectionEntriesOptional387 HistoryAndPhysicalNoteComponentStructuredBodyComponentProblemSectionEntriesOptional389 HistoryAndPhysicalNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional391 HistoryAndPhysicalNoteComponentStructuredBodyComponentInstructionsSection395' constraints.validation.query='HistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityHasPersonOrOrganization HistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntity HistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityHasPersonOrOrganization HistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntity HistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheDay HistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheMinute HistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheSecond HistoryAndPhysicalNoteComponentOfEncompassingEncounter4IfMorePreciseThanDayIncludeTimeZoneOffset HistoryAndPhysicalNoteComponentOfEncompassingEncounter4EffectiveTime HistoryAndPhysicalNoteComponentOfEncompassingEncounter4Id HistoryAndPhysicalNoteComponentOfEncompassingEncounter4Location HistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsibleParty HistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipant HistoryAndPhysicalNoteComponentOfEncompassingEncounter HistoryAndPhysicalNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional355 HistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentSection357 HistoryAndPhysicalNoteComponentStructuredBodyComponentPlanOfCareSection359 HistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentAndPlanSection361 HistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintSection363 HistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection365 HistoryAndPhysicalNoteComponentStructuredBodyComponentFamilyHistorySection367 HistoryAndPhysicalNoteComponentStructuredBodyComponentGeneralStatusSection369 HistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection371 HistoryAndPhysicalNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional373 HistoryAndPhysicalNoteComponentStructuredBodyComponentPhysicalExamSection375 HistoryAndPhysicalNoteComponentStructuredBodyComponentReasonForVisitSection377 HistoryAndPhysicalNoteComponentStructuredBodyComponentResultsSectionEntriesOptional379 HistoryAndPhysicalNoteComponentStructuredBodyComponentReviewOfSystemsSection381 HistoryAndPhysicalNoteComponentStructuredBodyComponentSocialHistorySection383 HistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection385 HistoryAndPhysicalNoteComponentStructuredBodyComponentImmunizationsSectionEntriesOptional387 HistoryAndPhysicalNoteComponentStructuredBodyComponentProblemSectionEntriesOptional389 HistoryAndPhysicalNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional391 HistoryAndPhysicalNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional393 HistoryAndPhysicalNoteComponentStructuredBodyComponentInstructionsSection395 HistoryAndPhysicalNoteComponentStructuredBodyAllergiesSectionEntriesOptional354 HistoryAndPhysicalNoteComponentStructuredBodyAssessmentSection356 HistoryAndPhysicalNoteComponentStructuredBodyPlanOfCareSection358 HistoryAndPhysicalNoteComponentStructuredBodyAssessmentAndPlanSection360 HistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintSection362 HistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection364 HistoryAndPhysicalNoteComponentStructuredBodyFamilyHistorySection366 HistoryAndPhysicalNoteComponentStructuredBodyGeneralStatusSection368 HistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPastIllnessSection370 HistoryAndPhysicalNoteComponentStructuredBodyMedicationsSectionEntriesOptional372 HistoryAndPhysicalNoteComponentStructuredBodyPhysicalExamSection374 HistoryAndPhysicalNoteComponentStructuredBodyReasonForVisitSection376 HistoryAndPhysicalNoteComponentStructuredBodyResultsSectionEntriesOptional378 HistoryAndPhysicalNoteComponentStructuredBodyReviewOfSystemsSection380 HistoryAndPhysicalNoteComponentStructuredBodySocialHistorySection382 HistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPresentIllnessSection384 HistoryAndPhysicalNoteComponentStructuredBodyImmunizationsSectionEntriesOptional386 HistoryAndPhysicalNoteComponentStructuredBodyProblemSectionEntriesOptional388 HistoryAndPhysicalNoteComponentStructuredBodyProceduresSectionEntriesOptional390 HistoryAndPhysicalNoteComponentStructuredBodyVitalSignsSectionEntriesOptional392 HistoryAndPhysicalNoteComponentStructuredBodyInstructionsSection394 HistoryAndPhysicalNoteComponentStructuredBody353' constraints.validation.warning='HistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheMinute HistoryAndPhysicalNoteComponentOfEncompassingEncounter4IfMorePreciseThanDayIncludeTimeZoneOffset HistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection385'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHistoryAndPhysicalNoteComponentOf constraints.validation.error='HistoryAndPhysicalNoteComponentOfEncompassingEncounter'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHistoryAndPhysicalNoteComponentOfEncompassingEncounter4 constraints.validation.error='HistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheDay HistoryAndPhysicalNoteComponentOfEncompassingEncounter4EffectiveTime HistoryAndPhysicalNoteComponentOfEncompassingEncounter4Id' constraints.validation.warning='HistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheMinute HistoryAndPhysicalNoteComponentOfEncompassingEncounter4IfMorePreciseThanDayIncludeTimeZoneOffset' constraints.validation.info='HistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheSecond HistoryAndPhysicalNoteComponentOfEncompassingEncounter4Location HistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsibleParty HistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipant'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsibleParty constraints.validation.error='HistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityHasPersonOrOrganization HistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipant constraints.validation.error='HistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityHasPersonOrOrganization HistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHistoryAndPhysicalNoteComponent constraints.validation.error='HistoryAndPhysicalNoteComponentStructuredBody353 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional355 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentFamilyHistorySection367 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentGeneralStatusSection369 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection371 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional373 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentPhysicalExamSection375 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentResultsSectionEntriesOptional379 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentReviewOfSystemsSection381 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentSocialHistorySection383 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional393 ComponentHistoryAndPhysicalNoteComponentStructuredBodyAllergiesSectionEntriesOptional354 ComponentHistoryAndPhysicalNoteComponentStructuredBodyAssessmentSection356 ComponentHistoryAndPhysicalNoteComponentStructuredBodyPlanOfCareSection358 ComponentHistoryAndPhysicalNoteComponentStructuredBodyAssessmentAndPlanSection360 ComponentHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintSection362 ComponentHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection364 ComponentHistoryAndPhysicalNoteComponentStructuredBodyFamilyHistorySection366 ComponentHistoryAndPhysicalNoteComponentStructuredBodyGeneralStatusSection368 ComponentHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPastIllnessSection370 ComponentHistoryAndPhysicalNoteComponentStructuredBodyMedicationsSectionEntriesOptional372 ComponentHistoryAndPhysicalNoteComponentStructuredBodyPhysicalExamSection374 ComponentHistoryAndPhysicalNoteComponentStructuredBodyReasonForVisitSection376 ComponentHistoryAndPhysicalNoteComponentStructuredBodyResultsSectionEntriesOptional378 ComponentHistoryAndPhysicalNoteComponentStructuredBodyReviewOfSystemsSection380 ComponentHistoryAndPhysicalNoteComponentStructuredBodySocialHistorySection382 ComponentHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPresentIllnessSection384 ComponentHistoryAndPhysicalNoteComponentStructuredBodyImmunizationsSectionEntriesOptional386 ComponentHistoryAndPhysicalNoteComponentStructuredBodyProblemSectionEntriesOptional388 ComponentHistoryAndPhysicalNoteComponentStructuredBodyProceduresSectionEntriesOptional390 ComponentHistoryAndPhysicalNoteComponentStructuredBodyVitalSignsSectionEntriesOptional392 ComponentHistoryAndPhysicalNoteComponentStructuredBodyInstructionsSection394' constraints.validation.query='ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional355 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentSection357 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentPlanOfCareSection359 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentAndPlanSection361 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintSection363 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection365 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentFamilyHistorySection367 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentGeneralStatusSection369 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection371 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional373 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentPhysicalExamSection375 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentReasonForVisitSection377 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentResultsSectionEntriesOptional379 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentReviewOfSystemsSection381 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentSocialHistorySection383 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection385 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentImmunizationsSectionEntriesOptional387 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentProblemSectionEntriesOptional389 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional391 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional393 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentInstructionsSection395 ComponentHistoryAndPhysicalNoteComponentStructuredBodyAllergiesSectionEntriesOptional354 ComponentHistoryAndPhysicalNoteComponentStructuredBodyAssessmentSection356 ComponentHistoryAndPhysicalNoteComponentStructuredBodyPlanOfCareSection358 ComponentHistoryAndPhysicalNoteComponentStructuredBodyAssessmentAndPlanSection360 ComponentHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintSection362 ComponentHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection364 ComponentHistoryAndPhysicalNoteComponentStructuredBodyFamilyHistorySection366 ComponentHistoryAndPhysicalNoteComponentStructuredBodyGeneralStatusSection368 ComponentHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPastIllnessSection370 ComponentHistoryAndPhysicalNoteComponentStructuredBodyMedicationsSectionEntriesOptional372 ComponentHistoryAndPhysicalNoteComponentStructuredBodyPhysicalExamSection374 ComponentHistoryAndPhysicalNoteComponentStructuredBodyReasonForVisitSection376 ComponentHistoryAndPhysicalNoteComponentStructuredBodyResultsSectionEntriesOptional378 ComponentHistoryAndPhysicalNoteComponentStructuredBodyReviewOfSystemsSection380 ComponentHistoryAndPhysicalNoteComponentStructuredBodySocialHistorySection382 ComponentHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPresentIllnessSection384 ComponentHistoryAndPhysicalNoteComponentStructuredBodyImmunizationsSectionEntriesOptional386 ComponentHistoryAndPhysicalNoteComponentStructuredBodyProblemSectionEntriesOptional388 ComponentHistoryAndPhysicalNoteComponentStructuredBodyProceduresSectionEntriesOptional390 ComponentHistoryAndPhysicalNoteComponentStructuredBodyVitalSignsSectionEntriesOptional392 ComponentHistoryAndPhysicalNoteComponentStructuredBodyInstructionsSection394' constraints.validation.info='ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentSection357 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentPlanOfCareSection359 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentAndPlanSection361 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintSection363 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection365 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentReasonForVisitSection377 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentImmunizationsSectionEntriesOptional387 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentProblemSectionEntriesOptional389 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional391 ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentInstructionsSection395' constraints.validation.warning='ComponentStructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection385'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHistoryAndPhysicalNoteComponentStructuredBody constraints.validation.error='HistoryAndPhysicalNoteComponentStructuredBodyAllergiesSectionEntriesOptional354 HistoryAndPhysicalNoteComponentStructuredBodyAssessmentSection356 HistoryAndPhysicalNoteComponentStructuredBodyPlanOfCareSection358 HistoryAndPhysicalNoteComponentStructuredBodyAssessmentAndPlanSection360 HistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintSection362 HistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection364 HistoryAndPhysicalNoteComponentStructuredBodyFamilyHistorySection366 HistoryAndPhysicalNoteComponentStructuredBodyGeneralStatusSection368 HistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPastIllnessSection370 HistoryAndPhysicalNoteComponentStructuredBodyMedicationsSectionEntriesOptional372 HistoryAndPhysicalNoteComponentStructuredBodyPhysicalExamSection374 HistoryAndPhysicalNoteComponentStructuredBodyReasonForVisitSection376 HistoryAndPhysicalNoteComponentStructuredBodyResultsSectionEntriesOptional378 HistoryAndPhysicalNoteComponentStructuredBodyReviewOfSystemsSection380 HistoryAndPhysicalNoteComponentStructuredBodySocialHistorySection382 HistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPresentIllnessSection384 HistoryAndPhysicalNoteComponentStructuredBodyImmunizationsSectionEntriesOptional386 HistoryAndPhysicalNoteComponentStructuredBodyProblemSectionEntriesOptional388 HistoryAndPhysicalNoteComponentStructuredBodyProceduresSectionEntriesOptional390 HistoryAndPhysicalNoteComponentStructuredBodyVitalSignsSectionEntriesOptional392 HistoryAndPhysicalNoteComponentStructuredBodyInstructionsSection394 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional355 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentFamilyHistorySection367 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentGeneralStatusSection369 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection371 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional373 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentPhysicalExamSection375 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentResultsSectionEntriesOptional379 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentReviewOfSystemsSection381 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentSocialHistorySection383 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional393' constraints.validation.query='StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional355 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentSection357 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentPlanOfCareSection359 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentAndPlanSection361 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintSection363 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection365 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentFamilyHistorySection367 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentGeneralStatusSection369 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection371 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional373 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentPhysicalExamSection375 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentReasonForVisitSection377 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentResultsSectionEntriesOptional379 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentReviewOfSystemsSection381 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentSocialHistorySection383 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection385 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentImmunizationsSectionEntriesOptional387 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentProblemSectionEntriesOptional389 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional391 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional393 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentInstructionsSection395' constraints.validation.info='StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentSection357 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentPlanOfCareSection359 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentAndPlanSection361 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintSection363 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection365 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentReasonForVisitSection377 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentImmunizationsSectionEntriesOptional387 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentProblemSectionEntriesOptional389 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional391 StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentInstructionsSection395' constraints.validation.warning='StructuredBodyHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection385'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHistoryAndPhysicalNoteComponentStructuredBodyComponent constraints.validation.error='HistoryAndPhysicalNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional393' constraints.validation.info='HistoryAndPhysicalNoteComponentStructuredBodyComponentInstructionsSection395' constraints.validation.warning='HistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection385'"
 * @generated
 */
public interface HistoryAndPhysicalNote extends GeneralHeaderConstraints {
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
	boolean validateHistoryAndPhysicalNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
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
	boolean validateHistoryAndPhysicalNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)) and  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNoteHasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(
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
	boolean validateHistoryAndPhysicalNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			DiagnosticChain diagnostics, Map<Object, Object> context);

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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.inFulfillmentOf->exists(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(rim::ActRelationship))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNoteInFulfillmentOf(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponent352(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityHasPersonOrOrganization(
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
	boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntity(
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
	boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityHasPersonOrOrganization(
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
	boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntity(
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
	boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheDay(DiagnosticChain diagnostics,
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
	boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheMinute(
			DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheSecond(
			DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4IfMorePreciseThanDayIncludeTimeZoneOffset(
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
	boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EffectiveTime(DiagnosticChain diagnostics,
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
	boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Id(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(location->one(location : cda::Location | not location.oclIsUndefined() and location.oclIsKindOf(rim::Participation)))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Location(DiagnosticChain diagnostics,
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
	boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsibleParty(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(encounterParticipant->one(encounterParticipant : cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and encounterParticipant.oclIsKindOf(cda::EncounterParticipant)))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipant(
			DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional355(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentSection357(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentPlanOfCareSection359(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentAndPlanSection361(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintSection363(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection365(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentFamilyHistorySection367(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentGeneralStatusSection369(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection371(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional373(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentPhysicalExamSection375(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentReasonForVisitSection377(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentResultsSectionEntriesOptional379(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentReviewOfSystemsSection381(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentSocialHistorySection383(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection385(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional)))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentImmunizationsSectionEntriesOptional387(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentProblemSectionEntriesOptional389(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional391(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional393(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InstructionsSection)))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentInstructionsSection395(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyAllergiesSectionEntriesOptional354(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyAssessmentSection356(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyPlanOfCareSection358(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyAssessmentAndPlanSection360(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintSection362(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection364(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyFamilyHistorySection366(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyGeneralStatusSection368(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPastIllnessSection370(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyMedicationsSectionEntriesOptional372(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyPhysicalExamSection374(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyReasonForVisitSection376(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyResultsSectionEntriesOptional378(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyReviewOfSystemsSection380(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodySocialHistorySection382(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPresentIllnessSection384(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyImmunizationsSectionEntriesOptional386(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyProblemSectionEntriesOptional388(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyProceduresSectionEntriesOptional390(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyVitalSignsSectionEntriesOptional392(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBodyInstructionsSection394(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNoteComponentStructuredBody353(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryAndPhysicalNote init();

	/**
     * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public HistoryAndPhysicalNote init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // HistoryAndPhysicalNote
