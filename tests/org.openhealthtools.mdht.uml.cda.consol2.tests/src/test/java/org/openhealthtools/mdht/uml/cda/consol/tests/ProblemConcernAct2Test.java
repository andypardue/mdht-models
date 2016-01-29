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
import org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProblemConcernAct2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Concern Act2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernActStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernAct2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernAct2EntryRelationship1002(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act2 Entry Relationship1002</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernAct2EntryRelationship1004(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act2 Entry Relationship1004</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernAct2ProblemObservation2EntryRelationshipProblemObservation21003(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act2 Problem Observation2 Entry Relationship Problem Observation21003</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernAct2PriorityPreferenceEntryRelationshipPriorityPreference1005(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act2 Priority Preference Entry Relationship Priority Preference1005</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernActEffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernActEffectiveTimeHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Effective Time High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernActCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProblemConcernAct2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActStatusCodeP() {
		OperationsTestCase<ProblemConcernAct2> validateProblemConcernActStatusCodePTestCase = new OperationsTestCase<ProblemConcernAct2>(
			"validateProblemConcernActStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct2 target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernAct2Operations.validateProblemConcernActStatusCodeP(
					(ProblemConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernAct2AuthorParticipation() {
		OperationsTestCase<ProblemConcernAct2> validateProblemConcernAct2AuthorParticipationTestCase = new OperationsTestCase<ProblemConcernAct2>(
			"validateProblemConcernAct2AuthorParticipation", operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_CONCERN_ACT2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct2 target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernAct2Operations.validateProblemConcernAct2AuthorParticipation(
					(ProblemConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernAct2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProblemConcernAct2EntryRelationship1002() {
		OperationsTestCase<ProblemConcernAct2> validateProblemConcernAct2EntryRelationship1002TestCase = new OperationsTestCase<ProblemConcernAct2>(
			"validateProblemConcernAct2EntryRelationship1002",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_CONCERN_ACT2_ENTRY_RELATIONSHIP1002__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct2 target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernAct2Operations.validateProblemConcernAct2EntryRelationship1002(
					(ProblemConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernAct2EntryRelationship1002TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProblemConcernAct2EntryRelationship1004() {
		OperationsTestCase<ProblemConcernAct2> validateProblemConcernAct2EntryRelationship1004TestCase = new OperationsTestCase<ProblemConcernAct2>(
			"validateProblemConcernAct2EntryRelationship1004",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_CONCERN_ACT2_ENTRY_RELATIONSHIP1004__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct2 target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernAct2Operations.validateProblemConcernAct2EntryRelationship1004(
					(ProblemConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernAct2EntryRelationship1004TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProblemConcernAct2ProblemObservation2EntryRelationshipProblemObservation21003() {
		OperationsTestCase<ProblemConcernAct2> validateProblemConcernAct2ProblemObservation2EntryRelationshipProblemObservation21003TestCase = new OperationsTestCase<ProblemConcernAct2>(
			"validateProblemConcernAct2ProblemObservation2EntryRelationshipProblemObservation21003",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_CONCERN_ACT2_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION21003__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct2 target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernAct2Operations.validateProblemConcernAct2ProblemObservation2EntryRelationshipProblemObservation21003(
					(ProblemConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernAct2ProblemObservation2EntryRelationshipProblemObservation21003TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProblemConcernAct2PriorityPreferenceEntryRelationshipPriorityPreference1005() {
		OperationsTestCase<ProblemConcernAct2> validateProblemConcernAct2PriorityPreferenceEntryRelationshipPriorityPreference1005TestCase = new OperationsTestCase<ProblemConcernAct2>(
			"validateProblemConcernAct2PriorityPreferenceEntryRelationshipPriorityPreference1005",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_CONCERN_ACT2_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE1005__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct2 target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernAct2Operations.validateProblemConcernAct2PriorityPreferenceEntryRelationshipPriorityPreference1005(
					(ProblemConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernAct2PriorityPreferenceEntryRelationshipPriorityPreference1005TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActEffectiveTimeLow() {
		OperationsTestCase<ProblemConcernAct2> validateProblemConcernActEffectiveTimeLowTestCase = new OperationsTestCase<ProblemConcernAct2>(
			"validateProblemConcernActEffectiveTimeLow", operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct2 target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernAct2Operations.validateProblemConcernActEffectiveTimeLow(
					(ProblemConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActEffectiveTimeLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActEffectiveTimeHigh() {
		OperationsTestCase<ProblemConcernAct2> validateProblemConcernActEffectiveTimeHighTestCase = new OperationsTestCase<ProblemConcernAct2>(
			"validateProblemConcernActEffectiveTimeHigh", operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct2 target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernAct2Operations.validateProblemConcernActEffectiveTimeHigh(
					(ProblemConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActEffectiveTimeHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActTemplateId() {
		OperationsTestCase<ProblemConcernAct2> validateProblemConcernActTemplateIdTestCase = new OperationsTestCase<ProblemConcernAct2>(
			"validateProblemConcernActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct2 target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernAct2Operations.validateProblemConcernActTemplateId(
					(ProblemConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActStatusCode() {
		OperationsTestCase<ProblemConcernAct2> validateProblemConcernActStatusCodeTestCase = new OperationsTestCase<ProblemConcernAct2>(
			"validateProblemConcernActStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct2 target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(ProblemConcernAct2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProblemConcernActStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernAct2Operations.validateProblemConcernActStatusCode(
					(ProblemConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActEffectiveTime() {
		OperationsTestCase<ProblemConcernAct2> validateProblemConcernActEffectiveTimeTestCase = new OperationsTestCase<ProblemConcernAct2>(
			"validateProblemConcernActEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct2 target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernAct2Operations.validateProblemConcernActEffectiveTime(
					(ProblemConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActCodeP() {
		OperationsTestCase<ProblemConcernAct2> validateProblemConcernActCodePTestCase = new OperationsTestCase<ProblemConcernAct2>(
			"validateProblemConcernActCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct2 target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernAct2Operations.validateProblemConcernActCodeP(
					(ProblemConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActCode() {
		OperationsTestCase<ProblemConcernAct2> validateProblemConcernActCodeTestCase = new OperationsTestCase<ProblemConcernAct2>(
			"validateProblemConcernActCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct2 target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct2 target) {
				target.init();

			}

			@Override
			protected void setDependency(ProblemConcernAct2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProblemConcernActCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernAct2Operations.validateProblemConcernActCode(
					(ProblemConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProblemConcernAct2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ProblemConcernAct2> {
		@Override
		public ProblemConcernAct2 create() {
			return ConsolFactory.eINSTANCE.createProblemConcernAct2();
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
	private static class ConstructorTestClass extends ProblemConcernAct2Operations {
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

} // ProblemConcernAct2Operations
