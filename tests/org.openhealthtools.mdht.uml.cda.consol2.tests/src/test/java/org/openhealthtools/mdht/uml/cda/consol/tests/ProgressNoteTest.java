/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     Dan Brown (Audacious Inquiry) - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ProgressNote;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProgressNoteOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Progress Note</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has An Assement And Plan Section Or Individual Assement And Plan Sections</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Does Not Have Individual Assement And Plan Sections When Assement And Plan Section Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateGeneralHeaderConstraintsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponent488(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component488</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Effective Time High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOfServiceEvent2PreciseToTheDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Precise To The Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOfServiceEvent2PreciseToTheMinute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Precise To The Minute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOfServiceEvent2PreciseToTheSecond(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Precise To The Second</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOfServiceEvent2IfMorePreciseThanDayIncludeTimeZoneOffset(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 If More Precise Than Day Include Time Zone Offset</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOfServiceEvent2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOfServiceEvent2ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOfServiceEvent2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOfServiceEvent2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Location Health Care Facility1 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Location Health Care Facility</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Precise To The Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheMinute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Precise To The Minute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheSecond(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Precise To The Second</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6IfMorePreciseThanDayIncludeTimeZoneOffset(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 If More Precise Than Day Include Time Zone Offset</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6Location(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentStructuredBodyComponentAssessmentSection491(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Structured Body Component Assessment Section491</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentStructuredBodyComponentPlanOfCareSection493(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Structured Body Component Plan Of Care Section493</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentStructuredBodyComponentAssessmentAndPlanSection495(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Structured Body Component Assessment And Plan Section495</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional497(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Structured Body Component Allergies Section Entries Optional497</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentStructuredBodyComponentChiefComplaintSection499(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Structured Body Component Chief Complaint Section499</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentStructuredBodyComponentInterventionsSection501(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Structured Body Component Interventions Section501</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional503(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Structured Body Component Medications Section Entries Optional503</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentStructuredBodyComponentObjectiveSection505(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Structured Body Component Objective Section505</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentStructuredBodyComponentPhysicalExamSection507(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Structured Body Component Physical Exam Section507</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentStructuredBodyComponentProblemSectionEntriesOptional509(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Structured Body Component Problem Section Entries Optional509</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentStructuredBodyComponentResultsSectionEntriesOptional511(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Structured Body Component Results Section Entries Optional511</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentStructuredBodyComponentReviewOfSystemsSection513(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Structured Body Component Review Of Systems Section513</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentStructuredBodyComponentSubjectiveSection515(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Structured Body Component Subjective Section515</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional517(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Structured Body Component Vital Signs Section Entries Optional517</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentStructuredBodyComponentInstructionsSection519(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Structured Body Component Instructions Section519</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentStructuredBodyAssessmentSection490(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Structured Body Assessment Section490</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentStructuredBodyPlanOfCareSection492(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Structured Body Plan Of Care Section492</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentStructuredBodyAssessmentAndPlanSection494(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Structured Body Assessment And Plan Section494</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentStructuredBodyAllergiesSectionEntriesOptional496(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Structured Body Allergies Section Entries Optional496</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentStructuredBodyChiefComplaintSection498(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Structured Body Chief Complaint Section498</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentStructuredBodyInterventionsSection500(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Structured Body Interventions Section500</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentStructuredBodyMedicationsSectionEntriesOptional502(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Structured Body Medications Section Entries Optional502</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentStructuredBodyObjectiveSection504(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Structured Body Objective Section504</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentStructuredBodyPhysicalExamSection506(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Structured Body Physical Exam Section506</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentStructuredBodyProblemSectionEntriesOptional508(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Structured Body Problem Section Entries Optional508</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentStructuredBodyResultsSectionEntriesOptional510(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Structured Body Results Section Entries Optional510</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentStructuredBodyReviewOfSystemsSection512(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Structured Body Review Of Systems Section512</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentStructuredBodySubjectiveSection514(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Structured Body Subjective Section514</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentStructuredBodyVitalSignsSectionEntriesOptional516(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Structured Body Vital Signs Section Entries Optional516</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentStructuredBodyInstructionsSection518(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Structured Body Instructions Section518</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentStructuredBody489(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Structured Body489</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProgressNoteTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections() {
		OperationsTestCase<ProgressNote> validateProgressNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSectionsTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSectionsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent() {
		OperationsTestCase<ProgressNote> validateProgressNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresentTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCodeP() {
		OperationsTestCase<ProgressNote> validateGeneralHeaderConstraintsCodePTestCase = new OperationsTestCase<ProgressNote>(
			"validateGeneralHeaderConstraintsCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateGeneralHeaderConstraintsCodeP(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteDocumentationOf() {
		OperationsTestCase<ProgressNote> validateProgressNoteDocumentationOfTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteDocumentationOf",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteDocumentationOf(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteDocumentationOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteComponentOf() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentOfTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentOf",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentOf(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNoteComponent488() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponent488TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponent488",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_COMPONENT488__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponent488(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponent488TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteDocumentationOfServiceEvent2EffectiveTimeLow() {
		OperationsTestCase<ProgressNote> validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeLowTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeLow",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeLow(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteDocumentationOfServiceEvent2EffectiveTimeHigh() {
		OperationsTestCase<ProgressNote> validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeHighTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeHigh",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeHigh(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteDocumentationOfServiceEvent2PreciseToTheDay() {
		OperationsTestCase<ProgressNote> validateProgressNoteDocumentationOfServiceEvent2PreciseToTheDayTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteDocumentationOfServiceEvent2PreciseToTheDay",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2PreciseToTheDay(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteDocumentationOfServiceEvent2PreciseToTheDayTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteDocumentationOfServiceEvent2PreciseToTheMinute() {
		OperationsTestCase<ProgressNote> validateProgressNoteDocumentationOfServiceEvent2PreciseToTheMinuteTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteDocumentationOfServiceEvent2PreciseToTheMinute",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2PreciseToTheMinute(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteDocumentationOfServiceEvent2PreciseToTheMinuteTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteDocumentationOfServiceEvent2PreciseToTheSecond() {
		OperationsTestCase<ProgressNote> validateProgressNoteDocumentationOfServiceEvent2PreciseToTheSecondTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteDocumentationOfServiceEvent2PreciseToTheSecond",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2PreciseToTheSecond(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteDocumentationOfServiceEvent2PreciseToTheSecondTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteDocumentationOfServiceEvent2IfMorePreciseThanDayIncludeTimeZoneOffset() {
		OperationsTestCase<ProgressNote> validateProgressNoteDocumentationOfServiceEvent2IfMorePreciseThanDayIncludeTimeZoneOffsetTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteDocumentationOfServiceEvent2IfMorePreciseThanDayIncludeTimeZoneOffset",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2IfMorePreciseThanDayIncludeTimeZoneOffset(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteDocumentationOfServiceEvent2IfMorePreciseThanDayIncludeTimeZoneOffsetTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteDocumentationOfServiceEvent2TemplateId() {
		OperationsTestCase<ProgressNote> validateProgressNoteDocumentationOfServiceEvent2TemplateIdTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteDocumentationOfServiceEvent2TemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2TemplateId(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteDocumentationOfServiceEvent2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteDocumentationOfServiceEvent2ClassCode() {
		OperationsTestCase<ProgressNote> validateProgressNoteDocumentationOfServiceEvent2ClassCodeTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteDocumentationOfServiceEvent2ClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2ClassCode(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteDocumentationOfServiceEvent2ClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteDocumentationOfServiceEvent2EffectiveTime() {
		OperationsTestCase<ProgressNote> validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteDocumentationOfServiceEvent2EffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2EffectiveTime(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteDocumentationOfServiceEvent2() {
		OperationsTestCase<ProgressNote> validateProgressNoteDocumentationOfServiceEvent2TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteDocumentationOfServiceEvent2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteDocumentationOfServiceEvent2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1Id() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1IdTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1Id",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION_HEALTH_CARE_FACILITY1_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1Id(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacilityTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION_HEALTH_CARE_FACILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacilityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteComponentOfEncompassingEncounter6PreciseToTheDay() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheDayTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheDay",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheDay(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheDayTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteComponentOfEncompassingEncounter6PreciseToTheMinute() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheMinuteTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheMinute",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheMinute(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheMinuteTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteComponentOfEncompassingEncounter6PreciseToTheSecond() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheSecondTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheSecond",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheSecond(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheSecondTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteComponentOfEncompassingEncounter6IfMorePreciseThanDayIncludeTimeZoneOffset() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentOfEncompassingEncounter6IfMorePreciseThanDayIncludeTimeZoneOffsetTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentOfEncompassingEncounter6IfMorePreciseThanDayIncludeTimeZoneOffset",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6IfMorePreciseThanDayIncludeTimeZoneOffset(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentOfEncompassingEncounter6IfMorePreciseThanDayIncludeTimeZoneOffsetTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteComponentOfEncompassingEncounter6EffectiveTime() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentOfEncompassingEncounter6EffectiveTimeTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentOfEncompassingEncounter6EffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6EffectiveTime(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentOfEncompassingEncounter6EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteComponentOfEncompassingEncounter6Id() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentOfEncompassingEncounter6IdTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentOfEncompassingEncounter6Id",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6Id(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentOfEncompassingEncounter6IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteComponentOfEncompassingEncounter6Location() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentOfEncompassingEncounter6LocationTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentOfEncompassingEncounter6Location",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6Location(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentOfEncompassingEncounter6LocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteComponentOfEncompassingEncounter6() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentOfEncompassingEncounter6TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentOfEncompassingEncounter6",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentOfEncompassingEncounter6TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNoteComponentStructuredBodyComponentAssessmentSection491() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentStructuredBodyComponentAssessmentSection491TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentStructuredBodyComponentAssessmentSection491",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION491__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyComponentAssessmentSection491(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentStructuredBodyComponentAssessmentSection491TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNoteComponentStructuredBodyComponentPlanOfCareSection493() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentStructuredBodyComponentPlanOfCareSection493TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentStructuredBodyComponentPlanOfCareSection493",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_CARE_SECTION493__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyComponentPlanOfCareSection493(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentStructuredBodyComponentPlanOfCareSection493TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNoteComponentStructuredBodyComponentAssessmentAndPlanSection495() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentStructuredBodyComponentAssessmentAndPlanSection495TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentStructuredBodyComponentAssessmentAndPlanSection495",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION495__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyComponentAssessmentAndPlanSection495(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentStructuredBodyComponentAssessmentAndPlanSection495TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional497() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional497TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional497",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL497__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional497(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentStructuredBodyComponentAllergiesSectionEntriesOptional497TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNoteComponentStructuredBodyComponentChiefComplaintSection499() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentStructuredBodyComponentChiefComplaintSection499TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentStructuredBodyComponentChiefComplaintSection499",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION499__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyComponentChiefComplaintSection499(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentStructuredBodyComponentChiefComplaintSection499TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNoteComponentStructuredBodyComponentInterventionsSection501() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentStructuredBodyComponentInterventionsSection501TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentStructuredBodyComponentInterventionsSection501",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_INTERVENTIONS_SECTION501__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyComponentInterventionsSection501(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentStructuredBodyComponentInterventionsSection501TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional503() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional503TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional503",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION_ENTRIES_OPTIONAL503__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional503(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentStructuredBodyComponentMedicationsSectionEntriesOptional503TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNoteComponentStructuredBodyComponentObjectiveSection505() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentStructuredBodyComponentObjectiveSection505TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentStructuredBodyComponentObjectiveSection505",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_OBJECTIVE_SECTION505__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyComponentObjectiveSection505(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentStructuredBodyComponentObjectiveSection505TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNoteComponentStructuredBodyComponentPhysicalExamSection507() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentStructuredBodyComponentPhysicalExamSection507TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentStructuredBodyComponentPhysicalExamSection507",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION507__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyComponentPhysicalExamSection507(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentStructuredBodyComponentPhysicalExamSection507TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNoteComponentStructuredBodyComponentProblemSectionEntriesOptional509() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentStructuredBodyComponentProblemSectionEntriesOptional509TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentStructuredBodyComponentProblemSectionEntriesOptional509",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION_ENTRIES_OPTIONAL509__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyComponentProblemSectionEntriesOptional509(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentStructuredBodyComponentProblemSectionEntriesOptional509TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNoteComponentStructuredBodyComponentResultsSectionEntriesOptional511() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentStructuredBodyComponentResultsSectionEntriesOptional511TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentStructuredBodyComponentResultsSectionEntriesOptional511",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION_ENTRIES_OPTIONAL511__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyComponentResultsSectionEntriesOptional511(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentStructuredBodyComponentResultsSectionEntriesOptional511TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNoteComponentStructuredBodyComponentReviewOfSystemsSection513() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentStructuredBodyComponentReviewOfSystemsSection513TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentStructuredBodyComponentReviewOfSystemsSection513",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION513__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyComponentReviewOfSystemsSection513(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentStructuredBodyComponentReviewOfSystemsSection513TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNoteComponentStructuredBodyComponentSubjectiveSection515() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentStructuredBodyComponentSubjectiveSection515TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentStructuredBodyComponentSubjectiveSection515",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_SUBJECTIVE_SECTION515__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyComponentSubjectiveSection515(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentStructuredBodyComponentSubjectiveSection515TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional517() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional517TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional517",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL517__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional517(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentStructuredBodyComponentVitalSignsSectionEntriesOptional517TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNoteComponentStructuredBodyComponentInstructionsSection519() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentStructuredBodyComponentInstructionsSection519TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentStructuredBodyComponentInstructionsSection519",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_INSTRUCTIONS_SECTION519__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyComponentInstructionsSection519(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentStructuredBodyComponentInstructionsSection519TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNoteComponentStructuredBodyAssessmentSection490() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentStructuredBodyAssessmentSection490TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentStructuredBodyAssessmentSection490",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION490__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyAssessmentSection490(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentStructuredBodyAssessmentSection490TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNoteComponentStructuredBodyPlanOfCareSection492() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentStructuredBodyPlanOfCareSection492TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentStructuredBodyPlanOfCareSection492",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_STRUCTURED_BODY_PLAN_OF_CARE_SECTION492__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyPlanOfCareSection492(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentStructuredBodyPlanOfCareSection492TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNoteComponentStructuredBodyAssessmentAndPlanSection494() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentStructuredBodyAssessmentAndPlanSection494TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentStructuredBodyAssessmentAndPlanSection494",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION494__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyAssessmentAndPlanSection494(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentStructuredBodyAssessmentAndPlanSection494TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNoteComponentStructuredBodyAllergiesSectionEntriesOptional496() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentStructuredBodyAllergiesSectionEntriesOptional496TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentStructuredBodyAllergiesSectionEntriesOptional496",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL496__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyAllergiesSectionEntriesOptional496(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentStructuredBodyAllergiesSectionEntriesOptional496TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNoteComponentStructuredBodyChiefComplaintSection498() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentStructuredBodyChiefComplaintSection498TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentStructuredBodyChiefComplaintSection498",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION498__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyChiefComplaintSection498(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentStructuredBodyChiefComplaintSection498TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNoteComponentStructuredBodyInterventionsSection500() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentStructuredBodyInterventionsSection500TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentStructuredBodyInterventionsSection500",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_STRUCTURED_BODY_INTERVENTIONS_SECTION500__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyInterventionsSection500(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentStructuredBodyInterventionsSection500TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNoteComponentStructuredBodyMedicationsSectionEntriesOptional502() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentStructuredBodyMedicationsSectionEntriesOptional502TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentStructuredBodyMedicationsSectionEntriesOptional502",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION_ENTRIES_OPTIONAL502__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyMedicationsSectionEntriesOptional502(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentStructuredBodyMedicationsSectionEntriesOptional502TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNoteComponentStructuredBodyObjectiveSection504() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentStructuredBodyObjectiveSection504TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentStructuredBodyObjectiveSection504",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_STRUCTURED_BODY_OBJECTIVE_SECTION504__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyObjectiveSection504(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentStructuredBodyObjectiveSection504TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNoteComponentStructuredBodyPhysicalExamSection506() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentStructuredBodyPhysicalExamSection506TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentStructuredBodyPhysicalExamSection506",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION506__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyPhysicalExamSection506(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentStructuredBodyPhysicalExamSection506TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNoteComponentStructuredBodyProblemSectionEntriesOptional508() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentStructuredBodyProblemSectionEntriesOptional508TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentStructuredBodyProblemSectionEntriesOptional508",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION_ENTRIES_OPTIONAL508__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyProblemSectionEntriesOptional508(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentStructuredBodyProblemSectionEntriesOptional508TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNoteComponentStructuredBodyResultsSectionEntriesOptional510() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentStructuredBodyResultsSectionEntriesOptional510TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentStructuredBodyResultsSectionEntriesOptional510",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION_ENTRIES_OPTIONAL510__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyResultsSectionEntriesOptional510(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentStructuredBodyResultsSectionEntriesOptional510TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNoteComponentStructuredBodyReviewOfSystemsSection512() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentStructuredBodyReviewOfSystemsSection512TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentStructuredBodyReviewOfSystemsSection512",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION512__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyReviewOfSystemsSection512(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentStructuredBodyReviewOfSystemsSection512TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNoteComponentStructuredBodySubjectiveSection514() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentStructuredBodySubjectiveSection514TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentStructuredBodySubjectiveSection514",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_STRUCTURED_BODY_SUBJECTIVE_SECTION514__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentStructuredBodySubjectiveSection514(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentStructuredBodySubjectiveSection514TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNoteComponentStructuredBodyVitalSignsSectionEntriesOptional516() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentStructuredBodyVitalSignsSectionEntriesOptional516TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentStructuredBodyVitalSignsSectionEntriesOptional516",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL516__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyVitalSignsSectionEntriesOptional516(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentStructuredBodyVitalSignsSectionEntriesOptional516TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNoteComponentStructuredBodyInstructionsSection518() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentStructuredBodyInstructionsSection518TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentStructuredBodyInstructionsSection518",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_STRUCTURED_BODY_INSTRUCTIONS_SECTION518__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentStructuredBodyInstructionsSection518(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentStructuredBodyInstructionsSection518TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProgressNoteComponentStructuredBody489() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentStructuredBody489TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentStructuredBody489", operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE_COMPONENT_STRUCTURED_BODY489__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentStructuredBody489(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentStructuredBody489TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<ProgressNote> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<ProgressNote>(
			"validateGeneralHeaderConstraintsTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateGeneralHeaderConstraintsTemplateId(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCode() {
		OperationsTestCase<ProgressNote> validateGeneralHeaderConstraintsCodeTestCase = new OperationsTestCase<ProgressNote>(
			"validateGeneralHeaderConstraintsCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected void setDependency(ProgressNote target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateGeneralHeaderConstraintsCode(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProgressNoteOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProgressNote> {
		@Override
		public ProgressNote create() {
			return ConsolFactory.eINSTANCE.createProgressNote();
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
	private static class ConstructorTestClass extends ProgressNoteOperations {
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

} // ProgressNoteOperations
