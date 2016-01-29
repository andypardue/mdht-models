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
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.VitalSignsSection2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Signs Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection2#validateVitalSignsSection2NullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section2 Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection2#validateVitalSignsSection2Title(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section2 Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection2#validateVitalSignsSection2Text(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section2 Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection2#validateVitalSignsSection2Entry1212(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section2 Entry1212</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection2#validateVitalSignsSection2VitalSignsOrganizer2EntryVitalSignsOrganizer21213(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section2 Vital Signs Organizer2 Entry Vital Signs Organizer21213</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection2#validateVitalSignsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection2#validateVitalSignsSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection2#validateVitalSignsSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Entries Optional Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class VitalSignsSection2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignsSection2NullFlavor() {
		OperationsTestCase<VitalSignsSection2> validateVitalSignsSection2NullFlavorTestCase = new OperationsTestCase<VitalSignsSection2>(
			"validateVitalSignsSection2NullFlavor",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_SECTION2_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsSection2 target) {

			}

			@Override
			protected void updateToPass(VitalSignsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsSection2Operations.validateVitalSignsSection2NullFlavor(
					(VitalSignsSection2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsSection2NullFlavorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignsSection2Title() {
		OperationsTestCase<VitalSignsSection2> validateVitalSignsSection2TitleTestCase = new OperationsTestCase<VitalSignsSection2>(
			"validateVitalSignsSection2Title",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsSection2 target) {

			}

			@Override
			protected void updateToPass(VitalSignsSection2 target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsSection2Operations.validateVitalSignsSection2Title(
					(VitalSignsSection2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsSection2TitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateVitalSignsSection2Text() {
		OperationsTestCase<VitalSignsSection2> validateVitalSignsSection2TextTestCase = new OperationsTestCase<VitalSignsSection2>(
			"validateVitalSignsSection2Text",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsSection2 target) {

			}

			@Override
			protected void updateToPass(VitalSignsSection2 target) {
				target.init();

				DatatypesFactory.eINSTANCE.createED();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsSection2Operations.validateVitalSignsSection2Text(
					(VitalSignsSection2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsSection2TextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateVitalSignsSection2Entry1212() {
		OperationsTestCase<VitalSignsSection2> validateVitalSignsSection2Entry1212TestCase = new OperationsTestCase<VitalSignsSection2>(
			"validateVitalSignsSection2Entry1212",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_SECTION2_ENTRY1212__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsSection2 target) {

			}

			@Override
			protected void updateToPass(VitalSignsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsSection2Operations.validateVitalSignsSection2Entry1212(
					(VitalSignsSection2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsSection2Entry1212TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateVitalSignsSection2VitalSignsOrganizer2EntryVitalSignsOrganizer21213() {
		OperationsTestCase<VitalSignsSection2> validateVitalSignsSection2VitalSignsOrganizer2EntryVitalSignsOrganizer21213TestCase = new OperationsTestCase<VitalSignsSection2>(
			"validateVitalSignsSection2VitalSignsOrganizer2EntryVitalSignsOrganizer21213",
			operationsForOCL.getOCLValue(
				"VALIDATE_VITAL_SIGNS_SECTION2_VITAL_SIGNS_ORGANIZER2_ENTRY_VITAL_SIGNS_ORGANIZER21213__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsSection2 target) {

			}

			@Override
			protected void updateToPass(VitalSignsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsSection2Operations.validateVitalSignsSection2VitalSignsOrganizer2EntryVitalSignsOrganizer21213(
					(VitalSignsSection2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsSection2VitalSignsOrganizer2EntryVitalSignsOrganizer21213TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignsSectionEntriesOptionalTemplateId() {
		OperationsTestCase<VitalSignsSection2> validateVitalSignsSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<VitalSignsSection2>(
			"validateVitalSignsSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsSection2 target) {

			}

			@Override
			protected void updateToPass(VitalSignsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsSection2Operations.validateVitalSignsSectionEntriesOptionalTemplateId(
					(VitalSignsSection2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignsSectionEntriesOptionalCodeP() {
		OperationsTestCase<VitalSignsSection2> validateVitalSignsSectionEntriesOptionalCodePTestCase = new OperationsTestCase<VitalSignsSection2>(
			"validateVitalSignsSectionEntriesOptionalCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsSection2 target) {

			}

			@Override
			protected void updateToPass(VitalSignsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsSection2Operations.validateVitalSignsSectionEntriesOptionalCodeP(
					(VitalSignsSection2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignsSectionEntriesOptionalCode() {
		OperationsTestCase<VitalSignsSection2> validateVitalSignsSectionEntriesOptionalCodeTestCase = new OperationsTestCase<VitalSignsSection2>(
			"validateVitalSignsSectionEntriesOptionalCode", operationsForOCL.getOCLValue(
				"VALIDATE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsSection2 target) {

			}

			@Override
			protected void updateToPass(VitalSignsSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(VitalSignsSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptionalCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsSection2Operations.validateVitalSignsSectionEntriesOptionalCode(
					(VitalSignsSection2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends VitalSignsSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<VitalSignsSection2> {
		@Override
		public VitalSignsSection2 create() {
			return ConsolFactory.eINSTANCE.createVitalSignsSection2();
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
	private static class ConstructorTestClass extends VitalSignsSection2Operations {
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

} // VitalSignsSection2Operations
