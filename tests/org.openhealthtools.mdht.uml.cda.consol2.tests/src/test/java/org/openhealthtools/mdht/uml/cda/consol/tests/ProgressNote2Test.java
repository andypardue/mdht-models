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
import org.openhealthtools.mdht.uml.cda.consol.ProgressNote2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProgressNote2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Progress Note2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Has An Assement And Plan Section2 Or Both Assement Section And Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Does Not Have Assement And Plan Section2 When Assement Or Plan Of Treatment2 Are Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2DocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2Component1510(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component1510</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of Service Event US Realm Date And Time DT Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of Service Event Effective Time Has High When No Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2DocumentationOfServiceEventTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of Service Event Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2DocumentationOfServiceEventClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of Service Event Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2DocumentationOfServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of Service Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2DocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentOfEncompassingEncounterUSRealmDateAndTimeDTLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter US Realm Date And Time DT Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter Location Health Care Facility Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacility(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter Location Health Care Facility</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentOfEncompassingEncounterId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentOfEncompassingEncounterEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentOfEncompassingEncounterLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentStructuredBodyComponentAssessmentSection1513(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Structured Body Component Assessment Section1513</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21515(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Structured Body Component Plan Of Treatment Section21515</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21517(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Structured Body Component Assessment And Plan Section21517</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21519(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Structured Body Component Allergies Section Entries Optional21519</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentStructuredBodyComponentChiefComplaintSection1521(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Structured Body Component Chief Complaint Section1521</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentStructuredBodyComponentInterventionsSection21523(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Structured Body Component Interventions Section21523</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentStructuredBodyComponentInstructionsSection21525(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Structured Body Component Instructions Section21525</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21527(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Structured Body Component Medications Section Entries Optional21527</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentStructuredBodyComponentObjectiveSection1529(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Structured Body Component Objective Section1529</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentStructuredBodyComponentPhysicalExamSection21531(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Structured Body Component Physical Exam Section21531</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentStructuredBodyComponentProblemSectionEntriesOptional21533(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Structured Body Component Problem Section Entries Optional21533</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentStructuredBodyComponentResultsSectionEntriesOptional21535(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Structured Body Component Results Section Entries Optional21535</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentStructuredBodyComponentReviewOfSystemsSection1537(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Structured Body Component Review Of Systems Section1537</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentStructuredBodyComponentSubjectiveSection1539(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Structured Body Component Subjective Section1539</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21541(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Structured Body Component Vital Signs Section Entries Optional21541</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentStructuredBodyComponentNutritionSection1543(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Structured Body Component Nutrition Section1543</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentStructuredBodyAssessmentSection1512(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Structured Body Assessment Section1512</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentStructuredBodyPlanOfTreatmentSection21514(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Structured Body Plan Of Treatment Section21514</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentStructuredBodyAssessmentAndPlanSection21516(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Structured Body Assessment And Plan Section21516</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21518(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Structured Body Allergies Section Entries Optional21518</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentStructuredBodyChiefComplaintSection1520(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Structured Body Chief Complaint Section1520</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentStructuredBodyInterventionsSection21522(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Structured Body Interventions Section21522</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentStructuredBodyInstructionsSection21524(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Structured Body Instructions Section21524</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21526(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Structured Body Medications Section Entries Optional21526</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentStructuredBodyObjectiveSection1528(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Structured Body Objective Section1528</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentStructuredBodyPhysicalExamSection21530(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Structured Body Physical Exam Section21530</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentStructuredBodyProblemSectionEntriesOptional21532(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Structured Body Problem Section Entries Optional21532</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentStructuredBodyResultsSectionEntriesOptional21534(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Structured Body Results Section Entries Optional21534</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentStructuredBodyReviewOfSystemsSection1536(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Structured Body Review Of Systems Section1536</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentStructuredBodySubjectiveSection1538(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Structured Body Subjective Section1538</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentStructuredBodyVitalSignsSectionEntriesOptional21540(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Structured Body Vital Signs Section Entries Optional21540</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentStructuredBodyNutritionSection1542(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Structured Body Nutrition Section1542</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentStructuredBody1511(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Structured Body1511</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProgressNote2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2() {
		OperationsTestCase<ProgressNote2> validateProgressNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent() {
		OperationsTestCase<ProgressNote2> validateProgressNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresentTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_OR_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNote2CodeP() {
		OperationsTestCase<ProgressNote2> validateProgressNote2CodePTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2CodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2CodeP(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNote2Code() {
		OperationsTestCase<ProgressNote2> validateProgressNote2CodeTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2Code",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected void setDependency(ProgressNote2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProgressNote2CodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2Code(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNote2DocumentationOf() {
		OperationsTestCase<ProgressNote2> validateProgressNote2DocumentationOfTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2DocumentationOf",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2DocumentationOf(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2DocumentationOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNote2ComponentOf() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentOfTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentOf",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentOf(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2Component1510() {
		OperationsTestCase<ProgressNote2> validateProgressNote2Component1510TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2Component1510",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE2_COMPONENT1510__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2Component1510(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2Component1510TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow() {
		OperationsTestCase<ProgressNote2> validateProgressNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLowTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_US_REALM_DATE_AND_TIME_DT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth() {
		OperationsTestCase<ProgressNote2> validateProgressNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidthTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidthTestCase.doValidationTest();
	}

	// /**
	// *
	// * @generated
	// */
	// @Test
	// public void testValidateProgressNote2DocumentationOfServiceEventPreciseToTheDay() {
	// OperationsTestCase<ProgressNote2> validateProgressNote2DocumentationOfServiceEventPreciseToTheDayTestCase = new
	// OperationsTestCase<ProgressNote2>(
	// "validateProgressNote2DocumentationOfServiceEventPreciseToTheDay",
	// operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ProgressNote2 target) {
	// target.init();
	// DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
	// ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
	// IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS("200912", "2013");
	// se.setEffectiveTime(ivlts);
	// dof.setServiceEvent(se);
	// target.getDocumentationOfs().add(dof);
	// }
	//
	// @Override
	// protected void updateToPass(ProgressNote2 target) {
	// target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getLow().setValue(
	// PRECISE_TO_DAY);
	// target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getHigh().setValue(
	// PRECISE_TO_MINUTE);
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ProgressNote2Operations.validateProgressNote2DocumentationOfServiceEventPreciseToTheDay(
	// (ProgressNote2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateProgressNote2DocumentationOfServiceEventPreciseToTheDayTestCase.doValidationTest();
	// }
	//
	// /**
	// *
	// * @generated
	// */
	// @Test
	// public void testValidateProgressNote2DocumentationOfServiceEventPreciseToTheMinute() {
	// OperationsTestCase<ProgressNote2> validateProgressNote2DocumentationOfServiceEventPreciseToTheMinuteTestCase = new
	// OperationsTestCase<ProgressNote2>(
	// "validateProgressNote2DocumentationOfServiceEventPreciseToTheMinute",
	// operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ProgressNote2 target) {
	// target.init();
	// DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
	// ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
	// IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
	// IVXB_TS low = DatatypesFactory.eINSTANCE.createIVXB_TS();
	// low.setValue("2009121217");
	// ts.setLow(low);
	// se.setEffectiveTime(ts);
	// dof.setServiceEvent(se);
	// target.getDocumentationOfs().add(dof);
	// }
	//
	// @Override
	// protected void updateToPass(ProgressNote2 target) {
	// target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getLow().setValue(
	// PRECISE_TO_MINUTE);
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ProgressNote2Operations.validateProgressNote2DocumentationOfServiceEventPreciseToTheMinute(
	// (ProgressNote2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateProgressNote2DocumentationOfServiceEventPreciseToTheMinuteTestCase.doValidationTest();
	// }
	//
	// /**
	// *
	// * @generated
	// */
	// @Test
	// public void testValidateProgressNote2DocumentationOfServiceEventPreciseToTheSecond() {
	// OperationsTestCase<ProgressNote2> validateProgressNote2DocumentationOfServiceEventPreciseToTheSecondTestCase = new
	// OperationsTestCase<ProgressNote2>(
	// "validateProgressNote2DocumentationOfServiceEventPreciseToTheSecond",
	// operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ProgressNote2 target) {
	// target.init();
	// DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
	// ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
	// IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
	// IVXB_TS high = DatatypesFactory.eINSTANCE.createIVXB_TS();
	// high.setValue(PRECISE_TO_MINUTE);
	// ts.setHigh(high);
	// se.setEffectiveTime(ts);
	// dof.setServiceEvent(se);
	// target.getDocumentationOfs().add(dof);
	// }
	//
	// @Override
	// protected void updateToPass(ProgressNote2 target) {
	// target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getHigh().setValue(
	// PRECISE_TO_SECOND);
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ProgressNote2Operations.validateProgressNote2DocumentationOfServiceEventPreciseToTheSecond(
	// (ProgressNote2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateProgressNote2DocumentationOfServiceEventPreciseToTheSecondTestCase.doValidationTest();
	// }
	//
	// /**
	// *
	// * @generated
	// */
	// @Test
	// public void testValidateProgressNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset() {
	// OperationsTestCase<ProgressNote2> validateProgressNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffsetTestCase = new
	// OperationsTestCase<ProgressNote2>(
	// "validateProgressNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset",
	// operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ProgressNote2 target) {
	// target.init();
	// DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
	// ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
	// IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS(PRECISE_TO_MINUTE, PRECISE_TO_SECOND);
	// se.setEffectiveTime(ivlts);
	// dof.setServiceEvent(se);
	// target.getDocumentationOfs().add(dof);
	// }
	//
	// @Override
	// protected void updateToPass(ProgressNote2 target) {
	// target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getLow().setValue(
	// PRECISE_TO_MS_WITH_TIMEZONE);
	// target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getHigh().setValue(
	// PRECISE_TO_HOUR_WITH_TIMEZONE);
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ProgressNote2Operations.validateProgressNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset(
	// (ProgressNote2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateProgressNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffsetTestCase.doValidationTest();
	// }

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNote2DocumentationOfServiceEventTemplateId() {
		OperationsTestCase<ProgressNote2> validateProgressNote2DocumentationOfServiceEventTemplateIdTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2DocumentationOfServiceEventTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2DocumentationOfServiceEventTemplateId(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2DocumentationOfServiceEventTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNote2DocumentationOfServiceEventClassCode() {
		OperationsTestCase<ProgressNote2> validateProgressNote2DocumentationOfServiceEventClassCodeTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2DocumentationOfServiceEventClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2DocumentationOfServiceEventClassCode(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2DocumentationOfServiceEventClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNote2DocumentationOfServiceEventEffectiveTime() {
		OperationsTestCase<ProgressNote2> validateProgressNote2DocumentationOfServiceEventEffectiveTimeTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2DocumentationOfServiceEventEffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2DocumentationOfServiceEventEffectiveTime(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2DocumentationOfServiceEventEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNote2DocumentationOfServiceEvent() {
		OperationsTestCase<ProgressNote2> validateProgressNote2DocumentationOfServiceEventTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2DocumentationOfServiceEvent",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2DocumentationOfServiceEvent(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2DocumentationOfServiceEventTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNote2ComponentOfEncompassingEncounterUSRealmDateAndTimeDTLow() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentOfEncompassingEncounterUSRealmDateAndTimeDTLowTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentOfEncompassingEncounterUSRealmDateAndTimeDTLow",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_US_REALM_DATE_AND_TIME_DT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounterUSRealmDateAndTimeDTLow(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentOfEncompassingEncounterUSRealmDateAndTimeDTLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityIdTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacility() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacility",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacility(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityTestCase.doValidationTest();
	}

	// /**
	// *
	// * @generated
	// */
	// @Test
	// public void testValidateProgressNote2ComponentOfEncompassingEncounterPreciseToTheDay() {
	// OperationsTestCase<ProgressNote2> validateProgressNote2ComponentOfEncompassingEncounterPreciseToTheDayTestCase = new
	// OperationsTestCase<ProgressNote2>(
	// "validateProgressNote2ComponentOfEncompassingEncounterPreciseToTheDay",
	// operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ProgressNote2 target) {
	// target.init();
	// Component1 component = CDAFactory.eINSTANCE.createComponent1();
	// EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
	// component.setEncompassingEncounter(ee);
	// target.setComponentOf(component);
	//
	// IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS("200912");
	// ee.setEffectiveTime(ivlts);
	// }
	//
	// @Override
	// protected void updateToPass(ProgressNote2 target) {
	// target.getComponentOf().getEncompassingEncounter().getEffectiveTime().setValue(PRECISE_TO_DAY);
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounterPreciseToTheDay(
	// (ProgressNote2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateProgressNote2ComponentOfEncompassingEncounterPreciseToTheDayTestCase.doValidationTest();
	// }
	//
	// /**
	// *
	// * @generated
	// */
	// @Test
	// public void testValidateProgressNote2ComponentOfEncompassingEncounterPreciseToTheMinute() {
	// OperationsTestCase<ProgressNote2> validateProgressNote2ComponentOfEncompassingEncounterPreciseToTheMinuteTestCase = new
	// OperationsTestCase<ProgressNote2>(
	// "validateProgressNote2ComponentOfEncompassingEncounterPreciseToTheMinute",
	// operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ProgressNote2 target) {
	// target.init();
	// Component1 component = CDAFactory.eINSTANCE.createComponent1();
	// EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
	// component.setEncompassingEncounter(ee);
	// target.setComponentOf(component);
	//
	// IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS("2009121217");
	// ee.setEffectiveTime(ivlts);
	// }
	//
	// @Override
	// protected void updateToPass(ProgressNote2 target) {
	// target.getComponentOf().getEncompassingEncounter().getEffectiveTime().setValue(PRECISE_TO_MINUTE);
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounterPreciseToTheMinute(
	// (ProgressNote2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateProgressNote2ComponentOfEncompassingEncounterPreciseToTheMinuteTestCase.doValidationTest();
	// }
	//
	// /**
	// *
	// * @generated
	// */
	// @Test
	// public void testValidateProgressNote2ComponentOfEncompassingEncounterPreciseToTheSecond() {
	// OperationsTestCase<ProgressNote2> validateProgressNote2ComponentOfEncompassingEncounterPreciseToTheSecondTestCase = new
	// OperationsTestCase<ProgressNote2>(
	// "validateProgressNote2ComponentOfEncompassingEncounterPreciseToTheSecond",
	// operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ProgressNote2 target) {
	// target.init();
	// Component1 component = CDAFactory.eINSTANCE.createComponent1();
	// EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
	// component.setEncompassingEncounter(ee);
	// target.setComponentOf(component);
	//
	// IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS(PRECISE_TO_MINUTE);
	// ee.setEffectiveTime(ivlts);
	// }
	//
	// @Override
	// protected void updateToPass(ProgressNote2 target) {
	// target.getComponentOf().getEncompassingEncounter().getEffectiveTime().setValue(PRECISE_TO_SECOND);
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounterPreciseToTheSecond(
	// (ProgressNote2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateProgressNote2ComponentOfEncompassingEncounterPreciseToTheSecondTestCase.doValidationTest();
	// }
	//
	// /**
	// *
	// * @generated
	// */
	// @Test
	// public void testValidateProgressNote2ComponentOfEncompassingEncounterIfMorePreciseThanDayIncludeTimeZoneOffset() {
	// OperationsTestCase<ProgressNote2> validateProgressNote2ComponentOfEncompassingEncounterIfMorePreciseThanDayIncludeTimeZoneOffsetTestCase = new
	// OperationsTestCase<ProgressNote2>(
	// "validateProgressNote2ComponentOfEncompassingEncounterIfMorePreciseThanDayIncludeTimeZoneOffset",
	// operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ProgressNote2 target) {
	// target.init();
	// Component1 component = CDAFactory.eINSTANCE.createComponent1();
	// EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
	// component.setEncompassingEncounter(ee);
	// target.setComponentOf(component);
	//
	// IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS("2009121217");
	// ee.setEffectiveTime(ivlts);
	// }
	//
	// @Override
	// protected void updateToPass(ProgressNote2 target) {
	// target.getComponentOf().getEncompassingEncounter().getEffectiveTime().setValue(
	// PRECISE_TO_HOUR_WITH_TIMEZONE);
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounterIfMorePreciseThanDayIncludeTimeZoneOffset(
	// (ProgressNote2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateProgressNote2ComponentOfEncompassingEncounterIfMorePreciseThanDayIncludeTimeZoneOffsetTestCase.doValidationTest();
	// }

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNote2ComponentOfEncompassingEncounterId() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentOfEncompassingEncounterIdTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentOfEncompassingEncounterId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounterId(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentOfEncompassingEncounterIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNote2ComponentOfEncompassingEncounterEffectiveTime() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentOfEncompassingEncounterEffectiveTimeTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentOfEncompassingEncounterEffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounterEffectiveTime(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentOfEncompassingEncounterEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNote2ComponentOfEncompassingEncounterLocation() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentOfEncompassingEncounterLocationTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentOfEncompassingEncounterLocation",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounterLocation(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentOfEncompassingEncounterLocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNote2ComponentOfEncompassingEncounter() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentOfEncompassingEncounterTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentOfEncompassingEncounter",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounter(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentOfEncompassingEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2ComponentStructuredBodyComponentAssessmentSection1513() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentStructuredBodyComponentAssessmentSection1513TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentStructuredBodyComponentAssessmentSection1513",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION1513__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyComponentAssessmentSection1513(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentStructuredBodyComponentAssessmentSection1513TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21515() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21515TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21515",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21515__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21515(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21515TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21517() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21517TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21517",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION21517__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21517(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21517TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21519() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21519TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21519",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL21519__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21519(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21519TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2ComponentStructuredBodyComponentChiefComplaintSection1521() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentStructuredBodyComponentChiefComplaintSection1521TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentStructuredBodyComponentChiefComplaintSection1521",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION1521__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyComponentChiefComplaintSection1521(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentStructuredBodyComponentChiefComplaintSection1521TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2ComponentStructuredBodyComponentInterventionsSection21523() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentStructuredBodyComponentInterventionsSection21523TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentStructuredBodyComponentInterventionsSection21523",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_INTERVENTIONS_SECTION21523__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyComponentInterventionsSection21523(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentStructuredBodyComponentInterventionsSection21523TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2ComponentStructuredBodyComponentInstructionsSection21525() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentStructuredBodyComponentInstructionsSection21525TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentStructuredBodyComponentInstructionsSection21525",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_INSTRUCTIONS_SECTION21525__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyComponentInstructionsSection21525(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentStructuredBodyComponentInstructionsSection21525TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21527() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21527TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21527",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21527__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21527(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentStructuredBodyComponentMedicationsSectionEntriesOptional21527TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2ComponentStructuredBodyComponentObjectiveSection1529() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentStructuredBodyComponentObjectiveSection1529TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentStructuredBodyComponentObjectiveSection1529",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_OBJECTIVE_SECTION1529__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyComponentObjectiveSection1529(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentStructuredBodyComponentObjectiveSection1529TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2ComponentStructuredBodyComponentPhysicalExamSection21531() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentStructuredBodyComponentPhysicalExamSection21531TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentStructuredBodyComponentPhysicalExamSection21531",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION21531__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyComponentPhysicalExamSection21531(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentStructuredBodyComponentPhysicalExamSection21531TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2ComponentStructuredBodyComponentProblemSectionEntriesOptional21533() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentStructuredBodyComponentProblemSectionEntriesOptional21533TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentStructuredBodyComponentProblemSectionEntriesOptional21533",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION_ENTRIES_OPTIONAL21533__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyComponentProblemSectionEntriesOptional21533(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentStructuredBodyComponentProblemSectionEntriesOptional21533TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2ComponentStructuredBodyComponentResultsSectionEntriesOptional21535() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentStructuredBodyComponentResultsSectionEntriesOptional21535TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentStructuredBodyComponentResultsSectionEntriesOptional21535",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION_ENTRIES_OPTIONAL21535__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyComponentResultsSectionEntriesOptional21535(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentStructuredBodyComponentResultsSectionEntriesOptional21535TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2ComponentStructuredBodyComponentReviewOfSystemsSection1537() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentStructuredBodyComponentReviewOfSystemsSection1537TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentStructuredBodyComponentReviewOfSystemsSection1537",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION1537__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyComponentReviewOfSystemsSection1537(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentStructuredBodyComponentReviewOfSystemsSection1537TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2ComponentStructuredBodyComponentSubjectiveSection1539() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentStructuredBodyComponentSubjectiveSection1539TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentStructuredBodyComponentSubjectiveSection1539",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_SUBJECTIVE_SECTION1539__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyComponentSubjectiveSection1539(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentStructuredBodyComponentSubjectiveSection1539TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21541() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21541TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21541",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL21541__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21541(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21541TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2ComponentStructuredBodyComponentNutritionSection1543() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentStructuredBodyComponentNutritionSection1543TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentStructuredBodyComponentNutritionSection1543",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION1543__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyComponentNutritionSection1543(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentStructuredBodyComponentNutritionSection1543TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2ComponentStructuredBodyAssessmentSection1512() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentStructuredBodyAssessmentSection1512TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentStructuredBodyAssessmentSection1512",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION1512__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyAssessmentSection1512(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentStructuredBodyAssessmentSection1512TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2ComponentStructuredBodyPlanOfTreatmentSection21514() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentStructuredBodyPlanOfTreatmentSection21514TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentStructuredBodyPlanOfTreatmentSection21514",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21514__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyPlanOfTreatmentSection21514(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentStructuredBodyPlanOfTreatmentSection21514TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2ComponentStructuredBodyAssessmentAndPlanSection21516() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentStructuredBodyAssessmentAndPlanSection21516TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentStructuredBodyAssessmentAndPlanSection21516",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION21516__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyAssessmentAndPlanSection21516(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentStructuredBodyAssessmentAndPlanSection21516TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21518() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21518TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21518",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL21518__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21518(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentStructuredBodyAllergiesSectionEntriesOptional21518TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2ComponentStructuredBodyChiefComplaintSection1520() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentStructuredBodyChiefComplaintSection1520TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentStructuredBodyChiefComplaintSection1520",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION1520__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyChiefComplaintSection1520(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentStructuredBodyChiefComplaintSection1520TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2ComponentStructuredBodyInterventionsSection21522() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentStructuredBodyInterventionsSection21522TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentStructuredBodyInterventionsSection21522",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_STRUCTURED_BODY_INTERVENTIONS_SECTION21522__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyInterventionsSection21522(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentStructuredBodyInterventionsSection21522TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2ComponentStructuredBodyInstructionsSection21524() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentStructuredBodyInstructionsSection21524TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentStructuredBodyInstructionsSection21524",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_STRUCTURED_BODY_INSTRUCTIONS_SECTION21524__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyInstructionsSection21524(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentStructuredBodyInstructionsSection21524TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21526() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21526TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21526",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21526__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21526(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentStructuredBodyMedicationsSectionEntriesOptional21526TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2ComponentStructuredBodyObjectiveSection1528() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentStructuredBodyObjectiveSection1528TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentStructuredBodyObjectiveSection1528",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_STRUCTURED_BODY_OBJECTIVE_SECTION1528__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyObjectiveSection1528(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentStructuredBodyObjectiveSection1528TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2ComponentStructuredBodyPhysicalExamSection21530() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentStructuredBodyPhysicalExamSection21530TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentStructuredBodyPhysicalExamSection21530",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION21530__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyPhysicalExamSection21530(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentStructuredBodyPhysicalExamSection21530TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2ComponentStructuredBodyProblemSectionEntriesOptional21532() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentStructuredBodyProblemSectionEntriesOptional21532TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentStructuredBodyProblemSectionEntriesOptional21532",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION_ENTRIES_OPTIONAL21532__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyProblemSectionEntriesOptional21532(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentStructuredBodyProblemSectionEntriesOptional21532TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2ComponentStructuredBodyResultsSectionEntriesOptional21534() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentStructuredBodyResultsSectionEntriesOptional21534TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentStructuredBodyResultsSectionEntriesOptional21534",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION_ENTRIES_OPTIONAL21534__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyResultsSectionEntriesOptional21534(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentStructuredBodyResultsSectionEntriesOptional21534TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2ComponentStructuredBodyReviewOfSystemsSection1536() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentStructuredBodyReviewOfSystemsSection1536TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentStructuredBodyReviewOfSystemsSection1536",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION1536__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyReviewOfSystemsSection1536(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentStructuredBodyReviewOfSystemsSection1536TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2ComponentStructuredBodySubjectiveSection1538() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentStructuredBodySubjectiveSection1538TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentStructuredBodySubjectiveSection1538",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_STRUCTURED_BODY_SUBJECTIVE_SECTION1538__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodySubjectiveSection1538(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentStructuredBodySubjectiveSection1538TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2ComponentStructuredBodyVitalSignsSectionEntriesOptional21540() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentStructuredBodyVitalSignsSectionEntriesOptional21540TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentStructuredBodyVitalSignsSectionEntriesOptional21540",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL21540__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyVitalSignsSectionEntriesOptional21540(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentStructuredBodyVitalSignsSectionEntriesOptional21540TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2ComponentStructuredBodyNutritionSection1542() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentStructuredBodyNutritionSection1542TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentStructuredBodyNutritionSection1542",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION1542__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentStructuredBodyNutritionSection1542(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentStructuredBodyNutritionSection1542TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNote2ComponentStructuredBody1511() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentStructuredBody1511TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentStructuredBody1511",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_STRUCTURED_BODY1511__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentStructuredBody1511(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentStructuredBody1511TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<ProgressNote2> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<ProgressNote2>(
			"validateGeneralHeaderConstraintsTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateGeneralHeaderConstraintsTemplateId(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProgressNote2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ProgressNote2> {
		public ProgressNote2 create() {
			return ConsolFactory.eINSTANCE.createProgressNote2();
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
	private static class ConstructorTestClass extends ProgressNote2Operations {
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

} // ProgressNote2Operations
