/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     Dan Brown (Drajer/Ai) - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.DischargeSummary;
import org.openhealthtools.mdht.uml.cda.consol.operations.DischargeSummaryOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

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

public class DischargeSummaryTest extends CDAValidationTest {

	private static final String NUBC_VALUESET = "2.16.840.1.113883.6.301.5";

	private static final String HL7_DDC_CODESYSTEM = "2.16.840.1.113883.12.112";

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDischargeSummaryDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

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

				return DischargeSummaryOperations.validateDischargeSummaryDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryCodeP() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryCodePTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryCodeP",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryCodeP(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryCode() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryCodeTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryCode",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected void setDependency(DischargeSummary target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.DischargeSummaryCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryCode(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryComponentOf() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentOfTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentOf",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentOf(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponent182() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponent182TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponent182",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_COMPONENT182__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponent182(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponent182TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntityHasPersonOrOrganization() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntityHasPersonOrOrganizationTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntityHasPersonOrOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntityHasPersonOrOrganization(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntityHasPersonOrOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntity() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntityTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntity(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntityHasPersonOrOrganization() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntityHasPersonOrOrganizationTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntityHasPersonOrOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntityHasPersonOrOrganization(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntityHasPersonOrOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntity() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntityTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntity(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLowTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHighTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeValueSet() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeValueSetTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeValueSet",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeValueSet(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeValueSetTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeCodeSystem() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeCodeSystemTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeCodeSystem",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeCodeSystem(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeCodeSystemTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCode() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCode(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryComponentOfEncompassingEncounter3EffectiveTime() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentOfEncompassingEncounter3EffectiveTimeTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentOfEncompassingEncounter3EffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3EffectiveTime(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentOfEncompassingEncounter3EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryComponentOfEncompassingEncounter3ResponsibleParty() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentOfEncompassingEncounter3ResponsibleParty",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3ResponsibleParty(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipant() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipant",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipant(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryComponentOfEncompassingEncounter() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentOfEncompassingEncounterTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentOfEncompassingEncounter",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentOfEncompassingEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyComponentHospitalAdmissionMedicationsSectionEntriesOptional185() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyComponentHospitalAdmissionMedicationsSectionEntriesOptional185TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyComponentHospitalAdmissionMedicationsSectionEntriesOptional185",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL185__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyComponentHospitalAdmissionMedicationsSectionEntriesOptional185(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyComponentHospitalAdmissionMedicationsSectionEntriesOptional185TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyComponentHospitalAdmissionDiagnosisSection187() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyComponentHospitalAdmissionDiagnosisSection187TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyComponentHospitalAdmissionDiagnosisSection187",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION187__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyComponentHospitalAdmissionDiagnosisSection187(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyComponentHospitalAdmissionDiagnosisSection187TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeDiagnosisSection189() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeDiagnosisSection189TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeDiagnosisSection189",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION189__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeDiagnosisSection189(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeDiagnosisSection189TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyComponentDischargeDietSection191() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyComponentDischargeDietSection191TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyComponentDischargeDietSection191",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_DISCHARGE_DIET_SECTION191__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyComponentDischargeDietSection191(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyComponentDischargeDietSection191TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeMedicationsSectionEntriesOptional193() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeMedicationsSectionEntriesOptional193TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeMedicationsSectionEntriesOptional193",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL193__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeMedicationsSectionEntriesOptional193(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeMedicationsSectionEntriesOptional193TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyComponentFunctionalStatusSection195() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyComponentFunctionalStatusSection195TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyComponentFunctionalStatusSection195",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION195__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyComponentFunctionalStatusSection195(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyComponentFunctionalStatusSection195TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyComponentHistoryOfPresentIllnessSection197() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyComponentHistoryOfPresentIllnessSection197TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyComponentHistoryOfPresentIllnessSection197",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION197__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyComponentHistoryOfPresentIllnessSection197(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyComponentHistoryOfPresentIllnessSection197TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyComponentHospitalCourseSection199() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyComponentHospitalCourseSection199TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyComponentHospitalCourseSection199",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_COURSE_SECTION199__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyComponentHospitalCourseSection199(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyComponentHospitalCourseSection199TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyComponentPlanOfCareSection201() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyComponentPlanOfCareSection201TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyComponentPlanOfCareSection201",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_CARE_SECTION201__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyComponentPlanOfCareSection201(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyComponentPlanOfCareSection201TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyComponentHistoryOfPastIllnessSection203() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyComponentHistoryOfPastIllnessSection203TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyComponentHistoryOfPastIllnessSection203",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION203__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyComponentHistoryOfPastIllnessSection203(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyComponentHistoryOfPastIllnessSection203TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection205() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection205TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection205",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION205__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection205(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection205TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyComponentChiefComplaintSection207() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyComponentChiefComplaintSection207TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyComponentChiefComplaintSection207",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION207__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyComponentChiefComplaintSection207(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyComponentChiefComplaintSection207TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyComponentFamilyHistorySection209() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyComponentFamilyHistorySection209TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyComponentFamilyHistorySection209",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION209__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyComponentFamilyHistorySection209(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyComponentFamilyHistorySection209TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyComponentHospitalConsultationsSection211() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyComponentHospitalConsultationsSection211TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyComponentHospitalConsultationsSection211",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_CONSULTATIONS_SECTION211__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyComponentHospitalConsultationsSection211(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyComponentHospitalConsultationsSection211TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeInstructionsSection213() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeInstructionsSection213TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeInstructionsSection213",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION213__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeInstructionsSection213(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeInstructionsSection213TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyComponentHospitalDischargePhysicalSection215() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargePhysicalSection215TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargePhysicalSection215",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_PHYSICAL_SECTION215__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargePhysicalSection215(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargePhysicalSection215TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeStudiesSummarySection217() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeStudiesSummarySection217TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeStudiesSummarySection217",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION217__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeStudiesSummarySection217(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyComponentHospitalDischargeStudiesSummarySection217TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyComponentImmunizationsSectionEntriesOptional219() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyComponentImmunizationsSectionEntriesOptional219TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyComponentImmunizationsSectionEntriesOptional219",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL219__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyComponentImmunizationsSectionEntriesOptional219(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyComponentImmunizationsSectionEntriesOptional219TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyComponentProblemSectionEntriesOptional221() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyComponentProblemSectionEntriesOptional221TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyComponentProblemSectionEntriesOptional221",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION_ENTRIES_OPTIONAL221__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyComponentProblemSectionEntriesOptional221(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyComponentProblemSectionEntriesOptional221TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyComponentProceduresSectionEntriesOptional223() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyComponentProceduresSectionEntriesOptional223TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyComponentProceduresSectionEntriesOptional223",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL223__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyComponentProceduresSectionEntriesOptional223(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyComponentProceduresSectionEntriesOptional223TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyComponentReasonForVisitSection225() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyComponentReasonForVisitSection225TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyComponentReasonForVisitSection225",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION225__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyComponentReasonForVisitSection225(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyComponentReasonForVisitSection225TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyComponentReviewOfSystemsSection227() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyComponentReviewOfSystemsSection227TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyComponentReviewOfSystemsSection227",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION227__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyComponentReviewOfSystemsSection227(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyComponentReviewOfSystemsSection227TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyComponentSocialHistorySection229() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyComponentSocialHistorySection229TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyComponentSocialHistorySection229",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION229__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyComponentSocialHistorySection229(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyComponentSocialHistorySection229TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyComponentAllergiesSectionEntriesOptional231() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyComponentAllergiesSectionEntriesOptional231TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyComponentAllergiesSectionEntriesOptional231",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION_ENTRIES_OPTIONAL231__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyComponentAllergiesSectionEntriesOptional231(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyComponentAllergiesSectionEntriesOptional231TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyComponentVitalSignsSectionEntriesOptional233() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyComponentVitalSignsSectionEntriesOptional233TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyComponentVitalSignsSectionEntriesOptional233",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL233__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyComponentVitalSignsSectionEntriesOptional233(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyComponentVitalSignsSectionEntriesOptional233TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyHospitalAdmissionMedicationsSectionEntriesOptional184() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyHospitalAdmissionMedicationsSectionEntriesOptional184TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyHospitalAdmissionMedicationsSectionEntriesOptional184",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL184__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyHospitalAdmissionMedicationsSectionEntriesOptional184(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyHospitalAdmissionMedicationsSectionEntriesOptional184TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyHospitalAdmissionDiagnosisSection186() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyHospitalAdmissionDiagnosisSection186TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyHospitalAdmissionDiagnosisSection186",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION186__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyHospitalAdmissionDiagnosisSection186(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyHospitalAdmissionDiagnosisSection186TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyHospitalDischargeDiagnosisSection188() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyHospitalDischargeDiagnosisSection188TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyHospitalDischargeDiagnosisSection188",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION188__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyHospitalDischargeDiagnosisSection188(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyHospitalDischargeDiagnosisSection188TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyDischargeDietSection190() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyDischargeDietSection190TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyDischargeDietSection190",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_DISCHARGE_DIET_SECTION190__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyDischargeDietSection190(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyDischargeDietSection190TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyHospitalDischargeMedicationsSectionEntriesOptional192() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyHospitalDischargeMedicationsSectionEntriesOptional192TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyHospitalDischargeMedicationsSectionEntriesOptional192",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL192__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyHospitalDischargeMedicationsSectionEntriesOptional192(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyHospitalDischargeMedicationsSectionEntriesOptional192TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyFunctionalStatusSection194() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyFunctionalStatusSection194TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyFunctionalStatusSection194",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION194__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyFunctionalStatusSection194(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyFunctionalStatusSection194TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyHistoryOfPresentIllnessSection196() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyHistoryOfPresentIllnessSection196TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyHistoryOfPresentIllnessSection196",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION196__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyHistoryOfPresentIllnessSection196(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyHistoryOfPresentIllnessSection196TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyHospitalCourseSection198() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyHospitalCourseSection198TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyHospitalCourseSection198",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_COURSE_SECTION198__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyHospitalCourseSection198(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyHospitalCourseSection198TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyPlanOfCareSection200() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyPlanOfCareSection200TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyPlanOfCareSection200",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_PLAN_OF_CARE_SECTION200__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyPlanOfCareSection200(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyPlanOfCareSection200TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyHistoryOfPastIllnessSection202() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyHistoryOfPastIllnessSection202TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyHistoryOfPastIllnessSection202",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION202__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyHistoryOfPastIllnessSection202(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyHistoryOfPastIllnessSection202TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyChiefComplaintAndReasonForVisitSection204() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyChiefComplaintAndReasonForVisitSection204TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyChiefComplaintAndReasonForVisitSection204",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION204__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyChiefComplaintAndReasonForVisitSection204(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyChiefComplaintAndReasonForVisitSection204TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyChiefComplaintSection206() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyChiefComplaintSection206TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyChiefComplaintSection206",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION206__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyChiefComplaintSection206(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyChiefComplaintSection206TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyFamilyHistorySection208() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyFamilyHistorySection208TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyFamilyHistorySection208",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION208__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyFamilyHistorySection208(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyFamilyHistorySection208TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyHospitalConsultationsSection210() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyHospitalConsultationsSection210TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyHospitalConsultationsSection210",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_CONSULTATIONS_SECTION210__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyHospitalConsultationsSection210(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyHospitalConsultationsSection210TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyHospitalDischargeInstructionsSection212() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyHospitalDischargeInstructionsSection212TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyHospitalDischargeInstructionsSection212",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION212__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyHospitalDischargeInstructionsSection212(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyHospitalDischargeInstructionsSection212TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyHospitalDischargePhysicalSection214() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyHospitalDischargePhysicalSection214TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyHospitalDischargePhysicalSection214",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_PHYSICAL_SECTION214__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyHospitalDischargePhysicalSection214(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyHospitalDischargePhysicalSection214TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyHospitalDischargeStudiesSummarySection216() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyHospitalDischargeStudiesSummarySection216TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyHospitalDischargeStudiesSummarySection216",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION216__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyHospitalDischargeStudiesSummarySection216(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyHospitalDischargeStudiesSummarySection216TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyImmunizationsSectionEntriesOptional218() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyImmunizationsSectionEntriesOptional218TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyImmunizationsSectionEntriesOptional218",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL218__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyImmunizationsSectionEntriesOptional218(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyImmunizationsSectionEntriesOptional218TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyProblemSectionEntriesOptional220() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyProblemSectionEntriesOptional220TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyProblemSectionEntriesOptional220",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION_ENTRIES_OPTIONAL220__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyProblemSectionEntriesOptional220(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyProblemSectionEntriesOptional220TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyProceduresSectionEntriesOptional222() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyProceduresSectionEntriesOptional222TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyProceduresSectionEntriesOptional222",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL222__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyProceduresSectionEntriesOptional222(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyProceduresSectionEntriesOptional222TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyReasonForVisitSection224() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyReasonForVisitSection224TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyReasonForVisitSection224",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION224__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyReasonForVisitSection224(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyReasonForVisitSection224TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyReviewOfSystemsSection226() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyReviewOfSystemsSection226TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyReviewOfSystemsSection226",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION226__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyReviewOfSystemsSection226(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyReviewOfSystemsSection226TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodySocialHistorySection228() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodySocialHistorySection228TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodySocialHistorySection228",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION228__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodySocialHistorySection228(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodySocialHistorySection228TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyAllergiesSectionEntriesOptional230() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyAllergiesSectionEntriesOptional230TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyAllergiesSectionEntriesOptional230",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION_ENTRIES_OPTIONAL230__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyAllergiesSectionEntriesOptional230(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyAllergiesSectionEntriesOptional230TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBodyVitalSignsSectionEntriesOptional232() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBodyVitalSignsSectionEntriesOptional232TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBodyVitalSignsSectionEntriesOptional232",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL232__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBodyVitalSignsSectionEntriesOptional232(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBodyVitalSignsSectionEntriesOptional232TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeSummaryComponentStructuredBody183() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentStructuredBody183TestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentStructuredBody183",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY_COMPONENT_STRUCTURED_BODY183__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentStructuredBody183(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentStructuredBody183TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<DischargeSummary> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<DischargeSummary>(
			"validateGeneralHeaderConstraintsTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateGeneralHeaderConstraintsTemplateId(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DischargeSummaryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DischargeSummary> {
		@Override
		public DischargeSummary create() {
			return ConsolFactory.eINSTANCE.createDischargeSummary();
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
	private static class ConstructorTestClass extends DischargeSummaryOperations {
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

} // DischargeSummaryOperations
