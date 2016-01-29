/*******************************************************************************
 * Copyright (c) 2014, 2015 Dan Brown and others.
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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.PhysicalExamSection2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physical Exam Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2Component(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2Entry1110(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Entry1110</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2Entry1112(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Entry1112</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2Entry1114(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Entry1114</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2Entry1116(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Entry1116</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2ComponentSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Component Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2ComponentSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Component Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2ComponentSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Component Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2ComponentSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Component Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2ComponentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Component Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2LongitudinalCareWoundObservationEntryWoundObservation1111(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Longitudinal Care Wound Observation Entry Wound Observation1111</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2PressureUlcerObservationEntryPressureUlcerObservation1113(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Pressure Ulcer Observation Entry Pressure Ulcer Observation1113</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2NumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation1115(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Number Of Pressure Ulcers Observation Entry Number Of Pressure Ulcers Observation1115</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2HighestPressureUlcerStageEntryHighestPressureUlcerStage1117(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Highest Pressure Ulcer Stage Entry Highest Pressure Ulcer Stage1117</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PhysicalExamSection2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSection2Component() {
		OperationsTestCase<PhysicalExamSection2> validatePhysicalExamSection2ComponentTestCase = new OperationsTestCase<PhysicalExamSection2>(
			"validatePhysicalExamSection2Component",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection2 target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSection2Operations.validatePhysicalExamSection2Component(
					(PhysicalExamSection2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSection2ComponentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePhysicalExamSection2Entry1110() {
		OperationsTestCase<PhysicalExamSection2> validatePhysicalExamSection2Entry1110TestCase = new OperationsTestCase<PhysicalExamSection2>(
			"validatePhysicalExamSection2Entry1110",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION2_ENTRY1110__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection2 target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSection2Operations.validatePhysicalExamSection2Entry1110(
					(PhysicalExamSection2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSection2Entry1110TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePhysicalExamSection2Entry1112() {
		OperationsTestCase<PhysicalExamSection2> validatePhysicalExamSection2Entry1112TestCase = new OperationsTestCase<PhysicalExamSection2>(
			"validatePhysicalExamSection2Entry1112",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION2_ENTRY1112__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection2 target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSection2Operations.validatePhysicalExamSection2Entry1112(
					(PhysicalExamSection2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSection2Entry1112TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePhysicalExamSection2Entry1114() {
		OperationsTestCase<PhysicalExamSection2> validatePhysicalExamSection2Entry1114TestCase = new OperationsTestCase<PhysicalExamSection2>(
			"validatePhysicalExamSection2Entry1114",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION2_ENTRY1114__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection2 target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSection2Operations.validatePhysicalExamSection2Entry1114(
					(PhysicalExamSection2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSection2Entry1114TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePhysicalExamSection2Entry1116() {
		OperationsTestCase<PhysicalExamSection2> validatePhysicalExamSection2Entry1116TestCase = new OperationsTestCase<PhysicalExamSection2>(
			"validatePhysicalExamSection2Entry1116",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION2_ENTRY1116__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection2 target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSection2Operations.validatePhysicalExamSection2Entry1116(
					(PhysicalExamSection2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSection2Entry1116TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSection2ComponentSectionCode() {
		OperationsTestCase<PhysicalExamSection2> validatePhysicalExamSection2ComponentSectionCodeTestCase = new OperationsTestCase<PhysicalExamSection2>(
			"validatePhysicalExamSection2ComponentSectionCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection2 target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSection2Operations.validatePhysicalExamSection2ComponentSectionCode(
					(PhysicalExamSection2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSection2ComponentSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSection2ComponentSectionCodeP() {
		OperationsTestCase<PhysicalExamSection2> validatePhysicalExamSection2ComponentSectionCodePTestCase = new OperationsTestCase<PhysicalExamSection2>(
			"validatePhysicalExamSection2ComponentSectionCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection2 target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSection2Operations.validatePhysicalExamSection2ComponentSectionCodeP(
					(PhysicalExamSection2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSection2ComponentSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSection2ComponentSectionTitle() {
		OperationsTestCase<PhysicalExamSection2> validatePhysicalExamSection2ComponentSectionTitleTestCase = new OperationsTestCase<PhysicalExamSection2>(
			"validatePhysicalExamSection2ComponentSectionTitle",
			operationsForOCL.getOCLValue(
				"VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection2 target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection2 target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSection2Operations.validatePhysicalExamSection2ComponentSectionTitle(
					(PhysicalExamSection2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSection2ComponentSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSection2ComponentSectionText() {
		OperationsTestCase<PhysicalExamSection2> validatePhysicalExamSection2ComponentSectionTextTestCase = new OperationsTestCase<PhysicalExamSection2>(
			"validatePhysicalExamSection2ComponentSectionText",
			operationsForOCL.getOCLValue(
				"VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection2 target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection2 target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSection2Operations.validatePhysicalExamSection2ComponentSectionText(
					(PhysicalExamSection2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSection2ComponentSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePhysicalExamSection2ComponentSection() {
		OperationsTestCase<PhysicalExamSection2> validatePhysicalExamSection2ComponentSectionTestCase = new OperationsTestCase<PhysicalExamSection2>(
			"validatePhysicalExamSection2ComponentSection", operationsForOCL.getOCLValue(
				"VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection2 target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection2 target) {
				target.init();

				// /* ComponentSection */
				// ComponentSection section =
				//
				// ConsolFactory.eINSTANCE.createComponentSection().init();
				//
				//
				// target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSection2Operations.validatePhysicalExamSection2ComponentSection(
					(PhysicalExamSection2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSection2ComponentSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePhysicalExamSection2LongitudinalCareWoundObservationEntryWoundObservation1111() {
		OperationsTestCase<PhysicalExamSection2> validatePhysicalExamSection2LongitudinalCareWoundObservationEntryWoundObservation1111TestCase = new OperationsTestCase<PhysicalExamSection2>(
			"validatePhysicalExamSection2LongitudinalCareWoundObservationEntryWoundObservation1111",
			operationsForOCL.getOCLValue(
				"VALIDATE_PHYSICAL_EXAM_SECTION2_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_WOUND_OBSERVATION1111__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection2 target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSection2Operations.validatePhysicalExamSection2LongitudinalCareWoundObservationEntryWoundObservation1111(
					(PhysicalExamSection2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSection2LongitudinalCareWoundObservationEntryWoundObservation1111TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePhysicalExamSection2PressureUlcerObservationEntryPressureUlcerObservation1113() {
		OperationsTestCase<PhysicalExamSection2> validatePhysicalExamSection2PressureUlcerObservationEntryPressureUlcerObservation1113TestCase = new OperationsTestCase<PhysicalExamSection2>(
			"validatePhysicalExamSection2PressureUlcerObservationEntryPressureUlcerObservation1113",
			operationsForOCL.getOCLValue(
				"VALIDATE_PHYSICAL_EXAM_SECTION2_PRESSURE_ULCER_OBSERVATION_ENTRY_PRESSURE_ULCER_OBSERVATION1113__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection2 target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSection2Operations.validatePhysicalExamSection2PressureUlcerObservationEntryPressureUlcerObservation1113(
					(PhysicalExamSection2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSection2PressureUlcerObservationEntryPressureUlcerObservation1113TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePhysicalExamSection2NumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation1115() {
		OperationsTestCase<PhysicalExamSection2> validatePhysicalExamSection2NumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation1115TestCase = new OperationsTestCase<PhysicalExamSection2>(
			"validatePhysicalExamSection2NumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation1115",
			operationsForOCL.getOCLValue(
				"VALIDATE_PHYSICAL_EXAM_SECTION2_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION1115__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection2 target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSection2Operations.validatePhysicalExamSection2NumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation1115(
					(PhysicalExamSection2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSection2NumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation1115TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePhysicalExamSection2HighestPressureUlcerStageEntryHighestPressureUlcerStage1117() {
		OperationsTestCase<PhysicalExamSection2> validatePhysicalExamSection2HighestPressureUlcerStageEntryHighestPressureUlcerStage1117TestCase = new OperationsTestCase<PhysicalExamSection2>(
			"validatePhysicalExamSection2HighestPressureUlcerStageEntryHighestPressureUlcerStage1117",
			operationsForOCL.getOCLValue(
				"VALIDATE_PHYSICAL_EXAM_SECTION2_HIGHEST_PRESSURE_ULCER_STAGE_ENTRY_HIGHEST_PRESSURE_ULCER_STAGE1117__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection2 target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSection2Operations.validatePhysicalExamSection2HighestPressureUlcerStageEntryHighestPressureUlcerStage1117(
					(PhysicalExamSection2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSection2HighestPressureUlcerStageEntryHighestPressureUlcerStage1117TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionTemplateId() {
		OperationsTestCase<PhysicalExamSection2> validatePhysicalExamSectionTemplateIdTestCase = new OperationsTestCase<PhysicalExamSection2>(
			"validatePhysicalExamSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection2 target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSection2Operations.validatePhysicalExamSectionTemplateId(
					(PhysicalExamSection2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionCodeP() {
		OperationsTestCase<PhysicalExamSection2> validatePhysicalExamSectionCodePTestCase = new OperationsTestCase<PhysicalExamSection2>(
			"validatePhysicalExamSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection2 target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSection2Operations.validatePhysicalExamSectionCodeP(
					(PhysicalExamSection2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionCode() {
		OperationsTestCase<PhysicalExamSection2> validatePhysicalExamSectionCodeTestCase = new OperationsTestCase<PhysicalExamSection2>(
			"validatePhysicalExamSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection2 target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(PhysicalExamSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSectionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSection2Operations.validatePhysicalExamSectionCode(
					(PhysicalExamSection2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PhysicalExamSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<PhysicalExamSection2> {
		@Override
		public PhysicalExamSection2 create() {
			return ConsolFactory.eINSTANCE.createPhysicalExamSection2();
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
	private static class ConstructorTestClass extends PhysicalExamSection2Operations {
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

} // PhysicalExamSection2Operations
