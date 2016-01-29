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
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.SubstanceOrDeviceAllergyObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Substance Or Device Allergy Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Allergy Status Inversion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationReactionInversionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Reaction Inversion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationSeverityInversionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Severity Inversion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationEntryRelationship912(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Entry Relationship912</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationEntryRelationship914(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Entry Relationship914</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationEntryRelationship916(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Entry Relationship916</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity CE Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity CE Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Original Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFI(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Code Terminology Value Set Group SRFI</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationAllergyStatusObservationEntryRelationshipAllergyStatusObservation913(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Allergy Status Observation Entry Relationship Allergy Status Observation913</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationReactionObservationEntryRelationshipReactionObservation915(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Reaction Observation Entry Relationship Reaction Observation915</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationSeverityObservationEntryRelationshipSeverityObservation917(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Severity Observation Entry Relationship Severity Observation917</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SubstanceOrDeviceAllergyObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicatorTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ALLERGY_STATUS_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicatorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationReactionInversionIndicator() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationReactionInversionIndicatorTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationReactionInversionIndicator",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationReactionInversionIndicator(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationReactionInversionIndicatorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationSeverityInversionIndicator() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationSeverityInversionIndicatorTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationSeverityInversionIndicator",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationSeverityInversionIndicator(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationSeverityInversionIndicatorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationTemplateId() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationTemplateIdTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationTemplateId(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationClassCode() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationClassCodeTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationClassCode(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationMoodCode() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationMoodCodeTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationMoodCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationMoodCode(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationId() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationIdTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationId", operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationId(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationCodeP() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationCodePTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationCodeP(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationCode() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationCodeTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected void setDependency(SubstanceOrDeviceAllergyObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationCode(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationStatusCode() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationStatusCodeTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationStatusCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationStatusCode(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationStatusCodeP() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationStatusCodePTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationStatusCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationStatusCodeP(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationEffectiveTime() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationEffectiveTimeTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationEffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationEffectiveTime(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationValue() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationValueTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationValue(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationValueP() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationValuePTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationValueP",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationValueP(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationParticipant() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationParticipantTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationParticipant",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipant(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSubstanceOrDeviceAllergyObservationEntryRelationship912() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationEntryRelationship912TestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationEntryRelationship912",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ENTRY_RELATIONSHIP912__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationEntryRelationship912(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationEntryRelationship912TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSubstanceOrDeviceAllergyObservationEntryRelationship914() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationEntryRelationship914TestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationEntryRelationship914",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ENTRY_RELATIONSHIP914__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationEntryRelationship914(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationEntryRelationship914TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSubstanceOrDeviceAllergyObservationEntryRelationship916() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationEntryRelationship916TestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationEntryRelationship916",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ENTRY_RELATIONSHIP916__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationEntryRelationship916(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationEntryRelationship916TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalTextTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslationTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValueTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValueTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFI() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFITestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFI",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE_TERMINOLOGY_VALUE_SET_GROUP_SRFI__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFI(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFITestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityClassCode() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityClassCodeTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityClassCode(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationParticipantParticipantRoleClassCode() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationParticipantParticipantRoleClassCodeTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationParticipantParticipantRoleClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRoleClassCode(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationParticipantParticipantRoleClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationParticipantTypeCode() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationParticipantTypeCodeTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationParticipantTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantTypeCode(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationParticipantTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationParticipantParticipantRole() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationParticipantParticipantRoleTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationParticipantParticipantRole",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRole(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationParticipantParticipantRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSubstanceOrDeviceAllergyObservationAllergyStatusObservationEntryRelationshipAllergyStatusObservation913() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationAllergyStatusObservationEntryRelationshipAllergyStatusObservation913TestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationAllergyStatusObservationEntryRelationshipAllergyStatusObservation913",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ALLERGY_STATUS_OBSERVATION_ENTRY_RELATIONSHIP_ALLERGY_STATUS_OBSERVATION913__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationAllergyStatusObservationEntryRelationshipAllergyStatusObservation913(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationAllergyStatusObservationEntryRelationshipAllergyStatusObservation913TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSubstanceOrDeviceAllergyObservationReactionObservationEntryRelationshipReactionObservation915() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationReactionObservationEntryRelationshipReactionObservation915TestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationReactionObservationEntryRelationshipReactionObservation915",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_OBSERVATION_ENTRY_RELATIONSHIP_REACTION_OBSERVATION915__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationReactionObservationEntryRelationshipReactionObservation915(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationReactionObservationEntryRelationshipReactionObservation915TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSubstanceOrDeviceAllergyObservationSeverityObservationEntryRelationshipSeverityObservation917() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationSeverityObservationEntryRelationshipSeverityObservation917TestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationSeverityObservationEntryRelationshipSeverityObservation917",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_OBSERVATION_ENTRY_RELATIONSHIP_SEVERITY_OBSERVATION917__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationSeverityObservationEntryRelationshipSeverityObservation917(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationSeverityObservationEntryRelationshipSeverityObservation917TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SubstanceOrDeviceAllergyObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SubstanceOrDeviceAllergyObservation> {
		@Override
		public SubstanceOrDeviceAllergyObservation create() {
			return ConsolFactory.eINSTANCE.createSubstanceOrDeviceAllergyObservation();
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
	private static class ConstructorTestClass extends SubstanceOrDeviceAllergyObservationOperations {
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

} // SubstanceOrDeviceAllergyObservationOperations
