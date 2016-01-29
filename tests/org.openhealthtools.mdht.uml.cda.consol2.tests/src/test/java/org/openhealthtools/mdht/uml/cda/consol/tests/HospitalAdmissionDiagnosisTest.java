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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis;
import org.openhealthtools.mdht.uml.cda.consol.operations.HospitalAdmissionDiagnosisOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Admission Diagnosis</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis#validateHospitalAdmissionDiagnosisTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis#validateHospitalAdmissionDiagnosisClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis#validateHospitalAdmissionDiagnosisMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis#validateHospitalAdmissionDiagnosisCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis#validateHospitalAdmissionDiagnosisEntryRelationship528(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Entry Relationship528</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis#validateHospitalAdmissionDiagnosisProblemObservationEntryRelationshipProblemObservation529(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Problem Observation Entry Relationship Problem Observation529</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HospitalAdmissionDiagnosisTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionDiagnosisTemplateId() {
		OperationsTestCase<HospitalAdmissionDiagnosis> validateHospitalAdmissionDiagnosisTemplateIdTestCase = new OperationsTestCase<HospitalAdmissionDiagnosis>(
			"validateHospitalAdmissionDiagnosisTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionDiagnosis target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionDiagnosis target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionDiagnosisOperations.validateHospitalAdmissionDiagnosisTemplateId(
					(HospitalAdmissionDiagnosis) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionDiagnosisTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionDiagnosisClassCode() {
		OperationsTestCase<HospitalAdmissionDiagnosis> validateHospitalAdmissionDiagnosisClassCodeTestCase = new OperationsTestCase<HospitalAdmissionDiagnosis>(
			"validateHospitalAdmissionDiagnosisClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionDiagnosis target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionDiagnosis target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionDiagnosisOperations.validateHospitalAdmissionDiagnosisClassCode(
					(HospitalAdmissionDiagnosis) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionDiagnosisClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionDiagnosisCode() {
		OperationsTestCase<HospitalAdmissionDiagnosis> validateHospitalAdmissionDiagnosisCodeTestCase = new OperationsTestCase<HospitalAdmissionDiagnosis>(
			"validateHospitalAdmissionDiagnosisCode",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionDiagnosis target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionDiagnosis target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionDiagnosisOperations.validateHospitalAdmissionDiagnosisCode(
					(HospitalAdmissionDiagnosis) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionDiagnosisCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHospitalAdmissionDiagnosisEntryRelationship528() {
		OperationsTestCase<HospitalAdmissionDiagnosis> validateHospitalAdmissionDiagnosisEntryRelationship528TestCase = new OperationsTestCase<HospitalAdmissionDiagnosis>(
			"validateHospitalAdmissionDiagnosisEntryRelationship528",
			operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_ENTRY_RELATIONSHIP528__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionDiagnosis target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionDiagnosis target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionDiagnosisOperations.validateHospitalAdmissionDiagnosisEntryRelationship528(
					(HospitalAdmissionDiagnosis) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionDiagnosisEntryRelationship528TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHospitalAdmissionDiagnosisProblemObservationEntryRelationshipProblemObservation529() {
		OperationsTestCase<HospitalAdmissionDiagnosis> validateHospitalAdmissionDiagnosisProblemObservationEntryRelationshipProblemObservation529TestCase = new OperationsTestCase<HospitalAdmissionDiagnosis>(
			"validateHospitalAdmissionDiagnosisProblemObservationEntryRelationshipProblemObservation529",
			operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_PROBLEM_OBSERVATION_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION529__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionDiagnosis target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionDiagnosis target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionDiagnosisOperations.validateHospitalAdmissionDiagnosisProblemObservationEntryRelationshipProblemObservation529(
					(HospitalAdmissionDiagnosis) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionDiagnosisProblemObservationEntryRelationshipProblemObservation529TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionDiagnosisMoodCode() {
		OperationsTestCase<HospitalAdmissionDiagnosis> validateHospitalAdmissionDiagnosisMoodCodeTestCase = new OperationsTestCase<HospitalAdmissionDiagnosis>(
			"validateHospitalAdmissionDiagnosisMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionDiagnosis target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionDiagnosis target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionDiagnosisOperations.validateHospitalAdmissionDiagnosisMoodCode(
					(HospitalAdmissionDiagnosis) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionDiagnosisMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HospitalAdmissionDiagnosisOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HospitalAdmissionDiagnosis> {
		@Override
		public HospitalAdmissionDiagnosis create() {
			return ConsolFactory.eINSTANCE.createHospitalAdmissionDiagnosis();
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
	private static class ConstructorTestClass extends HospitalAdmissionDiagnosisOperations {
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

} // HospitalAdmissionDiagnosisOperations
