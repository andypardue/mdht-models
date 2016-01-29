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
import org.openhealthtools.mdht.uml.cda.consol.GoalObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.GoalObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Goal Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationEntryRelationship624(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Entry Relationship624</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationEntryRelationship626(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Entry Relationship626</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationEntryRelationship628(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Entry Relationship628</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationEntryRelationship630(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Entry Relationship630</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationEntryRelationship632(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Entry Relationship632</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationReferenceTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Reference Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationReferenceExternalDocumentReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Reference External Document Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationEntryReferenceEntryRelationshipHealthConcernActER625(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Entry Reference Entry Relationship Health Concern Act ER625</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationEntryReferenceEntryRelationshipPlannedERs627(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Entry Reference Entry Relationship Planned ERs627</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationPriorityPreferenceEntryRelationshipPriorityPreference629(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Priority Preference Entry Relationship Priority Preference629</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationGoalObservationEntryRelationshipGoalObservation631(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Goal Observation Entry Relationship Goal Observation631</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationEntryReferenceEntryRelationshipActReferenceER633(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Entry Reference Entry Relationship Act Reference ER633</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class GoalObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGoalObservationTemplateId() {
		OperationsTestCase<GoalObservation> validateGoalObservationTemplateIdTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationTemplateId(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGoalObservationClassCode() {
		OperationsTestCase<GoalObservation> validateGoalObservationClassCodeTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationClassCode(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGoalObservationMoodCode() {
		OperationsTestCase<GoalObservation> validateGoalObservationMoodCodeTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationMoodCode(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGoalObservationId() {
		OperationsTestCase<GoalObservation> validateGoalObservationIdTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationId",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationId(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGoalObservationCodeP() {
		OperationsTestCase<GoalObservation> validateGoalObservationCodePTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationCodeP(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGoalObservationCode() {
		OperationsTestCase<GoalObservation> validateGoalObservationCodeTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected void setDependency(GoalObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.GoalObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationCode(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGoalObservationStatusCode() {
		OperationsTestCase<GoalObservation> validateGoalObservationStatusCodeTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationStatusCode(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGoalObservationStatusCodeP() {
		OperationsTestCase<GoalObservation> validateGoalObservationStatusCodePTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationStatusCodeP(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGoalObservationEffectiveTime() {
		OperationsTestCase<GoalObservation> validateGoalObservationEffectiveTimeTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationEffectiveTime(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGoalObservationValue() {
		OperationsTestCase<GoalObservation> validateGoalObservationValueTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationValue(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGoalObservationAuthorParticipation() {
		OperationsTestCase<GoalObservation> validateGoalObservationAuthorParticipationTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationAuthorParticipation", operationsForOCL.getOCLValue(
				"VALIDATE_GOAL_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationAuthorParticipation(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationAuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGoalObservationReference() {
		OperationsTestCase<GoalObservation> validateGoalObservationReferenceTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationReference",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationReference(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateGoalObservationEntryRelationship624() {
		OperationsTestCase<GoalObservation> validateGoalObservationEntryRelationship624TestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationEntryRelationship624", operationsForOCL.getOCLValue(
				"VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP624__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationEntryRelationship624(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationEntryRelationship624TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateGoalObservationEntryRelationship626() {
		OperationsTestCase<GoalObservation> validateGoalObservationEntryRelationship626TestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationEntryRelationship626", operationsForOCL.getOCLValue(
				"VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP626__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationEntryRelationship626(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationEntryRelationship626TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateGoalObservationEntryRelationship628() {
		OperationsTestCase<GoalObservation> validateGoalObservationEntryRelationship628TestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationEntryRelationship628", operationsForOCL.getOCLValue(
				"VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP628__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationEntryRelationship628(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationEntryRelationship628TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateGoalObservationEntryRelationship630() {
		OperationsTestCase<GoalObservation> validateGoalObservationEntryRelationship630TestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationEntryRelationship630", operationsForOCL.getOCLValue(
				"VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP630__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationEntryRelationship630(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationEntryRelationship630TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateGoalObservationEntryRelationship632() {
		OperationsTestCase<GoalObservation> validateGoalObservationEntryRelationship632TestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationEntryRelationship632", operationsForOCL.getOCLValue(
				"VALIDATE_GOAL_OBSERVATION_ENTRY_RELATIONSHIP632__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationEntryRelationship632(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationEntryRelationship632TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGoalObservationReferenceTypeCode() {
		OperationsTestCase<GoalObservation> validateGoalObservationReferenceTypeCodeTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationReferenceTypeCode", operationsForOCL.getOCLValue(
				"VALIDATE_GOAL_OBSERVATION_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationReferenceTypeCode(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationReferenceTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGoalObservationReferenceExternalDocumentReference() {
		OperationsTestCase<GoalObservation> validateGoalObservationReferenceExternalDocumentReferenceTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationReferenceExternalDocumentReference",
			operationsForOCL.getOCLValue(
				"VALIDATE_GOAL_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationReferenceExternalDocumentReference(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationReferenceExternalDocumentReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateGoalObservationEntryReferenceEntryRelationshipHealthConcernActER625() {
		OperationsTestCase<GoalObservation> validateGoalObservationEntryReferenceEntryRelationshipHealthConcernActER625TestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationEntryReferenceEntryRelationshipHealthConcernActER625",
			operationsForOCL.getOCLValue(
				"VALIDATE_GOAL_OBSERVATION_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_HEALTH_CONCERN_ACT_ER625__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationEntryReferenceEntryRelationshipHealthConcernActER625(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationEntryReferenceEntryRelationshipHealthConcernActER625TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateGoalObservationEntryReferenceEntryRelationshipPlannedERs627() {
		OperationsTestCase<GoalObservation> validateGoalObservationEntryReferenceEntryRelationshipPlannedERs627TestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationEntryReferenceEntryRelationshipPlannedERs627",
			operationsForOCL.getOCLValue(
				"VALIDATE_GOAL_OBSERVATION_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_PLANNED_ERS627__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationEntryReferenceEntryRelationshipPlannedERs627(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationEntryReferenceEntryRelationshipPlannedERs627TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateGoalObservationPriorityPreferenceEntryRelationshipPriorityPreference629() {
		OperationsTestCase<GoalObservation> validateGoalObservationPriorityPreferenceEntryRelationshipPriorityPreference629TestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationPriorityPreferenceEntryRelationshipPriorityPreference629",
			operationsForOCL.getOCLValue(
				"VALIDATE_GOAL_OBSERVATION_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE629__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationPriorityPreferenceEntryRelationshipPriorityPreference629(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationPriorityPreferenceEntryRelationshipPriorityPreference629TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateGoalObservationGoalObservationEntryRelationshipGoalObservation631() {
		OperationsTestCase<GoalObservation> validateGoalObservationGoalObservationEntryRelationshipGoalObservation631TestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationGoalObservationEntryRelationshipGoalObservation631",
			operationsForOCL.getOCLValue(
				"VALIDATE_GOAL_OBSERVATION_GOAL_OBSERVATION_ENTRY_RELATIONSHIP_GOAL_OBSERVATION631__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationGoalObservationEntryRelationshipGoalObservation631(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationGoalObservationEntryRelationshipGoalObservation631TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateGoalObservationEntryReferenceEntryRelationshipActReferenceER633() {
		OperationsTestCase<GoalObservation> validateGoalObservationEntryReferenceEntryRelationshipActReferenceER633TestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationEntryReferenceEntryRelationshipActReferenceER633",
			operationsForOCL.getOCLValue(
				"VALIDATE_GOAL_OBSERVATION_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ACT_REFERENCE_ER633__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationEntryReferenceEntryRelationshipActReferenceER633(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationEntryReferenceEntryRelationshipActReferenceER633TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends GoalObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<GoalObservation> {
		@Override
		public GoalObservation create() {
			return ConsolFactory.eINSTANCE.createGoalObservation();
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
	private static class ConstructorTestClass extends GoalObservationOperations {
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

} // GoalObservationOperations
