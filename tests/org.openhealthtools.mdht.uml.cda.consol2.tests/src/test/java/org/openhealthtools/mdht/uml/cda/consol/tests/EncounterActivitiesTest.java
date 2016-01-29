/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     Dan Brown (Drajer) - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.EncounterActivities;
import org.openhealthtools.mdht.uml.cda.consol.operations.EncounterActivitiesOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounter Activities</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesCodeOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Code Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesCodeOriginalTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Code Original Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesCodeOriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Code Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesServiceDeliveryTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Service Delivery Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesSdtcDDCFromNUBCOrDD(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Sdtc DDC From NUBC Or DD</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesSDTCDischargeDispositionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities SDTC Discharge Disposition Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesServiceDeliveryLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Service Delivery Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesEncounterPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesEntryRelationship112(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Entry Relationship112</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesEntryRelationship114(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Entry Relationship114</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Performer Encounter Performer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Performer Encounter Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesIndicationEntryRelationshipIndication113(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Indication Entry Relationship Indication113</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesEncounterDiagnosisEntryRelationshipEncounterDiagnosis115(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Diagnosis Entry Relationship Encounter Diagnosis115</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EncounterActivitiesTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterActivitiesCodeOriginalText() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesCodeOriginalTextTestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesCodeOriginalText", operationsForOCL.getOCLValue(
				"VALIDATE_ENCOUNTER_ACTIVITIES_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesCodeOriginalText(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesCodeOriginalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterActivitiesCodeOriginalTextReference() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesCodeOriginalTextReferenceTestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesCodeOriginalTextReference",
			operationsForOCL.getOCLValue(
				"VALIDATE_ENCOUNTER_ACTIVITIES_CODE_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesCodeOriginalTextReference(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesCodeOriginalTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateEncounterActivitiesReferenceValue() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesReferenceValueTestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesReferenceValue", operationsForOCL.getOCLValue(
				"VALIDATE_ENCOUNTER_ACTIVITIES_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();

				//
				// CD value = DatatypesFactory.eINSTANCE.createCD();
				// target.getValues().add(value);
				//

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesReferenceValue(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/

	@Test
	public void testValidateEncounterActivitiesCodeOriginalTextReferenceValue() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesCodeOriginalTextReferenceValueTestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesCodeOriginalTextReferenceValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_ENCOUNTER_ACTIVITIES_CODE_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();

				// CD value = DatatypesFactory.eINSTANCE.createCD();
				// target.getValues().add(value);
				//

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesCodeOriginalTextReferenceValue(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesCodeOriginalTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterActivitiesServiceDeliveryTypeCode() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesServiceDeliveryTypeCodeTestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesServiceDeliveryTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_ENCOUNTER_ACTIVITIES_SERVICE_DELIVERY_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesServiceDeliveryTypeCode(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesServiceDeliveryTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterActivitiesSdtcDDCFromNUBCOrDD() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesSdtcDDCFromNUBCOrDDTestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesSdtcDDCFromNUBCOrDD",
			operationsForOCL.getOCLValue(
				"VALIDATE_ENCOUNTER_ACTIVITIES_SDTC_DDC_FROM_NUBC_OR_DD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesSdtcDDCFromNUBCOrDD(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesSdtcDDCFromNUBCOrDDTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterActivitiesTemplateId() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesTemplateIdTestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesTemplateId(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterActivitiesClassCode() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesClassCodeTestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesClassCode(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterActivitiesMoodCode() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesMoodCodeTestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesMoodCode(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterActivitiesId() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesIdTestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesId",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesId(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterActivitiesCode() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesCodeTestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesCode",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesCode(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterActivitiesEffectiveTime() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesEffectiveTimeTestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesEffectiveTime", operationsForOCL.getOCLValue(
				"VALIDATE_ENCOUNTER_ACTIVITIES_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesEffectiveTime(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterActivitiesSDTCDischargeDispositionCode() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesSDTCDischargeDispositionCodeTestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesSDTCDischargeDispositionCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_ENCOUNTER_ACTIVITIES_SDTC_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesSDTCDischargeDispositionCode(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesSDTCDischargeDispositionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterActivitiesServiceDeliveryLocation() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesServiceDeliveryLocationTestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesServiceDeliveryLocation",
			operationsForOCL.getOCLValue(
				"VALIDATE_ENCOUNTER_ACTIVITIES_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesServiceDeliveryLocation(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesServiceDeliveryLocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterActivitiesEncounterPerformer() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesEncounterPerformerTestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesEncounterPerformer", operationsForOCL.getOCLValue(
				"VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesEncounterPerformer(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesEncounterPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateEncounterActivitiesEntryRelationship112() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesEntryRelationship112TestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesEntryRelationship112", operationsForOCL.getOCLValue(
				"VALIDATE_ENCOUNTER_ACTIVITIES_ENTRY_RELATIONSHIP112__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesEntryRelationship112(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesEntryRelationship112TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateEncounterActivitiesEntryRelationship114() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesEntryRelationship114TestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesEntryRelationship114", operationsForOCL.getOCLValue(
				"VALIDATE_ENCOUNTER_ACTIVITIES_ENTRY_RELATIONSHIP114__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesEntryRelationship114(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesEntryRelationship114TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeTestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntity() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityTestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntity(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateEncounterActivitiesIndicationEntryRelationshipIndication113() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesIndicationEntryRelationshipIndication113TestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesIndicationEntryRelationshipIndication113",
			operationsForOCL.getOCLValue(
				"VALIDATE_ENCOUNTER_ACTIVITIES_INDICATION_ENTRY_RELATIONSHIP_INDICATION113__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesIndicationEntryRelationshipIndication113(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesIndicationEntryRelationshipIndication113TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateEncounterActivitiesEncounterDiagnosisEntryRelationshipEncounterDiagnosis115() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesEncounterDiagnosisEntryRelationshipEncounterDiagnosis115TestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesEncounterDiagnosisEntryRelationshipEncounterDiagnosis115",
			operationsForOCL.getOCLValue(
				"VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_DIAGNOSIS_ENTRY_RELATIONSHIP_ENCOUNTER_DIAGNOSIS115__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesEncounterDiagnosisEntryRelationshipEncounterDiagnosis115(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesEncounterDiagnosisEntryRelationshipEncounterDiagnosis115TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EncounterActivitiesOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EncounterActivities> {
		@Override
		public EncounterActivities create() {
			return ConsolFactory.eINSTANCE.createEncounterActivities();
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
	private static class ConstructorTestClass extends EncounterActivitiesOperations {
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

} // EncounterActivitiesOperations
