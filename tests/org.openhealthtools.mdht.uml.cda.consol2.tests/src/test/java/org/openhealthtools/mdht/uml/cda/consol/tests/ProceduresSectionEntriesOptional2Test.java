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
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProceduresSectionEntriesOptional2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedures Section Entries Optional2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2#validateProceduresSectionEntriesOptional2Entry1150(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional2 Entry1150</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2#validateProceduresSectionEntriesOptional2Entry1152(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional2 Entry1152</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2#validateProceduresSectionEntriesOptional2Entry1154(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional2 Entry1154</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2#validateProceduresSectionEntriesOptional2ProcedureActivityProcedure2EntryProcedureActivityProcedure21151(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional2 Procedure Activity Procedure2 Entry Procedure Activity Procedure21151</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2#validateProceduresSectionEntriesOptional2ProcedureActivityObservation2EntryProcedureActivityObservation21153(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional2 Procedure Activity Observation2 Entry Procedure Activity Observation21153</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2#validateProceduresSectionEntriesOptional2ProcedureActivityAct2EntryProcedureActivityAct21155(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional2 Procedure Activity Act2 Entry Procedure Activity Act21155</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2#validateProceduresSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2#validateProceduresSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2#validateProceduresSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProceduresSectionEntriesOptional2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProceduresSectionEntriesOptional2Entry1150() {
		OperationsTestCase<ProceduresSectionEntriesOptional2> validateProceduresSectionEntriesOptional2Entry1150TestCase = new OperationsTestCase<ProceduresSectionEntriesOptional2>(
			"validateProceduresSectionEntriesOptional2Entry1150",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL2_ENTRY1150__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptional2Operations.validateProceduresSectionEntriesOptional2Entry1150(
					(ProceduresSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptional2Entry1150TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProceduresSectionEntriesOptional2Entry1152() {
		OperationsTestCase<ProceduresSectionEntriesOptional2> validateProceduresSectionEntriesOptional2Entry1152TestCase = new OperationsTestCase<ProceduresSectionEntriesOptional2>(
			"validateProceduresSectionEntriesOptional2Entry1152",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL2_ENTRY1152__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptional2Operations.validateProceduresSectionEntriesOptional2Entry1152(
					(ProceduresSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptional2Entry1152TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProceduresSectionEntriesOptional2Entry1154() {
		OperationsTestCase<ProceduresSectionEntriesOptional2> validateProceduresSectionEntriesOptional2Entry1154TestCase = new OperationsTestCase<ProceduresSectionEntriesOptional2>(
			"validateProceduresSectionEntriesOptional2Entry1154",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL2_ENTRY1154__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptional2Operations.validateProceduresSectionEntriesOptional2Entry1154(
					(ProceduresSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptional2Entry1154TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProceduresSectionEntriesOptional2ProcedureActivityProcedure2EntryProcedureActivityProcedure21151() {
		OperationsTestCase<ProceduresSectionEntriesOptional2> validateProceduresSectionEntriesOptional2ProcedureActivityProcedure2EntryProcedureActivityProcedure21151TestCase = new OperationsTestCase<ProceduresSectionEntriesOptional2>(
			"validateProceduresSectionEntriesOptional2ProcedureActivityProcedure2EntryProcedureActivityProcedure21151",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL2_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE21151__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptional2Operations.validateProceduresSectionEntriesOptional2ProcedureActivityProcedure2EntryProcedureActivityProcedure21151(
					(ProceduresSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptional2ProcedureActivityProcedure2EntryProcedureActivityProcedure21151TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProceduresSectionEntriesOptional2ProcedureActivityObservation2EntryProcedureActivityObservation21153() {
		OperationsTestCase<ProceduresSectionEntriesOptional2> validateProceduresSectionEntriesOptional2ProcedureActivityObservation2EntryProcedureActivityObservation21153TestCase = new OperationsTestCase<ProceduresSectionEntriesOptional2>(
			"validateProceduresSectionEntriesOptional2ProcedureActivityObservation2EntryProcedureActivityObservation21153",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL2_PROCEDURE_ACTIVITY_OBSERVATION2_ENTRY_PROCEDURE_ACTIVITY_OBSERVATION21153__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptional2Operations.validateProceduresSectionEntriesOptional2ProcedureActivityObservation2EntryProcedureActivityObservation21153(
					(ProceduresSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptional2ProcedureActivityObservation2EntryProcedureActivityObservation21153TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProceduresSectionEntriesOptional2ProcedureActivityAct2EntryProcedureActivityAct21155() {
		OperationsTestCase<ProceduresSectionEntriesOptional2> validateProceduresSectionEntriesOptional2ProcedureActivityAct2EntryProcedureActivityAct21155TestCase = new OperationsTestCase<ProceduresSectionEntriesOptional2>(
			"validateProceduresSectionEntriesOptional2ProcedureActivityAct2EntryProcedureActivityAct21155",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL2_PROCEDURE_ACTIVITY_ACT2_ENTRY_PROCEDURE_ACTIVITY_ACT21155__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptional2Operations.validateProceduresSectionEntriesOptional2ProcedureActivityAct2EntryProcedureActivityAct21155(
					(ProceduresSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptional2ProcedureActivityAct2EntryProcedureActivityAct21155TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalTemplateId() {
		OperationsTestCase<ProceduresSectionEntriesOptional2> validateProceduresSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<ProceduresSectionEntriesOptional2>(
			"validateProceduresSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptional2Operations.validateProceduresSectionEntriesOptionalTemplateId(
					(ProceduresSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalCodeP() {
		OperationsTestCase<ProceduresSectionEntriesOptional2> validateProceduresSectionEntriesOptionalCodePTestCase = new OperationsTestCase<ProceduresSectionEntriesOptional2>(
			"validateProceduresSectionEntriesOptionalCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptional2Operations.validateProceduresSectionEntriesOptionalCodeP(
					(ProceduresSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalCode() {
		OperationsTestCase<ProceduresSectionEntriesOptional2> validateProceduresSectionEntriesOptionalCodeTestCase = new OperationsTestCase<ProceduresSectionEntriesOptional2>(
			"validateProceduresSectionEntriesOptionalCode", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected void setDependency(ProceduresSectionEntriesOptional2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptionalCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptional2Operations.validateProceduresSectionEntriesOptionalCode(
					(ProceduresSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProceduresSectionEntriesOptional2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ProceduresSectionEntriesOptional2> {
		@Override
		public ProceduresSectionEntriesOptional2 create() {
			return ConsolFactory.eINSTANCE.createProceduresSectionEntriesOptional2();
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
	private static class ConstructorTestClass extends ProceduresSectionEntriesOptional2Operations {
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

} // ProceduresSectionEntriesOptional2Operations
