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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2;
import org.openhealthtools.mdht.uml.cda.consol.operations.EncounterActivity2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounter Activity2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivity2EntryRelationship904(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activity2 Entry Relationship904</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivity2EntryRelationship906(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activity2 Entry Relationship906</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivity2CDTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activity2 CD Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Performer Encounter Performer Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivity2Indication2EntryRelationshipIndication2905(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activity2 Indication2 Entry Relationship Indication2905</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivity2EncounterDiagnosis2EntryRelationshipEncounterDiagnosis2907(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activity2 Encounter Diagnosis2 Entry Relationship Encounter Diagnosis2907</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesSdtcDDCFromNUBCOrDD(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Sdtc DDC From NUBC Or DD</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesSDTCDischargeDispositionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities SDTC Discharge Disposition Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesServiceDeliveryLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Service Delivery Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesEncounterPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Performer Encounter Performer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Performer Encounter Performer Assigned Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EncounterActivity2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterActivitiesCodeP() {
		OperationsTestCase<EncounterActivity2> validateEncounterActivitiesCodePTestCase = new OperationsTestCase<EncounterActivity2>(
			"validateEncounterActivitiesCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivity2 target) {

			}

			@Override
			protected void updateToPass(EncounterActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivity2Operations.validateEncounterActivitiesCodeP(
					(EncounterActivity2) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateEncounterActivity2EntryRelationship904() {
		OperationsTestCase<EncounterActivity2> validateEncounterActivity2EntryRelationship904TestCase = new OperationsTestCase<EncounterActivity2>(
			"validateEncounterActivity2EntryRelationship904", operationsForOCL.getOCLValue(
				"VALIDATE_ENCOUNTER_ACTIVITY2_ENTRY_RELATIONSHIP904__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivity2 target) {

			}

			@Override
			protected void updateToPass(EncounterActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivity2Operations.validateEncounterActivity2EntryRelationship904(
					(EncounterActivity2) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivity2EntryRelationship904TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateEncounterActivity2EntryRelationship906() {
		OperationsTestCase<EncounterActivity2> validateEncounterActivity2EntryRelationship906TestCase = new OperationsTestCase<EncounterActivity2>(
			"validateEncounterActivity2EntryRelationship906", operationsForOCL.getOCLValue(
				"VALIDATE_ENCOUNTER_ACTIVITY2_ENTRY_RELATIONSHIP906__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivity2 target) {

			}

			@Override
			protected void updateToPass(EncounterActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivity2Operations.validateEncounterActivity2EntryRelationship906(
					(EncounterActivity2) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivity2EntryRelationship906TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterActivity2CDTranslation() {
		OperationsTestCase<EncounterActivity2> validateEncounterActivity2CDTranslationTestCase = new OperationsTestCase<EncounterActivity2>(
			"validateEncounterActivity2CDTranslation",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITY2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivity2 target) {

			}

			@Override
			protected void updateToPass(EncounterActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivity2Operations.validateEncounterActivity2CDTranslation(
					(EncounterActivity2) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivity2CDTranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeP() {
		OperationsTestCase<EncounterActivity2> validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodePTestCase = new OperationsTestCase<EncounterActivity2>(
			"validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivity2 target) {

			}

			@Override
			protected void updateToPass(EncounterActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivity2Operations.validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeP(
					(EncounterActivity2) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateEncounterActivity2Indication2EntryRelationshipIndication2905() {
		OperationsTestCase<EncounterActivity2> validateEncounterActivity2Indication2EntryRelationshipIndication2905TestCase = new OperationsTestCase<EncounterActivity2>(
			"validateEncounterActivity2Indication2EntryRelationshipIndication2905",
			operationsForOCL.getOCLValue(
				"VALIDATE_ENCOUNTER_ACTIVITY2_INDICATION2_ENTRY_RELATIONSHIP_INDICATION2905__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivity2 target) {

			}

			@Override
			protected void updateToPass(EncounterActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivity2Operations.validateEncounterActivity2Indication2EntryRelationshipIndication2905(
					(EncounterActivity2) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivity2Indication2EntryRelationshipIndication2905TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateEncounterActivity2EncounterDiagnosis2EntryRelationshipEncounterDiagnosis2907() {
		OperationsTestCase<EncounterActivity2> validateEncounterActivity2EncounterDiagnosis2EntryRelationshipEncounterDiagnosis2907TestCase = new OperationsTestCase<EncounterActivity2>(
			"validateEncounterActivity2EncounterDiagnosis2EntryRelationshipEncounterDiagnosis2907",
			operationsForOCL.getOCLValue(
				"VALIDATE_ENCOUNTER_ACTIVITY2_ENCOUNTER_DIAGNOSIS2_ENTRY_RELATIONSHIP_ENCOUNTER_DIAGNOSIS2907__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivity2 target) {

			}

			@Override
			protected void updateToPass(EncounterActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivity2Operations.validateEncounterActivity2EncounterDiagnosis2EntryRelationshipEncounterDiagnosis2907(
					(EncounterActivity2) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivity2EncounterDiagnosis2EntryRelationshipEncounterDiagnosis2907TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterActivitiesSdtcDDCFromNUBCOrDD() {
		OperationsTestCase<EncounterActivity2> validateEncounterActivitiesSdtcDDCFromNUBCOrDDTestCase = new OperationsTestCase<EncounterActivity2>(
			"validateEncounterActivitiesSdtcDDCFromNUBCOrDD",
			operationsForOCL.getOCLValue(
				"VALIDATE_ENCOUNTER_ACTIVITIES_SDTC_DDC_FROM_NUBC_OR_DD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivity2 target) {

			}

			@Override
			protected void updateToPass(EncounterActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivity2Operations.validateEncounterActivitiesSdtcDDCFromNUBCOrDD(
					(EncounterActivity2) objectToTest, diagnostician, map);
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
		OperationsTestCase<EncounterActivity2> validateEncounterActivitiesTemplateIdTestCase = new OperationsTestCase<EncounterActivity2>(
			"validateEncounterActivitiesTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivity2 target) {

			}

			@Override
			protected void updateToPass(EncounterActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivity2Operations.validateEncounterActivitiesTemplateId(
					(EncounterActivity2) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterActivitiesCode() {
		OperationsTestCase<EncounterActivity2> validateEncounterActivitiesCodeTestCase = new OperationsTestCase<EncounterActivity2>(
			"validateEncounterActivitiesCode",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivity2 target) {

			}

			@Override
			protected void updateToPass(EncounterActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivity2Operations.validateEncounterActivitiesCode(
					(EncounterActivity2) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterActivitiesSDTCDischargeDispositionCode() {
		OperationsTestCase<EncounterActivity2> validateEncounterActivitiesSDTCDischargeDispositionCodeTestCase = new OperationsTestCase<EncounterActivity2>(
			"validateEncounterActivitiesSDTCDischargeDispositionCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_ENCOUNTER_ACTIVITIES_SDTC_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivity2 target) {

			}

			@Override
			protected void updateToPass(EncounterActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivity2Operations.validateEncounterActivitiesSDTCDischargeDispositionCode(
					(EncounterActivity2) objectToTest, diagnostician, map);
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
		OperationsTestCase<EncounterActivity2> validateEncounterActivitiesServiceDeliveryLocationTestCase = new OperationsTestCase<EncounterActivity2>(
			"validateEncounterActivitiesServiceDeliveryLocation",
			operationsForOCL.getOCLValue(
				"VALIDATE_ENCOUNTER_ACTIVITIES_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivity2 target) {

			}

			@Override
			protected void updateToPass(EncounterActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivity2Operations.validateEncounterActivitiesServiceDeliveryLocation(
					(EncounterActivity2) objectToTest, diagnostician, map);
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
		OperationsTestCase<EncounterActivity2> validateEncounterActivitiesEncounterPerformerTestCase = new OperationsTestCase<EncounterActivity2>(
			"validateEncounterActivitiesEncounterPerformer", operationsForOCL.getOCLValue(
				"VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivity2 target) {

			}

			@Override
			protected void updateToPass(EncounterActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivity2Operations.validateEncounterActivitiesEncounterPerformer(
					(EncounterActivity2) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesEncounterPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode() {
		OperationsTestCase<EncounterActivity2> validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeTestCase = new OperationsTestCase<EncounterActivity2>(
			"validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivity2 target) {

			}

			@Override
			protected void updateToPass(EncounterActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivity2Operations.validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode(
					(EncounterActivity2) objectToTest, diagnostician, map);
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
		OperationsTestCase<EncounterActivity2> validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityTestCase = new OperationsTestCase<EncounterActivity2>(
			"validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivity2 target) {

			}

			@Override
			protected void updateToPass(EncounterActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivity2Operations.validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntity(
					(EncounterActivity2) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EncounterActivity2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<EncounterActivity2> {
		@Override
		public EncounterActivity2 create() {
			return ConsolFactory.eINSTANCE.createEncounterActivity2();
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
	private static class ConstructorTestClass extends EncounterActivity2Operations {
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

} // EncounterActivity2Operations
