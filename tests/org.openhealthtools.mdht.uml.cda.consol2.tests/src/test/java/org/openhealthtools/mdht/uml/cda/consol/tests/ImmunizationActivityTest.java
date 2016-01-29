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
 *     								 - additional code as per Errata 506
 *******************************************************************************/

package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity;
import org.openhealthtools.mdht.uml.cda.consol.operations.ImmunizationActivityOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunization Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityDoseQuantityUnit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Dose Quantity Unit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityInstructionInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Instruction Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityDrugVehicleTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Drug Vehicle Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityRouteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Route Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityApproachSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Approach Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityAdministrationUnitCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Administration Unit Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityAdministrationUnitCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Administration Unit Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityDrugVehicle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Drug Vehicle</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityConsumable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Consumable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityPrecondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Precondition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityEntryRelationship118(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Entry Relationship118</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityEntryRelationship120(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Entry Relationship120</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityEntryRelationship122(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Entry Relationship122</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityEntryRelationship124(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Entry Relationship124</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityEntryRelationship126(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Entry Relationship126</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityEntryRelationship128(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Entry Relationship128</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityConsumableImmunizationMedicationInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Consumable Immunization Medication Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityPreconditionTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Precondition Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityPreconditionPreconditionForSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Precondition Precondition For Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityIndicationEntryRelationshipIndication119(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Indication Entry Relationship Indication119</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityInstructionsEntryRelationshipInstructions121(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Instructions Entry Relationship Instructions121</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityMedicationDispenseEntryRelationshipMedicationDispense123(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Medication Dispense Entry Relationship Medication Dispense123</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityReactionObservationEntryRelationshipReactionObservation125(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Reaction Observation Entry Relationship Reaction Observation125</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityImmunizationRefusalReasonEntryRelationshipImmunizationRefusalReason127(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Immunization Refusal Reason Entry Relationship Immunization Refusal Reason127</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityMedicationSupplyOrderEntryRelationshipMedicationSupplyOrder129(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Medication Supply Order Entry Relationship Medication Supply Order129</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ImmunizationActivityTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityTextReference() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityTextReferenceTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityTextReference", operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityTextReference(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationActivityReferenceValue() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityReferenceValueTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityReferenceValue", operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

				// CD value = DatatypesFactory.eINSTANCE.createCD();
				// target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityReferenceValue(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationActivityTextReferenceValue() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityTextReferenceValueTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityTextReferenceValue", operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

				// CD value = DatatypesFactory.eINSTANCE.createCD();
				// target.getValues().add(value);
				//

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityTextReferenceValue(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityDoseQuantityUnit() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityDoseQuantityUnitTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityDoseQuantityUnit", operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_DOSE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityDoseQuantityUnit(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityDoseQuantityUnitTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityInstructionInversion() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityInstructionInversionTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityInstructionInversion",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_INSTRUCTION_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityInstructionInversion(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityInstructionInversionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityDrugVehicleTypeCode() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityDrugVehicleTypeCodeTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityDrugVehicleTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_DRUG_VEHICLE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityDrugVehicleTypeCode(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityDrugVehicleTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityPreconditionTypeCode() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityPreconditionTypeCodeTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityPreconditionTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityPreconditionTypeCode(
					(ImmunizationActivity) objectToTest, diagnostician, map);
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
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityPreconditionPreconditionForSubstanceAdministrationTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityPreconditionPreconditionForSubstanceAdministration",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityPreconditionPreconditionForSubstanceAdministration(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityPreconditionPreconditionForSubstanceAdministrationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateImmunizationActivityIndicationEntryRelationshipIndication119() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityIndicationEntryRelationshipIndication119TestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityIndicationEntryRelationshipIndication119",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_INDICATION_ENTRY_RELATIONSHIP_INDICATION119__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityIndicationEntryRelationshipIndication119(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityIndicationEntryRelationshipIndication119TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateImmunizationActivityInstructionsEntryRelationshipInstructions121() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityInstructionsEntryRelationshipInstructions121TestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityInstructionsEntryRelationshipInstructions121",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_INSTRUCTIONS_ENTRY_RELATIONSHIP_INSTRUCTIONS121__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityInstructionsEntryRelationshipInstructions121(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityInstructionsEntryRelationshipInstructions121TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateImmunizationActivityMedicationDispenseEntryRelationshipMedicationDispense123() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityMedicationDispenseEntryRelationshipMedicationDispense123TestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityMedicationDispenseEntryRelationshipMedicationDispense123",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_MEDICATION_DISPENSE_ENTRY_RELATIONSHIP_MEDICATION_DISPENSE123__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityMedicationDispenseEntryRelationshipMedicationDispense123(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityMedicationDispenseEntryRelationshipMedicationDispense123TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateImmunizationActivityReactionObservationEntryRelationshipReactionObservation125() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityReactionObservationEntryRelationshipReactionObservation125TestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityReactionObservationEntryRelationshipReactionObservation125",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_REACTION_OBSERVATION_ENTRY_RELATIONSHIP_REACTION_OBSERVATION125__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityReactionObservationEntryRelationshipReactionObservation125(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityReactionObservationEntryRelationshipReactionObservation125TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateImmunizationActivityImmunizationRefusalReasonEntryRelationshipImmunizationRefusalReason127() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityImmunizationRefusalReasonEntryRelationshipImmunizationRefusalReason127TestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityImmunizationRefusalReasonEntryRelationshipImmunizationRefusalReason127",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_IMMUNIZATION_REFUSAL_REASON_ENTRY_RELATIONSHIP_IMMUNIZATION_REFUSAL_REASON127__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityImmunizationRefusalReasonEntryRelationshipImmunizationRefusalReason127(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityImmunizationRefusalReasonEntryRelationshipImmunizationRefusalReason127TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateImmunizationActivityMedicationSupplyOrderEntryRelationshipMedicationSupplyOrder129() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityMedicationSupplyOrderEntryRelationshipMedicationSupplyOrder129TestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityMedicationSupplyOrderEntryRelationshipMedicationSupplyOrder129",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_MEDICATION_SUPPLY_ORDER_ENTRY_RELATIONSHIP_MEDICATION_SUPPLY_ORDER129__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityMedicationSupplyOrderEntryRelationshipMedicationSupplyOrder129(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityMedicationSupplyOrderEntryRelationshipMedicationSupplyOrder129TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityTemplateId() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityTemplateIdTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityTemplateId(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*
	*/
	@Test
	public void testValidateImmunizationActivityClassCode() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityClassCodeTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityClassCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityClassCode(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityMoodCode() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityMoodCodeTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityMoodCode(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityId() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityIdTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityId",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityId(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityCode() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityCodeTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityCode(
					(ImmunizationActivity) objectToTest, diagnostician, map);
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
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityStatusCodeTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityStatusCode(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationActivityEffectiveTime() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityEffectiveTimeTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityEffectiveTime", operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

				// IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
				// target.setEffectiveTime(ts );
				//

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityEffectiveTime(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityRouteCode() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityRouteCodeTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityRouteCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected void setDependency(ImmunizationActivity target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivityRouteCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityRouteCode(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityRouteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityRouteCodeP() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityRouteCodePTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityRouteCodeP",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityRouteCodeP(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityRouteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityApproachSiteCode() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityApproachSiteCodeTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityApproachSiteCode", operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityApproachSiteCode(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityApproachSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityApproachSiteCodeP() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityApproachSiteCodePTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityApproachSiteCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityApproachSiteCodeP(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityApproachSiteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityDoseQuantity() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityDoseQuantityTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityDoseQuantity", operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityDoseQuantity(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityDoseQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityNegationInd() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityNegationIndTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityNegationInd",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityNegationInd(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityNegationIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityText() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityTextTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityText",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityText(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityRepeatNumber() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityRepeatNumberTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityRepeatNumber", operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityRepeatNumber(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityRepeatNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityAdministrationUnitCode() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityAdministrationUnitCodeTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityAdministrationUnitCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected void setDependency(ImmunizationActivity target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put(
					"org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivityAdministrationUnitCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityAdministrationUnitCode(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityAdministrationUnitCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityAdministrationUnitCodeP() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityAdministrationUnitCodePTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityAdministrationUnitCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityAdministrationUnitCodeP(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityAdministrationUnitCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityDrugVehicle() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityDrugVehicleTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityDrugVehicle",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_DRUG_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityDrugVehicle(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityDrugVehicleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityPrecondition() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityPreconditionTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityPrecondition",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityPrecondition(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityPreconditionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateImmunizationActivityEntryRelationship118() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityEntryRelationship118TestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityEntryRelationship118",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_ENTRY_RELATIONSHIP118__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityEntryRelationship118(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityEntryRelationship118TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateImmunizationActivityEntryRelationship120() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityEntryRelationship120TestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityEntryRelationship120",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_ENTRY_RELATIONSHIP120__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityEntryRelationship120(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityEntryRelationship120TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateImmunizationActivityEntryRelationship122() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityEntryRelationship122TestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityEntryRelationship122",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_ENTRY_RELATIONSHIP122__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityEntryRelationship122(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityEntryRelationship122TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateImmunizationActivityEntryRelationship124() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityEntryRelationship124TestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityEntryRelationship124",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_ENTRY_RELATIONSHIP124__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityEntryRelationship124(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityEntryRelationship124TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateImmunizationActivityEntryRelationship126() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityEntryRelationship126TestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityEntryRelationship126",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_ENTRY_RELATIONSHIP126__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityEntryRelationship126(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityEntryRelationship126TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateImmunizationActivityEntryRelationship128() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityEntryRelationship128TestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityEntryRelationship128",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_ENTRY_RELATIONSHIP128__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityEntryRelationship128(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityEntryRelationship128TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityConsumable() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityConsumableTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityConsumable",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityConsumable(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityConsumableTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityPerformer() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityPerformerTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityPerformer",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityPerformer(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityConsumableImmunizationMedicationInformation() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityConsumableImmunizationMedicationInformationTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityConsumableImmunizationMedicationInformation",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_ACTIVITY_CONSUMABLE_IMMUNIZATION_MEDICATION_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityConsumableImmunizationMedicationInformation(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityConsumableImmunizationMedicationInformationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ImmunizationActivityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ImmunizationActivity> {
		@Override
		public ImmunizationActivity create() {
			return ConsolFactory.eINSTANCE.createImmunizationActivity();
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
	private static class ConstructorTestClass extends ImmunizationActivityOperations {
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

} // ImmunizationActivityOperations
