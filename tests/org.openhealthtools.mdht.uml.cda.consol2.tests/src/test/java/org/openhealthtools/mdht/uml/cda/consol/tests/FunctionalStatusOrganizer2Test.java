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
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusOrganizer2;
import org.openhealthtools.mdht.uml.cda.consol.operations.FunctionalStatusOrganizer2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Functional Status Organizer2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusOrganizer2#validateFunctionalStatusOrganizer2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Organizer2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusOrganizer2#validateFunctionalStatusOrganizer2FunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation2919(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Organizer2 Functional Status Observation2 Entry Relationship Functional Status Observation2919</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusOrganizer2#validateFunctionalStatusOrganizer2SelfCareActivitiesEntryRelationshipSelfCareActivities921(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Organizer2 Self Care Activities Entry Relationship Self Care Activities921</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusOrganizer2#validateResultOrganizerCodeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Code Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusOrganizer2#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusOrganizer2#validateResultOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusOrganizer2#validateResultOrganizerStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusOrganizer2#validateResultOrganizerStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FunctionalStatusOrganizer2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusOrganizer2AuthorParticipation() {
		OperationsTestCase<FunctionalStatusOrganizer2> validateFunctionalStatusOrganizer2AuthorParticipationTestCase = new OperationsTestCase<FunctionalStatusOrganizer2>(
			"validateFunctionalStatusOrganizer2AuthorParticipation",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_ORGANIZER2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusOrganizer2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusOrganizer2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusOrganizer2Operations.validateFunctionalStatusOrganizer2AuthorParticipation(
					(FunctionalStatusOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusOrganizer2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusOrganizer2FunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation2919() {
		OperationsTestCase<FunctionalStatusOrganizer2> validateFunctionalStatusOrganizer2FunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation2919TestCase = new OperationsTestCase<FunctionalStatusOrganizer2>(
			"validateFunctionalStatusOrganizer2FunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation2919",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_ORGANIZER2_FUNCTIONAL_STATUS_OBSERVATION2_ENTRY_RELATIONSHIP_FUNCTIONAL_STATUS_OBSERVATION2919__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusOrganizer2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusOrganizer2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusOrganizer2Operations.validateFunctionalStatusOrganizer2FunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation2919(
					(FunctionalStatusOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusOrganizer2FunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation2919TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFunctionalStatusOrganizer2SelfCareActivitiesEntryRelationshipSelfCareActivities921() {
		OperationsTestCase<FunctionalStatusOrganizer2> validateFunctionalStatusOrganizer2SelfCareActivitiesEntryRelationshipSelfCareActivities921TestCase = new OperationsTestCase<FunctionalStatusOrganizer2>(
			"validateFunctionalStatusOrganizer2SelfCareActivitiesEntryRelationshipSelfCareActivities921",
			operationsForOCL.getOCLValue(
				"VALIDATE_FUNCTIONAL_STATUS_ORGANIZER2_SELF_CARE_ACTIVITIES_ENTRY_RELATIONSHIP_SELF_CARE_ACTIVITIES921__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusOrganizer2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusOrganizer2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusOrganizer2Operations.validateFunctionalStatusOrganizer2SelfCareActivitiesEntryRelationshipSelfCareActivities921(
					(FunctionalStatusOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusOrganizer2SelfCareActivitiesEntryRelationshipSelfCareActivities921TestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateResultOrganizerCodeValue() {
		OperationsTestCase<FunctionalStatusOrganizer2> validateResultOrganizerCodeValueTestCase = new OperationsTestCase<FunctionalStatusOrganizer2>(
			"validateResultOrganizerCodeValue",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusOrganizer2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusOrganizer2 target) {
				target.init();

				// CD value = DatatypesFactory.eINSTANCE.createCD();
				// target.getValues().add(value);
				//

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusOrganizer2Operations.validateResultOrganizerCodeValue(
					(FunctionalStatusOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerCodeValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultOrganizerTemplateId() {
		OperationsTestCase<FunctionalStatusOrganizer2> validateResultOrganizerTemplateIdTestCase = new OperationsTestCase<FunctionalStatusOrganizer2>(
			"validateResultOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusOrganizer2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusOrganizer2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusOrganizer2Operations.validateResultOrganizerTemplateId(
					(FunctionalStatusOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultOrganizerCode() {
		OperationsTestCase<FunctionalStatusOrganizer2> validateResultOrganizerCodeTestCase = new OperationsTestCase<FunctionalStatusOrganizer2>(
			"validateResultOrganizerCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusOrganizer2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusOrganizer2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusOrganizer2Operations.validateResultOrganizerCode(
					(FunctionalStatusOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultOrganizerStatusCodeP() {
		OperationsTestCase<FunctionalStatusOrganizer2> validateResultOrganizerStatusCodePTestCase = new OperationsTestCase<FunctionalStatusOrganizer2>(
			"validateResultOrganizerStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusOrganizer2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusOrganizer2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusOrganizer2Operations.validateResultOrganizerStatusCodeP(
					(FunctionalStatusOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultOrganizerStatusCode() {
		OperationsTestCase<FunctionalStatusOrganizer2> validateResultOrganizerStatusCodeTestCase = new OperationsTestCase<FunctionalStatusOrganizer2>(
			"validateResultOrganizerStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusOrganizer2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusOrganizer2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(FunctionalStatusOrganizer2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ResultOrganizerStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusOrganizer2Operations.validateResultOrganizerStatusCode(
					(FunctionalStatusOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FunctionalStatusOrganizer2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<FunctionalStatusOrganizer2> {
		@Override
		public FunctionalStatusOrganizer2 create() {
			return ConsolFactory.eINSTANCE.createFunctionalStatusOrganizer2();
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
	private static class ConstructorTestClass extends FunctionalStatusOrganizer2Operations {
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

} // FunctionalStatusOrganizer2Operations
