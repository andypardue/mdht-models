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
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.FunctionalStatusResultObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Functional Status Result Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationValueDatatype(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Value Datatype</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateResultObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationReferenceRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Reference Range</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationEntryRelationship584(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Entry Relationship584</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationEntryRelationship586(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Entry Relationship586</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationEntryRelationship588(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Entry Relationship588</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationReferenceRangeObservationRangeNoCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Reference Range Observation Range No Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationReferenceRangeObservationRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Reference Range Observation Range</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationNonMedicinalSupplyActivityEntryRelationshipNonMedicinalSupplyActivity585(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Non Medicinal Supply Activity Entry Relationship Non Medicinal Supply Activity585</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics587(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Caregiver Characteristics Entry Relationship Caregiver Characteristics587</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation589(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Assessment Scale Observation Entry Relationship Assessment Scale Observation589</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateResultObservationTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateResultObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateResultObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateResultObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateResultObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateResultObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateResultObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateResultObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateResultObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateResultObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateResultObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateResultObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateResultObservationInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateResultObservationMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateResultObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Target Site Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FunctionalStatusResultObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationValueDatatype() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationValueDatatypeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationValueDatatype",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_VALUE_DATATYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationValueDatatype(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationValueDatatypeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationCodeP() {
		OperationsTestCase<FunctionalStatusResultObservation> validateResultObservationCodePTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateResultObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateResultObservationCodeP(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationAuthor() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationAuthorTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationAuthor",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationAuthor(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationReferenceRange() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationReferenceRangeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationReferenceRange",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationReferenceRange(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationReferenceRangeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusResultObservationEntryRelationship584() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationEntryRelationship584TestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationEntryRelationship584",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_ENTRY_RELATIONSHIP584__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationEntryRelationship584(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationEntryRelationship584TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusResultObservationEntryRelationship586() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationEntryRelationship586TestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationEntryRelationship586",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_ENTRY_RELATIONSHIP586__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationEntryRelationship586(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationEntryRelationship586TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusResultObservationEntryRelationship588() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationEntryRelationship588TestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationEntryRelationship588",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_ENTRY_RELATIONSHIP588__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationEntryRelationship588(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationEntryRelationship588TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationReferenceRangeObservationRangeNoCode() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationReferenceRangeObservationRangeNoCodeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationReferenceRangeObservationRangeNoCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE_NO_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationReferenceRangeObservationRangeNoCode(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationReferenceRangeObservationRangeNoCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationReferenceRangeObservationRange() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationReferenceRangeObservationRangeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationReferenceRangeObservationRange",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationReferenceRangeObservationRange(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationReferenceRangeObservationRangeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusResultObservationNonMedicinalSupplyActivityEntryRelationshipNonMedicinalSupplyActivity585() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationNonMedicinalSupplyActivityEntryRelationshipNonMedicinalSupplyActivity585TestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationNonMedicinalSupplyActivityEntryRelationshipNonMedicinalSupplyActivity585",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_NON_MEDICINAL_SUPPLY_ACTIVITY_ENTRY_RELATIONSHIP_NON_MEDICINAL_SUPPLY_ACTIVITY585__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationNonMedicinalSupplyActivityEntryRelationshipNonMedicinalSupplyActivity585(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationNonMedicinalSupplyActivityEntryRelationshipNonMedicinalSupplyActivity585TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusResultObservationCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics587() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics587TestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics587",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_CAREGIVER_CHARACTERISTICS_ENTRY_RELATIONSHIP_CAREGIVER_CHARACTERISTICS587__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics587(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics587TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusResultObservationAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation589() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation589TestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation589",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION_ENTRY_RELATIONSHIP_ASSESSMENT_SCALE_OBSERVATION589__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation589(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation589TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationTextReference() {
		OperationsTestCase<FunctionalStatusResultObservation> validateResultObservationTextReferenceTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateResultObservationTextReference",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateResultObservationTextReference(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationTextReferenceValue() {
		OperationsTestCase<FunctionalStatusResultObservation> validateResultObservationTextReferenceValueTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateResultObservationTextReferenceValue", operationsForOCL.getOCLValue(
				"VALIDATE_RESULT_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateResultObservationTextReferenceValue(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationTemplateId() {
		OperationsTestCase<FunctionalStatusResultObservation> validateResultObservationTemplateIdTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateResultObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateResultObservationTemplateId(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationClassCode() {
		OperationsTestCase<FunctionalStatusResultObservation> validateResultObservationClassCodeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateResultObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateResultObservationClassCode(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationMoodCode() {
		OperationsTestCase<FunctionalStatusResultObservation> validateResultObservationMoodCodeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateResultObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateResultObservationMoodCode(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationId() {
		OperationsTestCase<FunctionalStatusResultObservation> validateResultObservationIdTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateResultObservationId",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateResultObservationId(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationCode() {
		OperationsTestCase<FunctionalStatusResultObservation> validateResultObservationCodeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateResultObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected void setDependency(FunctionalStatusResultObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ResultObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateResultObservationCode(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationText() {
		OperationsTestCase<FunctionalStatusResultObservation> validateResultObservationTextTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateResultObservationText",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateResultObservationText(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationStatusCodeP() {
		OperationsTestCase<FunctionalStatusResultObservation> validateResultObservationStatusCodePTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateResultObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateResultObservationStatusCodeP(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationStatusCode() {
		OperationsTestCase<FunctionalStatusResultObservation> validateResultObservationStatusCodeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateResultObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(FunctionalStatusResultObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ResultObservationStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateResultObservationStatusCode(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationEffectiveTime() {
		OperationsTestCase<FunctionalStatusResultObservation> validateResultObservationEffectiveTimeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateResultObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateResultObservationEffectiveTime(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationValue() {
		OperationsTestCase<FunctionalStatusResultObservation> validateResultObservationValueTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateResultObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateResultObservationValue(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationInterpretationCode() {
		OperationsTestCase<FunctionalStatusResultObservation> validateResultObservationInterpretationCodeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateResultObservationInterpretationCode", operationsForOCL.getOCLValue(
				"VALIDATE_RESULT_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateResultObservationInterpretationCode(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationInterpretationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationMethodCode() {
		OperationsTestCase<FunctionalStatusResultObservation> validateResultObservationMethodCodeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateResultObservationMethodCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateResultObservationMethodCode(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationMethodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationTargetSiteCode() {
		OperationsTestCase<FunctionalStatusResultObservation> validateResultObservationTargetSiteCodeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateResultObservationTargetSiteCode", operationsForOCL.getOCLValue(
				"VALIDATE_RESULT_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateResultObservationTargetSiteCode(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FunctionalStatusResultObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FunctionalStatusResultObservation> {
		@Override
		public FunctionalStatusResultObservation create() {
			return ConsolFactory.eINSTANCE.createFunctionalStatusResultObservation();
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
	private static class ConstructorTestClass extends FunctionalStatusResultObservationOperations {
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

} // FunctionalStatusResultObservationOperations
