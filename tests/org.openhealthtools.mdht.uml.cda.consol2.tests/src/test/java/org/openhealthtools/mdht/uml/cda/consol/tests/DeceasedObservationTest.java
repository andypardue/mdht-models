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
import org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.DeceasedObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Deceased Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation#validateDeceasedObservationEffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deceased Observation Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation#validateDeceasedObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deceased Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation#validateDeceasedObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deceased Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation#validateDeceasedObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deceased Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation#validateDeceasedObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deceased Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation#validateDeceasedObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deceased Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation#validateDeceasedObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deceased Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation#validateDeceasedObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deceased Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation#validateDeceasedObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deceased Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation#validateDeceasedObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deceased Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation#validateDeceasedObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deceased Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation#validateDeceasedObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deceased Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation#validateDeceasedObservationEntryRelationship576(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deceased Observation Entry Relationship576</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation#validateDeceasedObservationProblemObservationEntryRelationshipProblemObservation577(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deceased Observation Problem Observation Entry Relationship Problem Observation577</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DeceasedObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDeceasedObservationEffectiveTimeLow() {
		OperationsTestCase<DeceasedObservation> validateDeceasedObservationEffectiveTimeLowTestCase = new OperationsTestCase<DeceasedObservation>(
			"validateDeceasedObservationEffectiveTimeLow", operationsForOCL.getOCLValue(
				"VALIDATE_DECEASED_OBSERVATION_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeceasedObservation target) {

			}

			@Override
			protected void updateToPass(DeceasedObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeceasedObservationOperations.validateDeceasedObservationEffectiveTimeLow(
					(DeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeceasedObservationEffectiveTimeLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDeceasedObservationTemplateId() {
		OperationsTestCase<DeceasedObservation> validateDeceasedObservationTemplateIdTestCase = new OperationsTestCase<DeceasedObservation>(
			"validateDeceasedObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DECEASED_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeceasedObservation target) {

			}

			@Override
			protected void updateToPass(DeceasedObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeceasedObservationOperations.validateDeceasedObservationTemplateId(
					(DeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeceasedObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDeceasedObservationClassCode() {
		OperationsTestCase<DeceasedObservation> validateDeceasedObservationClassCodeTestCase = new OperationsTestCase<DeceasedObservation>(
			"validateDeceasedObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_DECEASED_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeceasedObservation target) {

			}

			@Override
			protected void updateToPass(DeceasedObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeceasedObservationOperations.validateDeceasedObservationClassCode(
					(DeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeceasedObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDeceasedObservationMoodCode() {
		OperationsTestCase<DeceasedObservation> validateDeceasedObservationMoodCodeTestCase = new OperationsTestCase<DeceasedObservation>(
			"validateDeceasedObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_DECEASED_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeceasedObservation target) {

			}

			@Override
			protected void updateToPass(DeceasedObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeceasedObservationOperations.validateDeceasedObservationMoodCode(
					(DeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeceasedObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDeceasedObservationId() {
		OperationsTestCase<DeceasedObservation> validateDeceasedObservationIdTestCase = new OperationsTestCase<DeceasedObservation>(
			"validateDeceasedObservationId",
			operationsForOCL.getOCLValue("VALIDATE_DECEASED_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeceasedObservation target) {

			}

			@Override
			protected void updateToPass(DeceasedObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeceasedObservationOperations.validateDeceasedObservationId(
					(DeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeceasedObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDeceasedObservationCodeP() {
		OperationsTestCase<DeceasedObservation> validateDeceasedObservationCodePTestCase = new OperationsTestCase<DeceasedObservation>(
			"validateDeceasedObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_DECEASED_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeceasedObservation target) {

			}

			@Override
			protected void updateToPass(DeceasedObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeceasedObservationOperations.validateDeceasedObservationCodeP(
					(DeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeceasedObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDeceasedObservationCode() {
		OperationsTestCase<DeceasedObservation> validateDeceasedObservationCodeTestCase = new OperationsTestCase<DeceasedObservation>(
			"validateDeceasedObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_DECEASED_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeceasedObservation target) {

			}

			@Override
			protected void updateToPass(DeceasedObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected void setDependency(DeceasedObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.DeceasedObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeceasedObservationOperations.validateDeceasedObservationCode(
					(DeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeceasedObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDeceasedObservationStatusCode() {
		OperationsTestCase<DeceasedObservation> validateDeceasedObservationStatusCodeTestCase = new OperationsTestCase<DeceasedObservation>(
			"validateDeceasedObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_DECEASED_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeceasedObservation target) {

			}

			@Override
			protected void updateToPass(DeceasedObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeceasedObservationOperations.validateDeceasedObservationStatusCode(
					(DeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeceasedObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDeceasedObservationStatusCodeP() {
		OperationsTestCase<DeceasedObservation> validateDeceasedObservationStatusCodePTestCase = new OperationsTestCase<DeceasedObservation>(
			"validateDeceasedObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_DECEASED_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeceasedObservation target) {

			}

			@Override
			protected void updateToPass(DeceasedObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeceasedObservationOperations.validateDeceasedObservationStatusCodeP(
					(DeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeceasedObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDeceasedObservationEffectiveTime() {
		OperationsTestCase<DeceasedObservation> validateDeceasedObservationEffectiveTimeTestCase = new OperationsTestCase<DeceasedObservation>(
			"validateDeceasedObservationEffectiveTime", operationsForOCL.getOCLValue(
				"VALIDATE_DECEASED_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeceasedObservation target) {

			}

			@Override
			protected void updateToPass(DeceasedObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeceasedObservationOperations.validateDeceasedObservationEffectiveTime(
					(DeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeceasedObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDeceasedObservationValue() {
		OperationsTestCase<DeceasedObservation> validateDeceasedObservationValueTestCase = new OperationsTestCase<DeceasedObservation>(
			"validateDeceasedObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_DECEASED_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeceasedObservation target) {

			}

			@Override
			protected void updateToPass(DeceasedObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeceasedObservationOperations.validateDeceasedObservationValue(
					(DeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeceasedObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDeceasedObservationValueP() {
		OperationsTestCase<DeceasedObservation> validateDeceasedObservationValuePTestCase = new OperationsTestCase<DeceasedObservation>(
			"validateDeceasedObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_DECEASED_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeceasedObservation target) {

			}

			@Override
			protected void updateToPass(DeceasedObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeceasedObservationOperations.validateDeceasedObservationValueP(
					(DeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeceasedObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDeceasedObservationEntryRelationship576() {
		OperationsTestCase<DeceasedObservation> validateDeceasedObservationEntryRelationship576TestCase = new OperationsTestCase<DeceasedObservation>(
			"validateDeceasedObservationEntryRelationship576", operationsForOCL.getOCLValue(
				"VALIDATE_DECEASED_OBSERVATION_ENTRY_RELATIONSHIP576__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeceasedObservation target) {

			}

			@Override
			protected void updateToPass(DeceasedObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeceasedObservationOperations.validateDeceasedObservationEntryRelationship576(
					(DeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeceasedObservationEntryRelationship576TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDeceasedObservationProblemObservationEntryRelationshipProblemObservation577() {
		OperationsTestCase<DeceasedObservation> validateDeceasedObservationProblemObservationEntryRelationshipProblemObservation577TestCase = new OperationsTestCase<DeceasedObservation>(
			"validateDeceasedObservationProblemObservationEntryRelationshipProblemObservation577",
			operationsForOCL.getOCLValue(
				"VALIDATE_DECEASED_OBSERVATION_PROBLEM_OBSERVATION_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION577__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeceasedObservation target) {

			}

			@Override
			protected void updateToPass(DeceasedObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeceasedObservationOperations.validateDeceasedObservationProblemObservationEntryRelationshipProblemObservation577(
					(DeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeceasedObservationProblemObservationEntryRelationshipProblemObservation577TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DeceasedObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DeceasedObservation> {
		@Override
		public DeceasedObservation create() {
			return ConsolFactory.eINSTANCE.createDeceasedObservation();
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
	private static class ConstructorTestClass extends DeceasedObservationOperations {
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

} // DeceasedObservationOperations
