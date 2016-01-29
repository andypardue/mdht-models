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
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.FunctionalStatusSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Functional Status Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionEntry80(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Entry80</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionEntry82(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Entry82</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionEntry84(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Entry84</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionEntry86(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Entry86</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionEntry88(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Entry88</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionEntry90(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Entry90</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionEntry92(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Entry92</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionEntry94(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Entry94</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionEntry96(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Entry96</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionEntry98(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Entry98</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionEntry100(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Entry100</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionEntry102(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Entry102</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionFunctionalStatusResultOrganizerEntryFunctionalStatusResultOrganizer81(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Functional Status Result Organizer Entry Functional Status Result Organizer81</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionFunctionalStatusResultObservationEntryFunctionalStatusResultObservation83(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Functional Status Result Observation Entry Functional Status Result Observation83</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionCognitiveStatusResultOrganizerEntryCognitiveStatusResultOrganizer85(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Cognitive Status Result Organizer Entry Cognitive Status Result Organizer85</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionCognitiveStatusResultObservationEntryCognitiveStatusResultObservation87(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Cognitive Status Result Observation Entry Cognitive Status Result Observation87</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionCognitiveStatusProblemObservationEntryCognitiveStatusProblemObservation89(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Cognitive Status Problem Observation Entry Cognitive Status Problem Observation89</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionFunctionalStatusProblemObservationEntryFunctionalStatusProblemObservation91(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Functional Status Problem Observation Entry Functional Status Problem Observation91</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionCaregiverCharacteristicsEntryCaregiverCharacteristics93(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Caregiver Characteristics Entry Caregiver Characteristics93</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionAssessmentScaleObservationEntryAssessmentScaleObservation95(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Assessment Scale Observation Entry Assessment Scale Observation95</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionNonMedicinalSupplyActivityEntryNonMedicinalSupplyActivity97(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Non Medicinal Supply Activity Entry Non Medicinal Supply Activity97</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionPressureUlcerObservationEntryPressureUlcerObservation99(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Pressure Ulcer Observation Entry Pressure Ulcer Observation99</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionNumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation101(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Number Of Pressure Ulcers Observation Entry Number Of Pressure Ulcers Observation101</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionHighestPressureUlcerStageEntryHighestPressureUlcerStage103(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Highest Pressure Ulcer Stage Entry Highest Pressure Ulcer Stage103</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FunctionalStatusSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusSectionTemplateId() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionTemplateIdTestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionTemplateId(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusSectionCode() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionCodeTestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionCode(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusSectionTitle() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionTitleTestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionTitle(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusSectionText() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionTextTestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionText",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionText(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSectionEntry80() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionEntry80TestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionEntry80",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_ENTRY80__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionEntry80(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionEntry80TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSectionEntry82() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionEntry82TestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionEntry82",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_ENTRY82__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionEntry82(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionEntry82TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSectionEntry84() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionEntry84TestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionEntry84",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_ENTRY84__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionEntry84(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionEntry84TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSectionEntry86() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionEntry86TestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionEntry86",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_ENTRY86__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionEntry86(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionEntry86TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSectionEntry88() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionEntry88TestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionEntry88",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_ENTRY88__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionEntry88(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionEntry88TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSectionEntry90() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionEntry90TestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionEntry90",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_ENTRY90__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionEntry90(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionEntry90TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSectionEntry92() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionEntry92TestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionEntry92",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_ENTRY92__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionEntry92(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionEntry92TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSectionEntry94() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionEntry94TestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionEntry94",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_ENTRY94__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionEntry94(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionEntry94TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSectionEntry96() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionEntry96TestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionEntry96",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_ENTRY96__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionEntry96(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionEntry96TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSectionEntry98() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionEntry98TestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionEntry98",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_ENTRY98__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionEntry98(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionEntry98TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSectionEntry100() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionEntry100TestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionEntry100",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_ENTRY100__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionEntry100(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionEntry100TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSectionEntry102() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionEntry102TestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionEntry102",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_ENTRY102__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionEntry102(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionEntry102TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSectionFunctionalStatusResultOrganizerEntryFunctionalStatusResultOrganizer81() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionFunctionalStatusResultOrganizerEntryFunctionalStatusResultOrganizer81TestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionFunctionalStatusResultOrganizerEntryFunctionalStatusResultOrganizer81",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_RESULT_ORGANIZER_ENTRY_FUNCTIONAL_STATUS_RESULT_ORGANIZER81__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionFunctionalStatusResultOrganizerEntryFunctionalStatusResultOrganizer81(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionFunctionalStatusResultOrganizerEntryFunctionalStatusResultOrganizer81TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSectionFunctionalStatusResultObservationEntryFunctionalStatusResultObservation83() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionFunctionalStatusResultObservationEntryFunctionalStatusResultObservation83TestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionFunctionalStatusResultObservationEntryFunctionalStatusResultObservation83",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_RESULT_OBSERVATION_ENTRY_FUNCTIONAL_STATUS_RESULT_OBSERVATION83__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionFunctionalStatusResultObservationEntryFunctionalStatusResultObservation83(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionFunctionalStatusResultObservationEntryFunctionalStatusResultObservation83TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSectionCognitiveStatusResultOrganizerEntryCognitiveStatusResultOrganizer85() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionCognitiveStatusResultOrganizerEntryCognitiveStatusResultOrganizer85TestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionCognitiveStatusResultOrganizerEntryCognitiveStatusResultOrganizer85",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_RESULT_ORGANIZER_ENTRY_COGNITIVE_STATUS_RESULT_ORGANIZER85__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionCognitiveStatusResultOrganizerEntryCognitiveStatusResultOrganizer85(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionCognitiveStatusResultOrganizerEntryCognitiveStatusResultOrganizer85TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSectionCognitiveStatusResultObservationEntryCognitiveStatusResultObservation87() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionCognitiveStatusResultObservationEntryCognitiveStatusResultObservation87TestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionCognitiveStatusResultObservationEntryCognitiveStatusResultObservation87",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_RESULT_OBSERVATION_ENTRY_COGNITIVE_STATUS_RESULT_OBSERVATION87__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionCognitiveStatusResultObservationEntryCognitiveStatusResultObservation87(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionCognitiveStatusResultObservationEntryCognitiveStatusResultObservation87TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSectionCognitiveStatusProblemObservationEntryCognitiveStatusProblemObservation89() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionCognitiveStatusProblemObservationEntryCognitiveStatusProblemObservation89TestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionCognitiveStatusProblemObservationEntryCognitiveStatusProblemObservation89",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_PROBLEM_OBSERVATION_ENTRY_COGNITIVE_STATUS_PROBLEM_OBSERVATION89__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionCognitiveStatusProblemObservationEntryCognitiveStatusProblemObservation89(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionCognitiveStatusProblemObservationEntryCognitiveStatusProblemObservation89TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSectionFunctionalStatusProblemObservationEntryFunctionalStatusProblemObservation91() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionFunctionalStatusProblemObservationEntryFunctionalStatusProblemObservation91TestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionFunctionalStatusProblemObservationEntryFunctionalStatusProblemObservation91",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_ENTRY_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION91__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionFunctionalStatusProblemObservationEntryFunctionalStatusProblemObservation91(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionFunctionalStatusProblemObservationEntryFunctionalStatusProblemObservation91TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSectionCaregiverCharacteristicsEntryCaregiverCharacteristics93() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionCaregiverCharacteristicsEntryCaregiverCharacteristics93TestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionCaregiverCharacteristicsEntryCaregiverCharacteristics93",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_SECTION_CAREGIVER_CHARACTERISTICS_ENTRY_CAREGIVER_CHARACTERISTICS93__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionCaregiverCharacteristicsEntryCaregiverCharacteristics93(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionCaregiverCharacteristicsEntryCaregiverCharacteristics93TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSectionAssessmentScaleObservationEntryAssessmentScaleObservation95() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionAssessmentScaleObservationEntryAssessmentScaleObservation95TestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionAssessmentScaleObservationEntryAssessmentScaleObservation95",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_SECTION_ASSESSMENT_SCALE_OBSERVATION_ENTRY_ASSESSMENT_SCALE_OBSERVATION95__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionAssessmentScaleObservationEntryAssessmentScaleObservation95(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionAssessmentScaleObservationEntryAssessmentScaleObservation95TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSectionNonMedicinalSupplyActivityEntryNonMedicinalSupplyActivity97() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionNonMedicinalSupplyActivityEntryNonMedicinalSupplyActivity97TestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionNonMedicinalSupplyActivityEntryNonMedicinalSupplyActivity97",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY_ENTRY_NON_MEDICINAL_SUPPLY_ACTIVITY97__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionNonMedicinalSupplyActivityEntryNonMedicinalSupplyActivity97(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionNonMedicinalSupplyActivityEntryNonMedicinalSupplyActivity97TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSectionPressureUlcerObservationEntryPressureUlcerObservation99() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionPressureUlcerObservationEntryPressureUlcerObservation99TestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionPressureUlcerObservationEntryPressureUlcerObservation99",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_SECTION_PRESSURE_ULCER_OBSERVATION_ENTRY_PRESSURE_ULCER_OBSERVATION99__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionPressureUlcerObservationEntryPressureUlcerObservation99(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionPressureUlcerObservationEntryPressureUlcerObservation99TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSectionNumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation101() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionNumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation101TestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionNumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation101",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_SECTION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION101__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionNumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation101(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionNumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation101TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSectionHighestPressureUlcerStageEntryHighestPressureUlcerStage103() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionHighestPressureUlcerStageEntryHighestPressureUlcerStage103TestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionHighestPressureUlcerStageEntryHighestPressureUlcerStage103",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_SECTION_HIGHEST_PRESSURE_ULCER_STAGE_ENTRY_HIGHEST_PRESSURE_ULCER_STAGE103__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionHighestPressureUlcerStageEntryHighestPressureUlcerStage103(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionHighestPressureUlcerStageEntryHighestPressureUlcerStage103TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FunctionalStatusSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FunctionalStatusSection> {
		@Override
		public FunctionalStatusSection create() {
			return ConsolFactory.eINSTANCE.createFunctionalStatusSection();
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
	private static class ConstructorTestClass extends FunctionalStatusSectionOperations {
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

} // FunctionalStatusSectionOperations
