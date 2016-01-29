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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AnesthesiaSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Anesthesia Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection#validateAnesthesiaSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection#validateAnesthesiaSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection#validateAnesthesiaSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection#validateAnesthesiaSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection#validateAnesthesiaSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection#validateAnesthesiaSectionEntry290(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section Entry290</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection#validateAnesthesiaSectionEntry292(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section Entry292</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection#validateAnesthesiaSectionProcedureActivityProcedureEntryProcedureActivityProcedure291(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section Procedure Activity Procedure Entry Procedure Activity Procedure291</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection#validateAnesthesiaSectionMedicationActivityEntryMedicationActivity293(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section Medication Activity Entry Medication Activity293</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AnesthesiaSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAnesthesiaSectionTemplateId() {
		OperationsTestCase<AnesthesiaSection> validateAnesthesiaSectionTemplateIdTestCase = new OperationsTestCase<AnesthesiaSection>(
			"validateAnesthesiaSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ANESTHESIA_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AnesthesiaSection target) {

			}

			@Override
			protected void updateToPass(AnesthesiaSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AnesthesiaSectionOperations.validateAnesthesiaSectionTemplateId(
					(AnesthesiaSection) objectToTest, diagnostician, map);
			}

		};

		validateAnesthesiaSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAnesthesiaSectionCode() {
		OperationsTestCase<AnesthesiaSection> validateAnesthesiaSectionCodeTestCase = new OperationsTestCase<AnesthesiaSection>(
			"validateAnesthesiaSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_ANESTHESIA_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AnesthesiaSection target) {

			}

			@Override
			protected void updateToPass(AnesthesiaSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AnesthesiaSectionOperations.validateAnesthesiaSectionCode(
					(AnesthesiaSection) objectToTest, diagnostician, map);
			}

		};

		validateAnesthesiaSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAnesthesiaSectionCodeP() {
		OperationsTestCase<AnesthesiaSection> validateAnesthesiaSectionCodePTestCase = new OperationsTestCase<AnesthesiaSection>(
			"validateAnesthesiaSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ANESTHESIA_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AnesthesiaSection target) {

			}

			@Override
			protected void updateToPass(AnesthesiaSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AnesthesiaSectionOperations.validateAnesthesiaSectionCodeP(
					(AnesthesiaSection) objectToTest, diagnostician, map);
			}

		};

		validateAnesthesiaSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAnesthesiaSectionText() {
		OperationsTestCase<AnesthesiaSection> validateAnesthesiaSectionTextTestCase = new OperationsTestCase<AnesthesiaSection>(
			"validateAnesthesiaSectionText",
			operationsForOCL.getOCLValue("VALIDATE_ANESTHESIA_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AnesthesiaSection target) {

			}

			@Override
			protected void updateToPass(AnesthesiaSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AnesthesiaSectionOperations.validateAnesthesiaSectionText(
					(AnesthesiaSection) objectToTest, diagnostician, map);
			}

		};

		validateAnesthesiaSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAnesthesiaSectionEntry290() {
		OperationsTestCase<AnesthesiaSection> validateAnesthesiaSectionEntry290TestCase = new OperationsTestCase<AnesthesiaSection>(
			"validateAnesthesiaSectionEntry290",
			operationsForOCL.getOCLValue("VALIDATE_ANESTHESIA_SECTION_ENTRY290__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AnesthesiaSection target) {

			}

			@Override
			protected void updateToPass(AnesthesiaSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AnesthesiaSectionOperations.validateAnesthesiaSectionEntry290(
					(AnesthesiaSection) objectToTest, diagnostician, map);
			}

		};

		validateAnesthesiaSectionEntry290TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAnesthesiaSectionEntry292() {
		OperationsTestCase<AnesthesiaSection> validateAnesthesiaSectionEntry292TestCase = new OperationsTestCase<AnesthesiaSection>(
			"validateAnesthesiaSectionEntry292",
			operationsForOCL.getOCLValue("VALIDATE_ANESTHESIA_SECTION_ENTRY292__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AnesthesiaSection target) {

			}

			@Override
			protected void updateToPass(AnesthesiaSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AnesthesiaSectionOperations.validateAnesthesiaSectionEntry292(
					(AnesthesiaSection) objectToTest, diagnostician, map);
			}

		};

		validateAnesthesiaSectionEntry292TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAnesthesiaSectionProcedureActivityProcedureEntryProcedureActivityProcedure291() {
		OperationsTestCase<AnesthesiaSection> validateAnesthesiaSectionProcedureActivityProcedureEntryProcedureActivityProcedure291TestCase = new OperationsTestCase<AnesthesiaSection>(
			"validateAnesthesiaSectionProcedureActivityProcedureEntryProcedureActivityProcedure291",
			operationsForOCL.getOCLValue(
				"VALIDATE_ANESTHESIA_SECTION_PROCEDURE_ACTIVITY_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE291__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AnesthesiaSection target) {

			}

			@Override
			protected void updateToPass(AnesthesiaSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AnesthesiaSectionOperations.validateAnesthesiaSectionProcedureActivityProcedureEntryProcedureActivityProcedure291(
					(AnesthesiaSection) objectToTest, diagnostician, map);
			}

		};

		validateAnesthesiaSectionProcedureActivityProcedureEntryProcedureActivityProcedure291TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAnesthesiaSectionMedicationActivityEntryMedicationActivity293() {
		OperationsTestCase<AnesthesiaSection> validateAnesthesiaSectionMedicationActivityEntryMedicationActivity293TestCase = new OperationsTestCase<AnesthesiaSection>(
			"validateAnesthesiaSectionMedicationActivityEntryMedicationActivity293",
			operationsForOCL.getOCLValue(
				"VALIDATE_ANESTHESIA_SECTION_MEDICATION_ACTIVITY_ENTRY_MEDICATION_ACTIVITY293__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AnesthesiaSection target) {

			}

			@Override
			protected void updateToPass(AnesthesiaSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AnesthesiaSectionOperations.validateAnesthesiaSectionMedicationActivityEntryMedicationActivity293(
					(AnesthesiaSection) objectToTest, diagnostician, map);
			}

		};

		validateAnesthesiaSectionMedicationActivityEntryMedicationActivity293TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAnesthesiaSectionTitle() {
		OperationsTestCase<AnesthesiaSection> validateAnesthesiaSectionTitleTestCase = new OperationsTestCase<AnesthesiaSection>(
			"validateAnesthesiaSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_ANESTHESIA_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AnesthesiaSection target) {

			}

			@Override
			protected void updateToPass(AnesthesiaSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AnesthesiaSectionOperations.validateAnesthesiaSectionTitle(
					(AnesthesiaSection) objectToTest, diagnostician, map);
			}

		};

		validateAnesthesiaSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AnesthesiaSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AnesthesiaSection> {
		@Override
		public AnesthesiaSection create() {
			return ConsolFactory.eINSTANCE.createAnesthesiaSection();
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
	private static class ConstructorTestClass extends AnesthesiaSectionOperations {
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

} // AnesthesiaSectionOperations
