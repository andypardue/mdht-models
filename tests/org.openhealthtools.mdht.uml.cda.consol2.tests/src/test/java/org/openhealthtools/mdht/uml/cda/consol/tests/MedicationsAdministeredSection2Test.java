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
import org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationsAdministeredSection2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medications Administered Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection2#validateMedicationsAdministeredSection2Entry1106(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Administered Section2 Entry1106</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection2#validateMedicationsAdministeredSection2MedicationActivity2EntryMedicationActivity21107(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Administered Section2 Medication Activity2 Entry Medication Activity21107</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection2#validateMedicationsAdministeredSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Administered Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection2#validateMedicationsAdministeredSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Administered Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection2#validateMedicationsAdministeredSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Administered Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationsAdministeredSection2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMedicationsAdministeredSection2Entry1106() {
		OperationsTestCase<MedicationsAdministeredSection2> validateMedicationsAdministeredSection2Entry1106TestCase = new OperationsTestCase<MedicationsAdministeredSection2>(
			"validateMedicationsAdministeredSection2Entry1106",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATIONS_ADMINISTERED_SECTION2_ENTRY1106__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsAdministeredSection2 target) {

			}

			@Override
			protected void updateToPass(MedicationsAdministeredSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsAdministeredSection2Operations.validateMedicationsAdministeredSection2Entry1106(
					(MedicationsAdministeredSection2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsAdministeredSection2Entry1106TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMedicationsAdministeredSection2MedicationActivity2EntryMedicationActivity21107() {
		OperationsTestCase<MedicationsAdministeredSection2> validateMedicationsAdministeredSection2MedicationActivity2EntryMedicationActivity21107TestCase = new OperationsTestCase<MedicationsAdministeredSection2>(
			"validateMedicationsAdministeredSection2MedicationActivity2EntryMedicationActivity21107",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATIONS_ADMINISTERED_SECTION2_MEDICATION_ACTIVITY2_ENTRY_MEDICATION_ACTIVITY21107__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsAdministeredSection2 target) {

			}

			@Override
			protected void updateToPass(MedicationsAdministeredSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsAdministeredSection2Operations.validateMedicationsAdministeredSection2MedicationActivity2EntryMedicationActivity21107(
					(MedicationsAdministeredSection2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsAdministeredSection2MedicationActivity2EntryMedicationActivity21107TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationsAdministeredSectionTemplateId() {
		OperationsTestCase<MedicationsAdministeredSection2> validateMedicationsAdministeredSectionTemplateIdTestCase = new OperationsTestCase<MedicationsAdministeredSection2>(
			"validateMedicationsAdministeredSectionTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsAdministeredSection2 target) {

			}

			@Override
			protected void updateToPass(MedicationsAdministeredSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsAdministeredSection2Operations.validateMedicationsAdministeredSectionTemplateId(
					(MedicationsAdministeredSection2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsAdministeredSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationsAdministeredSectionCodeP() {
		OperationsTestCase<MedicationsAdministeredSection2> validateMedicationsAdministeredSectionCodePTestCase = new OperationsTestCase<MedicationsAdministeredSection2>(
			"validateMedicationsAdministeredSectionCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATIONS_ADMINISTERED_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsAdministeredSection2 target) {

			}

			@Override
			protected void updateToPass(MedicationsAdministeredSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsAdministeredSection2Operations.validateMedicationsAdministeredSectionCodeP(
					(MedicationsAdministeredSection2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsAdministeredSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationsAdministeredSectionCode() {
		OperationsTestCase<MedicationsAdministeredSection2> validateMedicationsAdministeredSectionCodeTestCase = new OperationsTestCase<MedicationsAdministeredSection2>(
			"validateMedicationsAdministeredSectionCode", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATIONS_ADMINISTERED_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsAdministeredSection2 target) {

			}

			@Override
			protected void updateToPass(MedicationsAdministeredSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(MedicationsAdministeredSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSectionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsAdministeredSection2Operations.validateMedicationsAdministeredSectionCode(
					(MedicationsAdministeredSection2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsAdministeredSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationsAdministeredSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationsAdministeredSection2> {
		@Override
		public MedicationsAdministeredSection2 create() {
			return ConsolFactory.eINSTANCE.createMedicationsAdministeredSection2();
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
	private static class ConstructorTestClass extends MedicationsAdministeredSection2Operations {
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

} // MedicationsAdministeredSection2Operations
