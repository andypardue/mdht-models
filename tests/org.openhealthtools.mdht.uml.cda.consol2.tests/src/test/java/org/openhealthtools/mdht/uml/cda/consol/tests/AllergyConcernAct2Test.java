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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AllergyConcernAct2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergy Concern Act2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyConcernAct2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Concern Act2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyConcernAct2EntryRelationship888(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Concern Act2 Entry Relationship888</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyConcernAct2AllergyObservation2EntryRelationshipAllergyObservation2889(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Concern Act2 Allergy Observation2 Entry Relationship Allergy Observation2889</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyProblemActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyProblemActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyProblemActCDCodeAndCodeSystemValues(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act CD Code And Code System Values</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyProblemActCDCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act CD Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyProblemActCDCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act CD Code System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AllergyConcernAct2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyConcernAct2AuthorParticipation() {
		OperationsTestCase<AllergyConcernAct2> validateAllergyConcernAct2AuthorParticipationTestCase = new OperationsTestCase<AllergyConcernAct2>(
			"validateAllergyConcernAct2AuthorParticipation", operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_CONCERN_ACT2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyConcernAct2 target) {

			}

			@Override
			protected void updateToPass(AllergyConcernAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyConcernAct2Operations.validateAllergyConcernAct2AuthorParticipation(
					(AllergyConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyConcernAct2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAllergyConcernAct2EntryRelationship888() {
		OperationsTestCase<AllergyConcernAct2> validateAllergyConcernAct2EntryRelationship888TestCase = new OperationsTestCase<AllergyConcernAct2>(
			"validateAllergyConcernAct2EntryRelationship888", operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_CONCERN_ACT2_ENTRY_RELATIONSHIP888__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyConcernAct2 target) {

			}

			@Override
			protected void updateToPass(AllergyConcernAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyConcernAct2Operations.validateAllergyConcernAct2EntryRelationship888(
					(AllergyConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyConcernAct2EntryRelationship888TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAllergyConcernAct2AllergyObservation2EntryRelationshipAllergyObservation2889() {
		OperationsTestCase<AllergyConcernAct2> validateAllergyConcernAct2AllergyObservation2EntryRelationshipAllergyObservation2889TestCase = new OperationsTestCase<AllergyConcernAct2>(
			"validateAllergyConcernAct2AllergyObservation2EntryRelationshipAllergyObservation2889",
			operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_CONCERN_ACT2_ALLERGY_OBSERVATION2_ENTRY_RELATIONSHIP_ALLERGY_OBSERVATION2889__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyConcernAct2 target) {

			}

			@Override
			protected void updateToPass(AllergyConcernAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyConcernAct2Operations.validateAllergyConcernAct2AllergyObservation2EntryRelationshipAllergyObservation2889(
					(AllergyConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyConcernAct2AllergyObservation2EntryRelationshipAllergyObservation2889TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActTemplateId() {
		OperationsTestCase<AllergyConcernAct2> validateAllergyProblemActTemplateIdTestCase = new OperationsTestCase<AllergyConcernAct2>(
			"validateAllergyProblemActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyConcernAct2 target) {

			}

			@Override
			protected void updateToPass(AllergyConcernAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyConcernAct2Operations.validateAllergyProblemActTemplateId(
					(AllergyConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActCode() {
		OperationsTestCase<AllergyConcernAct2> validateAllergyProblemActCodeTestCase = new OperationsTestCase<AllergyConcernAct2>(
			"validateAllergyProblemActCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyConcernAct2 target) {

			}

			@Override
			protected void updateToPass(AllergyConcernAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyConcernAct2Operations.validateAllergyProblemActCode(
					(AllergyConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActCDCodeAndCodeSystemValues() {
		OperationsTestCase<AllergyConcernAct2> validateAllergyProblemActCDCodeAndCodeSystemValuesTestCase = new OperationsTestCase<AllergyConcernAct2>(
			"validateAllergyProblemActCDCodeAndCodeSystemValues",
			operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_PROBLEM_ACT_CD_CODE_AND_CODE_SYSTEM_VALUES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyConcernAct2 target) {

			}

			@Override
			protected void updateToPass(AllergyConcernAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyConcernAct2Operations.validateAllergyProblemActCDCodeAndCodeSystemValues(
					(AllergyConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActCDCodeAndCodeSystemValuesTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActCDCode() {
		OperationsTestCase<AllergyConcernAct2> validateAllergyProblemActCDCodeTestCase = new OperationsTestCase<AllergyConcernAct2>(
			"validateAllergyProblemActCDCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyConcernAct2 target) {

			}

			@Override
			protected void updateToPass(AllergyConcernAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyConcernAct2Operations.validateAllergyProblemActCDCode(
					(AllergyConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActCDCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActCDCodeSystem() {
		OperationsTestCase<AllergyConcernAct2> validateAllergyProblemActCDCodeSystemTestCase = new OperationsTestCase<AllergyConcernAct2>(
			"validateAllergyProblemActCDCodeSystem",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyConcernAct2 target) {

			}

			@Override
			protected void updateToPass(AllergyConcernAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyConcernAct2Operations.validateAllergyProblemActCDCodeSystem(
					(AllergyConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActCDCodeSystemTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AllergyConcernAct2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<AllergyConcernAct2> {
		@Override
		public AllergyConcernAct2 create() {
			return ConsolFactory.eINSTANCE.createAllergyConcernAct2();
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
	private static class ConstructorTestClass extends AllergyConcernAct2Operations {
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

} // AllergyConcernAct2Operations
