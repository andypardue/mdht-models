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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.TextObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.TextObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Text Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TextObservation#validateTextObservationTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Observation Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TextObservation#validateTextObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TextObservation#validateTextObservationReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Observation Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TextObservation#validateTextObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TextObservation#validateTextObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TextObservation#validateTextObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TextObservation#validateTextObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TextObservation#validateTextObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TextObservation#validateTextObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TextObservation#validateTextObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TextObservation#validateTextObservationEntryRelationship548(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Observation Entry Relationship548</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TextObservation#validateTextObservationEntryRelationship550(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Observation Entry Relationship550</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TextObservation#validateTextObservationSOPInstanceObservationEntryRelationshipSOPInstanceObservation549(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Observation SOP Instance Observation Entry Relationship SOP Instance Observation549</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TextObservation#validateTextObservationQuantityMeasurementObservationEntryRelationshipQuantityMeasurementObservation551(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Text Observation Quantity Measurement Observation Entry Relationship Quantity Measurement Observation551</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class TextObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTextObservationTextReference() {
		OperationsTestCase<TextObservation> validateTextObservationTextReferenceTestCase = new OperationsTestCase<TextObservation>(
			"validateTextObservationTextReference",
			operationsForOCL.getOCLValue("VALIDATE_TEXT_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TextObservation target) {

			}

			@Override
			protected void updateToPass(TextObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TextObservationOperations.validateTextObservationTextReference(
					(TextObservation) objectToTest, diagnostician, map);
			}

		};

		validateTextObservationTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTextObservationTextReferenceValue() {
		OperationsTestCase<TextObservation> validateTextObservationTextReferenceValueTestCase = new OperationsTestCase<TextObservation>(
			"validateTextObservationTextReferenceValue", operationsForOCL.getOCLValue(
				"VALIDATE_TEXT_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TextObservation target) {

			}

			@Override
			protected void updateToPass(TextObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TextObservationOperations.validateTextObservationTextReferenceValue(
					(TextObservation) objectToTest, diagnostician, map);
			}

		};

		validateTextObservationTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTextObservationReferenceValue() {
		OperationsTestCase<TextObservation> validateTextObservationReferenceValueTestCase = new OperationsTestCase<TextObservation>(
			"validateTextObservationReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_TEXT_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TextObservation target) {

			}

			@Override
			protected void updateToPass(TextObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TextObservationOperations.validateTextObservationReferenceValue(
					(TextObservation) objectToTest, diagnostician, map);
			}

		};

		validateTextObservationReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTextObservationTemplateId() {
		OperationsTestCase<TextObservation> validateTextObservationTemplateIdTestCase = new OperationsTestCase<TextObservation>(
			"validateTextObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_TEXT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TextObservation target) {

			}

			@Override
			protected void updateToPass(TextObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TextObservationOperations.validateTextObservationTemplateId(
					(TextObservation) objectToTest, diagnostician, map);
			}

		};

		validateTextObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTextObservationClassCode() {
		OperationsTestCase<TextObservation> validateTextObservationClassCodeTestCase = new OperationsTestCase<TextObservation>(
			"validateTextObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_TEXT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TextObservation target) {

			}

			@Override
			protected void updateToPass(TextObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TextObservationOperations.validateTextObservationClassCode(
					(TextObservation) objectToTest, diagnostician, map);
			}

		};

		validateTextObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTextObservationMoodCode() {
		OperationsTestCase<TextObservation> validateTextObservationMoodCodeTestCase = new OperationsTestCase<TextObservation>(
			"validateTextObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_TEXT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TextObservation target) {

			}

			@Override
			protected void updateToPass(TextObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TextObservationOperations.validateTextObservationMoodCode(
					(TextObservation) objectToTest, diagnostician, map);
			}

		};

		validateTextObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTextObservationCode() {
		OperationsTestCase<TextObservation> validateTextObservationCodeTestCase = new OperationsTestCase<TextObservation>(
			"validateTextObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_TEXT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TextObservation target) {

			}

			@Override
			protected void updateToPass(TextObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TextObservationOperations.validateTextObservationCode(
					(TextObservation) objectToTest, diagnostician, map);
			}

		};

		validateTextObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTextObservationEffectiveTime() {
		OperationsTestCase<TextObservation> validateTextObservationEffectiveTimeTestCase = new OperationsTestCase<TextObservation>(
			"validateTextObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_TEXT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TextObservation target) {

			}

			@Override
			protected void updateToPass(TextObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TextObservationOperations.validateTextObservationEffectiveTime(
					(TextObservation) objectToTest, diagnostician, map);
			}

		};

		validateTextObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTextObservationText() {
		OperationsTestCase<TextObservation> validateTextObservationTextTestCase = new OperationsTestCase<TextObservation>(
			"validateTextObservationText",
			operationsForOCL.getOCLValue("VALIDATE_TEXT_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TextObservation target) {

			}

			@Override
			protected void updateToPass(TextObservation target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TextObservationOperations.validateTextObservationText(
					(TextObservation) objectToTest, diagnostician, map);
			}

		};

		validateTextObservationTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTextObservationValue() {
		OperationsTestCase<TextObservation> validateTextObservationValueTestCase = new OperationsTestCase<TextObservation>(
			"validateTextObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_TEXT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TextObservation target) {

			}

			@Override
			protected void updateToPass(TextObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TextObservationOperations.validateTextObservationValue(
					(TextObservation) objectToTest, diagnostician, map);
			}

		};

		validateTextObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTextObservationEntryRelationship548() {
		OperationsTestCase<TextObservation> validateTextObservationEntryRelationship548TestCase = new OperationsTestCase<TextObservation>(
			"validateTextObservationEntryRelationship548", operationsForOCL.getOCLValue(
				"VALIDATE_TEXT_OBSERVATION_ENTRY_RELATIONSHIP548__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TextObservation target) {

			}

			@Override
			protected void updateToPass(TextObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TextObservationOperations.validateTextObservationEntryRelationship548(
					(TextObservation) objectToTest, diagnostician, map);
			}

		};

		validateTextObservationEntryRelationship548TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTextObservationEntryRelationship550() {
		OperationsTestCase<TextObservation> validateTextObservationEntryRelationship550TestCase = new OperationsTestCase<TextObservation>(
			"validateTextObservationEntryRelationship550", operationsForOCL.getOCLValue(
				"VALIDATE_TEXT_OBSERVATION_ENTRY_RELATIONSHIP550__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TextObservation target) {

			}

			@Override
			protected void updateToPass(TextObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TextObservationOperations.validateTextObservationEntryRelationship550(
					(TextObservation) objectToTest, diagnostician, map);
			}

		};

		validateTextObservationEntryRelationship550TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTextObservationSOPInstanceObservationEntryRelationshipSOPInstanceObservation549() {
		OperationsTestCase<TextObservation> validateTextObservationSOPInstanceObservationEntryRelationshipSOPInstanceObservation549TestCase = new OperationsTestCase<TextObservation>(
			"validateTextObservationSOPInstanceObservationEntryRelationshipSOPInstanceObservation549",
			operationsForOCL.getOCLValue(
				"VALIDATE_TEXT_OBSERVATION_SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP_SOP_INSTANCE_OBSERVATION549__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TextObservation target) {

			}

			@Override
			protected void updateToPass(TextObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TextObservationOperations.validateTextObservationSOPInstanceObservationEntryRelationshipSOPInstanceObservation549(
					(TextObservation) objectToTest, diagnostician, map);
			}

		};

		validateTextObservationSOPInstanceObservationEntryRelationshipSOPInstanceObservation549TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTextObservationQuantityMeasurementObservationEntryRelationshipQuantityMeasurementObservation551() {
		OperationsTestCase<TextObservation> validateTextObservationQuantityMeasurementObservationEntryRelationshipQuantityMeasurementObservation551TestCase = new OperationsTestCase<TextObservation>(
			"validateTextObservationQuantityMeasurementObservationEntryRelationshipQuantityMeasurementObservation551",
			operationsForOCL.getOCLValue(
				"VALIDATE_TEXT_OBSERVATION_QUANTITY_MEASUREMENT_OBSERVATION_ENTRY_RELATIONSHIP_QUANTITY_MEASUREMENT_OBSERVATION551__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TextObservation target) {

			}

			@Override
			protected void updateToPass(TextObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TextObservationOperations.validateTextObservationQuantityMeasurementObservationEntryRelationshipQuantityMeasurementObservation551(
					(TextObservation) objectToTest, diagnostician, map);
			}

		};

		validateTextObservationQuantityMeasurementObservationEntryRelationshipQuantityMeasurementObservation551TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends TextObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TextObservation> {
		@Override
		public TextObservation create() {
			return ConsolFactory.eINSTANCE.createTextObservation();
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
	private static class ConstructorTestClass extends TextObservationOperations {
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

} // TextObservationOperations
