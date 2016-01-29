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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument;
import org.openhealthtools.mdht.uml.cda.consol.operations.USRealmHeaderPatientGeneratedDocumentOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>US Realm Header Patient Generated Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentDataEnterer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Data Enterer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentInformant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Legal Authenticator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentAuthenticator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Authenticator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document In Fulfillment Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Patient Guardian Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Patient Guardian Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Patient Guardian Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Patient Language Communication Preference Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientIfMoreThanOneLangComm(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Patient If More Than One Lang Comm</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Patient Guardian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Patient Language Communication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Patient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleProviderOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Provider Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECodeSystemAndTerminology(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Author Assigned Author CE Code System And Terminology</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Author Assigned Author CE Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Author Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Author Assigned Author Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Author Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Data Enterer Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Data Enterer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Data Enterer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Informant Related Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Informant Related Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentInformantHasRelatedEntityOrAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Informant Has Related Entity Or Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Informant Related Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Custodian Assigned Custodian Represented Custodian Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Custodian Assigned Custodian Represented Custodian Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Custodian Assigned Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientIIRoot(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Information Recipient Intended Recipient II Root</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Information Recipient Intended Recipient Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Information Recipient Intended Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECodeSystemAndTerminology(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Legal Authenticator Assigned Entity CE Code System And Terminology</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Legal Authenticator Assigned Entity CE Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Legal Authenticator Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Legal Authenticator Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Legal Authenticator Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Authenticator Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Authenticator Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Authenticator Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Authenticator Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Participant Associated Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Participant Associated Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentParticipantIfTypeCodeINDThenAEClassCodeFromINDRoleclassCodes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Participant If Type Code IND Then AE Class Code From IND Roleclass Codes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Participant Associated Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document In Fulfillment Of Order Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document In Fulfillment Of Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event Performer Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event Performer Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event Performer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event Performer Function Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event Performer Function Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class USRealmHeaderPatientGeneratedDocumentTest extends CDAValidationTest {

	private static final String ROLECODE_CODESYSTEM = "2.16.840.1.113883.5.111";

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentRecordTarget() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentRecordTargetTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentRecordTarget",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentRecordTarget(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentRecordTargetTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentAuthor() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentAuthorTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentAuthor",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentAuthor(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentDataEnterer() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentDataEntererTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentDataEnterer",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentDataEnterer(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentDataEntererTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentInformant() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentInformantTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentInformant",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentInformant(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentInformantTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentCustodian() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentCustodianTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentCustodian",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentCustodian(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentCustodianTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentInformationRecipient() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentInformationRecipient",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentInformationRecipient(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticator() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticator",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticator(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentAuthenticator() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentAuthenticator",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentAuthenticator(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentParticipant() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentParticipantTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentParticipant",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentParticipant(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOf() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOfTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOf",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOf(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentDocumentationOf() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentDocumentationOf",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentDocumentationOf(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianId() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianIdTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianId",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianId(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCodeP() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCodePTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCodeP(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCode() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCodeTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCode(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunicationPreferenceIndTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunicationPreferenceIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientIfMoreThanOneLangComm() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientIfMoreThanOneLangCommTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientIfMoreThanOneLangComm",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_IF_MORE_THAN_ONE_LANG_COMM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientIfMoreThanOneLangComm(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientIfMoreThanOneLangCommTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardian() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardian",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardian(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunication() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunicationTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunication",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunication(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleId() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleIdTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleId",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleId(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatient() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatient",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatient(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleProviderOrganization() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleProviderOrganizationTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleProviderOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleProviderOrganization(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleProviderOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRole() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRole",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRole(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECodeSystemAndTerminology() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECodeSystemAndTerminologyTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECodeSystemAndTerminology",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_CE_CODE_SYSTEM_AND_TERMINOLOGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECodeSystemAndTerminology(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECodeSystemAndTerminologyTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECode() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECodeTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECode",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_CE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECode(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorId() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorIdTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorId",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorId(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCode() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCodeTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCode(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthor() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthor",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthor(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCodeP() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCodePTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DATA_ENTERER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCodeP(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCode() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCodeTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DATA_ENTERER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCode(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntity() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DATA_ENTERER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntity(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCodeP() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCodePTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT_RELATED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCodeP(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCode() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCodeTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT_RELATED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCode(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentInformantHasRelatedEntityOrAssignedEntity() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentInformantHasRelatedEntityOrAssignedEntityTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentInformantHasRelatedEntityOrAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT_HAS_RELATED_ENTITY_OR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentInformantHasRelatedEntityOrAssignedEntity(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentInformantHasRelatedEntityOrAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntity() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntityTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntity(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganizationId() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganizationIdTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganizationId",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganizationId(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganizationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganization() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganizationTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganization(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodian() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodian",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodian(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientIIRoot() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientIIRootTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientIIRoot",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientIIRoot(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientIIRootTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientId() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientIdTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientId",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientId(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipient() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipient",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipient(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECodeSystemAndTerminology() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECodeSystemAndTerminologyTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECodeSystemAndTerminology",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CE_CODE_SYSTEM_AND_TERMINOLOGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECodeSystemAndTerminology(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECodeSystemAndTerminologyTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECode() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECodeTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECode",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECode(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityId() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityIdTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityId",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityId(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCode() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCodeTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCode(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntity() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntity(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityId() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityIdTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityId",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityId(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCodeP() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCodePTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCodeP(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCode() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCodeTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCode(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntity() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntity(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCodeP() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCodePTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_ASSOCIATED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCodeP(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCode() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCodeTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_ASSOCIATED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCode(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	* Note: modified OCL in operations
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentParticipantIfTypeCodeINDThenAEClassCodeFromINDRoleclassCodes() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentParticipantIfTypeCodeINDThenAEClassCodeFromINDRoleclassCodesTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentParticipantIfTypeCodeINDThenAEClassCodeFromINDRoleclassCodes",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_IF_TYPE_CODE_IND_THEN_AE_CLASS_CODE_FROM_IND_ROLECLASS_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentParticipantIfTypeCodeINDThenAEClassCodeFromINDRoleclassCodes(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentParticipantIfTypeCodeINDThenAEClassCodeFromINDRoleclassCodesTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentParticipantTypeCode() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentParticipantTypeCodeTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentParticipantTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentParticipantTypeCode(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentParticipantTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntity() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntity(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrderId() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrderIdTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrderId",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrderId(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrderIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrder() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrderTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrder",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrder(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrderTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityId() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityIdTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityId",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityId(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCodePTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCode() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCode(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCodeP() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCodePTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCodeP(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCode() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCodeTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCode(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntity() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntity(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventCode() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventCodeTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventCode(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformer() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformer",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformer(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEvent() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEvent",
			operationsForOCL.getOCLValue(
				"VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEvent(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<USRealmHeaderPatientGeneratedDocument> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<USRealmHeaderPatientGeneratedDocument>(
			"validateGeneralHeaderConstraintsTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeaderPatientGeneratedDocument target) {

			}

			@Override
			protected void updateToPass(USRealmHeaderPatientGeneratedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeaderPatientGeneratedDocumentOperations.validateGeneralHeaderConstraintsTemplateId(
					(USRealmHeaderPatientGeneratedDocument) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends USRealmHeaderPatientGeneratedDocumentOperations {
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
	private static class ObjectFactory implements TestObjectFactory<USRealmHeaderPatientGeneratedDocument> {
		@Override
		public USRealmHeaderPatientGeneratedDocument create() {
			return ConsolFactory.eINSTANCE.createUSRealmHeaderPatientGeneratedDocument();
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
	private static class ConstructorTestClass extends USRealmHeaderPatientGeneratedDocumentOperations {
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

} // USRealmHeaderPatientGeneratedDocumentOperations
