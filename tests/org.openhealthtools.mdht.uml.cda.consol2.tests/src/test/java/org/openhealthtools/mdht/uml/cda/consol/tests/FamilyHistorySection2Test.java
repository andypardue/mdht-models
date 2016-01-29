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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.FamilyHistorySection2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection2#validateFamilyHistorySection2Entry1546(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section2 Entry1546</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection2#validateFamilyHistorySection2FamilyHistoryOrganizer2EntryFamilyHistoryOrganizer21547(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section2 Family History Organizer2 Entry Family History Organizer21547</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection2#validateFamilyHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FamilyHistorySection2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFamilyHistorySection2Entry1546() {
		OperationsTestCase<FamilyHistorySection2> validateFamilyHistorySection2Entry1546TestCase = new OperationsTestCase<FamilyHistorySection2>(
			"validateFamilyHistorySection2Entry1546",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_SECTION2_ENTRY1546__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistorySection2 target) {

			}

			@Override
			protected void updateToPass(FamilyHistorySection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistorySection2Operations.validateFamilyHistorySection2Entry1546(
					(FamilyHistorySection2) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistorySection2Entry1546TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFamilyHistorySection2FamilyHistoryOrganizer2EntryFamilyHistoryOrganizer21547() {
		OperationsTestCase<FamilyHistorySection2> validateFamilyHistorySection2FamilyHistoryOrganizer2EntryFamilyHistoryOrganizer21547TestCase = new OperationsTestCase<FamilyHistorySection2>(
			"validateFamilyHistorySection2FamilyHistoryOrganizer2EntryFamilyHistoryOrganizer21547",
			operationsForOCL.getOCLValue(
				"VALIDATE_FAMILY_HISTORY_SECTION2_FAMILY_HISTORY_ORGANIZER2_ENTRY_FAMILY_HISTORY_ORGANIZER21547__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistorySection2 target) {

			}

			@Override
			protected void updateToPass(FamilyHistorySection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistorySection2Operations.validateFamilyHistorySection2FamilyHistoryOrganizer2EntryFamilyHistoryOrganizer21547(
					(FamilyHistorySection2) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistorySection2FamilyHistoryOrganizer2EntryFamilyHistoryOrganizer21547TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistorySectionTemplateId() {
		OperationsTestCase<FamilyHistorySection2> validateFamilyHistorySectionTemplateIdTestCase = new OperationsTestCase<FamilyHistorySection2>(
			"validateFamilyHistorySectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistorySection2 target) {

			}

			@Override
			protected void updateToPass(FamilyHistorySection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistorySection2Operations.validateFamilyHistorySectionTemplateId(
					(FamilyHistorySection2) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistorySectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FamilyHistorySection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<FamilyHistorySection2> {
		public FamilyHistorySection2 create() {
			return ConsolFactory.eINSTANCE.createFamilyHistorySection2();
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
	private static class ConstructorTestClass extends FamilyHistorySection2Operations {
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

} // FamilyHistorySection2Operations
