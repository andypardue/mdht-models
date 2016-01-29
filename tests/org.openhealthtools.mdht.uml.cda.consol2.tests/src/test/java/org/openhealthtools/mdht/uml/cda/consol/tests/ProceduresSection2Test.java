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
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProceduresSection2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedures Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2#validateProceduresSection2HasProcedureActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section2 Has Procedure Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2#validateProceduresSection2NullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section2 Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2#validateProceduresSection2Title(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section2 Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2#validateProceduresSection2Text(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section2 Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2#validateProceduresSection2Entry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section2 Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2#validateProceduresSection2Entry1204(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section2 Entry1204</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2#validateProceduresSection2Entry1206(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section2 Entry1206</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2#validateProceduresSection2Entry1208(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section2 Entry1208</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2#validateProceduresSection2EntryProcedureActivityAct2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section2 Entry Procedure Activity Act2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2#validateProceduresSection2EntryProcedureActivityObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section2 Entry Procedure Activity Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2#validateProceduresSection2EntryProcedureActivityProcedure2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section2 Entry Procedure Activity Procedure2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2#validateProceduresSection2ProcedureActivityAct2EntryProcedureActivityAct21205(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section2 Procedure Activity Act2 Entry Procedure Activity Act21205</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2#validateProceduresSection2ProcedureActivityObservation2EntryProcedureActivityObservation21207(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section2 Procedure Activity Observation2 Entry Procedure Activity Observation21207</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2#validateProceduresSection2ProcedureActivityProcedure2EntryProcedureActivityProcedure21209(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section2 Procedure Activity Procedure2 Entry Procedure Activity Procedure21209</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2#validateProceduresSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2#validateProceduresSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2#validateProceduresSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProceduresSection2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSection2HasProcedureActivity() {
		OperationsTestCase<ProceduresSection2> validateProceduresSection2HasProcedureActivityTestCase = new OperationsTestCase<ProceduresSection2>(
			"validateProceduresSection2HasProcedureActivity", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURES_SECTION2_HAS_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSection2Operations.validateProceduresSection2HasProcedureActivity(
					(ProceduresSection2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSection2HasProcedureActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSection2NullFlavor() {
		OperationsTestCase<ProceduresSection2> validateProceduresSection2NullFlavorTestCase = new OperationsTestCase<ProceduresSection2>(
			"validateProceduresSection2NullFlavor",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION2_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSection2Operations.validateProceduresSection2NullFlavor(
					(ProceduresSection2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSection2NullFlavorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSection2Title() {
		OperationsTestCase<ProceduresSection2> validateProceduresSection2TitleTestCase = new OperationsTestCase<ProceduresSection2>(
			"validateProceduresSection2Title",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSection2 target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSection2Operations.validateProceduresSection2Title(
					(ProceduresSection2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSection2TitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProceduresSection2Text() {
		OperationsTestCase<ProceduresSection2> validateProceduresSection2TextTestCase = new OperationsTestCase<ProceduresSection2>(
			"validateProceduresSection2Text",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSection2 target) {
				target.init();

				// ED text = DatatypesFactory.eINSTANCE.createED();
				// target.setText(text );

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSection2Operations.validateProceduresSection2Text(
					(ProceduresSection2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSection2TextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSection2Entry() {
		OperationsTestCase<ProceduresSection2> validateProceduresSection2EntryTestCase = new OperationsTestCase<ProceduresSection2>(
			"validateProceduresSection2Entry",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION2_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSection2Operations.validateProceduresSection2Entry(
					(ProceduresSection2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSection2EntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProceduresSection2Entry1204() {
		OperationsTestCase<ProceduresSection2> validateProceduresSection2Entry1204TestCase = new OperationsTestCase<ProceduresSection2>(
			"validateProceduresSection2Entry1204",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION2_ENTRY1204__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSection2Operations.validateProceduresSection2Entry1204(
					(ProceduresSection2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSection2Entry1204TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProceduresSection2Entry1206() {
		OperationsTestCase<ProceduresSection2> validateProceduresSection2Entry1206TestCase = new OperationsTestCase<ProceduresSection2>(
			"validateProceduresSection2Entry1206",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION2_ENTRY1206__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSection2Operations.validateProceduresSection2Entry1206(
					(ProceduresSection2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSection2Entry1206TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProceduresSection2Entry1208() {
		OperationsTestCase<ProceduresSection2> validateProceduresSection2Entry1208TestCase = new OperationsTestCase<ProceduresSection2>(
			"validateProceduresSection2Entry1208",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION2_ENTRY1208__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSection2Operations.validateProceduresSection2Entry1208(
					(ProceduresSection2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSection2Entry1208TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSection2EntryProcedureActivityAct2() {
		OperationsTestCase<ProceduresSection2> validateProceduresSection2EntryProcedureActivityAct2TestCase = new OperationsTestCase<ProceduresSection2>(
			"validateProceduresSection2EntryProcedureActivityAct2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURES_SECTION2_ENTRY_PROCEDURE_ACTIVITY_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSection2Operations.validateProceduresSection2EntryProcedureActivityAct2(
					(ProceduresSection2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSection2EntryProcedureActivityAct2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSection2EntryProcedureActivityObservation2() {
		OperationsTestCase<ProceduresSection2> validateProceduresSection2EntryProcedureActivityObservation2TestCase = new OperationsTestCase<ProceduresSection2>(
			"validateProceduresSection2EntryProcedureActivityObservation2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURES_SECTION2_ENTRY_PROCEDURE_ACTIVITY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSection2Operations.validateProceduresSection2EntryProcedureActivityObservation2(
					(ProceduresSection2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSection2EntryProcedureActivityObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSection2EntryProcedureActivityProcedure2() {
		OperationsTestCase<ProceduresSection2> validateProceduresSection2EntryProcedureActivityProcedure2TestCase = new OperationsTestCase<ProceduresSection2>(
			"validateProceduresSection2EntryProcedureActivityProcedure2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURES_SECTION2_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSection2Operations.validateProceduresSection2EntryProcedureActivityProcedure2(
					(ProceduresSection2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSection2EntryProcedureActivityProcedure2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProceduresSection2ProcedureActivityAct2EntryProcedureActivityAct21205() {
		OperationsTestCase<ProceduresSection2> validateProceduresSection2ProcedureActivityAct2EntryProcedureActivityAct21205TestCase = new OperationsTestCase<ProceduresSection2>(
			"validateProceduresSection2ProcedureActivityAct2EntryProcedureActivityAct21205",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURES_SECTION2_PROCEDURE_ACTIVITY_ACT2_ENTRY_PROCEDURE_ACTIVITY_ACT21205__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSection2Operations.validateProceduresSection2ProcedureActivityAct2EntryProcedureActivityAct21205(
					(ProceduresSection2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSection2ProcedureActivityAct2EntryProcedureActivityAct21205TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProceduresSection2ProcedureActivityObservation2EntryProcedureActivityObservation21207() {
		OperationsTestCase<ProceduresSection2> validateProceduresSection2ProcedureActivityObservation2EntryProcedureActivityObservation21207TestCase = new OperationsTestCase<ProceduresSection2>(
			"validateProceduresSection2ProcedureActivityObservation2EntryProcedureActivityObservation21207",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURES_SECTION2_PROCEDURE_ACTIVITY_OBSERVATION2_ENTRY_PROCEDURE_ACTIVITY_OBSERVATION21207__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSection2Operations.validateProceduresSection2ProcedureActivityObservation2EntryProcedureActivityObservation21207(
					(ProceduresSection2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSection2ProcedureActivityObservation2EntryProcedureActivityObservation21207TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProceduresSection2ProcedureActivityProcedure2EntryProcedureActivityProcedure21209() {
		OperationsTestCase<ProceduresSection2> validateProceduresSection2ProcedureActivityProcedure2EntryProcedureActivityProcedure21209TestCase = new OperationsTestCase<ProceduresSection2>(
			"validateProceduresSection2ProcedureActivityProcedure2EntryProcedureActivityProcedure21209",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURES_SECTION2_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE21209__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSection2Operations.validateProceduresSection2ProcedureActivityProcedure2EntryProcedureActivityProcedure21209(
					(ProceduresSection2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSection2ProcedureActivityProcedure2EntryProcedureActivityProcedure21209TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalTemplateId() {
		OperationsTestCase<ProceduresSection2> validateProceduresSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<ProceduresSection2>(
			"validateProceduresSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSection2Operations.validateProceduresSectionEntriesOptionalTemplateId(
					(ProceduresSection2) objectToTest, diagnostician, map);
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
		OperationsTestCase<ProceduresSection2> validateProceduresSectionEntriesOptionalCodePTestCase = new OperationsTestCase<ProceduresSection2>(
			"validateProceduresSectionEntriesOptionalCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSection2Operations.validateProceduresSectionEntriesOptionalCodeP(
					(ProceduresSection2) objectToTest, diagnostician, map);
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
		OperationsTestCase<ProceduresSection2> validateProceduresSectionEntriesOptionalCodeTestCase = new OperationsTestCase<ProceduresSection2>(
			"validateProceduresSectionEntriesOptionalCode", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(ProceduresSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptionalCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSection2Operations.validateProceduresSectionEntriesOptionalCode(
					(ProceduresSection2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProceduresSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ProceduresSection2> {
		@Override
		public ProceduresSection2 create() {
			return ConsolFactory.eINSTANCE.createProceduresSection2();
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
	private static class ConstructorTestClass extends ProceduresSection2Operations {
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

} // ProceduresSection2Operations
