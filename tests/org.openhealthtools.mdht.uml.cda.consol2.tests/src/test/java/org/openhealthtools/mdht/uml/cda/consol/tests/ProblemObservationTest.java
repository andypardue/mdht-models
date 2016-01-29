/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProblemObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationHasTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Has Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationHasOnsetDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Has Onset Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationHasResolutionDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Has Resolution Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationValueNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Value Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationAgeObservationInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Age Observation Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationValueTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Value Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationValueTranslationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Value Translation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationEntryRelationship238(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Entry Relationship238</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationEntryRelationship240(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Entry Relationship240</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationEntryRelationship242(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Entry Relationship242</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationAgeObservationEntryRelationshipAgeObservation239(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Age Observation Entry Relationship Age Observation239</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationProblemStatusEntryRelationshipProblemStatus241(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Problem Status Entry Relationship Problem Status241</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationHealthStatusObservationEntryRelationshipHealthStatusObservation243(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Health Status Observation Entry Relationship Health Status Observation243</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProblemObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationHasTextReference() {
		OperationsTestCase<ProblemObservation> validateProblemObservationHasTextReferenceTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationHasTextReference", operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationHasTextReference(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationHasTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationTextReferenceValue() {
		OperationsTestCase<ProblemObservation> validateProblemObservationTextReferenceValueTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationTextReferenceValue", operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationTextReferenceValue(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationHasTextReferenceValue() {
		OperationsTestCase<ProblemObservation> validateProblemObservationHasTextReferenceValueTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationHasTextReferenceValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationHasTextReferenceValue(
					(ProblemObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<ProblemObservation> validateProblemObservationHasOnsetDateTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationHasOnsetDate",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationHasOnsetDate(
					(ProblemObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<ProblemObservation> validateProblemObservationHasResolutionDateTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationHasResolutionDate", operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationHasResolutionDate(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationHasResolutionDateTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationValueNullFlavor() {
		OperationsTestCase<ProblemObservation> validateProblemObservationValueNullFlavorTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationValueNullFlavor", operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION_VALUE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationValueNullFlavor(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationValueNullFlavorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationAgeObservationInversion() {
		OperationsTestCase<ProblemObservation> validateProblemObservationAgeObservationInversionTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationAgeObservationInversion",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION_AGE_OBSERVATION_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationAgeObservationInversion(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationAgeObservationInversionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationValueTranslation() {
		OperationsTestCase<ProblemObservation> validateProblemObservationValueTranslationTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationValueTranslation", operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION_VALUE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationValueTranslation(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationValueTranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationValueTranslationCode() {
		OperationsTestCase<ProblemObservation> validateProblemObservationValueTranslationCodeTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationValueTranslationCode", operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION_VALUE_TRANSLATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationValueTranslationCode(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationValueTranslationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationTemplateId() {
		OperationsTestCase<ProblemObservation> validateProblemObservationTemplateIdTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationTemplateId(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationClassCode() {
		OperationsTestCase<ProblemObservation> validateProblemObservationClassCodeTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationClassCode(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationMoodCode() {
		OperationsTestCase<ProblemObservation> validateProblemObservationMoodCodeTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationMoodCode(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationNegationInd() {
		OperationsTestCase<ProblemObservation> validateProblemObservationNegationIndTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationNegationInd",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationNegationInd(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationNegationIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationId() {
		OperationsTestCase<ProblemObservation> validateProblemObservationIdTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationId(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationCodeP() {
		OperationsTestCase<ProblemObservation> validateProblemObservationCodePTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationCodeP(
					(ProblemObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<ProblemObservation> validateProblemObservationCodeTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected void setDependency(ProblemObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProblemObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationCode(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationText() {
		OperationsTestCase<ProblemObservation> validateProblemObservationTextTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationText",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationText(
					(ProblemObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<ProblemObservation> validateProblemObservationStatusCodeTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationStatusCode(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationEffectiveTime() {
		OperationsTestCase<ProblemObservation> validateProblemObservationEffectiveTimeTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationEffectiveTime(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationValue() {
		OperationsTestCase<ProblemObservation> validateProblemObservationValueTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationValue(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationValueP() {
		OperationsTestCase<ProblemObservation> validateProblemObservationValuePTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationValueP(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProblemObservationEntryRelationship238() {
		OperationsTestCase<ProblemObservation> validateProblemObservationEntryRelationship238TestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationEntryRelationship238", operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION_ENTRY_RELATIONSHIP238__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationEntryRelationship238(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationEntryRelationship238TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProblemObservationEntryRelationship240() {
		OperationsTestCase<ProblemObservation> validateProblemObservationEntryRelationship240TestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationEntryRelationship240", operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION_ENTRY_RELATIONSHIP240__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationEntryRelationship240(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationEntryRelationship240TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProblemObservationEntryRelationship242() {
		OperationsTestCase<ProblemObservation> validateProblemObservationEntryRelationship242TestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationEntryRelationship242", operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION_ENTRY_RELATIONSHIP242__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationEntryRelationship242(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationEntryRelationship242TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProblemObservationAgeObservationEntryRelationshipAgeObservation239() {
		OperationsTestCase<ProblemObservation> validateProblemObservationAgeObservationEntryRelationshipAgeObservation239TestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationAgeObservationEntryRelationshipAgeObservation239",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION_AGE_OBSERVATION_ENTRY_RELATIONSHIP_AGE_OBSERVATION239__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationAgeObservationEntryRelationshipAgeObservation239(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationAgeObservationEntryRelationshipAgeObservation239TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProblemObservationProblemStatusEntryRelationshipProblemStatus241() {
		OperationsTestCase<ProblemObservation> validateProblemObservationProblemStatusEntryRelationshipProblemStatus241TestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationProblemStatusEntryRelationshipProblemStatus241",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION_PROBLEM_STATUS_ENTRY_RELATIONSHIP_PROBLEM_STATUS241__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationProblemStatusEntryRelationshipProblemStatus241(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationProblemStatusEntryRelationshipProblemStatus241TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProblemObservationHealthStatusObservationEntryRelationshipHealthStatusObservation243() {
		OperationsTestCase<ProblemObservation> validateProblemObservationHealthStatusObservationEntryRelationshipHealthStatusObservation243TestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationHealthStatusObservationEntryRelationshipHealthStatusObservation243",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION_HEALTH_STATUS_OBSERVATION_ENTRY_RELATIONSHIP_HEALTH_STATUS_OBSERVATION243__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationHealthStatusObservationEntryRelationshipHealthStatusObservation243(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationHealthStatusObservationEntryRelationshipHealthStatusObservation243TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProblemObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProblemObservation> {
		@Override
		public ProblemObservation create() {
			return ConsolFactory.eINSTANCE.createProblemObservation();
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
	private static class ConstructorTestClass extends ProblemObservationOperations {
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

} // ProblemObservationOperations
