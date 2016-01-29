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
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationActivity2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Activity2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2SubstanceAdministeredActInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Substance Administered Act Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2SubstanceAdministeredActSequenceNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Substance Administered Act Sequence Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2EffectiveTimeIVLTSLowXorValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Effective Time IVLTS Low Xor Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2EntryRelationship936(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Entry Relationship936</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2EntryRelationship938(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Entry Relationship938</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2EntryRelationship940(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Entry Relationship940</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2EntryRelationship942(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Entry Relationship942</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2EntryRelationship944(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Entry Relationship944</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2EntryRelationship946(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Entry Relationship946</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2EntryRelationship948(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Entry Relationship948</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2EntryRelationship950(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Entry Relationship950</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2Indication2EntryRelationshipIndication2937(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Indication2 Entry Relationship Indication2937</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2Instruction2EntryRelationshipInstruction2939(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Instruction2 Entry Relationship Instruction2939</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2MedicationSupplyOrder2EntryRelationshipMedicationSupplyOrder2941(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Medication Supply Order2 Entry Relationship Medication Supply Order2941</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2MedicationDispense2EntryRelationshipMedicationDispense2943(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Medication Dispense2 Entry Relationship Medication Dispense2943</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2ReactionObservation2EntryRelationshipReactionObservation2945(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Reaction Observation2 Entry Relationship Reaction Observation2945</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2DrugMonitoringActEntryRelationshipDrugMonitoringAct947(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Drug Monitoring Act Entry Relationship Drug Monitoring Act947</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2SubstanceAdministeredActEntryRelationshipSubstanceAdministeredAct949(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Substance Administered Act Entry Relationship Substance Administered Act949</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivity2MedicationFreeTextSigEntryRelationshipMedicationFreeTextSig951(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity2 Medication Free Text Sig Entry Relationship Medication Free Text Sig951</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityInstructionsInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Instructions Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityDoseQuantityorrateQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Dose Quantityorrate Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityEffectiveTimeIVLTSorTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time IVLT Sor TS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityEffectiveTimeIVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityEffectiveTimeIVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityEffectiveTimePIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time PIVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityRouteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Route Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityAdministrationUnitCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Administration Unit Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityAdministrationUnitCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Administration Unit Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityConsumable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Consumable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityPrecondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Precondition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityPreconditionTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Precondition Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityPreconditionPreconditionForSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Precondition Precondition For Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2#validateMedicationActivityConsumableMedicationInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Consumable Medication Information</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationActivity2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationActivity2SubstanceAdministeredActInversionInd() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivity2SubstanceAdministeredActInversionIndTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivity2SubstanceAdministeredActInversionInd",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivity2SubstanceAdministeredActInversionInd(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivity2SubstanceAdministeredActInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationActivity2SubstanceAdministeredActSequenceNumber() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivity2SubstanceAdministeredActSequenceNumberTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivity2SubstanceAdministeredActSequenceNumber",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivity2SubstanceAdministeredActSequenceNumber(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivity2SubstanceAdministeredActSequenceNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationActivity2EffectiveTimeIVLTSLowXorValue() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivity2EffectiveTimeIVLTSLowXorValueTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivity2EffectiveTimeIVLTSLowXorValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_ACTIVITY2_EFFECTIVE_TIME_IVLTS_LOW_XOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

				// CD value = DatatypesFactory.eINSTANCE.createCD();
				// target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivity2EffectiveTimeIVLTSLowXorValue(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivity2EffectiveTimeIVLTSLowXorValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationActivityStatusCodeP() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityStatusCodePTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityStatusCodeP(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationActivityAdministrationUnitCodeP() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityAdministrationUnitCodePTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityAdministrationUnitCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityAdministrationUnitCodeP(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityAdministrationUnitCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationActivity2AuthorParticipation() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivity2AuthorParticipationTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivity2AuthorParticipation", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_ACTIVITY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivity2AuthorParticipation(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivity2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMedicationActivity2EntryRelationship936() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivity2EntryRelationship936TestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivity2EntryRelationship936", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP936__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivity2EntryRelationship936(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivity2EntryRelationship936TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMedicationActivity2EntryRelationship938() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivity2EntryRelationship938TestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivity2EntryRelationship938", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP938__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivity2EntryRelationship938(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivity2EntryRelationship938TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMedicationActivity2EntryRelationship940() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivity2EntryRelationship940TestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivity2EntryRelationship940", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP940__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivity2EntryRelationship940(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivity2EntryRelationship940TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMedicationActivity2EntryRelationship942() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivity2EntryRelationship942TestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivity2EntryRelationship942", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP942__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivity2EntryRelationship942(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivity2EntryRelationship942TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMedicationActivity2EntryRelationship944() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivity2EntryRelationship944TestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivity2EntryRelationship944", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP944__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivity2EntryRelationship944(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivity2EntryRelationship944TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMedicationActivity2EntryRelationship946() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivity2EntryRelationship946TestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivity2EntryRelationship946", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP946__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivity2EntryRelationship946(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivity2EntryRelationship946TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMedicationActivity2EntryRelationship948() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivity2EntryRelationship948TestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivity2EntryRelationship948", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP948__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivity2EntryRelationship948(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivity2EntryRelationship948TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMedicationActivity2EntryRelationship950() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivity2EntryRelationship950TestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivity2EntryRelationship950", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP950__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivity2EntryRelationship950(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivity2EntryRelationship950TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMedicationActivity2Indication2EntryRelationshipIndication2937() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivity2Indication2EntryRelationshipIndication2937TestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivity2Indication2EntryRelationshipIndication2937",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_ACTIVITY2_INDICATION2_ENTRY_RELATIONSHIP_INDICATION2937__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivity2Indication2EntryRelationshipIndication2937(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivity2Indication2EntryRelationshipIndication2937TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMedicationActivity2Instruction2EntryRelationshipInstruction2939() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivity2Instruction2EntryRelationshipInstruction2939TestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivity2Instruction2EntryRelationshipInstruction2939",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_ACTIVITY2_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION2939__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivity2Instruction2EntryRelationshipInstruction2939(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivity2Instruction2EntryRelationshipInstruction2939TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMedicationActivity2MedicationSupplyOrder2EntryRelationshipMedicationSupplyOrder2941() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivity2MedicationSupplyOrder2EntryRelationshipMedicationSupplyOrder2941TestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivity2MedicationSupplyOrder2EntryRelationshipMedicationSupplyOrder2941",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_ACTIVITY2_MEDICATION_SUPPLY_ORDER2_ENTRY_RELATIONSHIP_MEDICATION_SUPPLY_ORDER2941__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivity2MedicationSupplyOrder2EntryRelationshipMedicationSupplyOrder2941(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivity2MedicationSupplyOrder2EntryRelationshipMedicationSupplyOrder2941TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMedicationActivity2MedicationDispense2EntryRelationshipMedicationDispense2943() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivity2MedicationDispense2EntryRelationshipMedicationDispense2943TestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivity2MedicationDispense2EntryRelationshipMedicationDispense2943",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_ACTIVITY2_MEDICATION_DISPENSE2_ENTRY_RELATIONSHIP_MEDICATION_DISPENSE2943__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivity2MedicationDispense2EntryRelationshipMedicationDispense2943(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivity2MedicationDispense2EntryRelationshipMedicationDispense2943TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMedicationActivity2ReactionObservation2EntryRelationshipReactionObservation2945() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivity2ReactionObservation2EntryRelationshipReactionObservation2945TestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivity2ReactionObservation2EntryRelationshipReactionObservation2945",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_ACTIVITY2_REACTION_OBSERVATION2_ENTRY_RELATIONSHIP_REACTION_OBSERVATION2945__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivity2ReactionObservation2EntryRelationshipReactionObservation2945(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivity2ReactionObservation2EntryRelationshipReactionObservation2945TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMedicationActivity2DrugMonitoringActEntryRelationshipDrugMonitoringAct947() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivity2DrugMonitoringActEntryRelationshipDrugMonitoringAct947TestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivity2DrugMonitoringActEntryRelationshipDrugMonitoringAct947",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_ACTIVITY2_DRUG_MONITORING_ACT_ENTRY_RELATIONSHIP_DRUG_MONITORING_ACT947__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivity2DrugMonitoringActEntryRelationshipDrugMonitoringAct947(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivity2DrugMonitoringActEntryRelationshipDrugMonitoringAct947TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMedicationActivity2SubstanceAdministeredActEntryRelationshipSubstanceAdministeredAct949() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivity2SubstanceAdministeredActEntryRelationshipSubstanceAdministeredAct949TestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivity2SubstanceAdministeredActEntryRelationshipSubstanceAdministeredAct949",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_ACTIVITY2_SUBSTANCE_ADMINISTERED_ACT_ENTRY_RELATIONSHIP_SUBSTANCE_ADMINISTERED_ACT949__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivity2SubstanceAdministeredActEntryRelationshipSubstanceAdministeredAct949(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivity2SubstanceAdministeredActEntryRelationshipSubstanceAdministeredAct949TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMedicationActivity2MedicationFreeTextSigEntryRelationshipMedicationFreeTextSig951() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivity2MedicationFreeTextSigEntryRelationshipMedicationFreeTextSig951TestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivity2MedicationFreeTextSigEntryRelationshipMedicationFreeTextSig951",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_ACTIVITY2_MEDICATION_FREE_TEXT_SIG_ENTRY_RELATIONSHIP_MEDICATION_FREE_TEXT_SIG951__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivity2MedicationFreeTextSigEntryRelationshipMedicationFreeTextSig951(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivity2MedicationFreeTextSigEntryRelationshipMedicationFreeTextSig951TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Test
	@Ignore
	public void testValidateMedicationActivityTextReference() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityTextReferenceTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityTextReference",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityTextReference(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Test
	@Ignore
	public void testValidateMedicationActivityReferenceValue() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityReferenceValueTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityReferenceValue", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_ACTIVITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

				// CD value = DatatypesFactory.eINSTANCE.createCD();
				// target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityReferenceValue(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Test
	@Ignore
	public void testValidateMedicationActivityTextReferenceValue() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityTextReferenceValueTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityTextReferenceValue", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

				//
				// CD value = DatatypesFactory.eINSTANCE.createCD();
				// target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityTextReferenceValue(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationActivityInstructionsInversionInd() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityInstructionsInversionIndTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityInstructionsInversionInd",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityInstructionsInversionInd(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityInstructionsInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationActivityDoseQuantityorrateQuantity() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityDoseQuantityorrateQuantityTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityDoseQuantityorrateQuantity",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITYORRATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityDoseQuantityorrateQuantity(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityDoseQuantityorrateQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationActivityEffectiveTimeIVLTSorTS() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityEffectiveTimeIVLTSorTSTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityEffectiveTimeIVLTSorTS",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLT_SOR_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityEffectiveTimeIVLTSorTS(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityEffectiveTimeIVLTSorTSTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationActivityEffectiveTimeIVLTSLow() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityEffectiveTimeIVLTSLowTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityEffectiveTimeIVLTSLow",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityEffectiveTimeIVLTSLow(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityEffectiveTimeIVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationActivityEffectiveTimeIVLTSHigh() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityEffectiveTimeIVLTSHighTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityEffectiveTimeIVLTSHigh",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityEffectiveTimeIVLTSHigh(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityEffectiveTimeIVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationActivityEffectiveTimePIVLTS() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityEffectiveTimePIVLTSTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityEffectiveTimePIVLTS", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_PIVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityEffectiveTimePIVLTS(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityEffectiveTimePIVLTSTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationActivityTemplateId() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityTemplateIdTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityTemplateId(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationActivityRepeatNumber() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityRepeatNumberTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityRepeatNumber",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityRepeatNumber(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityRepeatNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationActivityRouteCodeP() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityRouteCodePTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityRouteCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityRouteCodeP(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityRouteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationActivityRouteCode() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityRouteCodeTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityRouteCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected void setDependency(MedicationActivity2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.MedicationActivityRouteCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityRouteCode(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityRouteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationActivityCode() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityCodeTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityCode(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationActivityStatusCode() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityStatusCodeTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(MedicationActivity2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.MedicationActivityStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityStatusCode(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationActivityAdministrationUnitCode() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityAdministrationUnitCodeTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityAdministrationUnitCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected void setDependency(MedicationActivity2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.MedicationActivityAdministrationUnitCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityAdministrationUnitCode(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityAdministrationUnitCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	* This attribute is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Test
	@Ignore
	public void testValidateMedicationActivityText() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityTextTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityText",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityText(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationActivityDoseQuantity() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityDoseQuantityTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityDoseQuantity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityDoseQuantity(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityDoseQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationActivityConsumable() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityConsumableTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityConsumable",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityConsumable(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityConsumableTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationActivityPrecondition() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityPreconditionTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityPrecondition",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityPrecondition(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityPreconditionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationActivityPreconditionTypeCode() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityPreconditionTypeCodeTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityPreconditionTypeCode", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityPreconditionTypeCode(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityPreconditionTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationActivityPreconditionPreconditionForSubstanceAdministration() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityPreconditionPreconditionForSubstanceAdministrationTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityPreconditionPreconditionForSubstanceAdministration",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityPreconditionPreconditionForSubstanceAdministration(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityPreconditionPreconditionForSubstanceAdministrationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationActivityConsumableMedicationInformation() {
		OperationsTestCase<MedicationActivity2> validateMedicationActivityConsumableMedicationInformationTestCase = new OperationsTestCase<MedicationActivity2>(
			"validateMedicationActivityConsumableMedicationInformation",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE_MEDICATION_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity2 target) {

			}

			@Override
			protected void updateToPass(MedicationActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivity2Operations.validateMedicationActivityConsumableMedicationInformation(
					(MedicationActivity2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityConsumableMedicationInformationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationActivity2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationActivity2> {
		@Override
		public MedicationActivity2 create() {
			return ConsolFactory.eINSTANCE.createMedicationActivity2();
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
	private static class ConstructorTestClass extends MedicationActivity2Operations {
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

} // MedicationActivity2Operations
