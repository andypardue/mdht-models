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

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.SOPInstanceObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>SOP Instance Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationEffectiveTimeHasValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Effective Time Has Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationEffectiveTimeNoLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Effective Time No Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationEffectiveTimeNoHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Effective Time No High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationTextMediaType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Text Media Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationEntryRelationship540(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Entry Relationship540</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationEntryRelationship542(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Entry Relationship542</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationEntryRelationship544(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Entry Relationship544</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationSOPInstanceObservationEntryRelationshipSOPInstanceObservation541(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation SOP Instance Observation Entry Relationship SOP Instance Observation541</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationPurposeofReferenceObservationEntryRelationshipPurposeofReferenceObservation543(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Purposeof Reference Observation Entry Relationship Purposeof Reference Observation543</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationReferencedFramesObservationEntryRelationshipReferencedFramesObservation545(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Referenced Frames Observation Entry Relationship Referenced Frames Observation545</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SOPInstanceObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSOPInstanceObservationEffectiveTimeHasValue() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationEffectiveTimeHasValueTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationEffectiveTimeHasValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME_HAS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationEffectiveTimeHasValue(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationEffectiveTimeHasValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSOPInstanceObservationEffectiveTimeNoLow() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationEffectiveTimeNoLowTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationEffectiveTimeNoLow",
			operationsForOCL.getOCLValue(
				"VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME_NO_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationEffectiveTimeNoLow(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationEffectiveTimeNoLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSOPInstanceObservationEffectiveTimeNoHigh() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationEffectiveTimeNoHighTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationEffectiveTimeNoHigh",
			operationsForOCL.getOCLValue(
				"VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME_NO_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationEffectiveTimeNoHigh(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationEffectiveTimeNoHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSOPInstanceObservationTextMediaType() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationTextMediaTypeTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationTextMediaType", operationsForOCL.getOCLValue(
				"VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationTextMediaType(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationTextMediaTypeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSOPInstanceObservationTextReference() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationTextReferenceTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationTextReference", operationsForOCL.getOCLValue(
				"VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationTextReference(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSOPInstanceObservationTextReferenceValue() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationTextReferenceValueTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationTextReferenceValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationTextReferenceValue(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSOPInstanceObservationTemplateId() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationTemplateIdTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_SOP_INSTANCE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationTemplateId(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSOPInstanceObservationClassCode() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationClassCodeTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_SOP_INSTANCE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationClassCode(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSOPInstanceObservationEffectiveTime() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationEffectiveTimeTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationEffectiveTime", operationsForOCL.getOCLValue(
				"VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationEffectiveTime(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSOPInstanceObservationId() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationIdTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationId",
			operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationId(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSOPInstanceObservationMoodCode() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationMoodCodeTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationMoodCode(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSOPInstanceObservationText() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationTextTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationText",
			operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationText(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSOPInstanceObservationCodeP() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationCodePTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationCodeP(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSOPInstanceObservationCode() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationCodeTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected void setDependency(SOPInstanceObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationCode(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSOPInstanceObservationEntryRelationship540() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationEntryRelationship540TestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationEntryRelationship540",
			operationsForOCL.getOCLValue(
				"VALIDATE_SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP540__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationEntryRelationship540(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationEntryRelationship540TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSOPInstanceObservationEntryRelationship542() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationEntryRelationship542TestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationEntryRelationship542",
			operationsForOCL.getOCLValue(
				"VALIDATE_SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP542__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationEntryRelationship542(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationEntryRelationship542TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSOPInstanceObservationEntryRelationship544() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationEntryRelationship544TestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationEntryRelationship544",
			operationsForOCL.getOCLValue(
				"VALIDATE_SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP544__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationEntryRelationship544(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationEntryRelationship544TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSOPInstanceObservationSOPInstanceObservationEntryRelationshipSOPInstanceObservation541() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationSOPInstanceObservationEntryRelationshipSOPInstanceObservation541TestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationSOPInstanceObservationEntryRelationshipSOPInstanceObservation541",
			operationsForOCL.getOCLValue(
				"VALIDATE_SOP_INSTANCE_OBSERVATION_SOP_INSTANCE_OBSERVATION_ENTRY_RELATIONSHIP_SOP_INSTANCE_OBSERVATION541__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationSOPInstanceObservationEntryRelationshipSOPInstanceObservation541(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationSOPInstanceObservationEntryRelationshipSOPInstanceObservation541TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSOPInstanceObservationPurposeofReferenceObservationEntryRelationshipPurposeofReferenceObservation543() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationPurposeofReferenceObservationEntryRelationshipPurposeofReferenceObservation543TestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationPurposeofReferenceObservationEntryRelationshipPurposeofReferenceObservation543",
			operationsForOCL.getOCLValue(
				"VALIDATE_SOP_INSTANCE_OBSERVATION_PURPOSEOF_REFERENCE_OBSERVATION_ENTRY_RELATIONSHIP_PURPOSEOF_REFERENCE_OBSERVATION543__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationPurposeofReferenceObservationEntryRelationshipPurposeofReferenceObservation543(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationPurposeofReferenceObservationEntryRelationshipPurposeofReferenceObservation543TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSOPInstanceObservationReferencedFramesObservationEntryRelationshipReferencedFramesObservation545() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationReferencedFramesObservationEntryRelationshipReferencedFramesObservation545TestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationReferencedFramesObservationEntryRelationshipReferencedFramesObservation545",
			operationsForOCL.getOCLValue(
				"VALIDATE_SOP_INSTANCE_OBSERVATION_REFERENCED_FRAMES_OBSERVATION_ENTRY_RELATIONSHIP_REFERENCED_FRAMES_OBSERVATION545__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationReferencedFramesObservationEntryRelationshipReferencedFramesObservation545(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationReferencedFramesObservationEntryRelationshipReferencedFramesObservation545TestCase.doValidationTest();
	}

	// /**
	// *
	// * @generated
	// */
	// @Test
	// public void testValidateSOPInstanceObservationSOPInstanceObservation() {
	// OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationSOPInstanceObservationTestCase = new
	// OperationsTestCase<SOPInstanceObservation>(
	// "validateSOPInstanceObservationSOPInstanceObservation",
	// operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(SOPInstanceObservation target) {
	// target.init();
	// }
	//
	// @Override
	// protected void updateToPass(SOPInstanceObservation target) {
	//
	// EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
	// er.setObservation(ConsolFactory.eINSTANCE.createSOPInstanceObservation().init());
	// er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
	// target.getEntryRelationships().add(er);
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return SOPInstanceObservationOperations.validateSOPInstanceObservationSOPInstanceObservation(
	// (SOPInstanceObservation) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateSOPInstanceObservationSOPInstanceObservationTestCase.doValidationTest();
	// }

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SOPInstanceObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SOPInstanceObservation> {
		@Override
		public SOPInstanceObservation create() {
			return ConsolFactory.eINSTANCE.createSOPInstanceObservation();
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
	private static class ConstructorTestClass extends SOPInstanceObservationOperations {
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

} // SOPInstanceObservationOperations
