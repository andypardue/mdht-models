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
import org.junit.Ignore;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProblemObservation2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservationValueNullFlavorUnknown(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Value Null Flavor Unknown</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2EntryRelationship1006(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 Entry Relationship1006</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2EntryRelationship1008(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 Entry Relationship1008</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2EntryRelationship1010(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 Entry Relationship1010</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2EntryRelationship1012(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 Entry Relationship1012</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2CDQualifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 CD Qualifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2CDCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 CD Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2CDCodeTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 CD Code Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2CDCodeTranslationP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 CD Code Translation P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2PrognosisObservationEntryRelationshipPrognosisObservation1007(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 Prognosis Observation Entry Relationship Prognosis Observation1007</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2PriorityPreferenceEntryRelationshipPriorityPreference1009(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 Priority Preference Entry Relationship Priority Preference1009</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2ProblemStatusEntryRelationshipProblemStatus1011(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 Problem Status Entry Relationship Problem Status1011</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservation2HealthStatusObservationEntryRelationshipHealthStatusObservation1013(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 Health Status Observation Entry Relationship Health Status Observation1013</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservationHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservationHasTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Has Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservationHasOnsetDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Has Onset Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservationHasResolutionDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Has Resolution Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservationValueNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Value Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservationNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2#validateProblemObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProblemObservation2Test extends CDAValidationTest {

	/**
	*
	* @generated
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Test
	@Ignore
	public void testValidateProblemObservationValueNullFlavorUnknown() {
		OperationsTestCase<ProblemObservation2> validateProblemObservationValueNullFlavorUnknownTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservationValueNullFlavorUnknown",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION_VALUE_NULL_FLAVOR_UNKNOWN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservationValueNullFlavorUnknown(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationValueNullFlavorUnknownTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationStatusCodeP() {
		OperationsTestCase<ProblemObservation2> validateProblemObservationStatusCodePTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservationStatusCodeP(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservation2AuthorParticipation() {
		OperationsTestCase<ProblemObservation2> validateProblemObservation2AuthorParticipationTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservation2AuthorParticipation", operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservation2AuthorParticipation(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservation2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProblemObservation2EntryRelationship1006() {
		OperationsTestCase<ProblemObservation2> validateProblemObservation2EntryRelationship1006TestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservation2EntryRelationship1006",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP1006__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservation2EntryRelationship1006(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservation2EntryRelationship1006TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProblemObservation2EntryRelationship1008() {
		OperationsTestCase<ProblemObservation2> validateProblemObservation2EntryRelationship1008TestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservation2EntryRelationship1008",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP1008__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservation2EntryRelationship1008(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservation2EntryRelationship1008TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProblemObservation2EntryRelationship1010() {
		OperationsTestCase<ProblemObservation2> validateProblemObservation2EntryRelationship1010TestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservation2EntryRelationship1010",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP1010__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservation2EntryRelationship1010(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservation2EntryRelationship1010TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProblemObservation2EntryRelationship1012() {
		OperationsTestCase<ProblemObservation2> validateProblemObservation2EntryRelationship1012TestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservation2EntryRelationship1012",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP1012__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservation2EntryRelationship1012(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservation2EntryRelationship1012TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	* modified VALIDATE_PROBLEM_OBSERVATION2_CD_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP due to inline datatype OCL generation issue
	*/
	@Test
	public void testValidateProblemObservation2CDQualifier() {
		OperationsTestCase<ProblemObservation2> validateProblemObservation2CDQualifierTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservation2CDQualifier",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION2_CD_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservation2CDQualifier(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservation2CDQualifierTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	* modified VALIDATE_PROBLEM_OBSERVATION2_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP due to inline datatype OCL generation issue
	*/
	@Test
	public void testValidateProblemObservation2CDCode() {
		OperationsTestCase<ProblemObservation2> validateProblemObservation2CDCodeTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservation2CDCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION2_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservation2CDCode(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservation2CDCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservation2CDCodeTranslation() {
		OperationsTestCase<ProblemObservation2> validateProblemObservation2CDCodeTranslationTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservation2CDCodeTranslation", operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION2_CD_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservation2CDCodeTranslation(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservation2CDCodeTranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservation2CDCodeTranslationP() {
		OperationsTestCase<ProblemObservation2> validateProblemObservation2CDCodeTranslationPTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservation2CDCodeTranslationP", operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION2_CD_CODE_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservation2CDCodeTranslationP(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservation2CDCodeTranslationPTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProblemObservation2PrognosisObservationEntryRelationshipPrognosisObservation1007() {
		OperationsTestCase<ProblemObservation2> validateProblemObservation2PrognosisObservationEntryRelationshipPrognosisObservation1007TestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservation2PrognosisObservationEntryRelationshipPrognosisObservation1007",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION2_PROGNOSIS_OBSERVATION_ENTRY_RELATIONSHIP_PROGNOSIS_OBSERVATION1007__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservation2PrognosisObservationEntryRelationshipPrognosisObservation1007(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservation2PrognosisObservationEntryRelationshipPrognosisObservation1007TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProblemObservation2PriorityPreferenceEntryRelationshipPriorityPreference1009() {
		OperationsTestCase<ProblemObservation2> validateProblemObservation2PriorityPreferenceEntryRelationshipPriorityPreference1009TestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservation2PriorityPreferenceEntryRelationshipPriorityPreference1009",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION2_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE1009__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservation2PriorityPreferenceEntryRelationshipPriorityPreference1009(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservation2PriorityPreferenceEntryRelationshipPriorityPreference1009TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProblemObservation2ProblemStatusEntryRelationshipProblemStatus1011() {
		OperationsTestCase<ProblemObservation2> validateProblemObservation2ProblemStatusEntryRelationshipProblemStatus1011TestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservation2ProblemStatusEntryRelationshipProblemStatus1011",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION2_PROBLEM_STATUS_ENTRY_RELATIONSHIP_PROBLEM_STATUS1011__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservation2ProblemStatusEntryRelationshipProblemStatus1011(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservation2ProblemStatusEntryRelationshipProblemStatus1011TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProblemObservation2HealthStatusObservationEntryRelationshipHealthStatusObservation1013() {
		OperationsTestCase<ProblemObservation2> validateProblemObservation2HealthStatusObservationEntryRelationshipHealthStatusObservation1013TestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservation2HealthStatusObservationEntryRelationshipHealthStatusObservation1013",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION2_HEALTH_STATUS_OBSERVATION_ENTRY_RELATIONSHIP_HEALTH_STATUS_OBSERVATION1013__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservation2HealthStatusObservationEntryRelationshipHealthStatusObservation1013(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservation2HealthStatusObservationEntryRelationshipHealthStatusObservation1013TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Test
	@Ignore
	public void testValidateProblemObservationHasTextReference() {
		OperationsTestCase<ProblemObservation2> validateProblemObservationHasTextReferenceTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservationHasTextReference", operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservationHasTextReference(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationHasTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Test
	@Ignore
	public void testValidateProblemObservationTextReferenceValue() {
		OperationsTestCase<ProblemObservation2> validateProblemObservationTextReferenceValueTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservationTextReferenceValue", operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservationTextReferenceValue(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	* This constraint is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Test
	@Ignore
	public void testValidateProblemObservationHasTextReferenceValue() {
		OperationsTestCase<ProblemObservation2> validateProblemObservationHasTextReferenceValueTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservationHasTextReferenceValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservationHasTextReferenceValue(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationHasTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationHasOnsetDate() {
		OperationsTestCase<ProblemObservation2> validateProblemObservationHasOnsetDateTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservationHasOnsetDate",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservationHasOnsetDate(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationHasOnsetDateTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationHasResolutionDate() {
		OperationsTestCase<ProblemObservation2> validateProblemObservationHasResolutionDateTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservationHasResolutionDate", operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservationHasResolutionDate(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationHasResolutionDateTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Test
	@Ignore
	public void testValidateProblemObservationValueNullFlavor() {
		OperationsTestCase<ProblemObservation2> validateProblemObservationValueNullFlavorTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservationValueNullFlavor", operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION_VALUE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservationValueNullFlavor(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationValueNullFlavorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationTemplateId() {
		OperationsTestCase<ProblemObservation2> validateProblemObservationTemplateIdTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservationTemplateId(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationNegationInd() {
		OperationsTestCase<ProblemObservation2> validateProblemObservationNegationIndTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservationNegationInd",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservationNegationInd(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationNegationIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationEffectiveTime() {
		OperationsTestCase<ProblemObservation2> validateProblemObservationEffectiveTimeTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservationEffectiveTime(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationValueP() {
		OperationsTestCase<ProblemObservation2> validateProblemObservationValuePTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservationValueP(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationValue() {
		OperationsTestCase<ProblemObservation2> validateProblemObservationValueTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected void setDependency(ProblemObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProblemObservationValueP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservationValue(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationCodeP() {
		OperationsTestCase<ProblemObservation2> validateProblemObservationCodePTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservationCodeP(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationCode() {
		OperationsTestCase<ProblemObservation2> validateProblemObservationCodeTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected void setDependency(ProblemObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProblemObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservationCode(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	* This attribute is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Test
	@Ignore
	public void testValidateProblemObservationText() {
		OperationsTestCase<ProblemObservation2> validateProblemObservationTextTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservationText",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservationText(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationStatusCode() {
		OperationsTestCase<ProblemObservation2> validateProblemObservationStatusCodeTestCase = new OperationsTestCase<ProblemObservation2>(
			"validateProblemObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation2 target) {

			}

			@Override
			protected void updateToPass(ProblemObservation2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(ProblemObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProblemObservationStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservation2Operations.validateProblemObservationStatusCode(
					(ProblemObservation2) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProblemObservation2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ProblemObservation2> {
		@Override
		public ProblemObservation2 create() {
			return ConsolFactory.eINSTANCE.createProblemObservation2();
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
	private static class ConstructorTestClass extends ProblemObservation2Operations {
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

} // ProblemObservation2Operations
