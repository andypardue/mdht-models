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
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Component1;
import org.openhealthtools.mdht.uml.cda.EncompassingEncounter;
import org.openhealthtools.mdht.uml.cda.EncounterParticipant;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote;
import org.openhealthtools.mdht.uml.cda.consol.operations.HistoryAndPhysicalNoteOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

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

public class HistoryAndPhysicalNoteTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSectionsTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSectionsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresentTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteHasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteHasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisitTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteHasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HAS_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteHasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteHasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisitTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

				// /* DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection */
				// DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection section =
				//
				// ConsolFactory.eINSTANCE.createDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection().init();
				//
				//
				// target.addSection(section);
				//
				//

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCodeP() {
		OperationsTestCase<HistoryAndPhysicalNote> validateGeneralHeaderConstraintsCodePTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateGeneralHeaderConstraintsCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateGeneralHeaderConstraintsCodeP(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteInFulfillmentOf() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteInFulfillmentOfTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteInFulfillmentOf",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteInFulfillmentOf(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteInFulfillmentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteComponentOf() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentOfTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentOf", operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOf(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponent352() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponent352TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponent352", operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT352__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponent352(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponent352TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityHasPersonOrOrganization() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityHasPersonOrOrganizationTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityHasPersonOrOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityHasPersonOrOrganization(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityHasPersonOrOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntity() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntity(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityHasPersonOrOrganization() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityHasPersonOrOrganizationTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityHasPersonOrOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

				ep.setAssignedEntity(ae);
				ee.getEncounterParticipants().add(ep);

				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.getComponentOf().getEncompassingEncounter().getEncounterParticipants().clear();

				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();

				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

				Person person = CDAFactory.eINSTANCE.createPerson();

				ae.setAssignedPerson(person);

				ep.setAssignedEntity(ae);

				target.getComponentOf().getEncompassingEncounter().getEncounterParticipants().add(ep);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityHasPersonOrOrganization(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityHasPersonOrOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntity() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();

				ee.getEncounterParticipants().add(ep);

				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.getComponentOf().getEncompassingEncounter().getEncounterParticipants().clear();

				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();

				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

				ep.setAssignedEntity(ae);

				target.getComponentOf().getEncompassingEncounter().getEncounterParticipants().add(ep);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntity(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheDay() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheDayTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheDay",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheDay(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheDayTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheMinute() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheMinuteTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheMinute",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheMinute(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheMinuteTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheSecond() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheSecondTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheSecond",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheSecond(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheSecondTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4IfMorePreciseThanDayIncludeTimeZoneOffset() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4IfMorePreciseThanDayIncludeTimeZoneOffsetTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4IfMorePreciseThanDayIncludeTimeZoneOffset",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4IfMorePreciseThanDayIncludeTimeZoneOffset(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4IfMorePreciseThanDayIncludeTimeZoneOffsetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EffectiveTime() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EffectiveTimeTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);
				target.getComponentOf().getEncompassingEncounter().setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EffectiveTime(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Id() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4IdTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Id",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Id(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Location() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4LocationTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Location",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Location(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4LocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsibleParty() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsibleParty",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsibleParty(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipant() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipant",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipant(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteComponentOfEncompassingEncounter() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentOfEncompassingEncounterTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentOfEncompassingEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional355() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional355TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional355",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL355__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional355(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional355TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentSection357() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentSection357TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentSection357",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION357__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentSection357(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentSection357TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyComponentPlanOfCareSection359() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyComponentPlanOfCareSection359TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyComponentPlanOfCareSection359",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_CARE_SECTION359__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentPlanOfCareSection359(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyComponentPlanOfCareSection359TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentAndPlanSection361() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentAndPlanSection361TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentAndPlanSection361",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION361__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentAndPlanSection361(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyComponentAssessmentAndPlanSection361TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintSection363() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintSection363TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintSection363",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION363__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintSection363(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintSection363TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection365() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection365TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection365",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION365__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection365(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection365TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyComponentFamilyHistorySection367() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyComponentFamilyHistorySection367TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyComponentFamilyHistorySection367",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION367__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentFamilyHistorySection367(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyComponentFamilyHistorySection367TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyComponentGeneralStatusSection369() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyComponentGeneralStatusSection369TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyComponentGeneralStatusSection369",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_GENERAL_STATUS_SECTION369__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentGeneralStatusSection369(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyComponentGeneralStatusSection369TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection371() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection371TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection371",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION371__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection371(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection371TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional373() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional373TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional373",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION_ENTRIES_OPTIONAL373__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional373(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional373TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyComponentPhysicalExamSection375() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyComponentPhysicalExamSection375TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyComponentPhysicalExamSection375",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION375__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentPhysicalExamSection375(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyComponentPhysicalExamSection375TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyComponentReasonForVisitSection377() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyComponentReasonForVisitSection377TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyComponentReasonForVisitSection377",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION377__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentReasonForVisitSection377(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyComponentReasonForVisitSection377TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyComponentResultsSectionEntriesOptional379() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyComponentResultsSectionEntriesOptional379TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyComponentResultsSectionEntriesOptional379",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION_ENTRIES_OPTIONAL379__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentResultsSectionEntriesOptional379(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyComponentResultsSectionEntriesOptional379TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyComponentReviewOfSystemsSection381() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyComponentReviewOfSystemsSection381TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyComponentReviewOfSystemsSection381",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION381__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentReviewOfSystemsSection381(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyComponentReviewOfSystemsSection381TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyComponentSocialHistorySection383() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyComponentSocialHistorySection383TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyComponentSocialHistorySection383",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION383__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentSocialHistorySection383(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyComponentSocialHistorySection383TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection385() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection385TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection385",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION385__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection385(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection385TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyComponentImmunizationsSectionEntriesOptional387() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyComponentImmunizationsSectionEntriesOptional387TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyComponentImmunizationsSectionEntriesOptional387",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL387__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentImmunizationsSectionEntriesOptional387(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyComponentImmunizationsSectionEntriesOptional387TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyComponentProblemSectionEntriesOptional389() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyComponentProblemSectionEntriesOptional389TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyComponentProblemSectionEntriesOptional389",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION_ENTRIES_OPTIONAL389__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentProblemSectionEntriesOptional389(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyComponentProblemSectionEntriesOptional389TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional391() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional391TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional391",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL391__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional391(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional391TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional393() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional393TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional393",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL393__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional393(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional393TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyComponentInstructionsSection395() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyComponentInstructionsSection395TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyComponentInstructionsSection395",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_INSTRUCTIONS_SECTION395__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyComponentInstructionsSection395(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyComponentInstructionsSection395TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyAllergiesSectionEntriesOptional354() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyAllergiesSectionEntriesOptional354TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyAllergiesSectionEntriesOptional354",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL354__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyAllergiesSectionEntriesOptional354(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyAllergiesSectionEntriesOptional354TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyAssessmentSection356() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyAssessmentSection356TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyAssessmentSection356",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION356__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyAssessmentSection356(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyAssessmentSection356TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyPlanOfCareSection358() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyPlanOfCareSection358TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyPlanOfCareSection358",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_PLAN_OF_CARE_SECTION358__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyPlanOfCareSection358(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyPlanOfCareSection358TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyAssessmentAndPlanSection360() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyAssessmentAndPlanSection360TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyAssessmentAndPlanSection360",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION360__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyAssessmentAndPlanSection360(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyAssessmentAndPlanSection360TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintSection362() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintSection362TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintSection362",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION362__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintSection362(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintSection362TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection364() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection364TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection364",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION364__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection364(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection364TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyFamilyHistorySection366() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyFamilyHistorySection366TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyFamilyHistorySection366",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION366__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyFamilyHistorySection366(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyFamilyHistorySection366TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyGeneralStatusSection368() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyGeneralStatusSection368TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyGeneralStatusSection368",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_GENERAL_STATUS_SECTION368__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyGeneralStatusSection368(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyGeneralStatusSection368TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPastIllnessSection370() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPastIllnessSection370TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPastIllnessSection370",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION370__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPastIllnessSection370(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPastIllnessSection370TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyMedicationsSectionEntriesOptional372() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyMedicationsSectionEntriesOptional372TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyMedicationsSectionEntriesOptional372",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION_ENTRIES_OPTIONAL372__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyMedicationsSectionEntriesOptional372(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyMedicationsSectionEntriesOptional372TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyPhysicalExamSection374() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyPhysicalExamSection374TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyPhysicalExamSection374",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION374__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyPhysicalExamSection374(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyPhysicalExamSection374TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyReasonForVisitSection376() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyReasonForVisitSection376TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyReasonForVisitSection376",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION376__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyReasonForVisitSection376(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyReasonForVisitSection376TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyResultsSectionEntriesOptional378() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyResultsSectionEntriesOptional378TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyResultsSectionEntriesOptional378",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION_ENTRIES_OPTIONAL378__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyResultsSectionEntriesOptional378(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyResultsSectionEntriesOptional378TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyReviewOfSystemsSection380() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyReviewOfSystemsSection380TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyReviewOfSystemsSection380",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION380__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyReviewOfSystemsSection380(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyReviewOfSystemsSection380TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodySocialHistorySection382() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodySocialHistorySection382TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodySocialHistorySection382",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION382__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodySocialHistorySection382(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodySocialHistorySection382TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPresentIllnessSection384() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPresentIllnessSection384TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPresentIllnessSection384",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION384__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPresentIllnessSection384(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyHistoryOfPresentIllnessSection384TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyImmunizationsSectionEntriesOptional386() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyImmunizationsSectionEntriesOptional386TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyImmunizationsSectionEntriesOptional386",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL386__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyImmunizationsSectionEntriesOptional386(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyImmunizationsSectionEntriesOptional386TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyProblemSectionEntriesOptional388() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyProblemSectionEntriesOptional388TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyProblemSectionEntriesOptional388",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION_ENTRIES_OPTIONAL388__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyProblemSectionEntriesOptional388(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyProblemSectionEntriesOptional388TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyProceduresSectionEntriesOptional390() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyProceduresSectionEntriesOptional390TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyProceduresSectionEntriesOptional390",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL390__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyProceduresSectionEntriesOptional390(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyProceduresSectionEntriesOptional390TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyVitalSignsSectionEntriesOptional392() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyVitalSignsSectionEntriesOptional392TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyVitalSignsSectionEntriesOptional392",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL392__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyVitalSignsSectionEntriesOptional392(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyVitalSignsSectionEntriesOptional392TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBodyInstructionsSection394() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBodyInstructionsSection394TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBodyInstructionsSection394",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY_INSTRUCTIONS_SECTION394__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBodyInstructionsSection394(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBodyInstructionsSection394TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryAndPhysicalNoteComponentStructuredBody353() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentStructuredBody353TestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentStructuredBody353",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_STRUCTURED_BODY353__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentStructuredBody353(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentStructuredBody353TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<HistoryAndPhysicalNote> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateGeneralHeaderConstraintsTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateGeneralHeaderConstraintsTemplateId(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
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
		OperationsTestCase<HistoryAndPhysicalNote> validateGeneralHeaderConstraintsCodeTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateGeneralHeaderConstraintsCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected void setDependency(HistoryAndPhysicalNote target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateGeneralHeaderConstraintsCode(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HistoryAndPhysicalNoteOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HistoryAndPhysicalNote> {
		@Override
		public HistoryAndPhysicalNote create() {
			return ConsolFactory.eINSTANCE.createHistoryAndPhysicalNote();
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
	private static class ConstructorTestClass extends HistoryAndPhysicalNoteOperations {
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

} // HistoryAndPhysicalNoteOperations
