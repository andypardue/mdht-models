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
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlannedProcedure2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planned Procedure2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2CodeFromLoincOrSnomed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Code From Loinc Or Snomed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2CodeFromCptOrIcd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Code From Cpt Or Icd</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2Instruction2InversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Instruction2 Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2StatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2MethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2TargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2TargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2Performer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2EntryRelationship976(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Entry Relationship976</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2EntryRelationship978(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Entry Relationship978</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2EntryRelationship980(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Entry Relationship980</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2EntryRelationship982(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Entry Relationship982</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2PriorityPreferenceEntryRelationshipPriorityPreference977(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Priority Preference Entry Relationship Priority Preference977</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2Indication2EntryRelationshipIndication2979(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Indication2 Entry Relationship Indication2979</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2Instruction2EntryRelationshipInstruction2981(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Instruction2 Entry Relationship Instruction2981</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlannedProcedure2PlannedCoverageEntryRelationshipPlannedCoverage983(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure2 Planned Coverage Entry Relationship Planned Coverage983</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlanOfCareActivityProcedureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Procedure Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2#validatePlanOfCareActivityProcedureMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Procedure Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlannedProcedure2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedProcedure2CodeFromLoincOrSnomed() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2CodeFromLoincOrSnomedTestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2CodeFromLoincOrSnomed",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_PROCEDURE2_CODE_FROM_LOINC_OR_SNOMED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2CodeFromLoincOrSnomed(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2CodeFromLoincOrSnomedTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedProcedure2CodeFromCptOrIcd() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2CodeFromCptOrIcdTestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2CodeFromCptOrIcd", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_PROCEDURE2_CODE_FROM_CPT_OR_ICD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2CodeFromCptOrIcd(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2CodeFromCptOrIcdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedProcedure2Instruction2InversionInd() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2Instruction2InversionIndTestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2Instruction2InversionInd",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_PROCEDURE2_INSTRUCTION2_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2Instruction2InversionInd(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2Instruction2InversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedProcedure2Code() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2CodeTestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2Code",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2Code(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedProcedure2StatusCode() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2StatusCodeTestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2StatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2StatusCode(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2StatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedProcedure2StatusCodeP() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2StatusCodePTestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2StatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2StatusCodeP(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2StatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedProcedure2EffectiveTime() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2EffectiveTimeTestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2EffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2EffectiveTime(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedProcedure2MethodCode() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2MethodCodeTestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2MethodCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE2_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2MethodCode(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2MethodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedProcedure2TargetSiteCodeP() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2TargetSiteCodePTestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2TargetSiteCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_PROCEDURE2_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2TargetSiteCodeP(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2TargetSiteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedProcedure2TargetSiteCode() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2TargetSiteCodeTestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2TargetSiteCode", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_PROCEDURE2_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				target.init();

			}

			@Override
			protected void setDependency(PlannedProcedure2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2TargetSiteCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2TargetSiteCode(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2TargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedProcedure2Performer() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2PerformerTestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2Performer",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2Performer(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2PerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedProcedure2AuthorParticipation() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2AuthorParticipationTestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2AuthorParticipation", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_PROCEDURE2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2AuthorParticipation(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedProcedure2EntryRelationship976() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2EntryRelationship976TestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2EntryRelationship976", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_PROCEDURE2_ENTRY_RELATIONSHIP976__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2EntryRelationship976(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2EntryRelationship976TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedProcedure2EntryRelationship978() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2EntryRelationship978TestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2EntryRelationship978", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_PROCEDURE2_ENTRY_RELATIONSHIP978__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2EntryRelationship978(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2EntryRelationship978TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedProcedure2EntryRelationship980() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2EntryRelationship980TestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2EntryRelationship980", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_PROCEDURE2_ENTRY_RELATIONSHIP980__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2EntryRelationship980(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2EntryRelationship980TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedProcedure2EntryRelationship982() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2EntryRelationship982TestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2EntryRelationship982", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_PROCEDURE2_ENTRY_RELATIONSHIP982__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2EntryRelationship982(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2EntryRelationship982TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedProcedure2PriorityPreferenceEntryRelationshipPriorityPreference977() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2PriorityPreferenceEntryRelationshipPriorityPreference977TestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2PriorityPreferenceEntryRelationshipPriorityPreference977",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_PROCEDURE2_PRIORITY_PREFERENCE_ENTRY_RELATIONSHIP_PRIORITY_PREFERENCE977__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2PriorityPreferenceEntryRelationshipPriorityPreference977(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2PriorityPreferenceEntryRelationshipPriorityPreference977TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedProcedure2Indication2EntryRelationshipIndication2979() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2Indication2EntryRelationshipIndication2979TestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2Indication2EntryRelationshipIndication2979",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_PROCEDURE2_INDICATION2_ENTRY_RELATIONSHIP_INDICATION2979__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2Indication2EntryRelationshipIndication2979(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2Indication2EntryRelationshipIndication2979TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedProcedure2Instruction2EntryRelationshipInstruction2981() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2Instruction2EntryRelationshipInstruction2981TestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2Instruction2EntryRelationshipInstruction2981",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_PROCEDURE2_INSTRUCTION2_ENTRY_RELATIONSHIP_INSTRUCTION2981__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2Instruction2EntryRelationshipInstruction2981(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2Instruction2EntryRelationshipInstruction2981TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedProcedure2PlannedCoverageEntryRelationshipPlannedCoverage983() {
		OperationsTestCase<PlannedProcedure2> validatePlannedProcedure2PlannedCoverageEntryRelationshipPlannedCoverage983TestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlannedProcedure2PlannedCoverageEntryRelationshipPlannedCoverage983",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_PROCEDURE2_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_PLANNED_COVERAGE983__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlannedProcedure2PlannedCoverageEntryRelationshipPlannedCoverage983(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedure2PlannedCoverageEntryRelationshipPlannedCoverage983TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareActivityProcedureTemplateId() {
		OperationsTestCase<PlannedProcedure2> validatePlanOfCareActivityProcedureTemplateIdTestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlanOfCareActivityProcedureTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_CARE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlanOfCareActivityProcedureTemplateId(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivityProcedureTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareActivityProcedureMoodCode() {
		OperationsTestCase<PlannedProcedure2> validatePlanOfCareActivityProcedureMoodCodeTestCase = new OperationsTestCase<PlannedProcedure2>(
			"validatePlanOfCareActivityProcedureMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_CARE_ACTIVITY_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedure2 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedure2Operations.validatePlanOfCareActivityProcedureMoodCode(
					(PlannedProcedure2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivityProcedureMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PlannedProcedure2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<PlannedProcedure2> {
		@Override
		public PlannedProcedure2 create() {
			return ConsolFactory.eINSTANCE.createPlannedProcedure2();
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
	private static class ConstructorTestClass extends PlannedProcedure2Operations {
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

} // PlannedProcedure2Operations
