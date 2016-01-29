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
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.operations.VitalSignsSectionEntriesOptional2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Signs Section Entries Optional2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional2#validateVitalSignsSectionEntriesOptional2Entry1172(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Entries Optional2 Entry1172</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional2#validateVitalSignsSectionEntriesOptional2VitalSignsOrganizer2EntryVitalSignsOrganizer21173(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Entries Optional2 Vital Signs Organizer2 Entry Vital Signs Organizer21173</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional2#validateVitalSignsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional2#validateVitalSignsSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional2#validateVitalSignsSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Entries Optional Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class VitalSignsSectionEntriesOptional2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateVitalSignsSectionEntriesOptional2Entry1172() {
		OperationsTestCase<VitalSignsSectionEntriesOptional2> validateVitalSignsSectionEntriesOptional2Entry1172TestCase = new OperationsTestCase<VitalSignsSectionEntriesOptional2>(
			"validateVitalSignsSectionEntriesOptional2Entry1172",
			operationsForOCL.getOCLValue(
				"VALIDATE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2_ENTRY1172__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(VitalSignsSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsSectionEntriesOptional2Operations.validateVitalSignsSectionEntriesOptional2Entry1172(
					(VitalSignsSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsSectionEntriesOptional2Entry1172TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateVitalSignsSectionEntriesOptional2VitalSignsOrganizer2EntryVitalSignsOrganizer21173() {
		OperationsTestCase<VitalSignsSectionEntriesOptional2> validateVitalSignsSectionEntriesOptional2VitalSignsOrganizer2EntryVitalSignsOrganizer21173TestCase = new OperationsTestCase<VitalSignsSectionEntriesOptional2>(
			"validateVitalSignsSectionEntriesOptional2VitalSignsOrganizer2EntryVitalSignsOrganizer21173",
			operationsForOCL.getOCLValue(
				"VALIDATE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2_VITAL_SIGNS_ORGANIZER2_ENTRY_VITAL_SIGNS_ORGANIZER21173__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(VitalSignsSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsSectionEntriesOptional2Operations.validateVitalSignsSectionEntriesOptional2VitalSignsOrganizer2EntryVitalSignsOrganizer21173(
					(VitalSignsSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsSectionEntriesOptional2VitalSignsOrganizer2EntryVitalSignsOrganizer21173TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignsSectionEntriesOptionalTemplateId() {
		OperationsTestCase<VitalSignsSectionEntriesOptional2> validateVitalSignsSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<VitalSignsSectionEntriesOptional2>(
			"validateVitalSignsSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(VitalSignsSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsSectionEntriesOptional2Operations.validateVitalSignsSectionEntriesOptionalTemplateId(
					(VitalSignsSectionEntriesOptional2) objectToTest, diagnostician, map);
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
		OperationsTestCase<VitalSignsSectionEntriesOptional2> validateVitalSignsSectionEntriesOptionalCodePTestCase = new OperationsTestCase<VitalSignsSectionEntriesOptional2>(
			"validateVitalSignsSectionEntriesOptionalCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(VitalSignsSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsSectionEntriesOptional2Operations.validateVitalSignsSectionEntriesOptionalCodeP(
					(VitalSignsSectionEntriesOptional2) objectToTest, diagnostician, map);
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
		OperationsTestCase<VitalSignsSectionEntriesOptional2> validateVitalSignsSectionEntriesOptionalCodeTestCase = new OperationsTestCase<VitalSignsSectionEntriesOptional2>(
			"validateVitalSignsSectionEntriesOptionalCode", operationsForOCL.getOCLValue(
				"VALIDATE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(VitalSignsSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected void setDependency(VitalSignsSectionEntriesOptional2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptionalCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsSectionEntriesOptional2Operations.validateVitalSignsSectionEntriesOptionalCode(
					(VitalSignsSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends VitalSignsSectionEntriesOptional2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<VitalSignsSectionEntriesOptional2> {
		@Override
		public VitalSignsSectionEntriesOptional2 create() {
			return ConsolFactory.eINSTANCE.createVitalSignsSectionEntriesOptional2();
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
	private static class ConstructorTestClass extends VitalSignsSectionEntriesOptional2Operations {
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

} // VitalSignsSectionEntriesOptional2Operations
