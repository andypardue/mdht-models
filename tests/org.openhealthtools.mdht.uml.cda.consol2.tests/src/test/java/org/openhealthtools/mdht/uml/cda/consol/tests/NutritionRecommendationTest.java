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
import org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation;
import org.openhealthtools.mdht.uml.cda.consol.operations.NutritionRecommendationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Nutrition Recommendation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationMoodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Mood Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationEntryRelationship602(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Entry Relationship602</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationEntryRelationship604(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Entry Relationship604</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationEntryRelationship606(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Entry Relationship606</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationEntryRelationship608(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Entry Relationship608</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationEntryRelationship610(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Entry Relationship610</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationEntryRelationship612(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Entry Relationship612</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationPlannedEncounter2EntryRelationshipPlannedEncounter2603(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Planned Encounter2 Entry Relationship Planned Encounter2603</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity2605(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Planned Medication Activity2 Entry Relationship Planned Medication Activity2605</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationPlannedObservation2EntryRelationshipPlannedObservation2607(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Planned Observation2 Entry Relationship Planned Observation2607</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationPlannedProcedure2EntryRelationshipPlannedProcedure2609(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Planned Procedure2 Entry Relationship Planned Procedure2609</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationPlannedSupply2EntryRelationshipPlannedSupply2611(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Planned Supply2 Entry Relationship Planned Supply2611</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationPlannedAct2EntryRelationshipPlannedAct2613(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Planned Act2 Entry Relationship Planned Act2613</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class NutritionRecommendationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionRecommendationTemplateId() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationTemplateIdTestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITION_RECOMMENDATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationTemplateId(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionRecommendationClassCode() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationClassCodeTestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITION_RECOMMENDATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationClassCode(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionRecommendationMoodCodeP() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationMoodCodePTestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationMoodCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITION_RECOMMENDATION_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationMoodCodeP(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationMoodCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionRecommendationMoodCode() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationMoodCodeTestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_NUTRITION_RECOMMENDATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				target.init();

			}

			@Override
			protected void setDependency(NutritionRecommendation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendationMoodCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationMoodCode(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionRecommendationCodeP() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationCodePTestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_NUTRITION_RECOMMENDATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationCodeP(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionRecommendationCode() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationCodeTestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationCode",
			operationsForOCL.getOCLValue("VALIDATE_NUTRITION_RECOMMENDATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				target.init();

			}

			@Override
			protected void setDependency(NutritionRecommendation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationCode(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionRecommendationStatusCode() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationStatusCodeTestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationStatusCode", operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITION_RECOMMENDATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationStatusCode(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionRecommendationStatusCodeP() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationStatusCodePTestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationStatusCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITION_RECOMMENDATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationStatusCodeP(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionRecommendationEffectiveTime() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationEffectiveTimeTestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationEffectiveTime", operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITION_RECOMMENDATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationEffectiveTime(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNutritionRecommendationEntryRelationship602() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationEntryRelationship602TestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationEntryRelationship602",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP602__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationEntryRelationship602(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationEntryRelationship602TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNutritionRecommendationEntryRelationship604() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationEntryRelationship604TestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationEntryRelationship604",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP604__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationEntryRelationship604(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationEntryRelationship604TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNutritionRecommendationEntryRelationship606() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationEntryRelationship606TestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationEntryRelationship606",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP606__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationEntryRelationship606(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationEntryRelationship606TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNutritionRecommendationEntryRelationship608() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationEntryRelationship608TestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationEntryRelationship608",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP608__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationEntryRelationship608(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationEntryRelationship608TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNutritionRecommendationEntryRelationship610() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationEntryRelationship610TestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationEntryRelationship610",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP610__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationEntryRelationship610(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationEntryRelationship610TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNutritionRecommendationEntryRelationship612() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationEntryRelationship612TestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationEntryRelationship612",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP612__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationEntryRelationship612(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationEntryRelationship612TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNutritionRecommendationPlannedEncounter2EntryRelationshipPlannedEncounter2603() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationPlannedEncounter2EntryRelationshipPlannedEncounter2603TestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationPlannedEncounter2EntryRelationshipPlannedEncounter2603",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_ENCOUNTER2_ENTRY_RELATIONSHIP_PLANNED_ENCOUNTER2603__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationPlannedEncounter2EntryRelationshipPlannedEncounter2603(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationPlannedEncounter2EntryRelationshipPlannedEncounter2603TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNutritionRecommendationPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity2605() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity2605TestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity2605",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_PLANNED_MEDICATION_ACTIVITY2605__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity2605(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity2605TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNutritionRecommendationPlannedObservation2EntryRelationshipPlannedObservation2607() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationPlannedObservation2EntryRelationshipPlannedObservation2607TestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationPlannedObservation2EntryRelationshipPlannedObservation2607",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_OBSERVATION2_ENTRY_RELATIONSHIP_PLANNED_OBSERVATION2607__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationPlannedObservation2EntryRelationshipPlannedObservation2607(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationPlannedObservation2EntryRelationshipPlannedObservation2607TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNutritionRecommendationPlannedProcedure2EntryRelationshipPlannedProcedure2609() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationPlannedProcedure2EntryRelationshipPlannedProcedure2609TestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationPlannedProcedure2EntryRelationshipPlannedProcedure2609",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_PROCEDURE2_ENTRY_RELATIONSHIP_PLANNED_PROCEDURE2609__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationPlannedProcedure2EntryRelationshipPlannedProcedure2609(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationPlannedProcedure2EntryRelationshipPlannedProcedure2609TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNutritionRecommendationPlannedSupply2EntryRelationshipPlannedSupply2611() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationPlannedSupply2EntryRelationshipPlannedSupply2611TestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationPlannedSupply2EntryRelationshipPlannedSupply2611",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP_PLANNED_SUPPLY2611__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationPlannedSupply2EntryRelationshipPlannedSupply2611(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationPlannedSupply2EntryRelationshipPlannedSupply2611TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNutritionRecommendationPlannedAct2EntryRelationshipPlannedAct2613() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationPlannedAct2EntryRelationshipPlannedAct2613TestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationPlannedAct2EntryRelationshipPlannedAct2613",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_ACT2_ENTRY_RELATIONSHIP_PLANNED_ACT2613__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationPlannedAct2EntryRelationshipPlannedAct2613(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationPlannedAct2EntryRelationshipPlannedAct2613TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends NutritionRecommendationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<NutritionRecommendation> {
		public NutritionRecommendation create() {
			return ConsolFactory.eINSTANCE.createNutritionRecommendation();
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
	private static class ConstructorTestClass extends NutritionRecommendationOperations {
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

} // NutritionRecommendationOperations
