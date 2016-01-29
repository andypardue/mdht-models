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
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity2;
import org.openhealthtools.mdht.uml.cda.consol.operations.NonMedicinalSupplyActivity2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Non Medicinal Supply Activity2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity2#validateNonMedicinalSupplyActivity2Instruction2InversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity2 Instruction2 Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity2#validateNonMedicinalSupplyActivityStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity2#validateNonMedicinalSupplyActivity2EntryRelationship956(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity2 Entry Relationship956</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity2#validateNonMedicinalSupplyActivity2Instruction2EntryRelationshipInstruction2957(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity2 Instruction2 Entry Relationship Instruction2957</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity2#validateNonMedicinalSupplyActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity2#validateNonMedicinalSupplyActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity2#validateNonMedicinalSupplyActivityProductInstance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Product Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class NonMedicinalSupplyActivity2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivity2Instruction2InversionInd() {
		OperationsTestCase<NonMedicinalSupplyActivity2> validateNonMedicinalSupplyActivity2Instruction2InversionIndTestCase = new OperationsTestCase<NonMedicinalSupplyActivity2>(
			"validateNonMedicinalSupplyActivity2Instruction2InversionInd",
			operationsForOCL.getOCLValue(
				"VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY2_INSTRUCTION2_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity2 target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivity2Operations.validateNonMedicinalSupplyActivity2Instruction2InversionInd(
					(NonMedicinalSupplyActivity2) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivity2Instruction2InversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityStatusCodeP() {
		OperationsTestCase<NonMedicinalSupplyActivity2> validateNonMedicinalSupplyActivityStatusCodePTestCase = new OperationsTestCase<NonMedicinalSupplyActivity2>(
			"validateNonMedicinalSupplyActivityStatusCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity2 target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivity2Operations.validateNonMedicinalSupplyActivityStatusCodeP(
					(NonMedicinalSupplyActivity2) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNonMedicinalSupplyActivity2EntryRelationship956() {
		OperationsTestCase<NonMedicinalSupplyActivity2> validateNonMedicinalSupplyActivity2EntryRelationship956TestCase = new OperationsTestCase<NonMedicinalSupplyActivity2>(
			"validateNonMedicinalSupplyActivity2EntryRelationship956",
			operationsForOCL.getOCLValue(
				"VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY2_ENTRY_RELATIONSHIP956__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity2 target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivity2Operations.validateNonMedicinalSupplyActivity2EntryRelationship956(
					(NonMedicinalSupplyActivity2) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivity2EntryRelationship956TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNonMedicinalSupplyActivity2Instruction2EntryRelationshipInstruction2957() {
		OperationsTestCase<NonMedicinalSupplyActivity2> validateNonMedicinalSupplyActivity2Instruction2EntryRelationshipInstruction2957TestCase = new OperationsTestCase<NonMedicinalSupplyActivity2>(
			"validateNonMedicinalSupplyActivity2Instruction2EntryRelationshipInstruction2957",
			operationsForOCL.getOCLValue(
				"VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY2_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION2957__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity2 target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivity2Operations.validateNonMedicinalSupplyActivity2Instruction2EntryRelationshipInstruction2957(
					(NonMedicinalSupplyActivity2) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivity2Instruction2EntryRelationshipInstruction2957TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityTemplateId() {
		OperationsTestCase<NonMedicinalSupplyActivity2> validateNonMedicinalSupplyActivityTemplateIdTestCase = new OperationsTestCase<NonMedicinalSupplyActivity2>(
			"validateNonMedicinalSupplyActivityTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity2 target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivity2Operations.validateNonMedicinalSupplyActivityTemplateId(
					(NonMedicinalSupplyActivity2) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityStatusCode() {
		OperationsTestCase<NonMedicinalSupplyActivity2> validateNonMedicinalSupplyActivityStatusCodeTestCase = new OperationsTestCase<NonMedicinalSupplyActivity2>(
			"validateNonMedicinalSupplyActivityStatusCode", operationsForOCL.getOCLValue(
				"VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity2 target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(NonMedicinalSupplyActivity2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivityStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivity2Operations.validateNonMedicinalSupplyActivityStatusCode(
					(NonMedicinalSupplyActivity2) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityProductInstance() {
		OperationsTestCase<NonMedicinalSupplyActivity2> validateNonMedicinalSupplyActivityProductInstanceTestCase = new OperationsTestCase<NonMedicinalSupplyActivity2>(
			"validateNonMedicinalSupplyActivityProductInstance",
			operationsForOCL.getOCLValue(
				"VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity2 target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivity2Operations.validateNonMedicinalSupplyActivityProductInstance(
					(NonMedicinalSupplyActivity2) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityProductInstanceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends NonMedicinalSupplyActivity2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<NonMedicinalSupplyActivity2> {
		@Override
		public NonMedicinalSupplyActivity2 create() {
			return ConsolFactory.eINSTANCE.createNonMedicinalSupplyActivity2();
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
	private static class ConstructorTestClass extends NonMedicinalSupplyActivity2Operations {
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

} // NonMedicinalSupplyActivity2Operations
