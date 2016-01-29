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
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis2;
import org.openhealthtools.mdht.uml.cda.consol.operations.HospitalDischargeDiagnosis2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Discharge Diagnosis2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis2#validateHospitalDischargeDiagnosisCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis2#validateHospitalDischargeDiagnosis2EntryRelationship924(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis2 Entry Relationship924</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis2#validateHospitalDischargeDiagnosis2ProblemObservation2EntryRelationshipProblemObservation2925(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis2 Problem Observation2 Entry Relationship Problem Observation2925</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis2#validateHospitalDischargeDiagnosisTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis2#validateHospitalDischargeDiagnosisCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HospitalDischargeDiagnosis2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeDiagnosisCodeP() {
		OperationsTestCase<HospitalDischargeDiagnosis2> validateHospitalDischargeDiagnosisCodePTestCase = new OperationsTestCase<HospitalDischargeDiagnosis2>(
			"validateHospitalDischargeDiagnosisCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeDiagnosis2 target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeDiagnosis2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeDiagnosis2Operations.validateHospitalDischargeDiagnosisCodeP(
					(HospitalDischargeDiagnosis2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeDiagnosisCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHospitalDischargeDiagnosis2EntryRelationship924() {
		OperationsTestCase<HospitalDischargeDiagnosis2> validateHospitalDischargeDiagnosis2EntryRelationship924TestCase = new OperationsTestCase<HospitalDischargeDiagnosis2>(
			"validateHospitalDischargeDiagnosis2EntryRelationship924",
			operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS2_ENTRY_RELATIONSHIP924__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeDiagnosis2 target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeDiagnosis2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeDiagnosis2Operations.validateHospitalDischargeDiagnosis2EntryRelationship924(
					(HospitalDischargeDiagnosis2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeDiagnosis2EntryRelationship924TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHospitalDischargeDiagnosis2ProblemObservation2EntryRelationshipProblemObservation2925() {
		OperationsTestCase<HospitalDischargeDiagnosis2> validateHospitalDischargeDiagnosis2ProblemObservation2EntryRelationshipProblemObservation2925TestCase = new OperationsTestCase<HospitalDischargeDiagnosis2>(
			"validateHospitalDischargeDiagnosis2ProblemObservation2EntryRelationshipProblemObservation2925",
			operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS2_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION2925__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeDiagnosis2 target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeDiagnosis2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeDiagnosis2Operations.validateHospitalDischargeDiagnosis2ProblemObservation2EntryRelationshipProblemObservation2925(
					(HospitalDischargeDiagnosis2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeDiagnosis2ProblemObservation2EntryRelationshipProblemObservation2925TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeDiagnosisTemplateId() {
		OperationsTestCase<HospitalDischargeDiagnosis2> validateHospitalDischargeDiagnosisTemplateIdTestCase = new OperationsTestCase<HospitalDischargeDiagnosis2>(
			"validateHospitalDischargeDiagnosisTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeDiagnosis2 target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeDiagnosis2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeDiagnosis2Operations.validateHospitalDischargeDiagnosisTemplateId(
					(HospitalDischargeDiagnosis2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeDiagnosisTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeDiagnosisCode() {
		OperationsTestCase<HospitalDischargeDiagnosis2> validateHospitalDischargeDiagnosisCodeTestCase = new OperationsTestCase<HospitalDischargeDiagnosis2>(
			"validateHospitalDischargeDiagnosisCode",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeDiagnosis2 target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeDiagnosis2 target) {
				target.init();

			}

			@Override
			protected void setDependency(HospitalDischargeDiagnosis2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeDiagnosis2Operations.validateHospitalDischargeDiagnosisCode(
					(HospitalDischargeDiagnosis2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeDiagnosisCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HospitalDischargeDiagnosis2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<HospitalDischargeDiagnosis2> {
		@Override
		public HospitalDischargeDiagnosis2 create() {
			return ConsolFactory.eINSTANCE.createHospitalDischargeDiagnosis2();
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
	private static class ConstructorTestClass extends HospitalDischargeDiagnosis2Operations {
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

} // HospitalDischargeDiagnosis2Operations
