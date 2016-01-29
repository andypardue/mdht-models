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
import org.openhealthtools.mdht.uml.cda.consol.AdmissionDiagnosisSection2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AdmissionDiagnosisSection2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Admission Diagnosis Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionDiagnosisSection2#validateAdmissionDiagnosisSection2Entry1082(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Diagnosis Section2 Entry1082</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionDiagnosisSection2#validateAdmissionDiagnosisSection2CETranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Diagnosis Section2 CE Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionDiagnosisSection2#validateAdmissionDiagnosisSection2CETranslationP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Diagnosis Section2 CE Translation P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionDiagnosisSection2#validateAdmissionDiagnosisSection2HospitalAdmissionDiagnosis2EntryHospitalAdmissionDiagnosis21083(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Diagnosis Section2 Hospital Admission Diagnosis2 Entry Hospital Admission Diagnosis21083</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionDiagnosisSection2#validateHospitalAdmissionDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionDiagnosisSection2#validateHospitalAdmissionDiagnosisSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionDiagnosisSection2#validateHospitalAdmissionDiagnosisSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdmissionDiagnosisSection2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAdmissionDiagnosisSection2Entry1082() {
		OperationsTestCase<AdmissionDiagnosisSection2> validateAdmissionDiagnosisSection2Entry1082TestCase = new OperationsTestCase<AdmissionDiagnosisSection2>(
			"validateAdmissionDiagnosisSection2Entry1082", operationsForOCL.getOCLValue(
				"VALIDATE_ADMISSION_DIAGNOSIS_SECTION2_ENTRY1082__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionDiagnosisSection2 target) {

			}

			@Override
			protected void updateToPass(AdmissionDiagnosisSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionDiagnosisSection2Operations.validateAdmissionDiagnosisSection2Entry1082(
					(AdmissionDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validateAdmissionDiagnosisSection2Entry1082TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdmissionDiagnosisSection2CETranslation() {
		OperationsTestCase<AdmissionDiagnosisSection2> validateAdmissionDiagnosisSection2CETranslationTestCase = new OperationsTestCase<AdmissionDiagnosisSection2>(
			"validateAdmissionDiagnosisSection2CETranslation",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADMISSION_DIAGNOSIS_SECTION2_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionDiagnosisSection2 target) {

			}

			@Override
			protected void updateToPass(AdmissionDiagnosisSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionDiagnosisSection2Operations.validateAdmissionDiagnosisSection2CETranslation(
					(AdmissionDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validateAdmissionDiagnosisSection2CETranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdmissionDiagnosisSection2CETranslationP() {
		OperationsTestCase<AdmissionDiagnosisSection2> validateAdmissionDiagnosisSection2CETranslationPTestCase = new OperationsTestCase<AdmissionDiagnosisSection2>(
			"validateAdmissionDiagnosisSection2CETranslationP",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADMISSION_DIAGNOSIS_SECTION2_CE_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionDiagnosisSection2 target) {

			}

			@Override
			protected void updateToPass(AdmissionDiagnosisSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionDiagnosisSection2Operations.validateAdmissionDiagnosisSection2CETranslationP(
					(AdmissionDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validateAdmissionDiagnosisSection2CETranslationPTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAdmissionDiagnosisSection2HospitalAdmissionDiagnosis2EntryHospitalAdmissionDiagnosis21083() {
		OperationsTestCase<AdmissionDiagnosisSection2> validateAdmissionDiagnosisSection2HospitalAdmissionDiagnosis2EntryHospitalAdmissionDiagnosis21083TestCase = new OperationsTestCase<AdmissionDiagnosisSection2>(
			"validateAdmissionDiagnosisSection2HospitalAdmissionDiagnosis2EntryHospitalAdmissionDiagnosis21083",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADMISSION_DIAGNOSIS_SECTION2_HOSPITAL_ADMISSION_DIAGNOSIS2_ENTRY_HOSPITAL_ADMISSION_DIAGNOSIS21083__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionDiagnosisSection2 target) {

			}

			@Override
			protected void updateToPass(AdmissionDiagnosisSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionDiagnosisSection2Operations.validateAdmissionDiagnosisSection2HospitalAdmissionDiagnosis2EntryHospitalAdmissionDiagnosis21083(
					(AdmissionDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validateAdmissionDiagnosisSection2HospitalAdmissionDiagnosis2EntryHospitalAdmissionDiagnosis21083TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionDiagnosisSectionTemplateId() {
		OperationsTestCase<AdmissionDiagnosisSection2> validateHospitalAdmissionDiagnosisSectionTemplateIdTestCase = new OperationsTestCase<AdmissionDiagnosisSection2>(
			"validateHospitalAdmissionDiagnosisSectionTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionDiagnosisSection2 target) {

			}

			@Override
			protected void updateToPass(AdmissionDiagnosisSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionDiagnosisSection2Operations.validateHospitalAdmissionDiagnosisSectionTemplateId(
					(AdmissionDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionDiagnosisSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionDiagnosisSectionCodeP() {
		OperationsTestCase<AdmissionDiagnosisSection2> validateHospitalAdmissionDiagnosisSectionCodePTestCase = new OperationsTestCase<AdmissionDiagnosisSection2>(
			"validateHospitalAdmissionDiagnosisSectionCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionDiagnosisSection2 target) {

			}

			@Override
			protected void updateToPass(AdmissionDiagnosisSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionDiagnosisSection2Operations.validateHospitalAdmissionDiagnosisSectionCodeP(
					(AdmissionDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionDiagnosisSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionDiagnosisSectionCode() {
		OperationsTestCase<AdmissionDiagnosisSection2> validateHospitalAdmissionDiagnosisSectionCodeTestCase = new OperationsTestCase<AdmissionDiagnosisSection2>(
			"validateHospitalAdmissionDiagnosisSectionCode", operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionDiagnosisSection2 target) {

			}

			@Override
			protected void updateToPass(AdmissionDiagnosisSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(AdmissionDiagnosisSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSectionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionDiagnosisSection2Operations.validateHospitalAdmissionDiagnosisSectionCode(
					(AdmissionDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionDiagnosisSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdmissionDiagnosisSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<AdmissionDiagnosisSection2> {
		@Override
		public AdmissionDiagnosisSection2 create() {
			return ConsolFactory.eINSTANCE.createAdmissionDiagnosisSection2();
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
	private static class ConstructorTestClass extends AdmissionDiagnosisSection2Operations {
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

} // AdmissionDiagnosisSection2Operations
