/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection2;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection2;
import org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDescriptionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDispositionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureEstimatedBloodLossSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureImplantsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureSpecimensTakenSection;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

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
public class ProcedureNote2Operations extends USRealmHeader2Operations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureNote2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Has An Assement And Plan Section2 Or Both Assement Section And Plan Of Treatment Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2)) and  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Has An Assement And Plan Section2 Or Both Assement Section And Plan Of Treatment Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROCEDURE_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
			ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				VALIDATE_PROCEDURE_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureNote2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2"),
						 new Object [] { procedureNote2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Does Not Have Assement And Plan Section2 When Assement Or Plan Of Treatment2 Are Present</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_OR_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2)) or  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Does Not Have Assement And Plan Section2 When Assement Or Plan Of Treatment2 Are Present</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROCEDURE_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_OR_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(
			ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_OR_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				VALIDATE_PROCEDURE_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_OR_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_OR_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_OR_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureNote2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_OR_PLAN_OF_TREATMENT2_ARE_PRESENT,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent"),
						 new Object [] { procedureNote2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Does Not Have Chief Complaint With Chief Complaint Or Reason For Visit Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_DOES_NOT_HAVE_CHIEF_COMPLAINT_WITH_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)) or  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Does Not Have Chief Complaint With Chief Complaint Or Reason For Visit Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROCEDURE_NOTE2_DOES_NOT_HAVE_CHIEF_COMPLAINT_WITH_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection(
			ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_DOES_NOT_HAVE_CHIEF_COMPLAINT_WITH_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				VALIDATE_PROCEDURE_NOTE2_DOES_NOT_HAVE_CHIEF_COMPLAINT_WITH_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE2_DOES_NOT_HAVE_CHIEF_COMPLAINT_WITH_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE2_DOES_NOT_HAVE_CHIEF_COMPLAINT_WITH_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureNote2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_DOES_NOT_HAVE_CHIEF_COMPLAINT_WITH_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT_SECTION,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection"),
						 new Object [] { procedureNote2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2CodeP(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2CodeP(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2CodeP(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2CodeP(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROCEDURE_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureNote2CodeP(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				VALIDATE_PROCEDURE_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureNote2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_CODE_P,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2CodeP"),
						 new Object [] { procedureNote2 }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2CodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2CodeP", passToken);
				}
				passToken.add(procedureNote2);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2Code(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2Code(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '28570-0' or value.code = '11505-5' or value.code = '18744-3' or value.code = '18745-0' or value.code = '18746-8' or value.code = '18751-8' or value.code = '18753-4' or value.code = '18836-7' or value.code = '28577-5' or value.code = '28625-2' or value.code = '29757-2' or value.code = '33721-2' or value.code = '34121-4' or value.code = '34896-1' or value.code = '34899-5' or value.code = '47048-4' or value.code = '48807-2'))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2Code(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2Code(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROCEDURE_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureNote2Code(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2CodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(procedureNote2)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_PROCEDURE_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				VALIDATE_PROCEDURE_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureNote2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_CODE,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2Code"),
						 new Object [] { procedureNote2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2Participant(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2Participant(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2Participant(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2Participant(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROCEDURE_NOTE2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureNote2Participant(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				VALIDATE_PROCEDURE_NOTE2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureNote2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_PARTICIPANT,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2Participant"),
						 new Object [] { procedureNote2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2DocumentationOf(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOf(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->exists(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2DocumentationOf(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOf(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureNote2DocumentationOf(ProcedureNote2 procedureNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureNote2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_DOCUMENTATION_OF,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2DocumentationOf"),
						 new Object [] { procedureNote2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2Authorization(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Authorization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2Authorization(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authorization->one(authorization : cda::Authorization | not authorization.oclIsUndefined() and authorization.oclIsKindOf(cda::Authorization))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2Authorization(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Authorization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2Authorization(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureNote2Authorization(ProcedureNote2 procedureNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureNote2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_AUTHORIZATION,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2Authorization"),
						 new Object [] { procedureNote2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentOf(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentOf(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentOf(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentOf(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureNote2ComponentOf(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureNote2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_OF,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentOf"),
						 new Object [] { procedureNote2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2Component1452(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component1452</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2Component1452(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT1452__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component2 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component2))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2Component1452(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component1452</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2Component1452(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PROCEDURE_NOTE2_COMPONENT1452__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateProcedureNote2Component1452(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT1452__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				VALIDATE_PROCEDURE_NOTE2_COMPONENT1452__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE2_COMPONENT1452__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT1452__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureNote2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT1452,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2Component1452"),
						 new Object [] { procedureNote2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ParticipantAssociatedEntityClassCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Participant Associated Entity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ParticipantAssociatedEntityClassCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject(classCode=vocab::RoleClassAssociative::PROV)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ParticipantAssociatedEntityClassCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Participant Associated Entity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ParticipantAssociatedEntityClassCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2ParticipantAssociatedEntityClassCode(ProcedureNote2 procedureNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ParticipantAssociatedEntityClassCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ParticipantAssociatedEntityAssociatedPerson(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Participant Associated Entity Associated Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ParticipantAssociatedEntityAssociatedPerson(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject(associatedPerson->one(associatedPerson : cda::Person | not associatedPerson.oclIsUndefined() and associatedPerson.oclIsKindOf(rim::Entity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ParticipantAssociatedEntityAssociatedPerson(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Participant Associated Entity Associated Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ParticipantAssociatedEntityAssociatedPerson(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2ParticipantAssociatedEntityAssociatedPerson(
			ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ParticipantAssociatedEntityAssociatedPerson"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ParticipantTypeCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Participant Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ParticipantTypeCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(typeCode=vocab::ParticipationType::IND)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ParticipantTypeCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Participant Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ParticipantTypeCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2ParticipantTypeCode(ProcedureNote2 procedureNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_PARTICIPANT_TYPE_CODE,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ParticipantTypeCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ParticipantFunctionCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Participant Function Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ParticipantFunctionCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject((functionCode.oclIsUndefined() or functionCode.isNullFlavorUndefined()) implies (not functionCode.oclIsUndefined() and functionCode.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = functionCode.oclAsType(datatypes::CE) in "+
"value.code = 'PCP' and value.codeSystem = '2.16.840.1.113883.5.88'))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ParticipantFunctionCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Participant Function Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ParticipantFunctionCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2ParticipantFunctionCode(ProcedureNote2 procedureNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_PARTICIPANT_FUNCTION_CODE,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ParticipantFunctionCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ParticipantFunctionCodeP(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Participant Function Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ParticipantFunctionCodeP(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject((functionCode.oclIsUndefined() or functionCode.isNullFlavorUndefined()) implies (not functionCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ParticipantFunctionCodeP(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Participant Function Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ParticipantFunctionCodeP(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2ParticipantFunctionCodeP(ProcedureNote2 procedureNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_PARTICIPANT_FUNCTION_CODE_P,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ParticipantFunctionCodeP"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ParticipantAssociatedEntity(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Participant Associated Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ParticipantAssociatedEntity(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(associatedEntity->one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ParticipantAssociatedEntity(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Participant Associated Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ParticipantAssociatedEntity(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2ParticipantAssociatedEntity(ProcedureNote2 procedureNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ParticipantAssociatedEntity"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event US Realm Date And Time DT Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_US_REALM_DATE_AND_TIME_DT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event US Realm Date And Time DT Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_US_REALM_DATE_AND_TIME_DT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(
			ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_US_REALM_DATE_AND_TIME_DT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_US_REALM_DATE_AND_TIME_DT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_US_REALM_DATE_AND_TIME_DT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_US_REALM_DATE_AND_TIME_DT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_US_REALM_DATE_AND_TIME_DT_LOW,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Assigned Entity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Assigned Entity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(
			ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP"),
						 new Object [] { eObject }));
				}
				
				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put("org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP", passToken);
					}
					passToken.addAll(oclResultSet);
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Assigned Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = code.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Assigned Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCode(
			ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			Object passFilter = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}
	  		
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2DocumentationOfServiceEventPerformerTypeCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEventPerformerTypeCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject(typeCode=vocab::x_ServiceEventPerformer::PPRF)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2DocumentationOfServiceEventPerformerTypeCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEventPerformerTypeCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2DocumentationOfServiceEventPerformerTypeCode(
			ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2DocumentationOfServiceEventPerformerTypeCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntity(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntity(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntity(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntity(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntity(
			ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2DocumentationOfServiceEventPerformerAssignedEntity"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Assistants Assigned Entity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Assistants Assigned Entity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP(
			ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE_P,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP"),
						 new Object [] { eObject }));
				}
				
				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put("org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP", passToken);
					}
					passToken.addAll(oclResultSet);
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Assistants Assigned Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = code.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Assistants Assigned Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode(
			ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			Object passFilter = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}
	  		
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsTypeCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Assistants Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsTypeCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject(typeCode=vocab::x_ServiceEventPerformer::SPRF)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsTypeCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Assistants Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsTypeCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsTypeCode(
			ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_TYPE_CODE,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2DocumentationOfServiceEventPerformerAssistantsTypeCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Assistants Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Assistants Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity(
			ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Effective Time Has High When No Width</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(not effectiveTime.width.oclIsUndefined() xor not effectiveTime.high.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Effective Time Has High When No Width</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(
			ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Effective Time No High If Width</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(not effectiveTime.width.oclIsUndefined() xor not effectiveTime.high.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Effective Time No High If Width</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(
			ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2DocumentationOfServiceEventProcedureCodes(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Procedure Codes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEventProcedureCodes(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(code.codeSystem = '2.16.840.1.113883.6.104' or code.codeSystem = '2.16.840.1.113883.6.12' or code.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2DocumentationOfServiceEventProcedureCodes(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Procedure Codes</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEventProcedureCodes(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2DocumentationOfServiceEventProcedureCodes(
			ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2DocumentationOfServiceEventProcedureCodes"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2DocumentationOfServiceEventEffectiveTime(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEventEffectiveTime(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2DocumentationOfServiceEventEffectiveTime(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEventEffectiveTime(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2DocumentationOfServiceEventEffectiveTime(ProcedureNote2 procedureNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2DocumentationOfServiceEventEffectiveTime"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2DocumentationOfServiceEventCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEventCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2DocumentationOfServiceEventCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEventCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2DocumentationOfServiceEventCode(ProcedureNote2 procedureNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CODE,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2DocumentationOfServiceEventCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2DocumentationOfServiceEventPerformer(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEventPerformer(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(performer->exists(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer1)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2DocumentationOfServiceEventPerformer(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEventPerformer(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2DocumentationOfServiceEventPerformer(ProcedureNote2 procedureNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2DocumentationOfServiceEventPerformer"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2DocumentationOfServiceEventPerformerAssistants(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Assistants</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEventPerformerAssistants(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(performer->exists(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer1)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2DocumentationOfServiceEventPerformerAssistants(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Assistants</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEventPerformerAssistants(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2DocumentationOfServiceEventPerformerAssistants(
			ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2DocumentationOfServiceEventPerformerAssistants"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2DocumentationOfServiceEvent(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEvent(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null)->reject(serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(cda::ServiceEvent)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2DocumentationOfServiceEvent(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2DocumentationOfServiceEvent(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2DocumentationOfServiceEvent(ProcedureNote2 procedureNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2DocumentationOfServiceEvent"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2AuthorizationConsentClassCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Authorization Consent Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2AuthorizationConsentClassCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_CONSENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authorization->excluding(null).consent->excluding(null)->reject(isDefined('classCode') and classCode=vocab::ActClass::CONS)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2AuthorizationConsentClassCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Authorization Consent Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2AuthorizationConsentClassCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_CONSENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2AuthorizationConsentClassCode(ProcedureNote2 procedureNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_CONSENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_CONSENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_CONSENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_CONSENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_AUTHORIZATION_CONSENT_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2AuthorizationConsentClassCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2AuthorizationConsentMoodCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Authorization Consent Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2AuthorizationConsentMoodCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authorization->excluding(null).consent->excluding(null)->reject(isDefined('moodCode') and moodCode=vocab::ActMood::EVN)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2AuthorizationConsentMoodCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Authorization Consent Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2AuthorizationConsentMoodCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2AuthorizationConsentMoodCode(ProcedureNote2 procedureNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_AUTHORIZATION_CONSENT_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2AuthorizationConsentMoodCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2AuthorizationConsentStatusCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Authorization Consent Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2AuthorizationConsentStatusCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_CONSENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authorization->excluding(null).consent->excluding(null)->reject((statusCode.oclIsUndefined() or statusCode.isNullFlavorUndefined()) implies (not statusCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2AuthorizationConsentStatusCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Authorization Consent Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2AuthorizationConsentStatusCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_CONSENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2AuthorizationConsentStatusCode(ProcedureNote2 procedureNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_CONSENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_CONSENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_CONSENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_CONSENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_AUTHORIZATION_CONSENT_STATUS_CODE,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2AuthorizationConsentStatusCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2AuthorizationTypeCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Authorization Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2AuthorizationTypeCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authorization->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ActRelationshipType::AUTH)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2AuthorizationTypeCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Authorization Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2AuthorizationTypeCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2AuthorizationTypeCode(ProcedureNote2 procedureNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_AUTHORIZATION_TYPE_CODE,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2AuthorizationTypeCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2AuthorizationConsent(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Authorization Consent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2AuthorizationConsent(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_CONSENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authorization->excluding(null)->reject(consent->one(consent : cda::Consent | not consent.oclIsUndefined() and consent.oclIsKindOf(cda::Consent)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2AuthorizationConsent(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Authorization Consent</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2AuthorizationConsent(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_CONSENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2AuthorizationConsent(ProcedureNote2 procedureNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_CONSENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_CONSENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_CONSENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_CONSENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_AUTHORIZATION_CONSENT,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2AuthorizationConsent"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipantTypeCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of Encompassing Encounter Encounter Participant Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipantTypeCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->excluding(null)->reject(typeCode=vocab::x_EncounterParticipant::REF)";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipantTypeCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of Encompassing Encounter Encounter Participant Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipantTypeCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipantTypeCode(
			ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_TYPE_CODE,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentOfEncompassingEncounterEncounterParticipantTypeCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of Encompassing Encounter Location Health Care Facility Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).location->excluding(null).healthCareFacility->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() >= 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of Encompassing Encounter Location Health Care Facility Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId(
			ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY_ID,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacility(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of Encompassing Encounter Location Health Care Facility</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacility(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).location->excluding(null)->reject(healthCareFacility->one(healthCareFacility : cda::HealthCareFacility | not healthCareFacility.oclIsUndefined() and healthCareFacility.oclIsKindOf(cda::HealthCareFacility)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacility(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of Encompassing Encounter Location Health Care Facility</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacility(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacility(
			ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacility"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentOfEncompassingEncounterId(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of Encompassing Encounter Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentOfEncompassingEncounterId(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentOfEncompassingEncounterId(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of Encompassing Encounter Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentOfEncompassingEncounterId(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2ComponentOfEncompassingEncounterId(ProcedureNote2 procedureNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentOfEncompassingEncounterId"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentOfEncompassingEncounterCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of Encompassing Encounter Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentOfEncompassingEncounterCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentOfEncompassingEncounterCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of Encompassing Encounter Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentOfEncompassingEncounterCode(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2ComponentOfEncompassingEncounterCode(ProcedureNote2 procedureNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_CODE,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentOfEncompassingEncounterCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipant(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of Encompassing Encounter Encounter Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipant(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(encounterParticipant->one(encounterParticipant : cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and encounterParticipant.oclIsKindOf(cda::EncounterParticipant)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipant(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of Encompassing Encounter Encounter Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipant(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipant(
			ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentOfEncompassingEncounterEncounterParticipant"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentOfEncompassingEncounterLocation(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of Encompassing Encounter Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentOfEncompassingEncounterLocation(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(location->exists(location : cda::Location | not location.oclIsUndefined() and location.oclIsKindOf(cda::Location)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentOfEncompassingEncounterLocation(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of Encompassing Encounter Location</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentOfEncompassingEncounterLocation(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2ComponentOfEncompassingEncounterLocation(ProcedureNote2 procedureNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentOfEncompassingEncounterLocation"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentOfEncompassingEncounter(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of Encompassing Encounter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentOfEncompassingEncounter(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null)->reject(encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentOfEncompassingEncounter(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of Encompassing Encounter</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentOfEncompassingEncounter(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNote2ComponentOfEncompassingEncounter(ProcedureNote2 procedureNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentOfEncompassingEncounter"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentComplicationsSection21455(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Complications Section21455</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentComplicationsSection21455(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_COMPLICATIONS_SECTION21455__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ComplicationsSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentComplicationsSection21455(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Complications Section21455</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentComplicationsSection21455(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_COMPLICATIONS_SECTION21455__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyComponentComplicationsSection21455(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_COMPLICATIONS_SECTION21455__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_COMPLICATIONS_SECTION21455__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_COMPLICATIONS_SECTION21455__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_COMPLICATIONS_SECTION21455__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_COMPLICATIONS_SECTION21455,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyComponentComplicationsSection21455"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentProcedureDescriptionSection1457(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Procedure Description Section1457</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentProcedureDescriptionSection1457(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DESCRIPTION_SECTION1457__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDescriptionSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentProcedureDescriptionSection1457(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Procedure Description Section1457</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentProcedureDescriptionSection1457(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DESCRIPTION_SECTION1457__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyComponentProcedureDescriptionSection1457(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DESCRIPTION_SECTION1457__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DESCRIPTION_SECTION1457__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DESCRIPTION_SECTION1457__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DESCRIPTION_SECTION1457__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DESCRIPTION_SECTION1457,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyComponentProcedureDescriptionSection1457"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentProcedureIndicationsSection21459(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Procedure Indications Section21459</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentProcedureIndicationsSection21459(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_INDICATIONS_SECTION21459__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureIndicationsSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentProcedureIndicationsSection21459(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Procedure Indications Section21459</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentProcedureIndicationsSection21459(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_INDICATIONS_SECTION21459__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyComponentProcedureIndicationsSection21459(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_INDICATIONS_SECTION21459__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_INDICATIONS_SECTION21459__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_INDICATIONS_SECTION21459__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_INDICATIONS_SECTION21459__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_INDICATIONS_SECTION21459,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyComponentProcedureIndicationsSection21459"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentPostprocedureDiagnosisSection21461(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Postprocedure Diagnosis Section21461</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentPostprocedureDiagnosisSection21461(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_POSTPROCEDURE_DIAGNOSIS_SECTION21461__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PostprocedureDiagnosisSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentPostprocedureDiagnosisSection21461(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Postprocedure Diagnosis Section21461</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentPostprocedureDiagnosisSection21461(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_POSTPROCEDURE_DIAGNOSIS_SECTION21461__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyComponentPostprocedureDiagnosisSection21461(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_POSTPROCEDURE_DIAGNOSIS_SECTION21461__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_POSTPROCEDURE_DIAGNOSIS_SECTION21461__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_POSTPROCEDURE_DIAGNOSIS_SECTION21461__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_POSTPROCEDURE_DIAGNOSIS_SECTION21461__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_POSTPROCEDURE_DIAGNOSIS_SECTION21461,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyComponentPostprocedureDiagnosisSection21461"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentAssessmentSection1463(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Assessment Section1463</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentAssessmentSection1463(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION1463__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentAssessmentSection1463(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Assessment Section1463</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentAssessmentSection1463(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION1463__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyComponentAssessmentSection1463(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION1463__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION1463__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION1463__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION1463__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION1463,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyComponentAssessmentSection1463"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21465(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Assessment And Plan Section21465</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21465(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION21465__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21465(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Assessment And Plan Section21465</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21465(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION21465__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21465(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION21465__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION21465__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION21465__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION21465__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION21465,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21465"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21467(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Plan Of Treatment Section21467</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21467(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21467__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21467(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Plan Of Treatment Section21467</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21467(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21467__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21467(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21467__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21467__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21467__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21467__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21467,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21467"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21469(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Allergies Section Entries Optional21469</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21469(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL21469__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21469(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Allergies Section Entries Optional21469</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21469(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL21469__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21469(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL21469__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL21469__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL21469__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL21469__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL21469,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21469"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentAnesthesiaSection21471(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Anesthesia Section21471</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentAnesthesiaSection21471(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ANESTHESIA_SECTION21471__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AnesthesiaSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentAnesthesiaSection21471(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Anesthesia Section21471</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentAnesthesiaSection21471(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ANESTHESIA_SECTION21471__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyComponentAnesthesiaSection21471(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ANESTHESIA_SECTION21471__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ANESTHESIA_SECTION21471__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ANESTHESIA_SECTION21471__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ANESTHESIA_SECTION21471__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ANESTHESIA_SECTION21471,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyComponentAnesthesiaSection21471"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentChiefComplaintSection1473(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Chief Complaint Section1473</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentChiefComplaintSection1473(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION1473__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentChiefComplaintSection1473(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Chief Complaint Section1473</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentChiefComplaintSection1473(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION1473__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyComponentChiefComplaintSection1473(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION1473__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION1473__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION1473__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION1473__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION1473,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyComponentChiefComplaintSection1473"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1475(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Chief Complaint And Reason For Visit Section1475</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1475(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1475__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1475(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Chief Complaint And Reason For Visit Section1475</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1475(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1475__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1475(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1475__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1475__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1475__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1475__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1475,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1475"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentFamilyHistorySection21477(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Family History Section21477</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentFamilyHistorySection21477(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION21477__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentFamilyHistorySection21477(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Family History Section21477</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentFamilyHistorySection21477(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION21477__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyComponentFamilyHistorySection21477(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION21477__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION21477__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION21477__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION21477__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION21477,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyComponentFamilyHistorySection21477"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21479(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component History Of Past Illness Section21479</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21479(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION21479__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21479(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component History Of Past Illness Section21479</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21479(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION21479__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21479(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION21479__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION21479__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION21479__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION21479__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION21479,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21479"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1481(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component History Of Present Illness Section1481</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1481(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION1481__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1481(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component History Of Present Illness Section1481</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1481(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION1481__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1481(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION1481__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION1481__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION1481__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION1481__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION1481,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1481"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentMedicalHistorySection1483(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Medical History Section1483</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentMedicalHistorySection1483(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_HISTORY_SECTION1483__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalHistorySection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentMedicalHistorySection1483(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Medical History Section1483</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentMedicalHistorySection1483(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_HISTORY_SECTION1483__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyComponentMedicalHistorySection1483(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_HISTORY_SECTION1483__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_HISTORY_SECTION1483__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_HISTORY_SECTION1483__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_HISTORY_SECTION1483__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_HISTORY_SECTION1483,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyComponentMedicalHistorySection1483"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21485(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Medications Section Entries Optional21485</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21485(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21485__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21485(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Medications Section Entries Optional21485</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21485(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21485__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21485(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21485__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21485__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21485__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21485__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21485,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21485"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentMedicationsAdministeredSection21487(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Medications Administered Section21487</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentMedicationsAdministeredSection21487(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_ADMINISTERED_SECTION21487__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsAdministeredSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentMedicationsAdministeredSection21487(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Medications Administered Section21487</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentMedicationsAdministeredSection21487(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_ADMINISTERED_SECTION21487__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyComponentMedicationsAdministeredSection21487(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_ADMINISTERED_SECTION21487__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_ADMINISTERED_SECTION21487__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_ADMINISTERED_SECTION21487__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_ADMINISTERED_SECTION21487__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_ADMINISTERED_SECTION21487,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyComponentMedicationsAdministeredSection21487"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentPhysicalExamSection21489(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Physical Exam Section21489</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentPhysicalExamSection21489(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION21489__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentPhysicalExamSection21489(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Physical Exam Section21489</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentPhysicalExamSection21489(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION21489__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyComponentPhysicalExamSection21489(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION21489__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION21489__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION21489__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION21489__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION21489,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyComponentPhysicalExamSection21489"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentPlannedProcedureSection21491(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Planned Procedure Section21491</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentPlannedProcedureSection21491(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLANNED_PROCEDURE_SECTION21491__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlannedProcedureSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentPlannedProcedureSection21491(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Planned Procedure Section21491</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentPlannedProcedureSection21491(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLANNED_PROCEDURE_SECTION21491__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyComponentPlannedProcedureSection21491(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLANNED_PROCEDURE_SECTION21491__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLANNED_PROCEDURE_SECTION21491__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLANNED_PROCEDURE_SECTION21491__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLANNED_PROCEDURE_SECTION21491__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLANNED_PROCEDURE_SECTION21491,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyComponentPlannedProcedureSection21491"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentProcedureDispositionSection1493(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Procedure Disposition Section1493</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentProcedureDispositionSection1493(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DISPOSITION_SECTION1493__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDispositionSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentProcedureDispositionSection1493(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Procedure Disposition Section1493</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentProcedureDispositionSection1493(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DISPOSITION_SECTION1493__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyComponentProcedureDispositionSection1493(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DISPOSITION_SECTION1493__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DISPOSITION_SECTION1493__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DISPOSITION_SECTION1493__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DISPOSITION_SECTION1493__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DISPOSITION_SECTION1493,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyComponentProcedureDispositionSection1493"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1495(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Procedure Estimated Blood Loss Section1495</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1495(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION1495__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureEstimatedBloodLossSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1495(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Procedure Estimated Blood Loss Section1495</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1495(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION1495__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1495(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION1495__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION1495__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION1495__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION1495__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION1495,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1495"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentProcedureFindingsSection21497(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Procedure Findings Section21497</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentProcedureFindingsSection21497(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_FINDINGS_SECTION21497__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureFindingsSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentProcedureFindingsSection21497(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Procedure Findings Section21497</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentProcedureFindingsSection21497(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_FINDINGS_SECTION21497__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyComponentProcedureFindingsSection21497(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_FINDINGS_SECTION21497__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_FINDINGS_SECTION21497__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_FINDINGS_SECTION21497__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_FINDINGS_SECTION21497__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_FINDINGS_SECTION21497,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyComponentProcedureFindingsSection21497"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentProcedureImplantsSection1499(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Procedure Implants Section1499</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentProcedureImplantsSection1499(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_IMPLANTS_SECTION1499__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureImplantsSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentProcedureImplantsSection1499(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Procedure Implants Section1499</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentProcedureImplantsSection1499(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_IMPLANTS_SECTION1499__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyComponentProcedureImplantsSection1499(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_IMPLANTS_SECTION1499__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_IMPLANTS_SECTION1499__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_IMPLANTS_SECTION1499__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_IMPLANTS_SECTION1499__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_IMPLANTS_SECTION1499,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyComponentProcedureImplantsSection1499"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1501(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Procedure Specimens Taken Section1501</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1501(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_SPECIMENS_TAKEN_SECTION1501__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureSpecimensTakenSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1501(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Procedure Specimens Taken Section1501</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1501(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_SPECIMENS_TAKEN_SECTION1501__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1501(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_SPECIMENS_TAKEN_SECTION1501__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_SPECIMENS_TAKEN_SECTION1501__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_SPECIMENS_TAKEN_SECTION1501__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_SPECIMENS_TAKEN_SECTION1501__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_SPECIMENS_TAKEN_SECTION1501,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1501"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21503(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Procedures Section Entries Optional21503</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21503(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL21503__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21503(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Procedures Section Entries Optional21503</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21503(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL21503__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21503(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL21503__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL21503__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL21503__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL21503__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL21503,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21503"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentReasonForVisitSection1505(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Reason For Visit Section1505</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentReasonForVisitSection1505(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION1505__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentReasonForVisitSection1505(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Reason For Visit Section1505</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentReasonForVisitSection1505(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION1505__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyComponentReasonForVisitSection1505(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION1505__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION1505__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION1505__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION1505__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION1505,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyComponentReasonForVisitSection1505"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentReviewOfSystemsSection1507(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Review Of Systems Section1507</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentReviewOfSystemsSection1507(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION1507__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentReviewOfSystemsSection1507(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Review Of Systems Section1507</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentReviewOfSystemsSection1507(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION1507__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyComponentReviewOfSystemsSection1507(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION1507__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION1507__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION1507__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION1507__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION1507,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyComponentReviewOfSystemsSection1507"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentSocialHistorySection21509(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Social History Section21509</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentSocialHistorySection21509(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION21509__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyComponentSocialHistorySection21509(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Component Social History Section21509</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComponentSocialHistorySection21509(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION21509__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyComponentSocialHistorySection21509(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION21509__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION21509__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION21509__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION21509__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION21509,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyComponentSocialHistorySection21509"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyComplicationsSection21454(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Complications Section21454</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComplicationsSection21454(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPLICATIONS_SECTION21454__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyComplicationsSection21454(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Complications Section21454</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyComplicationsSection21454(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPLICATIONS_SECTION21454__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyComplicationsSection21454(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPLICATIONS_SECTION21454__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPLICATIONS_SECTION21454__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPLICATIONS_SECTION21454__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPLICATIONS_SECTION21454__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPLICATIONS_SECTION21454,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyComplicationsSection21454"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyProcedureDescriptionSection1456(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Procedure Description Section1456</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyProcedureDescriptionSection1456(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_DESCRIPTION_SECTION1456__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyProcedureDescriptionSection1456(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Procedure Description Section1456</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyProcedureDescriptionSection1456(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_DESCRIPTION_SECTION1456__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyProcedureDescriptionSection1456(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_DESCRIPTION_SECTION1456__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_DESCRIPTION_SECTION1456__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_DESCRIPTION_SECTION1456__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_DESCRIPTION_SECTION1456__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_DESCRIPTION_SECTION1456,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyProcedureDescriptionSection1456"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyProcedureIndicationsSection21458(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Procedure Indications Section21458</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyProcedureIndicationsSection21458(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_INDICATIONS_SECTION21458__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyProcedureIndicationsSection21458(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Procedure Indications Section21458</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyProcedureIndicationsSection21458(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_INDICATIONS_SECTION21458__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyProcedureIndicationsSection21458(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_INDICATIONS_SECTION21458__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_INDICATIONS_SECTION21458__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_INDICATIONS_SECTION21458__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_INDICATIONS_SECTION21458__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_INDICATIONS_SECTION21458,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyProcedureIndicationsSection21458"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyPostprocedureDiagnosisSection21460(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Postprocedure Diagnosis Section21460</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyPostprocedureDiagnosisSection21460(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_POSTPROCEDURE_DIAGNOSIS_SECTION21460__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyPostprocedureDiagnosisSection21460(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Postprocedure Diagnosis Section21460</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyPostprocedureDiagnosisSection21460(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_POSTPROCEDURE_DIAGNOSIS_SECTION21460__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyPostprocedureDiagnosisSection21460(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_POSTPROCEDURE_DIAGNOSIS_SECTION21460__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_POSTPROCEDURE_DIAGNOSIS_SECTION21460__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_POSTPROCEDURE_DIAGNOSIS_SECTION21460__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_POSTPROCEDURE_DIAGNOSIS_SECTION21460__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_POSTPROCEDURE_DIAGNOSIS_SECTION21460,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyPostprocedureDiagnosisSection21460"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyAssessmentSection1462(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Assessment Section1462</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyAssessmentSection1462(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION1462__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyAssessmentSection1462(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Assessment Section1462</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyAssessmentSection1462(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION1462__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyAssessmentSection1462(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION1462__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION1462__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION1462__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION1462__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION1462,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyAssessmentSection1462"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyAssessmentAndPlanSection21464(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Assessment And Plan Section21464</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyAssessmentAndPlanSection21464(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION21464__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyAssessmentAndPlanSection21464(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Assessment And Plan Section21464</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyAssessmentAndPlanSection21464(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION21464__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyAssessmentAndPlanSection21464(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION21464__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION21464__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION21464__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION21464__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION21464,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyAssessmentAndPlanSection21464"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyPlanOfTreatmentSection21466(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Plan Of Treatment Section21466</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyPlanOfTreatmentSection21466(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21466__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyPlanOfTreatmentSection21466(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Plan Of Treatment Section21466</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyPlanOfTreatmentSection21466(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21466__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyPlanOfTreatmentSection21466(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21466__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21466__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21466__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21466__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21466,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyPlanOfTreatmentSection21466"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21468(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Allergies Section Entries Optional21468</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21468(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL21468__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21468(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Allergies Section Entries Optional21468</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21468(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL21468__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21468(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL21468__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL21468__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL21468__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL21468__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL21468,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21468"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyAnesthesiaSection21470(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Anesthesia Section21470</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyAnesthesiaSection21470(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_ANESTHESIA_SECTION21470__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyAnesthesiaSection21470(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Anesthesia Section21470</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyAnesthesiaSection21470(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_ANESTHESIA_SECTION21470__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyAnesthesiaSection21470(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_ANESTHESIA_SECTION21470__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_ANESTHESIA_SECTION21470__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_ANESTHESIA_SECTION21470__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_ANESTHESIA_SECTION21470__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_ANESTHESIA_SECTION21470,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyAnesthesiaSection21470"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyChiefComplaintSection1472(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Chief Complaint Section1472</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyChiefComplaintSection1472(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION1472__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyChiefComplaintSection1472(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Chief Complaint Section1472</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyChiefComplaintSection1472(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION1472__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyChiefComplaintSection1472(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION1472__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION1472__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION1472__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION1472__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION1472,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyChiefComplaintSection1472"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1474(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Chief Complaint And Reason For Visit Section1474</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1474(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1474__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1474(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Chief Complaint And Reason For Visit Section1474</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1474(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1474__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1474(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1474__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1474__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1474__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1474__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1474,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1474"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyFamilyHistorySection21476(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Family History Section21476</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyFamilyHistorySection21476(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION21476__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyFamilyHistorySection21476(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Family History Section21476</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyFamilyHistorySection21476(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION21476__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyFamilyHistorySection21476(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION21476__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION21476__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION21476__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION21476__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION21476,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyFamilyHistorySection21476"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyHistoryOfPastIllnessSection21478(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body History Of Past Illness Section21478</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyHistoryOfPastIllnessSection21478(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION21478__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyHistoryOfPastIllnessSection21478(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body History Of Past Illness Section21478</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyHistoryOfPastIllnessSection21478(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION21478__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyHistoryOfPastIllnessSection21478(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION21478__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION21478__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION21478__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION21478__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION21478,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyHistoryOfPastIllnessSection21478"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1480(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body History Of Present Illness Section1480</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1480(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION1480__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1480(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body History Of Present Illness Section1480</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1480(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION1480__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1480(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION1480__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION1480__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION1480__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION1480__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION1480,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1480"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyMedicalHistorySection1482(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Medical History Section1482</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyMedicalHistorySection1482(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICAL_HISTORY_SECTION1482__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyMedicalHistorySection1482(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Medical History Section1482</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyMedicalHistorySection1482(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICAL_HISTORY_SECTION1482__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyMedicalHistorySection1482(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICAL_HISTORY_SECTION1482__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICAL_HISTORY_SECTION1482__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICAL_HISTORY_SECTION1482__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICAL_HISTORY_SECTION1482__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICAL_HISTORY_SECTION1482,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyMedicalHistorySection1482"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21484(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Medications Section Entries Optional21484</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21484(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21484__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21484(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Medications Section Entries Optional21484</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21484(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21484__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21484(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21484__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21484__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21484__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21484__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21484,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21484"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyMedicationsAdministeredSection21486(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Medications Administered Section21486</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyMedicationsAdministeredSection21486(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_ADMINISTERED_SECTION21486__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyMedicationsAdministeredSection21486(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Medications Administered Section21486</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyMedicationsAdministeredSection21486(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_ADMINISTERED_SECTION21486__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyMedicationsAdministeredSection21486(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_ADMINISTERED_SECTION21486__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_ADMINISTERED_SECTION21486__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_ADMINISTERED_SECTION21486__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_ADMINISTERED_SECTION21486__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_ADMINISTERED_SECTION21486,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyMedicationsAdministeredSection21486"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyPhysicalExamSection21488(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Physical Exam Section21488</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyPhysicalExamSection21488(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION21488__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyPhysicalExamSection21488(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Physical Exam Section21488</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyPhysicalExamSection21488(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION21488__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyPhysicalExamSection21488(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION21488__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION21488__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION21488__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION21488__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION21488,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyPhysicalExamSection21488"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyPlannedProcedureSection21490(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Planned Procedure Section21490</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyPlannedProcedureSection21490(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PLANNED_PROCEDURE_SECTION21490__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyPlannedProcedureSection21490(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Planned Procedure Section21490</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyPlannedProcedureSection21490(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PLANNED_PROCEDURE_SECTION21490__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyPlannedProcedureSection21490(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PLANNED_PROCEDURE_SECTION21490__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PLANNED_PROCEDURE_SECTION21490__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PLANNED_PROCEDURE_SECTION21490__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PLANNED_PROCEDURE_SECTION21490__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PLANNED_PROCEDURE_SECTION21490,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyPlannedProcedureSection21490"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyProcedureDispositionSection1492(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Procedure Disposition Section1492</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyProcedureDispositionSection1492(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_DISPOSITION_SECTION1492__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyProcedureDispositionSection1492(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Procedure Disposition Section1492</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyProcedureDispositionSection1492(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_DISPOSITION_SECTION1492__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyProcedureDispositionSection1492(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_DISPOSITION_SECTION1492__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_DISPOSITION_SECTION1492__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_DISPOSITION_SECTION1492__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_DISPOSITION_SECTION1492__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_DISPOSITION_SECTION1492,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyProcedureDispositionSection1492"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1494(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Procedure Estimated Blood Loss Section1494</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1494(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION1494__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1494(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Procedure Estimated Blood Loss Section1494</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1494(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION1494__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1494(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION1494__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION1494__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION1494__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION1494__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION1494,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1494"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyProcedureFindingsSection21496(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Procedure Findings Section21496</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyProcedureFindingsSection21496(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_FINDINGS_SECTION21496__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyProcedureFindingsSection21496(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Procedure Findings Section21496</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyProcedureFindingsSection21496(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_FINDINGS_SECTION21496__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyProcedureFindingsSection21496(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_FINDINGS_SECTION21496__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_FINDINGS_SECTION21496__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_FINDINGS_SECTION21496__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_FINDINGS_SECTION21496__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_FINDINGS_SECTION21496,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyProcedureFindingsSection21496"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyProcedureImplantsSection1498(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Procedure Implants Section1498</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyProcedureImplantsSection1498(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_IMPLANTS_SECTION1498__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyProcedureImplantsSection1498(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Procedure Implants Section1498</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyProcedureImplantsSection1498(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_IMPLANTS_SECTION1498__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyProcedureImplantsSection1498(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_IMPLANTS_SECTION1498__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_IMPLANTS_SECTION1498__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_IMPLANTS_SECTION1498__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_IMPLANTS_SECTION1498__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_IMPLANTS_SECTION1498,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyProcedureImplantsSection1498"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyProcedureSpecimensTakenSection1500(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Procedure Specimens Taken Section1500</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyProcedureSpecimensTakenSection1500(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_SPECIMENS_TAKEN_SECTION1500__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyProcedureSpecimensTakenSection1500(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Procedure Specimens Taken Section1500</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyProcedureSpecimensTakenSection1500(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_SPECIMENS_TAKEN_SECTION1500__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyProcedureSpecimensTakenSection1500(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_SPECIMENS_TAKEN_SECTION1500__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_SPECIMENS_TAKEN_SECTION1500__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_SPECIMENS_TAKEN_SECTION1500__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_SPECIMENS_TAKEN_SECTION1500__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_SPECIMENS_TAKEN_SECTION1500,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyProcedureSpecimensTakenSection1500"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyProceduresSectionEntriesOptional21502(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Procedures Section Entries Optional21502</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyProceduresSectionEntriesOptional21502(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL21502__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyProceduresSectionEntriesOptional21502(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Procedures Section Entries Optional21502</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyProceduresSectionEntriesOptional21502(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL21502__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyProceduresSectionEntriesOptional21502(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL21502__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL21502__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL21502__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL21502__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL21502,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyProceduresSectionEntriesOptional21502"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyReasonForVisitSection1504(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Reason For Visit Section1504</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyReasonForVisitSection1504(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION1504__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyReasonForVisitSection1504(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Reason For Visit Section1504</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyReasonForVisitSection1504(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION1504__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyReasonForVisitSection1504(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION1504__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION1504__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION1504__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION1504__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION1504,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyReasonForVisitSection1504"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodyReviewOfSystemsSection1506(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Review Of Systems Section1506</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyReviewOfSystemsSection1506(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION1506__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodyReviewOfSystemsSection1506(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Review Of Systems Section1506</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodyReviewOfSystemsSection1506(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION1506__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodyReviewOfSystemsSection1506(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION1506__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION1506__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION1506__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION1506__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION1506,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodyReviewOfSystemsSection1506"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBodySocialHistorySection21508(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Social History Section21508</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodySocialHistorySection21508(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION21508__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBodySocialHistorySection21508(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body Social History Section21508</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBodySocialHistorySection21508(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION21508__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBodySocialHistorySection21508(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION21508__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION21508__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION21508__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION21508__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION21508,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBodySocialHistorySection21508"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNote2ComponentStructuredBody1453(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body1453</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBody1453(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY1453__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null)->reject(structuredBody->one(structuredBody : cda::StructuredBody | not structuredBody.oclIsUndefined() and structuredBody.oclIsKindOf(cda::StructuredBody)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNote2ComponentStructuredBody1453(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Structured Body1453</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNote2ComponentStructuredBody1453(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY1453__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateProcedureNote2ComponentStructuredBody1453(ProcedureNote2 procedureNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY1453__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY1453__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY1453__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY1453__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__PROCEDURE_NOTE2_COMPONENT_STRUCTURED_BODY1453,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2ProcedureNote2ComponentStructuredBody1453"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.6' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(ProcedureNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureNote2 The receiving '<em><b>Procedure Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsTemplateId(ProcedureNote2 procedureNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE2);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureNote2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROCEDURE_NOTE2__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("ProcedureNote2GeneralHeaderConstraintsTemplateId"),
						 new Object [] { procedureNote2 }));
			}
			 
			return false;
		}
		return true;
	}

} // ProcedureNote2Operations
