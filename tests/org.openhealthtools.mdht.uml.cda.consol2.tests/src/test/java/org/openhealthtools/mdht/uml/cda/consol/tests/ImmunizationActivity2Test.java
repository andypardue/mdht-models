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
import org.junit.Ignore;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ImmunizationActivity2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunization Activity2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2EntryRelationshipForSubAdminAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Entry Relationship For Sub Admin Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2EntryRelationship926(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Entry Relationship926</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2EntryRelationship928(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Entry Relationship928</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2EntryRelationship930(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Entry Relationship930</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2EntryRelationship932(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Entry Relationship932</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2EntryRelationship934(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Entry Relationship934</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2EntryRelationshipTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Entry Relationship Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2EntryRelationshipInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Entry Relationship Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2EntryRelationshipSequenceNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Entry Relationship Sequence Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2EntryRelationshipSubstanceAdministeredAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Entry Relationship Substance Administered Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2Indication2EntryRelationshipIndication2927(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Indication2 Entry Relationship Indication2927</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2Instruction2EntryRelationshipInstruction2929(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Instruction2 Entry Relationship Instruction2929</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2MedicationSupplyOrder2EntryRelationshipMedicationSupplyOrder2931(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Medication Supply Order2 Entry Relationship Medication Supply Order2931</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2MedicationDispense2EntryRelationshipMedicationDispense2933(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Medication Dispense2 Entry Relationship Medication Dispense2933</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivity2ReactionObservation2EntryRelationshipReactionObservation2935(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity2 Reaction Observation2 Entry Relationship Reaction Observation2935</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityInstructionInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Instruction Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityAdministrationUnitCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Administration Unit Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityAdministrationUnitCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Administration Unit Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityDrugVehicle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Drug Vehicle</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityConsumable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Consumable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityPrecondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Precondition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityConsumableImmunizationMedicationInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Consumable Immunization Medication Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityPreconditionTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Precondition Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2#validateImmunizationActivityPreconditionPreconditionForSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Precondition Precondition For Substance Administration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ImmunizationActivity2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityStatusCodeP() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityStatusCodePTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityStatusCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityStatusCodeP(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivity2AuthorParticipation() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivity2AuthorParticipationTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivity2AuthorParticipation",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivity2AuthorParticipation(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivity2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivity2EntryRelationshipForSubAdminAct() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivity2EntryRelationshipForSubAdminActTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivity2EntryRelationshipForSubAdminAct",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY2_ENTRY_RELATIONSHIP_FOR_SUB_ADMIN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivity2EntryRelationshipForSubAdminAct(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivity2EntryRelationshipForSubAdminActTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateImmunizationActivity2EntryRelationship926() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivity2EntryRelationship926TestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivity2EntryRelationship926",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY2_ENTRY_RELATIONSHIP926__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivity2EntryRelationship926(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivity2EntryRelationship926TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateImmunizationActivity2EntryRelationship928() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivity2EntryRelationship928TestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivity2EntryRelationship928",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY2_ENTRY_RELATIONSHIP928__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivity2EntryRelationship928(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivity2EntryRelationship928TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateImmunizationActivity2EntryRelationship930() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivity2EntryRelationship930TestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivity2EntryRelationship930",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY2_ENTRY_RELATIONSHIP930__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivity2EntryRelationship930(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivity2EntryRelationship930TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateImmunizationActivity2EntryRelationship932() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivity2EntryRelationship932TestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivity2EntryRelationship932",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY2_ENTRY_RELATIONSHIP932__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivity2EntryRelationship932(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivity2EntryRelationship932TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateImmunizationActivity2EntryRelationship934() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivity2EntryRelationship934TestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivity2EntryRelationship934",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY2_ENTRY_RELATIONSHIP934__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivity2EntryRelationship934(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivity2EntryRelationship934TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivity2EntryRelationshipTypeCode() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivity2EntryRelationshipTypeCodeTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivity2EntryRelationshipTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY2_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivity2EntryRelationshipTypeCode(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivity2EntryRelationshipTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivity2EntryRelationshipInversionInd() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivity2EntryRelationshipInversionIndTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivity2EntryRelationshipInversionInd",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY2_ENTRY_RELATIONSHIP_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivity2EntryRelationshipInversionInd(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivity2EntryRelationshipInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivity2EntryRelationshipSequenceNumber() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivity2EntryRelationshipSequenceNumberTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivity2EntryRelationshipSequenceNumber",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY2_ENTRY_RELATIONSHIP_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivity2EntryRelationshipSequenceNumber(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivity2EntryRelationshipSequenceNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivity2EntryRelationshipSubstanceAdministeredAct() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivity2EntryRelationshipSubstanceAdministeredActTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivity2EntryRelationshipSubstanceAdministeredAct",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY2_ENTRY_RELATIONSHIP_SUBSTANCE_ADMINISTERED_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivity2EntryRelationshipSubstanceAdministeredAct(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivity2EntryRelationshipSubstanceAdministeredActTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateImmunizationActivity2Indication2EntryRelationshipIndication2927() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivity2Indication2EntryRelationshipIndication2927TestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivity2Indication2EntryRelationshipIndication2927",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY2_INDICATION2_ENTRY_RELATIONSHIP_INDICATION2927__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivity2Indication2EntryRelationshipIndication2927(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivity2Indication2EntryRelationshipIndication2927TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateImmunizationActivity2Instruction2EntryRelationshipInstruction2929() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivity2Instruction2EntryRelationshipInstruction2929TestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivity2Instruction2EntryRelationshipInstruction2929",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY2_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION2929__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivity2Instruction2EntryRelationshipInstruction2929(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivity2Instruction2EntryRelationshipInstruction2929TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateImmunizationActivity2MedicationSupplyOrder2EntryRelationshipMedicationSupplyOrder2931() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivity2MedicationSupplyOrder2EntryRelationshipMedicationSupplyOrder2931TestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivity2MedicationSupplyOrder2EntryRelationshipMedicationSupplyOrder2931",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY2_MEDICATION_SUPPLY_ORDER2_ENTRY_RELATIONSHIP_MEDICATION_SUPPLY_ORDER2931__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivity2MedicationSupplyOrder2EntryRelationshipMedicationSupplyOrder2931(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivity2MedicationSupplyOrder2EntryRelationshipMedicationSupplyOrder2931TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateImmunizationActivity2MedicationDispense2EntryRelationshipMedicationDispense2933() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivity2MedicationDispense2EntryRelationshipMedicationDispense2933TestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivity2MedicationDispense2EntryRelationshipMedicationDispense2933",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY2_MEDICATION_DISPENSE2_ENTRY_RELATIONSHIP_MEDICATION_DISPENSE2933__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivity2MedicationDispense2EntryRelationshipMedicationDispense2933(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivity2MedicationDispense2EntryRelationshipMedicationDispense2933TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateImmunizationActivity2ReactionObservation2EntryRelationshipReactionObservation2935() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivity2ReactionObservation2EntryRelationshipReactionObservation2935TestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivity2ReactionObservation2EntryRelationshipReactionObservation2935",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY2_REACTION_OBSERVATION2_ENTRY_RELATIONSHIP_REACTION_OBSERVATION2935__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivity2ReactionObservation2EntryRelationshipReactionObservation2935(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivity2ReactionObservation2EntryRelationshipReactionObservation2935TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Test
	@Ignore
	public void testValidateImmunizationActivityTextReference() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityTextReferenceTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityTextReference", operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityTextReference(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Test
	@Ignore
	public void testValidateImmunizationActivityReferenceValue() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityReferenceValueTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityReferenceValue", operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

				// CD value = DatatypesFactory.eINSTANCE.createCD();
				// target.getValues().add(value);
				//

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityReferenceValue(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Test
	@Ignore
	public void testValidateImmunizationActivityTextReferenceValue() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityTextReferenceValueTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityTextReferenceValue", operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

				// CD value = DatatypesFactory.eINSTANCE.createCD();
				// target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityTextReferenceValue(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityInstructionInversion() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityInstructionInversionTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityInstructionInversion",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_INSTRUCTION_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityInstructionInversion(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityInstructionInversionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityTemplateId() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityTemplateIdTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityTemplateId(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityCode() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityCodeTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityCode(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityStatusCode() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityStatusCodeTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(ImmunizationActivity2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivityStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityStatusCode(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityRepeatNumber() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityRepeatNumberTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityRepeatNumber", operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityRepeatNumber(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityRepeatNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityAdministrationUnitCodeP() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityAdministrationUnitCodePTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityAdministrationUnitCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityAdministrationUnitCodeP(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityAdministrationUnitCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityAdministrationUnitCode() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityAdministrationUnitCodeTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityAdministrationUnitCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

			}

			@Override
			protected void setDependency(ImmunizationActivity2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put(
					"org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivityAdministrationUnitCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityAdministrationUnitCode(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityAdministrationUnitCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	* This attribute is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Test
	@Ignore
	public void testValidateImmunizationActivityText() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityTextTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityText",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityText(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityDrugVehicle() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityDrugVehicleTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityDrugVehicle",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_DRUG_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityDrugVehicle(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityDrugVehicleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityConsumable() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityConsumableTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityConsumable",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityConsumable(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityConsumableTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityPrecondition() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityPreconditionTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityPrecondition",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityPrecondition(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityPreconditionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityConsumableImmunizationMedicationInformation() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityConsumableImmunizationMedicationInformationTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityConsumableImmunizationMedicationInformation",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_CONSUMABLE_IMMUNIZATION_MEDICATION_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityConsumableImmunizationMedicationInformation(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityConsumableImmunizationMedicationInformationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityPreconditionTypeCode() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityPreconditionTypeCodeTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityPreconditionTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityPreconditionTypeCode(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityPreconditionTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityPreconditionPreconditionForSubstanceAdministration() {
		OperationsTestCase<ImmunizationActivity2> validateImmunizationActivityPreconditionPreconditionForSubstanceAdministrationTestCase = new OperationsTestCase<ImmunizationActivity2>(
			"validateImmunizationActivityPreconditionPreconditionForSubstanceAdministration",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivity2Operations.validateImmunizationActivityPreconditionPreconditionForSubstanceAdministration(
					(ImmunizationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityPreconditionPreconditionForSubstanceAdministrationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ImmunizationActivity2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ImmunizationActivity2> {
		@Override
		public ImmunizationActivity2 create() {
			return ConsolFactory.eINSTANCE.createImmunizationActivity2();
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
	private static class ConstructorTestClass extends ImmunizationActivity2Operations {
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

} // ImmunizationActivity2Operations
