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
import org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ContinuityOfCareDocument2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Continuity Of Care Document2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2Author(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2Component1266(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component1266</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Author Assigned Author Has Assigned Person Or Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Author Assigned Author Has Represent Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2AuthorAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Author Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Assigned Entity Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Assigned Entity Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentAllergiesSection21269(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Allergies Section21269</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentMedicationsSection21271(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Medications Section21271</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentProblemSection21273(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Problem Section21273</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentProceduresSection21275(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Procedures Section21275</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentResultsSection21277(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Results Section21277</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21279(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Advance Directives Section Entries Optional21279</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentEncountersSectionEntriesOptional21281(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Encounters Section Entries Optional21281</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentFamilyHistorySection21283(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Family History Section21283</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentFunctionalStatusSection21285(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Functional Status Section21285</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentImmunizationsSection21287(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Immunizations Section21287</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentMedicalEquipmentSection21289(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Medical Equipment Section21289</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentPayersSection21291(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Payers Section21291</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentPlanOfTreatmentSection21293(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Plan Of Treatment Section21293</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentSocialHistorySection21295(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Social History Section21295</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentVitalSignsSection21297(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Vital Signs Section21297</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentMentalStatusSection1299(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Mental Status Section1299</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyComponentNutritionSection1301(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Component Nutrition Section1301</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyAllergiesSection21268(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Allergies Section21268</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyMedicationsSection21270(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Medications Section21270</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyProblemSection21272(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Problem Section21272</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyProceduresSection21274(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Procedures Section21274</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyResultsSection21276(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Results Section21276</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21278(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Advance Directives Section Entries Optional21278</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyEncountersSectionEntriesOptional21280(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Encounters Section Entries Optional21280</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyFamilyHistorySection21282(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Family History Section21282</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyFunctionalStatusSection21284(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Functional Status Section21284</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyImmunizationsSection21286(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Immunizations Section21286</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyMedicalEquipmentSection21288(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Medical Equipment Section21288</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyPayersSection21290(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Payers Section21290</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyPlanOfTreatmentSection21292(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Plan Of Treatment Section21292</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodySocialHistorySection21294(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Social History Section21294</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyVitalSignsSection21296(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Vital Signs Section21296</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyMentalStatusSection1298(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Mental Status Section1298</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBodyNutritionSection1300(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body Nutrition Section1300</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ComponentStructuredBody1267(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Component Structured Body1267</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ContinuityOfCareDocument2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocument2CodeP() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2CodePTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2CodeP", operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2CodeP(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocument2Code() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2CodeTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2Code",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected void setDependency(ContinuityOfCareDocument2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2CodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2Code(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocument2Author() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2AuthorTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2Author", operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2Author(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2AuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocument2DocumentationOf() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2DocumentationOfTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2DocumentationOf",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOf(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2DocumentationOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2Component1266() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2Component1266TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2Component1266", operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT1266__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2Component1266(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2Component1266TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganizationTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR_HAS_ASSIGNED_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganization() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganizationTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR_HAS_REPRESENT_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganization(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocument2AuthorAssignedAuthor() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2AuthorAssignedAuthorTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2AuthorAssignedAuthor",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2AuthorAssignedAuthor(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2AuthorAssignedAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLow() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLowTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLow",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLow(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHigh() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHighTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHigh",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHigh(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifierTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifierTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityId() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityIdTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityId",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityId(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPerson() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPersonTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPerson",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPerson(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCode() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCodeTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCode(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntity() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntity(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocument2DocumentationOfServiceEventClassCode() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2DocumentationOfServiceEventClassCodeTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2DocumentationOfServiceEventClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventClassCode(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2DocumentationOfServiceEventClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTime() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTimeTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTime(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocument2DocumentationOfServiceEventPerformer() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2DocumentationOfServiceEventPerformer",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEventPerformer(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocument2DocumentationOfServiceEvent() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2DocumentationOfServiceEventTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2DocumentationOfServiceEvent",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2DocumentationOfServiceEvent(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2DocumentationOfServiceEventTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodyComponentAllergiesSection21269() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodyComponentAllergiesSection21269TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodyComponentAllergiesSection21269",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION21269__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentAllergiesSection21269(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodyComponentAllergiesSection21269TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodyComponentMedicationsSection21271() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodyComponentMedicationsSection21271TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodyComponentMedicationsSection21271",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION21271__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentMedicationsSection21271(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodyComponentMedicationsSection21271TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodyComponentProblemSection21273() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodyComponentProblemSection21273TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodyComponentProblemSection21273",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION21273__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentProblemSection21273(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodyComponentProblemSection21273TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodyComponentProceduresSection21275() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodyComponentProceduresSection21275TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodyComponentProceduresSection21275",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION21275__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentProceduresSection21275(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodyComponentProceduresSection21275TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodyComponentResultsSection21277() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodyComponentResultsSection21277TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodyComponentResultsSection21277",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION21277__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentResultsSection21277(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodyComponentResultsSection21277TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21279() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21279TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21279",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL21279__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21279(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21279TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodyComponentEncountersSectionEntriesOptional21281() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodyComponentEncountersSectionEntriesOptional21281TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodyComponentEncountersSectionEntriesOptional21281",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL21281__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentEncountersSectionEntriesOptional21281(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodyComponentEncountersSectionEntriesOptional21281TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodyComponentFamilyHistorySection21283() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodyComponentFamilyHistorySection21283TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodyComponentFamilyHistorySection21283",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION21283__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentFamilyHistorySection21283(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodyComponentFamilyHistorySection21283TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodyComponentFunctionalStatusSection21285() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodyComponentFunctionalStatusSection21285TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodyComponentFunctionalStatusSection21285",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION21285__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentFunctionalStatusSection21285(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodyComponentFunctionalStatusSection21285TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodyComponentImmunizationsSection21287() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodyComponentImmunizationsSection21287TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodyComponentImmunizationsSection21287",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION21287__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentImmunizationsSection21287(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodyComponentImmunizationsSection21287TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodyComponentMedicalEquipmentSection21289() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodyComponentMedicalEquipmentSection21289TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodyComponentMedicalEquipmentSection21289",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_EQUIPMENT_SECTION21289__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentMedicalEquipmentSection21289(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodyComponentMedicalEquipmentSection21289TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodyComponentPayersSection21291() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodyComponentPayersSection21291TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodyComponentPayersSection21291",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_PAYERS_SECTION21291__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentPayersSection21291(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodyComponentPayersSection21291TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodyComponentPlanOfTreatmentSection21293() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodyComponentPlanOfTreatmentSection21293TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodyComponentPlanOfTreatmentSection21293",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21293__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentPlanOfTreatmentSection21293(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodyComponentPlanOfTreatmentSection21293TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodyComponentSocialHistorySection21295() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodyComponentSocialHistorySection21295TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodyComponentSocialHistorySection21295",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION21295__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentSocialHistorySection21295(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodyComponentSocialHistorySection21295TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodyComponentVitalSignsSection21297() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodyComponentVitalSignsSection21297TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodyComponentVitalSignsSection21297",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION21297__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentVitalSignsSection21297(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodyComponentVitalSignsSection21297TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodyComponentMentalStatusSection1299() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodyComponentMentalStatusSection1299TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodyComponentMentalStatusSection1299",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_MENTAL_STATUS_SECTION1299__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentMentalStatusSection1299(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodyComponentMentalStatusSection1299TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodyComponentNutritionSection1301() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodyComponentNutritionSection1301TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodyComponentNutritionSection1301",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION1301__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyComponentNutritionSection1301(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodyComponentNutritionSection1301TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodyAllergiesSection21268() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodyAllergiesSection21268TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodyAllergiesSection21268",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION21268__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyAllergiesSection21268(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodyAllergiesSection21268TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodyMedicationsSection21270() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodyMedicationsSection21270TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodyMedicationsSection21270",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION21270__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyMedicationsSection21270(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodyMedicationsSection21270TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodyProblemSection21272() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodyProblemSection21272TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodyProblemSection21272",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION21272__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyProblemSection21272(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodyProblemSection21272TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodyProceduresSection21274() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodyProceduresSection21274TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodyProceduresSection21274",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION21274__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyProceduresSection21274(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodyProceduresSection21274TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodyResultsSection21276() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodyResultsSection21276TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodyResultsSection21276",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION21276__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyResultsSection21276(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodyResultsSection21276TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21278() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21278TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21278",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL21278__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21278(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21278TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodyEncountersSectionEntriesOptional21280() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodyEncountersSectionEntriesOptional21280TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodyEncountersSectionEntriesOptional21280",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL21280__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyEncountersSectionEntriesOptional21280(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodyEncountersSectionEntriesOptional21280TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodyFamilyHistorySection21282() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodyFamilyHistorySection21282TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodyFamilyHistorySection21282",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION21282__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyFamilyHistorySection21282(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodyFamilyHistorySection21282TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodyFunctionalStatusSection21284() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodyFunctionalStatusSection21284TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodyFunctionalStatusSection21284",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION21284__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyFunctionalStatusSection21284(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodyFunctionalStatusSection21284TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodyImmunizationsSection21286() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodyImmunizationsSection21286TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodyImmunizationsSection21286",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION21286__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyImmunizationsSection21286(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodyImmunizationsSection21286TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodyMedicalEquipmentSection21288() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodyMedicalEquipmentSection21288TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodyMedicalEquipmentSection21288",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_MEDICAL_EQUIPMENT_SECTION21288__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyMedicalEquipmentSection21288(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodyMedicalEquipmentSection21288TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodyPayersSection21290() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodyPayersSection21290TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodyPayersSection21290",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_PAYERS_SECTION21290__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyPayersSection21290(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodyPayersSection21290TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodyPlanOfTreatmentSection21292() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodyPlanOfTreatmentSection21292TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodyPlanOfTreatmentSection21292",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21292__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyPlanOfTreatmentSection21292(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodyPlanOfTreatmentSection21292TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodySocialHistorySection21294() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodySocialHistorySection21294TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodySocialHistorySection21294",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION21294__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodySocialHistorySection21294(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodySocialHistorySection21294TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodyVitalSignsSection21296() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodyVitalSignsSection21296TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodyVitalSignsSection21296",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION21296__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyVitalSignsSection21296(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodyVitalSignsSection21296TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodyMentalStatusSection1298() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodyMentalStatusSection1298TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodyMentalStatusSection1298",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_MENTAL_STATUS_SECTION1298__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyMentalStatusSection1298(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodyMentalStatusSection1298TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBodyNutritionSection1300() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBodyNutritionSection1300TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBodyNutritionSection1300",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION1300__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBodyNutritionSection1300(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBodyNutritionSection1300TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocument2ComponentStructuredBody1267() {
		OperationsTestCase<ContinuityOfCareDocument2> validateContinuityOfCareDocument2ComponentStructuredBody1267TestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateContinuityOfCareDocument2ComponentStructuredBody1267",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_COMPONENT_STRUCTURED_BODY1267__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateContinuityOfCareDocument2ComponentStructuredBody1267(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocument2ComponentStructuredBody1267TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<ContinuityOfCareDocument2> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<ContinuityOfCareDocument2>(
			"validateGeneralHeaderConstraintsTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument2 target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocument2Operations.validateGeneralHeaderConstraintsTemplateId(
					(ContinuityOfCareDocument2) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ContinuityOfCareDocument2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ContinuityOfCareDocument2> {
		public ContinuityOfCareDocument2 create() {
			return ConsolFactory.eINSTANCE.createContinuityOfCareDocument2();
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
	private static class ConstructorTestClass extends ContinuityOfCareDocument2Operations {
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

} // ContinuityOfCareDocument2Operations
