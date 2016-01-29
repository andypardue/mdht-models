/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
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
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.DischargeDietSection;
import org.openhealthtools.mdht.uml.cda.consol.DischargeSummary;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.HospitalConsultationsSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargePhysicalSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeStudiesSummarySection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Discharge Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponent182(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component182</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntityHasPersonOrOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Responsible Party Assigned Entity Has Person Or Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Responsible Party Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntityHasPersonOrOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encounter Participant Assigned Entity Has Person Or Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encounter Participant Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encompassing Encounter Has Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encompassing Encounter Has Effective Time High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Discharge Disposition Code Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Discharge Disposition Code Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Discharge Disposition Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3ResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Responsible Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encounter Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyComponentHospitalAdmissionMedicationsSectionEntriesOptional185(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Hospital Admission Medications Section Entries Optional185</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyComponentHospitalAdmissionDiagnosisSection187(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Hospital Admission Diagnosis Section187</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeDiagnosisSection189(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Hospital Discharge Diagnosis Section189</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyComponentDischargeDietSection191(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Discharge Diet Section191</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeMedicationsSectionEntriesOptional193(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Hospital Discharge Medications Section Entries Optional193</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyComponentFunctionalStatusSection195(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Functional Status Section195</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyComponentHistoryOfPresentIllnessSection197(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component History Of Present Illness Section197</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyComponentHospitalCourseSection199(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Hospital Course Section199</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyComponentPlanOfCareSection201(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Plan Of Care Section201</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyComponentHistoryOfPastIllnessSection203(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component History Of Past Illness Section203</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection205(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Chief Complaint And Reason For Visit Section205</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyComponentChiefComplaintSection207(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Chief Complaint Section207</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyComponentFamilyHistorySection209(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Family History Section209</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyComponentHospitalConsultationsSection211(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Hospital Consultations Section211</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeInstructionsSection213(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Hospital Discharge Instructions Section213</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargePhysicalSection215(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Hospital Discharge Physical Section215</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeStudiesSummarySection217(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Hospital Discharge Studies Summary Section217</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyComponentImmunizationsSectionEntriesOptional219(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Immunizations Section Entries Optional219</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyComponentProblemSectionEntriesOptional221(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Problem Section Entries Optional221</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyComponentProceduresSectionEntriesOptional223(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Procedures Section Entries Optional223</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyComponentReasonForVisitSection225(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Reason For Visit Section225</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyComponentReviewOfSystemsSection227(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Review Of Systems Section227</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyComponentSocialHistorySection229(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Social History Section229</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyComponentAllergiesSectionEntriesOptional231(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Allergies Section Entries Optional231</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyComponentVitalSignsSectionEntriesOptional233(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Vital Signs Section Entries Optional233</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyHospitalAdmissionMedicationsSectionEntriesOptional184(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Hospital Admission Medications Section Entries Optional184</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyHospitalAdmissionDiagnosisSection186(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Hospital Admission Diagnosis Section186</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyHospitalDischargeDiagnosisSection188(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Hospital Discharge Diagnosis Section188</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyDischargeDietSection190(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Discharge Diet Section190</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyHospitalDischargeMedicationsSectionEntriesOptional192(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Hospital Discharge Medications Section Entries Optional192</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyFunctionalStatusSection194(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Functional Status Section194</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyHistoryOfPresentIllnessSection196(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body History Of Present Illness Section196</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyHospitalCourseSection198(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Hospital Course Section198</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyPlanOfCareSection200(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Plan Of Care Section200</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyHistoryOfPastIllnessSection202(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body History Of Past Illness Section202</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyChiefComplaintAndReasonForVisitSection204(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Chief Complaint And Reason For Visit Section204</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyChiefComplaintSection206(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Chief Complaint Section206</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyFamilyHistorySection208(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Family History Section208</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyHospitalConsultationsSection210(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Hospital Consultations Section210</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyHospitalDischargeInstructionsSection212(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Hospital Discharge Instructions Section212</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyHospitalDischargePhysicalSection214(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Hospital Discharge Physical Section214</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyHospitalDischargeStudiesSummarySection216(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Hospital Discharge Studies Summary Section216</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyImmunizationsSectionEntriesOptional218(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Immunizations Section Entries Optional218</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyProblemSectionEntriesOptional220(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Problem Section Entries Optional220</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyProceduresSectionEntriesOptional222(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Procedures Section Entries Optional222</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyReasonForVisitSection224(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Reason For Visit Section224</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyReviewOfSystemsSection226(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Review Of Systems Section226</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodySocialHistorySection228(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Social History Section228</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyAllergiesSectionEntriesOptional230(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Allergies Section Entries Optional230</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBodyVitalSignsSectionEntriesOptional232(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Vital Signs Section Entries Optional232</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentStructuredBody183(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body183</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DischargeSummaryOperations extends GeneralHeaderConstraintsOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DischargeSummaryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "( self.getAllSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection)) ) implies not ( self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)) or self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection)) )";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummaryDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection"),
						 new Object [] { dischargeSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryCodeP(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryCodeP(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryCodeP(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryCodeP(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummaryCodeP(DischargeSummary dischargeSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_CODE_P,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryCodeP"),
						 new Object [] { dischargeSummary }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.DischargeSummaryCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.DischargeSummaryCodeP", passToken);
				}
				passToken.add(dischargeSummary);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryCode(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryCode(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '18842-5' or value.code = '11490-0' or value.code = '28655-9' or value.code = '29761-4' or value.code = '34745-0' or value.code = '34105-7' or value.code = '34106-5'))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryCode(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryCode(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummaryCode(DischargeSummary dischargeSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.DischargeSummaryCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(dischargeSummary)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_CODE,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryCode"),
						 new Object [] { dischargeSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentOf(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOf(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentOf(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOf(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummaryComponentOf(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_OF,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentOf"),
						 new Object [] { dischargeSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponent182(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component182</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponent182(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT182__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component2 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component2))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponent182(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component182</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponent182(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_COMPONENT182__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDischargeSummaryComponent182(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT182__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT182__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_COMPONENT182__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT182__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT182,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponent182"),
						 new Object [] { dischargeSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntityHasPersonOrOrganization(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Responsible Party Assigned Entity Has Person Or Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntityHasPersonOrOrganization(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->excluding(null)->reject(not assignedEntity.assignedPerson.oclIsUndefined() or not assignedEntity.representedOrganization->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntityHasPersonOrOrganization(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Responsible Party Assigned Entity Has Person Or Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntityHasPersonOrOrganization(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntityHasPersonOrOrganization(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntityHasPersonOrOrganization"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntity(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Responsible Party Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntity(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->excluding(null)->reject(assignedEntity->exists(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(rim::Role)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntity(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Responsible Party Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntity(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntity(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY_ASSIGNED_ENTITY,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntity"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntityHasPersonOrOrganization(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encounter Participant Assigned Entity Has Person Or Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntityHasPersonOrOrganization(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->excluding(null)->reject(not assignedEntity.assignedPerson.oclIsUndefined() or not assignedEntity.representedOrganization->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntityHasPersonOrOrganization(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encounter Participant Assigned Entity Has Person Or Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntityHasPersonOrOrganization(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntityHasPersonOrOrganization(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntityHasPersonOrOrganization"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntity(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encounter Participant Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntity(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->excluding(null)->reject(assignedEntity->exists(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(rim::Role)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntity(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encounter Participant Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntity(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntity(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntity"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encompassing Encounter Has Effective Time Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(not effectiveTime.low.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encompassing Encounter Has Effective Time Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_LOW,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encompassing Encounter Has Effective Time High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(not effectiveTime.high.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encompassing Encounter Has Effective Time High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_HIGH,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeValueSet(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Discharge Disposition Code Value Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeValueSet(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(dischargeDispositionCode.oclIsUndefined() or dischargeDispositionCode.isNullFlavorUndefined() implies let value : datatypes::CE = dischargeDispositionCode.oclAsType(datatypes::CE) in value.codeSystem <> '2.16.840.1.113883.12.112' implies value.codeSystem = '2.16.840.1.113883.6.301.5' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeValueSet(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Discharge Disposition Code Value Set</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeValueSet(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeValueSet(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE_VALUE_SET,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeValueSet"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeCodeSystem(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Discharge Disposition Code Code System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeCodeSystem(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(dischargeDispositionCode.oclIsUndefined() or dischargeDispositionCode.isNullFlavorUndefined() implies let value : datatypes::CE = dischargeDispositionCode.oclAsType(datatypes::CE) in value.codeSystem <> '2.16.840.1.113883.6.301.5' implies value.codeSystem = '2.16.840.1.113883.12.112' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeCodeSystem(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Discharge Disposition Code Code System</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeCodeSystem(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeCodeSystem(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE_CODE_SYSTEM,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeCodeSystem"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCode(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Discharge Disposition Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCode(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((dischargeDispositionCode.oclIsUndefined() or dischargeDispositionCode.isNullFlavorUndefined()) implies (not dischargeDispositionCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCode(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Discharge Disposition Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCode(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCode(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3EffectiveTime(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3EffectiveTime(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3EffectiveTime(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3EffectiveTime(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummaryComponentOfEncompassingEncounter3EffectiveTime(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentOfEncompassingEncounter3EffectiveTime"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3ResponsibleParty(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Responsible Party</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3ResponsibleParty(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(responsibleParty->one(responsibleParty : cda::ResponsibleParty | not responsibleParty.oclIsUndefined() and responsibleParty.oclIsKindOf(cda::ResponsibleParty)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3ResponsibleParty(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Responsible Party</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3ResponsibleParty(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummaryComponentOfEncompassingEncounter3ResponsibleParty(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentOfEncompassingEncounter3ResponsibleParty"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipant(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encounter Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipant(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(encounterParticipant->one(encounterParticipant : cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and encounterParticipant.oclIsKindOf(cda::EncounterParticipant)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipant(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encounter Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipant(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipant(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipant"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null)->reject(encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummaryComponentOfEncompassingEncounter(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentOfEncompassingEncounter"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentHospitalAdmissionMedicationsSectionEntriesOptional185(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Hospital Admission Medications Section Entries Optional185</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentHospitalAdmissionMedicationsSectionEntriesOptional185(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL185__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalAdmissionMedicationsSectionEntriesOptional)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentHospitalAdmissionMedicationsSectionEntriesOptional185(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Hospital Admission Medications Section Entries Optional185</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentHospitalAdmissionMedicationsSectionEntriesOptional185(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL185__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyComponentHospitalAdmissionMedicationsSectionEntriesOptional185(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL185__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL185__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL185__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL185__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL185,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyComponentHospitalAdmissionMedicationsSectionEntriesOptional185"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentHospitalAdmissionDiagnosisSection187(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Hospital Admission Diagnosis Section187</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentHospitalAdmissionDiagnosisSection187(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION187__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalAdmissionDiagnosisSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentHospitalAdmissionDiagnosisSection187(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Hospital Admission Diagnosis Section187</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentHospitalAdmissionDiagnosisSection187(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION187__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyComponentHospitalAdmissionDiagnosisSection187(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION187__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION187__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION187__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION187__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION187,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyComponentHospitalAdmissionDiagnosisSection187"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeDiagnosisSection189(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Hospital Discharge Diagnosis Section189</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeDiagnosisSection189(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION189__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeDiagnosisSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeDiagnosisSection189(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Hospital Discharge Diagnosis Section189</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeDiagnosisSection189(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION189__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeDiagnosisSection189(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION189__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION189__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION189__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION189__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION189,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyComponentHospitalDischargeDiagnosisSection189"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentDischargeDietSection191(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Discharge Diet Section191</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentDischargeDietSection191(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_DIET_SECTION191__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DischargeDietSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentDischargeDietSection191(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Discharge Diet Section191</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentDischargeDietSection191(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_DIET_SECTION191__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyComponentDischargeDietSection191(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_DIET_SECTION191__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_DIET_SECTION191__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_DIET_SECTION191__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_DIET_SECTION191__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_DIET_SECTION191,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyComponentDischargeDietSection191"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeMedicationsSectionEntriesOptional193(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Hospital Discharge Medications Section Entries Optional193</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeMedicationsSectionEntriesOptional193(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL193__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeMedicationsSectionEntriesOptional)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeMedicationsSectionEntriesOptional193(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Hospital Discharge Medications Section Entries Optional193</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeMedicationsSectionEntriesOptional193(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL193__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeMedicationsSectionEntriesOptional193(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL193__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL193__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL193__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL193__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL193,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyComponentHospitalDischargeMedicationsSectionEntriesOptional193"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentFunctionalStatusSection195(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Functional Status Section195</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentFunctionalStatusSection195(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION195__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentFunctionalStatusSection195(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Functional Status Section195</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentFunctionalStatusSection195(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION195__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyComponentFunctionalStatusSection195(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION195__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION195__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION195__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION195__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION195,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyComponentFunctionalStatusSection195"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentHistoryOfPresentIllnessSection197(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component History Of Present Illness Section197</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentHistoryOfPresentIllnessSection197(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION197__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentHistoryOfPresentIllnessSection197(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component History Of Present Illness Section197</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentHistoryOfPresentIllnessSection197(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION197__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyComponentHistoryOfPresentIllnessSection197(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION197__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION197__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION197__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION197__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION197,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyComponentHistoryOfPresentIllnessSection197"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentHospitalCourseSection199(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Hospital Course Section199</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentHospitalCourseSection199(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_COURSE_SECTION199__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalCourseSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentHospitalCourseSection199(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Hospital Course Section199</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentHospitalCourseSection199(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_COURSE_SECTION199__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyComponentHospitalCourseSection199(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_COURSE_SECTION199__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_COURSE_SECTION199__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_COURSE_SECTION199__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_COURSE_SECTION199__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_COURSE_SECTION199,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyComponentHospitalCourseSection199"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentPlanOfCareSection201(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Plan Of Care Section201</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentPlanOfCareSection201(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_CARE_SECTION201__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentPlanOfCareSection201(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Plan Of Care Section201</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentPlanOfCareSection201(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_CARE_SECTION201__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyComponentPlanOfCareSection201(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_CARE_SECTION201__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_CARE_SECTION201__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_CARE_SECTION201__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_CARE_SECTION201__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_CARE_SECTION201,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyComponentPlanOfCareSection201"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentHistoryOfPastIllnessSection203(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component History Of Past Illness Section203</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentHistoryOfPastIllnessSection203(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION203__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentHistoryOfPastIllnessSection203(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component History Of Past Illness Section203</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentHistoryOfPastIllnessSection203(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION203__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyComponentHistoryOfPastIllnessSection203(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION203__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION203__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION203__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION203__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION203,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyComponentHistoryOfPastIllnessSection203"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection205(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Chief Complaint And Reason For Visit Section205</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection205(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION205__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection205(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Chief Complaint And Reason For Visit Section205</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection205(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION205__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection205(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION205__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION205__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION205__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION205__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION205,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection205"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentChiefComplaintSection207(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Chief Complaint Section207</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentChiefComplaintSection207(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION207__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentChiefComplaintSection207(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Chief Complaint Section207</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentChiefComplaintSection207(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION207__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyComponentChiefComplaintSection207(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION207__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION207__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION207__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION207__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION207,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyComponentChiefComplaintSection207"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentFamilyHistorySection209(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Family History Section209</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentFamilyHistorySection209(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION209__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentFamilyHistorySection209(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Family History Section209</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentFamilyHistorySection209(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION209__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyComponentFamilyHistorySection209(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION209__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION209__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION209__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION209__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION209,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyComponentFamilyHistorySection209"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentHospitalConsultationsSection211(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Hospital Consultations Section211</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentHospitalConsultationsSection211(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_CONSULTATIONS_SECTION211__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalConsultationsSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentHospitalConsultationsSection211(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Hospital Consultations Section211</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentHospitalConsultationsSection211(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_CONSULTATIONS_SECTION211__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyComponentHospitalConsultationsSection211(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_CONSULTATIONS_SECTION211__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_CONSULTATIONS_SECTION211__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_CONSULTATIONS_SECTION211__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_CONSULTATIONS_SECTION211__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_CONSULTATIONS_SECTION211,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyComponentHospitalConsultationsSection211"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeInstructionsSection213(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Hospital Discharge Instructions Section213</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeInstructionsSection213(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION213__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeInstructionsSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeInstructionsSection213(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Hospital Discharge Instructions Section213</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeInstructionsSection213(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION213__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeInstructionsSection213(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION213__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION213__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION213__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION213__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION213,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyComponentHospitalDischargeInstructionsSection213"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargePhysicalSection215(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Hospital Discharge Physical Section215</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargePhysicalSection215(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_PHYSICAL_SECTION215__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargePhysicalSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargePhysicalSection215(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Hospital Discharge Physical Section215</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargePhysicalSection215(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_PHYSICAL_SECTION215__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargePhysicalSection215(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_PHYSICAL_SECTION215__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_PHYSICAL_SECTION215__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_PHYSICAL_SECTION215__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_PHYSICAL_SECTION215__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_PHYSICAL_SECTION215,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyComponentHospitalDischargePhysicalSection215"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeStudiesSummarySection217(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Hospital Discharge Studies Summary Section217</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeStudiesSummarySection217(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION217__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeStudiesSummarySection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeStudiesSummarySection217(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Hospital Discharge Studies Summary Section217</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeStudiesSummarySection217(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION217__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeStudiesSummarySection217(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION217__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION217__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION217__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION217__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION217,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyComponentHospitalDischargeStudiesSummarySection217"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentImmunizationsSectionEntriesOptional219(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Immunizations Section Entries Optional219</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentImmunizationsSectionEntriesOptional219(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL219__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentImmunizationsSectionEntriesOptional219(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Immunizations Section Entries Optional219</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentImmunizationsSectionEntriesOptional219(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL219__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyComponentImmunizationsSectionEntriesOptional219(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL219__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL219__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL219__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL219__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL219,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyComponentImmunizationsSectionEntriesOptional219"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentProblemSectionEntriesOptional221(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Problem Section Entries Optional221</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentProblemSectionEntriesOptional221(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION_ENTRIES_OPTIONAL221__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentProblemSectionEntriesOptional221(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Problem Section Entries Optional221</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentProblemSectionEntriesOptional221(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION_ENTRIES_OPTIONAL221__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyComponentProblemSectionEntriesOptional221(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION_ENTRIES_OPTIONAL221__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION_ENTRIES_OPTIONAL221__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION_ENTRIES_OPTIONAL221__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION_ENTRIES_OPTIONAL221__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION_ENTRIES_OPTIONAL221,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyComponentProblemSectionEntriesOptional221"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentProceduresSectionEntriesOptional223(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Procedures Section Entries Optional223</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentProceduresSectionEntriesOptional223(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL223__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentProceduresSectionEntriesOptional223(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Procedures Section Entries Optional223</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentProceduresSectionEntriesOptional223(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL223__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyComponentProceduresSectionEntriesOptional223(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL223__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL223__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL223__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL223__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL223,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyComponentProceduresSectionEntriesOptional223"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentReasonForVisitSection225(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Reason For Visit Section225</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentReasonForVisitSection225(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION225__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentReasonForVisitSection225(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Reason For Visit Section225</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentReasonForVisitSection225(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION225__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyComponentReasonForVisitSection225(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION225__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION225__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION225__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION225__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION225,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyComponentReasonForVisitSection225"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentReviewOfSystemsSection227(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Review Of Systems Section227</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentReviewOfSystemsSection227(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION227__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentReviewOfSystemsSection227(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Review Of Systems Section227</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentReviewOfSystemsSection227(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION227__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyComponentReviewOfSystemsSection227(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION227__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION227__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION227__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION227__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION227,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyComponentReviewOfSystemsSection227"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentSocialHistorySection229(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Social History Section229</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentSocialHistorySection229(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION229__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentSocialHistorySection229(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Social History Section229</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentSocialHistorySection229(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION229__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyComponentSocialHistorySection229(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION229__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION229__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION229__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION229__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION229,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyComponentSocialHistorySection229"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentAllergiesSectionEntriesOptional231(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Allergies Section Entries Optional231</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentAllergiesSectionEntriesOptional231(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL231__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentAllergiesSectionEntriesOptional231(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Allergies Section Entries Optional231</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentAllergiesSectionEntriesOptional231(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL231__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyComponentAllergiesSectionEntriesOptional231(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL231__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL231__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL231__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL231__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL231,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyComponentAllergiesSectionEntriesOptional231"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentVitalSignsSectionEntriesOptional233(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Vital Signs Section Entries Optional233</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentVitalSignsSectionEntriesOptional233(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL233__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null).component->excluding(null)->reject(section->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyComponentVitalSignsSectionEntriesOptional233(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Component Vital Signs Section Entries Optional233</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyComponentVitalSignsSectionEntriesOptional233(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL233__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyComponentVitalSignsSectionEntriesOptional233(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL233__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL233__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL233__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL233__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL233,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyComponentVitalSignsSectionEntriesOptional233"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyHospitalAdmissionMedicationsSectionEntriesOptional184(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Hospital Admission Medications Section Entries Optional184</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyHospitalAdmissionMedicationsSectionEntriesOptional184(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL184__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyHospitalAdmissionMedicationsSectionEntriesOptional184(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Hospital Admission Medications Section Entries Optional184</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyHospitalAdmissionMedicationsSectionEntriesOptional184(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL184__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyHospitalAdmissionMedicationsSectionEntriesOptional184(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL184__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL184__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL184__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL184__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL184,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyHospitalAdmissionMedicationsSectionEntriesOptional184"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyHospitalAdmissionDiagnosisSection186(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Hospital Admission Diagnosis Section186</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyHospitalAdmissionDiagnosisSection186(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION186__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyHospitalAdmissionDiagnosisSection186(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Hospital Admission Diagnosis Section186</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyHospitalAdmissionDiagnosisSection186(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION186__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyHospitalAdmissionDiagnosisSection186(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION186__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION186__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION186__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION186__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION186,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyHospitalAdmissionDiagnosisSection186"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyHospitalDischargeDiagnosisSection188(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Hospital Discharge Diagnosis Section188</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyHospitalDischargeDiagnosisSection188(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION188__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyHospitalDischargeDiagnosisSection188(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Hospital Discharge Diagnosis Section188</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyHospitalDischargeDiagnosisSection188(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION188__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyHospitalDischargeDiagnosisSection188(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION188__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION188__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION188__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION188__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION188,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyHospitalDischargeDiagnosisSection188"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyDischargeDietSection190(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Discharge Diet Section190</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyDischargeDietSection190(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_DISCHARGE_DIET_SECTION190__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyDischargeDietSection190(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Discharge Diet Section190</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyDischargeDietSection190(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_DISCHARGE_DIET_SECTION190__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyDischargeDietSection190(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_DISCHARGE_DIET_SECTION190__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_DISCHARGE_DIET_SECTION190__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_DISCHARGE_DIET_SECTION190__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_DISCHARGE_DIET_SECTION190__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_DISCHARGE_DIET_SECTION190,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyDischargeDietSection190"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyHospitalDischargeMedicationsSectionEntriesOptional192(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Hospital Discharge Medications Section Entries Optional192</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyHospitalDischargeMedicationsSectionEntriesOptional192(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL192__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyHospitalDischargeMedicationsSectionEntriesOptional192(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Hospital Discharge Medications Section Entries Optional192</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyHospitalDischargeMedicationsSectionEntriesOptional192(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL192__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyHospitalDischargeMedicationsSectionEntriesOptional192(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL192__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL192__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL192__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL192__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL192,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyHospitalDischargeMedicationsSectionEntriesOptional192"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyFunctionalStatusSection194(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Functional Status Section194</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyFunctionalStatusSection194(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION194__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyFunctionalStatusSection194(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Functional Status Section194</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyFunctionalStatusSection194(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION194__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyFunctionalStatusSection194(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION194__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION194__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION194__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION194__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION194,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyFunctionalStatusSection194"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyHistoryOfPresentIllnessSection196(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body History Of Present Illness Section196</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyHistoryOfPresentIllnessSection196(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION196__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyHistoryOfPresentIllnessSection196(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body History Of Present Illness Section196</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyHistoryOfPresentIllnessSection196(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION196__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyHistoryOfPresentIllnessSection196(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION196__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION196__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION196__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION196__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION196,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyHistoryOfPresentIllnessSection196"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyHospitalCourseSection198(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Hospital Course Section198</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyHospitalCourseSection198(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_COURSE_SECTION198__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyHospitalCourseSection198(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Hospital Course Section198</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyHospitalCourseSection198(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_COURSE_SECTION198__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyHospitalCourseSection198(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_COURSE_SECTION198__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_COURSE_SECTION198__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_COURSE_SECTION198__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_COURSE_SECTION198__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_COURSE_SECTION198,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyHospitalCourseSection198"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyPlanOfCareSection200(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Plan Of Care Section200</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyPlanOfCareSection200(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_PLAN_OF_CARE_SECTION200__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyPlanOfCareSection200(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Plan Of Care Section200</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyPlanOfCareSection200(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_PLAN_OF_CARE_SECTION200__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyPlanOfCareSection200(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_PLAN_OF_CARE_SECTION200__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_PLAN_OF_CARE_SECTION200__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_PLAN_OF_CARE_SECTION200__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_PLAN_OF_CARE_SECTION200__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_PLAN_OF_CARE_SECTION200,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyPlanOfCareSection200"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyHistoryOfPastIllnessSection202(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body History Of Past Illness Section202</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyHistoryOfPastIllnessSection202(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION202__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyHistoryOfPastIllnessSection202(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body History Of Past Illness Section202</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyHistoryOfPastIllnessSection202(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION202__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyHistoryOfPastIllnessSection202(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION202__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION202__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION202__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION202__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION202,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyHistoryOfPastIllnessSection202"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyChiefComplaintAndReasonForVisitSection204(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Chief Complaint And Reason For Visit Section204</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyChiefComplaintAndReasonForVisitSection204(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION204__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyChiefComplaintAndReasonForVisitSection204(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Chief Complaint And Reason For Visit Section204</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyChiefComplaintAndReasonForVisitSection204(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION204__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyChiefComplaintAndReasonForVisitSection204(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION204__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION204__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION204__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION204__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION204,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyChiefComplaintAndReasonForVisitSection204"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyChiefComplaintSection206(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Chief Complaint Section206</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyChiefComplaintSection206(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION206__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyChiefComplaintSection206(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Chief Complaint Section206</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyChiefComplaintSection206(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION206__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyChiefComplaintSection206(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION206__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION206__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION206__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION206__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION206,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyChiefComplaintSection206"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyFamilyHistorySection208(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Family History Section208</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyFamilyHistorySection208(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION208__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyFamilyHistorySection208(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Family History Section208</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyFamilyHistorySection208(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION208__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyFamilyHistorySection208(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION208__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION208__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION208__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION208__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION208,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyFamilyHistorySection208"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyHospitalConsultationsSection210(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Hospital Consultations Section210</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyHospitalConsultationsSection210(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_CONSULTATIONS_SECTION210__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyHospitalConsultationsSection210(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Hospital Consultations Section210</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyHospitalConsultationsSection210(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_CONSULTATIONS_SECTION210__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyHospitalConsultationsSection210(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_CONSULTATIONS_SECTION210__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_CONSULTATIONS_SECTION210__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_CONSULTATIONS_SECTION210__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_CONSULTATIONS_SECTION210__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_CONSULTATIONS_SECTION210,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyHospitalConsultationsSection210"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyHospitalDischargeInstructionsSection212(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Hospital Discharge Instructions Section212</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyHospitalDischargeInstructionsSection212(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION212__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyHospitalDischargeInstructionsSection212(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Hospital Discharge Instructions Section212</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyHospitalDischargeInstructionsSection212(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION212__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyHospitalDischargeInstructionsSection212(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION212__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION212__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION212__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION212__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION212,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyHospitalDischargeInstructionsSection212"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyHospitalDischargePhysicalSection214(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Hospital Discharge Physical Section214</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyHospitalDischargePhysicalSection214(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_PHYSICAL_SECTION214__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyHospitalDischargePhysicalSection214(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Hospital Discharge Physical Section214</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyHospitalDischargePhysicalSection214(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_PHYSICAL_SECTION214__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyHospitalDischargePhysicalSection214(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_PHYSICAL_SECTION214__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_PHYSICAL_SECTION214__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_PHYSICAL_SECTION214__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_PHYSICAL_SECTION214__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_PHYSICAL_SECTION214,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyHospitalDischargePhysicalSection214"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyHospitalDischargeStudiesSummarySection216(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Hospital Discharge Studies Summary Section216</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyHospitalDischargeStudiesSummarySection216(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION216__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyHospitalDischargeStudiesSummarySection216(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Hospital Discharge Studies Summary Section216</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyHospitalDischargeStudiesSummarySection216(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION216__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyHospitalDischargeStudiesSummarySection216(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION216__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION216__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION216__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION216__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION216,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyHospitalDischargeStudiesSummarySection216"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyImmunizationsSectionEntriesOptional218(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Immunizations Section Entries Optional218</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyImmunizationsSectionEntriesOptional218(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL218__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyImmunizationsSectionEntriesOptional218(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Immunizations Section Entries Optional218</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyImmunizationsSectionEntriesOptional218(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL218__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyImmunizationsSectionEntriesOptional218(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL218__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL218__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL218__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL218__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL218,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyImmunizationsSectionEntriesOptional218"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyProblemSectionEntriesOptional220(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Problem Section Entries Optional220</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyProblemSectionEntriesOptional220(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION_ENTRIES_OPTIONAL220__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyProblemSectionEntriesOptional220(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Problem Section Entries Optional220</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyProblemSectionEntriesOptional220(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION_ENTRIES_OPTIONAL220__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyProblemSectionEntriesOptional220(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION_ENTRIES_OPTIONAL220__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION_ENTRIES_OPTIONAL220__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION_ENTRIES_OPTIONAL220__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION_ENTRIES_OPTIONAL220__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION_ENTRIES_OPTIONAL220,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyProblemSectionEntriesOptional220"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyProceduresSectionEntriesOptional222(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Procedures Section Entries Optional222</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyProceduresSectionEntriesOptional222(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL222__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyProceduresSectionEntriesOptional222(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Procedures Section Entries Optional222</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyProceduresSectionEntriesOptional222(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL222__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyProceduresSectionEntriesOptional222(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL222__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL222__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL222__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL222__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL222,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyProceduresSectionEntriesOptional222"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyReasonForVisitSection224(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Reason For Visit Section224</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyReasonForVisitSection224(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION224__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyReasonForVisitSection224(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Reason For Visit Section224</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyReasonForVisitSection224(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION224__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyReasonForVisitSection224(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION224__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION224__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION224__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION224__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION224,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyReasonForVisitSection224"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyReviewOfSystemsSection226(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Review Of Systems Section226</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyReviewOfSystemsSection226(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION226__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyReviewOfSystemsSection226(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Review Of Systems Section226</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyReviewOfSystemsSection226(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION226__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyReviewOfSystemsSection226(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION226__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION226__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION226__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION226__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION226,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyReviewOfSystemsSection226"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodySocialHistorySection228(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Social History Section228</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodySocialHistorySection228(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION228__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodySocialHistorySection228(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Social History Section228</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodySocialHistorySection228(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION228__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodySocialHistorySection228(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION228__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION228__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION228__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION228__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION228,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodySocialHistorySection228"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyAllergiesSectionEntriesOptional230(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Allergies Section Entries Optional230</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyAllergiesSectionEntriesOptional230(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL230__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyAllergiesSectionEntriesOptional230(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Allergies Section Entries Optional230</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyAllergiesSectionEntriesOptional230(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL230__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyAllergiesSectionEntriesOptional230(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL230__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL230__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL230__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL230__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL230,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyAllergiesSectionEntriesOptional230"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBodyVitalSignsSectionEntriesOptional232(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Vital Signs Section Entries Optional232</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyVitalSignsSectionEntriesOptional232(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL232__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).structuredBody->excluding(null)->reject(component->one(component : cda::Component3 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component3)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBodyVitalSignsSectionEntriesOptional232(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body Vital Signs Section Entries Optional232</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBodyVitalSignsSectionEntriesOptional232(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL232__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBodyVitalSignsSectionEntriesOptional232(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL232__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL232__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL232__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL232__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL232,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBodyVitalSignsSectionEntriesOptional232"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentStructuredBody183(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body183</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBody183(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY183__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null)->reject(structuredBody->one(structuredBody : cda::StructuredBody | not structuredBody.oclIsUndefined() and structuredBody.oclIsKindOf(cda::StructuredBody)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentStructuredBody183(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Structured Body183</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentStructuredBody183(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY183__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateDischargeSummaryComponentStructuredBody183(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY183__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY183__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY183__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY183__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY183,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeSummaryComponentStructuredBody183"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.8')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsTemplateId(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISCHARGE_SUMMARY__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("DischargeSummaryGeneralHeaderConstraintsTemplateId"),
						 new Object [] { dischargeSummary }));
			}
			 
			return false;
		}
		return true;
	}

} // DischargeSummaryOperations
