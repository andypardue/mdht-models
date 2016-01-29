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
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AdvanceDirectiveObservation2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directive Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2CDTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 CD Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2CDTranslationP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 CD Translation P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2IVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2IVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Verifier Participant Role Playing Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Verifier Participant Role Playing Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Verifier Participant Role Playing Entity Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2VerifierParticipantRoleCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Verifier Participant Role Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2VerifierParticipantRoleCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Verifier Participant Role Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2VerifierParticipantRoleAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Verifier Participant Role Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Verifier Participant Role Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2VerifierTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Verifier Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Custodian Custodian Role Custodian Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Custodian Custodian Role Custodian Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2CustodianCustodianRoleCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Custodian Custodian Role Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2CustodianCustodianRoleCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Custodian Custodian Role Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2ReferenceAdvanceDirectiveObservationReferenceExternalDocumentTextMediaType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Reference Advance Directive Observation Reference External Document Text Media Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2ReferenceAdvanceDirectiveObservationReferenceExternalDocumentTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Reference Advance Directive Observation Reference External Document Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceExternalDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Advance Directive Observation Reference External Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationHasStartingTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Has Starting Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationHasEndingTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Has Ending Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationVerifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationVerifierTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationVerifierParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier Participant Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian Custodian Role Custodian Entity Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationCustodianCustodianRoleAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian Custodian Role Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationCustodianCustodianRoleTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian Custodian Role Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationCustodianCustodianRolePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian Custodian Role Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian Advance Directive Observation Custodian Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationReferenceExternalDocumentId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Reference External Document Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationReferenceExternalDocumentText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Reference External Document Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationReferenceTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Reference Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdvanceDirectiveObservation2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2Value() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2ValueTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2Value", operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2Value(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2ValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2AuthorParticipation() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2AuthorParticipationTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2AuthorParticipation",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2AuthorParticipation(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2CDTranslation() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2CDTranslationTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2CDTranslation",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2CDTranslation(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2CDTranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2CDTranslationP() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2CDTranslationPTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2CDTranslationP",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CD_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2CDTranslationP(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2CDTranslationPTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2IVLTSLow() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2IVLTSLowTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2IVLTSLow", operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2IVLTSLow(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2IVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2IVLTSHigh() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2IVLTSHighTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2IVLTSHigh", operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2IVLTSHigh(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2IVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCodeP() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCodePTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCodeP(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCode() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCode(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityName() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityNameTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityName",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityName(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2VerifierParticipantRoleCodeP() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2VerifierParticipantRoleCodePTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2VerifierParticipantRoleCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2VerifierParticipantRoleCodeP(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2VerifierParticipantRoleCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2VerifierParticipantRoleCode() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2VerifierParticipantRoleCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2VerifierParticipantRoleCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2VerifierParticipantRoleCode(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2VerifierParticipantRoleCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2VerifierParticipantRoleAddr() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2VerifierParticipantRoleAddrTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2VerifierParticipantRoleAddr",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2VerifierParticipantRoleAddr(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2VerifierParticipantRoleAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntity() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntity(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2VerifierTemplateId() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2VerifierTemplateIdTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2VerifierTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2VerifierTemplateId(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2VerifierTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodeP() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodePTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CUSTODIAN_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodeP(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCode() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CUSTODIAN_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCode(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2CustodianCustodianRoleCodeP() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2CustodianCustodianRoleCodePTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2CustodianCustodianRoleCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2CustodianCustodianRoleCodeP(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2CustodianCustodianRoleCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2CustodianCustodianRoleCode() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2CustodianCustodianRoleCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2CustodianCustodianRoleCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2CustodianCustodianRoleCode(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2CustodianCustodianRoleCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2ReferenceAdvanceDirectiveObservationReferenceExternalDocumentTextMediaType() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2ReferenceAdvanceDirectiveObservationReferenceExternalDocumentTextMediaTypeTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2ReferenceAdvanceDirectiveObservationReferenceExternalDocumentTextMediaType",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_REFERENCE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2ReferenceAdvanceDirectiveObservationReferenceExternalDocumentTextMediaType(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2ReferenceAdvanceDirectiveObservationReferenceExternalDocumentTextMediaTypeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2ReferenceAdvanceDirectiveObservationReferenceExternalDocumentTextReference() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2ReferenceAdvanceDirectiveObservationReferenceExternalDocumentTextReferenceTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2ReferenceAdvanceDirectiveObservationReferenceExternalDocumentTextReference",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_REFERENCE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2ReferenceAdvanceDirectiveObservationReferenceExternalDocumentTextReference(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2ReferenceAdvanceDirectiveObservationReferenceExternalDocumentTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceExternalDocument() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceExternalDocumentTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceExternalDocument",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceExternalDocument(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceExternalDocumentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Test
	@Ignore
	public void testValidateAdvanceDirectiveObservationHasStartingTime() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservationHasStartingTimeTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservationHasStartingTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_STARTING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationHasStartingTime(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationHasStartingTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Test
	@Ignore
	public void testValidateAdvanceDirectiveObservationHasEndingTime() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservationHasEndingTimeTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservationHasEndingTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_ENDING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationHasEndingTime(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationHasEndingTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationTemplateId() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservationTemplateIdTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservationTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationTemplateId(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationCodeP() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservationCodePTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservationCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationCodeP(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationCode() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservationCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected void setDependency(AdvanceDirectiveObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationCode(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationEffectiveTime() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservationEffectiveTimeTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservationEffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationEffectiveTime(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationVerifier() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservationVerifierTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservationVerifier", operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationVerifier(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationVerifierTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationCustodian() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservationCustodianTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservationCustodian", operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationCustodian(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationCustodianTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationReference() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservationReferenceTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservationReference", operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationReference(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationVerifierTime() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservationVerifierTimeTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservationVerifierTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationVerifierTime(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationVerifierTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationVerifierParticipantRole() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservationVerifierParticipantRoleTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservationVerifierParticipantRole",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationVerifierParticipantRole(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationVerifierParticipantRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityNameTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_CUSTODIAN_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationCustodianCustodianRoleAddr() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservationCustodianCustodianRoleAddrTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservationCustodianCustodianRoleAddr",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationCustodianCustodianRoleAddr(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationCustodianCustodianRoleAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationCustodianCustodianRoleTelecom() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservationCustodianCustodianRoleTelecomTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservationCustodianCustodianRoleTelecom",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationCustodianCustodianRoleTelecom(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationCustodianCustodianRoleTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationCustodianCustodianRolePlayingEntity() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservationCustodianCustodianRolePlayingEntityTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservationCustodianCustodianRolePlayingEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationCustodianCustodianRolePlayingEntity(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationCustodianCustodianRolePlayingEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleTestCase.doValidationTest();
	}

	// /**
	// *
	// * @generated
	// */
	// @Test
	// public void testValidateAdvanceDirectiveObservationReferenceExternalDocumentTextMediaType() {
	// OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservationReferenceExternalDocumentTextMediaTypeTestCase = new
	// OperationsTestCase<AdvanceDirectiveObservation2>(
	// "validateAdvanceDirectiveObservationReferenceExternalDocumentTextMediaType",
	// operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(AdvanceDirectiveObservation2 target) {
	// target.init();
	// Reference ref = CDAFactory.eINSTANCE.createReference();
	// ExternalDocument ed = CDAFactory.eINSTANCE.createExternalDocument();
	// ED text = DatatypesFactory.eINSTANCE.createED();
	// text.setMediaType(null);
	// ed.setText(text);
	//
	// ref.setExternalDocument(ed);
	// target.getReferences().add(ref);
	// }
	//
	// @Override
	// protected void updateToPass(AdvanceDirectiveObservation2 target) {
	// target.getReferences().clear();
	//
	// Reference ref = CDAFactory.eINSTANCE.createReference();
	// ExternalDocument ed = CDAFactory.eINSTANCE.createExternalDocument();
	// ED text = DatatypesFactory.eINSTANCE.createED();
	// text.setMediaType("JPEG");
	// ed.setText(text);
	// ref.setExternalDocument(ed);
	// target.getReferences().add(ref);
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationReferenceExternalDocumentTextMediaType(
	// (AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateAdvanceDirectiveObservationReferenceExternalDocumentTextMediaTypeTestCase.doValidationTest();
	// }

	// /**
	// *
	// * @generated
	// */
	// @Test
	// public void testValidateAdvanceDirectiveObservationReferenceExternalDocumentTextReference() {
	// OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservationReferenceExternalDocumentTextReferenceTestCase = new
	// OperationsTestCase<AdvanceDirectiveObservation2>(
	// "validateAdvanceDirectiveObservationReferenceExternalDocumentTextReference",
	// operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(AdvanceDirectiveObservation2 target) {
	// target.init();
	// Reference ref = CDAFactory.eINSTANCE.createReference();
	// ExternalDocument ed = CDAFactory.eINSTANCE.createExternalDocument();
	// ed.setText(DatatypesFactory.eINSTANCE.createED());
	// ref.setExternalDocument(ed);
	// target.getReferences().add(ref);
	// }
	//
	// @Override
	// protected void updateToPass(AdvanceDirectiveObservation2 target) {
	// target.getReferences().clear();
	//
	// Reference ref = CDAFactory.eINSTANCE.createReference();
	// ExternalDocument ed = CDAFactory.eINSTANCE.createExternalDocument();
	// ED text = DatatypesFactory.eINSTANCE.createED();
	// text.setReference(DatatypesFactory.eINSTANCE.createTEL());
	// ed.setText(text);
	// ref.setExternalDocument(ed);
	// target.getReferences().add(ref);
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationReferenceExternalDocumentTextReference(
	// (AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateAdvanceDirectiveObservationReferenceExternalDocumentTextReferenceTestCase.doValidationTest();
	// }

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationReferenceExternalDocumentId() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservationReferenceExternalDocumentIdTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservationReferenceExternalDocumentId",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationReferenceExternalDocumentId(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationReferenceExternalDocumentIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationReferenceExternalDocumentText() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservationReferenceExternalDocumentTextTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservationReferenceExternalDocumentText",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationReferenceExternalDocumentText(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationReferenceExternalDocumentTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationReferenceTypeCode() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservationReferenceTypeCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservationReferenceTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationReferenceTypeCode(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationReferenceTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdvanceDirectiveObservation2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<AdvanceDirectiveObservation2> {
		@Override
		public AdvanceDirectiveObservation2 create() {
			return ConsolFactory.eINSTANCE.createAdvanceDirectiveObservation2();
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
	private static class ConstructorTestClass extends AdvanceDirectiveObservation2Operations {
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

} // AdvanceDirectiveObservation2Operations
