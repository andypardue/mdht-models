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
import org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ConsultationNote2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Consultation Note2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Has An Assement And Plan Section2 Or Both Assement Section And Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Does Not Have Assement And Plan Section2 When Assement Or Plan Of Treatment2 Are Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Does Not Have Chief Complaint With Chief Complaint Or Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2HasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Has An Assement And Plan Section Or Individual Assement And Plan Sections</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2Participant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2InFulfillmentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 In Fulfillment Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2Component1214(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component1214</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ParticipantAssociatedEntityAssociatedPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Associated Entity Associated Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ParticipantAssociatedEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Associated Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ParticipantAssociatedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Associated Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ParticipantAssociatedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Associated Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ParticipantAssociatedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Associated Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ParticipantAssociatedEntityAssociatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Associated Entity Associated Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ParticipantAssociatedEntityScopingOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Associated Entity Scoping Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ParticipantAssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Associated Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2InFulfillmentOfOrderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 In Fulfillment Of Order Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2InFulfillmentOfOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 In Fulfillment Of Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT Precise To The Day IVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT Precise To The Minute IVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT Precise To The Second IVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT If More Precise Than Day Include Time Zone Offset IVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter Responsible Party Assigned Entity Has Person Organization Or Both</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter Responsible Party Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrganizationOrBoth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter Encounter Participant Assigned Entity Has Person Organization Or Both</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter Encounter Participant Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentOfEncompassingEncounterId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentOfEncompassingEncounterEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentOfEncompassingEncounterResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter Responsible Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter Encounter Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyComponentAssessmentSection1217(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Assessment Section1217</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21219(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Assessment And Plan Section21219</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21221(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Plan Of Treatment Section21221</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyComponentReasonForVisitSection1223(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Reason For Visit Section1223</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1225(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component History Of Present Illness Section1225</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyComponentPhysicalExamSection21227(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Physical Exam Section21227</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyComponentAllergiesSection21229(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Allergies Section21229</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyComponentChiefComplaintSection1231(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Chief Complaint Section1231</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1233(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Chief Complaint And Reason For Visit Section1233</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyComponentFamilyHistorySection21235(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Family History Section21235</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyComponentGeneralStatusSection1237(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component General Status Section1237</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21239(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component History Of Past Illness Section21239</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21241(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Immunizations Section Entries Optional21241</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyComponentMedicationsSection21243(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Medications Section21243</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyComponentProblemSection21245(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Problem Section21245</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21247(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Procedures Section Entries Optional21247</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyComponentResultsSection21249(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Results Section21249</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyComponentSocialHistorySection21251(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Social History Section21251</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyComponentVitalSignsSection21253(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Vital Signs Section21253</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21255(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Advance Directives Section Entries Optional21255</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyComponentFunctionalStatusSection21257(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Functional Status Section21257</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyComponentReviewOfSystemsSection1259(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Review Of Systems Section1259</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyComponentMedicalEquipmentSection21261(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Medical Equipment Section21261</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyComponentMentalStatusSection1263(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Mental Status Section1263</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyComponentNutritionSection1265(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Component Nutrition Section1265</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyAssessmentSection1216(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Assessment Section1216</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyAssessmentAndPlanSection21218(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Assessment And Plan Section21218</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyPlanOfTreatmentSection21220(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Plan Of Treatment Section21220</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyReasonForVisitSection1222(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Reason For Visit Section1222</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1224(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body History Of Present Illness Section1224</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyPhysicalExamSection21226(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Physical Exam Section21226</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyAllergiesSection21228(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Allergies Section21228</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyChiefComplaintSection1230(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Chief Complaint Section1230</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1232(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Chief Complaint And Reason For Visit Section1232</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyFamilyHistorySection21234(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Family History Section21234</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyGeneralStatusSection1236(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body General Status Section1236</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyHistoryOfPastIllnessSection21238(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body History Of Past Illness Section21238</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyImmunizationsSectionEntriesOptional21240(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Immunizations Section Entries Optional21240</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyMedicationsSection21242(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Medications Section21242</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyProblemSection21244(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Problem Section21244</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyProceduresSectionEntriesOptional21246(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Procedures Section Entries Optional21246</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyResultsSection21248(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Results Section21248</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodySocialHistorySection21250(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Social History Section21250</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyVitalSignsSection21252(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Vital Signs Section21252</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21254(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Advance Directives Section Entries Optional21254</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyFunctionalStatusSection21256(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Functional Status Section21256</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyReviewOfSystemsSection1258(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Review Of Systems Section1258</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyMedicalEquipmentSection21260(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Medical Equipment Section21260</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyMentalStatusSection1262(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Mental Status Section1262</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBodyNutritionSection1264(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body Nutrition Section1264</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentStructuredBody1215(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Structured Body1215</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ConsultationNote2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresentTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_OR_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresentTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateConsultationNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSectionTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_DOES_NOT_HAVE_CHIEF_COMPLAINT_WITH_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

				// /* DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection */
				// DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection section =
				//
				// ConsolFactory.eINSTANCE.createDoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection().init();
				//
				//
				// target.addSection(section);
				//
				//

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2HasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2HasAnAssementAndPlanSectionOrIndividualAssementAndPlanSectionsTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2HasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2HasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2HasAnAssementAndPlanSectionOrIndividualAssementAndPlanSectionsTestCase.doValidationTest();
	}

	// /**
	// *
	// * @generated
	// */
	// @Test
	// public void testValidateConsultationNote2HasReasonForReferral2OrReasonForVisit() {
	// OperationsTestCase<ConsultationNote2> validateConsultationNote2HasReasonForReferral2OrReasonForVisitTestCase = new
	// OperationsTestCase<ConsultationNote2>(
	// "validateConsultationNote2HasReasonForReferral2OrReasonForVisit",
	// operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_HAS_REASON_FOR_REFERRAL2_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ConsultationNote2 target) {
	//
	// }
	//
	// @Override
	// public void addPassTests() {
	// addPassTest(new PassTest() {
	// @Override
	// public void updateToPass(ConsultationNote2 target) {
	// target.init();
	// target.addSection(ConsolFactory.eINSTANCE.createReasonForReferralSection2().init());
	//
	// }
	// });
	//
	// addPassTest(new PassTest() {
	// @Override
	// public void updateToPass(ConsultationNote2 target) {
	// target.init();
	// target.addSection(ConsolFactory.eINSTANCE.createReasonForVisitSection().init());
	// }
	// });
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ConsultationNote2Operations.validateConsultationNote2HasReasonForReferral2OrReasonForVisit(
	// (ConsultationNote2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateConsultationNote2HasReasonForReferral2OrReasonForVisitTestCase.doValidationTest();
	// }

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2CodeP() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2CodePTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2CodeP",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2CodeP(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2Code() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2CodeTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2Code",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected void setDependency(ConsultationNote2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2CodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2Code(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2Participant() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ParticipantTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2Participant",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2Participant(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2InFulfillmentOf() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2InFulfillmentOfTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2InFulfillmentOf", operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2InFulfillmentOf(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2InFulfillmentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2ComponentOf() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentOfTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentOf",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentOf(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2Component1214() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2Component1214TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2Component1214",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_COMPONENT1214__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2Component1214(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2Component1214TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2ParticipantAssociatedEntityAssociatedPersonName() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ParticipantAssociatedEntityAssociatedPersonNameTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ParticipantAssociatedEntityAssociatedPersonName",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ParticipantAssociatedEntityAssociatedPersonName(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ParticipantAssociatedEntityAssociatedPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2ParticipantAssociatedEntityClassCode() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ParticipantAssociatedEntityClassCodeTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ParticipantAssociatedEntityClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ParticipantAssociatedEntityClassCode(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ParticipantAssociatedEntityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2ParticipantAssociatedEntityId() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ParticipantAssociatedEntityIdTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ParticipantAssociatedEntityId",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ParticipantAssociatedEntityId(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ParticipantAssociatedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2ParticipantAssociatedEntityAddr() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ParticipantAssociatedEntityAddrTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ParticipantAssociatedEntityAddr",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ParticipantAssociatedEntityAddr(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ParticipantAssociatedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2ParticipantAssociatedEntityTelecom() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ParticipantAssociatedEntityTelecomTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ParticipantAssociatedEntityTelecom",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ParticipantAssociatedEntityTelecom(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ParticipantAssociatedEntityTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2ParticipantAssociatedEntityAssociatedPerson() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ParticipantAssociatedEntityAssociatedPersonTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ParticipantAssociatedEntityAssociatedPerson",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ParticipantAssociatedEntityAssociatedPerson(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ParticipantAssociatedEntityAssociatedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2ParticipantAssociatedEntityScopingOrganization() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ParticipantAssociatedEntityScopingOrganizationTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ParticipantAssociatedEntityScopingOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ParticipantAssociatedEntityScopingOrganization(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ParticipantAssociatedEntityScopingOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2ParticipantTypeCode() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ParticipantTypeCodeTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ParticipantTypeCode", operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ParticipantTypeCode(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ParticipantTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2ParticipantAssociatedEntity() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ParticipantAssociatedEntityTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ParticipantAssociatedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ParticipantAssociatedEntity(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ParticipantAssociatedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2InFulfillmentOfOrderId() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2InFulfillmentOfOrderIdTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2InFulfillmentOfOrderId",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2InFulfillmentOfOrderId(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2InFulfillmentOfOrderIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2InFulfillmentOfOrder() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2InFulfillmentOfOrderTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2InFulfillmentOfOrder", operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2InFulfillmentOfOrder(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2InFulfillmentOfOrderTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTSTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_DAY_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTSTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTSTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_MINUTE_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTSTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTSTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_SECOND_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTSTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTSTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTSTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrganizationOrBothTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrganizationOrBothTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrganizationOrBoth() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrganizationOrBothTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrganizationOrBoth",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrganizationOrBoth(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrganizationOrBothTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2ComponentOfEncompassingEncounterId() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentOfEncompassingEncounterIdTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentOfEncompassingEncounterId",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterId(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentOfEncompassingEncounterIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2ComponentOfEncompassingEncounterEffectiveTime() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentOfEncompassingEncounterEffectiveTimeTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentOfEncompassingEncounterEffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterEffectiveTime(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentOfEncompassingEncounterEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2ComponentOfEncompassingEncounterResponsibleParty() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentOfEncompassingEncounterResponsibleParty",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterResponsibleParty(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipant() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipant",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipant(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2ComponentOfEncompassingEncounter() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentOfEncompassingEncounterTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentOfEncompassingEncounter",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounter(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentOfEncompassingEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyComponentAssessmentSection1217() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyComponentAssessmentSection1217TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyComponentAssessmentSection1217",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_SECTION1217__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentAssessmentSection1217(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyComponentAssessmentSection1217TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21219() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21219TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21219",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ASSESSMENT_AND_PLAN_SECTION21219__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21219(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyComponentAssessmentAndPlanSection21219TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21221() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21221TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21221",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PLAN_OF_TREATMENT_SECTION21221__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21221(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyComponentPlanOfTreatmentSection21221TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyComponentReasonForVisitSection1223() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyComponentReasonForVisitSection1223TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyComponentReasonForVisitSection1223",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REASON_FOR_VISIT_SECTION1223__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentReasonForVisitSection1223(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyComponentReasonForVisitSection1223TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1225() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1225TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1225",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PRESENT_ILLNESS_SECTION1225__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1225(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyComponentHistoryOfPresentIllnessSection1225TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyComponentPhysicalExamSection21227() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyComponentPhysicalExamSection21227TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyComponentPhysicalExamSection21227",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PHYSICAL_EXAM_SECTION21227__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentPhysicalExamSection21227(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyComponentPhysicalExamSection21227TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyComponentAllergiesSection21229() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyComponentAllergiesSection21229TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyComponentAllergiesSection21229",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ALLERGIES_SECTION21229__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentAllergiesSection21229(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyComponentAllergiesSection21229TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyComponentChiefComplaintSection1231() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyComponentChiefComplaintSection1231TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyComponentChiefComplaintSection1231",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_SECTION1231__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentChiefComplaintSection1231(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyComponentChiefComplaintSection1231TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1233() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1233TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1233",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1233__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1233(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyComponentChiefComplaintAndReasonForVisitSection1233TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyComponentFamilyHistorySection21235() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyComponentFamilyHistorySection21235TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyComponentFamilyHistorySection21235",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_FAMILY_HISTORY_SECTION21235__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentFamilyHistorySection21235(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyComponentFamilyHistorySection21235TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyComponentGeneralStatusSection1237() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyComponentGeneralStatusSection1237TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyComponentGeneralStatusSection1237",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_GENERAL_STATUS_SECTION1237__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentGeneralStatusSection1237(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyComponentGeneralStatusSection1237TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21239() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21239TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21239",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_HISTORY_OF_PAST_ILLNESS_SECTION21239__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21239(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyComponentHistoryOfPastIllnessSection21239TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21241() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21241TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21241",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21241__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21241(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyComponentImmunizationsSectionEntriesOptional21241TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyComponentMedicationsSection21243() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyComponentMedicationsSection21243TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyComponentMedicationsSection21243",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICATIONS_SECTION21243__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentMedicationsSection21243(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyComponentMedicationsSection21243TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyComponentProblemSection21245() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyComponentProblemSection21245TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyComponentProblemSection21245",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROBLEM_SECTION21245__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentProblemSection21245(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyComponentProblemSection21245TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21247() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21247TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21247",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_PROCEDURES_SECTION_ENTRIES_OPTIONAL21247__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21247(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyComponentProceduresSectionEntriesOptional21247TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyComponentResultsSection21249() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyComponentResultsSection21249TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyComponentResultsSection21249",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_RESULTS_SECTION21249__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentResultsSection21249(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyComponentResultsSection21249TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyComponentSocialHistorySection21251() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyComponentSocialHistorySection21251TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyComponentSocialHistorySection21251",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_SOCIAL_HISTORY_SECTION21251__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentSocialHistorySection21251(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyComponentSocialHistorySection21251TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyComponentVitalSignsSection21253() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyComponentVitalSignsSection21253TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyComponentVitalSignsSection21253",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_VITAL_SIGNS_SECTION21253__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentVitalSignsSection21253(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyComponentVitalSignsSection21253TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21255() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21255TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21255",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL21255__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21255(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyComponentAdvanceDirectivesSectionEntriesOptional21255TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyComponentFunctionalStatusSection21257() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyComponentFunctionalStatusSection21257TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyComponentFunctionalStatusSection21257",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_FUNCTIONAL_STATUS_SECTION21257__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentFunctionalStatusSection21257(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyComponentFunctionalStatusSection21257TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyComponentReviewOfSystemsSection1259() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyComponentReviewOfSystemsSection1259TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyComponentReviewOfSystemsSection1259",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_REVIEW_OF_SYSTEMS_SECTION1259__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentReviewOfSystemsSection1259(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyComponentReviewOfSystemsSection1259TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyComponentMedicalEquipmentSection21261() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyComponentMedicalEquipmentSection21261TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyComponentMedicalEquipmentSection21261",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MEDICAL_EQUIPMENT_SECTION21261__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentMedicalEquipmentSection21261(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyComponentMedicalEquipmentSection21261TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyComponentMentalStatusSection1263() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyComponentMentalStatusSection1263TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyComponentMentalStatusSection1263",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_MENTAL_STATUS_SECTION1263__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentMentalStatusSection1263(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyComponentMentalStatusSection1263TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyComponentNutritionSection1265() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyComponentNutritionSection1265TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyComponentNutritionSection1265",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_COMPONENT_NUTRITION_SECTION1265__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyComponentNutritionSection1265(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyComponentNutritionSection1265TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyAssessmentSection1216() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyAssessmentSection1216TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyAssessmentSection1216",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_SECTION1216__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyAssessmentSection1216(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyAssessmentSection1216TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyAssessmentAndPlanSection21218() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyAssessmentAndPlanSection21218TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyAssessmentAndPlanSection21218",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_ASSESSMENT_AND_PLAN_SECTION21218__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyAssessmentAndPlanSection21218(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyAssessmentAndPlanSection21218TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyPlanOfTreatmentSection21220() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyPlanOfTreatmentSection21220TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyPlanOfTreatmentSection21220",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_PLAN_OF_TREATMENT_SECTION21220__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyPlanOfTreatmentSection21220(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyPlanOfTreatmentSection21220TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyReasonForVisitSection1222() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyReasonForVisitSection1222TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyReasonForVisitSection1222",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_REASON_FOR_VISIT_SECTION1222__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyReasonForVisitSection1222(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyReasonForVisitSection1222TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1224() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1224TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1224",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PRESENT_ILLNESS_SECTION1224__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1224(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyHistoryOfPresentIllnessSection1224TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyPhysicalExamSection21226() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyPhysicalExamSection21226TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyPhysicalExamSection21226",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_PHYSICAL_EXAM_SECTION21226__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyPhysicalExamSection21226(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyPhysicalExamSection21226TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyAllergiesSection21228() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyAllergiesSection21228TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyAllergiesSection21228",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_ALLERGIES_SECTION21228__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyAllergiesSection21228(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyAllergiesSection21228TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyChiefComplaintSection1230() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyChiefComplaintSection1230TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyChiefComplaintSection1230",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_SECTION1230__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyChiefComplaintSection1230(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyChiefComplaintSection1230TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1232() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1232TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1232",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION1232__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1232(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyChiefComplaintAndReasonForVisitSection1232TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyFamilyHistorySection21234() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyFamilyHistorySection21234TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyFamilyHistorySection21234",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_FAMILY_HISTORY_SECTION21234__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyFamilyHistorySection21234(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyFamilyHistorySection21234TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyGeneralStatusSection1236() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyGeneralStatusSection1236TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyGeneralStatusSection1236",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_GENERAL_STATUS_SECTION1236__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyGeneralStatusSection1236(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyGeneralStatusSection1236TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyHistoryOfPastIllnessSection21238() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyHistoryOfPastIllnessSection21238TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyHistoryOfPastIllnessSection21238",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_HISTORY_OF_PAST_ILLNESS_SECTION21238__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyHistoryOfPastIllnessSection21238(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyHistoryOfPastIllnessSection21238TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyImmunizationsSectionEntriesOptional21240() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyImmunizationsSectionEntriesOptional21240TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyImmunizationsSectionEntriesOptional21240",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL21240__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyImmunizationsSectionEntriesOptional21240(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyImmunizationsSectionEntriesOptional21240TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyMedicationsSection21242() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyMedicationsSection21242TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyMedicationsSection21242",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICATIONS_SECTION21242__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyMedicationsSection21242(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyMedicationsSection21242TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyProblemSection21244() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyProblemSection21244TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyProblemSection21244",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_PROBLEM_SECTION21244__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyProblemSection21244(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyProblemSection21244TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyProceduresSectionEntriesOptional21246() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyProceduresSectionEntriesOptional21246TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyProceduresSectionEntriesOptional21246",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_PROCEDURES_SECTION_ENTRIES_OPTIONAL21246__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyProceduresSectionEntriesOptional21246(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyProceduresSectionEntriesOptional21246TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyResultsSection21248() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyResultsSection21248TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyResultsSection21248",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_RESULTS_SECTION21248__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyResultsSection21248(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyResultsSection21248TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodySocialHistorySection21250() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodySocialHistorySection21250TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodySocialHistorySection21250",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_SOCIAL_HISTORY_SECTION21250__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodySocialHistorySection21250(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodySocialHistorySection21250TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyVitalSignsSection21252() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyVitalSignsSection21252TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyVitalSignsSection21252",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_VITAL_SIGNS_SECTION21252__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyVitalSignsSection21252(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyVitalSignsSection21252TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21254() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21254TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21254",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL21254__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21254(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyAdvanceDirectivesSectionEntriesOptional21254TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyFunctionalStatusSection21256() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyFunctionalStatusSection21256TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyFunctionalStatusSection21256",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_FUNCTIONAL_STATUS_SECTION21256__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyFunctionalStatusSection21256(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyFunctionalStatusSection21256TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyReviewOfSystemsSection1258() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyReviewOfSystemsSection1258TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyReviewOfSystemsSection1258",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_REVIEW_OF_SYSTEMS_SECTION1258__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyReviewOfSystemsSection1258(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyReviewOfSystemsSection1258TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyMedicalEquipmentSection21260() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyMedicalEquipmentSection21260TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyMedicalEquipmentSection21260",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_MEDICAL_EQUIPMENT_SECTION21260__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyMedicalEquipmentSection21260(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyMedicalEquipmentSection21260TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyMentalStatusSection1262() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyMentalStatusSection1262TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyMentalStatusSection1262",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_MENTAL_STATUS_SECTION1262__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyMentalStatusSection1262(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyMentalStatusSection1262TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBodyNutritionSection1264() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBodyNutritionSection1264TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBodyNutritionSection1264",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY_NUTRITION_SECTION1264__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBodyNutritionSection1264(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBodyNutritionSection1264TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateConsultationNote2ComponentStructuredBody1215() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentStructuredBody1215TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentStructuredBody1215",
			operationsForOCL.getOCLValue(
				"VALIDATE_CONSULTATION_NOTE2_COMPONENT_STRUCTURED_BODY1215__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentStructuredBody1215(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentStructuredBody1215TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<ConsultationNote2> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateGeneralHeaderConstraintsTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateGeneralHeaderConstraintsTemplateId(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ConsultationNote2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ConsultationNote2> {
		public ConsultationNote2 create() {
			return ConsolFactory.eINSTANCE.createConsultationNote2();
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
	private static class ConstructorTestClass extends ConsultationNote2Operations {
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

} // ConsultationNote2Operations
