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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.FunctionalStatusSection2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Functional Status Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSection2Entry1062(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section2 Entry1062</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSection2Entry1064(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section2 Entry1064</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSection2Entry1066(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section2 Entry1066</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSection2Entry1068(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section2 Entry1068</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSection2Entry1070(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section2 Entry1070</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSection2Entry1072(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section2 Entry1072</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSection2Entry1074(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section2 Entry1074</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSection2Entry1076(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section2 Entry1076</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSection2Entry1078(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section2 Entry1078</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSection2FunctionalStatusOrganizer2EntryFunctionalStatusOrganizer21063(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section2 Functional Status Organizer2 Entry Functional Status Organizer21063</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSection2FunctionalStatusObservation2EntryFunctionalStatusObservation21065(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section2 Functional Status Observation2 Entry Functional Status Observation21065</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSection2CognitiveStatusResultOrganizerEntryCognitiveStatusResultOrganizer1067(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section2 Cognitive Status Result Organizer Entry Cognitive Status Result Organizer1067</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSection2CognitiveStatusResultObservationEntryCognitiveStatusResultObservation1069(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section2 Cognitive Status Result Observation Entry Cognitive Status Result Observation1069</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSection2NonMedicinalSupplyActivity2EntryNonMedicinalSupplyActivity21071(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section2 Non Medicinal Supply Activity2 Entry Non Medicinal Supply Activity21071</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSection2NumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation1073(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section2 Number Of Pressure Ulcers Observation Entry Number Of Pressure Ulcers Observation1073</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSection2HighestPressureUlcerStageEntryHighestPressureUlcerStage1075(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section2 Highest Pressure Ulcer Stage Entry Highest Pressure Ulcer Stage1075</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSection2SelfCareActivitiesEntrySelfCareActivities1077(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section2 Self Care Activities Entry Self Care Activities1077</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSection2SensoryStatusEntrySensoryAndSpeechStatus1079(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section2 Sensory Status Entry Sensory And Speech Status1079</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FunctionalStatusSection2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusSectionCodeP() {
		OperationsTestCase<FunctionalStatusSection2> validateFunctionalStatusSectionCodePTestCase = new OperationsTestCase<FunctionalStatusSection2>(
			"validateFunctionalStatusSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSection2Operations.validateFunctionalStatusSectionCodeP(
					(FunctionalStatusSection2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSection2Entry1062() {
		OperationsTestCase<FunctionalStatusSection2> validateFunctionalStatusSection2Entry1062TestCase = new OperationsTestCase<FunctionalStatusSection2>(
			"validateFunctionalStatusSection2Entry1062", operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_SECTION2_ENTRY1062__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSection2Operations.validateFunctionalStatusSection2Entry1062(
					(FunctionalStatusSection2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSection2Entry1062TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSection2Entry1064() {
		OperationsTestCase<FunctionalStatusSection2> validateFunctionalStatusSection2Entry1064TestCase = new OperationsTestCase<FunctionalStatusSection2>(
			"validateFunctionalStatusSection2Entry1064", operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_SECTION2_ENTRY1064__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSection2Operations.validateFunctionalStatusSection2Entry1064(
					(FunctionalStatusSection2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSection2Entry1064TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSection2Entry1066() {
		OperationsTestCase<FunctionalStatusSection2> validateFunctionalStatusSection2Entry1066TestCase = new OperationsTestCase<FunctionalStatusSection2>(
			"validateFunctionalStatusSection2Entry1066", operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_SECTION2_ENTRY1066__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSection2Operations.validateFunctionalStatusSection2Entry1066(
					(FunctionalStatusSection2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSection2Entry1066TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSection2Entry1068() {
		OperationsTestCase<FunctionalStatusSection2> validateFunctionalStatusSection2Entry1068TestCase = new OperationsTestCase<FunctionalStatusSection2>(
			"validateFunctionalStatusSection2Entry1068", operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_SECTION2_ENTRY1068__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSection2Operations.validateFunctionalStatusSection2Entry1068(
					(FunctionalStatusSection2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSection2Entry1068TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSection2Entry1070() {
		OperationsTestCase<FunctionalStatusSection2> validateFunctionalStatusSection2Entry1070TestCase = new OperationsTestCase<FunctionalStatusSection2>(
			"validateFunctionalStatusSection2Entry1070", operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_SECTION2_ENTRY1070__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSection2Operations.validateFunctionalStatusSection2Entry1070(
					(FunctionalStatusSection2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSection2Entry1070TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSection2Entry1072() {
		OperationsTestCase<FunctionalStatusSection2> validateFunctionalStatusSection2Entry1072TestCase = new OperationsTestCase<FunctionalStatusSection2>(
			"validateFunctionalStatusSection2Entry1072", operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_SECTION2_ENTRY1072__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSection2Operations.validateFunctionalStatusSection2Entry1072(
					(FunctionalStatusSection2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSection2Entry1072TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSection2Entry1074() {
		OperationsTestCase<FunctionalStatusSection2> validateFunctionalStatusSection2Entry1074TestCase = new OperationsTestCase<FunctionalStatusSection2>(
			"validateFunctionalStatusSection2Entry1074", operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_SECTION2_ENTRY1074__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSection2Operations.validateFunctionalStatusSection2Entry1074(
					(FunctionalStatusSection2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSection2Entry1074TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSection2Entry1076() {
		OperationsTestCase<FunctionalStatusSection2> validateFunctionalStatusSection2Entry1076TestCase = new OperationsTestCase<FunctionalStatusSection2>(
			"validateFunctionalStatusSection2Entry1076", operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_SECTION2_ENTRY1076__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSection2Operations.validateFunctionalStatusSection2Entry1076(
					(FunctionalStatusSection2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSection2Entry1076TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSection2Entry1078() {
		OperationsTestCase<FunctionalStatusSection2> validateFunctionalStatusSection2Entry1078TestCase = new OperationsTestCase<FunctionalStatusSection2>(
			"validateFunctionalStatusSection2Entry1078", operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_SECTION2_ENTRY1078__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSection2Operations.validateFunctionalStatusSection2Entry1078(
					(FunctionalStatusSection2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSection2Entry1078TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSection2FunctionalStatusOrganizer2EntryFunctionalStatusOrganizer21063() {
		OperationsTestCase<FunctionalStatusSection2> validateFunctionalStatusSection2FunctionalStatusOrganizer2EntryFunctionalStatusOrganizer21063TestCase = new OperationsTestCase<FunctionalStatusSection2>(
			"validateFunctionalStatusSection2FunctionalStatusOrganizer2EntryFunctionalStatusOrganizer21063",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_SECTION2_FUNCTIONAL_STATUS_ORGANIZER2_ENTRY_FUNCTIONAL_STATUS_ORGANIZER21063__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSection2Operations.validateFunctionalStatusSection2FunctionalStatusOrganizer2EntryFunctionalStatusOrganizer21063(
					(FunctionalStatusSection2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSection2FunctionalStatusOrganizer2EntryFunctionalStatusOrganizer21063TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSection2FunctionalStatusObservation2EntryFunctionalStatusObservation21065() {
		OperationsTestCase<FunctionalStatusSection2> validateFunctionalStatusSection2FunctionalStatusObservation2EntryFunctionalStatusObservation21065TestCase = new OperationsTestCase<FunctionalStatusSection2>(
			"validateFunctionalStatusSection2FunctionalStatusObservation2EntryFunctionalStatusObservation21065",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_SECTION2_FUNCTIONAL_STATUS_OBSERVATION2_ENTRY_FUNCTIONAL_STATUS_OBSERVATION21065__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSection2Operations.validateFunctionalStatusSection2FunctionalStatusObservation2EntryFunctionalStatusObservation21065(
					(FunctionalStatusSection2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSection2FunctionalStatusObservation2EntryFunctionalStatusObservation21065TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSection2CognitiveStatusResultOrganizerEntryCognitiveStatusResultOrganizer1067() {
		OperationsTestCase<FunctionalStatusSection2> validateFunctionalStatusSection2CognitiveStatusResultOrganizerEntryCognitiveStatusResultOrganizer1067TestCase = new OperationsTestCase<FunctionalStatusSection2>(
			"validateFunctionalStatusSection2CognitiveStatusResultOrganizerEntryCognitiveStatusResultOrganizer1067",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_SECTION2_COGNITIVE_STATUS_RESULT_ORGANIZER_ENTRY_COGNITIVE_STATUS_RESULT_ORGANIZER1067__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSection2Operations.validateFunctionalStatusSection2CognitiveStatusResultOrganizerEntryCognitiveStatusResultOrganizer1067(
					(FunctionalStatusSection2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSection2CognitiveStatusResultOrganizerEntryCognitiveStatusResultOrganizer1067TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSection2CognitiveStatusResultObservationEntryCognitiveStatusResultObservation1069() {
		OperationsTestCase<FunctionalStatusSection2> validateFunctionalStatusSection2CognitiveStatusResultObservationEntryCognitiveStatusResultObservation1069TestCase = new OperationsTestCase<FunctionalStatusSection2>(
			"validateFunctionalStatusSection2CognitiveStatusResultObservationEntryCognitiveStatusResultObservation1069",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_SECTION2_COGNITIVE_STATUS_RESULT_OBSERVATION_ENTRY_COGNITIVE_STATUS_RESULT_OBSERVATION1069__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSection2Operations.validateFunctionalStatusSection2CognitiveStatusResultObservationEntryCognitiveStatusResultObservation1069(
					(FunctionalStatusSection2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSection2CognitiveStatusResultObservationEntryCognitiveStatusResultObservation1069TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSection2NonMedicinalSupplyActivity2EntryNonMedicinalSupplyActivity21071() {
		OperationsTestCase<FunctionalStatusSection2> validateFunctionalStatusSection2NonMedicinalSupplyActivity2EntryNonMedicinalSupplyActivity21071TestCase = new OperationsTestCase<FunctionalStatusSection2>(
			"validateFunctionalStatusSection2NonMedicinalSupplyActivity2EntryNonMedicinalSupplyActivity21071",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_SECTION2_NON_MEDICINAL_SUPPLY_ACTIVITY2_ENTRY_NON_MEDICINAL_SUPPLY_ACTIVITY21071__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSection2Operations.validateFunctionalStatusSection2NonMedicinalSupplyActivity2EntryNonMedicinalSupplyActivity21071(
					(FunctionalStatusSection2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSection2NonMedicinalSupplyActivity2EntryNonMedicinalSupplyActivity21071TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSection2NumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation1073() {
		OperationsTestCase<FunctionalStatusSection2> validateFunctionalStatusSection2NumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation1073TestCase = new OperationsTestCase<FunctionalStatusSection2>(
			"validateFunctionalStatusSection2NumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation1073",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_SECTION2_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION1073__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSection2Operations.validateFunctionalStatusSection2NumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation1073(
					(FunctionalStatusSection2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSection2NumberOfPressureUlcersObservationEntryNumberOfPressureUlcersObservation1073TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSection2HighestPressureUlcerStageEntryHighestPressureUlcerStage1075() {
		OperationsTestCase<FunctionalStatusSection2> validateFunctionalStatusSection2HighestPressureUlcerStageEntryHighestPressureUlcerStage1075TestCase = new OperationsTestCase<FunctionalStatusSection2>(
			"validateFunctionalStatusSection2HighestPressureUlcerStageEntryHighestPressureUlcerStage1075",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_SECTION2_HIGHEST_PRESSURE_ULCER_STAGE_ENTRY_HIGHEST_PRESSURE_ULCER_STAGE1075__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSection2Operations.validateFunctionalStatusSection2HighestPressureUlcerStageEntryHighestPressureUlcerStage1075(
					(FunctionalStatusSection2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSection2HighestPressureUlcerStageEntryHighestPressureUlcerStage1075TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSection2SelfCareActivitiesEntrySelfCareActivities1077() {
		OperationsTestCase<FunctionalStatusSection2> validateFunctionalStatusSection2SelfCareActivitiesEntrySelfCareActivities1077TestCase = new OperationsTestCase<FunctionalStatusSection2>(
			"validateFunctionalStatusSection2SelfCareActivitiesEntrySelfCareActivities1077",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_SECTION2_SELF_CARE_ACTIVITIES_ENTRY_SELF_CARE_ACTIVITIES1077__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSection2Operations.validateFunctionalStatusSection2SelfCareActivitiesEntrySelfCareActivities1077(
					(FunctionalStatusSection2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSection2SelfCareActivitiesEntrySelfCareActivities1077TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusSection2SensoryStatusEntrySensoryAndSpeechStatus1079() {
		OperationsTestCase<FunctionalStatusSection2> validateFunctionalStatusSection2SensoryStatusEntrySensoryAndSpeechStatus1079TestCase = new OperationsTestCase<FunctionalStatusSection2>(
			"validateFunctionalStatusSection2SensoryStatusEntrySensoryAndSpeechStatus1079",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_SECTION2_SENSORY_STATUS_ENTRY_SENSORY_AND_SPEECH_STATUS1079__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSection2Operations.validateFunctionalStatusSection2SensoryStatusEntrySensoryAndSpeechStatus1079(
					(FunctionalStatusSection2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSection2SensoryStatusEntrySensoryAndSpeechStatus1079TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusSectionTemplateId() {
		OperationsTestCase<FunctionalStatusSection2> validateFunctionalStatusSectionTemplateIdTestCase = new OperationsTestCase<FunctionalStatusSection2>(
			"validateFunctionalStatusSectionTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSection2Operations.validateFunctionalStatusSectionTemplateId(
					(FunctionalStatusSection2) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusSection2> validateFunctionalStatusSectionCodeTestCase = new OperationsTestCase<FunctionalStatusSection2>(
			"validateFunctionalStatusSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(FunctionalStatusSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSectionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSection2Operations.validateFunctionalStatusSectionCode(
					(FunctionalStatusSection2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FunctionalStatusSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<FunctionalStatusSection2> {
		@Override
		public FunctionalStatusSection2 create() {
			return ConsolFactory.eINSTANCE.createFunctionalStatusSection2();
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
	private static class ConstructorTestClass extends FunctionalStatusSection2Operations {
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

} // FunctionalStatusSection2Operations
