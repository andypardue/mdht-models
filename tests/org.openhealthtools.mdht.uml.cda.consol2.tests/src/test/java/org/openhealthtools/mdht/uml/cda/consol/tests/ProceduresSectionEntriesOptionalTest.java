/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     Dan Brown (Audacious Inquiry) - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProceduresSectionEntriesOptionalOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedures Section Entries Optional</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional#validateProceduresSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional#validateProceduresSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional#validateProceduresSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional#validateProceduresSectionEntriesOptionalTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional#validateProceduresSectionEntriesOptionalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional#validateProceduresSectionEntriesOptionalEntry250(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Entry250</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional#validateProceduresSectionEntriesOptionalEntry252(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Entry252</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional#validateProceduresSectionEntriesOptionalEntry254(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Entry254</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional#validateProceduresSectionEntriesOptionalProcedureActivityProcedureEntryProcedureActivityProcedure251(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Procedure Activity Procedure Entry Procedure Activity Procedure251</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional#validateProceduresSectionEntriesOptionalProcedureActivityObservationEntryProcedureActivityObservation253(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Procedure Activity Observation Entry Procedure Activity Observation253</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional#validateProceduresSectionEntriesOptionalProcedureActivityActEntryProcedureActivityAct255(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Procedure Activity Act Entry Procedure Activity Act255</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProceduresSectionEntriesOptionalTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalTemplateId() {
		OperationsTestCase<ProceduresSectionEntriesOptional> validateProceduresSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<ProceduresSectionEntriesOptional>(
			"validateProceduresSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptionalOperations.validateProceduresSectionEntriesOptionalTemplateId(
					(ProceduresSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalCode() {
		OperationsTestCase<ProceduresSectionEntriesOptional> validateProceduresSectionEntriesOptionalCodeTestCase = new OperationsTestCase<ProceduresSectionEntriesOptional>(
			"validateProceduresSectionEntriesOptionalCode", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptionalOperations.validateProceduresSectionEntriesOptionalCode(
					(ProceduresSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalCodeP() {
		OperationsTestCase<ProceduresSectionEntriesOptional> validateProceduresSectionEntriesOptionalCodePTestCase = new OperationsTestCase<ProceduresSectionEntriesOptional>(
			"validateProceduresSectionEntriesOptionalCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptionalOperations.validateProceduresSectionEntriesOptionalCodeP(
					(ProceduresSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalTitle() {
		OperationsTestCase<ProceduresSectionEntriesOptional> validateProceduresSectionEntriesOptionalTitleTestCase = new OperationsTestCase<ProceduresSectionEntriesOptional>(
			"validateProceduresSectionEntriesOptionalTitle", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptionalOperations.validateProceduresSectionEntriesOptionalTitle(
					(ProceduresSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalText() {
		OperationsTestCase<ProceduresSectionEntriesOptional> validateProceduresSectionEntriesOptionalTextTestCase = new OperationsTestCase<ProceduresSectionEntriesOptional>(
			"validateProceduresSectionEntriesOptionalText", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptionalOperations.validateProceduresSectionEntriesOptionalText(
					(ProceduresSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProceduresSectionEntriesOptionalEntry250() {
		OperationsTestCase<ProceduresSectionEntriesOptional> validateProceduresSectionEntriesOptionalEntry250TestCase = new OperationsTestCase<ProceduresSectionEntriesOptional>(
			"validateProceduresSectionEntriesOptionalEntry250",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_ENTRY250__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptionalOperations.validateProceduresSectionEntriesOptionalEntry250(
					(ProceduresSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalEntry250TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProceduresSectionEntriesOptionalEntry252() {
		OperationsTestCase<ProceduresSectionEntriesOptional> validateProceduresSectionEntriesOptionalEntry252TestCase = new OperationsTestCase<ProceduresSectionEntriesOptional>(
			"validateProceduresSectionEntriesOptionalEntry252",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_ENTRY252__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptionalOperations.validateProceduresSectionEntriesOptionalEntry252(
					(ProceduresSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalEntry252TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProceduresSectionEntriesOptionalEntry254() {
		OperationsTestCase<ProceduresSectionEntriesOptional> validateProceduresSectionEntriesOptionalEntry254TestCase = new OperationsTestCase<ProceduresSectionEntriesOptional>(
			"validateProceduresSectionEntriesOptionalEntry254",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_ENTRY254__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptionalOperations.validateProceduresSectionEntriesOptionalEntry254(
					(ProceduresSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalEntry254TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProceduresSectionEntriesOptionalProcedureActivityProcedureEntryProcedureActivityProcedure251() {
		OperationsTestCase<ProceduresSectionEntriesOptional> validateProceduresSectionEntriesOptionalProcedureActivityProcedureEntryProcedureActivityProcedure251TestCase = new OperationsTestCase<ProceduresSectionEntriesOptional>(
			"validateProceduresSectionEntriesOptionalProcedureActivityProcedureEntryProcedureActivityProcedure251",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_PROCEDURE_ACTIVITY_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE251__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptionalOperations.validateProceduresSectionEntriesOptionalProcedureActivityProcedureEntryProcedureActivityProcedure251(
					(ProceduresSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalProcedureActivityProcedureEntryProcedureActivityProcedure251TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProceduresSectionEntriesOptionalProcedureActivityObservationEntryProcedureActivityObservation253() {
		OperationsTestCase<ProceduresSectionEntriesOptional> validateProceduresSectionEntriesOptionalProcedureActivityObservationEntryProcedureActivityObservation253TestCase = new OperationsTestCase<ProceduresSectionEntriesOptional>(
			"validateProceduresSectionEntriesOptionalProcedureActivityObservationEntryProcedureActivityObservation253",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_PROCEDURE_ACTIVITY_OBSERVATION253__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptionalOperations.validateProceduresSectionEntriesOptionalProcedureActivityObservationEntryProcedureActivityObservation253(
					(ProceduresSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalProcedureActivityObservationEntryProcedureActivityObservation253TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProceduresSectionEntriesOptionalProcedureActivityActEntryProcedureActivityAct255() {
		OperationsTestCase<ProceduresSectionEntriesOptional> validateProceduresSectionEntriesOptionalProcedureActivityActEntryProcedureActivityAct255TestCase = new OperationsTestCase<ProceduresSectionEntriesOptional>(
			"validateProceduresSectionEntriesOptionalProcedureActivityActEntryProcedureActivityAct255",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_PROCEDURE_ACTIVITY_ACT_ENTRY_PROCEDURE_ACTIVITY_ACT255__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptionalOperations.validateProceduresSectionEntriesOptionalProcedureActivityActEntryProcedureActivityAct255(
					(ProceduresSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalProcedureActivityActEntryProcedureActivityAct255TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProceduresSectionEntriesOptionalOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProceduresSectionEntriesOptional> {
		@Override
		public ProceduresSectionEntriesOptional create() {
			return ConsolFactory.eINSTANCE.createProceduresSectionEntriesOptional();
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
	private static class ConstructorTestClass extends ProceduresSectionEntriesOptionalOperations {
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

} // ProceduresSectionEntriesOptionalOperations
