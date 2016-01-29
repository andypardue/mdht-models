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
import org.junit.Ignore;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AdvanceDirectivesSection2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directives Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#validateAdvanceDirectivesSection2HasAdvanceDirectiveObservation2XorAdvanceDirectiveOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Has Advance Directive Observation2 Xor Advance Directive Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#validateAdvanceDirectivesSection2Title(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#validateAdvanceDirectivesSection2Text(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#validateAdvanceDirectivesSection2NullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#validateAdvanceDirectivesSection2Entry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#validateAdvanceDirectivesSection2Entry1184(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Entry1184</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#validateAdvanceDirectivesSection2Entry1186(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Entry1186</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#validateAdvanceDirectivesSection2EntryAdvanceDirectiveOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Entry Advance Directive Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#validateAdvanceDirectivesSection2EntryAdvanceDirectiveObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Entry Advance Directive Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#validateAdvanceDirectivesSection2AdvanceDirectiveObservation2EntryAdvanceDirectiveObservation21185(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Advance Directive Observation2 Entry Advance Directive Observation21185</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#validateAdvanceDirectivesSection2AdvanceDirectiveOrganizerEntryAdvanceDirectiveOrganizer1187(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section2 Advance Directive Organizer Entry Advance Directive Organizer1187</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#validateAdvanceDirectivesSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#validateAdvanceDirectivesSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2#validateAdvanceDirectivesSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdvanceDirectivesSection2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectivesSection2HasAdvanceDirectiveObservation2XorAdvanceDirectiveOrganizer() {
		OperationsTestCase<AdvanceDirectivesSection2> validateAdvanceDirectivesSection2HasAdvanceDirectiveObservation2XorAdvanceDirectiveOrganizerTestCase = new OperationsTestCase<AdvanceDirectivesSection2>(
			"validateAdvanceDirectivesSection2HasAdvanceDirectiveObservation2XorAdvanceDirectiveOrganizer",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVES_SECTION2_HAS_ADVANCE_DIRECTIVE_OBSERVATION2_XOR_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSection2Operations.validateAdvanceDirectivesSection2HasAdvanceDirectiveObservation2XorAdvanceDirectiveOrganizer(
					(AdvanceDirectivesSection2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSection2HasAdvanceDirectiveObservation2XorAdvanceDirectiveOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	* This attribute is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Test
	@Ignore
	public void testValidateAdvanceDirectivesSection2Text() {
		OperationsTestCase<AdvanceDirectivesSection2> validateAdvanceDirectivesSection2TextTestCase = new OperationsTestCase<AdvanceDirectivesSection2>(
			"validateAdvanceDirectivesSection2Text",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVES_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection2 target) {
				target.init();

				DatatypesFactory.eINSTANCE.createED();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSection2Operations.validateAdvanceDirectivesSection2Text(
					(AdvanceDirectivesSection2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSection2TextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	* This attribute is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Test
	@Ignore
	public void testValidateAdvanceDirectivesSection2Title() {
		OperationsTestCase<AdvanceDirectivesSection2> validateAdvanceDirectivesSection2TitleTestCase = new OperationsTestCase<AdvanceDirectivesSection2>(
			"validateAdvanceDirectivesSection2Title",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVES_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection2 target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSection2Operations.validateAdvanceDirectivesSection2Title(
					(AdvanceDirectivesSection2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSection2TitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectivesSection2NullFlavor() {
		OperationsTestCase<AdvanceDirectivesSection2> validateAdvanceDirectivesSection2NullFlavorTestCase = new OperationsTestCase<AdvanceDirectivesSection2>(
			"validateAdvanceDirectivesSection2NullFlavor", operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVES_SECTION2_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSection2Operations.validateAdvanceDirectivesSection2NullFlavor(
					(AdvanceDirectivesSection2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSection2NullFlavorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectivesSection2Entry() {
		OperationsTestCase<AdvanceDirectivesSection2> validateAdvanceDirectivesSection2EntryTestCase = new OperationsTestCase<AdvanceDirectivesSection2>(
			"validateAdvanceDirectivesSection2Entry",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSection2Operations.validateAdvanceDirectivesSection2Entry(
					(AdvanceDirectivesSection2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSection2EntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAdvanceDirectivesSection2Entry1184() {
		OperationsTestCase<AdvanceDirectivesSection2> validateAdvanceDirectivesSection2Entry1184TestCase = new OperationsTestCase<AdvanceDirectivesSection2>(
			"validateAdvanceDirectivesSection2Entry1184", operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ENTRY1184__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSection2Operations.validateAdvanceDirectivesSection2Entry1184(
					(AdvanceDirectivesSection2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSection2Entry1184TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAdvanceDirectivesSection2Entry1186() {
		OperationsTestCase<AdvanceDirectivesSection2> validateAdvanceDirectivesSection2Entry1186TestCase = new OperationsTestCase<AdvanceDirectivesSection2>(
			"validateAdvanceDirectivesSection2Entry1186", operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ENTRY1186__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSection2Operations.validateAdvanceDirectivesSection2Entry1186(
					(AdvanceDirectivesSection2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSection2Entry1186TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectivesSection2EntryAdvanceDirectiveOrganizer() {
		OperationsTestCase<AdvanceDirectivesSection2> validateAdvanceDirectivesSection2EntryAdvanceDirectiveOrganizerTestCase = new OperationsTestCase<AdvanceDirectivesSection2>(
			"validateAdvanceDirectivesSection2EntryAdvanceDirectiveOrganizer",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ENTRY_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSection2Operations.validateAdvanceDirectivesSection2EntryAdvanceDirectiveOrganizer(
					(AdvanceDirectivesSection2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSection2EntryAdvanceDirectiveOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectivesSection2EntryAdvanceDirectiveObservation2() {
		OperationsTestCase<AdvanceDirectivesSection2> validateAdvanceDirectivesSection2EntryAdvanceDirectiveObservation2TestCase = new OperationsTestCase<AdvanceDirectivesSection2>(
			"validateAdvanceDirectivesSection2EntryAdvanceDirectiveObservation2",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ENTRY_ADVANCE_DIRECTIVE_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSection2Operations.validateAdvanceDirectivesSection2EntryAdvanceDirectiveObservation2(
					(AdvanceDirectivesSection2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSection2EntryAdvanceDirectiveObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAdvanceDirectivesSection2AdvanceDirectiveObservation2EntryAdvanceDirectiveObservation21185() {
		OperationsTestCase<AdvanceDirectivesSection2> validateAdvanceDirectivesSection2AdvanceDirectiveObservation2EntryAdvanceDirectiveObservation21185TestCase = new OperationsTestCase<AdvanceDirectivesSection2>(
			"validateAdvanceDirectivesSection2AdvanceDirectiveObservation2EntryAdvanceDirectiveObservation21185",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ADVANCE_DIRECTIVE_OBSERVATION2_ENTRY_ADVANCE_DIRECTIVE_OBSERVATION21185__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSection2Operations.validateAdvanceDirectivesSection2AdvanceDirectiveObservation2EntryAdvanceDirectiveObservation21185(
					(AdvanceDirectivesSection2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSection2AdvanceDirectiveObservation2EntryAdvanceDirectiveObservation21185TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAdvanceDirectivesSection2AdvanceDirectiveOrganizerEntryAdvanceDirectiveOrganizer1187() {
		OperationsTestCase<AdvanceDirectivesSection2> validateAdvanceDirectivesSection2AdvanceDirectiveOrganizerEntryAdvanceDirectiveOrganizer1187TestCase = new OperationsTestCase<AdvanceDirectivesSection2>(
			"validateAdvanceDirectivesSection2AdvanceDirectiveOrganizerEntryAdvanceDirectiveOrganizer1187",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVES_SECTION2_ADVANCE_DIRECTIVE_ORGANIZER_ENTRY_ADVANCE_DIRECTIVE_ORGANIZER1187__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSection2Operations.validateAdvanceDirectivesSection2AdvanceDirectiveOrganizerEntryAdvanceDirectiveOrganizer1187(
					(AdvanceDirectivesSection2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSection2AdvanceDirectiveOrganizerEntryAdvanceDirectiveOrganizer1187TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectivesSectionEntriesOptionalTemplateId() {
		OperationsTestCase<AdvanceDirectivesSection2> validateAdvanceDirectivesSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<AdvanceDirectivesSection2>(
			"validateAdvanceDirectivesSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSection2Operations.validateAdvanceDirectivesSectionEntriesOptionalTemplateId(
					(AdvanceDirectivesSection2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	* This attribute is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Test
	@Ignore
	public void testValidateAdvanceDirectivesSectionEntriesOptionalCodeP() {
		OperationsTestCase<AdvanceDirectivesSection2> validateAdvanceDirectivesSectionEntriesOptionalCodePTestCase = new OperationsTestCase<AdvanceDirectivesSection2>(
			"validateAdvanceDirectivesSectionEntriesOptionalCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSection2Operations.validateAdvanceDirectivesSectionEntriesOptionalCodeP(
					(AdvanceDirectivesSection2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	* This attribute is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Test
	@Ignore
	public void testValidateAdvanceDirectivesSectionEntriesOptionalCode() {
		OperationsTestCase<AdvanceDirectivesSection2> validateAdvanceDirectivesSectionEntriesOptionalCodeTestCase = new OperationsTestCase<AdvanceDirectivesSection2>(
			"validateAdvanceDirectivesSectionEntriesOptionalCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(AdvanceDirectivesSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put(
					"org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptionalCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSection2Operations.validateAdvanceDirectivesSectionEntriesOptionalCode(
					(AdvanceDirectivesSection2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdvanceDirectivesSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<AdvanceDirectivesSection2> {
		@Override
		public AdvanceDirectivesSection2 create() {
			return ConsolFactory.eINSTANCE.createAdvanceDirectivesSection2();
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
	private static class ConstructorTestClass extends AdvanceDirectivesSection2Operations {
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

} // AdvanceDirectivesSection2Operations
