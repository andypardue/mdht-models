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
import org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2;
import org.openhealthtools.mdht.uml.cda.consol.operations.HistoryAndPhysicalNote2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>History And Physical Note2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2HasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Has Chief Complaint And Reason For Visit Chief Complaint Or Reason For Visit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Has An Assement And Plan Section2 Or Both Assement Section And Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2DoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Does Not Have Assement And Plan Section2 When Assement And Plan Of Treatment2 Are Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2InformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2Participant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2InFulfillmentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 In Fulfillment Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2Component1374(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component1374</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2InformationRecipientIntendedRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Information Recipient Intended Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ParticipantIfParTypeCodeINDThenAEClassCodeIND(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Participant If Par Type Code IND Then AE Class Code IND</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT Precise To The Day IVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT Precise To The Minute IVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT Precise To The Second IVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT If More Precise Than Day Include Time Zone Offset IVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Responsible Party Assigned Entity Has Person Or Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Responsible Party Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Encounter Participant Assigned Entity Has Person Or Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Encounter Participant Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Responsible Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Encounter Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21377(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Component Allergies Section Entries Optional21377</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentAssessmentSection1379(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Component Assessment Section1379</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21381(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Component Plan Of Treatment Section21381</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21383(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Component Assessment And Plan Section21383</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentChiefComplaintSection1385(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Component Chief Complaint Section1385</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1387(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Component Chief Complaint And Reason For Visit Section1387</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentFamilyHistorySection21389(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Component Family History Section21389</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentGeneralStatusSection1391(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Component General Status Section1391</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21393(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Component History Of Past Illness Section21393</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1395(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Component History Of Present Illness Section1395</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21397(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Component Immunizations Section Entries Optional21397</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentInstructionsSection21399(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Component Instructions Section21399</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21401(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Component Medications Section Entries Optional21401</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentPhysicalExamSection21403(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Component Physical Exam Section21403</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentProblemSectionEntriesOptional21405(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Component Problem Section Entries Optional21405</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21407(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Component Procedures Section Entries Optional21407</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentReasonForVisitSection1409(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Component Reason For Visit Section1409</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentResultsSectionEntriesOptional21411(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Component Results Section Entries Optional21411</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentReviewOfSystemsSection1413(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Component Review Of Systems Section1413</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentSocialHistorySection21415(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Component Social History Section21415</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21417(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Component Vital Signs Section Entries Optional21417</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21376(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Allergies Section Entries Optional21376</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyAssessmentSection1378(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Assessment Section1378</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyPlanOfTreatmentSection21380(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Plan Of Treatment Section21380</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyAssessmentAndPlanSection21382(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Assessment And Plan Section21382</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyChiefComplaintSection1384(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Chief Complaint Section1384</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1386(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Chief Complaint And Reason For Visit Section1386</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyFamilyHistorySection21388(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Family History Section21388</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyGeneralStatusSection1390(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body General Status Section1390</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyHistoryOfPastIllnessSection21392(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body History Of Past Illness Section21392</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1394(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body History Of Present Illness Section1394</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyImmunizationsSectionEntriesOptional21396(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Immunizations Section Entries Optional21396</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyInstructionsSection21398(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Instructions Section21398</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21400(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Medications Section Entries Optional21400</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyPhysicalExamSection21402(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Physical Exam Section21402</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyProblemSectionEntriesOptional21404(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Problem Section Entries Optional21404</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyProceduresSectionEntriesOptional21406(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Procedures Section Entries Optional21406</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyReasonForVisitSection1408(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Reason For Visit Section1408</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyResultsSectionEntriesOptional21410(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Results Section Entries Optional21410</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyReviewOfSystemsSection1412(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Review Of Systems Section1412</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodySocialHistorySection21414(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Social History Section21414</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBodyVitalSignsSectionEntriesOptional21416(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body Vital Signs Section Entries Optional21416</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentStructuredBody1375(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Structured Body1375</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HistoryAndPhysicalNote2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2HasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2HasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisitTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2HasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_HAS_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2HasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2HasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisitTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2DoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2DoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresentTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2DoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2DoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2DoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresentTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

				// /* DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection */
				// DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection section =
				//
				// ConsolFactory.eINSTANCE.createDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection().init();
				//
				//
				// target.addSection(section);
				//

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2CodeP() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2CodePTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2CodeP",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2CodeP(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2Code() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2CodeTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2Code",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected void setDependency(HistoryAndPhysicalNote2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2CodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2Code(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2InformationRecipient() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2InformationRecipientTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2InformationRecipient",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2InformationRecipient(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2InformationRecipientTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2Participant() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ParticipantTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2Participant", operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2Participant(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2InFulfillmentOf() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2InFulfillmentOfTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2InFulfillmentOf",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2InFulfillmentOf(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2InFulfillmentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ComponentOf() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentOfTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentOf", operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOf(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2Component1374() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2Component1374TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2Component1374", operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT1374__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2Component1374(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2Component1374TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2InformationRecipientIntendedRecipient() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2InformationRecipientIntendedRecipientTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2InformationRecipientIntendedRecipient",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2InformationRecipientIntendedRecipient(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2InformationRecipientIntendedRecipientTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	* Note: Modified OCL in operations.
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ParticipantIfParTypeCodeINDThenAEClassCodeIND() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ParticipantIfParTypeCodeINDThenAEClassCodeINDTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ParticipantIfParTypeCodeINDThenAEClassCodeIND",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PARTICIPANT_IF_PAR_TYPE_CODE_IND_THEN_AE_CLASS_CODE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ParticipantIfParTypeCodeINDThenAEClassCodeIND(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ParticipantIfParTypeCodeINDThenAEClassCodeINDTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTSTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_DAY_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTSTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTSTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_MINUTE_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTSTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTSTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_SECOND_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTSTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTSTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTSTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganizationTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganizationTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterId() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterIdTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterId",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterId(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEffectiveTime() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEffectiveTimeTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEffectiveTime(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsibleParty() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsibleParty",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsibleParty(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipant() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipant",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipant(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterLocation() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterLocationTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterLocation",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterLocation(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterLocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ComponentOfEncompassingEncounter() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounter",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounter(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21377() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21377TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21377",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL21377__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21377(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21377TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyComponentAssessmentSection1379() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentAssessmentSection1379TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentAssessmentSection1379",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION1379__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentAssessmentSection1379(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentAssessmentSection1379TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21381() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21381TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21381",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21381__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21381(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21381TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21383() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21383TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21383",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION21383__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21383(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21383TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyComponentChiefComplaintSection1385() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentChiefComplaintSection1385TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentChiefComplaintSection1385",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION1385__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentChiefComplaintSection1385(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentChiefComplaintSection1385TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1387() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1387TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1387",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1387__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1387(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1387TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyComponentFamilyHistorySection21389() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentFamilyHistorySection21389TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentFamilyHistorySection21389",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION21389__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentFamilyHistorySection21389(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentFamilyHistorySection21389TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyComponentGeneralStatusSection1391() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentGeneralStatusSection1391TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentGeneralStatusSection1391",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_GENERAL_STATUS_SECTION1391__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentGeneralStatusSection1391(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentGeneralStatusSection1391TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21393() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21393TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21393",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION21393__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21393(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21393TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1395() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1395TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1395",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION1395__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1395(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1395TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21397() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21397TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21397",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21397__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21397(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21397TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyComponentInstructionsSection21399() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentInstructionsSection21399TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentInstructionsSection21399",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_INSTRUCTIONS_SECTION21399__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentInstructionsSection21399(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentInstructionsSection21399TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21401() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21401TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21401",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21401__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21401(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21401TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyComponentPhysicalExamSection21403() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentPhysicalExamSection21403TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentPhysicalExamSection21403",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION21403__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentPhysicalExamSection21403(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentPhysicalExamSection21403TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyComponentProblemSectionEntriesOptional21405() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentProblemSectionEntriesOptional21405TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentProblemSectionEntriesOptional21405",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION_ENTRIES_OPTIONAL21405__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentProblemSectionEntriesOptional21405(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentProblemSectionEntriesOptional21405TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21407() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21407TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21407",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL21407__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21407(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21407TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyComponentReasonForVisitSection1409() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentReasonForVisitSection1409TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentReasonForVisitSection1409",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION1409__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentReasonForVisitSection1409(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentReasonForVisitSection1409TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyComponentResultsSectionEntriesOptional21411() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentResultsSectionEntriesOptional21411TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentResultsSectionEntriesOptional21411",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION_ENTRIES_OPTIONAL21411__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentResultsSectionEntriesOptional21411(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentResultsSectionEntriesOptional21411TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyComponentReviewOfSystemsSection1413() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentReviewOfSystemsSection1413TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentReviewOfSystemsSection1413",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION1413__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentReviewOfSystemsSection1413(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentReviewOfSystemsSection1413TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyComponentSocialHistorySection21415() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentSocialHistorySection21415TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentSocialHistorySection21415",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION21415__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentSocialHistorySection21415(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentSocialHistorySection21415TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21417() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21417TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21417",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL21417__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21417(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21417TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21376() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21376TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21376",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL21376__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21376(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21376TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyAssessmentSection1378() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyAssessmentSection1378TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyAssessmentSection1378",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION1378__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyAssessmentSection1378(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyAssessmentSection1378TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyPlanOfTreatmentSection21380() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyPlanOfTreatmentSection21380TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyPlanOfTreatmentSection21380",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21380__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyPlanOfTreatmentSection21380(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyPlanOfTreatmentSection21380TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyAssessmentAndPlanSection21382() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyAssessmentAndPlanSection21382TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyAssessmentAndPlanSection21382",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION21382__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyAssessmentAndPlanSection21382(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyAssessmentAndPlanSection21382TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyChiefComplaintSection1384() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyChiefComplaintSection1384TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyChiefComplaintSection1384",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION1384__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyChiefComplaintSection1384(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyChiefComplaintSection1384TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1386() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1386TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1386",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1386__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1386(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1386TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyFamilyHistorySection21388() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyFamilyHistorySection21388TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyFamilyHistorySection21388",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION21388__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyFamilyHistorySection21388(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyFamilyHistorySection21388TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyGeneralStatusSection1390() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyGeneralStatusSection1390TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyGeneralStatusSection1390",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_GENERAL_STATUS_SECTION1390__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyGeneralStatusSection1390(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyGeneralStatusSection1390TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyHistoryOfPastIllnessSection21392() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyHistoryOfPastIllnessSection21392TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyHistoryOfPastIllnessSection21392",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION21392__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyHistoryOfPastIllnessSection21392(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyHistoryOfPastIllnessSection21392TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1394() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1394TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1394",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION1394__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1394(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1394TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyImmunizationsSectionEntriesOptional21396() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyImmunizationsSectionEntriesOptional21396TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyImmunizationsSectionEntriesOptional21396",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21396__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyImmunizationsSectionEntriesOptional21396(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyImmunizationsSectionEntriesOptional21396TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyInstructionsSection21398() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyInstructionsSection21398TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyInstructionsSection21398",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_INSTRUCTIONS_SECTION21398__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyInstructionsSection21398(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyInstructionsSection21398TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21400() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21400TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21400",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21400__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21400(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21400TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyPhysicalExamSection21402() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyPhysicalExamSection21402TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyPhysicalExamSection21402",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION21402__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyPhysicalExamSection21402(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyPhysicalExamSection21402TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyProblemSectionEntriesOptional21404() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyProblemSectionEntriesOptional21404TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyProblemSectionEntriesOptional21404",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION_ENTRIES_OPTIONAL21404__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyProblemSectionEntriesOptional21404(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyProblemSectionEntriesOptional21404TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyProceduresSectionEntriesOptional21406() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyProceduresSectionEntriesOptional21406TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyProceduresSectionEntriesOptional21406",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL21406__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyProceduresSectionEntriesOptional21406(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyProceduresSectionEntriesOptional21406TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyReasonForVisitSection1408() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyReasonForVisitSection1408TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyReasonForVisitSection1408",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION1408__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyReasonForVisitSection1408(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyReasonForVisitSection1408TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyResultsSectionEntriesOptional21410() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyResultsSectionEntriesOptional21410TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyResultsSectionEntriesOptional21410",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION_ENTRIES_OPTIONAL21410__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyResultsSectionEntriesOptional21410(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyResultsSectionEntriesOptional21410TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyReviewOfSystemsSection1412() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyReviewOfSystemsSection1412TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyReviewOfSystemsSection1412",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION1412__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyReviewOfSystemsSection1412(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyReviewOfSystemsSection1412TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodySocialHistorySection21414() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodySocialHistorySection21414TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodySocialHistorySection21414",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION21414__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodySocialHistorySection21414(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodySocialHistorySection21414TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBodyVitalSignsSectionEntriesOptional21416() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBodyVitalSignsSectionEntriesOptional21416TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBodyVitalSignsSectionEntriesOptional21416",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL21416__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBodyVitalSignsSectionEntriesOptional21416(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBodyVitalSignsSectionEntriesOptional21416TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNote2ComponentStructuredBody1375() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentStructuredBody1375TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentStructuredBody1375",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_STRUCTURED_BODY1375__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentStructuredBody1375(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentStructuredBody1375TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateGeneralHeaderConstraintsTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateGeneralHeaderConstraintsTemplateId(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HistoryAndPhysicalNote2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<HistoryAndPhysicalNote2> {
		public HistoryAndPhysicalNote2 create() {
			return ConsolFactory.eINSTANCE.createHistoryAndPhysicalNote2();
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
	private static class ConstructorTestClass extends HistoryAndPhysicalNote2Operations {
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

} // HistoryAndPhysicalNote2Operations
