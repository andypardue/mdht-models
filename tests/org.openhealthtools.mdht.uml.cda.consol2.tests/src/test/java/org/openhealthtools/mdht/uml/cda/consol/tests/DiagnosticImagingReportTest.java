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
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport;
import org.openhealthtools.mdht.uml.cda.consol.operations.DiagnosticImagingReportOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Diagnostic Imaging Report</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportUseDiagnosticImagingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Use Diagnostic Imaging Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportAllSectionsHaveTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report All Sections Have Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportSectionsHaveText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Sections Have Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateGeneralHeaderConstraintsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportInformant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportParticipant1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Participant1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportInFulfillmentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report In Fulfillment Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportRelatedDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Related Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportComponent530(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component530</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportParticipantAssociatedEntityPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Participant Associated Entity Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportParticipantAssociatedEntityAssociatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Participant Associated Entity Associated Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportParticipantAssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Participant Associated Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportDocumentationOfServiceEvent4ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Documentation Of Service Event4 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportDocumentationOfServiceEvent4Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Documentation Of Service Event4 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportDocumentationOfServiceEvent4Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Documentation Of Service Event4 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportDocumentationOfServiceEvent4PhysicianReadingStudyPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Documentation Of Service Event4 Physician Reading Study Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportDocumentationOfServiceEvent3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Documentation Of Service Event3</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of Encompassing Encounter7 Responsible Party Assigned Entity Has Assign Person Or Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of Encompassing Encounter7 Responsible Party Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportComponentOfEncompassingEncounter7PreciseToTheDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of Encompassing Encounter7 Precise To The Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportComponentOfEncompassingEncounter7PreciseToTheMinute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of Encompassing Encounter7 Precise To The Minute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportComponentOfEncompassingEncounter7PreciseToTheSecond(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of Encompassing Encounter7 Precise To The Second</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportComponentOfEncompassingEncounter7IfMorePreciseThanDayIncludeTimeZoneOffset(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of Encompassing Encounter7 If More Precise Than Day Include Time Zone Offset</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportComponentOfEncompassingEncounter7EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of Encompassing Encounter7 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportComponentOfEncompassingEncounter7Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of Encompassing Encounter7 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportComponentOfEncompassingEncounter7PhysicianofRecordParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of Encompassing Encounter7 Physicianof Record Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of Encompassing Encounter7 Responsible Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of Encompassing Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportComponentStructuredBodyComponentFindingsSection533(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Structured Body Component Findings Section533</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportComponentStructuredBodyComponentDICOMObjectCatalogSection535(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Structured Body Component DICOM Object Catalog Section535</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportComponentStructuredBodyFindingsSection532(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Structured Body Findings Section532</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportComponentStructuredBodyDICOMObjectCatalogSection534(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Structured Body DICOM Object Catalog Section534</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportComponentStructuredBody531(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Structured Body531</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateGeneralHeaderConstraintsId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DiagnosticImagingReportTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReportUseDiagnosticImagingCode() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportUseDiagnosticImagingCodeTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportUseDiagnosticImagingCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_USE_DIAGNOSTIC_IMAGING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportUseDiagnosticImagingCode(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportUseDiagnosticImagingCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReportAllSectionsHaveTitle() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportAllSectionsHaveTitleTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportAllSectionsHaveTitle",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_ALL_SECTIONS_HAVE_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportAllSectionsHaveTitle(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportAllSectionsHaveTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDiagnosticImagingReportSectionsHaveText() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportSectionsHaveTextTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportSectionsHaveText",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_SECTIONS_HAVE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

				DatatypesFactory.eINSTANCE.createED();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportSectionsHaveText(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportSectionsHaveTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCodeP() {
		OperationsTestCase<DiagnosticImagingReport> validateGeneralHeaderConstraintsCodePTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateGeneralHeaderConstraintsCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateGeneralHeaderConstraintsCodeP(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReportInformant() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportInformantTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportInformant", operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportInformant(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportInformantTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReportInformationRecipient() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportInformationRecipientTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportInformationRecipient",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportInformationRecipient(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportInformationRecipientTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReportParticipant1() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportParticipant1TestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportParticipant1", operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportParticipant1(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportParticipant1TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReportInFulfillmentOf() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportInFulfillmentOfTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportInFulfillmentOf",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportInFulfillmentOf(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportInFulfillmentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReportDocumentationOf() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportDocumentationOfTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportDocumentationOf", operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportDocumentationOf(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportDocumentationOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReportRelatedDocument() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportRelatedDocumentTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportRelatedDocument", operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportRelatedDocument(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportRelatedDocumentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReportComponentOf() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportComponentOfTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportComponentOf", operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportComponentOf(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportComponentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDiagnosticImagingReportComponent530() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportComponent530TestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportComponent530", operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT530__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportComponent530(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportComponent530TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReportParticipantAssociatedEntityPersonName() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportParticipantAssociatedEntityPersonNameTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportParticipantAssociatedEntityPersonName",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT_ASSOCIATED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportParticipantAssociatedEntityPersonName(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportParticipantAssociatedEntityPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReportParticipantAssociatedEntityAssociatedPerson() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportParticipantAssociatedEntityAssociatedPersonTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportParticipantAssociatedEntityAssociatedPerson",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportParticipantAssociatedEntityAssociatedPerson(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportParticipantAssociatedEntityAssociatedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReportParticipantAssociatedEntity() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportParticipantAssociatedEntityTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportParticipantAssociatedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportParticipantAssociatedEntity(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportParticipantAssociatedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReportDocumentationOfServiceEvent4ClassCode() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportDocumentationOfServiceEvent4ClassCodeTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportDocumentationOfServiceEvent4ClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT4_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportDocumentationOfServiceEvent4ClassCode(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportDocumentationOfServiceEvent4ClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReportDocumentationOfServiceEvent4Code() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportDocumentationOfServiceEvent4CodeTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportDocumentationOfServiceEvent4Code",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT4_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportDocumentationOfServiceEvent4Code(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportDocumentationOfServiceEvent4CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReportDocumentationOfServiceEvent4Id() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportDocumentationOfServiceEvent4IdTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportDocumentationOfServiceEvent4Id",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportDocumentationOfServiceEvent4Id(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportDocumentationOfServiceEvent4IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReportDocumentationOfServiceEvent4PhysicianReadingStudyPerformer() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportDocumentationOfServiceEvent4PhysicianReadingStudyPerformerTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportDocumentationOfServiceEvent4PhysicianReadingStudyPerformer",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT4_PHYSICIAN_READING_STUDY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportDocumentationOfServiceEvent4PhysicianReadingStudyPerformer(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportDocumentationOfServiceEvent4PhysicianReadingStudyPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReportDocumentationOfServiceEvent3() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportDocumentationOfServiceEvent3TestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportDocumentationOfServiceEvent3",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportDocumentationOfServiceEvent3(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportDocumentationOfServiceEvent3TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganizationTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_ASSIGN_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntity() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntityTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntity(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReportComponentOfEncompassingEncounter7PreciseToTheDay() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportComponentOfEncompassingEncounter7PreciseToTheDayTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportComponentOfEncompassingEncounter7PreciseToTheDay",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportComponentOfEncompassingEncounter7PreciseToTheDay(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportComponentOfEncompassingEncounter7PreciseToTheDayTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReportComponentOfEncompassingEncounter7PreciseToTheMinute() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportComponentOfEncompassingEncounter7PreciseToTheMinuteTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportComponentOfEncompassingEncounter7PreciseToTheMinute",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportComponentOfEncompassingEncounter7PreciseToTheMinute(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportComponentOfEncompassingEncounter7PreciseToTheMinuteTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReportComponentOfEncompassingEncounter7PreciseToTheSecond() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportComponentOfEncompassingEncounter7PreciseToTheSecondTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportComponentOfEncompassingEncounter7PreciseToTheSecond",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportComponentOfEncompassingEncounter7PreciseToTheSecond(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportComponentOfEncompassingEncounter7PreciseToTheSecondTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReportComponentOfEncompassingEncounter7IfMorePreciseThanDayIncludeTimeZoneOffset() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportComponentOfEncompassingEncounter7IfMorePreciseThanDayIncludeTimeZoneOffsetTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportComponentOfEncompassingEncounter7IfMorePreciseThanDayIncludeTimeZoneOffset",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportComponentOfEncompassingEncounter7IfMorePreciseThanDayIncludeTimeZoneOffset(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportComponentOfEncompassingEncounter7IfMorePreciseThanDayIncludeTimeZoneOffsetTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReportComponentOfEncompassingEncounter7EffectiveTime() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportComponentOfEncompassingEncounter7EffectiveTimeTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportComponentOfEncompassingEncounter7EffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportComponentOfEncompassingEncounter7EffectiveTime(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportComponentOfEncompassingEncounter7EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReportComponentOfEncompassingEncounter7Id() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportComponentOfEncompassingEncounter7IdTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportComponentOfEncompassingEncounter7Id",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportComponentOfEncompassingEncounter7Id(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportComponentOfEncompassingEncounter7IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReportComponentOfEncompassingEncounter7PhysicianofRecordParticipant() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportComponentOfEncompassingEncounter7PhysicianofRecordParticipantTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportComponentOfEncompassingEncounter7PhysicianofRecordParticipant",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_PHYSICIANOF_RECORD_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportComponentOfEncompassingEncounter7PhysicianofRecordParticipant(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportComponentOfEncompassingEncounter7PhysicianofRecordParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsibleParty() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsibleParty",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsibleParty(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiagnosticImagingReportComponentOfEncompassingEncounter() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportComponentOfEncompassingEncounterTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportComponentOfEncompassingEncounter",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportComponentOfEncompassingEncounter(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportComponentOfEncompassingEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDiagnosticImagingReportComponentStructuredBodyComponentFindingsSection533() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportComponentStructuredBodyComponentFindingsSection533TestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportComponentStructuredBodyComponentFindingsSection533",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_STRUCTURED_BODY_COMPONENT_FINDINGS_SECTION533__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportComponentStructuredBodyComponentFindingsSection533(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportComponentStructuredBodyComponentFindingsSection533TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDiagnosticImagingReportComponentStructuredBodyComponentDICOMObjectCatalogSection535() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportComponentStructuredBodyComponentDICOMObjectCatalogSection535TestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportComponentStructuredBodyComponentDICOMObjectCatalogSection535",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_STRUCTURED_BODY_COMPONENT_DICOM_OBJECT_CATALOG_SECTION535__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportComponentStructuredBodyComponentDICOMObjectCatalogSection535(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportComponentStructuredBodyComponentDICOMObjectCatalogSection535TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDiagnosticImagingReportComponentStructuredBodyFindingsSection532() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportComponentStructuredBodyFindingsSection532TestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportComponentStructuredBodyFindingsSection532",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_STRUCTURED_BODY_FINDINGS_SECTION532__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportComponentStructuredBodyFindingsSection532(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportComponentStructuredBodyFindingsSection532TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDiagnosticImagingReportComponentStructuredBodyDICOMObjectCatalogSection534() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportComponentStructuredBodyDICOMObjectCatalogSection534TestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportComponentStructuredBodyDICOMObjectCatalogSection534",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_STRUCTURED_BODY_DICOM_OBJECT_CATALOG_SECTION534__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportComponentStructuredBodyDICOMObjectCatalogSection534(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportComponentStructuredBodyDICOMObjectCatalogSection534TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDiagnosticImagingReportComponentStructuredBody531() {
		OperationsTestCase<DiagnosticImagingReport> validateDiagnosticImagingReportComponentStructuredBody531TestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateDiagnosticImagingReportComponentStructuredBody531",
			operationsForOCL.getOCLValue(
				"VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_STRUCTURED_BODY531__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateDiagnosticImagingReportComponentStructuredBody531(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateDiagnosticImagingReportComponentStructuredBody531TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<DiagnosticImagingReport> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateGeneralHeaderConstraintsTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateGeneralHeaderConstraintsTemplateId(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
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
		OperationsTestCase<DiagnosticImagingReport> validateGeneralHeaderConstraintsCodeTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateGeneralHeaderConstraintsCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected void setDependency(DiagnosticImagingReport target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateGeneralHeaderConstraintsCode(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsId() {
		OperationsTestCase<DiagnosticImagingReport> validateGeneralHeaderConstraintsIdTestCase = new OperationsTestCase<DiagnosticImagingReport>(
			"validateGeneralHeaderConstraintsId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiagnosticImagingReport target) {

			}

			@Override
			protected void updateToPass(DiagnosticImagingReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiagnosticImagingReportOperations.validateGeneralHeaderConstraintsId(
					(DiagnosticImagingReport) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DiagnosticImagingReportOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DiagnosticImagingReport> {
		@Override
		public DiagnosticImagingReport create() {
			return ConsolFactory.eINSTANCE.createDiagnosticImagingReport();
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
	private static class ConstructorTestClass extends DiagnosticImagingReportOperations {
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

} // DiagnosticImagingReportOperations
