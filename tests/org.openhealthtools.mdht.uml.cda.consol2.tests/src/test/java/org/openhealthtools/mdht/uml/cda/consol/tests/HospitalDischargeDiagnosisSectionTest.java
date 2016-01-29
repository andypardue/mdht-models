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
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.HospitalDischargeDiagnosisSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Discharge Diagnosis Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection#validateHospitalDischargeDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection#validateHospitalDischargeDiagnosisSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection#validateHospitalDischargeDiagnosisSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection#validateHospitalDischargeDiagnosisSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection#validateHospitalDischargeDiagnosisSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection#validateHospitalDischargeDiagnosisSectionEntry280(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Section Entry280</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection#validateHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosisEntryHospitalDischargeDiagnosis281(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Section Hospital Discharge Diagnosis Entry Hospital Discharge Diagnosis281</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HospitalDischargeDiagnosisSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeDiagnosisSectionTemplateId() {
		OperationsTestCase<HospitalDischargeDiagnosisSection> validateHospitalDischargeDiagnosisSectionTemplateIdTestCase = new OperationsTestCase<HospitalDischargeDiagnosisSection>(
			"validateHospitalDischargeDiagnosisSectionTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeDiagnosisSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeDiagnosisSectionOperations.validateHospitalDischargeDiagnosisSectionTemplateId(
					(HospitalDischargeDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeDiagnosisSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeDiagnosisSectionCode() {
		OperationsTestCase<HospitalDischargeDiagnosisSection> validateHospitalDischargeDiagnosisSectionCodeTestCase = new OperationsTestCase<HospitalDischargeDiagnosisSection>(
			"validateHospitalDischargeDiagnosisSectionCode", operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeDiagnosisSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeDiagnosisSectionOperations.validateHospitalDischargeDiagnosisSectionCode(
					(HospitalDischargeDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeDiagnosisSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeDiagnosisSectionCodeP() {
		OperationsTestCase<HospitalDischargeDiagnosisSection> validateHospitalDischargeDiagnosisSectionCodePTestCase = new OperationsTestCase<HospitalDischargeDiagnosisSection>(
			"validateHospitalDischargeDiagnosisSectionCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeDiagnosisSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeDiagnosisSectionOperations.validateHospitalDischargeDiagnosisSectionCodeP(
					(HospitalDischargeDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeDiagnosisSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeDiagnosisSectionTitle() {
		OperationsTestCase<HospitalDischargeDiagnosisSection> validateHospitalDischargeDiagnosisSectionTitleTestCase = new OperationsTestCase<HospitalDischargeDiagnosisSection>(
			"validateHospitalDischargeDiagnosisSectionTitle", operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeDiagnosisSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeDiagnosisSectionOperations.validateHospitalDischargeDiagnosisSectionTitle(
					(HospitalDischargeDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeDiagnosisSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeDiagnosisSectionText() {
		OperationsTestCase<HospitalDischargeDiagnosisSection> validateHospitalDischargeDiagnosisSectionTextTestCase = new OperationsTestCase<HospitalDischargeDiagnosisSection>(
			"validateHospitalDischargeDiagnosisSectionText", operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeDiagnosisSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeDiagnosisSectionOperations.validateHospitalDischargeDiagnosisSectionText(
					(HospitalDischargeDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeDiagnosisSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHospitalDischargeDiagnosisSectionEntry280() {
		OperationsTestCase<HospitalDischargeDiagnosisSection> validateHospitalDischargeDiagnosisSectionEntry280TestCase = new OperationsTestCase<HospitalDischargeDiagnosisSection>(
			"validateHospitalDischargeDiagnosisSectionEntry280",
			operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_ENTRY280__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeDiagnosisSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeDiagnosisSectionOperations.validateHospitalDischargeDiagnosisSectionEntry280(
					(HospitalDischargeDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeDiagnosisSectionEntry280TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosisEntryHospitalDischargeDiagnosis281() {
		OperationsTestCase<HospitalDischargeDiagnosisSection> validateHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosisEntryHospitalDischargeDiagnosis281TestCase = new OperationsTestCase<HospitalDischargeDiagnosisSection>(
			"validateHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosisEntryHospitalDischargeDiagnosis281",
			operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_HOSPITAL_DISCHARGE_DIAGNOSIS_ENTRY_HOSPITAL_DISCHARGE_DIAGNOSIS281__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeDiagnosisSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeDiagnosisSectionOperations.validateHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosisEntryHospitalDischargeDiagnosis281(
					(HospitalDischargeDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosisEntryHospitalDischargeDiagnosis281TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HospitalDischargeDiagnosisSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HospitalDischargeDiagnosisSection> {
		@Override
		public HospitalDischargeDiagnosisSection create() {
			return ConsolFactory.eINSTANCE.createHospitalDischargeDiagnosisSection();
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
	private static class ConstructorTestClass extends HospitalDischargeDiagnosisSectionOperations {
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

} // HospitalDischargeDiagnosisSectionOperations
