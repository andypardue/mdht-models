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
import org.openhealthtools.mdht.uml.cda.consol.InterventionAct;
import org.openhealthtools.mdht.uml.cda.consol.operations.InterventionActOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Intervention Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEntryRelationship700(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship700</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEntryRelationship702(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship702</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEntryRelationship704(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship704</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEntryRelationship706(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship706</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEntryRelationship708(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship708</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEntryRelationship710(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship710</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEntryRelationship712(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship712</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEntryRelationship714(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship714</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEntryRelationship716(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship716</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEntryRelationship718(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship718</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEntryRelationship720(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship720</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEntryRelationship722(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship722</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEntryRelationship724(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship724</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEntryRelationship726(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship726</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEntryRelationship728(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Relationship728</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActReferenceTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Reference Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActReferenceExternalDocumentReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Reference External Document Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation2701(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Advance Directive Observation2 Entry Relationship Advance Directive Observation2701</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity2703(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Immunization Activity2 Entry Relationship Immunization Activity2703</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActMedicationActivity2EntryRelationshipMedicationActivity2705(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Medication Activity2 Entry Relationship Medication Activity2705</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct2707(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Procedure Activity Act2 Entry Relationship Procedure Activity Act2707</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActInterventionActEntryRelationshipInterventionAct709(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Intervention Act Entry Relationship Intervention Act709</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation2711(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Procedure Activity Observation2 Entry Relationship Procedure Activity Observation2711</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure2713(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Procedure Activity Procedure2 Entry Relationship Procedure Activity Procedure2713</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEncounterActivity2EntryRelationshipEncounterActivity2715(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Encounter Activity2 Entry Relationship Encounter Activity2715</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActInstruction2EntryRelationshipInstruction2717(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Instruction2 Entry Relationship Instruction2717</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity2719(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Non Medicinal Supply Activity2 Entry Relationship Non Medicinal Supply Activity2719</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation721(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Nutrition Recommendation Entry Relationship Nutrition Recommendation721</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEntryReferenceEntryRelationshipInterventionEntryReference723(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Entry Reference Entry Relationship Intervention Entry Reference723</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActGoalObsEntryReferenceEntryRelationshipGoalObsEntryReference725(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Goal Obs Entry Reference Entry Relationship Goal Obs Entry Reference725</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants727(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Handoff Communication Participants Entry Relationship Handoff Communication Participants727</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActPlannedInterventionActEntryRelationshipPlannedInterventionAct729(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Planned Intervention Act Entry Relationship Planned Intervention Act729</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class InterventionActTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionActTemplateId() {
		OperationsTestCase<InterventionAct> validateInterventionActTemplateIdTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActTemplateId(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionActClassCode() {
		OperationsTestCase<InterventionAct> validateInterventionActClassCodeTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActClassCode",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActClassCode(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionActMoodCode() {
		OperationsTestCase<InterventionAct> validateInterventionActMoodCodeTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActMoodCode(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionActId() {
		OperationsTestCase<InterventionAct> validateInterventionActIdTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActId",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActId(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionActCodeP() {
		OperationsTestCase<InterventionAct> validateInterventionActCodePTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActCodeP",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActCodeP(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionActCode() {
		OperationsTestCase<InterventionAct> validateInterventionActCodeTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActCode",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected void setDependency(InterventionAct target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.InterventionActCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActCode(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionActStatusCode() {
		OperationsTestCase<InterventionAct> validateInterventionActStatusCodeTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActStatusCode(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionActStatusCodeP() {
		OperationsTestCase<InterventionAct> validateInterventionActStatusCodePTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActStatusCodeP(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionActEffectiveTime() {
		OperationsTestCase<InterventionAct> validateInterventionActEffectiveTimeTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActEffectiveTime(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionActAuthorParticipation() {
		OperationsTestCase<InterventionAct> validateInterventionActAuthorParticipationTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActAuthorParticipation", operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTION_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActAuthorParticipation(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActAuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionActReference() {
		OperationsTestCase<InterventionAct> validateInterventionActReferenceTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActReference",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActReference(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionActEntryRelationship700() {
		OperationsTestCase<InterventionAct> validateInterventionActEntryRelationship700TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActEntryRelationship700", operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP700__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActEntryRelationship700(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActEntryRelationship700TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionActEntryRelationship702() {
		OperationsTestCase<InterventionAct> validateInterventionActEntryRelationship702TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActEntryRelationship702", operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP702__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActEntryRelationship702(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActEntryRelationship702TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionActEntryRelationship704() {
		OperationsTestCase<InterventionAct> validateInterventionActEntryRelationship704TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActEntryRelationship704", operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP704__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActEntryRelationship704(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActEntryRelationship704TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionActEntryRelationship706() {
		OperationsTestCase<InterventionAct> validateInterventionActEntryRelationship706TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActEntryRelationship706", operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP706__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActEntryRelationship706(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActEntryRelationship706TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionActEntryRelationship708() {
		OperationsTestCase<InterventionAct> validateInterventionActEntryRelationship708TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActEntryRelationship708", operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP708__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActEntryRelationship708(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActEntryRelationship708TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionActEntryRelationship710() {
		OperationsTestCase<InterventionAct> validateInterventionActEntryRelationship710TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActEntryRelationship710", operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP710__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActEntryRelationship710(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActEntryRelationship710TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionActEntryRelationship712() {
		OperationsTestCase<InterventionAct> validateInterventionActEntryRelationship712TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActEntryRelationship712", operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP712__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActEntryRelationship712(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActEntryRelationship712TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionActEntryRelationship714() {
		OperationsTestCase<InterventionAct> validateInterventionActEntryRelationship714TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActEntryRelationship714", operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP714__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActEntryRelationship714(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActEntryRelationship714TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionActEntryRelationship716() {
		OperationsTestCase<InterventionAct> validateInterventionActEntryRelationship716TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActEntryRelationship716", operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP716__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActEntryRelationship716(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActEntryRelationship716TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionActEntryRelationship718() {
		OperationsTestCase<InterventionAct> validateInterventionActEntryRelationship718TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActEntryRelationship718", operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP718__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActEntryRelationship718(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActEntryRelationship718TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionActEntryRelationship720() {
		OperationsTestCase<InterventionAct> validateInterventionActEntryRelationship720TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActEntryRelationship720", operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP720__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActEntryRelationship720(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActEntryRelationship720TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionActEntryRelationship722() {
		OperationsTestCase<InterventionAct> validateInterventionActEntryRelationship722TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActEntryRelationship722", operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP722__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActEntryRelationship722(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActEntryRelationship722TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionActEntryRelationship724() {
		OperationsTestCase<InterventionAct> validateInterventionActEntryRelationship724TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActEntryRelationship724", operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP724__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActEntryRelationship724(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActEntryRelationship724TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionActEntryRelationship726() {
		OperationsTestCase<InterventionAct> validateInterventionActEntryRelationship726TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActEntryRelationship726", operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP726__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActEntryRelationship726(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActEntryRelationship726TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionActEntryRelationship728() {
		OperationsTestCase<InterventionAct> validateInterventionActEntryRelationship728TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActEntryRelationship728", operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTION_ACT_ENTRY_RELATIONSHIP728__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActEntryRelationship728(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActEntryRelationship728TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionActReferenceTypeCode() {
		OperationsTestCase<InterventionAct> validateInterventionActReferenceTypeCodeTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActReferenceTypeCode", operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTION_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActReferenceTypeCode(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActReferenceTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionActReferenceExternalDocumentReference() {
		OperationsTestCase<InterventionAct> validateInterventionActReferenceExternalDocumentReferenceTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActReferenceExternalDocumentReference",
			operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTION_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActReferenceExternalDocumentReference(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActReferenceExternalDocumentReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation2701() {
		OperationsTestCase<InterventionAct> validateInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation2701TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation2701",
			operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTION_ACT_ADVANCE_DIRECTIVE_OBSERVATION2_ENTRY_RELATIONSHIP_ADVANCE_DIRECTIVE_OBSERVATION2701__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation2701(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation2701TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity2703() {
		OperationsTestCase<InterventionAct> validateInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity2703TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity2703",
			operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTION_ACT_IMMUNIZATION_ACTIVITY2_ENTRY_RELATIONSHIP_IMMUNIZATION_ACTIVITY2703__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity2703(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity2703TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionActMedicationActivity2EntryRelationshipMedicationActivity2705() {
		OperationsTestCase<InterventionAct> validateInterventionActMedicationActivity2EntryRelationshipMedicationActivity2705TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActMedicationActivity2EntryRelationshipMedicationActivity2705",
			operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTION_ACT_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_MEDICATION_ACTIVITY2705__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActMedicationActivity2EntryRelationshipMedicationActivity2705(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActMedicationActivity2EntryRelationshipMedicationActivity2705TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct2707() {
		OperationsTestCase<InterventionAct> validateInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct2707TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct2707",
			operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_ACT2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_ACT2707__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct2707(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct2707TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionActInterventionActEntryRelationshipInterventionAct709() {
		OperationsTestCase<InterventionAct> validateInterventionActInterventionActEntryRelationshipInterventionAct709TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActInterventionActEntryRelationshipInterventionAct709",
			operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTION_ACT_INTERVENTION_ACT_ENTRY_RELATIONSHIP_INTERVENTION_ACT709__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActInterventionActEntryRelationshipInterventionAct709(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActInterventionActEntryRelationshipInterventionAct709TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation2711() {
		OperationsTestCase<InterventionAct> validateInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation2711TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation2711",
			operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_OBSERVATION2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_OBSERVATION2711__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation2711(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation2711TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure2713() {
		OperationsTestCase<InterventionAct> validateInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure2713TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure2713",
			operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_PROCEDURE2713__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure2713(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure2713TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionActEncounterActivity2EntryRelationshipEncounterActivity2715() {
		OperationsTestCase<InterventionAct> validateInterventionActEncounterActivity2EntryRelationshipEncounterActivity2715TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActEncounterActivity2EntryRelationshipEncounterActivity2715",
			operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTION_ACT_ENCOUNTER_ACTIVITY2_ENTRY_RELATIONSHIP_ENCOUNTER_ACTIVITY2715__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActEncounterActivity2EntryRelationshipEncounterActivity2715(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActEncounterActivity2EntryRelationshipEncounterActivity2715TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionActInstruction2EntryRelationshipInstruction2717() {
		OperationsTestCase<InterventionAct> validateInterventionActInstruction2EntryRelationshipInstruction2717TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActInstruction2EntryRelationshipInstruction2717",
			operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTION_ACT_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION2717__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActInstruction2EntryRelationshipInstruction2717(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActInstruction2EntryRelationshipInstruction2717TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity2719() {
		OperationsTestCase<InterventionAct> validateInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity2719TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity2719",
			operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTION_ACT_NON_MEDICINAL_SUPPLY_ACTIVITY2_ENTRY_RELATIONSHIP_NON_MEDICINAL_SUPPLY_ACTIVITY2719__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity2719(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity2719TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation721() {
		OperationsTestCase<InterventionAct> validateInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation721TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation721",
			operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTION_ACT_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP_NUTRITION_RECOMMENDATION721__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation721(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation721TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionActEntryReferenceEntryRelationshipInterventionEntryReference723() {
		OperationsTestCase<InterventionAct> validateInterventionActEntryReferenceEntryRelationshipInterventionEntryReference723TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActEntryReferenceEntryRelationshipInterventionEntryReference723",
			operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTION_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_INTERVENTION_ENTRY_REFERENCE723__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActEntryReferenceEntryRelationshipInterventionEntryReference723(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActEntryReferenceEntryRelationshipInterventionEntryReference723TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionActGoalObsEntryReferenceEntryRelationshipGoalObsEntryReference725() {
		OperationsTestCase<InterventionAct> validateInterventionActGoalObsEntryReferenceEntryRelationshipGoalObsEntryReference725TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActGoalObsEntryReferenceEntryRelationshipGoalObsEntryReference725",
			operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTION_ACT_GOAL_OBS_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_GOAL_OBS_ENTRY_REFERENCE725__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActGoalObsEntryReferenceEntryRelationshipGoalObsEntryReference725(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActGoalObsEntryReferenceEntryRelationshipGoalObsEntryReference725TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants727() {
		OperationsTestCase<InterventionAct> validateInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants727TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants727",
			operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTION_ACT_HANDOFF_COMMUNICATION_PARTICIPANTS_ENTRY_RELATIONSHIP_HANDOFF_COMMUNICATION_PARTICIPANTS727__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants727(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants727TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionActPlannedInterventionActEntryRelationshipPlannedInterventionAct729() {
		OperationsTestCase<InterventionAct> validateInterventionActPlannedInterventionActEntryRelationshipPlannedInterventionAct729TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActPlannedInterventionActEntryRelationshipPlannedInterventionAct729",
			operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTION_ACT_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP_PLANNED_INTERVENTION_ACT729__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActPlannedInterventionActEntryRelationshipPlannedInterventionAct729(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActPlannedInterventionActEntryRelationshipPlannedInterventionAct729TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends InterventionActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<InterventionAct> {
		@Override
		public InterventionAct create() {
			return ConsolFactory.eINSTANCE.createInterventionAct();
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
	private static class ConstructorTestClass extends InterventionActOperations {
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

} // InterventionActOperations
