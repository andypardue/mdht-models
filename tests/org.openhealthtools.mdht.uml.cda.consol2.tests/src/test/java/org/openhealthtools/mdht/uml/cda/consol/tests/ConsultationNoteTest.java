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
import org.openhealthtools.mdht.uml.cda.consol.ConsultationNote;
import org.openhealthtools.mdht.uml.cda.consol.operations.ConsultationNoteOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Consultation Note</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has An Assement And Plan Section Or Individual Assement And Plan Sections</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Does Not Have Individual Assement And Plan Sections When Assement And Plan Section Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteHasReasonForReferralOrReasonForVisit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Reason For Referral Or Reason For Visit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateGeneralHeaderConstraintsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteInFulfillmentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note In Fulfillment Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponent308(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component308</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Responsible Party Assigned Entity Has Person Organization Or Both</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Responsible Party Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntityHasPersonOrganizationOrBoth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Encounter Participant Assigned Entity Has Person Organization Or Both</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Encounter Participant Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Precise To The Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheMinute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Precise To The Minute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheSecond(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Precise To The Second</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2IfMorePreciseThanDayIncludeTimeZoneOffset(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 If More Precise Than Day Include Time Zone Offset</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2ResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Responsible Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Encounter Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteInFulfillmentOfOrderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note In Fulfillment Of Order Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteInFulfillmentOfOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note In Fulfillment Of Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyComponentAssessmentAndPlanSection311(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Component Assessment And Plan Section311</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyComponentAssessmentSection313(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Component Assessment Section313</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyComponentPlanOfCareSection315(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Component Plan Of Care Section315</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyComponentHistoryOfPresentIllness317(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Component History Of Present Illness317</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyComponentPhysicalExamSection319(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Component Physical Exam Section319</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyComponentReasonForReferralSection321(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Component Reason For Referral Section321</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyComponentReasonForVisitSection323(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Component Reason For Visit Section323</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyComponentAllergiesSection325(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Component Allergies Section325</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyComponentChiefComplaintSection327(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Component Chief Complaint Section327</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection329(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Component Chief Complaint And Reason For Visit Section329</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyComponentFamilyHistorySection331(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Component Family History Section331</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyComponentGeneralStatusSection333(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Component General Status Section333</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection335(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Component History Of Past Illness Section335</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyComponentImmunizationsSection337(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Component Immunizations Section337</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional339(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Component Medications Section Entries Optional339</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyComponentProblemSectionEntriesOptional341(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Component Problem Section Entries Optional341</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional343(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Component Procedures Section Entries Optional343</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyComponentResultsSectionEntriesOptional345(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Component Results Section Entries Optional345</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyComponentReviewOfSystemsSection347(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Component Review Of Systems Section347</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyComponentSocialHistorySection349(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Component Social History Section349</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional351(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Component Vital Signs Section Entries Optional351</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyAssessmentAndPlanSection310(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Assessment And Plan Section310</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyAssessmentSection312(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Assessment Section312</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyPlanOfCareSection314(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Plan Of Care Section314</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyHistoryOfPresentIllness316(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body History Of Present Illness316</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyPhysicalExamSection318(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Physical Exam Section318</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyReasonForReferralSection320(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Reason For Referral Section320</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyReasonForVisitSection322(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Reason For Visit Section322</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyAllergiesSection324(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Allergies Section324</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyChiefComplaintSection326(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Chief Complaint Section326</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection328(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Chief Complaint And Reason For Visit Section328</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyFamilyHistorySection330(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Family History Section330</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyGeneralStatusSection332(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body General Status Section332</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyHistoryOfPastIllnessSection334(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body History Of Past Illness Section334</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyImmunizationsSection336(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Immunizations Section336</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyMedicationsSectionEntriesOptional338(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Medications Section Entries Optional338</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyProblemSectionEntriesOptional340(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Problem Section Entries Optional340</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyProceduresSectionEntriesOptional342(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Procedures Section Entries Optional342</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyResultsSectionEntriesOptional344(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Results Section Entries Optional344</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyReviewOfSystemsSection346(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Review Of Systems Section346</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodySocialHistorySection348(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Social History Section348</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBodyVitalSignsSectionEntriesOptional350(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body Vital Signs Section Entries Optional350</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentStructuredBody309(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Structured Body309</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ConsultationNoteTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSectionsTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSectionsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresentTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresentTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateConsultationNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
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

				return ConsultationNoteOperations.validateConsultationNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteHasReasonForReferralOrReasonForVisit() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteHasReasonForReferralOrReasonForVisitTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteHasReasonForReferralOrReasonForVisit",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_HAS_REASON_FOR_REFERRAL_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteHasReasonForReferralOrReasonForVisit(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteHasReasonForReferralOrReasonForVisitTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCodeP() {
		OperationsTestCase<ConsultationNote> validateGeneralHeaderConstraintsCodePTestCase = new OperationsTestCase<ConsultationNote>(
			"validateGeneralHeaderConstraintsCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateGeneralHeaderConstraintsCodeP(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteInFulfillmentOf() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteInFulfillmentOfTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteInFulfillmentOf", operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteInFulfillmentOf(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteInFulfillmentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponent308() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponent308TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponent308",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_COMPONENT308__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponent308(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponent308TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteComponentOf() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentOfTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentOf",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentOf(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteInFulfillmentOfOrderId() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteInFulfillmentOfOrderIdTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteInFulfillmentOfOrderId",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteInFulfillmentOfOrderId(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteInFulfillmentOfOrderIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteInFulfillmentOfOrder() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteInFulfillmentOfOrderTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteInFulfillmentOfOrder", operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteInFulfillmentOfOrder(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteInFulfillmentOfOrderTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyComponentAssessmentAndPlanSection311() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyComponentAssessmentAndPlanSection311TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyComponentAssessmentAndPlanSection311",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION311__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentAssessmentAndPlanSection311(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyComponentAssessmentAndPlanSection311TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyComponentAssessmentSection313() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyComponentAssessmentSection313TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyComponentAssessmentSection313",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION313__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentAssessmentSection313(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyComponentAssessmentSection313TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyComponentPlanOfCareSection315() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyComponentPlanOfCareSection315TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyComponentPlanOfCareSection315",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_CARE_SECTION315__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentPlanOfCareSection315(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyComponentPlanOfCareSection315TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyComponentHistoryOfPresentIllness317() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyComponentHistoryOfPresentIllness317TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyComponentHistoryOfPresentIllness317",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS317__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentHistoryOfPresentIllness317(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyComponentHistoryOfPresentIllness317TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyComponentPhysicalExamSection319() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyComponentPhysicalExamSection319TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyComponentPhysicalExamSection319",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION319__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentPhysicalExamSection319(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyComponentPhysicalExamSection319TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyComponentReasonForReferralSection321() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyComponentReasonForReferralSection321TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyComponentReasonForReferralSection321",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_REFERRAL_SECTION321__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentReasonForReferralSection321(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyComponentReasonForReferralSection321TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyComponentReasonForVisitSection323() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyComponentReasonForVisitSection323TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyComponentReasonForVisitSection323",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION323__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentReasonForVisitSection323(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyComponentReasonForVisitSection323TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyComponentAllergiesSection325() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyComponentAllergiesSection325TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyComponentAllergiesSection325",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION325__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentAllergiesSection325(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyComponentAllergiesSection325TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyComponentChiefComplaintSection327() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyComponentChiefComplaintSection327TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyComponentChiefComplaintSection327",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION327__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentChiefComplaintSection327(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyComponentChiefComplaintSection327TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection329() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection329TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection329",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION329__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection329(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection329TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyComponentFamilyHistorySection331() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyComponentFamilyHistorySection331TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyComponentFamilyHistorySection331",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION331__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentFamilyHistorySection331(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyComponentFamilyHistorySection331TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyComponentGeneralStatusSection333() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyComponentGeneralStatusSection333TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyComponentGeneralStatusSection333",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_GENERAL_STATUS_SECTION333__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentGeneralStatusSection333(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyComponentGeneralStatusSection333TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection335() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection335TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection335",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION335__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection335(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection335TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyComponentImmunizationsSection337() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyComponentImmunizationsSection337TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyComponentImmunizationsSection337",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION337__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentImmunizationsSection337(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyComponentImmunizationsSection337TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional339() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional339TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional339",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION_ENTRIES_OPTIONAL339__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional339(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional339TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyComponentProblemSectionEntriesOptional341() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyComponentProblemSectionEntriesOptional341TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyComponentProblemSectionEntriesOptional341",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION_ENTRIES_OPTIONAL341__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentProblemSectionEntriesOptional341(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyComponentProblemSectionEntriesOptional341TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional343() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional343TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional343",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL343__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional343(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional343TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyComponentResultsSectionEntriesOptional345() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyComponentResultsSectionEntriesOptional345TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyComponentResultsSectionEntriesOptional345",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION_ENTRIES_OPTIONAL345__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentResultsSectionEntriesOptional345(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyComponentResultsSectionEntriesOptional345TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyComponentReviewOfSystemsSection347() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyComponentReviewOfSystemsSection347TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyComponentReviewOfSystemsSection347",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION347__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentReviewOfSystemsSection347(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyComponentReviewOfSystemsSection347TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyComponentSocialHistorySection349() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyComponentSocialHistorySection349TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyComponentSocialHistorySection349",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION349__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentSocialHistorySection349(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyComponentSocialHistorySection349TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional351() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional351TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional351",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL351__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional351(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional351TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyAssessmentAndPlanSection310() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyAssessmentAndPlanSection310TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyAssessmentAndPlanSection310",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION310__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyAssessmentAndPlanSection310(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyAssessmentAndPlanSection310TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyAssessmentSection312() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyAssessmentSection312TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyAssessmentSection312",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION312__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyAssessmentSection312(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyAssessmentSection312TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyPlanOfCareSection314() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyPlanOfCareSection314TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyPlanOfCareSection314",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_PLAN_OF_CARE_SECTION314__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyPlanOfCareSection314(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyPlanOfCareSection314TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyHistoryOfPresentIllness316() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyHistoryOfPresentIllness316TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyHistoryOfPresentIllness316",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS316__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyHistoryOfPresentIllness316(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyHistoryOfPresentIllness316TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyPhysicalExamSection318() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyPhysicalExamSection318TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyPhysicalExamSection318",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION318__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyPhysicalExamSection318(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyPhysicalExamSection318TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyReasonForReferralSection320() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyReasonForReferralSection320TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyReasonForReferralSection320",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_REASON_FOR_REFERRAL_SECTION320__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyReasonForReferralSection320(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyReasonForReferralSection320TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyReasonForVisitSection322() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyReasonForVisitSection322TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyReasonForVisitSection322",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION322__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyReasonForVisitSection322(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyReasonForVisitSection322TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyAllergiesSection324() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyAllergiesSection324TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyAllergiesSection324",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION324__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyAllergiesSection324(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyAllergiesSection324TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyChiefComplaintSection326() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyChiefComplaintSection326TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyChiefComplaintSection326",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION326__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyChiefComplaintSection326(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyChiefComplaintSection326TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection328() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection328TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection328",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION328__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection328(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyChiefComplaintAndReasonForVisitSection328TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyFamilyHistorySection330() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyFamilyHistorySection330TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyFamilyHistorySection330",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION330__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyFamilyHistorySection330(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyFamilyHistorySection330TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyGeneralStatusSection332() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyGeneralStatusSection332TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyGeneralStatusSection332",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_GENERAL_STATUS_SECTION332__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyGeneralStatusSection332(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyGeneralStatusSection332TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyHistoryOfPastIllnessSection334() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyHistoryOfPastIllnessSection334TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyHistoryOfPastIllnessSection334",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION334__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyHistoryOfPastIllnessSection334(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyHistoryOfPastIllnessSection334TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyImmunizationsSection336() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyImmunizationsSection336TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyImmunizationsSection336",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION336__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyImmunizationsSection336(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyImmunizationsSection336TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyMedicationsSectionEntriesOptional338() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyMedicationsSectionEntriesOptional338TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyMedicationsSectionEntriesOptional338",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION_ENTRIES_OPTIONAL338__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyMedicationsSectionEntriesOptional338(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyMedicationsSectionEntriesOptional338TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyProblemSectionEntriesOptional340() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyProblemSectionEntriesOptional340TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyProblemSectionEntriesOptional340",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION_ENTRIES_OPTIONAL340__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyProblemSectionEntriesOptional340(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyProblemSectionEntriesOptional340TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyProceduresSectionEntriesOptional342() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyProceduresSectionEntriesOptional342TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyProceduresSectionEntriesOptional342",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL342__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyProceduresSectionEntriesOptional342(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyProceduresSectionEntriesOptional342TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyResultsSectionEntriesOptional344() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyResultsSectionEntriesOptional344TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyResultsSectionEntriesOptional344",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION_ENTRIES_OPTIONAL344__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyResultsSectionEntriesOptional344(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyResultsSectionEntriesOptional344TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyReviewOfSystemsSection346() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyReviewOfSystemsSection346TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyReviewOfSystemsSection346",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION346__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyReviewOfSystemsSection346(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyReviewOfSystemsSection346TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodySocialHistorySection348() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodySocialHistorySection348TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodySocialHistorySection348",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION348__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodySocialHistorySection348(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodySocialHistorySection348TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBodyVitalSignsSectionEntriesOptional350() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBodyVitalSignsSectionEntriesOptional350TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBodyVitalSignsSectionEntriesOptional350",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL350__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBodyVitalSignsSectionEntriesOptional350(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBodyVitalSignsSectionEntriesOptional350TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNoteComponentStructuredBody309() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentStructuredBody309TestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentStructuredBody309",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_STRUCTURED_BODY309__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentStructuredBody309(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentStructuredBody309TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntityHasPersonOrganizationOrBoth() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntityHasPersonOrganizationOrBothTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntityHasPersonOrganizationOrBoth",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntityHasPersonOrganizationOrBoth(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntityHasPersonOrganizationOrBothTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntity() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntityTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntity(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheDay() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheDayTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheDay",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheDay(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheDayTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheMinute() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheMinuteTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheMinute",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheMinute(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheMinuteTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheSecond() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheSecondTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheSecond",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheSecond(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheSecondTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteComponentOfEncompassingEncounter2IfMorePreciseThanDayIncludeTimeZoneOffset() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentOfEncompassingEncounter2IfMorePreciseThanDayIncludeTimeZoneOffsetTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentOfEncompassingEncounter2IfMorePreciseThanDayIncludeTimeZoneOffset",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2IfMorePreciseThanDayIncludeTimeZoneOffset(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentOfEncompassingEncounter2IfMorePreciseThanDayIncludeTimeZoneOffsetTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntityHasPersonOrganizationOrBothTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntityHasPersonOrganizationOrBothTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntity() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntityTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntity(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteComponentOfEncompassingEncounter2EffectiveTime() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentOfEncompassingEncounter2EffectiveTimeTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentOfEncompassingEncounter2EffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2EffectiveTime(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentOfEncompassingEncounter2EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteComponentOfEncompassingEncounter2Id() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentOfEncompassingEncounter2IdTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentOfEncompassingEncounter2Id",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2Id(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentOfEncompassingEncounter2IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteComponentOfEncompassingEncounter2ResponsibleParty() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentOfEncompassingEncounter2ResponsibleParty",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2ResponsibleParty(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipant() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipant",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipant(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteComponentOfEncompassingEncounter() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentOfEncompassingEncounterTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentOfEncompassingEncounter",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentOfEncompassingEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<ConsultationNote> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<ConsultationNote>(
			"validateGeneralHeaderConstraintsTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateGeneralHeaderConstraintsTemplateId(
					(ConsultationNote) objectToTest, diagnostician, map);
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
		OperationsTestCase<ConsultationNote> validateGeneralHeaderConstraintsCodeTestCase = new OperationsTestCase<ConsultationNote>(
			"validateGeneralHeaderConstraintsCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected void setDependency(ConsultationNote target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateGeneralHeaderConstraintsCode(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ConsultationNoteOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ConsultationNote> {
		@Override
		public ConsultationNote create() {
			return ConsolFactory.eINSTANCE.createConsultationNote();
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
	private static class ConstructorTestClass extends ConsultationNoteOperations {
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

} // ConsultationNoteOperations
