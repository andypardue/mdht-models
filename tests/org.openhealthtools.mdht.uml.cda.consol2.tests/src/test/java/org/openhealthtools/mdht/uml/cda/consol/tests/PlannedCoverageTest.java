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
import org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlannedCoverageOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planned Coverage</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageEntryRelationshipActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageEntryRelationshipActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageEntryRelationshipActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageEntryRelationshipActCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Act Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageEntryRelationshipActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageEntryRelationshipActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageEntryRelationshipActStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Act Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageEntryRelationshipTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageEntryRelationshipAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Act</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlannedCoverageTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedCoverageTemplateId() {
		OperationsTestCase<PlannedCoverage> validatePlannedCoverageTemplateIdTestCase = new OperationsTestCase<PlannedCoverage>(
			"validatePlannedCoverageTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_COVERAGE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedCoverage target) {

			}

			@Override
			protected void updateToPass(PlannedCoverage target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedCoverageOperations.validatePlannedCoverageTemplateId(
					(PlannedCoverage) objectToTest, diagnostician, map);
			}

		};

		validatePlannedCoverageTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedCoverageClassCode() {
		OperationsTestCase<PlannedCoverage> validatePlannedCoverageClassCodeTestCase = new OperationsTestCase<PlannedCoverage>(
			"validatePlannedCoverageClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_COVERAGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedCoverage target) {

			}

			@Override
			protected void updateToPass(PlannedCoverage target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedCoverageOperations.validatePlannedCoverageClassCode(
					(PlannedCoverage) objectToTest, diagnostician, map);
			}

		};

		validatePlannedCoverageClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedCoverageMoodCode() {
		OperationsTestCase<PlannedCoverage> validatePlannedCoverageMoodCodeTestCase = new OperationsTestCase<PlannedCoverage>(
			"validatePlannedCoverageMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_COVERAGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedCoverage target) {

			}

			@Override
			protected void updateToPass(PlannedCoverage target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedCoverageOperations.validatePlannedCoverageMoodCode(
					(PlannedCoverage) objectToTest, diagnostician, map);
			}

		};

		validatePlannedCoverageMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedCoverageId() {
		OperationsTestCase<PlannedCoverage> validatePlannedCoverageIdTestCase = new OperationsTestCase<PlannedCoverage>(
			"validatePlannedCoverageId",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_COVERAGE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedCoverage target) {

			}

			@Override
			protected void updateToPass(PlannedCoverage target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedCoverageOperations.validatePlannedCoverageId(
					(PlannedCoverage) objectToTest, diagnostician, map);
			}

		};

		validatePlannedCoverageIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedCoverageCodeP() {
		OperationsTestCase<PlannedCoverage> validatePlannedCoverageCodePTestCase = new OperationsTestCase<PlannedCoverage>(
			"validatePlannedCoverageCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_COVERAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedCoverage target) {

			}

			@Override
			protected void updateToPass(PlannedCoverage target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedCoverageOperations.validatePlannedCoverageCodeP(
					(PlannedCoverage) objectToTest, diagnostician, map);
			}

		};

		validatePlannedCoverageCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedCoverageCode() {
		OperationsTestCase<PlannedCoverage> validatePlannedCoverageCodeTestCase = new OperationsTestCase<PlannedCoverage>(
			"validatePlannedCoverageCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_COVERAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedCoverage target) {

			}

			@Override
			protected void updateToPass(PlannedCoverage target) {
				target.init();

			}

			@Override
			protected void setDependency(PlannedCoverage target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PlannedCoverageCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedCoverageOperations.validatePlannedCoverageCode(
					(PlannedCoverage) objectToTest, diagnostician, map);
			}

		};

		validatePlannedCoverageCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedCoverageStatusCode() {
		OperationsTestCase<PlannedCoverage> validatePlannedCoverageStatusCodeTestCase = new OperationsTestCase<PlannedCoverage>(
			"validatePlannedCoverageStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_COVERAGE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedCoverage target) {

			}

			@Override
			protected void updateToPass(PlannedCoverage target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedCoverageOperations.validatePlannedCoverageStatusCode(
					(PlannedCoverage) objectToTest, diagnostician, map);
			}

		};

		validatePlannedCoverageStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedCoverageStatusCodeP() {
		OperationsTestCase<PlannedCoverage> validatePlannedCoverageStatusCodePTestCase = new OperationsTestCase<PlannedCoverage>(
			"validatePlannedCoverageStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_COVERAGE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedCoverage target) {

			}

			@Override
			protected void updateToPass(PlannedCoverage target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedCoverageOperations.validatePlannedCoverageStatusCodeP(
					(PlannedCoverage) objectToTest, diagnostician, map);
			}

		};

		validatePlannedCoverageStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedCoverageEntryRelationship() {
		OperationsTestCase<PlannedCoverage> validatePlannedCoverageEntryRelationshipTestCase = new OperationsTestCase<PlannedCoverage>(
			"validatePlannedCoverageEntryRelationship", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedCoverage target) {

			}

			@Override
			protected void updateToPass(PlannedCoverage target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedCoverageOperations.validatePlannedCoverageEntryRelationship(
					(PlannedCoverage) objectToTest, diagnostician, map);
			}

		};

		validatePlannedCoverageEntryRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedCoverageAuthorParticipation() {
		OperationsTestCase<PlannedCoverage> validatePlannedCoverageAuthorParticipationTestCase = new OperationsTestCase<PlannedCoverage>(
			"validatePlannedCoverageAuthorParticipation", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_COVERAGE_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedCoverage target) {

			}

			@Override
			protected void updateToPass(PlannedCoverage target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedCoverageOperations.validatePlannedCoverageAuthorParticipation(
					(PlannedCoverage) objectToTest, diagnostician, map);
			}

		};

		validatePlannedCoverageAuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedCoverageEntryRelationshipActClassCode() {
		OperationsTestCase<PlannedCoverage> validatePlannedCoverageEntryRelationshipActClassCodeTestCase = new OperationsTestCase<PlannedCoverage>(
			"validatePlannedCoverageEntryRelationshipActClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedCoverage target) {

			}

			@Override
			protected void updateToPass(PlannedCoverage target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedCoverageOperations.validatePlannedCoverageEntryRelationshipActClassCode(
					(PlannedCoverage) objectToTest, diagnostician, map);
			}

		};

		validatePlannedCoverageEntryRelationshipActClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedCoverageEntryRelationshipActMoodCode() {
		OperationsTestCase<PlannedCoverage> validatePlannedCoverageEntryRelationshipActMoodCodeTestCase = new OperationsTestCase<PlannedCoverage>(
			"validatePlannedCoverageEntryRelationshipActMoodCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedCoverage target) {

			}

			@Override
			protected void updateToPass(PlannedCoverage target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedCoverageOperations.validatePlannedCoverageEntryRelationshipActMoodCode(
					(PlannedCoverage) objectToTest, diagnostician, map);
			}

		};

		validatePlannedCoverageEntryRelationshipActMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedCoverageEntryRelationshipActId() {
		OperationsTestCase<PlannedCoverage> validatePlannedCoverageEntryRelationshipActIdTestCase = new OperationsTestCase<PlannedCoverage>(
			"validatePlannedCoverageEntryRelationshipActId", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedCoverage target) {

			}

			@Override
			protected void updateToPass(PlannedCoverage target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedCoverageOperations.validatePlannedCoverageEntryRelationshipActId(
					(PlannedCoverage) objectToTest, diagnostician, map);
			}

		};

		validatePlannedCoverageEntryRelationshipActIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedCoverageEntryRelationshipActCodeP() {
		OperationsTestCase<PlannedCoverage> validatePlannedCoverageEntryRelationshipActCodePTestCase = new OperationsTestCase<PlannedCoverage>(
			"validatePlannedCoverageEntryRelationshipActCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedCoverage target) {

			}

			@Override
			protected void updateToPass(PlannedCoverage target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedCoverageOperations.validatePlannedCoverageEntryRelationshipActCodeP(
					(PlannedCoverage) objectToTest, diagnostician, map);
			}

		};

		validatePlannedCoverageEntryRelationshipActCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedCoverageEntryRelationshipActCode() {
		OperationsTestCase<PlannedCoverage> validatePlannedCoverageEntryRelationshipActCodeTestCase = new OperationsTestCase<PlannedCoverage>(
			"validatePlannedCoverageEntryRelationshipActCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedCoverage target) {

			}

			@Override
			protected void updateToPass(PlannedCoverage target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedCoverageOperations.validatePlannedCoverageEntryRelationshipActCode(
					(PlannedCoverage) objectToTest, diagnostician, map);
			}

		};

		validatePlannedCoverageEntryRelationshipActCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedCoverageEntryRelationshipActStatusCode() {
		OperationsTestCase<PlannedCoverage> validatePlannedCoverageEntryRelationshipActStatusCodeTestCase = new OperationsTestCase<PlannedCoverage>(
			"validatePlannedCoverageEntryRelationshipActStatusCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedCoverage target) {

			}

			@Override
			protected void updateToPass(PlannedCoverage target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedCoverageOperations.validatePlannedCoverageEntryRelationshipActStatusCode(
					(PlannedCoverage) objectToTest, diagnostician, map);
			}

		};

		validatePlannedCoverageEntryRelationshipActStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedCoverageEntryRelationshipActStatusCodeP() {
		OperationsTestCase<PlannedCoverage> validatePlannedCoverageEntryRelationshipActStatusCodePTestCase = new OperationsTestCase<PlannedCoverage>(
			"validatePlannedCoverageEntryRelationshipActStatusCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedCoverage target) {

			}

			@Override
			protected void updateToPass(PlannedCoverage target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedCoverageOperations.validatePlannedCoverageEntryRelationshipActStatusCodeP(
					(PlannedCoverage) objectToTest, diagnostician, map);
			}

		};

		validatePlannedCoverageEntryRelationshipActStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*
	*/
	@Test
	public void testValidatePlannedCoverageEntryRelationshipTypeCode() {
		OperationsTestCase<PlannedCoverage> validatePlannedCoverageEntryRelationshipTypeCodeTestCase = new OperationsTestCase<PlannedCoverage>(
			"validatePlannedCoverageEntryRelationshipTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedCoverage target) {

			}

			@Override
			protected void updateToPass(PlannedCoverage target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedCoverageOperations.validatePlannedCoverageEntryRelationshipTypeCode(
					(PlannedCoverage) objectToTest, diagnostician, map);
			}

		};

		validatePlannedCoverageEntryRelationshipTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedCoverageEntryRelationshipAct() {
		OperationsTestCase<PlannedCoverage> validatePlannedCoverageEntryRelationshipActTestCase = new OperationsTestCase<PlannedCoverage>(
			"validatePlannedCoverageEntryRelationshipAct", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedCoverage target) {

			}

			@Override
			protected void updateToPass(PlannedCoverage target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedCoverageOperations.validatePlannedCoverageEntryRelationshipAct(
					(PlannedCoverage) objectToTest, diagnostician, map);
			}

		};

		validatePlannedCoverageEntryRelationshipActTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PlannedCoverageOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PlannedCoverage> {
		@Override
		public PlannedCoverage create() {
			return ConsolFactory.eINSTANCE.createPlannedCoverage();
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
	private static class ConstructorTestClass extends PlannedCoverageOperations {
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

} // PlannedCoverageOperations
