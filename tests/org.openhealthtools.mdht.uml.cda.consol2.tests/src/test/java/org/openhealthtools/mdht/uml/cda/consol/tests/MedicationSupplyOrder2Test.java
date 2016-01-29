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
import org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationSupplyOrder2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Supply Order2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2#validateMedicationSupplyOrder2ContainsMedicationInformation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order2 Contains Medication Information2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2#validateMedicationSupplyOrder2ContainsImmunizationMedicationInformation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order2 Contains Immunization Medication Information2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2#validateMedicationSupplyOrderStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2#validateMedicationSupplyOrder2EntryRelationship954(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order2 Entry Relationship954</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2#validateMedicationSupplyOrder2Instruction2EntryRelationshipInstruction2955(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order2 Instruction2 Entry Relationship Instruction2955</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2#validateMedicationSupplyOrderContainsMedicationOrImmunization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Contains Medication Or Immunization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2#validateMedicationSupplyOrderInstructionInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Instruction Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2#validateMedicationSupplyOrderTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2#validateMedicationSupplyOrderStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2#validateMedicationSupplyOrderRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Repeat Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationSupplyOrder2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationSupplyOrder2ContainsMedicationInformation2() {
		OperationsTestCase<MedicationSupplyOrder2> validateMedicationSupplyOrder2ContainsMedicationInformation2TestCase = new OperationsTestCase<MedicationSupplyOrder2>(
			"validateMedicationSupplyOrder2ContainsMedicationInformation2",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_SUPPLY_ORDER2_CONTAINS_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder2 target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrder2Operations.validateMedicationSupplyOrder2ContainsMedicationInformation2(
					(MedicationSupplyOrder2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrder2ContainsMedicationInformation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationSupplyOrder2ContainsImmunizationMedicationInformation2() {
		OperationsTestCase<MedicationSupplyOrder2> validateMedicationSupplyOrder2ContainsImmunizationMedicationInformation2TestCase = new OperationsTestCase<MedicationSupplyOrder2>(
			"validateMedicationSupplyOrder2ContainsImmunizationMedicationInformation2",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_SUPPLY_ORDER2_CONTAINS_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder2 target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrder2Operations.validateMedicationSupplyOrder2ContainsImmunizationMedicationInformation2(
					(MedicationSupplyOrder2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrder2ContainsImmunizationMedicationInformation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationSupplyOrderStatusCodeP() {
		OperationsTestCase<MedicationSupplyOrder2> validateMedicationSupplyOrderStatusCodePTestCase = new OperationsTestCase<MedicationSupplyOrder2>(
			"validateMedicationSupplyOrderStatusCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_SUPPLY_ORDER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder2 target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrder2Operations.validateMedicationSupplyOrderStatusCodeP(
					(MedicationSupplyOrder2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMedicationSupplyOrder2EntryRelationship954() {
		OperationsTestCase<MedicationSupplyOrder2> validateMedicationSupplyOrder2EntryRelationship954TestCase = new OperationsTestCase<MedicationSupplyOrder2>(
			"validateMedicationSupplyOrder2EntryRelationship954",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_SUPPLY_ORDER2_ENTRY_RELATIONSHIP954__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder2 target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrder2Operations.validateMedicationSupplyOrder2EntryRelationship954(
					(MedicationSupplyOrder2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrder2EntryRelationship954TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMedicationSupplyOrder2Instruction2EntryRelationshipInstruction2955() {
		OperationsTestCase<MedicationSupplyOrder2> validateMedicationSupplyOrder2Instruction2EntryRelationshipInstruction2955TestCase = new OperationsTestCase<MedicationSupplyOrder2>(
			"validateMedicationSupplyOrder2Instruction2EntryRelationshipInstruction2955",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_SUPPLY_ORDER2_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION2955__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder2 target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrder2Operations.validateMedicationSupplyOrder2Instruction2EntryRelationshipInstruction2955(
					(MedicationSupplyOrder2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrder2Instruction2EntryRelationshipInstruction2955TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationSupplyOrderContainsMedicationOrImmunization() {
		OperationsTestCase<MedicationSupplyOrder2> validateMedicationSupplyOrderContainsMedicationOrImmunizationTestCase = new OperationsTestCase<MedicationSupplyOrder2>(
			"validateMedicationSupplyOrderContainsMedicationOrImmunization",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_SUPPLY_ORDER_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder2 target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrder2Operations.validateMedicationSupplyOrderContainsMedicationOrImmunization(
					(MedicationSupplyOrder2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderContainsMedicationOrImmunizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationSupplyOrderInstructionInversionInd() {
		OperationsTestCase<MedicationSupplyOrder2> validateMedicationSupplyOrderInstructionInversionIndTestCase = new OperationsTestCase<MedicationSupplyOrder2>(
			"validateMedicationSupplyOrderInstructionInversionInd",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_SUPPLY_ORDER_INSTRUCTION_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder2 target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrder2Operations.validateMedicationSupplyOrderInstructionInversionInd(
					(MedicationSupplyOrder2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderInstructionInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationSupplyOrderTemplateId() {
		OperationsTestCase<MedicationSupplyOrder2> validateMedicationSupplyOrderTemplateIdTestCase = new OperationsTestCase<MedicationSupplyOrder2>(
			"validateMedicationSupplyOrderTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_SUPPLY_ORDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder2 target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrder2Operations.validateMedicationSupplyOrderTemplateId(
					(MedicationSupplyOrder2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationSupplyOrderStatusCode() {
		OperationsTestCase<MedicationSupplyOrder2> validateMedicationSupplyOrderStatusCodeTestCase = new OperationsTestCase<MedicationSupplyOrder2>(
			"validateMedicationSupplyOrderStatusCode", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_SUPPLY_ORDER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder2 target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(MedicationSupplyOrder2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrderStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrder2Operations.validateMedicationSupplyOrderStatusCode(
					(MedicationSupplyOrder2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationSupplyOrderRepeatNumber() {
		OperationsTestCase<MedicationSupplyOrder2> validateMedicationSupplyOrderRepeatNumberTestCase = new OperationsTestCase<MedicationSupplyOrder2>(
			"validateMedicationSupplyOrderRepeatNumber", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_SUPPLY_ORDER_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder2 target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrder2Operations.validateMedicationSupplyOrderRepeatNumber(
					(MedicationSupplyOrder2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderRepeatNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationSupplyOrder2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationSupplyOrder2> {
		@Override
		public MedicationSupplyOrder2 create() {
			return ConsolFactory.eINSTANCE.createMedicationSupplyOrder2();
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
	private static class ConstructorTestClass extends MedicationSupplyOrder2Operations {
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

} // MedicationSupplyOrder2Operations
