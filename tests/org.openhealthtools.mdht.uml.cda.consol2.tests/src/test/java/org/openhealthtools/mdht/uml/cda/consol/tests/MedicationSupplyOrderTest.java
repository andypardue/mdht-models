/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationSupplyOrderOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Supply Order</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderInstructionInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Instruction Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderEffectiveTimeHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Effective Time High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderContainsMedicationOrImmunization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Contains Medication Or Immunization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderEntryRelationship278(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Entry Relationship278</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderInstructionsEntryRelationshipInstructions279(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Instructions Entry Relationship Instructions279</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationSupplyOrderTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationSupplyOrderInstructionInversionInd() {
		OperationsTestCase<MedicationSupplyOrder> validateMedicationSupplyOrderInstructionInversionIndTestCase = new OperationsTestCase<MedicationSupplyOrder>(
			"validateMedicationSupplyOrderInstructionInversionInd",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_SUPPLY_ORDER_INSTRUCTION_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrderOperations.validateMedicationSupplyOrderInstructionInversionInd(
					(MedicationSupplyOrder) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderInstructionInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationSupplyOrderEffectiveTimeHigh() {
		OperationsTestCase<MedicationSupplyOrder> validateMedicationSupplyOrderEffectiveTimeHighTestCase = new OperationsTestCase<MedicationSupplyOrder>(
			"validateMedicationSupplyOrderEffectiveTimeHigh",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_SUPPLY_ORDER_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrderOperations.validateMedicationSupplyOrderEffectiveTimeHigh(
					(MedicationSupplyOrder) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderEffectiveTimeHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationSupplyOrderContainsMedicationOrImmunization() {
		OperationsTestCase<MedicationSupplyOrder> validateMedicationSupplyOrderContainsMedicationOrImmunizationTestCase = new OperationsTestCase<MedicationSupplyOrder>(
			"validateMedicationSupplyOrderContainsMedicationOrImmunization",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_SUPPLY_ORDER_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrderOperations.validateMedicationSupplyOrderContainsMedicationOrImmunization(
					(MedicationSupplyOrder) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderContainsMedicationOrImmunizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationSupplyOrderTemplateId() {
		OperationsTestCase<MedicationSupplyOrder> validateMedicationSupplyOrderTemplateIdTestCase = new OperationsTestCase<MedicationSupplyOrder>(
			"validateMedicationSupplyOrderTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_SUPPLY_ORDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrderOperations.validateMedicationSupplyOrderTemplateId(
					(MedicationSupplyOrder) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationSupplyOrderClassCode() {
		OperationsTestCase<MedicationSupplyOrder> validateMedicationSupplyOrderClassCodeTestCase = new OperationsTestCase<MedicationSupplyOrder>(
			"validateMedicationSupplyOrderClassCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_SUPPLY_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrderOperations.validateMedicationSupplyOrderClassCode(
					(MedicationSupplyOrder) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationSupplyOrderEffectiveTime() {
		OperationsTestCase<MedicationSupplyOrder> validateMedicationSupplyOrderEffectiveTimeTestCase = new OperationsTestCase<MedicationSupplyOrder>(
			"validateMedicationSupplyOrderEffectiveTime", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_SUPPLY_ORDER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder target) {
				target.init();

				DatatypesFactory.eINSTANCE.createIVL_TS();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrderOperations.validateMedicationSupplyOrderEffectiveTime(
					(MedicationSupplyOrder) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationSupplyOrderMoodCode() {
		OperationsTestCase<MedicationSupplyOrder> validateMedicationSupplyOrderMoodCodeTestCase = new OperationsTestCase<MedicationSupplyOrder>(
			"validateMedicationSupplyOrderMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_SUPPLY_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrderOperations.validateMedicationSupplyOrderMoodCode(
					(MedicationSupplyOrder) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationSupplyOrderQuantity() {
		OperationsTestCase<MedicationSupplyOrder> validateMedicationSupplyOrderQuantityTestCase = new OperationsTestCase<MedicationSupplyOrder>(
			"validateMedicationSupplyOrderQuantity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_SUPPLY_ORDER_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrderOperations.validateMedicationSupplyOrderQuantity(
					(MedicationSupplyOrder) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationSupplyOrderRepeatNumber() {
		OperationsTestCase<MedicationSupplyOrder> validateMedicationSupplyOrderRepeatNumberTestCase = new OperationsTestCase<MedicationSupplyOrder>(
			"validateMedicationSupplyOrderRepeatNumber", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_SUPPLY_ORDER_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrderOperations.validateMedicationSupplyOrderRepeatNumber(
					(MedicationSupplyOrder) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderRepeatNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationSupplyOrderStatusCode() {
		OperationsTestCase<MedicationSupplyOrder> validateMedicationSupplyOrderStatusCodeTestCase = new OperationsTestCase<MedicationSupplyOrder>(
			"validateMedicationSupplyOrderStatusCode", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_SUPPLY_ORDER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrderOperations.validateMedicationSupplyOrderStatusCode(
					(MedicationSupplyOrder) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationSupplyOrderId() {
		OperationsTestCase<MedicationSupplyOrder> validateMedicationSupplyOrderIdTestCase = new OperationsTestCase<MedicationSupplyOrder>(
			"validateMedicationSupplyOrderId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_SUPPLY_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrderOperations.validateMedicationSupplyOrderId(
					(MedicationSupplyOrder) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationSupplyOrderAuthor() {
		OperationsTestCase<MedicationSupplyOrder> validateMedicationSupplyOrderAuthorTestCase = new OperationsTestCase<MedicationSupplyOrder>(
			"validateMedicationSupplyOrderAuthor",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_SUPPLY_ORDER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrderOperations.validateMedicationSupplyOrderAuthor(
					(MedicationSupplyOrder) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMedicationSupplyOrderEntryRelationship278() {
		OperationsTestCase<MedicationSupplyOrder> validateMedicationSupplyOrderEntryRelationship278TestCase = new OperationsTestCase<MedicationSupplyOrder>(
			"validateMedicationSupplyOrderEntryRelationship278",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_SUPPLY_ORDER_ENTRY_RELATIONSHIP278__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrderOperations.validateMedicationSupplyOrderEntryRelationship278(
					(MedicationSupplyOrder) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderEntryRelationship278TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMedicationSupplyOrderInstructionsEntryRelationshipInstructions279() {
		OperationsTestCase<MedicationSupplyOrder> validateMedicationSupplyOrderInstructionsEntryRelationshipInstructions279TestCase = new OperationsTestCase<MedicationSupplyOrder>(
			"validateMedicationSupplyOrderInstructionsEntryRelationshipInstructions279",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_SUPPLY_ORDER_INSTRUCTIONS_ENTRY_RELATIONSHIP_INSTRUCTIONS279__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrderOperations.validateMedicationSupplyOrderInstructionsEntryRelationshipInstructions279(
					(MedicationSupplyOrder) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderInstructionsEntryRelationshipInstructions279TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationSupplyOrderOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationSupplyOrder> {
		@Override
		public MedicationSupplyOrder create() {
			return ConsolFactory.eINSTANCE.createMedicationSupplyOrder();
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
	private static class ConstructorTestClass extends MedicationSupplyOrderOperations {
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

} // MedicationSupplyOrderOperations
