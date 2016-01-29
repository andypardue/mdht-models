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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.PhysicalExamSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physical Exam Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionEntry174(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Entry174</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionEntry176(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Entry176</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionEntry178(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Entry178</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionPressureUlcerObservationEntryPressureUlcerObservation175(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Pressure Ulcer Observation Entry Pressure Ulcer Observation175</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionNumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation177(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Number Of Pressure Ulcers Observation Entry Number Of Pressure Ulcers Observation177</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionHighestPressureUlcerStageEntryHighestPressureUlcerStage179(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Highest Pressure Ulcer Stage Entry Highest Pressure Ulcer Stage179</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PhysicalExamSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionTemplateId() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionTemplateIdTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionTemplateId(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionCode() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionCodeTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionCode(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionCodeP() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionCodePTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionCodeP(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionTitle() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionTitleTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionTitle(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionText() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionTextTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionText",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionText(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePhysicalExamSectionEntry174() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionEntry174TestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionEntry174",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_ENTRY174__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionEntry174(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionEntry174TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePhysicalExamSectionEntry176() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionEntry176TestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionEntry176",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_ENTRY176__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionEntry176(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionEntry176TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePhysicalExamSectionEntry178() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionEntry178TestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionEntry178",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_ENTRY178__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionEntry178(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionEntry178TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePhysicalExamSectionPressureUlcerObservationEntryPressureUlcerObservation175() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionPressureUlcerObservationEntryPressureUlcerObservation175TestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionPressureUlcerObservationEntryPressureUlcerObservation175",
			operationsForOCL.getOCLValue(
				"VALIDATE_PHYSICAL_EXAM_SECTION_PRESSURE_ULCER_OBSERVATION_ENTRY_PRESSURE_ULCER_OBSERVATION175__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionPressureUlcerObservationEntryPressureUlcerObservation175(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionPressureUlcerObservationEntryPressureUlcerObservation175TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePhysicalExamSectionNumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation177() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionNumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation177TestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionNumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation177",
			operationsForOCL.getOCLValue(
				"VALIDATE_PHYSICAL_EXAM_SECTION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION177__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionNumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation177(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionNumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation177TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePhysicalExamSectionHighestPressureUlcerStageEntryHighestPressureUlcerStage179() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionHighestPressureUlcerStageEntryHighestPressureUlcerStage179TestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionHighestPressureUlcerStageEntryHighestPressureUlcerStage179",
			operationsForOCL.getOCLValue(
				"VALIDATE_PHYSICAL_EXAM_SECTION_HIGHEST_PRESSURE_ULCER_STAGE_ENTRY_HIGHEST_PRESSURE_ULCER_STAGE179__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionHighestPressureUlcerStageEntryHighestPressureUlcerStage179(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionHighestPressureUlcerStageEntryHighestPressureUlcerStage179TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PhysicalExamSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PhysicalExamSection> {
		@Override
		public PhysicalExamSection create() {
			return ConsolFactory.eINSTANCE.createPhysicalExamSection();
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
	private static class ConstructorTestClass extends PhysicalExamSectionOperations {
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

} // PhysicalExamSectionOperations
