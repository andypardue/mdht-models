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
import org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlanOfTreatmentSection2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Plan Of Treatment Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2Entry1118(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1118</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2Entry1120(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1120</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2Entry1122(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1122</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2Entry1124(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1124</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2Entry1126(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1126</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2Entry1128(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1128</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2Entry1130(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1130</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2Entry1132(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1132</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2Entry1134(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1134</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2Entry1136(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1136</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2Entry1138(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Entry1138</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2PlannedObservation2EntryPlannedObservation21119(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Planned Observation2 Entry Planned Observation21119</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2PlannedEncounter2EntryPlannedEncounter21121(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Planned Encounter2 Entry Planned Encounter21121</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2PlannedAct2EntryPlannedAct21123(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Planned Act2 Entry Planned Act21123</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2PlannedProcedure2EntryPlannedProcedure21125(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Planned Procedure2 Entry Planned Procedure21125</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2PlannedMedicationActivity2EntryPlannedMedicationActivity21127(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Planned Medication Activity2 Entry Planned Medication Activity21127</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2PlannedSupply2EntryPlannedSupply21129(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Planned Supply2 Entry Planned Supply21129</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2Instruction2EntryInstruction21131(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Instruction2 Entry Instruction21131</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2HandoffCommunicationParticipantsEntryHandoffCommunication1133(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Handoff Communication Participants Entry Handoff Communication1133</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2NutritionRecommendationEntryNutritionRecommendation1135(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Nutrition Recommendation Entry Nutrition Recommendation1135</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2PlannedImmunizationActivityEntryPlannedImmunizationActivity1137(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Planned Immunization Activity Entry Planned Immunization Activity1137</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2GoalObservationEntryGoalObservation1139(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Goal Observation Entry Goal Observation1139</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlanOfTreatmentSection2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfTreatmentSection2Entry1118() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfTreatmentSection2Entry1118TestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfTreatmentSection2Entry1118", operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1118__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {

			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfTreatmentSection2Entry1118(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfTreatmentSection2Entry1118TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfTreatmentSection2Entry1120() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfTreatmentSection2Entry1120TestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfTreatmentSection2Entry1120", operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1120__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {

			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfTreatmentSection2Entry1120(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfTreatmentSection2Entry1120TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfTreatmentSection2Entry1122() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfTreatmentSection2Entry1122TestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfTreatmentSection2Entry1122", operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1122__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {

			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfTreatmentSection2Entry1122(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfTreatmentSection2Entry1122TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfTreatmentSection2Entry1124() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfTreatmentSection2Entry1124TestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfTreatmentSection2Entry1124", operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1124__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {

			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfTreatmentSection2Entry1124(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfTreatmentSection2Entry1124TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfTreatmentSection2Entry1126() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfTreatmentSection2Entry1126TestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfTreatmentSection2Entry1126", operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1126__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {

			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfTreatmentSection2Entry1126(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfTreatmentSection2Entry1126TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfTreatmentSection2Entry1128() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfTreatmentSection2Entry1128TestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfTreatmentSection2Entry1128", operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1128__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {

			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfTreatmentSection2Entry1128(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfTreatmentSection2Entry1128TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfTreatmentSection2Entry1130() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfTreatmentSection2Entry1130TestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfTreatmentSection2Entry1130", operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1130__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {

			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfTreatmentSection2Entry1130(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfTreatmentSection2Entry1130TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfTreatmentSection2Entry1132() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfTreatmentSection2Entry1132TestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfTreatmentSection2Entry1132", operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1132__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {

			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfTreatmentSection2Entry1132(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfTreatmentSection2Entry1132TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfTreatmentSection2Entry1134() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfTreatmentSection2Entry1134TestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfTreatmentSection2Entry1134", operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1134__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {

			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfTreatmentSection2Entry1134(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfTreatmentSection2Entry1134TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfTreatmentSection2Entry1136() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfTreatmentSection2Entry1136TestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfTreatmentSection2Entry1136", operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1136__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {

			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfTreatmentSection2Entry1136(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfTreatmentSection2Entry1136TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfTreatmentSection2Entry1138() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfTreatmentSection2Entry1138TestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfTreatmentSection2Entry1138", operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_TREATMENT_SECTION2_ENTRY1138__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {

			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfTreatmentSection2Entry1138(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfTreatmentSection2Entry1138TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfTreatmentSection2PlannedObservation2EntryPlannedObservation21119() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfTreatmentSection2PlannedObservation2EntryPlannedObservation21119TestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfTreatmentSection2PlannedObservation2EntryPlannedObservation21119",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_OBSERVATION2_ENTRY_PLANNED_OBSERVATION21119__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {

			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfTreatmentSection2PlannedObservation2EntryPlannedObservation21119(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfTreatmentSection2PlannedObservation2EntryPlannedObservation21119TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfTreatmentSection2PlannedEncounter2EntryPlannedEncounter21121() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfTreatmentSection2PlannedEncounter2EntryPlannedEncounter21121TestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfTreatmentSection2PlannedEncounter2EntryPlannedEncounter21121",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_ENCOUNTER2_ENTRY_PLANNED_ENCOUNTER21121__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {

			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfTreatmentSection2PlannedEncounter2EntryPlannedEncounter21121(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfTreatmentSection2PlannedEncounter2EntryPlannedEncounter21121TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfTreatmentSection2PlannedAct2EntryPlannedAct21123() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfTreatmentSection2PlannedAct2EntryPlannedAct21123TestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfTreatmentSection2PlannedAct2EntryPlannedAct21123",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_ACT2_ENTRY_PLANNED_ACT21123__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {

			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfTreatmentSection2PlannedAct2EntryPlannedAct21123(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfTreatmentSection2PlannedAct2EntryPlannedAct21123TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfTreatmentSection2PlannedProcedure2EntryPlannedProcedure21125() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfTreatmentSection2PlannedProcedure2EntryPlannedProcedure21125TestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfTreatmentSection2PlannedProcedure2EntryPlannedProcedure21125",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_PROCEDURE2_ENTRY_PLANNED_PROCEDURE21125__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {

			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfTreatmentSection2PlannedProcedure2EntryPlannedProcedure21125(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfTreatmentSection2PlannedProcedure2EntryPlannedProcedure21125TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfTreatmentSection2PlannedMedicationActivity2EntryPlannedMedicationActivity21127() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfTreatmentSection2PlannedMedicationActivity2EntryPlannedMedicationActivity21127TestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfTreatmentSection2PlannedMedicationActivity2EntryPlannedMedicationActivity21127",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_MEDICATION_ACTIVITY2_ENTRY_PLANNED_MEDICATION_ACTIVITY21127__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {

			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfTreatmentSection2PlannedMedicationActivity2EntryPlannedMedicationActivity21127(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfTreatmentSection2PlannedMedicationActivity2EntryPlannedMedicationActivity21127TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfTreatmentSection2PlannedSupply2EntryPlannedSupply21129() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfTreatmentSection2PlannedSupply2EntryPlannedSupply21129TestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfTreatmentSection2PlannedSupply2EntryPlannedSupply21129",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_SUPPLY2_ENTRY_PLANNED_SUPPLY21129__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {

			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfTreatmentSection2PlannedSupply2EntryPlannedSupply21129(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfTreatmentSection2PlannedSupply2EntryPlannedSupply21129TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfTreatmentSection2Instruction2EntryInstruction21131() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfTreatmentSection2Instruction2EntryInstruction21131TestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfTreatmentSection2Instruction2EntryInstruction21131",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_TREATMENT_SECTION2_INSTRUCTION2_ENTRY_INSTRUCTION21131__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {

			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfTreatmentSection2Instruction2EntryInstruction21131(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfTreatmentSection2Instruction2EntryInstruction21131TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfTreatmentSection2HandoffCommunicationParticipantsEntryHandoffCommunication1133() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfTreatmentSection2HandoffCommunicationParticipantsEntryHandoffCommunication1133TestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfTreatmentSection2HandoffCommunicationParticipantsEntryHandoffCommunication1133",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_TREATMENT_SECTION2_HANDOFF_COMMUNICATION_PARTICIPANTS_ENTRY_HANDOFF_COMMUNICATION1133__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {

			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfTreatmentSection2HandoffCommunicationParticipantsEntryHandoffCommunication1133(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfTreatmentSection2HandoffCommunicationParticipantsEntryHandoffCommunication1133TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfTreatmentSection2NutritionRecommendationEntryNutritionRecommendation1135() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfTreatmentSection2NutritionRecommendationEntryNutritionRecommendation1135TestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfTreatmentSection2NutritionRecommendationEntryNutritionRecommendation1135",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_TREATMENT_SECTION2_NUTRITION_RECOMMENDATION_ENTRY_NUTRITION_RECOMMENDATION1135__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {

			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfTreatmentSection2NutritionRecommendationEntryNutritionRecommendation1135(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfTreatmentSection2NutritionRecommendationEntryNutritionRecommendation1135TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfTreatmentSection2PlannedImmunizationActivityEntryPlannedImmunizationActivity1137() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfTreatmentSection2PlannedImmunizationActivityEntryPlannedImmunizationActivity1137TestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfTreatmentSection2PlannedImmunizationActivityEntryPlannedImmunizationActivity1137",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_IMMUNIZATION_ACTIVITY_ENTRY_PLANNED_IMMUNIZATION_ACTIVITY1137__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {

			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfTreatmentSection2PlannedImmunizationActivityEntryPlannedImmunizationActivity1137(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfTreatmentSection2PlannedImmunizationActivityEntryPlannedImmunizationActivity1137TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfTreatmentSection2GoalObservationEntryGoalObservation1139() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfTreatmentSection2GoalObservationEntryGoalObservation1139TestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfTreatmentSection2GoalObservationEntryGoalObservation1139",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_TREATMENT_SECTION2_GOAL_OBSERVATION_ENTRY_GOAL_OBSERVATION1139__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {

			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfTreatmentSection2GoalObservationEntryGoalObservation1139(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfTreatmentSection2GoalObservationEntryGoalObservation1139TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareSectionTemplateId() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfCareSectionTemplateIdTestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfCareSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {

			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfCareSectionTemplateId(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareSectionCodeP() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfCareSectionCodePTestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfCareSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {

			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfCareSectionCodeP(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareSectionCode() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfCareSectionCodeTestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfCareSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {

			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(PlanOfTreatmentSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSectionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfCareSectionCode(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PlanOfTreatmentSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<PlanOfTreatmentSection2> {
		@Override
		public PlanOfTreatmentSection2 create() {
			return ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2();
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
	private static class ConstructorTestClass extends PlanOfTreatmentSection2Operations {
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

} // PlanOfTreatmentSection2Operations
