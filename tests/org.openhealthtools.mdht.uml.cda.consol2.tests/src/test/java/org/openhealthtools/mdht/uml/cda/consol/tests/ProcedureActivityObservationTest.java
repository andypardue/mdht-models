/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     Dan Brown (Audacious Inquiry) - modified testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureActivityObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Activity Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationCodeCodeSystems(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Code Code Systems</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationCodeOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Code Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationOriginalTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Original Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationOriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationEncounterInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Encounter Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationServiceDeliveryLocationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Service Delivery Location Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationInstructionsInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Instructions Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationPriorityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Priority Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationPriorityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Priority Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationServiceDeliveryLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Service Delivery Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationEntryRelationship266(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship266</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationEntryRelationship268(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship268</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationEntryRelationship270(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship270</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Procedure Observation Represented Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Procedure Observation Represented Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Procedure Observation Represented Organization Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Procedure Observation Represented Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationProcedureObservationPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship Procedure Observation Encounter Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship Procedure Observation Encounter Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship Procedure Observation Encounter Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationEntryRelationshipInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationEntryRelationshipTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship Procedure Observation Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationInstructionsEntryRelationshipInstructions267(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Instructions Entry Relationship Instructions267</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationIndicationEntryRelationshipIndication269(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Indication Entry Relationship Indication269</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationMedicationActivityEntryRelationshipMedicationActivity271(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Medication Activity Entry Relationship Medication Activity271</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureActivityObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationCodeCodeSystems() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationCodeCodeSystemsTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationCodeCodeSystems",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationCodeCodeSystems(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationCodeCodeSystemsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationCodeOriginalText() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationCodeOriginalTextTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationCodeOriginalText",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationCodeOriginalText(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationCodeOriginalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationOriginalTextReference() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationOriginalTextReferenceTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationOriginalTextReference",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationOriginalTextReference(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationOriginalTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationOriginalTextReferenceValue() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationOriginalTextReferenceValueTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationOriginalTextReferenceValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationOriginalTextReferenceValue(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationOriginalTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationReferenceValue() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationReferenceValueTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationReferenceValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationReferenceValue(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationEncounterInversion() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationEncounterInversionTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationEncounterInversion",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENCOUNTER_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationEncounterInversion(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationEncounterInversionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationServiceDeliveryLocationTypeCode() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationServiceDeliveryLocationTypeCodeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationServiceDeliveryLocationTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_SERVICE_DELIVERY_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationServiceDeliveryLocationTypeCode(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationServiceDeliveryLocationTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationInstructionsInversion() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationInstructionsInversionTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationInstructionsInversion",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationInstructionsInversion(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationInstructionsInversionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationTemplateId() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationTemplateIdTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationTemplateId(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationClassCode() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationClassCodeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationClassCode(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationMoodCode() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationMoodCodeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationMoodCode(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationId() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationIdTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationId(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationCode() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationCodeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationCode", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationCode(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationStatusCode() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationStatusCodeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationStatusCode", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationStatusCode(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationValueTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationValue", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationValue(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationEffectiveTime() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationEffectiveTimeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationEffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationEffectiveTime(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationPriorityCode() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationPriorityCodeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationPriorityCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected void setDependency(ProcedureActivityObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservationPriorityCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationPriorityCode(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationPriorityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationPriorityCodeP() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationPriorityCodePTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationPriorityCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationPriorityCodeP(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationPriorityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationMethodCode() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationMethodCodeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationMethodCode", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationMethodCode(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationMethodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationTargetSiteCode() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationTargetSiteCodeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationTargetSiteCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected void setDependency(ProcedureActivityObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put(
					"org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservationTargetSiteCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationTargetSiteCode(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationTargetSiteCodeP() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationTargetSiteCodePTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationTargetSiteCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationTargetSiteCodeP(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationTargetSiteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationPerformer() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationPerformerTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationPerformer", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationPerformer(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationServiceDeliveryLocation() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationServiceDeliveryLocationTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationServiceDeliveryLocation",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationServiceDeliveryLocation(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationServiceDeliveryLocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationEntryRelationship() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationEntryRelationshipTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationEntryRelationship",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationEntryRelationship(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationEntryRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityObservationEntryRelationship266() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationEntryRelationship266TestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationEntryRelationship266",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP266__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationEntryRelationship266(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationEntryRelationship266TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityObservationEntryRelationship268() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationEntryRelationship268TestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationEntryRelationship268",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP268__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationEntryRelationship268(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationEntryRelationship268TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityObservationEntryRelationship270() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationEntryRelationship270TestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationEntryRelationship270",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP270__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationEntryRelationship270(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationEntryRelationship270TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationId() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationIdTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationId(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationName() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationNameTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationName",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationName(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationTelecom() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationTelecomTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationTelecom",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationTelecom(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationAddr() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationAddrTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationAddr",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationAddr(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityId() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityIdTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityId(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddr() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddrTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddr",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddr(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecomTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecom",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecom(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityRepresentedOrganization() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityRepresentedOrganizationTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityRepresentedOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityRepresentedOrganization(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityRepresentedOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationProcedureObservationPerformerAssignedEntity() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationProcedureObservationPerformerAssignedEntityTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationProcedureObservationPerformerAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationProcedureObservationPerformerAssignedEntity(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationProcedureObservationPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterClassCode() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterClassCodeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterClassCode(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterMoodCode() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterMoodCodeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterMoodCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterMoodCode(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterId() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterIdTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterId(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationEntryRelationshipInversionInd() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationEntryRelationshipInversionIndTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationEntryRelationshipInversionInd",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationEntryRelationshipInversionInd(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationEntryRelationshipInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationEntryRelationshipTypeCode() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationEntryRelationshipTypeCodeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationEntryRelationshipTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationEntryRelationshipTypeCode(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationEntryRelationshipTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationEntryRelationshipProcedureObservationEncounter() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounter",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounter(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityObservationInstructionsEntryRelationshipInstructions267() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationInstructionsEntryRelationshipInstructions267TestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationInstructionsEntryRelationshipInstructions267",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS_ENTRY_RELATIONSHIP_INSTRUCTIONS267__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationInstructionsEntryRelationshipInstructions267(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationInstructionsEntryRelationshipInstructions267TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityObservationIndicationEntryRelationshipIndication269() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationIndicationEntryRelationshipIndication269TestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationIndicationEntryRelationshipIndication269",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INDICATION_ENTRY_RELATIONSHIP_INDICATION269__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationIndicationEntryRelationshipIndication269(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationIndicationEntryRelationshipIndication269TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityObservationMedicationActivityEntryRelationshipMedicationActivity271() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationMedicationActivityEntryRelationshipMedicationActivity271TestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationMedicationActivityEntryRelationshipMedicationActivity271",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MEDICATION_ACTIVITY_ENTRY_RELATIONSHIP_MEDICATION_ACTIVITY271__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationMedicationActivityEntryRelationshipMedicationActivity271(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationMedicationActivityEntryRelationshipMedicationActivity271TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureActivityObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureActivityObservation> {
		@Override
		public ProcedureActivityObservation create() {
			return ConsolFactory.eINSTANCE.createProcedureActivityObservation();
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
	private static class ConstructorTestClass extends ProcedureActivityObservationOperations {
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

} // ProcedureActivityObservationOperations
