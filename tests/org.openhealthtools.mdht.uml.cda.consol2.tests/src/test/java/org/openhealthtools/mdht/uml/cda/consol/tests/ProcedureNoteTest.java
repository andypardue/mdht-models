/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     Dan Brown (Audacious Inquiry) - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureNote;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureNoteOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Note</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Has An Assement And Plan Section Or Individual Assement And Plan Sections</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Does Not Have Individual Assement And Plan Sections When Assement And Plan Section Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteSectionTitles(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Section Titles</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateGeneralHeaderConstraintsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteParticipant1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Participant1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponent430(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component430</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacilityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5 Location Health Care Facility Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacility(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5 Location Health Care Facility</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5 Encounter Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentOfEncompassingEncounter5Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentOfEncompassingEncounter5Location(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5 Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5 Encounter Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentOfEncompassingEncounter5(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of Service Event1 Primary Performer Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of Service Event1 Primary Performer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of Service Event1 Primary Performer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of Service Event1 Primary Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOfServiceEvent1ProcedureCodes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of Service Event1 Procedure Codes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of Service Event1 Effective Time Has Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasHighWhenNoWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of Service Event1 Effective Time Has High When No Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeNoHighIfWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of Service Event1 Effective Time No High If Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of Service Event1 Precise To The Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheMinute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of Service Event1 Precise To The Minute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheSecond(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of Service Event1 Precise To The Second</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOfServiceEvent1IfMorePreciseThanDayIncludeTimeZoneOffset(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of Service Event1 If More Precise Than Day Include Time Zone Offset</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOfServiceEvent1Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of Service Event1 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOfServiceEvent1EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of Service Event1 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of Service Event1 Primary Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOfServiceEvent1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of Service Event1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyComponentAssessmentSection433(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Component Assessment Section433</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyComponentPlanOfCareSection435(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Component Plan Of Care Section435</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyComponentAssessmentAndPlanSection437(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Component Assessment And Plan Section437</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyComponentComplicationsSection439(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Component Complications Section439</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyComponentPostprocedureDiagnosisSection441(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Component Postprocedure Diagnosis Section441</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyComponentProcedureDescriptionSection443(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Component Procedure Description Section443</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyComponentProcedureIndicationsSection445(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Component Procedure Indications Section445</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional447(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Component Allergies Section Entries Optional447</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyComponentAnesthesiaSection449(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Component Anesthesia Section449</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyComponentChiefComplaintSection451(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Component Chief Complaint Section451</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection453(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Component Chief Complaint And Reason For Visit Section453</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyComponentFamilyHistorySection455(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Component Family History Section455</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection457(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Component History Of Past Illness Section457</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection459(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Component History Of Present Illness Section459</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyComponentMedicalHistorySection461(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Component Medical History Section461</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional463(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Component Medications Section Entries Optional463</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyComponentMedicationsAdministeredSection465(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Component Medications Administered Section465</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyComponentPhysicalExamSection467(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Component Physical Exam Section467</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyComponentPlannedProcedureSection469(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Component Planned Procedure Section469</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyComponentProcedureDispositionSection471(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Component Procedure Disposition Section471</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyComponentProcedureEstimatedBloodLossSection473(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Component Procedure Estimated Blood Loss Section473</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyComponentProcedureFindingsSection475(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Component Procedure Findings Section475</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyComponentProcedureImplantsSection477(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Component Procedure Implants Section477</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyComponentProcedureSpecimensTakenSection479(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Component Procedure Specimens Taken Section479</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional481(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Component Procedures Section Entries Optional481</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyComponentReasonForVisitSection483(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Component Reason For Visit Section483</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyComponentReviewOfSystemsSection485(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Component Review Of Systems Section485</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyComponentSocialHistorySection487(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Component Social History Section487</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyAssessmentSection432(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Assessment Section432</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyPlanOfCareSection434(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Plan Of Care Section434</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyAssessmentAndPlanSection436(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Assessment And Plan Section436</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyComplicationsSection438(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Complications Section438</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyPostprocedureDiagnosisSection440(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Postprocedure Diagnosis Section440</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyProcedureDescriptionSection442(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Procedure Description Section442</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyProcedureIndicationsSection444(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Procedure Indications Section444</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyAllergiesSectionEntriesOptional446(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Allergies Section Entries Optional446</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyAnesthesiaSection448(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Anesthesia Section448</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyChiefComplaintSection450(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Chief Complaint Section450</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection452(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Chief Complaint And Reason For Visit Section452</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyFamilyHistorySection454(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Family History Section454</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyHistoryOfPastIllnessSection456(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body History Of Past Illness Section456</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyHistoryOfPresentIllnessSection458(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body History Of Present Illness Section458</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyMedicalHistorySection460(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Medical History Section460</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyMedicationsSectionEntriesOptional462(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Medications Section Entries Optional462</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyMedicationsAdministeredSection464(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Medications Administered Section464</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyPhysicalExamSection466(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Physical Exam Section466</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyPlannedProcedureSection468(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Planned Procedure Section468</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyProcedureDispositionSection470(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Procedure Disposition Section470</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyProcedureEstimatedBloodLossSection472(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Procedure Estimated Blood Loss Section472</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyProcedureFindingsSection474(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Procedure Findings Section474</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyProcedureImplantsSection476(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Procedure Implants Section476</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyProcedureSpecimensTakenSection478(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Procedure Specimens Taken Section478</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyProceduresSectionEntriesOptional480(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Procedures Section Entries Optional480</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyReasonForVisitSection482(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Reason For Visit Section482</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodyReviewOfSystemsSection484(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Review Of Systems Section484</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBodySocialHistorySection486(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body Social History Section486</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentStructuredBody431(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Structured Body431</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureNoteTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSectionsTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSectionsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresentTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresentTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				// /* DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection */
				// DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection section =
				//
				// ConsolFactory.eINSTANCE.createDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection().init();
				//
				//
				// target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteSectionTitles() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteSectionTitlesTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteSectionTitles",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_SECTION_TITLES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteSectionTitles(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteSectionTitlesTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCodeP() {
		OperationsTestCase<ProcedureNote> validateGeneralHeaderConstraintsCodePTestCase = new OperationsTestCase<ProcedureNote>(
			"validateGeneralHeaderConstraintsCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateGeneralHeaderConstraintsCodeP(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteComponentOf() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentOfTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentOf",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentOf(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteParticipant1() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteParticipant1TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteParticipant1",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteParticipant1(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteParticipant1TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOf() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOf",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOf(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponent430() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponent430TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponent430",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_COMPONENT430__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponent430(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponent430TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacilityId() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacilityIdTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacilityId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_LOCATION_HEALTH_CARE_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacilityId(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacilityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacility() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacilityTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacility",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_LOCATION_HEALTH_CARE_FACILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacility(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacilityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipantTypeCode() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipantTypeCodeTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipantTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_ENCOUNTER_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipantTypeCode(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipantTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteComponentOfEncompassingEncounter5Code() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentOfEncompassingEncounter5CodeTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentOfEncompassingEncounter5Code",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentOfEncompassingEncounter5Code(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentOfEncompassingEncounter5CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteComponentOfEncompassingEncounter5Location() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentOfEncompassingEncounter5LocationTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentOfEncompassingEncounter5Location",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentOfEncompassingEncounter5Location(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentOfEncompassingEncounter5LocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipant() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipantTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipant",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipant(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteComponentOfEncompassingEncounter5() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentOfEncompassingEncounter5TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentOfEncompassingEncounter5",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentOfEncompassingEncounter5(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentOfEncompassingEncounter5TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCodeP() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCodePTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT1_PRIMARY_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCodeP(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCode() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCodeTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT1_PRIMARY_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCode(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerTypeCode() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerTypeCodeTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT1_PRIMARY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerTypeCode(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntity() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT1_PRIMARY_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntity(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOfServiceEvent1ProcedureCodes() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfServiceEvent1ProcedureCodesTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOfServiceEvent1ProcedureCodes",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT1_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1ProcedureCodes(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfServiceEvent1ProcedureCodesTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasLow() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasLowTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasLow",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT1_EFFECTIVE_TIME_HAS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasLow(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasHighWhenNoWidth() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasHighWhenNoWidthTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasHighWhenNoWidth",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT1_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasHighWhenNoWidth(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasHighWhenNoWidthTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeNoHighIfWidth() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeNoHighIfWidthTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeNoHighIfWidth",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT1_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeNoHighIfWidth(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeNoHighIfWidthTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOfServiceEvent1PreciseToTheDay() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheDayTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheDay",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT1_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheDay(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheDayTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOfServiceEvent1PreciseToTheMinute() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheMinuteTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheMinute",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT1_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheMinute(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheMinuteTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOfServiceEvent1PreciseToTheSecond() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheSecondTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheSecond",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT1_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheSecond(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheSecondTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOfServiceEvent1IfMorePreciseThanDayIncludeTimeZoneOffset() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfServiceEvent1IfMorePreciseThanDayIncludeTimeZoneOffsetTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOfServiceEvent1IfMorePreciseThanDayIncludeTimeZoneOffset",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT1_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1IfMorePreciseThanDayIncludeTimeZoneOffset(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfServiceEvent1IfMorePreciseThanDayIncludeTimeZoneOffsetTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOfServiceEvent1Code() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfServiceEvent1CodeTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOfServiceEvent1Code",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT1_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1Code(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfServiceEvent1CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOfServiceEvent1EffectiveTime() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOfServiceEvent1EffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT1_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1EffectiveTime(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformer() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformer",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT1_PRIMARY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformer(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOfServiceEvent1() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfServiceEvent1TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOfServiceEvent1",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfServiceEvent1TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyComponentAssessmentSection433() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyComponentAssessmentSection433TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyComponentAssessmentSection433",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION433__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentAssessmentSection433(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyComponentAssessmentSection433TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyComponentPlanOfCareSection435() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyComponentPlanOfCareSection435TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyComponentPlanOfCareSection435",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_CARE_SECTION435__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentPlanOfCareSection435(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyComponentPlanOfCareSection435TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyComponentAssessmentAndPlanSection437() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyComponentAssessmentAndPlanSection437TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyComponentAssessmentAndPlanSection437",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION437__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentAssessmentAndPlanSection437(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyComponentAssessmentAndPlanSection437TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyComponentComplicationsSection439() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyComponentComplicationsSection439TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyComponentComplicationsSection439",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_COMPLICATIONS_SECTION439__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentComplicationsSection439(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyComponentComplicationsSection439TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyComponentPostprocedureDiagnosisSection441() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyComponentPostprocedureDiagnosisSection441TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyComponentPostprocedureDiagnosisSection441",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_POSTPROCEDURE_DIAGNOSIS_SECTION441__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentPostprocedureDiagnosisSection441(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyComponentPostprocedureDiagnosisSection441TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyComponentProcedureDescriptionSection443() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyComponentProcedureDescriptionSection443TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyComponentProcedureDescriptionSection443",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DESCRIPTION_SECTION443__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentProcedureDescriptionSection443(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyComponentProcedureDescriptionSection443TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyComponentProcedureIndicationsSection445() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyComponentProcedureIndicationsSection445TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyComponentProcedureIndicationsSection445",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_INDICATIONS_SECTION445__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentProcedureIndicationsSection445(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyComponentProcedureIndicationsSection445TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional447() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional447TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional447",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL447__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional447(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional447TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyComponentAnesthesiaSection449() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyComponentAnesthesiaSection449TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyComponentAnesthesiaSection449",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ANESTHESIA_SECTION449__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentAnesthesiaSection449(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyComponentAnesthesiaSection449TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyComponentChiefComplaintSection451() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyComponentChiefComplaintSection451TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyComponentChiefComplaintSection451",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION451__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentChiefComplaintSection451(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyComponentChiefComplaintSection451TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection453() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection453TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection453",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION453__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection453(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection453TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyComponentFamilyHistorySection455() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyComponentFamilyHistorySection455TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyComponentFamilyHistorySection455",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION455__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentFamilyHistorySection455(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyComponentFamilyHistorySection455TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection457() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection457TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection457",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION457__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection457(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection457TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection459() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection459TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection459",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION459__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection459(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection459TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyComponentMedicalHistorySection461() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyComponentMedicalHistorySection461TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyComponentMedicalHistorySection461",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_HISTORY_SECTION461__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentMedicalHistorySection461(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyComponentMedicalHistorySection461TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional463() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional463TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional463",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION_ENTRIES_OPTIONAL463__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional463(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional463TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyComponentMedicationsAdministeredSection465() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyComponentMedicationsAdministeredSection465TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyComponentMedicationsAdministeredSection465",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_ADMINISTERED_SECTION465__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentMedicationsAdministeredSection465(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyComponentMedicationsAdministeredSection465TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyComponentPhysicalExamSection467() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyComponentPhysicalExamSection467TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyComponentPhysicalExamSection467",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION467__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentPhysicalExamSection467(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyComponentPhysicalExamSection467TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyComponentPlannedProcedureSection469() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyComponentPlannedProcedureSection469TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyComponentPlannedProcedureSection469",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PLANNED_PROCEDURE_SECTION469__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentPlannedProcedureSection469(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyComponentPlannedProcedureSection469TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyComponentProcedureDispositionSection471() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyComponentProcedureDispositionSection471TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyComponentProcedureDispositionSection471",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DISPOSITION_SECTION471__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentProcedureDispositionSection471(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyComponentProcedureDispositionSection471TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyComponentProcedureEstimatedBloodLossSection473() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyComponentProcedureEstimatedBloodLossSection473TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyComponentProcedureEstimatedBloodLossSection473",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION473__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentProcedureEstimatedBloodLossSection473(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyComponentProcedureEstimatedBloodLossSection473TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyComponentProcedureFindingsSection475() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyComponentProcedureFindingsSection475TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyComponentProcedureFindingsSection475",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_FINDINGS_SECTION475__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentProcedureFindingsSection475(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyComponentProcedureFindingsSection475TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyComponentProcedureImplantsSection477() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyComponentProcedureImplantsSection477TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyComponentProcedureImplantsSection477",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_IMPLANTS_SECTION477__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentProcedureImplantsSection477(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyComponentProcedureImplantsSection477TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyComponentProcedureSpecimensTakenSection479() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyComponentProcedureSpecimensTakenSection479TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyComponentProcedureSpecimensTakenSection479",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_SPECIMENS_TAKEN_SECTION479__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentProcedureSpecimensTakenSection479(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyComponentProcedureSpecimensTakenSection479TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional481() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional481TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional481",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL481__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional481(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional481TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyComponentReasonForVisitSection483() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyComponentReasonForVisitSection483TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyComponentReasonForVisitSection483",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION483__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentReasonForVisitSection483(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyComponentReasonForVisitSection483TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyComponentReviewOfSystemsSection485() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyComponentReviewOfSystemsSection485TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyComponentReviewOfSystemsSection485",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION485__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentReviewOfSystemsSection485(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyComponentReviewOfSystemsSection485TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyComponentSocialHistorySection487() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyComponentSocialHistorySection487TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyComponentSocialHistorySection487",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION487__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComponentSocialHistorySection487(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyComponentSocialHistorySection487TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyAssessmentSection432() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyAssessmentSection432TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyAssessmentSection432",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION432__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyAssessmentSection432(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyAssessmentSection432TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyPlanOfCareSection434() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyPlanOfCareSection434TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyPlanOfCareSection434",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_PLAN_OF_CARE_SECTION434__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyPlanOfCareSection434(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyPlanOfCareSection434TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyAssessmentAndPlanSection436() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyAssessmentAndPlanSection436TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyAssessmentAndPlanSection436",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION436__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyAssessmentAndPlanSection436(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyAssessmentAndPlanSection436TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyComplicationsSection438() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyComplicationsSection438TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyComplicationsSection438",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_COMPLICATIONS_SECTION438__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyComplicationsSection438(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyComplicationsSection438TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyPostprocedureDiagnosisSection440() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyPostprocedureDiagnosisSection440TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyPostprocedureDiagnosisSection440",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_POSTPROCEDURE_DIAGNOSIS_SECTION440__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyPostprocedureDiagnosisSection440(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyPostprocedureDiagnosisSection440TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyProcedureDescriptionSection442() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyProcedureDescriptionSection442TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyProcedureDescriptionSection442",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_DESCRIPTION_SECTION442__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyProcedureDescriptionSection442(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyProcedureDescriptionSection442TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyProcedureIndicationsSection444() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyProcedureIndicationsSection444TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyProcedureIndicationsSection444",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_INDICATIONS_SECTION444__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyProcedureIndicationsSection444(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyProcedureIndicationsSection444TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyAllergiesSectionEntriesOptional446() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyAllergiesSectionEntriesOptional446TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyAllergiesSectionEntriesOptional446",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL446__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyAllergiesSectionEntriesOptional446(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyAllergiesSectionEntriesOptional446TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyAnesthesiaSection448() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyAnesthesiaSection448TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyAnesthesiaSection448",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_ANESTHESIA_SECTION448__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyAnesthesiaSection448(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyAnesthesiaSection448TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyChiefComplaintSection450() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyChiefComplaintSection450TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyChiefComplaintSection450",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION450__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyChiefComplaintSection450(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyChiefComplaintSection450TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection452() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection452TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection452",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION452__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection452(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection452TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyFamilyHistorySection454() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyFamilyHistorySection454TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyFamilyHistorySection454",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION454__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyFamilyHistorySection454(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyFamilyHistorySection454TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyHistoryOfPastIllnessSection456() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyHistoryOfPastIllnessSection456TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyHistoryOfPastIllnessSection456",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION456__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyHistoryOfPastIllnessSection456(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyHistoryOfPastIllnessSection456TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyHistoryOfPresentIllnessSection458() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyHistoryOfPresentIllnessSection458TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyHistoryOfPresentIllnessSection458",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION458__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyHistoryOfPresentIllnessSection458(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyHistoryOfPresentIllnessSection458TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyMedicalHistorySection460() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyMedicalHistorySection460TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyMedicalHistorySection460",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_MEDICAL_HISTORY_SECTION460__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyMedicalHistorySection460(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyMedicalHistorySection460TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyMedicationsSectionEntriesOptional462() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyMedicationsSectionEntriesOptional462TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyMedicationsSectionEntriesOptional462",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION_ENTRIES_OPTIONAL462__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyMedicationsSectionEntriesOptional462(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyMedicationsSectionEntriesOptional462TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyMedicationsAdministeredSection464() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyMedicationsAdministeredSection464TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyMedicationsAdministeredSection464",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_MEDICATIONS_ADMINISTERED_SECTION464__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyMedicationsAdministeredSection464(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyMedicationsAdministeredSection464TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyPhysicalExamSection466() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyPhysicalExamSection466TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyPhysicalExamSection466",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION466__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyPhysicalExamSection466(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyPhysicalExamSection466TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyPlannedProcedureSection468() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyPlannedProcedureSection468TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyPlannedProcedureSection468",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_PLANNED_PROCEDURE_SECTION468__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyPlannedProcedureSection468(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyPlannedProcedureSection468TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyProcedureDispositionSection470() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyProcedureDispositionSection470TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyProcedureDispositionSection470",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_DISPOSITION_SECTION470__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyProcedureDispositionSection470(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyProcedureDispositionSection470TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyProcedureEstimatedBloodLossSection472() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyProcedureEstimatedBloodLossSection472TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyProcedureEstimatedBloodLossSection472",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION472__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyProcedureEstimatedBloodLossSection472(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyProcedureEstimatedBloodLossSection472TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyProcedureFindingsSection474() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyProcedureFindingsSection474TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyProcedureFindingsSection474",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_FINDINGS_SECTION474__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyProcedureFindingsSection474(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyProcedureFindingsSection474TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyProcedureImplantsSection476() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyProcedureImplantsSection476TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyProcedureImplantsSection476",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_IMPLANTS_SECTION476__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyProcedureImplantsSection476(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyProcedureImplantsSection476TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyProcedureSpecimensTakenSection478() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyProcedureSpecimensTakenSection478TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyProcedureSpecimensTakenSection478",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_SPECIMENS_TAKEN_SECTION478__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyProcedureSpecimensTakenSection478(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyProcedureSpecimensTakenSection478TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyProceduresSectionEntriesOptional480() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyProceduresSectionEntriesOptional480TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyProceduresSectionEntriesOptional480",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL480__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyProceduresSectionEntriesOptional480(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyProceduresSectionEntriesOptional480TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyReasonForVisitSection482() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyReasonForVisitSection482TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyReasonForVisitSection482",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION482__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyReasonForVisitSection482(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyReasonForVisitSection482TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodyReviewOfSystemsSection484() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodyReviewOfSystemsSection484TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodyReviewOfSystemsSection484",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION484__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodyReviewOfSystemsSection484(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodyReviewOfSystemsSection484TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBodySocialHistorySection486() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBodySocialHistorySection486TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBodySocialHistorySection486",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION486__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBodySocialHistorySection486(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBodySocialHistorySection486TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureNoteComponentStructuredBody431() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentStructuredBody431TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentStructuredBody431",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE_COMPONENT_STRUCTURED_BODY431__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentStructuredBody431(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentStructuredBody431TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<ProcedureNote> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<ProcedureNote>(
			"validateGeneralHeaderConstraintsTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateGeneralHeaderConstraintsTemplateId(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCode() {
		OperationsTestCase<ProcedureNote> validateGeneralHeaderConstraintsCodeTestCase = new OperationsTestCase<ProcedureNote>(
			"validateGeneralHeaderConstraintsCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected void setDependency(ProcedureNote target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateGeneralHeaderConstraintsCode(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureNoteOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureNote> {
		@Override
		public ProcedureNote create() {
			return ConsolFactory.eINSTANCE.createProcedureNote();
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
	private static class ConstructorTestClass extends ProcedureNoteOperations {
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

} // ProcedureNoteOperations
