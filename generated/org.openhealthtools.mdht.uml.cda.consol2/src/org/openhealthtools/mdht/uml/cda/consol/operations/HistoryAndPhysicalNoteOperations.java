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
package org.openhealthtools.mdht.uml.cda.consol.operations;

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
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.InstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>History And Physical Note</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Has An Assement And Plan Section Or Individual Assement And Plan Sections</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Does Not Have Individual Assement And Plan Sections When Assement And Plan Section Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteHasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Has Chief Complaint And Reason For Visit Chief Complaint Or Reason For Visit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateGeneralHeaderConstraintsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteInFulfillmentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note In Fulfillment Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponent352(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component352</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityHasPersonOrOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Responsible Party Assigned Entity Has Person Or Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Responsible Party Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityHasPersonOrOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Encounter Participant Assigned Entity Has Person Or Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Encounter Participant Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Precise To The Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheMinute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Precise To The Minute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheSecond(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Precise To The Second</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4IfMorePreciseThanDayIncludeTimeZoneOffset(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 If More Precise Than Day Include Time Zone Offset</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Location(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Responsible Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Encounter Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional355(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Allergies Section Entries Optional355</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentSection357(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Assessment Section357</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyComponentPlanOfCareSection359(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Plan Of Care Section359</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentAndPlanSection361(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Assessment And Plan Section361</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintSection363(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Chief Complaint Section363</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection365(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Chief Complaint And Reason For Visit Section365</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyComponentFamilyHistorySection367(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Family History Section367</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyComponentGeneralStatusSection369(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component General Status Section369</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection371(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component History Of Past Illness Section371</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional373(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Medications Section Entries Optional373</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyComponentPhysicalExamSection375(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Physical Exam Section375</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyComponentReasonForVisitSection377(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Reason For Visit Section377</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyComponentResultsSectionEntriesOptional379(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Results Section Entries Optional379</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyComponentReviewOfSystemsSection381(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Review Of Systems Section381</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyComponentSocialHistorySection383(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Social History Section383</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection385(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component History Of Present Illness Section385</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyComponentImmunizationsSectionEntriesOptional387(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Immunizations Section Entries Optional387</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyComponentProblemSectionEntriesOptional389(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Problem Section Entries Optional389</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional391(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Procedures Section Entries Optional391</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional393(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Vital Signs Section Entries Optional393</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyComponentInstructionsSection395(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Instructions Section395</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyAllergiesSectionEntriesOptional354(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Allergies Section Entries Optional354</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyAssessmentSection356(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Assessment Section356</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyPlanOfCareSection358(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Plan Of Care Section358</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyAssessmentAndPlanSection360(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Assessment And Plan Section360</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintSection362(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Chief Complaint Section362</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection364(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Chief Complaint And Reason For Visit Section364</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyFamilyHistorySection366(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Family History Section366</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyGeneralStatusSection368(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body General Status Section368</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPastIllnessSection370(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body History Of Past Illness Section370</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyMedicationsSectionEntriesOptional372(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Medications Section Entries Optional372</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyPhysicalExamSection374(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Physical Exam Section374</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyReasonForVisitSection376(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Reason For Visit Section376</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyResultsSectionEntriesOptional378(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Results Section Entries Optional378</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyReviewOfSystemsSection380(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Review Of Systems Section380</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodySocialHistorySection382(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Social History Section382</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPresentIllnessSection384(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body History Of Present Illness Section384</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyImmunizationsSectionEntriesOptional386(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Immunizations Section Entries Optional386</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyProblemSectionEntriesOptional388(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Problem Section Entries Optional388</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyProceduresSectionEntriesOptional390(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Procedures Section Entries Optional390</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyVitalSignsSectionEntriesOptional392(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Vital Signs Section Entries Optional392</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBodyInstructionsSection394(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Instructions Section394</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentStructuredBody353(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body353</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HistoryAndPhysicalNoteOperations extends GeneralHeaderConstraintsOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryAndPhysicalNoteOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Has An Assement And Plan Section Or Individual Assement And Plan Sections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection)) and  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Has An Assement And Plan Section Or Individual Assement And Plan Sections</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections"),
						 new Object [] { historyAndPhysicalNote }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Does Not Have Individual Assement And Plan Sections When Assement And Plan Section Present</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection)) or  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Does Not Have Individual Assement And Plan Sections When Assement And Plan Section Present</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent"),
						 new Object [] { historyAndPhysicalNote }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteHasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Has Chief Complaint And Reason For Visit Chief Complaint Or Reason For Visit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteHasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HAS_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)) and  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteHasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Has Chief Complaint And Reason For Visit Chief Complaint Or Reason For Visit</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteHasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HAS_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNoteHasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HAS_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HAS_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HAS_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HAS_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_HAS_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteHasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit"),
						 new Object [] { historyAndPhysicalNote }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)) or  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection"),
						 new Object [] { historyAndPhysicalNote }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCodeP(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCodeP(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCodeP(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCodeP(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsCodeP(HistoryAndPhysicalNote historyAndPhysicalNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__GENERAL_HEADER_CONSTRAINTS_CODE_P,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteGeneralHeaderConstraintsCodeP"),
						 new Object [] { historyAndPhysicalNote }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsCodeP", passToken);
				}
				passToken.add(historyAndPhysicalNote);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteInFulfillmentOf(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note In Fulfillment Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteInFulfillmentOf(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.inFulfillmentOf->exists(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(rim::ActRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteInFulfillmentOf(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note In Fulfillment Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteInFulfillmentOf(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNoteInFulfillmentOf(HistoryAndPhysicalNote historyAndPhysicalNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_IN_FULFILLMENT_OF,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteInFulfillmentOf"),
						 new Object [] { historyAndPhysicalNote }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentOf(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentOf(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentOf(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentOf(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNoteComponentOf(HistoryAndPhysicalNote historyAndPhysicalNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentOf"),
						 new Object [] { historyAndPhysicalNote }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponent352(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component352</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponent352(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT352__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component2 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component2))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponent352(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component352</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponent352(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT352__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHistoryAndPhysicalNoteComponent352(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT352__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT352__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT352__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT352__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT352,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponent352"),
						 new Object [] { historyAndPhysicalNote }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityHasPersonOrOrganization(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Responsible Party Assigned Entity Has Person Or Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityHasPersonOrOrganization(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->excluding(null)->reject(not assignedEntity.assignedPerson.oclIsUndefined() or not assignedEntity.representedOrganization->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityHasPersonOrOrganization(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Responsible Party Assigned Entity Has Person Or Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityHasPersonOrOrganization(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityHasPersonOrOrganization(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityHasPersonOrOrganization"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntity(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Responsible Party Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntity(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(rim::Role)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntity(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Responsible Party Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntity(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntity(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY_ASSIGNED_ENTITY,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntity"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityHasPersonOrOrganization(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Encounter Participant Assigned Entity Has Person Or Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityHasPersonOrOrganization(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->excluding(null)->reject(not assignedEntity.assignedPerson.oclIsUndefined() or not assignedEntity.representedOrganization->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityHasPersonOrOrganization(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Encounter Participant Assigned Entity Has Person Or Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityHasPersonOrOrganization(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityHasPersonOrOrganization(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityHasPersonOrOrganization"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntity(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Encounter Participant Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntity(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(rim::Role)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntity(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Encounter Participant Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntity(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntity(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntity"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheDay(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Precise To The Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheDay(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(not effectiveTime.value.oclIsUndefined() implies effectiveTime.value.size() >= 8)";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheDay(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Precise To The Day</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheDay(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheDay(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_PRECISE_TO_THE_DAY,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheDay"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheMinute(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Precise To The Minute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheMinute(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(not effectiveTime.value.oclIsUndefined() implies effectiveTime.value.size() >= 12)";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheMinute(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Precise To The Minute</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheMinute(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheMinute(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_PRECISE_TO_THE_MINUTE,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheMinute"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheSecond(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Precise To The Second</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheSecond(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(not effectiveTime.value.oclIsUndefined() implies effectiveTime.value.size() >= 14)";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheSecond(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Precise To The Second</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheSecond(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheSecond(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_PRECISE_TO_THE_SECOND,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheSecond"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4IfMorePreciseThanDayIncludeTimeZoneOffset(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 If More Precise Than Day Include Time Zone Offset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4IfMorePreciseThanDayIncludeTimeZoneOffset(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(not effectiveTime.value.oclIsUndefined() and effectiveTime.value.size() > 8 implies effectiveTime.value.size() >= 15)";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4IfMorePreciseThanDayIncludeTimeZoneOffset(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 If More Precise Than Day Include Time Zone Offset</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4IfMorePreciseThanDayIncludeTimeZoneOffset(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4IfMorePreciseThanDayIncludeTimeZoneOffset(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentOfEncompassingEncounter4IfMorePreciseThanDayIncludeTimeZoneOffset"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EffectiveTime(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EffectiveTime(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EffectiveTime(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EffectiveTime(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EffectiveTime(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EffectiveTime"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Id(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Id(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Id(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Id(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Id(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ID,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Id"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Location(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Location(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(location->one(location : cda::Location | not location.oclIsUndefined() and location.oclIsKindOf(rim::Participation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Location(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Location</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Location(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Location(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_LOCATION,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Location"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsibleParty(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Responsible Party</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsibleParty(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(responsibleParty->one(responsibleParty : cda::ResponsibleParty | not responsibleParty.oclIsUndefined() and responsibleParty.oclIsKindOf(cda::ResponsibleParty)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsibleParty(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Responsible Party</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsibleParty(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsibleParty(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsibleParty"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipant(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Encounter Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipant(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(encounterParticipant->one(encounterParticipant : cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and encounterParticipant.oclIsKindOf(cda::EncounterParticipant)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipant(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Encounter Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipant(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipant(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipant"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null)->reject(encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter(
			HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentOfEncompassingEncounter"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional355(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Allergies Section Entries Optional355</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional355(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL355__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional355(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Allergies Section Entries Optional355</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional355(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL355__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional355(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL355__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL355__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL355__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL355__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL355,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional355"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentSection357(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Assessment Section357</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentSection357(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION357__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentSection357(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Assessment Section357</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentSection357(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION357__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentSection357(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION357__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION357__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION357__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION357__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION357,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentSection357"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentPlanOfCareSection359(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Plan Of Care Section359</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentPlanOfCareSection359(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_CARE_SECTION359__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentPlanOfCareSection359(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Plan Of Care Section359</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentPlanOfCareSection359(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_CARE_SECTION359__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentPlanOfCareSection359(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_CARE_SECTION359__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_CARE_SECTION359__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_CARE_SECTION359__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_CARE_SECTION359__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_CARE_SECTION359,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyComponentPlanOfCareSection359"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentAndPlanSection361(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Assessment And Plan Section361</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentAndPlanSection361(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION361__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentAndPlanSection361(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Assessment And Plan Section361</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentAndPlanSection361(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION361__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentAndPlanSection361(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION361__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION361__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION361__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION361__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION361,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentAndPlanSection361"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintSection363(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Chief Complaint Section363</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintSection363(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION363__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintSection363(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Chief Complaint Section363</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintSection363(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION363__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintSection363(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION363__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION363__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION363__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION363__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION363,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintSection363"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection365(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Chief Complaint And Reason For Visit Section365</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection365(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION365__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection365(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Chief Complaint And Reason For Visit Section365</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection365(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION365__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection365(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION365__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION365__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION365__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION365__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION365,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection365"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentFamilyHistorySection367(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Family History Section367</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentFamilyHistorySection367(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION367__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentFamilyHistorySection367(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Family History Section367</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentFamilyHistorySection367(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION367__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentFamilyHistorySection367(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION367__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION367__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION367__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION367__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION367,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyComponentFamilyHistorySection367"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentGeneralStatusSection369(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component General Status Section369</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentGeneralStatusSection369(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_GENERAL_STATUS_SECTION369__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::GeneralStatusSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentGeneralStatusSection369(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component General Status Section369</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentGeneralStatusSection369(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_GENERAL_STATUS_SECTION369__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentGeneralStatusSection369(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_GENERAL_STATUS_SECTION369__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_GENERAL_STATUS_SECTION369__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_GENERAL_STATUS_SECTION369__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_GENERAL_STATUS_SECTION369__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_GENERAL_STATUS_SECTION369,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyComponentGeneralStatusSection369"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection371(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component History Of Past Illness Section371</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection371(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION371__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection371(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component History Of Past Illness Section371</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection371(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION371__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection371(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION371__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION371__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION371__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION371__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION371,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection371"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional373(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Medications Section Entries Optional373</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional373(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION_ENTRIES_OPTIONAL373__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional373(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Medications Section Entries Optional373</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional373(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION_ENTRIES_OPTIONAL373__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional373(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION_ENTRIES_OPTIONAL373__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION_ENTRIES_OPTIONAL373__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION_ENTRIES_OPTIONAL373__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION_ENTRIES_OPTIONAL373__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION_ENTRIES_OPTIONAL373,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional373"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentPhysicalExamSection375(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Physical Exam Section375</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentPhysicalExamSection375(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION375__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentPhysicalExamSection375(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Physical Exam Section375</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentPhysicalExamSection375(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION375__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentPhysicalExamSection375(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION375__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION375__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION375__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION375__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION375,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyComponentPhysicalExamSection375"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentReasonForVisitSection377(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Reason For Visit Section377</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentReasonForVisitSection377(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION377__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentReasonForVisitSection377(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Reason For Visit Section377</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentReasonForVisitSection377(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION377__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentReasonForVisitSection377(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION377__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION377__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION377__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION377__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION377,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyComponentReasonForVisitSection377"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentResultsSectionEntriesOptional379(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Results Section Entries Optional379</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentResultsSectionEntriesOptional379(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION_ENTRIES_OPTIONAL379__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSectionEntriesOptional)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentResultsSectionEntriesOptional379(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Results Section Entries Optional379</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentResultsSectionEntriesOptional379(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION_ENTRIES_OPTIONAL379__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentResultsSectionEntriesOptional379(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION_ENTRIES_OPTIONAL379__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION_ENTRIES_OPTIONAL379__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION_ENTRIES_OPTIONAL379__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION_ENTRIES_OPTIONAL379__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION_ENTRIES_OPTIONAL379,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyComponentResultsSectionEntriesOptional379"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentReviewOfSystemsSection381(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Review Of Systems Section381</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentReviewOfSystemsSection381(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION381__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentReviewOfSystemsSection381(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Review Of Systems Section381</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentReviewOfSystemsSection381(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION381__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentReviewOfSystemsSection381(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION381__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION381__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION381__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION381__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION381,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyComponentReviewOfSystemsSection381"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentSocialHistorySection383(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Social History Section383</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentSocialHistorySection383(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION383__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentSocialHistorySection383(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Social History Section383</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentSocialHistorySection383(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION383__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentSocialHistorySection383(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION383__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION383__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION383__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION383__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION383,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyComponentSocialHistorySection383"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection385(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component History Of Present Illness Section385</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection385(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION385__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection385(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component History Of Present Illness Section385</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection385(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION385__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection385(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION385__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION385__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION385__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION385__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION385,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection385"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentImmunizationsSectionEntriesOptional387(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Immunizations Section Entries Optional387</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentImmunizationsSectionEntriesOptional387(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL387__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentImmunizationsSectionEntriesOptional387(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Immunizations Section Entries Optional387</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentImmunizationsSectionEntriesOptional387(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL387__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentImmunizationsSectionEntriesOptional387(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL387__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL387__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL387__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL387__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL387,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyComponentImmunizationsSectionEntriesOptional387"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentProblemSectionEntriesOptional389(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Problem Section Entries Optional389</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentProblemSectionEntriesOptional389(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION_ENTRIES_OPTIONAL389__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentProblemSectionEntriesOptional389(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Problem Section Entries Optional389</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentProblemSectionEntriesOptional389(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION_ENTRIES_OPTIONAL389__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentProblemSectionEntriesOptional389(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION_ENTRIES_OPTIONAL389__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION_ENTRIES_OPTIONAL389__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION_ENTRIES_OPTIONAL389__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION_ENTRIES_OPTIONAL389__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION_ENTRIES_OPTIONAL389,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyComponentProblemSectionEntriesOptional389"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional391(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Procedures Section Entries Optional391</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional391(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL391__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional391(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Procedures Section Entries Optional391</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional391(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL391__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional391(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL391__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL391__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL391__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL391__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL391,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional391"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional393(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Vital Signs Section Entries Optional393</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional393(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL393__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional393(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Vital Signs Section Entries Optional393</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional393(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL393__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional393(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL393__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL393__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL393__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL393__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL393,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional393"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentInstructionsSection395(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Instructions Section395</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentInstructionsSection395(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_INSTRUCTIONS_SECTION395__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InstructionsSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentInstructionsSection395(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Component Instructions Section395</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyComponentInstructionsSection395(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_INSTRUCTIONS_SECTION395__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyComponentInstructionsSection395(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_INSTRUCTIONS_SECTION395__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_INSTRUCTIONS_SECTION395__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_INSTRUCTIONS_SECTION395__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_INSTRUCTIONS_SECTION395__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_INSTRUCTIONS_SECTION395,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyComponentInstructionsSection395"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyAllergiesSectionEntriesOptional354(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Allergies Section Entries Optional354</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyAllergiesSectionEntriesOptional354(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL354__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyAllergiesSectionEntriesOptional354(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Allergies Section Entries Optional354</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyAllergiesSectionEntriesOptional354(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL354__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyAllergiesSectionEntriesOptional354(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL354__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL354__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL354__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL354__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL354,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyAllergiesSectionEntriesOptional354"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyAssessmentSection356(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Assessment Section356</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyAssessmentSection356(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION356__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyAssessmentSection356(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Assessment Section356</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyAssessmentSection356(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION356__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyAssessmentSection356(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION356__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION356__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION356__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION356__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION356,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyAssessmentSection356"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyPlanOfCareSection358(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Plan Of Care Section358</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyPlanOfCareSection358(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_PLAN_OF_CARE_SECTION358__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyPlanOfCareSection358(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Plan Of Care Section358</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyPlanOfCareSection358(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_PLAN_OF_CARE_SECTION358__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyPlanOfCareSection358(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_PLAN_OF_CARE_SECTION358__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_PLAN_OF_CARE_SECTION358__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_PLAN_OF_CARE_SECTION358__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_PLAN_OF_CARE_SECTION358__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_PLAN_OF_CARE_SECTION358,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyPlanOfCareSection358"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyAssessmentAndPlanSection360(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Assessment And Plan Section360</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyAssessmentAndPlanSection360(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION360__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyAssessmentAndPlanSection360(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Assessment And Plan Section360</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyAssessmentAndPlanSection360(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION360__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyAssessmentAndPlanSection360(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION360__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION360__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION360__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION360__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION360,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyAssessmentAndPlanSection360"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintSection362(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Chief Complaint Section362</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintSection362(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION362__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintSection362(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Chief Complaint Section362</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintSection362(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION362__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintSection362(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION362__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION362__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION362__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION362__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION362,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintSection362"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection364(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Chief Complaint And Reason For Visit Section364</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection364(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION364__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection364(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Chief Complaint And Reason For Visit Section364</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection364(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION364__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection364(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION364__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION364__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION364__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION364__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION364,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection364"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyFamilyHistorySection366(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Family History Section366</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyFamilyHistorySection366(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION366__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyFamilyHistorySection366(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Family History Section366</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyFamilyHistorySection366(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION366__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyFamilyHistorySection366(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION366__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION366__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION366__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION366__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION366,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyFamilyHistorySection366"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyGeneralStatusSection368(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body General Status Section368</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyGeneralStatusSection368(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_GENERAL_STATUS_SECTION368__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyGeneralStatusSection368(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body General Status Section368</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyGeneralStatusSection368(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_GENERAL_STATUS_SECTION368__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyGeneralStatusSection368(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_GENERAL_STATUS_SECTION368__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_GENERAL_STATUS_SECTION368__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_GENERAL_STATUS_SECTION368__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_GENERAL_STATUS_SECTION368__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_GENERAL_STATUS_SECTION368,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyGeneralStatusSection368"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPastIllnessSection370(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body History Of Past Illness Section370</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPastIllnessSection370(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION370__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPastIllnessSection370(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body History Of Past Illness Section370</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPastIllnessSection370(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION370__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPastIllnessSection370(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION370__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION370__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION370__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION370__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION370,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPastIllnessSection370"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyMedicationsSectionEntriesOptional372(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Medications Section Entries Optional372</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyMedicationsSectionEntriesOptional372(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION_ENTRIES_OPTIONAL372__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyMedicationsSectionEntriesOptional372(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Medications Section Entries Optional372</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyMedicationsSectionEntriesOptional372(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION_ENTRIES_OPTIONAL372__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyMedicationsSectionEntriesOptional372(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION_ENTRIES_OPTIONAL372__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION_ENTRIES_OPTIONAL372__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION_ENTRIES_OPTIONAL372__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION_ENTRIES_OPTIONAL372__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION_ENTRIES_OPTIONAL372,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyMedicationsSectionEntriesOptional372"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyPhysicalExamSection374(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Physical Exam Section374</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyPhysicalExamSection374(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION374__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyPhysicalExamSection374(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Physical Exam Section374</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyPhysicalExamSection374(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION374__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyPhysicalExamSection374(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION374__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION374__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION374__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION374__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION374,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyPhysicalExamSection374"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyReasonForVisitSection376(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Reason For Visit Section376</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyReasonForVisitSection376(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION376__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyReasonForVisitSection376(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Reason For Visit Section376</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyReasonForVisitSection376(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION376__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyReasonForVisitSection376(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION376__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION376__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION376__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION376__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION376,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyReasonForVisitSection376"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyResultsSectionEntriesOptional378(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Results Section Entries Optional378</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyResultsSectionEntriesOptional378(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION_ENTRIES_OPTIONAL378__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyResultsSectionEntriesOptional378(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Results Section Entries Optional378</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyResultsSectionEntriesOptional378(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION_ENTRIES_OPTIONAL378__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyResultsSectionEntriesOptional378(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION_ENTRIES_OPTIONAL378__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION_ENTRIES_OPTIONAL378__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION_ENTRIES_OPTIONAL378__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION_ENTRIES_OPTIONAL378__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION_ENTRIES_OPTIONAL378,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyResultsSectionEntriesOptional378"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyReviewOfSystemsSection380(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Review Of Systems Section380</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyReviewOfSystemsSection380(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION380__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyReviewOfSystemsSection380(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Review Of Systems Section380</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyReviewOfSystemsSection380(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION380__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyReviewOfSystemsSection380(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION380__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION380__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION380__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION380__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION380,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyReviewOfSystemsSection380"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodySocialHistorySection382(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Social History Section382</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodySocialHistorySection382(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION382__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodySocialHistorySection382(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Social History Section382</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodySocialHistorySection382(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION382__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodySocialHistorySection382(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION382__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION382__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION382__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION382__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION382,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodySocialHistorySection382"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPresentIllnessSection384(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body History Of Present Illness Section384</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPresentIllnessSection384(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION384__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPresentIllnessSection384(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body History Of Present Illness Section384</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPresentIllnessSection384(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION384__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPresentIllnessSection384(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION384__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION384__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION384__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION384__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION384,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPresentIllnessSection384"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyImmunizationsSectionEntriesOptional386(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Immunizations Section Entries Optional386</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyImmunizationsSectionEntriesOptional386(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL386__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyImmunizationsSectionEntriesOptional386(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Immunizations Section Entries Optional386</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyImmunizationsSectionEntriesOptional386(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL386__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyImmunizationsSectionEntriesOptional386(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL386__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL386__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL386__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL386__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL386,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyImmunizationsSectionEntriesOptional386"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyProblemSectionEntriesOptional388(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Problem Section Entries Optional388</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyProblemSectionEntriesOptional388(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION_ENTRIES_OPTIONAL388__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyProblemSectionEntriesOptional388(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Problem Section Entries Optional388</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyProblemSectionEntriesOptional388(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION_ENTRIES_OPTIONAL388__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyProblemSectionEntriesOptional388(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION_ENTRIES_OPTIONAL388__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION_ENTRIES_OPTIONAL388__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION_ENTRIES_OPTIONAL388__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION_ENTRIES_OPTIONAL388__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION_ENTRIES_OPTIONAL388,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyProblemSectionEntriesOptional388"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyProceduresSectionEntriesOptional390(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Procedures Section Entries Optional390</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyProceduresSectionEntriesOptional390(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL390__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyProceduresSectionEntriesOptional390(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Procedures Section Entries Optional390</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyProceduresSectionEntriesOptional390(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL390__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyProceduresSectionEntriesOptional390(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL390__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL390__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL390__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL390__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL390,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyProceduresSectionEntriesOptional390"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyVitalSignsSectionEntriesOptional392(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Vital Signs Section Entries Optional392</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyVitalSignsSectionEntriesOptional392(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL392__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyVitalSignsSectionEntriesOptional392(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Vital Signs Section Entries Optional392</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyVitalSignsSectionEntriesOptional392(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL392__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyVitalSignsSectionEntriesOptional392(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL392__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL392__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL392__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL392__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL392,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyVitalSignsSectionEntriesOptional392"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyInstructionsSection394(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Instructions Section394</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyInstructionsSection394(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_INSTRUCTIONS_SECTION394__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBodyInstructionsSection394(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body Instructions Section394</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBodyInstructionsSection394(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_INSTRUCTIONS_SECTION394__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBodyInstructionsSection394(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_INSTRUCTIONS_SECTION394__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_INSTRUCTIONS_SECTION394__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_INSTRUCTIONS_SECTION394__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_INSTRUCTIONS_SECTION394__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_INSTRUCTIONS_SECTION394,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBodyInstructionsSection394"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBody353(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body353</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBody353(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY353__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null)->reject(structuredBody->one(structuredBody : cda::StructuredBody | not structuredBody.oclIsUndefined() and structuredBody.oclIsKindOf(cda::StructuredBody)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNoteComponentStructuredBody353(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Structured Body353</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNoteComponentStructuredBody353(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY353__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHistoryAndPhysicalNoteComponentStructuredBody353(HistoryAndPhysicalNote historyAndPhysicalNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY353__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY353__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY353__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY353__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY353,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteHistoryAndPhysicalNoteComponentStructuredBody353"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.3')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsTemplateId(HistoryAndPhysicalNote historyAndPhysicalNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteGeneralHeaderConstraintsTemplateId"),
						 new Object [] { historyAndPhysicalNote }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCode(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '34117-2' or value.code = '11492-6' or value.code = '28626-0' or value.code = '34774-0' or value.code = '34115-6' or value.code = '34116-4' or value.code = '34095-0' or value.code = '34096-8' or value.code = '51849-8' or value.code = '47039-3' or value.code = '34763-3' or value.code = '34094-3' or value.code = '34138-8'))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCode(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(HistoryAndPhysicalNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote The receiving '<em><b>History And Physical Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsCode(HistoryAndPhysicalNote historyAndPhysicalNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(historyAndPhysicalNote)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyAndPhysicalNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_AND_PHYSICAL_NOTE__GENERAL_HEADER_CONSTRAINTS_CODE,
						 ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNoteGeneralHeaderConstraintsCode"),
						 new Object [] { historyAndPhysicalNote }));
			}
			 
			return false;
		}
		return true;
	}

} // HistoryAndPhysicalNoteOperations
