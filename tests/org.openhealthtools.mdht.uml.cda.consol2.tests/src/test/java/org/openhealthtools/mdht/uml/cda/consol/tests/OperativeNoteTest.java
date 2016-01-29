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
import org.openhealthtools.mdht.uml.cda.consol.OperativeNote;
import org.openhealthtools.mdht.uml.cda.consol.operations.OperativeNoteOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Operative Note</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateGeneralHeaderConstraintsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponent396(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component396</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Primary Performer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Primary Performer Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Primary Performer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Primary Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventProcedureCodes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Procedure Codes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Effective Time Has Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Effective Time Has High When No Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Effective Time No High If Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventPreciseToTheDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Precise To The Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventPreciseToTheMinute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Precise To The Minute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventPreciseToTheSecond(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Precise To The Second</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event If More Precise Than Day Include Time Zone Offset</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventPrimaryPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Primary Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComponentAnesthesiaSection399(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Anesthesia Section399</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComponentComplicationsSection401(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Complications Section401</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComponentPostoperativeDiagnosisSection403(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Postoperative Diagnosis Section403</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComponentPreoperativeDiagnosisSection405(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Preoperative Diagnosis Section405</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComponentProcedureEstimatedBloodLossSection407(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Procedure Estimated Blood Loss Section407</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComponentProcedureFindingsSection409(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Procedure Findings Section409</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComponentProcedureSpecimensTakenSection411(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Procedure Specimens Taken Section411</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComponentProcedureDescriptionSection413(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Procedure Description Section413</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComponentProcedureImplantsSection415(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Procedure Implants Section415</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComponentOperativeNoteFluidSection417(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Operative Note Fluid Section417</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection419(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Operative Note Surgical Procedure Section419</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComponentPlanOfCareSection421(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Plan Of Care Section421</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComponentPlannedProcedureSection423(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Planned Procedure Section423</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComponentProcedureDispositionSection425(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Procedure Disposition Section425</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComponentProcedureIndicationsSection427(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Procedure Indications Section427</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComponentSurgicalDrainsSection429(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Component Surgical Drains Section429</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyAnesthesiaSection398(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Anesthesia Section398</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyComplicationsSection400(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Complications Section400</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyPostoperativeDiagnosisSection402(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Postoperative Diagnosis Section402</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyPreoperativeDiagnosisSection404(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Preoperative Diagnosis Section404</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyProcedureEstimatedBloodLossSection406(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Procedure Estimated Blood Loss Section406</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyProcedureFindingsSection408(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Procedure Findings Section408</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyProcedureSpecimensTakenSection410(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Procedure Specimens Taken Section410</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyProcedureDescriptionSection412(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Procedure Description Section412</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyProcedureImplantsSection414(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Procedure Implants Section414</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyOperativeNoteFluidSection416(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Operative Note Fluid Section416</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyOperativeNoteSurgicalProcedureSection418(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Operative Note Surgical Procedure Section418</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyPlanOfCareSection420(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Plan Of Care Section420</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyPlannedProcedureSection422(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Planned Procedure Section422</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyProcedureDispositionSection424(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Procedure Disposition Section424</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodyProcedureIndicationsSection426(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Procedure Indications Section426</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBodySurgicalDrainsSection428(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body Surgical Drains Section428</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComponentStructuredBody397(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Component Structured Body397</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class OperativeNoteTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCodeP() {
		OperationsTestCase<OperativeNote> validateGeneralHeaderConstraintsCodePTestCase = new OperationsTestCase<OperativeNote>(
			"validateGeneralHeaderConstraintsCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateGeneralHeaderConstraintsCodeP(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOf() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOf",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOf(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponent396() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponent396TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponent396",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_COMPONENT396__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponent396(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponent396TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCode() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCodeTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCode(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCodeP() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCodePTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCodeP(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCodeTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntity() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntity(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOfServiceEventProcedureCodes() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfServiceEventProcedureCodesTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOfServiceEventProcedureCodes",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventProcedureCodes(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfServiceEventProcedureCodesTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasLow() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasLowTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasLow",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasLow(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidthTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidthTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidth() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidthTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidth",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidth(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidthTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOfServiceEventPreciseToTheDay() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfServiceEventPreciseToTheDayTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOfServiceEventPreciseToTheDay",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventPreciseToTheDay(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfServiceEventPreciseToTheDayTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOfServiceEventPreciseToTheMinute() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfServiceEventPreciseToTheMinuteTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOfServiceEventPreciseToTheMinute",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventPreciseToTheMinute(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfServiceEventPreciseToTheMinuteTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOfServiceEventPreciseToTheSecond() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfServiceEventPreciseToTheSecondTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOfServiceEventPreciseToTheSecond",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventPreciseToTheSecond(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfServiceEventPreciseToTheSecondTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffsetTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffsetTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOfServiceEventCode() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfServiceEventCodeTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOfServiceEventCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventCode(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfServiceEventCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOfServiceEventEffectiveTime() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfServiceEventEffectiveTimeTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOfServiceEventEffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventEffectiveTime(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfServiceEventEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOfServiceEventPrimaryPerformer() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOfServiceEventPrimaryPerformer",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventPrimaryPerformer(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOfServiceEvent() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfServiceEventTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOfServiceEvent",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEvent(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfServiceEventTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponentStructuredBodyComponentAnesthesiaSection399() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponentStructuredBodyComponentAnesthesiaSection399TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponentStructuredBodyComponentAnesthesiaSection399",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ANESTHESIA_SECTION399__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComponentAnesthesiaSection399(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponentStructuredBodyComponentAnesthesiaSection399TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponentStructuredBodyComponentComplicationsSection401() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponentStructuredBodyComponentComplicationsSection401TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponentStructuredBodyComponentComplicationsSection401",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_COMPLICATIONS_SECTION401__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComponentComplicationsSection401(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponentStructuredBodyComponentComplicationsSection401TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponentStructuredBodyComponentPostoperativeDiagnosisSection403() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponentStructuredBodyComponentPostoperativeDiagnosisSection403TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponentStructuredBodyComponentPostoperativeDiagnosisSection403",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_POSTOPERATIVE_DIAGNOSIS_SECTION403__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComponentPostoperativeDiagnosisSection403(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponentStructuredBodyComponentPostoperativeDiagnosisSection403TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponentStructuredBodyComponentPreoperativeDiagnosisSection405() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponentStructuredBodyComponentPreoperativeDiagnosisSection405TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponentStructuredBodyComponentPreoperativeDiagnosisSection405",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PREOPERATIVE_DIAGNOSIS_SECTION405__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComponentPreoperativeDiagnosisSection405(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponentStructuredBodyComponentPreoperativeDiagnosisSection405TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponentStructuredBodyComponentProcedureEstimatedBloodLossSection407() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponentStructuredBodyComponentProcedureEstimatedBloodLossSection407TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponentStructuredBodyComponentProcedureEstimatedBloodLossSection407",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION407__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComponentProcedureEstimatedBloodLossSection407(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponentStructuredBodyComponentProcedureEstimatedBloodLossSection407TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponentStructuredBodyComponentProcedureFindingsSection409() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponentStructuredBodyComponentProcedureFindingsSection409TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponentStructuredBodyComponentProcedureFindingsSection409",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_FINDINGS_SECTION409__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComponentProcedureFindingsSection409(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponentStructuredBodyComponentProcedureFindingsSection409TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponentStructuredBodyComponentProcedureSpecimensTakenSection411() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponentStructuredBodyComponentProcedureSpecimensTakenSection411TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponentStructuredBodyComponentProcedureSpecimensTakenSection411",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_SPECIMENS_TAKEN_SECTION411__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComponentProcedureSpecimensTakenSection411(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponentStructuredBodyComponentProcedureSpecimensTakenSection411TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponentStructuredBodyComponentProcedureDescriptionSection413() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponentStructuredBodyComponentProcedureDescriptionSection413TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponentStructuredBodyComponentProcedureDescriptionSection413",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DESCRIPTION_SECTION413__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComponentProcedureDescriptionSection413(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponentStructuredBodyComponentProcedureDescriptionSection413TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponentStructuredBodyComponentProcedureImplantsSection415() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponentStructuredBodyComponentProcedureImplantsSection415TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponentStructuredBodyComponentProcedureImplantsSection415",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_IMPLANTS_SECTION415__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComponentProcedureImplantsSection415(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponentStructuredBodyComponentProcedureImplantsSection415TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponentStructuredBodyComponentOperativeNoteFluidSection417() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponentStructuredBodyComponentOperativeNoteFluidSection417TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponentStructuredBodyComponentOperativeNoteFluidSection417",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_OPERATIVE_NOTE_FLUID_SECTION417__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComponentOperativeNoteFluidSection417(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponentStructuredBodyComponentOperativeNoteFluidSection417TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection419() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection419TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection419",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION419__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection419(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection419TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponentStructuredBodyComponentPlanOfCareSection421() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponentStructuredBodyComponentPlanOfCareSection421TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponentStructuredBodyComponentPlanOfCareSection421",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_CARE_SECTION421__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComponentPlanOfCareSection421(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponentStructuredBodyComponentPlanOfCareSection421TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponentStructuredBodyComponentPlannedProcedureSection423() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponentStructuredBodyComponentPlannedProcedureSection423TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponentStructuredBodyComponentPlannedProcedureSection423",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PLANNED_PROCEDURE_SECTION423__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComponentPlannedProcedureSection423(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponentStructuredBodyComponentPlannedProcedureSection423TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponentStructuredBodyComponentProcedureDispositionSection425() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponentStructuredBodyComponentProcedureDispositionSection425TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponentStructuredBodyComponentProcedureDispositionSection425",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DISPOSITION_SECTION425__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComponentProcedureDispositionSection425(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponentStructuredBodyComponentProcedureDispositionSection425TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponentStructuredBodyComponentProcedureIndicationsSection427() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponentStructuredBodyComponentProcedureIndicationsSection427TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponentStructuredBodyComponentProcedureIndicationsSection427",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_INDICATIONS_SECTION427__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComponentProcedureIndicationsSection427(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponentStructuredBodyComponentProcedureIndicationsSection427TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponentStructuredBodyComponentSurgicalDrainsSection429() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponentStructuredBodyComponentSurgicalDrainsSection429TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponentStructuredBodyComponentSurgicalDrainsSection429",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_SURGICAL_DRAINS_SECTION429__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComponentSurgicalDrainsSection429(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponentStructuredBodyComponentSurgicalDrainsSection429TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponentStructuredBodyAnesthesiaSection398() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponentStructuredBodyAnesthesiaSection398TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponentStructuredBodyAnesthesiaSection398",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_ANESTHESIA_SECTION398__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyAnesthesiaSection398(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponentStructuredBodyAnesthesiaSection398TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponentStructuredBodyComplicationsSection400() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponentStructuredBodyComplicationsSection400TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponentStructuredBodyComplicationsSection400",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_COMPLICATIONS_SECTION400__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyComplicationsSection400(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponentStructuredBodyComplicationsSection400TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponentStructuredBodyPostoperativeDiagnosisSection402() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponentStructuredBodyPostoperativeDiagnosisSection402TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponentStructuredBodyPostoperativeDiagnosisSection402",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_POSTOPERATIVE_DIAGNOSIS_SECTION402__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyPostoperativeDiagnosisSection402(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponentStructuredBodyPostoperativeDiagnosisSection402TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponentStructuredBodyPreoperativeDiagnosisSection404() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponentStructuredBodyPreoperativeDiagnosisSection404TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponentStructuredBodyPreoperativeDiagnosisSection404",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PREOPERATIVE_DIAGNOSIS_SECTION404__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyPreoperativeDiagnosisSection404(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponentStructuredBodyPreoperativeDiagnosisSection404TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponentStructuredBodyProcedureEstimatedBloodLossSection406() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponentStructuredBodyProcedureEstimatedBloodLossSection406TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponentStructuredBodyProcedureEstimatedBloodLossSection406",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION406__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyProcedureEstimatedBloodLossSection406(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponentStructuredBodyProcedureEstimatedBloodLossSection406TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponentStructuredBodyProcedureFindingsSection408() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponentStructuredBodyProcedureFindingsSection408TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponentStructuredBodyProcedureFindingsSection408",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_FINDINGS_SECTION408__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyProcedureFindingsSection408(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponentStructuredBodyProcedureFindingsSection408TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponentStructuredBodyProcedureSpecimensTakenSection410() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponentStructuredBodyProcedureSpecimensTakenSection410TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponentStructuredBodyProcedureSpecimensTakenSection410",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_SPECIMENS_TAKEN_SECTION410__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyProcedureSpecimensTakenSection410(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponentStructuredBodyProcedureSpecimensTakenSection410TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponentStructuredBodyProcedureDescriptionSection412() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponentStructuredBodyProcedureDescriptionSection412TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponentStructuredBodyProcedureDescriptionSection412",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_DESCRIPTION_SECTION412__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyProcedureDescriptionSection412(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponentStructuredBodyProcedureDescriptionSection412TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponentStructuredBodyProcedureImplantsSection414() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponentStructuredBodyProcedureImplantsSection414TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponentStructuredBodyProcedureImplantsSection414",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_IMPLANTS_SECTION414__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyProcedureImplantsSection414(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponentStructuredBodyProcedureImplantsSection414TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponentStructuredBodyOperativeNoteFluidSection416() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponentStructuredBodyOperativeNoteFluidSection416TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponentStructuredBodyOperativeNoteFluidSection416",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_OPERATIVE_NOTE_FLUID_SECTION416__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyOperativeNoteFluidSection416(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponentStructuredBodyOperativeNoteFluidSection416TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponentStructuredBodyOperativeNoteSurgicalProcedureSection418() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponentStructuredBodyOperativeNoteSurgicalProcedureSection418TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponentStructuredBodyOperativeNoteSurgicalProcedureSection418",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION418__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyOperativeNoteSurgicalProcedureSection418(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponentStructuredBodyOperativeNoteSurgicalProcedureSection418TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponentStructuredBodyPlanOfCareSection420() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponentStructuredBodyPlanOfCareSection420TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponentStructuredBodyPlanOfCareSection420",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PLAN_OF_CARE_SECTION420__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyPlanOfCareSection420(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponentStructuredBodyPlanOfCareSection420TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponentStructuredBodyPlannedProcedureSection422() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponentStructuredBodyPlannedProcedureSection422TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponentStructuredBodyPlannedProcedureSection422",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PLANNED_PROCEDURE_SECTION422__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyPlannedProcedureSection422(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponentStructuredBodyPlannedProcedureSection422TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponentStructuredBodyProcedureDispositionSection424() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponentStructuredBodyProcedureDispositionSection424TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponentStructuredBodyProcedureDispositionSection424",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_DISPOSITION_SECTION424__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyProcedureDispositionSection424(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponentStructuredBodyProcedureDispositionSection424TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponentStructuredBodyProcedureIndicationsSection426() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponentStructuredBodyProcedureIndicationsSection426TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponentStructuredBodyProcedureIndicationsSection426",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURE_INDICATIONS_SECTION426__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodyProcedureIndicationsSection426(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponentStructuredBodyProcedureIndicationsSection426TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponentStructuredBodySurgicalDrainsSection428() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponentStructuredBodySurgicalDrainsSection428TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponentStructuredBodySurgicalDrainsSection428",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY_SURGICAL_DRAINS_SECTION428__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponentStructuredBodySurgicalDrainsSection428(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponentStructuredBodySurgicalDrainsSection428TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNoteComponentStructuredBody397() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComponentStructuredBody397TestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComponentStructuredBody397",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE_COMPONENT_STRUCTURED_BODY397__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComponentStructuredBody397(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComponentStructuredBody397TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<OperativeNote> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<OperativeNote>(
			"validateGeneralHeaderConstraintsTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateGeneralHeaderConstraintsTemplateId(
					(OperativeNote) objectToTest, diagnostician, map);
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
		OperationsTestCase<OperativeNote> validateGeneralHeaderConstraintsCodeTestCase = new OperationsTestCase<OperativeNote>(
			"validateGeneralHeaderConstraintsCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected void setDependency(OperativeNote target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateGeneralHeaderConstraintsCode(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends OperativeNoteOperations {
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
	private static class ObjectFactory implements TestObjectFactory<OperativeNote> {
		@Override
		public OperativeNote create() {
			return ConsolFactory.eINSTANCE.createOperativeNote();
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
	private static class ConstructorTestClass extends OperativeNoteOperations {
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

} // OperativeNoteOperations
