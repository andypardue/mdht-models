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
import org.openhealthtools.mdht.uml.cda.consol.OperativeNote2;
import org.openhealthtools.mdht.uml.cda.consol.operations.OperativeNote2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Operative Note2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2Authorization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2Component1418(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component1418</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event US Realm Date And Time DT Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assistants Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assistants Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assistants Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assistants Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Effective Time Has High When No Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Effective Time No High If Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventProcedureCodes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Procedure Codes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPerformerAssistants(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assistants</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2AuthorizationConsentClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Consent Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2AuthorizationConsentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Consent Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2AuthorizationConsentStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Consent Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2AuthorizationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2AuthorizationConsent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Consent</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComponentAnesthesiaSection21421(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Anesthesia Section21421</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComponentComplicationsSection21423(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Complications Section21423</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComponentPreoperativeDiagnosisSection21425(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Preoperative Diagnosis Section21425</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1427(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Procedure Estimated Blood Loss Section1427</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComponentProcedureFindingsSection21429(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Procedure Findings Section21429</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1431(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Procedure Specimens Taken Section1431</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComponentProcedureDescriptionSection1433(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Procedure Description Section1433</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComponentPostoperativeDiagnosisSection1435(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Postoperative Diagnosis Section1435</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComponentProcedureImplantsSection1437(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Procedure Implants Section1437</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComponentOperativeNoteFluidSection1439(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Operative Note Fluid Section1439</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection1441(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Operative Note Surgical Procedure Section1441</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21443(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Plan Of Treatment Section21443</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComponentPlannedProcedureSection21445(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Planned Procedure Section21445</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComponentProcedureDispositionSection1447(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Procedure Disposition Section1447</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComponentProcedureIndicationsSection21449(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Procedure Indications Section21449</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComponentSurgicalDrainsSection1451(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Component Surgical Drains Section1451</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyAnesthesiaSection21420(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Anesthesia Section21420</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyComplicationsSection21422(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Complications Section21422</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyPreoperativeDiagnosisSection21424(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Preoperative Diagnosis Section21424</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1426(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Procedure Estimated Blood Loss Section1426</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyProcedureFindingsSection21428(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Procedure Findings Section21428</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyProcedureSpecimensTakenSection1430(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Procedure Specimens Taken Section1430</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyProcedureDescriptionSection1432(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Procedure Description Section1432</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyPostoperativeDiagnosisSection1434(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Postoperative Diagnosis Section1434</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyProcedureImplantsSection1436(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Procedure Implants Section1436</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyOperativeNoteFluidSection1438(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Operative Note Fluid Section1438</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyOperativeNoteSurgicalProcedureSection1440(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Operative Note Surgical Procedure Section1440</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyPlanOfTreatmentSection21442(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Plan Of Treatment Section21442</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyPlannedProcedureSection21444(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Planned Procedure Section21444</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyProcedureDispositionSection1446(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Procedure Disposition Section1446</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodyProcedureIndicationsSection21448(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Procedure Indications Section21448</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBodySurgicalDrainsSection1450(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body Surgical Drains Section1450</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComponentStructuredBody1419(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Component Structured Body1419</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class OperativeNote2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2CodeP() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2CodePTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2CodeP",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2CodeP(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2Code() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2CodeTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2Code",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected void setDependency(OperativeNote2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.OperativeNote2CodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2Code(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOf() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOf",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOf(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2Authorization() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2AuthorizationTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2Authorization",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2Authorization(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2AuthorizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2Component1418() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2Component1418TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2Component1418",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_COMPONENT1418__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2Component1418(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2Component1418TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLowTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_US_REALM_DATE_AND_TIME_DT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodePTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOfServiceEventPerformerTypeCode() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventPerformerTypeCodeTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOfServiceEventPerformerTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformerTypeCode(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfServiceEventPerformerTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntity() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntity(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodePTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOfServiceEventPerformerAssistantsTypeCode() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsTypeCodeTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsTypeCode(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidthTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidthTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidthTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidthTestCase.doValidationTest();
	}

	// /**
	// *
	// * @generated
	// */
	// @Test
	// public void testValidateOperativeNote2DocumentationOfServiceEventPreciseToTheDay() {
	// OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventPreciseToTheDayTestCase = new
	// OperationsTestCase<OperativeNote2>(
	// "validateOperativeNote2DocumentationOfServiceEventPreciseToTheDay",
	// operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(OperativeNote2 target) {
	// target.init();
	// DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
	// ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
	// IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS("200912", "2013");
	// se.setEffectiveTime(ivlts);
	// dof.setServiceEvent(se);
	// target.getDocumentationOfs().add(dof);
	// }
	//
	// @Override
	// protected void updateToPass(OperativeNote2 target) {
	// target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getLow().setValue(
	// PRECISE_TO_DAY);
	// target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getHigh().setValue(
	// PRECISE_TO_MINUTE);
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPreciseToTheDay(
	// (OperativeNote2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateOperativeNote2DocumentationOfServiceEventPreciseToTheDayTestCase.doValidationTest();
	// }

	// /**
	// *
	// * @generated
	// */
	// @Test
	// public void testValidateOperativeNote2DocumentationOfServiceEventPreciseToTheMinute() {
	// OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventPreciseToTheMinuteTestCase = new
	// OperationsTestCase<OperativeNote2>(
	// "validateOperativeNote2DocumentationOfServiceEventPreciseToTheMinute",
	// operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(OperativeNote2 target) {
	// target.init();
	// DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
	// ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
	// IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
	// IVXB_TS low = DatatypesFactory.eINSTANCE.createIVXB_TS();
	// low.setValue("2009121217");
	// ts.setLow(low);
	// se.setEffectiveTime(ts);
	// dof.setServiceEvent(se);
	// target.getDocumentationOfs().add(dof);
	// }
	//
	// @Override
	// protected void updateToPass(OperativeNote2 target) {
	// target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getLow().setValue(
	// PRECISE_TO_MINUTE);
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPreciseToTheMinute(
	// (OperativeNote2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateOperativeNote2DocumentationOfServiceEventPreciseToTheMinuteTestCase.doValidationTest();
	// }

	// /**
	// *
	// * @generated
	// */
	// @Test
	// public void testValidateOperativeNote2DocumentationOfServiceEventPreciseToTheSecond() {
	// OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventPreciseToTheSecondTestCase = new
	// OperationsTestCase<OperativeNote2>(
	// "validateOperativeNote2DocumentationOfServiceEventPreciseToTheSecond",
	// operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(OperativeNote2 target) {
	// target.init();
	// DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
	// ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
	// IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
	// IVXB_TS high = DatatypesFactory.eINSTANCE.createIVXB_TS();
	// high.setValue(PRECISE_TO_MINUTE);
	// ts.setHigh(high);
	// se.setEffectiveTime(ts);
	// dof.setServiceEvent(se);
	// target.getDocumentationOfs().add(dof);
	// }
	//
	// @Override
	// protected void updateToPass(OperativeNote2 target) {
	// target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getHigh().setValue(
	// PRECISE_TO_SECOND);
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPreciseToTheSecond(
	// (OperativeNote2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateOperativeNote2DocumentationOfServiceEventPreciseToTheSecondTestCase.doValidationTest();
	// }

	// /**
	// *
	// * @generated
	// */
	// @Test
	// public void testValidateOperativeNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset() {
	// OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffsetTestCase = new
	// OperationsTestCase<OperativeNote2>(
	// "validateOperativeNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset",
	// operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(OperativeNote2 target) {
	// target.init();
	// DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
	// ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
	// IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS(PRECISE_TO_MINUTE, PRECISE_TO_SECOND);
	// se.setEffectiveTime(ivlts);
	// dof.setServiceEvent(se);
	// target.getDocumentationOfs().add(dof);
	// }
	//
	// @Override
	// protected void updateToPass(OperativeNote2 target) {
	// target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getLow().setValue(
	// PRECISE_TO_MS_WITH_TIMEZONE);
	// target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getHigh().setValue(
	// PRECISE_TO_MINUTE_WITH_TIMEZONE);
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset(
	// (OperativeNote2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateOperativeNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffsetTestCase.doValidationTest();
	// }

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOfServiceEventProcedureCodes() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventProcedureCodesTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOfServiceEventProcedureCodes",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventProcedureCodes(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfServiceEventProcedureCodesTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOfServiceEventEffectiveTime() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventEffectiveTimeTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOfServiceEventEffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventEffectiveTime(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfServiceEventEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOfServiceEventCode() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventCodeTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOfServiceEventCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventCode(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfServiceEventCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOfServiceEventPerformer() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventPerformerTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOfServiceEventPerformer",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformer(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfServiceEventPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOfServiceEventPerformerAssistants() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOfServiceEventPerformerAssistants",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformerAssistants(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfServiceEventPerformerAssistantsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOfServiceEvent() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOfServiceEvent",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEvent(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfServiceEventTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2AuthorizationConsentClassCode() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2AuthorizationConsentClassCodeTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2AuthorizationConsentClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2AuthorizationConsentClassCode(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2AuthorizationConsentClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2AuthorizationConsentMoodCode() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2AuthorizationConsentMoodCodeTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2AuthorizationConsentMoodCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2AuthorizationConsentMoodCode(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2AuthorizationConsentMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOperativeNote2AuthorizationConsentStatusCode() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2AuthorizationConsentStatusCodeTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2AuthorizationConsentStatusCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

				DatatypesFactory.eINSTANCE.createCS("completed");

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2AuthorizationConsentStatusCode(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2AuthorizationConsentStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2AuthorizationTypeCode() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2AuthorizationTypeCodeTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2AuthorizationTypeCode", operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2AuthorizationTypeCode(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2AuthorizationTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2AuthorizationConsent() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2AuthorizationConsentTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2AuthorizationConsent", operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2AuthorizationConsent(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2AuthorizationConsentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2ComponentStructuredBodyComponentAnesthesiaSection21421() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComponentStructuredBodyComponentAnesthesiaSection21421TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComponentStructuredBodyComponentAnesthesiaSection21421",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ANESTHESIA_SECTION21421__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComponentAnesthesiaSection21421(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComponentStructuredBodyComponentAnesthesiaSection21421TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2ComponentStructuredBodyComponentComplicationsSection21423() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComponentStructuredBodyComponentComplicationsSection21423TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComponentStructuredBodyComponentComplicationsSection21423",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_COMPLICATIONS_SECTION21423__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComponentComplicationsSection21423(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComponentStructuredBodyComponentComplicationsSection21423TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2ComponentStructuredBodyComponentPreoperativeDiagnosisSection21425() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComponentStructuredBodyComponentPreoperativeDiagnosisSection21425TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComponentStructuredBodyComponentPreoperativeDiagnosisSection21425",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PREOPERATIVE_DIAGNOSIS_SECTION21425__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComponentPreoperativeDiagnosisSection21425(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComponentStructuredBodyComponentPreoperativeDiagnosisSection21425TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1427() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1427TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1427",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION1427__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1427(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComponentStructuredBodyComponentProcedureEstimatedBloodLossSection1427TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2ComponentStructuredBodyComponentProcedureFindingsSection21429() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComponentStructuredBodyComponentProcedureFindingsSection21429TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComponentStructuredBodyComponentProcedureFindingsSection21429",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_FINDINGS_SECTION21429__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComponentProcedureFindingsSection21429(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComponentStructuredBodyComponentProcedureFindingsSection21429TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1431() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1431TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1431",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_SPECIMENS_TAKEN_SECTION1431__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1431(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComponentStructuredBodyComponentProcedureSpecimensTakenSection1431TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2ComponentStructuredBodyComponentProcedureDescriptionSection1433() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComponentStructuredBodyComponentProcedureDescriptionSection1433TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComponentStructuredBodyComponentProcedureDescriptionSection1433",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DESCRIPTION_SECTION1433__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComponentProcedureDescriptionSection1433(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComponentStructuredBodyComponentProcedureDescriptionSection1433TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2ComponentStructuredBodyComponentPostoperativeDiagnosisSection1435() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComponentStructuredBodyComponentPostoperativeDiagnosisSection1435TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComponentStructuredBodyComponentPostoperativeDiagnosisSection1435",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_POSTOPERATIVE_DIAGNOSIS_SECTION1435__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComponentPostoperativeDiagnosisSection1435(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComponentStructuredBodyComponentPostoperativeDiagnosisSection1435TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2ComponentStructuredBodyComponentProcedureImplantsSection1437() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComponentStructuredBodyComponentProcedureImplantsSection1437TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComponentStructuredBodyComponentProcedureImplantsSection1437",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_IMPLANTS_SECTION1437__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComponentProcedureImplantsSection1437(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComponentStructuredBodyComponentProcedureImplantsSection1437TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2ComponentStructuredBodyComponentOperativeNoteFluidSection1439() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComponentStructuredBodyComponentOperativeNoteFluidSection1439TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComponentStructuredBodyComponentOperativeNoteFluidSection1439",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_OPERATIVE_NOTE_FLUID_SECTION1439__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComponentOperativeNoteFluidSection1439(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComponentStructuredBodyComponentOperativeNoteFluidSection1439TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2ComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection1441() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection1441TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection1441",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION1441__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection1441(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComponentStructuredBodyComponentOperativeNoteSurgicalProcedureSection1441TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21443() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21443TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21443",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21443__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21443(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21443TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2ComponentStructuredBodyComponentPlannedProcedureSection21445() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComponentStructuredBodyComponentPlannedProcedureSection21445TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComponentStructuredBodyComponentPlannedProcedureSection21445",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLANNED_PROCEDURE_SECTION21445__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComponentPlannedProcedureSection21445(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComponentStructuredBodyComponentPlannedProcedureSection21445TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2ComponentStructuredBodyComponentProcedureDispositionSection1447() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComponentStructuredBodyComponentProcedureDispositionSection1447TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComponentStructuredBodyComponentProcedureDispositionSection1447",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_DISPOSITION_SECTION1447__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComponentProcedureDispositionSection1447(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComponentStructuredBodyComponentProcedureDispositionSection1447TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2ComponentStructuredBodyComponentProcedureIndicationsSection21449() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComponentStructuredBodyComponentProcedureIndicationsSection21449TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComponentStructuredBodyComponentProcedureIndicationsSection21449",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURE_INDICATIONS_SECTION21449__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComponentProcedureIndicationsSection21449(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComponentStructuredBodyComponentProcedureIndicationsSection21449TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2ComponentStructuredBodyComponentSurgicalDrainsSection1451() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComponentStructuredBodyComponentSurgicalDrainsSection1451TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComponentStructuredBodyComponentSurgicalDrainsSection1451",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_SURGICAL_DRAINS_SECTION1451__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComponentSurgicalDrainsSection1451(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComponentStructuredBodyComponentSurgicalDrainsSection1451TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2ComponentStructuredBodyAnesthesiaSection21420() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComponentStructuredBodyAnesthesiaSection21420TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComponentStructuredBodyAnesthesiaSection21420",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_ANESTHESIA_SECTION21420__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyAnesthesiaSection21420(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComponentStructuredBodyAnesthesiaSection21420TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2ComponentStructuredBodyComplicationsSection21422() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComponentStructuredBodyComplicationsSection21422TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComponentStructuredBodyComplicationsSection21422",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_COMPLICATIONS_SECTION21422__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyComplicationsSection21422(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComponentStructuredBodyComplicationsSection21422TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2ComponentStructuredBodyPreoperativeDiagnosisSection21424() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComponentStructuredBodyPreoperativeDiagnosisSection21424TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComponentStructuredBodyPreoperativeDiagnosisSection21424",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PREOPERATIVE_DIAGNOSIS_SECTION21424__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyPreoperativeDiagnosisSection21424(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComponentStructuredBodyPreoperativeDiagnosisSection21424TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1426() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1426TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1426",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION1426__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1426(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComponentStructuredBodyProcedureEstimatedBloodLossSection1426TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2ComponentStructuredBodyProcedureFindingsSection21428() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComponentStructuredBodyProcedureFindingsSection21428TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComponentStructuredBodyProcedureFindingsSection21428",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_FINDINGS_SECTION21428__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyProcedureFindingsSection21428(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComponentStructuredBodyProcedureFindingsSection21428TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2ComponentStructuredBodyProcedureSpecimensTakenSection1430() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComponentStructuredBodyProcedureSpecimensTakenSection1430TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComponentStructuredBodyProcedureSpecimensTakenSection1430",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_SPECIMENS_TAKEN_SECTION1430__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyProcedureSpecimensTakenSection1430(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComponentStructuredBodyProcedureSpecimensTakenSection1430TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2ComponentStructuredBodyProcedureDescriptionSection1432() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComponentStructuredBodyProcedureDescriptionSection1432TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComponentStructuredBodyProcedureDescriptionSection1432",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_DESCRIPTION_SECTION1432__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyProcedureDescriptionSection1432(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComponentStructuredBodyProcedureDescriptionSection1432TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2ComponentStructuredBodyPostoperativeDiagnosisSection1434() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComponentStructuredBodyPostoperativeDiagnosisSection1434TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComponentStructuredBodyPostoperativeDiagnosisSection1434",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_POSTOPERATIVE_DIAGNOSIS_SECTION1434__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyPostoperativeDiagnosisSection1434(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComponentStructuredBodyPostoperativeDiagnosisSection1434TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2ComponentStructuredBodyProcedureImplantsSection1436() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComponentStructuredBodyProcedureImplantsSection1436TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComponentStructuredBodyProcedureImplantsSection1436",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_IMPLANTS_SECTION1436__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyProcedureImplantsSection1436(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComponentStructuredBodyProcedureImplantsSection1436TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2ComponentStructuredBodyOperativeNoteFluidSection1438() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComponentStructuredBodyOperativeNoteFluidSection1438TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComponentStructuredBodyOperativeNoteFluidSection1438",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_OPERATIVE_NOTE_FLUID_SECTION1438__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyOperativeNoteFluidSection1438(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComponentStructuredBodyOperativeNoteFluidSection1438TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2ComponentStructuredBodyOperativeNoteSurgicalProcedureSection1440() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComponentStructuredBodyOperativeNoteSurgicalProcedureSection1440TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComponentStructuredBodyOperativeNoteSurgicalProcedureSection1440",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION1440__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyOperativeNoteSurgicalProcedureSection1440(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComponentStructuredBodyOperativeNoteSurgicalProcedureSection1440TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2ComponentStructuredBodyPlanOfTreatmentSection21442() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComponentStructuredBodyPlanOfTreatmentSection21442TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComponentStructuredBodyPlanOfTreatmentSection21442",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21442__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyPlanOfTreatmentSection21442(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComponentStructuredBodyPlanOfTreatmentSection21442TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2ComponentStructuredBodyPlannedProcedureSection21444() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComponentStructuredBodyPlannedProcedureSection21444TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComponentStructuredBodyPlannedProcedureSection21444",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PLANNED_PROCEDURE_SECTION21444__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyPlannedProcedureSection21444(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComponentStructuredBodyPlannedProcedureSection21444TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2ComponentStructuredBodyProcedureDispositionSection1446() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComponentStructuredBodyProcedureDispositionSection1446TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComponentStructuredBodyProcedureDispositionSection1446",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_DISPOSITION_SECTION1446__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyProcedureDispositionSection1446(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComponentStructuredBodyProcedureDispositionSection1446TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2ComponentStructuredBodyProcedureIndicationsSection21448() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComponentStructuredBodyProcedureIndicationsSection21448TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComponentStructuredBodyProcedureIndicationsSection21448",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURE_INDICATIONS_SECTION21448__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodyProcedureIndicationsSection21448(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComponentStructuredBodyProcedureIndicationsSection21448TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2ComponentStructuredBodySurgicalDrainsSection1450() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComponentStructuredBodySurgicalDrainsSection1450TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComponentStructuredBodySurgicalDrainsSection1450",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY_SURGICAL_DRAINS_SECTION1450__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBodySurgicalDrainsSection1450(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComponentStructuredBodySurgicalDrainsSection1450TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOperativeNote2ComponentStructuredBody1419() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComponentStructuredBody1419TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComponentStructuredBody1419",
			operationsForOCL.getOCLValue(
				"VALIDATE_OPERATIVE_NOTE2_COMPONENT_STRUCTURED_BODY1419__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComponentStructuredBody1419(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComponentStructuredBody1419TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<OperativeNote2> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<OperativeNote2>(
			"validateGeneralHeaderConstraintsTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateGeneralHeaderConstraintsTemplateId(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends OperativeNote2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<OperativeNote2> {
		public OperativeNote2 create() {
			return ConsolFactory.eINSTANCE.createOperativeNote2();
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
	private static class ConstructorTestClass extends OperativeNote2Operations {
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

} // OperativeNote2Operations
