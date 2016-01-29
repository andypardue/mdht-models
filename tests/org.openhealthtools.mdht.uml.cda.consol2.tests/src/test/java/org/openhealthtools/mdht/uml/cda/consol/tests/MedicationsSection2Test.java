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
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationsSection2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medications Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSection2#validateMedicationsSection2NullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section2 Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSection2#validateMedicationsSection2Title(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section2 Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSection2#validateMedicationsSection2Text(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section2 Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSection2#validateMedicationsSection2Entry1198(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section2 Entry1198</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSection2#validateMedicationsSection2MedicationActivity2EntryMedicationActivity21199(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section2 Medication Activity2 Entry Medication Activity21199</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSection2#validateMedicationsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSection2#validateMedicationsSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSection2#validateMedicationsSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Entries Optional Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationsSection2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationsSection2NullFlavor() {
		OperationsTestCase<MedicationsSection2> validateMedicationsSection2NullFlavorTestCase = new OperationsTestCase<MedicationsSection2>(
			"validateMedicationsSection2NullFlavor",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_SECTION2_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSection2 target) {

			}

			@Override
			protected void updateToPass(MedicationsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSection2Operations.validateMedicationsSection2NullFlavor(
					(MedicationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSection2NullFlavorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationsSection2Title() {
		OperationsTestCase<MedicationsSection2> validateMedicationsSection2TitleTestCase = new OperationsTestCase<MedicationsSection2>(
			"validateMedicationsSection2Title",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSection2 target) {

			}

			@Override
			protected void updateToPass(MedicationsSection2 target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSection2Operations.validateMedicationsSection2Title(
					(MedicationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSection2TitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationsSection2Text() {
		OperationsTestCase<MedicationsSection2> validateMedicationsSection2TextTestCase = new OperationsTestCase<MedicationsSection2>(
			"validateMedicationsSection2Text",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSection2 target) {

			}

			@Override
			protected void updateToPass(MedicationsSection2 target) {
				target.init();

				DatatypesFactory.eINSTANCE.createED();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSection2Operations.validateMedicationsSection2Text(
					(MedicationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSection2TextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMedicationsSection2Entry1198() {
		OperationsTestCase<MedicationsSection2> validateMedicationsSection2Entry1198TestCase = new OperationsTestCase<MedicationsSection2>(
			"validateMedicationsSection2Entry1198",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_SECTION2_ENTRY1198__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSection2 target) {

			}

			@Override
			protected void updateToPass(MedicationsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSection2Operations.validateMedicationsSection2Entry1198(
					(MedicationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSection2Entry1198TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMedicationsSection2MedicationActivity2EntryMedicationActivity21199() {
		OperationsTestCase<MedicationsSection2> validateMedicationsSection2MedicationActivity2EntryMedicationActivity21199TestCase = new OperationsTestCase<MedicationsSection2>(
			"validateMedicationsSection2MedicationActivity2EntryMedicationActivity21199",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATIONS_SECTION2_MEDICATION_ACTIVITY2_ENTRY_MEDICATION_ACTIVITY21199__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSection2 target) {

			}

			@Override
			protected void updateToPass(MedicationsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSection2Operations.validateMedicationsSection2MedicationActivity2EntryMedicationActivity21199(
					(MedicationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSection2MedicationActivity2EntryMedicationActivity21199TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationsSectionEntriesOptionalTemplateId() {
		OperationsTestCase<MedicationsSection2> validateMedicationsSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<MedicationsSection2>(
			"validateMedicationsSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSection2 target) {

			}

			@Override
			protected void updateToPass(MedicationsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSection2Operations.validateMedicationsSectionEntriesOptionalTemplateId(
					(MedicationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationsSectionEntriesOptionalCodeP() {
		OperationsTestCase<MedicationsSection2> validateMedicationsSectionEntriesOptionalCodePTestCase = new OperationsTestCase<MedicationsSection2>(
			"validateMedicationsSectionEntriesOptionalCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSection2 target) {

			}

			@Override
			protected void updateToPass(MedicationsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSection2Operations.validateMedicationsSectionEntriesOptionalCodeP(
					(MedicationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationsSectionEntriesOptionalCode() {
		OperationsTestCase<MedicationsSection2> validateMedicationsSectionEntriesOptionalCodeTestCase = new OperationsTestCase<MedicationsSection2>(
			"validateMedicationsSectionEntriesOptionalCode", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSection2 target) {

			}

			@Override
			protected void updateToPass(MedicationsSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(MedicationsSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptionalCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSection2Operations.validateMedicationsSectionEntriesOptionalCode(
					(MedicationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationsSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationsSection2> {
		@Override
		public MedicationsSection2 create() {
			return ConsolFactory.eINSTANCE.createMedicationsSection2();
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
	private static class ConstructorTestClass extends MedicationsSection2Operations {
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

} // MedicationsSection2Operations
