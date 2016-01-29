/*******************************************************************************
 * Copyright (c) 2014, 2015 Dan Brown and others.
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
import org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlannedEncounter2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planned Encounter2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2#validatePlannedEncounter2ParticipantServiceDeliveryLocationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Encounter2 Participant Service Delivery Location Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2#validatePlannedEncounter2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Encounter2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2#validatePlannedEncounter2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Encounter2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2#validatePlannedEncounter2StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Encounter2 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2#validatePlannedEncounter2StatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Encounter2 Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2#validatePlannedEncounter2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Encounter2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2#validatePlannedEncounter2Performer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Encounter2 Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2#validatePlannedEncounter2ServiceDeliveryLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Encounter2 Service Delivery Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2#validatePlannedEncounter2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Encounter2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2#validatePlannedEncounter2EntryRelationship964(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Encounter2 Entry Relationship964</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2#validatePlannedEncounter2EntryRelationship966(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Encounter2 Entry Relationship966</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2#validatePlannedEncounter2PerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Encounter2 Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2#validatePlannedEncounter2PriorityPreferenceEntryRelationshipPriorityPreference965(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Encounter2 Priority Preference Entry Relationship Priority Preference965</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2#validatePlannedEncounter2Indication2EntryRelationshipIndication2967(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Encounter2 Indication2 Entry Relationship Indication2967</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2#validatePlanOfCareActivityEncounterTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2#validatePlanOfCareActivityEncounterMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlannedEncounter2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedEncounter2ParticipantServiceDeliveryLocationTypeCode() {
		OperationsTestCase<PlannedEncounter2> validatePlannedEncounter2ParticipantServiceDeliveryLocationTypeCodeTestCase = new OperationsTestCase<PlannedEncounter2>(
			"validatePlannedEncounter2ParticipantServiceDeliveryLocationTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_ENCOUNTER2_PARTICIPANT_SERVICE_DELIVERY_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedEncounter2 target) {

			}

			@Override
			protected void updateToPass(PlannedEncounter2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedEncounter2Operations.validatePlannedEncounter2ParticipantServiceDeliveryLocationTypeCode(
					(PlannedEncounter2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedEncounter2ParticipantServiceDeliveryLocationTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedEncounter2Code() {
		OperationsTestCase<PlannedEncounter2> validatePlannedEncounter2CodeTestCase = new OperationsTestCase<PlannedEncounter2>(
			"validatePlannedEncounter2Code",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_ENCOUNTER2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedEncounter2 target) {

			}

			@Override
			protected void updateToPass(PlannedEncounter2 target) {
				target.init();

			}

			@Override
			protected void setDependency(PlannedEncounter2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2CodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedEncounter2Operations.validatePlannedEncounter2Code(
					(PlannedEncounter2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedEncounter2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedEncounter2CodeP() {
		OperationsTestCase<PlannedEncounter2> validatePlannedEncounter2CodePTestCase = new OperationsTestCase<PlannedEncounter2>(
			"validatePlannedEncounter2CodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_ENCOUNTER2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedEncounter2 target) {

			}

			@Override
			protected void updateToPass(PlannedEncounter2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedEncounter2Operations.validatePlannedEncounter2CodeP(
					(PlannedEncounter2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedEncounter2CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedEncounter2StatusCode() {
		OperationsTestCase<PlannedEncounter2> validatePlannedEncounter2StatusCodeTestCase = new OperationsTestCase<PlannedEncounter2>(
			"validatePlannedEncounter2StatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_ENCOUNTER2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedEncounter2 target) {

			}

			@Override
			protected void updateToPass(PlannedEncounter2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedEncounter2Operations.validatePlannedEncounter2StatusCode(
					(PlannedEncounter2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedEncounter2StatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedEncounter2StatusCodeP() {
		OperationsTestCase<PlannedEncounter2> validatePlannedEncounter2StatusCodePTestCase = new OperationsTestCase<PlannedEncounter2>(
			"validatePlannedEncounter2StatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_ENCOUNTER2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedEncounter2 target) {

			}

			@Override
			protected void updateToPass(PlannedEncounter2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedEncounter2Operations.validatePlannedEncounter2StatusCodeP(
					(PlannedEncounter2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedEncounter2StatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedEncounter2EffectiveTime() {
		OperationsTestCase<PlannedEncounter2> validatePlannedEncounter2EffectiveTimeTestCase = new OperationsTestCase<PlannedEncounter2>(
			"validatePlannedEncounter2EffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_ENCOUNTER2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedEncounter2 target) {

			}

			@Override
			protected void updateToPass(PlannedEncounter2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedEncounter2Operations.validatePlannedEncounter2EffectiveTime(
					(PlannedEncounter2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedEncounter2EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedEncounter2Performer() {
		OperationsTestCase<PlannedEncounter2> validatePlannedEncounter2PerformerTestCase = new OperationsTestCase<PlannedEncounter2>(
			"validatePlannedEncounter2Performer",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_ENCOUNTER2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedEncounter2 target) {

			}

			@Override
			protected void updateToPass(PlannedEncounter2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedEncounter2Operations.validatePlannedEncounter2Performer(
					(PlannedEncounter2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedEncounter2PerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedEncounter2ServiceDeliveryLocation() {
		OperationsTestCase<PlannedEncounter2> validatePlannedEncounter2ServiceDeliveryLocationTestCase = new OperationsTestCase<PlannedEncounter2>(
			"validatePlannedEncounter2ServiceDeliveryLocation",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_ENCOUNTER2_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedEncounter2 target) {

			}

			@Override
			protected void updateToPass(PlannedEncounter2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedEncounter2Operations.validatePlannedEncounter2ServiceDeliveryLocation(
					(PlannedEncounter2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedEncounter2ServiceDeliveryLocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedEncounter2AuthorParticipation() {
		OperationsTestCase<PlannedEncounter2> validatePlannedEncounter2AuthorParticipationTestCase = new OperationsTestCase<PlannedEncounter2>(
			"validatePlannedEncounter2AuthorParticipation", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_ENCOUNTER2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedEncounter2 target) {

			}

			@Override
			protected void updateToPass(PlannedEncounter2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedEncounter2Operations.validatePlannedEncounter2AuthorParticipation(
					(PlannedEncounter2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedEncounter2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedEncounter2EntryRelationship964() {
		OperationsTestCase<PlannedEncounter2> validatePlannedEncounter2EntryRelationship964TestCase = new OperationsTestCase<PlannedEncounter2>(
			"validatePlannedEncounter2EntryRelationship964", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_ENCOUNTER2_ENTRY_RELATIONSHIP964__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedEncounter2 target) {

			}

			@Override
			protected void updateToPass(PlannedEncounter2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedEncounter2Operations.validatePlannedEncounter2EntryRelationship964(
					(PlannedEncounter2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedEncounter2EntryRelationship964TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedEncounter2EntryRelationship966() {
		OperationsTestCase<PlannedEncounter2> validatePlannedEncounter2EntryRelationship966TestCase = new OperationsTestCase<PlannedEncounter2>(
			"validatePlannedEncounter2EntryRelationship966", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_ENCOUNTER2_ENTRY_RELATIONSHIP966__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedEncounter2 target) {

			}

			@Override
			protected void updateToPass(PlannedEncounter2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedEncounter2Operations.validatePlannedEncounter2EntryRelationship966(
					(PlannedEncounter2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedEncounter2EntryRelationship966TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedEncounter2PerformerAssignedEntity() {
		OperationsTestCase<PlannedEncounter2> validatePlannedEncounter2PerformerAssignedEntityTestCase = new OperationsTestCase<PlannedEncounter2>(
			"validatePlannedEncounter2PerformerAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_ENCOUNTER2_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedEncounter2 target) {

			}

			@Override
			protected void updateToPass(PlannedEncounter2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedEncounter2Operations.validatePlannedEncounter2PerformerAssignedEntity(
					(PlannedEncounter2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedEncounter2PerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedEncounter2PriorityPreferenceEntryRelationshipPriorityPreference965() {
		OperationsTestCase<PlannedEncounter2> validatePlannedEncounter2PriorityPreferenceEntryRelationshipPriorityPreference965TestCase = new OperationsTestCase<PlannedEncounter2>(
			"validatePlannedEncounter2PriorityPreferenceEntryRelationshipPriorityPreference965",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_ENCOUNTER2_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE965__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedEncounter2 target) {

			}

			@Override
			protected void updateToPass(PlannedEncounter2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedEncounter2Operations.validatePlannedEncounter2PriorityPreferenceEntryRelationshipPriorityPreference965(
					(PlannedEncounter2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedEncounter2PriorityPreferenceEntryRelationshipPriorityPreference965TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedEncounter2Indication2EntryRelationshipIndication2967() {
		OperationsTestCase<PlannedEncounter2> validatePlannedEncounter2Indication2EntryRelationshipIndication2967TestCase = new OperationsTestCase<PlannedEncounter2>(
			"validatePlannedEncounter2Indication2EntryRelationshipIndication2967",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_ENCOUNTER2_INDICATION2_ENTRY_RELATIONSHIP_INDICATION2967__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedEncounter2 target) {

			}

			@Override
			protected void updateToPass(PlannedEncounter2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedEncounter2Operations.validatePlannedEncounter2Indication2EntryRelationshipIndication2967(
					(PlannedEncounter2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedEncounter2Indication2EntryRelationshipIndication2967TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareActivityEncounterTemplateId() {
		OperationsTestCase<PlannedEncounter2> validatePlanOfCareActivityEncounterTemplateIdTestCase = new OperationsTestCase<PlannedEncounter2>(
			"validatePlanOfCareActivityEncounterTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedEncounter2 target) {

			}

			@Override
			protected void updateToPass(PlannedEncounter2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedEncounter2Operations.validatePlanOfCareActivityEncounterTemplateId(
					(PlannedEncounter2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivityEncounterTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareActivityEncounterMoodCode() {
		OperationsTestCase<PlannedEncounter2> validatePlanOfCareActivityEncounterMoodCodeTestCase = new OperationsTestCase<PlannedEncounter2>(
			"validatePlanOfCareActivityEncounterMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedEncounter2 target) {

			}

			@Override
			protected void updateToPass(PlannedEncounter2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedEncounter2Operations.validatePlanOfCareActivityEncounterMoodCode(
					(PlannedEncounter2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivityEncounterMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PlannedEncounter2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<PlannedEncounter2> {
		@Override
		public PlannedEncounter2 create() {
			return ConsolFactory.eINSTANCE.createPlannedEncounter2();
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
	private static class ConstructorTestClass extends PlannedEncounter2Operations {
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

} // PlannedEncounter2Operations
