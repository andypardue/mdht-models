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
import org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2;
import org.openhealthtools.mdht.uml.cda.consol.operations.DischargeSummary2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

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

public class DischargeSummary2Test extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDischargeSummary2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

				//
				// /* DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection */
				// DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection section =
				//
				// ConsolFactory.eINSTANCE.createDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection().init();
				//
				//
				// target.addSection(section);
				//
				//

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummary2CodeP() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2CodePTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2CodeP",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2CodeP(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummary2Code() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2CodeTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2Code",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected void setDependency(DischargeSummary2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2CodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2Code(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummary2Participant() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ParticipantTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2Participant",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2Participant(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOf() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOf",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOf(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2Component1318() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2Component1318TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2Component1318",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY2_COMPONENT1318__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2Component1318(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2Component1318TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	* Note: Modified OCL in operations.
	*/
	@Test
	public void testValidateDischargeSummary2ParticipantIfParTypeCodeINDThenAEClassCodeIND() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ParticipantIfParTypeCodeINDThenAEClassCodeINDTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ParticipantIfParTypeCodeINDThenAEClassCodeIND",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_PARTICIPANT_IF_PAR_TYPE_CODE_IND_THEN_AE_CLASS_CODE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ParticipantIfParTypeCodeINDThenAEClassCodeIND(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ParticipantIfParTypeCodeINDThenAEClassCodeINDTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOfEncompassingEncounterIVLTSLow() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSLowTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSLow",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSLow(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOfEncompassingEncounterIVLTSHigh() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSHighTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSHigh",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSHigh(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityAssignedPerson() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityAssignedPersonTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityAssignedPerson",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityAssignedPerson(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityAssignedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityRepresentedOrganization() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityRepresentedOrganizationTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityRepresentedOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityRepresentedOrganization(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityRepresentedOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganizationTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityAssignedPerson() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityAssignedPersonTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityAssignedPerson",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityAssignedPerson(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityAssignedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityRepresentedOrganization() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityRepresentedOrganizationTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityRepresentedOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityRepresentedOrganization(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityRepresentedOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganizationTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOfEncompassingEncounterEffectiveTime() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfEncompassingEncounterEffectiveTimeTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOfEncompassingEncounterEffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterEffectiveTime(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfEncompassingEncounterEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCode() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCodeTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCode(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCodeP() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCodePTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_DISCHARGE_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCodeP(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipant() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipant",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipant(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOfEncompassingEncounterResponsibleParty() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOfEncompassingEncounterResponsibleParty",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterResponsibleParty(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOfEncompassingEncounter() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfEncompassingEncounterTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOfEncompassingEncounter",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounter(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfEncompassingEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21321() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21321TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21321",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL21321__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21321(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyComponentAllergiesSectionEntriesOptional21321TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyComponentHospitalCourseSection1323() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyComponentHospitalCourseSection1323TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyComponentHospitalCourseSection1323",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_COURSE_SECTION1323__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentHospitalCourseSection1323(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyComponentHospitalCourseSection1323TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyComponentDischargeDiagnosisSection21325() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyComponentDischargeDiagnosisSection21325TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyComponentDischargeDiagnosisSection21325",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_DIAGNOSIS_SECTION21325__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentDischargeDiagnosisSection21325(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyComponentDischargeDiagnosisSection21325TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyComponentDischargeMedicationsSectionEntriesOptional21327() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyComponentDischargeMedicationsSectionEntriesOptional21327TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyComponentDischargeMedicationsSectionEntriesOptional21327",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21327__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentDischargeMedicationsSectionEntriesOptional21327(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyComponentDischargeMedicationsSectionEntriesOptional21327TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyComponentPlanOfTreatmentSection21329() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyComponentPlanOfTreatmentSection21329TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyComponentPlanOfTreatmentSection21329",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21329__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentPlanOfTreatmentSection21329(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyComponentPlanOfTreatmentSection21329TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyComponentChiefComplaintSection1331() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyComponentChiefComplaintSection1331TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyComponentChiefComplaintSection1331",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION1331__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentChiefComplaintSection1331(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyComponentChiefComplaintSection1331TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1333() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1333TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1333",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1333__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1333(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1333TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyComponentNutritionSection1335() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyComponentNutritionSection1335TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyComponentNutritionSection1335",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION1335__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentNutritionSection1335(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyComponentNutritionSection1335TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyComponentFamilyHistorySection21337() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyComponentFamilyHistorySection21337TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyComponentFamilyHistorySection21337",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION21337__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentFamilyHistorySection21337(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyComponentFamilyHistorySection21337TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyComponentFunctionalStatusSection21339() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyComponentFunctionalStatusSection21339TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyComponentFunctionalStatusSection21339",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION21339__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentFunctionalStatusSection21339(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyComponentFunctionalStatusSection21339TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21341() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21341TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21341",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION21341__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21341(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21341TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1343() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1343TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1343",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION1343__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1343(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1343TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyComponentAdmissionDiagnosisSection21345() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyComponentAdmissionDiagnosisSection21345TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyComponentAdmissionDiagnosisSection21345",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_ADMISSION_DIAGNOSIS_SECTION21345__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentAdmissionDiagnosisSection21345(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyComponentAdmissionDiagnosisSection21345TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyComponentAdmissionMedicationsSectionEntriesOptional21347() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyComponentAdmissionMedicationsSectionEntriesOptional21347TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyComponentAdmissionMedicationsSectionEntriesOptional21347",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21347__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentAdmissionMedicationsSectionEntriesOptional21347(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyComponentAdmissionMedicationsSectionEntriesOptional21347TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyComponentHospitalConsultationsSection1349() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyComponentHospitalConsultationsSection1349TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyComponentHospitalConsultationsSection1349",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_CONSULTATIONS_SECTION1349__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentHospitalConsultationsSection1349(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyComponentHospitalConsultationsSection1349TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargeInstructionsSection1351() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargeInstructionsSection1351TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargeInstructionsSection1351",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION1351__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargeInstructionsSection1351(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargeInstructionsSection1351TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargePhysicalSection1353() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargePhysicalSection1353TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargePhysicalSection1353",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_PHYSICAL_SECTION1353__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargePhysicalSection1353(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargePhysicalSection1353TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargeStudiesSummarySection1355() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargeStudiesSummarySection1355TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargeStudiesSummarySection1355",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION1355__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargeStudiesSummarySection1355(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyComponentHospitalDischargeStudiesSummarySection1355TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21357() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21357TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21357",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21357__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21357(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21357TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyComponentProblemSectionEntriesOptional21359() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyComponentProblemSectionEntriesOptional21359TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyComponentProblemSectionEntriesOptional21359",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION_ENTRIES_OPTIONAL21359__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentProblemSectionEntriesOptional21359(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyComponentProblemSectionEntriesOptional21359TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21361() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21361TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21361",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL21361__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21361(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21361TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyComponentReasonForVisitSection1363() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyComponentReasonForVisitSection1363TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyComponentReasonForVisitSection1363",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION1363__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentReasonForVisitSection1363(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyComponentReasonForVisitSection1363TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyComponentReviewOfSystemsSection1365() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyComponentReviewOfSystemsSection1365TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyComponentReviewOfSystemsSection1365",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION1365__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentReviewOfSystemsSection1365(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyComponentReviewOfSystemsSection1365TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyComponentSocialHistorySection21367() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyComponentSocialHistorySection21367TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyComponentSocialHistorySection21367",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION21367__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentSocialHistorySection21367(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyComponentSocialHistorySection21367TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21369() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21369TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21369",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL21369__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21369(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyComponentVitalSignsSectionEntriesOptional21369TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyComponentDischargeMedicationsSection21371() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyComponentDischargeMedicationsSection21371TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyComponentDischargeMedicationsSection21371",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_MEDICATIONS_SECTION21371__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentDischargeMedicationsSection21371(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyComponentDischargeMedicationsSection21371TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyComponentDischargeDietSection1373() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyComponentDischargeDietSection1373TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyComponentDischargeDietSection1373",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_DIET_SECTION1373__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyComponentDischargeDietSection1373(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyComponentDischargeDietSection1373TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyAllergiesSectionEntriesOptional21320() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyAllergiesSectionEntriesOptional21320TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyAllergiesSectionEntriesOptional21320",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL21320__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyAllergiesSectionEntriesOptional21320(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyAllergiesSectionEntriesOptional21320TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyHospitalCourseSection1322() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyHospitalCourseSection1322TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyHospitalCourseSection1322",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_COURSE_SECTION1322__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyHospitalCourseSection1322(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyHospitalCourseSection1322TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyDischargeDiagnosisSection21324() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyDischargeDiagnosisSection21324TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyDischargeDiagnosisSection21324",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_DISCHARGE_DIAGNOSIS_SECTION21324__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyDischargeDiagnosisSection21324(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyDischargeDiagnosisSection21324TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyDischargeMedicationsSectionEntriesOptional21326() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyDischargeMedicationsSectionEntriesOptional21326TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyDischargeMedicationsSectionEntriesOptional21326",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21326__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyDischargeMedicationsSectionEntriesOptional21326(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyDischargeMedicationsSectionEntriesOptional21326TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyPlanOfTreatmentSection21328() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyPlanOfTreatmentSection21328TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyPlanOfTreatmentSection21328",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21328__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyPlanOfTreatmentSection21328(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyPlanOfTreatmentSection21328TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyChiefComplaintSection1330() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyChiefComplaintSection1330TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyChiefComplaintSection1330",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION1330__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyChiefComplaintSection1330(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyChiefComplaintSection1330TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1332() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1332TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1332",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1332__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1332(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1332TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyNutritionSection1334() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyNutritionSection1334TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyNutritionSection1334",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION1334__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyNutritionSection1334(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyNutritionSection1334TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyFamilyHistorySection21336() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyFamilyHistorySection21336TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyFamilyHistorySection21336",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION21336__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyFamilyHistorySection21336(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyFamilyHistorySection21336TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyFunctionalStatusSection21338() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyFunctionalStatusSection21338TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyFunctionalStatusSection21338",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION21338__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyFunctionalStatusSection21338(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyFunctionalStatusSection21338TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyHistoryOfPastIllnessSection21340() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyHistoryOfPastIllnessSection21340TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyHistoryOfPastIllnessSection21340",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION21340__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyHistoryOfPastIllnessSection21340(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyHistoryOfPastIllnessSection21340TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyHistoryOfPresentIllnessSection1342() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyHistoryOfPresentIllnessSection1342TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyHistoryOfPresentIllnessSection1342",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION1342__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyHistoryOfPresentIllnessSection1342(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyHistoryOfPresentIllnessSection1342TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyAdmissionDiagnosisSection21344() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyAdmissionDiagnosisSection21344TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyAdmissionDiagnosisSection21344",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_ADMISSION_DIAGNOSIS_SECTION21344__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyAdmissionDiagnosisSection21344(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyAdmissionDiagnosisSection21344TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyAdmissionMedicationsSectionEntriesOptional21346() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyAdmissionMedicationsSectionEntriesOptional21346TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyAdmissionMedicationsSectionEntriesOptional21346",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL21346__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyAdmissionMedicationsSectionEntriesOptional21346(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyAdmissionMedicationsSectionEntriesOptional21346TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyHospitalConsultationsSection1348() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyHospitalConsultationsSection1348TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyHospitalConsultationsSection1348",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_CONSULTATIONS_SECTION1348__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyHospitalConsultationsSection1348(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyHospitalConsultationsSection1348TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyHospitalDischargeInstructionsSection1350() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyHospitalDischargeInstructionsSection1350TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyHospitalDischargeInstructionsSection1350",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION1350__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyHospitalDischargeInstructionsSection1350(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyHospitalDischargeInstructionsSection1350TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyHospitalDischargePhysicalSection1352() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyHospitalDischargePhysicalSection1352TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyHospitalDischargePhysicalSection1352",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_PHYSICAL_SECTION1352__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyHospitalDischargePhysicalSection1352(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyHospitalDischargePhysicalSection1352TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyHospitalDischargeStudiesSummarySection1354() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyHospitalDischargeStudiesSummarySection1354TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyHospitalDischargeStudiesSummarySection1354",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION1354__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyHospitalDischargeStudiesSummarySection1354(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyHospitalDischargeStudiesSummarySection1354TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyImmunizationsSectionEntriesOptional21356() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyImmunizationsSectionEntriesOptional21356TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyImmunizationsSectionEntriesOptional21356",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21356__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyImmunizationsSectionEntriesOptional21356(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyImmunizationsSectionEntriesOptional21356TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyProblemSectionEntriesOptional21358() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyProblemSectionEntriesOptional21358TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyProblemSectionEntriesOptional21358",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION_ENTRIES_OPTIONAL21358__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyProblemSectionEntriesOptional21358(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyProblemSectionEntriesOptional21358TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyProceduresSectionEntriesOptional21360() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyProceduresSectionEntriesOptional21360TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyProceduresSectionEntriesOptional21360",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL21360__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyProceduresSectionEntriesOptional21360(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyProceduresSectionEntriesOptional21360TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyReasonForVisitSection1362() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyReasonForVisitSection1362TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyReasonForVisitSection1362",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION1362__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyReasonForVisitSection1362(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyReasonForVisitSection1362TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyReviewOfSystemsSection1364() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyReviewOfSystemsSection1364TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyReviewOfSystemsSection1364",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION1364__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyReviewOfSystemsSection1364(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyReviewOfSystemsSection1364TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodySocialHistorySection21366() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodySocialHistorySection21366TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodySocialHistorySection21366",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION21366__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodySocialHistorySection21366(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodySocialHistorySection21366TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyVitalSignsSectionEntriesOptional21368() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyVitalSignsSectionEntriesOptional21368TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyVitalSignsSectionEntriesOptional21368",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL21368__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyVitalSignsSectionEntriesOptional21368(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyVitalSignsSectionEntriesOptional21368TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyDischargeMedicationsSection21370() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyDischargeMedicationsSection21370TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyDischargeMedicationsSection21370",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_DISCHARGE_MEDICATIONS_SECTION21370__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyDischargeMedicationsSection21370(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyDischargeMedicationsSection21370TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBodyDischargeDietSection1372() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBodyDischargeDietSection1372TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBodyDischargeDietSection1372",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY_DISCHARGE_DIET_SECTION1372__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBodyDischargeDietSection1372(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBodyDischargeDietSection1372TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummary2ComponentStructuredBody1319() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentStructuredBody1319TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentStructuredBody1319",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_STRUCTURED_BODY1319__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentStructuredBody1319(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentStructuredBody1319TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<DischargeSummary2> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateGeneralHeaderConstraintsTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateGeneralHeaderConstraintsTemplateId(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DischargeSummary2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<DischargeSummary2> {
		public DischargeSummary2 create() {
			return ConsolFactory.eINSTANCE.createDischargeSummary2();
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
	private static class ConstructorTestClass extends DischargeSummary2Operations {
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

} // DischargeSummary2Operations
