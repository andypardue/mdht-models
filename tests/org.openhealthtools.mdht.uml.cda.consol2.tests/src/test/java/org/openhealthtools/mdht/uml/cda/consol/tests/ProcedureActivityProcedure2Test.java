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
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureActivityProcedure2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Activity Procedure2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedure2CodeSuggestedCodeSystems(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure2 Code Suggested Code Systems</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedureStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedure2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedure2EntryRelationship1028(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure2 Entry Relationship1028</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedure2EntryRelationship1030(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure2 Entry Relationship1030</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedure2EntryRelationship1032(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure2 Entry Relationship1032</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedure2EntryRelationship1034(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure2 Entry Relationship1034</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedure2Instruction2EntryRelationshipInstruction21029(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure2 Instruction2 Entry Relationship Instruction21029</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedure2Indication2EntryRelationshipIndication21031(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure2 Indication2 Entry Relationship Indication21031</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedure2MedicationActivity2EntryRelationshipMedicationActivity21033(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure2 Medication Activity2 Entry Relationship Medication Activity21033</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedure2ReactionObservation2EntryRelationshipReactionObservation21035(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure2 Reaction Observation2 Entry Relationship Reaction Observation21035</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedureInstructionsInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Instructions Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedureCodeCodeSystems(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Code Code Systems</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedureServiceDeliveryLocationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Service Delivery Location Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedureTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedureTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedureMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedureStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedureSpecimen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Specimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedurePerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Procedure Activity Performer Procedure Activity Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Procedure Activity Performer Procedure Activity Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedureProcedureActivityPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Procedure Activity Performer Assigned Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureActivityProcedure2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedure2CodeSuggestedCodeSystems() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedure2CodeSuggestedCodeSystemsTestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedure2CodeSuggestedCodeSystems",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE2_CODE_SUGGESTED_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedure2CodeSuggestedCodeSystems(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedure2CodeSuggestedCodeSystemsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureStatusCodeP() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedureStatusCodePTestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedureStatusCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedureStatusCodeP(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedure2AuthorParticipation() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedure2AuthorParticipationTestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedure2AuthorParticipation",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedure2AuthorParticipation(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedure2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityProcedure2EntryRelationship1028() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedure2EntryRelationship1028TestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedure2EntryRelationship1028",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_RELATIONSHIP1028__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedure2EntryRelationship1028(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedure2EntryRelationship1028TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityProcedure2EntryRelationship1030() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedure2EntryRelationship1030TestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedure2EntryRelationship1030",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_RELATIONSHIP1030__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedure2EntryRelationship1030(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedure2EntryRelationship1030TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityProcedure2EntryRelationship1032() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedure2EntryRelationship1032TestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedure2EntryRelationship1032",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_RELATIONSHIP1032__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedure2EntryRelationship1032(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedure2EntryRelationship1032TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityProcedure2EntryRelationship1034() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedure2EntryRelationship1034TestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedure2EntryRelationship1034",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_RELATIONSHIP1034__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedure2EntryRelationship1034(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedure2EntryRelationship1034TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityProcedure2Instruction2EntryRelationshipInstruction21029() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedure2Instruction2EntryRelationshipInstruction21029TestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedure2Instruction2EntryRelationshipInstruction21029",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE2_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION21029__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedure2Instruction2EntryRelationshipInstruction21029(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedure2Instruction2EntryRelationshipInstruction21029TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityProcedure2Indication2EntryRelationshipIndication21031() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedure2Indication2EntryRelationshipIndication21031TestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedure2Indication2EntryRelationshipIndication21031",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE2_INDICATION2_ENTRY_RELATIONSHIP_INDICATION21031__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedure2Indication2EntryRelationshipIndication21031(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedure2Indication2EntryRelationshipIndication21031TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityProcedure2MedicationActivity2EntryRelationshipMedicationActivity21033() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedure2MedicationActivity2EntryRelationshipMedicationActivity21033TestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedure2MedicationActivity2EntryRelationshipMedicationActivity21033",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE2_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_MEDICATION_ACTIVITY21033__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedure2MedicationActivity2EntryRelationshipMedicationActivity21033(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedure2MedicationActivity2EntryRelationshipMedicationActivity21033TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityProcedure2ReactionObservation2EntryRelationshipReactionObservation21035() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedure2ReactionObservation2EntryRelationshipReactionObservation21035TestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedure2ReactionObservation2EntryRelationshipReactionObservation21035",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE2_REACTION_OBSERVATION2_ENTRY_RELATIONSHIP_REACTION_OBSERVATION21035__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedure2ReactionObservation2EntryRelationshipReactionObservation21035(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedure2ReactionObservation2EntryRelationshipReactionObservation21035TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureInstructionsInversion() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedureInstructionsInversionTestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedureInstructionsInversion",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedureInstructionsInversion(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureInstructionsInversionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureCodeCodeSystems() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedureCodeCodeSystemsTestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedureCodeCodeSystems",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_CODE_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedureCodeCodeSystems(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureCodeCodeSystemsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureServiceDeliveryLocationTypeCode() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedureServiceDeliveryLocationTypeCodeTestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedureServiceDeliveryLocationTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_SERVICE_DELIVERY_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedureServiceDeliveryLocationTypeCode(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureServiceDeliveryLocationTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureTemplateId() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedureTemplateIdTestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedureTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedureTemplateId(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureTargetSiteCodeP() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedureTargetSiteCodePTestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedureTargetSiteCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedureTargetSiteCodeP(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureTargetSiteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureTargetSiteCode() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedureTargetSiteCodeTestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedureTargetSiteCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.init();

			}

			@Override
			protected void setDependency(ProcedureActivityProcedure2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureTargetSiteCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedureTargetSiteCode(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureMoodCode() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedureMoodCodeTestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedureMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedureMoodCode(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureStatusCode() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedureStatusCodeTestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedureStatusCode", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(ProcedureActivityProcedure2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedureStatusCode(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureSpecimen() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedureSpecimenTestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedureSpecimen", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedureSpecimen(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureSpecimenTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedurePerformer() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedurePerformerTestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedurePerformer", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedurePerformer(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedurePerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityAddr() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityAddrTestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityAddr",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PROCEDURE_ACTIVITY_PERFORMER_PROCEDURE_ACTIVITY_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityAddr(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityTelecom() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityTelecomTestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityTelecom",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PROCEDURE_ACTIVITY_PERFORMER_PROCEDURE_ACTIVITY_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityTelecom(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureProcedureActivityPerformerAssignedEntity() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedureProcedureActivityPerformerAssignedEntityTestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedureProcedureActivityPerformerAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PROCEDURE_ACTIVITY_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedureProcedureActivityPerformerAssignedEntity(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureProcedureActivityPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureActivityProcedure2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureActivityProcedure2> {
		@Override
		public ProcedureActivityProcedure2 create() {
			return ConsolFactory.eINSTANCE.createProcedureActivityProcedure2();
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
	private static class ConstructorTestClass extends ProcedureActivityProcedure2Operations {
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

} // ProcedureActivityProcedure2Operations
