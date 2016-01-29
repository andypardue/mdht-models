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
import org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlannedObservation2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planned Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2StatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2MethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2TargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2TargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2Performer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2EntryRelationship968(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Entry Relationship968</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2EntryRelationship970(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Entry Relationship970</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2EntryRelationship972(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Entry Relationship972</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2EntryRelationship974(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Entry Relationship974</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2PriorityPreferenceEntryRelationshipPriorityPreference969(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Priority Preference Entry Relationship Priority Preference969</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2Indication2EntryRelationshipIndication2971(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Indication2 Entry Relationship Indication2971</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2Instruction2EntryRelationshipInstruction2973(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Instruction2 Entry Relationship Instruction2973</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlannedObservation2PlannedCoverageEntryRelationshipPlannedCoverage975(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Observation2 Planned Coverage Entry Relationship Planned Coverage975</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlanOfCareActivityObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2#validatePlanOfCareActivityObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Observation Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlannedObservation2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedObservation2CodeP() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2CodePTestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2CodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_OBSERVATION2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {

			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2CodeP(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedObservation2Code() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2CodeTestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2Code",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_OBSERVATION2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {

			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				target.init();

			}

			@Override
			protected void setDependency(PlannedObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2CodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2Code(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedObservation2StatusCode() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2StatusCodeTestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2StatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_OBSERVATION2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {

			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2StatusCode(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2StatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedObservation2StatusCodeP() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2StatusCodePTestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2StatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_OBSERVATION2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {

			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2StatusCodeP(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2StatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedObservation2EffectiveTime() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2EffectiveTimeTestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2EffectiveTime", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_OBSERVATION2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {

			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2EffectiveTime(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedObservation2Value() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2ValueTestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2Value",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_OBSERVATION2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {

			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2Value(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2ValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedObservation2MethodCode() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2MethodCodeTestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2MethodCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_OBSERVATION2_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {

			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2MethodCode(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2MethodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedObservation2TargetSiteCodeP() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2TargetSiteCodePTestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2TargetSiteCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_OBSERVATION2_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {

			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2TargetSiteCodeP(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2TargetSiteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedObservation2TargetSiteCode() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2TargetSiteCodeTestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2TargetSiteCode", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_OBSERVATION2_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {

			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				target.init();

			}

			@Override
			protected void setDependency(PlannedObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2TargetSiteCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2TargetSiteCode(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2TargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedObservation2Performer() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2PerformerTestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2Performer",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_OBSERVATION2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {

			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2Performer(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2PerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedObservation2AuthorParticipation() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2AuthorParticipationTestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2AuthorParticipation", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {

			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2AuthorParticipation(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedObservation2EntryRelationship968() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2EntryRelationship968TestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2EntryRelationship968", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_OBSERVATION2_ENTRY_RELATIONSHIP968__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {

			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2EntryRelationship968(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2EntryRelationship968TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedObservation2EntryRelationship970() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2EntryRelationship970TestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2EntryRelationship970", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_OBSERVATION2_ENTRY_RELATIONSHIP970__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {

			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2EntryRelationship970(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2EntryRelationship970TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedObservation2EntryRelationship972() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2EntryRelationship972TestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2EntryRelationship972", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_OBSERVATION2_ENTRY_RELATIONSHIP972__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {

			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2EntryRelationship972(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2EntryRelationship972TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedObservation2EntryRelationship974() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2EntryRelationship974TestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2EntryRelationship974", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_OBSERVATION2_ENTRY_RELATIONSHIP974__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {

			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2EntryRelationship974(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2EntryRelationship974TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedObservation2PriorityPreferenceEntryRelationshipPriorityPreference969() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2PriorityPreferenceEntryRelationshipPriorityPreference969TestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2PriorityPreferenceEntryRelationshipPriorityPreference969",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_OBSERVATION2_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE969__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {

			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2PriorityPreferenceEntryRelationshipPriorityPreference969(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2PriorityPreferenceEntryRelationshipPriorityPreference969TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedObservation2Indication2EntryRelationshipIndication2971() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2Indication2EntryRelationshipIndication2971TestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2Indication2EntryRelationshipIndication2971",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_OBSERVATION2_INDICATION2_ENTRY_RELATIONSHIP_INDICATION2971__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {

			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2Indication2EntryRelationshipIndication2971(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2Indication2EntryRelationshipIndication2971TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedObservation2Instruction2EntryRelationshipInstruction2973() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2Instruction2EntryRelationshipInstruction2973TestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2Instruction2EntryRelationshipInstruction2973",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_OBSERVATION2_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION2973__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {

			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2Instruction2EntryRelationshipInstruction2973(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2Instruction2EntryRelationshipInstruction2973TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedObservation2PlannedCoverageEntryRelationshipPlannedCoverage975() {
		OperationsTestCase<PlannedObservation2> validatePlannedObservation2PlannedCoverageEntryRelationshipPlannedCoverage975TestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlannedObservation2PlannedCoverageEntryRelationshipPlannedCoverage975",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_OBSERVATION2_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_PLANNED_COVERAGE975__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {

			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlannedObservation2PlannedCoverageEntryRelationshipPlannedCoverage975(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedObservation2PlannedCoverageEntryRelationshipPlannedCoverage975TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareActivityObservationTemplateId() {
		OperationsTestCase<PlannedObservation2> validatePlanOfCareActivityObservationTemplateIdTestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlanOfCareActivityObservationTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_CARE_ACTIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {

			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlanOfCareActivityObservationTemplateId(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivityObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareActivityObservationMoodCode() {
		OperationsTestCase<PlannedObservation2> validatePlanOfCareActivityObservationMoodCodeTestCase = new OperationsTestCase<PlannedObservation2>(
			"validatePlanOfCareActivityObservationMoodCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_CARE_ACTIVITY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedObservation2 target) {

			}

			@Override
			protected void updateToPass(PlannedObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedObservation2Operations.validatePlanOfCareActivityObservationMoodCode(
					(PlannedObservation2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivityObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PlannedObservation2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<PlannedObservation2> {
		@Override
		public PlannedObservation2 create() {
			return ConsolFactory.eINSTANCE.createPlannedObservation2();
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
	private static class ConstructorTestClass extends PlannedObservation2Operations {
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

} // PlannedObservation2Operations
