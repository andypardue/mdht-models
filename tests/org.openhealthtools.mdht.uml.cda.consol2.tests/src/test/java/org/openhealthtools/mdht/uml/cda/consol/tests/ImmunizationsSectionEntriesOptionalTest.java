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
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.operations.ImmunizationsSectionEntriesOptionalOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunizations Section Entries Optional</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional#validateImmunizationsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional#validateImmunizationsSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional#validateImmunizationsSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional#validateImmunizationsSectionEntriesOptionalTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional#validateImmunizationsSectionEntriesOptionalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional#validateImmunizationsSectionEntriesOptionalEntry262(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Entry262</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional#validateImmunizationsSectionEntriesOptionalImmunizationActivityEntryImmunizationActivity263(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Immunization Activity Entry Immunization Activity263</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ImmunizationsSectionEntriesOptionalTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationsSectionEntriesOptionalTemplateId() {
		OperationsTestCase<ImmunizationsSectionEntriesOptional> validateImmunizationsSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<ImmunizationsSectionEntriesOptional>(
			"validateImmunizationsSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ImmunizationsSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationsSectionEntriesOptionalOperations.validateImmunizationsSectionEntriesOptionalTemplateId(
					(ImmunizationsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationsSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationsSectionEntriesOptionalCode() {
		OperationsTestCase<ImmunizationsSectionEntriesOptional> validateImmunizationsSectionEntriesOptionalCodeTestCase = new OperationsTestCase<ImmunizationsSectionEntriesOptional>(
			"validateImmunizationsSectionEntriesOptionalCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ImmunizationsSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationsSectionEntriesOptionalOperations.validateImmunizationsSectionEntriesOptionalCode(
					(ImmunizationsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationsSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationsSectionEntriesOptionalCodeP() {
		OperationsTestCase<ImmunizationsSectionEntriesOptional> validateImmunizationsSectionEntriesOptionalCodePTestCase = new OperationsTestCase<ImmunizationsSectionEntriesOptional>(
			"validateImmunizationsSectionEntriesOptionalCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ImmunizationsSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationsSectionEntriesOptionalOperations.validateImmunizationsSectionEntriesOptionalCodeP(
					(ImmunizationsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationsSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationsSectionEntriesOptionalTitle() {
		OperationsTestCase<ImmunizationsSectionEntriesOptional> validateImmunizationsSectionEntriesOptionalTitleTestCase = new OperationsTestCase<ImmunizationsSectionEntriesOptional>(
			"validateImmunizationsSectionEntriesOptionalTitle",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ImmunizationsSectionEntriesOptional target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationsSectionEntriesOptionalOperations.validateImmunizationsSectionEntriesOptionalTitle(
					(ImmunizationsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationsSectionEntriesOptionalTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationsSectionEntriesOptionalText() {
		OperationsTestCase<ImmunizationsSectionEntriesOptional> validateImmunizationsSectionEntriesOptionalTextTestCase = new OperationsTestCase<ImmunizationsSectionEntriesOptional>(
			"validateImmunizationsSectionEntriesOptionalText",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ImmunizationsSectionEntriesOptional target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationsSectionEntriesOptionalOperations.validateImmunizationsSectionEntriesOptionalText(
					(ImmunizationsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationsSectionEntriesOptionalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateImmunizationsSectionEntriesOptionalEntry262() {
		OperationsTestCase<ImmunizationsSectionEntriesOptional> validateImmunizationsSectionEntriesOptionalEntry262TestCase = new OperationsTestCase<ImmunizationsSectionEntriesOptional>(
			"validateImmunizationsSectionEntriesOptionalEntry262",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_ENTRY262__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ImmunizationsSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationsSectionEntriesOptionalOperations.validateImmunizationsSectionEntriesOptionalEntry262(
					(ImmunizationsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationsSectionEntriesOptionalEntry262TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateImmunizationsSectionEntriesOptionalImmunizationActivityEntryImmunizationActivity263() {
		OperationsTestCase<ImmunizationsSectionEntriesOptional> validateImmunizationsSectionEntriesOptionalImmunizationActivityEntryImmunizationActivity263TestCase = new OperationsTestCase<ImmunizationsSectionEntriesOptional>(
			"validateImmunizationsSectionEntriesOptionalImmunizationActivityEntryImmunizationActivity263",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_IMMUNIZATION_ACTIVITY_ENTRY_IMMUNIZATION_ACTIVITY263__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ImmunizationsSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationsSectionEntriesOptionalOperations.validateImmunizationsSectionEntriesOptionalImmunizationActivityEntryImmunizationActivity263(
					(ImmunizationsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationsSectionEntriesOptionalImmunizationActivityEntryImmunizationActivity263TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ImmunizationsSectionEntriesOptionalOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ImmunizationsSectionEntriesOptional> {
		@Override
		public ImmunizationsSectionEntriesOptional create() {
			return ConsolFactory.eINSTANCE.createImmunizationsSectionEntriesOptional();
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
	private static class ConstructorTestClass extends ImmunizationsSectionEntriesOptionalOperations {
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

} // ImmunizationsSectionEntriesOptionalOperations
