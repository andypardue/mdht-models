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
import org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlannedInterventionActOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planned Intervention Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActMoodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Mood Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1548(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1548</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1550(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1550</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1552(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1552</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1554(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1554</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1556(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1556</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1558(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1558</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1560(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1560</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1562(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1562</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1564(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1564</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1566(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1566</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1568(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1568</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1570(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1570</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1572(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1572</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1574(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1574</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1576(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1576</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1578(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1578</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1580(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1580</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1582(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1582</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1584(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1584</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1586(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1586</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryRelationship1588(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Relationship1588</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActReferenceTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Reference Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActReferenceExternalDocumentReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Reference External Document Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation21549(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Advance Directive Observation2 Entry Relationship Advance Directive Observation21549</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity21551(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Immunization Activity2 Entry Relationship Immunization Activity21551</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActMedicationActivity2EntryRelationshipMedicationActivity21553(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Medication Activity2 Entry Relationship Medication Activity21553</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct21555(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Procedure Activity Act2 Entry Relationship Procedure Activity Act21555</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActInterventionActEntryRelationshipInterventionAct1557(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Intervention Act Entry Relationship Intervention Act1557</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation21559(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Procedure Activity Observation2 Entry Relationship Procedure Activity Observation21559</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure21561(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Procedure Activity Procedure2 Entry Relationship Procedure Activity Procedure21561</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEncounterActivity2EntryRelationshipEncounterActivity21563(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Encounter Activity2 Entry Relationship Encounter Activity21563</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActInstruction2EntryRelationshipInstruction21565(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Instruction2 Entry Relationship Instruction21565</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity21567(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Non Medicinal Supply Activity2 Entry Relationship Non Medicinal Supply Activity21567</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActPlannedAct2EntryRelationshipPlannedAct21569(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Act2 Entry Relationship Planned Act21569</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActPlannedEncounter2EntryRelationshipPlannedEncounter21571(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Encounter2 Entry Relationship Planned Encounter21571</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActPlannedObservation2EntryRelationshipPlannedObservation21573(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Observation2 Entry Relationship Planned Observation21573</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActPlannedProcedure2EntryRelationshipPlannedProcedure21575(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Procedure2 Entry Relationship Planned Procedure21575</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity21577(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Medication Activity2 Entry Relationship Planned Medication Activity21577</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActPlannedSupply2EntryRelationshipPlannedSupply21579(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Supply2 Entry Relationship Planned Supply21579</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation1581(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Nutrition Recommendation Entry Relationship Nutrition Recommendation1581</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceDocInstance1583(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Reference Entry Relationship Entry Reference Doc Instance1583</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceGoalObs1585(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Reference Entry Relationship Entry Reference Goal Obs1585</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants1587(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Handoff Communication Participants Entry Relationship Handoff Communication Participants1587</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActPlannedImmunizationActivityEntryRelationshipPlannedImmunizationActivity1589(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Immunization Activity Entry Relationship Planned Immunization Activity1589</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlannedInterventionActTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedInterventionActTemplateId() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActTemplateIdTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActTemplateId(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedInterventionActClassCode() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActClassCodeTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActClassCode(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedInterventionActMoodCodeP() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActMoodCodePTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActMoodCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActMoodCodeP(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActMoodCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedInterventionActMoodCode() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActMoodCodeTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_INTERVENTION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected void setDependency(PlannedInterventionAct target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionActMoodCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActMoodCode(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedInterventionActId() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActIdTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActId",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_INTERVENTION_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActId(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedInterventionActCodeP() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActCodePTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_INTERVENTION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActCodeP(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedInterventionActCode() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActCodeTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_INTERVENTION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected void setDependency(PlannedInterventionAct target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionActCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActCode(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedInterventionActStatusCode() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActStatusCodeTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActStatusCode", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActStatusCode(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedInterventionActStatusCodeP() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActStatusCodePTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActStatusCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActStatusCodeP(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedInterventionActEffectiveTime() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActEffectiveTimeTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActEffectiveTime", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActEffectiveTime(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedInterventionActAuthorParticipation() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActAuthorParticipationTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActAuthorParticipation",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActAuthorParticipation(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActAuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedInterventionActReference() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActReferenceTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActReference",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActReference(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActEntryRelationship1548() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActEntryRelationship1548TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActEntryRelationship1548",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1548__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1548(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActEntryRelationship1548TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActEntryRelationship1550() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActEntryRelationship1550TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActEntryRelationship1550",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1550__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1550(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActEntryRelationship1550TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActEntryRelationship1552() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActEntryRelationship1552TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActEntryRelationship1552",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1552__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1552(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActEntryRelationship1552TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActEntryRelationship1554() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActEntryRelationship1554TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActEntryRelationship1554",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1554__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1554(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActEntryRelationship1554TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActEntryRelationship1556() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActEntryRelationship1556TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActEntryRelationship1556",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1556__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1556(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActEntryRelationship1556TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActEntryRelationship1558() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActEntryRelationship1558TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActEntryRelationship1558",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1558__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1558(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActEntryRelationship1558TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActEntryRelationship1560() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActEntryRelationship1560TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActEntryRelationship1560",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1560__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1560(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActEntryRelationship1560TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActEntryRelationship1562() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActEntryRelationship1562TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActEntryRelationship1562",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1562__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1562(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActEntryRelationship1562TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActEntryRelationship1564() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActEntryRelationship1564TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActEntryRelationship1564",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1564__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1564(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActEntryRelationship1564TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActEntryRelationship1566() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActEntryRelationship1566TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActEntryRelationship1566",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1566__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1566(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActEntryRelationship1566TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActEntryRelationship1568() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActEntryRelationship1568TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActEntryRelationship1568",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1568__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1568(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActEntryRelationship1568TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActEntryRelationship1570() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActEntryRelationship1570TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActEntryRelationship1570",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1570__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1570(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActEntryRelationship1570TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActEntryRelationship1572() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActEntryRelationship1572TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActEntryRelationship1572",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1572__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1572(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActEntryRelationship1572TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActEntryRelationship1574() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActEntryRelationship1574TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActEntryRelationship1574",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1574__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1574(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActEntryRelationship1574TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActEntryRelationship1576() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActEntryRelationship1576TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActEntryRelationship1576",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1576__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1576(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActEntryRelationship1576TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActEntryRelationship1578() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActEntryRelationship1578TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActEntryRelationship1578",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1578__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1578(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActEntryRelationship1578TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActEntryRelationship1580() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActEntryRelationship1580TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActEntryRelationship1580",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1580__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1580(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActEntryRelationship1580TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActEntryRelationship1582() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActEntryRelationship1582TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActEntryRelationship1582",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1582__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1582(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActEntryRelationship1582TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActEntryRelationship1584() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActEntryRelationship1584TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActEntryRelationship1584",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1584__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1584(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActEntryRelationship1584TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActEntryRelationship1586() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActEntryRelationship1586TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActEntryRelationship1586",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1586__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1586(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActEntryRelationship1586TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActEntryRelationship1588() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActEntryRelationship1588TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActEntryRelationship1588",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_RELATIONSHIP1588__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActEntryRelationship1588(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActEntryRelationship1588TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedInterventionActReferenceTypeCode() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActReferenceTypeCodeTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActReferenceTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActReferenceTypeCode(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActReferenceTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedInterventionActReferenceExternalDocumentReference() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActReferenceExternalDocumentReferenceTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActReferenceExternalDocumentReference",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActReferenceExternalDocumentReference(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActReferenceExternalDocumentReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation21549() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation21549TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation21549",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_ADVANCE_DIRECTIVE_OBSERVATION2_ENTRY_RELATIONSHIP_ADVANCE_DIRECTIVE_OBSERVATION21549__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation21549(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActAdvanceDirectiveObservation2EntryRelationshipAdvanceDirectiveObservation21549TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity21551() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity21551TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity21551",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_IMMUNIZATION_ACTIVITY2_ENTRY_RELATIONSHIP_IMMUNIZATION_ACTIVITY21551__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity21551(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActImmunizationActivity2EntryRelationshipImmunizationActivity21551TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActMedicationActivity2EntryRelationshipMedicationActivity21553() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActMedicationActivity2EntryRelationshipMedicationActivity21553TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActMedicationActivity2EntryRelationshipMedicationActivity21553",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_MEDICATION_ACTIVITY21553__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActMedicationActivity2EntryRelationshipMedicationActivity21553(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActMedicationActivity2EntryRelationshipMedicationActivity21553TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct21555() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct21555TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct21555",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_ACT2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_ACT21555__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct21555(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActProcedureActivityAct2EntryRelationshipProcedureActivityAct21555TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActInterventionActEntryRelationshipInterventionAct1557() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActInterventionActEntryRelationshipInterventionAct1557TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActInterventionActEntryRelationshipInterventionAct1557",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_INTERVENTION_ACT_ENTRY_RELATIONSHIP_INTERVENTION_ACT1557__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActInterventionActEntryRelationshipInterventionAct1557(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActInterventionActEntryRelationshipInterventionAct1557TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation21559() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation21559TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation21559",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_OBSERVATION2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_OBSERVATION21559__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation21559(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActProcedureActivityObservation2EntryRelationshipProcedureActivityObservation21559TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure21561() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure21561TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure21561",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_PROCEDURE2_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_PROCEDURE21561__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure21561(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActProcedureActivityProcedure2EntryRelationshipProcedureActivityProcedure21561TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActEncounterActivity2EntryRelationshipEncounterActivity21563() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActEncounterActivity2EntryRelationshipEncounterActivity21563TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActEncounterActivity2EntryRelationshipEncounterActivity21563",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_ENCOUNTER_ACTIVITY2_ENTRY_RELATIONSHIP_ENCOUNTER_ACTIVITY21563__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActEncounterActivity2EntryRelationshipEncounterActivity21563(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActEncounterActivity2EntryRelationshipEncounterActivity21563TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActInstruction2EntryRelationshipInstruction21565() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActInstruction2EntryRelationshipInstruction21565TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActInstruction2EntryRelationshipInstruction21565",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION21565__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActInstruction2EntryRelationshipInstruction21565(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActInstruction2EntryRelationshipInstruction21565TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity21567() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity21567TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity21567",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_NON_MEDICINAL_SUPPLY_ACTIVITY2_ENTRY_RELATIONSHIP_NON_MEDICINAL_SUPPLY_ACTIVITY21567__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity21567(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActNonMedicinalSupplyActivity2EntryRelationshipNonMedicinalSupplyActivity21567TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActPlannedAct2EntryRelationshipPlannedAct21569() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActPlannedAct2EntryRelationshipPlannedAct21569TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActPlannedAct2EntryRelationshipPlannedAct21569",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_ACT2_ENTRY_RELATIONSHIP_PLANNED_ACT21569__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActPlannedAct2EntryRelationshipPlannedAct21569(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActPlannedAct2EntryRelationshipPlannedAct21569TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActPlannedEncounter2EntryRelationshipPlannedEncounter21571() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActPlannedEncounter2EntryRelationshipPlannedEncounter21571TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActPlannedEncounter2EntryRelationshipPlannedEncounter21571",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_ENCOUNTER2_ENTRY_RELATIONSHIP_PLANNED_ENCOUNTER21571__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActPlannedEncounter2EntryRelationshipPlannedEncounter21571(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActPlannedEncounter2EntryRelationshipPlannedEncounter21571TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActPlannedObservation2EntryRelationshipPlannedObservation21573() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActPlannedObservation2EntryRelationshipPlannedObservation21573TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActPlannedObservation2EntryRelationshipPlannedObservation21573",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_OBSERVATION2_ENTRY_RELATIONSHIP_PLANNED_OBSERVATION21573__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActPlannedObservation2EntryRelationshipPlannedObservation21573(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActPlannedObservation2EntryRelationshipPlannedObservation21573TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActPlannedProcedure2EntryRelationshipPlannedProcedure21575() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActPlannedProcedure2EntryRelationshipPlannedProcedure21575TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActPlannedProcedure2EntryRelationshipPlannedProcedure21575",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_PROCEDURE2_ENTRY_RELATIONSHIP_PLANNED_PROCEDURE21575__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActPlannedProcedure2EntryRelationshipPlannedProcedure21575(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActPlannedProcedure2EntryRelationshipPlannedProcedure21575TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity21577() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity21577TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity21577",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_PLANNED_MEDICATION_ACTIVITY21577__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity21577(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity21577TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActPlannedSupply2EntryRelationshipPlannedSupply21579() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActPlannedSupply2EntryRelationshipPlannedSupply21579TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActPlannedSupply2EntryRelationshipPlannedSupply21579",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP_PLANNED_SUPPLY21579__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActPlannedSupply2EntryRelationshipPlannedSupply21579(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActPlannedSupply2EntryRelationshipPlannedSupply21579TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation1581() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation1581TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation1581",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP_NUTRITION_RECOMMENDATION1581__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation1581(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActNutritionRecommendationEntryRelationshipNutritionRecommendation1581TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceDocInstance1583() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceDocInstance1583TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceDocInstance1583",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_DOC_INSTANCE1583__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceDocInstance1583(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceDocInstance1583TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceGoalObs1585() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceGoalObs1585TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceGoalObs1585",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_REFERENCE_ENTRY_RELATIONSHIP_ENTRY_REFERENCE_GOAL_OBS1585__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceGoalObs1585(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActEntryReferenceEntryRelationshipEntryReferenceGoalObs1585TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants1587() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants1587TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants1587",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_HANDOFF_COMMUNICATION_PARTICIPANTS_ENTRY_RELATIONSHIP_HANDOFF_COMMUNICATION_PARTICIPANTS1587__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants1587(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActHandoffCommunicationParticipantsEntryRelationshipHandoffCommunicationParticipants1587TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedInterventionActPlannedImmunizationActivityEntryRelationshipPlannedImmunizationActivity1589() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActPlannedImmunizationActivityEntryRelationshipPlannedImmunizationActivity1589TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActPlannedImmunizationActivityEntryRelationshipPlannedImmunizationActivity1589",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_IMMUNIZATION_ACTIVITY_ENTRY_RELATIONSHIP_PLANNED_IMMUNIZATION_ACTIVITY1589__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActPlannedImmunizationActivityEntryRelationshipPlannedImmunizationActivity1589(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActPlannedImmunizationActivityEntryRelationshipPlannedImmunizationActivity1589TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PlannedInterventionActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PlannedInterventionAct> {
		public PlannedInterventionAct create() {
			return ConsolFactory.eINSTANCE.createPlannedInterventionAct();
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
	private static class ConstructorTestClass extends PlannedInterventionActOperations {
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

} // PlannedInterventionActOperations
