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
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureActivityObservation2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Activity Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservation2CodeSuggestedCodeSystems(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation2 Code Suggested Code Systems</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservation2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservation2EntryRelationship1020(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation2 Entry Relationship1020</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservation2EntryRelationship1022(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation2 Entry Relationship1022</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservation2EntryRelationship1024(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation2 Entry Relationship1024</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservation2EntryRelationship1026(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation2 Entry Relationship1026</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservation2ANYNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation2 ANY Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservation2Instruction2EntryRelationshipInstruction21021(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation2 Instruction2 Entry Relationship Instruction21021</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservation2Indication2EntryRelationshipIndication21023(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation2 Indication2 Entry Relationship Indication21023</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservation2MedicationActivity2EntryRelationshipMedicationActivity21025(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation2 Medication Activity2 Entry Relationship Medication Activity21025</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservation2ReactionObservation2EntryRelationshipReactionObservation21027(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation2 Reaction Observation2 Entry Relationship Reaction Observation21027</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationInstructionsInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Instructions Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationCodeCodeSystems(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Code Code Systems</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2#validateProcedureActivityObservationProcedureObservationPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Assigned Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureActivityObservation2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservation2CodeSuggestedCodeSystems() {
		OperationsTestCase<ProcedureActivityObservation2> validateProcedureActivityObservation2CodeSuggestedCodeSystemsTestCase = new OperationsTestCase<ProcedureActivityObservation2>(
			"validateProcedureActivityObservation2CodeSuggestedCodeSystems",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_CODE_SUGGESTED_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservation2Operations.validateProcedureActivityObservation2CodeSuggestedCodeSystems(
					(ProcedureActivityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservation2CodeSuggestedCodeSystemsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationStatusCodeP() {
		OperationsTestCase<ProcedureActivityObservation2> validateProcedureActivityObservationStatusCodePTestCase = new OperationsTestCase<ProcedureActivityObservation2>(
			"validateProcedureActivityObservationStatusCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservation2Operations.validateProcedureActivityObservationStatusCodeP(
					(ProcedureActivityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservation2AuthorParticipation() {
		OperationsTestCase<ProcedureActivityObservation2> validateProcedureActivityObservation2AuthorParticipationTestCase = new OperationsTestCase<ProcedureActivityObservation2>(
			"validateProcedureActivityObservation2AuthorParticipation",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservation2Operations.validateProcedureActivityObservation2AuthorParticipation(
					(ProcedureActivityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservation2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityObservation2EntryRelationship1020() {
		OperationsTestCase<ProcedureActivityObservation2> validateProcedureActivityObservation2EntryRelationship1020TestCase = new OperationsTestCase<ProcedureActivityObservation2>(
			"validateProcedureActivityObservation2EntryRelationship1020",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_ENTRY_RELATIONSHIP1020__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservation2Operations.validateProcedureActivityObservation2EntryRelationship1020(
					(ProcedureActivityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservation2EntryRelationship1020TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityObservation2EntryRelationship1022() {
		OperationsTestCase<ProcedureActivityObservation2> validateProcedureActivityObservation2EntryRelationship1022TestCase = new OperationsTestCase<ProcedureActivityObservation2>(
			"validateProcedureActivityObservation2EntryRelationship1022",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_ENTRY_RELATIONSHIP1022__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservation2Operations.validateProcedureActivityObservation2EntryRelationship1022(
					(ProcedureActivityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservation2EntryRelationship1022TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityObservation2EntryRelationship1024() {
		OperationsTestCase<ProcedureActivityObservation2> validateProcedureActivityObservation2EntryRelationship1024TestCase = new OperationsTestCase<ProcedureActivityObservation2>(
			"validateProcedureActivityObservation2EntryRelationship1024",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_ENTRY_RELATIONSHIP1024__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservation2Operations.validateProcedureActivityObservation2EntryRelationship1024(
					(ProcedureActivityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservation2EntryRelationship1024TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityObservation2EntryRelationship1026() {
		OperationsTestCase<ProcedureActivityObservation2> validateProcedureActivityObservation2EntryRelationship1026TestCase = new OperationsTestCase<ProcedureActivityObservation2>(
			"validateProcedureActivityObservation2EntryRelationship1026",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_ENTRY_RELATIONSHIP1026__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservation2Operations.validateProcedureActivityObservation2EntryRelationship1026(
					(ProcedureActivityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservation2EntryRelationship1026TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservation2ANYNullFlavor() {
		OperationsTestCase<ProcedureActivityObservation2> validateProcedureActivityObservation2ANYNullFlavorTestCase = new OperationsTestCase<ProcedureActivityObservation2>(
			"validateProcedureActivityObservation2ANYNullFlavor",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_ANY_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservation2Operations.validateProcedureActivityObservation2ANYNullFlavor(
					(ProcedureActivityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservation2ANYNullFlavorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityObservation2Instruction2EntryRelationshipInstruction21021() {
		OperationsTestCase<ProcedureActivityObservation2> validateProcedureActivityObservation2Instruction2EntryRelationshipInstruction21021TestCase = new OperationsTestCase<ProcedureActivityObservation2>(
			"validateProcedureActivityObservation2Instruction2EntryRelationshipInstruction21021",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION21021__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservation2Operations.validateProcedureActivityObservation2Instruction2EntryRelationshipInstruction21021(
					(ProcedureActivityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservation2Instruction2EntryRelationshipInstruction21021TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityObservation2Indication2EntryRelationshipIndication21023() {
		OperationsTestCase<ProcedureActivityObservation2> validateProcedureActivityObservation2Indication2EntryRelationshipIndication21023TestCase = new OperationsTestCase<ProcedureActivityObservation2>(
			"validateProcedureActivityObservation2Indication2EntryRelationshipIndication21023",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_INDICATION2_ENTRY_RELATIONSHIP_INDICATION21023__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservation2Operations.validateProcedureActivityObservation2Indication2EntryRelationshipIndication21023(
					(ProcedureActivityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservation2Indication2EntryRelationshipIndication21023TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityObservation2MedicationActivity2EntryRelationshipMedicationActivity21025() {
		OperationsTestCase<ProcedureActivityObservation2> validateProcedureActivityObservation2MedicationActivity2EntryRelationshipMedicationActivity21025TestCase = new OperationsTestCase<ProcedureActivityObservation2>(
			"validateProcedureActivityObservation2MedicationActivity2EntryRelationshipMedicationActivity21025",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_MEDICATION_ACTIVITY21025__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservation2Operations.validateProcedureActivityObservation2MedicationActivity2EntryRelationshipMedicationActivity21025(
					(ProcedureActivityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservation2MedicationActivity2EntryRelationshipMedicationActivity21025TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityObservation2ReactionObservation2EntryRelationshipReactionObservation21027() {
		OperationsTestCase<ProcedureActivityObservation2> validateProcedureActivityObservation2ReactionObservation2EntryRelationshipReactionObservation21027TestCase = new OperationsTestCase<ProcedureActivityObservation2>(
			"validateProcedureActivityObservation2ReactionObservation2EntryRelationshipReactionObservation21027",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION2_REACTION_OBSERVATION2_ENTRY_RELATIONSHIP_REACTION_OBSERVATION21027__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservation2Operations.validateProcedureActivityObservation2ReactionObservation2EntryRelationshipReactionObservation21027(
					(ProcedureActivityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservation2ReactionObservation2EntryRelationshipReactionObservation21027TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationInstructionsInversion() {
		OperationsTestCase<ProcedureActivityObservation2> validateProcedureActivityObservationInstructionsInversionTestCase = new OperationsTestCase<ProcedureActivityObservation2>(
			"validateProcedureActivityObservationInstructionsInversion",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservation2Operations.validateProcedureActivityObservationInstructionsInversion(
					(ProcedureActivityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationInstructionsInversionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationCodeCodeSystems() {
		OperationsTestCase<ProcedureActivityObservation2> validateProcedureActivityObservationCodeCodeSystemsTestCase = new OperationsTestCase<ProcedureActivityObservation2>(
			"validateProcedureActivityObservationCodeCodeSystems",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservation2Operations.validateProcedureActivityObservationCodeCodeSystems(
					(ProcedureActivityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationCodeCodeSystemsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationTemplateId() {
		OperationsTestCase<ProcedureActivityObservation2> validateProcedureActivityObservationTemplateIdTestCase = new OperationsTestCase<ProcedureActivityObservation2>(
			"validateProcedureActivityObservationTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservation2Operations.validateProcedureActivityObservationTemplateId(
					(ProcedureActivityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationTargetSiteCodeP() {
		OperationsTestCase<ProcedureActivityObservation2> validateProcedureActivityObservationTargetSiteCodePTestCase = new OperationsTestCase<ProcedureActivityObservation2>(
			"validateProcedureActivityObservationTargetSiteCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservation2Operations.validateProcedureActivityObservationTargetSiteCodeP(
					(ProcedureActivityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationTargetSiteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationTargetSiteCode() {
		OperationsTestCase<ProcedureActivityObservation2> validateProcedureActivityObservationTargetSiteCodeTestCase = new OperationsTestCase<ProcedureActivityObservation2>(
			"validateProcedureActivityObservationTargetSiteCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation2 target) {
				target.init();

			}

			@Override
			protected void setDependency(ProcedureActivityObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put(
					"org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservationTargetSiteCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservation2Operations.validateProcedureActivityObservationTargetSiteCode(
					(ProcedureActivityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationMoodCode() {
		OperationsTestCase<ProcedureActivityObservation2> validateProcedureActivityObservationMoodCodeTestCase = new OperationsTestCase<ProcedureActivityObservation2>(
			"validateProcedureActivityObservationMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservation2Operations.validateProcedureActivityObservationMoodCode(
					(ProcedureActivityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationStatusCode() {
		OperationsTestCase<ProcedureActivityObservation2> validateProcedureActivityObservationStatusCodeTestCase = new OperationsTestCase<ProcedureActivityObservation2>(
			"validateProcedureActivityObservationStatusCode", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(ProcedureActivityObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservationStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservation2Operations.validateProcedureActivityObservationStatusCode(
					(ProcedureActivityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationValue() {
		OperationsTestCase<ProcedureActivityObservation2> validateProcedureActivityObservationValueTestCase = new OperationsTestCase<ProcedureActivityObservation2>(
			"validateProcedureActivityObservationValue", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservation2Operations.validateProcedureActivityObservationValue(
					(ProcedureActivityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationPerformer() {
		OperationsTestCase<ProcedureActivityObservation2> validateProcedureActivityObservationPerformerTestCase = new OperationsTestCase<ProcedureActivityObservation2>(
			"validateProcedureActivityObservationPerformer", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservation2Operations.validateProcedureActivityObservationPerformer(
					(ProcedureActivityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddr() {
		OperationsTestCase<ProcedureActivityObservation2> validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddrTestCase = new OperationsTestCase<ProcedureActivityObservation2>(
			"validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddr",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservation2Operations.validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddr(
					(ProcedureActivityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecom() {
		OperationsTestCase<ProcedureActivityObservation2> validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecomTestCase = new OperationsTestCase<ProcedureActivityObservation2>(
			"validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecom",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservation2Operations.validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecom(
					(ProcedureActivityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationProcedureObservationPerformerAssignedEntity() {
		OperationsTestCase<ProcedureActivityObservation2> validateProcedureActivityObservationProcedureObservationPerformerAssignedEntityTestCase = new OperationsTestCase<ProcedureActivityObservation2>(
			"validateProcedureActivityObservationProcedureObservationPerformerAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservation2Operations.validateProcedureActivityObservationProcedureObservationPerformerAssignedEntity(
					(ProcedureActivityObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationProcedureObservationPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureActivityObservation2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureActivityObservation2> {
		@Override
		public ProcedureActivityObservation2 create() {
			return ConsolFactory.eINSTANCE.createProcedureActivityObservation2();
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
	private static class ConstructorTestClass extends ProcedureActivityObservation2Operations {
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

} // ProcedureActivityObservation2Operations
