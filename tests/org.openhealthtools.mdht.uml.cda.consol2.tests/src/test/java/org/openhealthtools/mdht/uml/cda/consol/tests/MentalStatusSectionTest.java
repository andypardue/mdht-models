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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.MentalStatusSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Mental Status Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionEntry756(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Entry756</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionEntry758(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Entry758</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionEntry760(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Entry760</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionMentalStatusOrganizer2EntryMentalStatusOrganizer2757(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Mental Status Organizer2 Entry Mental Status Organizer2757</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionMentalStatusObservation2EntryMentalStatusObservation2759(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Mental Status Observation2 Entry Mental Status Observation2759</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionAssessmentScaleObservationEntryAssessmentScaleObservation761(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Assessment Scale Observation Entry Assessment Scale Observation761</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MentalStatusSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMentalStatusSectionTemplateId() {
		OperationsTestCase<MentalStatusSection> validateMentalStatusSectionTemplateIdTestCase = new OperationsTestCase<MentalStatusSection>(
			"validateMentalStatusSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusSection target) {

			}

			@Override
			protected void updateToPass(MentalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusSectionOperations.validateMentalStatusSectionTemplateId(
					(MentalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMentalStatusSectionCode() {
		OperationsTestCase<MentalStatusSection> validateMentalStatusSectionCodeTestCase = new OperationsTestCase<MentalStatusSection>(
			"validateMentalStatusSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusSection target) {

			}

			@Override
			protected void updateToPass(MentalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusSectionOperations.validateMentalStatusSectionCode(
					(MentalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMentalStatusSectionCodeP() {
		OperationsTestCase<MentalStatusSection> validateMentalStatusSectionCodePTestCase = new OperationsTestCase<MentalStatusSection>(
			"validateMentalStatusSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusSection target) {

			}

			@Override
			protected void updateToPass(MentalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusSectionOperations.validateMentalStatusSectionCodeP(
					(MentalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMentalStatusSectionTitle() {
		OperationsTestCase<MentalStatusSection> validateMentalStatusSectionTitleTestCase = new OperationsTestCase<MentalStatusSection>(
			"validateMentalStatusSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusSection target) {

			}

			@Override
			protected void updateToPass(MentalStatusSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusSectionOperations.validateMentalStatusSectionTitle(
					(MentalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMentalStatusSectionText() {
		OperationsTestCase<MentalStatusSection> validateMentalStatusSectionTextTestCase = new OperationsTestCase<MentalStatusSection>(
			"validateMentalStatusSectionText",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusSection target) {

			}

			@Override
			protected void updateToPass(MentalStatusSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusSectionOperations.validateMentalStatusSectionText(
					(MentalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMentalStatusSectionEntry756() {
		OperationsTestCase<MentalStatusSection> validateMentalStatusSectionEntry756TestCase = new OperationsTestCase<MentalStatusSection>(
			"validateMentalStatusSectionEntry756",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_SECTION_ENTRY756__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusSection target) {

			}

			@Override
			protected void updateToPass(MentalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusSectionOperations.validateMentalStatusSectionEntry756(
					(MentalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusSectionEntry756TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMentalStatusSectionEntry758() {
		OperationsTestCase<MentalStatusSection> validateMentalStatusSectionEntry758TestCase = new OperationsTestCase<MentalStatusSection>(
			"validateMentalStatusSectionEntry758",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_SECTION_ENTRY758__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusSection target) {

			}

			@Override
			protected void updateToPass(MentalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusSectionOperations.validateMentalStatusSectionEntry758(
					(MentalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusSectionEntry758TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMentalStatusSectionEntry760() {
		OperationsTestCase<MentalStatusSection> validateMentalStatusSectionEntry760TestCase = new OperationsTestCase<MentalStatusSection>(
			"validateMentalStatusSectionEntry760",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_SECTION_ENTRY760__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusSection target) {

			}

			@Override
			protected void updateToPass(MentalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusSectionOperations.validateMentalStatusSectionEntry760(
					(MentalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusSectionEntry760TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMentalStatusSectionMentalStatusOrganizer2EntryMentalStatusOrganizer2757() {
		OperationsTestCase<MentalStatusSection> validateMentalStatusSectionMentalStatusOrganizer2EntryMentalStatusOrganizer2757TestCase = new OperationsTestCase<MentalStatusSection>(
			"validateMentalStatusSectionMentalStatusOrganizer2EntryMentalStatusOrganizer2757",
			operationsForOCL.getOCLValue(
				"VALIDATE_MENTAL_STATUS_SECTION_MENTAL_STATUS_ORGANIZER2_ENTRY_MENTAL_STATUS_ORGANIZER2757__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusSection target) {

			}

			@Override
			protected void updateToPass(MentalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusSectionOperations.validateMentalStatusSectionMentalStatusOrganizer2EntryMentalStatusOrganizer2757(
					(MentalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusSectionMentalStatusOrganizer2EntryMentalStatusOrganizer2757TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMentalStatusSectionMentalStatusObservation2EntryMentalStatusObservation2759() {
		OperationsTestCase<MentalStatusSection> validateMentalStatusSectionMentalStatusObservation2EntryMentalStatusObservation2759TestCase = new OperationsTestCase<MentalStatusSection>(
			"validateMentalStatusSectionMentalStatusObservation2EntryMentalStatusObservation2759",
			operationsForOCL.getOCLValue(
				"VALIDATE_MENTAL_STATUS_SECTION_MENTAL_STATUS_OBSERVATION2_ENTRY_MENTAL_STATUS_OBSERVATION2759__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusSection target) {

			}

			@Override
			protected void updateToPass(MentalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusSectionOperations.validateMentalStatusSectionMentalStatusObservation2EntryMentalStatusObservation2759(
					(MentalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusSectionMentalStatusObservation2EntryMentalStatusObservation2759TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMentalStatusSectionAssessmentScaleObservationEntryAssessmentScaleObservation761() {
		OperationsTestCase<MentalStatusSection> validateMentalStatusSectionAssessmentScaleObservationEntryAssessmentScaleObservation761TestCase = new OperationsTestCase<MentalStatusSection>(
			"validateMentalStatusSectionAssessmentScaleObservationEntryAssessmentScaleObservation761",
			operationsForOCL.getOCLValue(
				"VALIDATE_MENTAL_STATUS_SECTION_ASSESSMENT_SCALE_OBSERVATION_ENTRY_ASSESSMENT_SCALE_OBSERVATION761__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusSection target) {

			}

			@Override
			protected void updateToPass(MentalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusSectionOperations.validateMentalStatusSectionAssessmentScaleObservationEntryAssessmentScaleObservation761(
					(MentalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusSectionAssessmentScaleObservationEntryAssessmentScaleObservation761TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MentalStatusSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MentalStatusSection> {
		@Override
		public MentalStatusSection create() {
			return ConsolFactory.eINSTANCE.createMentalStatusSection();
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
	private static class ConstructorTestClass extends MentalStatusSectionOperations {
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

} // MentalStatusSectionOperations
