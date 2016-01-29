/*******************************************************************************
 * Copyright (c) 2015 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *     								 - modified VALIDATE_DISCHARGE_SUMMARY2_PARTICIPANT_IF_PAR_TYPE_CODE_IND_THEN_AE_CLASS_CODE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP
 *     								 as it required the use of select instead of reject 
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

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
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.DischargeDiagnosisSection2;
import org.openhealthtools.mdht.uml.cda.consol.DischargeDietSection;
import org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection2;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalConsultationsSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargePhysicalSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeStudiesSummarySection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.NutritionSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Discharge Summary2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2Participant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2Component1318(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component1318</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ParticipantIfParTypeCodeINDThenAEClassCodeIND(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Participant If Par Type Code IND Then AE Class Code IND</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Encounter Participant Assigned Entity Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Encounter Participant Assigned Entity Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Encounter Participant Assigned Entity Has Person Or Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Encounter Participant Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Responsible Party Assigned Entity Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Responsible Party Assigned Entity Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Responsible Party Assigned Entity Has Person Or Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Responsible Party Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOfEncompassingEncounterEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Discharge Disposition Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Discharge Disposition Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Encounter Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOfEncompassingEncounterResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Responsible Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21321(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Allergies Section Entries Optional21321</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyComponentHospitalCourseSection1323(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Hospital Course Section1323</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyComponentDischargeDiagnosisSection21325(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Discharge Diagnosis Section21325</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyComponentDischargeMedicationsSectionEntriesOptional21327(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Discharge Medications Section Entries Optional21327</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyComponentPlanOfTreatmentSection21329(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Plan Of Treatment Section21329</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyComponentChiefComplaintSection1331(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Chief Complaint Section1331</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1333(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Chief Complaint And Reason For Visit Section1333</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyComponentNutritionSection1335(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Nutrition Section1335</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyComponentFamilyHistorySection21337(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Family History Section21337</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyComponentFunctionalStatusSection21339(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Functional Status Section21339</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21341(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component History Of Past Illness Section21341</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1343(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component History Of Present Illness Section1343</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyComponentAdmissionDiagnosisSection21345(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Admission Diagnosis Section21345</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyComponentAdmissionMedicationsSectionEntriesOptional21347(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Admission Medications Section Entries Optional21347</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyComponentHospitalConsultationsSection1349(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Hospital Consultations Section1349</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargeInstructionsSection1351(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Hospital Discharge Instructions Section1351</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargePhysicalSection1353(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Hospital Discharge Physical Section1353</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargeStudiesSummarySection1355(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Hospital Discharge Studies Summary Section1355</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21357(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Immunizations Section Entries Optional21357</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyComponentProblemSectionEntriesOptional21359(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Problem Section Entries Optional21359</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21361(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Procedures Section Entries Optional21361</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyComponentReasonForVisitSection1363(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Reason For Visit Section1363</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyComponentReviewOfSystemsSection1365(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Review Of Systems Section1365</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyComponentSocialHistorySection21367(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Social History Section21367</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21369(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Vital Signs Section Entries Optional21369</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyComponentDischargeMedicationsSection21371(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Discharge Medications Section21371</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyComponentDischargeDietSection1373(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Discharge Diet Section1373</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyAllergiesSectionEntriesOptional21320(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Allergies Section Entries Optional21320</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyHospitalCourseSection1322(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Hospital Course Section1322</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyDischargeDiagnosisSection21324(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Discharge Diagnosis Section21324</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyDischargeMedicationsSectionEntriesOptional21326(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Discharge Medications Section Entries Optional21326</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyPlanOfTreatmentSection21328(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Plan Of Treatment Section21328</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyChiefComplaintSection1330(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Chief Complaint Section1330</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1332(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Chief Complaint And Reason For Visit Section1332</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyNutritionSection1334(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Nutrition Section1334</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyFamilyHistorySection21336(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Family History Section21336</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyFunctionalStatusSection21338(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Functional Status Section21338</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyHistoryOfPastIllnessSection21340(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body History Of Past Illness Section21340</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyHistoryOfPresentIllnessSection1342(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body History Of Present Illness Section1342</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyAdmissionDiagnosisSection21344(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Admission Diagnosis Section21344</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyAdmissionMedicationsSectionEntriesOptional21346(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Admission Medications Section Entries Optional21346</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyHospitalConsultationsSection1348(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Hospital Consultations Section1348</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyHospitalDischargeInstructionsSection1350(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Hospital Discharge Instructions Section1350</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyHospitalDischargePhysicalSection1352(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Hospital Discharge Physical Section1352</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyHospitalDischargeStudiesSummarySection1354(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Hospital Discharge Studies Summary Section1354</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyImmunizationsSectionEntriesOptional21356(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Immunizations Section Entries Optional21356</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyProblemSectionEntriesOptional21358(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Problem Section Entries Optional21358</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyProceduresSectionEntriesOptional21360(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Procedures Section Entries Optional21360</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyReasonForVisitSection1362(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Reason For Visit Section1362</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyReviewOfSystemsSection1364(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Review Of Systems Section1364</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodySocialHistorySection21366(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Social History Section21366</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyVitalSignsSectionEntriesOptional21368(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Vital Signs Section Entries Optional21368</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyDischargeMedicationsSection21370(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Discharge Medications Section21370</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBodyDischargeDietSection1372(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Discharge Diet Section1372</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentStructuredBody1319(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body1319</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DischargeSummary2Operations extends USRealmHeader2Operations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DischargeSummary2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "( self.getAllSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection)) ) implies not ( self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)) or self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection)) )";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY2_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY2_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY2_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection"),
						 new Object [] { dischargeSummary2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2CodeP(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2CodeP(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2CodeP(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2CodeP(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2CodeP(DischargeSummary2 dischargeSummary2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_CODE_P,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2CodeP"),
						 new Object [] { dischargeSummary2 }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2CodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2CodeP", passToken);
				}
				passToken.add(dischargeSummary2);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2Code(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2Code(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '18842-5' or value.code = '11490-0' or value.code = '28655-9' or value.code = '29761-4' or value.code = '34745-0' or value.code = '34105-7' or value.code = '34106-5'))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2Code(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2Code(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2Code(DischargeSummary2 dischargeSummary2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2CodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(dischargeSummary2)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_CODE,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2Code"),
						 new Object [] { dischargeSummary2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2Participant(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2Participant(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2Participant(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2Participant(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2Participant(DischargeSummary2 dischargeSummary2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_PARTICIPANT,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2Participant"),
						 new Object [] { dischargeSummary2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOf(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOf(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOf(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOf(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2ComponentOf(DischargeSummary2 dischargeSummary2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentOf"),
						 new Object [] { dischargeSummary2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2Component1318(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component1318</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2Component1318(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT1318__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component2 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component2))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2Component1318(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component1318</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2Component1318(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY2_COMPONENT1318__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDischargeSummary2Component1318(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT1318__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT1318__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT1318__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT1318__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT1318,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2Component1318"),
						 new Object [] { dischargeSummary2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ParticipantIfParTypeCodeINDThenAEClassCodeIND(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Participant If Par Type Code IND Then AE Class Code IND</em>}' operation.
	 * Note: OCL was modified post-generation as it required the use of select instead of reject.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ParticipantIfParTypeCodeINDThenAEClassCodeIND(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_PARTICIPANT_IF_PAR_TYPE_CODE_IND_THEN_AE_CLASS_CODE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select( p : cda::Participant1 | p.typeCode = vocab::ParticipationType::IND and not ( p.associatedEntity.classCode = vocab::RoleClassAssociative::PRS  or p.associatedEntity.classCode = vocab::RoleClassAssociative::NOK or p.associatedEntity.classCode = vocab::RoleClassAssociative::CAREGIVER or p.associatedEntity.classCode = vocab::RoleClassAssociative::AGNT or p.associatedEntity.classCode = vocab::RoleClassAssociative::GUAR or p.associatedEntity.classCode = vocab::RoleClassAssociative::ECON or p.associatedEntity.isNullFlavorDefined() ) or p.associatedEntity.oclIsUndefined() )";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ParticipantIfParTypeCodeINDThenAEClassCodeIND(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Participant If Par Type Code IND Then AE Class Code IND</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ParticipantIfParTypeCodeINDThenAEClassCodeIND(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_PARTICIPANT_IF_PAR_TYPE_CODE_IND_THEN_AE_CLASS_CODE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ParticipantIfParTypeCodeINDThenAEClassCodeIND(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_PARTICIPANT_IF_PAR_TYPE_CODE_IND_THEN_AE_CLASS_CODE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_PARTICIPANT_IF_PAR_TYPE_CODE_IND_THEN_AE_CLASS_CODE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_PARTICIPANT_IF_PAR_TYPE_CODE_IND_THEN_AE_CLASS_CODE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_PARTICIPANT_IF_PAR_TYPE_CODE_IND_THEN_AE_CLASS_CODE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_PARTICIPANT_IF_PAR_TYPE_CODE_IND_THEN_AE_CLASS_CODE_IND,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ParticipantIfParTypeCodeINDThenAEClassCodeIND"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSLow(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter IVLTS Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSLow(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSLow(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter IVLTS Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSLow(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSLow(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IVLTS_LOW,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterIVLTSLow"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSHigh(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter IVLTS High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSHigh(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSHigh(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter IVLTS High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSHigh(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSHigh(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IVLTS_HIGH,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterIVLTSHigh"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityAssignedPerson(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Encounter Participant Assigned Entity Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityAssignedPerson(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(rim::Entity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityAssignedPerson(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Encounter Participant Assigned Entity Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityAssignedPerson(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityAssignedPerson(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityAssignedPerson"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityRepresentedOrganization(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Encounter Participant Assigned Entity Represented Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityRepresentedOrganization(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->excluding(null).assignedEntity->excluding(null)->reject(representedOrganization->one(representedOrganization : cda::Organization | not representedOrganization.oclIsUndefined() and representedOrganization.oclIsKindOf(rim::Entity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityRepresentedOrganization(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Encounter Participant Assigned Entity Represented Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityRepresentedOrganization(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityRepresentedOrganization(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityRepresentedOrganization"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Encounter Participant Assigned Entity Has Person Or Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->excluding(null)->reject(not assignedEntity.assignedPerson.oclIsUndefined() or not assignedEntity.representedOrganization->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Encounter Participant Assigned Entity Has Person Or Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Encounter Participant Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Encounter Participant Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityAssignedPerson(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Responsible Party Assigned Entity Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityAssignedPerson(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(rim::Entity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityAssignedPerson(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Responsible Party Assigned Entity Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityAssignedPerson(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityAssignedPerson(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_ASSIGNED_PERSON,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityAssignedPerson"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityRepresentedOrganization(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Responsible Party Assigned Entity Represented Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityRepresentedOrganization(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->excluding(null).assignedEntity->excluding(null)->reject(representedOrganization->one(representedOrganization : cda::Organization | not representedOrganization.oclIsUndefined() and representedOrganization.oclIsKindOf(rim::Entity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityRepresentedOrganization(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Responsible Party Assigned Entity Represented Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityRepresentedOrganization(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityRepresentedOrganization(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityRepresentedOrganization"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Responsible Party Assigned Entity Has Person Or Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->excluding(null)->reject(not assignedEntity.assignedPerson.oclIsUndefined() or not assignedEntity.representedOrganization->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Responsible Party Assigned Entity Has Person Or Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Responsible Party Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Responsible Party Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterEffectiveTime(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterEffectiveTime(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterEffectiveTime(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterEffectiveTime(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ComponentOfEncompassingEncounterEffectiveTime(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterEffectiveTime"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCode(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Discharge Disposition Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCode(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((dischargeDispositionCode.oclIsUndefined() or dischargeDispositionCode.isNullFlavorUndefined()) implies (not dischargeDispositionCode.oclIsUndefined() and dischargeDispositionCode.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = dischargeDispositionCode.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.6.301.5' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCode(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Discharge Disposition Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCode(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCode(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_DISCHARGE_DISPOSITION_CODE,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCodeP(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Discharge Disposition Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCodeP(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_DISCHARGE_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((dischargeDispositionCode.oclIsUndefined() or dischargeDispositionCode.isNullFlavorUndefined()) implies (not dischargeDispositionCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCodeP(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Discharge Disposition Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCodeP(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_DISCHARGE_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCodeP(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_DISCHARGE_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_DISCHARGE_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_DISCHARGE_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_DISCHARGE_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_DISCHARGE_DISPOSITION_CODE_P,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCodeP"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipant(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Encounter Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipant(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(encounterParticipant->one(encounterParticipant : cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and encounterParticipant.oclIsKindOf(cda::EncounterParticipant)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipant(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Encounter Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipant(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipant(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterEncounterParticipant"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterResponsibleParty(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Responsible Party</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterResponsibleParty(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(responsibleParty->one(responsibleParty : cda::ResponsibleParty | not responsibleParty.oclIsUndefined() and responsibleParty.oclIsKindOf(cda::ResponsibleParty)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterResponsibleParty(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Responsible Party</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterResponsibleParty(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ComponentOfEncompassingEncounterResponsibleParty(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterResponsibleParty"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounter(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounter(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null)->reject(encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounter(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounter(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ComponentOfEncompassingEncounter(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounter"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21321(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Allergies Section Entries Optional21321</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21321(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL21321__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21321(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Allergies Section Entries Optional21321</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21321(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL21321__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21321(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL21321__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL21321__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL21321__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL21321__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL21321,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21321"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentHospitalCourseSection1323(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Hospital Course Section1323</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentHospitalCourseSection1323(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_COURSE_SECTION1323__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalCourseSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentHospitalCourseSection1323(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Hospital Course Section1323</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentHospitalCourseSection1323(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_COURSE_SECTION1323__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyComponentHospitalCourseSection1323(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_COURSE_SECTION1323__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_COURSE_SECTION1323__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_COURSE_SECTION1323__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_COURSE_SECTION1323__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_COURSE_SECTION1323,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyComponentHospitalCourseSection1323"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentDischargeDiagnosisSection21325(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Discharge Diagnosis Section21325</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentDischargeDiagnosisSection21325(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_DIAGNOSIS_SECTION21325__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DischargeDiagnosisSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentDischargeDiagnosisSection21325(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Discharge Diagnosis Section21325</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentDischargeDiagnosisSection21325(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_DIAGNOSIS_SECTION21325__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyComponentDischargeDiagnosisSection21325(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_DIAGNOSIS_SECTION21325__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_DIAGNOSIS_SECTION21325__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_DIAGNOSIS_SECTION21325__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_DIAGNOSIS_SECTION21325__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_DIAGNOSIS_SECTION21325,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyComponentDischargeDiagnosisSection21325"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentDischargeMedicationsSectionEntriesOptional21327(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Discharge Medications Section Entries Optional21327</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentDischargeMedicationsSectionEntriesOptional21327(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21327__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DischargeMedicationsSectionEntriesOptional2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentDischargeMedicationsSectionEntriesOptional21327(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Discharge Medications Section Entries Optional21327</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentDischargeMedicationsSectionEntriesOptional21327(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21327__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyComponentDischargeMedicationsSectionEntriesOptional21327(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21327__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21327__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21327__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21327__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21327,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyComponentDischargeMedicationsSectionEntriesOptional21327"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentPlanOfTreatmentSection21329(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Plan Of Treatment Section21329</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentPlanOfTreatmentSection21329(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21329__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentPlanOfTreatmentSection21329(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Plan Of Treatment Section21329</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentPlanOfTreatmentSection21329(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21329__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyComponentPlanOfTreatmentSection21329(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21329__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21329__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21329__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21329__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21329,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyComponentPlanOfTreatmentSection21329"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentChiefComplaintSection1331(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Chief Complaint Section1331</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentChiefComplaintSection1331(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION1331__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentChiefComplaintSection1331(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Chief Complaint Section1331</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentChiefComplaintSection1331(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION1331__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyComponentChiefComplaintSection1331(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION1331__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION1331__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION1331__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION1331__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION1331,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyComponentChiefComplaintSection1331"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1333(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Chief Complaint And Reason For Visit Section1333</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1333(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1333__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1333(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Chief Complaint And Reason For Visit Section1333</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1333(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1333__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1333(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1333__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1333__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1333__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1333__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1333,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1333"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentNutritionSection1335(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Nutrition Section1335</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentNutritionSection1335(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION1335__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::NutritionSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentNutritionSection1335(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Nutrition Section1335</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentNutritionSection1335(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION1335__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyComponentNutritionSection1335(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION1335__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION1335__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION1335__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION1335__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION1335,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyComponentNutritionSection1335"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentFamilyHistorySection21337(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Family History Section21337</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentFamilyHistorySection21337(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION21337__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentFamilyHistorySection21337(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Family History Section21337</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentFamilyHistorySection21337(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION21337__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyComponentFamilyHistorySection21337(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION21337__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION21337__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION21337__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION21337__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION21337,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyComponentFamilyHistorySection21337"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentFunctionalStatusSection21339(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Functional Status Section21339</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentFunctionalStatusSection21339(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION21339__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentFunctionalStatusSection21339(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Functional Status Section21339</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentFunctionalStatusSection21339(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION21339__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyComponentFunctionalStatusSection21339(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION21339__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION21339__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION21339__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION21339__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION21339,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyComponentFunctionalStatusSection21339"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21341(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component History Of Past Illness Section21341</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21341(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION21341__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21341(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component History Of Past Illness Section21341</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21341(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION21341__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21341(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION21341__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION21341__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION21341__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION21341__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION21341,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21341"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1343(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component History Of Present Illness Section1343</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1343(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION1343__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1343(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component History Of Present Illness Section1343</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1343(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION1343__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1343(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION1343__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION1343__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION1343__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION1343__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION1343,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1343"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentAdmissionDiagnosisSection21345(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Admission Diagnosis Section21345</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentAdmissionDiagnosisSection21345(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_ADMISSION_DIAGNOSIS_SECTION21345__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdmissionDiagnosisSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentAdmissionDiagnosisSection21345(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Admission Diagnosis Section21345</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentAdmissionDiagnosisSection21345(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_ADMISSION_DIAGNOSIS_SECTION21345__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyComponentAdmissionDiagnosisSection21345(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_ADMISSION_DIAGNOSIS_SECTION21345__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_ADMISSION_DIAGNOSIS_SECTION21345__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_ADMISSION_DIAGNOSIS_SECTION21345__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_ADMISSION_DIAGNOSIS_SECTION21345__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_ADMISSION_DIAGNOSIS_SECTION21345,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyComponentAdmissionDiagnosisSection21345"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentAdmissionMedicationsSectionEntriesOptional21347(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Admission Medications Section Entries Optional21347</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentAdmissionMedicationsSectionEntriesOptional21347(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21347__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdmissionMedicationsSectionEntriesOptional2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentAdmissionMedicationsSectionEntriesOptional21347(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Admission Medications Section Entries Optional21347</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentAdmissionMedicationsSectionEntriesOptional21347(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21347__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyComponentAdmissionMedicationsSectionEntriesOptional21347(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21347__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21347__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21347__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21347__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21347,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyComponentAdmissionMedicationsSectionEntriesOptional21347"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentHospitalConsultationsSection1349(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Hospital Consultations Section1349</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentHospitalConsultationsSection1349(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_CONSULTATIONS_SECTION1349__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalConsultationsSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentHospitalConsultationsSection1349(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Hospital Consultations Section1349</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentHospitalConsultationsSection1349(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_CONSULTATIONS_SECTION1349__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyComponentHospitalConsultationsSection1349(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_CONSULTATIONS_SECTION1349__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_CONSULTATIONS_SECTION1349__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_CONSULTATIONS_SECTION1349__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_CONSULTATIONS_SECTION1349__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_CONSULTATIONS_SECTION1349,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyComponentHospitalConsultationsSection1349"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargeInstructionsSection1351(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Hospital Discharge Instructions Section1351</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargeInstructionsSection1351(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION1351__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeInstructionsSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargeInstructionsSection1351(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Hospital Discharge Instructions Section1351</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargeInstructionsSection1351(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION1351__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargeInstructionsSection1351(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION1351__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION1351__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION1351__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION1351__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION1351,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyComponentHospitalDischargeInstructionsSection1351"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargePhysicalSection1353(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Hospital Discharge Physical Section1353</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargePhysicalSection1353(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_PHYSICAL_SECTION1353__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargePhysicalSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargePhysicalSection1353(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Hospital Discharge Physical Section1353</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargePhysicalSection1353(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_PHYSICAL_SECTION1353__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargePhysicalSection1353(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_PHYSICAL_SECTION1353__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_PHYSICAL_SECTION1353__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_PHYSICAL_SECTION1353__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_PHYSICAL_SECTION1353__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_PHYSICAL_SECTION1353,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyComponentHospitalDischargePhysicalSection1353"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargeStudiesSummarySection1355(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Hospital Discharge Studies Summary Section1355</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargeStudiesSummarySection1355(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION1355__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeStudiesSummarySection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargeStudiesSummarySection1355(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Hospital Discharge Studies Summary Section1355</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargeStudiesSummarySection1355(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION1355__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargeStudiesSummarySection1355(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION1355__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION1355__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION1355__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION1355__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION1355,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyComponentHospitalDischargeStudiesSummarySection1355"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21357(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Immunizations Section Entries Optional21357</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21357(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21357__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21357(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Immunizations Section Entries Optional21357</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21357(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21357__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21357(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21357__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21357__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21357__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21357__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21357,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21357"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentProblemSectionEntriesOptional21359(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Problem Section Entries Optional21359</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentProblemSectionEntriesOptional21359(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION_ENTRIES_OPTIONAL21359__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentProblemSectionEntriesOptional21359(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Problem Section Entries Optional21359</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentProblemSectionEntriesOptional21359(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION_ENTRIES_OPTIONAL21359__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyComponentProblemSectionEntriesOptional21359(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION_ENTRIES_OPTIONAL21359__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION_ENTRIES_OPTIONAL21359__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION_ENTRIES_OPTIONAL21359__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION_ENTRIES_OPTIONAL21359__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION_ENTRIES_OPTIONAL21359,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyComponentProblemSectionEntriesOptional21359"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21361(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Procedures Section Entries Optional21361</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21361(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL21361__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21361(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Procedures Section Entries Optional21361</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21361(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL21361__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21361(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL21361__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL21361__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL21361__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL21361__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL21361,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21361"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentReasonForVisitSection1363(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Reason For Visit Section1363</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentReasonForVisitSection1363(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION1363__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentReasonForVisitSection1363(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Reason For Visit Section1363</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentReasonForVisitSection1363(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION1363__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyComponentReasonForVisitSection1363(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION1363__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION1363__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION1363__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION1363__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION1363,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyComponentReasonForVisitSection1363"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentReviewOfSystemsSection1365(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Review Of Systems Section1365</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentReviewOfSystemsSection1365(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION1365__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentReviewOfSystemsSection1365(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Review Of Systems Section1365</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentReviewOfSystemsSection1365(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION1365__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyComponentReviewOfSystemsSection1365(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION1365__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION1365__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION1365__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION1365__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION1365,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyComponentReviewOfSystemsSection1365"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentSocialHistorySection21367(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Social History Section21367</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentSocialHistorySection21367(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION21367__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentSocialHistorySection21367(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Social History Section21367</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentSocialHistorySection21367(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION21367__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyComponentSocialHistorySection21367(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION21367__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION21367__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION21367__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION21367__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION21367,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyComponentSocialHistorySection21367"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21369(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Vital Signs Section Entries Optional21369</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21369(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL21369__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21369(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Vital Signs Section Entries Optional21369</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21369(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL21369__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21369(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL21369__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL21369__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL21369__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL21369__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL21369,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21369"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentDischargeMedicationsSection21371(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Discharge Medications Section21371</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentDischargeMedicationsSection21371(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_MEDICATIONS_SECTION21371__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DischargeMedicationsSection2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentDischargeMedicationsSection21371(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Discharge Medications Section21371</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentDischargeMedicationsSection21371(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_MEDICATIONS_SECTION21371__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyComponentDischargeMedicationsSection21371(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_MEDICATIONS_SECTION21371__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_MEDICATIONS_SECTION21371__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_MEDICATIONS_SECTION21371__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_MEDICATIONS_SECTION21371__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_MEDICATIONS_SECTION21371,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyComponentDischargeMedicationsSection21371"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentDischargeDietSection1373(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Discharge Diet Section1373</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentDischargeDietSection1373(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_DIET_SECTION1373__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DischargeDietSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyComponentDischargeDietSection1373(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Component Discharge Diet Section1373</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyComponentDischargeDietSection1373(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_DIET_SECTION1373__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyComponentDischargeDietSection1373(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_DIET_SECTION1373__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_DIET_SECTION1373__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_DIET_SECTION1373__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_DIET_SECTION1373__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_DIET_SECTION1373,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyComponentDischargeDietSection1373"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyAllergiesSectionEntriesOptional21320(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Allergies Section Entries Optional21320</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyAllergiesSectionEntriesOptional21320(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL21320__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyAllergiesSectionEntriesOptional21320(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Allergies Section Entries Optional21320</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyAllergiesSectionEntriesOptional21320(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL21320__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyAllergiesSectionEntriesOptional21320(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL21320__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL21320__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL21320__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL21320__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL21320,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyAllergiesSectionEntriesOptional21320"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyHospitalCourseSection1322(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Hospital Course Section1322</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyHospitalCourseSection1322(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_COURSE_SECTION1322__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyHospitalCourseSection1322(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Hospital Course Section1322</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyHospitalCourseSection1322(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_COURSE_SECTION1322__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyHospitalCourseSection1322(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_COURSE_SECTION1322__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_COURSE_SECTION1322__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_COURSE_SECTION1322__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_COURSE_SECTION1322__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_COURSE_SECTION1322,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyHospitalCourseSection1322"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyDischargeDiagnosisSection21324(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Discharge Diagnosis Section21324</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyDischargeDiagnosisSection21324(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_DISCHARGE_DIAGNOSIS_SECTION21324__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyDischargeDiagnosisSection21324(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Discharge Diagnosis Section21324</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyDischargeDiagnosisSection21324(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_DISCHARGE_DIAGNOSIS_SECTION21324__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyDischargeDiagnosisSection21324(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_DISCHARGE_DIAGNOSIS_SECTION21324__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_DISCHARGE_DIAGNOSIS_SECTION21324__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_DISCHARGE_DIAGNOSIS_SECTION21324__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_DISCHARGE_DIAGNOSIS_SECTION21324__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_DISCHARGE_DIAGNOSIS_SECTION21324,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyDischargeDiagnosisSection21324"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyDischargeMedicationsSectionEntriesOptional21326(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Discharge Medications Section Entries Optional21326</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyDischargeMedicationsSectionEntriesOptional21326(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21326__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyDischargeMedicationsSectionEntriesOptional21326(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Discharge Medications Section Entries Optional21326</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyDischargeMedicationsSectionEntriesOptional21326(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21326__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyDischargeMedicationsSectionEntriesOptional21326(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21326__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21326__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21326__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21326__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21326,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyDischargeMedicationsSectionEntriesOptional21326"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyPlanOfTreatmentSection21328(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Plan Of Treatment Section21328</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyPlanOfTreatmentSection21328(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21328__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyPlanOfTreatmentSection21328(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Plan Of Treatment Section21328</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyPlanOfTreatmentSection21328(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21328__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyPlanOfTreatmentSection21328(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21328__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21328__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21328__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21328__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21328,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyPlanOfTreatmentSection21328"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyChiefComplaintSection1330(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Chief Complaint Section1330</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyChiefComplaintSection1330(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION1330__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyChiefComplaintSection1330(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Chief Complaint Section1330</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyChiefComplaintSection1330(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION1330__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyChiefComplaintSection1330(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION1330__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION1330__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION1330__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION1330__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION1330,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyChiefComplaintSection1330"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1332(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Chief Complaint And Reason For Visit Section1332</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1332(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1332__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1332(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Chief Complaint And Reason For Visit Section1332</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1332(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1332__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1332(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1332__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1332__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1332__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1332__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1332,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1332"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyNutritionSection1334(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Nutrition Section1334</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyNutritionSection1334(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION1334__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyNutritionSection1334(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Nutrition Section1334</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyNutritionSection1334(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION1334__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyNutritionSection1334(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION1334__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION1334__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION1334__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION1334__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION1334,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyNutritionSection1334"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyFamilyHistorySection21336(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Family History Section21336</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyFamilyHistorySection21336(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION21336__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyFamilyHistorySection21336(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Family History Section21336</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyFamilyHistorySection21336(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION21336__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyFamilyHistorySection21336(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION21336__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION21336__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION21336__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION21336__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION21336,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyFamilyHistorySection21336"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyFunctionalStatusSection21338(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Functional Status Section21338</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyFunctionalStatusSection21338(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION21338__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyFunctionalStatusSection21338(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Functional Status Section21338</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyFunctionalStatusSection21338(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION21338__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyFunctionalStatusSection21338(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION21338__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION21338__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION21338__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION21338__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION21338,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyFunctionalStatusSection21338"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyHistoryOfPastIllnessSection21340(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body History Of Past Illness Section21340</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyHistoryOfPastIllnessSection21340(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION21340__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyHistoryOfPastIllnessSection21340(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body History Of Past Illness Section21340</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyHistoryOfPastIllnessSection21340(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION21340__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyHistoryOfPastIllnessSection21340(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION21340__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION21340__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION21340__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION21340__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION21340,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyHistoryOfPastIllnessSection21340"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyHistoryOfPresentIllnessSection1342(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body History Of Present Illness Section1342</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyHistoryOfPresentIllnessSection1342(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION1342__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyHistoryOfPresentIllnessSection1342(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body History Of Present Illness Section1342</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyHistoryOfPresentIllnessSection1342(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION1342__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyHistoryOfPresentIllnessSection1342(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION1342__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION1342__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION1342__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION1342__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION1342,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyHistoryOfPresentIllnessSection1342"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyAdmissionDiagnosisSection21344(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Admission Diagnosis Section21344</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyAdmissionDiagnosisSection21344(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_ADMISSION_DIAGNOSIS_SECTION21344__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyAdmissionDiagnosisSection21344(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Admission Diagnosis Section21344</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyAdmissionDiagnosisSection21344(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_ADMISSION_DIAGNOSIS_SECTION21344__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyAdmissionDiagnosisSection21344(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_ADMISSION_DIAGNOSIS_SECTION21344__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_ADMISSION_DIAGNOSIS_SECTION21344__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_ADMISSION_DIAGNOSIS_SECTION21344__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_ADMISSION_DIAGNOSIS_SECTION21344__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_ADMISSION_DIAGNOSIS_SECTION21344,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyAdmissionDiagnosisSection21344"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyAdmissionMedicationsSectionEntriesOptional21346(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Admission Medications Section Entries Optional21346</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyAdmissionMedicationsSectionEntriesOptional21346(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21346__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyAdmissionMedicationsSectionEntriesOptional21346(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Admission Medications Section Entries Optional21346</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyAdmissionMedicationsSectionEntriesOptional21346(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21346__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyAdmissionMedicationsSectionEntriesOptional21346(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21346__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21346__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21346__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21346__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21346,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyAdmissionMedicationsSectionEntriesOptional21346"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyHospitalConsultationsSection1348(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Hospital Consultations Section1348</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyHospitalConsultationsSection1348(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_CONSULTATIONS_SECTION1348__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyHospitalConsultationsSection1348(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Hospital Consultations Section1348</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyHospitalConsultationsSection1348(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_CONSULTATIONS_SECTION1348__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyHospitalConsultationsSection1348(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_CONSULTATIONS_SECTION1348__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_CONSULTATIONS_SECTION1348__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_CONSULTATIONS_SECTION1348__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_CONSULTATIONS_SECTION1348__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_CONSULTATIONS_SECTION1348,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyHospitalConsultationsSection1348"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyHospitalDischargeInstructionsSection1350(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Hospital Discharge Instructions Section1350</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyHospitalDischargeInstructionsSection1350(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION1350__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyHospitalDischargeInstructionsSection1350(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Hospital Discharge Instructions Section1350</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyHospitalDischargeInstructionsSection1350(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION1350__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyHospitalDischargeInstructionsSection1350(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION1350__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION1350__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION1350__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION1350__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION1350,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyHospitalDischargeInstructionsSection1350"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyHospitalDischargePhysicalSection1352(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Hospital Discharge Physical Section1352</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyHospitalDischargePhysicalSection1352(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_PHYSICAL_SECTION1352__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyHospitalDischargePhysicalSection1352(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Hospital Discharge Physical Section1352</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyHospitalDischargePhysicalSection1352(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_PHYSICAL_SECTION1352__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyHospitalDischargePhysicalSection1352(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_PHYSICAL_SECTION1352__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_PHYSICAL_SECTION1352__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_PHYSICAL_SECTION1352__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_PHYSICAL_SECTION1352__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_PHYSICAL_SECTION1352,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyHospitalDischargePhysicalSection1352"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyHospitalDischargeStudiesSummarySection1354(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Hospital Discharge Studies Summary Section1354</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyHospitalDischargeStudiesSummarySection1354(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION1354__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyHospitalDischargeStudiesSummarySection1354(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Hospital Discharge Studies Summary Section1354</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyHospitalDischargeStudiesSummarySection1354(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION1354__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyHospitalDischargeStudiesSummarySection1354(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION1354__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION1354__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION1354__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION1354__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION1354,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyHospitalDischargeStudiesSummarySection1354"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyImmunizationsSectionEntriesOptional21356(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Immunizations Section Entries Optional21356</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyImmunizationsSectionEntriesOptional21356(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21356__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyImmunizationsSectionEntriesOptional21356(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Immunizations Section Entries Optional21356</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyImmunizationsSectionEntriesOptional21356(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21356__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyImmunizationsSectionEntriesOptional21356(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21356__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21356__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21356__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21356__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21356,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyImmunizationsSectionEntriesOptional21356"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyProblemSectionEntriesOptional21358(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Problem Section Entries Optional21358</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyProblemSectionEntriesOptional21358(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION_ENTRIES_OPTIONAL21358__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyProblemSectionEntriesOptional21358(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Problem Section Entries Optional21358</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyProblemSectionEntriesOptional21358(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION_ENTRIES_OPTIONAL21358__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyProblemSectionEntriesOptional21358(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION_ENTRIES_OPTIONAL21358__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION_ENTRIES_OPTIONAL21358__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION_ENTRIES_OPTIONAL21358__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION_ENTRIES_OPTIONAL21358__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION_ENTRIES_OPTIONAL21358,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyProblemSectionEntriesOptional21358"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyProceduresSectionEntriesOptional21360(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Procedures Section Entries Optional21360</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyProceduresSectionEntriesOptional21360(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL21360__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyProceduresSectionEntriesOptional21360(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Procedures Section Entries Optional21360</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyProceduresSectionEntriesOptional21360(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL21360__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyProceduresSectionEntriesOptional21360(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL21360__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL21360__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL21360__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL21360__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL21360,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyProceduresSectionEntriesOptional21360"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyReasonForVisitSection1362(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Reason For Visit Section1362</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyReasonForVisitSection1362(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION1362__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyReasonForVisitSection1362(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Reason For Visit Section1362</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyReasonForVisitSection1362(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION1362__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyReasonForVisitSection1362(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION1362__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION1362__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION1362__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION1362__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION1362,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyReasonForVisitSection1362"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyReviewOfSystemsSection1364(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Review Of Systems Section1364</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyReviewOfSystemsSection1364(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION1364__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyReviewOfSystemsSection1364(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Review Of Systems Section1364</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyReviewOfSystemsSection1364(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION1364__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyReviewOfSystemsSection1364(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION1364__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION1364__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION1364__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION1364__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION1364,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyReviewOfSystemsSection1364"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodySocialHistorySection21366(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Social History Section21366</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodySocialHistorySection21366(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION21366__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodySocialHistorySection21366(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Social History Section21366</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodySocialHistorySection21366(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION21366__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodySocialHistorySection21366(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION21366__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION21366__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION21366__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION21366__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION21366,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodySocialHistorySection21366"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyVitalSignsSectionEntriesOptional21368(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Vital Signs Section Entries Optional21368</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyVitalSignsSectionEntriesOptional21368(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL21368__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyVitalSignsSectionEntriesOptional21368(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Vital Signs Section Entries Optional21368</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyVitalSignsSectionEntriesOptional21368(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL21368__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyVitalSignsSectionEntriesOptional21368(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL21368__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL21368__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL21368__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL21368__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL21368,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyVitalSignsSectionEntriesOptional21368"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyDischargeMedicationsSection21370(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Discharge Medications Section21370</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyDischargeMedicationsSection21370(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_DISCHARGE_MEDICATIONS_SECTION21370__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyDischargeMedicationsSection21370(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Discharge Medications Section21370</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyDischargeMedicationsSection21370(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_DISCHARGE_MEDICATIONS_SECTION21370__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyDischargeMedicationsSection21370(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_DISCHARGE_MEDICATIONS_SECTION21370__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_DISCHARGE_MEDICATIONS_SECTION21370__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_DISCHARGE_MEDICATIONS_SECTION21370__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_DISCHARGE_MEDICATIONS_SECTION21370__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_DISCHARGE_MEDICATIONS_SECTION21370,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyDischargeMedicationsSection21370"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBodyDischargeDietSection1372(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Discharge Diet Section1372</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyDischargeDietSection1372(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_DISCHARGE_DIET_SECTION1372__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBodyDischargeDietSection1372(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body Discharge Diet Section1372</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBodyDischargeDietSection1372(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_DISCHARGE_DIET_SECTION1372__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBodyDischargeDietSection1372(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_DISCHARGE_DIET_SECTION1372__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_DISCHARGE_DIET_SECTION1372__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_DISCHARGE_DIET_SECTION1372__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_DISCHARGE_DIET_SECTION1372__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_DISCHARGE_DIET_SECTION1372,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBodyDischargeDietSection1372"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentStructuredBody1319(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body1319</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBody1319(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY1319__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null)->reject(structuredBody->one(structuredBody : cda::StructuredBody | not structuredBody.oclIsUndefined() and structuredBody.oclIsKindOf(cda::StructuredBody)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentStructuredBody1319(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Structured Body1319</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentStructuredBody1319(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY1319__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummary2ComponentStructuredBody1319(DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY1319__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY1319__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY1319__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY1319__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY1319,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentStructuredBody1319"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.8' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsTemplateId(DischargeSummary2 dischargeSummary2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY2__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("DischargeSummary2GeneralHeaderConstraintsTemplateId"),
						 new Object [] { dischargeSummary2 }));
			}
			 
			return false;
		}
		return true;
	}

} // DischargeSummary2Operations
