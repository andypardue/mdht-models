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
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.operations.ResultsSectionEntriesOptionalOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Results Section Entries Optional</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional#validateResultsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional#validateResultsSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional#validateResultsSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional#validateResultsSectionEntriesOptionalTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional#validateResultsSectionEntriesOptionalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional#validateResultsSectionEntriesOptionalEntry256(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Entry256</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional#validateResultsSectionEntriesOptionalResultOrganizerEntryResultOrganizer257(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Result Organizer Entry Result Organizer257</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ResultsSectionEntriesOptionalTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultsSectionEntriesOptionalTemplateId() {
		OperationsTestCase<ResultsSectionEntriesOptional> validateResultsSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<ResultsSectionEntriesOptional>(
			"validateResultsSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ResultsSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultsSectionEntriesOptionalOperations.validateResultsSectionEntriesOptionalTemplateId(
					(ResultsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateResultsSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultsSectionEntriesOptionalCode() {
		OperationsTestCase<ResultsSectionEntriesOptional> validateResultsSectionEntriesOptionalCodeTestCase = new OperationsTestCase<ResultsSectionEntriesOptional>(
			"validateResultsSectionEntriesOptionalCode", operationsForOCL.getOCLValue(
				"VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ResultsSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultsSectionEntriesOptionalOperations.validateResultsSectionEntriesOptionalCode(
					(ResultsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateResultsSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultsSectionEntriesOptionalCodeP() {
		OperationsTestCase<ResultsSectionEntriesOptional> validateResultsSectionEntriesOptionalCodePTestCase = new OperationsTestCase<ResultsSectionEntriesOptional>(
			"validateResultsSectionEntriesOptionalCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ResultsSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultsSectionEntriesOptionalOperations.validateResultsSectionEntriesOptionalCodeP(
					(ResultsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateResultsSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultsSectionEntriesOptionalTitle() {
		OperationsTestCase<ResultsSectionEntriesOptional> validateResultsSectionEntriesOptionalTitleTestCase = new OperationsTestCase<ResultsSectionEntriesOptional>(
			"validateResultsSectionEntriesOptionalTitle", operationsForOCL.getOCLValue(
				"VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ResultsSectionEntriesOptional target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultsSectionEntriesOptionalOperations.validateResultsSectionEntriesOptionalTitle(
					(ResultsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateResultsSectionEntriesOptionalTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultsSectionEntriesOptionalText() {
		OperationsTestCase<ResultsSectionEntriesOptional> validateResultsSectionEntriesOptionalTextTestCase = new OperationsTestCase<ResultsSectionEntriesOptional>(
			"validateResultsSectionEntriesOptionalText", operationsForOCL.getOCLValue(
				"VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ResultsSectionEntriesOptional target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultsSectionEntriesOptionalOperations.validateResultsSectionEntriesOptionalText(
					(ResultsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateResultsSectionEntriesOptionalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateResultsSectionEntriesOptionalEntry256() {
		OperationsTestCase<ResultsSectionEntriesOptional> validateResultsSectionEntriesOptionalEntry256TestCase = new OperationsTestCase<ResultsSectionEntriesOptional>(
			"validateResultsSectionEntriesOptionalEntry256", operationsForOCL.getOCLValue(
				"VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_ENTRY256__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ResultsSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultsSectionEntriesOptionalOperations.validateResultsSectionEntriesOptionalEntry256(
					(ResultsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateResultsSectionEntriesOptionalEntry256TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateResultsSectionEntriesOptionalResultOrganizerEntryResultOrganizer257() {
		OperationsTestCase<ResultsSectionEntriesOptional> validateResultsSectionEntriesOptionalResultOrganizerEntryResultOrganizer257TestCase = new OperationsTestCase<ResultsSectionEntriesOptional>(
			"validateResultsSectionEntriesOptionalResultOrganizerEntryResultOrganizer257",
			operationsForOCL.getOCLValue(
				"VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_RESULT_ORGANIZER_ENTRY_RESULT_ORGANIZER257__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ResultsSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultsSectionEntriesOptionalOperations.validateResultsSectionEntriesOptionalResultOrganizerEntryResultOrganizer257(
					(ResultsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateResultsSectionEntriesOptionalResultOrganizerEntryResultOrganizer257TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ResultsSectionEntriesOptionalOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ResultsSectionEntriesOptional> {
		@Override
		public ResultsSectionEntriesOptional create() {
			return ConsolFactory.eINSTANCE.createResultsSectionEntriesOptional();
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
	private static class ConstructorTestClass extends ResultsSectionEntriesOptionalOperations {
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

} // ResultsSectionEntriesOptionalOperations
