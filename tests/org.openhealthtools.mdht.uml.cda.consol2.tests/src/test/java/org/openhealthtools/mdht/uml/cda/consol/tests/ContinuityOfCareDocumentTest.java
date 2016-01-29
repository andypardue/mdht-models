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
import org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument;
import org.openhealthtools.mdht.uml.cda.consol.operations.ContinuityOfCareDocumentOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Continuity Of Care Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentComponent26(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Component26</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Effective Time High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Performer Assigned Entity Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Performer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Performer Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Performer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEventClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEventPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentAuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Author Assigned Author Has Assigned Person Or Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentAuthorAssignedAuthorHasRepresentOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Author Assigned Author Has Represent Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentAuthorAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Author Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentComponentStructuredBodyComponentAllergiesSection29(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Component Structured Body Component Allergies Section29</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentComponentStructuredBodyComponentMedicationsSection31(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Component Structured Body Component Medications Section31</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentComponentStructuredBodyComponentProblemSection33(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Component Structured Body Component Problem Section33</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentComponentStructuredBodyComponentProceduresSection35(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Component Structured Body Component Procedures Section35</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentComponentStructuredBodyComponentResultsSection37(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Component Structured Body Component Results Section37</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentComponentStructuredBodyComponentAdvanceDirectivesSection39(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Component Structured Body Component Advance Directives Section39</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentComponentStructuredBodyComponentEncountersSection41(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Component Structured Body Component Encounters Section41</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentComponentStructuredBodyComponentFamilyHistorySection43(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Component Structured Body Component Family History Section43</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentComponentStructuredBodyComponentFunctionalStatusSection45(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Component Structured Body Component Functional Status Section45</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentComponentStructuredBodyComponentImmunizationsSectionEntriesOptional47(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Component Structured Body Component Immunizations Section Entries Optional47</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentComponentStructuredBodyComponentMedicalEquipmentSection49(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Component Structured Body Component Medical Equipment Section49</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentComponentStructuredBodyComponentPayersSection51(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Component Structured Body Component Payers Section51</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentComponentStructuredBodyComponentPlanOfCareSection53(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Component Structured Body Component Plan Of Care Section53</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentComponentStructuredBodyComponentSocialHistorySection55(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Component Structured Body Component Social History Section55</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentComponentStructuredBodyComponentVitalSignsSectionEntriesOptional57(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Component Structured Body Component Vital Signs Section Entries Optional57</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentComponentStructuredBodyAllergiesSection28(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Component Structured Body Allergies Section28</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentComponentStructuredBodyMedicationsSection30(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Component Structured Body Medications Section30</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentComponentStructuredBodyProblemSection32(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Component Structured Body Problem Section32</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentComponentStructuredBodyProceduresSection34(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Component Structured Body Procedures Section34</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentComponentStructuredBodyResultsSection36(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Component Structured Body Results Section36</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentComponentStructuredBodyAdvanceDirectivesSection38(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Component Structured Body Advance Directives Section38</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentComponentStructuredBodyEncountersSection40(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Component Structured Body Encounters Section40</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentComponentStructuredBodyFamilyHistorySection42(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Component Structured Body Family History Section42</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentComponentStructuredBodyFunctionalStatusSection44(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Component Structured Body Functional Status Section44</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentComponentStructuredBodyImmunizationsSectionEntriesOptional46(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Component Structured Body Immunizations Section Entries Optional46</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentComponentStructuredBodyMedicalEquipmentSection48(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Component Structured Body Medical Equipment Section48</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentComponentStructuredBodyPayersSection50(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Component Structured Body Payers Section50</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentComponentStructuredBodyPlanOfCareSection52(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Component Structured Body Plan Of Care Section52</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentComponentStructuredBodySocialHistorySection54(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Component Structured Body Social History Section54</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentComponentStructuredBodyVitalSignsSectionEntriesOptional56(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Component Structured Body Vital Signs Section Entries Optional56</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentComponentStructuredBody27(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Component Structured Body27</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ContinuityOfCareDocumentTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentCodeP() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentCodePTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentCodeP",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentCodeP(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentCode() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentCodeTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentCode",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected void setDependency(ContinuityOfCareDocument target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocumentCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentCode(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentLanguageCode() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentLanguageCodeTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentLanguageCode", operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentLanguageCode(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentLanguageCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentDocumentationOf() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOf",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOf(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentAuthor() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentAuthorTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentAuthor",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentAuthor(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocumentComponent26() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentComponent26TestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentComponent26", operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_COMPONENT26__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentComponent26(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentComponent26TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifierTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifierTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCode() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCode(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityId() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityIdTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityId",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityId(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentDocumentationOfServiceEventPerformerTypeCode() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerTypeCodeTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerTypeCode(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntity() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntity(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeLow() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeLowTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeLow",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeLow(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeHigh() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeHighTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeHigh",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeHigh(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentDocumentationOfServiceEventClassCode() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfServiceEventClassCodeTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOfServiceEventClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEventClassCode(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfServiceEventClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTime() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTime(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentDocumentationOfServiceEventPerformer() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOfServiceEventPerformer",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEventPerformer(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentDocumentationOfServiceEvent() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentDocumentationOfServiceEventTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentDocumentationOfServiceEvent",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentDocumentationOfServiceEvent(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentDocumentationOfServiceEventTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentAuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentAuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganizationTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentAuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_HAS_ASSIGNED_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentAuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentAuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentAuthorAssignedAuthorHasRepresentOrganization() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentAuthorAssignedAuthorHasRepresentOrganizationTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentAuthorAssignedAuthorHasRepresentOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_HAS_REPRESENT_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentAuthorAssignedAuthorHasRepresentOrganization(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentAuthorAssignedAuthorHasRepresentOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateContinuityOfCareDocumentAuthorAssignedAuthor() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentAuthorAssignedAuthorTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentAuthorAssignedAuthor",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentAuthorAssignedAuthor(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentAuthorAssignedAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocumentComponentStructuredBodyComponentAllergiesSection29() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentComponentStructuredBodyComponentAllergiesSection29TestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentComponentStructuredBodyComponentAllergiesSection29",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION29__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentComponentStructuredBodyComponentAllergiesSection29(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentComponentStructuredBodyComponentAllergiesSection29TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocumentComponentStructuredBodyComponentMedicationsSection31() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentComponentStructuredBodyComponentMedicationsSection31TestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentComponentStructuredBodyComponentMedicationsSection31",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION31__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentComponentStructuredBodyComponentMedicationsSection31(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentComponentStructuredBodyComponentMedicationsSection31TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocumentComponentStructuredBodyComponentProblemSection33() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentComponentStructuredBodyComponentProblemSection33TestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentComponentStructuredBodyComponentProblemSection33",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION33__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentComponentStructuredBodyComponentProblemSection33(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentComponentStructuredBodyComponentProblemSection33TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocumentComponentStructuredBodyComponentProceduresSection35() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentComponentStructuredBodyComponentProceduresSection35TestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentComponentStructuredBodyComponentProceduresSection35",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION35__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentComponentStructuredBodyComponentProceduresSection35(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentComponentStructuredBodyComponentProceduresSection35TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocumentComponentStructuredBodyComponentResultsSection37() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentComponentStructuredBodyComponentResultsSection37TestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentComponentStructuredBodyComponentResultsSection37",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION37__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentComponentStructuredBodyComponentResultsSection37(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentComponentStructuredBodyComponentResultsSection37TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocumentComponentStructuredBodyComponentAdvanceDirectivesSection39() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentComponentStructuredBodyComponentAdvanceDirectivesSection39TestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentComponentStructuredBodyComponentAdvanceDirectivesSection39",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_COMPONENT_STRUCTURED_BODY_COMPONENT_ADVANCE_DIRECTIVES_SECTION39__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentComponentStructuredBodyComponentAdvanceDirectivesSection39(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentComponentStructuredBodyComponentAdvanceDirectivesSection39TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocumentComponentStructuredBodyComponentEncountersSection41() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentComponentStructuredBodyComponentEncountersSection41TestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentComponentStructuredBodyComponentEncountersSection41",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_COMPONENT_STRUCTURED_BODY_COMPONENT_ENCOUNTERS_SECTION41__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentComponentStructuredBodyComponentEncountersSection41(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentComponentStructuredBodyComponentEncountersSection41TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocumentComponentStructuredBodyComponentFamilyHistorySection43() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentComponentStructuredBodyComponentFamilyHistorySection43TestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentComponentStructuredBodyComponentFamilyHistorySection43",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION43__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentComponentStructuredBodyComponentFamilyHistorySection43(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentComponentStructuredBodyComponentFamilyHistorySection43TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocumentComponentStructuredBodyComponentFunctionalStatusSection45() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentComponentStructuredBodyComponentFunctionalStatusSection45TestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentComponentStructuredBodyComponentFunctionalStatusSection45",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION45__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentComponentStructuredBodyComponentFunctionalStatusSection45(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentComponentStructuredBodyComponentFunctionalStatusSection45TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocumentComponentStructuredBodyComponentImmunizationsSectionEntriesOptional47() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentComponentStructuredBodyComponentImmunizationsSectionEntriesOptional47TestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentComponentStructuredBodyComponentImmunizationsSectionEntriesOptional47",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL47__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentComponentStructuredBodyComponentImmunizationsSectionEntriesOptional47(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentComponentStructuredBodyComponentImmunizationsSectionEntriesOptional47TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocumentComponentStructuredBodyComponentMedicalEquipmentSection49() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentComponentStructuredBodyComponentMedicalEquipmentSection49TestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentComponentStructuredBodyComponentMedicalEquipmentSection49",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_EQUIPMENT_SECTION49__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentComponentStructuredBodyComponentMedicalEquipmentSection49(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentComponentStructuredBodyComponentMedicalEquipmentSection49TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocumentComponentStructuredBodyComponentPayersSection51() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentComponentStructuredBodyComponentPayersSection51TestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentComponentStructuredBodyComponentPayersSection51",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_COMPONENT_STRUCTURED_BODY_COMPONENT_PAYERS_SECTION51__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentComponentStructuredBodyComponentPayersSection51(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentComponentStructuredBodyComponentPayersSection51TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocumentComponentStructuredBodyComponentPlanOfCareSection53() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentComponentStructuredBodyComponentPlanOfCareSection53TestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentComponentStructuredBodyComponentPlanOfCareSection53",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_CARE_SECTION53__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentComponentStructuredBodyComponentPlanOfCareSection53(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentComponentStructuredBodyComponentPlanOfCareSection53TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocumentComponentStructuredBodyComponentSocialHistorySection55() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentComponentStructuredBodyComponentSocialHistorySection55TestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentComponentStructuredBodyComponentSocialHistorySection55",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION55__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentComponentStructuredBodyComponentSocialHistorySection55(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentComponentStructuredBodyComponentSocialHistorySection55TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocumentComponentStructuredBodyComponentVitalSignsSectionEntriesOptional57() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentComponentStructuredBodyComponentVitalSignsSectionEntriesOptional57TestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentComponentStructuredBodyComponentVitalSignsSectionEntriesOptional57",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL57__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentComponentStructuredBodyComponentVitalSignsSectionEntriesOptional57(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentComponentStructuredBodyComponentVitalSignsSectionEntriesOptional57TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocumentComponentStructuredBodyAllergiesSection28() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentComponentStructuredBodyAllergiesSection28TestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentComponentStructuredBodyAllergiesSection28",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION28__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentComponentStructuredBodyAllergiesSection28(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentComponentStructuredBodyAllergiesSection28TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocumentComponentStructuredBodyMedicationsSection30() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentComponentStructuredBodyMedicationsSection30TestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentComponentStructuredBodyMedicationsSection30",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION30__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentComponentStructuredBodyMedicationsSection30(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentComponentStructuredBodyMedicationsSection30TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocumentComponentStructuredBodyProblemSection32() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentComponentStructuredBodyProblemSection32TestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentComponentStructuredBodyProblemSection32",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION32__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentComponentStructuredBodyProblemSection32(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentComponentStructuredBodyProblemSection32TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocumentComponentStructuredBodyProceduresSection34() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentComponentStructuredBodyProceduresSection34TestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentComponentStructuredBodyProceduresSection34",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION34__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentComponentStructuredBodyProceduresSection34(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentComponentStructuredBodyProceduresSection34TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocumentComponentStructuredBodyResultsSection36() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentComponentStructuredBodyResultsSection36TestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentComponentStructuredBodyResultsSection36",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION36__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentComponentStructuredBodyResultsSection36(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentComponentStructuredBodyResultsSection36TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocumentComponentStructuredBodyAdvanceDirectivesSection38() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentComponentStructuredBodyAdvanceDirectivesSection38TestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentComponentStructuredBodyAdvanceDirectivesSection38",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_COMPONENT_STRUCTURED_BODY_ADVANCE_DIRECTIVES_SECTION38__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentComponentStructuredBodyAdvanceDirectivesSection38(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentComponentStructuredBodyAdvanceDirectivesSection38TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocumentComponentStructuredBodyEncountersSection40() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentComponentStructuredBodyEncountersSection40TestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentComponentStructuredBodyEncountersSection40",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_COMPONENT_STRUCTURED_BODY_ENCOUNTERS_SECTION40__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentComponentStructuredBodyEncountersSection40(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentComponentStructuredBodyEncountersSection40TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocumentComponentStructuredBodyFamilyHistorySection42() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentComponentStructuredBodyFamilyHistorySection42TestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentComponentStructuredBodyFamilyHistorySection42",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION42__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentComponentStructuredBodyFamilyHistorySection42(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentComponentStructuredBodyFamilyHistorySection42TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocumentComponentStructuredBodyFunctionalStatusSection44() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentComponentStructuredBodyFunctionalStatusSection44TestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentComponentStructuredBodyFunctionalStatusSection44",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION44__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentComponentStructuredBodyFunctionalStatusSection44(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentComponentStructuredBodyFunctionalStatusSection44TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocumentComponentStructuredBodyImmunizationsSectionEntriesOptional46() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentComponentStructuredBodyImmunizationsSectionEntriesOptional46TestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentComponentStructuredBodyImmunizationsSectionEntriesOptional46",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL46__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentComponentStructuredBodyImmunizationsSectionEntriesOptional46(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentComponentStructuredBodyImmunizationsSectionEntriesOptional46TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocumentComponentStructuredBodyMedicalEquipmentSection48() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentComponentStructuredBodyMedicalEquipmentSection48TestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentComponentStructuredBodyMedicalEquipmentSection48",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_COMPONENT_STRUCTURED_BODY_MEDICAL_EQUIPMENT_SECTION48__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentComponentStructuredBodyMedicalEquipmentSection48(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentComponentStructuredBodyMedicalEquipmentSection48TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocumentComponentStructuredBodyPayersSection50() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentComponentStructuredBodyPayersSection50TestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentComponentStructuredBodyPayersSection50",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_COMPONENT_STRUCTURED_BODY_PAYERS_SECTION50__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentComponentStructuredBodyPayersSection50(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentComponentStructuredBodyPayersSection50TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocumentComponentStructuredBodyPlanOfCareSection52() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentComponentStructuredBodyPlanOfCareSection52TestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentComponentStructuredBodyPlanOfCareSection52",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_COMPONENT_STRUCTURED_BODY_PLAN_OF_CARE_SECTION52__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentComponentStructuredBodyPlanOfCareSection52(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentComponentStructuredBodyPlanOfCareSection52TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocumentComponentStructuredBodySocialHistorySection54() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentComponentStructuredBodySocialHistorySection54TestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentComponentStructuredBodySocialHistorySection54",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION54__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentComponentStructuredBodySocialHistorySection54(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentComponentStructuredBodySocialHistorySection54TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocumentComponentStructuredBodyVitalSignsSectionEntriesOptional56() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentComponentStructuredBodyVitalSignsSectionEntriesOptional56TestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentComponentStructuredBodyVitalSignsSectionEntriesOptional56",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL56__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentComponentStructuredBodyVitalSignsSectionEntriesOptional56(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentComponentStructuredBodyVitalSignsSectionEntriesOptional56TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateContinuityOfCareDocumentComponentStructuredBody27() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentComponentStructuredBody27TestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentComponentStructuredBody27",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_COMPONENT_STRUCTURED_BODY27__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentComponentStructuredBody27(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentComponentStructuredBody27TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<ContinuityOfCareDocument> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateGeneralHeaderConstraintsTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateGeneralHeaderConstraintsTemplateId(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ContinuityOfCareDocumentOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ContinuityOfCareDocument> {
		@Override
		public ContinuityOfCareDocument create() {
			return ConsolFactory.eINSTANCE.createContinuityOfCareDocument();
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
	private static class ConstructorTestClass extends ContinuityOfCareDocumentOperations {
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

} // ContinuityOfCareDocumentOperations
