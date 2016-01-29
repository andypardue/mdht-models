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
import org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.LongitudinalCareWoundObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Longitudinal Care Wound Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationEntryRelationship738(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Entry Relationship738</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationEntryRelationship740(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Entry Relationship740</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationEntryRelationship742(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Entry Relationship742</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationEntryRelationship744(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Entry Relationship744</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationCDCRCDValueTerminology(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation CDCRCD Value Terminology</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationCDCRCDCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation CDCRCD Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationCDCRName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation CDCR Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationCDCRNameP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation CDCR Name P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationCDCRValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation CDCR Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationCDQualifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation CD Qualifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationWoundMeasurementObservationEntryRelationshipWoundMeasurementObservation739(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Wound Measurement Observation Entry Relationship Wound Measurement Observation739</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationWoundCharacteristicEntryRelationshipWoundCharacteristics741(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Wound Characteristic Entry Relationship Wound Characteristics741</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationNumberOfPressureUlcersObservation2EntryRelationshipNumberOfPressureUlcersObservation2743(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Number Of Pressure Ulcers Observation2 Entry Relationship Number Of Pressure Ulcers Observation2743</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationHighestPressureUlcerStageEntryRelationshipHighestPressureUlcerStage745(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Highest Pressure Ulcer Stage Entry Relationship Highest Pressure Ulcer Stage745</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class LongitudinalCareWoundObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationClassCode() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationClassCodeTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {

			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationClassCode(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationMoodCode() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationMoodCodeTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationMoodCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {

			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationMoodCode(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationCodeP() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationCodePTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {

			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationCodeP(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationCode() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationCodeTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationCode", operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {

			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected void setDependency(LongitudinalCareWoundObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationCode(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationValueP() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationValuePTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationValueP",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {

			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationValueP(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationValue() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationValueTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationValue", operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {

			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected void setDependency(LongitudinalCareWoundObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservationValueP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationValue(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationTargetSiteCodeP() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationTargetSiteCodePTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationTargetSiteCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {

			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationTargetSiteCodeP(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationTargetSiteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationTargetSiteCode() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationTargetSiteCodeTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationTargetSiteCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {

			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationTargetSiteCode(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationAuthorParticipation() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationAuthorParticipationTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationAuthorParticipation",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {

			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationAuthorParticipation(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationAuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLongitudinalCareWoundObservationEntryRelationship738() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationEntryRelationship738TestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationEntryRelationship738",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_RELATIONSHIP738__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {

			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationEntryRelationship738(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationEntryRelationship738TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLongitudinalCareWoundObservationEntryRelationship740() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationEntryRelationship740TestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationEntryRelationship740",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_RELATIONSHIP740__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {

			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationEntryRelationship740(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationEntryRelationship740TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLongitudinalCareWoundObservationEntryRelationship742() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationEntryRelationship742TestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationEntryRelationship742",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_RELATIONSHIP742__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {

			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationEntryRelationship742(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationEntryRelationship742TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLongitudinalCareWoundObservationEntryRelationship744() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationEntryRelationship744TestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationEntryRelationship744",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_ENTRY_RELATIONSHIP744__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {

			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationEntryRelationship744(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationEntryRelationship744TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationCDCRCDValueTerminology() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationCDCRCDValueTerminologyTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationCDCRCDValueTerminology",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCRCD_VALUE_TERMINOLOGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {

			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationCDCRCDValueTerminology(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationCDCRCDValueTerminologyTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationCDCRCDCode() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationCDCRCDCodeTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationCDCRCDCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCRCD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {

			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationCDCRCDCode(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationCDCRCDCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationCDCRName() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationCDCRNameTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationCDCRName",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCR_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {

			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationCDCRName(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationCDCRNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationCDCRNameP() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationCDCRNamePTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationCDCRNameP",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCR_NAME_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {

			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationCDCRNameP(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationCDCRNamePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationCDCRValue() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationCDCRValueTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationCDCRValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {

			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationCDCRValue(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationCDCRValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationCDQualifier() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationCDQualifierTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationCDQualifier",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CD_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {

			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationCDQualifier(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationCDQualifierTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLongitudinalCareWoundObservationWoundMeasurementObservationEntryRelationshipWoundMeasurementObservation739() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationWoundMeasurementObservationEntryRelationshipWoundMeasurementObservation739TestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationWoundMeasurementObservationEntryRelationshipWoundMeasurementObservation739",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_WOUND_MEASUREMENT_OBSERVATION_ENTRY_RELATIONSHIP_WOUND_MEASUREMENT_OBSERVATION739__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {

			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationWoundMeasurementObservationEntryRelationshipWoundMeasurementObservation739(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationWoundMeasurementObservationEntryRelationshipWoundMeasurementObservation739TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLongitudinalCareWoundObservationWoundCharacteristicEntryRelationshipWoundCharacteristics741() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationWoundCharacteristicEntryRelationshipWoundCharacteristics741TestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationWoundCharacteristicEntryRelationshipWoundCharacteristics741",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_WOUND_CHARACTERISTIC_ENTRY_RELATIONSHIP_WOUND_CHARACTERISTICS741__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {

			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationWoundCharacteristicEntryRelationshipWoundCharacteristics741(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationWoundCharacteristicEntryRelationshipWoundCharacteristics741TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLongitudinalCareWoundObservationNumberOfPressureUlcersObservation2EntryRelationshipNumberOfPressureUlcersObservation2743() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationNumberOfPressureUlcersObservation2EntryRelationshipNumberOfPressureUlcersObservation2743TestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationNumberOfPressureUlcersObservation2EntryRelationshipNumberOfPressureUlcersObservation2743",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_ENTRY_RELATIONSHIP_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2743__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {

			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationNumberOfPressureUlcersObservation2EntryRelationshipNumberOfPressureUlcersObservation2743(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationNumberOfPressureUlcersObservation2EntryRelationshipNumberOfPressureUlcersObservation2743TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLongitudinalCareWoundObservationHighestPressureUlcerStageEntryRelationshipHighestPressureUlcerStage745() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationHighestPressureUlcerStageEntryRelationshipHighestPressureUlcerStage745TestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationHighestPressureUlcerStageEntryRelationshipHighestPressureUlcerStage745",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_HIGHEST_PRESSURE_ULCER_STAGE_ENTRY_RELATIONSHIP_HIGHEST_PRESSURE_ULCER_STAGE745__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {

			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationHighestPressureUlcerStageEntryRelationshipHighestPressureUlcerStage745(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationHighestPressureUlcerStageEntryRelationshipHighestPressureUlcerStage745TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationTemplateId() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateProblemObservationTemplateIdTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateProblemObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {

			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateProblemObservationTemplateId(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends LongitudinalCareWoundObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<LongitudinalCareWoundObservation> {
		public LongitudinalCareWoundObservation create() {
			return ConsolFactory.eINSTANCE.createLongitudinalCareWoundObservation();
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
	private static class ConstructorTestClass extends LongitudinalCareWoundObservationOperations {
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

} // LongitudinalCareWoundObservationOperations
