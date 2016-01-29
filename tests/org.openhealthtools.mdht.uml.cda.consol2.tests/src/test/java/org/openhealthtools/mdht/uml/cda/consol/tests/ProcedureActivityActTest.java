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
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureActivityActOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Activity Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActCodeOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Code Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActOriginalTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Original Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActOriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActCodeCodeSystems(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Code Code Systems</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActServiceDeliveryLocationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Service Delivery Location Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActEncounterInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Encounter Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActInstructionsInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Instructions Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActPriorityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Priority Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActPriorityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Priority Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActServiceDeliveryLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Service Delivery Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActEntryRelationship272(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Entry Relationship272</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActEntryRelationship274(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Entry Relationship274</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActEntryRelationship276(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Entry Relationship276</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Procedure Act Performer Procedure Act Assigned Entity Procedure Act Represented Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Procedure Act Performer Procedure Act Assigned Entity Procedure Act Represented Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Procedure Act Performer Procedure Act Assigned Entity Procedure Act Represented Organization Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Procedure Act Performer Procedure Act Assigned Entity Procedure Act Represented Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Procedure Act Performer Procedure Act Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Procedure Act Performer Procedure Act Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Procedure Act Performer Procedure Act Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Procedure Act Performer Procedure Act Assigned Entity Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActProcedureActPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Procedure Act Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActEntryRelationshipProcedureActEncounterClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Entry Relationship Procedure Act Encounter Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActEntryRelationshipProcedureActEncounterMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Entry Relationship Procedure Act Encounter Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActEntryRelationshipProcedureActEncounterId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Entry Relationship Procedure Act Encounter Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActEntryRelationshipInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Entry Relationship Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActEntryRelationshipTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Entry Relationship Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActEntryRelationshipProcedureActEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Entry Relationship Procedure Act Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActInstructionsEntryRelationshipInstructions273(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Instructions Entry Relationship Instructions273</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActIndicationEntryRelationshipIndication275(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Indication Entry Relationship Indication275</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActMedicationActivityEntryRelationshipMedicationActivity277(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Medication Activity Entry Relationship Medication Activity277</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureActivityActTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActCodeCodeSystems() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActCodeCodeSystemsTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActCodeCodeSystems", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActCodeCodeSystems(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActCodeCodeSystemsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActCodeOriginalText() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActCodeOriginalTextTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActCodeOriginalText", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActCodeOriginalText(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActCodeOriginalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActOriginalTextReference() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActOriginalTextReferenceTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActOriginalTextReference",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActOriginalTextReference(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActOriginalTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityActOriginalTextReferenceValue() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActOriginalTextReferenceValueTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActOriginalTextReferenceValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

				// CD value = DatatypesFactory.eINSTANCE.createCD();
				// target.getValues().add(value);
				//

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActOriginalTextReferenceValue(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActOriginalTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityActReferenceValue() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActReferenceValueTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActReferenceValue", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

				// CD value = DatatypesFactory.eINSTANCE.createCD();
				// target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActReferenceValue(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActEncounterInversion() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActEncounterInversionTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActEncounterInversion", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_ENCOUNTER_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActEncounterInversion(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActEncounterInversionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActServiceDeliveryLocationTypeCode() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActServiceDeliveryLocationTypeCodeTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActServiceDeliveryLocationTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_SERVICE_DELIVERY_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActServiceDeliveryLocationTypeCode(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActServiceDeliveryLocationTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActInstructionsInversion() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActInstructionsInversionTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActInstructionsInversion",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActInstructionsInversion(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
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
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActTemplateIdTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActTemplateId(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActClassCode() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActClassCodeTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActClassCode(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActMoodCode() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActMoodCodeTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActMoodCode(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActId() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActIdTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActId(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActCode() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActCodeTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActCode(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActStatusCode() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActStatusCodeTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActStatusCode(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
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
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActEffectiveTimeTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActEffectiveTime", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActEffectiveTime(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActPriorityCode() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActPriorityCodeTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActPriorityCode", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected void setDependency(ProcedureActivityAct target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityActPriorityCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActPriorityCode(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActPriorityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActPriorityCodeP() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActPriorityCodePTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActPriorityCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActPriorityCodeP(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActPriorityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActPerformer() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActPerformerTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActPerformer",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActPerformer(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActServiceDeliveryLocation() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActServiceDeliveryLocationTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActServiceDeliveryLocation",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActServiceDeliveryLocation(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActServiceDeliveryLocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActEntryRelationship() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActEntryRelationshipTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActEntryRelationship", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActEntryRelationship(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActEntryRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityActEntryRelationship272() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActEntryRelationship272TestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActEntryRelationship272",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP272__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActEntryRelationship272(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActEntryRelationship272TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityActEntryRelationship274() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActEntryRelationship274TestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActEntryRelationship274",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP274__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActEntryRelationship274(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActEntryRelationship274TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityActEntryRelationship276() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActEntryRelationship276TestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActEntryRelationship276",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP276__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActEntryRelationship276(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActEntryRelationship276TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationId() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationIdTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ACT_PERFORMER_PROCEDURE_ACT_ASSIGNED_ENTITY_PROCEDURE_ACT_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationId(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationName() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationNameTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationName",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ACT_PERFORMER_PROCEDURE_ACT_ASSIGNED_ENTITY_PROCEDURE_ACT_REPRESENTED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationName(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationTelecom() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationTelecomTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationTelecom",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ACT_PERFORMER_PROCEDURE_ACT_ASSIGNED_ENTITY_PROCEDURE_ACT_REPRESENTED_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationTelecom(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
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
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationAddrTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationAddr",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ACT_PERFORMER_PROCEDURE_ACT_ASSIGNED_ENTITY_PROCEDURE_ACT_REPRESENTED_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationAddr(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityId() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityIdTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ACT_PERFORMER_PROCEDURE_ACT_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityId(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityAddr() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityAddrTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityAddr",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ACT_PERFORMER_PROCEDURE_ACT_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityAddr(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityTelecom() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityTelecomTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityTelecom",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ACT_PERFORMER_PROCEDURE_ACT_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityTelecom(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
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
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityRepresentedOrganizationTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityRepresentedOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ACT_PERFORMER_PROCEDURE_ACT_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityRepresentedOrganization(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
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
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActProcedureActPerformerAssignedEntityTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActProcedureActPerformerAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ACT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActProcedureActPerformerAssignedEntity(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActProcedureActPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActEntryRelationshipProcedureActEncounterClassCode() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActEntryRelationshipProcedureActEncounterClassCodeTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActEntryRelationshipProcedureActEncounterClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_PROCEDURE_ACT_ENCOUNTER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActEntryRelationshipProcedureActEncounterClassCode(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActEntryRelationshipProcedureActEncounterClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActEntryRelationshipProcedureActEncounterMoodCode() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActEntryRelationshipProcedureActEncounterMoodCodeTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActEntryRelationshipProcedureActEncounterMoodCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_PROCEDURE_ACT_ENCOUNTER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActEntryRelationshipProcedureActEncounterMoodCode(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActEntryRelationshipProcedureActEncounterMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActEntryRelationshipProcedureActEncounterId() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActEntryRelationshipProcedureActEncounterIdTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActEntryRelationshipProcedureActEncounterId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_PROCEDURE_ACT_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActEntryRelationshipProcedureActEncounterId(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActEntryRelationshipProcedureActEncounterIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActEntryRelationshipInversionInd() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActEntryRelationshipInversionIndTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActEntryRelationshipInversionInd",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActEntryRelationshipInversionInd(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActEntryRelationshipInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActEntryRelationshipTypeCode() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActEntryRelationshipTypeCodeTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActEntryRelationshipTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActEntryRelationshipTypeCode(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActEntryRelationshipTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActEntryRelationshipProcedureActEncounter() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActEntryRelationshipProcedureActEncounterTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActEntryRelationshipProcedureActEncounter",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_PROCEDURE_ACT_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActEntryRelationshipProcedureActEncounter(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActEntryRelationshipProcedureActEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityActInstructionsEntryRelationshipInstructions273() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActInstructionsEntryRelationshipInstructions273TestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActInstructionsEntryRelationshipInstructions273",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_INSTRUCTIONS_ENTRY_RELATIONSHIP_INSTRUCTIONS273__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActInstructionsEntryRelationshipInstructions273(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActInstructionsEntryRelationshipInstructions273TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityActIndicationEntryRelationshipIndication275() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActIndicationEntryRelationshipIndication275TestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActIndicationEntryRelationshipIndication275",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_INDICATION_ENTRY_RELATIONSHIP_INDICATION275__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActIndicationEntryRelationshipIndication275(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActIndicationEntryRelationshipIndication275TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityActMedicationActivityEntryRelationshipMedicationActivity277() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActMedicationActivityEntryRelationshipMedicationActivity277TestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActMedicationActivityEntryRelationshipMedicationActivity277",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_ACT_MEDICATION_ACTIVITY_ENTRY_RELATIONSHIP_MEDICATION_ACTIVITY277__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActMedicationActivityEntryRelationshipMedicationActivity277(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActMedicationActivityEntryRelationshipMedicationActivity277TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureActivityActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureActivityAct> {
		@Override
		public ProcedureActivityAct create() {
			return ConsolFactory.eINSTANCE.createProcedureActivityAct();
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
	private static class ConstructorTestClass extends ProcedureActivityActOperations {
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

} // ProcedureActivityActOperations
