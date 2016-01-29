/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     Dan Brown (Audacious Inquiry) - added tests for SITE-495 Errata 219 artf3820 CONC or 48765-2
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AllergyProblemActOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergy Problem Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActEffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActEffectiveTimeHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Effective Time High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActEntryRelationship0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Entry Relationship0</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActCDCodeAndCodeSystemValues(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act CD Code And Code System Values</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActCDCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act CD Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActCDCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act CD Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActAllergyObservationEntryRelationshipAllergyObservation1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Allergy Observation Entry Relationship Allergy Observation1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AllergyProblemActTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActEffectiveTimeHigh() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActEffectiveTimeHighTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActEffectiveTimeHigh", operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActEffectiveTimeHigh(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActEffectiveTimeHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActEffectiveTimeLow() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActEffectiveTimeLowTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActEffectiveTimeLow", operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActEffectiveTimeLow(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActEffectiveTimeLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActTemplateId() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActTemplateIdTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActTemplateId(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActClassCode() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActClassCodeTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActClassCode(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActMoodCode() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActMoodCodeTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActMoodCode(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActId() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActIdTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActId",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActId(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActCode() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActCodeTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActCode(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActStatusCode() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActStatusCodeTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActStatusCode(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActEffectiveTime() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActEffectiveTimeTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActEffectiveTime(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAllergyProblemActEntryRelationship0() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActEntryRelationship0TestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActEntryRelationship0", operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_PROBLEM_ACT_ENTRY_RELATIONSHIP0__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActEntryRelationship0(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActEntryRelationship0TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActCDCodeAndCodeSystemValues() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActCDCodeAndCodeSystemValuesTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActCDCodeAndCodeSystemValues",
			operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_PROBLEM_ACT_CD_CODE_AND_CODE_SYSTEM_VALUES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActCDCodeAndCodeSystemValues(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActCDCodeAndCodeSystemValuesTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActCDCode() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActCDCodeTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActCDCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActCDCode(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActCDCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActCDCodeSystem() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActCDCodeSystemTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActCDCodeSystem",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActCDCodeSystem(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActCDCodeSystemTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAllergyProblemActAllergyObservationEntryRelationshipAllergyObservation1() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActAllergyObservationEntryRelationshipAllergyObservation1TestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActAllergyObservationEntryRelationshipAllergyObservation1",
			operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_PROBLEM_ACT_ALLERGY_OBSERVATION_ENTRY_RELATIONSHIP_ALLERGY_OBSERVATION1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActAllergyObservationEntryRelationshipAllergyObservation1(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActAllergyObservationEntryRelationshipAllergyObservation1TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AllergyProblemActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AllergyProblemAct> {
		@Override
		public AllergyProblemAct create() {
			return ConsolFactory.eINSTANCE.createAllergyProblemAct();
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
	private static class ConstructorTestClass extends AllergyProblemActOperations {
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

} // AllergyProblemActOperations
