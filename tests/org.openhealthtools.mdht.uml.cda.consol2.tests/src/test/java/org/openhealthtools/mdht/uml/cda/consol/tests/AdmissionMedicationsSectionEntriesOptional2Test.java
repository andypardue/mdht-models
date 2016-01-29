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
import org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AdmissionMedicationsSectionEntriesOptional2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Admission Medications Section Entries Optional2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationsSectionEntriesOptional2#validateAdmissionMedicationsSectionEntriesOptional2Entry1084(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medications Section Entries Optional2 Entry1084</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationsSectionEntriesOptional2#validateAdmissionMedicationsSectionEntriesOptional2AdmissionMedication2EntryAdmissionMedication21085(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medications Section Entries Optional2 Admission Medication2 Entry Admission Medication21085</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationsSectionEntriesOptional2#validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Medications Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationsSectionEntriesOptional2#validateHospitalAdmissionMedicationsSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Medications Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationsSectionEntriesOptional2#validateHospitalAdmissionMedicationsSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Medications Section Entries Optional Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdmissionMedicationsSectionEntriesOptional2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAdmissionMedicationsSectionEntriesOptional2Entry1084() {
		OperationsTestCase<AdmissionMedicationsSectionEntriesOptional2> validateAdmissionMedicationsSectionEntriesOptional2Entry1084TestCase = new OperationsTestCase<AdmissionMedicationsSectionEntriesOptional2>(
			"validateAdmissionMedicationsSectionEntriesOptional2Entry1084",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2_ENTRY1084__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionMedicationsSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(AdmissionMedicationsSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionMedicationsSectionEntriesOptional2Operations.validateAdmissionMedicationsSectionEntriesOptional2Entry1084(
					(AdmissionMedicationsSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateAdmissionMedicationsSectionEntriesOptional2Entry1084TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAdmissionMedicationsSectionEntriesOptional2AdmissionMedication2EntryAdmissionMedication21085() {
		OperationsTestCase<AdmissionMedicationsSectionEntriesOptional2> validateAdmissionMedicationsSectionEntriesOptional2AdmissionMedication2EntryAdmissionMedication21085TestCase = new OperationsTestCase<AdmissionMedicationsSectionEntriesOptional2>(
			"validateAdmissionMedicationsSectionEntriesOptional2AdmissionMedication2EntryAdmissionMedication21085",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2_ADMISSION_MEDICATION2_ENTRY_ADMISSION_MEDICATION21085__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionMedicationsSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(AdmissionMedicationsSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionMedicationsSectionEntriesOptional2Operations.validateAdmissionMedicationsSectionEntriesOptional2AdmissionMedication2EntryAdmissionMedication21085(
					(AdmissionMedicationsSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateAdmissionMedicationsSectionEntriesOptional2AdmissionMedication2EntryAdmissionMedication21085TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId() {
		OperationsTestCase<AdmissionMedicationsSectionEntriesOptional2> validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<AdmissionMedicationsSectionEntriesOptional2>(
			"validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionMedicationsSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(AdmissionMedicationsSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionMedicationsSectionEntriesOptional2Operations.validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(
					(AdmissionMedicationsSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionMedicationsSectionEntriesOptionalCodeP() {
		OperationsTestCase<AdmissionMedicationsSectionEntriesOptional2> validateHospitalAdmissionMedicationsSectionEntriesOptionalCodePTestCase = new OperationsTestCase<AdmissionMedicationsSectionEntriesOptional2>(
			"validateHospitalAdmissionMedicationsSectionEntriesOptionalCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionMedicationsSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(AdmissionMedicationsSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionMedicationsSectionEntriesOptional2Operations.validateHospitalAdmissionMedicationsSectionEntriesOptionalCodeP(
					(AdmissionMedicationsSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionMedicationsSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionMedicationsSectionEntriesOptionalCode() {
		OperationsTestCase<AdmissionMedicationsSectionEntriesOptional2> validateHospitalAdmissionMedicationsSectionEntriesOptionalCodeTestCase = new OperationsTestCase<AdmissionMedicationsSectionEntriesOptional2>(
			"validateHospitalAdmissionMedicationsSectionEntriesOptionalCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionMedicationsSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(AdmissionMedicationsSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected void setDependency(AdmissionMedicationsSectionEntriesOptional2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put(
					"org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptionalCodeP",
					passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionMedicationsSectionEntriesOptional2Operations.validateHospitalAdmissionMedicationsSectionEntriesOptionalCode(
					(AdmissionMedicationsSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionMedicationsSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdmissionMedicationsSectionEntriesOptional2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<AdmissionMedicationsSectionEntriesOptional2> {
		@Override
		public AdmissionMedicationsSectionEntriesOptional2 create() {
			return ConsolFactory.eINSTANCE.createAdmissionMedicationsSectionEntriesOptional2();
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
	private static class ConstructorTestClass extends AdmissionMedicationsSectionEntriesOptional2Operations {
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

} // AdmissionMedicationsSectionEntriesOptional2Operations
