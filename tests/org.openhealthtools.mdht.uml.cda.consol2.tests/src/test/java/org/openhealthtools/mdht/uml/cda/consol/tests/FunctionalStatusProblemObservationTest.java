/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.FunctionalStatusProblemObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Functional Status Problem Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationEntryRelationship578(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Entry Relationship578</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationEntryRelationship580(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Entry Relationship580</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationEntryRelationship582(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Entry Relationship582</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationNonMedicinalSupplyActivityEntryRelationshipNonMedicinalSupplyActivity579(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Non Medicinal Supply Activity Entry Relationship Non Medicinal Supply Activity579</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics581(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Caregiver Characteristics Entry Relationship Caregiver Characteristics581</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation583(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Assessment Scale Observation Entry Relationship Assessment Scale Observation583</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationHasTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Has Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationHasOnsetDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Has Onset Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationHasResolutionDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Has Resolution Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationValueNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Value Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FunctionalStatusProblemObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusProblemObservationMethodCode() {
		OperationsTestCase<FunctionalStatusProblemObservation> validateFunctionalStatusProblemObservationMethodCodeTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateFunctionalStatusProblemObservationMethodCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationMethodCode(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusProblemObservationMethodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusProblemObservationEntryRelationship578() {
		OperationsTestCase<FunctionalStatusProblemObservation> validateFunctionalStatusProblemObservationEntryRelationship578TestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateFunctionalStatusProblemObservationEntryRelationship578",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_ENTRY_RELATIONSHIP578__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationEntryRelationship578(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusProblemObservationEntryRelationship578TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusProblemObservationEntryRelationship580() {
		OperationsTestCase<FunctionalStatusProblemObservation> validateFunctionalStatusProblemObservationEntryRelationship580TestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateFunctionalStatusProblemObservationEntryRelationship580",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_ENTRY_RELATIONSHIP580__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationEntryRelationship580(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusProblemObservationEntryRelationship580TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusProblemObservationEntryRelationship582() {
		OperationsTestCase<FunctionalStatusProblemObservation> validateFunctionalStatusProblemObservationEntryRelationship582TestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateFunctionalStatusProblemObservationEntryRelationship582",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_ENTRY_RELATIONSHIP582__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationEntryRelationship582(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusProblemObservationEntryRelationship582TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusProblemObservationNonMedicinalSupplyActivityEntryRelationshipNonMedicinalSupplyActivity579() {
		OperationsTestCase<FunctionalStatusProblemObservation> validateFunctionalStatusProblemObservationNonMedicinalSupplyActivityEntryRelationshipNonMedicinalSupplyActivity579TestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateFunctionalStatusProblemObservationNonMedicinalSupplyActivityEntryRelationshipNonMedicinalSupplyActivity579",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_NON_MEDICINAL_SUPPLY_ACTIVITY_ENTRY_RELATIONSHIP_NON_MEDICINAL_SUPPLY_ACTIVITY579__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationNonMedicinalSupplyActivityEntryRelationshipNonMedicinalSupplyActivity579(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusProblemObservationNonMedicinalSupplyActivityEntryRelationshipNonMedicinalSupplyActivity579TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusProblemObservationCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics581() {
		OperationsTestCase<FunctionalStatusProblemObservation> validateFunctionalStatusProblemObservationCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics581TestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateFunctionalStatusProblemObservationCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics581",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CAREGIVER_CHARACTERISTICS_ENTRY_RELATIONSHIP_CAREGIVER_CHARACTERISTICS581__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics581(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusProblemObservationCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics581TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusProblemObservationAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation583() {
		OperationsTestCase<FunctionalStatusProblemObservation> validateFunctionalStatusProblemObservationAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation583TestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateFunctionalStatusProblemObservationAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation583",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION_ENTRY_RELATIONSHIP_ASSESSMENT_SCALE_OBSERVATION583__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation583(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusProblemObservationAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation583TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationHasTextReference() {
		OperationsTestCase<FunctionalStatusProblemObservation> validateProblemObservationHasTextReferenceTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateProblemObservationHasTextReference", operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateProblemObservationHasTextReference(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusProblemObservation> validateProblemObservationTextReferenceValueTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateProblemObservationTextReferenceValue", operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateProblemObservationTextReferenceValue(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusProblemObservation> validateProblemObservationHasTextReferenceValueTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateProblemObservationHasTextReferenceValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateProblemObservationHasTextReferenceValue(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusProblemObservation> validateProblemObservationHasOnsetDateTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateProblemObservationHasOnsetDate",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateProblemObservationHasOnsetDate(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusProblemObservation> validateProblemObservationHasResolutionDateTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateProblemObservationHasResolutionDate", operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateProblemObservationHasResolutionDate(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusProblemObservation> validateProblemObservationValueNullFlavorTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateProblemObservationValueNullFlavor", operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION_VALUE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateProblemObservationValueNullFlavor(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusProblemObservation> validateProblemObservationTemplateIdTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateProblemObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateProblemObservationTemplateId(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusProblemObservation> validateProblemObservationClassCodeTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateProblemObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateProblemObservationClassCode(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusProblemObservation> validateProblemObservationMoodCodeTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateProblemObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateProblemObservationMoodCode(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusProblemObservation> validateProblemObservationNegationIndTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateProblemObservationNegationInd",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateProblemObservationNegationInd(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusProblemObservation> validateProblemObservationIdTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateProblemObservationId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateProblemObservationId(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusProblemObservation> validateProblemObservationCodePTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateProblemObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateProblemObservationCodeP(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusProblemObservation> validateProblemObservationCodeTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateProblemObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected void setDependency(FunctionalStatusProblemObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProblemObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateProblemObservationCode(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusProblemObservation> validateProblemObservationTextTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateProblemObservationText",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateProblemObservationText(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusProblemObservation> validateProblemObservationStatusCodeTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateProblemObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateProblemObservationStatusCode(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusProblemObservation> validateProblemObservationEffectiveTimeTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateProblemObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateProblemObservationEffectiveTime(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusProblemObservation> validateProblemObservationValuePTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateProblemObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateProblemObservationValueP(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusProblemObservation> validateProblemObservationValueTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateProblemObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected void setDependency(FunctionalStatusProblemObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProblemObservationValueP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateProblemObservationValue(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FunctionalStatusProblemObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FunctionalStatusProblemObservation> {
		@Override
		public FunctionalStatusProblemObservation create() {
			return ConsolFactory.eINSTANCE.createFunctionalStatusProblemObservation();
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
	private static class ConstructorTestClass extends FunctionalStatusProblemObservationOperations {
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

} // FunctionalStatusProblemObservationOperations
