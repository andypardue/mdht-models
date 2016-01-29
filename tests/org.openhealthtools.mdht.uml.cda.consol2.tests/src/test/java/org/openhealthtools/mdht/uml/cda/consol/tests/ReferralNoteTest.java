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
import org.openhealthtools.mdht.uml.cda.consol.ReferralNote;
import org.openhealthtools.mdht.uml.cda.consol.operations.ReferralNoteOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Referral Note</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Has An Assement And Plan Section2 Or Both Assement Section And Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Does Not Have Assement And Plan Section2 When Assement And Plan Of Treatment2 Are Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCaregiver(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCallbackContact(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponent776(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component776</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteInformationRecipientIntendedRecipientPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Information Recipient Intended Recipient Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteInformationRecipientIntendedRecipientAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Information Recipient Intended Recipient Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteInformationRecipientIntendedRecipientTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Information Recipient Intended Recipient Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteInformationRecipientIntendedRecipientInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Information Recipient Intended Recipient Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteInformationRecipientIntendedRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Information Recipient Intended Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver Associated Entity Associated Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCaregiverAssociatedEntityClassCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver Associated Entity Class Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCaregiverAssociatedEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver Associated Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver Associated Entity Associated Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCaregiverTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCaregiverAssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver Associated Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Associated Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCallbackContactAssociatedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCallbackContactAssociatedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCallbackContactAssociatedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCallbackContactAssociatedEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Associated Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Scoping Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCallbackContactTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCallbackContactAssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyComponentPlanOfTreatmentSection2779(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Component Plan Of Treatment Section2779</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional2781(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Component Advance Directives Section Entries Optional2781</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection783(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Component History Of Present Illness Section783</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyComponentFamilyHistorySection2785(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Component Family History Section2785</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyComponentImmunizationsSection2787(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Component Immunizations Section2787</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyComponentProblemSection2789(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Component Problem Section2789</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional2791(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Component Procedures Section Entries Optional2791</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyComponentResultsSection2793(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Component Results Section2793</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyComponentReviewOfSystemsSection795(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Component Review Of Systems Section795</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyComponentSocialHistorySection2797(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Component Social History Section2797</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyComponentVitalSignsSection2799(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Component Vital Signs Section2799</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyComponentFunctionalStatusSection2801(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Component Functional Status Section2801</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyComponentPhysicalExamSection2803(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Component Physical Exam Section2803</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional2b805(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Component Advance Directives Section Entries Optional2b805</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyComponentNutritionSection807(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Component Nutrition Section807</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyComponentMentalStatusSection809(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Component Mental Status Section809</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyComponentMedicalEquipmentSection2811(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Component Medical Equipment Section2811</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyComponentAllergiesSection2813(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Component Allergies Section2813</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyComponentAssessmentSection815(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Component Assessment Section815</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyComponentAssessmentAndPlanSection2817(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Component Assessment And Plan Section2817</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection2819(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Component History Of Past Illness Section2819</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyComponentGeneralStatusSection821(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Component General Status Section821</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyComponentMedicationsSection2823(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Component Medications Section2823</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyComponentReasonForReferralSection2825(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Component Reason For Referral Section2825</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyPlanOfTreatmentSection2778(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Plan Of Treatment Section2778</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional2780(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Advance Directives Section Entries Optional2780</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyHistoryOfPresentIllnessSection782(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body History Of Present Illness Section782</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyFamilyHistorySection2784(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Family History Section2784</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyImmunizationsSection2786(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Immunizations Section2786</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyProblemSection2788(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Problem Section2788</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyProceduresSectionEntriesOptional2790(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Procedures Section Entries Optional2790</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyResultsSection2792(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Results Section2792</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyReviewOfSystemsSection794(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Review Of Systems Section794</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodySocialHistorySection2796(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Social History Section2796</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyVitalSignsSection2798(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Vital Signs Section2798</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyFunctionalStatusSection2800(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Functional Status Section2800</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyPhysicalExamSection2802(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Physical Exam Section2802</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional2b804(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Advance Directives Section Entries Optional2b804</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyNutritionSection806(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Nutrition Section806</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyMentalStatusSection808(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Mental Status Section808</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyMedicalEquipmentSection2810(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Medical Equipment Section2810</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyAllergiesSection2812(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Allergies Section2812</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyAssessmentSection814(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Assessment Section814</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyAssessmentAndPlanSection2816(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Assessment And Plan Section2816</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyHistoryOfPastIllnessSection2818(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body History Of Past Illness Section2818</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyGeneralStatusSection820(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body General Status Section820</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyMedicationsSection2822(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Medications Section2822</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBodyReasonForReferralSection2824(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body Reason For Referral Section2824</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteComponentStructuredBody777(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Component Structured Body777</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ReferralNoteTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2() {
		OperationsTestCase<ReferralNote> validateReferralNoteHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent() {
		OperationsTestCase<ReferralNote> validateReferralNoteDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresentTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteCodeP() {
		OperationsTestCase<ReferralNote> validateReferralNoteCodePTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteCodeP",
			operationsForOCL.getOCLValue("VALIDATE_REFERRAL_NOTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteCodeP(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteCode() {
		OperationsTestCase<ReferralNote> validateReferralNoteCodeTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteCode",
			operationsForOCL.getOCLValue("VALIDATE_REFERRAL_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected void setDependency(ReferralNote target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ReferralNoteCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteCode((ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteInformationRecipient() {
		OperationsTestCase<ReferralNote> validateReferralNoteInformationRecipientTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteInformationRecipient", operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteInformationRecipient(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteInformationRecipientTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteParticipantCaregiver() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCaregiverTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCaregiver", operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCaregiver(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCaregiverTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteParticipantCallbackContact() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCallbackContactTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCallbackContact", operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCallbackContact(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCallbackContactTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponent776() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponent776TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponent776",
			operationsForOCL.getOCLValue("VALIDATE_REFERRAL_NOTE_COMPONENT776__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponent776(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponent776TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteInformationRecipientIntendedRecipientPersonName() {
		OperationsTestCase<ReferralNote> validateReferralNoteInformationRecipientIntendedRecipientPersonNameTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteInformationRecipientIntendedRecipientPersonName",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteInformationRecipientIntendedRecipientPersonName(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteInformationRecipientIntendedRecipientPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteInformationRecipientIntendedRecipientAddr() {
		OperationsTestCase<ReferralNote> validateReferralNoteInformationRecipientIntendedRecipientAddrTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteInformationRecipientIntendedRecipientAddr",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteInformationRecipientIntendedRecipientAddr(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteInformationRecipientIntendedRecipientAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteInformationRecipientIntendedRecipientTelecom() {
		OperationsTestCase<ReferralNote> validateReferralNoteInformationRecipientIntendedRecipientTelecomTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteInformationRecipientIntendedRecipientTelecom",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteInformationRecipientIntendedRecipientTelecom(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteInformationRecipientIntendedRecipientTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteInformationRecipientIntendedRecipientInformationRecipient() {
		OperationsTestCase<ReferralNote> validateReferralNoteInformationRecipientIntendedRecipientInformationRecipientTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteInformationRecipientIntendedRecipientInformationRecipient",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteInformationRecipientIntendedRecipientInformationRecipient(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteInformationRecipientIntendedRecipientInformationRecipientTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteInformationRecipientIntendedRecipient() {
		OperationsTestCase<ReferralNote> validateReferralNoteInformationRecipientIntendedRecipientTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteInformationRecipientIntendedRecipient",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteInformationRecipientIntendedRecipient(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteInformationRecipientIntendedRecipientTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonName() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonNameTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonName",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonName(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteParticipantCaregiverAssociatedEntityClassCodeP() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCaregiverAssociatedEntityClassCodePTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCaregiverAssociatedEntityClassCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCaregiverAssociatedEntityClassCodeP(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCaregiverAssociatedEntityClassCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteParticipantCaregiverAssociatedEntityClassCode() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCaregiverAssociatedEntityClassCodeTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCaregiverAssociatedEntityClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCaregiverAssociatedEntityClassCode(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCaregiverAssociatedEntityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteParticipantCaregiverTypeCode() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCaregiverTypeCodeTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCaregiverTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCaregiverTypeCode(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCaregiverTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteParticipantCaregiverAssociatedEntity() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCaregiverAssociatedEntityTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCaregiverAssociatedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCaregiverAssociatedEntity(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCaregiverAssociatedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonName() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonNameTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonName",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonName(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteParticipantCallbackContactAssociatedEntityId() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCallbackContactAssociatedEntityIdTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCallbackContactAssociatedEntityId",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactAssociatedEntityId(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCallbackContactAssociatedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteParticipantCallbackContactAssociatedEntityAddr() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCallbackContactAssociatedEntityAddrTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCallbackContactAssociatedEntityAddr",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactAssociatedEntityAddr(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCallbackContactAssociatedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteParticipantCallbackContactAssociatedEntityTelecom() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCallbackContactAssociatedEntityTelecomTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCallbackContactAssociatedEntityTelecom",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactAssociatedEntityTelecom(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCallbackContactAssociatedEntityTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteParticipantCallbackContactAssociatedEntityClassCode() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCallbackContactAssociatedEntityClassCodeTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCallbackContactAssociatedEntityClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactAssociatedEntityClassCode(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCallbackContactAssociatedEntityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganization() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganizationTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganization(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteParticipantCallbackContactTypeCode() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCallbackContactTypeCodeTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCallbackContactTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactTypeCode(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCallbackContactTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteParticipantCallbackContactAssociatedEntity() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCallbackContactAssociatedEntityTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCallbackContactAssociatedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactAssociatedEntity(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCallbackContactAssociatedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyComponentPlanOfTreatmentSection2779() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyComponentPlanOfTreatmentSection2779TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyComponentPlanOfTreatmentSection2779",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION2779__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentPlanOfTreatmentSection2779(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyComponentPlanOfTreatmentSection2779TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional2781() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional2781TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional2781",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2781__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional2781(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional2781TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection783() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection783TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection783",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION783__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection783(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyComponentHistoryOfPresentIllnessSection783TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyComponentFamilyHistorySection2785() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyComponentFamilyHistorySection2785TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyComponentFamilyHistorySection2785",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION2785__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentFamilyHistorySection2785(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyComponentFamilyHistorySection2785TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyComponentImmunizationsSection2787() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyComponentImmunizationsSection2787TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyComponentImmunizationsSection2787",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION2787__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentImmunizationsSection2787(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyComponentImmunizationsSection2787TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyComponentProblemSection2789() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyComponentProblemSection2789TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyComponentProblemSection2789",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION2789__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentProblemSection2789(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyComponentProblemSection2789TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional2791() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional2791TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional2791",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL2791__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional2791(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyComponentProceduresSectionEntriesOptional2791TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyComponentResultsSection2793() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyComponentResultsSection2793TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyComponentResultsSection2793",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION2793__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentResultsSection2793(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyComponentResultsSection2793TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyComponentReviewOfSystemsSection795() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyComponentReviewOfSystemsSection795TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyComponentReviewOfSystemsSection795",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION795__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentReviewOfSystemsSection795(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyComponentReviewOfSystemsSection795TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyComponentSocialHistorySection2797() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyComponentSocialHistorySection2797TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyComponentSocialHistorySection2797",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION2797__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentSocialHistorySection2797(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyComponentSocialHistorySection2797TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyComponentVitalSignsSection2799() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyComponentVitalSignsSection2799TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyComponentVitalSignsSection2799",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION2799__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentVitalSignsSection2799(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyComponentVitalSignsSection2799TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyComponentFunctionalStatusSection2801() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyComponentFunctionalStatusSection2801TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyComponentFunctionalStatusSection2801",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION2801__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentFunctionalStatusSection2801(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyComponentFunctionalStatusSection2801TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyComponentPhysicalExamSection2803() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyComponentPhysicalExamSection2803TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyComponentPhysicalExamSection2803",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION2803__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentPhysicalExamSection2803(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyComponentPhysicalExamSection2803TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional2b805() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional2b805TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional2b805",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2B805__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional2b805(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional2b805TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyComponentNutritionSection807() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyComponentNutritionSection807TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyComponentNutritionSection807",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION807__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentNutritionSection807(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyComponentNutritionSection807TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyComponentMentalStatusSection809() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyComponentMentalStatusSection809TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyComponentMentalStatusSection809",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_MENTAL_STATUS_SECTION809__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentMentalStatusSection809(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyComponentMentalStatusSection809TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyComponentMedicalEquipmentSection2811() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyComponentMedicalEquipmentSection2811TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyComponentMedicalEquipmentSection2811",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_EQUIPMENT_SECTION2811__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentMedicalEquipmentSection2811(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyComponentMedicalEquipmentSection2811TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyComponentAllergiesSection2813() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyComponentAllergiesSection2813TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyComponentAllergiesSection2813",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION2813__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentAllergiesSection2813(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyComponentAllergiesSection2813TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyComponentAssessmentSection815() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyComponentAssessmentSection815TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyComponentAssessmentSection815",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION815__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentAssessmentSection815(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyComponentAssessmentSection815TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyComponentAssessmentAndPlanSection2817() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyComponentAssessmentAndPlanSection2817TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyComponentAssessmentAndPlanSection2817",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION2817__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentAssessmentAndPlanSection2817(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyComponentAssessmentAndPlanSection2817TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection2819() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection2819TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection2819",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION2819__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection2819(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyComponentHistoryOfPastIllnessSection2819TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyComponentGeneralStatusSection821() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyComponentGeneralStatusSection821TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyComponentGeneralStatusSection821",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_GENERAL_STATUS_SECTION821__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentGeneralStatusSection821(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyComponentGeneralStatusSection821TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyComponentMedicationsSection2823() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyComponentMedicationsSection2823TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyComponentMedicationsSection2823",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION2823__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentMedicationsSection2823(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyComponentMedicationsSection2823TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyComponentReasonForReferralSection2825() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyComponentReasonForReferralSection2825TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyComponentReasonForReferralSection2825",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_REFERRAL_SECTION2825__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyComponentReasonForReferralSection2825(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyComponentReasonForReferralSection2825TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyPlanOfTreatmentSection2778() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyPlanOfTreatmentSection2778TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyPlanOfTreatmentSection2778",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION2778__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyPlanOfTreatmentSection2778(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyPlanOfTreatmentSection2778TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional2780() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional2780TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional2780",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2780__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional2780(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional2780TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyHistoryOfPresentIllnessSection782() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyHistoryOfPresentIllnessSection782TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyHistoryOfPresentIllnessSection782",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION782__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyHistoryOfPresentIllnessSection782(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyHistoryOfPresentIllnessSection782TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyFamilyHistorySection2784() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyFamilyHistorySection2784TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyFamilyHistorySection2784",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION2784__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyFamilyHistorySection2784(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyFamilyHistorySection2784TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyImmunizationsSection2786() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyImmunizationsSection2786TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyImmunizationsSection2786",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION2786__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyImmunizationsSection2786(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyImmunizationsSection2786TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyProblemSection2788() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyProblemSection2788TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyProblemSection2788",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION2788__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyProblemSection2788(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyProblemSection2788TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyProceduresSectionEntriesOptional2790() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyProceduresSectionEntriesOptional2790TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyProceduresSectionEntriesOptional2790",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL2790__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyProceduresSectionEntriesOptional2790(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyProceduresSectionEntriesOptional2790TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyResultsSection2792() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyResultsSection2792TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyResultsSection2792",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION2792__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyResultsSection2792(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyResultsSection2792TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyReviewOfSystemsSection794() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyReviewOfSystemsSection794TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyReviewOfSystemsSection794",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION794__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyReviewOfSystemsSection794(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyReviewOfSystemsSection794TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodySocialHistorySection2796() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodySocialHistorySection2796TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodySocialHistorySection2796",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION2796__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodySocialHistorySection2796(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodySocialHistorySection2796TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyVitalSignsSection2798() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyVitalSignsSection2798TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyVitalSignsSection2798",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION2798__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyVitalSignsSection2798(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyVitalSignsSection2798TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyFunctionalStatusSection2800() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyFunctionalStatusSection2800TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyFunctionalStatusSection2800",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION2800__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyFunctionalStatusSection2800(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyFunctionalStatusSection2800TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyPhysicalExamSection2802() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyPhysicalExamSection2802TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyPhysicalExamSection2802",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION2802__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyPhysicalExamSection2802(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyPhysicalExamSection2802TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional2b804() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional2b804TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional2b804",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2B804__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional2b804(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional2b804TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyNutritionSection806() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyNutritionSection806TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyNutritionSection806",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION806__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyNutritionSection806(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyNutritionSection806TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyMentalStatusSection808() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyMentalStatusSection808TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyMentalStatusSection808",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_MENTAL_STATUS_SECTION808__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyMentalStatusSection808(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyMentalStatusSection808TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyMedicalEquipmentSection2810() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyMedicalEquipmentSection2810TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyMedicalEquipmentSection2810",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_MEDICAL_EQUIPMENT_SECTION2810__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyMedicalEquipmentSection2810(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyMedicalEquipmentSection2810TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyAllergiesSection2812() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyAllergiesSection2812TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyAllergiesSection2812",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION2812__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyAllergiesSection2812(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyAllergiesSection2812TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyAssessmentSection814() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyAssessmentSection814TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyAssessmentSection814",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION814__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyAssessmentSection814(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyAssessmentSection814TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyAssessmentAndPlanSection2816() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyAssessmentAndPlanSection2816TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyAssessmentAndPlanSection2816",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION2816__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyAssessmentAndPlanSection2816(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyAssessmentAndPlanSection2816TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyHistoryOfPastIllnessSection2818() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyHistoryOfPastIllnessSection2818TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyHistoryOfPastIllnessSection2818",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION2818__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyHistoryOfPastIllnessSection2818(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyHistoryOfPastIllnessSection2818TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyGeneralStatusSection820() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyGeneralStatusSection820TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyGeneralStatusSection820",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_GENERAL_STATUS_SECTION820__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyGeneralStatusSection820(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyGeneralStatusSection820TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyMedicationsSection2822() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyMedicationsSection2822TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyMedicationsSection2822",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION2822__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyMedicationsSection2822(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyMedicationsSection2822TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBodyReasonForReferralSection2824() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBodyReasonForReferralSection2824TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBodyReasonForReferralSection2824",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY_REASON_FOR_REFERRAL_SECTION2824__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBodyReasonForReferralSection2824(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBodyReasonForReferralSection2824TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReferralNoteComponentStructuredBody777() {
		OperationsTestCase<ReferralNote> validateReferralNoteComponentStructuredBody777TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteComponentStructuredBody777", operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_COMPONENT_STRUCTURED_BODY777__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteComponentStructuredBody777(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteComponentStructuredBody777TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<ReferralNote> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<ReferralNote>(
			"validateGeneralHeaderConstraintsTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateGeneralHeaderConstraintsTemplateId(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ReferralNoteOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ReferralNote> {
		@Override
		public ReferralNote create() {
			return ConsolFactory.eINSTANCE.createReferralNote();
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
	private static class ConstructorTestClass extends ReferralNoteOperations {
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

} // ReferralNoteOperations
