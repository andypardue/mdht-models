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
import org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AnesthesiaSection2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Anesthesia Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection2#validateAnesthesiaSection2Entry1052(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section2 Entry1052</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection2#validateAnesthesiaSection2Entry1054(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section2 Entry1054</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection2#validateAnesthesiaSection2ProcedureActivityProcedure2EntryProcedureActivityProcedure21053(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section2 Procedure Activity Procedure2 Entry Procedure Activity Procedure21053</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection2#validateAnesthesiaSection2MedicationActivity2EntryMedicationActivity21055(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section2 Medication Activity2 Entry Medication Activity21055</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection2#validateAnesthesiaSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection2#validateAnesthesiaSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection2#validateAnesthesiaSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AnesthesiaSection2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAnesthesiaSection2Entry1052() {
		OperationsTestCase<AnesthesiaSection2> validateAnesthesiaSection2Entry1052TestCase = new OperationsTestCase<AnesthesiaSection2>(
			"validateAnesthesiaSection2Entry1052",
			operationsForOCL.getOCLValue("VALIDATE_ANESTHESIA_SECTION2_ENTRY1052__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AnesthesiaSection2 target) {

			}

			@Override
			protected void updateToPass(AnesthesiaSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AnesthesiaSection2Operations.validateAnesthesiaSection2Entry1052(
					(AnesthesiaSection2) objectToTest, diagnostician, map);
			}

		};

		validateAnesthesiaSection2Entry1052TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAnesthesiaSection2Entry1054() {
		OperationsTestCase<AnesthesiaSection2> validateAnesthesiaSection2Entry1054TestCase = new OperationsTestCase<AnesthesiaSection2>(
			"validateAnesthesiaSection2Entry1054",
			operationsForOCL.getOCLValue("VALIDATE_ANESTHESIA_SECTION2_ENTRY1054__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AnesthesiaSection2 target) {

			}

			@Override
			protected void updateToPass(AnesthesiaSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AnesthesiaSection2Operations.validateAnesthesiaSection2Entry1054(
					(AnesthesiaSection2) objectToTest, diagnostician, map);
			}

		};

		validateAnesthesiaSection2Entry1054TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAnesthesiaSection2ProcedureActivityProcedure2EntryProcedureActivityProcedure21053() {
		OperationsTestCase<AnesthesiaSection2> validateAnesthesiaSection2ProcedureActivityProcedure2EntryProcedureActivityProcedure21053TestCase = new OperationsTestCase<AnesthesiaSection2>(
			"validateAnesthesiaSection2ProcedureActivityProcedure2EntryProcedureActivityProcedure21053",
			operationsForOCL.getOCLValue(
				"VALIDATE_ANESTHESIA_SECTION2_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE21053__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AnesthesiaSection2 target) {

			}

			@Override
			protected void updateToPass(AnesthesiaSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AnesthesiaSection2Operations.validateAnesthesiaSection2ProcedureActivityProcedure2EntryProcedureActivityProcedure21053(
					(AnesthesiaSection2) objectToTest, diagnostician, map);
			}

		};

		validateAnesthesiaSection2ProcedureActivityProcedure2EntryProcedureActivityProcedure21053TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAnesthesiaSection2MedicationActivity2EntryMedicationActivity21055() {
		OperationsTestCase<AnesthesiaSection2> validateAnesthesiaSection2MedicationActivity2EntryMedicationActivity21055TestCase = new OperationsTestCase<AnesthesiaSection2>(
			"validateAnesthesiaSection2MedicationActivity2EntryMedicationActivity21055",
			operationsForOCL.getOCLValue(
				"VALIDATE_ANESTHESIA_SECTION2_MEDICATION_ACTIVITY2_ENTRY_MEDICATION_ACTIVITY21055__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AnesthesiaSection2 target) {

			}

			@Override
			protected void updateToPass(AnesthesiaSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AnesthesiaSection2Operations.validateAnesthesiaSection2MedicationActivity2EntryMedicationActivity21055(
					(AnesthesiaSection2) objectToTest, diagnostician, map);
			}

		};

		validateAnesthesiaSection2MedicationActivity2EntryMedicationActivity21055TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAnesthesiaSectionTemplateId() {
		OperationsTestCase<AnesthesiaSection2> validateAnesthesiaSectionTemplateIdTestCase = new OperationsTestCase<AnesthesiaSection2>(
			"validateAnesthesiaSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ANESTHESIA_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AnesthesiaSection2 target) {

			}

			@Override
			protected void updateToPass(AnesthesiaSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AnesthesiaSection2Operations.validateAnesthesiaSectionTemplateId(
					(AnesthesiaSection2) objectToTest, diagnostician, map);
			}

		};

		validateAnesthesiaSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAnesthesiaSectionCodeP() {
		OperationsTestCase<AnesthesiaSection2> validateAnesthesiaSectionCodePTestCase = new OperationsTestCase<AnesthesiaSection2>(
			"validateAnesthesiaSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ANESTHESIA_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AnesthesiaSection2 target) {

			}

			@Override
			protected void updateToPass(AnesthesiaSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AnesthesiaSection2Operations.validateAnesthesiaSectionCodeP(
					(AnesthesiaSection2) objectToTest, diagnostician, map);
			}

		};

		validateAnesthesiaSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAnesthesiaSectionCode() {
		OperationsTestCase<AnesthesiaSection2> validateAnesthesiaSectionCodeTestCase = new OperationsTestCase<AnesthesiaSection2>(
			"validateAnesthesiaSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_ANESTHESIA_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AnesthesiaSection2 target) {

			}

			@Override
			protected void updateToPass(AnesthesiaSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(AnesthesiaSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSectionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AnesthesiaSection2Operations.validateAnesthesiaSectionCode(
					(AnesthesiaSection2) objectToTest, diagnostician, map);
			}

		};

		validateAnesthesiaSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AnesthesiaSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<AnesthesiaSection2> {
		@Override
		public AnesthesiaSection2 create() {
			return ConsolFactory.eINSTANCE.createAnesthesiaSection2();
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
	private static class ConstructorTestClass extends AnesthesiaSection2Operations {
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

} // AnesthesiaSection2Operations
