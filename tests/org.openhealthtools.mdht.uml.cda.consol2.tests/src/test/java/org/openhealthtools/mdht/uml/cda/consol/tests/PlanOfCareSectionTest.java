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
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlanOfCareSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Plan Of Care Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionEntry134(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Entry134</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionEntry136(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Entry136</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionEntry138(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Entry138</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionEntry140(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Entry140</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionEntry142(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Entry142</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionEntry144(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Entry144</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionEntry146(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Entry146</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionPlanOfCareActivityActEntryPlanOfCareActivityAct135(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Act Entry Plan Of Care Activity Act135</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionPlanOfCareActivityEncounterEntryPlanOfCareActivityEncounter137(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Encounter Entry Plan Of Care Activity Encounter137</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionPlanOfCareActivityObservationEntryPlanOfCareActivityObservation139(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Observation Entry Plan Of Care Activity Observation139</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionPlanOfCareActivityProcedureEntryPlanOfCareActivityProcedure141(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Procedure Entry Plan Of Care Activity Procedure141</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministrationEntryPlanOfCareActivitySubstanceAdministration143(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Substance Administration Entry Plan Of Care Activity Substance Administration143</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionPlanOfCareActivitySupplyEntryPlanOfCareActivitySupply145(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Supply Entry Plan Of Care Activity Supply145</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionInstructionsEntryInstructions147(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Instructions Entry Instructions147</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlanOfCareSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareSectionTemplateId() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionTemplateIdTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionTemplateId(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareSectionCode() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionCodeTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionCode(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareSectionCodeP() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionCodePTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionCodeP(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareSectionTitle() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionTitleTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionTitle(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareSectionText() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionTextTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionText",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionText(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfCareSectionEntry134() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionEntry134TestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionEntry134",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_ENTRY134__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionEntry134(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionEntry134TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfCareSectionEntry136() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionEntry136TestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionEntry136",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_ENTRY136__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionEntry136(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionEntry136TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfCareSectionEntry138() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionEntry138TestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionEntry138",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_ENTRY138__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionEntry138(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionEntry138TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfCareSectionEntry140() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionEntry140TestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionEntry140",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_ENTRY140__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionEntry140(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionEntry140TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfCareSectionEntry142() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionEntry142TestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionEntry142",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_ENTRY142__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionEntry142(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionEntry142TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfCareSectionEntry144() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionEntry144TestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionEntry144",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_ENTRY144__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionEntry144(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionEntry144TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfCareSectionEntry146() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionEntry146TestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionEntry146",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_ENTRY146__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionEntry146(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionEntry146TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfCareSectionPlanOfCareActivityActEntryPlanOfCareActivityAct135() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionPlanOfCareActivityActEntryPlanOfCareActivityAct135TestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionPlanOfCareActivityActEntryPlanOfCareActivityAct135",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ACT_ENTRY_PLAN_OF_CARE_ACTIVITY_ACT135__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionPlanOfCareActivityActEntryPlanOfCareActivityAct135(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionPlanOfCareActivityActEntryPlanOfCareActivityAct135TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfCareSectionPlanOfCareActivityEncounterEntryPlanOfCareActivityEncounter137() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionPlanOfCareActivityEncounterEntryPlanOfCareActivityEncounter137TestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionPlanOfCareActivityEncounterEntryPlanOfCareActivityEncounter137",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_ENTRY_PLAN_OF_CARE_ACTIVITY_ENCOUNTER137__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionPlanOfCareActivityEncounterEntryPlanOfCareActivityEncounter137(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionPlanOfCareActivityEncounterEntryPlanOfCareActivityEncounter137TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfCareSectionPlanOfCareActivityObservationEntryPlanOfCareActivityObservation139() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionPlanOfCareActivityObservationEntryPlanOfCareActivityObservation139TestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionPlanOfCareActivityObservationEntryPlanOfCareActivityObservation139",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION_ENTRY_PLAN_OF_CARE_ACTIVITY_OBSERVATION139__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionPlanOfCareActivityObservationEntryPlanOfCareActivityObservation139(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionPlanOfCareActivityObservationEntryPlanOfCareActivityObservation139TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfCareSectionPlanOfCareActivityProcedureEntryPlanOfCareActivityProcedure141() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionPlanOfCareActivityProcedureEntryPlanOfCareActivityProcedure141TestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionPlanOfCareActivityProcedureEntryPlanOfCareActivityProcedure141",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE_ENTRY_PLAN_OF_CARE_ACTIVITY_PROCEDURE141__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionPlanOfCareActivityProcedureEntryPlanOfCareActivityProcedure141(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionPlanOfCareActivityProcedureEntryPlanOfCareActivityProcedure141TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfCareSectionPlanOfCareActivitySubstanceAdministrationEntryPlanOfCareActivitySubstanceAdministration143() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministrationEntryPlanOfCareActivitySubstanceAdministration143TestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministrationEntryPlanOfCareActivitySubstanceAdministration143",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ENTRY_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION143__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministrationEntryPlanOfCareActivitySubstanceAdministration143(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministrationEntryPlanOfCareActivitySubstanceAdministration143TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfCareSectionPlanOfCareActivitySupplyEntryPlanOfCareActivitySupply145() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionPlanOfCareActivitySupplyEntryPlanOfCareActivitySupply145TestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionPlanOfCareActivitySupplyEntryPlanOfCareActivitySupply145",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUPPLY_ENTRY_PLAN_OF_CARE_ACTIVITY_SUPPLY145__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionPlanOfCareActivitySupplyEntryPlanOfCareActivitySupply145(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionPlanOfCareActivitySupplyEntryPlanOfCareActivitySupply145TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfCareSectionInstructionsEntryInstructions147() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionInstructionsEntryInstructions147TestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionInstructionsEntryInstructions147",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_CARE_SECTION_INSTRUCTIONS_ENTRY_INSTRUCTIONS147__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionInstructionsEntryInstructions147(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionInstructionsEntryInstructions147TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PlanOfCareSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PlanOfCareSection> {
		@Override
		public PlanOfCareSection create() {
			return ConsolFactory.eINSTANCE.createPlanOfCareSection();
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
	private static class ConstructorTestClass extends PlanOfCareSectionOperations {
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

} // PlanOfCareSectionOperations
