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
import org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.OutcomeObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Outcome Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationProgTowardGoalObsInversionIndIsTrue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Prog Toward Goal Obs Inversion Ind Is True</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationEntryRelationship616(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Entry Relationship616</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationEntryRelationship618(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Entry Relationship618</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationEntryRelationship620(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Entry Relationship620</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationReferenceTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Reference Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationReferenceExternalDocumentReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Reference External Document Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationEntryReferenceEntryRelationshipEntryReferenceGoalObs617(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Entry Reference Entry Relationship Entry Reference Goal Obs617</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationProgressTowardGoalObservationEntryRelationshipProgressTowardGoalObservation619(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Progress Toward Goal Observation Entry Relationship Progress Toward Goal Observation619</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationEntryReferenceEntryRelationshipEntryReferenceInterventionAct621(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Entry Reference Entry Relationship Entry Reference Intervention Act621</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class OutcomeObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOutcomeObservationProgTowardGoalObsInversionIndIsTrue() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationProgTowardGoalObsInversionIndIsTrueTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationProgTowardGoalObsInversionIndIsTrue",
			operationsForOCL.getOCLValue(
				"VALIDATE_OUTCOME_OBSERVATION_PROG_TOWARD_GOAL_OBS_INVERSION_IND_IS_TRUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {

			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationProgTowardGoalObsInversionIndIsTrue(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationProgTowardGoalObsInversionIndIsTrueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOutcomeObservationTemplateId() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationTemplateIdTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_OUTCOME_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {

			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationTemplateId(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOutcomeObservationClassCode() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationClassCodeTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_OUTCOME_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {

			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationClassCode(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOutcomeObservationMoodCode() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationMoodCodeTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_OUTCOME_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {

			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationMoodCode(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOutcomeObservationId() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationIdTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationId",
			operationsForOCL.getOCLValue("VALIDATE_OUTCOME_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {

			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationId(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOutcomeObservationCodeP() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationCodePTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_OUTCOME_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {

			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationCodeP(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOutcomeObservationCode() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationCodeTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_OUTCOME_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {

			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected void setDependency(OutcomeObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.OutcomeObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationCode(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOutcomeObservationValue() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationValueTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_OUTCOME_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {

			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationValue(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOutcomeObservationAuthorParticipation() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationAuthorParticipationTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationAuthorParticipation", operationsForOCL.getOCLValue(
				"VALIDATE_OUTCOME_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {

			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationAuthorParticipation(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationAuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOutcomeObservationReference() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationReferenceTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationReference",
			operationsForOCL.getOCLValue("VALIDATE_OUTCOME_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {

			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationReference(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOutcomeObservationEntryRelationship() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationEntryRelationshipTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationEntryRelationship", operationsForOCL.getOCLValue(
				"VALIDATE_OUTCOME_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {

			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationEntryRelationship(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationEntryRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOutcomeObservationEntryRelationship616() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationEntryRelationship616TestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationEntryRelationship616", operationsForOCL.getOCLValue(
				"VALIDATE_OUTCOME_OBSERVATION_ENTRY_RELATIONSHIP616__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {

			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationEntryRelationship616(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationEntryRelationship616TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOutcomeObservationEntryRelationship618() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationEntryRelationship618TestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationEntryRelationship618", operationsForOCL.getOCLValue(
				"VALIDATE_OUTCOME_OBSERVATION_ENTRY_RELATIONSHIP618__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {

			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationEntryRelationship618(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationEntryRelationship618TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOutcomeObservationEntryRelationship620() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationEntryRelationship620TestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationEntryRelationship620", operationsForOCL.getOCLValue(
				"VALIDATE_OUTCOME_OBSERVATION_ENTRY_RELATIONSHIP620__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {

			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationEntryRelationship620(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationEntryRelationship620TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOutcomeObservationReferenceTypeCode() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationReferenceTypeCodeTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationReferenceTypeCode", operationsForOCL.getOCLValue(
				"VALIDATE_OUTCOME_OBSERVATION_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {

			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationReferenceTypeCode(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationReferenceTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOutcomeObservationReferenceExternalDocumentReference() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationReferenceExternalDocumentReferenceTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationReferenceExternalDocumentReference",
			operationsForOCL.getOCLValue(
				"VALIDATE_OUTCOME_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {

			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationReferenceExternalDocumentReference(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationReferenceExternalDocumentReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOutcomeObservationEntryReferenceEntryRelationshipEntryReferenceGoalObs617() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationEntryReferenceEntryRelationshipEntryReferenceGoalObs617TestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationEntryReferenceEntryRelationshipEntryReferenceGoalObs617",
			operationsForOCL.getOCLValue(
				"VALIDATE_OUTCOME_OBSERVATION_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_GOAL_OBS617__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {

			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationEntryReferenceEntryRelationshipEntryReferenceGoalObs617(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationEntryReferenceEntryRelationshipEntryReferenceGoalObs617TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOutcomeObservationProgressTowardGoalObservationEntryRelationshipProgressTowardGoalObservation619() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationProgressTowardGoalObservationEntryRelationshipProgressTowardGoalObservation619TestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationProgressTowardGoalObservationEntryRelationshipProgressTowardGoalObservation619",
			operationsForOCL.getOCLValue(
				"VALIDATE_OUTCOME_OBSERVATION_PROGRESS_TOWARD_GOAL_OBSERVATION_ENTRY_RELATIONSHIP_PROGRESS_TOWARD_GOAL_OBSERVATION619__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {

			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationProgressTowardGoalObservationEntryRelationshipProgressTowardGoalObservation619(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationProgressTowardGoalObservationEntryRelationshipProgressTowardGoalObservation619TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOutcomeObservationEntryReferenceEntryRelationshipEntryReferenceInterventionAct621() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationEntryReferenceEntryRelationshipEntryReferenceInterventionAct621TestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationEntryReferenceEntryRelationshipEntryReferenceInterventionAct621",
			operationsForOCL.getOCLValue(
				"VALIDATE_OUTCOME_OBSERVATION_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_INTERVENTION_ACT621__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {

			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationEntryReferenceEntryRelationshipEntryReferenceInterventionAct621(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationEntryReferenceEntryRelationshipEntryReferenceInterventionAct621TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends OutcomeObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<OutcomeObservation> {
		@Override
		public OutcomeObservation create() {
			return ConsolFactory.eINSTANCE.createOutcomeObservation();
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
	private static class ConstructorTestClass extends OutcomeObservationOperations {
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

} // OutcomeObservationOperations
