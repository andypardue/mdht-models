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
import org.openhealthtools.mdht.uml.cda.consol.TransferSummary;
import org.openhealthtools.mdht.uml.cda.consol.operations.TransferSummaryOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Transfer Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Has An Assement And Plan Section2 Or Both Assement Section And Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Does Not Have Assement And Plan Section2 When Assement And Plan Of Treatment2 Are Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantSupport(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContact(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponent826(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component826</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Associated Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantSupportAssociatedEntityClassCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Class Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantSupportAssociatedEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Associated Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantSupportTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantSupportAssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Associated Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactAssociatedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactAssociatedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Associated Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Scoping Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactAssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOfServiceEventPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Function Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Function Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOfServiceEventClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOfServiceEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOfServiceEventPerformer1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyComponentAdvanceDirectivesSection2829(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Advance Directives Section2829</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyComponentAllergiesSection2831(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Allergies Section2831</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyComponentPhysicalExamSection2833(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Physical Exam Section2833</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyComponentEncountersSection2835(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Encounters Section2835</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyComponentFamilyHistorySection837(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Family History Section837</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyComponentFunctionalStatusSection2839(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Functional Status Section2839</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyComponentDischargeDiagnosisSection2841(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Discharge Diagnosis Section2841</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyComponentImmunizationsSectionEntriesOptional2843(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Immunizations Section Entries Optional2843</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyComponentMedicalEquipmentSection2845(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Medical Equipment Section2845</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyComponentMedicationsSection2847(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Medications Section2847</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyComponentPayersSection2849(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Payers Section2849</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyComponentPlanOfTreatmentSection2851(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Plan Of Treatment Section2851</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyComponentProblemSection2853(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Problem Section2853</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyComponentProceduresSection2855(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Procedures Section2855</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyComponentResultsSection2857(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Results Section2857</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyComponentSocialHistorySection2859(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Social History Section2859</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyComponentVitalSignsSection2861(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Vital Signs Section2861</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyComponentMentalStatusSection863(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Mental Status Section863</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyComponentGeneralStatusSection865(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component General Status Section865</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyComponentReviewOfSystemsSection867(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Review Of Systems Section867</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyComponentNutritionSection869(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Nutrition Section869</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyComponentReasonForReferralSection2871(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Reason For Referral Section2871</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyComponentHistoryOfPastIllnessSection2873(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component History Of Past Illness Section2873</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyComponentHistoryOfPresentIllnessSection875(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component History Of Present Illness Section875</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyComponentAssessmentAndPlanSection2877(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Assessment And Plan Section2877</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyComponentAssessmentSection879(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Assessment Section879</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyComponentAdmissionMedicationsSectionEntriesOptional2881(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Admission Medications Section Entries Optional2881</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyComponentAdmissionDiagnosisSection2883(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Admission Diagnosis Section2883</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyComponentCourseOfCareSection885(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Course Of Care Section885</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyAdvanceDirectivesSection2828(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Advance Directives Section2828</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyAllergiesSection2830(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Allergies Section2830</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyPhysicalExamSection2832(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Physical Exam Section2832</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyEncountersSection2834(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Encounters Section2834</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyFamilyHistorySection836(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Family History Section836</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyFunctionalStatusSection2838(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Functional Status Section2838</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyDischargeDiagnosisSection2840(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Discharge Diagnosis Section2840</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyImmunizationsSectionEntriesOptional2842(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Immunizations Section Entries Optional2842</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyMedicalEquipmentSection2844(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Medical Equipment Section2844</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyMedicationsSection2846(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Medications Section2846</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyPayersSection2848(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Payers Section2848</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyPlanOfTreatmentSection2850(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Plan Of Treatment Section2850</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyProblemSection2852(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Problem Section2852</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyProceduresSection2854(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Procedures Section2854</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyResultsSection2856(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Results Section2856</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodySocialHistorySection2858(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Social History Section2858</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyVitalSignsSection2860(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Vital Signs Section2860</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyMentalStatusSection862(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Mental Status Section862</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyGeneralStatusSection864(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body General Status Section864</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyReviewOfSystemsSection866(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Review Of Systems Section866</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyNutritionSection868(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Nutrition Section868</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyReasonForReferralSection2870(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Reason For Referral Section2870</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyHistoryOfPastIllnessSection2872(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body History Of Past Illness Section2872</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyHistoryOfPresentIllnessSection874(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body History Of Present Illness Section874</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyAssessmentAndPlanSection2876(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Assessment And Plan Section2876</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyAssessmentSection878(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Assessment Section878</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyAdmissionMedicationsSectionEntriesOptional2880(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Admission Medications Section Entries Optional2880</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyAdmissionDiagnosisSection2882(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Admission Diagnosis Section2882</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBodyCourseOfCareSection884(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Course Of Care Section884</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryComponentStructuredBody827(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body827</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class TransferSummaryTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2() {
		OperationsTestCase<TransferSummary> validateTransferSummaryHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent() {
		OperationsTestCase<TransferSummary> validateTransferSummaryDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresentTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryCodeP() {
		OperationsTestCase<TransferSummary> validateTransferSummaryCodePTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryCodeP",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryCodeP(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryCode() {
		OperationsTestCase<TransferSummary> validateTransferSummaryCodeTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryCode",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected void setDependency(TransferSummary target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.TransferSummaryCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryCode(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryTitle() {
		OperationsTestCase<TransferSummary> validateTransferSummaryTitleTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryTitle",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryTitle(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryParticipantSupport() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantSupportTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantSupport", operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantSupport(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantSupportTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryParticipantCallbackContact() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantCallbackContactTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantCallbackContact",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContact(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantCallbackContactTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryDocumentationOf() {
		OperationsTestCase<TransferSummary> validateTransferSummaryDocumentationOfTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryDocumentationOf",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryDocumentationOf(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryDocumentationOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponent826() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponent826TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponent826",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_COMPONENT826__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponent826(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponent826TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonNameTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryParticipantSupportAssociatedEntityClassCodeP() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantSupportAssociatedEntityClassCodePTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantSupportAssociatedEntityClassCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantSupportAssociatedEntityClassCodeP(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantSupportAssociatedEntityClassCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryParticipantSupportAssociatedEntityClassCode() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantSupportAssociatedEntityClassCodeTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantSupportAssociatedEntityClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantSupportAssociatedEntityClassCode(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantSupportAssociatedEntityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryParticipantSupportTypeCode() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantSupportTypeCodeTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantSupportTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantSupportTypeCode(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantSupportTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryParticipantSupportAssociatedEntity() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantSupportAssociatedEntityTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantSupportAssociatedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantSupportAssociatedEntity(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantSupportAssociatedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonNameTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCodeTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryParticipantCallbackContactAssociatedEntityId() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantCallbackContactAssociatedEntityIdTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantCallbackContactAssociatedEntityId",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityId(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantCallbackContactAssociatedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryParticipantCallbackContactAssociatedEntityAddr() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantCallbackContactAssociatedEntityAddrTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantCallbackContactAssociatedEntityAddr",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityAddr(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantCallbackContactAssociatedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecomTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganizationTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryParticipantCallbackContactTypeCode() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantCallbackContactTypeCodeTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantCallbackContactTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactTypeCode(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantCallbackContactTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryParticipantCallbackContactAssociatedEntity() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantCallbackContactAssociatedEntityTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantCallbackContactAssociatedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntity(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantCallbackContactAssociatedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryDocumentationOfServiceEventPerformerTypeCode() {
		OperationsTestCase<TransferSummary> validateTransferSummaryDocumentationOfServiceEventPerformerTypeCodeTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryDocumentationOfServiceEventPerformerTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventPerformerTypeCode(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryDocumentationOfServiceEventPerformerTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryDocumentationOfServiceEventPerformerFunctionCodeP() {
		OperationsTestCase<TransferSummary> validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCodePTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCodeP(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryDocumentationOfServiceEventPerformerFunctionCode() {
		OperationsTestCase<TransferSummary> validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCodeTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCode(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryDocumentationOfServiceEventClassCode() {
		OperationsTestCase<TransferSummary> validateTransferSummaryDocumentationOfServiceEventClassCodeTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryDocumentationOfServiceEventClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventClassCode(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryDocumentationOfServiceEventClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryDocumentationOfServiceEventCode() {
		OperationsTestCase<TransferSummary> validateTransferSummaryDocumentationOfServiceEventCodeTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryDocumentationOfServiceEventCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventCode(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryDocumentationOfServiceEventCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryDocumentationOfServiceEventPerformer1() {
		OperationsTestCase<TransferSummary> validateTransferSummaryDocumentationOfServiceEventPerformer1TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryDocumentationOfServiceEventPerformer1",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventPerformer1(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryDocumentationOfServiceEventPerformer1TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryDocumentationOfServiceEvent() {
		OperationsTestCase<TransferSummary> validateTransferSummaryDocumentationOfServiceEventTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryDocumentationOfServiceEvent",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEvent(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryDocumentationOfServiceEventTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyComponentAdvanceDirectivesSection2829() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyComponentAdvanceDirectivesSection2829TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyComponentAdvanceDirectivesSection2829",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ADVANCE_DIRECTIVES_SECTION2829__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentAdvanceDirectivesSection2829(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyComponentAdvanceDirectivesSection2829TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyComponentAllergiesSection2831() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyComponentAllergiesSection2831TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyComponentAllergiesSection2831",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION2831__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentAllergiesSection2831(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyComponentAllergiesSection2831TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyComponentPhysicalExamSection2833() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyComponentPhysicalExamSection2833TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyComponentPhysicalExamSection2833",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION2833__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentPhysicalExamSection2833(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyComponentPhysicalExamSection2833TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyComponentEncountersSection2835() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyComponentEncountersSection2835TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyComponentEncountersSection2835",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ENCOUNTERS_SECTION2835__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentEncountersSection2835(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyComponentEncountersSection2835TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyComponentFamilyHistorySection837() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyComponentFamilyHistorySection837TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyComponentFamilyHistorySection837",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION837__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentFamilyHistorySection837(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyComponentFamilyHistorySection837TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyComponentFunctionalStatusSection2839() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyComponentFunctionalStatusSection2839TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyComponentFunctionalStatusSection2839",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION2839__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentFunctionalStatusSection2839(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyComponentFunctionalStatusSection2839TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyComponentDischargeDiagnosisSection2841() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyComponentDischargeDiagnosisSection2841TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyComponentDischargeDiagnosisSection2841",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_DIAGNOSIS_SECTION2841__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentDischargeDiagnosisSection2841(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyComponentDischargeDiagnosisSection2841TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyComponentImmunizationsSectionEntriesOptional2843() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyComponentImmunizationsSectionEntriesOptional2843TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyComponentImmunizationsSectionEntriesOptional2843",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2843__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentImmunizationsSectionEntriesOptional2843(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyComponentImmunizationsSectionEntriesOptional2843TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyComponentMedicalEquipmentSection2845() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyComponentMedicalEquipmentSection2845TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyComponentMedicalEquipmentSection2845",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_EQUIPMENT_SECTION2845__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentMedicalEquipmentSection2845(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyComponentMedicalEquipmentSection2845TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyComponentMedicationsSection2847() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyComponentMedicationsSection2847TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyComponentMedicationsSection2847",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION2847__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentMedicationsSection2847(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyComponentMedicationsSection2847TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyComponentPayersSection2849() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyComponentPayersSection2849TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyComponentPayersSection2849",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PAYERS_SECTION2849__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentPayersSection2849(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyComponentPayersSection2849TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyComponentPlanOfTreatmentSection2851() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyComponentPlanOfTreatmentSection2851TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyComponentPlanOfTreatmentSection2851",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION2851__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentPlanOfTreatmentSection2851(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyComponentPlanOfTreatmentSection2851TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyComponentProblemSection2853() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyComponentProblemSection2853TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyComponentProblemSection2853",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION2853__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentProblemSection2853(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyComponentProblemSection2853TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyComponentProceduresSection2855() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyComponentProceduresSection2855TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyComponentProceduresSection2855",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION2855__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentProceduresSection2855(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyComponentProceduresSection2855TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyComponentResultsSection2857() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyComponentResultsSection2857TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyComponentResultsSection2857",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION2857__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentResultsSection2857(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyComponentResultsSection2857TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyComponentSocialHistorySection2859() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyComponentSocialHistorySection2859TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyComponentSocialHistorySection2859",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION2859__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentSocialHistorySection2859(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyComponentSocialHistorySection2859TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyComponentVitalSignsSection2861() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyComponentVitalSignsSection2861TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyComponentVitalSignsSection2861",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION2861__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentVitalSignsSection2861(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyComponentVitalSignsSection2861TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyComponentMentalStatusSection863() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyComponentMentalStatusSection863TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyComponentMentalStatusSection863",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_MENTAL_STATUS_SECTION863__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentMentalStatusSection863(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyComponentMentalStatusSection863TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyComponentGeneralStatusSection865() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyComponentGeneralStatusSection865TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyComponentGeneralStatusSection865",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_GENERAL_STATUS_SECTION865__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentGeneralStatusSection865(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyComponentGeneralStatusSection865TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyComponentReviewOfSystemsSection867() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyComponentReviewOfSystemsSection867TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyComponentReviewOfSystemsSection867",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION867__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentReviewOfSystemsSection867(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyComponentReviewOfSystemsSection867TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyComponentNutritionSection869() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyComponentNutritionSection869TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyComponentNutritionSection869",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION869__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentNutritionSection869(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyComponentNutritionSection869TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyComponentReasonForReferralSection2871() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyComponentReasonForReferralSection2871TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyComponentReasonForReferralSection2871",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_REFERRAL_SECTION2871__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentReasonForReferralSection2871(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyComponentReasonForReferralSection2871TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyComponentHistoryOfPastIllnessSection2873() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyComponentHistoryOfPastIllnessSection2873TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyComponentHistoryOfPastIllnessSection2873",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION2873__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentHistoryOfPastIllnessSection2873(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyComponentHistoryOfPastIllnessSection2873TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyComponentHistoryOfPresentIllnessSection875() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyComponentHistoryOfPresentIllnessSection875TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyComponentHistoryOfPresentIllnessSection875",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION875__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentHistoryOfPresentIllnessSection875(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyComponentHistoryOfPresentIllnessSection875TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyComponentAssessmentAndPlanSection2877() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyComponentAssessmentAndPlanSection2877TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyComponentAssessmentAndPlanSection2877",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION2877__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentAssessmentAndPlanSection2877(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyComponentAssessmentAndPlanSection2877TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyComponentAssessmentSection879() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyComponentAssessmentSection879TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyComponentAssessmentSection879",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION879__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentAssessmentSection879(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyComponentAssessmentSection879TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyComponentAdmissionMedicationsSectionEntriesOptional2881() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyComponentAdmissionMedicationsSectionEntriesOptional2881TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyComponentAdmissionMedicationsSectionEntriesOptional2881",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2881__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentAdmissionMedicationsSectionEntriesOptional2881(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyComponentAdmissionMedicationsSectionEntriesOptional2881TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyComponentAdmissionDiagnosisSection2883() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyComponentAdmissionDiagnosisSection2883TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyComponentAdmissionDiagnosisSection2883",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ADMISSION_DIAGNOSIS_SECTION2883__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentAdmissionDiagnosisSection2883(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyComponentAdmissionDiagnosisSection2883TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyComponentCourseOfCareSection885() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyComponentCourseOfCareSection885TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyComponentCourseOfCareSection885",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_COURSE_OF_CARE_SECTION885__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyComponentCourseOfCareSection885(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyComponentCourseOfCareSection885TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyAdvanceDirectivesSection2828() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyAdvanceDirectivesSection2828TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyAdvanceDirectivesSection2828",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ADVANCE_DIRECTIVES_SECTION2828__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyAdvanceDirectivesSection2828(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyAdvanceDirectivesSection2828TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyAllergiesSection2830() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyAllergiesSection2830TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyAllergiesSection2830",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION2830__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyAllergiesSection2830(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyAllergiesSection2830TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyPhysicalExamSection2832() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyPhysicalExamSection2832TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyPhysicalExamSection2832",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION2832__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyPhysicalExamSection2832(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyPhysicalExamSection2832TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyEncountersSection2834() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyEncountersSection2834TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyEncountersSection2834",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ENCOUNTERS_SECTION2834__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyEncountersSection2834(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyEncountersSection2834TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyFamilyHistorySection836() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyFamilyHistorySection836TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyFamilyHistorySection836",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION836__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyFamilyHistorySection836(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyFamilyHistorySection836TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyFunctionalStatusSection2838() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyFunctionalStatusSection2838TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyFunctionalStatusSection2838",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION2838__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyFunctionalStatusSection2838(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyFunctionalStatusSection2838TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyDischargeDiagnosisSection2840() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyDischargeDiagnosisSection2840TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyDischargeDiagnosisSection2840",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_DISCHARGE_DIAGNOSIS_SECTION2840__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyDischargeDiagnosisSection2840(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyDischargeDiagnosisSection2840TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyImmunizationsSectionEntriesOptional2842() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyImmunizationsSectionEntriesOptional2842TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyImmunizationsSectionEntriesOptional2842",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2842__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyImmunizationsSectionEntriesOptional2842(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyImmunizationsSectionEntriesOptional2842TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyMedicalEquipmentSection2844() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyMedicalEquipmentSection2844TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyMedicalEquipmentSection2844",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_MEDICAL_EQUIPMENT_SECTION2844__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyMedicalEquipmentSection2844(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyMedicalEquipmentSection2844TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyMedicationsSection2846() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyMedicationsSection2846TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyMedicationsSection2846",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION2846__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyMedicationsSection2846(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyMedicationsSection2846TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyPayersSection2848() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyPayersSection2848TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyPayersSection2848",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PAYERS_SECTION2848__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyPayersSection2848(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyPayersSection2848TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyPlanOfTreatmentSection2850() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyPlanOfTreatmentSection2850TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyPlanOfTreatmentSection2850",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION2850__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyPlanOfTreatmentSection2850(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyPlanOfTreatmentSection2850TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyProblemSection2852() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyProblemSection2852TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyProblemSection2852",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION2852__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyProblemSection2852(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyProblemSection2852TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyProceduresSection2854() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyProceduresSection2854TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyProceduresSection2854",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION2854__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyProceduresSection2854(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyProceduresSection2854TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyResultsSection2856() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyResultsSection2856TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyResultsSection2856",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION2856__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyResultsSection2856(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyResultsSection2856TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodySocialHistorySection2858() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodySocialHistorySection2858TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodySocialHistorySection2858",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION2858__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodySocialHistorySection2858(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodySocialHistorySection2858TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyVitalSignsSection2860() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyVitalSignsSection2860TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyVitalSignsSection2860",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION2860__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyVitalSignsSection2860(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyVitalSignsSection2860TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyMentalStatusSection862() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyMentalStatusSection862TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyMentalStatusSection862",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_MENTAL_STATUS_SECTION862__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyMentalStatusSection862(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyMentalStatusSection862TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyGeneralStatusSection864() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyGeneralStatusSection864TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyGeneralStatusSection864",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_GENERAL_STATUS_SECTION864__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyGeneralStatusSection864(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyGeneralStatusSection864TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyReviewOfSystemsSection866() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyReviewOfSystemsSection866TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyReviewOfSystemsSection866",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION866__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyReviewOfSystemsSection866(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyReviewOfSystemsSection866TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyNutritionSection868() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyNutritionSection868TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyNutritionSection868",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION868__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyNutritionSection868(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyNutritionSection868TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyReasonForReferralSection2870() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyReasonForReferralSection2870TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyReasonForReferralSection2870",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_REASON_FOR_REFERRAL_SECTION2870__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyReasonForReferralSection2870(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyReasonForReferralSection2870TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyHistoryOfPastIllnessSection2872() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyHistoryOfPastIllnessSection2872TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyHistoryOfPastIllnessSection2872",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION2872__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyHistoryOfPastIllnessSection2872(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyHistoryOfPastIllnessSection2872TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyHistoryOfPresentIllnessSection874() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyHistoryOfPresentIllnessSection874TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyHistoryOfPresentIllnessSection874",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION874__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyHistoryOfPresentIllnessSection874(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyHistoryOfPresentIllnessSection874TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyAssessmentAndPlanSection2876() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyAssessmentAndPlanSection2876TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyAssessmentAndPlanSection2876",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION2876__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyAssessmentAndPlanSection2876(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyAssessmentAndPlanSection2876TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyAssessmentSection878() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyAssessmentSection878TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyAssessmentSection878",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION878__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyAssessmentSection878(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyAssessmentSection878TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyAdmissionMedicationsSectionEntriesOptional2880() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyAdmissionMedicationsSectionEntriesOptional2880TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyAdmissionMedicationsSectionEntriesOptional2880",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2880__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyAdmissionMedicationsSectionEntriesOptional2880(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyAdmissionMedicationsSectionEntriesOptional2880TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyAdmissionDiagnosisSection2882() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyAdmissionDiagnosisSection2882TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyAdmissionDiagnosisSection2882",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ADMISSION_DIAGNOSIS_SECTION2882__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyAdmissionDiagnosisSection2882(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyAdmissionDiagnosisSection2882TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBodyCourseOfCareSection884() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBodyCourseOfCareSection884TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBodyCourseOfCareSection884",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COURSE_OF_CARE_SECTION884__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBodyCourseOfCareSection884(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBodyCourseOfCareSection884TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTransferSummaryComponentStructuredBody827() {
		OperationsTestCase<TransferSummary> validateTransferSummaryComponentStructuredBody827TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryComponentStructuredBody827",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY827__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryComponentStructuredBody827(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryComponentStructuredBody827TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<TransferSummary> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<TransferSummary>(
			"validateGeneralHeaderConstraintsTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateGeneralHeaderConstraintsTemplateId(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends TransferSummaryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TransferSummary> {
		@Override
		public TransferSummary create() {
			return ConsolFactory.eINSTANCE.createTransferSummary();
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
	private static class ConstructorTestClass extends TransferSummaryOperations {
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

} // TransferSummaryOperations
