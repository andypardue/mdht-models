/*******************************************************************************
 * Copyright (c) 2014 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *									 - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureNote2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Note2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Has An Assement And Plan Section2 Or Both Assement Section And Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Does Not Have Assement And Plan Section2 When Assement Or Plan Of Treatment2 Are Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Does Not Have Chief Complaint With Chief Complaint Or Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2Participant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2Authorization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Authorization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2Component1452(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component1452</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ParticipantAssociatedEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Participant Associated Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ParticipantAssociatedEntityAssociatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Participant Associated Entity Associated Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ParticipantFunctionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Participant Function Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ParticipantFunctionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Participant Function Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ParticipantAssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Participant Associated Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event US Realm Date And Time DT Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEventPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Assistants Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Assistants Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Assistants Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Assistants Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Effective Time Has High When No Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Effective Time No High If Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEventProcedureCodes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Procedure Codes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEventPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEventPerformerAssistants(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Assistants</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2AuthorizationConsentClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Authorization Consent Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2AuthorizationConsentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Authorization Consent Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2AuthorizationConsentStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Authorization Consent Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2AuthorizationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Authorization Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2AuthorizationConsent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Authorization Consent</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of Encompassing Encounter Encounter Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of Encompassing Encounter Location Health Care Facility Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacility(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of Encompassing Encounter Location Health Care Facility</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentOfEncompassingEncounterId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of Encompassing Encounter Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentOfEncompassingEncounterCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of Encompassing Encounter Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of Encompassing Encounter Encounter Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentOfEncompassingEncounterLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of Encompassing Encounter Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of Encompassing Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyComponentComplicationsSection21455(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Complications Section21455</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyComponentProcedureDescriptionSection1457(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Procedure Description Section1457</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyComponentProcedureIndicationsSection21459(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Procedure Indications Section21459</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyComponentPostprocedureDiagnosisSection21461(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Postprocedure Diagnosis Section21461</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyComponentAssessmentSection1463(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Assessment Section1463</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21465(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Assessment And Plan Section21465</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21467(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Plan Of Treatment Section21467</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21469(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Allergies Section Entries Optional21469</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyComponentAnesthesiaSection21471(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Anesthesia Section21471</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyComponentChiefComplaintSection1473(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Chief Complaint Section1473</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1475(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Chief Complaint And Reason For Visit Section1475</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyComponentFamilyHistorySection21477(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Family History Section21477</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21479(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component History Of Past Illness Section21479</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1481(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component History Of Present Illness Section1481</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyComponentMedicalHistorySection1483(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Medical History Section1483</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21485(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Medications Section Entries Optional21485</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyComponentMedicationsAdministeredSection21487(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Medications Administered Section21487</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyComponentPhysicalExamSection21489(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Physical Exam Section21489</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyComponentPlannedProcedureSection21491(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Planned Procedure Section21491</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyComponentProcedureDispositionSection1493(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Procedure Disposition Section1493</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1495(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Procedure Estimated Blood Loss Section1495</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyComponentProcedureFindingsSection21497(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Procedure Findings Section21497</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyComponentProcedureImplantsSection1499(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Procedure Implants Section1499</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1501(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Procedure Specimens Taken Section1501</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21503(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Procedures Section Entries Optional21503</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyComponentReasonForVisitSection1505(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Reason For Visit Section1505</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyComponentReviewOfSystemsSection1507(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Review Of Systems Section1507</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyComponentSocialHistorySection21509(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Social History Section21509</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyComplicationsSection21454(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Complications Section21454</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyProcedureDescriptionSection1456(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Procedure Description Section1456</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyProcedureIndicationsSection21458(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Procedure Indications Section21458</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyPostprocedureDiagnosisSection21460(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Postprocedure Diagnosis Section21460</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyAssessmentSection1462(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Assessment Section1462</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyAssessmentAndPlanSection21464(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Assessment And Plan Section21464</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyPlanOfTreatmentSection21466(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Plan Of Treatment Section21466</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21468(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Allergies Section Entries Optional21468</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyAnesthesiaSection21470(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Anesthesia Section21470</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyChiefComplaintSection1472(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Chief Complaint Section1472</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1474(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Chief Complaint And Reason For Visit Section1474</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyFamilyHistorySection21476(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Family History Section21476</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyHistoryOfPastIllnessSection21478(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body History Of Past Illness Section21478</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1480(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body History Of Present Illness Section1480</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyMedicalHistorySection1482(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Medical History Section1482</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21484(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Medications Section Entries Optional21484</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyMedicationsAdministeredSection21486(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Medications Administered Section21486</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyPhysicalExamSection21488(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Physical Exam Section21488</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyPlannedProcedureSection21490(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Planned Procedure Section21490</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyProcedureDispositionSection1492(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Procedure Disposition Section1492</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1494(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Procedure Estimated Blood Loss Section1494</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyProcedureFindingsSection21496(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Procedure Findings Section21496</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyProcedureImplantsSection1498(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Procedure Implants Section1498</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyProcedureSpecimensTakenSection1500(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Procedure Specimens Taken Section1500</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyProceduresSectionEntriesOptional21502(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Procedures Section Entries Optional21502</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyReasonForVisitSection1504(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Reason For Visit Section1504</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodyReviewOfSystemsSection1506(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Review Of Systems Section1506</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBodySocialHistorySection21508(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Social History Section21508</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentStructuredBody1453(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body1453</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureNote2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresentTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_OR_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresentTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSectionTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOES_NOT_HAVE_CHIEF_COMPLAINT_WITH_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

				// /* DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection */
				// DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection section =
				//
				// ConsolFactory.eINSTANCE.createDoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection().init();
				//
				//
				// target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2CodeP() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2CodePTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2CodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2CodeP(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2Code() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2CodeTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2Code",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected void setDependency(ProcedureNote2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2CodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2Code(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2Participant() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ParticipantTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2Participant",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2Participant(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOf() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOf",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOf(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2Authorization() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2AuthorizationTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2Authorization",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2Authorization(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2AuthorizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2ComponentOf() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentOfTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentOf",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentOf(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2Component1452() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2Component1452TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2Component1452",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE2_COMPONENT1452__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2Component1452(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2Component1452TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2ParticipantAssociatedEntityClassCode() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ParticipantAssociatedEntityClassCodeTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ParticipantAssociatedEntityClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ParticipantAssociatedEntityClassCode(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ParticipantAssociatedEntityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2ParticipantAssociatedEntityAssociatedPerson() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ParticipantAssociatedEntityAssociatedPersonTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ParticipantAssociatedEntityAssociatedPerson",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ParticipantAssociatedEntityAssociatedPerson(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ParticipantAssociatedEntityAssociatedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2ParticipantTypeCode() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ParticipantTypeCodeTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ParticipantTypeCode", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ParticipantTypeCode(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ParticipantTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2ParticipantFunctionCode() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ParticipantFunctionCodeTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ParticipantFunctionCode", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ParticipantFunctionCode(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ParticipantFunctionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2ParticipantFunctionCodeP() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ParticipantFunctionCodePTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ParticipantFunctionCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ParticipantFunctionCodeP(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ParticipantFunctionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2ParticipantAssociatedEntity() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ParticipantAssociatedEntityTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ParticipantAssociatedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ParticipantAssociatedEntity(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ParticipantAssociatedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLowTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_US_REALM_DATE_AND_TIME_DT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodePTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCode() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodeTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCode(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEventPerformerTypeCode() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventPerformerTypeCodeTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEventPerformerTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPerformerTypeCode(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventPerformerTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntity() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntity(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodePTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEventPerformerAssistantsTypeCode() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsTypeCodeTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsTypeCode(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidthTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidthTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidthTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidthTestCase.doValidationTest();
	}

	// /**
	// *
	// * @generated
	// */
	// @Test
	// public void testValidateProcedureNote2DocumentationOfServiceEventPreciseToTheDay() {
	// OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventPreciseToTheDayTestCase = new
	// OperationsTestCase<ProcedureNote2>(
	// "validateProcedureNote2DocumentationOfServiceEventPreciseToTheDay",
	// operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ProcedureNote2 target) {
	// target.init();
	// DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
	// ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
	// IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS("200912", "2013");
	// se.setEffectiveTime(ivlts);
	// dof.setServiceEvent(se);
	// target.getDocumentationOfs().add(dof);
	// }
	//
	// @Override
	// protected void updateToPass(ProcedureNote2 target) {
	// target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getLow().setValue(
	// PRECISE_TO_DAY);
	// target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getHigh().setValue(
	// PRECISE_TO_MINUTE);
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPreciseToTheDay(
	// (ProcedureNote2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateProcedureNote2DocumentationOfServiceEventPreciseToTheDayTestCase.doValidationTest();
	// }
	//
	// /**
	// *
	// * @generated
	// */
	// @Test
	// public void testValidateProcedureNote2DocumentationOfServiceEventPreciseToTheMinute() {
	// OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventPreciseToTheMinuteTestCase = new
	// OperationsTestCase<ProcedureNote2>(
	// "validateProcedureNote2DocumentationOfServiceEventPreciseToTheMinute",
	// operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ProcedureNote2 target) {
	// target.init();
	// DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
	// ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
	// IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
	// IVXB_TS low = DatatypesFactory.eINSTANCE.createIVXB_TS();
	// low.setValue("2009121217");
	// ts.setLow(low);
	// se.setEffectiveTime(ts);
	// dof.setServiceEvent(se);
	// target.getDocumentationOfs().add(dof);
	// }
	//
	// @Override
	// protected void updateToPass(ProcedureNote2 target) {
	// target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getLow().setValue(
	// PRECISE_TO_MINUTE);
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPreciseToTheMinute(
	// (ProcedureNote2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateProcedureNote2DocumentationOfServiceEventPreciseToTheMinuteTestCase.doValidationTest();
	// }
	//
	// /**
	// *
	// * @generated
	// */
	// @Test
	// public void testValidateProcedureNote2DocumentationOfServiceEventPreciseToTheSecond() {
	// OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventPreciseToTheSecondTestCase = new
	// OperationsTestCase<ProcedureNote2>(
	// "validateProcedureNote2DocumentationOfServiceEventPreciseToTheSecond",
	// operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ProcedureNote2 target) {
	// target.init();
	// DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
	// ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
	// IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
	// IVXB_TS high = DatatypesFactory.eINSTANCE.createIVXB_TS();
	// high.setValue(PRECISE_TO_MINUTE);
	// ts.setHigh(high);
	// se.setEffectiveTime(ts);
	// dof.setServiceEvent(se);
	// target.getDocumentationOfs().add(dof);
	// }
	//
	// @Override
	// protected void updateToPass(ProcedureNote2 target) {
	// target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getHigh().setValue(
	// PRECISE_TO_SECOND);
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPreciseToTheSecond(
	// (ProcedureNote2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateProcedureNote2DocumentationOfServiceEventPreciseToTheSecondTestCase.doValidationTest();
	// }
	//
	// /**
	// *
	// * @generated
	// */
	// @Test
	// public void testValidateProcedureNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset() {
	// OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffsetTestCase = new
	// OperationsTestCase<ProcedureNote2>(
	// "validateProcedureNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset",
	// operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ProcedureNote2 target) {
	// target.init();
	// DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
	// ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
	// IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS(PRECISE_TO_MINUTE, PRECISE_TO_SECOND);
	// se.setEffectiveTime(ivlts);
	// dof.setServiceEvent(se);
	// target.getDocumentationOfs().add(dof);
	// }
	//
	// @Override
	// protected void updateToPass(ProcedureNote2 target) {
	// target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getLow().setValue(
	// PRECISE_TO_MS_WITH_TIMEZONE);
	// target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getHigh().setValue(
	// PRECISE_TO_SECOND_WITH_TIMEZONE);
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset(
	// (ProcedureNote2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateProcedureNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffsetTestCase.doValidationTest();
	// }

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEventProcedureCodes() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventProcedureCodesTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEventProcedureCodes",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventProcedureCodes(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventProcedureCodesTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEventEffectiveTime() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventEffectiveTimeTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEventEffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventEffectiveTime(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEventCode() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventCodeTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEventCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventCode(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEventPerformer() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventPerformerTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEventPerformer",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPerformer(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEventPerformerAssistants() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEventPerformerAssistants",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPerformerAssistants(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEvent() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEvent",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEvent(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2AuthorizationConsentClassCode() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2AuthorizationConsentClassCodeTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2AuthorizationConsentClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_CONSENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2AuthorizationConsentClassCode(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2AuthorizationConsentClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2AuthorizationConsentMoodCode() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2AuthorizationConsentMoodCodeTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2AuthorizationConsentMoodCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2AuthorizationConsentMoodCode(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2AuthorizationConsentMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureNote2AuthorizationConsentStatusCode() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2AuthorizationConsentStatusCodeTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2AuthorizationConsentStatusCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_CONSENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

				// CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				// target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2AuthorizationConsentStatusCode(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2AuthorizationConsentStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2AuthorizationTypeCode() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2AuthorizationTypeCodeTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2AuthorizationTypeCode", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2AuthorizationTypeCode(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2AuthorizationTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2AuthorizationConsent() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2AuthorizationConsentTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2AuthorizationConsent", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_CONSENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2AuthorizationConsent(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2AuthorizationConsentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipantTypeCode() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipantTypeCodeTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipantTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipantTypeCode(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipantTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityIdTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacility() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacility",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacility(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2ComponentOfEncompassingEncounterId() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentOfEncompassingEncounterIdTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentOfEncompassingEncounterId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentOfEncompassingEncounterId(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentOfEncompassingEncounterIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2ComponentOfEncompassingEncounterCode() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentOfEncompassingEncounterCodeTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentOfEncompassingEncounterCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentOfEncompassingEncounterCode(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentOfEncompassingEncounterCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipant() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipantTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipant",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipant(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2ComponentOfEncompassingEncounterLocation() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentOfEncompassingEncounterLocationTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentOfEncompassingEncounterLocation",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentOfEncompassingEncounterLocation(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentOfEncompassingEncounterLocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2ComponentOfEncompassingEncounter() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentOfEncompassingEncounterTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentOfEncompassingEncounter",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentOfEncompassingEncounter(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentOfEncompassingEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyComponentComplicationsSection21455() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyComponentComplicationsSection21455TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyComponentComplicationsSection21455",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_COMPLICATIONS_SECTION21455__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentComplicationsSection21455(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyComponentComplicationsSection21455TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyComponentProcedureDescriptionSection1457() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyComponentProcedureDescriptionSection1457TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyComponentProcedureDescriptionSection1457",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DESCRIPTION_SECTION1457__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentProcedureDescriptionSection1457(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyComponentProcedureDescriptionSection1457TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyComponentProcedureIndicationsSection21459() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyComponentProcedureIndicationsSection21459TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyComponentProcedureIndicationsSection21459",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_INDICATIONS_SECTION21459__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentProcedureIndicationsSection21459(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyComponentProcedureIndicationsSection21459TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyComponentPostprocedureDiagnosisSection21461() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyComponentPostprocedureDiagnosisSection21461TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyComponentPostprocedureDiagnosisSection21461",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_POSTPROCEDURE_DIAGNOSIS_SECTION21461__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentPostprocedureDiagnosisSection21461(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyComponentPostprocedureDiagnosisSection21461TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyComponentAssessmentSection1463() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyComponentAssessmentSection1463TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyComponentAssessmentSection1463",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION1463__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentAssessmentSection1463(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyComponentAssessmentSection1463TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21465() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21465TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21465",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION21465__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21465(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21465TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21467() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21467TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21467",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21467__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21467(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21467TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21469() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21469TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21469",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL21469__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21469(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21469TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyComponentAnesthesiaSection21471() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyComponentAnesthesiaSection21471TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyComponentAnesthesiaSection21471",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ANESTHESIA_SECTION21471__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentAnesthesiaSection21471(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyComponentAnesthesiaSection21471TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyComponentChiefComplaintSection1473() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyComponentChiefComplaintSection1473TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyComponentChiefComplaintSection1473",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION1473__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentChiefComplaintSection1473(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyComponentChiefComplaintSection1473TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1475() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1475TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1475",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1475__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1475(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1475TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyComponentFamilyHistorySection21477() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyComponentFamilyHistorySection21477TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyComponentFamilyHistorySection21477",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION21477__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentFamilyHistorySection21477(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyComponentFamilyHistorySection21477TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21479() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21479TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21479",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION21479__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21479(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21479TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1481() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1481TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1481",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION1481__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1481(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1481TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyComponentMedicalHistorySection1483() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyComponentMedicalHistorySection1483TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyComponentMedicalHistorySection1483",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_HISTORY_SECTION1483__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentMedicalHistorySection1483(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyComponentMedicalHistorySection1483TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21485() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21485TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21485",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21485__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21485(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21485TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyComponentMedicationsAdministeredSection21487() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyComponentMedicationsAdministeredSection21487TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyComponentMedicationsAdministeredSection21487",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_ADMINISTERED_SECTION21487__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentMedicationsAdministeredSection21487(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyComponentMedicationsAdministeredSection21487TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyComponentPhysicalExamSection21489() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyComponentPhysicalExamSection21489TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyComponentPhysicalExamSection21489",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION21489__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentPhysicalExamSection21489(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyComponentPhysicalExamSection21489TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyComponentPlannedProcedureSection21491() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyComponentPlannedProcedureSection21491TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyComponentPlannedProcedureSection21491",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLANNED_PROCEDURE_SECTION21491__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentPlannedProcedureSection21491(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyComponentPlannedProcedureSection21491TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyComponentProcedureDispositionSection1493() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyComponentProcedureDispositionSection1493TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyComponentProcedureDispositionSection1493",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DISPOSITION_SECTION1493__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentProcedureDispositionSection1493(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyComponentProcedureDispositionSection1493TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1495() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1495TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1495",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION1495__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1495(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1495TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyComponentProcedureFindingsSection21497() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyComponentProcedureFindingsSection21497TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyComponentProcedureFindingsSection21497",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_FINDINGS_SECTION21497__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentProcedureFindingsSection21497(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyComponentProcedureFindingsSection21497TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyComponentProcedureImplantsSection1499() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyComponentProcedureImplantsSection1499TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyComponentProcedureImplantsSection1499",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_IMPLANTS_SECTION1499__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentProcedureImplantsSection1499(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyComponentProcedureImplantsSection1499TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1501() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1501TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1501",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_SPECIMENS_TAKEN_SECTION1501__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1501(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1501TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21503() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21503TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21503",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL21503__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21503(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21503TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyComponentReasonForVisitSection1505() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyComponentReasonForVisitSection1505TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyComponentReasonForVisitSection1505",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION1505__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentReasonForVisitSection1505(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyComponentReasonForVisitSection1505TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyComponentReviewOfSystemsSection1507() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyComponentReviewOfSystemsSection1507TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyComponentReviewOfSystemsSection1507",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION1507__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentReviewOfSystemsSection1507(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyComponentReviewOfSystemsSection1507TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyComponentSocialHistorySection21509() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyComponentSocialHistorySection21509TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyComponentSocialHistorySection21509",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION21509__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComponentSocialHistorySection21509(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyComponentSocialHistorySection21509TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyComplicationsSection21454() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyComplicationsSection21454TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyComplicationsSection21454",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPLICATIONS_SECTION21454__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyComplicationsSection21454(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyComplicationsSection21454TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyProcedureDescriptionSection1456() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyProcedureDescriptionSection1456TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyProcedureDescriptionSection1456",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_DESCRIPTION_SECTION1456__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyProcedureDescriptionSection1456(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyProcedureDescriptionSection1456TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyProcedureIndicationsSection21458() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyProcedureIndicationsSection21458TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyProcedureIndicationsSection21458",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_INDICATIONS_SECTION21458__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyProcedureIndicationsSection21458(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyProcedureIndicationsSection21458TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyPostprocedureDiagnosisSection21460() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyPostprocedureDiagnosisSection21460TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyPostprocedureDiagnosisSection21460",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_POSTPROCEDURE_DIAGNOSIS_SECTION21460__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyPostprocedureDiagnosisSection21460(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyPostprocedureDiagnosisSection21460TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyAssessmentSection1462() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyAssessmentSection1462TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyAssessmentSection1462",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION1462__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyAssessmentSection1462(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyAssessmentSection1462TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyAssessmentAndPlanSection21464() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyAssessmentAndPlanSection21464TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyAssessmentAndPlanSection21464",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION21464__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyAssessmentAndPlanSection21464(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyAssessmentAndPlanSection21464TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyPlanOfTreatmentSection21466() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyPlanOfTreatmentSection21466TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyPlanOfTreatmentSection21466",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21466__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyPlanOfTreatmentSection21466(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyPlanOfTreatmentSection21466TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21468() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21468TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21468",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL21468__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21468(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21468TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyAnesthesiaSection21470() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyAnesthesiaSection21470TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyAnesthesiaSection21470",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_ANESTHESIA_SECTION21470__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyAnesthesiaSection21470(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyAnesthesiaSection21470TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyChiefComplaintSection1472() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyChiefComplaintSection1472TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyChiefComplaintSection1472",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION1472__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyChiefComplaintSection1472(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyChiefComplaintSection1472TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1474() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1474TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1474",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1474__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1474(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1474TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyFamilyHistorySection21476() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyFamilyHistorySection21476TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyFamilyHistorySection21476",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION21476__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyFamilyHistorySection21476(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyFamilyHistorySection21476TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyHistoryOfPastIllnessSection21478() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyHistoryOfPastIllnessSection21478TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyHistoryOfPastIllnessSection21478",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION21478__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyHistoryOfPastIllnessSection21478(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyHistoryOfPastIllnessSection21478TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1480() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1480TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1480",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION1480__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1480(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1480TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyMedicalHistorySection1482() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyMedicalHistorySection1482TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyMedicalHistorySection1482",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICAL_HISTORY_SECTION1482__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyMedicalHistorySection1482(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyMedicalHistorySection1482TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21484() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21484TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21484",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21484__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21484(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21484TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyMedicationsAdministeredSection21486() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyMedicationsAdministeredSection21486TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyMedicationsAdministeredSection21486",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_ADMINISTERED_SECTION21486__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyMedicationsAdministeredSection21486(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyMedicationsAdministeredSection21486TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyPhysicalExamSection21488() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyPhysicalExamSection21488TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyPhysicalExamSection21488",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION21488__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyPhysicalExamSection21488(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyPhysicalExamSection21488TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyPlannedProcedureSection21490() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyPlannedProcedureSection21490TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyPlannedProcedureSection21490",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PLANNED_PROCEDURE_SECTION21490__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyPlannedProcedureSection21490(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyPlannedProcedureSection21490TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyProcedureDispositionSection1492() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyProcedureDispositionSection1492TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyProcedureDispositionSection1492",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_DISPOSITION_SECTION1492__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyProcedureDispositionSection1492(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyProcedureDispositionSection1492TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1494() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1494TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1494",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION1494__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1494(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1494TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyProcedureFindingsSection21496() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyProcedureFindingsSection21496TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyProcedureFindingsSection21496",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_FINDINGS_SECTION21496__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyProcedureFindingsSection21496(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyProcedureFindingsSection21496TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyProcedureImplantsSection1498() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyProcedureImplantsSection1498TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyProcedureImplantsSection1498",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_IMPLANTS_SECTION1498__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyProcedureImplantsSection1498(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyProcedureImplantsSection1498TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyProcedureSpecimensTakenSection1500() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyProcedureSpecimensTakenSection1500TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyProcedureSpecimensTakenSection1500",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_SPECIMENS_TAKEN_SECTION1500__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyProcedureSpecimensTakenSection1500(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyProcedureSpecimensTakenSection1500TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyProceduresSectionEntriesOptional21502() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyProceduresSectionEntriesOptional21502TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyProceduresSectionEntriesOptional21502",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL21502__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyProceduresSectionEntriesOptional21502(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyProceduresSectionEntriesOptional21502TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyReasonForVisitSection1504() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyReasonForVisitSection1504TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyReasonForVisitSection1504",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION1504__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyReasonForVisitSection1504(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyReasonForVisitSection1504TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodyReviewOfSystemsSection1506() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodyReviewOfSystemsSection1506TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodyReviewOfSystemsSection1506",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION1506__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodyReviewOfSystemsSection1506(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodyReviewOfSystemsSection1506TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBodySocialHistorySection21508() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBodySocialHistorySection21508TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBodySocialHistorySection21508",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION21508__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBodySocialHistorySection21508(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBodySocialHistorySection21508TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNote2ComponentStructuredBody1453() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentStructuredBody1453TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentStructuredBody1453",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY1453__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentStructuredBody1453(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentStructuredBody1453TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<ProcedureNote2> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateGeneralHeaderConstraintsTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateGeneralHeaderConstraintsTemplateId(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureNote2Operations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	*
	* @generated
	*/
	private static class ObjectFactory implements TestObjectFactory<ProcedureNote2> {
		public ProcedureNote2 create() {
			return ConsolFactory.eINSTANCE.createProcedureNote2();
		}
	}

	/**
	*
	* @generated
	*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	*
	* @generated
	*/
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	private static class ConstructorTestClass extends ProcedureNote2Operations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // ProcedureNote2Operations
