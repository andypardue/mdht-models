/*******************************************************************************
 * Copyright (c) 2014 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *     								 - modified VALIDATE_TRANSFER_SUMMARY_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP due to inline datatype OCL generation issue
 *     								 - removed prior modification as root requirement (and entire id) was removed in the final draft 
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.AdmissionDiagnosisSection2;
import org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.CourseOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.DischargeDiagnosisSection2;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSection2;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection2;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.NutritionSection;
import org.openhealthtools.mdht.uml.cda.consol.PayersSection2;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection2;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection2;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.TransferSummary;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

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
public class TransferSummaryOperations extends USRealmHeader2Operations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransferSummaryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Has An Assement And Plan Section2 Or Both Assement Section And Plan Of Treatment Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2)) and  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Has An Assement And Plan Section2 Or Both Assement Section And Plan Of Treatment Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2"),
						 new Object [] { transferSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Does Not Have Assement And Plan Section2 When Assement And Plan Of Treatment2 Are Present</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2)) or  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Does Not Have Assement And Plan Section2 When Assement And Plan Of Treatment2 Are Present</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent"),
						 new Object [] { transferSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryCodeP(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryCodeP(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryCodeP(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryCodeP(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryCodeP(TransferSummary transferSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_CODE_P,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryCodeP"),
						 new Object [] { transferSummary }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.TransferSummaryCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.TransferSummaryCodeP", passToken);
				}
				passToken.add(transferSummary);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryCode(TransferSummary transferSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.TransferSummaryCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(transferSummary)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_TRANSFER_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_CODE,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryCode"),
						 new Object [] { transferSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryTitle(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryTitle(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryTitle(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryTitle(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryTitle(TransferSummary transferSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_TITLE,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryTitle"),
						 new Object [] { transferSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantSupport(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupport(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantSupport(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupport(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryParticipantSupport(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_SUPPORT,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantSupport"),
						 new Object [] { transferSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantCallbackContact(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContact(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantCallbackContact(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContact(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryParticipantCallbackContact(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantCallbackContact"),
						 new Object [] { transferSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryDocumentationOf(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOf(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryDocumentationOf(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOf(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryDocumentationOf(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_DOCUMENTATION_OF,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryDocumentationOf"),
						 new Object [] { transferSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponent826(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component826</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponent826(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT826__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component2 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component2))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponent826(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component826</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponent826(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TRANSFER_SUMMARY_COMPONENT826__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTransferSummaryComponent826(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT826__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_COMPONENT826__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_COMPONENT826__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT826__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT826,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponent826"),
						 new Object [] { transferSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Associated Person Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null).associatedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() >= 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Associated Person Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantSupportAssociatedEntityClassCodeP(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Class Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportAssociatedEntityClassCodeP(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject(isDefined('classCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantSupportAssociatedEntityClassCodeP(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Class Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportAssociatedEntityClassCodeP(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantSupportAssociatedEntityClassCodeP(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE_P,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantSupportAssociatedEntityClassCodeP"),
						 new Object [] { eObject }));
				}
				
				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.TransferSummaryParticipantSupportAssociatedEntityClassCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put("org.openhealthtools.mdht.uml.cda.consol.TransferSummaryParticipantSupportAssociatedEntityClassCodeP", passToken);
					}
					passToken.addAll(oclResultSet);
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantSupportAssociatedEntityClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportAssociatedEntityClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject(not classCode.oclIsUndefined() and classCode.oclIsKindOf(vocab::RoleClassAssociative) and "+
"let value : vocab::RoleClassAssociative = classCode.oclAsType(vocab::RoleClassAssociative) in "+
"value = vocab::RoleClassAssociative::PRS or value = vocab::RoleClassAssociative::NOK or value = vocab::RoleClassAssociative::CAREGIVER or value = vocab::RoleClassAssociative::AGNT or value = vocab::RoleClassAssociative::GUAR or value = vocab::RoleClassAssociative::ECON)";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantSupportAssociatedEntityClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportAssociatedEntityClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantSupportAssociatedEntityClassCode(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			Object passFilter = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.TransferSummaryParticipantSupportAssociatedEntityClassCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}
	  		
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantSupportAssociatedEntityClassCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Associated Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject(associatedPerson->one(associatedPerson : cda::Person | not associatedPerson.oclIsUndefined() and associatedPerson.oclIsKindOf(cda::Person)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Associated Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantSupportTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(typeCode=vocab::ParticipationType::IND)";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantSupportTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantSupportTypeCode(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_TYPE_CODE,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantSupportTypeCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantSupportAssociatedEntity(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportAssociatedEntity(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(associatedEntity->one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantSupportAssociatedEntity(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportAssociatedEntity(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantSupportAssociatedEntity(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantSupportAssociatedEntity"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Associated Person Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null).associatedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() >= 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Associated Person Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject(classCode=vocab::RoleClassAssociative::ASSIGNED)";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantCallbackContactAssociatedEntityClassCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityId(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityId(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() >= 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityId(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityId(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityId(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ID,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantCallbackContactAssociatedEntityId"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityAddr(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityAddr(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityAddr(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityAddr(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityAddr(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ADDR,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantCallbackContactAssociatedEntityAddr"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (telecom->size() >= 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_TELECOM,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantCallbackContactAssociatedEntityTelecom"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Associated Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject(associatedPerson->one(associatedPerson : cda::Person | not associatedPerson.oclIsUndefined() and associatedPerson.oclIsKindOf(cda::Person)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Associated Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Scoping Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject(scopingOrganization->one(scopingOrganization : cda::Organization | not scopingOrganization.oclIsUndefined() and scopingOrganization.oclIsKindOf(rim::Entity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Scoping Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantCallbackContactTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(isDefined('typeCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantCallbackContactTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantCallbackContactTypeCode(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_TYPE_CODE,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantCallbackContactTypeCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntity(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntity(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(associatedEntity->one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntity(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntity(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantCallbackContactAssociatedEntity(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantCallbackContactAssociatedEntity"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryDocumentationOfServiceEventPerformerTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventPerformerTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject(typeCode=vocab::x_ServiceEventPerformer::PRF)";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryDocumentationOfServiceEventPerformerTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventPerformerTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryDocumentationOfServiceEventPerformerTypeCode(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryDocumentationOfServiceEventPerformerTypeCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCodeP(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Function Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCodeP(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject((functionCode.oclIsUndefined() or functionCode.isNullFlavorUndefined()) implies (not functionCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCodeP(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Function Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCodeP(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCodeP(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE_P,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryDocumentationOfServiceEventPerformerFunctionCodeP"),
						 new Object [] { eObject }));
				}
				
				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.TransferSummaryDocumentationOfServiceEventPerformerFunctionCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put("org.openhealthtools.mdht.uml.cda.consol.TransferSummaryDocumentationOfServiceEventPerformerFunctionCodeP", passToken);
					}
					passToken.addAll(oclResultSet);
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Function Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject((functionCode.oclIsUndefined() or functionCode.isNullFlavorUndefined()) implies (not functionCode.oclIsUndefined() and functionCode.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = functionCode.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Function Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCode(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			Object passFilter = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.TransferSummaryDocumentationOfServiceEventPerformerFunctionCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}
	  		
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryDocumentationOfServiceEventPerformerFunctionCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryDocumentationOfServiceEventClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(isDefined('classCode') and classCode=vocab::ActClassRoot::PCPR)";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryDocumentationOfServiceEventClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryDocumentationOfServiceEventClassCode(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryDocumentationOfServiceEventClassCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryDocumentationOfServiceEventCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryDocumentationOfServiceEventCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryDocumentationOfServiceEventCode(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CODE,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryDocumentationOfServiceEventCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryDocumentationOfServiceEventPerformer1(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventPerformer1(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(performer->exists(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer1)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryDocumentationOfServiceEventPerformer1(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer1</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventPerformer1(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryDocumentationOfServiceEventPerformer1(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryDocumentationOfServiceEventPerformer1"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryDocumentationOfServiceEvent(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEvent(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null)->reject(serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(cda::ServiceEvent)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryDocumentationOfServiceEvent(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEvent(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryDocumentationOfServiceEvent(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryDocumentationOfServiceEvent"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyComponentAdvanceDirectivesSection2829(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Advance Directives Section2829</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentAdvanceDirectivesSection2829(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ADVANCE_DIRECTIVES_SECTION2829__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyComponentAdvanceDirectivesSection2829(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Advance Directives Section2829</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentAdvanceDirectivesSection2829(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ADVANCE_DIRECTIVES_SECTION2829__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyComponentAdvanceDirectivesSection2829(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ADVANCE_DIRECTIVES_SECTION2829__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ADVANCE_DIRECTIVES_SECTION2829__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ADVANCE_DIRECTIVES_SECTION2829__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ADVANCE_DIRECTIVES_SECTION2829__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ADVANCE_DIRECTIVES_SECTION2829,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyComponentAdvanceDirectivesSection2829"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyComponentAllergiesSection2831(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Allergies Section2831</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentAllergiesSection2831(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION2831__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyComponentAllergiesSection2831(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Allergies Section2831</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentAllergiesSection2831(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION2831__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyComponentAllergiesSection2831(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION2831__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION2831__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION2831__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION2831__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION2831,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyComponentAllergiesSection2831"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyComponentPhysicalExamSection2833(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Physical Exam Section2833</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentPhysicalExamSection2833(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION2833__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyComponentPhysicalExamSection2833(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Physical Exam Section2833</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentPhysicalExamSection2833(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION2833__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyComponentPhysicalExamSection2833(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION2833__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION2833__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION2833__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION2833__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION2833,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyComponentPhysicalExamSection2833"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyComponentEncountersSection2835(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Encounters Section2835</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentEncountersSection2835(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ENCOUNTERS_SECTION2835__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::EncountersSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyComponentEncountersSection2835(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Encounters Section2835</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentEncountersSection2835(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ENCOUNTERS_SECTION2835__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyComponentEncountersSection2835(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ENCOUNTERS_SECTION2835__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ENCOUNTERS_SECTION2835__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ENCOUNTERS_SECTION2835__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ENCOUNTERS_SECTION2835__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ENCOUNTERS_SECTION2835,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyComponentEncountersSection2835"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyComponentFamilyHistorySection837(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Family History Section837</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentFamilyHistorySection837(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION837__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyComponentFamilyHistorySection837(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Family History Section837</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentFamilyHistorySection837(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION837__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyComponentFamilyHistorySection837(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION837__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION837__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION837__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION837__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION837,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyComponentFamilyHistorySection837"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyComponentFunctionalStatusSection2839(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Functional Status Section2839</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentFunctionalStatusSection2839(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION2839__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyComponentFunctionalStatusSection2839(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Functional Status Section2839</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentFunctionalStatusSection2839(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION2839__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyComponentFunctionalStatusSection2839(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION2839__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION2839__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION2839__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION2839__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION2839,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyComponentFunctionalStatusSection2839"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyComponentDischargeDiagnosisSection2841(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Discharge Diagnosis Section2841</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentDischargeDiagnosisSection2841(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_DIAGNOSIS_SECTION2841__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DischargeDiagnosisSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyComponentDischargeDiagnosisSection2841(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Discharge Diagnosis Section2841</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentDischargeDiagnosisSection2841(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_DIAGNOSIS_SECTION2841__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyComponentDischargeDiagnosisSection2841(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_DIAGNOSIS_SECTION2841__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_DIAGNOSIS_SECTION2841__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_DIAGNOSIS_SECTION2841__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_DIAGNOSIS_SECTION2841__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_DIAGNOSIS_SECTION2841,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyComponentDischargeDiagnosisSection2841"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyComponentImmunizationsSectionEntriesOptional2843(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Immunizations Section Entries Optional2843</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentImmunizationsSectionEntriesOptional2843(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2843__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyComponentImmunizationsSectionEntriesOptional2843(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Immunizations Section Entries Optional2843</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentImmunizationsSectionEntriesOptional2843(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2843__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyComponentImmunizationsSectionEntriesOptional2843(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2843__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2843__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2843__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2843__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2843,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyComponentImmunizationsSectionEntriesOptional2843"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyComponentMedicalEquipmentSection2845(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Medical Equipment Section2845</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentMedicalEquipmentSection2845(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_EQUIPMENT_SECTION2845__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyComponentMedicalEquipmentSection2845(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Medical Equipment Section2845</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentMedicalEquipmentSection2845(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_EQUIPMENT_SECTION2845__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyComponentMedicalEquipmentSection2845(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_EQUIPMENT_SECTION2845__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_EQUIPMENT_SECTION2845__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_EQUIPMENT_SECTION2845__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_EQUIPMENT_SECTION2845__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_EQUIPMENT_SECTION2845,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyComponentMedicalEquipmentSection2845"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyComponentMedicationsSection2847(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Medications Section2847</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentMedicationsSection2847(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION2847__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyComponentMedicationsSection2847(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Medications Section2847</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentMedicationsSection2847(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION2847__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyComponentMedicationsSection2847(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION2847__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION2847__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION2847__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION2847__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION2847,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyComponentMedicationsSection2847"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyComponentPayersSection2849(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Payers Section2849</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentPayersSection2849(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PAYERS_SECTION2849__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PayersSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyComponentPayersSection2849(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Payers Section2849</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentPayersSection2849(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PAYERS_SECTION2849__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyComponentPayersSection2849(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PAYERS_SECTION2849__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PAYERS_SECTION2849__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PAYERS_SECTION2849__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PAYERS_SECTION2849__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PAYERS_SECTION2849,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyComponentPayersSection2849"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyComponentPlanOfTreatmentSection2851(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Plan Of Treatment Section2851</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentPlanOfTreatmentSection2851(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION2851__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyComponentPlanOfTreatmentSection2851(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Plan Of Treatment Section2851</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentPlanOfTreatmentSection2851(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION2851__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyComponentPlanOfTreatmentSection2851(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION2851__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION2851__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION2851__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION2851__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION2851,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyComponentPlanOfTreatmentSection2851"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyComponentProblemSection2853(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Problem Section2853</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentProblemSection2853(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION2853__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyComponentProblemSection2853(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Problem Section2853</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentProblemSection2853(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION2853__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyComponentProblemSection2853(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION2853__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION2853__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION2853__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION2853__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION2853,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyComponentProblemSection2853"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyComponentProceduresSection2855(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Procedures Section2855</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentProceduresSection2855(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION2855__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyComponentProceduresSection2855(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Procedures Section2855</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentProceduresSection2855(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION2855__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyComponentProceduresSection2855(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION2855__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION2855__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION2855__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION2855__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION2855,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyComponentProceduresSection2855"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyComponentResultsSection2857(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Results Section2857</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentResultsSection2857(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION2857__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyComponentResultsSection2857(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Results Section2857</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentResultsSection2857(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION2857__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyComponentResultsSection2857(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION2857__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION2857__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION2857__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION2857__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION2857,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyComponentResultsSection2857"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyComponentSocialHistorySection2859(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Social History Section2859</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentSocialHistorySection2859(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION2859__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyComponentSocialHistorySection2859(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Social History Section2859</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentSocialHistorySection2859(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION2859__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyComponentSocialHistorySection2859(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION2859__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION2859__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION2859__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION2859__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION2859,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyComponentSocialHistorySection2859"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyComponentVitalSignsSection2861(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Vital Signs Section2861</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentVitalSignsSection2861(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION2861__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyComponentVitalSignsSection2861(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Vital Signs Section2861</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentVitalSignsSection2861(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION2861__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyComponentVitalSignsSection2861(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION2861__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION2861__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION2861__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION2861__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION2861,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyComponentVitalSignsSection2861"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyComponentMentalStatusSection863(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Mental Status Section863</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentMentalStatusSection863(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_MENTAL_STATUS_SECTION863__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MentalStatusSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyComponentMentalStatusSection863(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Mental Status Section863</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentMentalStatusSection863(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_MENTAL_STATUS_SECTION863__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyComponentMentalStatusSection863(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_MENTAL_STATUS_SECTION863__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_MENTAL_STATUS_SECTION863__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_MENTAL_STATUS_SECTION863__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_MENTAL_STATUS_SECTION863__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_MENTAL_STATUS_SECTION863,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyComponentMentalStatusSection863"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyComponentGeneralStatusSection865(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component General Status Section865</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentGeneralStatusSection865(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_GENERAL_STATUS_SECTION865__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::GeneralStatusSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyComponentGeneralStatusSection865(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component General Status Section865</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentGeneralStatusSection865(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_GENERAL_STATUS_SECTION865__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyComponentGeneralStatusSection865(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_GENERAL_STATUS_SECTION865__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_GENERAL_STATUS_SECTION865__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_GENERAL_STATUS_SECTION865__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_GENERAL_STATUS_SECTION865__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_GENERAL_STATUS_SECTION865,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyComponentGeneralStatusSection865"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyComponentReviewOfSystemsSection867(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Review Of Systems Section867</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentReviewOfSystemsSection867(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION867__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyComponentReviewOfSystemsSection867(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Review Of Systems Section867</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentReviewOfSystemsSection867(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION867__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyComponentReviewOfSystemsSection867(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION867__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION867__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION867__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION867__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION867,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyComponentReviewOfSystemsSection867"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyComponentNutritionSection869(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Nutrition Section869</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentNutritionSection869(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION869__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::NutritionSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyComponentNutritionSection869(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Nutrition Section869</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentNutritionSection869(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION869__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyComponentNutritionSection869(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION869__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION869__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION869__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION869__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION869,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyComponentNutritionSection869"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyComponentReasonForReferralSection2871(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Reason For Referral Section2871</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentReasonForReferralSection2871(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_REFERRAL_SECTION2871__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForReferralSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyComponentReasonForReferralSection2871(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Reason For Referral Section2871</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentReasonForReferralSection2871(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_REFERRAL_SECTION2871__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyComponentReasonForReferralSection2871(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_REFERRAL_SECTION2871__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_REFERRAL_SECTION2871__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_REFERRAL_SECTION2871__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_REFERRAL_SECTION2871__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_REFERRAL_SECTION2871,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyComponentReasonForReferralSection2871"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyComponentHistoryOfPastIllnessSection2873(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component History Of Past Illness Section2873</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentHistoryOfPastIllnessSection2873(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION2873__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyComponentHistoryOfPastIllnessSection2873(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component History Of Past Illness Section2873</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentHistoryOfPastIllnessSection2873(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION2873__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyComponentHistoryOfPastIllnessSection2873(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION2873__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION2873__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION2873__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION2873__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION2873,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyComponentHistoryOfPastIllnessSection2873"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyComponentHistoryOfPresentIllnessSection875(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component History Of Present Illness Section875</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentHistoryOfPresentIllnessSection875(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION875__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyComponentHistoryOfPresentIllnessSection875(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component History Of Present Illness Section875</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentHistoryOfPresentIllnessSection875(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION875__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyComponentHistoryOfPresentIllnessSection875(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION875__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION875__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION875__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION875__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION875,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyComponentHistoryOfPresentIllnessSection875"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyComponentAssessmentAndPlanSection2877(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Assessment And Plan Section2877</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentAssessmentAndPlanSection2877(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION2877__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyComponentAssessmentAndPlanSection2877(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Assessment And Plan Section2877</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentAssessmentAndPlanSection2877(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION2877__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyComponentAssessmentAndPlanSection2877(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION2877__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION2877__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION2877__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION2877__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION2877,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyComponentAssessmentAndPlanSection2877"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyComponentAssessmentSection879(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Assessment Section879</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentAssessmentSection879(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION879__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyComponentAssessmentSection879(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Assessment Section879</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentAssessmentSection879(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION879__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyComponentAssessmentSection879(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION879__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION879__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION879__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION879__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION879,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyComponentAssessmentSection879"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyComponentAdmissionMedicationsSectionEntriesOptional2881(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Admission Medications Section Entries Optional2881</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentAdmissionMedicationsSectionEntriesOptional2881(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2881__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdmissionMedicationsSectionEntriesOptional2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyComponentAdmissionMedicationsSectionEntriesOptional2881(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Admission Medications Section Entries Optional2881</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentAdmissionMedicationsSectionEntriesOptional2881(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2881__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyComponentAdmissionMedicationsSectionEntriesOptional2881(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2881__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2881__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2881__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2881__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2881,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyComponentAdmissionMedicationsSectionEntriesOptional2881"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyComponentAdmissionDiagnosisSection2883(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Admission Diagnosis Section2883</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentAdmissionDiagnosisSection2883(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ADMISSION_DIAGNOSIS_SECTION2883__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdmissionDiagnosisSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyComponentAdmissionDiagnosisSection2883(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Admission Diagnosis Section2883</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentAdmissionDiagnosisSection2883(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ADMISSION_DIAGNOSIS_SECTION2883__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyComponentAdmissionDiagnosisSection2883(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ADMISSION_DIAGNOSIS_SECTION2883__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ADMISSION_DIAGNOSIS_SECTION2883__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ADMISSION_DIAGNOSIS_SECTION2883__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ADMISSION_DIAGNOSIS_SECTION2883__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ADMISSION_DIAGNOSIS_SECTION2883,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyComponentAdmissionDiagnosisSection2883"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyComponentCourseOfCareSection885(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Course Of Care Section885</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentCourseOfCareSection885(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_COURSE_OF_CARE_SECTION885__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::CourseOfCareSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyComponentCourseOfCareSection885(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Component Course Of Care Section885</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyComponentCourseOfCareSection885(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_COURSE_OF_CARE_SECTION885__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyComponentCourseOfCareSection885(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_COURSE_OF_CARE_SECTION885__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_COURSE_OF_CARE_SECTION885__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_COURSE_OF_CARE_SECTION885__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_COURSE_OF_CARE_SECTION885__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_COURSE_OF_CARE_SECTION885,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyComponentCourseOfCareSection885"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyAdvanceDirectivesSection2828(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Advance Directives Section2828</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyAdvanceDirectivesSection2828(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ADVANCE_DIRECTIVES_SECTION2828__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyAdvanceDirectivesSection2828(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Advance Directives Section2828</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyAdvanceDirectivesSection2828(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ADVANCE_DIRECTIVES_SECTION2828__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyAdvanceDirectivesSection2828(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ADVANCE_DIRECTIVES_SECTION2828__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ADVANCE_DIRECTIVES_SECTION2828__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ADVANCE_DIRECTIVES_SECTION2828__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ADVANCE_DIRECTIVES_SECTION2828__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ADVANCE_DIRECTIVES_SECTION2828,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyAdvanceDirectivesSection2828"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyAllergiesSection2830(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Allergies Section2830</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyAllergiesSection2830(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION2830__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyAllergiesSection2830(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Allergies Section2830</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyAllergiesSection2830(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION2830__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyAllergiesSection2830(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION2830__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION2830__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION2830__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION2830__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION2830,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyAllergiesSection2830"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyPhysicalExamSection2832(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Physical Exam Section2832</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyPhysicalExamSection2832(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION2832__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyPhysicalExamSection2832(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Physical Exam Section2832</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyPhysicalExamSection2832(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION2832__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyPhysicalExamSection2832(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION2832__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION2832__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION2832__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION2832__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION2832,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyPhysicalExamSection2832"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyEncountersSection2834(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Encounters Section2834</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyEncountersSection2834(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ENCOUNTERS_SECTION2834__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyEncountersSection2834(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Encounters Section2834</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyEncountersSection2834(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ENCOUNTERS_SECTION2834__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyEncountersSection2834(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ENCOUNTERS_SECTION2834__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ENCOUNTERS_SECTION2834__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ENCOUNTERS_SECTION2834__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ENCOUNTERS_SECTION2834__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ENCOUNTERS_SECTION2834,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyEncountersSection2834"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyFamilyHistorySection836(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Family History Section836</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyFamilyHistorySection836(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION836__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyFamilyHistorySection836(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Family History Section836</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyFamilyHistorySection836(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION836__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyFamilyHistorySection836(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION836__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION836__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION836__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION836__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION836,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyFamilyHistorySection836"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyFunctionalStatusSection2838(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Functional Status Section2838</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyFunctionalStatusSection2838(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION2838__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyFunctionalStatusSection2838(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Functional Status Section2838</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyFunctionalStatusSection2838(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION2838__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyFunctionalStatusSection2838(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION2838__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION2838__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION2838__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION2838__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION2838,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyFunctionalStatusSection2838"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyDischargeDiagnosisSection2840(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Discharge Diagnosis Section2840</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyDischargeDiagnosisSection2840(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_DISCHARGE_DIAGNOSIS_SECTION2840__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyDischargeDiagnosisSection2840(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Discharge Diagnosis Section2840</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyDischargeDiagnosisSection2840(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_DISCHARGE_DIAGNOSIS_SECTION2840__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyDischargeDiagnosisSection2840(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_DISCHARGE_DIAGNOSIS_SECTION2840__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_DISCHARGE_DIAGNOSIS_SECTION2840__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_DISCHARGE_DIAGNOSIS_SECTION2840__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_DISCHARGE_DIAGNOSIS_SECTION2840__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_DISCHARGE_DIAGNOSIS_SECTION2840,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyDischargeDiagnosisSection2840"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyImmunizationsSectionEntriesOptional2842(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Immunizations Section Entries Optional2842</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyImmunizationsSectionEntriesOptional2842(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2842__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyImmunizationsSectionEntriesOptional2842(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Immunizations Section Entries Optional2842</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyImmunizationsSectionEntriesOptional2842(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2842__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyImmunizationsSectionEntriesOptional2842(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2842__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2842__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2842__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2842__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2842,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyImmunizationsSectionEntriesOptional2842"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyMedicalEquipmentSection2844(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Medical Equipment Section2844</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyMedicalEquipmentSection2844(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_MEDICAL_EQUIPMENT_SECTION2844__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyMedicalEquipmentSection2844(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Medical Equipment Section2844</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyMedicalEquipmentSection2844(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_MEDICAL_EQUIPMENT_SECTION2844__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyMedicalEquipmentSection2844(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_MEDICAL_EQUIPMENT_SECTION2844__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_MEDICAL_EQUIPMENT_SECTION2844__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_MEDICAL_EQUIPMENT_SECTION2844__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_MEDICAL_EQUIPMENT_SECTION2844__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_MEDICAL_EQUIPMENT_SECTION2844,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyMedicalEquipmentSection2844"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyMedicationsSection2846(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Medications Section2846</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyMedicationsSection2846(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION2846__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyMedicationsSection2846(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Medications Section2846</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyMedicationsSection2846(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION2846__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyMedicationsSection2846(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION2846__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION2846__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION2846__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION2846__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION2846,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyMedicationsSection2846"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyPayersSection2848(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Payers Section2848</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyPayersSection2848(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PAYERS_SECTION2848__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyPayersSection2848(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Payers Section2848</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyPayersSection2848(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PAYERS_SECTION2848__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyPayersSection2848(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PAYERS_SECTION2848__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PAYERS_SECTION2848__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PAYERS_SECTION2848__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PAYERS_SECTION2848__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PAYERS_SECTION2848,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyPayersSection2848"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyPlanOfTreatmentSection2850(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Plan Of Treatment Section2850</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyPlanOfTreatmentSection2850(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION2850__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyPlanOfTreatmentSection2850(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Plan Of Treatment Section2850</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyPlanOfTreatmentSection2850(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION2850__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyPlanOfTreatmentSection2850(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION2850__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION2850__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION2850__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION2850__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION2850,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyPlanOfTreatmentSection2850"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyProblemSection2852(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Problem Section2852</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyProblemSection2852(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION2852__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyProblemSection2852(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Problem Section2852</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyProblemSection2852(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION2852__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyProblemSection2852(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION2852__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION2852__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION2852__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION2852__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION2852,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyProblemSection2852"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyProceduresSection2854(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Procedures Section2854</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyProceduresSection2854(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION2854__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyProceduresSection2854(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Procedures Section2854</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyProceduresSection2854(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION2854__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyProceduresSection2854(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION2854__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION2854__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION2854__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION2854__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION2854,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyProceduresSection2854"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyResultsSection2856(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Results Section2856</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyResultsSection2856(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION2856__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyResultsSection2856(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Results Section2856</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyResultsSection2856(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION2856__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyResultsSection2856(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION2856__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION2856__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION2856__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION2856__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION2856,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyResultsSection2856"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodySocialHistorySection2858(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Social History Section2858</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodySocialHistorySection2858(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION2858__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodySocialHistorySection2858(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Social History Section2858</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodySocialHistorySection2858(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION2858__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodySocialHistorySection2858(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION2858__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION2858__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION2858__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION2858__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION2858,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodySocialHistorySection2858"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyVitalSignsSection2860(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Vital Signs Section2860</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyVitalSignsSection2860(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION2860__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyVitalSignsSection2860(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Vital Signs Section2860</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyVitalSignsSection2860(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION2860__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyVitalSignsSection2860(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION2860__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION2860__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION2860__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION2860__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION2860,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyVitalSignsSection2860"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyMentalStatusSection862(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Mental Status Section862</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyMentalStatusSection862(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_MENTAL_STATUS_SECTION862__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyMentalStatusSection862(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Mental Status Section862</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyMentalStatusSection862(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_MENTAL_STATUS_SECTION862__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyMentalStatusSection862(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_MENTAL_STATUS_SECTION862__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_MENTAL_STATUS_SECTION862__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_MENTAL_STATUS_SECTION862__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_MENTAL_STATUS_SECTION862__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_MENTAL_STATUS_SECTION862,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyMentalStatusSection862"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyGeneralStatusSection864(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body General Status Section864</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyGeneralStatusSection864(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_GENERAL_STATUS_SECTION864__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyGeneralStatusSection864(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body General Status Section864</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyGeneralStatusSection864(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_GENERAL_STATUS_SECTION864__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyGeneralStatusSection864(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_GENERAL_STATUS_SECTION864__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_GENERAL_STATUS_SECTION864__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_GENERAL_STATUS_SECTION864__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_GENERAL_STATUS_SECTION864__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_GENERAL_STATUS_SECTION864,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyGeneralStatusSection864"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyReviewOfSystemsSection866(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Review Of Systems Section866</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyReviewOfSystemsSection866(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION866__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyReviewOfSystemsSection866(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Review Of Systems Section866</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyReviewOfSystemsSection866(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION866__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyReviewOfSystemsSection866(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION866__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION866__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION866__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION866__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION866,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyReviewOfSystemsSection866"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyNutritionSection868(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Nutrition Section868</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyNutritionSection868(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION868__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyNutritionSection868(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Nutrition Section868</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyNutritionSection868(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION868__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyNutritionSection868(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION868__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION868__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION868__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION868__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION868,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyNutritionSection868"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyReasonForReferralSection2870(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Reason For Referral Section2870</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyReasonForReferralSection2870(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_REASON_FOR_REFERRAL_SECTION2870__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyReasonForReferralSection2870(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Reason For Referral Section2870</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyReasonForReferralSection2870(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_REASON_FOR_REFERRAL_SECTION2870__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyReasonForReferralSection2870(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_REASON_FOR_REFERRAL_SECTION2870__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_REASON_FOR_REFERRAL_SECTION2870__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_REASON_FOR_REFERRAL_SECTION2870__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_REASON_FOR_REFERRAL_SECTION2870__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_REASON_FOR_REFERRAL_SECTION2870,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyReasonForReferralSection2870"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyHistoryOfPastIllnessSection2872(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body History Of Past Illness Section2872</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyHistoryOfPastIllnessSection2872(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION2872__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyHistoryOfPastIllnessSection2872(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body History Of Past Illness Section2872</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyHistoryOfPastIllnessSection2872(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION2872__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyHistoryOfPastIllnessSection2872(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION2872__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION2872__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION2872__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION2872__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION2872,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyHistoryOfPastIllnessSection2872"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyHistoryOfPresentIllnessSection874(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body History Of Present Illness Section874</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyHistoryOfPresentIllnessSection874(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION874__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyHistoryOfPresentIllnessSection874(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body History Of Present Illness Section874</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyHistoryOfPresentIllnessSection874(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION874__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyHistoryOfPresentIllnessSection874(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION874__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION874__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION874__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION874__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION874,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyHistoryOfPresentIllnessSection874"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyAssessmentAndPlanSection2876(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Assessment And Plan Section2876</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyAssessmentAndPlanSection2876(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION2876__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyAssessmentAndPlanSection2876(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Assessment And Plan Section2876</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyAssessmentAndPlanSection2876(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION2876__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyAssessmentAndPlanSection2876(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION2876__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION2876__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION2876__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION2876__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION2876,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyAssessmentAndPlanSection2876"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyAssessmentSection878(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Assessment Section878</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyAssessmentSection878(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION878__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyAssessmentSection878(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Assessment Section878</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyAssessmentSection878(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION878__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyAssessmentSection878(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION878__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION878__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION878__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION878__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION878,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyAssessmentSection878"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyAdmissionMedicationsSectionEntriesOptional2880(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Admission Medications Section Entries Optional2880</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyAdmissionMedicationsSectionEntriesOptional2880(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2880__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyAdmissionMedicationsSectionEntriesOptional2880(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Admission Medications Section Entries Optional2880</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyAdmissionMedicationsSectionEntriesOptional2880(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2880__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyAdmissionMedicationsSectionEntriesOptional2880(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2880__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2880__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2880__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2880__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2880,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyAdmissionMedicationsSectionEntriesOptional2880"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyAdmissionDiagnosisSection2882(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Admission Diagnosis Section2882</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyAdmissionDiagnosisSection2882(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ADMISSION_DIAGNOSIS_SECTION2882__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyAdmissionDiagnosisSection2882(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Admission Diagnosis Section2882</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyAdmissionDiagnosisSection2882(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ADMISSION_DIAGNOSIS_SECTION2882__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyAdmissionDiagnosisSection2882(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ADMISSION_DIAGNOSIS_SECTION2882__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ADMISSION_DIAGNOSIS_SECTION2882__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ADMISSION_DIAGNOSIS_SECTION2882__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ADMISSION_DIAGNOSIS_SECTION2882__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_ADMISSION_DIAGNOSIS_SECTION2882,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyAdmissionDiagnosisSection2882"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBodyCourseOfCareSection884(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Course Of Care Section884</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyCourseOfCareSection884(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COURSE_OF_CARE_SECTION884__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBodyCourseOfCareSection884(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body Course Of Care Section884</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBodyCourseOfCareSection884(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COURSE_OF_CARE_SECTION884__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBodyCourseOfCareSection884(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COURSE_OF_CARE_SECTION884__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COURSE_OF_CARE_SECTION884__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COURSE_OF_CARE_SECTION884__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COURSE_OF_CARE_SECTION884__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY_COURSE_OF_CARE_SECTION884,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBodyCourseOfCareSection884"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryComponentStructuredBody827(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body827</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBody827(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY827__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null)->reject(structuredBody->one(structuredBody : cda::StructuredBody | not structuredBody.oclIsUndefined() and structuredBody.oclIsKindOf(cda::StructuredBody)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryComponentStructuredBody827(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Component Structured Body827</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryComponentStructuredBody827(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY827__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransferSummaryComponentStructuredBody827(TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY827__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY827__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY827__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY827__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COMPONENT_STRUCTURED_BODY827,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryComponentStructuredBody827"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.13' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsTemplateId(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.TRANSFER_SUMMARY__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("TransferSummaryGeneralHeaderConstraintsTemplateId"),
						 new Object [] { transferSummary }));
			}
			 
			return false;
		}
		return true;
	}

} // TransferSummaryOperations
