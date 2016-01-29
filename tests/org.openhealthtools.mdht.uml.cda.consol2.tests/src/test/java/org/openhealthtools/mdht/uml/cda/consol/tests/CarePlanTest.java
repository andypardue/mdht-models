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
import org.openhealthtools.mdht.uml.cda.consol.CarePlan;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.CarePlanOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Care Plan</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanDoesNotHavePlanOfTreatmentSectionV2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Does Not Have Plan Of Treatment Section V2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanSetId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Set Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanAuthenticator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCarePlanReview(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCaregiver(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Caregiver</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanRelatedDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Related Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanComponent766(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Component766</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanInformationRecipientIntendedRecipientInformationRecipientName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Information Recipient Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Received Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Received Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Received Organization Standard Industry Class Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Received Organization Standard Industry Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanInformationRecipientIntendedRecipientId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanInformationRecipientIntendedRecipientAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanInformationRecipientIntendedRecipientTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanInformationRecipientIntendedRecipientInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanInformationRecipientIntendedRecipientReceivedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Received Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanInformationRecipientIntendedRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanAuthenticatorAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanAuthenticatorAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanAuthenticatorAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanAuthenticatorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanAuthenticatorSignatureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator Signature Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanAuthenticatorSDTCSignatureText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator SDTC Signature Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanAuthenticatorAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCarePlanReviewAssociatedEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Associated Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCarePlanReviewAssociatedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Associated Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCarePlanReviewAssociatedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Associated Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCarePlanReviewAssociatedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Associated Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCarePlanReviewTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCarePlanReviewFunctionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Function Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCarePlanReviewFunctionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Function Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCarePlanReviewTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCarePlanReviewAssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Associated Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Caregiver Associated Entity Associated Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCaregiverAssociatedEntityClassCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Caregiver Associated Entity Class Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCaregiverAssociatedEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Caregiver Associated Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Caregiver Associated Entity Associated Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCaregiverTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Caregiver Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCaregiverAssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Caregiver Associated Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanDocumentationOfServiceEventIVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanDocumentationOfServiceEventIVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Performer Assigned Entity Assigned Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Performer Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Performer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Performer Assigned Entity Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanDocumentationOfServiceEventPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanDocumentationOfServiceEventClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanDocumentationOfServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanDocumentationOfServiceEventPerformer1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Performer1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanDocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanRelatedDocumentParentDocumentSetId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Related Document Parent Document Set Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanRelatedDocumentParentDocumentVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Related Document Parent Document Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanRelatedDocumentTypeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Related Document Type Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanRelatedDocumentTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Related Document Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanRelatedDocumentParentDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Related Document Parent Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanComponentOfEncompassingEncounterEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Component Of Encompassing Encounter Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Component Of Encompassing Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanComponentStructuredBodyComponentHealthConcernsSection769(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Component Structured Body Component Health Concerns Section769</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanComponentStructuredBodyComponentGoalsSection771(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Component Structured Body Component Goals Section771</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanComponentStructuredBodyComponentInterventionsSection2773(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Component Structured Body Component Interventions Section2773</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanComponentStructuredBodyComponentHealthStatusEvaluationsOutcomesSection775(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Component Structured Body Component Health Status Evaluations Outcomes Section775</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanComponentStructuredBodyHealthConcernsSection768(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Component Structured Body Health Concerns Section768</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanComponentStructuredBodyGoalsSection770(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Component Structured Body Goals Section770</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanComponentStructuredBodyInterventionsSection2772(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Component Structured Body Interventions Section2772</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanComponentStructuredBodyHealthStatusEvaluationsOutcomesSection774(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Component Structured Body Health Status Evaluations Outcomes Section774</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanComponentStructuredBody767(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Component Structured Body767</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CarePlanTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanDoesNotHavePlanOfTreatmentSectionV2() {
		OperationsTestCase<CarePlan> validateCarePlanDoesNotHavePlanOfTreatmentSectionV2TestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanDoesNotHavePlanOfTreatmentSectionV2",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_DOES_NOT_HAVE_PLAN_OF_TREATMENT_SECTION_V2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanDoesNotHavePlanOfTreatmentSectionV2(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanDoesNotHavePlanOfTreatmentSectionV2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanCodeP() {
		OperationsTestCase<CarePlan> validateCarePlanCodePTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanCodeP",
			operationsForOCL.getOCLValue("VALIDATE_CARE_PLAN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanCodeP((CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanCode() {
		OperationsTestCase<CarePlan> validateCarePlanCodeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanCode",
			operationsForOCL.getOCLValue("VALIDATE_CARE_PLAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected void setDependency(CarePlan target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.CarePlanCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanCode((CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanSetId() {
		OperationsTestCase<CarePlan> validateCarePlanSetIdTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanSetId",
			operationsForOCL.getOCLValue("VALIDATE_CARE_PLAN_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanSetId((CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanSetIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanVersionNumber() {
		OperationsTestCase<CarePlan> validateCarePlanVersionNumberTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanVersionNumber",
			operationsForOCL.getOCLValue("VALIDATE_CARE_PLAN_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanVersionNumber((CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanVersionNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanInformationRecipient() {
		OperationsTestCase<CarePlan> validateCarePlanInformationRecipientTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanInformationRecipient",
			operationsForOCL.getOCLValue("VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanInformationRecipient(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanInformationRecipientTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanAuthenticator() {
		OperationsTestCase<CarePlan> validateCarePlanAuthenticatorTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanAuthenticator",
			operationsForOCL.getOCLValue("VALIDATE_CARE_PLAN_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanAuthenticator((CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanAuthenticatorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanParticipantCarePlanReview() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCarePlanReviewTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCarePlanReview", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCarePlanReview(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCarePlanReviewTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanParticipantCaregiver() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCaregiverTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCaregiver",
			operationsForOCL.getOCLValue("VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCaregiver(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCaregiverTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanDocumentationOf() {
		OperationsTestCase<CarePlan> validateCarePlanDocumentationOfTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanDocumentationOf",
			operationsForOCL.getOCLValue("VALIDATE_CARE_PLAN_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanDocumentationOf((CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanDocumentationOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanRelatedDocument() {
		OperationsTestCase<CarePlan> validateCarePlanRelatedDocumentTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanRelatedDocument",
			operationsForOCL.getOCLValue("VALIDATE_CARE_PLAN_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanRelatedDocument((CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanRelatedDocumentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanComponentOf() {
		OperationsTestCase<CarePlan> validateCarePlanComponentOfTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanComponentOf",
			operationsForOCL.getOCLValue("VALIDATE_CARE_PLAN_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanComponentOf((CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanComponentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCarePlanComponent766() {
		OperationsTestCase<CarePlan> validateCarePlanComponent766TestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanComponent766",
			operationsForOCL.getOCLValue("VALIDATE_CARE_PLAN_COMPONENT766__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanComponent766((CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanComponent766TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanInformationRecipientIntendedRecipientInformationRecipientName() {
		OperationsTestCase<CarePlan> validateCarePlanInformationRecipientIntendedRecipientInformationRecipientNameTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanInformationRecipientIntendedRecipientInformationRecipientName",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientInformationRecipientName(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanInformationRecipientIntendedRecipientInformationRecipientNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationId() {
		OperationsTestCase<CarePlan> validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationIdTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationId",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationId(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationName() {
		OperationsTestCase<CarePlan> validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationNameTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationName",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationName(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodeP() {
		OperationsTestCase<CarePlan> validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodePTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_STANDARD_INDUSTRY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodeP(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCode() {
		OperationsTestCase<CarePlan> validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_STANDARD_INDUSTRY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCode(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanInformationRecipientIntendedRecipientId() {
		OperationsTestCase<CarePlan> validateCarePlanInformationRecipientIntendedRecipientIdTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanInformationRecipientIntendedRecipientId",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientId(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanInformationRecipientIntendedRecipientIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanInformationRecipientIntendedRecipientAddr() {
		OperationsTestCase<CarePlan> validateCarePlanInformationRecipientIntendedRecipientAddrTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanInformationRecipientIntendedRecipientAddr",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientAddr(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanInformationRecipientIntendedRecipientAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanInformationRecipientIntendedRecipientTelecom() {
		OperationsTestCase<CarePlan> validateCarePlanInformationRecipientIntendedRecipientTelecomTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanInformationRecipientIntendedRecipientTelecom",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientTelecom(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanInformationRecipientIntendedRecipientTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanInformationRecipientIntendedRecipientInformationRecipient() {
		OperationsTestCase<CarePlan> validateCarePlanInformationRecipientIntendedRecipientInformationRecipientTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanInformationRecipientIntendedRecipientInformationRecipient",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientInformationRecipient(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanInformationRecipientIntendedRecipientInformationRecipientTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanInformationRecipientIntendedRecipientReceivedOrganization() {
		OperationsTestCase<CarePlan> validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanInformationRecipientIntendedRecipientReceivedOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientReceivedOrganization(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanInformationRecipientIntendedRecipient() {
		OperationsTestCase<CarePlan> validateCarePlanInformationRecipientIntendedRecipientTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanInformationRecipientIntendedRecipient",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipient(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanInformationRecipientIntendedRecipientTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanAuthenticatorAssignedEntityId() {
		OperationsTestCase<CarePlan> validateCarePlanAuthenticatorAssignedEntityIdTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanAuthenticatorAssignedEntityId", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanAuthenticatorAssignedEntityId(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanAuthenticatorAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanAuthenticatorAssignedEntityCode() {
		OperationsTestCase<CarePlan> validateCarePlanAuthenticatorAssignedEntityCodeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanAuthenticatorAssignedEntityCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanAuthenticatorAssignedEntityCode(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanAuthenticatorAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanAuthenticatorAssignedEntityCodeP() {
		OperationsTestCase<CarePlan> validateCarePlanAuthenticatorAssignedEntityCodePTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanAuthenticatorAssignedEntityCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanAuthenticatorAssignedEntityCodeP(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanAuthenticatorAssignedEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanAuthenticatorTime() {
		OperationsTestCase<CarePlan> validateCarePlanAuthenticatorTimeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanAuthenticatorTime",
			operationsForOCL.getOCLValue("VALIDATE_CARE_PLAN_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanAuthenticatorTime(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanAuthenticatorTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanAuthenticatorSignatureCode() {
		OperationsTestCase<CarePlan> validateCarePlanAuthenticatorSignatureCodeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanAuthenticatorSignatureCode", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanAuthenticatorSignatureCode(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanAuthenticatorSignatureCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanAuthenticatorSDTCSignatureText() {
		OperationsTestCase<CarePlan> validateCarePlanAuthenticatorSDTCSignatureTextTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanAuthenticatorSDTCSignatureText",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_AUTHENTICATOR_SDTC_SIGNATURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

				DatatypesFactory.eINSTANCE.createED();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanAuthenticatorSDTCSignatureText(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanAuthenticatorSDTCSignatureTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanAuthenticatorAssignedEntity() {
		OperationsTestCase<CarePlan> validateCarePlanAuthenticatorAssignedEntityTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanAuthenticatorAssignedEntity", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanAuthenticatorAssignedEntity(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanAuthenticatorAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanParticipantCarePlanReviewAssociatedEntityClassCode() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCarePlanReviewAssociatedEntityClassCodeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCarePlanReviewAssociatedEntityClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCarePlanReviewAssociatedEntityClassCode(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCarePlanReviewAssociatedEntityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanParticipantCarePlanReviewAssociatedEntityId() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCarePlanReviewAssociatedEntityIdTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCarePlanReviewAssociatedEntityId",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCarePlanReviewAssociatedEntityId(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCarePlanReviewAssociatedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanParticipantCarePlanReviewAssociatedEntityCodeP() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCarePlanReviewAssociatedEntityCodePTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCarePlanReviewAssociatedEntityCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCarePlanReviewAssociatedEntityCodeP(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCarePlanReviewAssociatedEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanParticipantCarePlanReviewAssociatedEntityCode() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCarePlanReviewAssociatedEntityCodeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCarePlanReviewAssociatedEntityCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCarePlanReviewAssociatedEntityCode(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCarePlanReviewAssociatedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanParticipantCarePlanReviewTypeCode() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCarePlanReviewTypeCodeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCarePlanReviewTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCarePlanReviewTypeCode(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCarePlanReviewTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanParticipantCarePlanReviewFunctionCode() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCarePlanReviewFunctionCodeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCarePlanReviewFunctionCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCarePlanReviewFunctionCode(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCarePlanReviewFunctionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanParticipantCarePlanReviewFunctionCodeP() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCarePlanReviewFunctionCodePTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCarePlanReviewFunctionCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCarePlanReviewFunctionCodeP(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCarePlanReviewFunctionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanParticipantCarePlanReviewTime() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCarePlanReviewTimeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCarePlanReviewTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCarePlanReviewTime(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCarePlanReviewTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanParticipantCarePlanReviewAssociatedEntity() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCarePlanReviewAssociatedEntityTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCarePlanReviewAssociatedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCarePlanReviewAssociatedEntity(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCarePlanReviewAssociatedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanParticipantCaregiverAssociatedEntityAssociatedPersonName() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPersonNameTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPersonName",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPersonName(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanParticipantCaregiverAssociatedEntityClassCodeP() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCaregiverAssociatedEntityClassCodePTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCaregiverAssociatedEntityClassCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCaregiverAssociatedEntityClassCodeP(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCaregiverAssociatedEntityClassCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanParticipantCaregiverAssociatedEntityClassCode() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCaregiverAssociatedEntityClassCodeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCaregiverAssociatedEntityClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCaregiverAssociatedEntityClassCode(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCaregiverAssociatedEntityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanParticipantCaregiverAssociatedEntityAssociatedPerson() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPersonTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPerson",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPerson(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanParticipantCaregiverTypeCode() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCaregiverTypeCodeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCaregiverTypeCode", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCaregiverTypeCode(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCaregiverTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanParticipantCaregiverAssociatedEntity() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCaregiverAssociatedEntityTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCaregiverAssociatedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCaregiverAssociatedEntity(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCaregiverAssociatedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanDocumentationOfServiceEventIVLTSLow() {
		OperationsTestCase<CarePlan> validateCarePlanDocumentationOfServiceEventIVLTSLowTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanDocumentationOfServiceEventIVLTSLow",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanDocumentationOfServiceEventIVLTSLow(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanDocumentationOfServiceEventIVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanDocumentationOfServiceEventIVLTSHigh() {
		OperationsTestCase<CarePlan> validateCarePlanDocumentationOfServiceEventIVLTSHighTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanDocumentationOfServiceEventIVLTSHigh",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanDocumentationOfServiceEventIVLTSHigh(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanDocumentationOfServiceEventIVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPersonName() {
		OperationsTestCase<CarePlan> validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPersonNameTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPersonName",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPersonName(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanDocumentationOfServiceEventPerformerAssignedEntityId() {
		OperationsTestCase<CarePlan> validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityIdTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityId",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityId(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanDocumentationOfServiceEventPerformerAssignedEntityCode() {
		OperationsTestCase<CarePlan> validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityCodeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityCode(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPerson() {
		OperationsTestCase<CarePlan> validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPersonTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPerson",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPerson(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanDocumentationOfServiceEventPerformerAssignedEntity() {
		OperationsTestCase<CarePlan> validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanDocumentationOfServiceEventPerformerAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanDocumentationOfServiceEventPerformerAssignedEntity(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanDocumentationOfServiceEventClassCode() {
		OperationsTestCase<CarePlan> validateCarePlanDocumentationOfServiceEventClassCodeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanDocumentationOfServiceEventClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanDocumentationOfServiceEventClassCode(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanDocumentationOfServiceEventClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanDocumentationOfServiceEventEffectiveTime() {
		OperationsTestCase<CarePlan> validateCarePlanDocumentationOfServiceEventEffectiveTimeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanDocumentationOfServiceEventEffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanDocumentationOfServiceEventEffectiveTime(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanDocumentationOfServiceEventEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanDocumentationOfServiceEventPerformer1() {
		OperationsTestCase<CarePlan> validateCarePlanDocumentationOfServiceEventPerformer1TestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanDocumentationOfServiceEventPerformer1",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanDocumentationOfServiceEventPerformer1(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanDocumentationOfServiceEventPerformer1TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanDocumentationOfServiceEvent() {
		OperationsTestCase<CarePlan> validateCarePlanDocumentationOfServiceEventTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanDocumentationOfServiceEvent", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanDocumentationOfServiceEvent(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanDocumentationOfServiceEventTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanRelatedDocumentParentDocumentSetId() {
		OperationsTestCase<CarePlan> validateCarePlanRelatedDocumentParentDocumentSetIdTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanRelatedDocumentParentDocumentSetId",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_RELATED_DOCUMENT_PARENT_DOCUMENT_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanRelatedDocumentParentDocumentSetId(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanRelatedDocumentParentDocumentSetIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanRelatedDocumentParentDocumentVersionNumber() {
		OperationsTestCase<CarePlan> validateCarePlanRelatedDocumentParentDocumentVersionNumberTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanRelatedDocumentParentDocumentVersionNumber",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_RELATED_DOCUMENT_PARENT_DOCUMENT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanRelatedDocumentParentDocumentVersionNumber(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanRelatedDocumentParentDocumentVersionNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanRelatedDocumentTypeCodeP() {
		OperationsTestCase<CarePlan> validateCarePlanRelatedDocumentTypeCodePTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanRelatedDocumentTypeCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_RELATED_DOCUMENT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanRelatedDocumentTypeCodeP(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanRelatedDocumentTypeCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanRelatedDocumentTypeCode() {
		OperationsTestCase<CarePlan> validateCarePlanRelatedDocumentTypeCodeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanRelatedDocumentTypeCode", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_RELATED_DOCUMENT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanRelatedDocumentTypeCode(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanRelatedDocumentTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanRelatedDocumentParentDocument() {
		OperationsTestCase<CarePlan> validateCarePlanRelatedDocumentParentDocumentTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanRelatedDocumentParentDocument", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_RELATED_DOCUMENT_PARENT_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanRelatedDocumentParentDocument(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanRelatedDocumentParentDocumentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanComponentOfEncompassingEncounterEffectiveTime() {
		OperationsTestCase<CarePlan> validateCarePlanComponentOfEncompassingEncounterEffectiveTimeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanComponentOfEncompassingEncounterEffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanComponentOfEncompassingEncounterEffectiveTime(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanComponentOfEncompassingEncounterEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanComponentOfEncompassingEncounter() {
		OperationsTestCase<CarePlan> validateCarePlanComponentOfEncompassingEncounterTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanComponentOfEncompassingEncounter",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanComponentOfEncompassingEncounter(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanComponentOfEncompassingEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCarePlanComponentStructuredBodyComponentHealthConcernsSection769() {
		OperationsTestCase<CarePlan> validateCarePlanComponentStructuredBodyComponentHealthConcernsSection769TestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanComponentStructuredBodyComponentHealthConcernsSection769",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_COMPONENT_STRUCTURED_BODY_COMPONENT_HEALTH_CONCERNS_SECTION769__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanComponentStructuredBodyComponentHealthConcernsSection769(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanComponentStructuredBodyComponentHealthConcernsSection769TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCarePlanComponentStructuredBodyComponentGoalsSection771() {
		OperationsTestCase<CarePlan> validateCarePlanComponentStructuredBodyComponentGoalsSection771TestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanComponentStructuredBodyComponentGoalsSection771",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_COMPONENT_STRUCTURED_BODY_COMPONENT_GOALS_SECTION771__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanComponentStructuredBodyComponentGoalsSection771(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanComponentStructuredBodyComponentGoalsSection771TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCarePlanComponentStructuredBodyComponentInterventionsSection2773() {
		OperationsTestCase<CarePlan> validateCarePlanComponentStructuredBodyComponentInterventionsSection2773TestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanComponentStructuredBodyComponentInterventionsSection2773",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_COMPONENT_STRUCTURED_BODY_COMPONENT_INTERVENTIONS_SECTION2773__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanComponentStructuredBodyComponentInterventionsSection2773(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanComponentStructuredBodyComponentInterventionsSection2773TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCarePlanComponentStructuredBodyComponentHealthStatusEvaluationsOutcomesSection775() {
		OperationsTestCase<CarePlan> validateCarePlanComponentStructuredBodyComponentHealthStatusEvaluationsOutcomesSection775TestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanComponentStructuredBodyComponentHealthStatusEvaluationsOutcomesSection775",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_COMPONENT_STRUCTURED_BODY_COMPONENT_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION775__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanComponentStructuredBodyComponentHealthStatusEvaluationsOutcomesSection775(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanComponentStructuredBodyComponentHealthStatusEvaluationsOutcomesSection775TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCarePlanComponentStructuredBodyHealthConcernsSection768() {
		OperationsTestCase<CarePlan> validateCarePlanComponentStructuredBodyHealthConcernsSection768TestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanComponentStructuredBodyHealthConcernsSection768",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_COMPONENT_STRUCTURED_BODY_HEALTH_CONCERNS_SECTION768__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanComponentStructuredBodyHealthConcernsSection768(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanComponentStructuredBodyHealthConcernsSection768TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCarePlanComponentStructuredBodyGoalsSection770() {
		OperationsTestCase<CarePlan> validateCarePlanComponentStructuredBodyGoalsSection770TestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanComponentStructuredBodyGoalsSection770",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_COMPONENT_STRUCTURED_BODY_GOALS_SECTION770__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanComponentStructuredBodyGoalsSection770(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanComponentStructuredBodyGoalsSection770TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCarePlanComponentStructuredBodyInterventionsSection2772() {
		OperationsTestCase<CarePlan> validateCarePlanComponentStructuredBodyInterventionsSection2772TestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanComponentStructuredBodyInterventionsSection2772",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_COMPONENT_STRUCTURED_BODY_INTERVENTIONS_SECTION2772__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanComponentStructuredBodyInterventionsSection2772(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanComponentStructuredBodyInterventionsSection2772TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCarePlanComponentStructuredBodyHealthStatusEvaluationsOutcomesSection774() {
		OperationsTestCase<CarePlan> validateCarePlanComponentStructuredBodyHealthStatusEvaluationsOutcomesSection774TestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanComponentStructuredBodyHealthStatusEvaluationsOutcomesSection774",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_COMPONENT_STRUCTURED_BODY_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION774__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanComponentStructuredBodyHealthStatusEvaluationsOutcomesSection774(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanComponentStructuredBodyHealthStatusEvaluationsOutcomesSection774TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCarePlanComponentStructuredBody767() {
		OperationsTestCase<CarePlan> validateCarePlanComponentStructuredBody767TestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanComponentStructuredBody767", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_COMPONENT_STRUCTURED_BODY767__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanComponentStructuredBody767(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanComponentStructuredBody767TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<CarePlan> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<CarePlan>(
			"validateGeneralHeaderConstraintsTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateGeneralHeaderConstraintsTemplateId(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CarePlanOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CarePlan> {
		@Override
		public CarePlan create() {
			return ConsolFactory.eINSTANCE.createCarePlan();
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
	private static class ConstructorTestClass extends CarePlanOperations {
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

} // CarePlanOperations
