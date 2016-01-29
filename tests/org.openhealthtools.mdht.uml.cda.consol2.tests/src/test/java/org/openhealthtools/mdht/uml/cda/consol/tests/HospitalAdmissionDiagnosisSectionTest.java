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
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.HospitalAdmissionDiagnosisSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Admission Diagnosis Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection#validateHospitalAdmissionDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection#validateHospitalAdmissionDiagnosisSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection#validateHospitalAdmissionDiagnosisSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection#validateHospitalAdmissionDiagnosisSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection#validateHospitalAdmissionDiagnosisSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection#validateHospitalAdmissionDiagnosisSectionEntry168(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Entry168</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection#validateHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosisEntryHospitalAdmissionDiagnosis169(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Hospital Admission Diagnosis Entry Hospital Admission Diagnosis169</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HospitalAdmissionDiagnosisSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionDiagnosisSectionTemplateId() {
		OperationsTestCase<HospitalAdmissionDiagnosisSection> validateHospitalAdmissionDiagnosisSectionTemplateIdTestCase = new OperationsTestCase<HospitalAdmissionDiagnosisSection>(
			"validateHospitalAdmissionDiagnosisSectionTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionDiagnosisSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionDiagnosisSectionOperations.validateHospitalAdmissionDiagnosisSectionTemplateId(
					(HospitalAdmissionDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionDiagnosisSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionDiagnosisSectionCode() {
		OperationsTestCase<HospitalAdmissionDiagnosisSection> validateHospitalAdmissionDiagnosisSectionCodeTestCase = new OperationsTestCase<HospitalAdmissionDiagnosisSection>(
			"validateHospitalAdmissionDiagnosisSectionCode", operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionDiagnosisSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionDiagnosisSectionOperations.validateHospitalAdmissionDiagnosisSectionCode(
					(HospitalAdmissionDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionDiagnosisSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionDiagnosisSectionCodeP() {
		OperationsTestCase<HospitalAdmissionDiagnosisSection> validateHospitalAdmissionDiagnosisSectionCodePTestCase = new OperationsTestCase<HospitalAdmissionDiagnosisSection>(
			"validateHospitalAdmissionDiagnosisSectionCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionDiagnosisSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionDiagnosisSectionOperations.validateHospitalAdmissionDiagnosisSectionCodeP(
					(HospitalAdmissionDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionDiagnosisSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionDiagnosisSectionTitle() {
		OperationsTestCase<HospitalAdmissionDiagnosisSection> validateHospitalAdmissionDiagnosisSectionTitleTestCase = new OperationsTestCase<HospitalAdmissionDiagnosisSection>(
			"validateHospitalAdmissionDiagnosisSectionTitle", operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionDiagnosisSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionDiagnosisSectionOperations.validateHospitalAdmissionDiagnosisSectionTitle(
					(HospitalAdmissionDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionDiagnosisSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionDiagnosisSectionText() {
		OperationsTestCase<HospitalAdmissionDiagnosisSection> validateHospitalAdmissionDiagnosisSectionTextTestCase = new OperationsTestCase<HospitalAdmissionDiagnosisSection>(
			"validateHospitalAdmissionDiagnosisSectionText", operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionDiagnosisSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionDiagnosisSectionOperations.validateHospitalAdmissionDiagnosisSectionText(
					(HospitalAdmissionDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionDiagnosisSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHospitalAdmissionDiagnosisSectionEntry168() {
		OperationsTestCase<HospitalAdmissionDiagnosisSection> validateHospitalAdmissionDiagnosisSectionEntry168TestCase = new OperationsTestCase<HospitalAdmissionDiagnosisSection>(
			"validateHospitalAdmissionDiagnosisSectionEntry168",
			operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_ENTRY168__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionDiagnosisSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionDiagnosisSectionOperations.validateHospitalAdmissionDiagnosisSectionEntry168(
					(HospitalAdmissionDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionDiagnosisSectionEntry168TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosisEntryHospitalAdmissionDiagnosis169() {
		OperationsTestCase<HospitalAdmissionDiagnosisSection> validateHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosisEntryHospitalAdmissionDiagnosis169TestCase = new OperationsTestCase<HospitalAdmissionDiagnosisSection>(
			"validateHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosisEntryHospitalAdmissionDiagnosis169",
			operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS_ENTRY_HOSPITAL_ADMISSION_DIAGNOSIS169__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionDiagnosisSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionDiagnosisSectionOperations.validateHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosisEntryHospitalAdmissionDiagnosis169(
					(HospitalAdmissionDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosisEntryHospitalAdmissionDiagnosis169TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HospitalAdmissionDiagnosisSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HospitalAdmissionDiagnosisSection> {
		@Override
		public HospitalAdmissionDiagnosisSection create() {
			return ConsolFactory.eINSTANCE.createHospitalAdmissionDiagnosisSection();
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
	private static class ConstructorTestClass extends HospitalAdmissionDiagnosisSectionOperations {
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

} // HospitalAdmissionDiagnosisSectionOperations
