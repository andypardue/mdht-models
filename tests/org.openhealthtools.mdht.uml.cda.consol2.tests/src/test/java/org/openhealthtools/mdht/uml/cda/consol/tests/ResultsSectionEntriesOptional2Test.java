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
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ResultsSectionEntriesOptional2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Results Section Entries Optional2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional2#validateResultsSectionEntriesOptional2Entry1158(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional2 Entry1158</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional2#validateResultsSectionEntriesOptional2ResultOrganizer2EntryResultOrganizer21159(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional2 Result Organizer2 Entry Result Organizer21159</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional2#validateResultsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional2#validateResultsSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional2#validateResultsSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ResultsSectionEntriesOptional2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateResultsSectionEntriesOptional2Entry1158() {
		OperationsTestCase<ResultsSectionEntriesOptional2> validateResultsSectionEntriesOptional2Entry1158TestCase = new OperationsTestCase<ResultsSectionEntriesOptional2>(
			"validateResultsSectionEntriesOptional2Entry1158",
			operationsForOCL.getOCLValue(
				"VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL2_ENTRY1158__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultsSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(ResultsSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultsSectionEntriesOptional2Operations.validateResultsSectionEntriesOptional2Entry1158(
					(ResultsSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateResultsSectionEntriesOptional2Entry1158TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateResultsSectionEntriesOptional2ResultOrganizer2EntryResultOrganizer21159() {
		OperationsTestCase<ResultsSectionEntriesOptional2> validateResultsSectionEntriesOptional2ResultOrganizer2EntryResultOrganizer21159TestCase = new OperationsTestCase<ResultsSectionEntriesOptional2>(
			"validateResultsSectionEntriesOptional2ResultOrganizer2EntryResultOrganizer21159",
			operationsForOCL.getOCLValue(
				"VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL2_RESULT_ORGANIZER2_ENTRY_RESULT_ORGANIZER21159__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultsSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(ResultsSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultsSectionEntriesOptional2Operations.validateResultsSectionEntriesOptional2ResultOrganizer2EntryResultOrganizer21159(
					(ResultsSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateResultsSectionEntriesOptional2ResultOrganizer2EntryResultOrganizer21159TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultsSectionEntriesOptionalTemplateId() {
		OperationsTestCase<ResultsSectionEntriesOptional2> validateResultsSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<ResultsSectionEntriesOptional2>(
			"validateResultsSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultsSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(ResultsSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultsSectionEntriesOptional2Operations.validateResultsSectionEntriesOptionalTemplateId(
					(ResultsSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateResultsSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultsSectionEntriesOptionalCodeP() {
		OperationsTestCase<ResultsSectionEntriesOptional2> validateResultsSectionEntriesOptionalCodePTestCase = new OperationsTestCase<ResultsSectionEntriesOptional2>(
			"validateResultsSectionEntriesOptionalCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultsSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(ResultsSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultsSectionEntriesOptional2Operations.validateResultsSectionEntriesOptionalCodeP(
					(ResultsSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateResultsSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultsSectionEntriesOptionalCode() {
		OperationsTestCase<ResultsSectionEntriesOptional2> validateResultsSectionEntriesOptionalCodeTestCase = new OperationsTestCase<ResultsSectionEntriesOptional2>(
			"validateResultsSectionEntriesOptionalCode", operationsForOCL.getOCLValue(
				"VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultsSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(ResultsSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected void setDependency(ResultsSectionEntriesOptional2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptionalCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultsSectionEntriesOptional2Operations.validateResultsSectionEntriesOptionalCode(
					(ResultsSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateResultsSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ResultsSectionEntriesOptional2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ResultsSectionEntriesOptional2> {
		@Override
		public ResultsSectionEntriesOptional2 create() {
			return ConsolFactory.eINSTANCE.createResultsSectionEntriesOptional2();
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
	private static class ConstructorTestClass extends ResultsSectionEntriesOptional2Operations {
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

} // ResultsSectionEntriesOptional2Operations
