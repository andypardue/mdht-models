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
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureActivityAct2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Activity Act2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityAct2CodeSuggestedCodeSystems(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act2 Code Suggested Code Systems</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityActStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityAct2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityAct2EntryRelationship1014(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act2 Entry Relationship1014</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityAct2EntryRelationship1016(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act2 Entry Relationship1016</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityAct2EntryRelationship1018(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act2 Entry Relationship1018</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityAct2Instruction2EntryRelationshipInstruction21015(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act2 Instruction2 Entry Relationship Instruction21015</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityAct2Indication2EntryRelationshipIndication21017(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act2 Indication2 Entry Relationship Indication21017</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityAct2MedicationActivity2EntryRelationshipMedicationActivity21019(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act2 Medication Activity2 Entry Relationship Medication Activity21019</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityActInstructionsInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Instructions Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityActPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Procedure Act Performer Procedure Act Assigned Entity Procedure Act Represented Organization Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Procedure Act Performer Procedure Act Assigned Entity Procedure Act Represented Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Procedure Act Performer Procedure Act Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Procedure Act Performer Procedure Act Assigned Entity Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2#validateProcedureActivityActProcedureActPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Procedure Act Performer Assigned Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureActivityAct2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityAct2CodeSuggestedCodeSystems() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityAct2CodeSuggestedCodeSystemsTestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityAct2CodeSuggestedCodeSystems",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT2_CODE_SUGGESTED_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityAct2CodeSuggestedCodeSystems(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityAct2CodeSuggestedCodeSystemsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActStatusCodeP() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityActStatusCodePTestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityActStatusCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityActStatusCodeP(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityAct2AuthorParticipation() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityAct2AuthorParticipationTestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityAct2AuthorParticipation",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityAct2AuthorParticipation(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityAct2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityAct2EntryRelationship1014() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityAct2EntryRelationship1014TestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityAct2EntryRelationship1014",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT2_ENTRY_RELATIONSHIP1014__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityAct2EntryRelationship1014(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityAct2EntryRelationship1014TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityAct2EntryRelationship1016() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityAct2EntryRelationship1016TestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityAct2EntryRelationship1016",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT2_ENTRY_RELATIONSHIP1016__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityAct2EntryRelationship1016(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityAct2EntryRelationship1016TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityAct2EntryRelationship1018() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityAct2EntryRelationship1018TestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityAct2EntryRelationship1018",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT2_ENTRY_RELATIONSHIP1018__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityAct2EntryRelationship1018(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityAct2EntryRelationship1018TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityAct2Instruction2EntryRelationshipInstruction21015() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityAct2Instruction2EntryRelationshipInstruction21015TestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityAct2Instruction2EntryRelationshipInstruction21015",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT2_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION21015__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityAct2Instruction2EntryRelationshipInstruction21015(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityAct2Instruction2EntryRelationshipInstruction21015TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityAct2Indication2EntryRelationshipIndication21017() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityAct2Indication2EntryRelationshipIndication21017TestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityAct2Indication2EntryRelationshipIndication21017",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT2_INDICATION2_ENTRY_RELATIONSHIP_INDICATION21017__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityAct2Indication2EntryRelationshipIndication21017(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityAct2Indication2EntryRelationshipIndication21017TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityAct2MedicationActivity2EntryRelationshipMedicationActivity21019() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityAct2MedicationActivity2EntryRelationshipMedicationActivity21019TestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityAct2MedicationActivity2EntryRelationshipMedicationActivity21019",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT2_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_MEDICATION_ACTIVITY21019__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityAct2MedicationActivity2EntryRelationshipMedicationActivity21019(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityAct2MedicationActivity2EntryRelationshipMedicationActivity21019TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActInstructionsInversion() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityActInstructionsInversionTestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityActInstructionsInversion",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityActInstructionsInversion(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActInstructionsInversionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActTemplateId() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityActTemplateIdTestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityActTemplateId(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActMoodCode() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityActMoodCodeTestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityActMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityActMoodCode(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActStatusCode() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityActStatusCodeTestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityActStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(ProcedureActivityAct2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityActStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityActStatusCode(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActEffectiveTime() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityActEffectiveTimeTestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityActEffectiveTime", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityActEffectiveTime(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActPerformer() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityActPerformerTestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityActPerformer",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityActPerformer(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationTelecom() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationTelecomTestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationTelecom",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ACT_PERFORMER_PROCEDURE_ACT_ASSIGNED_ENTITY_PROCEDURE_ACT_REPRESENTED_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationTelecom(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationAddr() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationAddrTestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationAddr",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ACT_PERFORMER_PROCEDURE_ACT_ASSIGNED_ENTITY_PROCEDURE_ACT_REPRESENTED_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationAddr(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityTelecom() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityTelecomTestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityTelecom",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ACT_PERFORMER_PROCEDURE_ACT_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityTelecom(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityRepresentedOrganization() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityRepresentedOrganizationTestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityRepresentedOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ACT_PERFORMER_PROCEDURE_ACT_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityRepresentedOrganization(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityRepresentedOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActProcedureActPerformerAssignedEntity() {
		OperationsTestCase<ProcedureActivityAct2> validateProcedureActivityActProcedureActPerformerAssignedEntityTestCase = new OperationsTestCase<ProcedureActivityAct2>(
			"validateProcedureActivityActProcedureActPerformerAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ACT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityAct2Operations.validateProcedureActivityActProcedureActPerformerAssignedEntity(
					(ProcedureActivityAct2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActProcedureActPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureActivityAct2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureActivityAct2> {
		@Override
		public ProcedureActivityAct2 create() {
			return ConsolFactory.eINSTANCE.createProcedureActivityAct2();
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
	private static class ConstructorTestClass extends ProcedureActivityAct2Operations {
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

} // ProcedureActivityAct2Operations
