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
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ImmunizationsSection2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunizations Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection2#validateImmunizationsSection2NullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section2 Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection2#validateImmunizationsSection2Title(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section2 Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection2#validateImmunizationsSection2Text(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section2 Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection2#validateImmunizationsSection2Entry1196(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section2 Entry1196</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection2#validateImmunizationsSection2ImmunizationActivity2EntryImmunizationActivity21197(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section2 Immunization Activity2 Entry Immunization Activity21197</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection2#validateImmunizationsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection2#validateImmunizationsSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection2#validateImmunizationsSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ImmunizationsSection2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationsSection2NullFlavor() {
		OperationsTestCase<ImmunizationsSection2> validateImmunizationsSection2NullFlavorTestCase = new OperationsTestCase<ImmunizationsSection2>(
			"validateImmunizationsSection2NullFlavor",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATIONS_SECTION2_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSection2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationsSection2Operations.validateImmunizationsSection2NullFlavor(
					(ImmunizationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationsSection2NullFlavorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationsSection2Title() {
		OperationsTestCase<ImmunizationsSection2> validateImmunizationsSection2TitleTestCase = new OperationsTestCase<ImmunizationsSection2>(
			"validateImmunizationsSection2Title",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATIONS_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSection2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationsSection2 target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationsSection2Operations.validateImmunizationsSection2Title(
					(ImmunizationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationsSection2TitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationsSection2Text() {
		OperationsTestCase<ImmunizationsSection2> validateImmunizationsSection2TextTestCase = new OperationsTestCase<ImmunizationsSection2>(
			"validateImmunizationsSection2Text",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATIONS_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSection2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationsSection2 target) {
				target.init();

				// ED text = DatatypesFactory.eINSTANCE.createED();
				// target.setText(text );
				//

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationsSection2Operations.validateImmunizationsSection2Text(
					(ImmunizationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationsSection2TextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateImmunizationsSection2Entry1196() {
		OperationsTestCase<ImmunizationsSection2> validateImmunizationsSection2Entry1196TestCase = new OperationsTestCase<ImmunizationsSection2>(
			"validateImmunizationsSection2Entry1196",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATIONS_SECTION2_ENTRY1196__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSection2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationsSection2Operations.validateImmunizationsSection2Entry1196(
					(ImmunizationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationsSection2Entry1196TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateImmunizationsSection2ImmunizationActivity2EntryImmunizationActivity21197() {
		OperationsTestCase<ImmunizationsSection2> validateImmunizationsSection2ImmunizationActivity2EntryImmunizationActivity21197TestCase = new OperationsTestCase<ImmunizationsSection2>(
			"validateImmunizationsSection2ImmunizationActivity2EntryImmunizationActivity21197",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATIONS_SECTION2_IMMUNIZATION_ACTIVITY2_ENTRY_IMMUNIZATION_ACTIVITY21197__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSection2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationsSection2Operations.validateImmunizationsSection2ImmunizationActivity2EntryImmunizationActivity21197(
					(ImmunizationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationsSection2ImmunizationActivity2EntryImmunizationActivity21197TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationsSectionEntriesOptionalTemplateId() {
		OperationsTestCase<ImmunizationsSection2> validateImmunizationsSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<ImmunizationsSection2>(
			"validateImmunizationsSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSection2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationsSection2Operations.validateImmunizationsSectionEntriesOptionalTemplateId(
					(ImmunizationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationsSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationsSectionEntriesOptionalCodeP() {
		OperationsTestCase<ImmunizationsSection2> validateImmunizationsSectionEntriesOptionalCodePTestCase = new OperationsTestCase<ImmunizationsSection2>(
			"validateImmunizationsSectionEntriesOptionalCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSection2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationsSection2Operations.validateImmunizationsSectionEntriesOptionalCodeP(
					(ImmunizationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationsSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationsSectionEntriesOptionalCode() {
		OperationsTestCase<ImmunizationsSection2> validateImmunizationsSectionEntriesOptionalCodeTestCase = new OperationsTestCase<ImmunizationsSection2>(
			"validateImmunizationsSectionEntriesOptionalCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSection2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationsSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(ImmunizationsSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptionalCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationsSection2Operations.validateImmunizationsSectionEntriesOptionalCode(
					(ImmunizationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationsSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ImmunizationsSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ImmunizationsSection2> {
		@Override
		public ImmunizationsSection2 create() {
			return ConsolFactory.eINSTANCE.createImmunizationsSection2();
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
	private static class ConstructorTestClass extends ImmunizationsSection2Operations {
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

} // ImmunizationsSection2Operations
