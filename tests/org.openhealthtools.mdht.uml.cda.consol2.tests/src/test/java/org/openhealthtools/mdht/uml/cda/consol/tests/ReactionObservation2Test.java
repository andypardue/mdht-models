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

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Ignore;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ReactionObservation2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reaction Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationCodeValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Code Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservation2EntryRelationship1036(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation2 Entry Relationship1036</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservation2EntryRelationship1038(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation2 Entry Relationship1038</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservation2EntryRelationship1040(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation2 Entry Relationship1040</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservation2ProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure21037(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation2 Procedure Activity Procedure2 Entry Relationship Procedure Activity Procedure21037</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservation2MedicationActivity2EntryRelationshipMedicationActivity21039(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation2 Medication Activity2 Entry Relationship Medication Activity21039</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservation2SeverityObservation2EntryRelationshipSeverityObservation21041(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation2 Severity Observation2 Entry Relationship Severity Observation21041</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationProcedureActivityProcedureInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Procedure Activity Procedure Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationMedicationActivityInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Medication Activity Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationSeverityObservationInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Severity Observation Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2#validateReactionObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ReactionObservation2Test extends CDAValidationTest {

	/**
	*
	* @generated
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Test
	@Ignore
	public void testValidateReactionObservationCodeValueSet() {
		OperationsTestCase<ReactionObservation2> validateReactionObservationCodeValueSetTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationCodeValueSet", operationsForOCL.getOCLValue(
				"VALIDATE_REACTION_OBSERVATION_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation2 target) {

			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservationCodeValueSet(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationCodeValueSetTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationCodeP() {
		OperationsTestCase<ReactionObservation2> validateReactionObservationCodePTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation2 target) {

			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservationCodeP(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationStatusCodeP() {
		OperationsTestCase<ReactionObservation2> validateReactionObservationStatusCodePTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation2 target) {

			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservationStatusCodeP(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReactionObservation2EntryRelationship1036() {
		OperationsTestCase<ReactionObservation2> validateReactionObservation2EntryRelationship1036TestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservation2EntryRelationship1036",
			operationsForOCL.getOCLValue(
				"VALIDATE_REACTION_OBSERVATION2_ENTRY_RELATIONSHIP1036__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation2 target) {

			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservation2EntryRelationship1036(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservation2EntryRelationship1036TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReactionObservation2EntryRelationship1038() {
		OperationsTestCase<ReactionObservation2> validateReactionObservation2EntryRelationship1038TestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservation2EntryRelationship1038",
			operationsForOCL.getOCLValue(
				"VALIDATE_REACTION_OBSERVATION2_ENTRY_RELATIONSHIP1038__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation2 target) {

			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservation2EntryRelationship1038(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservation2EntryRelationship1038TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReactionObservation2EntryRelationship1040() {
		OperationsTestCase<ReactionObservation2> validateReactionObservation2EntryRelationship1040TestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservation2EntryRelationship1040",
			operationsForOCL.getOCLValue(
				"VALIDATE_REACTION_OBSERVATION2_ENTRY_RELATIONSHIP1040__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation2 target) {

			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservation2EntryRelationship1040(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservation2EntryRelationship1040TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReactionObservation2ProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure21037() {
		OperationsTestCase<ReactionObservation2> validateReactionObservation2ProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure21037TestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservation2ProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure21037",
			operationsForOCL.getOCLValue(
				"VALIDATE_REACTION_OBSERVATION2_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_PROCEDURE21037__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation2 target) {

			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservation2ProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure21037(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservation2ProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure21037TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReactionObservation2MedicationActivity2EntryRelationshipMedicationActivity21039() {
		OperationsTestCase<ReactionObservation2> validateReactionObservation2MedicationActivity2EntryRelationshipMedicationActivity21039TestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservation2MedicationActivity2EntryRelationshipMedicationActivity21039",
			operationsForOCL.getOCLValue(
				"VALIDATE_REACTION_OBSERVATION2_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_MEDICATION_ACTIVITY21039__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation2 target) {

			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservation2MedicationActivity2EntryRelationshipMedicationActivity21039(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservation2MedicationActivity2EntryRelationshipMedicationActivity21039TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReactionObservation2SeverityObservation2EntryRelationshipSeverityObservation21041() {
		OperationsTestCase<ReactionObservation2> validateReactionObservation2SeverityObservation2EntryRelationshipSeverityObservation21041TestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservation2SeverityObservation2EntryRelationshipSeverityObservation21041",
			operationsForOCL.getOCLValue(
				"VALIDATE_REACTION_OBSERVATION2_SEVERITY_OBSERVATION2_ENTRY_RELATIONSHIP_SEVERITY_OBSERVATION21041__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation2 target) {

			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservation2SeverityObservation2EntryRelationshipSeverityObservation21041(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservation2SeverityObservation2EntryRelationshipSeverityObservation21041TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationProcedureActivityProcedureInversionInd() {
		OperationsTestCase<ReactionObservation2> validateReactionObservationProcedureActivityProcedureInversionIndTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationProcedureActivityProcedureInversionInd",
			operationsForOCL.getOCLValue(
				"VALIDATE_REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation2 target) {

			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservationProcedureActivityProcedureInversionInd(
					(ReactionObservation2) objectToTest, diagnostician, map);
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
		OperationsTestCase<ReactionObservation2> validateReactionObservationMedicationActivityInversionIndTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationMedicationActivityInversionInd",
			operationsForOCL.getOCLValue(
				"VALIDATE_REACTION_OBSERVATION_MEDICATION_ACTIVITY_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation2 target) {

			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservationMedicationActivityInversionInd(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationMedicationActivityInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationSeverityObservationInversionInd() {
		OperationsTestCase<ReactionObservation2> validateReactionObservationSeverityObservationInversionIndTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationSeverityObservationInversionInd",
			operationsForOCL.getOCLValue(
				"VALIDATE_REACTION_OBSERVATION_SEVERITY_OBSERVATION_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation2 target) {

			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservationSeverityObservationInversionInd(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationSeverityObservationInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Test
	@Ignore
	public void testValidateReactionObservationTextReference() {
		OperationsTestCase<ReactionObservation2> validateReactionObservationTextReferenceTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationTextReference", operationsForOCL.getOCLValue(
				"VALIDATE_REACTION_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation2 target) {

			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservationTextReference(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Test
	@Ignore
	public void testValidateReactionObservationTextReferenceValue() {
		OperationsTestCase<ReactionObservation2> validateReactionObservationTextReferenceValueTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationTextReferenceValue", operationsForOCL.getOCLValue(
				"VALIDATE_REACTION_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation2 target) {

			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservationTextReferenceValue(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Test
	@Ignore
	public void testValidateReactionObservationReferenceValue() {
		OperationsTestCase<ReactionObservation2> validateReactionObservationReferenceValueTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationReferenceValue", operationsForOCL.getOCLValue(
				"VALIDATE_REACTION_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation2 target) {

			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservationReferenceValue(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationTemplateId() {
		OperationsTestCase<ReactionObservation2> validateReactionObservationTemplateIdTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation2 target) {

			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservationTemplateId(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationCode() {
		OperationsTestCase<ReactionObservation2> validateReactionObservationCodeTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation2 target) {

			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected void setDependency(ReactionObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ReactionObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservationCode(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationId() {
		OperationsTestCase<ReactionObservation2> validateReactionObservationIdTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationId",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation2 target) {

			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservationId(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	* This attribute is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Test
	@Ignore
	public void testValidateReactionObservationText() {
		OperationsTestCase<ReactionObservation2> validateReactionObservationTextTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationText",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation2 target) {

			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservationText(
					(ReactionObservation2) objectToTest, diagnostician, map);
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
		OperationsTestCase<ReactionObservation2> validateReactionObservationStatusCodeTestCase = new OperationsTestCase<ReactionObservation2>(
			"validateReactionObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation2 target) {

			}

			@Override
			protected void updateToPass(ReactionObservation2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(ReactionObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ReactionObservationStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservation2Operations.validateReactionObservationStatusCode(
					(ReactionObservation2) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ReactionObservation2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ReactionObservation2> {
		@Override
		public ReactionObservation2 create() {
			return ConsolFactory.eINSTANCE.createReactionObservation2();
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
	private static class ConstructorTestClass extends ReactionObservation2Operations {
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

} // ReactionObservation2Operations
