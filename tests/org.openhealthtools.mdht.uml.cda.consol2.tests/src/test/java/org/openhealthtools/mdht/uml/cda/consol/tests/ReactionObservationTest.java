/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     Dan Brown (Ai) - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.consol.SeverityObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.ReactionObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reaction Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationEffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationEffectiveTimeHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Effective Time High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationSeverityObservationInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Severity Observation Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationProcedureActivityProcedureInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Procedure Activity Procedure Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationMedicationActivityInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Medication Activity Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationEntryRelationship8(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Entry Relationship8</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationEntryRelationship10(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Entry Relationship10</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationEntryRelationship12(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Entry Relationship12</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationSeverityObservationEntryRelationshipSeverityObservation9(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Severity Observation Entry Relationship Severity Observation9</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationProcedureActivityProcedureEntryRelationshipProcedureActivityProcedure11(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Procedure Activity Procedure Entry Relationship Procedure Activity Procedure11</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationMedicationActivityEntryRelationshipMedicationActivity13(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Medication Activity Entry Relationship Medication Activity13</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ReactionObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationTextReference() {
		OperationsTestCase<ReactionObservation> validateReactionObservationTextReferenceTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationTextReference", operationsForOCL.getOCLValue(
				"VALIDATE_REACTION_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationTextReference(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationTextReferenceValue() {
		OperationsTestCase<ReactionObservation> validateReactionObservationTextReferenceValueTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationTextReferenceValue", operationsForOCL.getOCLValue(
				"VALIDATE_REACTION_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationTextReferenceValue(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationReferenceValue() {
		OperationsTestCase<ReactionObservation> validateReactionObservationReferenceValueTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationReferenceValue", operationsForOCL.getOCLValue(
				"VALIDATE_REACTION_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationReferenceValue(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationEffectiveTimeLow() {
		OperationsTestCase<ReactionObservation> validateReactionObservationEffectiveTimeLowTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationEffectiveTimeLow", operationsForOCL.getOCLValue(
				"VALIDATE_REACTION_OBSERVATION_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationEffectiveTimeLow(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationEffectiveTimeLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationEffectiveTimeHigh() {
		OperationsTestCase<ReactionObservation> validateReactionObservationEffectiveTimeHighTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationEffectiveTimeHigh", operationsForOCL.getOCLValue(
				"VALIDATE_REACTION_OBSERVATION_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationEffectiveTimeHigh(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationEffectiveTimeHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationSeverityObservationInversionInd() {
		OperationsTestCase<ReactionObservation> validateReactionObservationSeverityObservationInversionIndTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationSeverityObservationInversionInd",
			operationsForOCL.getOCLValue(
				"VALIDATE_REACTION_OBSERVATION_SEVERITY_OBSERVATION_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationSeverityObservationInversionInd(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationSeverityObservationInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationProcedureActivityProcedureInversionInd() {
		OperationsTestCase<ReactionObservation> validateReactionObservationProcedureActivityProcedureInversionIndTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationProcedureActivityProcedureInversionInd",
			operationsForOCL.getOCLValue(
				"VALIDATE_REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationProcedureActivityProcedureInversionInd(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationProcedureActivityProcedureInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationMedicationActivityInversionInd() {
		OperationsTestCase<ReactionObservation> validateReactionObservationMedicationActivityInversionIndTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationMedicationActivityInversionInd",
			operationsForOCL.getOCLValue(
				"VALIDATE_REACTION_OBSERVATION_MEDICATION_ACTIVITY_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationMedicationActivityInversionInd(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationMedicationActivityInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationTemplateId() {
		OperationsTestCase<ReactionObservation> validateReactionObservationTemplateIdTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationTemplateId(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationClassCode() {
		OperationsTestCase<ReactionObservation> validateReactionObservationClassCodeTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationClassCode(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationMoodCode() {
		OperationsTestCase<ReactionObservation> validateReactionObservationMoodCodeTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationMoodCode(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationId() {
		OperationsTestCase<ReactionObservation> validateReactionObservationIdTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationId",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationId(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationCode() {
		OperationsTestCase<ReactionObservation> validateReactionObservationCodeTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationCode(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationText() {
		OperationsTestCase<ReactionObservation> validateReactionObservationTextTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationText",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationText(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationStatusCode() {
		OperationsTestCase<ReactionObservation> validateReactionObservationStatusCodeTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationStatusCode(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationEffectiveTime() {
		OperationsTestCase<ReactionObservation> validateReactionObservationEffectiveTimeTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationEffectiveTime", operationsForOCL.getOCLValue(
				"VALIDATE_REACTION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationEffectiveTime(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationValue() {
		OperationsTestCase<ReactionObservation> validateReactionObservationValueTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationValue(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationValueP() {
		OperationsTestCase<ReactionObservation> validateReactionObservationValuePTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationValueP(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReactionObservationEntryRelationship8() {
		OperationsTestCase<ReactionObservation> validateReactionObservationEntryRelationship8TestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationEntryRelationship8", operationsForOCL.getOCLValue(
				"VALIDATE_REACTION_OBSERVATION_ENTRY_RELATIONSHIP8__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationEntryRelationship8(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationEntryRelationship8TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReactionObservationEntryRelationship10() {
		OperationsTestCase<ReactionObservation> validateReactionObservationEntryRelationship10TestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationEntryRelationship10", operationsForOCL.getOCLValue(
				"VALIDATE_REACTION_OBSERVATION_ENTRY_RELATIONSHIP10__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationEntryRelationship10(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationEntryRelationship10TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReactionObservationEntryRelationship12() {
		OperationsTestCase<ReactionObservation> validateReactionObservationEntryRelationship12TestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationEntryRelationship12", operationsForOCL.getOCLValue(
				"VALIDATE_REACTION_OBSERVATION_ENTRY_RELATIONSHIP12__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationEntryRelationship12(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationEntryRelationship12TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReactionObservationSeverityObservationEntryRelationshipSeverityObservation9() {
		OperationsTestCase<ReactionObservation> validateReactionObservationSeverityObservationEntryRelationshipSeverityObservation9TestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationSeverityObservationEntryRelationshipSeverityObservation9",
			operationsForOCL.getOCLValue(
				"VALIDATE_REACTION_OBSERVATION_SEVERITY_OBSERVATION_ENTRY_RELATIONSHIP_SEVERITY_OBSERVATION9__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationSeverityObservationEntryRelationshipSeverityObservation9(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationSeverityObservationEntryRelationshipSeverityObservation9TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReactionObservationProcedureActivityProcedureEntryRelationshipProcedureActivityProcedure11() {
		OperationsTestCase<ReactionObservation> validateReactionObservationProcedureActivityProcedureEntryRelationshipProcedureActivityProcedure11TestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationProcedureActivityProcedureEntryRelationshipProcedureActivityProcedure11",
			operationsForOCL.getOCLValue(
				"VALIDATE_REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_PROCEDURE11__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationProcedureActivityProcedureEntryRelationshipProcedureActivityProcedure11(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationProcedureActivityProcedureEntryRelationshipProcedureActivityProcedure11TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReactionObservationMedicationActivityEntryRelationshipMedicationActivity13() {
		OperationsTestCase<ReactionObservation> validateReactionObservationMedicationActivityEntryRelationshipMedicationActivity13TestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationMedicationActivityEntryRelationshipMedicationActivity13",
			operationsForOCL.getOCLValue(
				"VALIDATE_REACTION_OBSERVATION_MEDICATION_ACTIVITY_ENTRY_RELATIONSHIP_MEDICATION_ACTIVITY13__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationMedicationActivityEntryRelationshipMedicationActivity13(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationMedicationActivityEntryRelationshipMedicationActivity13TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ReactionObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ReactionObservation> {
		@Override
		public ReactionObservation create() {
			return ConsolFactory.eINSTANCE.createReactionObservation();
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
	private static class ConstructorTestClass extends ReactionObservationOperations {
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

	private enum ENTRY_RELATIONSHIP_OBJECT {
		SEVERITY_OBS, PROCEDURE_ACTIVITY_PROCEDURE, MEDICATION_ACTIVITY
	};

	/**
	 * Creates the entryRelationship object with one entry based on the input type
	 * @param type
	 * @param inversionInd
	 * @return
	 */
	protected EntryRelationship createEntryRelationship(ENTRY_RELATIONSHIP_OBJECT type, boolean inversionInd) {

		EntryRelationship e = CDAFactory.eINSTANCE.createEntryRelationship();
		switch (type) {
			case SEVERITY_OBS:
				SeverityObservation sObs = ConsolFactory.eINSTANCE.createSeverityObservation().init();
				sObs.init();
				e.setObservation(sObs);
				break;
			case PROCEDURE_ACTIVITY_PROCEDURE:
				ProcedureActivityProcedure paProcedure = ConsolFactory.eINSTANCE.createProcedureActivityProcedure().init();
				paProcedure.init();
				e.setProcedure(paProcedure);
				break;
			case MEDICATION_ACTIVITY:
				MedicationActivity mAct = ConsolFactory.eINSTANCE.createMedicationActivity();
				mAct.init();
				e.setSubstanceAdministration(mAct);
				break;
		}
		e.setInversionInd(Boolean.valueOf(inversionInd));

		return e;
	}
} // ReactionObservationOperations
