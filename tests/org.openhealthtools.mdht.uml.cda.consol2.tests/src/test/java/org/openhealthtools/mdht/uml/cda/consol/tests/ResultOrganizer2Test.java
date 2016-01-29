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
import org.junit.Ignore;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ResultOrganizer2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Result Organizer2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer2#validateResultOrganizer2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer2#validateResultOrganizer2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer2#validateResultOrganizer2IVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer2 IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer2#validateResultOrganizer2IVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer2 IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer2#validateResultOrganizer2ResultObservation2EntryRelationshipResultObservation21043(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer2 Result Observation2 Entry Relationship Result Observation21043</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer2#validateResultOrganizerCodeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Code Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer2#validateResultOrganizerClassCodeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Class Code Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer2#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ResultOrganizer2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultOrganizer2EffectiveTime() {
		OperationsTestCase<ResultOrganizer2> validateResultOrganizer2EffectiveTimeTestCase = new OperationsTestCase<ResultOrganizer2>(
			"validateResultOrganizer2EffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer2 target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizer2Operations.validateResultOrganizer2EffectiveTime(
					(ResultOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizer2EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultOrganizer2AuthorParticipation() {
		OperationsTestCase<ResultOrganizer2> validateResultOrganizer2AuthorParticipationTestCase = new OperationsTestCase<ResultOrganizer2>(
			"validateResultOrganizer2AuthorParticipation", operationsForOCL.getOCLValue(
				"VALIDATE_RESULT_ORGANIZER2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer2 target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizer2Operations.validateResultOrganizer2AuthorParticipation(
					(ResultOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizer2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultOrganizer2IVLTSLow() {
		OperationsTestCase<ResultOrganizer2> validateResultOrganizer2IVLTSLowTestCase = new OperationsTestCase<ResultOrganizer2>(
			"validateResultOrganizer2IVLTSLow",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer2 target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizer2Operations.validateResultOrganizer2IVLTSLow(
					(ResultOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizer2IVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultOrganizer2IVLTSHigh() {
		OperationsTestCase<ResultOrganizer2> validateResultOrganizer2IVLTSHighTestCase = new OperationsTestCase<ResultOrganizer2>(
			"validateResultOrganizer2IVLTSHigh",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer2 target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizer2Operations.validateResultOrganizer2IVLTSHigh(
					(ResultOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizer2IVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateResultOrganizer2ResultObservation2EntryRelationshipResultObservation21043() {
		OperationsTestCase<ResultOrganizer2> validateResultOrganizer2ResultObservation2EntryRelationshipResultObservation21043TestCase = new OperationsTestCase<ResultOrganizer2>(
			"validateResultOrganizer2ResultObservation2EntryRelationshipResultObservation21043",
			operationsForOCL.getOCLValue(
				"VALIDATE_RESULT_ORGANIZER2_RESULT_OBSERVATION2_ENTRY_RELATIONSHIP_RESULT_OBSERVATION21043__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer2 target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizer2Operations.validateResultOrganizer2ResultObservation2EntryRelationshipResultObservation21043(
					(ResultOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizer2ResultObservation2EntryRelationshipResultObservation21043TestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateResultOrganizerCodeValue() {
		OperationsTestCase<ResultOrganizer2> validateResultOrganizerCodeValueTestCase = new OperationsTestCase<ResultOrganizer2>(
			"validateResultOrganizerCodeValue",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer2 target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer2 target) {
				target.init();

				DatatypesFactory.eINSTANCE.createCD();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizer2Operations.validateResultOrganizerCodeValue(
					(ResultOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerCodeValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Test
	@Ignore
	public void testValidateResultOrganizerClassCodeValue() {
		OperationsTestCase<ResultOrganizer2> validateResultOrganizerClassCodeValueTestCase = new OperationsTestCase<ResultOrganizer2>(
			"validateResultOrganizerClassCodeValue",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_CLASS_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer2 target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer2 target) {
				target.init();

				DatatypesFactory.eINSTANCE.createCD();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizer2Operations.validateResultOrganizerClassCodeValue(
					(ResultOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerClassCodeValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultOrganizerTemplateId() {
		OperationsTestCase<ResultOrganizer2> validateResultOrganizerTemplateIdTestCase = new OperationsTestCase<ResultOrganizer2>(
			"validateResultOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer2 target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizer2Operations.validateResultOrganizerTemplateId(
					(ResultOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ResultOrganizer2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ResultOrganizer2> {
		@Override
		public ResultOrganizer2 create() {
			return ConsolFactory.eINSTANCE.createResultOrganizer2();
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
	private static class ConstructorTestClass extends ResultOrganizer2Operations {
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

} // ResultOrganizer2Operations
