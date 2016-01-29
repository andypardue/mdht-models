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
import org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.QuantityMeasurementObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Quantity Measurement Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation#validateQuantityMeasurementObservationCodeCodeSystemDIR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Code Code System DIR</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation#validateQuantityMeasurementObservationCodeCodeSystemDICOM(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Code Code System DICOM</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation#validateQuantityMeasurementObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation#validateQuantityMeasurementObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation#validateQuantityMeasurementObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation#validateQuantityMeasurementObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation#validateQuantityMeasurementObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation#validateQuantityMeasurementObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation#validateQuantityMeasurementObservationEntryRelationship552(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation Entry Relationship552</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation#validateQuantityMeasurementObservationSOPInstanceObservationEntryRelationshipSOPInstanceObservation553(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Quantity Measurement Observation SOP Instance Observation Entry Relationship SOP Instance Observation553</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class QuantityMeasurementObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateQuantityMeasurementObservationCodeCodeSystemDIR() {
		OperationsTestCase<QuantityMeasurementObservation> validateQuantityMeasurementObservationCodeCodeSystemDIRTestCase = new OperationsTestCase<QuantityMeasurementObservation>(
			"validateQuantityMeasurementObservationCodeCodeSystemDIR",
			operationsForOCL.getOCLValue(
				"VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_CODE_CODE_SYSTEM_DIR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(QuantityMeasurementObservation target) {

			}

			@Override
			protected void updateToPass(QuantityMeasurementObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return QuantityMeasurementObservationOperations.validateQuantityMeasurementObservationCodeCodeSystemDIR(
					(QuantityMeasurementObservation) objectToTest, diagnostician, map);
			}

		};

		validateQuantityMeasurementObservationCodeCodeSystemDIRTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateQuantityMeasurementObservationCodeCodeSystemDICOM() {
		OperationsTestCase<QuantityMeasurementObservation> validateQuantityMeasurementObservationCodeCodeSystemDICOMTestCase = new OperationsTestCase<QuantityMeasurementObservation>(
			"validateQuantityMeasurementObservationCodeCodeSystemDICOM",
			operationsForOCL.getOCLValue(
				"VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_CODE_CODE_SYSTEM_DICOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(QuantityMeasurementObservation target) {

			}

			@Override
			protected void updateToPass(QuantityMeasurementObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return QuantityMeasurementObservationOperations.validateQuantityMeasurementObservationCodeCodeSystemDICOM(
					(QuantityMeasurementObservation) objectToTest, diagnostician, map);
			}

		};

		validateQuantityMeasurementObservationCodeCodeSystemDICOMTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateQuantityMeasurementObservationTemplateId() {
		OperationsTestCase<QuantityMeasurementObservation> validateQuantityMeasurementObservationTemplateIdTestCase = new OperationsTestCase<QuantityMeasurementObservation>(
			"validateQuantityMeasurementObservationTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(QuantityMeasurementObservation target) {

			}

			@Override
			protected void updateToPass(QuantityMeasurementObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return QuantityMeasurementObservationOperations.validateQuantityMeasurementObservationTemplateId(
					(QuantityMeasurementObservation) objectToTest, diagnostician, map);
			}

		};

		validateQuantityMeasurementObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateQuantityMeasurementObservationClassCode() {
		OperationsTestCase<QuantityMeasurementObservation> validateQuantityMeasurementObservationClassCodeTestCase = new OperationsTestCase<QuantityMeasurementObservation>(
			"validateQuantityMeasurementObservationClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(QuantityMeasurementObservation target) {

			}

			@Override
			protected void updateToPass(QuantityMeasurementObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return QuantityMeasurementObservationOperations.validateQuantityMeasurementObservationClassCode(
					(QuantityMeasurementObservation) objectToTest, diagnostician, map);
			}

		};

		validateQuantityMeasurementObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateQuantityMeasurementObservationMoodCode() {
		OperationsTestCase<QuantityMeasurementObservation> validateQuantityMeasurementObservationMoodCodeTestCase = new OperationsTestCase<QuantityMeasurementObservation>(
			"validateQuantityMeasurementObservationMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(QuantityMeasurementObservation target) {

			}

			@Override
			protected void updateToPass(QuantityMeasurementObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return QuantityMeasurementObservationOperations.validateQuantityMeasurementObservationMoodCode(
					(QuantityMeasurementObservation) objectToTest, diagnostician, map);
			}

		};

		validateQuantityMeasurementObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateQuantityMeasurementObservationCode() {
		OperationsTestCase<QuantityMeasurementObservation> validateQuantityMeasurementObservationCodeTestCase = new OperationsTestCase<QuantityMeasurementObservation>(
			"validateQuantityMeasurementObservationCode", operationsForOCL.getOCLValue(
				"VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(QuantityMeasurementObservation target) {

			}

			@Override
			protected void updateToPass(QuantityMeasurementObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return QuantityMeasurementObservationOperations.validateQuantityMeasurementObservationCode(
					(QuantityMeasurementObservation) objectToTest, diagnostician, map);
			}

		};

		validateQuantityMeasurementObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateQuantityMeasurementObservationEffectiveTime() {
		OperationsTestCase<QuantityMeasurementObservation> validateQuantityMeasurementObservationEffectiveTimeTestCase = new OperationsTestCase<QuantityMeasurementObservation>(
			"validateQuantityMeasurementObservationEffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(QuantityMeasurementObservation target) {

			}

			@Override
			protected void updateToPass(QuantityMeasurementObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return QuantityMeasurementObservationOperations.validateQuantityMeasurementObservationEffectiveTime(
					(QuantityMeasurementObservation) objectToTest, diagnostician, map);
			}

		};

		validateQuantityMeasurementObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateQuantityMeasurementObservationValue() {
		OperationsTestCase<QuantityMeasurementObservation> validateQuantityMeasurementObservationValueTestCase = new OperationsTestCase<QuantityMeasurementObservation>(
			"validateQuantityMeasurementObservationValue", operationsForOCL.getOCLValue(
				"VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(QuantityMeasurementObservation target) {

			}

			@Override
			protected void updateToPass(QuantityMeasurementObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return QuantityMeasurementObservationOperations.validateQuantityMeasurementObservationValue(
					(QuantityMeasurementObservation) objectToTest, diagnostician, map);
			}

		};

		validateQuantityMeasurementObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateQuantityMeasurementObservationEntryRelationship552() {
		OperationsTestCase<QuantityMeasurementObservation> validateQuantityMeasurementObservationEntryRelationship552TestCase = new OperationsTestCase<QuantityMeasurementObservation>(
			"validateQuantityMeasurementObservationEntryRelationship552",
			operationsForOCL.getOCLValue(
				"VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_ENTRY_RELATIONSHIP552__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(QuantityMeasurementObservation target) {

			}

			@Override
			protected void updateToPass(QuantityMeasurementObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return QuantityMeasurementObservationOperations.validateQuantityMeasurementObservationEntryRelationship552(
					(QuantityMeasurementObservation) objectToTest, diagnostician, map);
			}

		};

		validateQuantityMeasurementObservationEntryRelationship552TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateQuantityMeasurementObservationSOPInstanceObservationEntryRelationshipSOPInstanceObservation553() {
		OperationsTestCase<QuantityMeasurementObservation> validateQuantityMeasurementObservationSOPInstanceObservationEntryRelationshipSOPInstanceObservation553TestCase = new OperationsTestCase<QuantityMeasurementObservation>(
			"validateQuantityMeasurementObservationSOPInstanceObservationEntryRelationshipSOPInstanceObservation553",
			operationsForOCL.getOCLValue(
				"VALIDATE_QUANTITY_MEASUREMENT_OBSERVATION_SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP_SOP_INSTANCE_OBSERVATION553__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(QuantityMeasurementObservation target) {

			}

			@Override
			protected void updateToPass(QuantityMeasurementObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return QuantityMeasurementObservationOperations.validateQuantityMeasurementObservationSOPInstanceObservationEntryRelationshipSOPInstanceObservation553(
					(QuantityMeasurementObservation) objectToTest, diagnostician, map);
			}

		};

		validateQuantityMeasurementObservationSOPInstanceObservationEntryRelationshipSOPInstanceObservation553TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends QuantityMeasurementObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<QuantityMeasurementObservation> {
		@Override
		public QuantityMeasurementObservation create() {
			return ConsolFactory.eINSTANCE.createQuantityMeasurementObservation();
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
	private static class ConstructorTestClass extends QuantityMeasurementObservationOperations {
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

} // QuantityMeasurementObservationOperations
