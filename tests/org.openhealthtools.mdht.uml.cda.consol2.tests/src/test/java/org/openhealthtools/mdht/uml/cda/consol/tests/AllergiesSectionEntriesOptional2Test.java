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
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AllergiesSectionEntriesOptional2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergies Section Entries Optional2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional2#validateAllergiesSectionEntriesOptional2Entry1188(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional2 Entry1188</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional2#validateAllergiesSectionEntriesOptional2AllergyConcernAct2EntryAllergyConcernAct21189(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional2 Allergy Concern Act2 Entry Allergy Concern Act21189</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional2#validateAllergiesSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional2#validateAllergiesSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional2#validateAllergiesSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AllergiesSectionEntriesOptional2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAllergiesSectionEntriesOptional2Entry1188() {
		OperationsTestCase<AllergiesSectionEntriesOptional2> validateAllergiesSectionEntriesOptional2Entry1188TestCase = new OperationsTestCase<AllergiesSectionEntriesOptional2>(
			"validateAllergiesSectionEntriesOptional2Entry1188",
			operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL2_ENTRY1188__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(AllergiesSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesSectionEntriesOptional2Operations.validateAllergiesSectionEntriesOptional2Entry1188(
					(AllergiesSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesSectionEntriesOptional2Entry1188TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAllergiesSectionEntriesOptional2AllergyConcernAct2EntryAllergyConcernAct21189() {
		OperationsTestCase<AllergiesSectionEntriesOptional2> validateAllergiesSectionEntriesOptional2AllergyConcernAct2EntryAllergyConcernAct21189TestCase = new OperationsTestCase<AllergiesSectionEntriesOptional2>(
			"validateAllergiesSectionEntriesOptional2AllergyConcernAct2EntryAllergyConcernAct21189",
			operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL2_ALLERGY_CONCERN_ACT2_ENTRY_ALLERGY_CONCERN_ACT21189__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(AllergiesSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesSectionEntriesOptional2Operations.validateAllergiesSectionEntriesOptional2AllergyConcernAct2EntryAllergyConcernAct21189(
					(AllergiesSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesSectionEntriesOptional2AllergyConcernAct2EntryAllergyConcernAct21189TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergiesSectionEntriesOptionalTemplateId() {
		OperationsTestCase<AllergiesSectionEntriesOptional2> validateAllergiesSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<AllergiesSectionEntriesOptional2>(
			"validateAllergiesSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(AllergiesSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesSectionEntriesOptional2Operations.validateAllergiesSectionEntriesOptionalTemplateId(
					(AllergiesSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergiesSectionEntriesOptionalCodeP() {
		OperationsTestCase<AllergiesSectionEntriesOptional2> validateAllergiesSectionEntriesOptionalCodePTestCase = new OperationsTestCase<AllergiesSectionEntriesOptional2>(
			"validateAllergiesSectionEntriesOptionalCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(AllergiesSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesSectionEntriesOptional2Operations.validateAllergiesSectionEntriesOptionalCodeP(
					(AllergiesSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergiesSectionEntriesOptionalCode() {
		OperationsTestCase<AllergiesSectionEntriesOptional2> validateAllergiesSectionEntriesOptionalCodeTestCase = new OperationsTestCase<AllergiesSectionEntriesOptional2>(
			"validateAllergiesSectionEntriesOptionalCode", operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(AllergiesSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected void setDependency(AllergiesSectionEntriesOptional2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptionalCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesSectionEntriesOptional2Operations.validateAllergiesSectionEntriesOptionalCode(
					(AllergiesSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AllergiesSectionEntriesOptional2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<AllergiesSectionEntriesOptional2> {
		@Override
		public AllergiesSectionEntriesOptional2 create() {
			return ConsolFactory.eINSTANCE.createAllergiesSectionEntriesOptional2();
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
	private static class ConstructorTestClass extends AllergiesSectionEntriesOptional2Operations {
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

} // AllergiesSectionEntriesOptional2Operations
