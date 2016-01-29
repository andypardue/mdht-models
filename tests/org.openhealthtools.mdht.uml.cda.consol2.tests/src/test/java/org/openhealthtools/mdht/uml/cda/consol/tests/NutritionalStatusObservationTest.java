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
import org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.NutritionalStatusObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Nutritional Status Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation#validateNutritionalStatusObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation#validateNutritionalStatusObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation#validateNutritionalStatusObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation#validateNutritionalStatusObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation#validateNutritionalStatusObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation#validateNutritionalStatusObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation#validateNutritionalStatusObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation#validateNutritionalStatusObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation#validateNutritionalStatusObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation#validateNutritionalStatusObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation#validateNutritionalStatusObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation#validateNutritionalStatusObservationEntryRelationship614(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Entry Relationship614</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation#validateNutritionalStatusObservationNutritionAssessmentEntryRelationshipNutritionAssessment615(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutritional Status Observation Nutrition Assessment Entry Relationship Nutrition Assessment615</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class NutritionalStatusObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionalStatusObservationTemplateId() {
		OperationsTestCase<NutritionalStatusObservation> validateNutritionalStatusObservationTemplateIdTestCase = new OperationsTestCase<NutritionalStatusObservation>(
			"validateNutritionalStatusObservationTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionalStatusObservation target) {

			}

			@Override
			protected void updateToPass(NutritionalStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionalStatusObservationOperations.validateNutritionalStatusObservationTemplateId(
					(NutritionalStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionalStatusObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionalStatusObservationClassCode() {
		OperationsTestCase<NutritionalStatusObservation> validateNutritionalStatusObservationClassCodeTestCase = new OperationsTestCase<NutritionalStatusObservation>(
			"validateNutritionalStatusObservationClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionalStatusObservation target) {

			}

			@Override
			protected void updateToPass(NutritionalStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionalStatusObservationOperations.validateNutritionalStatusObservationClassCode(
					(NutritionalStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionalStatusObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionalStatusObservationMoodCode() {
		OperationsTestCase<NutritionalStatusObservation> validateNutritionalStatusObservationMoodCodeTestCase = new OperationsTestCase<NutritionalStatusObservation>(
			"validateNutritionalStatusObservationMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionalStatusObservation target) {

			}

			@Override
			protected void updateToPass(NutritionalStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionalStatusObservationOperations.validateNutritionalStatusObservationMoodCode(
					(NutritionalStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionalStatusObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionalStatusObservationId() {
		OperationsTestCase<NutritionalStatusObservation> validateNutritionalStatusObservationIdTestCase = new OperationsTestCase<NutritionalStatusObservation>(
			"validateNutritionalStatusObservationId",
			operationsForOCL.getOCLValue("VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionalStatusObservation target) {

			}

			@Override
			protected void updateToPass(NutritionalStatusObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionalStatusObservationOperations.validateNutritionalStatusObservationId(
					(NutritionalStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionalStatusObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionalStatusObservationCodeP() {
		OperationsTestCase<NutritionalStatusObservation> validateNutritionalStatusObservationCodePTestCase = new OperationsTestCase<NutritionalStatusObservation>(
			"validateNutritionalStatusObservationCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionalStatusObservation target) {

			}

			@Override
			protected void updateToPass(NutritionalStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionalStatusObservationOperations.validateNutritionalStatusObservationCodeP(
					(NutritionalStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionalStatusObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionalStatusObservationCode() {
		OperationsTestCase<NutritionalStatusObservation> validateNutritionalStatusObservationCodeTestCase = new OperationsTestCase<NutritionalStatusObservation>(
			"validateNutritionalStatusObservationCode", operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionalStatusObservation target) {

			}

			@Override
			protected void updateToPass(NutritionalStatusObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected void setDependency(NutritionalStatusObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionalStatusObservationOperations.validateNutritionalStatusObservationCode(
					(NutritionalStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionalStatusObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionalStatusObservationStatusCode() {
		OperationsTestCase<NutritionalStatusObservation> validateNutritionalStatusObservationStatusCodeTestCase = new OperationsTestCase<NutritionalStatusObservation>(
			"validateNutritionalStatusObservationStatusCode", operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionalStatusObservation target) {

			}

			@Override
			protected void updateToPass(NutritionalStatusObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionalStatusObservationOperations.validateNutritionalStatusObservationStatusCode(
					(NutritionalStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionalStatusObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionalStatusObservationStatusCodeP() {
		OperationsTestCase<NutritionalStatusObservation> validateNutritionalStatusObservationStatusCodePTestCase = new OperationsTestCase<NutritionalStatusObservation>(
			"validateNutritionalStatusObservationStatusCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionalStatusObservation target) {

			}

			@Override
			protected void updateToPass(NutritionalStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionalStatusObservationOperations.validateNutritionalStatusObservationStatusCodeP(
					(NutritionalStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionalStatusObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionalStatusObservationEffectiveTime() {
		OperationsTestCase<NutritionalStatusObservation> validateNutritionalStatusObservationEffectiveTimeTestCase = new OperationsTestCase<NutritionalStatusObservation>(
			"validateNutritionalStatusObservationEffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionalStatusObservation target) {

			}

			@Override
			protected void updateToPass(NutritionalStatusObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionalStatusObservationOperations.validateNutritionalStatusObservationEffectiveTime(
					(NutritionalStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionalStatusObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionalStatusObservationValue() {
		OperationsTestCase<NutritionalStatusObservation> validateNutritionalStatusObservationValueTestCase = new OperationsTestCase<NutritionalStatusObservation>(
			"validateNutritionalStatusObservationValue", operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionalStatusObservation target) {

			}

			@Override
			protected void updateToPass(NutritionalStatusObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionalStatusObservationOperations.validateNutritionalStatusObservationValue(
					(NutritionalStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionalStatusObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionalStatusObservationValueP() {
		OperationsTestCase<NutritionalStatusObservation> validateNutritionalStatusObservationValuePTestCase = new OperationsTestCase<NutritionalStatusObservation>(
			"validateNutritionalStatusObservationValueP", operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionalStatusObservation target) {

			}

			@Override
			protected void updateToPass(NutritionalStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionalStatusObservationOperations.validateNutritionalStatusObservationValueP(
					(NutritionalStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionalStatusObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNutritionalStatusObservationEntryRelationship614() {
		OperationsTestCase<NutritionalStatusObservation> validateNutritionalStatusObservationEntryRelationship614TestCase = new OperationsTestCase<NutritionalStatusObservation>(
			"validateNutritionalStatusObservationEntryRelationship614",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_ENTRY_RELATIONSHIP614__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionalStatusObservation target) {

			}

			@Override
			protected void updateToPass(NutritionalStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionalStatusObservationOperations.validateNutritionalStatusObservationEntryRelationship614(
					(NutritionalStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionalStatusObservationEntryRelationship614TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNutritionalStatusObservationNutritionAssessmentEntryRelationshipNutritionAssessment615() {
		OperationsTestCase<NutritionalStatusObservation> validateNutritionalStatusObservationNutritionAssessmentEntryRelationshipNutritionAssessment615TestCase = new OperationsTestCase<NutritionalStatusObservation>(
			"validateNutritionalStatusObservationNutritionAssessmentEntryRelationshipNutritionAssessment615",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITIONAL_STATUS_OBSERVATION_NUTRITION_ASSESSMENT_ENTRY_RELATIONSHIP_NUTRITION_ASSESSMENT615__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionalStatusObservation target) {

			}

			@Override
			protected void updateToPass(NutritionalStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionalStatusObservationOperations.validateNutritionalStatusObservationNutritionAssessmentEntryRelationshipNutritionAssessment615(
					(NutritionalStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionalStatusObservationNutritionAssessmentEntryRelationshipNutritionAssessment615TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends NutritionalStatusObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<NutritionalStatusObservation> {
		@Override
		public NutritionalStatusObservation create() {
			return ConsolFactory.eINSTANCE.createNutritionalStatusObservation();
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
	private static class ConstructorTestClass extends NutritionalStatusObservationOperations {
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

} // NutritionalStatusObservationOperations
