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
import org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.DeceasedObservation2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Deceased Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation2#validateDeceasedObservation2EntryRelationship900(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deceased Observation2 Entry Relationship900</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation2#validateDeceasedObservation2ProblemObservation2EntryRelationshipProblemObservation2901(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deceased Observation2 Problem Observation2 Entry Relationship Problem Observation2901</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation2#validateDeceasedObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deceased Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation2#validateDeceasedObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deceased Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation2#validateDeceasedObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deceased Observation Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DeceasedObservation2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDeceasedObservation2EntryRelationship900() {
		OperationsTestCase<DeceasedObservation2> validateDeceasedObservation2EntryRelationship900TestCase = new OperationsTestCase<DeceasedObservation2>(
			"validateDeceasedObservation2EntryRelationship900",
			operationsForOCL.getOCLValue(
				"VALIDATE_DECEASED_OBSERVATION2_ENTRY_RELATIONSHIP900__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeceasedObservation2 target) {

			}

			@Override
			protected void updateToPass(DeceasedObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeceasedObservation2Operations.validateDeceasedObservation2EntryRelationship900(
					(DeceasedObservation2) objectToTest, diagnostician, map);
			}

		};

		validateDeceasedObservation2EntryRelationship900TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDeceasedObservation2ProblemObservation2EntryRelationshipProblemObservation2901() {
		OperationsTestCase<DeceasedObservation2> validateDeceasedObservation2ProblemObservation2EntryRelationshipProblemObservation2901TestCase = new OperationsTestCase<DeceasedObservation2>(
			"validateDeceasedObservation2ProblemObservation2EntryRelationshipProblemObservation2901",
			operationsForOCL.getOCLValue(
				"VALIDATE_DECEASED_OBSERVATION2_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION2901__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeceasedObservation2 target) {

			}

			@Override
			protected void updateToPass(DeceasedObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeceasedObservation2Operations.validateDeceasedObservation2ProblemObservation2EntryRelationshipProblemObservation2901(
					(DeceasedObservation2) objectToTest, diagnostician, map);
			}

		};

		validateDeceasedObservation2ProblemObservation2EntryRelationshipProblemObservation2901TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDeceasedObservationTemplateId() {
		OperationsTestCase<DeceasedObservation2> validateDeceasedObservationTemplateIdTestCase = new OperationsTestCase<DeceasedObservation2>(
			"validateDeceasedObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DECEASED_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeceasedObservation2 target) {

			}

			@Override
			protected void updateToPass(DeceasedObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeceasedObservation2Operations.validateDeceasedObservationTemplateId(
					(DeceasedObservation2) objectToTest, diagnostician, map);
			}

		};

		validateDeceasedObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDeceasedObservationCodeP() {
		OperationsTestCase<DeceasedObservation2> validateDeceasedObservationCodePTestCase = new OperationsTestCase<DeceasedObservation2>(
			"validateDeceasedObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_DECEASED_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeceasedObservation2 target) {

			}

			@Override
			protected void updateToPass(DeceasedObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeceasedObservation2Operations.validateDeceasedObservationCodeP(
					(DeceasedObservation2) objectToTest, diagnostician, map);
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
		OperationsTestCase<DeceasedObservation2> validateDeceasedObservationCodeTestCase = new OperationsTestCase<DeceasedObservation2>(
			"validateDeceasedObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_DECEASED_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeceasedObservation2 target) {

			}

			@Override
			protected void updateToPass(DeceasedObservation2 target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected void setDependency(DeceasedObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.DeceasedObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeceasedObservation2Operations.validateDeceasedObservationCode(
					(DeceasedObservation2) objectToTest, diagnostician, map);
			}

		};

		validateDeceasedObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DeceasedObservation2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<DeceasedObservation2> {
		@Override
		public DeceasedObservation2 create() {
			return ConsolFactory.eINSTANCE.createDeceasedObservation2();
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
	private static class ConstructorTestClass extends DeceasedObservation2Operations {
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

} // DeceasedObservation2Operations
